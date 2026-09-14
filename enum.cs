using System;

public class GamePr
{
    enum Month
    {
        Jan,
        Fab,
        March,
        April,
        May
    }
    public static void enumExe1()
    {
        Month my_mon;
        Month cur_mon;

        my_mon = Month.Jan;
        cur_mon = (Month)3;
        Consol.WriteLine("달력의 월: {0}, 현재 월: {1}", my_mon, cur_mon);
        Consol.WriteLine("세팅된 월 숫자 {0}", (int)my_mon);
        Consol.WriteLine("현재 월 숫자 {0}", (int)cur_mon);

        GameState gamstate;
        gamstate = gamestate.Title;
        while (gamstate != gamstate.Quit)
        {
            switch (gamstate)
            {
                case GameState.Title;
                    Console.WriteLine("타이틀 출력, 현상태" + gamstate);
                    gamstate = GameState.Game;
                    break;
                case GameState.Game;
                    Console.WriteLine("게임 화면 출력, 현상태" + gamstate);
                    gamstate = GameState.Exit;
                    break;
                case GameState.Exit;
                    Console.WriteLine("게임 종료, 현상태" + gamstate);
                    gamstate = GameState.Quit;
                    break;
            }
        }
    }
}