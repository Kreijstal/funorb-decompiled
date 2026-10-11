/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends ch implements tb {
    private qq field_W;
    static String field_V;
    static int field_P;
    private lr field_Q;
    static dd field_T;
    private fe[] field_R;
    static vh field_N;
    private int[] field_U;
    private int field_S;
    private String field_O;

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Pool.field_O;
        try {
          if (!param0) {
            var9 = (cc) null;
            this.a((String) null, 93, (cc) null);
          }
          for (var6_int = 0; var6_int < this.field_S; var6_int++) {
            if (this.field_R[var6_int] != param3) {
              continue;
            }
            var7 = this.field_U[var6_int];
            if (var7 != -1) {
              lf.a(this.field_U[var6_int], (byte) 78);
            } else {
              this.field_W.k(17);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("wk.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) 78, param2, param3);
        this.field_Q.a(this.field_O, 14 + param2 + this.field_C, this.field_D + (param3 + 10), this.field_l - 28, this.field_y, 16777215, -1, 0, 0, this.field_Q.field_C);
        int var5 = 6 % ((-42 - param1) / 53);
    }

    final fe a(String param0, int param1, cc param2) {
        fe var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fe stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fe(param0, param2);
          var4.field_z = (fp) ((Object) new ng());
          var5 = -2 + this.field_y;
          if (param1 > -77) {
            this.field_R = (fe[]) null;
          }
          this.a(this.field_l, 0, 34 + this.field_y, false, 0);
          var4.a(this.field_l - 14, 7, 30, false, var5);
          this.a(true, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("wk.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 >= -85) {
          wk.a(true, -59, false, -90);
        }
        field_N = null;
        field_V = null;
        field_T = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        try {
          fb.a();
          ob.field_i = 11;
          cp.field_d = new int[260];
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            cp.field_d[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          if (param0 != -257) {
            return;
          }
          var4 = 256;
          var1_intLifetime1 = var4;
          while (var4 < cp.field_d.length) {
            cp.field_d[var4] = 255;
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "wk.F(" + param0 + ')');
        }
    }

    wk(qq param0, lr param1, String param2) {
        super(0, 0, 288, 0, (fp) null);
        int var4_int = 0;
        this.field_S = 0;
        try {
          this.field_Q = param1;
          this.field_W = param0;
          this.field_O = param2;
          var4_int = null == this.field_O ? 0 : this.field_Q.b(this.field_O, 260, this.field_Q.field_C);
          this.a(288, 0, var4_int + 22, false, 0);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_S;
          this.b((byte) 122, var4_int + param2);
          this.field_R[var4_int] = this.a(param1, cq.a(param2, -115), (cc) (this));
          this.field_U[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "wk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        vh stackIn_36_0 = null;
        String stackIn_37_1 = null;
        vh stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        String stackIn_40_3 = null;
        vh stackIn_68_0 = null;
        boolean stackIn_69_1 = false;
        vh stackIn_73_0 = null;
        boolean stackIn_74_1 = false;
        vh stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        RuntimeException decompiledCaughtException = null;
        vh var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        vh var5 = null;
        vh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = Pool.field_O;
        try {
          fr.$cfr$intArgs$a$e9dea5688aa5(-100, uf.field_z);
          if (null != tp.field_e) {
            var4 = kc.field_b;
            kc.field_b.field_Db = 0;
            var4.field_gb = 0;
            var5 = d.field_c;
            d.field_c.field_Db = 0;
            var5.field_gb = 0;
            gi.field_o.field_Db = 0;
            var6 = gi.field_o;
            var6.field_gb = 0;
            ii.field_e.field_nb = of.field_Ub.toUpperCase();
            var7 = (uq.field_f.field_gb + 2) / 2;
            gi.field_o.b(uq.field_f.field_Db - 40, 2147483647, 0, var7 - 2, 40);
            d.field_c.b(-40 + uq.field_f.field_Db, 2147483647, var7, -var7 + uq.field_f.field_gb, 40);
            if (dg.field_T.length == 1 &&
              dg.field_T[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (dg.field_T.length > var10) {
                  stackIn_11_0 = (0 == (md.field_c[var10 / 8] & 1 << (var10 & 7))) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    2 != dg.field_T[var10]) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            d.field_c.field_pb = true;
            if (!kh.field_Ac) {
              stackIn_36_0 = d.field_c;
              if (var8 != 0) {
                stackIn_37_1 = hq.field_o;
              } else {
                stackIn_37_1 = fo.field_d;
              }
              stackIn_36_0.field_nb = ((String) (Object) stackIn_37_1).toUpperCase();
              stackIn_39_0 = v.field_j;
              stackIn_39_1 = new String[]{d.field_c.field_nb};
              stackIn_39_2 = -1;
              if (var8 != 0) {
                stackIn_40_3 = n.field_Y;
              } else {
                stackIn_40_3 = bk.field_x;
              }
              stackIn_39_0.field_nb = nr.a(stackIn_39_1, stackIn_39_2, stackIn_40_3);
              gi.field_o.field_nb = la.field_g;
              ok.field_ob.field_pb = true;
              qk.field_b = true;
              if (we.field_m != null) {
                if (null == dk.field_j) {
                  gf.field_b = new boolean[dr.field_c];
                  dk.field_j = new byte[dr.field_c];
                }
                qk.field_b = false;
                ln.field_p = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (dr.field_c > var13) {
                  gf.field_b[var13] = false;
                  var13++;
                }
                sh.a(0, dr.field_c, -1, false, tp.field_e, -1, -1, true);
                if (!(2 > hq.field_i) &&
                  vj.field_c[12]) {
                  qk.field_b = true;
                }
              }
              if (!qk.field_b) {
                d.field_c.field_pb = false;
                if (d.field_c.field_db) {
                  var9 = null;
                  if (ln.field_p) {
                    var9 = "<col=A00000>" + ab.field_h + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < dr.field_c; var10Lifetime1++) {
                    if (gf.field_b[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + ck.field_R[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 == null) {
                        var9 = var11_ref;
                      } else {
                        var9 = (String) (var9) + ", " + var11_ref;
                      }
                    }
                  }
                  kk.field_B = "<col=A00000>" + wc.field_a + "<br>" + m.field_b + (String) (var9);
                }
              }
            } else {
              ok.field_ob.field_pb = false;
              v.field_j.field_nb = hl.field_c;
              if (var8 != 0) {
                stackIn_25_0 = vi.field_a;
              } else {
                stackIn_25_0 = or.field_j;
              }
              var14 = stackIn_25_0;
              var9 = var14;
              var9 = var14;
              var9 = var14;
              var10Lifetime1 = gi.field_o.field_I.b(var14) + 3 * gi.field_o.field_I.a('.');
              if ((48 & va.field_V) == 16) {
                var9 = var14 + ".";
              }
              gi.field_o.field_Fb = 0;
              gi.field_o.field_tb = (gi.field_o.field_gb - var10Lifetime1) / 2;
              if ((48 & va.field_V) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & va.field_V) == 48) {
                var9 = (String) (var9) + "...";
              }
              gi.field_o.field_nb = (String) (var9);
              d.field_c.field_nb = be.field_K.toUpperCase();
            }
          }
          stackIn_68_0 = so.field_k;
          stackIn_69_1 = (param2) && (!param0) && (!nr.field_bb);
          ((vh) (Object) stackIn_68_0).a(stackIn_69_1, false);
          stackIn_73_0 = uq.field_f;
          stackIn_74_1 = (param2) && (!param0) && (!nr.field_bb);
          ((vh) (Object) stackIn_73_0).a(stackIn_74_1, false);
          stackIn_78_0 = de.field_b;
          stackIn_79_1 = (param2) && (!param0) && (nr.field_bb);
          ((vh) (Object) stackIn_78_0).a(stackIn_79_1, false);
          na.field_e.field_i.c(true);
          var4_int = -10 % ((-1 - param3) / 35);
          if (null != tp.field_e) {
            if (ok.field_ob.field_R != 0) {
              te.b(param1, -29);
            }
            if (0 != d.field_c.field_R) {
              if (kh.field_Ac) {
                me.b(-118, param1);
              } else {
                qd.a((byte) 81, param1);
              }
            }
            tl.a(param1, tp.field_e, 0, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "wk.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(eo param0, eo param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.field_Mb - param1.field_Mb;
          if (param2 < 17) {
            field_N = (vh) null;
          }
          if (param0.field_Wb != cm.field_J) {
            if (null == param0.field_Wb) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param1.field_Wb == cm.field_J) {
            var3_int += 200;
          } else {
            if (param1.field_Wb == null) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("wk.H(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, lr param2, int param3, lr param4, int param5, int param6, nm param7, int param8, int param9, nm param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, nm param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          ao.a((byte) -83, param0, param2, param4);
          kg.a(param12, true, param13, param5, param19);
          nj.a(param8, param9, -128);
          if (param16 != 255) {
            field_P = 121;
          }
          mf.a((byte) -91, param1, param10, param7, param3, param14);
          ve.a(111, param15, param17, param18);
          ta.a((byte) -96, param11, param20, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("wk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        int var5 = 0;
        if (this.field_S >= param1) {
          return;
        }
        fe[] var6 = new fe[param1];
        fe[] var7 = var6;
        fe[] var3 = var7;
        int[] var4 = new int[param1];
        if (param0 < 117) {
          this.a(18, (byte) 47, -48, 114);
        }
        for (var5 = 0; var5 < this.field_S; var5++) {
          var6[var5] = this.field_R[var5];
          var4[var5] = this.field_U[var5];
        }
        this.field_S = param1;
        this.field_R = var7;
        this.field_U = var4;
    }

    static {
        field_V = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
