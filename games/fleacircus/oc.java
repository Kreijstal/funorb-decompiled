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
        int stackIn_79_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
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
                      dupTemp$0 = this.field_a[var7_int];
                      var10 = dupTemp$0;
                      if (0 <= dupTemp$0) {
                        break L5;
                      } else {
                        L6: {
                          incrementValue$1 = param2;
                          param2++;
                          param4[incrementValue$1] = (byte)(var10 ^ -1);
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
                      dupTemp$2 = this.field_a[var7_int];
                      var10 = dupTemp$2;
                      if (0 <= dupTemp$2) {
                        break L9;
                      } else {
                        incrementValue$3 = param2;
                        param2++;
                        param4[incrementValue$3] = (byte)(var10 ^ -1);
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
                      dupTemp$4 = this.field_a[var7_int];
                      var10 = dupTemp$4;
                      if (dupTemp$4 < 0) {
                        incrementValue$5 = param2;
                        param2++;
                        param4[incrementValue$5] = (byte)(var10 ^ -1);
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
                      dupTemp$6 = this.field_a[var7_int];
                      var10 = dupTemp$6;
                      if (0 <= dupTemp$6) {
                        break L14;
                      } else {
                        L15: {
                          incrementValue$7 = param2;
                          param2++;
                          param4[incrementValue$7] = (byte)(var10 ^ -1);
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
                      dupTemp$8 = this.field_a[var7_int];
                      var10 = dupTemp$8;
                      if (-1 >= (dupTemp$8 ^ -1)) {
                        break L18;
                      } else {
                        incrementValue$9 = param2;
                        param2++;
                        param4[incrementValue$9] = (byte)(var10 ^ -1);
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
                      dupTemp$10 = this.field_a[var7_int];
                      var10 = dupTemp$10;
                      if (dupTemp$10 < 0) {
                        L21: {
                          incrementValue$11 = param2;
                          param2++;
                          param4[incrementValue$11] = (byte)(var10 ^ -1);
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
                      dupTemp$12 = this.field_a[var7_int];
                      var10 = dupTemp$12;
                      if (-1 >= (dupTemp$12 ^ -1)) {
                        break L24;
                      } else {
                        L25: {
                          incrementValue$13 = param2;
                          param2++;
                          param4[incrementValue$13] = (byte)(var10 ^ -1);
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
                      dupTemp$14 = this.field_a[var7_int];
                      var10 = dupTemp$14;
                      if (-1 >= (dupTemp$14 ^ -1)) {
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
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L4;
                    }
                  }
                  stackIn_79_0 = 1 + (var8 + -param1);
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
          L30: {
            var7 = decompiledCaughtException;
            stackIn_82_0 = (RuntimeException) (var7);

            stackIn_82_1 = new StringBuilder().append("oc.A(");

            if (param0 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L30;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L30;
            }
          }
          L31: {


            stackIn_85_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "null";
              break L31;
            } else {
              stackIn_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "{...}";
              break L31;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_83_0), stackIn_86_2 + ',' + param5 + ')');
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
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
                  stackIn_14_0 = 0;
                  break L6;
                } else {
                  stackIn_14_0 = 1;
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
            stackIn_18_0 = (RuntimeException) (runtimeException);

            stackIn_18_1 = new StringBuilder().append("oc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
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
