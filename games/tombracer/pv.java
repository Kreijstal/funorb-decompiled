/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pv extends ci {
    private boolean field_o;
    static String field_q;
    static String[] field_p;
    static String field_m;
    private boolean field_n;

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        boolean stackIn_15_1 = false;
        boolean stackIn_19_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 107) {
            field_q = (String) null;
          }
          var4_int = param2;
          if (var4_int == 0) {
            stackIn_11_1 = (param1.h(param0 ^ 148) == 1);
            this.field_o = stackIn_11_1;
          } else {
            if (1 != var4_int) {
              if (var4_int == 2) {
                stackIn_19_1 = (param1.h(255) == 1);
                this.field_g = stackIn_19_1;
              }
            } else {
              stackIn_15_1 = (1 == param1.h(255));
              this.field_n = stackIn_15_1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("pv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    public pv() {
        super(1, false);
        this.field_o = true;
        this.field_n = true;
    }

    final int[] c(int param0, int param1) {
        int var5 = 0;
        int[] var3;
        int[] var4;
        int var6;
        int[] var7;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_3 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          this.b(52, -14);
        }
        var7 = this.field_i.a((byte) -114, param1);
        var3 = var7;
        if (this.field_i.field_d) {
          stackIn_5_1 = 0;
          stackIn_5_2 = param0 ^ -17;
          if (this.field_n) {
            stackIn_6_3 = hba.field_b - param1;
          } else {
            stackIn_6_3 = param1;
          }
          var4 = this.c(stackIn_5_1, stackIn_5_2, stackIn_6_3);
          if (this.field_o) {
            for (var5 = 0; var5 < ns.field_g; var5++) {
              var7[var5] = var4[-var5 + una.field_b];
            }
          } else {
            lua.a(var4, 0, var7, 0, ns.field_g);
          }
        }
        return var3;
    }

    final int[][] b(int param0, int param1) {
        int stackIn_6_1 = 0;
        int[][] var3;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int var14;
        int[][] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        int[][] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        var12 = TombRacer.field_G ? 1 : 0;
        if (param1 != -1) {
          field_p = (String[]) null;
        }
        var21 = this.field_h.a(param0, (byte) 120);
        var16 = var21;
        var13 = var16;
        var3 = var13;
        if (this.field_h.field_f) {
          if (!this.field_n) {
            stackIn_6_1 = param0;
          } else {
            stackIn_6_1 = -param0 + hba.field_b;
          }
          var26 = this.a(stackIn_6_1, 0, param1 ^ 0);
          var22 = var26[0];
          var17 = var22;
          var5 = var17;
          var23 = var26[1];
          var18 = var23;
          var6 = var18;
          var24 = var26[2];
          var19 = var24;
          var7 = var19;
          var8 = var21[0];
          var9 = var21[1];
          var10 = var21[2];
          if (this.field_o) {
            for (var11 = 0; var11 < ns.field_g; var11++) {
              var8[var11] = var5[una.field_b - var11];
              var9[var11] = var6[una.field_b - var11];
              var10[var11] = var7[una.field_b - var11];
            }
          } else {
            var14 = 0;
            var11 = var14;
            while (ns.field_g > var14) {
              var8[var14] = var22[var14];
              var9[var14] = var23[var14];
              var10[var14] = var24[var14];
              var14++;
            }
          }
        }
        return var3;
    }

    public static void d(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 > -80) {
          field_m = (String) null;
        }
        field_q = null;
    }

    static {
        field_p = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_m = "Password is valid";
        field_q = "Playing";
    }
}
