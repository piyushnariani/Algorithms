using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SelectionSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[]{ 14, 33, 27, 10, 35, 19, 42, 44 };
            int[] sortedArr = selectionSort(arr);
            for (int i = 0; i < sortedArr.Length; i++)
            {
                Console.Write("{0} ", sortedArr[i]);
            }

            Console.ReadLine();
        }

        public static int[] selectionSort(int[] arr)
        {
            int len = arr.Length;
            for (int i = 0; i < len - 1; i++)
            {
                int min = i;
                for (int j = i + 1; j < len; j++)
                {
                    if (arr[min] > arr[j])
                    {
                        min = j;
                    }
                }

                if (min != i)
                {
                    int tmp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = tmp;
                }
            }

            return arr;
        }
    }
}
