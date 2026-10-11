/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc extends tj {
    static int[] field_n;
    static String field_m;
    static String field_l;

    public static void d(byte param0) {
        field_n = null;
        if (param0 >= -52) {
          return;
        }
        field_m = null;
        field_l = null;
    }

    final static bd a(int param0, int param1, byte param2, int param3, int param4) {
        param3 = -param3 + 11;
        if (param2 == 14) {
          return new bd(-18 + 18 * ((param0 * 12 + param3) * 12 + param1) + param4 - 1);
        }
        return (bd) null;
    }

    pc(rl param0) {
        super(param0);
    }

    final sc a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        sc stackIn_5_0 = null;
        sc stackIn_8_0 = null;
        sc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (ui.a((byte) -100, param1) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param0 != 0) {
            stackIn_5_0 = (sc) null;
            return stackIn_5_0;
          }
          if (var3_int != 0) {
            stackIn_10_0 = rh.field_p;
            return stackIn_10_0;
          }
          stackIn_8_0 = ni.field_b;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("pc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -126) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.a(0, param1) != ni.field_b) {
            stackIn_7_0 = fj.field_x;
            return stackIn_7_0;
          }
          stackIn_5_0 = gd.field_j;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int e(int param0) {
        try {
          int stackIn_13_0 = 0;
          int stackIn_22_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_31_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          wf var2 = null;
          if (kb.field_b.field_p >= 4) {
            if (kb.field_b.field_j == -1) {
              return 3;
            }
            if (kb.field_b.field_j != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (gj.field_t == param0) {
              lj.field_b = sa.field_g.a(rc.field_i, (byte) 121, fl.field_d);
              gj.field_t = gj.field_t + 1;
            }
            if (gj.field_t == 1) {
              if (lj.field_b.field_b == 2) {
                stackIn_13_0 = ca.a(-51, -1);
                return stackIn_13_0;
              }
              if (lj.field_b.field_b == 1) {
                gj.field_t = gj.field_t + 1;
              }
            }
            if (gj.field_t == 2) {
              re.field_X = new ge((java.net.Socket) (lj.field_b.field_g), sa.field_g);
              var2 = new wf(13);
              la.a((byte) -48, ni.field_e, var2, fc.field_q, qd.field_b);
              var2.c(15, ~param0);
              var2.f(wg.field_e, -32287);
              re.field_X.a(var2.field_j, 13, 111, 0);
              gj.field_t = gj.field_t + 1;
              ta.field_f = rf.c(0) + 30000L;
            }
            if (3 == gj.field_t) {
              if (0 >= re.field_X.d(-6448)) {
                if (rf.c(0) > ta.field_f) {
                  stackIn_26_0 = ca.a(-51, -2);
                  return stackIn_26_0;
                }
              } else {
                var1_int = re.field_X.e(291208897);
                if (var1_int != 0) {
                  stackIn_22_0 = ca.a(-51, var1_int);
                  return stackIn_22_0;
                }
                gj.field_t = gj.field_t + 1;
              }
            }
            if (gj.field_t != 4) {
              stackIn_31_0 = -1;
              return stackIn_31_0;
            }
            kb.field_b.a(Lexicominos.field_E, param0 - 110, re.field_X);
            lj.field_b = null;
            re.field_X = null;
            gj.field_t = 0;
            stackIn_29_0 = 0;
            return stackIn_29_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ca.a(-51, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_n = new int[8192];
        field_m = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_l = "Service unavailable";
    }
}
