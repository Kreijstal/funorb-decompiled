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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
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
        var11 = StarCannon.field_A;
        try {
          L0: {
            if (param2 == 0) {
              stackIn_4_0 = 0;
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
                      dupTemp$0 = this.field_b[var7_int];
                      var10 = dupTemp$0;
                      if (dupTemp$0 < 0) {
                        incrementValue$1 = param5;
                        param5++;
                        param3[incrementValue$1] = (byte)(var10 ^ -1);
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
                      dupTemp$2 = this.field_b[var7_int];
                      var10 = dupTemp$2;
                      if (-1 >= (dupTemp$2 ^ -1)) {
                        break L6;
                      } else {
                        incrementValue$3 = param5;
                        param5++;
                        param3[incrementValue$3] = (byte)(var10 ^ -1);
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
                      dupTemp$4 = this.field_b[var7_int];
                      var10 = dupTemp$4;
                      if (-1 >= (dupTemp$4 ^ -1)) {
                        break L8;
                      } else {
                        incrementValue$5 = param5;
                        param5++;
                        param3[incrementValue$5] = (byte)(var10 ^ -1);
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
                      dupTemp$6 = this.field_b[var7_int];
                      var10 = dupTemp$6;
                      if (-1 >= (dupTemp$6 ^ -1)) {
                        break L10;
                      } else {
                        incrementValue$7 = param5;
                        param5++;
                        param3[incrementValue$7] = (byte)(var10 ^ -1);
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
                      dupTemp$8 = this.field_b[var7_int];
                      var10 = dupTemp$8;
                      if (dupTemp$8 < 0) {
                        incrementValue$9 = param5;
                        param5++;
                        param3[incrementValue$9] = (byte)(var10 ^ -1);
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
                      dupTemp$10 = this.field_b[var7_int];
                      var10 = dupTemp$10;
                      if (dupTemp$10 < 0) {
                        incrementValue$11 = param5;
                        param5++;
                        param3[incrementValue$11] = (byte)(var10 ^ -1);
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
                      dupTemp$12 = this.field_b[var7_int];
                      var10 = dupTemp$12;
                      if (0 <= dupTemp$12) {
                        break L16;
                      } else {
                        incrementValue$13 = param5;
                        param5++;
                        param3[incrementValue$13] = (byte)(var10 ^ -1);
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
                      dupTemp$14 = this.field_b[var7_int];
                      var10 = dupTemp$14;
                      if (dupTemp$14 < 0) {
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
                  stackIn_66_0 = 1 + (var8 + -param4);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = -63;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("b.B(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_70_0), stackIn_73_2 + ',' + param4 + ',' + param5 + ')');
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) < -256) {
                stackIn_7_0 = ai.field_a;
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
                      stackIn_20_0 = vf.a(var3[-1 + var3.length], (byte) -18);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ad.a(-127, var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackIn_15_0 = (sk) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = qb.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = qb.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("b.D(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
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
