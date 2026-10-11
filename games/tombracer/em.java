/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends vw {
    static nh[] field_h;
    private boolean field_g;
    private na[] field_e;
    static String field_f;
    private boolean field_d;

    final void a(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!this.field_g) {
          this.field_c.a(0, false, ej.field_c);
        } else {
          this.field_c.e(1, false);
          this.field_c.a(true, (iva) null);
          this.field_c.a(kga.field_o, (byte) 0);
          this.field_c.p((byte) 127);
          if (!this.field_d) {
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            this.field_c.a(ej.field_c, 0, -90);
            this.field_c.e(2, false);
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            this.field_c.a(ej.field_c, 0, -108);
            this.field_c.a(lja.field_j, 1, -15);
            this.field_c.a(0, false, ej.field_c);
            this.field_c.a(true, (iva) null);
          } else {
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            this.field_c.a(ej.field_c, 0, -94);
            this.field_c.a(0, false, ej.field_c);
          }
          this.field_c.e(0, false);
          this.field_g = false;
        }
        this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
        if (param0 > -4) {
          this.a((byte) 55, -114, 112);
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
          em.d(-65);
        }
        field_h = null;
        field_f = null;
    }

    em(eo param0) {
        super(param0);
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        this.field_g = false;
        try {
          if (param0.field_Ob) {
            stackIn_5_1 = !(3 <= param0.field_Vb);
            this.field_d = stackIn_5_1;
            stackIn_8_0 = (this.field_d) ? 48 : 127;
            var2_int = stackIn_8_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            for (var14 = 0; var14 < 64; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = -1.0f + (float)var14 * 2.0f / 64.0f;
                var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(1.0f + var11 * var11 + var12 * var12)));
                var12 = var12 * var13;
                var11 = var11 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (var16 != 0) {
                    if (var16 != 1) {
                      if (var16 == 2) {
                        var10 = var12;
                      } else {
                        if (var16 == 3) {
                          var10 = -var12;
                        } else {
                          if (var16 == 4) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        }
                      }
                    } else {
                      var10 = var11;
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (!(0.0f < var10)) {
                    var8 = 0;
                    var7 = 0;
                    var6 = 0;
                  } else {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                    var8 = (int)((double)var2_int * Math.pow((double)var10, 12.0));
                  }
                  var27[var16][var9] = var6 << 24;
                  var28[var16][var9] = var7 << 24;
                  var29[var16][var9] = var8 << 24;
                }
                var9++;
              }
            }
            this.field_e = new na[3];
            this.field_e[0] = this.field_c.a((byte) 37, var27, false, 64);
            this.field_e[1] = this.field_c.a((byte) 112, var28, false, 64);
            this.field_e[2] = this.field_c.a((byte) 64, var29, false, 64);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("em.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (this.field_g) {
          this.field_c.e(1, false);
          this.field_c.a(true, this.field_e[-1 + param1]);
          this.field_c.e(0, false);
        }
        if (param0 != 55) {
          this.a(-91);
        }
    }

    final void a(int param0, boolean param1) {
        int var3;
        asa var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = -121 / ((param0 - 41) / 62);
        if (null != this.field_e &&
          param1) {
          this.field_c.e(1, false);
          this.field_c.a(gd.field_H, (byte) 0);
          var4 = this.field_c.C(0);
          var4.b(-94, 1024);
          this.field_c.a(cva.field_b, false);
          if (!this.field_d) {
            this.field_c.a(iw.field_c, (byte) -110, ln.field_F);
            this.field_c.a(lja.field_j, 0, -34);
            this.field_c.e(2, false);
            this.field_c.a(ln.field_F, (byte) -110, jv.field_m);
            this.field_c.a(lja.field_j, 0, -47);
            this.field_c.a(lja.field_j, 1, -6219, true, false);
            this.field_c.a(0, false, tla.field_c);
            this.field_c.a(true, this.field_c.field_Jb);
          } else {
            this.field_c.a(ln.field_F, (byte) -110, jv.field_m);
            this.field_c.a(ej.field_c, 0, -6219, true, false);
            this.field_c.a(0, false, tla.field_c);
          }
          this.field_c.e(0, false);
          this.field_g = true;
        } else {
          this.field_c.a(0, false, tla.field_c);
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
          return;
        }
        this.field_c.a(ln.field_F, (byte) -110, iw.field_c);
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
          this.field_e = (na[]) null;
          return true;
        }
        return true;
    }

    final void a(int param0, iva param1, int param2) {
        this.field_c.a(true, param1);
        if (param2 != 24595) {
          return;
        }
        try {
          this.field_c.a((byte) 108, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "em.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = "Email (Login):";
    }
}
