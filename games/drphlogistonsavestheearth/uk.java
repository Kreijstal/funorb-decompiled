/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk implements cg {
    static int field_g;
    static nh field_f;
    static he[] field_b;
    private rf field_c;
    private int field_a;
    static int field_e;
    private int field_d;
    static he field_h;

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        h var4 = null;
        int var4_int = 0;
        int var5 = 0;
        nl var5_ref_nl = null;
        int[] var6 = null;
        int var8 = 0;
        lh var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = dh.field_N;
          var2 = var9.l(31760);
          var3 = var9.l(31760);
          if (0 == var2) {
            var4 = (h) (eg.field_c.h(-11151));
            if (var4 == null) {
              eg.a((byte) 126);
              return;
            }
            var5 = gf.field_C - var9.field_j;
            var11 = var4.field_j;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var7 < var5; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.l(31760) << (rk.a(var7, 3) << 8));
            }
            var4.field_i = true;
            var4.a(param0 + 14939);
          } else {
            if (var2 == 1) {
              var4_int = var9.f(param0 + 33464);
              var5_ref_nl = (nl) (gf.field_A.h(-11151));
              while (var5_ref_nl != null) {
                if (var3 != var5_ref_nl.field_j ||
                  var5_ref_nl.field_l != var4_int) {
                  var5_ref_nl = (nl) (gf.field_A.e(0));
                  continue;
                }
                break;
              }
              if (var5_ref_nl == null) {
                eg.a((byte) 126);
                return;
              }
              var5_ref_nl.a(-16175);
              decompiledFrameRemainder0 = false;
            }
            else {
              gb.a((Throwable) null, "LR1: " + al.a(param0 ^ 31183), 10);
              eg.a((byte) 126);
            }
          }
          if (param0 != -31114) {
            field_b = (he[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "uk.B(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_h = null;
        if (param0) {
          uk.a(true);
        }
        field_b = null;
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 < 94) {
            field_b = (he[]) null;
          }
          if (!param2.field_n &&
            !param2.a(true)) {
            stackIn_8_0 = 2188450;
          } else {
            stackIn_8_0 = 3249872;
          }
          var6_int = stackIn_8_0;
          this.field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param2.field_p + "</u>", param4 + param2.field_o, param2.field_m + param3, param2.field_w, param2.field_k, var6_int, -1, this.field_d, this.field_a, this.field_c.field_S + this.field_c.field_x);
          if (param2.a(true)) {
            var7 = this.field_c.b(param2.field_p);
            var8 = this.field_c.field_S + this.field_c.field_x;
            var9 = param4 + param2.field_o;
            if (2 == this.field_d) {
              var9 = var9 + (param2.field_w - var7);
            } else {
              if (this.field_d == 1) {
                var9 = var9 + (-var7 + param2.field_w >> 1);
              }
            }
            var10 = param2.field_m + param3;
            if (2 != this.field_a) {
              if (this.field_a == 1) {
                var10 = var10 + (param2.field_k - var8 >> 1);
              }
            } else {
              var10 = var10 + (-var8 + param2.field_k);
            }
            ce.a(var8, -2 + var9, -16579, var7 + 4, 2 + var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("uk.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public uk() {
        this.field_d = 1;
        this.field_a = 1;
        this.field_c = uh.field_i;
    }

    uk(rf param0, int param1, int param2) {
        try {
          this.field_a = param2;
          this.field_d = param1;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = 20;
    }
}
