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
        var3 = new aa(((qe) this).field_m);
        var4 = 105 / ((param0 - -53) / 59);
        var5 = (cr) (Object) var3.b((byte) -92);
        L0: while (true) {
          if (var5 != null) {
            if (var5.field_n == param1) {
              return true;
            } else {
              var5 = (cr) (Object) var3.b(-108);
              continue L0;
            }
          } else {
            return false;
          }
        }
    }

    final static tc b(boolean param0) {
        field_K = null;
        return w.a(false, 1);
    }

    final String a(int param0, al param1) {
        RuntimeException var3 = null;
        String var3_ref = null;
        int var4 = 0;
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
                tc discarded$1 = qe.b(false);
                break L1;
              }
            }
            L2: {
              var3_ref = "Shot " + ((qe) this).field_v + " " + am.a(8, ((qe) this).field_q) + " player " + param1.field_h[((qe) this).field_L];
              if (0 <= ((qe) this).field_M) {
                var3_ref = var3_ref + " break seed " + ((qe) this).field_M;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var4 = ((qe) this).field_u;
              if (var4 != 2) {
                if (var4 != 3) {
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
              var3_ref = var3_ref + " before_group_on=" + ((qe) this).field_z;
              if (null != ((qe) this).field_T) {
                break L4;
              } else {
                var3_ref = var3_ref + " before state null!";
                break L4;
              }
            }
            stackOut_16_0 = (String) var3_ref;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("qe.E(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    final boolean a(int param0) {
        if (param0 <= -66) {
          if (0 != (ab.field_g & ((qe) this).field_s)) {
            if ((24 & ((qe) this).field_l) != 0) {
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
            param0.a((int) ((qe) this).field_l, false);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "qe.U(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
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
              if (null == ((qe) this).field_R) {
                ((qe) this).field_R = new ko();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((qe) this).field_R.b((byte) 124, (ma) (Object) new dn(param0, param2));
              if (param1 == -14) {
                break L2;
              } else {
                field_S = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("qe.W(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        p.a(param3, param2 ^ 40844);
        hp.a(param1, param3, param0, 30);
        if (param2 != -40960) {
            tc discarded$0 = qe.b(false);
        }
    }

    final void b(byte param0, ge param1) {
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
              ((qe) this).a(param1.g(-105), true);
              if (!((qe) this).d(117)) {
                ((qe) this).field_q = 3;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 13) {
                break L2;
              } else {
                boolean discarded$2 = this.a(30, -70);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("qe.H(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
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
              if (param0 <= 0) {
                break L5;
              } else {
                if (param1 > 0) {
                  var6_int = param5 - -(qh.field_l * param3);
                  var7 = -param0 + qh.field_l;
                  param3 = -param1;
                  if (param4 >= 94) {
                    L6: while (true) {
                      if (0 <= param3) {
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
                              if (param2 >= (65280 & var8) >> 8) {
                                break L8;
                              } else {
                                if ((var8 & 65280) >> 8 < (var8 & 16711680) >> 16) {
                                  break L8;
                                } else {
                                  L9: {
                                    var9 = ((16711680 & var8) >> 15) - 60;
                                    if (var9 <= 255) {
                                      break L9;
                                    } else {
                                      var9 = 255;
                                      break L9;
                                    }
                                  }
                                  var10 = 65280 & var8;
                                  var10 = 65280 & (var10 >> 1) - (var10 >> 5);
                                  var11 = (255 & var8) >> 3;
                                  qh.field_d[var6_int] = md.a(var11, md.a(var9 << 16, var10));
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
                    return;
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var6, "qe.P(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var2 = param0;
        var3 = im.field_fc;
        if (var3 >= 5) {
          if (var3 >= 105) {
            if (120 > var3) {
              L0: {
                var3 = -var3 + 120;
                var2 = 8192 - var3 * (var3 * 8192) / 3300;
                var4 = 1;
                var5 = 0;
                if (param1 == 1) {
                  var5 = 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param1 != 3) {
                  break L1;
                } else {
                  var4 = -1;
                  break L1;
                }
              }
              L2: {
                if (param1 == 4) {
                  var5 = 1;
                  var4 = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1 == 5) {
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
                    if (param1 == 8) {
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
                if (param1 == 11) {
                  var4 = -1;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param1 == 13) {
                  var5 = -1;
                  var4 = 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (param1 == 14) {
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
                var4 = 1;
                var5 = 0;
                if (param1 == 1) {
                  var5 = 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param1 != 3) {
                  break L13;
                } else {
                  var4 = -1;
                  break L13;
                }
              }
              L14: {
                if (param1 == 4) {
                  var5 = 1;
                  var4 = 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (param1 == 5) {
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
                    if (param1 == 8) {
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
                if (param1 == 11) {
                  var4 = -1;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (param1 == 13) {
                  var5 = -1;
                  var4 = 1;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (param1 == 14) {
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
              if (param1 == 1) {
                var5 = 1;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (param1 != 3) {
                break L25;
              } else {
                var4 = -1;
                break L25;
              }
            }
            L26: {
              if (param1 == 4) {
                var5 = 1;
                var4 = 1;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (param1 == 5) {
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
              if (param1 != 8) {
                L29: {
                  if (param1 == 11) {
                    var4 = -1;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (param1 == 12) {
                    var4 = -1;
                    var5 = -1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param1 == 13) {
                    var5 = -1;
                    var4 = 1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1 == 14) {
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
                  var4 = -1;
                  var5 = -1;
                  if (param1 == 11) {
                    var4 = -1;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (param1 == 12) {
                    var4 = -1;
                    var5 = -1;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param1 == 13) {
                    var5 = -1;
                    var4 = 1;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param1 == 14) {
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
                if (param1 == 11) {
                  var4 = -1;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L40;
                } else {
                  break L40;
                }
              }
              L41: {
                if (param1 == 13) {
                  var5 = -1;
                  var4 = 1;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (param1 == 14) {
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
            if (param1 == 1) {
              var5 = 1;
              break L44;
            } else {
              break L44;
            }
          }
          L45: {
            if (param1 != 3) {
              break L45;
            } else {
              var4 = -1;
              break L45;
            }
          }
          L46: {
            if (param1 == 4) {
              var5 = 1;
              var4 = 1;
              break L46;
            } else {
              break L46;
            }
          }
          L47: {
            if (param1 == 5) {
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
            if (param1 != 8) {
              L49: {
                if (param1 == 11) {
                  var4 = -1;
                  break L49;
                } else {
                  break L49;
                }
              }
              L50: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L50;
                } else {
                  break L50;
                }
              }
              L51: {
                if (param1 == 13) {
                  var5 = -1;
                  var4 = 1;
                  break L51;
                } else {
                  break L51;
                }
              }
              L52: {
                if (param1 == 14) {
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
                var4 = -1;
                var5 = -1;
                if (param1 == 11) {
                  var4 = -1;
                  break L54;
                } else {
                  break L54;
                }
              }
              L55: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L55;
                } else {
                  break L55;
                }
              }
              L56: {
                if (param1 == 13) {
                  var5 = -1;
                  var4 = 1;
                  break L56;
                } else {
                  break L56;
                }
              }
              L57: {
                if (param1 == 14) {
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
              if (param1 == 11) {
                var4 = -1;
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              if (param1 == 12) {
                var4 = -1;
                var5 = -1;
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              if (param1 == 13) {
                var5 = -1;
                var4 = 1;
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              if (param1 == 14) {
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
                ((qe) this).field_T = null;
                break L1;
              }
            }
            var3_int = param1.g(-78) & 255;
            if ((((qe) this).field_v & 255) != var3_int) {
              param1.field_v = param1.field_v + 6;
              if (var3_int < ((qe) this).field_v - 1) {
                System.out.println("Read the wrong move packet. Wanted " + ((qe) this).field_v + ", but got " + var3_int);
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
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
              if (((qe) this).field_q == 0) {
                ((qe) this).field_D = (byte)var7;
                ((qe) this).field_H = (byte)var8;
                ((qe) this).field_C = (short)var4;
                ((qe) this).field_V = (short)var6;
                ((qe) this).field_A = (short)var5;
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                return (byte) stackIn_13_0;
              } else {
                L2: {
                  L3: {
                    if (((qe) this).field_C != var4) {
                      break L3;
                    } else {
                      if (var5 != ((qe) this).field_A) {
                        break L3;
                      } else {
                        if (var6 != ((qe) this).field_V) {
                          break L3;
                        } else {
                          if (((qe) this).field_D != var7) {
                            break L3;
                          } else {
                            if (var8 != ((qe) this).field_H) {
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
                return (byte) stackIn_11_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("qe.J(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return (byte) stackIn_17_0;
    }

    final void b(ge param0, byte param1) {
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
              if (((qe) this).field_q == 2) {
                break L1;
              } else {
                if (3 != ((qe) this).field_q) {
                  throw new IllegalStateException("Can't write an end resolution until the shot is finished");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param0.b(((qe) this).field_s, 66);
              if (param1 < -65) {
                break L2;
              } else {
                String discarded$2 = qe.a(false, 'ﾨ');
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qe.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final String a(boolean param0) {
        String var2 = null;
        L0: {
          var2 = "end choice: ";
          if ((((qe) this).field_l & 1) != 0) {
            var2 = var2 + "; group 0";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((((qe) this).field_l & 2) == 0) {
            break L1;
          } else {
            var2 = var2 + "; group 1";
            break L1;
          }
        }
        L2: {
          if ((((qe) this).field_l & 16) == 0) {
            break L2;
          } else {
            var2 = var2 + "; pass";
            break L2;
          }
        }
        if (!param0) {
          L3: {
            qe.a(82, -62, 92, 61, (byte) 96, -63);
            if ((8 & ((qe) this).field_l) == 0) {
              break L3;
            } else {
              var2 = var2 + "; play";
              break L3;
            }
          }
          L4: {
            if ((64 & ((qe) this).field_l) == 0) {
              break L4;
            } else {
              var2 = var2 + "; opponent pass";
              break L4;
            }
          }
          L5: {
            if (0 != (((qe) this).field_l & 32)) {
              var2 = var2 + "; opponent play";
              break L5;
            } else {
              break L5;
            }
          }
          return var2;
        } else {
          L6: {
            if ((8 & ((qe) this).field_l) == 0) {
              break L6;
            } else {
              var2 = var2 + "; play";
              break L6;
            }
          }
          L7: {
            if ((64 & ((qe) this).field_l) == 0) {
              break L7;
            } else {
              var2 = var2 + "; opponent pass";
              break L7;
            }
          }
          L8: {
            if (0 != (((qe) this).field_l & 32)) {
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
            ((qe) this).field_Q = var5.field_k;
            ((qe) this).field_P = var5.field_g;
            if (param2 != -7478) {
                ((qe) this).field_t = false;
            }
            var4_ref = param1;
            var4_ref.a(true, ((qe) this).field_P);
            var4_ref.a(true, ((qe) this).field_Q);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "qe.K(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
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
            field_p = null;
            stackOut_5_0 = new StringBuilder().append("firstcontactid: ").append(((qe) this).field_n).append(", pottings: ").append(((qe) this).field_m.a(45));
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (((qe) this).field_t) {
              stackOut_7_0 = (StringBuilder) (Object) stackIn_7_0;
              stackOut_7_1 = ", fouled";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (StringBuilder) (Object) stackIn_6_0;
              stackOut_6_1 = "";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          return stackIn_8_1 + ", resolution: " + ab.a(((qe) this).field_s, (byte) 10);
        } else {
          L1: {
            stackOut_1_0 = new StringBuilder().append("firstcontactid: ").append(((qe) this).field_n).append(", pottings: ").append(((qe) this).field_m.a(45));
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((qe) this).field_t) {
              stackOut_3_0 = (StringBuilder) (Object) stackIn_3_0;
              stackOut_3_1 = ", fouled";
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (StringBuilder) (Object) stackIn_2_0;
              stackOut_2_1 = "";
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          return stackIn_4_1 + ", resolution: " + ab.a(((qe) this).field_s, (byte) 10);
        }
    }

    final boolean c(boolean param0) {
        if (param0) {
          if (0 != (oa.field_b & ((qe) this).field_s)) {
            if ((3 & ((qe) this).field_l) != 0) {
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
          stackOut_2_0 = new StringBuilder().append("ang=").append(((qe) this).field_C).append(",").append(((qe) this).field_A).append("; pow=").append(((qe) this).field_V).append("; strk=").append(((qe) this).field_D).append(",").append(((qe) this).field_H);
          stackIn_6_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (-1 != ((qe) this).field_P) {
            stackOut_6_0 = (StringBuilder) (Object) stackIn_6_0;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (((qe) this).field_Q == -1) {
              return "";
            } else {
              return " cueball@" + ((qe) this).field_P + "," + ((qe) this).field_Q;
            }
          } else {
            stackOut_3_0 = (StringBuilder) (Object) stackIn_3_0;
            stackOut_3_1 = "";
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            return stackIn_5_1;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Pool.field_O;
          if ((oa.field_b & ((qe) this).field_s) == 0) {
            break L0;
          } else {
            if ((3 & param0) != 0) {
              var3 = ((qe) this).field_l & 3;
              if (var3 == 0) {
                var3 = param0;
                ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                break L0;
              } else {
                if (~var3 != ~param0) {
                  throw new IllegalStateException("Already made another group choice!");
                } else {
                  L1: {
                    if ((ab.field_g & ((qe) this).field_s) == 0) {
                      break L1;
                    } else {
                      if ((param0 & 24) == 0) {
                        break L1;
                      } else {
                        var3 = ((qe) this).field_l & 24;
                        if (var3 == 0) {
                          var3 = param0;
                          ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
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
                    if ((a.field_d & ((qe) this).field_s) == 0) {
                      break L2;
                    } else {
                      if ((96 & param0) == 0) {
                        break L2;
                      } else {
                        L3: {
                          var3 = ((qe) this).field_l & 96;
                          if (var3 != 0) {
                            break L3;
                          } else {
                            var3 = param0;
                            ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (~var3 != ~param0) {
                          throw new IllegalStateException("Already made another opponent play/pass choice!");
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L4: {
                    if (!this.a(-28872, param0)) {
                      break L4;
                    } else {
                      ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                      if (var4 == 0) {
                        if (param1) {
                          return;
                        } else {
                          ((qe) this).b((byte) 32, (ge) null);
                          return;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  throw new IllegalStateException("Can't make a choice now!");
                }
              }
            } else {
              if ((ab.field_g & ((qe) this).field_s) != 0) {
                if ((param0 & 24) != 0) {
                  L5: {
                    var3 = ((qe) this).field_l & 24;
                    if (var3 == 0) {
                      var3 = param0;
                      ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                      break L5;
                    } else {
                      if (param0 != var3) {
                        throw new IllegalStateException("Already made another play/pass choice!");
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if ((a.field_d & ((qe) this).field_s) == 0) {
                      break L6;
                    } else {
                      if ((96 & param0) == 0) {
                        break L6;
                      } else {
                        L7: {
                          var3 = ((qe) this).field_l & 96;
                          if (var3 != 0) {
                            break L7;
                          } else {
                            var3 = param0;
                            ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                            if (var4 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (~var3 != ~param0) {
                          throw new IllegalStateException("Already made another opponent play/pass choice!");
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L8: {
                    if (!this.a(-28872, param0)) {
                      break L8;
                    } else {
                      ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                      if (var4 == 0) {
                        L9: {
                          if (param1) {
                            break L9;
                          } else {
                            ((qe) this).b((byte) 32, (ge) null);
                            break L9;
                          }
                        }
                        return;
                      } else {
                        break L8;
                      }
                    }
                  }
                  throw new IllegalStateException("Can't make a choice now!");
                } else {
                  L10: {
                    if ((a.field_d & ((qe) this).field_s) == 0) {
                      break L10;
                    } else {
                      if ((96 & param0) == 0) {
                        break L10;
                      } else {
                        L11: {
                          var3 = ((qe) this).field_l & 96;
                          if (var3 != 0) {
                            break L11;
                          } else {
                            var3 = param0;
                            ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                            if (var4 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (~var3 != ~param0) {
                          throw new IllegalStateException("Already made another opponent play/pass choice!");
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L12: {
                    if (!this.a(-28872, param0)) {
                      break L12;
                    } else {
                      ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                      if (var4 == 0) {
                        L13: {
                          if (param1) {
                            break L13;
                          } else {
                            ((qe) this).b((byte) 32, (ge) null);
                            break L13;
                          }
                        }
                        return;
                      } else {
                        break L12;
                      }
                    }
                  }
                  throw new IllegalStateException("Can't make a choice now!");
                }
              } else {
                L14: {
                  if ((a.field_d & ((qe) this).field_s) == 0) {
                    break L14;
                  } else {
                    if ((96 & param0) == 0) {
                      break L14;
                    } else {
                      L15: {
                        var3 = ((qe) this).field_l & 96;
                        if (var3 != 0) {
                          break L15;
                        } else {
                          var3 = param0;
                          ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                          if (var4 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (~var3 != ~param0) {
                        throw new IllegalStateException("Already made another opponent play/pass choice!");
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                L16: {
                  if (!this.a(-28872, param0)) {
                    break L16;
                  } else {
                    ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                    if (var4 == 0) {
                      L17: {
                        if (param1) {
                          break L17;
                        } else {
                          ((qe) this).b((byte) 32, (ge) null);
                          break L17;
                        }
                      }
                      return;
                    } else {
                      break L16;
                    }
                  }
                }
                throw new IllegalStateException("Can't make a choice now!");
              }
            }
          }
        }
        if ((ab.field_g & ((qe) this).field_s) != 0) {
          if ((param0 & 24) != 0) {
            var3 = ((qe) this).field_l & 24;
            if (var3 == 0) {
              L18: {
                var3 = param0;
                ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                if ((a.field_d & ((qe) this).field_s) == 0) {
                  break L18;
                } else {
                  if ((96 & param0) == 0) {
                    break L18;
                  } else {
                    L19: {
                      var3 = ((qe) this).field_l & 96;
                      if (var3 != 0) {
                        break L19;
                      } else {
                        var3 = param0;
                        ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                        if (var4 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (~var3 != ~param0) {
                      throw new IllegalStateException("Already made another opponent play/pass choice!");
                    } else {
                      if (!this.a(-28872, param0)) {
                        throw new IllegalStateException("Can't make a choice now!");
                      } else {
                        ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                        if (var4 == 0) {
                          if (param1) {
                            return;
                          } else {
                            ((qe) this).b((byte) 32, (ge) null);
                            return;
                          }
                        } else {
                          throw new IllegalStateException("Can't make a choice now!");
                        }
                      }
                    }
                  }
                }
              }
              if (!this.a(-28872, param0)) {
                throw new IllegalStateException("Can't make a choice now!");
              } else {
                ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                if (var4 == 0) {
                  if (param1) {
                    return;
                  } else {
                    ((qe) this).b((byte) 32, (ge) null);
                    return;
                  }
                } else {
                  throw new IllegalStateException("Can't make a choice now!");
                }
              }
            } else {
              if (param0 != var3) {
                throw new IllegalStateException("Already made another play/pass choice!");
              } else {
                L20: {
                  if ((a.field_d & ((qe) this).field_s) == 0) {
                    break L20;
                  } else {
                    if ((96 & param0) == 0) {
                      break L20;
                    } else {
                      L21: {
                        var3 = ((qe) this).field_l & 96;
                        if (var3 != 0) {
                          break L21;
                        } else {
                          var3 = param0;
                          ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                          if (var4 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      if (~var3 != ~param0) {
                        throw new IllegalStateException("Already made another opponent play/pass choice!");
                      } else {
                        L22: {
                          if (!this.a(-28872, param0)) {
                            break L22;
                          } else {
                            ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                            if (var4 == 0) {
                              L23: {
                                if (param1) {
                                  break L23;
                                } else {
                                  ((qe) this).b((byte) 32, (ge) null);
                                  break L23;
                                }
                              }
                              return;
                            } else {
                              break L22;
                            }
                          }
                        }
                        throw new IllegalStateException("Can't make a choice now!");
                      }
                    }
                  }
                }
                if (!this.a(-28872, param0)) {
                  throw new IllegalStateException("Can't make a choice now!");
                } else {
                  ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                  if (var4 == 0) {
                    if (param1) {
                      return;
                    } else {
                      ((qe) this).b((byte) 32, (ge) null);
                      return;
                    }
                  } else {
                    throw new IllegalStateException("Can't make a choice now!");
                  }
                }
              }
            }
          } else {
            L24: {
              if ((a.field_d & ((qe) this).field_s) == 0) {
                break L24;
              } else {
                if ((96 & param0) == 0) {
                  break L24;
                } else {
                  L25: {
                    var3 = ((qe) this).field_l & 96;
                    if (var3 != 0) {
                      break L25;
                    } else {
                      var3 = param0;
                      ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                      if (var4 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  if (~var3 != ~param0) {
                    throw new IllegalStateException("Already made another opponent play/pass choice!");
                  } else {
                    if (!this.a(-28872, param0)) {
                      throw new IllegalStateException("Can't make a choice now!");
                    } else {
                      ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                      if (var4 == 0) {
                        if (param1) {
                          return;
                        } else {
                          ((qe) this).b((byte) 32, (ge) null);
                          return;
                        }
                      } else {
                        throw new IllegalStateException("Can't make a choice now!");
                      }
                    }
                  }
                }
              }
            }
            if (!this.a(-28872, param0)) {
              throw new IllegalStateException("Can't make a choice now!");
            } else {
              ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
              if (var4 == 0) {
                if (param1) {
                  return;
                } else {
                  ((qe) this).b((byte) 32, (ge) null);
                  return;
                }
              } else {
                throw new IllegalStateException("Can't make a choice now!");
              }
            }
          }
        } else {
          L26: {
            if ((a.field_d & ((qe) this).field_s) == 0) {
              break L26;
            } else {
              if ((96 & param0) == 0) {
                break L26;
              } else {
                L27: {
                  var3 = ((qe) this).field_l & 96;
                  if (var3 != 0) {
                    break L27;
                  } else {
                    var3 = param0;
                    ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                    if (var4 == 0) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                if (~var3 != ~param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                } else {
                  if (!this.a(-28872, param0)) {
                    throw new IllegalStateException("Can't make a choice now!");
                  } else {
                    ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
                    if (var4 == 0) {
                      if (param1) {
                        return;
                      } else {
                        ((qe) this).b((byte) 32, (ge) null);
                        return;
                      }
                    } else {
                      throw new IllegalStateException("Can't make a choice now!");
                    }
                  }
                }
              }
            }
          }
          if (!this.a(-28872, param0)) {
            throw new IllegalStateException("Can't make a choice now!");
          } else {
            ((qe) this).field_l = (byte)(((qe) this).field_l | param0);
            if (var4 == 0) {
              if (param1) {
                return;
              } else {
                ((qe) this).b((byte) 32, (ge) null);
                return;
              }
            } else {
              throw new IllegalStateException("Can't make a choice now!");
            }
          }
        }
    }

    final boolean d(int param0) {
        if (((qe) this).field_s != uk.field_a) {
          if (param0 >= 105) {
            if (!((qe) this).c(true)) {
              if (!((qe) this).a(-103)) {
                if (((qe) this).c((byte) 85)) {
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
                ((qe) this).c(2, var3_int);
                if ((pd.field_i & 2097152L) != 0L) {
                  System.out.println("->S2C_END_SHOT: " + ab.a(((qe) this).field_s, (byte) 10));
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("qe.F(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static String a(boolean param0, char param1) {
        if (param0) {
            return null;
        }
        return String.valueOf('ﾨ');
    }

    final void c(int param0, int param1) {
        try {
            if (param0 == 2) {
              if (uk.field_a != ((qe) this).field_s) {
                if (((qe) this).field_s != param1) {
                  tc.a(new Throwable(), "New end resolution 0b" + Integer.toString(((qe) this).field_s, 2) + ": " + wd.b(param1, param0 ^ 87) + " does not match current one 0b" + Integer.toString(param1, 2) + ": " + wd.b(((qe) this).field_s, 77), -8555);
                  return;
                } else {
                  return;
                }
              } else {
                ((qe) this).field_s = param1;
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
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        if ((((qe) this).field_s & oa.field_b) != 0) {
          if ((param1 & 3) != 0) {
            L0: {
              if ((3 & ((qe) this).field_l) == 0) {
                stackOut_71_0 = 1;
                stackIn_73_0 = stackOut_71_0;
                break L0;
              } else {
                if (~(3 & ((qe) this).field_l) != ~param1) {
                  stackOut_72_0 = 0;
                  stackIn_73_0 = stackOut_72_0;
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return stackIn_73_0 != 0;
          } else {
            L1: {
              if ((ab.field_g & ((qe) this).field_s) == 0) {
                break L1;
              } else {
                if (0 == (24 & param1)) {
                  break L1;
                } else {
                  L2: {
                    if ((24 & ((qe) this).field_l) == 0) {
                      stackOut_40_0 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      break L2;
                    } else {
                      if ((24 & ((qe) this).field_l) != param1) {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  return stackIn_42_0 != 0;
                }
              }
            }
            if (param0 == -28872) {
              L3: {
                if ((((qe) this).field_s & a.field_d) == 0) {
                  break L3;
                } else {
                  if ((param1 & 96) == 0) {
                    break L3;
                  } else {
                    L4: {
                      if ((((qe) this).field_l & 96) == 0) {
                        stackOut_61_0 = 1;
                        stackIn_63_0 = stackOut_61_0;
                        break L4;
                      } else {
                        if (param1 != (96 & ((qe) this).field_l)) {
                          stackOut_62_0 = 0;
                          stackIn_63_0 = stackOut_62_0;
                          break L4;
                        } else {
                          return true;
                        }
                      }
                    }
                    return stackIn_63_0 != 0;
                  }
                }
              }
              L5: {
                if (param1 != 0) {
                  stackOut_66_0 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  break L5;
                } else {
                  stackOut_65_0 = 1;
                  stackIn_67_0 = stackOut_65_0;
                  break L5;
                }
              }
              return stackIn_67_0 != 0;
            } else {
              L6: {
                ((qe) this).field_A = (short) 5;
                if ((((qe) this).field_s & a.field_d) == 0) {
                  break L6;
                } else {
                  if ((param1 & 96) == 0) {
                    break L6;
                  } else {
                    L7: {
                      if ((((qe) this).field_l & 96) == 0) {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        break L7;
                      } else {
                        if (param1 != (96 & ((qe) this).field_l)) {
                          stackOut_50_0 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          break L7;
                        } else {
                          return true;
                        }
                      }
                    }
                    return stackIn_51_0 != 0;
                  }
                }
              }
              L8: {
                if (param1 != 0) {
                  stackOut_54_0 = 0;
                  stackIn_55_0 = stackOut_54_0;
                  break L8;
                } else {
                  stackOut_53_0 = 1;
                  stackIn_55_0 = stackOut_53_0;
                  break L8;
                }
              }
              return stackIn_55_0 != 0;
            }
          }
        } else {
          L9: {
            if ((ab.field_g & ((qe) this).field_s) == 0) {
              break L9;
            } else {
              if (0 == (24 & param1)) {
                break L9;
              } else {
                L10: {
                  if ((24 & ((qe) this).field_l) == 0) {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L10;
                  } else {
                    if ((24 & ((qe) this).field_l) != param1) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L10;
                    } else {
                      return true;
                    }
                  }
                }
                return stackIn_8_0 != 0;
              }
            }
          }
          if (param0 == -28872) {
            L11: {
              if ((((qe) this).field_s & a.field_d) == 0) {
                break L11;
              } else {
                if ((param1 & 96) == 0) {
                  break L11;
                } else {
                  L12: {
                    if ((((qe) this).field_l & 96) == 0) {
                      stackOut_27_0 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      break L12;
                    } else {
                      if (param1 != (96 & ((qe) this).field_l)) {
                        stackOut_28_0 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        break L12;
                      } else {
                        return true;
                      }
                    }
                  }
                  return stackIn_29_0 != 0;
                }
              }
            }
            L13: {
              if (param1 != 0) {
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L13;
              } else {
                stackOut_31_0 = 1;
                stackIn_33_0 = stackOut_31_0;
                break L13;
              }
            }
            return stackIn_33_0 != 0;
          } else {
            L14: {
              ((qe) this).field_A = (short) 5;
              if ((((qe) this).field_s & a.field_d) == 0) {
                break L14;
              } else {
                if ((param1 & 96) == 0) {
                  break L14;
                } else {
                  L15: {
                    L16: {
                      if ((((qe) this).field_l & 96) == 0) {
                        break L16;
                      } else {
                        if (param1 != (96 & ((qe) this).field_l)) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L15;
                  }
                  return stackIn_17_0 != 0;
                }
              }
            }
            L17: {
              if (param1 != 0) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L17;
              } else {
                stackOut_19_0 = 1;
                stackIn_21_0 = stackOut_19_0;
                break L17;
              }
            }
            return stackIn_21_0 != 0;
          }
        }
    }

    final boolean c(byte param0) {
        if (param0 > 73) {
          if (-1 != (((qe) this).field_s & a.field_d)) {
            if (-1 != (((qe) this).field_l & 96)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((qe) this).field_H = (byte) 46;
          if (-1 != (((qe) this).field_s & a.field_d)) {
            if (-1 != (((qe) this).field_l & 96)) {
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
        ((qe) this).field_N = -1;
        ((qe) this).field_P = -1;
        ((qe) this).field_w = (byte) 0;
        ((qe) this).field_t = false;
        ((qe) this).field_M = -1;
        ((qe) this).field_u = 0;
        ((qe) this).field_Q = -1;
        ((qe) this).field_q = 0;
        ((qe) this).field_E = false;
        ((qe) this).field_I = -1;
        ((qe) this).field_n = -1;
        ((qe) this).field_V = (short) -1;
        ((qe) this).field_m = new ko();
        ((qe) this).field_x = 0L;
        ((qe) this).field_l = (byte) 0;
        ((qe) this).field_R = null;
        ((qe) this).field_s = uk.field_a;
    }

    qe(int param0, int param1) {
        ((qe) this).field_N = -1;
        ((qe) this).field_P = -1;
        ((qe) this).field_w = (byte) 0;
        ((qe) this).field_t = false;
        ((qe) this).field_M = -1;
        ((qe) this).field_u = 0;
        ((qe) this).field_Q = -1;
        ((qe) this).field_q = 0;
        ((qe) this).field_E = false;
        ((qe) this).field_I = -1;
        ((qe) this).field_n = -1;
        ((qe) this).field_V = (short) -1;
        ((qe) this).field_m = new ko();
        ((qe) this).field_x = 0L;
        ((qe) this).field_l = (byte) 0;
        ((qe) this).field_R = null;
        ((qe) this).field_s = uk.field_a;
        ((qe) this).field_L = param1;
        ((qe) this).field_v = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "mm:ss.ff";
        field_B = "Honour";
        field_G = "Lost";
        field_K = "Unable to delete friend - system busy";
        field_F = "<%0> is out of lives!";
        field_p = "Menu";
        field_O = "With Guides";
    }
}
