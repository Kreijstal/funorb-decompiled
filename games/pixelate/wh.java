/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends de {
    static rh field_p;
    static String field_s;
    static dj field_o;
    static char[] field_r;
    static tf field_q;

    private final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, tc param7, int param8, int param9, int param10) {
        int var12 = 0;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String stackIn_11_0 = null;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
        L0: {
          var12 = param6 + (param1 + param10);
          if (var12 != 0) {
            param6 = (200 * param6 + var12) / (var12 * 2);
            param1 = (var12 + 200 * param1) / (2 * var12);
            param10 = (var12 + param10 * 200) / (var12 * 2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-1 != param8) {
            param7.c(param8 + 1 + ". ", 70, param4, param9, param0);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var14 = param5;
          param7.a(var14, 70, param4, param9, param0);
          var15 = Integer.toString(param3);
          param7.b(var15, aj.field_o[0], param4, param9, param0);
          if (param2 == 540) {
            break L2;
          } else {
            field_p = null;
            break L2;
          }
        }
        L3: {
          if ((var12 ^ -1) > -51) {
            stackOut_10_0 = Integer.toString(var12);
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = "50+";
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        var16 = stackIn_11_0;
        var13 = var16;
        param7.b(var16, aj.field_o[1], param4, param9, param0);
        var17 = param10 + "%";
        param7.b(var17, aj.field_o[2], param4, param9, param0);
        var18 = param1 + "%";
        param7.b(var18, aj.field_o[3], param4, param9, param0);
        var19 = param6 + "%";
        param7.b(var19, aj.field_o[4], param4, param9, param0);
    }

    final int b(int param0, int param1) {
        int var3 = 51 % ((param0 - -13) / 37);
        if (jg.a((byte) 64)) {
            return ((wh) this).field_d + param1 * ((wh) this).field_i;
        }
        if (!(param1 >= 2)) {
            return ((wh) this).field_d;
        }
        return ((wh) this).field_i + ((wh) this).field_d;
    }

    final int a(int param0, byte param1) {
        L0: {
          ((wh) this).field_m = 30;
          if (param1 == 90) {
            break L0;
          } else {
            int discarded$2 = ((wh) this).a(-116, false);
            break L0;
          }
        }
        L1: {
          ((wh) this).field_a = 640 + -((wh) this).field_m;
          if (jg.a((byte) 123)) {
            break L1;
          } else {
            if (2 > param0) {
              if (-1 == (param0 ^ -1)) {
                return ((wh) this).field_m;
              } else {
                return ((wh) this).field_a - this.d(1, 28);
              }
            } else {
              break L1;
            }
          }
        }
        return -(this.d(param0, 29) >> -1754623199) + 320;
    }

    private final int d(int param0, int param1) {
        String var3 = we.field_o[((wh) this).field_k[param0]];
        int var4 = 96 / ((param1 - -50) / 50);
        return 20 + rk.field_e.c(var3);
    }

    final static void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sm var5_ref_sm = null;
        int var5 = 0;
        df var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        pc var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          var2 = 88 % ((31 - param0) / 43);
          var11 = vi.field_o;
          var3 = var11.f(255);
          var4 = var11.f(255);
          if (-1 != (var3 ^ -1)) {
            if ((var3 ^ -1) != -2) {
              jo.a(1, "LR1: " + jm.b(-35), (Throwable) null);
              na.a(true);
              break L0;
            } else {
              var5 = var11.l(-20729);
              var6 = (df) (Object) he.field_b.c(1504642273);
              L1: while (true) {
                L2: {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (var4 != var6.field_p) {
                        break L3;
                      } else {
                        if ((var6.field_k ^ -1) == (var5 ^ -1)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6 = (df) (Object) he.field_b.f(1504642273);
                    continue L1;
                  }
                }
                if (var6 == null) {
                  na.a(true);
                  return;
                } else {
                  var6.c(2779);
                  break L0;
                }
              }
            }
          } else {
            var5_ref_sm = (sm) (Object) in.field_J.c(1504642273);
            if (var5_ref_sm == null) {
              na.a(true);
              return;
            } else {
              L4: {
                var6_int = -var11.field_m + jj.field_b;
                var15 = var5_ref_sm.field_o;
                var14 = var15;
                var13 = var14;
                var12 = var13;
                var7 = var12;
                if ((var6_int ^ -1) < (var15.length << -631127614 ^ -1)) {
                  var6_int = var15.length << 395893986;
                  break L4;
                } else {
                  break L4;
                }
              }
              var8 = 0;
              L5: while (true) {
                if ((var8 ^ -1) <= (var6_int ^ -1)) {
                  var5_ref_sm.c(2779);
                  break L0;
                } else {
                  var7[var8 >> -1521578494] = var7[var8 >> -1521578494] + (var11.f(255) << (cm.a(var8, 3) << -234211896));
                  var8++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final void a(int param0) {
        int var3 = 0;
        String var4 = null;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        ob var16 = null;
        L0: {
          var15 = Pixelate.field_H ? 1 : 0;
          gj.field_W[8].b(0, 45);
          ((wh) this).b((byte) -71);
          if (param0 == 11) {
            break L0;
          } else {
            ((wh) this).a((byte) -95, false, 89);
            break L0;
          }
        }
        L1: {
          ((wh) this).d((byte) 74);
          var16 = rk.field_e;
          var3 = var16.field_w + var16.field_z;
          if (ca.field_f != null) {
            break L1;
          } else {
            if (!jg.a((byte) 112)) {
              ca.field_f = cn.a(0, 7, 10, -119);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (jg.a((byte) 83)) {
              var4 = mj.field_h;
              break L3;
            } else {
              if (ca.field_f.field_u) {
                if (ca.field_f.field_o == null) {
                  var4 = pf.field_l;
                  break L3;
                } else {
                  var5 = qj.field_e;
                  var6 = 1 + var5.field_w + var5.field_z;
                  var7 = 150 + var6;
                  var8 = 16777215;
                  var9 = 0;
                  var5.b(hg.field_b, aj.field_o[0], var7, var8, var9);
                  var5.b(db.field_N, aj.field_o[1], var7, var8, var9);
                  var5.b(wa.field_d, aj.field_o[2], var7, var8, var9);
                  var5.b(ab.field_e, aj.field_o[3], var7, var8, var9);
                  var5.b(fa.field_d, aj.field_o[4], var7, var8, var9);
                  var4 = cf.field_z;
                  var7 = var7 + (var6 + 4);
                  var10 = ca.field_f.field_o[d.field_c];
                  var11 = ca.field_f.field_r[d.field_c];
                  var12 = 0;
                  var13 = 0;
                  L4: while (true) {
                    if (10 <= var13) {
                      if (var12 == 0) {
                        var7 += 4;
                        var8 = 16711680;
                        this.a(var9, ca.field_f.field_m, param0 ^ 535, ca.field_f.field_p, var7, kn.field_J, ca.field_f.field_n, var5, -1, var8, ca.field_f.field_v);
                        break L3;
                      } else {
                        int discarded$2 = var16.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
                        break L2;
                      }
                    } else {
                      L5: {
                        if (null == var10[var13]) {
                          break L5;
                        } else {
                          L6: {
                            var14 = var10[var13];
                            var8 = 16777215;
                            if (sm.a(var14, param0 + -12)) {
                              var12 = 1;
                              var8 = 16711680;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var4 = "";
                          this.a(var9, var11[4 * var13 + 3], 540, var11[var13 * 4], var7, var14, var11[4 * var13 + 2], var5, var13, var8, var11[4 * var13 + 1]);
                          break L5;
                        }
                      }
                      var7 = var7 + var6;
                      var13++;
                      continue L4;
                    }
                  }
                }
              } else {
                var4 = wd.field_b;
                break L3;
              }
            }
          }
          int discarded$3 = var16.a(var4, 50, 150, 540, 200, 0, -1, 1, 1, var3);
          break L2;
        }
    }

    public static void f(byte param0) {
        field_s = null;
        field_q = null;
        field_r = null;
        field_o = null;
        field_p = null;
        int var1 = 116 / ((param0 - -12) / 59);
    }

    final static void e(int param0, int param1) {
        if (fq.field_o == null) {
            if (rj.field_C[param1] != rg.field_e) {
                fq.field_o = rj.field_C[param1];
                fq.field_o.field_d = dm.field_Cb;
                ci.field_o = param1;
                hn.field_d = 0;
                u.a(false, 2 - -param1);
            }
        }
        int var2 = 20 / ((10 - param0) / 32);
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            ((wh) this).c((byte) -54);
        }
        if (!jg.a((byte) 115)) {
            if (param0 < 2) {
                if ((param0 ^ -1) != -1) {
                    return ((wh) this).field_a;
                }
                return ((wh) this).field_m - -this.d(0, -103);
            }
        }
        return (this.d(param0, 53) >> 2046724481) + 320;
    }

    final void c(byte param0) {
        if (param0 >= -13) {
            field_s = null;
        }
        la.a(((wh) this).field_l, nc.field_a, false, -25528);
    }

    wh(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(java.math.BigInteger param0, we param1, java.math.BigInteger param2, we param3, int param4) {
        pg.a(param0, true, 0, param3.field_m, param2, param1, param3.field_k);
        if (param4 != 12556) {
            field_s = null;
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        tf var4 = null;
        L0: {
          if (param0 <= -116) {
            break L0;
          } else {
            field_q = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = oc.field_N;
            if (jg.a((byte) 117)) {
              break L2;
            } else {
              if ((param2 ^ -1) != -2) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var4 = oc.field_S;
          break L1;
        }
        super.a((byte) 35, var4, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = null;
        field_r = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_s = "Private";
        field_o = new dj();
    }
}
