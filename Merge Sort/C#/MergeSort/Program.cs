using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MergeSort
{
    class Program
    {
        /*
         *               34, 23, 1, 90, 54, 100, 65
         *                         /\
         *              34, 23, 1     90, 54, 100, 65
         *                /\                /\
         *            34     23, 1    90, 54   100, 65
         *            |        /\       /\        /\
         *            34     23   1   90   54  100  65
         *            |        \/       \/        \/
         *            34     1, 23     54, 90   65, 100
         *                \/                 \/
         *            1, 23, 34         54, 65, 90, 100
         *                         \/
         *              1, 23, 34, 54, 65, 90, 100
         */
        static void Main(string[] args)
        {
            //Declaring an array
            int[] arr = new int[]{34, 23, 1, 90, 54, 100, 65};
            var res = mergeSort(arr);
            foreach (var elem in res)
            {
                Console.Write("{0} ", elem);
            }
            Console.ReadKey();

        }

        private static int[] mergeSort(int[] arr)
        {
            int[] sortedArray = new int[arr.Length];

            if (arr.Length < 2)
            {
                return arr;
            }

            int mid = arr.Length / 2;
            int[] left_arr = new int[mid];
            int[] right_arr = new int[arr.Length - mid];

            int k = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                if (i < mid)
                {
                    left_arr[i] = arr[i];
                }
                else
                {
                    right_arr[k] = arr[i];
                    k++;
                }
            }

            left_arr = mergeSort(left_arr);
            right_arr = mergeSort(right_arr);
            sortedArray = merge(left_arr, right_arr);
            return sortedArray;
        }

        private static int[] merge(int[] left, int[] right)
        {
            int[] res = new int[left.Length + right.Length];
            int i = 0, l = 0, r = 0;
            while (l < left.Length || r < right.Length)
            {
                if (l < left.Length && r < right.Length)
                {
                    if (left[l] <= right[r])
                    {
                        res[i] = left[l];
                        l++;
                        i++;
                    }
                    else
                    {
                        res[i] = right[r];
                        r++;
                        i++;
                    }
                } else if (l < left.Length)
                {
                    res[i] = left[l];
                    l++;
                    i++;
                } else if (r < right.Length)
                {
                    res[i] = right[r];
                    r++;
                    i++;
                }
            }

            return res;
        }
    }
}
