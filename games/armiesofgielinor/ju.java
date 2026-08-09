/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ju {
    static wk[][] field_a;
    ts[] field_b;
    static int[] field_c;

    final int a(byte param0) {
        int var2;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var2 = -76 / ((param0 - 74) / 32);
            if (this.field_b == null) {
              break L1;
            } else {
              if (0 >= this.field_b.length) {
                break L1;
              } else {
                stackIn_4_0 = this.field_b[-1 + this.field_b.length].field_c - this.field_b[0].field_n;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
          break L0;
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        ts var6 = null;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_b == null || 0 == this.field_b.length || this.field_b[0].field_n > param1) {
            return -1;
        }
        if (param1 > this.field_b[this.field_b.length + param2].field_c) {
            return -1;
        }
        if (-2 == (this.field_b.length ^ -1)) {
            return this.field_b[0].a(param0, (byte) 29);
        }
        int var4 = 0;
        for (var5 = 0; this.field_b.length > var5; var5++) {
            var6 = this.field_b[var5];
            if (param1 >= var6.field_n && param1 <= var6.field_c) {
                var7 = var6.a(param0, (byte) 29);
                if (!(0 != (var7 ^ -1))) {
                    return -1;
                }
                return var4 - -var7;
            }
            var4 = var4 + (-1 + var6.field_i.length);
        }
        return -1;
    }

    final static int a(bv param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        bv var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 <= -121) {
                break L1;
              } else {
                var7 = (bv) null;
                ju.a((bv) null, 120, 29, -83, (byte) -93, 59);
                break L1;
              }
            }
            var6_int = param0.g(-106, 1);
            if (0 != var6_int) {
              if (1 == var6_int) {
                stackIn_10_0 = param0.g(95, param3) - -param1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new IllegalStateException();
              }
            } else {
              L2: {
                if ((param5 ^ -1) < -1) {
                  stackIn_6_0 = param0.g(-109, param5);
                  break L2;
                } else {
                  stackIn_6_0 = 0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("ju.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ju.a(-112);
                break L1;
              }
            }
            stackIn_3_0 = ob.a(param1, true, param2, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ju.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(boolean param0) {
        int var2;
        ts[] var3;
        int var4;
        ts var5;
        int var7;
        int var6;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = -1;
          if (this.field_b == null) {
            break L0;
          } else {
            var3 = this.field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(0);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            field_a = (wk[][]) null;
            break L2;
          }
        }
        return var2;
    }

    final int a(byte param0, int param1) {
        ts[] var3;
        int var4;
        ts var5;
        int var6;
        ts[] var7;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var7 = this.field_b;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            if (param0 == -66) {
              return 0;
            } else {
              this.a(true);
              return 0;
            }
          } else {
            var5 = var7[var4];
            if ((var5.field_i.length ^ -1) < (param1 ^ -1)) {
              return var5.field_i[param1];
            } else {
              param1 = param1 - (-1 + var5.field_i.length);
              var4++;
              continue L0;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        ts var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var3 = param0; this.field_b.length > var3; var3++) {
            var4 = this.field_b[var3];
            if (!(var4.field_i.length <= param1)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_i.length);
        }
        return this.field_b.length;
    }

    public static void a(int param0) {
        if (param0 >= -111) {
            CharSequence var2 = (CharSequence) null;
            ju.a(-42, 6, (CharSequence) null);
        }
        field_c = null;
        field_a = (wk[][]) null;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = param0;
            L1: while (true) {
              if (var7 <= var8) {
                if ((var5_int ^ -1) < -1) {
                  stackIn_18_0 = (-param3 + param2 << -1853594840) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param1.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (var9 == 62) {
                      var6 = 0;
                      break L2;
                    } else {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("ju.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return stackIn_20_0;
        }
    }

    static {
        field_c = new int[8192];
    }
}
