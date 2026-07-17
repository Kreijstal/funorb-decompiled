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
            if (param1 < 0) {
              ((vo) this).field_D = 0;
              break L0;
            } else {
              if (param1 > 65536) {
                ((vo) this).field_D = 65536;
                break L0;
              } else {
                ((vo) this).field_D = param1;
                break L0;
              }
            }
          }
          int discarded$1 = -1840;
          this.f();
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
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_20_0 = 0L;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (var6 < 65) {
                        break L4;
                      } else {
                        if (90 < var6) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(var6 + -64);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (var6 > 122) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 + (var6 - 97));
                          break L3;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (var6 > 57) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(-48 + (27 + var6));
                        break L3;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (var2_long % 37L != 0L) {
                    break L7;
                  } else {
                    if (var2_long == 0L) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                L8: {
                  if (param1 == 7441) {
                    break L8;
                  } else {
                    field_I = -23;
                    break L8;
                  }
                }
                stackOut_20_0 = var2_long;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("vo.AA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
        return stackIn_21_0;
    }

    final static bo a(boolean param0, byte[] param1) {
        bo var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        Object stackIn_2_0 = null;
        bo stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        bo stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 != null) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var3 = null;
                  break L1;
                }
              }
              var2 = new bo(param1, er.field_h, av.field_C, vg.field_k, we.field_B, iv.field_l, ag.field_d);
              tl.a((byte) -60);
              stackOut_5_0 = (bo) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bo) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("vo.CA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    private final void b(int param0, byte param1) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int var3 = -36 / ((param1 - 50) / 41);
        if (0 > param0) {
            ((vo) this).field_G = 0;
        } else {
            if (param0 <= 65536) {
                ((vo) this).field_G = param0;
            } else {
                ((vo) this).field_G = 65536;
            }
        }
        this.e((byte) 100);
    }

    private final void a() {
        int var2 = ((vo) this).field_N == null ? ((vo) this).field_P.field_r : ((vo) this).field_N.field_r - -((vo) this).field_N.field_q;
        int var3 = null != ((vo) this).field_J ? ((vo) this).field_J.field_r - ((vo) this).field_H.field_q : ((vo) this).field_P.field_q + ((vo) this).field_P.field_r - ((vo) this).field_H.field_q;
        this.b(var3 > var2 ? (((vo) this).field_H.field_r + -var2 << 16) / (var3 + -var2) : 0, (byte) -6);
    }

    final static ki b(int param0, int param1) {
        ki stackIn_5_0 = null;
        ki stackOut_4_0 = null;
        ki stackOut_3_0 = null;
        L0: {
          L1: {
            if (ha.field_g != null) {
              break L1;
            } else {
              if (param0 != -1) {
                stackOut_4_0 = ng.a(1, -117, true, param0, false, true);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = ha.field_g;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0;
    }

    private final void a(int param0, byte param1) {
        ((vo) this).a(0, param0);
        if (((vo) this).field_o instanceof nc) {
            ((nc) (Object) ((vo) this).field_o).a((vo) this, -6772, ((vo) this).field_D, ((vo) this).field_D);
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (128 > param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (255 >= param1) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param1 != 0) {
                var6 = uk.field_lb;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
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
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2_ref, "vo.V(" + -125 + 44 + param1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final boolean a(pk param0, byte param1) {
        jh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 61) {
                break L1;
              } else {
                this.b(-73, (byte) 11);
                break L1;
              }
            }
            var3 = ((vo) this).field_H;
            if (var3 == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              if (((pk) (Object) var3).a(param0, (byte) 61)) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("vo.Q(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0 != 0;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                var8 = null;
                bo discarded$2 = vo.a(true, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (param0 != 1) {
                break L2;
              } else {
                if (((vo) this).field_B) {
                  L3: {
                    if (!((vo) this).field_K) {
                      break L3;
                    } else {
                      if (((vo) this).field_F != param2) {
                        break L3;
                      } else {
                        this.a(-((vo) this).field_E + ((vo) this).field_D, (byte) -125);
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (!((vo) this).field_K) {
                      break L4;
                    } else {
                      if (param2 != ((vo) this).field_M) {
                        break L4;
                      } else {
                        this.a(((vo) this).field_E + ((vo) this).field_D, (byte) -125);
                        break L2;
                      }
                    }
                  }
                  L5: {
                    if (!((vo) this).field_A) {
                      break L5;
                    } else {
                      if (param2 == ((vo) this).field_N) {
                        this.a((byte) -78, ((vo) this).field_G + -((vo) this).field_Q);
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (!((vo) this).field_A) {
                    break L2;
                  } else {
                    if (((vo) this).field_J != param2) {
                      break L2;
                    } else {
                      this.a((byte) 48, ((vo) this).field_Q + ((vo) this).field_G);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("vo.C(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void g() {
        int var2 = ((vo) this).field_F != null ? ((vo) this).field_F.field_v - -((vo) this).field_F.field_p : ((vo) this).field_P.field_v;
        int var3 = null != ((vo) this).field_M ? ((vo) this).field_M.field_v + -((vo) this).field_H.field_p : -((vo) this).field_H.field_p + ((vo) this).field_P.field_v + ((vo) this).field_P.field_p;
        ((vo) this).a(0, var3 <= var2 ? 0 : (((vo) this).field_H.field_v + -var2 << 16) / (-var2 + var3));
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, -123, param2, param3);
                var5_int = 4 / ((param1 - -25) / 45);
                if (!(((vo) this).field_H.field_y instanceof wp)) {
                  break L2;
                } else {
                  if (!((wp) (Object) ((vo) this).field_H.field_y).field_x) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (((vo) this).field_H.field_l == 1) {
                L3: {
                  if (!((vo) this).field_A) {
                    this.e((byte) 110);
                    break L3;
                  } else {
                    var6 = ((vo) this).field_G;
                    int discarded$3 = -121;
                    this.a();
                    if (var6 == ((vo) this).field_G) {
                      break L3;
                    } else {
                      if (!(((vo) this).field_o instanceof nc)) {
                        break L3;
                      } else {
                        ((nc) (Object) ((vo) this).field_o).a(((vo) this).field_G, ((vo) this).field_G, (vo) this, false);
                        break L3;
                      }
                    }
                  }
                }
                if (!((vo) this).field_K) {
                  int discarded$4 = -1840;
                  this.f();
                  break L1;
                } else {
                  var6 = ((vo) this).field_D;
                  int discarded$5 = -2066408880;
                  this.g();
                  if (((vo) this).field_D == var6) {
                    break L1;
                  } else {
                    if (!(((vo) this).field_o instanceof nc)) {
                      break L1;
                    } else {
                      ((nc) (Object) ((vo) this).field_o).a(((vo) this).field_D, ((vo) this).field_G, (vo) this, false);
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (!((vo) this).field_P.field_x) {
                break L4;
              } else {
                if (((vo) this).field_P.field_B == 1) {
                  if (((vo) this).field_K) {
                    if (!((vo) this).field_A) {
                      if ((((vo) this).field_H.field_p >> 1) + param3 - -((vo) this).field_H.field_v < pi.field_e) {
                        this.a(((vo) this).field_O + ((vo) this).field_D, (byte) -125);
                        break L4;
                      } else {
                        this.a(((vo) this).field_D + -((vo) this).field_O, (byte) -125);
                        break L4;
                      }
                    } else {
                      var6 = -(((vo) this).field_H.field_q >> 1) + (-((vo) this).field_H.field_r + -((vo) this).field_r + -param0 + ko.field_p);
                      var7 = -param3 + (pi.field_e - ((vo) this).field_v) - (((vo) this).field_H.field_v - -(((vo) this).field_H.field_p >> 1));
                      if (Math.abs(var7) > Math.abs(var6)) {
                        if (var7 > 0) {
                          this.a(((vo) this).field_O + ((vo) this).field_D, (byte) -125);
                          break L4;
                        } else {
                          this.a(((vo) this).field_D + -((vo) this).field_O, (byte) -125);
                          break L4;
                        }
                      } else {
                        if (var6 <= 0) {
                          this.a((byte) -109, -((vo) this).field_C + ((vo) this).field_G);
                          break L4;
                        } else {
                          this.a((byte) 27, ((vo) this).field_C + ((vo) this).field_G);
                          break L4;
                        }
                      }
                    }
                  } else {
                    if (((vo) this).field_A) {
                      if (ko.field_p <= ((vo) this).field_H.field_r + param0 - -(((vo) this).field_H.field_q >> 1)) {
                        this.a((byte) 116, ((vo) this).field_G + -((vo) this).field_C);
                        break L4;
                      } else {
                        this.a((byte) -79, ((vo) this).field_G - -((vo) this).field_C);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var5;
            stackOut_39_1 = new StringBuilder().append("vo.U(").append(param0).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L5;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param3 + 41);
        }
    }

    private final void e(byte param0) {
        int var2 = null == ((vo) this).field_N ? ((vo) this).field_P.field_r : ((vo) this).field_N.field_r + ((vo) this).field_N.field_q;
        if (param0 <= 89) {
            return;
        }
        int var3 = null == ((vo) this).field_J ? ((vo) this).field_P.field_r - -((vo) this).field_P.field_q + -((vo) this).field_H.field_q : ((vo) this).field_J.field_r + -((vo) this).field_H.field_q;
        ((vo) this).field_H.field_r = ((-var2 + var3) * ((vo) this).field_G >> 16) + var2;
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
        wp stackIn_8_0 = null;
        wp stackIn_9_0 = null;
        wp stackIn_10_0 = null;
        wp stackIn_11_0 = null;
        wp stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        wp stackIn_15_0 = null;
        wp stackIn_16_0 = null;
        wp stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        wp stackIn_20_0 = null;
        wp stackIn_21_0 = null;
        wp stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        wp stackOut_0_0 = null;
        wp stackOut_1_0 = null;
        wp stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        wp stackOut_2_0 = null;
        wp stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        wp stackOut_7_0 = null;
        wp stackOut_8_0 = null;
        wp stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        wp stackOut_9_0 = null;
        wp stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        wp stackOut_14_0 = null;
        wp stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        wp stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        wp stackOut_19_0 = null;
        wp stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        wp stackOut_20_0 = null;
        int stackOut_20_1 = 0;
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
        L2: {
          stackIn_5_0.field_x = stackIn_5_1 != 0;
          if (((vo) this).field_H.field_y instanceof wp) {
            L3: {
              L4: {
                stackOut_7_0 = (wp) (Object) ((vo) this).field_H.field_y;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (param1) {
                  break L4;
                } else {
                  stackOut_8_0 = (wp) (Object) stackIn_8_0;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (!((vo) this).field_A) {
                    stackOut_11_0 = (wp) (Object) stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L3;
                  } else {
                    stackOut_9_0 = (wp) (Object) stackIn_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    break L4;
                  }
                }
              }
              stackOut_10_0 = (wp) (Object) stackIn_10_0;
              stackOut_10_1 = 1;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              break L3;
            }
            stackIn_12_0.field_x = stackIn_12_1 != 0;
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
              stackOut_14_0 = ((vo) this).field_F;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param1) {
                stackOut_16_0 = (wp) (Object) stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L6;
              } else {
                stackOut_15_0 = (wp) (Object) stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L6;
              }
            }
            stackIn_17_0.field_x = stackIn_17_1 != 0;
            break L5;
          }
        }
        L7: {
          if (null == ((vo) this).field_M) {
            break L7;
          } else {
            L8: {
              stackOut_19_0 = ((vo) this).field_M;
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (!param1) {
                stackOut_21_0 = (wp) (Object) stackIn_21_0;
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L8;
              } else {
                stackOut_20_0 = (wp) (Object) stackIn_20_0;
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L8;
              }
            }
            stackIn_22_0.field_x = stackIn_22_1 != 0;
            break L7;
          }
        }
    }

    private final void f() {
        int var2 = null == ((vo) this).field_F ? ((vo) this).field_P.field_v : ((vo) this).field_F.field_v + ((vo) this).field_F.field_p;
        int var3 = ((vo) this).field_M != null ? -((vo) this).field_H.field_p + ((vo) this).field_M.field_v : -((vo) this).field_H.field_p + (((vo) this).field_P.field_p + ((vo) this).field_P.field_v);
        ((vo) this).field_H.field_v = ((-var2 + var3) * ((vo) this).field_D >> 16) + var2;
    }

    final void e(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (((vo) this).field_N != null) {
            ((vo) this).field_N.field_v = -((vo) this).field_N.field_p + ((vo) this).field_p >> 1;
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
            ((vo) this).field_J.field_v = ((vo) this).field_p - ((vo) this).field_J.field_p >> 1;
            ((vo) this).field_P.field_q = ((vo) this).field_q + (-((vo) this).field_P.field_r + -((vo) this).field_J.field_q);
            break L1;
          }
        }
        L2: {
          this.e((byte) 125);
          if (((vo) this).field_F != null) {
            ((vo) this).field_F.field_v = 0;
            ((vo) this).field_F.field_r = -((vo) this).field_F.field_q + ((vo) this).field_q >> 1;
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
            ((vo) this).field_M.field_r = -((vo) this).field_M.field_q + ((vo) this).field_q >> 1;
            ((vo) this).field_P.field_p = -((vo) this).field_M.field_p + (-((vo) this).field_P.field_v + ((vo) this).field_p);
            break L3;
          }
        }
        L4: {
          int discarded$1 = -1840;
          this.f();
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
        int discarded$0 = -1840;
        this.f();
        if (param0 < 2) {
            this.e((byte) 53);
        }
    }

    vo(int param0, int param1, int param2, int param3, mh param4, mh param5, mh param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        RuntimeException var16 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((vo) this).field_Q = 1024;
        ((vo) this).field_R = 0;
        ((vo) this).field_O = 8192;
        ((vo) this).field_L = 0;
        ((vo) this).field_B = true;
        ((vo) this).field_E = 1024;
        ((vo) this).field_D = 32768;
        ((vo) this).field_C = 8192;
        ((vo) this).field_G = 32768;
        try {
          L0: {
            L1: {
              ((vo) this).field_x = new pk[6];
              jh dupTemp$2 = new jh(param0, param1, param7, param8, (mh) null, (qm) null, (pk) (Object) new wp(0, 0, param7, param8, param6, (qm) null), false, false);
              ((vo) this).field_H = dupTemp$2;
              ((vo) this).field_x[0] = (pk) (Object) dupTemp$2;
              wp dupTemp$3 = new wp(param0, param1, param7, param8, param5, (qm) null);
              ((vo) this).field_P = dupTemp$3;
              ((vo) this).field_x[1] = (pk) (Object) dupTemp$3;
              ((vo) this).field_L = param9;
              ((vo) this).field_R = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param12) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((vo) this).field_K = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param11) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((vo) this).field_A = stackIn_7_1 != 0;
            this.b(param13, (byte) 7);
            ((vo) this).a(0, param14);
            ((vo) this).a(96, param0, param1, param3, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var16;
            stackOut_9_1 = new StringBuilder().append("vo.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 44 + param13 + 44 + param14 + 41);
        }
    }

    private final int h(int param0) {
        int var2 = 57 % ((param0 - -47) / 43);
        return (((vo) this).field_H.field_p << 16) / ((vo) this).field_P.field_p;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_46_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 27, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (!((vo) this).field_B) {
                  break L1;
                } else {
                  if (((vo) this).field_H.d(-1)) {
                    if (param3 == 98) {
                      this.a(((vo) this).field_D - ((vo) this).field_E, (byte) -125);
                      stackOut_42_0 = 1;
                      stackIn_43_0 = stackOut_42_0;
                      return stackIn_43_0 != 0;
                    } else {
                      if (param3 == 99) {
                        this.a(((vo) this).field_E + ((vo) this).field_D, (byte) -125);
                        stackOut_40_0 = 1;
                        stackIn_41_0 = stackOut_40_0;
                        return stackIn_41_0 != 0;
                      } else {
                        if (param3 != 96) {
                          if (param3 != 97) {
                            if (param3 == 104) {
                              this.a(((vo) this).field_D + -this.h(123), (byte) -125);
                              stackOut_38_0 = 1;
                              stackIn_39_0 = stackOut_38_0;
                              return stackIn_39_0 != 0;
                            } else {
                              if (param3 != 105) {
                                if (param3 == 102) {
                                  L2: {
                                    if (!((vo) this).field_K) {
                                      break L2;
                                    } else {
                                      if (hw.field_b[82]) {
                                        this.a(0, (byte) -125);
                                        stackOut_36_0 = 1;
                                        stackIn_37_0 = stackOut_36_0;
                                        return stackIn_37_0 != 0;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                  if (((vo) this).field_A) {
                                    this.a((byte) 123, 0);
                                    stackOut_34_0 = 1;
                                    stackIn_35_0 = stackOut_34_0;
                                    return stackIn_35_0 != 0;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (103 != param3) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!((vo) this).field_K) {
                                        break L3;
                                      } else {
                                        if (!hw.field_b[82]) {
                                          break L3;
                                        } else {
                                          this.a(65536, (byte) -125);
                                          stackOut_23_0 = 1;
                                          stackIn_24_0 = stackOut_23_0;
                                          return stackIn_24_0 != 0;
                                        }
                                      }
                                    }
                                    if (((vo) this).field_A) {
                                      this.a((byte) 123, 65536);
                                      stackOut_27_0 = 1;
                                      stackIn_28_0 = stackOut_27_0;
                                      return stackIn_28_0 != 0;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                this.a(((vo) this).field_D + this.h(-111), (byte) -125);
                                stackOut_17_0 = 1;
                                stackIn_18_0 = stackOut_17_0;
                                return stackIn_18_0 != 0;
                              }
                            }
                          } else {
                            this.a((byte) -122, ((vo) this).field_G - -((vo) this).field_Q);
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          }
                        } else {
                          this.a((byte) -124, -((vo) this).field_Q + ((vo) this).field_G);
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L4: {
                if (param2 > 9) {
                  break L4;
                } else {
                  this.a(true, 89);
                  break L4;
                }
              }
              stackOut_46_0 = 0;
              stackIn_47_0 = stackOut_46_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var5;
            stackOut_48_1 = new StringBuilder().append("vo.KA(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L5;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_47_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = -1;
    }
}
