/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static bd field_c;
    static int field_a;
    static b field_b;
    static byte[] field_d;

    final static int a(int[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= param0.length) {
                L2: {
                  if (param1 == 19) {
                    break L2;
                  } else {
                    field_d = (byte[]) null;
                    break L2;
                  }
                }
                stackIn_7_0 = var2_int;
                break L0;
              } else {
                var2_int = var2_int + pa.b((byte) -19, param0[var3]);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("ec.E(");

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
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, boolean param2, vm param3, int param4, int param5, String param6) {
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var7_int = -1 + param6.length();
            if (!param2) {
              L1: while (true) {
                if (var7_int < 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param4 = param4 - param0;
                  param3.a(param6.charAt(var7_int), param4, param1, param5);
                  var7_int--;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("ec.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        hk.field_q = param1 ? true : false;
        if (param0 != -123) {
            return;
        }
        if (!hk.field_q) {
            jh.field_fb = gb.field_b;
            bh.field_b = 97;
            aa.field_a = be.field_i;
            fj.field_Jb = 99;
            ln.field_q = 98;
            la.field_g = ql.field_c;
            ha.field_v = 96;
            fj.field_Ob = m.field_h;
        } else {
            jh.field_fb = 99;
            la.field_g = 98;
            aa.field_a = 96;
            fj.field_Ob = 97;
            ln.field_q = ql.field_c;
            fj.field_Jb = gb.field_b;
            ha.field_v = be.field_i;
            bh.field_b = m.field_h;
        }
    }

    final static hm a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        hm var8 = new hm(param7, param5, param6, param0, param4, param1);
        ih.field_x.a(var8, 119);
        ci.a(param3, 2, var8);
        if (!param2) {
            field_d = (byte[]) null;
        }
        return var8;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != 99) {
            field_c = (bd) null;
        }
    }

    final static void b(int param0) {
        if (param0 != -21931) {
            field_b = (b) null;
        }
    }

    static {
        field_a = 0;
        field_b = null;
        field_d = new byte[520];
    }
}
