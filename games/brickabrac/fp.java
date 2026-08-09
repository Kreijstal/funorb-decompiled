/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends lh {
    static int field_x;
    static mh field_u;
    static int field_z;
    static StringBuilder field_A;
    static String field_w;
    static pe[] field_y;
    static mh field_v;
    static jp field_B;

    final static jp a(int param0, int param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jp var6 = null;
        jp var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jp stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = ma.field_O.c(param2) + 2;
              var5 = ma.field_O.field_N;
              var6 = new jp(var4_int, var5);
              var6.g();
              ma.field_O.b(param2, var4_int / param0, 2 + ma.field_O.field_F, 0, -1);
              kc.field_q.a((byte) 124);
              var7 = new jp(var4_int * param1, var5 * param1);
              var7.g();
              var6.a(0, 0, param1 * var4_int, param1 * var5);
              gp.a(var5 * param1, 0, param1 * var4_int, param0 ^ 2, 0);
              kc.field_q.a((byte) 126);
              if (param3) {
                var8 = var7.field_D;
                var9 = 2 + ma.field_O.field_B * param1;
                var10 = new int[var8 * var9];
                var11 = 0;
                L2: while (true) {
                  if (var9 <= var11) {
                    var7.field_G = var10;
                    var7.field_F = var7.field_F + var9 / 2;
                    var7.field_E = var7.field_E + 0;
                    var7.field_D = var8;
                    var7.field_C = var9;
                    break L1;
                  } else {
                    var12 = 0;
                    L3: while (true) {
                      if (var12 >= var8) {
                        var11++;
                        continue L2;
                      } else {
                        var10[var8 * var11 - -var12] = var7.field_G[(var11 - -var7.field_C - var9) * var7.field_D + (0 + var12)];
                        var12++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            stackIn_11_0 = (jp) (var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("fp.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (lb.field_c >= param2 - -param1) {
            return param2;
        }
        if (param0 >= (-param1 + (param2 - -param3) ^ -1)) {
            return param2 + param3 - param1;
        }
        return lb.field_c + -param1;
    }

    fp() {
        super(14, 180, 460, 155, 35, be.field_o);
    }

    final void b(byte param0) {
        super.b((byte) -119);
        if (param0 > -14) {
            return;
        }
        al.a(this.field_a, 19);
        this.g(68);
        this.a(0);
    }

    public static void c(boolean param0) {
        field_B = null;
        field_u = null;
        field_y = null;
        field_v = null;
        if (param0) {
            return;
        }
        field_A = null;
        field_w = null;
    }

    static {
        field_w = "This game has started.";
        field_y = null;
        field_A = new StringBuilder(80);
    }
}
