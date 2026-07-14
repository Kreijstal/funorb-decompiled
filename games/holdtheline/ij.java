/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static String field_a;
    String field_o;
    static String field_k;
    int field_e;
    int[] field_b;
    static String field_n;
    static int[][] field_c;
    int field_h;
    private long field_f;
    int field_j;
    static boolean field_l;
    private String field_i;
    static oa field_g;
    private int field_d;
    private boolean field_m;

    final static hj a(int param0, int param1, hj[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hj var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        hj var23 = null;
        hj var23_ref = null;
        hj var24 = null;
        hj var25 = null;
        L0: {
          var22 = HoldTheLine.field_D;
          var4 = param2[0].field_o;
          var5 = param2[2].field_o;
          var6 = param2[0].field_v;
          var7 = param2[6].field_v;
          var8 = 16;
          var9 = 16;
          if (0 != param1 % var8) {
            param1 = param1 + (var8 + -(param1 % var8));
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 % var9 != 0) {
            param3 = param3 + (var9 + -(param3 % var9));
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var11 = param1 + (var4 + var5);
          if (param0 == -8096) {
            break L2;
          } else {
            ij.b(70);
            break L2;
          }
        }
        var12 = param3 + (var7 + var6);
        var13 = 0;
        L3: while (true) {
          L4: {
            if (var13 >= 4) {
              break L4;
            } else {
              L5: {
                var23 = lb.field_t[var13];
                var24 = var23;
                if (var24 == null) {
                  break L5;
                } else {
                  if (var24.field_s != var11) {
                    break L5;
                  } else {
                    if (var12 == var24.field_y) {
                      var14 = var13;
                      L6: while (true) {
                        L7: {
                          if (-1 <= (var14 ^ -1)) {
                            break L7;
                          } else {
                            lb.field_t[var14] = lb.field_t[var14 - 1];
                            var14--;
                            if (0 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var23_ref = var24;
                        lb.field_t[0] = var23_ref;
                        return var24;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var13++;
              if (0 == 0) {
                continue L3;
              } else {
                break L4;
              }
            }
          }
          var13 = 3;
          L8: while (true) {
            L9: {
              if (-1 <= (var13 ^ -1)) {
                break L9;
              } else {
                lb.field_t[var13] = lb.field_t[-1 + var13];
                var13--;
                if (0 == 0) {
                  continue L8;
                } else {
                  break L9;
                }
              }
            }
            lb.field_t[0] = new hj(param1 + (var4 + var5), var6 + (var7 - -param3));
            var25 = new hj(param1 + (var4 + var5), var6 + (var7 - -param3));
            var10 = var25;
            vb.a(-98, var25);
            tc.a(10, 10, var4 + param1 - (-var5 + 10), -10 + (var7 + var6 + param3));
            var13 = 0;
            L10: while (true) {
              L11: {
                if (var4 + (param1 - -var5) <= var13) {
                  break L11;
                } else {
                  var14 = 0;
                  L12: while (true) {
                    L13: {
                      if (var7 + (var6 + param3) <= var14) {
                        break L13;
                      } else {
                        param2[4].a(var13, var14);
                        var14 = var14 + param2[4].field_y;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var13 = var13 + param2[4].field_s;
                    if (0 == 0) {
                      continue L10;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              tc.d();
              hi.a(param2, var7 + var6 + param3, true, var5 + (var4 + param1), 0, 0);
              var13 = (param1 * param1 + param3 * param3) / 4;
              var14 = -4;
              L14: while (true) {
                L15: {
                  if (param1 - -4 <= var14) {
                    break L15;
                  } else {
                    var15 = -4;
                    L16: while (true) {
                      L17: {
                        if (4 + param3 <= var15) {
                          break L17;
                        } else {
                          L18: {
                            var16 = (int)Math.sqrt((double)((var14 - param1 / 2) * (var14 - param1 / 2) + (-(param3 / 2) + var15) * (-(param3 / 2) + var15)));
                            var17 = 128 - -(64 * var16 / (int)Math.sqrt((double)var13));
                            if (-257 > (var17 ^ -1)) {
                              var17 = 256;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          var18 = var14 + (var4 + tc.field_j * (var6 + var15));
                          var19 = tc.field_b[var18];
                          var20 = var19 & 16711935;
                          var20 = var20 * var17;
                          var21 = 65280 & var19;
                          var21 = var21 * var17;
                          var20 = var20 & -16711936;
                          var21 = var21 & 16711680;
                          var19 = (var20 | var21) >> 490380456;
                          tc.field_b[var18] = var19;
                          var15++;
                          if (0 == 0) {
                            continue L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var14++;
                      if (0 == 0) {
                        continue L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
                ug.b(-1);
                return var10;
              }
            }
          }
        }
    }

    final static void c(int param0) {
        if (!(null != cc.field_w)) {
            return;
        }
        om.a(-46342, (java.awt.Canvas) (Object) cc.field_w);
        cc.field_w.a(wi.field_b, 50);
        cc.field_w = null;
        if (param0 != 4) {
            ij.c(-47);
        }
        if (!(hh.field_c == null)) {
            hh.field_c.b(125);
        }
        kd.field_b.requestFocus();
    }

    final static nd a(String param0, int param1, int param2) {
        nd var3 = null;
        var3 = new nd(false);
        var3.field_d = param0;
        if (param1 != 256) {
          return null;
        } else {
          var3.field_b = param2;
          return var3;
        }
    }

    final int a(int param0) {
        L0: {
          if (((ij) this).field_m) {
            break L0;
          } else {
            L1: {
              if (2 != ((ij) this).field_h) {
                break L1;
              } else {
                if (0 >= ((ij) this).field_d) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (param0 <= -36) {
              if (((ij) this).field_f == ra.field_bb) {
                return 1;
              } else {
                if ((eg.field_b ^ -1) == -3) {
                  if (!cg.a(2113942113, ((ij) this).field_i)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 80;
            }
          }
        }
        return 2;
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        if (7 != mi.field_d) {
          throw new RuntimeException();
        } else {
          L0: {
            var2 = pf.a((byte) 65, kn.b((byte) -49).field_p);
            if (-3 == var2) {
              wm.a(param0, false, 12);
              break L0;
            } else {
              break L0;
            }
          }
          if (-1 != var2) {
            return;
          } else {
            L1: {
              qd.a(20830, 3 - -cf.field_w);
              nm.field_b = kn.b((byte) -49);
              if (!pd.a(nm.field_b, true)) {
                ca.field_r = 0;
                on.field_r = t.field_l;
                fl.field_j = false;
                qn.field_k = false;
                bl.field_r = null;
                sk.field_i = -1;
                break L1;
              } else {
                bl.field_r = new sg(nm.field_b, 0, false, false, t.field_l, -1);
                break L1;
              }
            }
            L2: {
              kk.field_j = true;
              wm.a(param0, false, 10);
              ((ti) (Object) l.field_a[10]).field_p = 480;
              if (param1 < -72) {
                break L2;
              } else {
                field_k = null;
                break L2;
              }
            }
            return;
          }
        }
    }

    public static void b(int param0) {
        int var1 = -26 / ((param0 - 53) / 48);
        field_k = null;
        field_c = null;
        field_a = null;
        field_g = null;
        field_n = null;
    }

    ij(boolean param0) {
        ((ij) this).field_j = kf.field_H;
        ((ij) this).field_f = fc.field_c;
        ((ij) this).field_h = ch.field_m;
        ((ij) this).field_i = kl.field_u;
        ((ij) this).field_e = vn.field_f;
        ((ij) this).field_o = fi.field_kb;
        ((ij) this).field_d = pj.field_o;
        if (param0) {
            ((ij) this).field_b = lm.field_d;
        } else {
            ((ij) this).field_b = null;
        }
        ((ij) this).field_m = jc.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Two kills remaining.";
        field_c = new int[][]{new int[1], new int[1], new int[1], new int[1], new int[4]};
        field_a = "pts";
    }
}
