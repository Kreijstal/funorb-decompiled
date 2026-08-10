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
        int stackIn_3_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              tk.field_n = tk.field_n + 65536;
              L1: while (true) {
                if (tb.a(og.field_a, 723204176, tk.field_n) < 65536) {
                  L2: {
                    var2_int = -1;
                    if (null == dm.field_b) {
                      if (null == il.field_e) {
                        break L2;
                      } else {
                        var2_int = il.field_e.length;
                        break L2;
                      }
                    } else {
                      var2_int = dm.field_b.length;
                      break L2;
                    }
                  }
                  L3: {
                    if (var2_int == -1) {
                      break L3;
                    } else {
                      L4: {
                        if (h.field_A < og.field_o) {
                          L5: {
                            h.field_A = h.field_A + 1;
                            if (h.field_A <= og.field_b) {
                              break L5;
                            } else {
                              L6: {
                                if (null == dm.field_b) {
                                  break L6;
                                } else {
                                  if (dm.field_b[kb.field_m] == null) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              h.field_A = h.field_A - 1;
                              break L4;
                            }
                          }
                          if (og.field_o > h.field_A) {
                            break L4;
                          } else {
                            if (null == dm.field_b[(1 + kb.field_m) % var2_int]) {
                              h.field_A = h.field_A - 1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      L7: {
                        if (h.field_A < og.field_o) {
                          break L7;
                        } else {
                          L8: {
                            lj.field_u = kb.field_m;
                            if (!bh.field_b) {
                              kb.field_m = kb.field_m - 1;
                              if (kb.field_m >= 0) {
                                break L8;
                              } else {
                                kb.field_m = kb.field_m + var2_int;
                                break L8;
                              }
                            } else {
                              kb.field_m = kb.field_m + 1;
                              if (kb.field_m < var2_int) {
                                break L8;
                              } else {
                                kb.field_m = kb.field_m - var2_int;
                                break L8;
                              }
                            }
                          }
                          h.field_A = h.field_A - og.field_o;
                          break L7;
                        }
                      }
                      if (og.field_b >= h.field_A) {
                        break L3;
                      } else {
                        bh.field_b = true;
                        break L3;
                      }
                    }
                  }
                  L9: {
                    if (null != fm.field_b) {
                      L10: {
                        var3 = 357 + -(fm.field_b.field_t / 2);
                        var4 = 0;
                        if (gi.field_e == 0) {
                          break L10;
                        } else {
                          if (bg.field_c <= var3) {
                            break L10;
                          } else {
                            if (bg.field_c < fm.field_b.field_k + var3) {
                              L11: {
                                if (269 + -fm.field_b.field_o >= ig.field_fb) {
                                  break L11;
                                } else {
                                  if (-270 >= (ig.field_fb ^ -1)) {
                                    break L11;
                                  } else {
                                    h.field_A = og.field_o;
                                    bh.field_b = false;
                                    var4 = 1;
                                    break L11;
                                  }
                                }
                              }
                              if (ig.field_fb <= 586) {
                                break L10;
                              } else {
                                if (fm.field_b.field_o + 586 <= ig.field_fb) {
                                  break L10;
                                } else {
                                  h.field_A = og.field_o;
                                  bh.field_b = true;
                                  var4 = 1;
                                  break L10;
                                }
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L9;
                      } else {
                        if (h.field_A <= og.field_b) {
                          break L9;
                        } else {
                          if (vl.field_d <= var3) {
                            break L9;
                          } else {
                            if (fm.field_b.field_k + var3 <= vl.field_d) {
                              break L9;
                            } else {
                              L12: {
                                if (ua.field_a <= 269 + -fm.field_b.field_o) {
                                  break L12;
                                } else {
                                  if ((ua.field_a ^ -1) > -270) {
                                    h.field_A = og.field_b;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if ((ua.field_a ^ -1) >= -587) {
                                break L9;
                              } else {
                                if (fm.field_b.field_o + 586 <= ua.field_a) {
                                  break L9;
                                } else {
                                  h.field_A = og.field_b;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  L13: {
                    if (!param0) {
                      break L13;
                    } else {
                      L14: {
                        wj.field_k.a(ka.a(24316, ig.field_fb, bg.field_c), -1, ka.a(24316, ua.field_a, vl.field_d));
                        if (wj.field_k.a((byte) -1)) {
                          if (-1 != (wj.field_k.field_h ^ -1)) {
                            if (wj.field_k.field_h == 1) {
                              stackIn_64_0 = 2;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L14;
                            }
                          } else {
                            stackIn_60_0 = 3;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          break L14;
                        }
                      }
                      L15: while (true) {
                        if (!nf.e(32722)) {
                          break L13;
                        } else {
                          L16: {
                            wj.field_k.b(27163, 0);
                            if (wj.field_k.a((byte) -1)) {
                              if (-1 == (wj.field_k.field_h ^ -1)) {
                                stackIn_71_0 = 3;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if ((wj.field_k.field_h ^ -1) == -2) {
                                  stackIn_75_0 = 1;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  break L16;
                                }
                              }
                            } else {
                              break L16;
                            }
                          }
                          if (13 == ob.field_K) {
                            stackIn_79_0 = 1;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                  stackIn_81_0 = 0;
                  decompiledRegionSelector0 = 6;
                  break L0;
                } else {
                  le.field_c = le.field_c + 1;
                  tk.field_n = tk.field_n - og.field_a;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -2;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "wd.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_60_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_64_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_71_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_75_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_79_0;
                  } else {
                    return stackIn_81_0;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0) {
        this.field_O = false;
        if (param0 > -41) {
            this.field_F = 88;
        }
    }

    final static ea a(int param0, byte param1, int param2, int param3, be param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ea var7 = null;
        be var8 = null;
        java.awt.Frame var9 = null;
        ea stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = m.a(param5, param2, param3, -1, param0, param4);
              var6 = var9;
              if (param1 > 34) {
                break L1;
              } else {
                var8 = (be) null;
                wd.a(23, (byte) -51, 117, 29, (be) null, -42);
                break L1;
              }
            }
            if (var9 != null) {
              var7 = new ea();
              var7.field_c = var9;
              var7.field_c.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, 0, param5, param0);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackIn_6_0 = (ea) (var7);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = OrbDefence.field_D ? 1 : 0;
        for (var6 = 0; var6 < this.field_c; var6++) {
            this.field_R[var6] = (short)(this.field_R[var6] * param1 / param4);
            this.field_x[var6] = (short)(param2 * this.field_x[var6] / param4);
            this.field_Q[var6] = (short)(param3 * this.field_Q[var6] / param4);
        }
        this.a((byte) -77);
        if (param0 != 3940) {
            this.field_v = -12;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        for (var5 = 0; this.field_c > var5; var5++) {
            this.field_R[var5] = (short)(this.field_R[var5] + param3);
            this.field_x[var5] = (short)(this.field_x[var5] + param1);
            this.field_Q[var5] = (short)(this.field_Q[var5] + param2);
        }
        if (param0 != 7) {
            this.field_P = 39;
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
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = OrbDefence.field_D ? 1 : 0;
        if (!this.field_O) {
          L0: {
            this.field_O = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            if (param0 == 2) {
              break L0;
            } else {
              this.field_f = (int[]) null;
              break L0;
            }
          }
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (this.field_c <= var8) {
              this.field_v = var4;
              this.field_z = var7;
              this.field_F = var6;
              this.field_P = var2;
              this.field_J = var3;
              this.field_d = var5;
              return;
            } else {
              L2: {
                var9 = this.field_R[var8];
                var10 = this.field_x[var8];
                var11 = this.field_Q[var8];
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
        this.field_m = (byte) 0;
        this.field_O = false;
    }

    static {
        field_k = "Username: ";
        field_D = new int[]{2, 1, 2, 5, 3, 3, 3, 5, 10, 1, 1, 2, 2, 1, 2, 5, 10, 1, 2, 2, 2, 5, 2, 1};
        field_o = new int[9];
    }
}
