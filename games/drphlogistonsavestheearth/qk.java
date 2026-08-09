/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk extends IOException {
    static String field_a;
    static int[] field_f;
    static boolean field_c;
    static String field_e;
    static ng field_g;
    static int[] field_b;
    static String field_d;

    qk(String param0) {
        super(param0);
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static nh a(String param0, vj param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1.a(param0, (byte) -122);
              if (param3) {
                break L1;
              } else {
                qk.a(false);
                break L1;
              }
            }
            var5 = param1.a((byte) -91, param2, var4_int);
            stackIn_3_0 = fk.a(var4_int, param1, var5, 16711680);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("qk.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0) {
        if (param0) {
          if (null != df.field_l) {
            hb.a(-5, df.field_l);
            df.field_l.a(sb.field_d, true);
            df.field_l = null;
            n.field_g.requestFocus();
            return;
          } else {
            return;
          }
        } else {
          field_a = (String) null;
          if (null == df.field_l) {
            return;
          } else {
            hb.a(-5, df.field_l);
            df.field_l.a(sb.field_d, true);
            df.field_l = null;
            n.field_g.requestFocus();
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 65280) {
          field_f = (int[]) null;
          field_f = null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_g = null;
          return;
        }
    }

    final static m a(int param0) {
        if (param0 != 65280) {
            return (m) null;
        }
        return (m) ((Object) new bk());
    }

    static {
        field_f = new int[128];
        field_c = false;
        field_a = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_b = new int[]{16777215, 16777215, 65280, 16711680, 16776960, 65535, 16776960, 16776960, 16711680, 16711680, 16711680, 65535, 65280, 16776960, 65280, 16746496, 16746496, 65535, 65535, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16777215, 65280, 16776960, 16777215, 65280, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 65280, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680};
        field_e = "Please wait";
        field_d = "Quit to website";
    }
}
