/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends bc {
    static String field_d;
    private String field_c;
    static String field_e;
    private String field_b;

    final void a(fj param0, byte param1) {
        try {
            param0.a(this.field_c, (byte) -72);
            if (param1 != -71) {
                int[] var4 = (int[]) null;
                rk.a((byte[]) null, (int[]) null, -81, (byte) 58, -51);
            }
            param0.a((byte) -107, this.field_b);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "rk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte[] param0, int[] param1, int param2, byte param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            var5_int = -90 / ((-31 - param3) / 38);
            var6 = 0;
            L1: while (true) {
              if (var6 >= u.field_v.length) {
                break L0;
              } else {
                param4 = u.field_v[var6];
                var7 = var6 << -1433527420;
                L2: while (true) {
                  incrementValue$5 = param4;
                  param4--;
                  if (incrementValue$5 == 0) {
                    var6++;
                    continue L1;
                  } else {
                    incrementValue$6 = var7;
                    var7++;
                    param2 = mn.field_bb[incrementValue$6];
                    dupTemp$7 = param0[param2];
                    dupTemp$8 = param1[dupTemp$7];
                    param1[dupTemp$7] = dupTemp$8 + 1;
                    mn.field_bb[dupTemp$8] = param2;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("rk.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        if (!param0) {
            field_d = (String) null;
        }
        field_d = null;
    }

    final gq a(boolean param0) {
        if (param0) {
            int[] var3 = (int[]) null;
            rk.a((byte[]) null, (int[]) null, -108, (byte) -100, 71);
        }
        return im.field_J;
    }

    rk(String param0, String param1) {
        try {
            this.field_c = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Name is available";
        field_e = "Quit";
    }
}
