/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq extends k {
    static String field_m;
    static int field_n;
    private int field_p;
    private int field_o;
    static kv field_k;
    private int field_l;

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_o = param1.e((byte) 112);
          } else {
            if (var4_int != 1) {
              if (var4_int == 2) {
                this.field_p = param1.e((byte) 120);
              }
            } else {
              this.field_l = param1.e((byte) 67);
            }
          }
          if (param0 != -71) {
            this.a(true, 44);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("wq.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, String param8, int param9, int param10) {
        try {
          if (!param7) {
            wq.d(51);
          }
          hfa.field_z.a(param8, param10, param4, param5, param2, param6, -1, param0, param9, param1);
          jha.field_g.a(param8, param10, 20 + param4, param5, param2, param3, -1, param0, param9, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wq.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ')');
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_m = null;
        int var1 = 79 / ((45 - param0) / 59);
    }

    public wq() {
        super(1, false);
        this.field_p = 4096;
        this.field_o = 4096;
        this.field_l = 4096;
    }

    final int[][] a(boolean param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[][] var23;
        int[][] var31;
        int[] var32;
        int[] var33;
        int[] var34;
        var15 = BachelorFridge.field_y;
        var23 = this.field_h.a(param1, -858);
        var18 = var23;
        var16 = var18;
        var3 = var16;
        if (this.field_h.field_b) {
          var31 = this.a((byte) -93, 0, param1);
          var32 = var31[0];
          var34 = var31[1];
          var33 = var31[2];
          var8 = var23[0];
          var9 = var23[1];
          var10 = var23[2];
          for (var11 = 0; var11 < hh.field_d; var11++) {
            var12 = var32[var11];
            var13 = var33[var11];
            var14 = var34[var11];
            if (var12 == var13 &&
              var14 == var13) {
              var8[var11] = var12 * this.field_o >> 12;
              var9[var11] = var13 * this.field_l >> 12;
              var10[var11] = var14 * this.field_p >> 12;
            } else {
              var8[var11] = this.field_o;
              var9[var11] = this.field_l;
              var10[var11] = this.field_p;
            }
          }
        }
        if (param0) {
          field_m = (String) null;
        }
        return var3;
    }

    static {
        field_n = 0;
        field_m = "Type your age in years";
    }
}
