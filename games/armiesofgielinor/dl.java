/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static int field_i;
    static String field_d;
    static int[][] field_e;
    private int field_a;
    private boolean field_b;
    private int field_j;
    int field_h;
    private int field_g;
    int field_k;
    static int[] field_c;
    private int field_f;

    final void b(byte param0) {
        ((dl) this).field_j = 0;
        ((dl) this).field_a = 0;
        if (-1 == (((dl) this).field_f ^ -1)) {
            if (!((rs.field_q ^ -1) != -99)) {
                if (!((((dl) this).field_h ^ -1) < -1)) {
                    ((dl) this).field_h = ((dl) this).field_k;
                }
                ((dl) this).field_h = ((dl) this).field_h - 1;
                ((dl) this).field_b = false;
            }
        }
        if (param0 != -120) {
            return;
        }
        if (!(0 != ((dl) this).field_f)) {
            ((dl) this).field_j = rs.field_q;
        }
        if (((dl) this).field_f == 0) {
            if (!(rs.field_q != 99)) {
                ((dl) this).field_h = ((dl) this).field_h + 1;
                if (((dl) this).field_h >= ((dl) this).field_k) {
                    ((dl) this).field_h = 0;
                }
                ((dl) this).field_b = false;
            }
        }
    }

    final boolean b(int param0) {
        if (param0 != 96) {
            return true;
        }
        return -104 == (((dl) this).field_j ^ -1) ? true : false;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return ((dl) this).field_f != 0 ? true : false;
    }

    final boolean d(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 >= 35) {
            break L0;
          } else {
            ((dl) this).field_a = -104;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != ((dl) this).field_a) {
              break L2;
            } else {
              if ((((dl) this).field_j ^ -1) == -85) {
                break L2;
              } else {
                if ((((dl) this).field_j ^ -1) != -84) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public static void c(byte param0) {
        field_e = null;
        field_c = null;
        int var1 = -45 / ((param0 - -26) / 46);
        field_d = null;
    }

    final void a(int param0, boolean param1) {
        if (!(((dl) this).field_f != 0)) {
            ((dl) this).field_b = false;
            ((dl) this).field_h = param0;
        }
        if (param1) {
            boolean discarded$0 = ((dl) this).b(15);
        }
    }

    final static void a(byte param0, boolean param1) {
        se.field_g.a(param1, true);
        if (param0 != 32) {
            field_c = null;
        }
    }

    final boolean e(int param0) {
        int var2 = -105 % ((param0 - -19) / 60);
        return -103 == (((dl) this).field_j ^ -1) ? true : false;
    }

    final void a(int param0, byte param1) {
        ((dl) this).field_j = 0;
        int var3 = 61 % ((param1 - 78) / 48);
        ((dl) this).field_a = 0;
        if (((dl) this).field_f == 0) {
            ((dl) this).field_j = rs.field_q;
        }
        if (0 == ((dl) this).field_f) {
            if (!(rs.field_q != 96)) {
                if (!(-1 > (((dl) this).field_h ^ -1))) {
                    ((dl) this).field_h = ((dl) this).field_k;
                }
                ((dl) this).field_h = ((dl) this).field_h - 1;
                ((dl) this).field_b = false;
            }
        }
        if (0 == ((dl) this).field_f) {
            if (!((rs.field_q ^ -1) != -98)) {
                ((dl) this).field_h = ((dl) this).field_h + 1;
                ((dl) this).field_b = false;
                if (!(((dl) this).field_h < ((dl) this).field_k)) {
                    ((dl) this).field_h = 0;
                }
            }
        }
        if (((dl) this).field_f == -1) {
            if (rs.field_q != 98) {
                // if_icmpne L198
            }
            ((dl) this).field_b = false;
            if (!(-1 >= (((dl) this).field_h ^ -1))) {
                ((dl) this).field_h = param0;
            }
        }
    }

    final boolean a(int param0) {
        if (param0 != -98) {
            ((dl) this).c(6);
        }
        return (((dl) this).field_j ^ -1) == -98 ? true : false;
    }

    final static boolean d(int param0) {
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param0 == 95) {
            break L0;
          } else {
            dl.f(46);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!as.field_B) {
                break L3;
              } else {
                if (!im.field_w) {
                  break L3;
                } else {
                  if (!sh.field_h) {
                    break L3;
                  } else {
                    if (!ve.field_b) {
                      break L3;
                    } else {
                      if (mv.field_b) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            if (!nw.g(105)) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_10_0 = 1;
          stackIn_12_0 = stackOut_10_0;
          break L1;
        }
        return stackIn_12_0 != 0;
    }

    final void c(int param0) {
        ((dl) this).field_a = 0;
        ((dl) this).field_j = 0;
        if (param0 == ((dl) this).field_f) {
            ((dl) this).field_j = rs.field_q;
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -48) {
            ((dl) this).field_f = 73;
        }
        return 96 == ((dl) this).field_j ? true : false;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        je var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        mo var9 = null;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (mj.field_c <= sj.field_d) {
            break L0;
          } else {
            sj.field_d = sj.field_d + 1;
            break L0;
          }
        }
        L1: {
          if (gb.field_y != so.field_b.field_g) {
            sh.field_l = sh.field_l + (-gb.field_y + so.field_b.field_g);
            gb.field_y = so.field_b.field_g;
            break L1;
          } else {
            break L1;
          }
        }
        if (sj.field_d <= 0) {
          return;
        } else {
          L2: {
            vi.a(-68);
            ag.field_I.a(true, param3);
            if (aw.field_i == null) {
              break L2;
            } else {
              if (bb.field_a) {
                boolean discarded$1 = aw.field_i.a(param3, -6226, ag.field_I.field_V, ag.field_I.field_D);
                break L2;
              } else {
                aw.field_i = null;
                break L2;
              }
            }
          }
          var4 = param2;
          L3: while (true) {
            if ((var4 ^ -1) <= -6) {
              L4: {
                if (mc.field_f.field_yb != 0) {
                  ik.field_b = new i(mc.field_f.field_V, mc.field_f.field_D, mc.field_f.field_gb, mc.field_f.field_ob, param0, jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k, (String) null, 0L);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var9 = wm.a(jn.field_d, mi.field_l, (byte) 127, param1);
                if (var9 != null) {
                  pg.a(0, var9);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var8 = wd.a(false);
                if (var8 != null) {
                  ad.field_I = var8;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              var5 = gt.field_b[var4];
              if (var5 != null) {
                L7: {
                  if (0 != var5.field_yb) {
                    mq.a(var5, var4, false);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var6 = kp.a(var4, -119);
                we.field_g[var4].field_cb = dh.field_n[var6];
                bp.field_j[var4].field_X = co.field_k[var6];
                var4++;
                continue L3;
              } else {
                var4++;
                continue L3;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= ((dl) this).field_k) {
          throw new IllegalArgumentException();
        } else {
          if (param1 < ((dl) this).field_k) {
            L0: {
              ((dl) this).field_a = 0;
              ((dl) this).field_j = 0;
              if (param0 != tr.field_A) {
                ((dl) this).field_f = tr.field_A;
                ((dl) this).field_a = tr.field_A;
                ((dl) this).field_b = true;
                ((dl) this).field_h = param1;
                ((dl) this).field_g = eu.field_a;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (((dl) this).field_f != 0) {
                if (0 != ro.field_ub) {
                  L2: {
                    if (-1 <= (((dl) this).field_g ^ -1)) {
                      ((dl) this).field_g = oj.field_k;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((dl) this).field_g = ((dl) this).field_g - 1;
                  if (tr.field_A != -1) {
                    break L1;
                  } else {
                    if (-1 != ro.field_ub) {
                      break L1;
                    } else {
                      ((dl) this).field_f = 0;
                      break L1;
                    }
                  }
                } else {
                  if (tr.field_A != -1) {
                    break L1;
                  } else {
                    if (-1 != ro.field_ub) {
                      break L1;
                    } else {
                      ((dl) this).field_f = 0;
                      break L1;
                    }
                  }
                }
              } else {
                if (tr.field_A != -1) {
                  break L1;
                } else {
                  if (-1 != ro.field_ub) {
                    ((dl) this).field_g = ((dl) this).field_g - 1;
                    if (tr.field_A != -1) {
                      break L1;
                    } else {
                      if (-1 != ro.field_ub) {
                        break L1;
                      } else {
                        ((dl) this).field_f = 0;
                        break L1;
                      }
                    }
                  } else {
                    ((dl) this).field_g = ((dl) this).field_g - 1;
                    if (tr.field_A != -1) {
                      break L1;
                    } else {
                      if (-1 != ro.field_ub) {
                        break L1;
                      } else {
                        ((dl) this).field_f = 0;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L3: {
              if (-1 != (((dl) this).field_f ^ -1)) {
                break L3;
              } else {
                L4: {
                  if (((dl) this).field_b) {
                    break L4;
                  } else {
                    if (!lk.field_f) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (0 > param2) {
                  if (!((dl) this).field_b) {
                    break L3;
                  } else {
                    ((dl) this).field_h = -1;
                    break L3;
                  }
                } else {
                  L5: {
                    if (param2 == ((dl) this).field_h) {
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((dl) this).field_b = true;
                  ((dl) this).field_h = param2;
                  break L3;
                }
              }
            }
            return;
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final static void f(int param0) {
        st.a(8, eq.field_h, jm.field_b, cb.field_c, hr.field_m);
        if (param0 != 0) {
            field_i = 123;
        }
    }

    dl(int param0) {
        ((dl) this).field_b = false;
        ((dl) this).field_h = 0;
        ((dl) this).field_k = param0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        ((dl) this).field_f = param3;
        ((dl) this).field_b = param1 ? true : false;
        if (((dl) this).field_b) {
            ((dl) this).field_h = param2;
        } else {
            ((dl) this).field_h = param0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[][]{new int[5], new int[5], new int[5], new int[5], new int[5], new int[5], new int[5]};
        field_d = "LEVEL";
        field_c = new int[8192];
    }
}
