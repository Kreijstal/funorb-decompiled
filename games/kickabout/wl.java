/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends mo {
    static boolean field_o;
    private it[] field_k;
    private int field_h;
    static int field_n;
    private up[][] field_i;
    private int[][] field_j;
    private int[][] field_m;
    private gt[] field_f;
    static boolean field_g;
    private boolean field_l;

    final boolean a(boolean param0, int param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = Kickabout.field_G;
        var3 = this.field_k[param1].field_p;
        for (var4 = 0; var4 < 4; var4++) {
          if (param1 == this.field_m[var3][var4] &&
            -1 == this.field_j[var3][var4]) {
            return false;
          }
        }
        if (!param0) {
          return true;
        }
        this.toString();
        return true;
    }

    final void a(ml param0, boolean param1) {
        int var6 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var3_intLifetime1;
        int var4Lifetime1;
        try {
          for (var3_int = 0; 2 > var3_int; var3_int++) {
            for (var4 = 0; var4 < 4; var4++) {
              this.field_j[var3_int][var4] = param0.l(4, 59) - 1;
            }
          }
          this.field_h = param0.l(8, 59);
          param0.l((byte) 112);
          var3_intLifetime1 = 0;
          if (param1) {
            field_g = true;
          }
          while (2 > var3_intLifetime1) {
            var6 = 0;
            var4Lifetime1 = var6;
            while (var6 < 4) {
              this.field_i[var3_intLifetime1][var6].a(112, param0);
              var6++;
            }
            var3_intLifetime1++;
          }
          param0.p(-104);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        int var2 = 0;
        StringBuilder discarded$61 = null;
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        int var3 = 0;
        StringBuilder discarded$65 = null;
        StringBuilder discarded$64 = null;
        int var4;
        StringBuilder var5;
        var4 = Kickabout.field_G;
        var5 = new StringBuilder("AgentLineup");
        for (var2 = 0; var2 < this.field_k.length; var2++) {
          discarded$61 = var5.append("\t" + var2 + "=");
          if (!this.a(-83, var2)) {
            discarded$62 = var5.append(".");
          }
          discarded$63 = var5.append("[");
          for (var3 = 0; 4 > var3; var3++) {
            if (~this.field_m[this.field_k[var2].field_p][var3] == ~var2) {
              discarded$65 = var5.append(" " + var3 + "=" + this.field_j[this.field_k[var2].field_p][var3]);
            }
          }
          discarded$64 = var5.append(" ]");
        }
        return var5.toString();
    }

    private final boolean a(int param0, gr param1, int param2, int param3) {
        int var6 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          if (!this.field_l &&
            param1.field_i[param0].c(-2)) {
            return false;
          }
          if (!this.field_l &&
            param1.a((byte) -113, param0)) {
            return false;
          }
          if (param3 != 4) {
            field_g = false;
          }
          var5_int = this.field_k[param2].field_p;
          for (var6 = 0; var6 < 4; var6++) {
            if (this.field_m[var5_int][var6] == param2 &&
              param0 == this.field_j[var5_int][var6]) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("wl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(gr param0, up[] param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        mo var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Kickabout.field_G;
        try {
          var6_int = 0;
          if (param2 > -70) {
            var8 = (mo) null;
            this.a((byte) -51, (mo) null);
          }
          while (var6_int < 9) {
            if (this.a(var6_int, param0, param4, 4)) {
              this.a(var6_int + 1 << 2 | param3, 0, param0, param1, param4);
              return;
            }
            var6_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("wl.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, gr param2, up[] param3, int param4) {
        int var10 = 0;
        up stackIn_22_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        up var9 = null;
        int var11 = 0;
        mo var12 = null;
        up var13 = null;
        int var7Lifetime1;
        var11 = Kickabout.field_G;
        try {
          var6_int = this.field_k[param4].field_p;
          if (param1 != 0) {
            var12 = (mo) null;
            this.a((byte) 13, (mo) null);
          }
          if (-1 == param0) {
            this.field_h = this.field_h ^ 1 << param4;
          } else {
            if (param0 != -2) {
              var7 = 3 & param0;
              var8 = (param0 >> 2) - 1;
              if (this.field_m[var6_int][var7] != param4) {
                return;
              }
              if (var8 >= -1 &&
                9 > var8) {
                if (var8 == -1) {
                  stackIn_22_0 = null;
                } else {
                  stackIn_22_0 = param2.field_i[var8];
                }
                var13 = stackIn_22_0;
                var9 = var13;
                if (var8 != -1) {
                  if (!this.field_l) {
                    if (var13.c(-2)) {
                      return;
                    }
                    if (param2.a((byte) 79, var8)) {
                      return;
                    }
                  } else {
                    var9 = param3[var8];
                  }
                }
                if (-1 != var8) {
                  for (var10 = 0; var10 < 4; var10++) {
                    if (this.field_m[var6_int][var10] == param4 &&
                      this.field_j[var6_int][var10] == var8) {
                      this.field_j[var6_int][var10] = this.field_j[var6_int][var7];
                      this.field_i[var6_int][var10].a((byte) -101, this.field_i[var6_int][var7]);
                    }
                  }
                  this.field_i[var6_int][var7].a((byte) -90, var9);
                } else {
                  this.field_i[var6_int][var7].b((byte) -7);
                }
                this.field_j[var6_int][var7] = var8;
                this.field_h = this.field_h & ~(1 << param4);
                return;
              }
              return;
            }
            if (!this.a(false, param4)) {
              for (var7Lifetime1 = 0; 4 > var7Lifetime1; var7Lifetime1++) {
                if (this.field_m[var6_int][var7Lifetime1] == param4 &&
                  this.field_j[var6_int][var7Lifetime1] == -1) {
                  this.a(param2, param3, (byte) -78, var7Lifetime1, param4);
                  this.field_h = this.field_h & ~(1 << param4);
                  return;
                }
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_44_0 = var6;
          stackIn_44_1 = new StringBuilder().append("wl.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param3 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, mo param1) {
        wl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        try {
          var3 = (wl) (param1);
          if (param0 > -52) {
            this.field_m = (int[][]) null;
          }
          for (var4 = 0; var4 < 2; var4++) {
            for (var5 = 0; var5 < 4; var5++) {
              this.field_i[var4][var5].a((byte) -90, var3.field_i[var4][var5]);
              this.field_j[var4][var5] = var3.field_j[var4][var5];
            }
          }
          this.field_h = var3.field_h;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wl.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1) {
        boolean stackIn_7_0 = false;
        if (param0 >= -80) {
          return false;
        }
        stackIn_7_0 = !(this.field_f[param1].d(3511)) || ((1 << param1 & this.field_h) != 0);
        return stackIn_7_0;
    }

    wl(boolean param0, it[] param1, gt[] param2, int[][] param3, int[][] param4, up[][] param5) {
        try {
          this.field_f = param2;
          this.field_k = param1;
          this.field_j = param4;
          this.field_m = param3;
          this.field_i = param5;
          this.field_l = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = false;
        field_n = 0;
        field_g = false;
    }
}
