using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InsertionSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[]{ 14, 33, 27, 10, 35, 19, 42, 44 };
            int[] sortedArray = InsertionSort(arr);
            for (int i = 0; i < sortedArray.Length; i++)
            {
                Console.Write("{0} ", sortedArray[i]);
            }

            Console.ReadLine();
        }

        private static int[] InsertionSort(int[] arr)
        {
            for (int i = 0; i < arr.Length -1; i++)
            {
                for (int j = i + 1; j > 0; j--)
                {
                    if (arr[j - 1] > arr[j])
                    {
                        int tmp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }

            return arr;
        }
    }
}
