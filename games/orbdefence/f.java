/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.net.URL;

final class f {
    private int field_c;
    im field_h;
    int field_t;
    kd field_f;
    int field_m;
    int field_g;
    boolean field_k;
    int field_u;
    im field_o;
    int field_s;
    im field_r;
    int field_x;
    boolean field_a;
    private int field_d;
    int field_y;
    private int field_q;
    static hj[] field_w;
    int field_p;
    lb[] field_e;
    im field_b;
    int field_i;
    private boolean field_n;
    int field_l;
    private int field_v;
    static boolean field_j;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == -38) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((f) this).field_u = -105;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5_int = param1 - param0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var5_int ^ -1) < (param0 + param1 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = param3 - param0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param0 + param3 ^ -1) > (var6 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 > var5_int) {
                            statePc = 25;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = var5_int;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 >= ((f) this).field_f.field_c) {
                            statePc = 25;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = var6;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 < 0) {
                            statePc = 25;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = var6;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 >= ((f) this).field_f.field_t) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((f) this).field_h.a(-81, (ca) (Object) new me((double)param1, (double)param3, (double)(-param1 + var5_int) * 0.05, (double)(var6 + -param3) * 0.05, 1));
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5_int++;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var5, "f.I(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, int param1) {
        try {
            ((f) this).field_k = true;
            if (param0) {
                f.a(-16, (ha) null, (byte) 46);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "f.O(" + param0 + 44 + param1 + 41);
        }
    }

    final static int c(byte param0) {
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 == 8) {
                break L0;
              } else {
                java.net.URL discarded$2 = f.a((java.applet.Applet) null, (java.net.URL) null, 96);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ji.field_c;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    final void b(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        oj var3_ref_oj = null;
        ca var3_ref = null;
        pd var4_ref_pd = null;
        int var4 = 0;
        pd var5 = null;
        kb var5_ref = null;
        int var5_int = 0;
        oj var5_ref2 = null;
        int var6 = 0;
        int var7_int = 0;
        pd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pd var11 = null;
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        if (!((f) this).field_k) {
          L0: {
            if ((((f) this).field_f.field_k ^ -1) == -1) {
              this.a(false, -1);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            ((f) this).field_i = ((f) this).field_i + 1;
            if (-1 != (((f) this).field_x % 11 ^ -1)) {
              break L1;
            } else {
              if (((f) this).field_r.c(-3088)) {
                break L1;
              } else {
                if (-1 <= (((f) this).field_x ^ -1)) {
                  break L1;
                } else {
                  ((f) this).field_g = ((f) this).field_i - -500;
                  break L1;
                }
              }
            }
          }
          L2: {
            if (((f) this).field_y <= 0) {
              break L2;
            } else {
              ((f) this).field_y = ((f) this).field_y - 1;
              break L2;
            }
          }
          L3: {
            if (((f) this).field_f.field_n >= 0) {
              break L3;
            } else {
              ((f) this).field_f.field_n = 0;
              break L3;
            }
          }
          L4: {
            if (((f) this).field_k) {
              break L4;
            } else {
              if (99 != ((f) this).field_x) {
                break L4;
              } else {
                if (((f) this).field_r.c(-3088)) {
                  L5: {
                    if (0 >= ((f) this).field_e[0].field_f) {
                      break L5;
                    } else {
                      if ((((f) this).field_m ^ -1) == -1) {
                        L6: {
                          ((f) this).field_d = ((f) this).field_d + 1;
                          if (1 == ((f) this).field_d) {
                            f.a(13, 242, (byte) -25);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (((f) this).field_d == 3) {
                            f.a(14, 241, (byte) -25);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (((f) this).field_d != 9) {
                          break L5;
                        } else {
                          f.a(15, 240, (byte) -25);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  nh.field_b = nh.field_b + ((f) this).field_e[0].field_f;
                  ((f) this).field_e[0].field_d = ((f) this).field_e[0].field_d + ((f) this).field_e[0].field_f;
                  ((f) this).field_e[0].field_f = 0;
                  this.a(false, 0);
                  return;
                } else {
                  break L4;
                }
              }
            }
          }
          L8: {
            L9: {
              if (-2 == (((f) this).field_m ^ -1)) {
                break L9;
              } else {
                if (2 != ((f) this).field_m) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            if ((((f) this).field_e[0].field_d ^ -1) > -1000001) {
              break L8;
            } else {
              f.a(3, 252, (byte) -25);
              break L8;
            }
          }
          L10: {
            L11: {
              if (-5 == (((f) this).field_m ^ -1)) {
                break L11;
              } else {
                if ((((f) this).field_m ^ -1) != -6) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            if (((f) this).field_e[0].field_d >= 1000000) {
              f.a(21, 234, (byte) -25);
              break L10;
            } else {
              break L10;
            }
          }
          L12: {
            ((f) this).field_f.a((byte) 100);
            if (((f) this).field_f.field_r.b(0)) {
              break L12;
            } else {
              var2_int = 0;
              L13: while (true) {
                if (((f) this).field_f.field_r.field_e <= var2_int) {
                  break L12;
                } else {
                  var3 = ((f) this).field_f.field_r.field_g[var2_int].field_a;
                  ((f) this).field_f.field_a[var3] = 25;
                  var2_int++;
                  continue L13;
                }
              }
            }
          }
          L14: {
            L15: {
              if (((f) this).field_k) {
                break L15;
              } else {
                if ((((f) this).field_i ^ -1) > (((f) this).field_g ^ -1)) {
                  break L15;
                } else {
                  if (99 <= ((f) this).field_x) {
                    break L15;
                  } else {
                    L16: {
                      if ((((f) this).field_x % 11 ^ -1) != -1) {
                        break L16;
                      } else {
                        if (!((f) this).field_r.c(param0 + -3186)) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        ((f) this).field_v = (((f) this).field_f.field_k * 2 + 200) * (((f) this).field_x + 1) / 99;
                        if (3 == ((f) this).field_m) {
                          break L18;
                        } else {
                          if ((((f) this).field_m ^ -1) != -6) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      ((f) this).field_v = (1 + ((f) this).field_x) * 500 / 99;
                      break L17;
                    }
                    L19: {
                      ((f) this).field_c = 50;
                      if ((((f) this).field_x ^ -1) == -1) {
                        ((f) this).field_c = 20;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (1 == ((f) this).field_x) {
                        ((f) this).field_c = 30;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if ((((f) this).field_x ^ -1) != -3) {
                        break L21;
                      } else {
                        ((f) this).field_c = 40;
                        break L21;
                      }
                    }
                    L22: {
                      if (-4 != (((f) this).field_x ^ -1)) {
                        break L22;
                      } else {
                        ((f) this).field_c = 45;
                        break L22;
                      }
                    }
                    L23: {
                      L24: {
                        ((f) this).field_c = ((f) this).field_c + ((f) this).field_x / 11 * 2;
                        if (((f) this).field_m == 1) {
                          break L24;
                        } else {
                          if (((f) this).field_m == 2) {
                            break L24;
                          } else {
                            break L23;
                          }
                        }
                      }
                      ((f) this).field_c = ((f) this).field_c - 10;
                      break L23;
                    }
                    L25: {
                      if ((((f) this).field_m ^ -1) != -4) {
                        break L25;
                      } else {
                        ((f) this).field_c = ((f) this).field_c * 2;
                        break L25;
                      }
                    }
                    L26: {
                      var2_int = ((f) this).field_c;
                      var3 = 0;
                      var4 = 0;
                      var3 = jc.field_f[((f) this).field_m][((f) this).field_x];
                      if (1 != var3) {
                        break L26;
                      } else {
                        var2_int = var2_int * 3;
                        break L26;
                      }
                    }
                    L27: {
                      if (2 != var3) {
                        break L27;
                      } else {
                        var2_int = var2_int * 2 / 3;
                        break L27;
                      }
                    }
                    L28: {
                      if (var3 == 3) {
                        var2_int = 2 * var2_int / 3;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (var3 == 4) {
                        var2_int = var2_int * 2 / 3;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (-6 != (var3 ^ -1)) {
                        break L30;
                      } else {
                        var2_int = var2_int * 2 / 3;
                        break L30;
                      }
                    }
                    L31: {
                      if (6 != var3) {
                        break L31;
                      } else {
                        var2_int = var2_int * 2 / 3;
                        break L31;
                      }
                    }
                    L32: {
                      if (7 != var3) {
                        break L32;
                      } else {
                        var2_int = var2_int * 2 / 3;
                        break L32;
                      }
                    }
                    L33: {
                      if ((var3 ^ -1) == -10) {
                        var2_int = var2_int * 2 / 3;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if (10 != var3) {
                        break L34;
                      } else {
                        var2_int = var2_int / 8;
                        break L34;
                      }
                    }
                    L35: {
                      if (-11 != (((f) this).field_x % 11 ^ -1)) {
                        break L35;
                      } else {
                        if (0 < ((f) this).field_x) {
                          var2_int = 1;
                          var4 = 1;
                          hf discarded$2 = gk.a(mh.field_a[var3 + 31], (byte) -11);
                          if ((var3 ^ -1) == -2) {
                            var2_int = 4;
                            break L35;
                          } else {
                            break L35;
                          }
                        } else {
                          break L35;
                        }
                      }
                    }
                    L36: {
                      if (0 != ((f) this).field_x % 11) {
                        break L36;
                      } else {
                        if ((((f) this).field_x ^ -1) < -1) {
                          L37: {
                            if (((f) this).field_e[0].field_f <= 0) {
                              break L37;
                            } else {
                              if (((f) this).field_m != 0) {
                                break L37;
                              } else {
                                L38: {
                                  ((f) this).field_d = ((f) this).field_d + 1;
                                  if (-2 != (((f) this).field_d ^ -1)) {
                                    break L38;
                                  } else {
                                    f.a(13, 242, (byte) -25);
                                    break L38;
                                  }
                                }
                                if (3 == ((f) this).field_d) {
                                  f.a(14, 241, (byte) -25);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                          L39: {
                            if (!ok.a(0, false)) {
                              break L39;
                            } else {
                              if ((((f) this).field_e[0].field_f ^ -1) >= -1) {
                                break L39;
                              } else {
                                if (jc.field_f[((f) this).field_m][-1 + ((f) this).field_x] == 7) {
                                  f.a(23, 232, (byte) -25);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                            }
                          }
                          df.field_g = df.field_g + ((f) this).field_e[0].field_f * 2;
                          nh.field_b = nh.field_b + ((f) this).field_e[0].field_f;
                          ((f) this).field_e[0].field_d = ((f) this).field_e[0].field_d + ((f) this).field_e[0].field_f;
                          ((f) this).field_e[0].field_f = 0;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L40: {
                      if (1 == ((f) this).field_x) {
                        ((f) this).field_v = ((f) this).field_v + 4;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L41: {
                      if (2 == ((f) this).field_x) {
                        ((f) this).field_v = ((f) this).field_v + 4;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    L42: {
                      if (3 == ((f) this).field_x) {
                        ((f) this).field_v = ((f) this).field_v + 4;
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    L43: {
                      if (-34 != (((f) this).field_x ^ -1)) {
                        break L43;
                      } else {
                        if ((((f) this).field_f.field_k ^ -1) == -26) {
                          ((f) this).field_n = true;
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                    }
                    L44: {
                      if ((((f) this).field_x ^ -1) != -34) {
                        break L44;
                      } else {
                        if ((((f) this).field_f.field_k ^ -1) != -126) {
                          break L44;
                        } else {
                          ((f) this).field_a = true;
                          break L44;
                        }
                      }
                    }
                    L45: {
                      if (((f) this).field_x != 33) {
                        break L45;
                      } else {
                        if ((((f) this).field_m ^ -1) != -1) {
                          break L45;
                        } else {
                          f.a(1, 254, (byte) -25);
                          break L45;
                        }
                      }
                    }
                    L46: {
                      if (66 != ((f) this).field_x) {
                        break L46;
                      } else {
                        if (-1 != (((f) this).field_m ^ -1)) {
                          break L46;
                        } else {
                          f.a(2, 253, (byte) -25);
                          break L46;
                        }
                      }
                    }
                    L47: {
                      if (66 != ((f) this).field_x) {
                        break L47;
                      } else {
                        L48: {
                          if (1 == ((f) this).field_m) {
                            break L48;
                          } else {
                            if ((((f) this).field_m ^ -1) != -3) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        f.a(22, 233, (byte) -25);
                        break L47;
                      }
                    }
                    L49: {
                      if (((f) this).field_x != 66) {
                        break L49;
                      } else {
                        if (75 > ((f) this).field_f.field_k) {
                          break L49;
                        } else {
                          if (-1 != (((f) this).field_m ^ -1)) {
                            break L49;
                          } else {
                            f.a(4, 251, (byte) -25);
                            break L49;
                          }
                        }
                      }
                    }
                    L50: {
                      if (((f) this).field_x != 66) {
                        break L50;
                      } else {
                        if (-126 < (((f) this).field_f.field_k ^ -1)) {
                          break L50;
                        } else {
                          if (0 == ((f) this).field_m) {
                            f.a(5, 250, (byte) -25);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                      }
                    }
                    L51: {
                      if (66 != ((f) this).field_x) {
                        break L51;
                      } else {
                        if (!((f) this).field_n) {
                          break L51;
                        } else {
                          if (((f) this).field_m != 0) {
                            break L51;
                          } else {
                            f.a(0, 255, (byte) -25);
                            break L51;
                          }
                        }
                      }
                    }
                    L52: {
                      ((f) this).field_x = ((f) this).field_x + 1;
                      ((f) this).field_y = 50;
                      if ((((f) this).field_x ^ -1) > -23) {
                        ((f) this).field_v = ((f) this).field_v + (1 + ((f) this).field_x / 11);
                        break L52;
                      } else {
                        ((f) this).field_v = ((f) this).field_v + 2;
                        break L52;
                      }
                    }
                    L53: {
                      ((f) this).field_f.field_n = 1;
                      if (-25 == (((f) this).field_x % 25 ^ -1)) {
                        var5_int = 0;
                        L54: while (true) {
                          if (((f) this).field_f.field_i <= var5_int) {
                            break L53;
                          } else {
                            ((f) this).field_f.field_v[var5_int] = 0;
                            var5_int++;
                            continue L54;
                          }
                        }
                      } else {
                        break L53;
                      }
                    }
                    var5_int = ((f) this).field_f.field_s.length;
                    var6 = 0;
                    var7_int = 0;
                    L55: while (true) {
                      if ((var2_int ^ -1) >= (var7_int ^ -1)) {
                        L56: {
                          ((f) this).field_c = ((f) this).field_c + 10;
                          var2_int = 1500;
                          if (((f) this).field_x > 11) {
                            var2_int = 1450;
                            break L56;
                          } else {
                            break L56;
                          }
                        }
                        L57: {
                          if ((((f) this).field_x ^ -1) >= -23) {
                            break L57;
                          } else {
                            var2_int = 1400;
                            break L57;
                          }
                        }
                        L58: {
                          if (33 >= ((f) this).field_x) {
                            break L58;
                          } else {
                            var2_int = 1350;
                            break L58;
                          }
                        }
                        L59: {
                          if (44 < ((f) this).field_x) {
                            var2_int = 1300;
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        L60: {
                          if ((((f) this).field_x ^ -1) < -56) {
                            var2_int = 1250;
                            break L60;
                          } else {
                            break L60;
                          }
                        }
                        L61: {
                          if (-67 <= (((f) this).field_x ^ -1)) {
                            break L61;
                          } else {
                            var2_int = 1200;
                            break L61;
                          }
                        }
                        L62: {
                          if (-89 > (((f) this).field_x ^ -1)) {
                            var2_int = 1150;
                            break L62;
                          } else {
                            break L62;
                          }
                        }
                        L63: {
                          if (-100 >= (((f) this).field_x ^ -1)) {
                            break L63;
                          } else {
                            if (-1 != (jc.field_f[((f) this).field_m][((f) this).field_x] ^ -1)) {
                              break L63;
                            } else {
                              if (-12 > (((f) this).field_x ^ -1)) {
                                var2_int = var2_int / 2;
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        L64: {
                          L65: {
                            if (-2 == (((f) this).field_m ^ -1)) {
                              break L65;
                            } else {
                              if ((((f) this).field_m ^ -1) != -3) {
                                break L64;
                              } else {
                                break L65;
                              }
                            }
                          }
                          var2_int = var2_int * 2;
                          break L64;
                        }
                        ((f) this).field_g = ((f) this).field_g + var2_int;
                        break L14;
                      } else {
                        L66: {
                          L67: {
                            L68: {
                              var6++;
                              if ((var6 ^ -1) > (((f) this).field_q ^ -1)) {
                                break L68;
                              } else {
                                if (var3 != 1) {
                                  break L67;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            if (-3 < (var6 ^ -1)) {
                              break L66;
                            } else {
                              if (var4 != 0) {
                                break L66;
                              } else {
                                break L67;
                              }
                            }
                          }
                          var6 = 0;
                          break L66;
                        }
                        L69: {
                          var8 = ((f) this).field_f.field_s[(((f) this).field_x + var6 + -1) % var5_int];
                          var9 = var8 % ((f) this).field_f.field_c;
                          if (var4 == 0) {
                            break L69;
                          } else {
                            if (var3 == 10) {
                              ((f) this).field_v = ((f) this).field_v / 4;
                              break L69;
                            } else {
                              break L69;
                            }
                          }
                        }
                        L70: {
                          var10 = var8 / ((f) this).field_f.field_c;
                          var11 = new pd(var9, var10, (f) this, var3, ((f) this).field_v);
                          ((f) this).field_r.a(param0 ^ -22, (ca) (Object) var11);
                          var11.field_m = 9 * var7_int;
                          var11.field_n = var4 != 0;
                          if (0 == ((f) this).field_x) {
                            var11.field_m = 20 * var7_int;
                            break L70;
                          } else {
                            break L70;
                          }
                        }
                        L71: {
                          if (-2 == (((f) this).field_x ^ -1)) {
                            var11.field_m = var7_int * 19;
                            break L71;
                          } else {
                            break L71;
                          }
                        }
                        L72: {
                          if (2 != ((f) this).field_x) {
                            break L72;
                          } else {
                            var11.field_m = 18 * var7_int;
                            break L72;
                          }
                        }
                        L73: {
                          if ((((f) this).field_x ^ -1) == -4) {
                            var11.field_m = 17 * var7_int;
                            break L73;
                          } else {
                            break L73;
                          }
                        }
                        L74: {
                          if (-5 != (((f) this).field_x ^ -1)) {
                            break L74;
                          } else {
                            var11.field_m = 16 * var7_int;
                            break L74;
                          }
                        }
                        L75: {
                          if (-6 != (((f) this).field_x ^ -1)) {
                            break L75;
                          } else {
                            var11.field_m = var7_int * 15;
                            break L75;
                          }
                        }
                        L76: {
                          if ((((f) this).field_x ^ -1) != -7) {
                            break L76;
                          } else {
                            var11.field_m = var7_int * 14;
                            break L76;
                          }
                        }
                        L77: {
                          if (-8 != (((f) this).field_x ^ -1)) {
                            break L77;
                          } else {
                            var11.field_m = 13 * var7_int;
                            break L77;
                          }
                        }
                        L78: {
                          if (8 != ((f) this).field_x) {
                            break L78;
                          } else {
                            var11.field_m = 12 * var7_int;
                            break L78;
                          }
                        }
                        L79: {
                          if ((((f) this).field_x ^ -1) == -10) {
                            var11.field_m = 11 * var7_int;
                            break L79;
                          } else {
                            break L79;
                          }
                        }
                        L80: {
                          if ((((f) this).field_x ^ -1) != -11) {
                            break L80;
                          } else {
                            var11.field_m = var7_int * 10;
                            break L80;
                          }
                        }
                        L81: {
                          if (-2 == (var11.field_y ^ -1)) {
                            var11.field_m = var11.field_m / 2;
                            break L81;
                          } else {
                            break L81;
                          }
                        }
                        L82: {
                          if (var4 == 0) {
                            if (25 >= ((f) this).field_x) {
                              break L82;
                            } else {
                              var11.field_o = ((f) this).field_x * var11.field_o / 25;
                              var11.field_l = var11.field_o;
                              break L82;
                            }
                          } else {
                            var11.field_o = var11.field_o * ((f) this).field_c;
                            var11.field_l = var11.field_o;
                            ((f) this).field_e[0].field_f = ((f) this).field_e[0].field_f + (1000 + ((f) this).field_x / 11 * 1000) / var2_int;
                            break L82;
                          }
                        }
                        L83: {
                          if (var11.field_y == 10) {
                            var11.field_m = var11.field_m * 4;
                            break L83;
                          } else {
                            break L83;
                          }
                        }
                        var7_int++;
                        continue L55;
                      }
                    }
                  }
                }
              }
            }
            if ((((f) this).field_g ^ -1) <= (((f) this).field_i ^ -1)) {
              break L14;
            } else {
              ((f) this).field_g = ((f) this).field_g + 3000;
              break L14;
            }
          }
          var2_int = 0;
          L84: while (true) {
            if (var2_int != 0) {
              var3_ref_oj = (oj) (Object) ((f) this).field_b.b((byte) -112);
              L85: while (true) {
                if (var3_ref_oj == null) {
                  gd.field_c = 0;
                  var3 = 0;
                  var4_ref_pd = (pd) (Object) ((f) this).field_r.b((byte) 114);
                  L86: while (true) {
                    if (var4_ref_pd == null) {
                      L87: {
                        if (var3 == 0) {
                          break L87;
                        } else {
                          var4_ref_pd = (pd) (Object) ((f) this).field_r.b((byte) 115);
                          L88: while (true) {
                            if (null == var4_ref_pd) {
                              break L87;
                            } else {
                              L89: {
                                if ((var4_ref_pd.field_m ^ -1) > -1) {
                                  var4_ref_pd.field_m = 0;
                                  break L89;
                                } else {
                                  break L89;
                                }
                              }
                              var4_ref_pd = (pd) (Object) ((f) this).field_r.d(853);
                              continue L88;
                            }
                          }
                        }
                      }
                      L90: {
                        if (gd.field_c < 30) {
                          break L90;
                        } else {
                          f.a(19, 236, (byte) -25);
                          break L90;
                        }
                      }
                      L91: {
                        ((f) this).field_e[0].a(param0 ^ 98);
                        if (param0 == 98) {
                          break L91;
                        } else {
                          ((f) this).field_c = 91;
                          break L91;
                        }
                      }
                      var4 = 0;
                      var5_ref = (kb) (Object) ((f) this).field_o.b((byte) -96);
                      L92: while (true) {
                        if (var5_ref == null) {
                          L93: {
                            if (var4 < 250) {
                              break L93;
                            } else {
                              f.a(18, 237, (byte) -25);
                              break L93;
                            }
                          }
                          ((f) this).a(-1);
                          var5 = (pd) (Object) ((f) this).field_r.d((byte) -122);
                          L94: while (true) {
                            if (null == var5) {
                              var5_ref2 = (oj) (Object) ((f) this).field_b.d((byte) -122);
                              L95: while (true) {
                                if (var5_ref2 == null) {
                                  return;
                                } else {
                                  L96: {
                                    if (200 > var5_ref2.field_g) {
                                      break L96;
                                    } else {
                                      var5_ref2.b(57);
                                      break L96;
                                    }
                                  }
                                  var5_ref2 = (oj) (Object) ((f) this).field_b.b(10708);
                                  continue L95;
                                }
                              }
                            } else {
                              L97: {
                                if (var5.field_o <= 0) {
                                  L98: {
                                    var5.field_o = 0;
                                    if (((f) this).field_f.field_m[var5.field_t]) {
                                      ((f) this).field_f.field_m[var5.field_t] = false;
                                      break L98;
                                    } else {
                                      break L98;
                                    }
                                  }
                                  L99: {
                                    var5.b(57);
                                    if ((var5.field_y ^ -1) != -11) {
                                      break L99;
                                    } else {
                                      ((f) this).field_f.field_m[var5.field_t] = true;
                                      var6 = 0;
                                      L100: while (true) {
                                        if (-5 >= (var6 ^ -1)) {
                                          break L99;
                                        } else {
                                          var7 = new pd(var5.field_u, var5.field_z, (f) this, 11, 10);
                                          var7.field_l = var5.field_l / 4;
                                          var7.field_o = var7.field_l;
                                          ((f) this).field_r.a(param0 + -212, (ca) (Object) var7);
                                          var6++;
                                          continue L100;
                                        }
                                      }
                                    }
                                  }
                                  if (-12 == (var5.field_y ^ -1)) {
                                    ((f) this).field_f.field_m[var5.field_t] = true;
                                    var6 = 0;
                                    L101: while (true) {
                                      if (-5 >= (var6 ^ -1)) {
                                        break L97;
                                      } else {
                                        L102: {
                                          var7 = new pd(var5.field_u, var5.field_z, (f) this, 1, 10);
                                          var7.field_l = var5.field_l / 4;
                                          if (-1 == (var7.field_l ^ -1)) {
                                            var7.field_l = 1;
                                            break L102;
                                          } else {
                                            break L102;
                                          }
                                        }
                                        var7.field_o = var7.field_l;
                                        ((f) this).field_r.a(-104, (ca) (Object) var7);
                                        var6++;
                                        continue L101;
                                      }
                                    }
                                  } else {
                                    break L97;
                                  }
                                } else {
                                  break L97;
                                }
                              }
                              var5 = (pd) (Object) ((f) this).field_r.b(param0 + 10610);
                              continue L94;
                            }
                          }
                        } else {
                          L103: {
                            var5_ref.a((byte) 89);
                            if (var5_ref.field_C != 5) {
                              break L103;
                            } else {
                              var6 = var5_ref.f(param0 ^ 52);
                              var4 = var4 + var6;
                              break L103;
                            }
                          }
                          var5_ref = (kb) (Object) ((f) this).field_o.d(param0 + 755);
                          continue L92;
                        }
                      }
                    } else {
                      L104: {
                        var4_ref_pd.c(1);
                        if ((var4_ref_pd.field_m ^ -1) <= 11999) {
                          break L104;
                        } else {
                          f.a(20, 235, (byte) -25);
                          break L104;
                        }
                      }
                      L105: {
                        if ((((f) this).field_f.field_o[var4_ref_pd.field_t] ^ -1) == -7) {
                          L106: {
                            L107: {
                              if (!ob.field_F) {
                                break L107;
                              } else {
                                if (2 > va.field_d) {
                                  break L107;
                                } else {
                                  break L106;
                                }
                              }
                            }
                            var5_int = ((f) this).field_f.field_j[var4_ref_pd.field_t];
                            var6 = var5_int % 8;
                            var7_int = (var5_int - var6) / 8;
                            var7_int -= 6;
                            var6 -= 3;
                            ((f) this).field_f.a((byte) -117, ((f) this).field_f.field_c * (-var7_int + 2) + 2 + (-var6 + var4_ref_pd.field_t));
                            var8 = 0;
                            L108: while (true) {
                              if (-6 >= (var8 ^ -1)) {
                                if ((var4_ref_pd.field_y ^ -1) == -9) {
                                  break L106;
                                } else {
                                  ((f) this).field_e[0].field_f = 0;
                                  break L106;
                                }
                              } else {
                                var9 = 0;
                                L109: while (true) {
                                  if (var9 >= 5) {
                                    var8++;
                                    continue L108;
                                  } else {
                                    var10 = (var9 + -var7_int) * ((f) this).field_f.field_c + (var4_ref_pd.field_t + var8) - var6;
                                    ((f) this).field_f.field_o[var10] = 10;
                                    ((f) this).field_f.field_j[var10] = ((f) this).field_f.field_j[var10] + 40;
                                    ((f) this).field_h.a(-83, (ca) (Object) new me((double)(var10 % ((f) this).field_f.field_c), (double)(var10 / ((f) this).field_f.field_c), 1));
                                    var9++;
                                    continue L109;
                                  }
                                }
                              }
                            }
                          }
                          L110: {
                            if ((var4_ref_pd.field_y ^ -1) == -9) {
                              break L110;
                            } else {
                              var4_ref_pd.field_o = 0;
                              break L110;
                            }
                          }
                          hf discarded$3 = gk.a(mh.field_a[55], (byte) -11);
                          hd.field_j = fd.field_d;
                          wl.field_a = 320;
                          md.field_f = 240;
                          var3 = 1;
                          break L105;
                        } else {
                          break L105;
                        }
                      }
                      var4_ref_pd = (pd) (Object) ((f) this).field_r.d(853);
                      continue L86;
                    }
                  }
                } else {
                  var3_ref_oj.a((byte) 44);
                  var3_ref_oj = (oj) (Object) ((f) this).field_b.d(853);
                  continue L85;
                }
              }
            } else {
              var2_int = 1;
              var3_ref = ((f) this).field_r.field_d.field_e;
              L111: while (true) {
                L112: {
                  if (((f) this).field_r.field_d == var3_ref) {
                    break L112;
                  } else {
                    if (((f) this).field_r.field_d == var3_ref.field_e) {
                      break L112;
                    } else {
                      L113: {
                        L114: {
                          var4_ref_pd = (pd) (Object) var3_ref.field_e;
                          var5 = (pd) (Object) var3_ref;
                          if ((var5.field_z ^ -1) < (var4_ref_pd.field_z ^ -1)) {
                            break L114;
                          } else {
                            if ((var5.field_u ^ -1) >= (var4_ref_pd.field_u ^ -1)) {
                              break L113;
                            } else {
                              if (var4_ref_pd.field_z != var5.field_z) {
                                break L113;
                              } else {
                                break L114;
                              }
                            }
                          }
                        }
                        L115: {
                          if (var5.field_y == 4) {
                            break L115;
                          } else {
                            if (var4_ref_pd.field_y != 4) {
                              break L115;
                            } else {
                              break L113;
                            }
                          }
                        }
                        var5.field_e = var4_ref_pd.field_e;
                        var4_ref_pd.field_c = var5.field_c;
                        var4_ref_pd.field_e = (ca) (Object) var5;
                        var5.field_c = (ca) (Object) var4_ref_pd;
                        var5.field_e.field_c = (ca) (Object) var5;
                        var4_ref_pd.field_c.field_e = (ca) (Object) var4_ref_pd;
                        var2_int = 0;
                        break L113;
                      }
                      var3_ref = var3_ref.field_e;
                      continue L111;
                    }
                  }
                }
                continue L84;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        try {
            if (param0 != -4) {
                ((f) this).field_x = 36;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "f.J(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_int = 1 << param0;
                        if ((lb.field_g & var3_int) == 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        dm.field_f = dm.field_f | var3_int;
                        if (param2 == -25) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        lb.field_g = lb.field_g | var3_int;
                        oj.field_r.a(-74, (ca) (Object) new kg(param0));
                        if (!fc.field_d) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        pe.field_b.a(-105, (ca) (Object) new ha(param0, param1, bc.field_r, mm.field_C, a.field_r, nh.field_b + -wf.field_c.field_e[0].field_d));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var3, "f.M(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 < -28) {
                break L0;
              } else {
                field_j = true;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_w = null;
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        kb var2_ref = null;
        km var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        kb var4_ref_kb = null;
        kb var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        kb stackIn_14_0 = null;
        kb stackIn_14_1 = null;
        kb stackIn_16_0 = null;
        kb stackIn_16_1 = null;
        kb stackIn_31_0 = null;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackOut_6_0 = 0;
        kb stackOut_13_0 = null;
        kb stackOut_13_1 = null;
        kb stackOut_14_0 = null;
        kb stackOut_14_1 = null;
        kb stackOut_30_0 = null;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = (kb) (Object) ((f) this).field_o.b((byte) 127);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_ref == null) {
                            statePc = 61;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((((f) this).field_f.field_o[var2_ref.field_h * ((f) this).field_f.field_c + var2_ref.field_g] ^ -1) != -8) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = -1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == var2_ref.field_C) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 <= (var2_ref.field_F ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (kb) var2_ref;
                        stackOut_13_1 = (kb) var2_ref;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (kb) (Object) stackIn_14_0;
                        stackOut_14_1 = (kb) (Object) stackIn_14_1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_16_0.field_F = stackIn_16_1.field_F - 1;
                        var3 = oj.a((byte) 47, var2_ref.field_C);
                        var4 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var4 ^ -1) <= (var3 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var3 ^ -1) >= (var5_int ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = ((f) this).field_f.field_c * (var2_ref.field_h + var5_int) + var2_ref.field_g + var4;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((f) this).field_f.field_o[var6] = 7;
                        ((f) this).field_f.field_j[var6] = 29;
                        var5_int++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var2_ref.b(0, var2_ref.field_h, var2_ref.field_g);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null != var2_ref.field_s) {
                            statePc = 39;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3_ref = new km(((f) this).field_o);
                        var4_ref_kb = (kb) (Object) var3_ref.d(27935);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var4_ref_kb == null) {
                            statePc = 38;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var2_ref == var4_ref_kb) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (kb) var2_ref;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != var4_ref_kb.field_s) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4_ref_kb.d(param0 ^ -10);
                        var4_ref_kb.field_C = -1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4_ref_kb = (kb) (Object) var3_ref.b(true);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3_ref = new km(((f) this).field_o);
                        var4 = 0;
                        var5 = (kb) (Object) var3_ref.d(27935);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var5 == null) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5 == var2_ref) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var2_ref.field_s != var5.field_s) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4 = 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var5 = (kb) (Object) var3_ref.b(true);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var4 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var2_ref.field_s.d(param0 ^ -10);
                        var2_ref.field_s.field_C = -1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var2_ref.c(1);
                        var2_ref.field_C = -1;
                        var2_ref.b(57);
                        var3 = -1 + var2_ref.field_g;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((var3 ^ -1) < (1 + var2_ref.field_g ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var4 = -1 + var2_ref.field_h;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var4 ^ -1) < (var2_ref.field_h - -1 ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((((f) this).field_f.field_o[((f) this).field_f.field_c * var4 + var3] ^ -1) == -2) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ((f) this).field_f.field_j[var4 * ((f) this).field_f.field_c + var3] = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var4++;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var3++;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var2_ref = (kb) (Object) ((f) this).field_o.d(853);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = param0;
                        stackOut_61_1 = -1;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 == stackIn_62_1) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ((f) this).field_e = null;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "f.B(" + param0 + 41);
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ki param0, int param1) {
        RuntimeException runtimeException = null;
        hj var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2 = new hj(param0.a("", 1, "final_frame.jpg"), (java.awt.Component) (Object) tf.field_f);
                        if (param1 == -17763) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        var3 = var2.field_o;
                        var4 = var2.field_k;
                        h.k(122);
                        t.field_j = new hj(var3, var4 * 3 / 4);
                        t.field_j.d();
                        var2.b(0, 0);
                        fd.field_a = new hj(var3, -t.field_j.field_k + var4);
                        fd.field_a.d();
                        var2.b(0, -t.field_j.field_k);
                        fd.field_a.field_u = t.field_j.field_k;
                        oc.g((byte) -105);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) runtimeException;
                        stackOut_5_1 = new StringBuilder().append("f.H(");
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param0 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                        stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                        stackOut_6_2 = "{...}";
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                    stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                    stackOut_8_2 = "null";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static wd a(se param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        wd stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        wd stackOut_35_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.h(8, 8);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 >= var2_int) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new IllegalStateException("" + var2_int);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = eg.a(param0, 26678) ? 1 : 0;
                        var4 = eg.a(param0, param1 + 26662) ? 1 : 0;
                        var5 = new wd();
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5.field_c = (short)param0.h(16, param1 ^ 24);
                        var5.field_R = ca.a(var5.field_R, 16, false, param0);
                        var5.field_x = ca.a(var5.field_x, 16, false, param0);
                        var5.field_Q = ca.a(var5.field_Q, 16, false, param0);
                        var5.field_u = (short)param0.h(16, 8);
                        var5.field_M = ca.a(var5.field_M, 16, false, param0);
                        var5.field_e = ca.a(var5.field_e, 16, false, param0);
                        var5.field_l = ca.a(var5.field_l, param1, false, param0);
                        if (var3 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5.field_w = (short)param0.h(16, param1 + -8);
                        var5.field_K = ca.a(var5.field_K, 16, false, param0);
                        var5.field_H = ca.a(var5.field_H, 16, false, param0);
                        var5.field_G = ca.a(var5.field_G, 16, false, param0);
                        var5.field_q = ca.a(var5.field_q, 16, false, param0);
                        var5.field_y = ca.a(var5.field_y, 16, false, param0);
                        var5.field_i = ca.a(var5.field_i, 16, false, param0);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        int discarded$1 = param0.h(16, param1 ^ 24);
                        var5.field_n = ca.a(var5.field_n, 16, false, param0);
                        var5.field_B = ca.a(var5.field_B, 16, false, param0);
                        var5.field_h = ca.a(var5.field_h, 16, false, param0);
                        var5.field_s = ca.a(var5.field_s, 16, false, param0);
                        var5.field_a = ca.a(var5.field_a, 16, false, param0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (eg.a(param0, 26678)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5.field_N = ca.a(var5.field_N, 16, false, param0);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!eg.a(param0, param1 ^ 26662)) {
                            statePc = 35;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5.field_t = aa.a(param0, var5.field_t, 16, 20783);
                        var6 = 0;
                        var7 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var5.field_t.length ^ -1) >= (var7 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var6 ^ -1) > (var5.field_t[var7] & 255 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = var5.field_t[var7] & 255;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 0;
                        stackOut_27_1 = var6;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 != stackIn_28_1) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5.field_t = null;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5.field_m = (byte)(var6 + 1);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = (wd) var5;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    try {
                        stackOut_38_0 = (RuntimeException) var2;
                        stackOut_38_1 = new StringBuilder().append("f.D(");
                        stackIn_41_0 = stackOut_38_0;
                        stackIn_41_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (param0 == null) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                        stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                        stackOut_39_2 = "{...}";
                        stackIn_42_0 = stackOut_39_0;
                        stackIn_42_1 = stackOut_39_1;
                        stackIn_42_2 = stackOut_39_2;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 41: {
                    stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                    stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                    stackOut_41_2 = "null";
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw dd.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        kb var2_ref = null;
        me var2_ref2 = null;
        me var3 = null;
        int var4 = 0;
        me stackIn_15_0 = null;
        me stackOut_14_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((f) this).field_q ^ -1) >= (var2_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((f) this).field_e[var2_int].b((byte) 85);
                        var2_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_ref = (kb) (Object) ((f) this).field_o.b((byte) 127);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (null == var2_ref) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_ref.e(123);
                        var2_ref = (kb) (Object) ((f) this).field_o.d(853);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = -34 / ((param0 - 40) / 60);
                        var3 = (me) (Object) ((f) this).field_h.b((byte) 126);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3.a((byte) 32);
                        var3 = (me) (Object) ((f) this).field_h.d(853);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_ref2 = (me) (Object) ((f) this).field_h.b((byte) -96);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var2_ref2 == null) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (me) var2_ref2;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((stackIn_15_0.field_m ^ -1) == 0) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2_ref2.b(57);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var2_ref2 = (me) (Object) ((f) this).field_h.d(853);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "f.E(" + param0 + 41);
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final kb a(int param0, int param1) {
        kb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb stackIn_12_0 = null;
        Object stackIn_17_0 = null;
        kb stackOut_11_0 = null;
        Object stackOut_16_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = (kb) (Object) ((f) this).field_o.b((byte) 119);
                        var4 = -127 % ((-2 - param1) / 44);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == var3) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = oj.a((byte) 47, var3.field_C);
                        if ((var3.field_C ^ -1) != 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 >= var5) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var5 ^ -1) >= (var7 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var7 * ((f) this).field_f.field_c + var6 + var3.field_w ^ -1) == (param0 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (kb) var3;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var7++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6++;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = (kb) (Object) ((f) this).field_o.d(853);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = null;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return (kb) (Object) stackIn_17_0;
                }
                case 18: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var3_ref, "f.K(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static sh a(boolean param0, long param1, String param2, int param3, String param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        hh stackIn_8_0 = null;
        ic stackIn_13_0 = null;
        ii stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Object stackOut_1_0 = null;
        hh stackOut_7_0 = null;
        ic stackOut_12_0 = null;
        ii stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param3 == 17470) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (sh) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if (-1L != (param1 ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 == null) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = new hh(param2, param4);
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (sh) (Object) stackIn_8_0;
                }
                case 9: {
                    try {
                        if (param0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = new ic(param1, param4);
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return (sh) (Object) stackIn_13_0;
                }
                case 14: {
                    try {
                        stackOut_14_0 = new ii(param1, param4);
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return (sh) (Object) stackIn_15_0;
                }
                case 16: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) var6;
                        stackOut_17_1 = new StringBuilder().append("f.C(").append(param0).append(44).append(param1).append(44);
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param2 == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 20: {
                    stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                    stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                    stackOut_20_2 = "null";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param3).append(44);
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (param4 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "{...}";
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 24: {
                    stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                    stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                    stackOut_24_2 = "null";
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw dd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        java.net.URL stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        String stackOut_2_0 = null;
        java.net.URL stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = null;
                        var5 = -69 % ((param2 - 42) / 59);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (ld.field_e == null) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = ld.field_e;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!((String) (Object) stackIn_3_0).equals((Object) (Object) param0.getParameter("settings"))) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = ld.field_e;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (pc.field_ab == null) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (pc.field_ab.equals((Object) (Object) param0.getParameter("session"))) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = pc.field_ab;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = lj.a(var3, param1, -1, var4, (byte) 72);
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) var3_ref;
                        stackOut_18_1 = new StringBuilder().append("f.N(");
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param0 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                    stackOut_21_2 = "null";
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (param1 == null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "{...}";
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_26_2 = stackOut_23_2;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                    stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                    stackOut_25_2 = "null";
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    throw dd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, ha param1, byte param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        oa.field_d.a(-114, (ca) (Object) param1);
                        tl.a(-127, param1, param0);
                        var3_int = 75 / ((param2 - 30) / 33);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) runtimeException;
                        stackOut_3_1 = new StringBuilder().append("f.G(").append(param0).append(44);
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param1 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = OrbDefence.field_D ? 1 : 0;
                    ((f) this).field_t = 0;
                    ((f) this).field_u = 0;
                    ((f) this).field_d = 0;
                    ((f) this).field_a = false;
                    ((f) this).field_p = 0;
                    ((f) this).field_y = 0;
                    ((f) this).field_n = false;
                    ((f) this).field_l = 0;
                    ((f) this).field_s = 0;
                    ((f) this).field_v = 4;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((f) this).field_m = param0;
                        ((f) this).field_f = new kd(am.field_d[param0]);
                        ((f) this).field_r = new im();
                        ((f) this).field_o = new im();
                        ((f) this).field_h = new im();
                        ((f) this).field_b = new im();
                        ((f) this).field_q = 1;
                        ((f) this).field_e = new lb[((f) this).field_q];
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((f) this).field_q <= var2_int) {
                            statePc = 23;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((f) this).field_e[var2_int] = new lb((f) this, var2_int);
                        ((f) this).field_e[var2_int].field_j = ((f) this).field_f.field_c / 2;
                        ((f) this).field_e[var2_int].field_c = ((f) this).field_f.field_t / 2;
                        stackOut_3_0 = var2_int;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((stackIn_4_0 ^ -1) != -1) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((f) this).field_e[var2_int].field_j = ((f) this).field_e[var2_int].field_j - 4;
                        ((f) this).field_e[var2_int].field_c = ((f) this).field_e[var2_int].field_c - 2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (1 == var2_int) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((f) this).field_e[var2_int].field_j = ((f) this).field_e[var2_int].field_j + 2;
                        ((f) this).field_e[var2_int].field_c = ((f) this).field_e[var2_int].field_c - 2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var2_int != 2) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((f) this).field_e[var2_int].field_j = ((f) this).field_e[var2_int].field_j - 2;
                        ((f) this).field_e[var2_int].field_c = ((f) this).field_e[var2_int].field_c + 2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (3 == var2_int) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((f) this).field_e[var2_int].field_j = ((f) this).field_e[var2_int].field_j + 2;
                        ((f) this).field_e[var2_int].field_c = ((f) this).field_e[var2_int].field_c + 2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var2_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((f) this).field_g = 3000;
                        ((f) this).field_x = 0;
                        ((f) this).field_i = 0;
                        ((f) this).field_c = 100;
                        ((f) this).field_f.field_n = 0;
                        ((f) this).field_f.a((byte) 100);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dd.a((Throwable) (Object) var2, "f.<init>(" + param0 + 41);
                }
                case 26: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
