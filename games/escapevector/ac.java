/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ac {
    static String field_a;
    static String field_d;
    static ih field_c;
    static int field_b;

    final static void a(int param0, int param1) {
        dj.a(6445);
        if (param0 != 25972) {
          field_c = (ih) null;
        }
    }

    final static void b(int param0) {
        if (bk.field_r != null) {
          bk.field_r.a((byte) -124);
          if (param0 != 112) {
            ac.d(-21);
            return;
          }
          return;
        }
        if (param0 == 112) {
          return;
        }
        ac.d(-21);
    }

    final static void d(int param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = EscapeVector.field_A;
          try {
            if (od.field_j != null) {
              od.field_j.a(param0 ^ -16802);
            }
            if (uk.field_b != null) {
              uk.field_b.a(-24580);
            }
            if (param0 != -16802) {
              return;
            }
            if (uc.field_h != null) {
              try {
                uc.field_h.a((byte) -111);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (bg.field_e == null) {
              return;
            }
            for (var1_int = 0; bg.field_e.length > var1_int; var1_int++) {
              if (bg.field_e[var1_int] != null) {
                try {
                  bg.field_e[var1_int].a((byte) -111);
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var1_ref), "ac.F(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = EscapeVector.field_A;
        try {
          var1 = ck.field_v;
          synchronized (var1) {
            if (param0 != 28087) {
              field_b = -95;
            }
            ui.field_e = ui.field_e + 1;
            ve.field_l = ta.field_w;
            if (sb.field_b < 0) {
              var5 = 0;
              var2 = var5;
              while (112 > var5) {
                ik.field_h[var5] = false;
                var5++;
              }
              sb.field_b = m.field_k;
            } else {
              while (m.field_k != sb.field_b) {
                var2 = hc.field_C[m.field_k];
                m.field_k = 127 & 1 + m.field_k;
                if (0 <= var2) {
                  ik.field_h[var2] = true;
                  continue;
                }
                ik.field_h[~var2] = false;
              }
            }
            ta.field_w = bn.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "ac.B(" + param0 + ')');
        }
    }

    final static ab a(String param0, int param1, mf param2, String param3, mf param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        ab stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 4 % ((50 - param1) / 60);
          var6 = param2.b(-1, param3);
          var7 = param2.a(var6, param0, true);
          stackIn_1_0 = ha.a(var6, -198630768, param4, var7, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ac.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_d = null;
        int var1 = 76 / ((param0 + 3) / 33);
        field_a = null;
        field_c = null;
    }

    static {
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
