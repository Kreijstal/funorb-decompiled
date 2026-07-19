/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static String field_b;
    static String field_d;
    private int[] field_a;
    static String field_c;

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, int param5) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_78_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (0 != param3) {
              var7_int = 0;
              if (param5 == -1) {
                param3 = param3 + param2;
                var8 = param1;
                L1: while (true) {
                  L2: {
                    L3: {
                      var9 = param0[var8];
                      if (0 > var9) {
                        break L3;
                      } else {
                        var7_int++;
                        if (var11 != 0) {
                          break L2;
                        } else {
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L2;
                  }
                  L4: {
                    L5: {
                      var10 = this.field_a[var7_int];
                      if (0 <= this.field_a[var7_int]) {
                        break L5;
                      } else {
                        L6: {
                          incrementValue$8 = param2;
                          param2++;
                          param4[incrementValue$8] = (byte)(var10 ^ -1);
                          if (param3 > param2) {
                            break L6;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7_int = 0;
                        break L5;
                      }
                    }
                    L7: {
                      L8: {
                        if ((var9 & 64) != 0) {
                          break L8;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var7_int = this.field_a[var7_int];
                      break L7;
                    }
                    L9: {
                      var10 = this.field_a[var7_int];
                      if (0 <= this.field_a[var7_int]) {
                        break L9;
                      } else {
                        incrementValue$9 = param2;
                        param2++;
                        param4[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param3 <= param2) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L9;
                        }
                      }
                    }
                    L10: {
                      L11: {
                        if ((32 & var9) != 0) {
                          break L11;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var7_int = this.field_a[var7_int];
                      break L10;
                    }
                    L12: {
                      var10 = this.field_a[var7_int];
                      if (this.field_a[var7_int] < 0) {
                        incrementValue$10 = param2;
                        param2++;
                        param4[incrementValue$10] = (byte)(var10 ^ -1);
                        if (param2 >= param3) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if ((var9 & 16) != 0) {
                        var7_int = this.field_a[var7_int];
                        if (var11 == 0) {
                          break L13;
                        } else {
                          var7_int++;
                          break L13;
                        }
                      } else {
                        var7_int++;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = this.field_a[var7_int];
                      if (0 <= this.field_a[var7_int]) {
                        break L14;
                      } else {
                        L15: {
                          incrementValue$11 = param2;
                          param2++;
                          param4[incrementValue$11] = (byte)(var10 ^ -1);
                          if (param2 < param3) {
                            break L15;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var7_int = 0;
                        break L14;
                      }
                    }
                    L16: {
                      L17: {
                        if (-1 != (var9 & 8 ^ -1)) {
                          break L17;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var7_int = this.field_a[var7_int];
                      break L16;
                    }
                    L18: {
                      var10 = this.field_a[var7_int];
                      if (-1 >= (this.field_a[var7_int] ^ -1)) {
                        break L18;
                      } else {
                        incrementValue$12 = param2;
                        param2++;
                        param4[incrementValue$12] = (byte)(var10 ^ -1);
                        if (param3 <= param2) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (-1 != (4 & var9 ^ -1)) {
                        var7_int = this.field_a[var7_int];
                        if (var11 == 0) {
                          break L19;
                        } else {
                          var7_int++;
                          break L19;
                        }
                      } else {
                        var7_int++;
                        break L19;
                      }
                    }
                    L20: {
                      var10 = this.field_a[var7_int];
                      if (this.field_a[var7_int] < 0) {
                        L21: {
                          incrementValue$13 = param2;
                          param2++;
                          param4[incrementValue$13] = (byte)(var10 ^ -1);
                          if (param3 > param2) {
                            break L21;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L21;
                            }
                          }
                        }
                        var7_int = 0;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L22: {
                      L23: {
                        if ((var9 & 2) != 0) {
                          break L23;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var7_int = this.field_a[var7_int];
                      break L22;
                    }
                    L24: {
                      var10 = this.field_a[var7_int];
                      if (-1 >= (this.field_a[var7_int] ^ -1)) {
                        break L24;
                      } else {
                        L25: {
                          incrementValue$14 = param2;
                          param2++;
                          param4[incrementValue$14] = (byte)(var10 ^ -1);
                          if (param2 < param3) {
                            break L25;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L25;
                            }
                          }
                        }
                        var7_int = 0;
                        break L24;
                      }
                    }
                    L26: {
                      L27: {
                        if (-1 != (1 & var9 ^ -1)) {
                          break L27;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      var7_int = this.field_a[var7_int];
                      break L26;
                    }
                    L28: {
                      var10 = this.field_a[var7_int];
                      if (-1 >= (this.field_a[var7_int] ^ -1)) {
                        break L28;
                      } else {
                        L29: {
                          incrementValue$15 = param2;
                          param2++;
                          param4[incrementValue$15] = (byte)(var10 ^ -1);
                          if (param3 > param2) {
                            break L29;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L29;
                            }
                          }
                        }
                        var7_int = 0;
                        break L28;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_78_0 = 1 + (var8 + -param1);
                  stackIn_79_0 = stackOut_78_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 92;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var7 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var7);
            stackOut_80_1 = new StringBuilder().append("oc.A(");
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param0 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L30;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L30;
            }
          }
          L31: {
            stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
            stackOut_83_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param4 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L31;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L31;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_79_0;
          }
        }
    }

    final static void a(boolean param0, String[] param1, int param2, String param3) {
        RuntimeException runtimeException = null;
        int var5 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                cb.field_v = ui.field_ob;
                if (-256 == (param2 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (param2 < 100) {
                        break L5;
                      } else {
                        if ((param2 ^ -1) >= -106) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    rl.field_b = af.a((byte) 36, param2, param3);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                  rl.field_b = ha.a(param1, -21916);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (13 <= ug.field_c) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L6;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L6;
                }
              }
              rl.field_b = ld.a(stackIn_14_0 != 0, (byte) 42);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("oc.C(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        int var1 = -85 / ((58 - param0) / 44);
    }

    private oc() throws Throwable {
        throw new Error();
    }

    final static dd[] a(rh param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dd[] stackIn_5_0 = null;
        dd[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_6_0 = null;
        dd[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (ha.a(param0, -32180, param2, param1)) {
              if (param3 < -95) {
                stackOut_6_0 = me.b(120);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (dd[]) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("oc.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dd[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    static {
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_d = "<%0>Basic wall:<%1> merely gets in the fleas' way (one of the three tiles you can place yourself).";
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
