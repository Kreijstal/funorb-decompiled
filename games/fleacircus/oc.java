/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static String field_b;
    static String field_d;
    private int[] field_a;
    static String field_c;

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
                    var9 = param0[var8];
                    if (0 > var9) {
                      var7_int = this.field_a[var7_int];
                      break L2;
                    } else {
                      var7_int++;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      dupTemp$0 = this.field_a[var7_int];
                      var10 = dupTemp$0;
                      if (0 <= dupTemp$0) {
                        break L4;
                      } else {
                        incrementValue$1 = param2;
                        param2++;
                        param4[incrementValue$1] = (byte)(var10 ^ -1);
                        if (param3 > param2) {
                          var7_int = 0;
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if ((var9 & 64) != 0) {
                        var7_int = this.field_a[var7_int];
                        break L5;
                      } else {
                        var7_int++;
                        break L5;
                      }
                    }
                    L6: {
                      dupTemp$2 = this.field_a[var7_int];
                      var10 = dupTemp$2;
                      if (0 <= dupTemp$2) {
                        break L6;
                      } else {
                        incrementValue$3 = param2;
                        param2++;
                        param4[incrementValue$3] = (byte)(var10 ^ -1);
                        if (param3 <= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((32 & var9) != 0) {
                        var7_int = this.field_a[var7_int];
                        break L7;
                      } else {
                        var7_int++;
                        break L7;
                      }
                    }
                    L8: {
                      dupTemp$4 = this.field_a[var7_int];
                      var10 = dupTemp$4;
                      if (dupTemp$4 < 0) {
                        incrementValue$5 = param2;
                        param2++;
                        param4[incrementValue$5] = (byte)(var10 ^ -1);
                        if (param2 >= param3) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if ((var9 & 16) == 0) {
                        var7_int++;
                        break L9;
                      } else {
                        var7_int = this.field_a[var7_int];
                        break L9;
                      }
                    }
                    L10: {
                      dupTemp$6 = this.field_a[var7_int];
                      var10 = dupTemp$6;
                      if (0 <= dupTemp$6) {
                        break L10;
                      } else {
                        incrementValue$7 = param2;
                        param2++;
                        param4[incrementValue$7] = (byte)(var10 ^ -1);
                        if (param2 < param3) {
                          var7_int = 0;
                          break L10;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L11: {
                      if (-1 != (var9 & 8 ^ -1)) {
                        var7_int = this.field_a[var7_int];
                        break L11;
                      } else {
                        var7_int++;
                        break L11;
                      }
                    }
                    L12: {
                      dupTemp$8 = this.field_a[var7_int];
                      var10 = dupTemp$8;
                      if (-1 >= (dupTemp$8 ^ -1)) {
                        break L12;
                      } else {
                        incrementValue$9 = param2;
                        param2++;
                        param4[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param3 <= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (-1 == (4 & var9 ^ -1)) {
                        var7_int++;
                        break L13;
                      } else {
                        var7_int = this.field_a[var7_int];
                        break L13;
                      }
                    }
                    L14: {
                      dupTemp$10 = this.field_a[var7_int];
                      var10 = dupTemp$10;
                      if (dupTemp$10 < 0) {
                        incrementValue$11 = param2;
                        param2++;
                        param4[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param3 > param2) {
                          var7_int = 0;
                          break L14;
                        } else {
                          break L3;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if ((var9 & 2) != 0) {
                        var7_int = this.field_a[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      dupTemp$12 = this.field_a[var7_int];
                      var10 = dupTemp$12;
                      if (-1 >= (dupTemp$12 ^ -1)) {
                        break L16;
                      } else {
                        incrementValue$13 = param2;
                        param2++;
                        param4[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param2 < param3) {
                          var7_int = 0;
                          break L16;
                        } else {
                          return 1 + (var8 + -param1);
                        }
                      }
                    }
                    L17: {
                      if (-1 != (1 & var9 ^ -1)) {
                        var7_int = this.field_a[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    L18: {
                      dupTemp$14 = this.field_a[var7_int];
                      var10 = dupTemp$14;
                      if (-1 >= (dupTemp$14 ^ -1)) {
                        break L18;
                      } else {
                        incrementValue$15 = param2;
                        param2++;
                        param4[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param3 > param2) {
                          var7_int = 0;
                          break L18;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackIn_66_0 = 1 + (var8 + -param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 92;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("oc.A(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L19;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L20;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L20;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_66_0;
          }
        }
    }

    final static void a(boolean param0, String[] param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            cb.field_v = ui.field_ob;
            if (-256 == (param2 ^ -1)) {
              L2: {
                if (13 <= ug.field_c) {
                  stackIn_12_0 = 0;
                  break L2;
                } else {
                  stackIn_12_0 = 1;
                  break L2;
                }
              }
              rl.field_b = ld.a(stackIn_12_0 != 0, (byte) 42);
              break L0;
            } else {
              L3: {
                if (param2 < 100) {
                  break L3;
                } else {
                  if ((param2 ^ -1) >= -106) {
                    rl.field_b = ha.a(param1, -21916);
                    return;
                  } else {
                    break L3;
                  }
                }
              }
              rl.field_b = af.a((byte) 36, param2, param3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("oc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ha.a(param0, -32180, param2, param1)) {
              if (param3 < -95) {
                stackIn_7_0 = me.b(120);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (dd[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("oc.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
