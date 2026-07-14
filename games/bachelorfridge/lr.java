/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends bw {
    int field_q;
    int[][] field_h;
    int field_f;
    private int field_n;
    int field_g;
    boolean field_i;
    private int[][][] field_p;
    wia[][] field_o;
    private int field_j;
    int field_m;
    private int field_l;
    static String[] field_k;

    final int[][] b(int param0, int param1) {
        if (param1 >= -1) {
            return null;
        }
        return ((lr) this).field_p[param0];
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, boolean param6, boolean param7, boolean param8, boolean param9) {
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          if (param6) {
            break L0;
          } else {
            L1: {
              if (kg.field_b != dg.field_i) {
                break L1;
              } else {
                if (kq.field_i == dg.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (dg.field_c != hga.field_U.field_f) {
              break L0;
            } else {
              if (dg.field_i != hga.field_U.field_b) {
                break L0;
              } else {
                if (pw.field_w != null) {
                  pv.a(false, true);
                  break L0;
                } else {
                  if (null == rv.field_n) {
                    kf.a((byte) -6);
                    break L0;
                  } else {
                    pv.a(true, true);
                    break L0;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (!param6) {
            ce.field_t = (-640 + kg.field_b) / 2;
            break L2;
          } else {
            ce.field_t = wq.field_n;
            break L2;
          }
        }
        L3: {
          nja.a(param6, (byte) 81);
          if (-1 <= (lfa.field_q ^ -1)) {
            break L3;
          } else {
            ada.a(param9, 0, param4, param6);
            break L3;
          }
        }
        L4: {
          cw.field_yb.field_L = rea.field_g.field_L;
          cw.field_yb.field_N = param5;
          if (0 < ld.field_p) {
            sr.a(true, param6, param4, param9);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((dja.field_m ^ -1) < -1) {
            mh.a(param0, param6, param9, param4, (byte) -51);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (!w.field_e) {
              break L7;
            } else {
              if (pw.field_w.field_Pb <= pw.field_w.field_Rb) {
                qba.field_m.field_wb.field_Z = oia.field_i;
                tv.field_o.field_u = false;
                nn.a((byte) -126, qba.field_m.field_vb);
                break L6;
              } else {
                break L7;
              }
            }
          }
          qba.field_m.field_wb.field_Z = null;
          tv.field_o.field_u = true;
          vt.a(qba.field_m, param4, 0, param8, param1);
          break L6;
        }
        sma.a(param7, param8, -6, param1, param2, param4, param3);
        vt.a(ak.field_q, param4, 0, param8, param1);
        qf.field_v = qf.field_v + 1;
    }

    final static void a(int param0, int param1, int param2, eaa param3, int param4, byte param5) {
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        param4 += 8;
        param1 -= 32;
        lh var6 = (lh) (Object) param3.b((byte) 90);
        if (param5 != -4) {
            Object var10 = null;
            lr.a(44, -29, -91, (eaa) null, 24, -68);
        }
        int var7 = 0;
        while (var6 != null) {
            var8 = (8357 * var6.field_i + var6.field_h * 326565 & 63) + (var6.field_o >> -207991455);
            if (var8 > 256) {
                var8 = 256;
            }
            var7++;
            ed.field_f[3 + (var7 & 3)].a(param4 + (param2 * var6.field_i >> -889186192) - 32, param1 + (-(param2 * var6.field_q >> 2102823600) - 34), var6.field_o << 566248001);
            var6 = (lh) (Object) param3.c(0);
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (!((lr) this).field_i) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((lr) this).field_m) {
              var3 = param0;
              L1: while (true) {
                if (var3 >= ((lr) this).field_l) {
                  return true;
                } else {
                  var4 = 0;
                  L2: while (true) {
                    if (((lr) this).field_n <= var4) {
                      var3++;
                      continue L1;
                    } else {
                      L3: {
                        if (-1 == ((lr) this).field_p[var3][var4][0]) {
                          break L3;
                        } else {
                          if (-1 != ((lr) this).field_p[var3][var4][1]) {
                            var4++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
              }
            } else {
              if ((param1 ^ -1) == -3) {
                if (((lr) this).field_h[var3][0] == -1) {
                  return false;
                } else {
                  if (-1 == ((lr) this).field_h[var3][1]) {
                    return false;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, eaa param3, int param4, int param5) {
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        lh var6 = (lh) (Object) param3.b((byte) 90);
        if (param4 != 265949093) {
            field_k = null;
        }
        int var7 = 0;
        while (var6 != null) {
            var8 = (var6.field_o >> 842776385) - -(630 & 8357 * var6.field_i + var6.field_h * 326565);
            if (-257 > (var8 ^ -1)) {
                var8 = 256;
            }
            lw.field_b[1 + (var7 & 1)].a(-32 + param1 + (var6.field_i >> 870558980), -32 + (-2 + (var6.field_q >> 78991812) + param5) + -(var6.field_h >> 265949093), 256 - ((var6.field_o << -1516933694) + (var6.field_o << -237713183)));
            var6 = (lh) (Object) param3.c(0);
            var7++;
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 34) {
            lr.a(54);
        }
    }

    lr(lu param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (param0.b(16711935) != 0) {
            param0.field_g = param0.field_g - 1;
            ((lr) this).field_j = 2;
            break L0;
          } else {
            int discarded$2 = param0.b(16711935);
            ((lr) this).field_j = param0.b(16711935);
            break L0;
          }
        }
        ((lr) this).field_f = param0.b(16711935);
        ((lr) this).field_q = param0.b(16711935);
        ((lr) this).field_o = new wia[((lr) this).field_f][((lr) this).field_q];
        var2 = 0;
        L1: while (true) {
          if (var2 >= ((lr) this).field_f) {
            ((lr) this).field_l = param0.b(16711935);
            ((lr) this).field_n = param0.b(16711935);
            ((lr) this).field_m = param0.b(16711935);
            int discarded$3 = param0.b(16711935);
            ((lr) this).field_h = new int[((lr) this).field_m][2];
            var2 = 0;
            L2: while (true) {
              if (((lr) this).field_m <= var2) {
                ((lr) this).field_p = new int[((lr) this).field_l][((lr) this).field_n][2];
                var2 = 0;
                L3: while (true) {
                  if (((lr) this).field_l <= var2) {
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (((lr) this).field_n <= var3) {
                        var2++;
                        continue L3;
                      } else {
                        ((lr) this).field_p[var2][var3] = new int[2];
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                ((lr) this).field_h[var2] = new int[2];
                var2++;
                continue L2;
              }
            }
          } else {
            var3 = 0;
            L5: while (true) {
              if (((lr) this).field_q <= var3) {
                var2++;
                continue L1;
              } else {
                ((lr) this).field_o[var2][var3] = new wia(param0.b(16711935));
                ((lr) this).field_o[var2][var3].field_a = param0.b(true);
                var3++;
                continue L5;
              }
            }
          }
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        if (((lr) this).field_i) {
            if (!(!param0)) {
                return true;
            }
        }
        if (param0) {
            return false;
        }
        if (!(((lr) this).field_l >= param1)) {
            return false;
        }
        if (param4 != -2581) {
            Object var7 = null;
            lr.a(-128, -48, 46, (eaa) null, -89, (byte) 122);
        }
        if (param3 > ((lr) this).field_n) {
            return false;
        }
        if (param2 == ((lr) this).field_j) {
            return true;
        }
        return false;
    }

    static {
    }
}
