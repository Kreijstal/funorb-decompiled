/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static int[] field_c;
    static String field_d;
    static String field_a;
    private int[] field_b;
    static String field_e;

    final int a(byte param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = StarCannon.field_A;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 >= 22) {
                param2 = param2 + param5;
                var7_int = 0;
                var8 = param4;
                L1: while (true) {
                  L2: {
                    var9 = param1[var8];
                    if (-1 < (var9 ^ -1)) {
                      var7_int = this.field_b[var7_int];
                      break L2;
                    } else {
                      var7_int++;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var10 = this.field_b[var7_int];
                      if (this.field_b[var7_int] < 0) {
                        incrementValue$8 = param5;
                        param5++;
                        param3[incrementValue$8] = (byte)(var10 ^ -1);
                        if (param5 < param2) {
                          var7_int = 0;
                          break L4;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((64 & var9) == 0) {
                        var7_int++;
                        break L5;
                      } else {
                        var7_int = this.field_b[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      var10 = this.field_b[var7_int];
                      if (-1 >= (this.field_b[var7_int] ^ -1)) {
                        break L6;
                      } else {
                        incrementValue$9 = param5;
                        param5++;
                        param3[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param2 <= param5) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((var9 & 32) == 0) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = this.field_b[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      var10 = this.field_b[var7_int];
                      if (-1 >= (this.field_b[var7_int] ^ -1)) {
                        break L8;
                      } else {
                        incrementValue$10 = param5;
                        param5++;
                        param3[incrementValue$10] = (byte)(var10 ^ -1);
                        if (param5 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (-1 == (16 & var9 ^ -1)) {
                        var7_int++;
                        break L9;
                      } else {
                        var7_int = this.field_b[var7_int];
                        break L9;
                      }
                    }
                    L10: {
                      var10 = this.field_b[var7_int];
                      if (-1 >= (this.field_b[var7_int] ^ -1)) {
                        break L10;
                      } else {
                        incrementValue$11 = param5;
                        param5++;
                        param3[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param2 <= param5) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (0 == (var9 & 8)) {
                        var7_int++;
                        break L11;
                      } else {
                        var7_int = this.field_b[var7_int];
                        break L11;
                      }
                    }
                    L12: {
                      var10 = this.field_b[var7_int];
                      if (this.field_b[var7_int] < 0) {
                        incrementValue$12 = param5;
                        param5++;
                        param3[incrementValue$12] = (byte)(var10 ^ -1);
                        if (param5 < param2) {
                          var7_int = 0;
                          break L12;
                        } else {
                          return 1 + (var8 + -param4);
                        }
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (0 == (var9 & 4)) {
                        var7_int++;
                        break L13;
                      } else {
                        var7_int = this.field_b[var7_int];
                        break L13;
                      }
                    }
                    L14: {
                      var10 = this.field_b[var7_int];
                      if (this.field_b[var7_int] < 0) {
                        incrementValue$13 = param5;
                        param5++;
                        param3[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param5 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if ((2 & var9) == 0) {
                        var7_int++;
                        break L15;
                      } else {
                        var7_int = this.field_b[var7_int];
                        break L15;
                      }
                    }
                    L16: {
                      var10 = this.field_b[var7_int];
                      if (0 <= this.field_b[var7_int]) {
                        break L16;
                      } else {
                        incrementValue$14 = param5;
                        param5++;
                        param3[incrementValue$14] = (byte)(var10 ^ -1);
                        if (param5 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if ((1 & var9) != 0) {
                        var7_int = this.field_b[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    L18: {
                      var10 = this.field_b[var7_int];
                      if (this.field_b[var7_int] < 0) {
                        incrementValue$15 = param5;
                        param5++;
                        param3[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param5 < param2) {
                          var7_int = 0;
                          break L18;
                        } else {
                          break L3;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackOut_65_0 = 1 + (var8 + -param4);
                  stackIn_66_0 = stackOut_65_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = -63;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var7);
            stackOut_67_1 = new StringBuilder().append("b.B(").append(param0).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L19;
            }
          }
          L20: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L20;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L20;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_66_0;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            b.a(true);
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static ue a(boolean param0, int param1) {
        if (param0) {
            b.a(true);
        }
        return ri.a(true, false, 1, param1, false, true);
    }

    private b() throws Throwable {
        throw new Error();
    }

    final static sk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        sk var7 = null;
        int var8 = 0;
        sk stackIn_3_0 = null;
        sk stackIn_7_0 = null;
        sk stackIn_10_0 = null;
        sk stackIn_15_0 = null;
        sk stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sk stackOut_6_0 = null;
        sk stackOut_19_0 = null;
        sk stackOut_14_0 = null;
        sk stackOut_9_0 = null;
        sk stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) < -256) {
                stackOut_6_0 = ai.field_a;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = uj.a(-29, '.', param0);
                if (-3 >= (var3.length ^ -1)) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      L2: {
                        if (param1 >= 108) {
                          break L2;
                        } else {
                          field_d = (String) null;
                          break L2;
                        }
                      }
                      stackOut_19_0 = vf.a(var3[-1 + var3.length], (byte) -18);
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ad.a(-127, var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_14_0 = (sk) (var7);
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = qb.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = qb.field_b;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("b.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    static {
        field_c = new int[8];
        field_d = "HELIX POWER:";
        field_a = "No highscores";
    }
}
