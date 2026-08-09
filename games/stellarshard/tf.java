/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tf {
    static String field_c;
    static oj field_a;
    static li field_b;

    final static void a(int param0) {
        int var1;
        int var2;
        var1 = ok.a((byte) 125);
        var2 = kb.b((byte) 98);
        if (param0 != 0) {
          tf.b(-92);
          eh.field_a.a(true, var1 - -(ka.field_q << 489811521), var2 + (sa.field_h << -2144618463), rg.field_F + -sa.field_h, -ka.field_q + od.field_r);
          kl.a(true);
          return;
        } else {
          eh.field_a.a(true, var1 - -(ka.field_q << 489811521), var2 + (sa.field_h << -2144618463), rg.field_F + -sa.field_h, -ka.field_q + od.field_r);
          kl.a(true);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        int var1 = -17 / ((param0 - -7) / 63);
    }

    final static byte[] a(int param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        i var4 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param0 == 2) {
                  break L1;
                } else {
                  tf.b(-31);
                  break L1;
                }
              }
              if (param2 instanceof byte[]) {
                var3 = (byte[]) (param2);
                if (param1) {
                  stackIn_11_0 = cl.a(0, var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_9_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (!(param2 instanceof i)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (i) (param2);
                  stackIn_14_0 = var4.a(-27);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("tf.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(int param0, int param1, pb[] param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = stellarshard.field_B;
        if (param2 == null || param0 <= 0) {
            return;
        }
        try {
            var5_int = param2[0].field_w;
            var6 = param2[param1].field_w;
            var7 = param2[1].field_w;
            param2[0].e(param3, param4);
            param2[2].e(-var6 + param0 + param3, param4);
            ti.a(og.field_b);
            ti.a(var5_int + param3, param4, -var6 + param3 - -param0, param2[1].field_x + param4);
            var8 = param3 + var5_int;
            var9 = -var6 + (param3 - -param0);
            for (param3 = var8; param3 < var9; param3 = param3 + var7) {
                param2[1].e(param3, param4);
            }
            ti.b(og.field_b);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "tf.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = "Not yet achieved";
        field_a = new oj();
        field_b = new li(15, 0, 1, 0);
    }
}
