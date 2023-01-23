# 目录
- [日历算法](#日历算法)
- [二维数组助手类](#二维数组助手类)
- [](#)
***
### 日历算法
``` c#
using System;
namespace Day03
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine( GetDayOfWeek(2022, 9, 9));
        }
        /// <summary>
        /// 判断某天在星期几
        /// </summary>
        /// <param name="year">年份</param>
        /// <param name="month">月份</param>
        /// <param name="day">天数</param>
        /// <returns>该天在星期几</returns>
        private static int GetDayOfWeek(int year, int month, int day)
        {
            DateTime dt = new DateTime(year, month, day);
            return (int)dt.DayOfWeek;
        }
        /// <summary>
        /// 输出年历
        /// </summary>
        /// <param name="year">年份</param>
        private static void Calendar(int year)
        {
            Console.WriteLine("\t\t年份为{0}的日历", year);
            for (int i = 1; i <= 12; i++)
            {
                Console.WriteLine("\t\t\t{0}月", i);
                Console.WriteLine("日\t一\t二\t三\t四\t五\t六");
                int days = MonthDay(year, i);//一个月有多少天
                int week = GetDayOfWeek(year, i, 1);
                for (int k = 0; k < week; k++)
                    Console.Write('\t');
                for (int j = 1; j <= days; j++, week++)
                {
                    Console.Write(j + "\t");
                    if (week % 7 == 6)
                        Console.WriteLine();
                }
                Console.WriteLine();
            }
        }
    }
}
```
### 二维数组助手类
``` c#
namespace Day08
{
    /// <summary>
    /// 二维数组助手类，取某个元素某个方向上所有元素
    /// </summary>
    class DoubleArrayHelper
    {
        //静态方法
        public static string[] GetElement(string[,] arr, int rIndex, int cIndex, Direction dir, int count)
        {
            List<string> result = new List<string>(count);
            for (int i = 0; i < count; i++)
            {
                rIndex += dir.RIndex;
                cIndex += dir.CIndex;
                if (rIndex >= 0 && rIndex < arr.GetLength(0) && cIndex >= 0 && cIndex < arr.GetLength(1))
                    result.Add(arr[rIndex, cIndex]);
            }
            return result.ToArray();
        }
    }
}
```
### 
``` c#

```
