/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si extends nn {
    private java.nio.ByteBuffer field_b;
    static int field_c;
    static hr field_e;
    static hr field_d;

    final static int c(int param0) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (!(param0 <= 0)) {
            var2 = 1;
            if (65535 < param0) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (param0 > 255) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (!(param0 <= 15)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(param0 <= 3)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (param0 > 1) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (!(param0 >= -65536)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(param0 >= -256)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (-16 > param0) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(-4 <= param0)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(param0 >= -2)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    final void a(byte[] param0, int param1) {
        try {
            int var3_int = -124 % ((param1 - -47) / 62);
            ((si) this).field_b = java.nio.ByteBuffer.allocateDirect(param0.length);
            java.nio.Buffer discarded$0 = ((si) this).field_b.position(0);
            java.nio.ByteBuffer discarded$1 = ((si) this).field_b.put(param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "si.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(File param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 0;
            int discarded$2 = 103;
            stackOut_0_0 = kq.a((int)param0.length(), param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("si.N(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -23 + ')');
        }
        return stackIn_1_0;
    }

    si() {
    }

    final byte[] a(int param0, int param1, int param2) {
        byte[] var4 = null;
        Object var5 = null;
        byte[] var6 = null;
        if (param2 != 15747) {
          var5 = null;
          si.a((java.applet.Applet) null, (byte) 104);
          var6 = new byte[param1];
          var4 = var6;
          java.nio.Buffer discarded$8 = ((si) this).field_b.position(param0);
          java.nio.ByteBuffer discarded$9 = ((si) this).field_b.get(var6, 0, param1);
          return var6;
        } else {
          var6 = new byte[param1];
          var4 = var6;
          java.nio.Buffer discarded$10 = ((si) this).field_b.position(param0);
          java.nio.ByteBuffer discarded$11 = ((si) this).field_b.get(var6, 0, param1);
          return var6;
        }
    }

    public static void b() {
        int var1 = 2;
        field_d = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        kd.field_a[param5] = param4;
        if (param3 != 2) {
            return;
        }
        try {
            za.field_l[param5] = param2;
            nj.field_d[param5] = param6;
            pj.field_k[param5] = param0;
            rh.field_s[param5] = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "si.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (vo.a(var3, 7441) != 0L) {
                  L2: {
                    if (param1 <= -42) {
                      break L2;
                    } else {
                      field_c = -99;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("si.M(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final byte[] a(boolean param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((si) this).field_b.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$21 = ((si) this).field_b.position(0);
        java.nio.ByteBuffer discarded$22 = ((si) this).field_b.get(var3);
        if (param0) {
          byte[] discarded$23 = ((si) this).a(false);
          return var3;
        } else {
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
