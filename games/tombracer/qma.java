/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qma implements d {
    private int field_a;
    static boolean field_c;
    private dw[] field_b;
    static String field_f;
    private pea field_e;
    private cn field_d;
    private cn field_g;

    public static void a(byte param0) {
        field_f = null;
        if (param0 < 10) {
            java.awt.Component var2 = (java.awt.Component) null;
            qma.a((java.awt.Component) null, 70);
        }
    }

    public boolean a(int param0, byte param1) {
        km var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 >= 10) {
          L0: {
            L1: {
              var3 = this.a(param0, 0);
              if (var3 == null) {
                break L1;
              } else {
                if (!var3.a(this.field_d, (d) (this), 0)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public final int a(int param0) {
        if (param0 != -15061) {
            return 75;
        }
        return this.field_a;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener(nfa.field_n);
        if (param1 > -4) {
            return;
        }
        try {
            param0.addFocusListener(nfa.field_n);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qma.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final dw a(byte param0, int param1) {
        int var3 = -28 % ((55 - param0) / 41);
        return this.field_b[param1];
    }

    public final int[] a(int param0, int param1, boolean param2, int param3, float param4, int param5) {
        if (param0 != 14907) {
            this.field_d = (cn) null;
        }
        return this.a(param1, 0).a(param5, this.field_d, param2, (double)param4, (d) (this), (byte) 104, param3, this.field_b[param1].field_e);
    }

    private final km a(int param0, int param1) {
        od var3 = this.field_e.a(param1 + param1, (long)param0);
        if (!(var3 == null)) {
            return (km) ((Object) var3);
        }
        byte[] var4 = this.field_g.f(param0, -109);
        if (var4 == null) {
            return null;
        }
        km var5 = new km(new uia(var4));
        this.field_e.a(var5, (byte) 96, (long)param0);
        return var5;
    }

    public final float[] a(int param0, int param1, int param2, int param3, float param4, boolean param5) {
        if (param0 <= 114) {
            field_f = (String) null;
        }
        return this.a(param3, 0).a((d) (this), (byte) -127, param1, param2, this.field_b[param3].field_e, this.field_d);
    }

    qma(cn param0, cn param1, cn param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        uia var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        dw stackIn_11_1 = null;
        dw stackIn_13_0 = null;
        dw stackIn_14_0 = null;
        dw stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_20_0 = null;
        dw stackIn_20_1 = null;
        dw stackIn_22_0 = null;
        dw stackIn_23_0 = null;
        dw stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_29_0 = null;
        dw stackIn_29_1 = null;
        dw stackIn_31_0 = null;
        dw stackIn_32_0 = null;
        dw stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        dw stackIn_38_0 = null;
        Object stackIn_44_0 = null;
        dw stackIn_44_1 = null;
        dw stackIn_50_0 = null;
        Object stackIn_56_0 = null;
        dw stackIn_56_1 = null;
        Object stackIn_62_0 = null;
        dw stackIn_62_1 = null;
        Object stackIn_68_0 = null;
        dw stackIn_68_1 = null;
        Object stackIn_74_0 = null;
        dw stackIn_74_1 = null;
        dw stackIn_80_0 = null;
        dw stackIn_82_0 = null;
        dw stackIn_83_0 = null;
        dw stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        dw stackIn_89_0 = null;
        dw stackIn_91_0 = null;
        dw stackIn_92_0 = null;
        dw stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        Object stackIn_99_0 = null;
        dw stackIn_99_1 = null;
        dw stackIn_105_0 = null;
        dw stackIn_107_0 = null;
        dw stackIn_108_0 = null;
        dw stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        dw stackIn_114_0 = null;
        dw stackIn_116_0 = null;
        dw stackIn_117_0 = null;
        dw stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        dw stackIn_123_0 = null;
        dw stackIn_125_0 = null;
        dw stackIn_126_0 = null;
        dw stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        dw stackIn_132_0 = null;
        dw stackIn_138_0 = null;
        dw stackIn_145_0 = null;
        RuntimeException stackIn_150_0 = null;
        StringBuilder stackIn_150_1 = null;
        RuntimeException stackIn_151_0 = null;
        StringBuilder stackIn_151_1 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        String stackIn_152_2 = null;
        RuntimeException stackIn_153_0 = null;
        StringBuilder stackIn_153_1 = null;
        RuntimeException stackIn_154_0 = null;
        StringBuilder stackIn_154_1 = null;
        RuntimeException stackIn_155_0 = null;
        StringBuilder stackIn_155_1 = null;
        String stackIn_155_2 = null;
        RuntimeException stackIn_156_0 = null;
        StringBuilder stackIn_156_1 = null;
        RuntimeException stackIn_157_0 = null;
        StringBuilder stackIn_157_1 = null;
        RuntimeException stackIn_158_0 = null;
        StringBuilder stackIn_158_1 = null;
        String stackIn_158_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_10_0 = null;
        dw stackOut_10_1 = null;
        dw stackOut_12_0 = null;
        dw stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        dw stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_19_0 = null;
        dw stackOut_19_1 = null;
        dw stackOut_21_0 = null;
        dw stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        dw stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_28_0 = null;
        dw stackOut_28_1 = null;
        dw stackOut_30_0 = null;
        dw stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        dw stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        dw stackOut_37_0 = null;
        Object stackOut_43_0 = null;
        dw stackOut_43_1 = null;
        dw stackOut_49_0 = null;
        Object stackOut_55_0 = null;
        dw stackOut_55_1 = null;
        Object stackOut_61_0 = null;
        dw stackOut_61_1 = null;
        Object stackOut_67_0 = null;
        dw stackOut_67_1 = null;
        Object stackOut_73_0 = null;
        dw stackOut_73_1 = null;
        dw stackOut_79_0 = null;
        dw stackOut_81_0 = null;
        dw stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        dw stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        dw stackOut_88_0 = null;
        dw stackOut_90_0 = null;
        dw stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        dw stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        Object stackOut_98_0 = null;
        dw stackOut_98_1 = null;
        dw stackOut_104_0 = null;
        dw stackOut_106_0 = null;
        dw stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        dw stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        dw stackOut_113_0 = null;
        dw stackOut_115_0 = null;
        dw stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        dw stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        dw stackOut_122_0 = null;
        dw stackOut_124_0 = null;
        dw stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        dw stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        dw stackOut_131_0 = null;
        dw stackOut_137_0 = null;
        dw stackOut_144_0 = null;
        RuntimeException stackOut_149_0 = null;
        StringBuilder stackOut_149_1 = null;
        RuntimeException stackOut_151_0 = null;
        StringBuilder stackOut_151_1 = null;
        String stackOut_151_2 = null;
        RuntimeException stackOut_150_0 = null;
        StringBuilder stackOut_150_1 = null;
        String stackOut_150_2 = null;
        RuntimeException stackOut_152_0 = null;
        StringBuilder stackOut_152_1 = null;
        RuntimeException stackOut_154_0 = null;
        StringBuilder stackOut_154_1 = null;
        String stackOut_154_2 = null;
        RuntimeException stackOut_153_0 = null;
        StringBuilder stackOut_153_1 = null;
        String stackOut_153_2 = null;
        RuntimeException stackOut_155_0 = null;
        StringBuilder stackOut_155_1 = null;
        RuntimeException stackOut_157_0 = null;
        StringBuilder stackOut_157_1 = null;
        String stackOut_157_2 = null;
        RuntimeException stackOut_156_0 = null;
        StringBuilder stackOut_156_1 = null;
        String stackOut_156_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        this.field_e = new pea(256);
        try {
          L0: {
            this.field_d = param2;
            this.field_g = param1;
            var7 = new uia(param0.a(false, 0, 0));
            this.field_a = var7.d(123);
            this.field_b = new dw[this.field_a];
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              if ((var5 ^ -1) <= (this.field_a ^ -1)) {
                                break L9;
                              } else {
                                stackOut_3_0 = var7.h(255);
                                stackOut_3_1 = 1;
                                stackIn_9_0 = stackOut_3_0;
                                stackIn_9_1 = stackOut_3_1;
                                stackIn_4_0 = stackOut_3_0;
                                stackIn_4_1 = stackOut_3_1;
                                if (var6 != 0) {
                                  L10: while (true) {
                                    if (stackIn_9_0 <= stackIn_9_1) {
                                      break L8;
                                    } else {
                                      stackOut_10_0 = null;
                                      stackOut_10_1 = this.field_b[var5];
                                      stackIn_99_0 = stackOut_10_0;
                                      stackIn_99_1 = stackOut_10_1;
                                      stackIn_11_0 = stackOut_10_0;
                                      stackIn_11_1 = stackOut_10_1;
                                      if (var6 != 0) {
                                        break L7;
                                      } else {
                                        L11: {
                                          if (stackIn_11_0 == stackIn_11_1) {
                                            break L11;
                                          } else {
                                            L12: {
                                              stackOut_12_0 = this.field_b[var5];
                                              stackIn_14_0 = stackOut_12_0;
                                              stackIn_13_0 = stackOut_12_0;
                                              if (var7.h(255) != 0) {
                                                stackOut_14_0 = (dw) ((Object) stackIn_14_0);
                                                stackOut_14_1 = 0;
                                                stackIn_15_0 = stackOut_14_0;
                                                stackIn_15_1 = stackOut_14_1;
                                                break L12;
                                              } else {
                                                stackOut_13_0 = (dw) ((Object) stackIn_13_0);
                                                stackOut_13_1 = 1;
                                                stackIn_15_0 = stackOut_13_0;
                                                stackIn_15_1 = stackOut_13_1;
                                                break L12;
                                              }
                                            }
                                            stackIn_15_0.field_p = stackIn_15_1 != 0;
                                            break L11;
                                          }
                                        }
                                        var5++;
                                        if (var6 == 0) {
                                          stackOut_8_0 = var5 ^ -1;
                                          stackOut_8_1 = this.field_a ^ -1;
                                          stackIn_9_0 = stackOut_8_0;
                                          stackIn_9_1 = stackOut_8_1;
                                          continue L10;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_4_0 != stackIn_4_1) {
                                      break L13;
                                    } else {
                                      this.field_b[var5] = new dw();
                                      break L13;
                                    }
                                  }
                                  var5++;
                                  if (var6 == 0) {
                                    continue L1;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var5 = 0;
                            L14: while (true) {
                              stackOut_8_0 = var5 ^ -1;
                              stackOut_8_1 = this.field_a ^ -1;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              if (stackIn_9_0 <= stackIn_9_1) {
                                break L8;
                              } else {
                                stackOut_10_0 = null;
                                stackOut_10_1 = this.field_b[var5];
                                stackIn_99_0 = stackOut_10_0;
                                stackIn_99_1 = stackOut_10_1;
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                if (var6 != 0) {
                                  break L7;
                                } else {
                                  L15: {
                                    if (stackIn_11_0 == stackIn_11_1) {
                                      break L15;
                                    } else {
                                      L16: {
                                        stackOut_12_0 = this.field_b[var5];
                                        stackIn_14_0 = stackOut_12_0;
                                        stackIn_13_0 = stackOut_12_0;
                                        if (var7.h(255) != 0) {
                                          stackOut_14_0 = (dw) ((Object) stackIn_14_0);
                                          stackOut_14_1 = 0;
                                          stackIn_15_0 = stackOut_14_0;
                                          stackIn_15_1 = stackOut_14_1;
                                          break L16;
                                        } else {
                                          stackOut_13_0 = (dw) ((Object) stackIn_13_0);
                                          stackOut_13_1 = 1;
                                          stackIn_15_0 = stackOut_13_0;
                                          stackIn_15_1 = stackOut_13_1;
                                          break L16;
                                        }
                                      }
                                      stackIn_15_0.field_p = stackIn_15_1 != 0;
                                      break L15;
                                    }
                                  }
                                  var5++;
                                  if (var6 == 0) {
                                    continue L14;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var5 = 0;
                          L17: while (true) {
                            L18: {
                              if (var5 >= this.field_a) {
                                break L18;
                              } else {
                                stackOut_19_0 = null;
                                stackOut_19_1 = this.field_b[var5];
                                stackIn_99_0 = stackOut_19_0;
                                stackIn_99_1 = stackOut_19_1;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                if (var6 != 0) {
                                  break L7;
                                } else {
                                  L19: {
                                    if (stackIn_20_0 == stackIn_20_1) {
                                      break L19;
                                    } else {
                                      L20: {
                                        stackOut_21_0 = this.field_b[var5];
                                        stackIn_23_0 = stackOut_21_0;
                                        stackIn_22_0 = stackOut_21_0;
                                        if (-2 != (var7.h(255) ^ -1)) {
                                          stackOut_23_0 = (dw) ((Object) stackIn_23_0);
                                          stackOut_23_1 = 0;
                                          stackIn_24_0 = stackOut_23_0;
                                          stackIn_24_1 = stackOut_23_1;
                                          break L20;
                                        } else {
                                          stackOut_22_0 = (dw) ((Object) stackIn_22_0);
                                          stackOut_22_1 = 1;
                                          stackIn_24_0 = stackOut_22_0;
                                          stackIn_24_1 = stackOut_22_1;
                                          break L20;
                                        }
                                      }
                                      stackIn_24_0.field_g = stackIn_24_1 != 0;
                                      break L19;
                                    }
                                  }
                                  var5++;
                                  if (var6 == 0) {
                                    continue L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var5 = 0;
                            L21: while (true) {
                              L22: {
                                if (var5 >= this.field_a) {
                                  break L22;
                                } else {
                                  stackOut_28_0 = null;
                                  stackOut_28_1 = this.field_b[var5];
                                  stackIn_99_0 = stackOut_28_0;
                                  stackIn_99_1 = stackOut_28_1;
                                  stackIn_29_0 = stackOut_28_0;
                                  stackIn_29_1 = stackOut_28_1;
                                  if (var6 != 0) {
                                    break L7;
                                  } else {
                                    L23: {
                                      if (stackIn_29_0 == stackIn_29_1) {
                                        break L23;
                                      } else {
                                        L24: {
                                          stackOut_30_0 = this.field_b[var5];
                                          stackIn_32_0 = stackOut_30_0;
                                          stackIn_31_0 = stackOut_30_0;
                                          if (var7.h(255) != 1) {
                                            stackOut_32_0 = (dw) ((Object) stackIn_32_0);
                                            stackOut_32_1 = 0;
                                            stackIn_33_0 = stackOut_32_0;
                                            stackIn_33_1 = stackOut_32_1;
                                            break L24;
                                          } else {
                                            stackOut_31_0 = (dw) ((Object) stackIn_31_0);
                                            stackOut_31_1 = 1;
                                            stackIn_33_0 = stackOut_31_0;
                                            stackIn_33_1 = stackOut_31_1;
                                            break L24;
                                          }
                                        }
                                        stackIn_33_0.field_f = stackIn_33_1 != 0;
                                        break L23;
                                      }
                                    }
                                    var5++;
                                    if (var6 == 0) {
                                      continue L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                              var5 = 0;
                              L25: while (true) {
                                L26: {
                                  if ((var5 ^ -1) <= (this.field_a ^ -1)) {
                                    break L26;
                                  } else {
                                    stackOut_37_0 = this.field_b[var5];
                                    stackIn_145_0 = stackOut_37_0;
                                    stackIn_38_0 = stackOut_37_0;
                                    if (var6 != 0) {
                                      break L4;
                                    } else {
                                      L27: {
                                        if (stackIn_38_0 == null) {
                                          break L27;
                                        } else {
                                          this.field_b[var5].field_i = var7.c((byte) 90);
                                          break L27;
                                        }
                                      }
                                      var5++;
                                      if (var6 == 0) {
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                var5 = 0;
                                L28: while (true) {
                                  L29: {
                                    if (var5 >= this.field_a) {
                                      break L29;
                                    } else {
                                      stackOut_43_0 = null;
                                      stackOut_43_1 = this.field_b[var5];
                                      stackIn_99_0 = stackOut_43_0;
                                      stackIn_99_1 = stackOut_43_1;
                                      stackIn_44_0 = stackOut_43_0;
                                      stackIn_44_1 = stackOut_43_1;
                                      if (var6 != 0) {
                                        break L7;
                                      } else {
                                        L30: {
                                          if (stackIn_44_0 == stackIn_44_1) {
                                            break L30;
                                          } else {
                                            this.field_b[var5].field_c = var7.c((byte) 91);
                                            break L30;
                                          }
                                        }
                                        var5++;
                                        if (var6 == 0) {
                                          continue L28;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                  }
                                  var5 = 0;
                                  L31: while (true) {
                                    L32: {
                                      if (var5 >= this.field_a) {
                                        break L32;
                                      } else {
                                        stackOut_49_0 = this.field_b[var5];
                                        stackIn_145_0 = stackOut_49_0;
                                        stackIn_50_0 = stackOut_49_0;
                                        if (var6 != 0) {
                                          break L4;
                                        } else {
                                          L33: {
                                            if (stackIn_50_0 == null) {
                                              break L33;
                                            } else {
                                              this.field_b[var5].field_h = var7.c((byte) 85);
                                              break L33;
                                            }
                                          }
                                          var5++;
                                          if (var6 == 0) {
                                            continue L31;
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                    }
                                    var5 = 0;
                                    L34: while (true) {
                                      L35: {
                                        if (var5 >= this.field_a) {
                                          break L35;
                                        } else {
                                          stackOut_55_0 = null;
                                          stackOut_55_1 = this.field_b[var5];
                                          stackIn_99_0 = stackOut_55_0;
                                          stackIn_99_1 = stackOut_55_1;
                                          stackIn_56_0 = stackOut_55_0;
                                          stackIn_56_1 = stackOut_55_1;
                                          if (var6 != 0) {
                                            break L7;
                                          } else {
                                            L36: {
                                              if (stackIn_56_0 == stackIn_56_1) {
                                                break L36;
                                              } else {
                                                this.field_b[var5].field_a = var7.c((byte) 126);
                                                break L36;
                                              }
                                            }
                                            var5++;
                                            if (var6 == 0) {
                                              continue L34;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                      }
                                      var5 = 0;
                                      L37: while (true) {
                                        L38: {
                                          if (var5 >= this.field_a) {
                                            break L38;
                                          } else {
                                            stackOut_61_0 = null;
                                            stackOut_61_1 = this.field_b[var5];
                                            stackIn_99_0 = stackOut_61_0;
                                            stackIn_99_1 = stackOut_61_1;
                                            stackIn_62_0 = stackOut_61_0;
                                            stackIn_62_1 = stackOut_61_1;
                                            if (var6 != 0) {
                                              break L7;
                                            } else {
                                              L39: {
                                                if (stackIn_62_0 == stackIn_62_1) {
                                                  break L39;
                                                } else {
                                                  this.field_b[var5].field_m = (short)var7.d(124);
                                                  break L39;
                                                }
                                              }
                                              var5++;
                                              if (var6 == 0) {
                                                continue L37;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                        }
                                        var5 = 0;
                                        L40: while (true) {
                                          L41: {
                                            if (var5 >= this.field_a) {
                                              break L41;
                                            } else {
                                              stackOut_67_0 = null;
                                              stackOut_67_1 = this.field_b[var5];
                                              stackIn_99_0 = stackOut_67_0;
                                              stackIn_99_1 = stackOut_67_1;
                                              stackIn_68_0 = stackOut_67_0;
                                              stackIn_68_1 = stackOut_67_1;
                                              if (var6 != 0) {
                                                break L7;
                                              } else {
                                                L42: {
                                                  if (stackIn_68_0 == stackIn_68_1) {
                                                    break L42;
                                                  } else {
                                                    this.field_b[var5].field_s = var7.c((byte) 45);
                                                    break L42;
                                                  }
                                                }
                                                var5++;
                                                if (var6 == 0) {
                                                  continue L40;
                                                } else {
                                                  break L41;
                                                }
                                              }
                                            }
                                          }
                                          var5 = 0;
                                          L43: while (true) {
                                            L44: {
                                              if (var5 >= this.field_a) {
                                                break L44;
                                              } else {
                                                stackOut_73_0 = null;
                                                stackOut_73_1 = this.field_b[var5];
                                                stackIn_99_0 = stackOut_73_0;
                                                stackIn_99_1 = stackOut_73_1;
                                                stackIn_74_0 = stackOut_73_0;
                                                stackIn_74_1 = stackOut_73_1;
                                                if (var6 != 0) {
                                                  break L7;
                                                } else {
                                                  L45: {
                                                    if (stackIn_74_0 == stackIn_74_1) {
                                                      break L45;
                                                    } else {
                                                      this.field_b[var5].field_o = var7.c((byte) 70);
                                                      break L45;
                                                    }
                                                  }
                                                  var5++;
                                                  if (var6 == 0) {
                                                    continue L43;
                                                  } else {
                                                    break L44;
                                                  }
                                                }
                                              }
                                            }
                                            var5 = 0;
                                            L46: while (true) {
                                              L47: {
                                                if (this.field_a <= var5) {
                                                  break L47;
                                                } else {
                                                  stackOut_79_0 = this.field_b[var5];
                                                  stackIn_145_0 = stackOut_79_0;
                                                  stackIn_80_0 = stackOut_79_0;
                                                  if (var6 != 0) {
                                                    break L4;
                                                  } else {
                                                    L48: {
                                                      if (stackIn_80_0 == null) {
                                                        break L48;
                                                      } else {
                                                        L49: {
                                                          stackOut_81_0 = this.field_b[var5];
                                                          stackIn_83_0 = stackOut_81_0;
                                                          stackIn_82_0 = stackOut_81_0;
                                                          if (var7.h(255) != 1) {
                                                            stackOut_83_0 = (dw) ((Object) stackIn_83_0);
                                                            stackOut_83_1 = 0;
                                                            stackIn_84_0 = stackOut_83_0;
                                                            stackIn_84_1 = stackOut_83_1;
                                                            break L49;
                                                          } else {
                                                            stackOut_82_0 = (dw) ((Object) stackIn_82_0);
                                                            stackOut_82_1 = 1;
                                                            stackIn_84_0 = stackOut_82_0;
                                                            stackIn_84_1 = stackOut_82_1;
                                                            break L49;
                                                          }
                                                        }
                                                        stackIn_84_0.field_k = stackIn_84_1 != 0;
                                                        break L48;
                                                      }
                                                    }
                                                    var5++;
                                                    if (var6 == 0) {
                                                      continue L46;
                                                    } else {
                                                      break L47;
                                                    }
                                                  }
                                                }
                                              }
                                              var5 = 0;
                                              L50: while (true) {
                                                L51: {
                                                  if ((var5 ^ -1) <= (this.field_a ^ -1)) {
                                                    break L51;
                                                  } else {
                                                    stackOut_88_0 = this.field_b[var5];
                                                    stackIn_145_0 = stackOut_88_0;
                                                    stackIn_89_0 = stackOut_88_0;
                                                    if (var6 != 0) {
                                                      break L4;
                                                    } else {
                                                      L52: {
                                                        if (stackIn_89_0 == null) {
                                                          break L52;
                                                        } else {
                                                          L53: {
                                                            stackOut_90_0 = this.field_b[var5];
                                                            stackIn_92_0 = stackOut_90_0;
                                                            stackIn_91_0 = stackOut_90_0;
                                                            if (-2 != (var7.h(255) ^ -1)) {
                                                              stackOut_92_0 = (dw) ((Object) stackIn_92_0);
                                                              stackOut_92_1 = 0;
                                                              stackIn_93_0 = stackOut_92_0;
                                                              stackIn_93_1 = stackOut_92_1;
                                                              break L53;
                                                            } else {
                                                              stackOut_91_0 = (dw) ((Object) stackIn_91_0);
                                                              stackOut_91_1 = 1;
                                                              stackIn_93_0 = stackOut_91_0;
                                                              stackIn_93_1 = stackOut_91_1;
                                                              break L53;
                                                            }
                                                          }
                                                          stackIn_93_0.field_e = stackIn_93_1 != 0;
                                                          break L52;
                                                        }
                                                      }
                                                      var5++;
                                                      if (var6 == 0) {
                                                        continue L50;
                                                      } else {
                                                        break L51;
                                                      }
                                                    }
                                                  }
                                                }
                                                var5 = 0;
                                                L54: while (true) {
                                                  if ((this.field_a ^ -1) >= (var5 ^ -1)) {
                                                    break L6;
                                                  } else {
                                                    if (var6 != 0) {
                                                      break L5;
                                                    } else {
                                                      stackOut_98_0 = null;
                                                      stackOut_98_1 = this.field_b[var5];
                                                      stackIn_99_0 = stackOut_98_0;
                                                      stackIn_99_1 = stackOut_98_1;
                                                      L55: {
                                                        if (stackIn_99_0 == stackIn_99_1) {
                                                          break L55;
                                                        } else {
                                                          this.field_b[var5].field_r = var7.c((byte) 39);
                                                          break L55;
                                                        }
                                                      }
                                                      var5++;
                                                      if (var6 == 0) {
                                                        continue L54;
                                                      } else {
                                                        break L6;
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
                        L56: while (true) {
                          L57: {
                            if (stackIn_99_0 == stackIn_99_1) {
                              break L57;
                            } else {
                              this.field_b[var5].field_r = var7.c((byte) 39);
                              break L57;
                            }
                          }
                          var5++;
                          if (var6 == 0) {
                            if ((this.field_a ^ -1) >= (var5 ^ -1)) {
                              break L6;
                            } else {
                              if (var6 != 0) {
                                break L5;
                              } else {
                                stackOut_98_0 = null;
                                stackOut_98_1 = this.field_b[var5];
                                stackIn_99_0 = stackOut_98_0;
                                stackIn_99_1 = stackOut_98_1;
                                continue L56;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = 0;
                      break L5;
                    }
                    L58: while (true) {
                      L59: {
                        if (var5 >= this.field_a) {
                          break L59;
                        } else {
                          stackOut_104_0 = this.field_b[var5];
                          stackIn_145_0 = stackOut_104_0;
                          stackIn_105_0 = stackOut_104_0;
                          if (var6 != 0) {
                            break L4;
                          } else {
                            L60: {
                              if (stackIn_105_0 == null) {
                                break L60;
                              } else {
                                L61: {
                                  stackOut_106_0 = this.field_b[var5];
                                  stackIn_108_0 = stackOut_106_0;
                                  stackIn_107_0 = stackOut_106_0;
                                  if (var7.h(255) != 1) {
                                    stackOut_108_0 = (dw) ((Object) stackIn_108_0);
                                    stackOut_108_1 = 0;
                                    stackIn_109_0 = stackOut_108_0;
                                    stackIn_109_1 = stackOut_108_1;
                                    break L61;
                                  } else {
                                    stackOut_107_0 = (dw) ((Object) stackIn_107_0);
                                    stackOut_107_1 = 1;
                                    stackIn_109_0 = stackOut_107_0;
                                    stackIn_109_1 = stackOut_107_1;
                                    break L61;
                                  }
                                }
                                stackIn_109_0.field_b = stackIn_109_1 != 0;
                                break L60;
                              }
                            }
                            var5++;
                            if (var6 == 0) {
                              continue L58;
                            } else {
                              break L59;
                            }
                          }
                        }
                      }
                      var5 = 0;
                      L62: while (true) {
                        L63: {
                          if (var5 >= this.field_a) {
                            break L63;
                          } else {
                            stackOut_113_0 = this.field_b[var5];
                            stackIn_145_0 = stackOut_113_0;
                            stackIn_114_0 = stackOut_113_0;
                            if (var6 != 0) {
                              break L4;
                            } else {
                              L64: {
                                if (stackIn_114_0 == null) {
                                  break L64;
                                } else {
                                  L65: {
                                    stackOut_115_0 = this.field_b[var5];
                                    stackIn_117_0 = stackOut_115_0;
                                    stackIn_116_0 = stackOut_115_0;
                                    if ((var7.h(255) ^ -1) != -2) {
                                      stackOut_117_0 = (dw) ((Object) stackIn_117_0);
                                      stackOut_117_1 = 0;
                                      stackIn_118_0 = stackOut_117_0;
                                      stackIn_118_1 = stackOut_117_1;
                                      break L65;
                                    } else {
                                      stackOut_116_0 = (dw) ((Object) stackIn_116_0);
                                      stackOut_116_1 = 1;
                                      stackIn_118_0 = stackOut_116_0;
                                      stackIn_118_1 = stackOut_116_1;
                                      break L65;
                                    }
                                  }
                                  stackIn_118_0.field_n = stackIn_118_1 != 0;
                                  break L64;
                                }
                              }
                              var5++;
                              if (var6 == 0) {
                                continue L62;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        var5 = 0;
                        L66: while (true) {
                          L67: {
                            if ((this.field_a ^ -1) >= (var5 ^ -1)) {
                              break L67;
                            } else {
                              stackOut_122_0 = this.field_b[var5];
                              stackIn_145_0 = stackOut_122_0;
                              stackIn_123_0 = stackOut_122_0;
                              if (var6 != 0) {
                                break L4;
                              } else {
                                L68: {
                                  if (stackIn_123_0 == null) {
                                    break L68;
                                  } else {
                                    L69: {
                                      stackOut_124_0 = this.field_b[var5];
                                      stackIn_126_0 = stackOut_124_0;
                                      stackIn_125_0 = stackOut_124_0;
                                      if (1 != var7.h(255)) {
                                        stackOut_126_0 = (dw) ((Object) stackIn_126_0);
                                        stackOut_126_1 = 0;
                                        stackIn_127_0 = stackOut_126_0;
                                        stackIn_127_1 = stackOut_126_1;
                                        break L69;
                                      } else {
                                        stackOut_125_0 = (dw) ((Object) stackIn_125_0);
                                        stackOut_125_1 = 1;
                                        stackIn_127_0 = stackOut_125_0;
                                        stackIn_127_1 = stackOut_125_1;
                                        break L69;
                                      }
                                    }
                                    stackIn_127_0.field_l = stackIn_127_1 != 0;
                                    break L68;
                                  }
                                }
                                var5++;
                                if (var6 == 0) {
                                  continue L66;
                                } else {
                                  break L67;
                                }
                              }
                            }
                          }
                          var5 = 0;
                          L70: while (true) {
                            L71: {
                              if ((var5 ^ -1) <= (this.field_a ^ -1)) {
                                break L71;
                              } else {
                                stackOut_131_0 = this.field_b[var5];
                                stackIn_145_0 = stackOut_131_0;
                                stackIn_132_0 = stackOut_131_0;
                                if (var6 != 0) {
                                  break L4;
                                } else {
                                  L72: {
                                    if (stackIn_132_0 == null) {
                                      break L72;
                                    } else {
                                      this.field_b[var5].field_q = var7.h(255);
                                      break L72;
                                    }
                                  }
                                  var5++;
                                  if (var6 == 0) {
                                    continue L70;
                                  } else {
                                    break L71;
                                  }
                                }
                              }
                            }
                            var5 = 0;
                            L73: while (true) {
                              L74: {
                                if ((var5 ^ -1) <= (this.field_a ^ -1)) {
                                  break L74;
                                } else {
                                  stackOut_137_0 = this.field_b[var5];
                                  stackIn_145_0 = stackOut_137_0;
                                  stackIn_138_0 = stackOut_137_0;
                                  if (var6 != 0) {
                                    break L4;
                                  } else {
                                    L75: {
                                      if (stackIn_138_0 == null) {
                                        break L75;
                                      } else {
                                        this.field_b[var5].field_t = var7.e(-106);
                                        break L75;
                                      }
                                    }
                                    var5++;
                                    if (var6 == 0) {
                                      continue L73;
                                    } else {
                                      break L74;
                                    }
                                  }
                                }
                              }
                              var5 = 0;
                              L76: while (true) {
                                if ((this.field_a ^ -1) >= (var5 ^ -1)) {
                                  break L2;
                                } else {
                                  if (var6 != 0) {
                                    break L3;
                                  } else {
                                    stackOut_144_0 = this.field_b[var5];
                                    stackIn_145_0 = stackOut_144_0;
                                    L77: {
                                      if (stackIn_145_0 == null) {
                                        break L77;
                                      } else {
                                        this.field_b[var5].field_d = var7.h(255);
                                        break L77;
                                      }
                                    }
                                    var5++;
                                    if (var6 == 0) {
                                      continue L76;
                                    } else {
                                      break L2;
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
                  L78: while (true) {
                    L79: {
                      if (stackIn_145_0 == null) {
                        break L79;
                      } else {
                        this.field_b[var5].field_d = var7.h(255);
                        break L79;
                      }
                    }
                    var5++;
                    if (var6 == 0) {
                      if ((this.field_a ^ -1) >= (var5 ^ -1)) {
                        break L2;
                      } else {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          stackOut_144_0 = this.field_b[var5];
                          stackIn_145_0 = stackOut_144_0;
                          continue L78;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L80: {
            var4 = decompiledCaughtException;
            stackOut_149_0 = (RuntimeException) (var4);
            stackOut_149_1 = new StringBuilder().append("qma.<init>(");
            stackIn_151_0 = stackOut_149_0;
            stackIn_151_1 = stackOut_149_1;
            stackIn_150_0 = stackOut_149_0;
            stackIn_150_1 = stackOut_149_1;
            if (param0 == null) {
              stackOut_151_0 = (RuntimeException) ((Object) stackIn_151_0);
              stackOut_151_1 = (StringBuilder) ((Object) stackIn_151_1);
              stackOut_151_2 = "null";
              stackIn_152_0 = stackOut_151_0;
              stackIn_152_1 = stackOut_151_1;
              stackIn_152_2 = stackOut_151_2;
              break L80;
            } else {
              stackOut_150_0 = (RuntimeException) ((Object) stackIn_150_0);
              stackOut_150_1 = (StringBuilder) ((Object) stackIn_150_1);
              stackOut_150_2 = "{...}";
              stackIn_152_0 = stackOut_150_0;
              stackIn_152_1 = stackOut_150_1;
              stackIn_152_2 = stackOut_150_2;
              break L80;
            }
          }
          L81: {
            stackOut_152_0 = (RuntimeException) ((Object) stackIn_152_0);
            stackOut_152_1 = ((StringBuilder) (Object) stackIn_152_1).append(stackIn_152_2).append(',');
            stackIn_154_0 = stackOut_152_0;
            stackIn_154_1 = stackOut_152_1;
            stackIn_153_0 = stackOut_152_0;
            stackIn_153_1 = stackOut_152_1;
            if (param1 == null) {
              stackOut_154_0 = (RuntimeException) ((Object) stackIn_154_0);
              stackOut_154_1 = (StringBuilder) ((Object) stackIn_154_1);
              stackOut_154_2 = "null";
              stackIn_155_0 = stackOut_154_0;
              stackIn_155_1 = stackOut_154_1;
              stackIn_155_2 = stackOut_154_2;
              break L81;
            } else {
              stackOut_153_0 = (RuntimeException) ((Object) stackIn_153_0);
              stackOut_153_1 = (StringBuilder) ((Object) stackIn_153_1);
              stackOut_153_2 = "{...}";
              stackIn_155_0 = stackOut_153_0;
              stackIn_155_1 = stackOut_153_1;
              stackIn_155_2 = stackOut_153_2;
              break L81;
            }
          }
          L82: {
            stackOut_155_0 = (RuntimeException) ((Object) stackIn_155_0);
            stackOut_155_1 = ((StringBuilder) (Object) stackIn_155_1).append(stackIn_155_2).append(',');
            stackIn_157_0 = stackOut_155_0;
            stackIn_157_1 = stackOut_155_1;
            stackIn_156_0 = stackOut_155_0;
            stackIn_156_1 = stackOut_155_1;
            if (param2 == null) {
              stackOut_157_0 = (RuntimeException) ((Object) stackIn_157_0);
              stackOut_157_1 = (StringBuilder) ((Object) stackIn_157_1);
              stackOut_157_2 = "null";
              stackIn_158_0 = stackOut_157_0;
              stackIn_158_1 = stackOut_157_1;
              stackIn_158_2 = stackOut_157_2;
              break L82;
            } else {
              stackOut_156_0 = (RuntimeException) ((Object) stackIn_156_0);
              stackOut_156_1 = (StringBuilder) ((Object) stackIn_156_1);
              stackOut_156_2 = "{...}";
              stackIn_158_0 = stackOut_156_0;
              stackIn_158_1 = stackOut_156_1;
              stackIn_158_2 = stackOut_156_2;
              break L82;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_158_0), stackIn_158_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int[] a(byte param0, int param1, float param2, int param3, boolean param4, int param5) {
        int discarded$0 = 0;
        if (param0 != 40) {
            discarded$0 = qma.a((byte) 28, 0.7337705479498259);
        }
        return this.a(param3, 0).a(param1, this.field_b[param3].field_e, param5, (double)param2, this.field_d, (d) (this), false);
    }

    final static int a(byte param0, double param1) {
        if (param0 != 123) {
            field_f = (String) null;
        }
        if (0.0 >= param1) {
            if (0.0 > param1) {
                return (int)(param1 - 0.5);
            }
            return 0;
        }
        return (int)(0.5 + param1);
    }

    static {
        field_c = false;
        field_f = "That name is not available";
    }
}
