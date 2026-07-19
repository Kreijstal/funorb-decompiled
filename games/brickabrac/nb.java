/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nb {
    int[] field_d;
    int field_g;
    static mh field_e;
    int field_f;
    static int field_a;
    java.awt.Image field_c;
    static pk[] field_b;

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void b(byte param0) {
        if (param0 != 40) {
            return;
        }
        ef.a(param0 ^ -54);
        kg.a((byte) 93, om.field_oc, ef.field_b[0].field_x, np.field_a, ec.field_J, re.field_g);
    }

    final void a(byte param0) {
        if (param0 < 72) {
            return;
        }
        lb.a(this.field_d, this.field_g, this.field_f);
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        int var1 = 112 % ((param0 - -44) / 63);
    }

    final static void a(int param0, int param1, int param2, jp param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            param2 = param2 + param3.field_E;
            param1 = param1 + param3.field_F;
            var4_int = param1 * lb.field_c + param2;
            var5 = 0;
            var6 = param3.field_C;
            if (param0 <= -109) {
              L1: {
                var7 = param3.field_D;
                var8 = lb.field_c - var7;
                var9 = 0;
                if (lb.field_b > param1) {
                  var10 = -param1 + lb.field_b;
                  var6 = var6 - var10;
                  var4_int = var4_int + var10 * lb.field_c;
                  var5 = var5 + var7 * var10;
                  param1 = lb.field_b;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (lb.field_i > param2) {
                  var10 = lb.field_i + -param2;
                  var4_int = var4_int + var10;
                  var5 = var5 + var10;
                  var9 = var9 + var10;
                  param2 = lb.field_i;
                  var8 = var8 + var10;
                  var7 = var7 - var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1 + var6 > lb.field_j) {
                  var6 = var6 - (-lb.field_j + (var6 + param1));
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (lb.field_f >= param2 + var7) {
                  break L4;
                } else {
                  var10 = param2 + var7 - lb.field_f;
                  var7 = var7 - var10;
                  var9 = var9 + var10;
                  var8 = var8 + var10;
                  break L4;
                }
              }
              L5: {
                if (var7 <= 0) {
                  break L5;
                } else {
                  if (var6 <= 0) {
                    break L5;
                  } else {
                    sp.a(lb.field_l, var8, 0, var5, var6, var9, var7, -1, var4_int, param3.field_G);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("nb.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    abstract void a(java.awt.Component param0, int param1, boolean param2, int param3);

    static {
        int var0 = 0;
        field_b = new pk[255];
        for (var0 = 0; var0 < field_b.length; var0++) {
            field_b[var0] = new pk();
        }
    }
}
