/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.awt.Frame;
import java.applet.Applet;

final class nk {
    private gr field_i;
    static kp field_g;
    private int field_d;
    private int field_c;
    private int field_b;
    private int field_a;
    private int field_e;
    private int field_h;
    static String[] field_f;

    private final String b(int param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        String stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_15_0 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                boolean discarded$2 = this.a(-107, (byte) -6);
                break L1;
              }
            }
            var3 = "";
            L2: while (true) {
              L3: {
                L4: {
                  if (param0 < 1000) {
                    break L4;
                  } else {
                    var4 = param0 % 1000;
                    stackOut_6_0 = var4 + var3;
                    stackIn_16_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          var3 = stackIn_7_0;
                          param0 = param0 / 1000;
                          if (var4 < 10) {
                            break L6;
                          } else {
                            L7: {
                              if (var4 >= 100) {
                                break L7;
                              } else {
                                var3 = kp.field_b + "0" + var3;
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 = kp.field_b + var3;
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var3 = kp.field_b + "00" + var3;
                        break L5;
                      }
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_15_0 = param0 + var3;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3_ref, "nk.DA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    public static void c(byte param0) {
        try {
            field_g = null;
            field_f = null;
            if (param0 < 82) {
                nk.c((byte) 16);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "nk.BA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, ha param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        bo var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            param1 = param1 * param4 >> -175919416;
            var7_int = 15;
            param3.d(10, param1 + 1, 8 + param2, -5782, -861274112, param0 + -2);
            param0 = param0 - var7_int;
            param4 = param4 + (var7_int << 1999271329);
            dl.field_n[0].a(param0, param2);
            dl.field_n[2].a(-dl.field_n[2].d() + (param0 - -param4), param2);
            var8 = fa.a(param3, true);
            param4 = param4 + param0 - dl.field_n[2].d();
            var9 = param0;
            param0 = param0 + dl.field_n[0].d();
            var8.a(param4, param0, dl.field_n[2].c() + param2, param2, 126);
            L1: while (true) {
              L2: {
                L3: {
                  if (param4 <= param0) {
                    break L3;
                  } else {
                    dl.field_n[1].a(param0, param2);
                    param0 = param0 + dl.field_n[1].d();
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param5 < -11) {
                    break L4;
                  } else {
                    this.a(-86);
                    break L4;
                  }
                }
                var8.a(true);
                dl.field_n[3].a(var9 + param1, param2);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var7;
            stackOut_12_1 = new StringBuilder().append("nk.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        try {
          L0: {
            L1: {
              if (((nk) this).field_d != 2) {
                break L1;
              } else {
                if (cn.b(true)) {
                  break L1;
                } else {
                  if (3 > param0) {
                    stackOut_9_0 = -6 + bk.field_e[((nk) this).field_d];
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    stackOut_11_0 = -6 + (bk.field_e[((nk) this).field_d] - -oo.field_Y[((nk) this).field_d]);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              }
            }
            L2: {
              if (2 != ((nk) this).field_d) {
                break L2;
              } else {
                if (!cn.b(true)) {
                  break L2;
                } else {
                  stackOut_17_0 = -6 + (oo.field_Y[((nk) this).field_d] * param0 + bk.field_e[((nk) this).field_d]);
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              }
            }
            if (3 == ((nk) this).field_d) {
              stackOut_22_0 = bk.field_e[((nk) this).field_d] + -32;
              stackIn_23_0 = stackOut_22_0;
              return stackIn_23_0;
            } else {
              L3: {
                if (4 == ((nk) this).field_d) {
                  break L3;
                } else {
                  if (((nk) this).field_d != 5) {
                    L4: {
                      if (param1) {
                        break L4;
                      } else {
                        this.a(true, -26, -69);
                        break L4;
                      }
                    }
                    stackOut_40_0 = oo.field_Y[((nk) this).field_d] * param0 + bk.field_e[((nk) this).field_d];
                    stackIn_41_0 = stackOut_40_0;
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              if (ua.field_l[((nk) this).field_d].length > 1) {
                stackOut_33_0 = 382 - -(param0 * (12 + oo.field_Y[((nk) this).field_d])) + -4;
                stackIn_34_0 = stackOut_33_0;
                return stackIn_34_0;
              } else {
                stackOut_35_0 = -4 + (oo.field_Y[((nk) this).field_d] * param0 + 430);
                stackIn_36_0 = stackOut_35_0;
                return stackIn_36_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_41_0;
    }

    private final void a(int param0, int param1, int param2, boolean param3, ha param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        ha stackIn_23_3 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        ha stackIn_25_3 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        ha stackIn_27_3 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        ha stackIn_28_3 = null;
        int stackIn_28_4 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        ha stackIn_29_3 = null;
        int stackIn_29_4 = 0;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        ha stackIn_31_3 = null;
        int stackIn_31_4 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        ha stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        ha stackOut_22_3 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        ha stackOut_27_3 = null;
        int stackOut_27_4 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        ha stackOut_23_3 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        ha stackOut_25_3 = null;
        int stackOut_25_4 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        ha stackOut_28_3 = null;
        int stackOut_28_4 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        ha stackOut_31_3 = null;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        ha stackOut_29_3 = null;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var16 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param0 + this.a(param1, true);
              var7 = this.a(param1, 200);
              int discarded$2 = this.c(param2 + 116, param1);
              var8 = ua.field_l[((nk) this).field_d][param1];
              var9 = du.field_p[var8];
              if (var9 != null) {
                break L1;
              } else {
                var9 = "ERROR: missing text";
                break L1;
              }
            }
            L2: {
              var10 = this.c(118, param1) + -var7;
              int discarded$3 = this.b(true, param1);
              if (!param3) {
                stackOut_6_0 = -12046068;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = -7247318;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  var11 = stackIn_7_0;
                  var12 = -16;
                  if (var8 == 12) {
                    break L5;
                  } else {
                    if (var8 != 13) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  this.a(var6_int, param4, -86, var10, var7);
                  var13 = oq.field_K + 137;
                  var7 -= 8;
                  var14 = var7 + (-var13 + var10 >> -2021587487);
                  se.field_c.a(var9.toLowerCase(), var11, -1, (var10 >> -2063133375) + (var7 + -15), 11 + ((var12 >> 1122151841) + (kn.field_b.field_j + var6_int)), (byte) 92);
                  var14 = var14 + (16 + oq.field_K);
                  if (var8 != 12) {
                    stackOut_14_0 = l.field_c;
                    stackIn_15_0 = stackOut_14_0;
                    break L6;
                  } else {
                    stackOut_12_0 = gn.field_a;
                    stackIn_15_0 = stackOut_12_0;
                    break L6;
                  }
                }
                var15 = stackIn_15_0;
                this.a(var14, var15, 3 + var6_int, param4, 130, (byte) -55);
                if (var16 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
              L7: {
                L8: {
                  L9: {
                    if (20 == var8) {
                      break L9;
                    } else {
                      if (var8 != 21) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    stackOut_22_0 = this;
                    stackOut_22_1 = var10;
                    stackOut_22_2 = var7;
                    stackOut_22_3 = (ha) param4;
                    stackIn_27_0 = stackOut_22_0;
                    stackIn_27_1 = stackOut_22_1;
                    stackIn_27_2 = stackOut_22_2;
                    stackIn_27_3 = stackOut_22_3;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    if (var8 != 20) {
                      stackOut_27_0 = this;
                      stackOut_27_1 = stackIn_27_1;
                      stackOut_27_2 = stackIn_27_2;
                      stackOut_27_3 = (ha) (Object) stackIn_27_3;
                      stackOut_27_4 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      stackIn_28_3 = stackOut_27_3;
                      stackIn_28_4 = stackOut_27_4;
                      break L10;
                    } else {
                      stackOut_23_0 = this;
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = (ha) (Object) stackIn_23_3;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      stackOut_25_0 = this;
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = stackIn_25_2;
                      stackOut_25_3 = (ha) (Object) stackIn_25_3;
                      stackOut_25_4 = 1;
                      stackIn_28_0 = stackOut_25_0;
                      stackIn_28_1 = stackOut_25_1;
                      stackIn_28_2 = stackOut_25_2;
                      stackIn_28_3 = stackOut_25_3;
                      stackIn_28_4 = stackOut_25_4;
                      break L10;
                    }
                  }
                  L11: {
                    stackOut_28_0 = this;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = stackIn_28_2;
                    stackOut_28_3 = (ha) (Object) stackIn_28_3;
                    stackOut_28_4 = stackIn_28_4;
                    stackIn_31_0 = stackOut_28_0;
                    stackIn_31_1 = stackOut_28_1;
                    stackIn_31_2 = stackOut_28_2;
                    stackIn_31_3 = stackOut_28_3;
                    stackIn_31_4 = stackOut_28_4;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    stackIn_29_3 = stackOut_28_3;
                    stackIn_29_4 = stackOut_28_4;
                    if (cs.field_a != 0) {
                      stackOut_31_0 = this;
                      stackOut_31_1 = stackIn_31_1;
                      stackOut_31_2 = stackIn_31_2;
                      stackOut_31_3 = (ha) (Object) stackIn_31_3;
                      stackOut_31_4 = stackIn_31_4;
                      stackOut_31_5 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      stackIn_32_2 = stackOut_31_2;
                      stackIn_32_3 = stackOut_31_3;
                      stackIn_32_4 = stackOut_31_4;
                      stackIn_32_5 = stackOut_31_5;
                      break L11;
                    } else {
                      stackOut_29_0 = this;
                      stackOut_29_1 = stackIn_29_1;
                      stackOut_29_2 = stackIn_29_2;
                      stackOut_29_3 = (ha) (Object) stackIn_29_3;
                      stackOut_29_4 = stackIn_29_4;
                      stackOut_29_5 = 1;
                      stackIn_32_0 = stackOut_29_0;
                      stackIn_32_1 = stackOut_29_1;
                      stackIn_32_2 = stackOut_29_2;
                      stackIn_32_3 = stackOut_29_3;
                      stackIn_32_4 = stackOut_29_4;
                      stackIn_32_5 = stackOut_29_5;
                      break L11;
                    }
                  }
                  this.a(stackIn_32_1, stackIn_32_2, stackIn_32_3, (stackIn_32_4 ^ stackIn_32_5) != 0, var6_int, 24063);
                  if (var16 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
                this.a(var6_int, param4, param2 ^ -103, var10, var7);
                break L7;
              }
              se.field_c.a(param2 + 95, var11, -1, (var12 >> 197427713) + (var6_int - -kn.field_b.field_j - -11), (var10 >> -565286591) + var7, var9.toLowerCase());
              break L3;
            }
            L12: {
              if (param2 == 4) {
                break L12;
              } else {
                field_f = null;
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var6;
            stackOut_40_1 = new StringBuilder().append("nk.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param4 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L13;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 <= -56) {
              var4_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~ua.field_l[((nk) this).field_d].length >= ~var4_int) {
                      break L3;
                    } else {
                      var5 = this.a(var4_int, true);
                      stackOut_6_0 = this.a(var4_int, (byte) -17);
                      stackIn_26_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            if (~param1 > ~this.a(var4_int, 200)) {
                              break L4;
                            } else {
                              if (~this.c(123, var4_int) >= ~param1) {
                                break L4;
                              } else {
                                if (var5 > param2) {
                                  break L4;
                                } else {
                                  if (~param2 <= ~(var5 + this.b(true, var4_int))) {
                                    break L4;
                                  } else {
                                    stackOut_22_0 = var4_int;
                                    stackIn_23_0 = stackOut_22_0;
                                    return stackIn_23_0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4_int++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = -1;
                  stackIn_26_0 = stackOut_25_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 82;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "nk.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0;
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        ha var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        uc var13_ref_uc = null;
        String[] var14 = null;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        String var22 = null;
        int var22_int = 0;
        String var23 = null;
        int var23_int = 0;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        int var28 = 0;
        String stackIn_34_0 = null;
        String stackIn_54_0 = null;
        String stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        String stackOut_53_0 = null;
        String stackOut_58_0 = null;
        String stackOut_56_0 = null;
        var28 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_ref = pk.field_wb.a((byte) 90);
              var4 = 0;
              if (param0 == -9621) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              var5 = -1;
              var6 = -16777216;
              var7 = 120;
              var8 = 108 + param1;
              var9 = 400;
              var10 = 280;
              if (2 != fb.field_e) {
                break L2;
              } else {
                var7 -= 10;
                var9 += 20;
                break L2;
              }
            }
            L3: {
              if (fb.field_e == 3) {
                var9 += 20;
                var7 -= 10;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              this.a(40 + var10, (byte) 86, var7 - 20, 40 + var9, var3_ref, -20 + var8);
              var11 = mf.field_a;
              if (oc.field_e != 1) {
                break L4;
              } else {
                var11 = wl.field_zc;
                break L4;
              }
            }
            L5: {
              if (2 == oc.field_e) {
                var11 = jo.field_l;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              L7: {
                this.a(param1, (byte) -122, var11);
                if (!cn.b(true)) {
                  break L7;
                } else {
                  var12 = df.field_g;
                  if (var28 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (null == ql.field_r) {
                  ql.field_r = vo.a((byte) 127, 3, 10, 1, cs.field_a);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                var13_ref_uc = ql.field_r;
                if (var13_ref_uc.field_i) {
                  break L9;
                } else {
                  var12 = jr.field_r;
                  if (var28 == 0) {
                    break L6;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (null != var13_ref_uc.field_e) {
                  break L10;
                } else {
                  var12 = ul.field_t;
                  if (var28 == 0) {
                    break L6;
                  } else {
                    break L10;
                  }
                }
              }
              var12 = df.field_g;
              var14 = var13_ref_uc.field_e[oc.field_e];
              var15 = var13_ref_uc.field_h[oc.field_e];
              var16 = ca.a(var13_ref_uc, (byte) 113, oc.field_e, to.field_r);
              int discarded$1 = kn.field_b.a((byte) 94, "10. ");
              var17 = param1 + (hi.field_v.field_j + 140);
              var18 = 310;
              var17 -= 20;
              var19 = 128;
              var20 = 512;
              var21 = var5;
              rb.field_j.a(var21, -1, 20 + var19, ob.field_f, 18731, var17);
              rb.field_j.a(101, var21, -1, var17, var18 + (var20 + -320) / 4, ao.field_a);
              rb.field_j.a(fd.field_c, var21, -1, var20, var17, (byte) 92);
              var17 += 20;
              var4 = 0;
              L11: while (true) {
                L12: {
                  L13: {
                    if (var4 >= 10) {
                      break L13;
                    } else {
                      var19 = 128;
                      var20 = 512;
                      stackOut_33_0 = var14[var4];
                      stackIn_54_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var28 != 0) {
                        break L12;
                      } else {
                        L14: {
                          if (stackIn_34_0 != null) {
                            L15: {
                              var21 = -12046068;
                              var22_int = var15[var4] / 100;
                              var21 = -2250240;
                              var23_int = var15[var4] % 100;
                              var24 = var14[var4];
                              if (~var16 == ~var4) {
                                var3_ref.d(16, var20 + (20 - var19), -12 + var17, param0 ^ 13057, -7247318, var19 + -10);
                                var21 = -256;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            rb.field_j.a(var5, var5, -1 + (20 - -var19), var24, 18731, var17);
                            var25 = var4 + 1 + ". ";
                            rb.field_j.a(var6, var6, 20 - -var19, var24, param0 ^ -27840, -1 + var17);
                            rb.field_j.a(var21, -1, var19 + 20, var24, param0 + 28352, var17);
                            rb.field_j.a(var25, var5, var5, 20 + (var19 + -1), var17, (byte) 92);
                            rb.field_j.a(var25, var6, var6, var19 + 20, -1 + var17, (byte) 92);
                            rb.field_j.a(var25, var21, -1, 20 - -var19, var17, (byte) 92);
                            var26 = this.b(var22_int, true);
                            rb.field_j.a(var26, var5, var5, var20 - 1, var17, (byte) 92);
                            rb.field_j.a(var26, var6, var6, var20, var17 - 1, (byte) 92);
                            rb.field_j.a(var26, var21, -1, var20, var17, (byte) 92);
                            var27 = Integer.toString(var23_int) + "%";
                            rb.field_j.a(121, var5, var5, var17, -1 + ((var19 + var20 >> -481635135) - -35), var27);
                            rb.field_j.a(param0 ^ -9704, var6, var6, -1 + var17, (var19 + var20 >> 938485409) - -35, var27);
                            var12 = "";
                            rb.field_j.a(124, var21, -1, var17, 35 + (var19 + var20 >> -795531807), var27);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        var17 += 20;
                        var4++;
                        if (var28 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  if (sg.field_c == null) {
                    break L6;
                  } else {
                    if (sg.field_c.field_q <= 0) {
                      break L6;
                    } else {
                      if (var16 == -1) {
                        var19 = 128;
                        var20 = 512;
                        var3_ref.d(16, 20 + var20 + -var19, var17 - 12, -5782, -7247318, var19 + -10);
                        var21 = -256;
                        rb.field_j.a(var5, var5, 19 - -var19, fj.field_a, 18731, var17);
                        rb.field_j.a(var6, var6, 20 - -var19, fj.field_a, 18731, -1 + var17);
                        rb.field_j.a(var21, -1, 20 - -var19, fj.field_a, 18731, var17);
                        stackOut_53_0 = this.b(sg.field_c.field_q, true);
                        stackIn_54_0 = stackOut_53_0;
                        break L12;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var22 = stackIn_54_0;
                rb.field_j.a(var22, var5, var5, -1 + var20, var17, (byte) 92);
                rb.field_j.a(var22, var6, var6, var20, -1 + var17, (byte) 92);
                rb.field_j.a(var22, var21, -1, var20, var17, (byte) 92);
                var23 = Integer.toString(sg.field_c.field_b) + "%";
                rb.field_j.a(121, var5, var5, var17, -1 + (var20 + var19 >> -1826995711) - -35, var23);
                rb.field_j.a(param0 + 9746, var6, var6, var17 - 1, 35 + (var19 + var20 >> 747678433), var23);
                rb.field_j.a(111, var21, -1, var17, (var20 + var19 >> -1503917695) - -35, var23);
                break L6;
              }
            }
            L16: {
              var13 = kn.field_b.field_j + (param1 - -140 - -100);
              rb.field_j.a(117, var5, -1, var13, 320, var12);
              if (!cn.b(true)) {
                stackOut_58_0 = fs.field_f;
                stackIn_59_0 = stackOut_58_0;
                break L16;
              } else {
                stackOut_56_0 = bt.field_c;
                stackIn_59_0 = stackOut_56_0;
                break L16;
              }
            }
            var12 = stackIn_59_0;
            rb.field_j.a(113, var5, -1, 220 + param1 - (-140 + -hi.field_v.field_j), 320, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            L1: {
              if (((nk) this).field_d == 3) {
                L2: {
                  if (0 != param0) {
                    break L2;
                  } else {
                    if (0 == vq.field_w) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param0 != 2) {
                  break L1;
                } else {
                  if (~vq.field_w == ~(-1 + io.field_a.length)) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param1 == -17) {
              L3: {
                if (((nk) this).field_d != 2) {
                  break L3;
                } else {
                  if (2 <= ln.field_d) {
                    stackOut_28_0 = 1;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0 != 0;
                  } else {
                    L4: {
                      if (param0 == 5) {
                        break L4;
                      } else {
                        if (param0 != 3) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (kh.field_a) {
                      break L3;
                    } else {
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      return stackIn_38_0 != 0;
                    }
                  }
                }
              }
              stackOut_39_0 = 1;
              stackIn_40_0 = stackOut_39_0;
              break L0;
            } else {
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.N(" + param0 + ',' + param1 + ')');
        }
        return stackIn_40_0 != 0;
    }

    final static java.awt.Container b(byte param0) {
        RuntimeException var1 = null;
        java.awt.Frame stackIn_2_0 = null;
        java.applet.Applet stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.applet.Applet stackOut_6_0 = null;
        java.awt.Frame stackOut_1_0 = null;
        try {
          L0: {
            if (null == si.field_d) {
              L1: {
                if (param0 >= 126) {
                  break L1;
                } else {
                  uf discarded$2 = nk.a((byte) 67, -122, (wl) null, (String) null);
                  break L1;
                }
              }
              stackOut_6_0 = bm.m(118);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = si.field_d;
              stackIn_2_0 = stackOut_1_0;
              return (java.awt.Container) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "nk.F(" + param0 + ')');
        }
        return (java.awt.Container) (Object) stackIn_7_0;
    }

    final void a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (((nk) this).field_d != 0) {
                break L1;
              } else {
                if (((nk) this).field_i.field_g != -1) {
                  var3_int = ((nk) this).field_i.field_g;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param1 == 1) {
              L2: {
                if (((nk) this).field_d != 1) {
                  break L2;
                } else {
                  if (-1 == ((nk) this).field_i.field_g) {
                    break L2;
                  } else {
                    if (po.field_h == -1) {
                      break L2;
                    } else {
                      var3_int = ((nk) this).field_i.field_g;
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (((nk) this).field_d == 3) {
                  var3_int = 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              ((nk) this).field_i.a(param0, this.a(param1 + -77, ic.field_b, cf.field_g), 0, var3_int);
              ((nk) this).field_e = -1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.P(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, ha param4, int param5) {
        RuntimeException var7 = null;
        bo var7_ref = null;
        int var8 = 0;
        ha var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        pa[] var14 = null;
        int var15 = 0;
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
        var15 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var7_ref = fa.a(param4, true);
            var7_ref.a(param3 + (param2 - 5), 5 + param2, -5 + (param5 - -param0), param5 + 5, -71);
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 >= param0 - 10) {
                    break L3;
                  } else {
                    qk.field_i.b(param2 - -5, var8 + (param5 + 5), -10 + param3, qk.field_i.c());
                    var8 = var8 + qk.field_i.c();
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_ref.a(true);
                break L2;
              }
              L4: {
                var9 = param4;
                var10 = param2;
                var11 = param5;
                var12 = param3;
                if (param1 == 86) {
                  break L4;
                } else {
                  this.a(-92);
                  break L4;
                }
              }
              var13 = param0;
              var14 = ko.field_g;
              hb.a(var11, 0, var10, 1, 1, var12, var13, var9, (byte) 104, var14);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7;
            stackOut_13_1 = new StringBuilder().append("nk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param5 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_293_0 = 0;
        int stackIn_293_1 = 0;
        int stackIn_295_0 = 0;
        int stackIn_295_1 = 0;
        int stackIn_296_0 = 0;
        int stackIn_296_1 = 0;
        int stackIn_296_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_292_0 = 0;
        int stackOut_292_1 = 0;
        int stackOut_295_0 = 0;
        int stackOut_295_1 = 0;
        int stackOut_295_2 = 0;
        int stackOut_293_0 = 0;
        int stackOut_293_1 = 0;
        int stackOut_293_2 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = ua.field_l[((nk) this).field_d][param2];
                if (((nk) this).field_i.e((byte) 125)) {
                  break L2;
                } else {
                  if (var4_int == ((nk) this).field_a) {
                    break L1;
                  } else {
                    ((nk) this).field_a = var4_int;
                    rh discarded$7 = bm.a((byte) -70, kq.field_b);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              rh discarded$8 = bm.a((byte) -70, gg.field_a);
              break L1;
            }
            if (param1 == 3) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              L19: {
                                                L20: {
                                                  L21: {
                                                    L22: {
                                                      L23: {
                                                        L24: {
                                                          L25: {
                                                            L26: {
                                                              var5 = var4_int;
                                                              if (var5 != 0) {
                                                                break L26;
                                                              } else {
                                                                if (var8 == 0) {
                                                                  if (!((nk) this).field_i.e((byte) 84)) {
                                                                    break L3;
                                                                  } else {
                                                                    sg.field_c.a(101, false);
                                                                    eu.a((byte) -96, -1, param0);
                                                                    co.field_b = ((nk) this).field_d;
                                                                    if (var8 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L25;
                                                                    }
                                                                  }
                                                                } else {
                                                                  break L26;
                                                                }
                                                              }
                                                            }
                                                            L27: {
                                                              if (var5 != 19) {
                                                                break L27;
                                                              } else {
                                                                if (var8 == 0) {
                                                                  break L25;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                            L28: {
                                                              if (var5 != 22) {
                                                                break L28;
                                                              } else {
                                                                if (var8 == 0) {
                                                                  break L24;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            }
                                                            if (var5 == 1) {
                                                              break L23;
                                                            } else {
                                                              L29: {
                                                                if (5 != var5) {
                                                                  break L29;
                                                                } else {
                                                                  if (var8 == 0) {
                                                                    break L22;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                              if (16 == var5) {
                                                                break L21;
                                                              } else {
                                                                if (14 == var5) {
                                                                  break L20;
                                                                } else {
                                                                  if (var5 == 3) {
                                                                    break L19;
                                                                  } else {
                                                                    if (6 == var5) {
                                                                      break L18;
                                                                    } else {
                                                                      L30: {
                                                                        if (var5 != 2) {
                                                                          break L30;
                                                                        } else {
                                                                          if (var8 == 0) {
                                                                            break L17;
                                                                          } else {
                                                                            break L30;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (12 == var5) {
                                                                        break L16;
                                                                      } else {
                                                                        L31: {
                                                                          if (var5 != 13) {
                                                                            break L31;
                                                                          } else {
                                                                            if (var8 == 0) {
                                                                              break L15;
                                                                            } else {
                                                                              break L31;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (var5 == 4) {
                                                                          break L14;
                                                                        } else {
                                                                          L32: {
                                                                            if (var5 != 7) {
                                                                              break L32;
                                                                            } else {
                                                                              if (var8 == 0) {
                                                                                break L13;
                                                                              } else {
                                                                                break L32;
                                                                              }
                                                                            }
                                                                          }
                                                                          L33: {
                                                                            if (var5 != 8) {
                                                                              break L33;
                                                                            } else {
                                                                              if (var8 == 0) {
                                                                                break L12;
                                                                              } else {
                                                                                break L33;
                                                                              }
                                                                            }
                                                                          }
                                                                          L34: {
                                                                            if (var5 != 9) {
                                                                              break L34;
                                                                            } else {
                                                                              if (var8 == 0) {
                                                                                break L11;
                                                                              } else {
                                                                                break L34;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (var5 == 10) {
                                                                            break L10;
                                                                          } else {
                                                                            if (15 == var5) {
                                                                              break L9;
                                                                            } else {
                                                                              L35: {
                                                                                if (var5 != 18) {
                                                                                  break L35;
                                                                                } else {
                                                                                  if (var8 == 0) {
                                                                                    break L8;
                                                                                  } else {
                                                                                    break L35;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L36: {
                                                                                if (17 != var5) {
                                                                                  break L36;
                                                                                } else {
                                                                                  if (var8 == 0) {
                                                                                    break L7;
                                                                                  } else {
                                                                                    break L36;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (11 == var5) {
                                                                                break L6;
                                                                              } else {
                                                                                if (var5 == 20) {
                                                                                  break L5;
                                                                                } else {
                                                                                  if (21 == var5) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L3;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (((nk) this).field_i.e((byte) 104)) {
                                                            sg.field_c.a(61, true);
                                                            eu.a((byte) 78, -1, param0);
                                                            co.field_b = ((nk) this).field_d;
                                                            if (var8 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L24;
                                                            }
                                                          } else {
                                                            break L3;
                                                          }
                                                        }
                                                        if (!((nk) this).field_i.e((byte) 81)) {
                                                          break L3;
                                                        } else {
                                                          eu.a((byte) 122, 7, param0);
                                                          co.field_b = 0;
                                                          if (var8 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      if (!((nk) this).field_i.e((byte) 114)) {
                                                        break L3;
                                                      } else {
                                                        eu.a((byte) 33, -1, param0);
                                                        sg.field_c.e(-112);
                                                        co.field_b = 0;
                                                        if (var8 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    if (!((nk) this).field_i.e((byte) 86)) {
                                                      break L3;
                                                    } else {
                                                      eu.a((byte) 115, 0, param0);
                                                      if (var8 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  if (((nk) this).field_i.e((byte) 120)) {
                                                    eu.a((byte) -117, 0, param0);
                                                    r.field_n = 0;
                                                    hg.field_D = 0;
                                                    sb.field_c.c(268435455);
                                                    if (var8 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L20;
                                                    }
                                                  } else {
                                                    break L3;
                                                  }
                                                }
                                                if (!((nk) this).field_i.e((byte) 127)) {
                                                  break L3;
                                                } else {
                                                  eu.a((byte) 98, 4, param0);
                                                  co.field_b = ((nk) this).field_d;
                                                  if (var8 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              if (((nk) this).field_i.e((byte) 82)) {
                                                vq.field_w = 0;
                                                eu.a((byte) -94, 3, param0);
                                                co.field_b = ((nk) this).field_d;
                                                if (var8 == 0) {
                                                  break L3;
                                                } else {
                                                  break L18;
                                                }
                                              } else {
                                                break L3;
                                              }
                                            }
                                            if (((nk) this).field_i.e((byte) 104)) {
                                              eu.a((byte) -80, co.field_b, param0);
                                              if (var8 == 0) {
                                                break L3;
                                              } else {
                                                break L17;
                                              }
                                            } else {
                                              break L3;
                                            }
                                          }
                                          if (!((nk) this).field_i.e((byte) 98)) {
                                            break L3;
                                          } else {
                                            eu.a((byte) 90, 2, param0);
                                            if (var8 == 0) {
                                              break L3;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        L37: {
                                          if (!((nk) this).field_i.d(55)) {
                                            break L37;
                                          } else {
                                            rt.b(0, (byte) -117);
                                            rh discarded$9 = lq.a(fd.field_b[3], 110);
                                            break L37;
                                          }
                                        }
                                        L38: {
                                          if (((nk) this).field_i.b(-99)) {
                                            rt.b(256, (byte) 59);
                                            rh discarded$10 = lq.a(fd.field_b[3], param1 ^ -10);
                                            break L38;
                                          } else {
                                            break L38;
                                          }
                                        }
                                        L39: {
                                          if (((nk) this).field_i.a(-78)) {
                                            r.e(param1 + -14601);
                                            rh discarded$11 = lq.a(fd.field_b[3], 70);
                                            break L39;
                                          } else {
                                            break L39;
                                          }
                                        }
                                        L40: {
                                          if (((nk) this).field_i.b((byte) -102)) {
                                            dq.a((byte) -2);
                                            rh discarded$12 = lq.a(fd.field_b[3], -126);
                                            break L40;
                                          } else {
                                            break L40;
                                          }
                                        }
                                        if (((nk) this).field_i.a((byte) 98)) {
                                          L41: {
                                            L42: {
                                              var5 = 137 + oq.field_K;
                                              var6 = (this.a(param2, param1 + 197) - -this.c(param1 + 121, param2) + -var5 >> 38244609) - -oq.field_K + 8;
                                              var7 = ic.field_b + -var6 << -1845905119;
                                              if (var7 <= 0) {
                                                break L42;
                                              } else {
                                                L43: {
                                                  if (256 <= var7) {
                                                    break L43;
                                                  } else {
                                                    rt.b(var7, (byte) -123);
                                                    if (var8 == 0) {
                                                      break L41;
                                                    } else {
                                                      break L43;
                                                    }
                                                  }
                                                }
                                                rt.b(256, (byte) -114);
                                                if (var8 == 0) {
                                                  break L41;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                            rt.b(0, (byte) 70);
                                            break L41;
                                          }
                                          L44: {
                                            if (((nk) this).field_h > 0) {
                                              break L44;
                                            } else {
                                              rh discarded$13 = lq.a(fd.field_b[3], 81);
                                              ((nk) this).field_h = 10;
                                              break L44;
                                            }
                                          }
                                          if (var8 == 0) {
                                            break L3;
                                          } else {
                                            break L15;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                      L45: {
                                        if (((nk) this).field_i.d(param1 + 50)) {
                                          ve.a((byte) 43, 0);
                                          break L45;
                                        } else {
                                          break L45;
                                        }
                                      }
                                      L46: {
                                        if (((nk) this).field_i.b(-39)) {
                                          ve.a((byte) 43, 256);
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                      L47: {
                                        if (((nk) this).field_i.a(param1 + -11)) {
                                          lj.a(100);
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                      L48: {
                                        if (((nk) this).field_i.b((byte) -102)) {
                                          wk.c((byte) -118);
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      if (((nk) this).field_i.a((byte) 119)) {
                                        L49: {
                                          L50: {
                                            var5 = 128 + oq.field_K + 9;
                                            var6 = (-var5 + this.a(param2, 200) - -this.c(param1 ^ 124, param2) >> 2081852321) - (-oq.field_K + -8);
                                            var7 = ic.field_b + -var6 << 2069087649;
                                            if (var7 > 0) {
                                              break L50;
                                            } else {
                                              ve.a((byte) 43, 0);
                                              if (var8 == 0) {
                                                break L49;
                                              } else {
                                                break L50;
                                              }
                                            }
                                          }
                                          L51: {
                                            if (var7 < 256) {
                                              break L51;
                                            } else {
                                              ve.a((byte) 43, 256);
                                              if (var8 == 0) {
                                                break L49;
                                              } else {
                                                break L51;
                                              }
                                            }
                                          }
                                          ve.a((byte) 43, var7);
                                          break L49;
                                        }
                                        if (var8 == 0) {
                                          break L3;
                                        } else {
                                          break L14;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                    if (((nk) this).field_i.e((byte) 126)) {
                                      L52: {
                                        if (jf.field_a != null) {
                                          break L52;
                                        } else {
                                          ql.a((byte) -103, param0);
                                          if (var8 == 0) {
                                            break L3;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      tt.b(-32546);
                                      if (var8 == 0) {
                                        break L3;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                  if (!((nk) this).field_i.e((byte) 82)) {
                                    break L3;
                                  } else {
                                    sg.field_c.a(param0, false, 100);
                                    if (var8 == 0) {
                                      break L3;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (((nk) this).field_i.e((byte) 124)) {
                                  oc.field_e = 0;
                                  if (var8 == 0) {
                                    break L3;
                                  } else {
                                    break L11;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                              if (((nk) this).field_i.e((byte) 88)) {
                                oc.field_e = 1;
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L10;
                                }
                              } else {
                                break L3;
                              }
                            }
                            if (((nk) this).field_i.e((byte) 87)) {
                              oc.field_e = 2;
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L9;
                              }
                            } else {
                              break L3;
                            }
                          }
                          if (!((nk) this).field_i.e((byte) 97)) {
                            break L3;
                          } else {
                            L53: {
                              if (((nk) this).field_d == 4) {
                                break L53;
                              } else {
                                if (((nk) this).field_d == 2) {
                                  break L53;
                                } else {
                                  if (((nk) this).field_d == 6) {
                                    L54: {
                                      stackOut_292_0 = param1 + 25365;
                                      stackOut_292_1 = 6;
                                      stackIn_295_0 = stackOut_292_0;
                                      stackIn_295_1 = stackOut_292_1;
                                      stackIn_293_0 = stackOut_292_0;
                                      stackIn_293_1 = stackOut_292_1;
                                      if (0 == r.field_n) {
                                        stackOut_295_0 = stackIn_295_0;
                                        stackOut_295_1 = stackIn_295_1;
                                        stackOut_295_2 = 2;
                                        stackIn_296_0 = stackOut_295_0;
                                        stackIn_296_1 = stackOut_295_1;
                                        stackIn_296_2 = stackOut_295_2;
                                        break L54;
                                      } else {
                                        stackOut_293_0 = stackIn_293_0;
                                        stackOut_293_1 = stackIn_293_1;
                                        stackOut_293_2 = 5;
                                        stackIn_296_0 = stackOut_293_0;
                                        stackIn_296_1 = stackOut_293_1;
                                        stackIn_296_2 = stackOut_293_2;
                                        break L54;
                                      }
                                    }
                                    nf.a(stackIn_296_0, stackIn_296_1, stackIn_296_2);
                                    if (var8 == 0) {
                                      break L3;
                                    } else {
                                      break L53;
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                            nf.a(25368, ((nk) this).field_d, ((nk) this).field_d);
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (!((nk) this).field_i.e((byte) 101)) {
                          break L3;
                        } else {
                          if (this.a(param2, (byte) -17)) {
                            vq.field_w = vq.field_w - 1;
                            if (this.a(param2, (byte) -17)) {
                              break L3;
                            } else {
                              ((nk) this).field_i.field_g = 2;
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (!((nk) this).field_i.e((byte) 112)) {
                        break L3;
                      } else {
                        if (!this.a(param2, (byte) -17)) {
                          break L3;
                        } else {
                          vq.field_w = vq.field_w + 1;
                          if (!this.a(param2, (byte) -17)) {
                            ((nk) this).field_i.field_g = 0;
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (((nk) this).field_i.e((byte) 113)) {
                      L55: {
                        if (jf.field_a == null) {
                          break L55;
                        } else {
                          tt.b(-32546);
                          break L55;
                        }
                      }
                      rr.a((byte) -56, bm.m(param1 + 106));
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    } else {
                      break L3;
                    }
                  }
                  if (((nk) this).field_i.e((byte) 106)) {
                    ql.field_r = null;
                    cs.field_a = 1;
                    if (var8 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
                if (!((nk) this).field_i.e((byte) 110)) {
                  break L3;
                } else {
                  cs.field_a = 0;
                  ql.field_r = null;
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "nk.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 200) {
                break L1;
              } else {
                int discarded$2 = this.b(false, -104);
                break L1;
              }
            }
            L2: {
              if (((nk) this).field_d != 2) {
                break L2;
              } else {
                if (cn.b(true)) {
                  break L2;
                } else {
                  stackOut_7_0 = dt.field_a[((nk) this).field_d] - -(200 * (param0 % 3));
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
            L3: {
              if (((nk) this).field_d != 2) {
                break L3;
              } else {
                if (cn.b(true)) {
                  stackOut_15_0 = dt.field_a[((nk) this).field_d] - 100;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  break L3;
                }
              }
            }
            if (((nk) this).field_d != 3) {
              L4: {
                if (((nk) this).field_d == 4) {
                  break L4;
                } else {
                  if (5 == ((nk) this).field_d) {
                    break L4;
                  } else {
                    stackOut_28_0 = dt.field_a[((nk) this).field_d];
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  }
                }
              }
              stackOut_26_0 = 120;
              stackIn_27_0 = stackOut_26_0;
              return stackIn_27_0;
            } else {
              stackOut_18_0 = 200 * param0 + 20;
              stackIn_19_0 = stackOut_18_0;
              return stackIn_19_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0;
    }

    private final void a(int param0, int param1, ha param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        bo var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param5 == 24063) {
              mb.field_u[0].a(param1, param4);
              mb.field_u[2].a(-mb.field_u[2].d() + (param0 + param1), param4);
              var7_ref = fa.a(param2, true);
              var8 = param0 + param1 + -mb.field_u[2].d();
              param1 = param1 + mb.field_u[0].d();
              var7_ref.a(var8, param1, param4 + mb.field_u[2].c(), param4, 102);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var8 <= param1) {
                      break L3;
                    } else {
                      mb.field_u[1].a(param1, param4);
                      param1 = param1 + mb.field_u[1].d();
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var7_ref.a(true);
                  jm.field_a[21].b(param1 + 3, 9 + param4, 16, 16);
                  jm.field_a[21].b(-param0 + (20 + param1), 9 + param4, 16, 16);
                  uc.field_o[0].b(param1 - -3, 9 + param4, 16, 16);
                  uc.field_o[0].b(-param0 + param1 + 20, 9 + param4, 16, 16);
                  break L2;
                }
                L4: {
                  if (param3) {
                    uc.field_o[1].a(-15 + param1, -12 + param4, 1, 0, 2);
                    uc.field_o[1].a(-param0 + param1 + 1, -12 + param4, 1, 0, 2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var7;
            stackOut_15_1 = new StringBuilder().append("nk.AA(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (cd.field_f >= 100) {
                break L1;
              } else {
                cd.field_f = cd.field_f + 1;
                break L1;
              }
            }
            L2: {
              if (((nk) this).field_h > 0) {
                ((nk) this).field_h = ((nk) this).field_h - 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (!ek.a((byte) -126)) {
                    break L5;
                  } else {
                    stackOut_9_0 = ~bk.field_f;
                    stackOut_9_1 = -51;
                    stackIn_38_0 = stackOut_9_0;
                    stackIn_38_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var3 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (stackIn_10_0 != stackIn_10_1) {
                          break L6;
                        } else {
                          if (!lp.field_a[81]) {
                            break L6;
                          } else {
                            if (ln.field_d >= 2) {
                              mj.field_b = mj.field_b ^ true;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L7: {
                        if (bk.field_f == 13) {
                          break L7;
                        } else {
                          this.a(param0 + 29185);
                          if (((nk) this).field_i.field_g != -1) {
                            this.a(false, 3, ((nk) this).field_i.field_g);
                            if (var3 == 0) {
                              continue L3;
                            } else {
                              break L7;
                            }
                          } else {
                            continue L3;
                          }
                        }
                      }
                      L8: {
                        if (1 != ((nk) this).field_d) {
                          break L8;
                        } else {
                          eu.a((byte) -126, -1, false);
                          sg.field_c.e(param0 ^ 24995);
                          co.field_b = 0;
                          if (var3 == 0) {
                            continue L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (((nk) this).field_d != 6) {
                        eu.a((byte) 37, co.field_b, false);
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
                stackOut_37_0 = param0;
                stackOut_37_1 = -25039;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                break L4;
              }
              L9: {
                if (stackIn_38_0 == stackIn_38_1) {
                  break L9;
                } else {
                  ((nk) this).field_c = 31;
                  break L9;
                }
              }
              L10: {
                ((nk) this).field_i.a(this.a(-66, ln.field_c, lq.field_a), this.a(param0 + 24945, ic.field_b, cf.field_g), -24702);
                if (((nk) this).field_i.field_g != -1) {
                  this.a(true, 3, ((nk) this).field_i.field_g);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (vj.field_d == 0) {
                  break L11;
                } else {
                  ((nk) this).field_c = ln.field_c;
                  ((nk) this).field_b = lq.field_a;
                  break L11;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "nk.EA(" + param0 + ')');
        }
    }

    private final int b(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = 30;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 39;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static uf a(byte param0, int param1, wl param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        uf stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        uf stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var4_int = jaggl.OpenGL.glGenProgramARB();
              jaggl.OpenGL.glBindProgramARB(param1, var4_int);
              jaggl.OpenGL.glProgramStringARB(param1, 34933, param3);
              jaggl.OpenGL.glGetIntegerv(34379, ik.field_m, 0);
              if (param0 > 22) {
                break L1;
              } else {
                nk.a((byte) -82, 1, false);
                break L1;
              }
            }
            if (ik.field_m[0] == -1) {
              jaggl.OpenGL.glBindProgramARB(param1, 0);
              stackOut_6_0 = new uf(param2, param1, var4_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              jaggl.OpenGL.glBindProgramARB(param1, 0);
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (uf) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("nk.R(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(byte param0, gk param1, gk param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ka.field_a = qg.a((byte) 3, param1, "", "frame");
              rg.field_F = qg.a((byte) 3, param1, "", "button_raised");
              wt.field_h = qg.a((byte) 3, param1, "", "button_frame");
              bo.field_a = (hc) (Object) gl.a(param1, "b12", "", param2, param0 ^ -48);
              if (param0 == -56) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nk.S(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    private final void a(int param0, ha param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        bo var8_ref = null;
        int var9 = 0;
        ha var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pa[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var17 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var8_ref = fa.a(param1, true);
            var8_ref.a(-5 + (param3 + param2), 5 + param2, param5 + param4 - 5, param4 + 5, -21);
            var9 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~(param5 - 10) >= ~var9) {
                    break L3;
                  } else {
                    qk.field_i.a(5 + param2, param4 + var9 - -5, -10 + param3, qk.field_i.c(), 2, param6, 0);
                    var9 = var9 + qk.field_i.c();
                    if (var17 != 0) {
                      break L2;
                    } else {
                      if (var17 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var8_ref.a(true);
                break L2;
              }
              var10 = param1;
              var11 = param2;
              var12 = param4;
              var13 = param3;
              var14 = param5;
              var16 = -25 % ((-20 - param0) / 40);
              var15 = ko.field_g;
              hb.a(var12, 0, var11, 1, 1, var13, var14, var10, (byte) 98, var15);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var8;
            stackOut_10_1 = new StringBuilder().append("nk.W(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_15_0 = 0;
        da stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        da stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        int stackIn_48_5 = 0;
        da stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        da stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        int stackIn_50_5 = 0;
        int stackIn_50_6 = 0;
        int stackIn_50_7 = 0;
        da stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        int stackIn_52_5 = 0;
        int stackIn_52_6 = 0;
        int stackIn_52_7 = 0;
        da stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        int stackIn_53_5 = 0;
        int stackIn_53_6 = 0;
        int stackIn_53_7 = 0;
        int stackIn_53_8 = 0;
        da stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackIn_54_5 = 0;
        da stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        int stackIn_56_5 = 0;
        da stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        int stackIn_57_4 = 0;
        int stackIn_57_5 = 0;
        int stackIn_57_6 = 0;
        da stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        int stackIn_58_4 = 0;
        int stackIn_58_5 = 0;
        int stackIn_58_6 = 0;
        int stackIn_58_7 = 0;
        da stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_60_4 = 0;
        int stackIn_60_5 = 0;
        int stackIn_60_6 = 0;
        int stackIn_60_7 = 0;
        da stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        int stackIn_61_4 = 0;
        int stackIn_61_5 = 0;
        int stackIn_61_6 = 0;
        int stackIn_61_7 = 0;
        int stackIn_61_8 = 0;
        da stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_62_4 = 0;
        int stackIn_62_5 = 0;
        int stackIn_62_6 = 0;
        da stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackIn_64_5 = 0;
        int stackIn_64_6 = 0;
        da stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_65_5 = 0;
        int stackIn_65_6 = 0;
        int stackIn_65_7 = 0;
        da stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_66_5 = 0;
        int stackIn_66_6 = 0;
        int stackIn_66_7 = 0;
        da stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int stackIn_68_4 = 0;
        int stackIn_68_5 = 0;
        int stackIn_68_6 = 0;
        int stackIn_68_7 = 0;
        da stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        int stackIn_69_4 = 0;
        int stackIn_69_5 = 0;
        int stackIn_69_6 = 0;
        int stackIn_69_7 = 0;
        int stackIn_69_8 = 0;
        boolean stackIn_91_0 = false;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        Object stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        da stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        int stackOut_45_5 = 0;
        da stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_48_6 = 0;
        da stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        int stackOut_46_5 = 0;
        int stackOut_46_6 = 0;
        da stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        int stackOut_49_6 = 0;
        int stackOut_49_7 = 0;
        da stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        int stackOut_52_5 = 0;
        int stackOut_52_6 = 0;
        int stackOut_52_7 = 0;
        int stackOut_52_8 = 0;
        da stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        int stackOut_50_5 = 0;
        int stackOut_50_6 = 0;
        int stackOut_50_7 = 0;
        int stackOut_50_8 = 0;
        da stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_53_5 = 0;
        da stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        int stackOut_56_4 = 0;
        int stackOut_56_5 = 0;
        int stackOut_56_6 = 0;
        da stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        int stackOut_54_5 = 0;
        int stackOut_54_6 = 0;
        da stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        int stackOut_57_5 = 0;
        int stackOut_57_6 = 0;
        int stackOut_57_7 = 0;
        da stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        int stackOut_60_4 = 0;
        int stackOut_60_5 = 0;
        int stackOut_60_6 = 0;
        int stackOut_60_7 = 0;
        int stackOut_60_8 = 0;
        da stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        int stackOut_58_5 = 0;
        int stackOut_58_6 = 0;
        int stackOut_58_7 = 0;
        int stackOut_58_8 = 0;
        da stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        int stackOut_61_4 = 0;
        int stackOut_61_5 = 0;
        int stackOut_61_6 = 0;
        da stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int stackOut_64_5 = 0;
        int stackOut_64_6 = 0;
        int stackOut_64_7 = 0;
        da stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_62_5 = 0;
        int stackOut_62_6 = 0;
        int stackOut_62_7 = 0;
        da stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_65_5 = 0;
        int stackOut_65_6 = 0;
        int stackOut_65_7 = 0;
        da stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        int stackOut_68_4 = 0;
        int stackOut_68_5 = 0;
        int stackOut_68_6 = 0;
        int stackOut_68_7 = 0;
        int stackOut_68_8 = 0;
        da stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_66_5 = 0;
        int stackOut_66_6 = 0;
        int stackOut_66_7 = 0;
        int stackOut_66_8 = 0;
        boolean stackOut_90_0 = false;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        int stackOut_98_4 = 0;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        int stackOut_101_0 = 0;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 25;
                var5 = 12;
                if (((nk) this).field_d == 0) {
                  break L2;
                } else {
                  if (1 == ((nk) this).field_d) {
                    break L2;
                  } else {
                    if (((nk) this).field_d == 7) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              this.a(oo.field_Y[((nk) this).field_d] * ua.field_l[((nk) this).field_d].length + 2 * var5, (byte) 86, -var4_int + dt.field_a[((nk) this).field_d], ak.field_f[((nk) this).field_d] - (dt.field_a[((nk) this).field_d] + -(var4_int * 2)), param1, bk.field_e[((nk) this).field_d] + (-var5 + param0));
              break L1;
            }
            L3: {
              if (ln.field_d < 2) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_12_0 = 1;
                stackIn_15_0 = stackOut_12_0;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_15_0;
              if (param2 == -4) {
                break L4;
              } else {
                ((nk) this).field_b = -36;
                break L4;
              }
            }
            L5: {
              L6: {
                if (((nk) this).field_d == 1) {
                  break L6;
                } else {
                  L7: {
                    if (((nk) this).field_d != 7) {
                      break L7;
                    } else {
                      this.a(param0, (byte) -89, sd.field_m);
                      if (var10 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (((nk) this).field_d == 2) {
                      break L8;
                    } else {
                      L9: {
                        if (((nk) this).field_d == 3) {
                          break L9;
                        } else {
                          L10: {
                            if (((nk) this).field_d == 4) {
                              break L10;
                            } else {
                              L11: {
                                if (((nk) this).field_d != 5) {
                                  break L11;
                                } else {
                                  this.b(true, param0, param2 + -120);
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (((nk) this).field_d == 6) {
                                L12: {
                                  bk.field_e[((nk) this).field_d] = 230;
                                  var7 = param0 + -40 + (kn.field_b.field_j + 200);
                                  var8 = 255;
                                  var9 = kn.field_b.field_i + kn.field_b.field_a + 4;
                                  rb.field_j.a(112, var8 << -728168328 | 16777215, -1, var7, 320, gg.field_i);
                                  stackOut_45_0 = rb.field_j;
                                  stackOut_45_1 = 126;
                                  stackOut_45_2 = var8 << 998263256 | 16777215;
                                  stackOut_45_3 = -1;
                                  stackOut_45_4 = var7 + var9;
                                  stackOut_45_5 = 320;
                                  stackIn_48_0 = stackOut_45_0;
                                  stackIn_48_1 = stackOut_45_1;
                                  stackIn_48_2 = stackOut_45_2;
                                  stackIn_48_3 = stackOut_45_3;
                                  stackIn_48_4 = stackOut_45_4;
                                  stackIn_48_5 = stackOut_45_5;
                                  stackIn_46_0 = stackOut_45_0;
                                  stackIn_46_1 = stackOut_45_1;
                                  stackIn_46_2 = stackOut_45_2;
                                  stackIn_46_3 = stackOut_45_3;
                                  stackIn_46_4 = stackOut_45_4;
                                  stackIn_46_5 = stackOut_45_5;
                                  if (r.field_n == 0) {
                                    stackOut_48_0 = (da) (Object) stackIn_48_0;
                                    stackOut_48_1 = stackIn_48_1;
                                    stackOut_48_2 = stackIn_48_2;
                                    stackOut_48_3 = stackIn_48_3;
                                    stackOut_48_4 = stackIn_48_4;
                                    stackOut_48_5 = stackIn_48_5;
                                    stackOut_48_6 = 0;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    stackIn_49_2 = stackOut_48_2;
                                    stackIn_49_3 = stackOut_48_3;
                                    stackIn_49_4 = stackOut_48_4;
                                    stackIn_49_5 = stackOut_48_5;
                                    stackIn_49_6 = stackOut_48_6;
                                    break L12;
                                  } else {
                                    stackOut_46_0 = (da) (Object) stackIn_46_0;
                                    stackOut_46_1 = stackIn_46_1;
                                    stackOut_46_2 = stackIn_46_2;
                                    stackOut_46_3 = stackIn_46_3;
                                    stackOut_46_4 = stackIn_46_4;
                                    stackOut_46_5 = stackIn_46_5;
                                    stackOut_46_6 = 1;
                                    stackIn_49_0 = stackOut_46_0;
                                    stackIn_49_1 = stackOut_46_1;
                                    stackIn_49_2 = stackOut_46_2;
                                    stackIn_49_3 = stackOut_46_3;
                                    stackIn_49_4 = stackOut_46_4;
                                    stackIn_49_5 = stackOut_46_5;
                                    stackIn_49_6 = stackOut_46_6;
                                    break L12;
                                  }
                                }
                                L13: {
                                  stackOut_49_0 = (da) (Object) stackIn_49_0;
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = stackIn_49_2;
                                  stackOut_49_3 = stackIn_49_3;
                                  stackOut_49_4 = stackIn_49_4;
                                  stackOut_49_5 = stackIn_49_5;
                                  stackOut_49_6 = stackIn_49_6;
                                  stackOut_49_7 = 1;
                                  stackIn_52_0 = stackOut_49_0;
                                  stackIn_52_1 = stackOut_49_1;
                                  stackIn_52_2 = stackOut_49_2;
                                  stackIn_52_3 = stackOut_49_3;
                                  stackIn_52_4 = stackOut_49_4;
                                  stackIn_52_5 = stackOut_49_5;
                                  stackIn_52_6 = stackOut_49_6;
                                  stackIn_52_7 = stackOut_49_7;
                                  stackIn_50_0 = stackOut_49_0;
                                  stackIn_50_1 = stackOut_49_1;
                                  stackIn_50_2 = stackOut_49_2;
                                  stackIn_50_3 = stackOut_49_3;
                                  stackIn_50_4 = stackOut_49_4;
                                  stackIn_50_5 = stackOut_49_5;
                                  stackIn_50_6 = stackOut_49_6;
                                  stackIn_50_7 = stackOut_49_7;
                                  if (0 == or.field_a) {
                                    stackOut_52_0 = (da) (Object) stackIn_52_0;
                                    stackOut_52_1 = stackIn_52_1;
                                    stackOut_52_2 = stackIn_52_2;
                                    stackOut_52_3 = stackIn_52_3;
                                    stackOut_52_4 = stackIn_52_4;
                                    stackOut_52_5 = stackIn_52_5;
                                    stackOut_52_6 = stackIn_52_6;
                                    stackOut_52_7 = stackIn_52_7;
                                    stackOut_52_8 = 0;
                                    stackIn_53_0 = stackOut_52_0;
                                    stackIn_53_1 = stackOut_52_1;
                                    stackIn_53_2 = stackOut_52_2;
                                    stackIn_53_3 = stackOut_52_3;
                                    stackIn_53_4 = stackOut_52_4;
                                    stackIn_53_5 = stackOut_52_5;
                                    stackIn_53_6 = stackOut_52_6;
                                    stackIn_53_7 = stackOut_52_7;
                                    stackIn_53_8 = stackOut_52_8;
                                    break L13;
                                  } else {
                                    stackOut_50_0 = (da) (Object) stackIn_50_0;
                                    stackOut_50_1 = stackIn_50_1;
                                    stackOut_50_2 = stackIn_50_2;
                                    stackOut_50_3 = stackIn_50_3;
                                    stackOut_50_4 = stackIn_50_4;
                                    stackOut_50_5 = stackIn_50_5;
                                    stackOut_50_6 = stackIn_50_6;
                                    stackOut_50_7 = stackIn_50_7;
                                    stackOut_50_8 = 1;
                                    stackIn_53_0 = stackOut_50_0;
                                    stackIn_53_1 = stackOut_50_1;
                                    stackIn_53_2 = stackOut_50_2;
                                    stackIn_53_3 = stackOut_50_3;
                                    stackIn_53_4 = stackOut_50_4;
                                    stackIn_53_5 = stackOut_50_5;
                                    stackIn_53_6 = stackOut_50_6;
                                    stackIn_53_7 = stackOut_50_7;
                                    stackIn_53_8 = stackOut_50_8;
                                    break L13;
                                  }
                                }
                                L14: {
                                  ((da) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, stackIn_53_3, stackIn_53_4, stackIn_53_5, st.a(stackIn_53_6 != 0, stackIn_53_7 != 0, stackIn_53_8 != 0, false));
                                  stackOut_53_0 = rb.field_j;
                                  stackOut_53_1 = param2 + 121;
                                  stackOut_53_2 = 16777215 | var8 << 1060891160;
                                  stackOut_53_3 = -1;
                                  stackOut_53_4 = 30 + var7 - -(var9 * 5);
                                  stackOut_53_5 = 320;
                                  stackIn_56_0 = stackOut_53_0;
                                  stackIn_56_1 = stackOut_53_1;
                                  stackIn_56_2 = stackOut_53_2;
                                  stackIn_56_3 = stackOut_53_3;
                                  stackIn_56_4 = stackOut_53_4;
                                  stackIn_56_5 = stackOut_53_5;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackIn_54_1 = stackOut_53_1;
                                  stackIn_54_2 = stackOut_53_2;
                                  stackIn_54_3 = stackOut_53_3;
                                  stackIn_54_4 = stackOut_53_4;
                                  stackIn_54_5 = stackOut_53_5;
                                  if (r.field_n == 0) {
                                    stackOut_56_0 = (da) (Object) stackIn_56_0;
                                    stackOut_56_1 = stackIn_56_1;
                                    stackOut_56_2 = stackIn_56_2;
                                    stackOut_56_3 = stackIn_56_3;
                                    stackOut_56_4 = stackIn_56_4;
                                    stackOut_56_5 = stackIn_56_5;
                                    stackOut_56_6 = 0;
                                    stackIn_57_0 = stackOut_56_0;
                                    stackIn_57_1 = stackOut_56_1;
                                    stackIn_57_2 = stackOut_56_2;
                                    stackIn_57_3 = stackOut_56_3;
                                    stackIn_57_4 = stackOut_56_4;
                                    stackIn_57_5 = stackOut_56_5;
                                    stackIn_57_6 = stackOut_56_6;
                                    break L14;
                                  } else {
                                    stackOut_54_0 = (da) (Object) stackIn_54_0;
                                    stackOut_54_1 = stackIn_54_1;
                                    stackOut_54_2 = stackIn_54_2;
                                    stackOut_54_3 = stackIn_54_3;
                                    stackOut_54_4 = stackIn_54_4;
                                    stackOut_54_5 = stackIn_54_5;
                                    stackOut_54_6 = 1;
                                    stackIn_57_0 = stackOut_54_0;
                                    stackIn_57_1 = stackOut_54_1;
                                    stackIn_57_2 = stackOut_54_2;
                                    stackIn_57_3 = stackOut_54_3;
                                    stackIn_57_4 = stackOut_54_4;
                                    stackIn_57_5 = stackOut_54_5;
                                    stackIn_57_6 = stackOut_54_6;
                                    break L14;
                                  }
                                }
                                L15: {
                                  stackOut_57_0 = (da) (Object) stackIn_57_0;
                                  stackOut_57_1 = stackIn_57_1;
                                  stackOut_57_2 = stackIn_57_2;
                                  stackOut_57_3 = stackIn_57_3;
                                  stackOut_57_4 = stackIn_57_4;
                                  stackOut_57_5 = stackIn_57_5;
                                  stackOut_57_6 = stackIn_57_6;
                                  stackOut_57_7 = 121;
                                  stackIn_60_0 = stackOut_57_0;
                                  stackIn_60_1 = stackOut_57_1;
                                  stackIn_60_2 = stackOut_57_2;
                                  stackIn_60_3 = stackOut_57_3;
                                  stackIn_60_4 = stackOut_57_4;
                                  stackIn_60_5 = stackOut_57_5;
                                  stackIn_60_6 = stackOut_57_6;
                                  stackIn_60_7 = stackOut_57_7;
                                  stackIn_58_0 = stackOut_57_0;
                                  stackIn_58_1 = stackOut_57_1;
                                  stackIn_58_2 = stackOut_57_2;
                                  stackIn_58_3 = stackOut_57_3;
                                  stackIn_58_4 = stackOut_57_4;
                                  stackIn_58_5 = stackOut_57_5;
                                  stackIn_58_6 = stackOut_57_6;
                                  stackIn_58_7 = stackOut_57_7;
                                  if (or.field_a == 0) {
                                    stackOut_60_0 = (da) (Object) stackIn_60_0;
                                    stackOut_60_1 = stackIn_60_1;
                                    stackOut_60_2 = stackIn_60_2;
                                    stackOut_60_3 = stackIn_60_3;
                                    stackOut_60_4 = stackIn_60_4;
                                    stackOut_60_5 = stackIn_60_5;
                                    stackOut_60_6 = stackIn_60_6;
                                    stackOut_60_7 = stackIn_60_7;
                                    stackOut_60_8 = 0;
                                    stackIn_61_0 = stackOut_60_0;
                                    stackIn_61_1 = stackOut_60_1;
                                    stackIn_61_2 = stackOut_60_2;
                                    stackIn_61_3 = stackOut_60_3;
                                    stackIn_61_4 = stackOut_60_4;
                                    stackIn_61_5 = stackOut_60_5;
                                    stackIn_61_6 = stackOut_60_6;
                                    stackIn_61_7 = stackOut_60_7;
                                    stackIn_61_8 = stackOut_60_8;
                                    break L15;
                                  } else {
                                    stackOut_58_0 = (da) (Object) stackIn_58_0;
                                    stackOut_58_1 = stackIn_58_1;
                                    stackOut_58_2 = stackIn_58_2;
                                    stackOut_58_3 = stackIn_58_3;
                                    stackOut_58_4 = stackIn_58_4;
                                    stackOut_58_5 = stackIn_58_5;
                                    stackOut_58_6 = stackIn_58_6;
                                    stackOut_58_7 = stackIn_58_7;
                                    stackOut_58_8 = 1;
                                    stackIn_61_0 = stackOut_58_0;
                                    stackIn_61_1 = stackOut_58_1;
                                    stackIn_61_2 = stackOut_58_2;
                                    stackIn_61_3 = stackOut_58_3;
                                    stackIn_61_4 = stackOut_58_4;
                                    stackIn_61_5 = stackOut_58_5;
                                    stackIn_61_6 = stackOut_58_6;
                                    stackIn_61_7 = stackOut_58_7;
                                    stackIn_61_8 = stackOut_58_8;
                                    break L15;
                                  }
                                }
                                L16: {
                                  ((da) (Object) stackIn_61_0).a(stackIn_61_1, stackIn_61_2, stackIn_61_3, stackIn_61_4, stackIn_61_5, ci.a(stackIn_61_6 != 0, (byte) stackIn_61_7, stackIn_61_8 != 0, false));
                                  stackOut_61_0 = rb.field_j;
                                  stackOut_61_1 = 119;
                                  stackOut_61_2 = 16777215 | var8 << -703615112;
                                  stackOut_61_3 = -1;
                                  stackOut_61_4 = 60 + (var9 * 8 + var7);
                                  stackOut_61_5 = 320;
                                  stackOut_61_6 = -93;
                                  stackIn_64_0 = stackOut_61_0;
                                  stackIn_64_1 = stackOut_61_1;
                                  stackIn_64_2 = stackOut_61_2;
                                  stackIn_64_3 = stackOut_61_3;
                                  stackIn_64_4 = stackOut_61_4;
                                  stackIn_64_5 = stackOut_61_5;
                                  stackIn_64_6 = stackOut_61_6;
                                  stackIn_62_0 = stackOut_61_0;
                                  stackIn_62_1 = stackOut_61_1;
                                  stackIn_62_2 = stackOut_61_2;
                                  stackIn_62_3 = stackOut_61_3;
                                  stackIn_62_4 = stackOut_61_4;
                                  stackIn_62_5 = stackOut_61_5;
                                  stackIn_62_6 = stackOut_61_6;
                                  if (r.field_n == 0) {
                                    stackOut_64_0 = (da) (Object) stackIn_64_0;
                                    stackOut_64_1 = stackIn_64_1;
                                    stackOut_64_2 = stackIn_64_2;
                                    stackOut_64_3 = stackIn_64_3;
                                    stackOut_64_4 = stackIn_64_4;
                                    stackOut_64_5 = stackIn_64_5;
                                    stackOut_64_6 = stackIn_64_6;
                                    stackOut_64_7 = 0;
                                    stackIn_65_0 = stackOut_64_0;
                                    stackIn_65_1 = stackOut_64_1;
                                    stackIn_65_2 = stackOut_64_2;
                                    stackIn_65_3 = stackOut_64_3;
                                    stackIn_65_4 = stackOut_64_4;
                                    stackIn_65_5 = stackOut_64_5;
                                    stackIn_65_6 = stackOut_64_6;
                                    stackIn_65_7 = stackOut_64_7;
                                    break L16;
                                  } else {
                                    stackOut_62_0 = (da) (Object) stackIn_62_0;
                                    stackOut_62_1 = stackIn_62_1;
                                    stackOut_62_2 = stackIn_62_2;
                                    stackOut_62_3 = stackIn_62_3;
                                    stackOut_62_4 = stackIn_62_4;
                                    stackOut_62_5 = stackIn_62_5;
                                    stackOut_62_6 = stackIn_62_6;
                                    stackOut_62_7 = 1;
                                    stackIn_65_0 = stackOut_62_0;
                                    stackIn_65_1 = stackOut_62_1;
                                    stackIn_65_2 = stackOut_62_2;
                                    stackIn_65_3 = stackOut_62_3;
                                    stackIn_65_4 = stackOut_62_4;
                                    stackIn_65_5 = stackOut_62_5;
                                    stackIn_65_6 = stackOut_62_6;
                                    stackIn_65_7 = stackOut_62_7;
                                    break L16;
                                  }
                                }
                                L17: {
                                  stackOut_65_0 = (da) (Object) stackIn_65_0;
                                  stackOut_65_1 = stackIn_65_1;
                                  stackOut_65_2 = stackIn_65_2;
                                  stackOut_65_3 = stackIn_65_3;
                                  stackOut_65_4 = stackIn_65_4;
                                  stackOut_65_5 = stackIn_65_5;
                                  stackOut_65_6 = stackIn_65_6;
                                  stackOut_65_7 = stackIn_65_7;
                                  stackIn_68_0 = stackOut_65_0;
                                  stackIn_68_1 = stackOut_65_1;
                                  stackIn_68_2 = stackOut_65_2;
                                  stackIn_68_3 = stackOut_65_3;
                                  stackIn_68_4 = stackOut_65_4;
                                  stackIn_68_5 = stackOut_65_5;
                                  stackIn_68_6 = stackOut_65_6;
                                  stackIn_68_7 = stackOut_65_7;
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  stackIn_66_2 = stackOut_65_2;
                                  stackIn_66_3 = stackOut_65_3;
                                  stackIn_66_4 = stackOut_65_4;
                                  stackIn_66_5 = stackOut_65_5;
                                  stackIn_66_6 = stackOut_65_6;
                                  stackIn_66_7 = stackOut_65_7;
                                  if (or.field_a == 0) {
                                    stackOut_68_0 = (da) (Object) stackIn_68_0;
                                    stackOut_68_1 = stackIn_68_1;
                                    stackOut_68_2 = stackIn_68_2;
                                    stackOut_68_3 = stackIn_68_3;
                                    stackOut_68_4 = stackIn_68_4;
                                    stackOut_68_5 = stackIn_68_5;
                                    stackOut_68_6 = stackIn_68_6;
                                    stackOut_68_7 = stackIn_68_7;
                                    stackOut_68_8 = 0;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    stackIn_69_2 = stackOut_68_2;
                                    stackIn_69_3 = stackOut_68_3;
                                    stackIn_69_4 = stackOut_68_4;
                                    stackIn_69_5 = stackOut_68_5;
                                    stackIn_69_6 = stackOut_68_6;
                                    stackIn_69_7 = stackOut_68_7;
                                    stackIn_69_8 = stackOut_68_8;
                                    break L17;
                                  } else {
                                    stackOut_66_0 = (da) (Object) stackIn_66_0;
                                    stackOut_66_1 = stackIn_66_1;
                                    stackOut_66_2 = stackIn_66_2;
                                    stackOut_66_3 = stackIn_66_3;
                                    stackOut_66_4 = stackIn_66_4;
                                    stackOut_66_5 = stackIn_66_5;
                                    stackOut_66_6 = stackIn_66_6;
                                    stackOut_66_7 = stackIn_66_7;
                                    stackOut_66_8 = 1;
                                    stackIn_69_0 = stackOut_66_0;
                                    stackIn_69_1 = stackOut_66_1;
                                    stackIn_69_2 = stackOut_66_2;
                                    stackIn_69_3 = stackOut_66_3;
                                    stackIn_69_4 = stackOut_66_4;
                                    stackIn_69_5 = stackOut_66_5;
                                    stackIn_69_6 = stackOut_66_6;
                                    stackIn_69_7 = stackOut_66_7;
                                    stackIn_69_8 = stackOut_66_8;
                                    break L17;
                                  }
                                }
                                ((da) (Object) stackIn_69_0).a(stackIn_69_1, stackIn_69_2, stackIn_69_3, stackIn_69_4, stackIn_69_5, av.a((byte) stackIn_69_6, stackIn_69_7 != 0, stackIn_69_8 != 0, false));
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L10;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.b(false, param0, param2 + -123);
                          if (var10 == 0) {
                            break L5;
                          } else {
                            break L9;
                          }
                        }
                      }
                      this.b(197427713, param0);
                      if (var10 == 0) {
                        break L5;
                      } else {
                        break L8;
                      }
                    }
                  }
                  this.d(-9621, param0);
                  if (var10 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              this.a(param0, (byte) 81, kg.field_c);
              break L5;
            }
            L18: {
              L19: {
                L20: {
                  if (var6 == 0) {
                    break L20;
                  } else {
                    if (lp.field_a[70]) {
                      break L19;
                    } else {
                      if (lp.field_a[69]) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
                var7 = 0;
                L21: while (true) {
                  if (((nk) this).field_i.field_c <= var7) {
                    break L19;
                  } else {
                    stackOut_90_0 = this.a(var7, (byte) -17);
                    stackIn_102_0 = stackOut_90_0 ? 1 : 0;
                    stackIn_91_0 = stackOut_90_0;
                    if (var10 != 0) {
                      break L18;
                    } else {
                      L22: {
                        if (stackIn_91_0) {
                          L23: {
                            stackOut_95_0 = this;
                            stackOut_95_1 = param0;
                            stackOut_95_2 = var7;
                            stackOut_95_3 = 4;
                            stackIn_98_0 = stackOut_95_0;
                            stackIn_98_1 = stackOut_95_1;
                            stackIn_98_2 = stackOut_95_2;
                            stackIn_98_3 = stackOut_95_3;
                            stackIn_96_0 = stackOut_95_0;
                            stackIn_96_1 = stackOut_95_1;
                            stackIn_96_2 = stackOut_95_2;
                            stackIn_96_3 = stackOut_95_3;
                            if (~var7 != ~((nk) this).field_i.field_g) {
                              stackOut_98_0 = this;
                              stackOut_98_1 = stackIn_98_1;
                              stackOut_98_2 = stackIn_98_2;
                              stackOut_98_3 = stackIn_98_3;
                              stackOut_98_4 = 0;
                              stackIn_99_0 = stackOut_98_0;
                              stackIn_99_1 = stackOut_98_1;
                              stackIn_99_2 = stackOut_98_2;
                              stackIn_99_3 = stackOut_98_3;
                              stackIn_99_4 = stackOut_98_4;
                              break L23;
                            } else {
                              stackOut_96_0 = this;
                              stackOut_96_1 = stackIn_96_1;
                              stackOut_96_2 = stackIn_96_2;
                              stackOut_96_3 = stackIn_96_3;
                              stackOut_96_4 = 1;
                              stackIn_99_0 = stackOut_96_0;
                              stackIn_99_1 = stackOut_96_1;
                              stackIn_99_2 = stackOut_96_2;
                              stackIn_99_3 = stackOut_96_3;
                              stackIn_99_4 = stackOut_96_4;
                              break L23;
                            }
                          }
                          this.a(stackIn_99_1, stackIn_99_2, stackIn_99_3, stackIn_99_4 != 0, param1);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      var7++;
                      if (var10 == 0) {
                        continue L21;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
              }
              stackOut_101_0 = ((nk) this).field_d;
              stackIn_102_0 = stackOut_101_0;
              break L18;
            }
            L24: {
              if (stackIn_102_0 != 0) {
                break L24;
              } else {
                mp.field_h.a(44, 30 + param0);
                break L24;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var4 = decompiledCaughtException;
            stackOut_106_0 = (RuntimeException) var4;
            stackOut_106_1 = new StringBuilder().append("nk.D(").append(param0).append(',');
            stackIn_109_0 = stackOut_106_0;
            stackIn_109_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param1 == null) {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "null";
              stackIn_110_0 = stackOut_109_0;
              stackIn_110_1 = stackOut_109_1;
              stackIn_110_2 = stackOut_109_2;
              break L25;
            } else {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "{...}";
              stackIn_110_0 = stackOut_107_0;
              stackIn_110_1 = stackOut_107_1;
              stackIn_110_2 = stackOut_107_2;
              break L25;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_110_0, stackIn_110_2 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        ha var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        boolean[] var12 = null;
        boolean[] var13 = null;
        boolean[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var18_ref_String = null;
        Object var19_ref = null;
        pa var19_ref_pa = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_110_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_107_0 = 0;
        var23 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < -121) {
                break L1;
              } else {
                this.a(-106, 49, 71, false, (ha) null);
                break L1;
              }
            }
            L2: {
              var4_ref = pk.field_wb.a((byte) 84);
              var5 = -1;
              var6 = 0;
              var7 = 50;
              var8 = param1 + 108;
              var9 = 540;
              var10 = 312;
              this.a(var10, (byte) 86, var7, var9, var4_ref, var8);
              var11 = ro.field_p;
              if (!param0) {
                break L2;
              } else {
                var11 = pm.field_d;
                break L2;
              }
            }
            L3: {
              this.a(param1, (byte) 75, var11);
              var12 = new boolean[]{false, false, false, false, false, false, false, false, false};
              var13 = new boolean[]{false, false, false, false, false, false, true, true, true};
              var14 = new boolean[]{false, false, false, false, false, false, true, true, true};
              var7 = 75;
              var15 = param1 + 127;
              if (!param0) {
                stackOut_9_0 = hg.field_D;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_7_0 = r.field_n;
                stackIn_10_0 = stackOut_7_0;
                break L3;
              }
            }
            var16 = stackIn_10_0;
            var17 = -1;
            var18 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (~(-1 + lb.field_a.length) >= ~var18) {
                    break L6;
                  } else {
                    var19_ref = null;
                    stackOut_12_0 = var16 & 1 << var18;
                    stackIn_80_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var23 != 0) {
                      break L5;
                    } else {
                      L7: {
                        L8: {
                          if (stackIn_13_0 != 0) {
                            var19_ref_pa = aa.field_a[var18];
                            break L8;
                          } else {
                            L9: {
                              if (!param0) {
                                break L9;
                              } else {
                                if (var23 == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (!var14[var18]) {
                                break L10;
                              } else {
                                if (var23 == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (qr.field_a > 0) {
                                break L11;
                              } else {
                                if (!var12[var18]) {
                                  break L11;
                                } else {
                                  var19_ref_pa = ut.field_c;
                                  break L8;
                                }
                              }
                            }
                            var19_ref_pa = dh.field_k;
                            break L8;
                          }
                        }
                        L12: {
                          var20 = var7;
                          var21 = var15;
                          if (var20 > ic.field_b) {
                            break L12;
                          } else {
                            if (var20 - -48 < ic.field_b) {
                              break L12;
                            } else {
                              if (cf.field_g < var21) {
                                break L12;
                              } else {
                                if (cf.field_g <= var21 + 48) {
                                  uc.field_o[1].a(-28 + var20, var21 - 30, 108, 108, 0, 2004318071, 2);
                                  var17 = var18;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        L13: {
                          if (((nk) this).field_e != var18) {
                            break L13;
                          } else {
                            uc.field_o[1].a(-28 + var20, -30 + var21, 108, 108, 1, 0, 2);
                            break L13;
                          }
                        }
                        L14: {
                          var19_ref_pa.a(var20, var21, 48, 48, 0, var5, 1);
                          if (((nk) this).field_c < var20) {
                            break L14;
                          } else {
                            if (~((nk) this).field_c < ~(48 + var20)) {
                              break L14;
                            } else {
                              if (var21 > ((nk) this).field_b) {
                                break L14;
                              } else {
                                if (var21 + 48 >= ((nk) this).field_b) {
                                  L15: {
                                    ((nk) this).field_c = -1;
                                    if (((nk) this).field_e != var18) {
                                      break L15;
                                    } else {
                                      ((nk) this).field_e = -1;
                                      if (var23 == 0) {
                                        break L14;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  ((nk) this).field_e = var18;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        L16: {
                          if (!var14[var18]) {
                            break L16;
                          } else {
                            if ((1 << var18 & var16) != 0) {
                              break L16;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var7 += 55;
                        break L7;
                      }
                      var18++;
                      if (var23 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                stackOut_79_0 = param1;
                stackIn_80_0 = stackOut_79_0;
                break L5;
              }
              L17: {
                if (stackIn_80_0 != 0) {
                  var17 = -1;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (0 > ((nk) this).field_e) {
                  break L18;
                } else {
                  var17 = ((nk) this).field_e;
                  break L18;
                }
              }
              L19: {
                if (-1 == var17) {
                  var18 = param1 + 264;
                  rb.field_j.a(96, var5, -1, var18, 320, sl.field_q);
                  rb.field_j.a(126, var5, -1, var18 - -(kn.field_b.field_j * 3 >> 733533601), 320, ef.field_g);
                  if (!cn.b(true)) {
                    break L19;
                  } else {
                    rb.field_j.a(112, var5, -1, var18 + 6 * kn.field_b.field_j, 320, bt.field_c);
                    break L19;
                  }
                } else {
                  L20: {
                    var7 = 470;
                    var15 = param1 + 220;
                    rb.field_j.a(101, -5622785, -16777216, var15, var7, jk.field_c);
                    var15 += 24;
                    var18_ref_String = Integer.toString(100 * qe.field_f[var17]);
                    if (!var13[var17]) {
                      break L20;
                    } else {
                      if ((1 << var17 & var16) == 0) {
                        var18_ref_String = fh.field_g;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    L22: {
                      L23: {
                        rb.field_j.a(124, var5, var6, var15, var7, var18_ref_String);
                        var15 = 280 + param1;
                        var7 = 470;
                        rb.field_j.a(127, -5622785, -16777216, var15, var7, sd.field_e);
                        if (!var13[var17]) {
                          break L23;
                        } else {
                          if (0 == (1 << var17 & var16)) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var7 = var7 - ((qe.field_f[var17] - 1) * lg.field_k.d() / 6 - -(lg.field_k.d() / 2) >> -523148318);
                      var19 = 0;
                      L24: while (true) {
                        L25: {
                          if (~qe.field_f[var17] >= ~var19) {
                            break L25;
                          } else {
                            lg.field_k.b(var7, 12 + var15, 32, 32);
                            var7 = var7 + (lg.field_k.d() / 3 >> -1501850814);
                            var19++;
                            if (var23 != 0) {
                              break L21;
                            } else {
                              if (var23 == 0) {
                                continue L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        if (var23 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var15 += 32;
                    rb.field_j.a(111, -1, -16777216, var15, var7, var18_ref_String);
                    break L21;
                  }
                  L26: {
                    if (0 == (var16 & 1 << var17)) {
                      stackOut_109_0 = 0;
                      stackIn_110_0 = stackOut_109_0;
                      break L26;
                    } else {
                      stackOut_107_0 = 1;
                      stackIn_110_0 = stackOut_107_0;
                      break L26;
                    }
                  }
                  L27: {
                    L28: {
                      var19 = stackIn_110_0;
                      var7 = 170;
                      var15 = 220 + param1;
                      if (var19 != 0) {
                        break L28;
                      } else {
                        rb.field_j.a(114, -56764, var6, var15, var7, jm.field_b);
                        if (var23 == 0) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    rb.field_j.a(111, -14483644, var6, var15, var7, sk.field_d);
                    break L27;
                  }
                  L29: {
                    var20 = 160;
                    var18_ref_String = hn.field_b[var17];
                    var15 += 10;
                    if (!var13[var17]) {
                      break L29;
                    } else {
                      if ((var16 & 1 << var17) != 0) {
                        break L29;
                      } else {
                        var18_ref_String = pe.field_c;
                        break L29;
                      }
                    }
                  }
                  L30: {
                    L31: {
                      int discarded$1 = rb.field_j.a(0, -(var20 / 2) + var7, var5, true, var6, 1, 8 + var15, hi.field_v.field_j, 0, (pa[]) null, (aa) null, 0, (int[]) null, var20, 480, var18_ref_String);
                      var7 = 320;
                      var15 = 350 - -param1;
                      rb.field_j.a(118, var5, var6, var15, var7, lb.field_a[var17]);
                      var21 = param1 + 200;
                      if (var19 == 0) {
                        break L31;
                      } else {
                        aa.field_a[var17].a(256, var21, 0, var5, 1);
                        if (var23 == 0) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                    L32: {
                      if (qr.field_a > 0) {
                        break L32;
                      } else {
                        if (!var12[var17]) {
                          break L32;
                        } else {
                          ut.field_c.a(256, var21, 0, var5, 1);
                          if (var23 == 0) {
                            break L30;
                          } else {
                            break L32;
                          }
                        }
                      }
                    }
                    dh.field_k.a(256, var21, 0, var5, 1);
                    break L30;
                  }
                  L33: {
                    L34: {
                      var22 = 360 + param1;
                      if (cn.b(true)) {
                        break L34;
                      } else {
                        if (!param0) {
                          break L33;
                        } else {
                          break L34;
                        }
                      }
                    }
                    var22 -= 20;
                    break L33;
                  }
                  rb.field_j.a(123, var5, -1, var22 - -(kn.field_b.field_j * 3 >> 1315301025), 320, ef.field_g);
                  break L19;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4, "nk.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (bl.field_c >= 2) {
              if (param0 == 68) {
                L1: {
                  if (0 != fb.field_e) {
                    L2: {
                      if (ij.field_h != null) {
                        if (ij.field_h.b((byte) -105)) {
                          if (ij.field_h.a("", param0 + -168)) {
                            if (!ij.field_h.c("", -14012)) {
                              stackOut_43_0 = 29;
                              stackIn_44_0 = stackOut_43_0;
                              return stackIn_44_0;
                            } else {
                              break L2;
                            }
                          } else {
                            stackOut_38_0 = 29;
                            stackIn_39_0 = stackOut_38_0;
                            return stackIn_39_0;
                          }
                        } else {
                          stackOut_35_0 = 14;
                          stackIn_36_0 = stackOut_35_0;
                          return stackIn_36_0;
                        }
                      } else {
                        break L2;
                      }
                    }
                    if (!oi.field_a.b((byte) 83)) {
                      stackOut_48_0 = 43;
                      stackIn_49_0 = stackOut_48_0;
                      return stackIn_49_0;
                    } else {
                      if (!oi.field_a.c("commonui", param0 + -14080)) {
                        stackOut_53_0 = 57;
                        stackIn_54_0 = stackOut_53_0;
                        return stackIn_54_0;
                      } else {
                        if (uj.field_b.b((byte) 89)) {
                          if (!uj.field_b.c("commonui", -14012)) {
                            stackOut_61_0 = 80;
                            stackIn_62_0 = stackOut_61_0;
                            return stackIn_62_0;
                          } else {
                            if (cf.field_f.b((byte) -13)) {
                              if (!cf.field_f.b(param0 + -68)) {
                                stackOut_69_0 = 86;
                                stackIn_70_0 = stackOut_69_0;
                                return stackIn_70_0;
                              } else {
                                break L1;
                              }
                            } else {
                              stackOut_64_0 = 82;
                              stackIn_65_0 = stackOut_64_0;
                              return stackIn_65_0;
                            }
                          }
                        } else {
                          stackOut_56_0 = 71;
                          stackIn_57_0 = stackOut_56_0;
                          return stackIn_57_0;
                        }
                      }
                    }
                  } else {
                    if (!oi.field_a.b((byte) 82)) {
                      stackOut_12_0 = 20;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    } else {
                      if (oi.field_a.c("commonui", -14012)) {
                        if (!uj.field_b.b((byte) 93)) {
                          stackOut_20_0 = 50;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          if (uj.field_b.c("commonui", param0 + -14080)) {
                            if (cf.field_f.b((byte) -63)) {
                              if (cf.field_f.b(0)) {
                                break L1;
                              } else {
                                stackOut_29_0 = 80;
                                stackIn_30_0 = stackOut_29_0;
                                return stackIn_30_0;
                              }
                            } else {
                              stackOut_26_0 = 70;
                              stackIn_27_0 = stackOut_26_0;
                              return stackIn_27_0;
                            }
                          } else {
                            stackOut_23_0 = 60;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          }
                        }
                      } else {
                        stackOut_15_0 = 40;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                  }
                }
                stackOut_71_0 = 100;
                stackIn_72_0 = stackOut_71_0;
                break L0;
              } else {
                stackOut_4_0 = 56;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "nk.C(" + param0 + ')');
        }
        return stackIn_72_0;
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        ha var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        int[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] stackIn_7_0 = null;
        int[] stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        da stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        pa[] stackIn_32_3 = null;
        da stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        pa[] stackIn_34_3 = null;
        da stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        pa[] stackIn_36_3 = null;
        da stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        pa[] stackIn_37_3 = null;
        int stackIn_37_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_10_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        da stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        pa[] stackOut_31_3 = null;
        da stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        pa[] stackOut_36_3 = null;
        int stackOut_36_4 = 0;
        da stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        pa[] stackOut_32_3 = null;
        da stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        pa[] stackOut_34_3 = null;
        int stackOut_34_4 = 0;
        var15 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_ref = pk.field_wb.a((byte) 77);
              var4 = -1;
              var5 = 50;
              var6 = 90 + param1;
              var7 = 540;
              if (param0 == 197427713) {
                break L1;
              } else {
                ((nk) this).field_a = 4;
                break L1;
              }
            }
            var8 = 284;
            this.a(40 + var8, (byte) 86, -20 + var5, var7 - -40, var3_ref, var6 + -20);
            this.a(param1, (byte) 76, bt.field_b);
            var9 = 20;
            var10 = new String[50];
            var11 = new int[ac.field_f.length];
            var12_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var12_int <= ~ac.field_f.length) {
                    break L4;
                  } else {
                    stackOut_6_0 = (int[]) var11;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      stackIn_7_0[var12_int] = 10;
                      var12_int++;
                      if (var15 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = new int[50];
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              var12 = stackIn_11_0;
              var13 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var13 >= 50) {
                      break L7;
                    } else {
                      var12[var13] = -24 + var7;
                      stackOut_13_0 = -6;
                      stackIn_22_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var15 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (stackIn_14_0 == ~vq.field_w) {
                            var12[var13] = var12[var13] - 64;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var13++;
                        if (var15 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var13 = hi.field_v.a(-102, ac.field_f, var12, var10, sn.a(io.field_a[vq.field_w], 120, new String[1]));
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L6;
                }
                var14 = stackIn_22_0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var14 >= var13) {
                        break L11;
                      } else {
                        if (var15 != 0) {
                          break L10;
                        } else {
                          L12: {
                            L13: {
                              if (!var10[var14].startsWith("<b>")) {
                                break L13;
                              } else {
                                se.field_c.a(var4, 0, ac.field_f, var5 - -12, 0, var10[var14], var9 * (var14 - var13 / 2) + (10 - (-var6 - var8 / 2)), var11);
                                if (var15 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              stackOut_31_0 = rb.field_j;
                              stackOut_31_1 = var4;
                              stackOut_31_2 = 0;
                              stackOut_31_3 = ac.field_f;
                              stackIn_36_0 = stackOut_31_0;
                              stackIn_36_1 = stackOut_31_1;
                              stackIn_36_2 = stackOut_31_2;
                              stackIn_36_3 = stackOut_31_3;
                              stackIn_32_0 = stackOut_31_0;
                              stackIn_32_1 = stackOut_31_1;
                              stackIn_32_2 = stackOut_31_2;
                              stackIn_32_3 = stackOut_31_3;
                              if (vq.field_w != 5) {
                                stackOut_36_0 = (da) (Object) stackIn_36_0;
                                stackOut_36_1 = stackIn_36_1;
                                stackOut_36_2 = stackIn_36_2;
                                stackOut_36_3 = (pa[]) (Object) stackIn_36_3;
                                stackOut_36_4 = 0;
                                stackIn_37_0 = stackOut_36_0;
                                stackIn_37_1 = stackOut_36_1;
                                stackIn_37_2 = stackOut_36_2;
                                stackIn_37_3 = stackOut_36_3;
                                stackIn_37_4 = stackOut_36_4;
                                break L14;
                              } else {
                                stackOut_32_0 = (da) (Object) stackIn_32_0;
                                stackOut_32_1 = stackIn_32_1;
                                stackOut_32_2 = stackIn_32_2;
                                stackOut_32_3 = (pa[]) (Object) stackIn_32_3;
                                stackIn_34_0 = stackOut_32_0;
                                stackIn_34_1 = stackOut_32_1;
                                stackIn_34_2 = stackOut_32_2;
                                stackIn_34_3 = stackOut_32_3;
                                stackOut_34_0 = (da) (Object) stackIn_34_0;
                                stackOut_34_1 = stackIn_34_1;
                                stackOut_34_2 = stackIn_34_2;
                                stackOut_34_3 = (pa[]) (Object) stackIn_34_3;
                                stackOut_34_4 = 64;
                                stackIn_37_0 = stackOut_34_0;
                                stackIn_37_1 = stackOut_34_1;
                                stackIn_37_2 = stackOut_34_2;
                                stackIn_37_3 = stackOut_34_3;
                                stackIn_37_4 = stackOut_34_4;
                                break L14;
                              }
                            }
                            ((da) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4 + (12 + var5), 0, var10[var14], var6 + var8 / 2 + var9 * (var14 - var13 / 2), var11);
                            break L12;
                          }
                          var14++;
                          if (var15 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    se.field_c.a(0, var4, var11, (byte) -110, -10 + (var8 + var6), om.a(io.field_a.length, 1 + vq.field_w, (byte) 66), var7 + var5 + -10, ac.field_f);
                    break L10;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_102_0 = false;
        int stackIn_110_0 = 0;
        boolean stackIn_116_0 = false;
        int stackIn_125_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_137_0 = 0;
        String[] stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        String[] stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        String[] stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        String[] stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        String[] stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        String stackIn_153_2 = null;
        String[] stackIn_157_0 = null;
        String[] stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        int stackIn_159_3 = 0;
        String[] stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        String[] stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        String[] stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        String stackIn_163_2 = null;
        int stackIn_170_0 = 0;
        String[] stackIn_170_1 = null;
        int stackIn_171_0 = 0;
        String stackIn_171_1 = null;
        int stackIn_173_0 = 0;
        String stackIn_173_1 = null;
        int stackIn_175_0 = 0;
        String stackIn_175_1 = null;
        int stackIn_176_0 = 0;
        String stackIn_176_1 = null;
        int stackIn_176_2 = 0;
        String[] stackIn_183_0 = null;
        int stackIn_186_0 = 0;
        int stackIn_186_1 = 0;
        int stackIn_194_0 = 0;
        int stackIn_194_1 = 0;
        int stackIn_196_0 = 0;
        int stackIn_196_1 = 0;
        int stackIn_203_0 = 0;
        int stackIn_203_1 = 0;
        int stackIn_205_0 = 0;
        String[] stackIn_205_1 = null;
        int stackIn_207_0 = 0;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        int stackIn_209_0 = 0;
        int stackIn_209_1 = 0;
        int stackIn_209_2 = 0;
        int stackIn_210_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_218_2 = 0;
        int stackIn_220_0 = 0;
        int stackIn_227_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_101_0 = false;
        int stackOut_109_0 = 0;
        boolean stackOut_115_0 = false;
        int stackOut_124_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_134_0 = 0;
        String[] stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        int stackOut_146_2 = 0;
        int stackOut_146_3 = 0;
        String[] stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        String[] stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        String stackOut_162_2 = null;
        String[] stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        String stackOut_160_2 = null;
        String[] stackOut_156_0 = null;
        String[] stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        int stackOut_157_2 = 0;
        int stackOut_157_3 = 0;
        String[] stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        String[] stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        String stackOut_152_2 = null;
        String[] stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        String[] stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        String stackOut_150_2 = null;
        int stackOut_169_0 = 0;
        String[] stackOut_169_1 = null;
        int stackOut_206_0 = 0;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int stackOut_207_0 = 0;
        int stackOut_207_1 = 0;
        int stackOut_207_2 = 0;
        int stackOut_209_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_214_1 = 0;
        int stackOut_210_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_212_1 = 0;
        int stackOut_204_0 = 0;
        String[] stackOut_204_1 = null;
        int stackOut_170_0 = 0;
        String stackOut_170_1 = null;
        int stackOut_175_0 = 0;
        String stackOut_175_1 = null;
        int stackOut_175_2 = 0;
        int stackOut_171_0 = 0;
        String stackOut_171_1 = null;
        int stackOut_173_0 = 0;
        String stackOut_173_1 = null;
        int stackOut_173_2 = 0;
        String[] stackOut_182_0 = null;
        int stackOut_185_0 = 0;
        int stackOut_185_1 = 0;
        int stackOut_195_0 = 0;
        int stackOut_195_1 = 0;
        int stackOut_193_0 = 0;
        int stackOut_193_1 = 0;
        int stackOut_202_0 = 0;
        int stackOut_202_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_217_1 = 0;
        int stackOut_217_2 = 0;
        int stackOut_226_0 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
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
                              cu.field_r = true;
                              ol.field_c = param1;
                              if (ol.field_c != 0) {
                                break L9;
                              } else {
                                var3_int = ff.a(qk.field_g, ad.field_V, st.field_b, -3, nh.field_c);
                                var4 = 3 + var3_int;
                                ne.field_g = new String[var4];
                                rn.field_a = new int[var4];
                                var5 = 0;
                                L10: while (true) {
                                  L11: {
                                    L12: {
                                      if (var5 >= var4) {
                                        break L12;
                                      } else {
                                        rn.field_a[var5] = -1;
                                        var5++;
                                        if (var9 != 0) {
                                          break L11;
                                        } else {
                                          if (var9 == 0) {
                                            continue L10;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    rm.field_g = new int[2];
                                    break L11;
                                  }
                                  var5 = 0;
                                  L13: while (true) {
                                    L14: {
                                      L15: {
                                        if (~var3_int >= ~var5) {
                                          break L15;
                                        } else {
                                          ne.field_g[var5] = st.field_b[var5];
                                          var5++;
                                          if (var9 != 0) {
                                            break L14;
                                          } else {
                                            if (var9 == 0) {
                                              continue L13;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      ne.field_g[var4 + -3] = "";
                                      ne.field_g[-2 + var4] = rj.field_a;
                                      rn.field_a[-2 + var4] = 0;
                                      rm.field_g[0] = 4;
                                      ne.field_g[-1 + var4] = ne.field_e;
                                      rn.field_a[-1 + var4] = 1;
                                      rm.field_g[1] = 5;
                                      break L14;
                                    }
                                    if (var9 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            L16: {
                              if (ol.field_c != 1) {
                                break L16;
                              } else {
                                var3_int = ff.a(qk.field_g, ad.field_V, st.field_b, -3, nh.field_c);
                                var4 = 2 - -var3_int;
                                ne.field_g = new String[var4];
                                rn.field_a = new int[var4];
                                var5 = 0;
                                L17: while (true) {
                                  L18: {
                                    L19: {
                                      if (var4 <= var5) {
                                        break L19;
                                      } else {
                                        rn.field_a[var5] = -1;
                                        var5++;
                                        if (var9 != 0) {
                                          break L18;
                                        } else {
                                          if (var9 == 0) {
                                            continue L17;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                    rm.field_g = new int[1];
                                    break L18;
                                  }
                                  var5 = 0;
                                  L20: while (true) {
                                    L21: {
                                      L22: {
                                        if (~var3_int >= ~var5) {
                                          break L22;
                                        } else {
                                          ne.field_g[var5] = st.field_b[var5];
                                          var5++;
                                          if (var9 != 0) {
                                            break L21;
                                          } else {
                                            if (var9 == 0) {
                                              continue L20;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      }
                                      ne.field_g[var4 - 2] = "";
                                      ne.field_g[-1 + var4] = ne.field_e;
                                      rn.field_a[var4 - 1] = 0;
                                      rm.field_g[0] = 5;
                                      break L21;
                                    }
                                    if (var9 == 0) {
                                      break L8;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                            L23: {
                              if (ol.field_c == 2) {
                                break L23;
                              } else {
                                L24: {
                                  if (ol.field_c != 3) {
                                    break L24;
                                  } else {
                                    L25: {
                                      L26: {
                                        if (pt.field_b.field_q) {
                                          break L26;
                                        } else {
                                          var3_int = ff.a(qk.field_g, ht.field_h, st.field_b, -3, nh.field_c);
                                          if (var9 == 0) {
                                            break L25;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var3_int = ff.a(qk.field_g, jm.field_c, st.field_b, -3, nh.field_c);
                                      break L25;
                                    }
                                    var4 = var3_int + 2;
                                    ne.field_g = new String[var4];
                                    rn.field_a = new int[var4];
                                    var5 = 0;
                                    L27: while (true) {
                                      L28: {
                                        L29: {
                                          if (var5 >= var4) {
                                            break L29;
                                          } else {
                                            rn.field_a[var5] = -1;
                                            var5++;
                                            if (var9 != 0) {
                                              break L28;
                                            } else {
                                              if (var9 == 0) {
                                                continue L27;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                        rm.field_g = new int[1];
                                        break L28;
                                      }
                                      var5 = 0;
                                      L30: while (true) {
                                        L31: {
                                          L32: {
                                            if (var3_int <= var5) {
                                              break L32;
                                            } else {
                                              ne.field_g[var5] = st.field_b[var5];
                                              var5++;
                                              if (var9 != 0) {
                                                break L31;
                                              } else {
                                                if (var9 == 0) {
                                                  continue L30;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                          }
                                          ne.field_g[var4 + -2] = "";
                                          ne.field_g[var4 - 1] = ne.field_e;
                                          rn.field_a[var4 + -1] = 0;
                                          rm.field_g[0] = 5;
                                          break L31;
                                        }
                                        if (var9 == 0) {
                                          break L8;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (4 == ol.field_c) {
                                  var3_int = ff.a(qk.field_g, tt.field_b, st.field_b, -3, nh.field_c);
                                  var4 = 2 + var3_int;
                                  rn.field_a = new int[var4];
                                  ne.field_g = new String[var4];
                                  var5 = 0;
                                  L33: while (true) {
                                    L34: {
                                      L35: {
                                        if (var4 <= var5) {
                                          break L35;
                                        } else {
                                          rn.field_a[var5] = -1;
                                          var5++;
                                          if (var9 != 0) {
                                            break L34;
                                          } else {
                                            if (var9 == 0) {
                                              continue L33;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                      }
                                      rm.field_g = new int[1];
                                      break L34;
                                    }
                                    var5 = 0;
                                    L36: while (true) {
                                      L37: {
                                        L38: {
                                          if (var3_int <= var5) {
                                            break L38;
                                          } else {
                                            ne.field_g[var5] = st.field_b[var5];
                                            var5++;
                                            if (var9 != 0) {
                                              break L37;
                                            } else {
                                              if (var9 == 0) {
                                                continue L36;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                        }
                                        ne.field_g[-2 + var4] = "";
                                        ne.field_g[-1 + var4] = ne.field_e;
                                        rn.field_a[var4 - 1] = 0;
                                        rm.field_g[0] = 5;
                                        break L37;
                                      }
                                      if (var9 == 0) {
                                        break L8;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                } else {
                                  L39: {
                                    if (ol.field_c != 5) {
                                      break L39;
                                    } else {
                                      var3_int = ff.a(qk.field_g, ur.field_c, st.field_b, -3, nh.field_c);
                                      var4 = 3 - -var3_int;
                                      rn.field_a = new int[var4];
                                      ne.field_g = new String[var4];
                                      var5 = 0;
                                      L40: while (true) {
                                        L41: {
                                          L42: {
                                            if (~var4 >= ~var5) {
                                              break L42;
                                            } else {
                                              rn.field_a[var5] = -1;
                                              var5++;
                                              if (var9 != 0) {
                                                break L41;
                                              } else {
                                                if (var9 == 0) {
                                                  continue L40;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                          }
                                          rm.field_g = new int[2];
                                          break L41;
                                        }
                                        var5 = 0;
                                        L43: while (true) {
                                          L44: {
                                            L45: {
                                              if (~var5 <= ~var3_int) {
                                                break L45;
                                              } else {
                                                ne.field_g[var5] = st.field_b[var5];
                                                var5++;
                                                if (var9 != 0) {
                                                  break L44;
                                                } else {
                                                  if (var9 == 0) {
                                                    continue L43;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                              }
                                            }
                                            ne.field_g[-3 + var4] = "";
                                            ne.field_g[var4 + -2] = lj.field_a;
                                            rn.field_a[var4 + -2] = 0;
                                            rm.field_g[0] = 3;
                                            ne.field_g[var4 - 1] = ne.field_e;
                                            rn.field_a[var4 - 1] = 1;
                                            rm.field_g[1] = 5;
                                            break L44;
                                          }
                                          if (var9 == 0) {
                                            break L8;
                                          } else {
                                            break L39;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  throw new IllegalArgumentException();
                                }
                              }
                            }
                            var3_int = ff.a(qk.field_g, sn.a(ij.field_i, 123, new String[1]), st.field_b, -3, nh.field_c);
                            var4 = -1;
                            var5 = 0;
                            L46: while (true) {
                              L47: {
                                L48: {
                                  if (~var5 <= ~var3_int) {
                                    break L48;
                                  } else {
                                    stackOut_101_0 = "<%0>".equals((Object) (Object) st.field_b[var5]);
                                    stackIn_110_0 = stackOut_101_0 ? 1 : 0;
                                    stackIn_102_0 = stackOut_101_0;
                                    if (var9 != 0) {
                                      break L47;
                                    } else {
                                      L49: {
                                        if (!stackIn_102_0) {
                                          break L49;
                                        } else {
                                          var4 = var5;
                                          if (var9 == 0) {
                                            break L48;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                      var5++;
                                      if (var9 == 0) {
                                        continue L46;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                stackOut_109_0 = -1;
                                stackIn_110_0 = stackOut_109_0;
                                break L47;
                              }
                              if (stackIn_110_0 != var4) {
                                es.field_a = new String[var4];
                                au.a((Object[]) (Object) st.field_b, 0, (Object[]) (Object) es.field_a, 0, var4);
                                cc.field_b = new String[-var4 + (var3_int - 1)];
                                au.a((Object[]) (Object) st.field_b, 1 + var4, (Object[]) (Object) cc.field_b, 0, -1 + -var4 + var3_int);
                                var3_int = ff.a(qk.field_g, sn.a(dh.field_d, 105, new String[1]), st.field_b, -3, nh.field_c);
                                var4 = -1;
                                var5 = 0;
                                L50: while (true) {
                                  L51: {
                                    L52: {
                                      if (var5 >= var3_int) {
                                        break L52;
                                      } else {
                                        stackOut_115_0 = "<%0>".equals((Object) (Object) st.field_b[var5]);
                                        stackIn_125_0 = stackOut_115_0 ? 1 : 0;
                                        stackIn_116_0 = stackOut_115_0;
                                        if (var9 != 0) {
                                          break L51;
                                        } else {
                                          L53: {
                                            if (stackIn_116_0) {
                                              var4 = var5;
                                              if (var9 == 0) {
                                                break L52;
                                              } else {
                                                break L53;
                                              }
                                            } else {
                                              break L53;
                                            }
                                          }
                                          var5++;
                                          if (var9 == 0) {
                                            continue L50;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_124_0 = -1;
                                    stackIn_125_0 = stackOut_124_0;
                                    break L51;
                                  }
                                  if (stackIn_125_0 == var4) {
                                    throw new IllegalStateException();
                                  } else {
                                    L54: {
                                      cn.field_z = new String[var4];
                                      au.a((Object[]) (Object) st.field_b, 0, (Object[]) (Object) cn.field_z, 0, var4);
                                      gp.field_v = new String[-1 + var3_int - var4];
                                      au.a((Object[]) (Object) st.field_b, var4 + 1, (Object[]) (Object) gp.field_v, 0, -1 + var3_int - var4);
                                      if (~es.field_a.length <= ~cn.field_z.length) {
                                        stackOut_132_0 = es.field_a.length;
                                        stackIn_133_0 = stackOut_132_0;
                                        break L54;
                                      } else {
                                        stackOut_130_0 = cn.field_z.length;
                                        stackIn_133_0 = stackOut_130_0;
                                        break L54;
                                      }
                                    }
                                    L55: {
                                      var5 = stackIn_133_0;
                                      if (~gp.field_v.length >= ~cc.field_b.length) {
                                        stackOut_136_0 = cc.field_b.length;
                                        stackIn_137_0 = stackOut_136_0;
                                        break L55;
                                      } else {
                                        stackOut_134_0 = gp.field_v.length;
                                        stackIn_137_0 = stackOut_134_0;
                                        break L55;
                                      }
                                    }
                                    var6 = stackIn_137_0;
                                    var7 = 7 + var5 - -var6;
                                    ne.field_g = new String[var7];
                                    rn.field_a = new int[var7];
                                    var8 = 0;
                                    L56: while (true) {
                                      L57: {
                                        L58: {
                                          if (~var7 >= ~var8) {
                                            break L58;
                                          } else {
                                            rn.field_a[var8] = -1;
                                            var8++;
                                            if (var9 != 0) {
                                              break L57;
                                            } else {
                                              if (var9 == 0) {
                                                continue L56;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                        }
                                        ne.field_g[1] = du.field_n;
                                        ne.field_g[0] = qg.field_b;
                                        rm.field_g = new int[2];
                                        rn.field_a[1] = 0;
                                        rm.field_g[1] = 2;
                                        ne.field_g[5] = "";
                                        rm.field_g[0] = 5;
                                        rn.field_a[3] = 1;
                                        ne.field_g[2] = dk.field_a;
                                        ne.field_g[4] = li.field_b;
                                        ne.field_g[3] = vl.field_a;
                                        break L57;
                                      }
                                      var8 = 0;
                                      L59: while (true) {
                                        L60: {
                                          L61: {
                                            if (~var5 >= ~var8) {
                                              break L61;
                                            } else {
                                              stackOut_146_0 = ne.field_g;
                                              stackOut_146_1 = 6 + var8;
                                              stackOut_146_2 = ~(-var5 + (cn.field_z.length + var8));
                                              stackOut_146_3 = -1;
                                              stackIn_159_0 = stackOut_146_0;
                                              stackIn_159_1 = stackOut_146_1;
                                              stackIn_159_2 = stackOut_146_2;
                                              stackIn_159_3 = stackOut_146_3;
                                              stackIn_147_0 = stackOut_146_0;
                                              stackIn_147_1 = stackOut_146_1;
                                              stackIn_147_2 = stackOut_146_2;
                                              stackIn_147_3 = stackOut_146_3;
                                              if (var9 != 0) {
                                                L62: while (true) {
                                                  L63: {
                                                    stackOut_159_0 = (String[]) (Object) stackIn_159_0;
                                                    stackOut_159_1 = stackIn_159_1;
                                                    stackIn_162_0 = stackOut_159_0;
                                                    stackIn_162_1 = stackOut_159_1;
                                                    stackIn_160_0 = stackOut_159_0;
                                                    stackIn_160_1 = stackOut_159_1;
                                                    if (stackIn_159_2 >= stackIn_159_3) {
                                                      stackOut_162_0 = (String[]) (Object) stackIn_162_0;
                                                      stackOut_162_1 = stackIn_162_1;
                                                      stackOut_162_2 = "";
                                                      stackIn_163_0 = stackOut_162_0;
                                                      stackIn_163_1 = stackOut_162_1;
                                                      stackIn_163_2 = stackOut_162_2;
                                                      break L63;
                                                    } else {
                                                      stackOut_160_0 = (String[]) (Object) stackIn_160_0;
                                                      stackOut_160_1 = stackIn_160_1;
                                                      stackOut_160_2 = gp.field_v[var8];
                                                      stackIn_163_0 = stackOut_160_0;
                                                      stackIn_163_1 = stackOut_160_1;
                                                      stackIn_163_2 = stackOut_160_2;
                                                      break L63;
                                                    }
                                                  }
                                                  stackIn_163_0[stackIn_163_1] = stackIn_163_2;
                                                  var8++;
                                                  if (var9 == 0) {
                                                    if (var8 >= var6) {
                                                      break L60;
                                                    } else {
                                                      stackOut_156_0 = ne.field_g;
                                                      stackIn_183_0 = stackOut_156_0;
                                                      stackIn_157_0 = stackOut_156_0;
                                                      if (var9 != 0) {
                                                        break L7;
                                                      } else {
                                                        stackOut_157_0 = (String[]) (Object) stackIn_157_0;
                                                        stackOut_157_1 = var5 + (7 + var8);
                                                        stackOut_157_2 = ~gp.field_v.length;
                                                        stackOut_157_3 = ~var8;
                                                        stackIn_159_0 = stackOut_157_0;
                                                        stackIn_159_1 = stackOut_157_1;
                                                        stackIn_159_2 = stackOut_157_2;
                                                        stackIn_159_3 = stackOut_157_3;
                                                        continue L62;
                                                      }
                                                    }
                                                  } else {
                                                    break L60;
                                                  }
                                                }
                                              } else {
                                                L64: {
                                                  stackOut_147_0 = (String[]) (Object) stackIn_147_0;
                                                  stackOut_147_1 = stackIn_147_1;
                                                  stackIn_152_0 = stackOut_147_0;
                                                  stackIn_152_1 = stackOut_147_1;
                                                  stackIn_148_0 = stackOut_147_0;
                                                  stackIn_148_1 = stackOut_147_1;
                                                  if (stackIn_147_2 > stackIn_147_3) {
                                                    stackOut_152_0 = (String[]) (Object) stackIn_152_0;
                                                    stackOut_152_1 = stackIn_152_1;
                                                    stackOut_152_2 = "";
                                                    stackIn_153_0 = stackOut_152_0;
                                                    stackIn_153_1 = stackOut_152_1;
                                                    stackIn_153_2 = stackOut_152_2;
                                                    break L64;
                                                  } else {
                                                    stackOut_148_0 = (String[]) (Object) stackIn_148_0;
                                                    stackOut_148_1 = stackIn_148_1;
                                                    stackIn_150_0 = stackOut_148_0;
                                                    stackIn_150_1 = stackOut_148_1;
                                                    stackOut_150_0 = (String[]) (Object) stackIn_150_0;
                                                    stackOut_150_1 = stackIn_150_1;
                                                    stackOut_150_2 = cn.field_z[-var5 + (var8 - -cn.field_z.length)];
                                                    stackIn_153_0 = stackOut_150_0;
                                                    stackIn_153_1 = stackOut_150_1;
                                                    stackIn_153_2 = stackOut_150_2;
                                                    break L64;
                                                  }
                                                }
                                                stackIn_153_0[stackIn_153_1] = stackIn_153_2;
                                                var8++;
                                                if (var9 == 0) {
                                                  continue L59;
                                                } else {
                                                  break L61;
                                                }
                                              }
                                            }
                                          }
                                          ne.field_g[6 + var5] = null;
                                          rn.field_a[var5 + 6] = -2;
                                          var8 = 0;
                                          L65: while (true) {
                                            if (var8 >= var6) {
                                              break L60;
                                            } else {
                                              stackOut_156_0 = ne.field_g;
                                              stackIn_183_0 = stackOut_156_0;
                                              stackIn_157_0 = stackOut_156_0;
                                              if (var9 != 0) {
                                                break L7;
                                              } else {
                                                stackOut_157_0 = (String[]) (Object) stackIn_157_0;
                                                stackOut_157_1 = var5 + (7 + var8);
                                                stackOut_157_2 = ~gp.field_v.length;
                                                stackOut_157_3 = ~var8;
                                                stackIn_159_0 = stackOut_157_0;
                                                stackIn_159_1 = stackOut_157_1;
                                                stackIn_159_2 = stackOut_157_2;
                                                stackIn_159_3 = stackOut_157_3;
                                                L66: {
                                                  stackOut_159_0 = (String[]) (Object) stackIn_159_0;
                                                  stackOut_159_1 = stackIn_159_1;
                                                  stackIn_162_0 = stackOut_159_0;
                                                  stackIn_162_1 = stackOut_159_1;
                                                  stackIn_160_0 = stackOut_159_0;
                                                  stackIn_160_1 = stackOut_159_1;
                                                  if (stackIn_159_2 >= stackIn_159_3) {
                                                    stackOut_162_0 = (String[]) (Object) stackIn_162_0;
                                                    stackOut_162_1 = stackIn_162_1;
                                                    stackOut_162_2 = "";
                                                    stackIn_163_0 = stackOut_162_0;
                                                    stackIn_163_1 = stackOut_162_1;
                                                    stackIn_163_2 = stackOut_162_2;
                                                    break L66;
                                                  } else {
                                                    stackOut_160_0 = (String[]) (Object) stackIn_160_0;
                                                    stackOut_160_1 = stackIn_160_1;
                                                    stackOut_160_2 = gp.field_v[var8];
                                                    stackIn_163_0 = stackOut_160_0;
                                                    stackIn_163_1 = stackOut_160_1;
                                                    stackIn_163_2 = stackOut_160_2;
                                                    break L66;
                                                  }
                                                }
                                                stackIn_163_0[stackIn_163_1] = stackIn_163_2;
                                                var8++;
                                                if (var9 == 0) {
                                                  continue L65;
                                                } else {
                                                  break L60;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        rb.field_e = kh.a(-115);
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              } else {
                                throw new IllegalStateException();
                              }
                            }
                          }
                          pr.field_b.field_c = rm.field_g.length;
                          if (param0 == -119) {
                            var3_int = 0;
                            var4 = 0;
                            L67: while (true) {
                              L68: {
                                if (~var4 <= ~ne.field_g.length) {
                                  break L68;
                                } else {
                                  stackOut_169_0 = 1;
                                  stackOut_169_1 = ne.field_g;
                                  stackIn_205_0 = stackOut_169_0;
                                  stackIn_205_1 = stackOut_169_1;
                                  stackIn_170_0 = stackOut_169_0;
                                  stackIn_170_1 = stackOut_169_1;
                                  if (var9 != 0) {
                                    L69: while (true) {
                                      if (stackIn_205_0 <= ~stackIn_205_1.length) {
                                        break L3;
                                      } else {
                                        stackOut_206_0 = ro.field_q;
                                        stackOut_206_1 = 0;
                                        stackOut_206_2 = rn.field_a[var4];
                                        stackIn_218_0 = stackOut_206_0;
                                        stackIn_218_1 = stackOut_206_1;
                                        stackIn_218_2 = stackOut_206_2;
                                        stackIn_207_0 = stackOut_206_0;
                                        stackIn_207_1 = stackOut_206_1;
                                        stackIn_207_2 = stackOut_206_2;
                                        if (var9 != 0) {
                                          break L4;
                                        } else {
                                          stackOut_207_0 = stackIn_207_0;
                                          stackOut_207_1 = stackIn_207_1;
                                          stackOut_207_2 = stackIn_207_2;
                                          stackIn_209_0 = stackOut_207_0;
                                          stackIn_209_1 = stackOut_207_1;
                                          stackIn_209_2 = stackOut_207_2;
                                          L70: {
                                            stackOut_209_0 = stackIn_209_0;
                                            stackIn_214_0 = stackOut_209_0;
                                            stackIn_210_0 = stackOut_209_0;
                                            if (stackIn_209_1 > stackIn_209_2) {
                                              stackOut_214_0 = stackIn_214_0;
                                              stackOut_214_1 = ce.field_u;
                                              stackIn_215_0 = stackOut_214_0;
                                              stackIn_215_1 = stackOut_214_1;
                                              break L70;
                                            } else {
                                              stackOut_210_0 = stackIn_210_0;
                                              stackIn_212_0 = stackOut_210_0;
                                              stackOut_212_0 = stackIn_212_0;
                                              stackOut_212_1 = lp.field_h;
                                              stackIn_215_0 = stackOut_212_0;
                                              stackIn_215_1 = stackOut_212_1;
                                              break L70;
                                            }
                                          }
                                          ro.field_q = stackIn_215_0 + stackIn_215_1;
                                          var4++;
                                          if (var9 == 0) {
                                            stackOut_204_0 = ~var4;
                                            stackOut_204_1 = ne.field_g;
                                            stackIn_205_0 = stackOut_204_0;
                                            stackIn_205_1 = stackOut_204_1;
                                            continue L69;
                                          } else {
                                            break L3;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L71: {
                                      stackOut_170_0 = stackIn_170_0;
                                      stackOut_170_1 = stackIn_170_1[var4];
                                      stackIn_175_0 = stackOut_170_0;
                                      stackIn_175_1 = stackOut_170_1;
                                      stackIn_171_0 = stackOut_170_0;
                                      stackIn_171_1 = stackOut_170_1;
                                      if (rn.field_a[var4] < 0) {
                                        stackOut_175_0 = stackIn_175_0;
                                        stackOut_175_1 = (String) (Object) stackIn_175_1;
                                        stackOut_175_2 = 0;
                                        stackIn_176_0 = stackOut_175_0;
                                        stackIn_176_1 = stackOut_175_1;
                                        stackIn_176_2 = stackOut_175_2;
                                        break L71;
                                      } else {
                                        stackOut_171_0 = stackIn_171_0;
                                        stackOut_171_1 = (String) (Object) stackIn_171_1;
                                        stackIn_173_0 = stackOut_171_0;
                                        stackIn_173_1 = stackOut_171_1;
                                        stackOut_173_0 = stackIn_173_0;
                                        stackOut_173_1 = (String) (Object) stackIn_173_1;
                                        stackOut_173_2 = 1;
                                        stackIn_176_0 = stackOut_173_0;
                                        stackIn_176_1 = stackOut_173_1;
                                        stackIn_176_2 = stackOut_173_2;
                                        break L71;
                                      }
                                    }
                                    L72: {
                                      var5 = kp.a(stackIn_176_0 != 0, stackIn_176_1, stackIn_176_2 != 0);
                                      if (var3_int >= var5) {
                                        break L72;
                                      } else {
                                        var3_int = var5;
                                        break L72;
                                      }
                                    }
                                    var4++;
                                    if (var9 == 0) {
                                      continue L67;
                                    } else {
                                      break L68;
                                    }
                                  }
                                }
                              }
                              if (ol.field_c == 2) {
                                stackOut_182_0 = es.field_a;
                                stackIn_183_0 = stackOut_182_0;
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                        var4_ref_String__ = stackIn_183_0;
                        var5 = 0;
                        L73: while (true) {
                          L74: {
                            if (~var5 <= ~var4_ref_String__.length) {
                              break L74;
                            } else {
                              var6_ref_String = var4_ref_String__[var5];
                              var7 = kp.a(true, var6_ref_String, false);
                              stackOut_185_0 = ~var7;
                              stackOut_185_1 = ~var3_int;
                              stackIn_194_0 = stackOut_185_0;
                              stackIn_194_1 = stackOut_185_1;
                              stackIn_186_0 = stackOut_185_0;
                              stackIn_186_1 = stackOut_185_1;
                              if (var9 != 0) {
                                L75: while (true) {
                                  if (stackIn_194_0 >= stackIn_194_1) {
                                    break L6;
                                  } else {
                                    var6_ref_String = var4_ref_String__[var5];
                                    var7 = kp.a(true, var6_ref_String, false);
                                    stackOut_195_0 = var7;
                                    stackOut_195_1 = var3_int;
                                    stackIn_203_0 = stackOut_195_0;
                                    stackIn_203_1 = stackOut_195_1;
                                    stackIn_196_0 = stackOut_195_0;
                                    stackIn_196_1 = stackOut_195_1;
                                    if (var9 != 0) {
                                      break L5;
                                    } else {
                                      L76: {
                                        if (stackIn_196_0 > stackIn_196_1) {
                                          var3_int = var7;
                                          break L76;
                                        } else {
                                          break L76;
                                        }
                                      }
                                      var5++;
                                      if (var9 == 0) {
                                        stackOut_193_0 = var5;
                                        stackOut_193_1 = var4_ref_String__.length;
                                        stackIn_194_0 = stackOut_193_0;
                                        stackIn_194_1 = stackOut_193_1;
                                        continue L75;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L77: {
                                  if (stackIn_186_0 < stackIn_186_1) {
                                    var3_int = var7;
                                    break L77;
                                  } else {
                                    break L77;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L73;
                                } else {
                                  break L74;
                                }
                              }
                            }
                          }
                          var4_ref_String__ = cc.field_b;
                          var5 = 0;
                          L78: while (true) {
                            stackOut_193_0 = var5;
                            stackOut_193_1 = var4_ref_String__.length;
                            stackIn_194_0 = stackOut_193_0;
                            stackIn_194_1 = stackOut_193_1;
                            if (stackIn_194_0 >= stackIn_194_1) {
                              break L6;
                            } else {
                              var6_ref_String = var4_ref_String__[var5];
                              var7 = kp.a(true, var6_ref_String, false);
                              stackOut_195_0 = var7;
                              stackOut_195_1 = var3_int;
                              stackIn_203_0 = stackOut_195_0;
                              stackIn_203_1 = stackOut_195_1;
                              stackIn_196_0 = stackOut_195_0;
                              stackIn_196_1 = stackOut_195_1;
                              if (var9 != 0) {
                                break L5;
                              } else {
                                L79: {
                                  if (stackIn_196_0 > stackIn_196_1) {
                                    var3_int = var7;
                                    break L79;
                                  } else {
                                    break L79;
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L78;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                      ac.field_c = ri.field_a + -(var3_int >> 1970386817);
                      ro.field_q = (pp.field_a + as.field_c << 1556578945) * pr.field_b.field_c;
                      stackOut_202_0 = -(var3_int >> 1637743777);
                      stackOut_202_1 = ri.field_a + var3_int;
                      stackIn_203_0 = stackOut_202_0;
                      stackIn_203_1 = stackOut_202_1;
                      break L5;
                    }
                    je.field_a = stackIn_203_0 + stackIn_203_1;
                    var4 = 0;
                    L80: while (true) {
                      stackOut_204_0 = ~var4;
                      stackOut_204_1 = ne.field_g;
                      stackIn_205_0 = stackOut_204_0;
                      stackIn_205_1 = stackOut_204_1;
                      if (stackIn_205_0 <= ~stackIn_205_1.length) {
                        break L3;
                      } else {
                        stackOut_206_0 = ro.field_q;
                        stackOut_206_1 = 0;
                        stackOut_206_2 = rn.field_a[var4];
                        stackIn_218_0 = stackOut_206_0;
                        stackIn_218_1 = stackOut_206_1;
                        stackIn_218_2 = stackOut_206_2;
                        stackIn_207_0 = stackOut_206_0;
                        stackIn_207_1 = stackOut_206_1;
                        stackIn_207_2 = stackOut_206_2;
                        if (var9 != 0) {
                          break L4;
                        } else {
                          stackOut_207_0 = stackIn_207_0;
                          stackOut_207_1 = stackIn_207_1;
                          stackOut_207_2 = stackIn_207_2;
                          stackIn_209_0 = stackOut_207_0;
                          stackIn_209_1 = stackOut_207_1;
                          stackIn_209_2 = stackOut_207_2;
                          L81: {
                            stackOut_209_0 = stackIn_209_0;
                            stackIn_214_0 = stackOut_209_0;
                            stackIn_210_0 = stackOut_209_0;
                            if (stackIn_209_1 > stackIn_209_2) {
                              stackOut_214_0 = stackIn_214_0;
                              stackOut_214_1 = ce.field_u;
                              stackIn_215_0 = stackOut_214_0;
                              stackIn_215_1 = stackOut_214_1;
                              break L81;
                            } else {
                              stackOut_210_0 = stackIn_210_0;
                              stackIn_212_0 = stackOut_210_0;
                              stackOut_212_0 = stackIn_212_0;
                              stackOut_212_1 = lp.field_h;
                              stackIn_215_0 = stackOut_212_0;
                              stackIn_215_1 = stackOut_212_1;
                              break L81;
                            }
                          }
                          ro.field_q = stackIn_215_0 + stackIn_215_1;
                          var4++;
                          if (var9 == 0) {
                            continue L80;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L82: while (true) {
                    if (stackIn_218_0 >= (stackIn_218_1 ^ stackIn_218_2)) {
                      break L2;
                    } else {
                      var6 = rn.field_a[var4];
                      stackOut_219_0 = var6;
                      stackIn_227_0 = stackOut_219_0;
                      stackIn_220_0 = stackOut_219_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L83: {
                          L84: {
                            if (stackIn_220_0 >= 0) {
                              break L84;
                            } else {
                              var5 = var5 + ce.field_u;
                              if (var9 == 0) {
                                break L83;
                              } else {
                                break L84;
                              }
                            }
                          }
                          var7 = kp.a(true, ne.field_g[var4], true);
                          var8 = -(var7 >> 631150049) + ri.field_a;
                          var5 = var5 + pp.field_a;
                          nb.field_b[var4] = new int[4];
                          nb.field_b[var4][0] = var8 - ud.field_g;
                          nb.field_b[var4][1] = var5;
                          nb.field_b[var4][2] = var7 + (ud.field_g << 44828897);
                          var5 = var5 + (lp.field_h + (as.field_c << -1480950047) + pp.field_a);
                          nb.field_b[var4][3] = lp.field_h - -(as.field_c << 1722033569);
                          break L83;
                        }
                        var4++;
                        if (var9 == 0) {
                          stackOut_217_0 = ~ne.field_g.length;
                          stackOut_217_1 = var4;
                          stackOut_217_2 = -1;
                          stackIn_218_0 = stackOut_217_0;
                          stackIn_218_1 = stackOut_217_1;
                          stackIn_218_2 = stackOut_217_2;
                          continue L82;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                pt.field_a = -(ro.field_q >> -1638816255) + md.field_o;
                nb.field_b = new int[ne.field_g.length][];
                var4 = 0;
                var5 = pt.field_a;
                L85: while (true) {
                  stackOut_217_0 = ~ne.field_g.length;
                  stackOut_217_1 = var4;
                  stackOut_217_2 = -1;
                  stackIn_218_0 = stackOut_217_0;
                  stackIn_218_1 = stackOut_217_1;
                  stackIn_218_2 = stackOut_217_2;
                  if (stackIn_218_0 >= (stackIn_218_1 ^ stackIn_218_2)) {
                    break L2;
                  } else {
                    var6 = rn.field_a[var4];
                    stackOut_219_0 = var6;
                    stackIn_227_0 = stackOut_219_0;
                    stackIn_220_0 = stackOut_219_0;
                    if (var9 != 0) {
                      break L1;
                    } else {
                      L86: {
                        L87: {
                          if (stackIn_220_0 >= 0) {
                            break L87;
                          } else {
                            var5 = var5 + ce.field_u;
                            if (var9 == 0) {
                              break L86;
                            } else {
                              break L87;
                            }
                          }
                        }
                        var7 = kp.a(true, ne.field_g[var4], true);
                        var8 = -(var7 >> 631150049) + ri.field_a;
                        var5 = var5 + pp.field_a;
                        nb.field_b[var4] = new int[4];
                        nb.field_b[var4][0] = var8 - ud.field_g;
                        nb.field_b[var4][1] = var5;
                        nb.field_b[var4][2] = var7 + (ud.field_g << 44828897);
                        var5 = var5 + (lp.field_h + (as.field_c << -1480950047) + pp.field_a);
                        nb.field_b[var4][3] = lp.field_h - -(as.field_c << 1722033569);
                        break L86;
                      }
                      var4++;
                      if (var9 == 0) {
                        continue L85;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_226_0 = ol.field_c;
              stackIn_227_0 = stackOut_226_0;
              break L1;
            }
            L88: {
              L89: {
                if (stackIn_227_0 == 2) {
                  break L89;
                } else {
                  pr.field_b.a(param2, rc.b((byte) -80, ic.field_b, cf.field_g), 0, 0);
                  if (var9 == 0) {
                    break L88;
                  } else {
                    break L89;
                  }
                }
              }
              pr.field_b.a(param2, -1, 0, -1);
              break L88;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4_int = 104 % ((param1 - 5) / 54);
            var5 = 90 + dp.field_h.a((byte) 94, param2);
            this.a(82, pk.field_wb.a((byte) 75), -(var5 >> -282139487) + 320, var5, param0 + 26, 60, 1442840524);
            kn.field_a.a(111, -12046068, -1, 67 + param0, 320, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("nk.V(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void a(int param0, ha param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        bo var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            mb.field_u[0].a(param4, param0);
            mb.field_u[2].a(-mb.field_u[2].d() + (param4 + param3), param0);
            var6 = fa.a(param1, true);
            param3 = param4 - -param3 + -mb.field_u[2].d();
            param4 = param4 + mb.field_u[0].d();
            var6.a(param3, param4, param0 - -mb.field_u[2].c(), param0, 120);
            L1: while (true) {
              L2: {
                L3: {
                  if (param4 >= param3) {
                    break L3;
                  } else {
                    mb.field_u[1].a(param4, param0);
                    param4 = param4 + mb.field_u[1].d();
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6.a(true);
                break L2;
              }
              var7 = -128 % ((param2 - -32) / 50);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("nk.E(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    nk(int param0) {
        ((nk) this).field_c = -1;
        ((nk) this).field_e = -1;
        try {
            ((nk) this).field_d = param0;
            ((nk) this).field_i = new gr(ua.field_l[param0].length);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "nk.<init>(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((nk) this).field_d != 2) {
                break L1;
              } else {
                if (cn.b(true)) {
                  break L1;
                } else {
                  L2: {
                    if (kh.field_a) {
                      break L2;
                    } else {
                      if (ln.field_d < 2) {
                        L3: {
                          if (bk.field_f == 96) {
                            L4: {
                              L5: {
                                if (((nk) this).field_i.field_g < 0) {
                                  break L5;
                                } else {
                                  if (((nk) this).field_i.field_g != 4) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              ((nk) this).field_i.a((byte) -101, 0);
                              if (var3 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (((nk) this).field_i.field_g == 0) {
                                break L6;
                              } else {
                                if (((nk) this).field_i.field_g != 4) {
                                  ((nk) this).field_i.a((byte) -125, ((nk) this).field_i.field_g + -1);
                                  if (var3 == 0) {
                                    break L3;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            ((nk) this).field_i.a((byte) -102, 2);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L7: {
                          if (bk.field_f == 97) {
                            L8: {
                              if (((nk) this).field_i.field_g < 0) {
                                break L8;
                              } else {
                                if (((nk) this).field_i.field_g == 4) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (((nk) this).field_i.field_g < 2) {
                                      break L9;
                                    } else {
                                      if (((nk) this).field_i.field_g != 2) {
                                        break L7;
                                      } else {
                                        ((nk) this).field_i.a((byte) -102, 0);
                                        if (var3 == 0) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  ((nk) this).field_i.a((byte) -100, 1 + ((nk) this).field_i.field_g);
                                  if (var3 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            ((nk) this).field_i.a((byte) -128, 2);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L10: {
                          if (99 != bk.field_f) {
                            break L10;
                          } else {
                            L11: {
                              L12: {
                                if (0 > ((nk) this).field_i.field_g) {
                                  break L12;
                                } else {
                                  if (((nk) this).field_i.field_g <= 2) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              ((nk) this).field_i.a((byte) -122, oc.field_e);
                              if (var3 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                            ((nk) this).field_i.a((byte) -119, 4);
                            break L10;
                          }
                        }
                        L13: {
                          if (bk.field_f != 98) {
                            break L13;
                          } else {
                            L14: {
                              if (((nk) this).field_i.field_g == 4) {
                                break L14;
                              } else {
                                ((nk) this).field_i.a((byte) -100, 4);
                                if (var3 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            ((nk) this).field_i.a((byte) -108, oc.field_e);
                            break L13;
                          }
                        }
                        ((nk) this).field_i.d((byte) 126);
                        return;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L15: {
                    if (bk.field_f == 96) {
                      L16: {
                        if (((nk) this).field_i.field_g < 0) {
                          break L16;
                        } else {
                          ((nk) this).field_i.a((byte) -101, qg.a((byte) -60, 3, ((nk) this).field_i.field_g + -1) + ((nk) this).field_i.field_g / 3 * 3);
                          if (var3 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      ((nk) this).field_i.a((byte) -117, 3);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L17: {
                    if (bk.field_f != 97) {
                      break L17;
                    } else {
                      L18: {
                        if (((nk) this).field_i.field_g < 0) {
                          ((nk) this).field_i.a((byte) -114, 5);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (((nk) this).field_i.field_g < 0) {
                          ((nk) this).field_i.a((byte) -107, 4);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      ((nk) this).field_i.a((byte) -126, qg.a((byte) -98, 3, 1 + ((nk) this).field_i.field_g) + ((nk) this).field_i.field_g / 3 * 3);
                      break L17;
                    }
                  }
                  L20: {
                    if (99 == bk.field_f) {
                      L21: {
                        if (((nk) this).field_i.field_g >= 0) {
                          break L21;
                        } else {
                          ((nk) this).field_i.a((byte) -99, 1);
                          break L21;
                        }
                      }
                      L22: {
                        if (((nk) this).field_i.field_g < 0) {
                          ((nk) this).field_i.a((byte) -121, 4);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      ((nk) this).field_i.a((byte) -113, qg.a((byte) 118, 6, ((nk) this).field_i.field_g + 3));
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L23: {
                    if (bk.field_f != 98) {
                      break L23;
                    } else {
                      L24: {
                        if (0 > ((nk) this).field_i.field_g) {
                          ((nk) this).field_i.a((byte) -121, 4);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (((nk) this).field_i.field_g < 0) {
                          ((nk) this).field_i.a((byte) -100, 4);
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      ((nk) this).field_i.a((byte) -101, qg.a((byte) -78, 6, -3 + ((nk) this).field_i.field_g));
                      break L23;
                    }
                  }
                  ((nk) this).field_i.d((byte) 124);
                  return;
                }
              }
            }
            if (((nk) this).field_d == 3) {
              L26: {
                L27: {
                  ((nk) this).field_i.c((byte) -74);
                  if (bk.field_f == 96) {
                    break L27;
                  } else {
                    if (bk.field_f != 97) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                L28: while (true) {
                  if (this.a(((nk) this).field_i.field_g, (byte) -17)) {
                    break L26;
                  } else {
                    ((nk) this).field_i.c((byte) -85);
                    if (var3 == 0) {
                      continue L28;
                    } else {
                      break L26;
                    }
                  }
                }
              }
              return;
            } else {
              L29: {
                ((nk) this).field_i.a(true);
                if (param0 == 4146) {
                  break L29;
                } else {
                  int discarded$1 = this.a(-33, 41);
                  break L29;
                }
              }
              L30: {
                L31: {
                  L32: {
                    if (bk.field_f == 98) {
                      break L32;
                    } else {
                      if (bk.field_f == 99) {
                        break L32;
                      } else {
                        break L31;
                      }
                    }
                  }
                  L33: while (true) {
                    if (this.a(((nk) this).field_i.field_g, (byte) -17)) {
                      break L31;
                    } else {
                      ((nk) this).field_i.a(true);
                      if (var3 != 0) {
                        break L30;
                      } else {
                        if (var3 == 0) {
                          continue L33;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                }
                break L30;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "nk.U(" + param0 + ')');
        }
    }

    private final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (((nk) this).field_d != 2) {
                break L1;
              } else {
                if (cn.b(true)) {
                  break L1;
                } else {
                  stackOut_4_0 = 180 + this.a(param1, 200);
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            L2: {
              if (((nk) this).field_d != 2) {
                break L2;
              } else {
                if (cn.b(true)) {
                  stackOut_12_0 = 100 + ak.field_f[((nk) this).field_d];
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  break L2;
                }
              }
            }
            if (((nk) this).field_d != 3) {
              L3: {
                if (param0 > 108) {
                  break L3;
                } else {
                  this.a(31, -24, -94, false, (ha) null);
                  break L3;
                }
              }
              L4: {
                if (((nk) this).field_d == 4) {
                  break L4;
                } else {
                  if (5 != ((nk) this).field_d) {
                    stackOut_26_0 = ak.field_f[((nk) this).field_d];
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_24_0 = this.a(param1, 200) - -400;
              stackIn_25_0 = stackOut_24_0;
              return stackIn_25_0;
            } else {
              stackOut_15_0 = this.a(param1, 200) - -200;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "nk.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = new kp();
    }
}
