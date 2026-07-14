/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class uh {
    static String field_m;
    private dd field_n;
    static String field_d;
    private int field_j;
    private al field_q;
    private int field_h;
    private kk field_f;
    boolean field_o;
    private int field_a;
    static int field_r;
    private ee field_g;
    private int field_e;
    private boolean field_t;
    private pm field_k;
    boolean field_l;
    private int field_u;
    private int field_s;
    private int field_i;
    boolean field_c;
    int field_p;
    static char[] field_b;

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0) {
            ((uh) this).field_a = 111;
        }
        while (true) {
            var2 = ((uh) this).field_g.a(true);
            if ((((uh) this).field_g.a(true) ^ -1) == 0) {
                break;
            }
            boolean discarded$0 = ((uh) this).a(0, var2);
        }
    }

    final void a(int param0, int param1, int param2) {
        ((uh) this).field_g.a(param2, 0, param1);
        if (param0 != 6364) {
            boolean discarded$0 = uh.a((byte) -64);
        }
    }

    final void j(int param0) {
        ((uh) this).field_l = false;
        ((uh) this).field_e = ((uh) this).field_o ? -50 : 0;
        ((uh) this).field_g.a(-1);
        int var2 = 94 / ((-68 - param0) / 57);
    }

    public static void f(int param0) {
        field_b = null;
        if (param0 < 76) {
            field_r = 7;
        }
        field_d = null;
        field_m = null;
    }

    final void b(int param0) {
        ((uh) this).field_f.a(false);
        if (param0 != -1) {
            uh.f(88);
        }
        if (!((uh) this).field_f.c(-127)) {
            if (!((uh) this).field_l) {
                if (-1 >= ((uh) this).field_e) {
                    if (-1 <= ((uh) this).field_u) {
                        if (((uh) this).field_h >= ((uh) this).field_u) {
                            ((uh) this).field_q.a(((uh) this).field_u, ((uh) this).field_p, 0);
                        }
                    }
                }
            }
        }
    }

    final static boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -59) {
            break L0;
          } else {
            boolean discarded$2 = uh.a((byte) 49);
            break L0;
          }
        }
        L1: {
          L2: {
            if (10 > el.field_b) {
              break L2;
            } else {
              if (lo.field_Nb) {
                break L2;
              } else {
                if (ol.b(true)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, boolean param2) {
        int var5 = 0;
        int var4 = 0;
        if (param2) {
            var4 = ((uh) this).field_k.field_a[((uh) this).field_j].field_e;
            var5 = ((uh) this).field_k.field_a[((uh) this).field_j].field_h;
            ki.a(((uh) this).field_f.field_t - (-32 + -(32 * var4)), -1, param1, var5 * 32 + (32 + ((uh) this).field_f.field_u));
        } else {
            ki.a(((uh) this).field_i, -1, param1, ((uh) this).field_s);
        }
        if (param0 != -20791) {
            ((uh) this).a(-23, -70, 98);
        }
    }

    final void d(int param0) {
        if (!(((uh) this).field_f.c(param0 ^ -40))) {
            ((uh) this).field_f.b(param0 + -32);
            bc.a((byte) 96, 7);
        }
        if (param0 != 93) {
            ((uh) this).field_p = -49;
        }
        ((uh) this).field_u = 0;
        ((uh) this).field_k.field_a[((uh) this).field_j].field_p = false;
    }

    final void e(int param0) {
        if (param0 != 2406) {
            ((uh) this).field_j = -80;
        }
        ((uh) this).field_e = !((uh) this).field_o ? 0 : -50;
        ((uh) this).field_n = ((uh) this).field_k.field_d;
        ((uh) this).field_f.a((byte) 71);
        ((uh) this).field_t = true;
        ((uh) this).field_h = 16777216 / ((uh) this).field_n.field_j + (((uh) this).field_n.field_n + ((uh) this).field_n.field_h) + 10;
    }

    final static void a(boolean param0, boolean param1, String param2, int param3, int param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_3_0 = null;
        String stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        String stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        String stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        String stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        String stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          ek.field_c = true;
          uf.field_g = param4;
          var11 = param2;
          if (param1) {
            stackOut_2_0 = td.field_a;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ln.field_k;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (uf.field_g != 0) {
            if (1 == uf.field_g) {
              var7 = qn.a(var11, 480, nc.field_c, -109, lm.field_o);
              var8 = var7 + 2;
              pl.field_J = new String[var8];
              uf.field_e = new int[var8];
              var9 = 0;
              L2: while (true) {
                if (var8 <= var9) {
                  di.field_b = new int[1];
                  var9 = 0;
                  L3: while (true) {
                    if (var7 <= var9) {
                      pl.field_J[-2 + var8] = "";
                      pl.field_J[var8 + -1] = od.field_Hb;
                      uf.field_e[var8 - 1] = 0;
                      di.field_b[0] = 2;
                      break L1;
                    } else {
                      pl.field_J[var9] = nc.field_c[var9];
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  uf.field_e[var9] = -1;
                  var9++;
                  continue L2;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            var7 = qn.a(var11, 480, nc.field_c, -121, lm.field_o);
            var8 = var7 + 3;
            pl.field_J = new String[var8];
            uf.field_e = new int[var8];
            var9 = 0;
            L4: while (true) {
              if (var9 >= var8) {
                di.field_b = new int[2];
                var9 = 0;
                L5: while (true) {
                  if (var9 >= var7) {
                    pl.field_J[-3 + var8] = "";
                    pl.field_J[var8 - 2] = var6;
                    uf.field_e[-2 + var8] = 0;
                    di.field_b[0] = 1;
                    pl.field_J[-1 + var8] = od.field_Hb;
                    uf.field_e[var8 + -1] = 1;
                    di.field_b[1] = 2;
                    break L1;
                  } else {
                    pl.field_J[var9] = nc.field_c[var9];
                    var9++;
                    continue L5;
                  }
                }
              } else {
                uf.field_e[var9] = -1;
                var9++;
                continue L4;
              }
            }
          }
        }
        vp.field_Gb.field_h = di.field_b.length;
        var7 = 0;
        var8 = 0;
        L6: while (true) {
          if (var8 >= pl.field_J.length) {
            qn.field_o = -(var7 >> -1641799839) + bq.field_d;
            ia.field_e = -(var7 >> 1215663105) + (bq.field_d - -var7);
            nf.field_c = (lf.field_b + ki.field_e << -1282069695) * vp.field_Gb.field_h;
            var8 = param3;
            L7: while (true) {
              if (pl.field_J.length <= var8) {
                ce.field_c = -(nf.field_c >> -1574329535) + qh.field_b;
                vp.field_Gb.a(param0, ec.a(false, uf.field_d, bg.field_k), param3 ^ 17068, 0);
                return;
              } else {
                L8: {
                  stackOut_32_0 = nf.field_c;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if (uf.field_e[var8] >= 0) {
                    stackOut_34_0 = stackIn_34_0;
                    stackOut_34_1 = dk.field_d;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L8;
                  } else {
                    stackOut_33_0 = stackIn_33_0;
                    stackOut_33_1 = da.field_m;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L8;
                  }
                }
                nf.field_c = stackIn_35_0 + stackIn_35_1;
                var8++;
                continue L7;
              }
            }
          } else {
            L9: {
              stackOut_22_0 = pl.field_J[var8];
              stackOut_22_1 = 8192;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              if (uf.field_e[var8] < 0) {
                stackOut_24_0 = (String) (Object) stackIn_24_0;
                stackOut_24_1 = stackIn_24_1;
                stackOut_24_2 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                break L9;
              } else {
                stackOut_23_0 = (String) (Object) stackIn_23_0;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                break L9;
              }
            }
            L10: {
              var9 = jp.a(stackIn_25_0, stackIn_25_1, stackIn_25_2 != 0);
              if (0 == (uf.field_e[var8] ^ -1)) {
                break L10;
              } else {
                var9 = var9 + uf.field_a * 2;
                break L10;
              }
            }
            if (var7 < var9) {
              var7 = var9;
              var8++;
              continue L6;
            } else {
              var8++;
              continue L6;
            }
          }
        }
    }

    final void h(int param0) {
        if (param0 != 9236) {
            ((uh) this).field_i = 83;
        }
        ((uh) this).field_e = ((uh) this).field_k.field_a[((uh) this).field_j].field_b;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          ((uh) this).field_f.b((byte) -113);
          if (param0 > (((uh) this).field_p ^ -1)) {
            ((uh) this).field_p = ((uh) this).field_p + 1;
            if (8 <= ((uh) this).field_p + 1) {
              ((uh) this).field_p = 0;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (!((uh) this).field_f.c(-123)) {
          L1: {
            if (!((uh) this).field_t) {
              break L1;
            } else {
              ((uh) this).field_f = new kk(((uh) this).field_k.field_a[((uh) this).field_j], ((uh) this).field_i, ((uh) this).field_s);
              ((uh) this).field_q = new al(((uh) this).field_n, ((uh) this).field_k.field_a[((uh) this).field_j], ((uh) this).field_f);
              ((uh) this).field_u = 0;
              ((uh) this).field_t = false;
              break L1;
            }
          }
          if (!((uh) this).field_l) {
            ((uh) this).field_e = ((uh) this).field_e + 1;
            if (((uh) this).field_e + 1 < 0) {
              return;
            } else {
              L2: {
                ((uh) this).field_u = ((uh) this).field_u + 1;
                if (!((uh) this).field_k.field_a[((uh) this).field_j].field_p) {
                  break L2;
                } else {
                  if ((((uh) this).field_u ^ -1) < -21) {
                    L3: {
                      var2 = ((uh) this).field_n.field_h + 10 + ((uh) this).field_n.field_n;
                      if (((uh) this).field_u >= var2) {
                        break L3;
                      } else {
                        ((uh) this).field_u = var2;
                        break L3;
                      }
                    }
                    ((uh) this).field_u = ((uh) this).field_u + ((uh) this).field_a;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (!((uh) this).field_o) {
                  if (((uh) this).field_h > ((uh) this).field_u) {
                    break L4;
                  } else {
                    L5: {
                      if (!ag.field_p) {
                        break L5;
                      } else {
                        ae.a(5, param0 ^ 18655, ((uh) this).field_e);
                        break L5;
                      }
                    }
                    boolean discarded$2 = ((uh) this).a(0, 5);
                    break L4;
                  }
                } else {
                  L6: {
                    if (((uh) this).field_u < ((uh) this).field_h) {
                      break L6;
                    } else {
                      ((uh) this).field_u = ((uh) this).field_h;
                      break L6;
                    }
                  }
                  L7: while (true) {
                    var2 = ((uh) this).field_g.a(((uh) this).field_e, (byte) -106);
                    if (-1 == ((uh) this).field_g.a(((uh) this).field_e, (byte) -106)) {
                      break L4;
                    } else {
                      boolean discarded$3 = ((uh) this).a(param0 ^ -1, var2);
                      continue L7;
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 >= -77) {
            ((uh) this).field_u = 19;
        }
        return ((uh) this).field_e;
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            ((uh) this).field_s = -1;
            break L0;
          }
        }
        L1: {
          var3 = 0;
          if (-6 == param1) {
            L2: {
              if (!((uh) this).field_k.a(param1, ((uh) this).field_j, param0 + 92, ((uh) this).field_e)) {
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L2;
              } else {
                stackOut_30_0 = 1;
                stackIn_32_0 = stackOut_30_0;
                break L2;
              }
            }
            var3 = stackIn_32_0;
            ((uh) this).field_f.d(param0 + -16);
            ((uh) this).field_q.a(param0 + -122);
            ((uh) this).field_u = 0;
            ((uh) this).field_l = ((uh) this).field_k.field_a[((uh) this).field_j].c(param0 + 26745);
            if (50 != ((uh) this).field_k.field_a[((uh) this).field_j].field_f) {
              if (((uh) this).field_k.field_a[((uh) this).field_j].field_f > 0) {
                bc.a((byte) 96, 5);
                break L1;
              } else {
                break L1;
              }
            } else {
              bc.a((byte) 96, 6);
              break L1;
            }
          } else {
            if (-5 == param1) {
              if (-1 != (((uh) this).field_p ^ -1)) {
                return false;
              } else {
                if (((uh) this).field_k.a(param1, ((uh) this).field_j, 127, ((uh) this).field_e)) {
                  bc.a((byte) 96, 4);
                  ((uh) this).field_p = 1;
                  return true;
                } else {
                  break L1;
                }
              }
            } else {
              if (8 == param1) {
                ((uh) this).field_c = true;
                return false;
              } else {
                L3: {
                  if (param1 == 2) {
                    break L3;
                  } else {
                    if (-4 == (param1 ^ -1)) {
                      break L3;
                    } else {
                      if (0 == param1) {
                        break L3;
                      } else {
                        if (1 != param1) {
                          L4: {
                            if (-7 == param1) {
                              break L4;
                            } else {
                              if (-8 == param1) {
                                break L4;
                              } else {
                                break L1;
                              }
                            }
                          }
                          L5: {
                            if (!((uh) this).field_k.a(param1, ((uh) this).field_j, 28, ((uh) this).field_e)) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L5;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (!((uh) this).field_k.a(param1, ((uh) this).field_j, 117, ((uh) this).field_e)) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L6;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L6;
                  }
                }
                var3 = stackIn_13_0;
                if (var3 != 0) {
                  bc.a((byte) 96, ok.a(ea.field_b, -101, 4) + 0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        return var3 != 0;
    }

    final boolean g(int param0) {
        if (param0 != -1) {
            return true;
        }
        return ((uh) this).field_f.a(6);
    }

    uh(pm param0, int param1, boolean param2, dd param3, int param4, int param5) {
        ((uh) this).field_t = false;
        ((uh) this).field_u = 0;
        ((uh) this).field_n = param3;
        ((uh) this).field_j = param1;
        ((uh) this).field_i = param4;
        ((uh) this).field_o = param2 ? true : false;
        ((uh) this).field_s = param5;
        ((uh) this).field_k = param0;
        ((uh) this).field_a = 524288 / ((uh) this).field_n.field_j;
        ((uh) this).field_l = true;
        ((uh) this).field_e = !((uh) this).field_o ? 0 : -50;
        ((uh) this).field_f = new kk(((uh) this).field_k.field_a[((uh) this).field_j], ((uh) this).field_i, ((uh) this).field_s);
        ((uh) this).field_q = new al(((uh) this).field_n, ((uh) this).field_k.field_a[((uh) this).field_j], ((uh) this).field_f);
        ((uh) this).field_h = 16777216 / ((uh) this).field_n.field_j + (((uh) this).field_n.field_h + 10) - -((uh) this).field_n.field_n;
        ((uh) this).field_g = new ee();
    }

    final boolean i(int param0) {
        if (param0 >= -116) {
            boolean discarded$0 = ((uh) this).a(-27, -5);
        }
        return ((uh) this).field_f.c(-123);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = new char[]{(char)91, (char)93, (char)35};
    }
}
