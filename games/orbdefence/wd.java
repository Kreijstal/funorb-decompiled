/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int[] field_b;
    int[] field_f;
    short field_u;
    int[] field_I;
    int field_z;
    int field_v;
    byte[] field_t;
    static String field_k;
    int[] field_L;
    short[] field_Q;
    short field_c;
    short[] field_h;
    short[] field_x;
    short[] field_s;
    short[] field_H;
    int[] field_g;
    short[] field_n;
    short[] field_e;
    int[] field_A;
    static int[] field_D;
    int[] field_r;
    short[] field_l;
    short field_w;
    static String field_p;
    static hj[] field_C;
    short[] field_y;
    int field_F;
    short[] field_N;
    int field_d;
    short[] field_M;
    int field_J;
    short[] field_a;
    short[] field_B;
    short[] field_q;
    short[] field_G;
    int[] field_E;
    short[] field_i;
    short[] field_R;
    short[] field_K;
    int[] field_j;
    static int[] field_o;
    byte field_m;
    private boolean field_O;
    int field_P;

    final static int a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (!param1) {
          tk.field_n = tk.field_n + 65536;
          L0: while (true) {
            if (tb.a(og.field_a, 723204176, tk.field_n) < 65536) {
              L1: {
                var2 = -1;
                if (null == dm.field_b) {
                  if (null == il.field_e) {
                    break L1;
                  } else {
                    var2 = il.field_e.length;
                    break L1;
                  }
                } else {
                  var2 = dm.field_b.length;
                  break L1;
                }
              }
              L2: {
                if (var2 == -1) {
                  break L2;
                } else {
                  L3: {
                    if (h.field_A < og.field_o) {
                      L4: {
                        h.field_A = h.field_A + 1;
                        if (h.field_A <= og.field_b) {
                          break L4;
                        } else {
                          if (null != dm.field_b) {
                            if (dm.field_b[kb.field_m] != null) {
                              break L4;
                            } else {
                              h.field_A = h.field_A - 1;
                              break L3;
                            }
                          } else {
                            h.field_A = h.field_A - 1;
                            break L3;
                          }
                        }
                      }
                      if (og.field_o > h.field_A) {
                        break L3;
                      } else {
                        if (null == dm.field_b[(1 + kb.field_m) % var2]) {
                          h.field_A = h.field_A - 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (h.field_A < og.field_o) {
                      break L5;
                    } else {
                      L6: {
                        lj.field_u = kb.field_m;
                        if (!bh.field_b) {
                          kb.field_m = kb.field_m - 1;
                          if (kb.field_m >= 0) {
                            break L6;
                          } else {
                            kb.field_m = kb.field_m + var2;
                            break L6;
                          }
                        } else {
                          kb.field_m = kb.field_m + 1;
                          if (kb.field_m < var2) {
                            break L6;
                          } else {
                            kb.field_m = kb.field_m - var2;
                            break L6;
                          }
                        }
                      }
                      h.field_A = h.field_A - og.field_o;
                      break L5;
                    }
                  }
                  if (og.field_b >= h.field_A) {
                    break L2;
                  } else {
                    bh.field_b = true;
                    break L2;
                  }
                }
              }
              L7: {
                if (null != fm.field_b) {
                  L8: {
                    var3 = 357 + -(fm.field_b.field_t / 2);
                    var4 = 0;
                    if (gi.field_e == 0) {
                      break L8;
                    } else {
                      if (bg.field_c <= var3) {
                        break L8;
                      } else {
                        if (bg.field_c < fm.field_b.field_k + var3) {
                          L9: {
                            if (269 + -fm.field_b.field_o >= ig.field_fb) {
                              break L9;
                            } else {
                              if (-270 >= (ig.field_fb ^ -1)) {
                                break L9;
                              } else {
                                h.field_A = og.field_o;
                                bh.field_b = false;
                                var4 = 1;
                                break L9;
                              }
                            }
                          }
                          if (ig.field_fb <= 586) {
                            break L8;
                          } else {
                            if (fm.field_b.field_o + 586 <= ig.field_fb) {
                              break L8;
                            } else {
                              h.field_A = og.field_o;
                              bh.field_b = true;
                              var4 = 1;
                              break L8;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L7;
                  } else {
                    if (h.field_A <= og.field_b) {
                      break L7;
                    } else {
                      if (vl.field_d <= var3) {
                        break L7;
                      } else {
                        if (fm.field_b.field_k + var3 <= vl.field_d) {
                          break L7;
                        } else {
                          if (ua.field_a <= 269 + -fm.field_b.field_o) {
                            if ((ua.field_a ^ -1) >= -587) {
                              break L7;
                            } else {
                              if (fm.field_b.field_o + 586 <= ua.field_a) {
                                break L7;
                              } else {
                                h.field_A = og.field_b;
                                break L7;
                              }
                            }
                          } else {
                            if ((ua.field_a ^ -1) >= -587) {
                              break L7;
                            } else {
                              if (fm.field_b.field_o + 586 <= ua.field_a) {
                                break L7;
                              } else {
                                h.field_A = og.field_b;
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              L10: {
                if (!param0) {
                  break L10;
                } else {
                  L11: {
                    wj.field_k.a(ka.a(24316, ig.field_fb, bg.field_c), -1, ka.a(24316, ua.field_a, vl.field_d));
                    if (wj.field_k.a((byte) -1)) {
                      if (-1 != (wj.field_k.field_h ^ -1)) {
                        if (wj.field_k.field_h == 1) {
                          return 2;
                        } else {
                          break L11;
                        }
                      } else {
                        return 3;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: while (true) {
                    if (!nf.e(32722)) {
                      break L10;
                    } else {
                      L13: {
                        wj.field_k.b(27163, 0);
                        if (wj.field_k.a((byte) -1)) {
                          if (-1 == (wj.field_k.field_h ^ -1)) {
                            return 3;
                          } else {
                            if ((wj.field_k.field_h ^ -1) == -2) {
                              return 1;
                            } else {
                              break L13;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                      if (13 == ob.field_K) {
                        return 1;
                      } else {
                        continue L12;
                      }
                    }
                  }
                }
              }
              return 0;
            } else {
              le.field_c = le.field_c + 1;
              tk.field_n = tk.field_n - og.field_a;
              continue L0;
            }
          }
        } else {
          return -2;
        }
    }

    private final void a(byte param0) {
        ((wd) this).field_O = false;
        if (param0 > -41) {
            ((wd) this).field_F = 88;
        }
    }

    final static ea a(int param0, byte param1, int param2, int param3, be param4, int param5) {
        java.awt.Frame var9 = m.a(param5, param2, param3, -1, param0, param4);
        java.awt.Frame var6 = var9;
        if (param1 <= 34) {
            Object var8 = null;
            ea discarded$0 = wd.a(23, (byte) -51, 117, 29, (be) null, -42);
        }
        if (var9 == null) {
            return null;
        }
        ea var7 = new ea();
        var7.field_c = var9;
        java.awt.Component discarded$1 = var7.field_c.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param5, param0);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = OrbDefence.field_D ? 1 : 0;
        for (var6 = 0; var6 < ((wd) this).field_c; var6++) {
            ((wd) this).field_R[var6] = (short)(((wd) this).field_R[var6] * param1 / param4);
            ((wd) this).field_x[var6] = (short)(param2 * ((wd) this).field_x[var6] / param4);
            ((wd) this).field_Q[var6] = (short)(param3 * ((wd) this).field_Q[var6] / param4);
        }
        this.a((byte) -77);
        if (param0 != 3940) {
            ((wd) this).field_v = -12;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        for (var5 = 0; ((wd) this).field_c > var5; var5++) {
            ((wd) this).field_R[var5] = (short)(((wd) this).field_R[var5] + param3);
            ((wd) this).field_x[var5] = (short)(((wd) this).field_x[var5] + param1);
            ((wd) this).field_Q[var5] = (short)(((wd) this).field_Q[var5] + param2);
        }
        if (param0 != 7) {
            ((wd) this).field_P = 39;
        }
        this.a((byte) -64);
    }

    public static void b(int param0) {
        if (param0 <= 63) {
            return;
        }
        field_k = null;
        field_D = null;
        field_C = null;
        field_o = null;
        field_p = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        if (!((wd) this).field_O) {
          L0: {
            ((wd) this).field_O = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            if (param0 == 2) {
              break L0;
            } else {
              ((wd) this).field_f = null;
              break L0;
            }
          }
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (((wd) this).field_c <= var8) {
              ((wd) this).field_v = var4;
              ((wd) this).field_z = var7;
              ((wd) this).field_F = var6;
              ((wd) this).field_P = var2;
              ((wd) this).field_J = var3;
              ((wd) this).field_d = var5;
              return;
            } else {
              L2: {
                var9 = ((wd) this).field_R[var8];
                var10 = ((wd) this).field_x[var8];
                var11 = ((wd) this).field_Q[var8];
                if (var5 < var9) {
                  var5 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var9 >= var2) {
                  break L3;
                } else {
                  var2 = var9;
                  break L3;
                }
              }
              L4: {
                if (var10 >= var3) {
                  break L4;
                } else {
                  var3 = var10;
                  break L4;
                }
              }
              L5: {
                if (var10 > var6) {
                  var6 = var10;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var11 <= var7) {
                  break L6;
                } else {
                  var7 = var11;
                  break L6;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    wd() {
        ((wd) this).field_m = (byte) 0;
        ((wd) this).field_O = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Username: ";
        field_D = new int[]{2, 1, 2, 5, 3, 3, 3, 5, 10, 1, 1, 2, 2, 1, 2, 5, 10, 1, 2, 2, 2, 5, 2, 1};
        field_o = new int[9];
    }
}
