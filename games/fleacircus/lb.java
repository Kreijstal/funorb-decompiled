/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb implements ch {
    private int field_i;
    private fa field_h;
    private int field_g;
    private int field_d;
    private int field_l;
    private int field_k;
    private int field_a;
    private int field_e;
    private int field_j;
    static int field_m;
    private int field_c;
    private int field_f;
    private int field_b;

    final static jh a(rh param0, int param1, int param2, int param3, rh param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        jh stackIn_5_0 = null;
        jh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ha.a(param0, -32180, param2, param3)) {
              if (param1 == 5592405) {
                stackIn_7_0 = lc.a(param4.a(param2, (byte) 122, param3), false);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (jh) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("lb.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jh) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        qa stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qa var11 = null;
        vk var12 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof vk)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (qa) (param3);
                break L1;
              }
            }
            L2: {
              var12 = (vk) ((Object) stackIn_3_0);
              if (var12 == null) {
                break L2;
              } else {
                param2 = param2 & var12.field_D;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              gb.e(param1 - -param3.field_y, param3.field_z + param4, param3.field_u, param3.field_j, this.field_i);
              if (!param2) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              var8 = this.field_g + param3.field_y + param1;
              if (param0 < -36) {
                break L4;
              } else {
                var11 = (qa) null;
                this.a(-124, -13, false, (qa) null, -107);
                break L4;
              }
            }
            L5: {
              var9 = this.field_b + param3.field_z + param4;
              gb.f(var8, var9, this.field_e, this.field_l, 5592405);
              gb.e(var8, var9, this.field_e, this.field_l, var7);
              if (var12.field_G) {
                gb.d(var8, var9, this.field_e + var8, var9 + this.field_l, 1);
                gb.d(this.field_e + var8, var9, var8, this.field_l + var9, 1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null == this.field_h) {
                break L6;
              } else {
                var10 = this.field_d + (this.field_e - -this.field_g);
                this.field_h.a(param3.field_i, param3.field_y + param1 + var10, this.field_a + param3.field_z + param4, -var10 - (this.field_d - param3.field_u), -(this.field_d << -429411679) + param3.field_j, this.field_j, this.field_c, this.field_f, this.field_k, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("lb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
        }
    }

    lb(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_k = 1;
        this.field_f = 1;
        try {
            this.field_d = param1;
            this.field_g = param5;
            this.field_b = param6;
            this.field_i = param9;
            this.field_e = param8;
            this.field_c = param4;
            this.field_l = param7;
            this.field_h = param0;
            this.field_j = param3;
            this.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
    }
}
