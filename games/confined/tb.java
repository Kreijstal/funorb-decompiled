/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb {
    static ej field_a;

    final static boolean a(fg param0, int param1, fg param2) {
        int var3_int = 0;
        int var4 = 0;
        fg var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          var3_int = -param2.field_lb + param0.field_lb;
          if (ql.field_t != param0.field_kb) {
            if (param0.field_kb == null) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param1 != 200) {
            var5 = (fg) null;
            tb.a((fg) null, -40, (fg) null);
          }
          if (ql.field_t == param2.field_kb) {
            var3_int += 200;
          } else {
            if (null == param2.field_kb) {
              var3_int -= 200;
            }
          }
          return !(0 >= var3_int);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("tb.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        try {
          if (param0 != -15912) {
            fg var3 = (fg) null;
            tb.a((fg) null, -108, (fg) null);
          }
          rl.field_s = param1;
          vf.a((byte) -115, 12);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "tb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          fg var3 = null;
          boolean decompiledFrameRemainder0 = true;
          if (null != kl.field_G) {
            if (0 <= param0) {
              decompiledFrameRemainder0 = (wd.field_f == lk.field_d);
              if ((decompiledFrameRemainder0) && (0 == vh.field_a.field_n &&
                (pc.field_a + 10000L) < ri.a(-3))) {
                vh.field_a.b(true, param0);
              }
            } else {
              if (0 == vh.field_a.field_n &&
                (pc.field_a + 10000L) < ri.a(-3)) {
                vh.field_a.b(true, param0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (vh.field_a.field_n > 0) {
                try {
                  kl.field_G.a(vh.field_a.field_n, false, vh.field_a.field_m, 0);
                  pc.field_a = ri.a(-3);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  dc.d(118);
                }
                vh.field_a.field_n = 0;
              }
              if (param1 <= 103) {
                var3 = (fg) null;
                tb.a((fg) null, -29, (fg) null);
              }
              return;
            }
          }
          vh.field_a.field_n = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, kg param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (param2 >= -115) {
              var6 = (CharSequence) null;
              tb.a(14, (CharSequence) null, true);
            }
            var3_int = param1.k((byte) -11);
            if (var3_int > param0) {
              var3_int = param0;
            }
            var4 = new byte[var3_int];
            param1.field_n = param1.field_n + hc.field_t.a(param1.field_n, var4, 0, param1.field_m, var3_int, false);
            var5 = kh.a(var4, var3_int, 0, 0);
            stackIn_6_0 = var5;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_8_0 = "Cabbage";
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("tb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 25 % ((param0 + 7) / 51);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Confined.field_J ? 1 : 0;
        if (param13 > -52) {
          field_a = (ej) null;
        }
        if (param1 >= param3) {
          if (param1 >= param10) {
            if (param10 > param3) {
              ih.a(true, fn.field_h, param3, param6, param2, param9, param1, param5, param8, param15, param10, param7, param11, param4, param12, param0, param14);
            } else {
              ih.a(true, fn.field_h, param10, param14, param9, param2, param1, param5, param12, param15, param3, param7, param11, param0, param8, param4, param6);
            }
          } else {
            ih.a(true, fn.field_h, param3, param7, param5, param9, param10, param2, param8, param4, param1, param6, param12, param15, param11, param0, param14);
          }
        } else {
          if (param10 <= param3) {
            if (param1 >= param10) {
              ih.a(true, fn.field_h, param10, param7, param5, param2, param3, param9, param12, param0, param1, param14, param8, param15, param11, param4, param6);
            } else {
              ih.a(true, fn.field_h, param1, param6, param2, param5, param3, param9, param11, param0, param10, param14, param8, param4, param12, param15, param7);
            }
          } else {
            ih.a(true, fn.field_h, param1, param14, param9, param5, param10, param2, param11, param4, param3, param6, param12, param0, param8, param15, param7);
          }
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          var3 = vk.a(param2, param1, (byte) -2);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          var4 = param0;
          while (true) {
            if (var4 >= param1.length()) {
              return null;
            }
            if (og.a(-96, param1.charAt(var4))) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_10_0 = jn.field_R;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("tb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = new ej();
    }
}
