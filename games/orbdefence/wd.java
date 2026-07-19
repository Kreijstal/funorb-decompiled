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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        boolean stackIn_71_0 = false;
        int stackIn_76_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_63_0 = 0;
        boolean stackOut_70_0 = false;
        int stackOut_75_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_2_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              tk.field_n = tk.field_n + 65536;
              L1: while (true) {
                L2: {
                  L3: {
                    if (tb.a(og.field_a, 723204176, tk.field_n) < 65536) {
                      break L3;
                    } else {
                      le.field_c = le.field_c + 1;
                      stackOut_6_0 = tk.field_n - og.field_a;
                      stackIn_10_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        tk.field_n = stackIn_7_0;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                }
                L4: {
                  L5: {
                    var2_int = stackIn_10_0;
                    if (null == dm.field_b) {
                      break L5;
                    } else {
                      var2_int = dm.field_b.length;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (null == il.field_e) {
                    break L4;
                  } else {
                    var2_int = il.field_e.length;
                    break L4;
                  }
                }
                L6: {
                  if (var2_int == -1) {
                    break L6;
                  } else {
                    L7: {
                      if (h.field_A < og.field_o) {
                        L8: {
                          L9: {
                            h.field_A = h.field_A + 1;
                            if (h.field_A <= og.field_b) {
                              break L9;
                            } else {
                              if (null == dm.field_b) {
                                break L8;
                              } else {
                                if (dm.field_b[kb.field_m] == null) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          if (og.field_o > h.field_A) {
                            break L7;
                          } else {
                            if (null == dm.field_b[(1 + kb.field_m) % var2_int]) {
                              h.field_A = h.field_A - 1;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        h.field_A = h.field_A - 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L10: {
                      if (h.field_A < og.field_o) {
                        break L10;
                      } else {
                        L11: {
                          L12: {
                            lj.field_u = kb.field_m;
                            if (!bh.field_b) {
                              break L12;
                            } else {
                              kb.field_m = kb.field_m + 1;
                              if (kb.field_m < var2_int) {
                                break L11;
                              } else {
                                kb.field_m = kb.field_m - var2_int;
                                if (var5 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          kb.field_m = kb.field_m - 1;
                          if (kb.field_m >= 0) {
                            break L11;
                          } else {
                            kb.field_m = kb.field_m + var2_int;
                            break L11;
                          }
                        }
                        h.field_A = h.field_A - og.field_o;
                        break L10;
                      }
                    }
                    if (og.field_b >= h.field_A) {
                      break L6;
                    } else {
                      bh.field_b = true;
                      break L6;
                    }
                  }
                }
                L13: {
                  if (null != fm.field_b) {
                    L14: {
                      var3 = 357 + -(fm.field_b.field_t / 2);
                      var4 = 0;
                      if (gi.field_e == 0) {
                        break L14;
                      } else {
                        if (bg.field_c <= var3) {
                          break L14;
                        } else {
                          if (bg.field_c < fm.field_b.field_k + var3) {
                            L15: {
                              if (269 + -fm.field_b.field_o >= ig.field_fb) {
                                break L15;
                              } else {
                                if (-270 >= (ig.field_fb ^ -1)) {
                                  break L15;
                                } else {
                                  h.field_A = og.field_o;
                                  bh.field_b = false;
                                  var4 = 1;
                                  break L15;
                                }
                              }
                            }
                            if (ig.field_fb <= 586) {
                              break L14;
                            } else {
                              if (fm.field_b.field_o + 586 <= ig.field_fb) {
                                break L14;
                              } else {
                                h.field_A = og.field_o;
                                bh.field_b = true;
                                var4 = 1;
                                break L14;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L13;
                    } else {
                      if (h.field_A <= og.field_b) {
                        break L13;
                      } else {
                        if (vl.field_d <= var3) {
                          break L13;
                        } else {
                          if (fm.field_b.field_k + var3 <= vl.field_d) {
                            break L13;
                          } else {
                            L16: {
                              if (ua.field_a <= 269 + -fm.field_b.field_o) {
                                break L16;
                              } else {
                                if ((ua.field_a ^ -1) > -270) {
                                  h.field_A = og.field_b;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            if ((ua.field_a ^ -1) >= -587) {
                              break L13;
                            } else {
                              if (fm.field_b.field_o + 586 <= ua.field_a) {
                                break L13;
                              } else {
                                h.field_A = og.field_b;
                                break L13;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L13;
                  }
                }
                L17: {
                  L18: {
                    if (!param0) {
                      break L18;
                    } else {
                      L19: {
                        wj.field_k.a(ka.a(24316, ig.field_fb, bg.field_c), -1, ka.a(24316, ua.field_a, vl.field_d));
                        if (wj.field_k.a((byte) -1)) {
                          if (-1 != (wj.field_k.field_h ^ -1)) {
                            if (wj.field_k.field_h == 1) {
                              stackOut_67_0 = 2;
                              stackIn_68_0 = stackOut_67_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L19;
                            }
                          } else {
                            stackOut_63_0 = 3;
                            stackIn_64_0 = stackOut_63_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          break L19;
                        }
                      }
                      L20: while (true) {
                        if (!nf.e(32722)) {
                          break L18;
                        } else {
                          wj.field_k.b(27163, 0);
                          stackOut_70_0 = wj.field_k.a((byte) -1);
                          stackIn_86_0 = stackOut_70_0 ? 1 : 0;
                          stackIn_71_0 = stackOut_70_0;
                          if (var5 != 0) {
                            break L17;
                          } else {
                            L21: {
                              if (stackIn_71_0) {
                                if (-1 == (wj.field_k.field_h ^ -1)) {
                                  stackOut_75_0 = 3;
                                  stackIn_76_0 = stackOut_75_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  if ((wj.field_k.field_h ^ -1) == -2) {
                                    stackOut_79_0 = 1;
                                    stackIn_80_0 = stackOut_79_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    break L21;
                                  }
                                }
                              } else {
                                break L21;
                              }
                            }
                            if (13 == ob.field_K) {
                              stackOut_83_0 = 1;
                              stackIn_84_0 = stackOut_83_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_85_0 = 0;
                  stackIn_86_0 = stackOut_85_0;
                  break L17;
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackOut_2_0 = -2;
              stackIn_3_0 = stackOut_2_0;
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
            return stackIn_64_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_68_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_86_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_76_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_80_0;
                  } else {
                    return stackIn_84_0;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0) {
        this.field_O = false;
        if (param0 <= -41) {
            return;
        }
        this.field_F = 88;
    }

    final static ea a(int param0, byte param1, int param2, int param3, be param4, int param5) {
        ea discarded$4 = null;
        java.awt.Component discarded$5 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ea var7 = null;
        be var8 = null;
        java.awt.Frame var9 = null;
        ea stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var9 = m.a(param5, param2, param3, -1, param0, param4);
              var6 = var9;
              if (param1 > 34) {
                break L1;
              } else {
                var8 = (be) null;
                discarded$4 = wd.a(23, (byte) -51, 117, 29, (be) null, -42);
                break L1;
              }
            }
            if (var9 != null) {
              var7 = new ea();
              var7.field_c = var9;
              discarded$5 = var7.field_c.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, 0, param5, param0);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackOut_5_0 = (ea) (var7);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= this.field_c) {
            this.a((byte) -77);
            if (param0 == 3940) {
              return;
            } else {
              this.field_v = -12;
              return;
            }
          } else {
            this.field_R[var6] = (short)(this.field_R[var6] * param1 / param4);
            this.field_x[var6] = (short)(param2 * this.field_x[var6] / param4);
            this.field_Q[var6] = (short)(param3 * this.field_Q[var6] / param4);
            var6++;
            if (var7 != 0) {
              if (param0 == 3940) {
                return;
              } else {
                this.field_v = -12;
                return;
              }
            } else {
              if (var7 == 0) {
                continue L0;
              } else {
                this.a((byte) -77);
                if (param0 == 3940) {
                  return;
                } else {
                  this.field_v = -12;
                  return;
                }
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        var5 = 0;
        L0: while (true) {
          if (this.field_c <= var5) {
            if (param0 == 7) {
              this.a((byte) -64);
              return;
            } else {
              this.field_P = 39;
              this.a((byte) -64);
              return;
            }
          } else {
            this.field_R[var5] = (short)(this.field_R[var5] + param3);
            this.field_x[var5] = (short)(this.field_x[var5] + param1);
            this.field_Q[var5] = (short)(this.field_Q[var5] + param2);
            var5++;
            if (var6 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
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
        if (!this.field_O) {
          this.field_O = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          if (param0 == 2) {
            var7 = -32768;
            var8 = 0;
            L0: while (true) {
              if (this.field_c > var8) {
                var9 = this.field_R[var8];
                var10 = this.field_x[var8];
                var11 = this.field_Q[var8];
                if (var12 == 0) {
                  L1: {
                    if (var5 < var9) {
                      var5 = var9;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var9 >= var2) {
                      break L2;
                    } else {
                      var2 = var9;
                      break L2;
                    }
                  }
                  L3: {
                    if (var10 >= var3) {
                      break L3;
                    } else {
                      var3 = var10;
                      break L3;
                    }
                  }
                  L4: {
                    if (var10 > var6) {
                      var6 = var10;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var11 <= var7) {
                      break L5;
                    } else {
                      var7 = var11;
                      break L5;
                    }
                  }
                  L6: {
                    if (var11 < var4) {
                      var4 = var11;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var8++;
                  continue L0;
                } else {
                  return;
                }
              } else {
                this.field_v = var4;
                this.field_z = var7;
                this.field_F = var6;
                this.field_P = var2;
                this.field_J = var3;
                this.field_d = var5;
                return;
              }
            }
          } else {
            this.field_f = (int[]) null;
            var7 = -32768;
            var8 = 0;
            L7: while (true) {
              if (this.field_c > var8) {
                var9 = this.field_R[var8];
                var10 = this.field_x[var8];
                var11 = this.field_Q[var8];
                if (var12 == 0) {
                  L8: {
                    if (var5 < var9) {
                      var5 = var9;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var9 >= var2) {
                      break L9;
                    } else {
                      var2 = var9;
                      break L9;
                    }
                  }
                  L10: {
                    if (var10 >= var3) {
                      break L10;
                    } else {
                      var3 = var10;
                      break L10;
                    }
                  }
                  L11: {
                    if (var10 > var6) {
                      var6 = var10;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var11 <= var7) {
                      break L12;
                    } else {
                      var7 = var11;
                      break L12;
                    }
                  }
                  L13: {
                    if (var11 < var4) {
                      var4 = var11;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var8++;
                  continue L7;
                } else {
                  return;
                }
              } else {
                this.field_v = var4;
                this.field_z = var7;
                this.field_F = var6;
                this.field_P = var2;
                this.field_J = var3;
                this.field_d = var5;
                return;
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
