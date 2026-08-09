/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nm extends ms {
    private int field_A;
    int field_m;
    private boolean field_z;
    int field_y;
    static String[] field_u;
    static String field_n;
    private int field_o;
    private int field_B;
    int field_l;
    private int field_r;
    private boolean field_x;
    int field_s;
    private int field_v;
    private int field_k;
    private int field_t;
    private jn field_w;
    int field_q;
    private int field_p;

    public static void c(int param0) {
        try {
            field_n = null;
            field_u = null;
            if (param0 != 1432625512) {
                nm.a((fs) null, (byte) -50);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nm.B(" + param0 + ')');
        }
    }

    private final void a(ah param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        try {
          L0: {
            L1: {
              var3_int = param0.field_m - -(this.field_m << 94712200);
              var4 = param0.field_C - this.field_q;
              var5 = param0.field_z - this.field_l;
              var6 = (int)Math.round(Math.max(1.0, Math.sqrt((double)((float)var5 * (float)var5 + (float)var4 * (float)var4))));
              if ((var3_int ^ -1) < (var6 ^ -1)) {
                var7 = var4 * (-var6 + var3_int) / var6;
                param0.field_C = param0.field_C + (var7 << -2091389887);
                var8_int = var5 * (var3_int + -var6) / var6;
                param0.field_z = param0.field_z + (var8_int << 1696402625);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var4 = (var4 << 1760579400) / var6;
              var5 = (var5 << 1159649256) / var6;
              param0.field_d = 0;
              if (param1 < -61) {
                break L2;
              } else {
                this.field_q = -35;
                break L2;
              }
            }
            L3: {
              var7 = -(var4 * param0.field_A) + param0.field_E * var5 >> -305720632;
              var8 = 2.0;
              if (!this.field_x) {
                break L3;
              } else {
                var8 = 5.0;
                break L3;
              }
            }
            L4: {
              if (6 != this.field_y) {
                break L4;
              } else {
                var8 = 0.5;
                break L4;
              }
            }
            var10 = (int)(var8 * 800.0) << -1682405304;
            param0.field_E = var5 * var7 + var10 * var4 / param0.field_o >> -98290424;
            param0.field_A = var5 * var10 / param0.field_o + -(var4 * var7) >> 951692744;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("nm.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final void b(ah param0, int param1) {
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        String stackIn_165_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        jn var5 = null;
        cb var6 = null;
        int var7 = 0;
        nm var8 = null;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        var17 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0.g(57)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  var9 = this.field_y;
                                  if (var9 != 7) {
                                    break L10;
                                  } else {
                                    if (var17 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (6 != var9) {
                                    break L11;
                                  } else {
                                    if (var17 == 0) {
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                if (-1 == (var9 ^ -1)) {
                                  break L7;
                                } else {
                                  L12: {
                                    if (var9 != 1) {
                                      break L12;
                                    } else {
                                      if (var17 == 0) {
                                        break L6;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (2 != var9) {
                                      break L13;
                                    } else {
                                      if (var17 == 0) {
                                        break L5;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (3 != var9) {
                                      break L14;
                                    } else {
                                      if (var17 == 0) {
                                        break L4;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if (var9 == 4) {
                                    break L3;
                                  } else {
                                    if ((var9 ^ -1) != -6) {
                                      break L1;
                                    } else {
                                      if (var17 == 0) {
                                        break L2;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                              L15: {
                                if (this.field_x) {
                                  break L15;
                                } else {
                                  if (0 < this.field_t) {
                                    break L15;
                                  } else {
                                    this.field_k = 12;
                                    this.field_t = 200;
                                    this.field_x = true;
                                    gn.a(3, true);
                                    ts.a(this.field_q, this.field_w, -16240, 25, 65535, this.field_l);
                                    break L15;
                                  }
                                }
                              }
                              if (-1 <= (this.field_k ^ -1)) {
                                break L1;
                              } else {
                                this.a(param0, param1 ^ -16777041);
                                if (var17 == 0) {
                                  break L1;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L16: {
                              if (-1 > (this.field_t ^ -1)) {
                                this.a(param0, param1 + -16777029);
                                if (var17 == 0) {
                                  break L1;
                                } else {
                                  break L16;
                                }
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              if (!param0.g(param1 ^ 16776998)) {
                                break L17;
                              } else {
                                if (var17 == 0) {
                                  break L1;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              if ((param0.field_N ^ -1) != -2) {
                                break L18;
                              } else {
                                if (param0.field_v == 0) {
                                  L19: {
                                    var9 = -param0.field_C + this.field_q;
                                    var10 = this.field_l + -param0.field_z;
                                    var11 = Math.sqrt((double)(var9 * var9 - -(var10 * var10)));
                                    var13 = Math.asin((double)var9 / var11);
                                    var15 = var13 + 3.141592653589793;
                                    if (Math.abs(-param0.field_s + var15) < 1.5707963267948966) {
                                      break L19;
                                    } else {
                                      L20: {
                                        ro.a(param0, (byte) 113);
                                        this.field_t = 200;
                                        if (12 != oh.field_e) {
                                          break L20;
                                        } else {
                                          bn.field_P = true;
                                          break L20;
                                        }
                                      }
                                      ts.a(this.field_q, this.field_w, -16240, 25, 65535, this.field_l);
                                      if (var17 == 0) {
                                        break L1;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L21: {
                                    L22: {
                                      L23: {
                                        if ((param0.field_A ^ -1) <= -1) {
                                          break L23;
                                        } else {
                                          if (-this.field_l + param0.field_z > 0) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      if (0 >= param0.field_A) {
                                        break L21;
                                      } else {
                                        if ((param0.field_z - this.field_l ^ -1) > -1) {
                                          break L22;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    param0.field_A = param0.field_A * -2;
                                    break L21;
                                  }
                                  L24: {
                                    L25: {
                                      L26: {
                                        if ((param0.field_E ^ -1) <= -1) {
                                          break L26;
                                        } else {
                                          if (0 < -this.field_q + param0.field_C) {
                                            break L25;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      if (0 >= param0.field_E) {
                                        break L24;
                                      } else {
                                        if ((-this.field_q + param0.field_C ^ -1) <= -1) {
                                          break L24;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                    param0.field_E = param0.field_E * -2;
                                    break L24;
                                  }
                                  param0.h((byte) -55);
                                  this.field_t = 200;
                                  if (var17 == 0) {
                                    break L1;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L27: {
                              ro.a(param0, (byte) 113);
                              if (oh.field_e == 12) {
                                bn.field_P = true;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            this.field_t = 200;
                            ts.a(this.field_q, this.field_w, -16240, 25, 65535, this.field_l);
                            if (var17 == 0) {
                              break L1;
                            } else {
                              break L7;
                            }
                          }
                          var3_int = -param0.field_C + this.field_B;
                          var4 = -param0.field_z + this.field_r;
                          param0.field_E = (int)((double)param0.field_E + 0.00016 * (double)ov.a(-63, var3_int) * Math.pow((double)var3_int, 2.0) / (double)param0.field_o);
                          param0.field_A = (int)((double)param0.field_A + (double)ov.a(-69, var4) * 0.00016 * Math.pow((double)var4, 2.0) / (double)param0.field_o);
                          param0.field_D = true;
                          tq.a(-111, fi.a(4, he.field_o, (byte) -96) + 6, false);
                          if (var17 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                        param0.field_f = true;
                        this.field_z = true;
                        tq.a(-112, 1, false);
                        if (var17 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                      var5 = is.field_c;
                      var7 = 0;
                      var6 = new cb(var5);
                      var8 = (nm) ((Object) var6.b((byte) -80));
                      L28: while (true) {
                        L29: {
                          L30: {
                            if (null == var8) {
                              break L30;
                            } else {
                              stackIn_145_0 = var8.field_y;

                              stackIn_145_1 = 2;

                              if (var17 != 0) {
                                break L29;
                              } else {
                                L31: {
                                  if (stackIn_145_0 != stackIn_145_1) {
                                    break L31;
                                  } else {
                                    if (0 < this.field_v) {
                                      break L31;
                                    } else {
                                      if ((var8.field_s ^ -1) == (this.field_s ^ -1)) {
                                        break L31;
                                      } else {
                                        if (0 == fi.a(6, he.field_o, (byte) -96)) {
                                          param0.field_C = var8.field_q;
                                          param0.field_z = var8.field_l;
                                          var8.field_v = 60;
                                          var7 = 1;
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                  }
                                }
                                var8 = (nm) ((Object) var6.b(param1 ^ 16776960));
                                if (var17 == 0) {
                                  continue L28;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                          if (var7 != 0) {
                            stackIn_145_0 = 5;
                            stackIn_145_1 = 1;
                            break L29;
                          } else {
                            break L1;
                          }
                        }
                        gn.a(stackIn_145_0, stackIn_145_1 != 0);
                        ts.a(this.field_q, this.field_w, -16240, 10, 16776960, this.field_l);
                        if (var17 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.a(param0, -68);
                    gn.a(13, true);
                    if (param0.field_Q != 0) {
                      break L1;
                    } else {
                      tl.field_v = tl.field_v + 1;
                      if (gt.field_ab > 0) {
                        break L1;
                      } else {
                        gt.field_ab = 250;
                        if (var17 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var3_int = this.field_q + -param0.field_C;
                  var4 = -param0.field_z + this.field_l;
                  param0.field_E = (int)((double)param0.field_E + (double)ov.a(param1 ^ -16777002, var3_int) * 0.000035 * Math.pow((double)var3_int, 2.0) / (double)param0.field_o);
                  param0.field_A = (int)((double)param0.field_A + (double)ov.a(-115, var4) * 0.000035 * Math.pow((double)var4, 2.0) / (double)param0.field_o);
                  this.field_z = true;
                  tq.a(-119, 1, true);
                  if (var17 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                var4 = this.field_l - param0.field_z;
                var3_int = -param0.field_C + this.field_q;
                param0.field_E = (int)((double)param0.field_E - (double)ov.a(-56, var3_int) * 0.000035 * Math.pow((double)var3_int, 2.0) / (double)param0.field_o);
                param0.field_A = (int)((double)param0.field_A - 0.000035 * (double)ov.a(-52, var4) * Math.pow((double)var4, 2.0) / (double)param0.field_o);
                this.field_z = true;
                tq.a(-123, 2, true);
                break L1;
              }
              L32: {
                if (param1 == 16776960) {
                  break L32;
                } else {
                  this.field_t = 113;
                  break L32;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var3 = decompiledCaughtException;
            stackIn_164_0 = (RuntimeException) (var3);

            stackIn_164_1 = new StringBuilder().append("nm.D(");

            if (param0 == null) {
              stackIn_165_0 = (RuntimeException) ((Object) stackIn_164_0);
              stackIn_165_1 = (StringBuilder) ((Object) stackIn_164_1);
              stackIn_165_2 = "null";
              break L33;
            } else {
              stackIn_165_0 = (RuntimeException) ((Object) stackIn_164_0);
              stackIn_165_1 = (StringBuilder) ((Object) stackIn_164_1);
              stackIn_165_2 = "{...}";
              break L33;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_165_0), stackIn_165_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean c(ah param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 2145812808) {
                break L1;
              } else {
                this.a((ah) null, 12);
                break L1;
              }
            }
            var3_int = param0.field_m - -(this.field_m << 2145812808);
            stackIn_4_0 = wn.a(param0.field_z, var3_int, -114, this.field_q, param0.field_C, this.field_l);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("nm.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(ha param0, int param1) {
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        nt var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_y;
                        if ((var3_int ^ -1) != -7) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3_int == 7) {
                            statePc = 44;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var3_int ^ -1) != -1) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var3_int ^ -1) != -2) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var3_int == 2) {
                            statePc = 66;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var3_int ^ -1) == -4) {
                            statePc = 69;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-5 != (var3_int ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var4 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (5 != var3_int) {
                            statePc = 84;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var4 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        o.field_b[0].a((this.field_q >> -840174456) - (o.field_b[0].c() >> -455914559), (this.field_l >> 456584392) - (o.field_b[0].a() >> -556637439));
                        if ((this.field_t ^ -1) < -6) {
                            statePc = 84;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        o.field_b[1].a((float)(this.field_q >> 316610952), (float)(this.field_l >> 511686088), 4096, (this.field_p << 1596157386) % 65536, 1, 0, 2);
                        if (var4 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        go.field_p[0].a((this.field_q >> 1870351912) - (go.field_p[0].c() >> 728486177), (this.field_l >> -382789784) + -(go.field_p[0].a() >> 1357206241));
                        if (-6 > (this.field_t ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((this.field_p >> 1048149637) % 2 ^ -1) == -2) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        go.field_p[1].a((this.field_q >> 971569064) - (go.field_p[1].c() >> -1669239071), (this.field_l >> 1597433096) + -(go.field_p[1].a() >> -575722879), 1, 0, 2);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!this.field_x) {
                            statePc = 84;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-1 != (ul.field_f ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        kw.field_a.a((float)(this.field_q >> 1468900040), (float)(this.field_l >> 1846036840), (int)((double)this.field_m / 28.0 * 3072.0), 0, 1, 0, 2);
                        if (var4 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        rb.field_a[0].a((float)(this.field_q >> 1353436296), (float)(this.field_l >> 70831304), 2048, this.field_o);
                        rb.field_a[(this.field_p >> -329097051) % rb.field_a.length].a((float)(this.field_q >> 455209864), (float)(this.field_l >> -2138189656), 2048, this.field_o, 1, 0, 2);
                        if (var4 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        uc.field_e[0].a((this.field_q >> -113916920) - (uc.field_e[0].c() >> 767638561), (this.field_l >> 1213664488) - (uc.field_e[0].a() >> 831510849));
                        uc.field_e[1].a((this.field_q >> -1539730264) - (uc.field_e[1].c() >> 1299868289), (this.field_l >> -351129752) - (uc.field_e[1].a() >> -1669514655), 1, 0, 2);
                        si.field_e.a((this.field_q >> -612748344) - (si.field_e.c() >> -1031450111), (this.field_l >> 658272616) - (si.field_e.a() >> 2009589761), 0, 16777215 + (this.field_A << 1831707000), 1);
                        if (var4 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        uj.field_b[0].a((float)(this.field_q >> -560373176), (float)(this.field_l >> -680128344), 4096, 0);
                        uj.field_b[1].a((float)(this.field_q >> -1566102328), (float)(this.field_l >> 1567315720), 4096, (this.field_p << -2105031030) % 65536, 1, 0, 2);
                        if (var4 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        kk.field_f.a((this.field_q >> 886045928) + -(kk.field_f.c() >> -164555551), (this.field_l >> 327177352) - (kk.field_f.a() >> 1465788609), 1, 0, 2);
                        if (var4 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        f.field_r[0].a((this.field_q >> 428854568) + -(f.field_r[0].c() >> -487638463), (this.field_l >> 787229544) + -(f.field_r[0].a() >> 1267809665));
                        f.field_r[1].a((this.field_q >> 991111240) + -(f.field_r[1].c() >> -350828767), (this.field_l >> -2085071256) + -(f.field_r[1].a() >> -47089567), 0, -15687169, 1);
                        if (ul.field_f == 1) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        vl.field_c.a((this.field_q >> 1350761000) - (vl.field_c.c() >> 87602529), (this.field_l >> 1019681416) + -(vl.field_c.a() >> 298148705), 0, -15687169, 1);
                        if (var4 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        f.field_r[0].a((this.field_q >> 1014175208) - (f.field_r[0].c() >> -1478270463), (this.field_l >> -94638360) + -(f.field_r[0].a() >> 1244254881));
                        f.field_r[1].a((this.field_q >> 696853928) - (f.field_r[1].c() >> 1596654657), (this.field_l >> -457071480) - (f.field_r[1].a() >> 2039716257), 0, -31744, 1);
                        if (1 == ul.field_f) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        vl.field_c.a((this.field_q >> -1650484984) - (vl.field_c.c() >> -71515775), (this.field_l >> -140589112) + -(vl.field_c.a() >> -431638207), 0, -31744, 1);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (param1 == -15687169) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        this.c((ah) null, -20);
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var3 = (nt) ((Object) this.field_w.b(67));
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var3 == null) {
                            statePc = 99;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var3.a(param0, -128);
                        var3 = (nt) ((Object) this.field_w.d((byte) 18));
                        if (var4 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var4 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_97_0 = (RuntimeException) (var3_ref);
                    stackIn_95_0 = stackIn_97_0;
                    stackIn_97_1 = new StringBuilder().append("nm.H(");
                    stackIn_95_1 = stackIn_97_1;
                    if (param0 == null) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_98_0 = (RuntimeException) ((Object) stackIn_95_0);
                    stackIn_98_1 = (StringBuilder) ((Object) stackIn_95_1);
                    stackIn_98_2 = "{...}";
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
                    stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
                    stackIn_98_2 = "null";
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    throw qo.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
                }
                case 99: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_32_0;
        nt var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1048149637) {
                break L1;
              } else {
                this.field_A = -49;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_z) {
                  break L3;
                } else {
                  if (-73 > (this.field_A ^ -1)) {
                    this.field_A = this.field_A - 2;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (200 > this.field_A) {
                this.field_A = this.field_A + 2;
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              if (!this.field_x) {
                break L4;
              } else {
                this.field_k = this.field_k - 1;
                this.field_m = this.field_m + 2;
                if (this.field_k == 0) {
                  this.field_m = 20;
                  this.field_x = false;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (this.field_v <= 0) {
                break L5;
              } else {
                this.field_v = this.field_v - 1;
                break L5;
              }
            }
            L6: {
              if (-1 <= (this.field_t ^ -1)) {
                break L6;
              } else {
                this.field_t = this.field_t - 1;
                break L6;
              }
            }
            var2 = (nt) ((Object) this.field_w.b(74));
            L7: while (true) {
              L8: {
                L9: {
                  if (null == var2) {
                    break L9;
                  } else {
                    stackOut_32_0 = var2.a(-2567);
                    stackIn_40_0 = stackOut_32_0 ? 1 : 0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var3 != 0) {
                      break L8;
                    } else {
                      L10: {
                        if (!stackIn_33_0) {
                          break L10;
                        } else {
                          var2.b(false);
                          break L10;
                        }
                      }
                      var2 = (nt) ((Object) this.field_w.d((byte) 18));
                      if (var3 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                this.field_p = this.field_p + 1;
                this.field_z = false;
                stackIn_40_0 = this.field_y ^ -1;
                break L8;
              }
              L11: {
                if (stackIn_40_0 != -6) {
                  break L11;
                } else {
                  if (-1 != (this.field_p % 50 ^ -1)) {
                    break L11;
                  } else {
                    if (ul.field_f != 0) {
                      break L11;
                    } else {
                      this.field_w.a((ms) (new be(this.field_q >> -90875640, this.field_l >> -1799791544, 16745472, true)), (byte) 39);
                      break L11;
                    }
                  }
                }
              }
              L12: {
                if (this.field_y != 4) {
                  break L12;
                } else {
                  if (0 != this.field_p % 50) {
                    break L12;
                  } else {
                    if ((ul.field_f ^ -1) != -1) {
                      break L12;
                    } else {
                      this.field_w.a((ms) (new be(this.field_q >> 978274568, this.field_l >> -1003864600, 1090047, false)), (byte) 39);
                      break L12;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "nm.E(" + param0 + ')');
        }
    }

    final static void a(fs param0, byte param1) {
        int var2_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 30) {
                break L1;
              } else {
                nm.c(-34);
                break L1;
              }
            }
            qk.field_U = param0.a(255) << 2114914629;
            var2_int = param0.e(-31302);
            qk.field_U = qk.field_U + (var2_int >> 1627588579);
            sd.field_f = 1835008 & var2_int << 1593575314;
            sd.field_f = sd.field_f + (param0.a(255) << -1306927486);
            var2_int = param0.e(-31302);
            sd.field_f = sd.field_f + (var2_int >> -994235642);
            bb.field_l = (63 & var2_int) << 1906902351;
            bb.field_l = bb.field_l + (param0.e(-31302) << 768787847);
            var2_int = param0.e(-31302);
            ch.field_d = 65536 & var2_int << 1291038544;
            bb.field_l = bb.field_l + (var2_int >> 494973409);
            ch.field_d = ch.field_d + param0.a(255);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("nm.G(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            var2_int = this.field_y;
                            if (-1 == (var2_int ^ -1)) {
                              this.field_m = 20;
                              this.c((byte) 47);
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L8;
                              }
                            } else {
                              if ((var2_int ^ -1) == -2) {
                                break L8;
                              } else {
                                if (-3 == (var2_int ^ -1)) {
                                  break L7;
                                } else {
                                  if ((var2_int ^ -1) == -4) {
                                    break L6;
                                  } else {
                                    L9: {
                                      if (var2_int != 4) {
                                        break L9;
                                      } else {
                                        if (var3 == 0) {
                                          break L5;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if ((var2_int ^ -1) == -6) {
                                      break L4;
                                    } else {
                                      if (var2_int == 6) {
                                        break L3;
                                      } else {
                                        if (7 == var2_int) {
                                          break L2;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.field_m = 55;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L7;
                          }
                        }
                        this.field_m = 20;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                      this.field_m = 20;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                    this.field_m = 75;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  this.field_m = 75;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.field_m = 15;
                if (var3 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_m = 20;
              break L1;
            }
            L10: {
              if (param0 == -115) {
                break L10;
              } else {
                this.a(89);
                break L10;
              }
            }
            this.field_w = new jn();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "nm.F(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        double var2_double = 0.0;
        double var4 = 0.0;
        double var7 = 0.0;
        try {
            var2_double = -1.5707963267948966 + (double)this.field_o / 65536.0 * 6.283185307179586;
            int var6 = 20 % ((param0 - -24) / 41);
            var4 = 19200.0 * Math.sin(-var2_double);
            var7 = 19200.0 * Math.cos(-var2_double);
            this.field_r = (int)((double)this.field_l + var4);
            this.field_B = (int)(var7 + (double)this.field_q);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nm.I(" + param0 + ')');
        }
    }

    nm(int param0, int param1, int param2, int param3) {
        this.field_A = 72;
        try {
            this.field_l = param2 << -1467458936;
            this.field_q = param1 << 1432625512;
            this.field_o = param3;
            this.field_y = param0;
            this.a((byte) -115);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "nm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_n = "Waiting for levels";
        field_u = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
