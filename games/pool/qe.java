/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends ma {
    byte field_H;
    int field_P;
    int field_M;
    int field_N;
    static String field_r;
    byte field_D;
    static String field_F;
    static String field_K;
    static int field_y;
    int field_n;
    ge field_T;
    static String field_p;
    static String field_B;
    int field_u;
    short field_C;
    int field_I;
    ko field_m;
    byte field_w;
    int[] field_U;
    static String field_G;
    static String field_O;
    int field_v;
    boolean field_t;
    int field_L;
    static int field_o;
    static oc[] field_S;
    int field_Q;
    int field_z;
    int field_q;
    static int field_J;
    short field_A;
    boolean field_E;
    short field_V;
    byte field_l;
    ko field_R;
    long field_x;
    int field_s;

    final boolean a(byte param0, int param1) {
        aa var3 = null;
        int var4 = 0;
        cr var5 = null;
        var3 = new aa(this.field_m);
        var4 = 105 / ((param0 - -53) / 59);
        var5 = (cr) ((Object) var3.b((byte) -92));
        L0: while (true) {
          if (var5 != null) {
            if (var5.field_n == param1) {
              return true;
            } else {
              var5 = (cr) ((Object) var3.b(-108));
              continue L0;
            }
          } else {
            return false;
          }
        }
    }

    final static tc b(boolean param0) {
        if (!param0) {
            field_K = (String) null;
            return w.a(false, 1);
        }
        return w.a(false, 1);
    }

    final String a(int param0, al param1) {
        tc discarded$1 = null;
        RuntimeException var3 = null;
        String var3_ref = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                discarded$1 = qe.b(false);
                break L1;
              }
            }
            L2: {
              var5 = "Shot " + this.field_v + " " + am.a(8, this.field_q) + " player " + param1.field_h[this.field_L];
              var3_ref = var5;
              var3_ref = var5;
              var3_ref = var5;
              if (0 <= this.field_M) {
                var3_ref = var5 + " break seed " + this.field_M;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var4 = this.field_u;
              if ((var4 ^ -1) != -3) {
                if (-4 != (var4 ^ -1)) {
                  if (var4 == 1) {
                    var3_ref = var3_ref + " BiH kitchen";
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var3_ref = var3_ref + " BiH D";
                  break L3;
                }
              } else {
                var3_ref = var3_ref + " BiH anywhere";
                break L3;
              }
            }
            L4: {
              var6 = var3_ref + " before_group_on=" + this.field_z;
              var3_ref = var6;
              if (null != this.field_T) {
                break L4;
              } else {
                var3_ref = var6 + " before state null!";
                break L4;
              }
            }
            stackOut_16_0 = (String) (var3_ref);
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("qe.E(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    final boolean a(int param0) {
        if (param0 <= -66) {
          if (0 != (ab.field_g & this.field_s)) {
            if ((24 & this.field_l) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(ge param0, byte param1) {
        if (param1 != 0) {
            return;
        }
        try {
            param0.a((int) this.field_l, false);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "qe.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_K = null;
        field_B = null;
        field_r = null;
        field_F = null;
        field_G = null;
        if (param0 < 100) {
          return;
        } else {
          field_p = null;
          field_O = null;
          field_S = null;
          return;
        }
    }

    final void a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_R) {
                this.field_R = new ko();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_R.b((byte) 124, new dn(param0, param2));
              if (param1 == -14) {
                break L2;
              } else {
                field_S = (oc[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("qe.W(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        tc discarded$0 = null;
        p.a(param3, param2 ^ 40844);
        hp.a(param1, param3, param0, 30);
        if (param2 != -40960) {
            discarded$0 = qe.b(false);
        }
    }

    final void b(byte param0, ge param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1.g(-105), true);
              if (!this.d(117)) {
                this.field_q = 3;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 13) {
                break L2;
              } else {
                discarded$2 = this.a(30, -70);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("qe.H(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param5 >= qh.field_b) {
                break L1;
              } else {
                param0 = param0 - (-param5 + qh.field_b);
                param5 = qh.field_b;
                break L1;
              }
            }
            L2: {
              if (param3 >= qh.field_c) {
                break L2;
              } else {
                param1 = param1 - (-param3 + qh.field_c);
                param3 = qh.field_c;
                break L2;
              }
            }
            L3: {
              if (qh.field_j >= param0 + param5) {
                break L3;
              } else {
                param0 = qh.field_j - param5;
                break L3;
              }
            }
            L4: {
              if (qh.field_g >= param3 + param1) {
                break L4;
              } else {
                param1 = qh.field_g + -param3;
                break L4;
              }
            }
            L5: {
              if (-1 <= (param0 ^ -1)) {
                break L5;
              } else {
                if ((param1 ^ -1) < -1) {
                  var6_int = param5 - -(qh.field_l * param3);
                  var7 = -param0 + qh.field_l;
                  param3 = -param1;
                  if (param4 >= 94) {
                    L6: while (true) {
                      if (0 <= param3) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param5 = -param0;
                        L7: while (true) {
                          if (0 <= param5) {
                            var6_int = var6_int + var7;
                            param3++;
                            continue L6;
                          } else {
                            L8: {
                              var8 = qh.field_d[var6_int];
                              if (param2 >= (65280 & var8) >> -2093264728) {
                                break L8;
                              } else {
                                if ((var8 & 65280) >> 1123533864 < (var8 & 16711680) >> 8653456) {
                                  break L8;
                                } else {
                                  L9: {
                                    var9 = ((16711680 & var8) >> -946288753) - 60;
                                    if (-256 <= (var9 ^ -1)) {
                                      break L9;
                                    } else {
                                      var9 = 255;
                                      break L9;
                                    }
                                  }
                                  var10 = 65280 & var8;
                                  var10 = 65280 & (var10 >> 564463041) - (var10 >> 2095801381);
                                  var11 = (255 & var8) >> -249552189;
                                  qh.field_d[var6_int] = md.a(var11, md.a(var9 << -553475728, var10));
                                  break L8;
                                }
                              }
                            }
                            var6_int++;
                            param5++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var6), "qe.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = param0;
        var3 = im.field_fc;
        if (-6 >= (var3 ^ -1)) {
          if (var3 >= 105) {
            if (120 <= var3) {
              L0: {
                var4 = 1;
                var5 = 0;
                if (-2 == (param1 ^ -1)) {
                  var5 = 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if ((param1 ^ -1) != -4) {
                  break L1;
                } else {
                  var4 = -1;
                  break L1;
                }
              }
              L2: {
                if ((param1 ^ -1) == -5) {
                  var5 = 1;
                  var4 = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (-6 == (param1 ^ -1)) {
                  var4 = -1;
                  var5 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                L6: {
                  if (param1 == 7) {
                    break L6;
                  } else {
                    if ((param1 ^ -1) == -9) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                var4 = -1;
                var5 = -1;
                break L5;
              }
              L7: {
                if (-12 == (param1 ^ -1)) {
                  var4 = -1;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (-13 == (param1 ^ -1)) {
                  var4 = -1;
                  var5 = -1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((param1 ^ -1) == -14) {
                  var5 = -1;
                  var4 = 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if ((param1 ^ -1) == -15) {
                  var5 = 1;
                  var4 = -1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (param1 != 15) {
                  break L11;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L11;
                }
              }
              li.field_b = cf.a(var2 * var5, false, var2 * var4);
              return;
            } else {
              L12: {
                var3 = -var3 + 120;
                var2 = 8192 - var3 * (var3 * 8192) / 3300;
                var4 = 1;
                var5 = 0;
                if (-2 == (param1 ^ -1)) {
                  var5 = 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if ((param1 ^ -1) != -4) {
                  break L13;
                } else {
                  var4 = -1;
                  break L13;
                }
              }
              L14: {
                if ((param1 ^ -1) == -5) {
                  var5 = 1;
                  var4 = 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (-6 == (param1 ^ -1)) {
                  var4 = -1;
                  var5 = 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (param1 == 6) {
                  var5 = -1;
                  var4 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                L18: {
                  if (param1 == 7) {
                    break L18;
                  } else {
                    if ((param1 ^ -1) == -9) {
                      break L18;
                    } else {
                      break L17;
                    }
                  }
                }
                var4 = -1;
                var5 = -1;
                break L17;
              }
              L19: {
                if (-12 == (param1 ^ -1)) {
                  var4 = -1;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (-13 == (param1 ^ -1)) {
                  var4 = -1;
                  var5 = -1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if ((param1 ^ -1) == -14) {
                  var5 = -1;
                  var4 = 1;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if ((param1 ^ -1) == -15) {
                  var5 = 1;
                  var4 = -1;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                if (param1 != 15) {
                  break L23;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L23;
                }
              }
              li.field_b = cf.a(var2 * var5, false, var2 * var4);
              return;
            }
          } else {
            L24: {
              var2 = (-40960 + 16384 * var3) / 220;
              var4 = 1;
              var5 = 0;
              if (-2 == (param1 ^ -1)) {
                var5 = 1;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if ((param1 ^ -1) != -4) {
                break L25;
              } else {
                var4 = -1;
                break L25;
              }
            }
            L26: {
              if ((param1 ^ -1) == -5) {
                var5 = 1;
                var4 = 1;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (-6 == (param1 ^ -1)) {
                var4 = -1;
                var5 = 1;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (param1 == 6) {
                var5 = -1;
                var4 = 1;
                break L28;
              } else {
                break L28;
              }
            }
            if (param1 != 7) {
              if ((param1 ^ -1) == -9) {
                L29: {
                  var4 = -1;
                  var5 = -1;
                  if (-12 == (param1 ^ -1)) {
                    var4 = -1;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (-13 == (param1 ^ -1)) {
                    var4 = -1;
                    var5 = -1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if ((param1 ^ -1) == -14) {
                    var5 = -1;
                    var4 = 1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if ((param1 ^ -1) == -15) {
                    var5 = 1;
                    var4 = -1;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param1 != 15) {
                    break L33;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L33;
                  }
                }
                li.field_b = cf.a(var2 * var5, false, var2 * var4);
                return;
              } else {
                L34: {
                  if (-12 == (param1 ^ -1)) {
                    var4 = -1;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (-13 == (param1 ^ -1)) {
                    var4 = -1;
                    var5 = -1;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if ((param1 ^ -1) == -14) {
                    var5 = -1;
                    var4 = 1;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if ((param1 ^ -1) == -15) {
                    var5 = 1;
                    var4 = -1;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (param1 != 15) {
                    break L38;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L38;
                  }
                }
                li.field_b = cf.a(var2 * var5, false, var2 * var4);
                return;
              }
            } else {
              L39: {
                var4 = -1;
                var5 = -1;
                if (-12 == (param1 ^ -1)) {
                  var4 = -1;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (-13 == (param1 ^ -1)) {
                  var4 = -1;
                  var5 = -1;
                  break L40;
                } else {
                  break L40;
                }
              }
              L41: {
                if ((param1 ^ -1) == -14) {
                  var5 = -1;
                  var4 = 1;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if ((param1 ^ -1) == -15) {
                  var5 = 1;
                  var4 = -1;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (param1 != 15) {
                  break L43;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L43;
                }
              }
              li.field_b = cf.a(var2 * var5, false, var2 * var4);
              return;
            }
          }
        } else {
          L44: {
            var2 = var3 * var3 * 8192 / 1100;
            var4 = 1;
            var5 = 0;
            if (-2 == (param1 ^ -1)) {
              var5 = 1;
              break L44;
            } else {
              break L44;
            }
          }
          L45: {
            if ((param1 ^ -1) != -4) {
              break L45;
            } else {
              var4 = -1;
              break L45;
            }
          }
          L46: {
            if ((param1 ^ -1) == -5) {
              var5 = 1;
              var4 = 1;
              break L46;
            } else {
              break L46;
            }
          }
          L47: {
            if (-6 == (param1 ^ -1)) {
              var4 = -1;
              var5 = 1;
              break L47;
            } else {
              break L47;
            }
          }
          L48: {
            if (param1 == 6) {
              var5 = -1;
              var4 = 1;
              break L48;
            } else {
              break L48;
            }
          }
          if (param1 != 7) {
            if ((param1 ^ -1) == -9) {
              L49: {
                var4 = -1;
                var5 = -1;
                if (-12 == (param1 ^ -1)) {
                  var4 = -1;
                  break L49;
                } else {
                  break L49;
                }
              }
              L50: {
                if (-13 == (param1 ^ -1)) {
                  var4 = -1;
                  var5 = -1;
                  break L50;
                } else {
                  break L50;
                }
              }
              L51: {
                if ((param1 ^ -1) == -14) {
                  var5 = -1;
                  var4 = 1;
                  break L51;
                } else {
                  break L51;
                }
              }
              L52: {
                if ((param1 ^ -1) == -15) {
                  var5 = 1;
                  var4 = -1;
                  break L52;
                } else {
                  break L52;
                }
              }
              L53: {
                if (param1 != 15) {
                  break L53;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L53;
                }
              }
              li.field_b = cf.a(var2 * var5, false, var2 * var4);
              return;
            } else {
              L54: {
                if (-12 == (param1 ^ -1)) {
                  var4 = -1;
                  break L54;
                } else {
                  break L54;
                }
              }
              L55: {
                if (-13 == (param1 ^ -1)) {
                  var4 = -1;
                  var5 = -1;
                  break L55;
                } else {
                  break L55;
                }
              }
              L56: {
                if ((param1 ^ -1) == -14) {
                  var5 = -1;
                  var4 = 1;
                  break L56;
                } else {
                  break L56;
                }
              }
              L57: {
                if ((param1 ^ -1) == -15) {
                  var5 = 1;
                  var4 = -1;
                  break L57;
                } else {
                  break L57;
                }
              }
              L58: {
                if (param1 != 15) {
                  break L58;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L58;
                }
              }
              li.field_b = cf.a(var2 * var5, false, var2 * var4);
              return;
            }
          } else {
            L59: {
              var4 = -1;
              var5 = -1;
              if (-12 == (param1 ^ -1)) {
                var4 = -1;
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              if (-13 == (param1 ^ -1)) {
                var4 = -1;
                var5 = -1;
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              if ((param1 ^ -1) == -14) {
                var5 = -1;
                var4 = 1;
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              if ((param1 ^ -1) == -15) {
                var5 = 1;
                var4 = -1;
                break L62;
              } else {
                break L62;
              }
            }
            L63: {
              if (param1 != 15) {
                break L63;
              } else {
                var4 = 1;
                var5 = 1;
                break L63;
              }
            }
            li.field_b = cf.a(var2 * var5, false, var2 * var4);
            return;
          }
        }
    }

    final byte c(byte param0, ge param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -28) {
                break L1;
              } else {
                this.field_T = (ge) null;
                break L1;
              }
            }
            var3_int = param1.g(-78) & 255;
            if ((this.field_v & 255) != var3_int) {
              param1.field_v = param1.field_v + 6;
              if (var3_int < this.field_v - 1) {
                System.out.println("Read the wrong move packet. Wanted " + this.field_v + ", but got " + var3_int);
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return (byte) 1;
              }
            } else {
              var4 = param1.d((byte) -80);
              var5 = param1.d((byte) -108);
              var6 = param1.d((byte) -103);
              var7 = param1.e((byte) 105);
              var8 = param1.e((byte) 105);
              if (this.field_q == 0) {
                this.field_D = (byte)var7;
                this.field_H = (byte)var8;
                this.field_C = (short)var4;
                this.field_V = (short)var6;
                this.field_A = (short)var5;
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (this.field_C != var4) {
                      break L3;
                    } else {
                      if (var5 != this.field_A) {
                        break L3;
                      } else {
                        if (var6 != this.field_V) {
                          break L3;
                        } else {
                          if (this.field_D != var7) {
                            break L3;
                          } else {
                            if (var8 != this.field_H) {
                              break L3;
                            } else {
                              stackOut_9_0 = 0;
                              stackIn_11_0 = stackOut_9_0;
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_10_0 = 2;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("qe.J(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte) stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte) stackIn_13_0;
          } else {
            return (byte) stackIn_17_0;
          }
        }
    }

    final void b(ge param0, byte param1) {
        String discarded$2 = null;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (this.field_q == 2) {
                break L1;
              } else {
                if (3 != this.field_q) {
                  throw new IllegalStateException("Can't write an end resolution until the shot is finished");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param0.b(this.field_s, 66);
              if (param1 < -65) {
                break L2;
              } else {
                discarded$2 = qe.a(false, 'ﾨ');
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("qe.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final String a(boolean param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          var3 = "end choice: ";
          var2 = var3;
          var2 = var3;
          var2 = var3;
          if (-1 != (this.field_l & 1 ^ -1)) {
            var2 = var3 + "; group 0";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((this.field_l & 2) == 0) {
            break L1;
          } else {
            var2 = var2 + "; group 1";
            break L1;
          }
        }
        L2: {
          if ((this.field_l & 16) == 0) {
            break L2;
          } else {
            var2 = var2 + "; pass";
            break L2;
          }
        }
        if (!param0) {
          L3: {
            qe.a(82, -62, 92, 61, (byte) 96, -63);
            if ((8 & this.field_l) == 0) {
              break L3;
            } else {
              var2 = var2 + "; play";
              break L3;
            }
          }
          L4: {
            if ((64 & this.field_l) == 0) {
              break L4;
            } else {
              var2 = var2 + "; opponent pass";
              break L4;
            }
          }
          L5: {
            if (0 != (this.field_l & 32)) {
              var2 = var2 + "; opponent play";
              break L5;
            } else {
              break L5;
            }
          }
          return var2;
        } else {
          L6: {
            if ((8 & this.field_l) == 0) {
              break L6;
            } else {
              var2 = var2 + "; play";
              break L6;
            }
          }
          L7: {
            if ((64 & this.field_l) == 0) {
              break L7;
            } else {
              var2 = var2 + "; opponent pass";
              break L7;
            }
          }
          L8: {
            if (0 != (this.field_l & 32)) {
              var2 = var2 + "; opponent play";
              break L8;
            } else {
              break L8;
            }
          }
          return var2;
        }
    }

    final void a(al param0, ge param1, int param2) {
        al var6 = null;
        pq var5 = null;
        ge var4_ref = null;
        try {
            var6 = param0;
            al var4 = var6;
            var5 = var6.field_l[0];
            this.field_Q = var5.field_k;
            this.field_P = var5.field_g;
            if (param2 != -7478) {
                this.field_t = false;
            }
            var4_ref = param1;
            var4_ref.a(true, this.field_P);
            var4_ref.a(true, this.field_Q);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "qe.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String c(int param0) {
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_4_0 = null;
        String stackIn_4_1 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_8_0 = null;
        String stackIn_8_1 = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_7_0 = null;
        String stackOut_7_1 = null;
        StringBuilder stackOut_6_0 = null;
        String stackOut_6_1 = null;
        StringBuilder stackOut_1_0 = null;
        StringBuilder stackOut_3_0 = null;
        String stackOut_3_1 = null;
        StringBuilder stackOut_2_0 = null;
        String stackOut_2_1 = null;
        if (param0 != 26859) {
          L0: {
            field_p = (String) null;
            stackOut_5_0 = new StringBuilder().append("firstcontactid: ").append(this.field_n).append(", pottings: ").append(this.field_m.a(45));
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (this.field_t) {
              stackOut_7_0 = (StringBuilder) ((Object) stackIn_7_0);
              stackOut_7_1 = ", fouled";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (StringBuilder) ((Object) stackIn_6_0);
              stackOut_6_1 = "";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          return stackIn_8_1 + ", resolution: " + ab.a(this.field_s, (byte) 10);
        } else {
          L1: {
            stackOut_1_0 = new StringBuilder().append("firstcontactid: ").append(this.field_n).append(", pottings: ").append(this.field_m.a(45));
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (this.field_t) {
              stackOut_3_0 = (StringBuilder) ((Object) stackIn_3_0);
              stackOut_3_1 = ", fouled";
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (StringBuilder) ((Object) stackIn_2_0);
              stackOut_2_1 = "";
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          return stackIn_4_1 + ", resolution: " + ab.a(this.field_s, (byte) 10);
        }
    }

    final boolean c(boolean param0) {
        if (param0) {
          if (0 != (oa.field_b & this.field_s)) {
            if (-1 != (3 & this.field_l ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final String e(int param0) {
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_5_0 = null;
        String stackIn_5_1 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackOut_2_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_3_0 = null;
        String stackOut_3_1 = null;
        if (param0 == 0) {
          stackOut_2_0 = new StringBuilder().append("ang=").append(this.field_C).append(",").append(this.field_A).append("; pow=").append(this.field_V).append("; strk=").append(this.field_D).append(",").append(this.field_H);
          stackIn_6_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (-1 != this.field_P) {
            stackOut_6_0 = (StringBuilder) ((Object) stackIn_6_0);
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if ((this.field_Q ^ -1) == 0) {
              return "";
            } else {
              return " cueball@" + this.field_P + "," + this.field_Q;
            }
          } else {
            stackOut_3_0 = (StringBuilder) ((Object) stackIn_3_0);
            stackOut_3_1 = "";
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            return stackIn_5_1;
          }
        } else {
          return (String) null;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        ge var5 = null;
        L0: {
          var4 = Pool.field_O;
          if (-1 == (oa.field_b & this.field_s ^ -1)) {
            break L0;
          } else {
            if ((3 & param0) != 0) {
              var3 = this.field_l & 3;
              if (-1 == (var3 ^ -1)) {
                var3 = param0;
                this.field_l = (byte)(this.field_l | param0);
                break L0;
              } else {
                if (var3 == param0) {
                  L1: {
                    if ((ab.field_g & this.field_s) == 0) {
                      break L1;
                    } else {
                      if ((param0 & 24) == 0) {
                        break L1;
                      } else {
                        var3 = this.field_l & 24;
                        if (var3 == 0) {
                          var3 = param0;
                          this.field_l = (byte)(this.field_l | param0);
                          break L1;
                        } else {
                          if (param0 != var3) {
                            throw new IllegalStateException("Already made another play/pass choice!");
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  L2: {
                    if (-1 == (a.field_d & this.field_s ^ -1)) {
                      break L2;
                    } else {
                      if (-1 == (96 & param0 ^ -1)) {
                        break L2;
                      } else {
                        var3 = this.field_l & 96;
                        if (var3 != 0) {
                          if (var3 != param0) {
                            throw new IllegalStateException("Already made another opponent play/pass choice!");
                          } else {
                            break L2;
                          }
                        } else {
                          var3 = param0;
                          this.field_l = (byte)(this.field_l | param0);
                          break L2;
                        }
                      }
                    }
                  }
                  if (!this.a(-28872, param0)) {
                    throw new IllegalStateException("Can't make a choice now!");
                  } else {
                    this.field_l = (byte)(this.field_l | param0);
                    if (!param1) {
                      var5 = (ge) null;
                      this.b((byte) 32, (ge) null);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  throw new IllegalStateException("Already made another group choice!");
                }
              }
            } else {
              if ((ab.field_g & this.field_s) != 0) {
                if ((param0 & 24) != 0) {
                  L3: {
                    var3 = this.field_l & 24;
                    if (var3 == 0) {
                      var3 = param0;
                      this.field_l = (byte)(this.field_l | param0);
                      break L3;
                    } else {
                      if (param0 != var3) {
                        throw new IllegalStateException("Already made another play/pass choice!");
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (-1 == (a.field_d & this.field_s ^ -1)) {
                      break L4;
                    } else {
                      if (-1 == (96 & param0 ^ -1)) {
                        break L4;
                      } else {
                        var3 = this.field_l & 96;
                        if (var3 != 0) {
                          if (var3 != param0) {
                            throw new IllegalStateException("Already made another opponent play/pass choice!");
                          } else {
                            break L4;
                          }
                        } else {
                          var3 = param0;
                          this.field_l = (byte)(this.field_l | param0);
                          break L4;
                        }
                      }
                    }
                  }
                  if (!this.a(-28872, param0)) {
                    throw new IllegalStateException("Can't make a choice now!");
                  } else {
                    this.field_l = (byte)(this.field_l | param0);
                    L5: {
                      if (param1) {
                        break L5;
                      } else {
                        var5 = (ge) null;
                        this.b((byte) 32, (ge) null);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L6: {
                    if (-1 == (a.field_d & this.field_s ^ -1)) {
                      break L6;
                    } else {
                      if (-1 == (96 & param0 ^ -1)) {
                        break L6;
                      } else {
                        var3 = this.field_l & 96;
                        if (var3 != 0) {
                          if (var3 != param0) {
                            throw new IllegalStateException("Already made another opponent play/pass choice!");
                          } else {
                            break L6;
                          }
                        } else {
                          var3 = param0;
                          this.field_l = (byte)(this.field_l | param0);
                          break L6;
                        }
                      }
                    }
                  }
                  if (!this.a(-28872, param0)) {
                    throw new IllegalStateException("Can't make a choice now!");
                  } else {
                    this.field_l = (byte)(this.field_l | param0);
                    L7: {
                      if (param1) {
                        break L7;
                      } else {
                        var5 = (ge) null;
                        this.b((byte) 32, (ge) null);
                        break L7;
                      }
                    }
                    return;
                  }
                }
              } else {
                L8: {
                  if (-1 == (a.field_d & this.field_s ^ -1)) {
                    break L8;
                  } else {
                    if (-1 == (96 & param0 ^ -1)) {
                      break L8;
                    } else {
                      var3 = this.field_l & 96;
                      if (var3 != 0) {
                        if (var3 != param0) {
                          throw new IllegalStateException("Already made another opponent play/pass choice!");
                        } else {
                          break L8;
                        }
                      } else {
                        var3 = param0;
                        this.field_l = (byte)(this.field_l | param0);
                        break L8;
                      }
                    }
                  }
                }
                if (!this.a(-28872, param0)) {
                  throw new IllegalStateException("Can't make a choice now!");
                } else {
                  this.field_l = (byte)(this.field_l | param0);
                  L9: {
                    if (param1) {
                      break L9;
                    } else {
                      var5 = (ge) null;
                      this.b((byte) 32, (ge) null);
                      break L9;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        if ((ab.field_g & this.field_s) != 0) {
          if ((param0 & 24) != 0) {
            var3 = this.field_l & 24;
            if (var3 == 0) {
              L10: {
                var3 = param0;
                this.field_l = (byte)(this.field_l | param0);
                if (-1 == (a.field_d & this.field_s ^ -1)) {
                  break L10;
                } else {
                  if (-1 == (96 & param0 ^ -1)) {
                    break L10;
                  } else {
                    var3 = this.field_l & 96;
                    if (var3 != 0) {
                      if (var3 != param0) {
                        throw new IllegalStateException("Already made another opponent play/pass choice!");
                      } else {
                        if (!this.a(-28872, param0)) {
                          throw new IllegalStateException("Can't make a choice now!");
                        } else {
                          this.field_l = (byte)(this.field_l | param0);
                          if (param1) {
                            return;
                          } else {
                            var5 = (ge) null;
                            this.b((byte) 32, (ge) null);
                            return;
                          }
                        }
                      }
                    } else {
                      var3 = param0;
                      this.field_l = (byte)(this.field_l | param0);
                      if (!this.a(-28872, param0)) {
                        throw new IllegalStateException("Can't make a choice now!");
                      } else {
                        this.field_l = (byte)(this.field_l | param0);
                        if (param1) {
                          return;
                        } else {
                          var5 = (ge) null;
                          this.b((byte) 32, (ge) null);
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (!this.a(-28872, param0)) {
                throw new IllegalStateException("Can't make a choice now!");
              } else {
                this.field_l = (byte)(this.field_l | param0);
                if (param1) {
                  return;
                } else {
                  var5 = (ge) null;
                  this.b((byte) 32, (ge) null);
                  return;
                }
              }
            } else {
              if (param0 == var3) {
                L11: {
                  if (-1 == (a.field_d & this.field_s ^ -1)) {
                    break L11;
                  } else {
                    if (-1 == (96 & param0 ^ -1)) {
                      break L11;
                    } else {
                      var3 = this.field_l & 96;
                      if (var3 != 0) {
                        if (var3 == param0) {
                          if (!this.a(-28872, param0)) {
                            throw new IllegalStateException("Can't make a choice now!");
                          } else {
                            this.field_l = (byte)(this.field_l | param0);
                            if (param1) {
                              return;
                            } else {
                              var5 = (ge) null;
                              this.b((byte) 32, (ge) null);
                              return;
                            }
                          }
                        } else {
                          throw new IllegalStateException("Already made another opponent play/pass choice!");
                        }
                      } else {
                        var3 = param0;
                        this.field_l = (byte)(this.field_l | param0);
                        if (!this.a(-28872, param0)) {
                          throw new IllegalStateException("Can't make a choice now!");
                        } else {
                          this.field_l = (byte)(this.field_l | param0);
                          L12: {
                            if (param1) {
                              break L12;
                            } else {
                              var5 = (ge) null;
                              this.b((byte) 32, (ge) null);
                              break L12;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
                if (!this.a(-28872, param0)) {
                  throw new IllegalStateException("Can't make a choice now!");
                } else {
                  this.field_l = (byte)(this.field_l | param0);
                  if (param1) {
                    return;
                  } else {
                    var5 = (ge) null;
                    this.b((byte) 32, (ge) null);
                    return;
                  }
                }
              } else {
                throw new IllegalStateException("Already made another play/pass choice!");
              }
            }
          } else {
            L13: {
              if (-1 == (a.field_d & this.field_s ^ -1)) {
                break L13;
              } else {
                if (-1 == (96 & param0 ^ -1)) {
                  break L13;
                } else {
                  var3 = this.field_l & 96;
                  if (var3 != 0) {
                    if (var3 == param0) {
                      if (!this.a(-28872, param0)) {
                        throw new IllegalStateException("Can't make a choice now!");
                      } else {
                        this.field_l = (byte)(this.field_l | param0);
                        if (param1) {
                          return;
                        } else {
                          var5 = (ge) null;
                          this.b((byte) 32, (ge) null);
                          return;
                        }
                      }
                    } else {
                      throw new IllegalStateException("Already made another opponent play/pass choice!");
                    }
                  } else {
                    var3 = param0;
                    this.field_l = (byte)(this.field_l | param0);
                    if (!this.a(-28872, param0)) {
                      throw new IllegalStateException("Can't make a choice now!");
                    } else {
                      this.field_l = (byte)(this.field_l | param0);
                      if (!param1) {
                        var5 = (ge) null;
                        this.b((byte) 32, (ge) null);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (!this.a(-28872, param0)) {
              throw new IllegalStateException("Can't make a choice now!");
            } else {
              this.field_l = (byte)(this.field_l | param0);
              if (param1) {
                return;
              } else {
                var5 = (ge) null;
                this.b((byte) 32, (ge) null);
                return;
              }
            }
          }
        } else {
          L14: {
            if (-1 == (a.field_d & this.field_s ^ -1)) {
              break L14;
            } else {
              if (-1 == (96 & param0 ^ -1)) {
                break L14;
              } else {
                var3 = this.field_l & 96;
                if (var3 != 0) {
                  if (var3 == param0) {
                    if (!this.a(-28872, param0)) {
                      throw new IllegalStateException("Can't make a choice now!");
                    } else {
                      this.field_l = (byte)(this.field_l | param0);
                      if (!param1) {
                        var5 = (ge) null;
                        this.b((byte) 32, (ge) null);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    throw new IllegalStateException("Already made another opponent play/pass choice!");
                  }
                } else {
                  var3 = param0;
                  this.field_l = (byte)(this.field_l | param0);
                  if (!this.a(-28872, param0)) {
                    throw new IllegalStateException("Can't make a choice now!");
                  } else {
                    this.field_l = (byte)(this.field_l | param0);
                    if (!param1) {
                      var5 = (ge) null;
                      this.b((byte) 32, (ge) null);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
          if (!this.a(-28872, param0)) {
            throw new IllegalStateException("Can't make a choice now!");
          } else {
            this.field_l = (byte)(this.field_l | param0);
            if (!param1) {
              var5 = (ge) null;
              this.b((byte) 32, (ge) null);
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean d(int param0) {
        if (this.field_s != uk.field_a) {
          if (param0 >= 105) {
            if (!this.c(true)) {
              if (!this.a(-103)) {
                if (this.c((byte) 85)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, ge param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var3_int = param1.f(98);
            if (param0 >= 76) {
              L1: {
                this.c(2, var3_int);
                if ((pd.field_i & 2097152L) != 0L) {
                  System.out.println("->S2C_END_SHOT: " + ab.a(this.field_s, (byte) 10));
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("qe.F(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(boolean param0, char param1) {
        if (param0) {
            return (String) null;
        }
        return String.valueOf(param1);
    }

    final void c(int param0, int param1) {
        try {
            if (param0 == 2) {
              if (uk.field_a != this.field_s) {
                if (this.field_s != param1) {
                  tc.a(new Throwable(), "New end resolution 0b" + Integer.toString(this.field_s, 2) + ": " + wd.b(param1, param0 ^ 87) + " does not match current one 0b" + Integer.toString(param1, 2) + ": " + wd.b(this.field_s, 77), -8555);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_s = param1;
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_101_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        if ((this.field_s & oa.field_b) != 0) {
          if ((param1 & 3) != 0) {
            L0: {
              if (-1 == (3 & this.field_l ^ -1)) {
                stackOut_99_0 = 1;
                stackIn_101_0 = stackOut_99_0;
                break L0;
              } else {
                if ((3 & this.field_l) != param1) {
                  stackOut_100_0 = 0;
                  stackIn_101_0 = stackOut_100_0;
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return stackIn_101_0 != 0;
          } else {
            L1: {
              if ((ab.field_g & this.field_s) == 0) {
                break L1;
              } else {
                if (0 == (24 & param1)) {
                  break L1;
                } else {
                  if ((24 & this.field_l) != 0) {
                    if ((24 & this.field_l) != param1) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    stackOut_51_0 = 1;
                    stackIn_53_0 = stackOut_51_0;
                    return stackIn_53_0 != 0;
                  }
                }
              }
            }
            if (param0 == -28872) {
              if ((this.field_s & a.field_d) != 0) {
                if ((param1 & 96) != 0) {
                  if ((this.field_l & 96) != 0) {
                    if (param1 != (96 & this.field_l)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    stackOut_88_0 = 1;
                    stackIn_90_0 = stackOut_88_0;
                    return stackIn_90_0 != 0;
                  }
                } else {
                  L2: {
                    if (param1 != 0) {
                      stackOut_85_0 = 0;
                      stackIn_86_0 = stackOut_85_0;
                      break L2;
                    } else {
                      stackOut_84_0 = 1;
                      stackIn_86_0 = stackOut_84_0;
                      break L2;
                    }
                  }
                  return stackIn_86_0 != 0;
                }
              } else {
                L3: {
                  if (param1 != 0) {
                    stackOut_80_0 = 0;
                    stackIn_81_0 = stackOut_80_0;
                    break L3;
                  } else {
                    stackOut_79_0 = 1;
                    stackIn_81_0 = stackOut_79_0;
                    break L3;
                  }
                }
                return stackIn_81_0 != 0;
              }
            } else {
              this.field_A = (short) 5;
              if ((this.field_s & a.field_d) != 0) {
                if ((param1 & 96) != 0) {
                  if ((this.field_l & 96) != 0) {
                    if (param1 == (96 & this.field_l)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_70_0 = 1;
                    stackIn_72_0 = stackOut_70_0;
                    return stackIn_72_0 != 0;
                  }
                } else {
                  L4: {
                    if (param1 != 0) {
                      stackOut_67_0 = 0;
                      stackIn_68_0 = stackOut_67_0;
                      break L4;
                    } else {
                      stackOut_66_0 = 1;
                      stackIn_68_0 = stackOut_66_0;
                      break L4;
                    }
                  }
                  return stackIn_68_0 != 0;
                }
              } else {
                L5: {
                  if (param1 != 0) {
                    stackOut_62_0 = 0;
                    stackIn_63_0 = stackOut_62_0;
                    break L5;
                  } else {
                    stackOut_61_0 = 1;
                    stackIn_63_0 = stackOut_61_0;
                    break L5;
                  }
                }
                return stackIn_63_0 != 0;
              }
            }
          }
        } else {
          L6: {
            if ((ab.field_g & this.field_s) == 0) {
              break L6;
            } else {
              if (0 == (24 & param1)) {
                break L6;
              } else {
                if ((24 & this.field_l) != 0) {
                  if ((24 & this.field_l) == param1) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  return stackIn_6_0 != 0;
                }
              }
            }
          }
          if (param0 == -28872) {
            if ((this.field_s & a.field_d) != 0) {
              if ((param1 & 96) != 0) {
                if ((this.field_l & 96) != 0) {
                  if (param1 == (96 & this.field_l)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_40_0 = 1;
                  stackIn_42_0 = stackOut_40_0;
                  return stackIn_42_0 != 0;
                }
              } else {
                L7: {
                  if (param1 != 0) {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    break L7;
                  } else {
                    stackOut_36_0 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    break L7;
                  }
                }
                return stackIn_38_0 != 0;
              }
            } else {
              L8: {
                if (param1 != 0) {
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L8;
                } else {
                  stackOut_31_0 = 1;
                  stackIn_33_0 = stackOut_31_0;
                  break L8;
                }
              }
              return stackIn_33_0 != 0;
            }
          } else {
            this.field_A = (short) 5;
            if ((this.field_s & a.field_d) != 0) {
              if ((param1 & 96) != 0) {
                L9: {
                  L10: {
                    if ((this.field_l & 96) == 0) {
                      break L10;
                    } else {
                      if (param1 != (96 & this.field_l)) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  stackOut_25_0 = 1;
                  stackIn_27_0 = stackOut_25_0;
                  break L9;
                }
                return stackIn_27_0 != 0;
              } else {
                L11: {
                  if (param1 != 0) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L11;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L11;
                  }
                }
                return stackIn_21_0 != 0;
              }
            } else {
              L12: {
                if (param1 != 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L12;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L12;
                }
              }
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final boolean c(byte param0) {
        if (param0 > 73) {
          if (-1 != (this.field_s & a.field_d ^ -1)) {
            if (-1 != (this.field_l & 96 ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_H = (byte) 46;
          if (-1 != (this.field_s & a.field_d ^ -1)) {
            if (-1 != (this.field_l & 96 ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    qe() {
        this.field_N = -1;
        this.field_P = -1;
        this.field_w = (byte) 0;
        this.field_t = false;
        this.field_M = -1;
        this.field_u = 0;
        this.field_Q = -1;
        this.field_q = 0;
        this.field_E = false;
        this.field_I = -1;
        this.field_n = -1;
        this.field_V = (short) -1;
        this.field_m = new ko();
        this.field_x = 0L;
        this.field_l = (byte) 0;
        this.field_R = null;
        this.field_s = uk.field_a;
    }

    qe(int param0, int param1) {
        this.field_N = -1;
        this.field_P = -1;
        this.field_w = (byte) 0;
        this.field_t = false;
        this.field_M = -1;
        this.field_u = 0;
        this.field_Q = -1;
        this.field_q = 0;
        this.field_E = false;
        this.field_I = -1;
        this.field_n = -1;
        this.field_V = (short) -1;
        this.field_m = new ko();
        this.field_x = 0L;
        this.field_l = (byte) 0;
        this.field_R = null;
        this.field_s = uk.field_a;
        this.field_L = param1;
        this.field_v = param0;
    }

    static {
        field_r = "mm:ss.ff";
        field_B = "Honour";
        field_G = "Lost";
        field_K = "Unable to delete friend - system busy";
        field_F = "<%0> is out of lives!";
        field_p = "Menu";
        field_O = "With Guides";
    }
}
