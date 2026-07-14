/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kea extends td {
    static be[] field_r;
    static byte[] field_q;
    static int[] field_s;
    static String field_p;

    final static fea a(byte param0, byte[] param1) {
        if (param1 == null) {
            return null;
        }
        fea var2 = new fea(param1, fl.field_j, fd.field_D, lq.field_A, eha.field_s, baa.field_P);
        al.b(-18073);
        if (param0 != -3) {
            kea.b(5);
        }
        return var2;
    }

    final static void a(int param0, vr param1) {
        sna var3 = null;
        sna var5 = null;
        sna var6 = null;
        L0: {
          ln.field_x = hca.a("basic", param1, param0 + 12213, "display_name_changed");
          rba.field_a = new ok(0L, ob.field_g, baa.field_A, cd.field_p);
          nr.field_w = new ok(0L, ob.field_g, lma.field_z, mna.field_r);
          ov.field_d = new sna(0L, (sna) null);
          kg.field_d = new sna(0L, qs.field_m);
          kg.field_d.field_N = 1;
          eda.field_k = new sna(0L, iia.field_m, bs.field_j);
          vl.field_d = new sna(0L, vda.field_a, te.field_f);
          if (param0 == -12238) {
            break L0;
          } else {
            field_s = null;
            break L0;
          }
        }
        fa.field_k = new sna(0L, dla.field_k);
        ov.field_d.a(param0 ^ 12237, kg.field_d);
        ov.field_d.a(-1, eda.field_k);
        ov.field_d.a(-1, vl.field_d);
        ov.field_d.a(param0 ^ 12237, (sna) (Object) rba.field_a);
        ov.field_d.a(-1, fa.field_k);
        rba.field_a.field_xb.field_wb.a(qs.field_m, 80);
        rba.field_a.field_xb.field_wb.field_Y = 1;
        var5 = rba.field_a.field_xb.field_wb;
        var6 = var5;
        var6.field_N = 1;
        nr.field_w.field_xb.field_wb.a(qs.field_m, 88);
        var3 = nr.field_w.field_xb.field_wb;
        nr.field_w.field_xb.field_wb.field_Y = 1;
        var3.field_N = 1;
    }

    kea(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((kea) this).field_n = param3;
        ((kea) this).field_k = param2;
    }

    final ii a(op param0, int param1) {
        tla var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        aj[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        aj var14_ref_aj = null;
        int var15_int = 0;
        wia var15 = null;
        aga var16 = null;
        iv var17 = null;
        int var18 = 0;
        aga var19 = null;
        int[][] var23 = null;
        L0: {
          var18 = BachelorFridge.field_y;
          var19 = ((kea) this).field_h.a(41, param0);
          var4 = new tla(((kea) this).field_g, new nq(var19));
          var4.field_v = ((kea) this).field_k;
          var4.field_r = ((kea) this).field_n;
          var23 = var4.d(false);
          var6 = 17;
          var7 = 17;
          var8 = -1 + var6 >> -1129643327;
          var9 = var7 - 1 >> -1108986527;
          var10 = 0;
          var11_int = 0;
          if (param1 == 3) {
            break L0;
          } else {
            field_s = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var6 <= var11_int) {
            var11 = new aj[var10];
            var10 = 0;
            var12 = 0;
            L2: while (true) {
              if (var12 >= var6) {
                var12 = 0;
                L3: while (true) {
                  L4: {
                    if (var12 >= var10 - 1) {
                      break L4;
                    } else {
                      if (6 <= var12) {
                        break L4;
                      } else {
                        var13 = kla.a(-var12 + var10, param0.field_w, -2147483648) + var12;
                        if (var13 != var12) {
                          var14_ref_aj = var11[var12];
                          var11[var12] = var11[var13];
                          var11[var13] = var14_ref_aj;
                          var12++;
                          continue L3;
                        } else {
                          var12++;
                          continue L3;
                        }
                      }
                    }
                  }
                  var12 = 0;
                  L5: while (true) {
                    L6: {
                      if (var12 >= var10) {
                        break L6;
                      } else {
                        if (var12 >= 6) {
                          break L6;
                        } else {
                          L7: {
                            var13 = var11[var12].field_c;
                            var14 = var11[var12].field_a;
                            var15 = param0.field_a[var13][var14];
                            var16 = var15.field_l;
                            if (var16 != null) {
                              var17 = new iv(new nq(var16), false, 1, 50, 0);
                              var4.field_o.a((bw) (Object) var17, true);
                              break L7;
                            } else {
                              var17 = (iv) (Object) new bm(21, var13, var14);
                              var4.field_o.a((bw) (Object) var17, true);
                              break L7;
                            }
                          }
                          var4.field_u = var4.field_u + 1;
                          var4.field_t[var4.field_u] = var11[var12];
                          var12++;
                          continue L5;
                        }
                      }
                    }
                    return (ii) (Object) var4;
                  }
                }
              } else {
                var13 = 0;
                L8: while (true) {
                  if (var13 >= var7) {
                    var12++;
                    continue L2;
                  } else {
                    if (var23[var12][var13] == 1) {
                      var14 = ((kea) this).field_k - (var8 + -var12);
                      var15_int = ((kea) this).field_n + -var9 - -var13;
                      if (param0.a(var14, var15_int, (byte) -127)) {
                        var10++;
                        var11[var10] = new aj(var14, var15_int);
                        var13++;
                        continue L8;
                      } else {
                        var13++;
                        continue L8;
                      }
                    } else {
                      var13++;
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            var12 = 0;
            L9: while (true) {
              if (var12 >= var7) {
                var11_int++;
                continue L1;
              } else {
                if (var23[var11_int][var12] == 1) {
                  var10++;
                  var12++;
                  continue L9;
                } else {
                  var12++;
                  continue L9;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = BachelorFridge.field_y;
          if (dg.field_f <= param5) {
            break L0;
          } else {
            param0 = param0 - (dg.field_f - param5);
            param5 = dg.field_f;
            break L0;
          }
        }
        L1: {
          if (param4 < dg.field_j) {
            param1 = param1 - (dg.field_j - param4);
            param4 = dg.field_j;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 + param5 <= dg.field_h) {
            break L2;
          } else {
            param0 = dg.field_h - param5;
            break L2;
          }
        }
        L3: {
          if (param4 + param1 <= dg.field_k) {
            break L3;
          } else {
            param1 = dg.field_k - param4;
            break L3;
          }
        }
        if (param0 >= -1) {
          return;
        } else {
          if (-1 < param1) {
            var6 = param5 - -(dg.field_i * param4);
            if (param2 == 16711680) {
              var7 = dg.field_i + -param0;
              param4 = -param1;
              L4: while (true) {
                if (param4 >= 0) {
                  return;
                } else {
                  param5 = -param0;
                  L5: while (true) {
                    if (0 <= param5) {
                      var6 = var6 + var7;
                      param4++;
                      continue L4;
                    } else {
                      var8 = dg.field_e[var6];
                      if (param3 < (255 & var8 >> 661686440)) {
                        if ((var8 & 16711680) >> -868367696 <= (var8 & 65280) >> 1034858792) {
                          L6: {
                            var9 = ((var8 & 16711680) >> 2009777583) + -60;
                            if ((var9 ^ -1) < -256) {
                              var9 = 255;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var10 = var8 & 65280;
                          var10 = (var10 >> -1832179007) - (var10 >> 1769148997) & 65280;
                          var11 = 31 & var8 >> 893005347;
                          dg.field_e[var6] = mp.a(var11, mp.a(var10, var9 << -2067141424));
                          var6++;
                          param5++;
                          continue L5;
                        } else {
                          var6++;
                          param5++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        param5++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_r = null;
        field_p = null;
        field_q = null;
        if (param0 != -26857) {
            return;
        }
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new be[1];
        field_s = new int[8192];
        field_p = "Waiting for extra data";
    }
}
