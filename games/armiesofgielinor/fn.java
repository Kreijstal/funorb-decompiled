/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fn extends fw {
    static int field_M;
    private int field_O;
    private int field_L;
    static int[] field_Q;
    private int field_V;
    private long field_T;
    private int field_R;
    private long field_U;
    private boolean field_P;
    static String field_S;
    private boolean field_N;

    private final String o(int param0) {
        if (param0 >= -58) {
            return null;
        }
        int var2 = ((fn) this).field_O > ((fn) this).field_L ? ((fn) this).field_L : ((fn) this).field_O;
        int var3 = ((fn) this).field_O > ((fn) this).field_L ? ((fn) this).field_O : ((fn) this).field_L;
        return ((fn) this).field_v.substring(var2, var3);
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 == ((fn) this).field_O) {
          return ((fn) this).field_O;
        } else {
          var2 = -1 + ((fn) this).field_O;
          var3 = -88 / ((param0 - 11) / 55);
          L0: while (true) {
            L1: {
              if (0 >= var2) {
                break L1;
              } else {
                if (((fn) this).field_v.charAt(var2 + -1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        }
    }

    private final void b(boolean param0) {
        this.a((byte) -53);
        this.j(1000);
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((fn) this).field_L != ((fn) this).field_O) {
            var2 = ((fn) this).field_O > ((fn) this).field_L ? ((fn) this).field_L : ((fn) this).field_O;
            var3 = ((fn) this).field_O <= ((fn) this).field_L ? ((fn) this).field_L : ((fn) this).field_O;
            ((fn) this).field_L = var2;
            ((fn) this).field_O = var2;
            ((fn) this).field_v = ((fn) this).field_v.substring(0, var2) + ((fn) this).field_v.substring(var3, ((fn) this).field_v.length());
            ((fn) this).d((byte) -123);
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        RuntimeException runtimeException = null;
        pm var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.l(param0 + -32722);
              if (1 != ((fn) this).field_q) {
                break L1;
              } else {
                L2: {
                  if (((fn) this).field_k instanceof pm) {
                    var5 = (pm) (Object) ((fn) this).field_k;
                    var6 = var5.a((kb) this, sm.field_d, 113, param2, ko.field_b, param1);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((fn) this).field_P) {
                          break L3;
                        } else {
                          if (((fn) this).field_V <= var6) {
                            break L3;
                          } else {
                            if (var6 <= ((fn) this).field_L) {
                              break L3;
                            } else {
                              var6 = ((fn) this).field_V;
                              break L3;
                            }
                          }
                        }
                      }
                      ((fn) this).field_O = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                ((fn) this).field_U = vi.b(98);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("fn.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final void n(int param0) {
        if (((fn) this).field_x instanceof fb) {
            ((fb) (Object) ((fn) this).field_x).a((fn) this, 80);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -27934) {
                break L1;
              } else {
                field_M = -84;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                param1 = "";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((fn) this).field_v = param1;
              var4_int = param1.length();
              if (((fn) this).field_R == -1) {
                break L3;
              } else {
                if (var4_int > ((fn) this).field_R) {
                  ((fn) this).field_v = ((fn) this).field_v.substring(0, ((fn) this).field_R);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              int dupTemp$2 = ((fn) this).field_v.length();
              ((fn) this).field_L = dupTemp$2;
              ((fn) this).field_O = dupTemp$2;
              if (param0) {
                break L4;
              } else {
                ((fn) this).d((byte) -128);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("fn.H(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        js var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = "";
              if (43 != param1) {
                break L1;
              } else {
                param1 = 77;
                break L1;
              }
            }
            if (param2 == -32596) {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  L3: {
                    if (param1 != 16) {
                      break L3;
                    } else {
                      param1 = 78;
                      break L3;
                    }
                  }
                  L4: {
                    if (param1 == 25) {
                      param1 = 79;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (param1 == 48) {
                      param1 = 80;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param1 != 85) {
                    break L2;
                  } else {
                    param1 = 89;
                    break L2;
                  }
                }
              }
              L6: {
                if (param1 == 76) {
                  bn.field_a = new kk[mn.field_m[param1].length];
                  bn.field_a[0] = mn.field_k[param1][0];
                  break L6;
                } else {
                  break L6;
                }
              }
              var4 = 1;
              L7: while (true) {
                L8: {
                  if (~var4 <= ~mn.field_m[param1].length) {
                    break L8;
                  } else {
                    if (null != mn.field_k[param1][var4]) {
                      break L8;
                    } else {
                      L9: {
                        var5 = mn.field_m[param1][var4];
                        var6 = hs.a(var5, param2 ^ -32697, var9);
                        if (var6 == null) {
                          break L9;
                        } else {
                          L10: {
                            if (th.a(var6, -17900)) {
                              nh.field_D[param1] = true;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (null != var6.field_p) {
                              var7 = 0;
                              L12: while (true) {
                                if (var7 >= var6.field_O) {
                                  break L11;
                                } else {
                                  L13: {
                                    if (var6.field_p[var7] == 2) {
                                      var6.field_q[var7] = 0;
                                      var6.field_o[var7] = 0;
                                      var6.field_r[var7] = 0;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var7++;
                                  continue L12;
                                }
                              }
                            } else {
                              break L11;
                            }
                          }
                          L14: {
                            mn.field_k[param1][var4] = var6.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
                            if (param1 == 76) {
                              bn.field_a[var4] = mn.field_k[param1][var4];
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          if (0 != ((gd) (Object) mn.field_k[param1][var4]).field_I) {
                            break L9;
                          } else {
                            mn.field_k[param1] = null;
                            break L9;
                          }
                        }
                      }
                      var4++;
                      continue L7;
                    }
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
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "fn.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_76_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_38_0 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        try {
          L0: {
            ((fn) this).field_U = vi.b(-82);
            if (param3 == -12215) {
              L1: {
                if (param2 == 60) {
                  break L1;
                } else {
                  if (param2 == 62) {
                    break L1;
                  } else {
                    L2: {
                      if (param2 < 32) {
                        break L2;
                      } else {
                        if (param2 <= 126) {
                          L3: {
                            if (((fn) this).field_O == ((fn) this).field_L) {
                              break L3;
                            } else {
                              this.j(1000);
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (((fn) this).field_R == -1) {
                                break L5;
                              } else {
                                if (((fn) this).field_v.length() >= ((fn) this).field_R) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (((fn) this).field_O >= ((fn) this).field_v.length()) {
                                ((fn) this).field_v = ((fn) this).field_v + param2;
                                int dupTemp$1 = ((fn) this).field_v.length();
                                ((fn) this).field_O = dupTemp$1;
                                ((fn) this).field_L = dupTemp$1;
                                break L6;
                              } else {
                                ((fn) this).field_v = ((fn) this).field_v.substring(0, ((fn) this).field_O) + param2 + ((fn) this).field_v.substring(((fn) this).field_O, ((fn) this).field_v.length());
                                ((fn) this).field_O = ((fn) this).field_O + 1;
                                ((fn) this).field_L = ((fn) this).field_O;
                                break L6;
                              }
                            }
                            ((fn) this).d((byte) -123);
                            break L4;
                          }
                          stackOut_76_0 = 1;
                          stackIn_77_0 = stackOut_76_0;
                          return stackIn_77_0 != 0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (85 != param1) {
                      L7: {
                        if (param1 == 101) {
                          if (((fn) this).field_L == ((fn) this).field_O) {
                            if (((fn) this).field_O >= ((fn) this).field_v.length()) {
                              break L7;
                            } else {
                              ((fn) this).field_L = 1 + ((fn) this).field_O;
                              this.j(1000);
                              stackOut_65_0 = 1;
                              stackIn_66_0 = stackOut_65_0;
                              return stackIn_66_0 != 0;
                            }
                          } else {
                            this.j(1000);
                            stackOut_62_0 = 1;
                            stackIn_63_0 = stackOut_62_0;
                            return stackIn_63_0 != 0;
                          }
                        } else {
                          if (param1 == 13) {
                            ((fn) this).k(98);
                            stackOut_59_0 = 1;
                            stackIn_60_0 = stackOut_59_0;
                            return stackIn_60_0 != 0;
                          } else {
                            if (param1 != 96) {
                              if (param1 != 97) {
                                if (param1 == 102) {
                                  this.a(0, (byte) -59);
                                  stackOut_57_0 = 1;
                                  stackIn_58_0 = stackOut_57_0;
                                  return stackIn_58_0 != 0;
                                } else {
                                  if (103 != param1) {
                                    if (param1 != 84) {
                                      L8: {
                                        if (!br.field_f[82]) {
                                          break L8;
                                        } else {
                                          if (param1 != 65) {
                                            break L8;
                                          } else {
                                            this.b(true);
                                            stackOut_45_0 = 1;
                                            stackIn_46_0 = stackOut_45_0;
                                            return stackIn_46_0 != 0;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (!br.field_f[82]) {
                                          break L9;
                                        } else {
                                          if (param1 == 66) {
                                            this.a((byte) -53);
                                            stackOut_55_0 = 1;
                                            stackIn_56_0 = stackOut_55_0;
                                            return stackIn_56_0 != 0;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (!br.field_f[82]) {
                                        break L7;
                                      } else {
                                        if (67 == param1) {
                                          this.f((byte) -104);
                                          stackOut_53_0 = 1;
                                          stackIn_54_0 = stackOut_53_0;
                                          return stackIn_54_0 != 0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    } else {
                                      this.n(-92);
                                      stackOut_41_0 = 1;
                                      stackIn_42_0 = stackOut_41_0;
                                      return stackIn_42_0 != 0;
                                    }
                                  } else {
                                    this.a(((fn) this).field_v.length(), (byte) -59);
                                    stackOut_38_0 = 1;
                                    stackIn_39_0 = stackOut_38_0;
                                    return stackIn_39_0 != 0;
                                  }
                                }
                              } else {
                                if (((fn) this).field_O >= ((fn) this).field_v.length()) {
                                  break L7;
                                } else {
                                  L10: {
                                    stackOut_31_0 = this;
                                    stackIn_33_0 = stackOut_31_0;
                                    stackIn_32_0 = stackOut_31_0;
                                    if (!br.field_f[82]) {
                                      stackOut_33_0 = this;
                                      stackOut_33_1 = ((fn) this).field_O - -1;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      break L10;
                                    } else {
                                      stackOut_32_0 = this;
                                      stackOut_32_1 = this.p(-97);
                                      stackIn_34_0 = stackOut_32_0;
                                      stackIn_34_1 = stackOut_32_1;
                                      break L10;
                                    }
                                  }
                                  this.a(stackIn_34_1, (byte) -59);
                                  stackOut_34_0 = 1;
                                  stackIn_35_0 = stackOut_34_0;
                                  return stackIn_35_0 != 0;
                                }
                              }
                            } else {
                              if (((fn) this).field_O > 0) {
                                L11: {
                                  stackOut_24_0 = this;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_25_0 = stackOut_24_0;
                                  if (br.field_f[82]) {
                                    stackOut_26_0 = this;
                                    stackOut_26_1 = this.e((byte) 81);
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    break L11;
                                  } else {
                                    stackOut_25_0 = this;
                                    stackOut_25_1 = -1 + ((fn) this).field_O;
                                    stackIn_27_0 = stackOut_25_0;
                                    stackIn_27_1 = stackOut_25_1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_27_1, (byte) -59);
                                stackOut_27_0 = 1;
                                stackIn_28_0 = stackOut_27_0;
                                return stackIn_28_0 != 0;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      stackOut_78_0 = 0;
                      stackIn_79_0 = stackOut_78_0;
                      break L0;
                    } else {
                      if (((fn) this).field_L != ((fn) this).field_O) {
                        this.j(1000);
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        if (0 < ((fn) this).field_O) {
                          ((fn) this).field_L = -1 + ((fn) this).field_O;
                          this.j(1000);
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0 != 0;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var5;
            stackOut_80_1 = new StringBuilder().append("fn.F(");
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param0 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L12;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L12;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_79_0 != 0;
    }

    final static void a(int param0, int param1, int param2, wk param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var15 = 0;
        Object var16 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.i();
              var4_int = 0;
              var5 = param3.field_y / 2;
              if (param0 == 8678) {
                break L1;
              } else {
                var16 = null;
                fn.a(-106, -71, -114, (wk) null);
                break L1;
              }
            }
            L2: {
              var6 = param3.field_v / 2;
              if (var5 >= var6) {
                stackOut_5_0 = var6;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = var5;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            var7 = stackIn_6_0;
            var8 = 0;
            L3: while (true) {
              if (param3.field_v <= var8) {
                break L0;
              } else {
                var9 = 0;
                L4: while (true) {
                  if (param3.field_y <= var9) {
                    var8++;
                    continue L3;
                  } else {
                    L5: {
                      var10 = (int)Math.sqrt((double)((var9 - var5) * (var9 - var5) + (var8 + -var6) * (-var6 + var8)));
                      if (param2 <= var10) {
                        var10 = -(param1 * (-param2 + var10) / (-param2 + var7)) + param1;
                        break L5;
                      } else {
                        var10 = param1;
                        break L5;
                      }
                    }
                    L6: {
                      if (0 >= var10) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4_int++;
                    var9++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("fn.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    fn(String param0, qo param1, int param2) {
        super(param0, param1);
        ((fn) this).field_T = 0L;
        ((fn) this).field_P = false;
        ((fn) this).field_V = -1;
        try {
            ((fn) this).field_k = t.field_c.field_w;
            ((fn) this).field_R = param2;
            ((fn) this).a(true, param0, -27934);
            ((fn) this).field_N = true;
            ((fn) this).field_U = vi.b(-83);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        ((fn) this).field_O = 0;
        ((fn) this).field_L = 0;
        ((fn) this).field_v = "";
        int var2 = 26 % ((33 - param0) / 36);
        ((fn) this).d((byte) -126);
    }

    private final void l(int param0) {
        ju var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pm var9 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((fn) this).field_N) {
          if (((fn) this).field_k instanceof pm) {
            L0: {
              var9 = (pm) (Object) ((fn) this).field_k;
              var3 = var9.a(-100, (kb) this);
              if (param0 == 0) {
                break L0;
              } else {
                int discarded$1 = this.e((byte) -33);
                break L0;
              }
            }
            var4 = var3.a(false);
            var5 = var9.b(66, (kb) this);
            var6 = var9.a(true) >> 1;
            if (-var6 + var5 > var4) {
              ((fn) this).field_z = 0;
              ((fn) this).field_r = 0;
              return;
            } else {
              L1: {
                var7 = ((fn) this).field_r + var3.a((byte) -66, ((fn) this).field_O);
                if (var5 + -var6 < var7) {
                  ((fn) this).field_r = ((fn) this).field_r - var7 - var6 - -var5;
                  break L1;
                } else {
                  if (var7 < var6) {
                    ((fn) this).field_r = ((fn) this).field_r + (-var7 + var6);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((fn) this).field_r <= 0) {
                  if (var6 + -var5 <= ((fn) this).field_r) {
                    break L2;
                  } else {
                    ((fn) this).field_r = var6 + -var5;
                    break L2;
                  }
                } else {
                  ((fn) this).field_r = 0;
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          ((fn) this).field_r = 0;
          ((fn) this).field_z = 0;
          return;
        }
    }

    void d(byte param0) {
        if (!(!(((fn) this).field_x instanceof fb))) {
            ((fb) (Object) ((fn) this).field_x).b((fn) this, 111);
        }
        if (param0 >= -114) {
            ((fn) this).field_R = -53;
        }
    }

    private final void a(byte param0) {
        String var2 = this.o(-89);
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.o(-74)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, byte param1) {
        ((fn) this).field_O = param0;
        if (!br.field_f[81]) {
            ((fn) this).field_L = ((fn) this).field_O;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        int stackIn_2_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (param3 > 103) {
              if (!super.a(param0, param1, param2, 119, param4, param5, param6)) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                if (((fn) this).field_k instanceof pm) {
                  L1: {
                    var8_int = ((pm) (Object) ((fn) this).field_k).a((kb) this, sm.field_d, 87, param2, ko.field_b, param1);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var8_int != -1) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = var8_int;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L1;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L1;
                    }
                  }
                  L2: {
                    this.a(stackIn_9_1, (byte) -59);
                    var8_long = vi.b(39);
                    stackOut_9_0 = this;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (-((fn) this).field_T + var8_long >= 250L) {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L2;
                    } else {
                      stackOut_10_0 = this;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L2;
                    }
                  }
                  L3: {
                    ((fn) this).field_P = stackIn_12_1 != 0;
                    if (!((fn) this).field_P) {
                      break L3;
                    } else {
                      L4: {
                        ((fn) this).field_L = this.e((byte) -85);
                        ((fn) this).field_O = this.p(-89);
                        if (-1 <= ((fn) this).field_O) {
                          break L4;
                        } else {
                          if (-33 == ((fn) this).field_v.charAt(((fn) this).field_O + -1)) {
                            ((fn) this).field_O = ((fn) this).field_O - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((fn) this).field_V = ((fn) this).field_O;
                      break L3;
                    }
                  }
                  ((fn) this).field_T = var8_long;
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8;
            stackOut_22_1 = new StringBuilder().append("fn.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_21_0 != 0;
    }

    public static void m(int param0) {
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        pm var8 = null;
        long var6 = 0L;
        if (param2 > -82) {
            return;
        }
        if (((fn) this).field_k != null) {
            if (!(param3 != 0)) {
                ((fn) this).field_k.a((kb) this, param0, -128, ((fn) this).field_I, param1);
                if (((fn) this).field_k instanceof pm) {
                    var8 = (pm) (Object) ((fn) this).field_k;
                    if (((fn) this).field_O != ((fn) this).field_L) {
                        var8.a(-21259, ((fn) this).field_O, ((fn) this).field_L, (kb) this, param1, param0);
                    }
                    var6 = vi.b(-126);
                    if ((var6 + -((fn) this).field_U) % 1000L < 500L) {
                        var8.a(param1, 1024, param0, (kb) this, ((fn) this).field_O);
                    }
                }
            }
        }
    }

    private final void f(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.j(1000);
                this.a(var2, (byte) -114);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (((fn) this).field_R == -1) {
                break L1;
              } else {
                var3_int = ((fn) this).field_R - ((fn) this).field_v.length();
                if (var3_int >= 0) {
                  return;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (((fn) this).field_O != ((fn) this).field_v.length()) {
                ((fn) this).field_v = ((fn) this).field_v.substring(0, ((fn) this).field_O) + param0 + ((fn) this).field_v.substring(((fn) this).field_O, ((fn) this).field_v.length());
                break L2;
              } else {
                ((fn) this).field_v = ((fn) this).field_v + param0;
                break L2;
              }
            }
            ((fn) this).field_O = ((fn) this).field_O + param0.length();
            ((fn) this).field_L = ((fn) this).field_O;
            ((fn) this).d((byte) -126);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("fn.BA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -114 + ')');
        }
    }

    private final int p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= -10) {
          var2 = ((fn) this).field_v.length();
          if (((fn) this).field_O != var2) {
            var3 = ((fn) this).field_O - -1;
            L0: while (true) {
              L1: {
                if (var3 >= var2) {
                  break L1;
                } else {
                  if (((fn) this).field_v.charAt(-1 + var3) == 32) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              return var3;
            }
          } else {
            return ((fn) this).field_O;
          }
        } else {
          return -64;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 9;
        field_Q = new int[]{-1, -1, 4, 5, -1, -1, -1, 2, 0, 1, -1, 3, 6, 6, 8, 9};
        field_S = "Sacrifice";
    }
}
