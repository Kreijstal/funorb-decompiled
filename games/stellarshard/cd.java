/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends rg {
    private int field_N;
    private String field_Q;
    static String field_P;
    private pb field_O;
    static qd field_L;
    private w field_R;

    cd(w param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, vf.a(0));
        try {
          this.field_R = param0;
          this.field_Q = param1;
          this.b(param4, param2, param3, param5, 23987);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean e(byte param0) {
        if (ue.field_b == -1) {
          if (!qe.b(64, 1)) {
            return false;
          }
          ue.field_b = ae.field_N.f(4);
          ae.field_N.field_k = 0;
        }
        if (param0 <= 111) {
          cd.e((byte) -125);
          if (ue.field_b != -2) {
            return qe.b(64, ue.field_b);
          }
          if (!qe.b(64, 2)) {
            return false;
          }
          ue.field_b = ae.field_N.c((byte) 37);
          ae.field_N.field_k = 0;
          return qe.b(64, ue.field_b);
        }
        if (ue.field_b != -2) {
          return qe.b(64, ue.field_b);
        }
        if (!qe.b(64, 2)) {
          return false;
        }
        ue.field_b = ae.field_N.c((byte) 37);
        ae.field_N.field_k = 0;
        return qe.b(64, ue.field_b);
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        try {
          this.field_N = this.field_N + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "cd.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_L = null;
        field_P = null;
        int var1 = -117 % ((71 - param0) / 50);
    }

    final String d(int param0) {
        if (param0 == 3690) {
          return null;
        }
        cd.h(9);
        return null;
    }

    final static void a(int param0, boolean param1, sk param2, int param3, boolean param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        try {
          dj.field_b[0] = pl.field_P.nextInt();
          dj.field_b[1] = pl.field_P.nextInt();
          dj.field_b[3] = (int)ob.field_a;
          uc.field_c.field_k = 0;
          dj.field_b[2] = (int)(ob.field_a >> 32);
          uc.field_c.b(0, dj.field_b[0]);
          uc.field_c.b(0, dj.field_b[1]);
          uc.field_c.b(0, dj.field_b[2]);
          uc.field_c.b(0, dj.field_b[3]);
          ca.a(uc.field_c, -23074);
          uc.field_c.c(param3, -113);
          param2.a(95, uc.field_c);
          pg.field_fb.field_k = 0;
          var5_int = -4 / ((param0 + 7) / 61);
          if (!param4) {
            pg.field_fb.a(false, 16);
          } else {
            pg.field_fb.a(false, 18);
          }
          pg.field_fb.field_k = pg.field_fb.field_k + 2;
          var6 = pg.field_fb.field_k;
          pg.field_fb.b(0, t.field_f);
          pg.field_fb.a((byte) 127, od.field_z);
          var7 = 0;
          if (uj.field_f) {
            var7 = var7 | 1;
          }
          if (tl.field_b) {
            var7 = var7 | 4;
          }
          if (param1) {
            var7 = var7 | 8;
          }
          if (null != pk.field_b) {
            var7 = var7 | 16;
          }
          pg.field_fb.a(false, var7);
          var8 = dd.a(0, hf.a((byte) -103));
          if (var8 == null) {
            var8 = "";
          }
          pg.field_fb.b(var8, -9799);
          if (null != pk.field_b) {
            pg.field_fb.a(126, pk.field_b);
          }
          ha.a(fj.field_l, pg.field_fb, uc.field_c, -104, u.field_o);
          pg.field_fb.d(-1, pg.field_fb.field_k - var6);
          ue.a((byte) -88, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("cd.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5;
        cg var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var17;
        Object var18;
        pb var19;
        pb var20;
        pb var21;
        String var22;
        Object var23;
        pb var24;
        pb var25;
        pb var26;
        String var27;
        Object var28;
        pb var29;
        pb var30;
        pb var31;
        Object var32;
        pb var33;
        pb var34;
        pb var35;
        Object var36;
        pb var37;
        pb var38;
        pb var39;
        pb var40;
        pj var41;
        pj var42;
        pj var43;
        pj var44;
        pj var45;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        cg var6Lifetime1;
        cg var6Lifetime2;
        cg var6Lifetime3;
        var18 = null;
        var23 = null;
        var28 = null;
        var32 = null;
        var36 = null;
        var13 = stellarshard.field_B;
        var6 = this.field_R.b(-28036);
        if (var6 == eh.field_c) {
          var17 = ui.field_D;
          if (!var17.equals(this.field_m)) {
            this.field_m = var17;
            this.a((byte) -92);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_R.b(param1 ^ 28091);
          var41 = (pj) ((Object) this.field_u);
          var9 = this.field_w + param3;
          var10 = var41.a((byte) 117, (rj) (this), param2) + (var41.b((rj) (this), (byte) 111).a(17201) >> 1);
          if (eh.field_c != var6 &&
            var6 != vk.field_d) {
            if (var6 == qj.field_c) {
              var21 = ah.field_p[2];
              var21.d(var9, -(var21.field_y >> 1) + var10, 256);
              return;
            }
            if (var6 != lg.field_c) {
              return;
            }
            var20 = ah.field_p[1];
            var20.d(var9, var10 - (var20.field_y >> 1), 256);
            return;
          }
          var19 = ah.field_p[0];
          var11 = var19.field_w << 1;
          var12 = var19.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new pb(var11, var12);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11) {
              this.field_O = new pb(var11, var12);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12 > this.field_O.field_y) {
                this.field_O = new pb(var11, var12);
                hj.a(this.field_O, param1 ^ -58);
              } else {
                hj.a(this.field_O, param1 ^ -58);
                ti.d();
              }
            }
          }
          var19.b(112, 144, var19.field_w << 4, var19.field_x << 4, -this.field_N << 10, 4096);
          id.b((byte) -58);
          this.field_O.d(var9 - (var19.field_w >> 1), -var19.field_x + var10, 256);
          return;
        }
        if (var6 == vk.field_d) {
          var22 = ui.field_D;
          if (!var22.equals(this.field_m)) {
            this.field_m = var22;
            this.a((byte) -92);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_R.b(param1 ^ 28091);
          var42 = (pj) ((Object) this.field_u);
          var9Lifetime1 = this.field_w + param3;
          var10Lifetime1 = var42.a((byte) 117, (rj) (this), param2) + (var42.b((rj) (this), (byte) 111).a(17201) >> 1);
          if (eh.field_c != var6 &&
            var6 != vk.field_d) {
            if (var6 == qj.field_c) {
              var26 = ah.field_p[2];
              var26.d(var9Lifetime1, -(var26.field_y >> 1) + var10Lifetime1, 256);
              return;
            }
            if (var6 != lg.field_c) {
              return;
            }
            var25 = ah.field_p[1];
            var25.d(var9Lifetime1, var10Lifetime1 - (var25.field_y >> 1), 256);
            return;
          }
          var24 = ah.field_p[0];
          var11Lifetime1 = var24.field_w << 1;
          var12Lifetime1 = var24.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new pb(var11Lifetime1, var12Lifetime1);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11Lifetime1) {
              this.field_O = new pb(var11Lifetime1, var12Lifetime1);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12Lifetime1 > this.field_O.field_y) {
                this.field_O = new pb(var11Lifetime1, var12Lifetime1);
                hj.a(this.field_O, param1 ^ -58);
              } else {
                hj.a(this.field_O, param1 ^ -58);
                ti.d();
              }
            }
          }
          var24.b(112, 144, var24.field_w << 4, var24.field_x << 4, -this.field_N << 10, 4096);
          id.b((byte) -58);
          this.field_O.d(var9Lifetime1 - (var24.field_w >> 1), -var24.field_x + var10Lifetime1, 256);
          return;
        }
        var5 = this.field_R.c(-22773);
        if (var5 == null) {
          var27 = this.field_Q;
          var5 = var27;
          if (!var27.equals(this.field_m)) {
            this.field_m = var27;
            this.a((byte) -92);
          }
          super.a(param0, param1, param2, param3);
          var6Lifetime1 = this.field_R.b(param1 ^ 28091);
          var43 = (pj) ((Object) this.field_u);
          var9Lifetime2 = this.field_w + param3;
          var10Lifetime2 = var43.a((byte) 117, (rj) (this), param2) + (var43.b((rj) (this), (byte) 111).a(17201) >> 1);
          if (eh.field_c != var6Lifetime1 &&
            var6Lifetime1 != vk.field_d) {
            if (var6Lifetime1 == qj.field_c) {
              var31 = ah.field_p[2];
              var31.d(var9Lifetime2, -(var31.field_y >> 1) + var10Lifetime2, 256);
              return;
            }
            if (var6Lifetime1 != lg.field_c) {
              return;
            }
            var30 = ah.field_p[1];
            var30.d(var9Lifetime2, var10Lifetime2 - (var30.field_y >> 1), 256);
            return;
          }
          var29 = ah.field_p[0];
          var11Lifetime2 = var29.field_w << 1;
          var12Lifetime2 = var29.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new pb(var11Lifetime2, var12Lifetime2);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11Lifetime2) {
              this.field_O = new pb(var11Lifetime2, var12Lifetime2);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12Lifetime2 <= this.field_O.field_y) {
                hj.a(this.field_O, param1 ^ -58);
                ti.d();
              } else {
                this.field_O = new pb(var11Lifetime2, var12Lifetime2);
                hj.a(this.field_O, param1 ^ -58);
              }
            }
          }
          var29.b(112, 144, var29.field_w << 4, var29.field_x << 4, -this.field_N << 10, 4096);
          id.b((byte) -58);
          this.field_O.d(var9Lifetime2 - (var29.field_w >> 1), -var29.field_x + var10Lifetime2, 256);
          return;
        }
        if (!var5.equals(this.field_m)) {
          this.field_m = var5;
          this.a((byte) -92);
          super.a(param0, param1, param2, param3);
          var6Lifetime2 = this.field_R.b(param1 ^ 28091);
          var44 = (pj) ((Object) this.field_u);
          var9Lifetime3 = this.field_w + param3;
          var10Lifetime3 = var44.a((byte) 117, (rj) (this), param2) + (var44.b((rj) (this), (byte) 111).a(17201) >> 1);
          if (eh.field_c != var6Lifetime2 &&
            var6Lifetime2 != vk.field_d) {
            if (var6Lifetime2 == qj.field_c) {
              var35 = ah.field_p[2];
              var35.d(var9Lifetime3, -(var35.field_y >> 1) + var10Lifetime3, 256);
              return;
            }
            if (var6Lifetime2 != lg.field_c) {
              return;
            }
            var34 = ah.field_p[1];
            var34.d(var9Lifetime3, var10Lifetime3 - (var34.field_y >> 1), 256);
            return;
          }
          var33 = ah.field_p[0];
          var11Lifetime3 = var33.field_w << 1;
          var12Lifetime3 = var33.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new pb(var11Lifetime3, var12Lifetime3);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11Lifetime3) {
              this.field_O = new pb(var11Lifetime3, var12Lifetime3);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12Lifetime3 <= this.field_O.field_y) {
                hj.a(this.field_O, param1 ^ -58);
                ti.d();
              } else {
                this.field_O = new pb(var11Lifetime3, var12Lifetime3);
                hj.a(this.field_O, param1 ^ -58);
              }
            }
          }
          var33.b(112, 144, var33.field_w << 4, var33.field_x << 4, -this.field_N << 10, 4096);
          id.b((byte) -58);
          this.field_O.d(var9Lifetime3 - (var33.field_w >> 1), -var33.field_x + var10Lifetime3, 256);
          return;
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime3 = this.field_R.b(param1 ^ 28091);
        var45 = (pj) ((Object) this.field_u);
        var9Lifetime4 = this.field_w + param3;
        var10Lifetime4 = var45.a((byte) 117, (rj) (this), param2) + (var45.b((rj) (this), (byte) 111).a(17201) >> 1);
        if (eh.field_c == var6Lifetime3) {
          var38 = ah.field_p[0];
          var11Lifetime4 = var38.field_w << 1;
          var12Lifetime4 = var38.field_x << 1;
          if (null == this.field_O) {
            this.field_O = new pb(var11Lifetime4, var12Lifetime4);
            hj.a(this.field_O, param1 ^ -58);
          } else {
            if (this.field_O.field_v < var11Lifetime4) {
              this.field_O = new pb(var11Lifetime4, var12Lifetime4);
              hj.a(this.field_O, param1 ^ -58);
            } else {
              if (var12Lifetime4 <= this.field_O.field_y) {
                hj.a(this.field_O, param1 ^ -58);
                ti.d();
              } else {
                this.field_O = new pb(var11Lifetime4, var12Lifetime4);
                hj.a(this.field_O, param1 ^ -58);
              }
            }
          }
          var38.b(112, 144, var38.field_w << 4, var38.field_x << 4, -this.field_N << 10, 4096);
          id.b((byte) -58);
          this.field_O.d(var9Lifetime4 - (var38.field_w >> 1), -var38.field_x + var10Lifetime4, 256);
          return;
        }
        if (var6Lifetime3 != vk.field_d) {
          if (var6Lifetime3 == qj.field_c) {
            var40 = ah.field_p[2];
            var40.d(var9Lifetime4, -(var40.field_y >> 1) + var10Lifetime4, 256);
            return;
          }
          if (var6Lifetime3 != lg.field_c) {
            return;
          }
          var39 = ah.field_p[1];
          var39.d(var9Lifetime4, var10Lifetime4 - (var39.field_y >> 1), 256);
          return;
        }
        var37 = ah.field_p[0];
        var11Lifetime5 = var37.field_w << 1;
        var12Lifetime5 = var37.field_x << 1;
        if (null != this.field_O &&
          this.field_O.field_v >= var11Lifetime5) {
          if (var12Lifetime5 <= this.field_O.field_y) {
            hj.a(this.field_O, param1 ^ -58);
            ti.d();
          } else {
            this.field_O = new pb(var11Lifetime5, var12Lifetime5);
            hj.a(this.field_O, param1 ^ -58);
          }
        } else {
          this.field_O = new pb(var11Lifetime5, var12Lifetime5);
          hj.a(this.field_O, param1 ^ -58);
        }
        var37.b(112, 144, var37.field_w << 4, var37.field_x << 4, -this.field_N << 10, 4096);
        id.b((byte) -58);
        this.field_O.d(var9Lifetime4 - (var37.field_w >> 1), -var37.field_x + var10Lifetime4, 256);
    }

    final static String h(int param0) {
        if (rk.field_f < 2) {
          return ug.field_d;
        }
        if (null != pg.field_db) {
          if (!pg.field_db.a((byte) -36)) {
            return rg.field_I;
          }
          return kf.field_d;
        }
        if (!lk.field_i.a((byte) -36)) {
          return lg.field_e;
        }
        if (!lk.field_i.a("commonui", (byte) -109)) {
          return am.field_e + " - " + lk.field_i.b(0, "commonui") + "%";
        }
        if (!wf.field_e.a((byte) -36)) {
          return mb.field_c;
        }
        if (param0 != -1064120735) {
          field_L = (qd) null;
        }
        if (!wf.field_e.a("commonui", (byte) -109)) {
          return le.field_l + " - " + wf.field_e.b(0, "commonui") + "%";
        }
        if (!am.field_g.a((byte) -36)) {
          return ve.field_b;
        }
        if (!am.field_g.c((byte) -111)) {
          return lj.field_B + " - " + am.field_g.b((byte) 1) + "%";
        }
        return wl.field_W;
    }

    final boolean a(int param0, rj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -2147483648) {
            return false;
          }
          this.field_Q = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_P = "Collect me";
    }
}
