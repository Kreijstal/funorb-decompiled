/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends le {
    static ij field_j;
    private ev[] field_i;

    final static void b(int param0, int param1) {
        int var3 = 0;
        ik var4 = null;
        br var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = VoidHunters.field_G;
        try {
          var4 = (ik) (mhb.field_o.d(0));
          while (var4 != null) {
            aeb.a(param0, -21584, var4);
            var4 = (ik) (mhb.field_o.a((byte) 8));
          }
          var5 = (br) (ca.field_p.d(param1));
          while (var5 != null) {
            eva.a(var5, -60, param0);
            var5 = (br) (ca.field_p.a((byte) 112));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "md.D(" + param0 + ',' + param1 + ')');
        }
    }

    final int[][] a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = VoidHunters.field_G;
        int[][] var3 = this.field_d.a(param1, (byte) -92);
        if (this.field_d.field_g) {
          var4 = hob.field_d;
          var5 = noa.field_o;
          var29 = new int[var5][var4];
          var30 = this.field_d.b(param0 - 134);
          this.a(true, var29);
          for (var8 = 0; noa.field_o > var8; var8++) {
            var32 = var29[var8];
            var31 = var30[var8];
            var11 = var31[0];
            var12 = var31[1];
            var13 = var31[2];
            for (var14 = 0; var14 < hob.field_d; var14++) {
              var15 = var32[var14];
              var13[var14] = dla.a(255, var15) << 4;
              var12[var14] = dla.a(var15, 65280) >> 4;
              var11[var14] = dla.a(16711680, var15) >> 12;
            }
          }
        }
        if (param0 != 255) {
          return (int[][]) null;
        }
        return var3;
    }

    final int[] a(int param0, boolean param1) {
        if (!param1) {
          this.field_i = (ev[]) null;
        }
        int[] var4 = this.field_f.a((byte) 121, param0);
        int[] var3 = var4;
        if (this.field_f.field_e) {
          this.a(param1, this.field_f.b(123));
        }
        return var4;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_22_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param1 > -60) {
            return;
          }
          if (param0 == 0) {
            this.field_i = new ev[param2.e((byte) -105)];
            for (var4_int = 0; var4_int < this.field_i.length; var4_int++) {
              var5 = param2.e((byte) -104);
              var6 = var5;
              if (var6 == 0) {
                this.field_i[var4_int] = (ev) ((Object) frb.a(param2, (byte) 118));
              } else {
                if (1 != var6) {
                  if (var6 == 2) {
                    this.field_i[var4_int] = (ev) ((Object) ika.a(32, param2));
                  } else {
                    if (3 == var6) {
                      this.field_i[var4_int] = (ev) ((Object) uea.a(param2, -87));
                    }
                  }
                } else {
                  this.field_i[var4_int] = (ev) ((Object) pmb.a(126, param2));
                }
              }
            }
          } else {
            if (param0 != 1) {
              return;
            }
            stackIn_22_1 = (param2.e((byte) -115) == 1);
            this.field_g = stackIn_22_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("md.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public md() {
        super(0, true);
    }

    private final void a(boolean param0, int[][] param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        ev var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = VoidHunters.field_G;
        try {
          var3_int = hob.field_d;
          var4 = noa.field_o;
          tt.a(param1, -98);
          pk.a(wf.field_d, 0, param0, 0, gbb.field_q);
          if (this.field_i != null) {
            for (var5 = 0; var5 < this.field_i.length; var5++) {
              var6 = this.field_i[var5];
              var7 = var6.field_e;
              var8 = var6.field_d;
              if (0 <= var7) {
                if (var8 < 0) {
                  var6.b((byte) -112, var3_int, var4);
                } else {
                  var6.a(var4, (byte) 110, var3_int);
                }
              } else {
                if (var8 >= 0) {
                  var6.a((byte) -99, var4, var3_int);
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("md.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
          md.a(true);
        }
    }

    static {
        field_j = new ij();
    }
}
