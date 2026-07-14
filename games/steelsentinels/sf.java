/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private mi field_h;
    private int field_s;
    static String field_v;
    static String field_p;
    private wk[] field_j;
    private int field_o;
    static String field_i;
    private wk[] field_k;
    static String field_l;
    private int field_u;
    private boolean field_q;
    gh field_a;
    private int field_n;
    private int field_g;
    static int field_d;
    private int field_m;
    static String field_b;
    static int field_t;
    private boolean field_w;
    static String field_f;
    private int field_e;
    private String field_c;
    private wk field_r;

    final void b(int param0) {
        if (param0 != -40) {
            ((sf) this).a((byte) 57);
        }
        int var2 = ak.a(((sf) this).field_r, ((sf) this).field_g, ((sf) this).field_c, ((sf) this).field_u, ((sf) this).field_o, param0 + 38, ((sf) this).field_e, 1071146, ((sf) this).field_q ? al.field_f : null, false);
        if (-1 >= (var2 ^ -1)) {
            if (!(((sf) this).field_w)) {
                ee.c(-2483, 97);
            }
            ((sf) this).field_w = true;
        } else {
            ((sf) this).field_w = false;
        }
        gh var3 = this.b((byte) 65);
        if (var3 != null) {
            if (!(((sf) this).field_j != null)) {
                ((sf) this).field_j = var3.field_I;
            }
            var3.field_I = 16 <= a.field_c % 32 ? ((sf) this).field_k : ((sf) this).field_j;
        }
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        bc.field_ub.a(param3, param0);
        if (param2) {
            var4 = 2 * (ik.field_e % bc.field_ub.field_A);
            if (var4 >= bc.field_ub.field_A) {
                var4 = bc.field_ub.field_A + (-var4 + bc.field_ub.field_A);
            }
            if (var4 < 10) {
                var4 = 10;
            } else {
                if (!(-40 + bc.field_ub.field_A >= var4)) {
                    var4 = -40 + bc.field_ub.field_A;
                }
            }
            tk.a(param0, 80, 30, 0, 0, -30456, bc.field_ub, param3, var4);
        }
        var4 = -105 % ((param1 - 74) / 35);
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = SteelSentinels.field_G;
            var3 = ((sf) this).field_s;
            if (4 == var3) {
              break L1;
            } else {
              if ((var3 ^ -1) == -7) {
                break L1;
              } else {
                if ((var3 ^ -1) != -12) {
                  if ((var3 ^ -1) != -16) {
                    break L0;
                  } else {
                    if (!df.field_K) {
                      break L0;
                    } else {
                      ((sf) this).field_q = true;
                      this.a(-6);
                      break L0;
                    }
                  }
                } else {
                  ((sf) this).field_q = true;
                  this.a(-67);
                  break L0;
                }
              }
            }
          }
          ((sf) this).field_q = true;
          this.a(-67);
          break L0;
        }
        L2: {
          if (param1 <= -110) {
            break L2;
          } else {
            this.a(77);
            break L2;
          }
        }
        return true;
    }

    private final gh b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = ((sf) this).field_s;
        if (3 == var2) {
          return vb.field_a[1];
        } else {
          if ((var2 ^ -1) == -6) {
            return vb.field_a[2];
          } else {
            if (10 != var2) {
              if (14 != var2) {
                L0: {
                  if (param0 == 65) {
                    break L0;
                  } else {
                    field_f = null;
                    break L0;
                  }
                }
                return ((sf) this).field_a;
              } else {
                return vb.field_a[0];
              }
            } else {
              return vb.field_a[3];
            }
          }
        }
    }

    sf(int param0, int param1, int param2, int param3, int param4, wk param5, boolean param6) {
        this(jm.field_u[param0], param1, param2, param3, param4, param5, param6);
        ((sf) this).field_s = param0;
    }

    final void a(byte param0) {
        kf.field_s = true;
        lg.field_l = true;
        if (param0 <= 57) {
            field_d = 94;
        }
        gh var4 = this.b((byte) 65);
        gh var5 = var4;
        if (var5 != null) {
            if (null != ((sf) this).field_j) {
                var5.field_I = ((sf) this).field_j;
            }
        }
        ((sf) this).field_j = null;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            field_d = 20;
        }
        field_l = null;
        field_b = null;
        field_p = null;
        field_i = null;
        field_v = null;
    }

    final boolean c(int param0) {
        kf.field_s = true;
        lg.field_l = true;
        if (param0 <= 9) {
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2) {
        mg.field_kc = param1;
        int var3 = 78 % ((param0 - -41) / 56);
        kb.field_a = param2;
    }

    final static void a(int param0, int param1, int param2, wk param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        param1 = param1 & 255;
        param2 = param2 & 255;
        var6 = param3.field_z;
        var7 = param4 * var6;
        var10 = param4;
        L0: while (true) {
          if (var10 >= param0) {
            var11 = -52 % ((35 - param5) / 37);
            return;
          } else {
            var8 = (param2 * (param0 + -var10) + (-param4 + var10) * param1) / (-param4 + param0);
            var8 = var8 * 65793;
            var9 = 0;
            L1: while (true) {
              if (var6 <= var9) {
                var7 = var7 + var6;
                var10++;
                continue L0;
              } else {
                if (0 != param3.field_E[var7 + var9]) {
                  param3.field_E[var9 + var7] = var8;
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void a(int param0) {
        ((sf) this).field_e = 2 * ((sf) this).field_n;
        if (((sf) this).field_r != null) {
            ((sf) this).field_e = ((sf) this).field_e + (2 + ((sf) this).field_r.field_F);
        }
        if (param0 >= -2) {
            field_b = null;
        }
        if (((sf) this).field_c != null) {
            ((sf) this).field_e = ((sf) this).field_e + ((sf) this).field_h.a(((sf) this).field_c, ((sf) this).field_u + -(2 * ((sf) this).field_m), 0);
        }
        if (!(!((sf) this).field_q)) {
            ((sf) this).field_e = ((sf) this).field_e + 40;
        }
    }

    final static dm a(String param0, int param1) {
        if (param1 != 16) {
            sf.a(-116, (byte) 30, true, -66);
        }
        return new dm(param0);
    }

    final boolean a(rm param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kg var7 = null;
        kg var8 = null;
        gh var9 = null;
        int stackIn_23_0 = 0;
        int stackIn_50_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        L0: {
          var6 = SteelSentinels.field_G;
          lg.field_l = true;
          kf.field_s = true;
          if (!((sf) this).field_q) {
            break L0;
          } else {
            if (((sf) this).field_w) {
              ee.c(-2483, 95);
              rc.a(false);
              break L0;
            } else {
              break L0;
            }
          }
        }
        if ((param0.field_e ^ -1) == -4) {
          ((sf) this).a((byte) 69);
          dc.field_g = -1;
          return true;
        } else {
          L1: {
            if (param1 == 23123) {
              break L1;
            } else {
              boolean discarded$1 = ((sf) this).a(115, -6);
              break L1;
            }
          }
          L2: {
            var7 = bi.field_f;
            if (var7 == null) {
              break L2;
            } else {
              if (null == var7.field_Sb) {
                break L2;
              } else {
                if (!var7.field_Sb.field_kb) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
          }
          L3: {
            var8 = vd.field_a;
            if (var8 == null) {
              break L3;
            } else {
              if (var8.field_Sb == null) {
                break L3;
              } else {
                if (!var8.field_Sb.field_kb) {
                  break L3;
                } else {
                  return true;
                }
              }
            }
          }
          L4: {
            var9 = this.b((byte) 65);
            if (var9 != null) {
              if (var9.field_kb) {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L4;
              } else {
                stackOut_20_0 = 0;
                stackIn_23_0 = stackOut_20_0;
                break L4;
              }
            } else {
              stackOut_18_0 = 0;
              stackIn_23_0 = stackOut_18_0;
              break L4;
            }
          }
          L5: {
            var4 = stackIn_23_0;
            var5 = ((sf) this).field_s;
            if (-2 == (var5 ^ -1)) {
              if (var4 != 0) {
                rc.a(false);
                return true;
              } else {
                break L5;
              }
            } else {
              if ((var5 ^ -1) != -4) {
                if (5 != var5) {
                  if (var5 != -8) {
                    if (8 == var5) {
                      L6: {
                        if (null != lj.field_h) {
                          stackOut_49_0 = 1;
                          stackIn_50_0 = stackOut_49_0;
                          break L6;
                        } else {
                          stackOut_48_0 = 0;
                          stackIn_50_0 = stackOut_48_0;
                          break L6;
                        }
                      }
                      return stackIn_50_0 != 0;
                    } else {
                      if (-11 == var5) {
                        if (var4 == 0) {
                          break L5;
                        } else {
                          rc.a(false);
                          return true;
                        }
                      } else {
                        if ((var5 ^ -1) == -13) {
                          if (df.field_K) {
                            rc.a(false);
                            return true;
                          } else {
                            break L5;
                          }
                        } else {
                          if (14 == var5) {
                            if (var4 != 0) {
                              rc.a(false);
                              return true;
                            } else {
                              break L5;
                            }
                          } else {
                            if (var5 == 16) {
                              if (448 <= pi.field_c) {
                                return true;
                              } else {
                                break L5;
                              }
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (var4 != 0) {
                      rc.a(false);
                      return true;
                    } else {
                      break L5;
                    }
                  }
                } else {
                  if (var4 != 0) {
                    rc.a(false);
                    return true;
                  } else {
                    break L5;
                  }
                }
              } else {
                if (var4 == 0) {
                  break L5;
                } else {
                  rc.a(false);
                  return true;
                }
              }
            }
          }
          return false;
        }
    }

    private sf(String param0, int param1, int param2, int param3, int param4, wk param5, boolean param6) {
        ((sf) this).field_h = (mi) (Object) ff.field_lb;
        ((sf) this).field_m = 8;
        ((sf) this).field_k = bl.field_d;
        ((sf) this).field_n = 5;
        ((sf) this).field_s = -1;
        ((sf) this).field_g = param2;
        ((sf) this).field_o = param1;
        ((sf) this).field_q = param6 ? true : false;
        ((sf) this).field_c = param0;
        ((sf) this).field_r = param5;
        ((sf) this).field_u = param3;
        ((sf) this).field_e = param4;
        if (((sf) this).field_e == 0) {
            this.a(-120);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "to keep fullscreen or";
        field_p = "Achieved";
        field_d = 0;
        field_v = "EMP";
        field_b = "Advertising websites";
        field_l = "Rating";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
