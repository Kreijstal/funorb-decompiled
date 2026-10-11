/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ts {
    static int field_T;
    static int field_P;
    static String field_O;
    static int field_X;
    static int field_R;
    private gk field_M;
    private bi field_V;
    private String field_W;
    private int field_N;
    static String field_Q;
    static String field_S;
    static int field_U;

    ah(gk param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ea.b(114));
        try {
          this.field_M = param0;
          this.field_W = param1;
          this.a(param3, param5, (byte) 113, param2, param4);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ah.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int h(int param0) {
        if (param0 <= 92) {
          field_S = (String) null;
          return rn.field_b;
        }
        return rn.field_b;
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
          this.field_N = this.field_N + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ah.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        u var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        bi var14;
        String var17;
        Object var18;
        bi var19;
        bi var20;
        bi var21;
        bi var22;
        String var23;
        Object var24;
        bi var25;
        bi var26;
        bi var27;
        bi var28;
        String var29;
        Object var30;
        bi var31;
        bi var35;
        bi var37;
        Object var38;
        bi var39;
        bi var40;
        bi var41;
        bi var42;
        pj var43;
        pj var44;
        pj var45;
        pj var46;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var11Lifetime5;
        int var12Lifetime5;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        u var6Lifetime1;
        u var6Lifetime2;
        var18 = null;
        var24 = null;
        var30 = null;
        var38 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var6 = this.field_M.c(126);
        if (var6 == pd.field_h) {
          var17 = qr.field_R;
          if (!var17.equals(this.field_s)) {
            this.field_s = var17;
            this.e(false);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_M.c(-123);
          var43 = (pj) ((Object) this.field_p);
          var9 = this.field_m + param3;
          var10 = var43.a(param2, (vg) (this), 66) + (var43.a((vg) (this), true).b(438) >> 1);
          if (pd.field_h == var6) {
            var20 = lp.field_w[0];
            var11 = var20.field_o << 1;
            var12 = var20.field_p << 1;
            if (this.field_V == null) {
              this.field_V = new bi(var11, var12);
              aq.a((byte) -31, this.field_V);
            } else {
              if (this.field_V.field_z < var11) {
                this.field_V = new bi(var11, var12);
                aq.a((byte) -31, this.field_V);
              } else {
                if (this.field_V.field_w >= var12) {
                  aq.a((byte) 106, this.field_V);
                  gf.b();
                } else {
                  this.field_V = new bi(var11, var12);
                  aq.a((byte) -31, this.field_V);
                }
              }
            }
            var20.b(112, 144, var20.field_o << 4, var20.field_p << 4, -this.field_N << 10, 4096);
            ln.f((byte) -63);
            this.field_V.c(var9 - (var20.field_o >> 1), -var20.field_p + var10, 256);
            return;
          }
          if (var6 != lm.field_d) {
            if (var6 == tj.field_b) {
              var22 = lp.field_w[2];
              var22.c(var9, var10 - (var22.field_w >> 1), 256);
              return;
            }
            if (p.field_g != var6) {
              return;
            }
            var21 = lp.field_w[1];
            var21.c(var9, -(var21.field_w >> 1) + var10, 256);
            return;
          }
          var19 = lp.field_w[0];
          var11Lifetime5 = var19.field_o << 1;
          var12Lifetime5 = var19.field_p << 1;
          if (this.field_V != null &&
            this.field_V.field_z >= var11Lifetime5 &&
            this.field_V.field_w >= var12Lifetime5) {
            aq.a((byte) 106, this.field_V);
            gf.b();
          } else {
            this.field_V = new bi(var11Lifetime5, var12Lifetime5);
            aq.a((byte) -31, this.field_V);
          }
          var19.b(112, 144, var19.field_o << 4, var19.field_p << 4, -this.field_N << 10, 4096);
          ln.f((byte) -63);
          this.field_V.c(var9 - (var19.field_o >> 1), -var19.field_p + var10, 256);
          return;
        }
        if (var6 == lm.field_d) {
          var23 = qr.field_R;
          if (!var23.equals(this.field_s)) {
            this.field_s = var23;
            this.e(false);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_M.c(-123);
          var44 = (pj) ((Object) this.field_p);
          var9Lifetime1 = this.field_m + param3;
          var10Lifetime1 = var44.a(param2, (vg) (this), 66) + (var44.a((vg) (this), true).b(438) >> 1);
          if (pd.field_h == var6) {
            var26 = lp.field_w[0];
            var11Lifetime1 = var26.field_o << 1;
            var12Lifetime1 = var26.field_p << 1;
            if (this.field_V == null) {
              this.field_V = new bi(var11Lifetime1, var12Lifetime1);
              aq.a((byte) -31, this.field_V);
            } else {
              if (this.field_V.field_z < var11Lifetime1) {
                this.field_V = new bi(var11Lifetime1, var12Lifetime1);
                aq.a((byte) -31, this.field_V);
              } else {
                if (this.field_V.field_w >= var12Lifetime1) {
                  aq.a((byte) 106, this.field_V);
                  gf.b();
                } else {
                  this.field_V = new bi(var11Lifetime1, var12Lifetime1);
                  aq.a((byte) -31, this.field_V);
                }
              }
            }
            var26.b(112, 144, var26.field_o << 4, var26.field_p << 4, -this.field_N << 10, 4096);
            ln.f((byte) -63);
            this.field_V.c(var9Lifetime1 - (var26.field_o >> 1), -var26.field_p + var10Lifetime1, 256);
            return;
          }
          if (var6 != lm.field_d) {
            if (var6 == tj.field_b) {
              var28 = lp.field_w[2];
              var28.c(var9Lifetime1, var10Lifetime1 - (var28.field_w >> 1), 256);
              return;
            }
            if (p.field_g != var6) {
              return;
            }
            var27 = lp.field_w[1];
            var27.c(var9Lifetime1, -(var27.field_w >> 1) + var10Lifetime1, 256);
            return;
          }
          var25 = lp.field_w[0];
          var11Lifetime1Lifetime1 = var25.field_o << 1;
          var12Lifetime1Lifetime1 = var25.field_p << 1;
          if (this.field_V != null &&
            this.field_V.field_z >= var11Lifetime1Lifetime1 &&
            this.field_V.field_w >= var12Lifetime1Lifetime1) {
            aq.a((byte) 106, this.field_V);
            gf.b();
          } else {
            this.field_V = new bi(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            aq.a((byte) -31, this.field_V);
          }
          var25.b(112, 144, var25.field_o << 4, var25.field_p << 4, -this.field_N << 10, 4096);
          ln.f((byte) -63);
          this.field_V.c(var9Lifetime1 - (var25.field_o >> 1), -var25.field_p + var10Lifetime1, 256);
          return;
        }
        var5 = this.field_M.a((byte) -63);
        if (var5 == null) {
          var29 = this.field_W;
          var5 = var29;
          if (!var29.equals(this.field_s)) {
            this.field_s = var29;
            this.e(false);
          }
          super.a(param0, param1, param2, param3);
          var6Lifetime1 = this.field_M.c(-123);
          var45 = (pj) ((Object) this.field_p);
          var9Lifetime2 = this.field_m + param3;
          var10Lifetime2 = var45.a(param2, (vg) (this), 66) + (var45.a((vg) (this), true).b(438) >> 1);
          if (pd.field_h != var6Lifetime1 &&
            var6Lifetime1 != lm.field_d) {
            if (var6Lifetime1 == tj.field_b) {
              var37 = lp.field_w[2];
              var37.c(var9Lifetime2, var10Lifetime2 - (var37.field_w >> 1), 256);
              return;
            }
            if (p.field_g != var6Lifetime1) {
              return;
            }
            var35 = lp.field_w[1];
            var35.c(var9Lifetime2, -(var35.field_w >> 1) + var10Lifetime2, 256);
            return;
          }
          var31 = lp.field_w[0];
          var14 = var31;
          var11Lifetime2 = var31.field_o << 1;
          var12Lifetime2 = var31.field_p << 1;
          if (this.field_V == null) {
            this.field_V = new bi(var11Lifetime2, var12Lifetime2);
            aq.a((byte) -31, this.field_V);
          } else {
            if (this.field_V.field_z < var11Lifetime2) {
              this.field_V = new bi(var11Lifetime2, var12Lifetime2);
              aq.a((byte) -31, this.field_V);
            } else {
              if (this.field_V.field_w < var12Lifetime2) {
                this.field_V = new bi(var11Lifetime2, var12Lifetime2);
                aq.a((byte) -31, this.field_V);
              } else {
                aq.a((byte) 106, this.field_V);
                gf.b();
              }
            }
          }
          var31.b(112, 144, var31.field_o << 4, var31.field_p << 4, -this.field_N << 10, 4096);
          ln.f((byte) -63);
          this.field_V.c(var9Lifetime2 - (var31.field_o >> 1), -var31.field_p + var10Lifetime2, 256);
          return;
        }
        if (!var5.equals(this.field_s)) {
          this.field_s = var5;
          this.e(false);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime2 = this.field_M.c(-123);
        var46 = (pj) ((Object) this.field_p);
        var9Lifetime3 = this.field_m + param3;
        var10Lifetime3 = var46.a(param2, (vg) (this), 66) + (var46.a((vg) (this), true).b(438) >> 1);
        if (pd.field_h == var6Lifetime2) {
          var40 = lp.field_w[0];
          var11Lifetime3 = var40.field_o << 1;
          var12Lifetime3 = var40.field_p << 1;
          if (this.field_V != null &&
            this.field_V.field_z >= var11Lifetime3 &&
            this.field_V.field_w >= var12Lifetime3) {
            aq.a((byte) 106, this.field_V);
            gf.b();
          } else {
            this.field_V = new bi(var11Lifetime3, var12Lifetime3);
            aq.a((byte) -31, this.field_V);
          }
          var40.b(112, 144, var40.field_o << 4, var40.field_p << 4, -this.field_N << 10, 4096);
          ln.f((byte) -63);
          this.field_V.c(var9Lifetime3 - (var40.field_o >> 1), -var40.field_p + var10Lifetime3, 256);
          return;
        }
        if (var6Lifetime2 != lm.field_d) {
          if (var6Lifetime2 == tj.field_b) {
            var42 = lp.field_w[2];
            var42.c(var9Lifetime3, var10Lifetime3 - (var42.field_w >> 1), 256);
          } else {
            if (p.field_g == var6Lifetime2) {
              var41 = lp.field_w[1];
              var41.c(var9Lifetime3, -(var41.field_w >> 1) + var10Lifetime3, 256);
              return;
            }
          }
          return;
        }
        var39 = lp.field_w[0];
        var11Lifetime4 = var39.field_o << 1;
        var12Lifetime4 = var39.field_p << 1;
        if (this.field_V != null &&
          this.field_V.field_z >= var11Lifetime4 &&
          this.field_V.field_w >= var12Lifetime4) {
          aq.a((byte) 106, this.field_V);
          gf.b();
        } else {
          this.field_V = new bi(var11Lifetime4, var12Lifetime4);
          aq.a((byte) -31, this.field_V);
        }
        var39.b(112, 144, var39.field_o << 4, var39.field_p << 4, -this.field_N << 10, 4096);
        ln.f((byte) -63);
        this.field_V.c(var9Lifetime3 - (var39.field_o >> 1), -var39.field_p + var10Lifetime3, 256);
    }

    final boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -79 / ((param0 - 61) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ah.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void g(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var6 = gd.field_b;
          var1 = var6;
          var3 = -98 % ((param0 - 2) / 53);
          var2 = 0;
          var4 = var6.length;
          while (var4 > var2) {
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "ah.A(" + param0 + ')');
        }
    }

    final String c(boolean param0) {
        if (param0) {
          return null;
        }
        this.field_N = -109;
        return null;
    }

    public static void i(int param0) {
        field_S = null;
        field_Q = null;
        if (param0 != 4096) {
          field_S = (String) null;
          field_O = null;
          return;
        }
        field_O = null;
    }

    static {
        field_O = "Hide lobby chat";
        field_T = 0;
        field_U = 0;
        field_Q = "Human Players";
    }
}
