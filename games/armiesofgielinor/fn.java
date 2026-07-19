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
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= -58) {
          return (String) null;
        } else {
          L0: {
            if (this.field_O <= this.field_L) {
              stackOut_3_0 = this.field_O;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = this.field_L;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_O <= this.field_L) {
              stackOut_6_0 = this.field_L;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_O;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_v.substring(var2, var3);
        }
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 == this.field_O) {
          return this.field_O;
        } else {
          var2 = -1 + this.field_O;
          var3 = -88 / ((param0 - 11) / 55);
          L0: while (true) {
            if (0 < var2) {
              stackOut_6_0 = -33;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var4 == 0) {
                if (stackIn_8_0 != (this.field_v.charAt(var2 + -1) ^ -1)) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return stackIn_7_0;
              }
            } else {
              return var2;
            }
          }
        }
    }

    private final void b(boolean param0) {
        this.a((byte) -53);
        if (!param0) {
            this.field_V = 32;
            this.j(1000);
            return;
        }
        this.j(1000);
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 != 1000) {
          return;
        } else {
          L0: {
            if (this.field_L == this.field_O) {
              break L0;
            } else {
              L1: {
                if (this.field_O <= this.field_L) {
                  stackOut_4_0 = this.field_O;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = this.field_L;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_5_0;
                if (this.field_O > this.field_L) {
                  stackOut_7_0 = this.field_O;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = this.field_L;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              var3 = stackIn_8_0;
              this.field_L = var2;
              this.field_O = var2;
              this.field_v = this.field_v.substring(0, var2) + this.field_v.substring(var3, this.field_v.length());
              this.d((byte) -123);
              break L0;
            }
          }
          return;
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
              if (1 != this.field_q) {
                break L1;
              } else {
                L2: {
                  if (this.field_k instanceof pm) {
                    var5 = (pm) ((Object) this.field_k);
                    var6 = var5.a((kb) (this), sm.field_d, 113, param2, ko.field_b, param1);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!this.field_P) {
                          break L3;
                        } else {
                          if (this.field_V <= var6) {
                            break L3;
                          } else {
                            if (var6 <= this.field_L) {
                              break L3;
                            } else {
                              var6 = this.field_V;
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_O = var6;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                this.field_U = vi.b(98);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("fn.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final void n(int param0) {
        if (param0 >= -46) {
            return;
        }
        if (this.field_x instanceof fb) {
            ((fb) ((Object) this.field_x)).a((fn) (this), 80);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$2 = 0;
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
              this.field_v = param1;
              var4_int = param1.length();
              if (this.field_R == -1) {
                break L3;
              } else {
                if (var4_int > this.field_R) {
                  this.field_v = this.field_v.substring(0, this.field_R);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$2 = this.field_v.length();
              this.field_L = dupTemp$2;
              this.field_O = dupTemp$2;
              if (param0) {
                break L4;
              } else {
                this.d((byte) -128);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("fn.H(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
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
        int var10 = 0;
        int var11 = 0;
        int decompiledRegionSelector0 = 0;
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
                    if (-17 != (param1 ^ -1)) {
                      break L3;
                    } else {
                      param1 = 78;
                      break L3;
                    }
                  }
                  L4: {
                    if (-26 == (param1 ^ -1)) {
                      param1 = 79;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((param1 ^ -1) == -49) {
                      param1 = 80;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if ((param1 ^ -1) != -86) {
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
                  if (var4 >= mn.field_m[param1].length) {
                    break L8;
                  } else {
                    if (var8 == 0) {
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
                              L12: {
                                L13: {
                                  if (null != var6.field_p) {
                                    var7 = 0;
                                    L14: while (true) {
                                      if (var7 >= var6.field_O) {
                                        break L13;
                                      } else {
                                        var11 = var6.field_p[var7] ^ -1;
                                        var10 = -3;
                                        if (var8 != 0) {
                                          if (var10 == var11) {
                                            break L12;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          L15: {
                                            if (var10 == var11) {
                                              var6.field_q[var7] = 0;
                                              var6.field_o[var7] = 0;
                                              var6.field_r[var7] = 0;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          var7++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                                mn.field_k[param1][var4] = var6.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
                                if (param1 == 76) {
                                  break L12;
                                } else {
                                  break L11;
                                }
                              }
                              bn.field_a[var4] = mn.field_k[param1][var4];
                              break L11;
                            }
                            if (0 != ((gd) ((Object) mn.field_k[param1][var4])).field_I) {
                              break L9;
                            } else {
                              mn.field_k[param1] = null;
                              break L9;
                            }
                          }
                        }
                        var4++;
                        if (var8 == 0) {
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "fn.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int dupTemp$1 = 0;
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
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_77_0 = 0;
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
        int stackOut_79_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        try {
          L0: {
            this.field_U = vi.b(-82);
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
                            if (this.field_O == this.field_L) {
                              break L3;
                            } else {
                              this.j(1000);
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              if (this.field_R == -1) {
                                break L5;
                              } else {
                                if (this.field_v.length() >= this.field_R) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              L7: {
                                if (this.field_O >= this.field_v.length()) {
                                  break L7;
                                } else {
                                  this.field_v = this.field_v.substring(0, this.field_O) + param2 + this.field_v.substring(this.field_O, this.field_v.length());
                                  this.field_O = this.field_O + 1;
                                  this.field_L = this.field_O;
                                  if (!ArmiesOfGielinor.field_M) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              this.field_v = this.field_v + param2;
                              dupTemp$1 = this.field_v.length();
                              this.field_O = dupTemp$1;
                              this.field_L = dupTemp$1;
                              break L6;
                            }
                            this.d((byte) -123);
                            break L4;
                          }
                          stackOut_77_0 = 1;
                          stackIn_78_0 = stackOut_77_0;
                          decompiledRegionSelector0 = 15;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (85 != param1) {
                      L8: {
                        if ((param1 ^ -1) == -102) {
                          if (this.field_L == this.field_O) {
                            if (this.field_O >= this.field_v.length()) {
                              break L8;
                            } else {
                              this.field_L = 1 + this.field_O;
                              this.j(1000);
                              stackOut_65_0 = 1;
                              stackIn_66_0 = stackOut_65_0;
                              decompiledRegionSelector0 = 14;
                              break L0;
                            }
                          } else {
                            this.j(1000);
                            stackOut_62_0 = 1;
                            stackIn_63_0 = stackOut_62_0;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          }
                        } else {
                          if (param1 == 13) {
                            this.k(98);
                            stackOut_59_0 = 1;
                            stackIn_60_0 = stackOut_59_0;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          } else {
                            if ((param1 ^ -1) != -97) {
                              if (-98 != (param1 ^ -1)) {
                                if ((param1 ^ -1) == -103) {
                                  this.a(0, (byte) -59);
                                  stackOut_57_0 = 1;
                                  stackIn_58_0 = stackOut_57_0;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  if (103 != param1) {
                                    if ((param1 ^ -1) != -85) {
                                      L9: {
                                        if (!br.field_f[82]) {
                                          break L9;
                                        } else {
                                          if (param1 != 65) {
                                            break L9;
                                          } else {
                                            this.b(true);
                                            stackOut_45_0 = 1;
                                            stackIn_46_0 = stackOut_45_0;
                                            decompiledRegionSelector0 = 8;
                                            break L0;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (!br.field_f[82]) {
                                          break L10;
                                        } else {
                                          if ((param1 ^ -1) == -67) {
                                            this.a((byte) -53);
                                            stackOut_55_0 = 1;
                                            stackIn_56_0 = stackOut_55_0;
                                            decompiledRegionSelector0 = 10;
                                            break L0;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      if (!br.field_f[82]) {
                                        break L8;
                                      } else {
                                        if (67 == param1) {
                                          this.f((byte) -104);
                                          stackOut_53_0 = 1;
                                          stackIn_54_0 = stackOut_53_0;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    } else {
                                      this.n(-92);
                                      stackOut_41_0 = 1;
                                      stackIn_42_0 = stackOut_41_0;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    }
                                  } else {
                                    this.a(this.field_v.length(), (byte) -59);
                                    stackOut_38_0 = 1;
                                    stackIn_39_0 = stackOut_38_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  }
                                }
                              } else {
                                if (this.field_O >= this.field_v.length()) {
                                  break L8;
                                } else {
                                  L11: {
                                    stackOut_31_0 = this;
                                    stackIn_33_0 = stackOut_31_0;
                                    stackIn_32_0 = stackOut_31_0;
                                    if (!br.field_f[82]) {
                                      stackOut_33_0 = this;
                                      stackOut_33_1 = this.field_O - -1;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      break L11;
                                    } else {
                                      stackOut_32_0 = this;
                                      stackOut_32_1 = this.p(-97);
                                      stackIn_34_0 = stackOut_32_0;
                                      stackIn_34_1 = stackOut_32_1;
                                      break L11;
                                    }
                                  }
                                  this.a(stackIn_34_1, (byte) -59);
                                  stackOut_34_0 = 1;
                                  stackIn_35_0 = stackOut_34_0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              }
                            } else {
                              if (this.field_O > 0) {
                                L12: {
                                  stackOut_24_0 = this;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_25_0 = stackOut_24_0;
                                  if (br.field_f[82]) {
                                    stackOut_26_0 = this;
                                    stackOut_26_1 = this.e((byte) 81);
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    break L12;
                                  } else {
                                    stackOut_25_0 = this;
                                    stackOut_25_1 = -1 + this.field_O;
                                    stackIn_27_0 = stackOut_25_0;
                                    stackIn_27_1 = stackOut_25_1;
                                    break L12;
                                  }
                                }
                                this.a(stackIn_27_1, (byte) -59);
                                stackOut_27_0 = 1;
                                stackIn_28_0 = stackOut_27_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      stackOut_79_0 = 0;
                      stackIn_80_0 = stackOut_79_0;
                      decompiledRegionSelector0 = 16;
                      break L0;
                    } else {
                      if (this.field_L != this.field_O) {
                        this.j(1000);
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (0 < this.field_O) {
                          this.field_L = -1 + this.field_O;
                          this.j(1000);
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_81_0 = (RuntimeException) (var5);
            stackOut_81_1 = new StringBuilder().append("fn.F(");
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L13;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_39_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_42_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_46_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_54_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_56_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_58_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_60_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_63_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_66_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_78_0 != 0;
                                      } else {
                                        return stackIn_80_0 != 0;
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
            }
          }
        }
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
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wk var16 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
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
                var16 = (wk) null;
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
              stackOut_7_0 = param3.field_v;
              stackOut_7_1 = var8;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              L4: while (true) {
                if (stackIn_8_0 <= stackIn_8_1) {
                  break L0;
                } else {
                  if (var15 == 0) {
                    var9 = 0;
                    L5: while (true) {
                      if (param3.field_y <= var9) {
                        var8++;
                        continue L3;
                      } else {
                        var10 = (int)Math.sqrt((double)((var9 - var5) * (var9 - var5) + (var8 + -var6) * (-var6 + var8)));
                        stackOut_13_0 = param2;
                        stackOut_13_1 = var10;
                        stackIn_8_0 = stackOut_13_0;
                        stackIn_8_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (var15 != 0) {
                          continue L4;
                        } else {
                          L6: {
                            L7: {
                              if (stackIn_14_0 <= stackIn_14_1) {
                                break L7;
                              } else {
                                var10 = param1;
                                if (var15 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var10 = -(param1 * (-param2 + var10) / (-param2 + var7)) + param1;
                            break L6;
                          }
                          L8: {
                            if (0 >= var10) {
                              break L8;
                            } else {
                              L9: {
                                var11 = param3.field_B[var4_int];
                                if (var11 != 1) {
                                  break L9;
                                } else {
                                  var11 = 0;
                                  break L9;
                                }
                              }
                              L10: {
                                var12 = (var11 & 16711680) - -(var10 << -1232173808);
                                var13 = (var11 & 65280) - -(var10 << 501192584);
                                if (-16711681 > (var12 ^ -1)) {
                                  var12 = 16711680;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: {
                                var14 = (var11 & 255) - -var10;
                                if ((var13 ^ -1) >= -65281) {
                                  break L11;
                                } else {
                                  var13 = 65280;
                                  break L11;
                                }
                              }
                              L12: {
                                if (255 < var14) {
                                  var14 = 255;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              param3.field_B[var4_int] = oe.c(oe.c(var12, var13), var14);
                              break L8;
                            }
                          }
                          var4_int++;
                          var9++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("fn.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L13;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    fn(String param0, qo param1, int param2) {
        super(param0, param1);
        this.field_T = 0L;
        this.field_P = false;
        this.field_V = -1;
        try {
            this.field_k = t.field_c.field_w;
            this.field_R = param2;
            this.a(true, param0, -27934);
            this.field_N = true;
            this.field_U = vi.b(-83);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        this.field_O = 0;
        this.field_L = 0;
        this.field_v = "";
        int var2 = 26 % ((33 - param0) / 36);
        this.d((byte) -126);
    }

    private final void l(int param0) {
        int discarded$1 = 0;
        ju var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pm var9 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_N) {
          if (this.field_k instanceof pm) {
            L0: {
              var9 = (pm) ((Object) this.field_k);
              var3 = var9.a(-100, (kb) (this));
              if (param0 == 0) {
                break L0;
              } else {
                discarded$1 = this.e((byte) -33);
                break L0;
              }
            }
            var4 = var3.a(false);
            var5 = var9.b(66, (kb) (this));
            var6 = var9.a(true) >> -1534463071;
            if (-var6 + var5 > var4) {
              this.field_z = 0;
              this.field_r = 0;
              return;
            } else {
              L1: {
                L2: {
                  var7 = this.field_r + var3.a((byte) -66, this.field_O);
                  if (var5 + -var6 < var7) {
                    break L2;
                  } else {
                    if (var7 < var6) {
                      this.field_r = this.field_r + (-var7 + var6);
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L3: {
                          L4: {
                            if ((this.field_r ^ -1) >= -1) {
                              break L4;
                            } else {
                              this.field_r = 0;
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var6 + -var5 <= this.field_r) {
                            break L3;
                          } else {
                            this.field_r = var6 + -var5;
                            break L3;
                          }
                        }
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                this.field_r = this.field_r - var7 - var6 - -var5;
                break L1;
              }
              if ((this.field_r ^ -1) < -1) {
                this.field_r = 0;
                if (var8 != 0) {
                  if (var6 + -var5 > this.field_r) {
                    this.field_r = var6 + -var5;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L5: {
                  if (var6 + -var5 <= this.field_r) {
                    break L5;
                  } else {
                    this.field_r = var6 + -var5;
                    break L5;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_r = 0;
          this.field_z = 0;
          return;
        }
    }

    void d(byte param0) {
        L0: {
          if (this.field_x instanceof fb) {
            ((fb) ((Object) this.field_x)).b((fn) (this), 111);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -114) {
          this.field_R = -53;
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        try {
            String var2 = null;
            var2 = this.o(param0 ^ 108);
            if (param0 != -53) {
              return;
            } else {
              L0: {
                if (0 >= var2.length()) {
                  break L0;
                } else {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.o(-74))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte param1) {
        this.field_O = param0;
        if (br.field_f[81]) {
          if (param1 != -59) {
            this.n(-104);
            return;
          } else {
            return;
          }
        } else {
          this.field_L = this.field_O;
          if (param1 == -59) {
            return;
          } else {
            this.n(-104);
            return;
          }
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
        int decompiledRegionSelector0 = 0;
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
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (this.field_k instanceof pm) {
                  L1: {
                    var8_int = ((pm) ((Object) this.field_k)).a((kb) (this), sm.field_d, 87, param2, ko.field_b, param1);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if ((var8_int ^ -1) != 0) {
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
                    if (-this.field_T + var8_long >= 250L) {
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
                    ((fn) (this)).field_P = stackIn_12_1 != 0;
                    if (!this.field_P) {
                      break L3;
                    } else {
                      L4: {
                        this.field_L = this.e((byte) -85);
                        this.field_O = this.p(-89);
                        if (-1 <= (this.field_O ^ -1)) {
                          break L4;
                        } else {
                          if (-33 == (this.field_v.charAt(this.field_O + -1) ^ -1)) {
                            this.field_O = this.field_O - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      this.field_V = this.field_O;
                      break L3;
                    }
                  }
                  this.field_T = var8_long;
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var8);
            stackOut_22_1 = new StringBuilder().append("fn.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    public static void m(int param0) {
        if (param0 != 32) {
            field_Q = (int[]) null;
            field_S = null;
            field_Q = null;
            return;
        }
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        long var6 = 0L;
        pm var8 = null;
        if (param2 <= -82) {
          if (this.field_k != null) {
            if (-1 == (param3 ^ -1)) {
              this.field_k.a((kb) (this), param0, -128, this.field_I, param1);
              if (this.field_k instanceof pm) {
                var8 = (pm) ((Object) this.field_k);
                if (this.field_O == this.field_L) {
                  var6 = vi.b(-126);
                  if (-501L < ((var6 + -this.field_U) % 1000L ^ -1L)) {
                    var8.a(param1, 1024, param0, (kb) (this), this.field_O);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a(-21259, this.field_O, this.field_L, (kb) (this), param1, param0);
                  var6 = vi.b(-126);
                  if (-501L < ((var6 + -this.field_U) % 1000L ^ -1L)) {
                    var8.a(param1, 1024, param0, (kb) (this), this.field_O);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        try {
            boolean discarded$1 = false;
            Exception var2 = null;
            String var2_ref = null;
            kb var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == -104) {
                    break L1;
                  } else {
                    var3 = (kb) null;
                    discarded$1 = this.a((kb) null, -59, 'x', 71);
                    break L1;
                  }
                }
                var2_ref = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.j(param0 + 1104);
                this.a(var2_ref, (byte) -114);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (0 == (this.field_R ^ -1)) {
                break L1;
              } else {
                var3_int = this.field_R - this.field_v.length();
                if ((var3_int ^ -1) <= -1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (this.field_O != this.field_v.length()) {
                  break L3;
                } else {
                  this.field_v = this.field_v + param0;
                  if (!ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_v = this.field_v.substring(0, this.field_O) + param0 + this.field_v.substring(this.field_O, this.field_v.length());
              break L2;
            }
            L4: {
              this.field_O = this.field_O + param0.length();
              this.field_L = this.field_O;
              if (param1 > -78) {
                this.field_L = 91;
                this.d((byte) -126);
                break L4;
              } else {
                this.d((byte) -126);
                break L4;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("fn.BA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        char stackIn_8_0 = 0;
        char stackIn_9_0 = 0;
        char stackOut_7_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 <= -10) {
          var2 = this.field_v.length();
          if (this.field_O != var2) {
            var3 = this.field_O - -1;
            L0: while (true) {
              if (var3 < var2) {
                stackOut_7_0 = this.field_v.charAt(-1 + var3);
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var4 == 0) {
                  if (stackIn_9_0 != 32) {
                    var3++;
                    continue L0;
                  } else {
                    return var3;
                  }
                } else {
                  return stackIn_8_0;
                }
              } else {
                return var3;
              }
            }
          } else {
            return this.field_O;
          }
        } else {
          return -64;
        }
    }

    static {
        field_M = 9;
        field_Q = new int[]{-1, -1, 4, 5, -1, -1, -1, 2, 0, 1, -1, 3, 6, 6, 8, 9};
        field_S = "Sacrifice";
    }
}
