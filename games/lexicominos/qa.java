/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static String field_b;
    private int[] field_a;
    static la field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 < 42) {
            qa.a(101);
        }
    }

    final static void b(int param0) {
        wb.field_g = null;
        af.field_a = null;
        if (param0 != 0) {
            qa.b(-30);
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
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
        int stackIn_78_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_84_1 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if ((param0 ^ -1) != param1) {
              var7_int = 0;
              param0 = param0 + param3;
              var8 = param4;
              L1: while (true) {
                L2: {
                  L3: {
                    var9 = param2[var8];
                    if (-1 < (var9 ^ -1)) {
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
                    if (-1 < (dupTemp$0 ^ -1)) {
                      incrementValue$1 = param3;
                      param3++;
                      param5[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param3 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((var9 & 64) != 0) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
                        break L6;
                      } else {
                        var7_int++;
                        break L6;
                      }
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_a[var7_int];
                    var10 = dupTemp$2;
                    if (-1 < (dupTemp$2 ^ -1)) {
                      L8: {
                        incrementValue$3 = param3;
                        param3++;
                        param5[incrementValue$3] = (byte)(var10 ^ -1);
                        if (param0 > param3) {
                          break L8;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var7_int = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    if ((var9 & 32) != 0) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
                        break L9;
                      } else {
                        var7_int++;
                        break L9;
                      }
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    dupTemp$4 = this.field_a[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L10;
                    } else {
                      L11: {
                        incrementValue$5 = param3;
                        param3++;
                        param5[incrementValue$5] = (byte)(var10 ^ -1);
                        if (param3 < param0) {
                          break L11;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var7_int = 0;
                      break L10;
                    }
                  }
                  L12: {
                    L13: {
                      if ((var9 & 16) != 0) {
                        break L13;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L12;
                  }
                  L14: {
                    dupTemp$6 = this.field_a[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      L15: {
                        incrementValue$7 = param3;
                        param3++;
                        param5[incrementValue$7] = (byte)(var10 ^ -1);
                        if (param3 < param0) {
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
                    } else {
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
                      L19: {
                        incrementValue$9 = param3;
                        param3++;
                        param5[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param0 > param3) {
                          break L19;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var7_int = 0;
                      break L18;
                    }
                  }
                  L20: {
                    L21: {
                      if ((var9 & 4) != 0) {
                        break L21;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L20;
                  }
                  L22: {
                    dupTemp$10 = this.field_a[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 >= 0) {
                      break L22;
                    } else {
                      incrementValue$11 = param3;
                      param3++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param0 <= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (0 != (var9 & 2)) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
                        break L23;
                      } else {
                        var7_int++;
                        break L23;
                      }
                    } else {
                      var7_int++;
                      break L23;
                    }
                  }
                  L24: {
                    dupTemp$12 = this.field_a[var7_int];
                    var10 = dupTemp$12;
                    if (-1 < (dupTemp$12 ^ -1)) {
                      L25: {
                        incrementValue$13 = param3;
                        param3++;
                        param5[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param0 > param3) {
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
                    } else {
                      break L24;
                    }
                  }
                  L26: {
                    L27: {
                      if (-1 != (var9 & 1 ^ -1)) {
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
                    if (dupTemp$14 >= 0) {
                      break L28;
                    } else {
                      incrementValue$15 = param3;
                      param3++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param3 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L28;
                      }
                    }
                  }
                  var8++;
                  if (var11 == 0) {
                    continue L1;
                  } else {
                    break L4;
                  }
                }
                stackIn_78_0 = var8 - (-1 + param4);
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
          L29: {
            var7 = decompiledCaughtException;
            stackIn_81_0 = (RuntimeException) (var7);

            stackIn_81_1 = new StringBuilder().append("qa.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L29;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_84_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "null";
              break L30;
            } else {
              stackIn_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "{...}";
              break L30;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_82_0), stackIn_85_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_78_0;
        }
    }

    private qa() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Unpacking animations";
    }
}
