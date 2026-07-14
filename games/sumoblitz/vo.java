/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends ao implements ai {
    private int field_Q;
    private boolean field_K;
    private int field_C;
    private boolean field_A;
    private wp field_F;
    private wp field_M;
    private wp field_N;
    private int field_R;
    private jh field_H;
    static int field_I;
    private wp field_J;
    int field_G;
    private int field_O;
    private wp field_P;
    private boolean field_B;
    private int field_L;
    int field_D;
    int field_E;

    final void a(int param0, int param1) {
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 0) {
          L0: {
            if (-1 < param1) {
              ((vo) this).field_D = 0;
              break L0;
            } else {
              if (-65537 < param1) {
                ((vo) this).field_D = 65536;
                break L0;
              } else {
                ((vo) this).field_D = param1;
                break L0;
              }
            }
          }
          this.f(-1840);
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 106 / ((-25 - param0) / 52);
        this.b(param1, (byte) 122);
        if (((vo) this).field_o instanceof nc) {
            ((nc) (Object) ((vo) this).field_o).a((vo) this, -6772, ((vo) this).field_D, ((vo) this).field_G);
        }
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L3;
                  } else {
                    if (90 < var6) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(var6 + -64);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (var6 > 122) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(1 + (var6 - 97));
                      break L2;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (var6 > 57) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(-48 + (27 + var6));
                    break L2;
                  }
                }
              }
              if (var2 >= 177917621779460413L) {
                break L1;
              } else {
                var5++;
                continue L0;
              }
            }
          }
          L5: while (true) {
            L6: {
              if (var2 % 37L != 0L) {
                break L6;
              } else {
                if (var2 == 0L) {
                  break L6;
                } else {
                  var2 = var2 / 37L;
                  continue L5;
                }
              }
            }
            L7: {
              if (param1 == 7441) {
                break L7;
              } else {
                field_I = -23;
                break L7;
              }
            }
            return var2;
          }
        }
    }

    final static bo a(boolean param0, byte[] param1) {
        if (param1 == null) {
            return null;
        }
        if (param0) {
            Object var3 = null;
        }
        bo var2 = new bo(param1, er.field_h, av.field_C, vg.field_k, we.field_B, iv.field_l, ag.field_d);
        tl.a((byte) -60);
        return var2;
    }

    private final void b(int param0, byte param1) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int var3 = -36 / ((param1 - 50) / 41);
        if (0 > param0) {
            ((vo) this).field_G = 0;
        } else {
            if ((param0 ^ -1) >= -65537) {
                ((vo) this).field_G = param0;
            } else {
                ((vo) this).field_G = 65536;
            }
        }
        this.e((byte) 100);
    }

    private final void a(byte param0) {
        if (param0 != -121) {
            this.a(100, false);
        }
        int var2 = ((vo) this).field_N == null ? ((vo) this).field_P.field_r : ((vo) this).field_N.field_r - -((vo) this).field_N.field_q;
        int var3 = null != ((vo) this).field_J ? ((vo) this).field_J.field_r - ((vo) this).field_H.field_q : ((vo) this).field_P.field_q + ((vo) this).field_P.field_r - ((vo) this).field_H.field_q;
        this.b(var3 > var2 ? (((vo) this).field_H.field_r + -var2 << 1984602960) / (var3 + -var2) : 0, (byte) -6);
    }

    final static ki b(int param0, int param1) {
        ki stackIn_7_0 = null;
        ki stackOut_6_0 = null;
        ki stackOut_5_0 = null;
        if (param1 == -1) {
          L0: {
            L1: {
              if (ha.field_g != null) {
                break L1;
              } else {
                if (param0 != -1) {
                  stackOut_6_0 = ng.a(1, -117, true, param0, false, true);
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = ha.field_g;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return null;
        }
    }

    private final void a(int param0, byte param1) {
        ((vo) this).a(0, param0);
        if (param1 != -125) {
            return;
        }
        if (((vo) this).field_o instanceof nc) {
            ((nc) (Object) ((vo) this).field_o).a((vo) this, -6772, ((vo) this).field_D, ((vo) this).field_D);
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < -1) {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (128 > param1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < 160) {
                if (param1 != 0) {
                  var6 = uk.field_lb;
                  var2 = var6;
                  var3 = 0;
                  L3: while (true) {
                    if (var6.length <= var3) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (param1 == var4) {
                        return true;
                      } else {
                        var3++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                if (255 >= param1) {
                  break L0;
                } else {
                  if (param1 != 0) {
                    var6 = uk.field_lb;
                    var2 = var6;
                    var3 = 0;
                    L4: while (true) {
                      if (var6.length <= var3) {
                        break L2;
                      } else {
                        var4 = var6[var3];
                        if (param1 == var4) {
                          return true;
                        } else {
                          var3++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
            return false;
          }
          return true;
        } else {
          return false;
        }
    }

    final boolean a(pk param0, byte param1) {
        if (param1 != 61) {
            this.b(-73, (byte) 11);
        }
        jh var3 = ((vo) this).field_H;
        if (var3 != null) {
            if (!((pk) (Object) var3).a(param0, (byte) 61)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (param1 == 710) {
            break L0;
          } else {
            var8 = null;
            bo discarded$2 = vo.a(true, (byte[]) null);
            break L0;
          }
        }
        L1: {
          if (-2 != (param0 ^ -1)) {
            break L1;
          } else {
            if (((vo) this).field_B) {
              L2: {
                if (!((vo) this).field_K) {
                  break L2;
                } else {
                  if (((vo) this).field_F != param2) {
                    break L2;
                  } else {
                    this.a(-((vo) this).field_E + ((vo) this).field_D, (byte) -125);
                    break L1;
                  }
                }
              }
              L3: {
                if (!((vo) this).field_K) {
                  break L3;
                } else {
                  if (param2 != ((vo) this).field_M) {
                    break L3;
                  } else {
                    this.a(((vo) this).field_E + ((vo) this).field_D, (byte) -125);
                    break L1;
                  }
                }
              }
              L4: {
                if (!((vo) this).field_A) {
                  break L4;
                } else {
                  if (param2 == ((vo) this).field_N) {
                    this.a((byte) -78, ((vo) this).field_G + -((vo) this).field_Q);
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              if (!((vo) this).field_A) {
                break L1;
              } else {
                if (((vo) this).field_J != param2) {
                  break L1;
                } else {
                  this.a((byte) 48, ((vo) this).field_Q + ((vo) this).field_G);
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
        }
    }

    private final void g(int param0) {
        int var2 = ((vo) this).field_F != null ? ((vo) this).field_F.field_v - -((vo) this).field_F.field_p : ((vo) this).field_P.field_v;
        int var3 = null != ((vo) this).field_M ? ((vo) this).field_M.field_v + -((vo) this).field_H.field_p : -((vo) this).field_H.field_p + ((vo) this).field_P.field_v + ((vo) this).field_P.field_p;
        ((vo) this).a(0, var3 <= var2 ? 0 : (((vo) this).field_H.field_v + -var2 << -2066408880) / (-var2 + var3));
        if (param0 != -2066408880) {
            ((vo) this).field_H = null;
        }
    }

    private final void a(boolean param0, int param1) {
        wp stackIn_1_0 = null;
        wp stackIn_2_0 = null;
        wp stackIn_3_0 = null;
        wp stackIn_4_0 = null;
        wp stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        wp stackIn_7_0 = null;
        wp stackIn_8_0 = null;
        wp stackIn_9_0 = null;
        wp stackIn_10_0 = null;
        wp stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wp stackIn_16_0 = null;
        wp stackIn_17_0 = null;
        wp stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        wp stackIn_22_0 = null;
        wp stackIn_23_0 = null;
        wp stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        wp stackOut_0_0 = null;
        wp stackOut_1_0 = null;
        wp stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        wp stackOut_2_0 = null;
        wp stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        wp stackOut_6_0 = null;
        wp stackOut_7_0 = null;
        wp stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        wp stackOut_8_0 = null;
        wp stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        wp stackOut_15_0 = null;
        wp stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        wp stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        wp stackOut_21_0 = null;
        wp stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        wp stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        L0: {
          L1: {
            stackOut_0_0 = ((vo) this).field_P;
            stackIn_3_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (param0) {
              break L1;
            } else {
              stackOut_1_0 = (wp) (Object) stackIn_1_0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!((vo) this).field_K) {
                stackOut_4_0 = (wp) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L0;
              } else {
                stackOut_2_0 = (wp) (Object) stackIn_2_0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            }
          }
          stackOut_3_0 = (wp) (Object) stackIn_3_0;
          stackOut_3_1 = 1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          break L0;
        }
        L2: {
          stackIn_5_0.field_x = stackIn_5_1 != 0;
          if (!(((vo) this).field_H.field_y instanceof wp)) {
            break L2;
          } else {
            L3: {
              L4: {
                stackOut_6_0 = (wp) (Object) ((vo) this).field_H.field_y;
                stackIn_9_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param0) {
                  break L4;
                } else {
                  stackOut_7_0 = (wp) (Object) stackIn_7_0;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (!((vo) this).field_K) {
                    stackOut_10_0 = (wp) (Object) stackIn_10_0;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L3;
                  } else {
                    stackOut_8_0 = (wp) (Object) stackIn_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    break L4;
                  }
                }
              }
              stackOut_9_0 = (wp) (Object) stackIn_9_0;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L3;
            }
            stackIn_11_0.field_x = stackIn_11_1 != 0;
            break L2;
          }
        }
        L5: {
          if (param1 <= -126) {
            break L5;
          } else {
            ((vo) this).field_O = -95;
            break L5;
          }
        }
        L6: {
          if (((vo) this).field_N == null) {
            break L6;
          } else {
            L7: {
              stackOut_15_0 = ((vo) this).field_N;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (!param0) {
                stackOut_17_0 = (wp) (Object) stackIn_17_0;
                stackOut_17_1 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L7;
              } else {
                stackOut_16_0 = (wp) (Object) stackIn_16_0;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L7;
              }
            }
            stackIn_18_0.field_x = stackIn_18_1 != 0;
            break L6;
          }
        }
        L8: {
          if (null != ((vo) this).field_J) {
            L9: {
              stackOut_21_0 = ((vo) this).field_J;
              stackIn_23_0 = stackOut_21_0;
              stackIn_22_0 = stackOut_21_0;
              if (!param0) {
                stackOut_23_0 = (wp) (Object) stackIn_23_0;
                stackOut_23_1 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L9;
              } else {
                stackOut_22_0 = (wp) (Object) stackIn_22_0;
                stackOut_22_1 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L9;
              }
            }
            stackIn_24_0.field_x = stackIn_24_1 != 0;
            break L8;
          } else {
            break L8;
          }
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Sumoblitz.field_L ? 1 : 0;
            super.a(param0, -123, param2, param3);
            var5 = 4 / ((param1 - -25) / 45);
            if (!(((vo) this).field_H.field_y instanceof wp)) {
              break L1;
            } else {
              if (!((wp) (Object) ((vo) this).field_H.field_y).field_x) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (-2 == (((vo) this).field_H.field_l ^ -1)) {
            L2: {
              if (!((vo) this).field_A) {
                this.e((byte) 110);
                break L2;
              } else {
                var6 = ((vo) this).field_G;
                this.a((byte) -121);
                if (var6 == ((vo) this).field_G) {
                  break L2;
                } else {
                  if (!(((vo) this).field_o instanceof nc)) {
                    break L2;
                  } else {
                    ((nc) (Object) ((vo) this).field_o).a(((vo) this).field_G, ((vo) this).field_G, (vo) this, false);
                    break L2;
                  }
                }
              }
            }
            if (!((vo) this).field_K) {
              this.f(-1840);
              break L0;
            } else {
              var6 = ((vo) this).field_D;
              this.g(-2066408880);
              if (((vo) this).field_D == var6) {
                break L0;
              } else {
                if (!(((vo) this).field_o instanceof nc)) {
                  break L0;
                } else {
                  ((nc) (Object) ((vo) this).field_o).a(((vo) this).field_D, ((vo) this).field_G, (vo) this, false);
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (!((vo) this).field_P.field_x) {
            break L3;
          } else {
            if (((vo) this).field_P.field_B == 1) {
              if (((vo) this).field_K) {
                if (!((vo) this).field_A) {
                  if ((((vo) this).field_H.field_p >> 751265217) + param3 - -((vo) this).field_H.field_v < pi.field_e) {
                    this.a(((vo) this).field_O + ((vo) this).field_D, (byte) -125);
                    break L3;
                  } else {
                    this.a(((vo) this).field_D + -((vo) this).field_O, (byte) -125);
                    break L3;
                  }
                } else {
                  var6 = -(((vo) this).field_H.field_q >> 990352385) + (-((vo) this).field_H.field_r + -((vo) this).field_r + -param0 + ko.field_p);
                  var7 = -param3 + (pi.field_e - ((vo) this).field_v) - (((vo) this).field_H.field_v - -(((vo) this).field_H.field_p >> 1781112321));
                  if (Math.abs(var7) > Math.abs(var6)) {
                    if (-1 > (var7 ^ -1)) {
                      this.a(((vo) this).field_O + ((vo) this).field_D, (byte) -125);
                      break L3;
                    } else {
                      this.a(((vo) this).field_D + -((vo) this).field_O, (byte) -125);
                      break L3;
                    }
                  } else {
                    if (var6 <= 0) {
                      this.a((byte) -109, -((vo) this).field_C + ((vo) this).field_G);
                      break L3;
                    } else {
                      this.a((byte) 27, ((vo) this).field_C + ((vo) this).field_G);
                      break L3;
                    }
                  }
                }
              } else {
                if (((vo) this).field_A) {
                  if (ko.field_p <= ((vo) this).field_H.field_r + param0 - -(((vo) this).field_H.field_q >> -9263039)) {
                    this.a((byte) 116, ((vo) this).field_G + -((vo) this).field_C);
                    break L3;
                  } else {
                    this.a((byte) -79, ((vo) this).field_G - -((vo) this).field_C);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
        }
    }

    private final void e(byte param0) {
        int var2 = null == ((vo) this).field_N ? ((vo) this).field_P.field_r : ((vo) this).field_N.field_r + ((vo) this).field_N.field_q;
        if (param0 <= 89) {
            return;
        }
        int var3 = null == ((vo) this).field_J ? ((vo) this).field_P.field_r - -((vo) this).field_P.field_q + -((vo) this).field_H.field_q : ((vo) this).field_J.field_r + -((vo) this).field_H.field_q;
        ((vo) this).field_H.field_r = ((-var2 + var3) * ((vo) this).field_G >> 1769537168) + var2;
    }

    final void b(int param0, int param1, int param2) {
        int var5 = 0;
        int var4 = 34 % ((59 - param2) / 45);
        if (param0 >= param1) {
            ((vo) this).field_H.a(91, ((vo) this).field_H.field_r, ((vo) this).field_H.field_v, ((vo) this).field_H.field_p, ((vo) this).field_P.field_q);
            this.a(false, -127);
        } else {
            var5 = param0 * ((vo) this).field_P.field_q / param1;
            if (!(var5 >= ((vo) this).field_L)) {
                var5 = ((vo) this).field_L;
            }
            ((vo) this).field_H.a(106, ((vo) this).field_H.field_r, ((vo) this).field_H.field_v, ((vo) this).field_H.field_p, var5);
            this.a(true, -127);
        }
        this.e((byte) 100);
    }

    private final void a(int param0, boolean param1) {
        wp stackIn_1_0 = null;
        wp stackIn_2_0 = null;
        wp stackIn_3_0 = null;
        wp stackIn_4_0 = null;
        wp stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        wp stackIn_10_0 = null;
        wp stackIn_11_0 = null;
        wp stackIn_12_0 = null;
        wp stackIn_13_0 = null;
        wp stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        wp stackIn_17_0 = null;
        wp stackIn_18_0 = null;
        wp stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        wp stackIn_22_0 = null;
        wp stackIn_23_0 = null;
        wp stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        wp stackOut_0_0 = null;
        wp stackOut_1_0 = null;
        wp stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        wp stackOut_2_0 = null;
        wp stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        wp stackOut_9_0 = null;
        wp stackOut_10_0 = null;
        wp stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        wp stackOut_11_0 = null;
        wp stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        wp stackOut_16_0 = null;
        wp stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        wp stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        wp stackOut_21_0 = null;
        wp stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        wp stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        L0: {
          L1: {
            stackOut_0_0 = ((vo) this).field_P;
            stackIn_3_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (param1) {
              break L1;
            } else {
              stackOut_1_0 = (wp) (Object) stackIn_1_0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!((vo) this).field_A) {
                stackOut_4_0 = (wp) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L0;
              } else {
                stackOut_2_0 = (wp) (Object) stackIn_2_0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            }
          }
          stackOut_3_0 = (wp) (Object) stackIn_3_0;
          stackOut_3_1 = 1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          break L0;
        }
        stackIn_5_0.field_x = stackIn_5_1 != 0;
        if (param0 == 8206) {
          L2: {
            if (((vo) this).field_H.field_y instanceof wp) {
              L3: {
                L4: {
                  stackOut_9_0 = (wp) (Object) ((vo) this).field_H.field_y;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (param1) {
                    break L4;
                  } else {
                    stackOut_10_0 = (wp) (Object) stackIn_10_0;
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (!((vo) this).field_A) {
                      stackOut_13_0 = (wp) (Object) stackIn_13_0;
                      stackOut_13_1 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L3;
                    } else {
                      stackOut_11_0 = (wp) (Object) stackIn_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                }
                stackOut_12_0 = (wp) (Object) stackIn_12_0;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L3;
              }
              stackIn_14_0.field_x = stackIn_14_1 != 0;
              break L2;
            } else {
              break L2;
            }
          }
          L5: {
            if (null == ((vo) this).field_F) {
              break L5;
            } else {
              L6: {
                stackOut_16_0 = ((vo) this).field_F;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (!param1) {
                  stackOut_18_0 = (wp) (Object) stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L6;
                } else {
                  stackOut_17_0 = (wp) (Object) stackIn_17_0;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L6;
                }
              }
              stackIn_19_0.field_x = stackIn_19_1 != 0;
              break L5;
            }
          }
          L7: {
            if (null == ((vo) this).field_M) {
              break L7;
            } else {
              L8: {
                stackOut_21_0 = ((vo) this).field_M;
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (!param1) {
                  stackOut_23_0 = (wp) (Object) stackIn_23_0;
                  stackOut_23_1 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  break L8;
                } else {
                  stackOut_22_0 = (wp) (Object) stackIn_22_0;
                  stackOut_22_1 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  break L8;
                }
              }
              stackIn_24_0.field_x = stackIn_24_1 != 0;
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void f(int param0) {
        int var2 = null == ((vo) this).field_F ? ((vo) this).field_P.field_v : ((vo) this).field_F.field_v + ((vo) this).field_F.field_p;
        int var3 = ((vo) this).field_M != null ? -((vo) this).field_H.field_p + ((vo) this).field_M.field_v : -((vo) this).field_H.field_p + (((vo) this).field_P.field_p + ((vo) this).field_P.field_v);
        ((vo) this).field_H.field_v = ((-var2 + var3) * ((vo) this).field_D >> 1413961040) + var2;
        if (param0 != -1840) {
            ((vo) this).field_P = null;
        }
    }

    final void e(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (((vo) this).field_N != null) {
            ((vo) this).field_N.field_v = -((vo) this).field_N.field_p + ((vo) this).field_p >> -1835926495;
            ((vo) this).field_N.field_r = 0;
            ((vo) this).field_P.field_r = ((vo) this).field_N.field_q + ((vo) this).field_N.field_r;
            break L0;
          } else {
            ((vo) this).field_P.field_r = 0;
            break L0;
          }
        }
        L1: {
          if (null == ((vo) this).field_J) {
            ((vo) this).field_P.field_q = ((vo) this).field_q - ((vo) this).field_P.field_r;
            break L1;
          } else {
            ((vo) this).field_J.field_r = ((vo) this).field_q + -((vo) this).field_J.field_q;
            ((vo) this).field_J.field_v = ((vo) this).field_p - ((vo) this).field_J.field_p >> -286223071;
            ((vo) this).field_P.field_q = ((vo) this).field_q + (-((vo) this).field_P.field_r + -((vo) this).field_J.field_q);
            break L1;
          }
        }
        L2: {
          this.e((byte) 125);
          if (((vo) this).field_F != null) {
            ((vo) this).field_F.field_v = 0;
            ((vo) this).field_F.field_r = -((vo) this).field_F.field_q + ((vo) this).field_q >> -2087720351;
            ((vo) this).field_P.field_v = ((vo) this).field_F.field_p + ((vo) this).field_F.field_v;
            break L2;
          } else {
            ((vo) this).field_P.field_v = 0;
            break L2;
          }
        }
        L3: {
          if (((vo) this).field_M == null) {
            ((vo) this).field_P.field_p = -((vo) this).field_P.field_v + ((vo) this).field_p;
            break L3;
          } else {
            ((vo) this).field_M.field_v = -((vo) this).field_M.field_p + ((vo) this).field_p;
            ((vo) this).field_M.field_r = -((vo) this).field_M.field_q + ((vo) this).field_q >> -495632863;
            ((vo) this).field_P.field_p = -((vo) this).field_M.field_p + (-((vo) this).field_P.field_v + ((vo) this).field_p);
            break L3;
          }
        }
        L4: {
          this.f(-1840);
          if (!((vo) this).field_K) {
            ((vo) this).field_H.field_v = 0;
            ((vo) this).field_H.field_p = ((vo) this).field_P.field_p;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((vo) this).field_A) {
            break L5;
          } else {
            ((vo) this).field_H.field_r = 0;
            ((vo) this).field_H.field_q = ((vo) this).field_P.field_q;
            break L5;
          }
        }
        ((vo) this).field_H.c(param0);
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 < param1) {
            var4 = param2 * ((vo) this).field_P.field_p / param1;
            if (!(var4 >= ((vo) this).field_R)) {
                var4 = ((vo) this).field_R;
            }
            ((vo) this).field_H.a(-95, ((vo) this).field_H.field_r, ((vo) this).field_H.field_v, var4, ((vo) this).field_H.field_q);
            this.a(8206, true);
        } else {
            ((vo) this).field_H.a(-49, ((vo) this).field_H.field_r, ((vo) this).field_H.field_v, ((vo) this).field_P.field_p, ((vo) this).field_H.field_q);
            this.a(8206, false);
        }
        this.f(-1840);
        if (param0 < 2) {
            this.e((byte) 53);
        }
    }

    vo(int param0, int param1, int param2, int param3, mh param4, mh param5, mh param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ((vo) this).field_Q = 1024;
        ((vo) this).field_R = 0;
        ((vo) this).field_O = 8192;
        ((vo) this).field_L = 0;
        ((vo) this).field_B = true;
        ((vo) this).field_E = 1024;
        ((vo) this).field_D = 32768;
        ((vo) this).field_C = 8192;
        ((vo) this).field_G = 32768;
        ((vo) this).field_x = new pk[6];
        ((vo) this).field_H = new jh(param0, param1, param7, param8, (mh) null, (qm) null, (pk) (Object) new wp(0, 0, param7, param8, param6, (qm) null), false, false);
        ((vo) this).field_x[0] = (pk) (Object) new jh(param0, param1, param7, param8, (mh) null, (qm) null, (pk) (Object) new wp(0, 0, param7, param8, param6, (qm) null), false, false);
        ((vo) this).field_P = new wp(param0, param1, param7, param8, param5, (qm) null);
        ((vo) this).field_x[1] = (pk) (Object) new wp(param0, param1, param7, param8, param5, (qm) null);
        ((vo) this).field_L = param9;
        ((vo) this).field_R = param10;
        ((vo) this).field_K = param12 ? true : false;
        ((vo) this).field_A = param11 ? true : false;
        this.b(param13, (byte) 7);
        ((vo) this).a(0, param14);
        ((vo) this).a(96, param0, param1, param3, param2);
    }

    private final int h(int param0) {
        int var2 = 57 % ((param0 - -47) / 43);
        return (((vo) this).field_H.field_p << -897472048) / ((vo) this).field_P.field_p;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        if (super.a(param0, param1, (byte) 27, param3)) {
          return true;
        } else {
          L0: {
            if (!((vo) this).field_B) {
              break L0;
            } else {
              if (((vo) this).field_H.d(-1)) {
                if (-99 == (param3 ^ -1)) {
                  this.a(((vo) this).field_D - ((vo) this).field_E, (byte) -125);
                  return true;
                } else {
                  if (param3 == -100) {
                    this.a(((vo) this).field_E + ((vo) this).field_D, (byte) -125);
                    return true;
                  } else {
                    if (-97 != param3) {
                      if (param3 != 97) {
                        if (-105 == (param3 ^ -1)) {
                          this.a(((vo) this).field_D + -this.h(123), (byte) -125);
                          return true;
                        } else {
                          if ((param3 ^ -1) != -106) {
                            if ((param3 ^ -1) == -103) {
                              L1: {
                                if (!((vo) this).field_K) {
                                  break L1;
                                } else {
                                  if (hw.field_b[82]) {
                                    this.a(0, (byte) -125);
                                    return true;
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                              if (((vo) this).field_A) {
                                this.a((byte) 123, 0);
                                return true;
                              } else {
                                break L0;
                              }
                            } else {
                              if (103 != param3) {
                                break L0;
                              } else {
                                L2: {
                                  if (!((vo) this).field_K) {
                                    break L2;
                                  } else {
                                    if (!hw.field_b[82]) {
                                      break L2;
                                    } else {
                                      this.a(65536, (byte) -125);
                                      return true;
                                    }
                                  }
                                }
                                if (((vo) this).field_A) {
                                  this.a((byte) 123, 65536);
                                  return true;
                                } else {
                                  break L0;
                                }
                              }
                            }
                          } else {
                            this.a(((vo) this).field_D + this.h(-111), (byte) -125);
                            return true;
                          }
                        }
                      } else {
                        this.a((byte) -122, ((vo) this).field_G - -((vo) this).field_Q);
                        return true;
                      }
                    } else {
                      this.a((byte) -124, -((vo) this).field_Q + ((vo) this).field_G);
                      return true;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L3: {
            if (param2 > 9) {
              break L3;
            } else {
              this.a(true, 89);
              break L3;
            }
          }
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = -1;
    }
}
