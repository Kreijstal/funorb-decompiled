/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends hl {
    int field_n;
    int field_l;
    int field_w;
    ik field_C;
    ch field_o;
    db field_t;
    int field_q;
    int field_B;
    int field_y;
    int field_A;
    int field_p;
    int field_k;
    int field_r;
    int field_i;
    el field_s;
    int field_x;
    int field_m;
    int field_z;
    int field_j;
    int field_u;
    int field_v;

    final static boolean a(int param0, boolean param1, int param2, qm param3, qm param4, int param5, in param6) {
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        java.awt.Canvas var10 = null;
        in var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11 = new in(param4, param3);
            var8 = param6.a(var11, (byte) -10);
            if (var8 < (float)(-(param0 + param5))) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((float)(param0 + param5) >= var8) {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    var10 = (java.awt.Canvas) null;
                    ck.a((byte) 85, (java.awt.Canvas) null);
                    break L1;
                  }
                }
                var9 = param6.a(var11, param1);
                if (var9 >= (float)(-(param0 + param2))) {
                  if (var9 <= (float)(param0 + param2)) {
                    vl.field_c = var11;
                    vl.field_c.a(-1);
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var7);

            stackIn_19_1 = new StringBuilder().append("ck.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                return stackIn_16_0 != 0;
              }
            }
          }
        }
    }

    final static boolean a(byte param0) {
        int var1 = -52 % ((29 - param0) / 54);
        return ff.field_b;
    }

    final void b(byte param0) {
        this.field_o = null;
        this.field_C = null;
        this.field_s = null;
        this.field_t = null;
        int var2 = -104 % ((24 - param0) / 52);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        try {
            if (param0 != -97) {
                ck.a((byte) 32);
            }
            if (bk.field_w == 11) {
                nn.a(false);
            }
            sj.a(de.field_K, aa.field_m, nj.field_e, -115);
            hi.a(param1, 0, true, 0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ck.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ck() {
    }

    static {
    }
}
