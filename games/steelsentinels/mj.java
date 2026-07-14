/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class mj extends gh {
    static double field_Xb;
    static String field_ac;
    private gh[] field_Ub;
    static kg field_Sb;
    private gh[] field_Tb;
    int field_bc;
    private gh field_Wb;
    static int field_cc;
    static de field_Vb;
    static gh field_Zb;
    static ja field_Yb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((mj) this).field_zb = param3;
        ((mj) this).field_Lb = param1;
        ((mj) this).field_eb = param6;
        ((mj) this).field_Y = param4;
        if (param0 != 10) {
            return;
        }
        this.a(param2, param5, 0);
    }

    final static void a(ak param0, int param1, int param2, int param3) {
        cl.field_b = param1;
        int var4 = 50 % ((param3 - 53) / 62);
        ok.field_c = param2;
        gl.field_l = param0;
    }

    final static String b(long param0, int param1) {
        pg.field_x.setTime(new Date(param0));
        int var3 = pg.field_x.get(7);
        int var4 = pg.field_x.get(5);
        int var5 = pg.field_x.get(2);
        int var6 = pg.field_x.get(1);
        if (param1 != 0) {
            return null;
        }
        int var7 = pg.field_x.get(11);
        int var8 = pg.field_x.get(12);
        int var9 = pg.field_x.get(13);
        return cf.field_t[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ee.field_jb[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    mj(long param0, gh param1, String[] param2, gh param3, gh[] param4, int param5) {
        super(param0, (gh) null);
        int var8 = 0;
        gh var9 = null;
        ((mj) this).field_Ub = new gh[param2.length];
        ((mj) this).field_Wb = new gh(0L, param3);
        ((mj) this).field_Tb = param4;
        for (var8 = 0; param2.length > var8; var8++) {
            var9 = new gh(0L, param1);
            var9.field_S = param2[var8];
            ((mj) this).field_Ub[var8] = var9;
            ((mj) this).a(var9, 124);
        }
        ((mj) this).a(((mj) this).field_Wb, 120);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((mj) this).field_Wb.a(param4[var11], 126);
            var11++;
        }
        ((mj) this).field_bc = param5;
        ((mj) this).field_Ub[param5].field_G = true;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = SteelSentinels.field_G;
        var4 = 0;
        L0: while (true) {
          if (((mj) this).field_Ub.length <= var4) {
            ((mj) this).field_Wb.a(param2 + param2, param1, ((mj) this).field_Lb + -param1, 0, ((mj) this).field_zb);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (((mj) this).field_Tb.length <= var8) {
                return;
              } else {
                ((mj) this).field_Tb[var8].a(0, param0, -(2 * param0) + ((mj) this).field_Wb.field_Lb, param0, -(param0 * 2) + ((mj) this).field_Wb.field_zb);
                if (((mj) this).field_bc != var8) {
                  ((mj) this).field_Tb[var8].field_Y = ((mj) this).field_Tb[var8].field_Y + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = ((mj) this).field_zb * var4 / ((mj) this).field_Ub.length;
            var6 = (1 + var4) * ((mj) this).field_zb / ((mj) this).field_Ub.length;
            ((mj) this).field_Ub[var4].field_Y = var5;
            ((mj) this).field_Ub[var4].field_eb = 0;
            ((mj) this).field_Ub[var4].field_zb = var6 + -var5;
            ((mj) this).field_Ub[var4].field_Lb = param1;
            var4++;
            continue L0;
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 49) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(ge.a(param0 + -49, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 != -72) {
            return;
        }
        field_Vb = null;
        field_Sb = null;
        field_Yb = null;
        field_Zb = null;
        field_ac = null;
    }

    final static void b(String param0, byte param1) {
        int var2 = 46 % ((6 - param1) / 37);
        d.field_U = param0;
        hc.a(12, 0);
    }

    final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = 0;
        if (param0 == 10000) {
          L0: while (true) {
            if (((mj) this).field_Ub.length <= var2) {
              return;
            } else {
              if (var2 != ((mj) this).field_bc) {
                if (0 != ((mj) this).field_Ub[var2].field_Eb) {
                  ((mj) this).field_Ub[((mj) this).field_bc].field_G = false;
                  ((mj) this).field_Tb[((mj) this).field_bc].field_Y = ((mj) this).field_Tb[((mj) this).field_bc].field_Y + 10000;
                  ((mj) this).field_bc = var2;
                  ((mj) this).field_Ub[var2].field_G = true;
                  ((mj) this).field_Tb[var2].field_Y = ((mj) this).field_Tb[var2].field_Y - 10000;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        String stackIn_10_0 = null;
        String stackOut_9_0 = null;
        String stackOut_8_0 = null;
        L0: {
          var16 = SteelSentinels.field_G;
          if (-32768 > (param2 ^ -1)) {
            param2 = 32767;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (1 + param3 <= fm.field_f[param0]) {
            if (param0 == 1) {
              if (param2 < jh.field_a[param3]) {
                jh.field_a[param3] = param2;
                break L1;
              } else {
                break L1;
              }
            } else {
              if (-3 == param0) {
                if (param2 < jh.field_a[10 + param3]) {
                  jh.field_a[param3 + 10] = param2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          } else {
            L2: {
              fm.field_f[param0] = 1 + param3;
              if (param0 != 0) {
                break L2;
              } else {
                if (fm.field_f[param0] == fj.field_d) {
                  L3: {
                    if (ni.b(122)) {
                      stackOut_9_0 = td.field_ac;
                      stackIn_10_0 = stackOut_9_0;
                      break L3;
                    } else {
                      stackOut_8_0 = ee.field_k;
                      stackIn_10_0 = stackOut_8_0;
                      break L3;
                    }
                  }
                  L4: {
                    km.field_a = stackIn_10_0;
                    if (jc.field_f > -2) {
                      jc.field_f = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ln.field_g = -1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L5: {
              if (-1 != param0) {
                break L5;
              } else {
                if (10 != fm.field_f[param0]) {
                  break L5;
                } else {
                  if (ni.b(param7 + 103)) {
                    km.field_a = ra.field_b;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (1 == param0) {
                jh.field_a[param3] = param2;
                break L6;
              } else {
                break L6;
              }
            }
            if (-3 == param0) {
              jh.field_a[param3 + 10] = param2;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L7: {
          if (!ni.b(85)) {
            mm.field_g.a(71, (byte) -117);
            mm.field_g.a((byte) 114, 10 * param0 + param3);
            mm.field_g.d(param2, 54);
            mm.field_g.b(true, param5);
            mm.field_g.b(true, param1);
            mm.field_g.b(true, param6);
            mm.field_g.b(true, param4);
            break L7;
          } else {
            jb.field_P = jb.field_P | 1 << 10 * param0 + param3;
            break L7;
          }
        }
        var8 = d.field_T[10 * param0 + param3];
        var9 = bi.field_e[param3 + param0 * 10];
        var10 = 0;
        var11 = 0;
        var18 = var8;
        var13 = 0;
        L8: while (true) {
          if (var13 >= var18.length) {
            var19 = var9;
            var17 = 0;
            var13 = var17;
            L9: while (true) {
              if (var19.length <= var17) {
                ad.field_i = new int[var10];
                vk.field_g = new int[var11];
                var12 = 0;
                var20 = var8;
                var14 = 0;
                L10: while (true) {
                  if (var14 >= var20.length) {
                    var12 = 0;
                    var21 = var9;
                    var14 = 0;
                    L11: while (true) {
                      if (var14 >= var21.length) {
                        L12: {
                          if (param7 == -65) {
                            break L12;
                          } else {
                            String discarded$1 = mj.b(70L, 70);
                            break L12;
                          }
                        }
                        L13: {
                          L14: {
                            if (var10 > 0) {
                              break L14;
                            } else {
                              if (var11 <= 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          vn.d(-106);
                          var12 = 0;
                          L15: while (true) {
                            if (va.field_k.length <= var12) {
                              break L13;
                            } else {
                              va.field_k[var12] = 0;
                              var12++;
                              continue L15;
                            }
                          }
                        }
                        return;
                      } else {
                        var15 = var21[var14];
                        if (!t.a(fe.field_D, var15, -20370)) {
                          var12++;
                          vk.field_g[var12] = var15;
                          var14++;
                          continue L11;
                        } else {
                          var14++;
                          continue L11;
                        }
                      }
                    }
                  } else {
                    var15 = var20[var14];
                    if (!t.a(rn.field_D, var15, -20370)) {
                      var12++;
                      ad.field_i[var12] = var15;
                      var14++;
                      continue L10;
                    } else {
                      var14++;
                      continue L10;
                    }
                  }
                }
              } else {
                var14 = var19[var17];
                if (!t.a(fe.field_D, var14, -20370)) {
                  var11++;
                  var17++;
                  continue L9;
                } else {
                  var17++;
                  continue L9;
                }
              }
            }
          } else {
            var14 = var18[var13];
            if (!t.a(rn.field_D, var14, -20370)) {
              var10++;
              var13++;
              continue L8;
            } else {
              var13++;
              continue L8;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ac = "Private";
        field_Xb = Math.atan2(1.0, 0.0);
        field_Vb = new de("usename");
        field_Yb = new ja();
    }
}
