/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends l {
    static int field_y;
    private int field_z;
    static ec field_v;
    static String field_C;
    private int field_w;
    private int field_A;
    static boolean field_B;
    static he[] field_x;
    private nh[] field_t;
    static boolean[] field_u;

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        if (param1 >= param13) {
          if (param1 < param14) {
            r.a(param5, param9, param8, param0, param11, wj.field_l, param10, param12, param1, param6, param7, param14, param3, param2, param15, (byte) -112, param13);
            var16 = 116 / ((53 - param4) / 62);
            return;
          }
          if (param13 >= param14) {
            r.a(param11, param8, param6, param15, param2, wj.field_l, param7, param10, param13, param9, param12, param1, param0, param5, param3, (byte) -88, param14);
            var16Lifetime4 = 116 / ((53 - param4) / 62);
            return;
          }
          r.a(param2, param8, param9, param0, param11, wj.field_l, param7, param12, param14, param6, param10, param1, param15, param5, param3, (byte) -67, param13);
          var16Lifetime5 = 116 / ((53 - param4) / 62);
          return;
        }
        if (param13 < param14) {
          r.a(param11, param9, param6, param3, param5, wj.field_l, param10, param7, param13, param8, param12, param14, param0, param2, param15, (byte) -60, param1);
          var16Lifetime1 = 116 / ((53 - param4) / 62);
          return;
        }
        if (param14 <= param1) {
          r.a(param5, param6, param8, param15, param2, wj.field_l, param12, param10, param1, param9, param7, param13, param3, param11, param0, (byte) -65, param14);
          var16Lifetime2 = 116 / ((53 - param4) / 62);
          return;
        }
        r.a(param2, param6, param9, param3, param5, wj.field_l, param12, param7, param14, param8, param10, param13, param15, param11, param0, (byte) -66, param1);
        var16Lifetime3 = 116 / ((53 - param4) / 62);
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param1 <= 94) {
            this.field_t = (nh[]) null;
          }
          if (!param2.field_n) {
            stackIn_8_0 = (param2.a(true)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param2 instanceof hf) {
            param0 = param0 & ((hf) (param2)).field_E;
          }
          if (param0) {
            if (var6_int != 0) {
              stackIn_15_0 = this.field_z;
            } else {
              stackIn_15_0 = this.field_A;
            }
          } else {
            stackIn_15_0 = this.field_w;
          }
          var7 = stackIn_15_0;
          stackIn_18_0 = (!param0) ? 7105644 : 16777215;
          var8 = stackIn_18_0;
          lh.a(this.field_t, (byte) 121, param2.field_w, var7, param4 + param2.field_o, param3 + param2.field_m + (param2.field_k - this.field_t[0].field_C >> 1));
          this.field_g.a(param2.field_p, param2.field_o + param4, param2.field_m + (param3 - 2), param2.field_w, param2.field_k, var8, -1, 1, 1, this.field_g.field_x);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("ie.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public ie() {
        this(2188450, 2591221, 9543);
    }

    final static int a(boolean param0) {
        if (!param0) {
          return -si.field_B + li.field_k;
        }
        ie.a(9, -41, 98, 108, (byte) 5, 25, 90, -7, -48, -35, 72, 76, -77, -54, -7, 93);
        return -si.field_B + li.field_k;
    }

    public static void c(int param0) {
        if (param0 > 39) {
          field_C = null;
          field_v = null;
          field_x = null;
          field_u = null;
          return;
        }
        ie.a(18, 72, 51, -18, (byte) -114, 114, -2, 103, 120, 120, -108, -121, 76, 24, 2, -16);
        field_C = null;
        field_v = null;
        field_x = null;
        field_u = null;
    }

    final static gl a(Throwable param0, String param1) {
        gl var2 = null;
        if (!(param0 instanceof gl)) {
          var2 = new gl(param0, param1);
        } else {
          var2 = (gl) ((Object) param0);
          var2.field_d = var2.field_d + ' ' + param1;
        }
        return var2;
    }

    private ie(int param0, int param1, int param2) {
        this.field_w = param2;
        this.field_g = wi.field_e;
        this.field_z = param1;
        this.field_A = param0;
        this.field_t = rk.field_d;
    }

    static {
        field_y = -1;
        field_C = null;
        field_x = new he[1];
        field_B = true;
        field_u = new boolean[]{true, true, false, false, true, true, true, true, true, true, true, false, false, true, false};
    }
}
