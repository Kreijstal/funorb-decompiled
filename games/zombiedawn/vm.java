/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends vf {
    private int field_r;
    private int field_v;
    private vn[] field_s;
    static int field_w;
    private int field_t;
    static int[][] field_u;

    final static vn[] a(byte param0, String param1, String param2, dj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        vn[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(param2, (byte) 8);
          var6 = -84 / ((param0 - 64) / 43);
          var5 = param3.a(var4_int, param1, true);
          stackIn_1_0 = ji.a(param3, -1, var4_int, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("vm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        dj var5 = null;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var1Lifetime1;
        int var3Lifetime1;
        var4 = ZombieDawn.field_J;
        try {
          if (hg.field_b == null) {
            hg.field_b = l.b(67, 4);
          }
          if (!hg.field_b.field_o) {
            if (param0 == 1) {
              return false;
            }
            var5 = (dj) null;
            vm.a((byte) 126, (String) null, (String) null, (dj) null);
            return false;
          }
          var13 = dj.field_i;
          var11 = var13;
          var6 = var11;
          var1 = var6;
          var17 = hg.field_b.field_k;
          for (var3 = 0; var3 < 8; var3++) {
            var6[var3] = hi.a(var13[var3], var17[var3]);
          }
          var14 = kg.field_g;
          var12 = var14;
          var8 = var12;
          var1Lifetime1 = var8;
          var18 = hg.field_b.field_k;
          var10 = 0;
          var3Lifetime1 = var10;
          while (8 > var10) {
            var8[var10] = eg.a(var14[var10], ~var18[var10]);
            var10++;
          }
          hg.field_b = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "vm.C(" + param0 + ')');
        }
    }

    public vm() {
        this(2188450, 2591221, 9543);
    }

    public static void a(boolean param0) {
        field_u = (int[][]) null;
        if (!param0) {
          field_w = -51;
        }
    }

    private vm(int param0, int param1, int param2) {
        this.field_s = ia.field_d;
        this.field_r = param1;
        this.field_m = rk.field_b;
        this.field_v = param0;
        this.field_t = param2;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int stackIn_6_0 = 0;
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
          if (!param3.field_l) {
            stackIn_6_0 = (param3.e(-17741)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param0 != 16777215) {
            return;
          }
          if (param3 instanceof an) {
            param1 = param1 & ((an) (param3)).field_C;
          }
          if (!param1) {
            stackIn_15_0 = this.field_t;
          } else {
            if (var6_int == 0) {
              stackIn_15_0 = this.field_v;
            } else {
              stackIn_15_0 = this.field_r;
            }
          }
          var7 = stackIn_15_0;
          tm.a(param3.field_k + param4, 32421, (param3.field_n - this.field_s[0].field_q >> 1) + (param2 + param3.field_j), this.field_s, var7, param3.field_i);
          stackIn_18_0 = (param1) ? 16777215 : 7105644;
          var8 = stackIn_18_0;
          this.field_m.a(param3.field_o, param3.field_k + param4, param3.field_j + (param2 - 2), param3.field_i, param3.field_n, var8, -1, 1, 1, this.field_m.field_I);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("vm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_w = 0;
    }
}
