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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        double var8 = 0.0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("nm.A(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final void b(ah param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        String stackIn_165_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_144_0 = 0;
        int stackOut_144_1 = 0;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        String stackOut_164_2 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        String stackOut_162_2 = null;
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
                              stackOut_124_0 = var8.field_y;
                              stackOut_124_1 = 2;
                              stackIn_145_0 = stackOut_124_0;
                              stackIn_145_1 = stackOut_124_1;
                              stackIn_125_0 = stackOut_124_0;
                              stackIn_125_1 = stackOut_124_1;
                              if (var17 != 0) {
                                break L29;
                              } else {
                                L31: {
                                  if (stackIn_125_0 != stackIn_125_1) {
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
                            stackOut_144_0 = 5;
                            stackOut_144_1 = 1;
                            stackIn_145_0 = stackOut_144_0;
                            stackIn_145_1 = stackOut_144_1;
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
            stackOut_161_0 = (RuntimeException) (var3);
            stackOut_161_1 = new StringBuilder().append("nm.D(");
            stackIn_164_0 = stackOut_161_0;
            stackIn_164_1 = stackOut_161_1;
            stackIn_162_0 = stackOut_161_0;
            stackIn_162_1 = stackOut_161_1;
            if (param0 == null) {
              stackOut_164_0 = (RuntimeException) ((Object) stackIn_164_0);
              stackOut_164_1 = (StringBuilder) ((Object) stackIn_164_1);
              stackOut_164_2 = "null";
              stackIn_165_0 = stackOut_164_0;
              stackIn_165_1 = stackOut_164_1;
              stackIn_165_2 = stackOut_164_2;
              break L33;
            } else {
              stackOut_162_0 = (RuntimeException) ((Object) stackIn_162_0);
              stackOut_162_1 = (StringBuilder) ((Object) stackIn_162_1);
              stackOut_162_2 = "{...}";
              stackIn_165_0 = stackOut_162_0;
              stackIn_165_1 = stackOut_162_1;
              stackIn_165_2 = stackOut_162_2;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_3_0 = wn.a(param0.field_z, var3_int, -114, this.field_q, param0.field_C, this.field_l);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("nm.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(ha param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        nt var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
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
                            L9: {
                              L10: {
                                var3_int = this.field_y;
                                if ((var3_int ^ -1) != -7) {
                                  break L10;
                                } else {
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var3_int == 7) {
                                break L8;
                              } else {
                                L11: {
                                  if ((var3_int ^ -1) != -1) {
                                    break L11;
                                  } else {
                                    if (var4 == 0) {
                                      break L7;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if ((var3_int ^ -1) != -2) {
                                    break L12;
                                  } else {
                                    if (var4 == 0) {
                                      break L6;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (var3_int == 2) {
                                  break L5;
                                } else {
                                  if ((var3_int ^ -1) == -4) {
                                    break L4;
                                  } else {
                                    L13: {
                                      if (-5 != (var3_int ^ -1)) {
                                        break L13;
                                      } else {
                                        if (var4 == 0) {
                                          break L3;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    if (5 != var3_int) {
                                      break L1;
                                    } else {
                                      if (var4 == 0) {
                                        break L2;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            o.field_b[0].a((this.field_q >> -840174456) - (o.field_b[0].c() >> -455914559), (this.field_l >> 456584392) - (o.field_b[0].a() >> -556637439));
                            if ((this.field_t ^ -1) < -6) {
                              break L1;
                            } else {
                              o.field_b[1].a((float)(this.field_q >> 316610952), (float)(this.field_l >> 511686088), 4096, (this.field_p << 1596157386) % 65536, 1, 0, 2);
                              if (var4 == 0) {
                                break L1;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L14: {
                            go.field_p[0].a((this.field_q >> 1870351912) - (go.field_p[0].c() >> 728486177), (this.field_l >> -382789784) + -(go.field_p[0].a() >> 1357206241));
                            if (-6 > (this.field_t ^ -1)) {
                              break L14;
                            } else {
                              if (((this.field_p >> 1048149637) % 2 ^ -1) == -2) {
                                go.field_p[1].a((this.field_q >> 971569064) - (go.field_p[1].c() >> -1669239071), (this.field_l >> 1597433096) + -(go.field_p[1].a() >> -575722879), 1, 0, 2);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (!this.field_x) {
                            break L1;
                          } else {
                            if (-1 != (ul.field_f ^ -1)) {
                              break L1;
                            } else {
                              kw.field_a.a((float)(this.field_q >> 1468900040), (float)(this.field_l >> 1846036840), (int)((double)this.field_m / 28.0 * 3072.0), 0, 1, 0, 2);
                              if (var4 == 0) {
                                break L1;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        rb.field_a[0].a((float)(this.field_q >> 1353436296), (float)(this.field_l >> 70831304), 2048, this.field_o);
                        rb.field_a[(this.field_p >> -329097051) % rb.field_a.length].a((float)(this.field_q >> 455209864), (float)(this.field_l >> -2138189656), 2048, this.field_o, 1, 0, 2);
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                      uc.field_e[0].a((this.field_q >> -113916920) - (uc.field_e[0].c() >> 767638561), (this.field_l >> 1213664488) - (uc.field_e[0].a() >> 831510849));
                      uc.field_e[1].a((this.field_q >> -1539730264) - (uc.field_e[1].c() >> 1299868289), (this.field_l >> -351129752) - (uc.field_e[1].a() >> -1669514655), 1, 0, 2);
                      si.field_e.a((this.field_q >> -612748344) - (si.field_e.c() >> -1031450111), (this.field_l >> 658272616) - (si.field_e.a() >> 2009589761), 0, 16777215 + (this.field_A << 1831707000), 1);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                    uj.field_b[0].a((float)(this.field_q >> -560373176), (float)(this.field_l >> -680128344), 4096, 0);
                    uj.field_b[1].a((float)(this.field_q >> -1566102328), (float)(this.field_l >> 1567315720), 4096, (this.field_p << -2105031030) % 65536, 1, 0, 2);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  kk.field_f.a((this.field_q >> 886045928) + -(kk.field_f.c() >> -164555551), (this.field_l >> 327177352) - (kk.field_f.a() >> 1465788609), 1, 0, 2);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                f.field_r[0].a((this.field_q >> 428854568) + -(f.field_r[0].c() >> -487638463), (this.field_l >> 787229544) + -(f.field_r[0].a() >> 1267809665));
                f.field_r[1].a((this.field_q >> 991111240) + -(f.field_r[1].c() >> -350828767), (this.field_l >> -2085071256) + -(f.field_r[1].a() >> -47089567), 0, -15687169, 1);
                if (ul.field_f == 1) {
                  vl.field_c.a((this.field_q >> 1350761000) - (vl.field_c.c() >> 87602529), (this.field_l >> 1019681416) + -(vl.field_c.a() >> 298148705), 0, -15687169, 1);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
              f.field_r[0].a((this.field_q >> 1014175208) - (f.field_r[0].c() >> -1478270463), (this.field_l >> -94638360) + -(f.field_r[0].a() >> 1244254881));
              f.field_r[1].a((this.field_q >> 696853928) - (f.field_r[1].c() >> 1596654657), (this.field_l >> -457071480) - (f.field_r[1].a() >> 2039716257), 0, -31744, 1);
              if (1 == ul.field_f) {
                vl.field_c.a((this.field_q >> -1650484984) - (vl.field_c.c() >> -71515775), (this.field_l >> -140589112) + -(vl.field_c.a() >> -431638207), 0, -31744, 1);
                break L1;
              } else {
                break L1;
              }
            }
            L15: {
              if (param1 == -15687169) {
                break L15;
              } else {
                discarded$1 = this.c((ah) null, -20);
                break L15;
              }
            }
            var3_ref = (nt) ((Object) this.field_w.b(67));
            L16: while (true) {
              L17: {
                L18: {
                  if (var3_ref == null) {
                    break L18;
                  } else {
                    var3_ref.a(param0, -128);
                    var3_ref = (nt) ((Object) this.field_w.d((byte) 18));
                    if (var4 != 0) {
                      break L17;
                    } else {
                      if (var4 == 0) {
                        continue L16;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
                break L17;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) (var3);
            stackOut_94_1 = new StringBuilder().append("nm.H(");
            stackIn_97_0 = stackOut_94_0;
            stackIn_97_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param0 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L19;
            } else {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "{...}";
              stackIn_98_0 = stackOut_95_0;
              stackIn_98_1 = stackOut_95_1;
              stackIn_98_2 = stackOut_95_2;
              break L19;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        nt var2_ref = null;
        int var3 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_32_0 = false;
        int stackOut_39_0 = 0;
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
            var2_ref = (nt) ((Object) this.field_w.b(74));
            L7: while (true) {
              L8: {
                L9: {
                  if (null == var2_ref) {
                    break L9;
                  } else {
                    stackOut_32_0 = var2_ref.a(-2567);
                    stackIn_40_0 = stackOut_32_0 ? 1 : 0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var3 != 0) {
                      break L8;
                    } else {
                      L10: {
                        if (!stackIn_33_0) {
                          break L10;
                        } else {
                          var2_ref.b(false);
                          break L10;
                        }
                      }
                      var2_ref = (nt) ((Object) this.field_w.d((byte) 18));
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
                stackOut_39_0 = this.field_y ^ -1;
                stackIn_40_0 = stackOut_39_0;
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
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "nm.E(" + param0 + ')');
        }
    }

    final static void a(fs param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("nm.G(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
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
