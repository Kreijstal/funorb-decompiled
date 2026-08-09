/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static int field_b;
    static boolean field_a;
    static String field_d;
    private int[] field_c;

    final static void a(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            dj.a();
            ml.field_d = 11;
            w.field_R = new int[260];
            var1_int = 0;
            L1: while (true) {
              if ((var1_int ^ -1) <= -257) {
                L2: {
                  if (param0 == 8) {
                    break L2;
                  } else {
                    ul.a((byte) 48);
                    break L2;
                  }
                }
                var5 = 256;
                var1_int = var5;
                L3: while (true) {
                  if (var5 >= w.field_R.length) {
                    break L0;
                  } else {
                    w.field_R[var5] = 255;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var2 = 15.0;
                w.field_R[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ul.C(" + param0 + ')');
        }
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
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
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param5 == 256) {
              if (param2 != 0) {
                var7_int = 0;
                param2 = param2 + param1;
                var8 = param0;
                L1: while (true) {
                  L2: {
                    var9 = param3[var8];
                    if (0 <= var9) {
                      var7_int++;
                      break L2;
                    } else {
                      var7_int = this.field_c[var7_int];
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      dupTemp$0 = this.field_c[var7_int];
                      var10 = dupTemp$0;
                      if (dupTemp$0 < 0) {
                        incrementValue$1 = param1;
                        param1++;
                        param4[incrementValue$1] = (byte)(var10 ^ -1);
                        if (param2 > param1) {
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
                      if (0 == (var9 & 64)) {
                        var7_int++;
                        break L5;
                      } else {
                        var7_int = this.field_c[var7_int];
                        break L5;
                      }
                    }
                    L6: {
                      dupTemp$2 = this.field_c[var7_int];
                      var10 = dupTemp$2;
                      if (dupTemp$2 >= 0) {
                        break L6;
                      } else {
                        incrementValue$3 = param1;
                        param1++;
                        param4[incrementValue$3] = (byte)(var10 ^ -1);
                        if (param2 <= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((32 & var9) == 0) {
                        var7_int++;
                        break L7;
                      } else {
                        var7_int = this.field_c[var7_int];
                        break L7;
                      }
                    }
                    L8: {
                      dupTemp$4 = this.field_c[var7_int];
                      var10 = dupTemp$4;
                      if (dupTemp$4 < 0) {
                        incrementValue$5 = param1;
                        param1++;
                        param4[incrementValue$5] = (byte)(var10 ^ -1);
                        if (param1 >= param2) {
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
                        var7_int = this.field_c[var7_int];
                        break L9;
                      }
                    }
                    L10: {
                      dupTemp$6 = this.field_c[var7_int];
                      var10 = dupTemp$6;
                      if (dupTemp$6 < 0) {
                        incrementValue$7 = param1;
                        param1++;
                        param4[incrementValue$7] = (byte)(var10 ^ -1);
                        if (param1 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((8 & var9) == 0) {
                        var7_int++;
                        break L11;
                      } else {
                        var7_int = this.field_c[var7_int];
                        break L11;
                      }
                    }
                    L12: {
                      dupTemp$8 = this.field_c[var7_int];
                      var10 = dupTemp$8;
                      if (dupTemp$8 < 0) {
                        incrementValue$9 = param1;
                        param1++;
                        param4[incrementValue$9] = (byte)(var10 ^ -1);
                        if (param1 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if ((var9 & 4) == 0) {
                        var7_int++;
                        break L13;
                      } else {
                        var7_int = this.field_c[var7_int];
                        break L13;
                      }
                    }
                    L14: {
                      dupTemp$10 = this.field_c[var7_int];
                      var10 = dupTemp$10;
                      if (dupTemp$10 < 0) {
                        incrementValue$11 = param1;
                        param1++;
                        param4[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param1 < param2) {
                          var7_int = 0;
                          break L14;
                        } else {
                          return var8 - -1 - param0;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if ((var9 & 2) != 0) {
                        var7_int = this.field_c[var7_int];
                        break L15;
                      } else {
                        var7_int++;
                        break L15;
                      }
                    }
                    L16: {
                      dupTemp$12 = this.field_c[var7_int];
                      var10 = dupTemp$12;
                      if (0 > dupTemp$12) {
                        incrementValue$13 = param1;
                        param1++;
                        param4[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param2 <= param1) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (0 != (1 & var9)) {
                        var7_int = this.field_c[var7_int];
                        break L17;
                      } else {
                        var7_int++;
                        break L17;
                      }
                    }
                    L18: {
                      dupTemp$14 = this.field_c[var7_int];
                      var10 = dupTemp$14;
                      if (dupTemp$14 < 0) {
                        incrementValue$15 = param1;
                        param1++;
                        param4[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param1 >= param2) {
                          break L3;
                        } else {
                          var7_int = 0;
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                  stackIn_67_0 = var8 - -1 - param0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 94;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("ul.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L19;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param4 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L20;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L20;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_71_0), stackIn_74_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_67_0;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 14) {
            field_a = true;
        }
    }

    private ul() throws Throwable {
        throw new Error();
    }

    static {
        field_d = "Waiting for graphics";
    }
}
