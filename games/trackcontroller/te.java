/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends java.awt.Canvas {
    static mk field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((te) this).field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "te.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 70 / ((param0 - 34) / 33);
    }

    final static void a(byte param0) {
        if (!(ge.field_D)) {
            throw new IllegalStateException();
        }
        bc.field_d = true;
        wg.a(-100, false);
        rl.field_N = 0;
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                int[] discarded$2 = te.a(-20, 81, -51);
                break L1;
              }
            }
            ug.a(82, (java.awt.Component) (Object) param1);
            ei.a((byte) -125, (java.awt.Component) (Object) param1);
            if (rd.field_l == null) {
              break L0;
            } else {
              rd.field_l.a((java.awt.Component) (Object) param1, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("te.B(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((te) this).field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "te.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = va.a(param2, (byte) -47);
        var4 = mi.a(2048, param2);
        var5 = va.a(param0, (byte) -47);
        var6 = mi.a(2048, param0);
        var7 = (int)((long)var3 * (long)var5 >> 16);
        var8 = (int)((long)var3 * (long)var6 >> 16);
        if (param1 != 0) {
          int[] discarded$1 = te.a(-86, 13, 8);
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    te(java.awt.Component param0) {
        try {
            ((te) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "te.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static String[] a(String param0, char param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        Object stackIn_9_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            var3_int = sf.a(var10, param1, 11109);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param0.substring(var6);
                if (param2 <= -36) {
                  stackOut_10_0 = (String[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (String[]) (Object) stackIn_9_0;
                }
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param1 == param0.charAt(var8)) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param0.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("te.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new mk();
    }
}
