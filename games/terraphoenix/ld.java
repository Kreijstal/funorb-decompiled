/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld {
    static int field_d;
    static int[] field_a;
    static int field_e;
    static ci field_c;
    static int[] field_h;
    static boolean field_b;
    em[] field_f;
    static String field_g;

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5859) {
            stackIn_2_0 = -6;
            return stackIn_2_0;
          }
          if (this.field_f != null &&
            0 < this.field_f.length) {
            stackIn_10_0 = this.field_f[-1 + this.field_f.length].field_a - this.field_f[0].field_e;
          } else {
            stackIn_10_0 = 0;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ld.K(" + param0 + ')');
        }
    }

    final static int a(char param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          if (param2 < 117) {
            ld.a((byte) 70, (String) null);
          }
          var3_int = 0;
          var4 = param1.length();
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 >= var4))) {
            stackIn_14_0 = ~param0;
            if (var6 == 0) {
              if (stackIn_14_0 == ~param1.charAt(var5)) {
                var3_int++;
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = var3_int;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ld.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(String param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Terraphoenix.field_V;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param0.length();
          var8 = 0;
          if (!param1) {
            stackIn_3_0 = 100;
            return stackIn_3_0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 <= var8))) {
            var9 = param0.charAt(var8);
            stackIn_25_0 = var9;
            stackIn_25_1 = 60;
            if (var10 == 0) {
              if (stackIn_25_0 != stackIn_25_1) {
                if (var9 == 62) {
                  var6 = 0;
                } else if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 1;
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_25_0 = 0;
            stackIn_25_1 = var5_int;
          }
          if (stackIn_25_0 < stackIn_25_1) {
            stackIn_28_0 = (param2 - param3 << 8) / var5_int;
            return stackIn_28_0;
          }
          stackIn_30_0 = 0;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_34_0 = var5;
          stackIn_34_1 = new StringBuilder().append("ld.F(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        em[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        em var5 = null;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          var3 = this.field_f;
          var4 = param1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3.length <= var4))) {
            var5 = var3[var4];
            stackIn_13_0 = var5.field_d.length;
            if (var6 == 0) {
              if (stackIn_13_0 > param0) {
                stackIn_10_0 = var5.field_d[param0];
                return stackIn_10_0;
              }
              param0 = param0 - (var5.field_d.length - 1);
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = 0;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3_ref), "ld.I(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_g = null;
          field_h = null;
          int var1_int = -77 % ((param0 + 56) / 34);
          field_c = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ld.D(" + param0 + ')');
        }
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        em[] var3 = null;
        int var4 = 0;
        em var5 = null;
        int var6 = 0;
        var7 = Terraphoenix.field_V;
        try {
          if (param0 != 0) {
            stackIn_3_0 = 25;
            return stackIn_3_0;
          }
          var2_int = -1;
          if (null != this.field_f) {
            var3 = this.field_f;
            var4 = 0;
            while (var3.length > var4) {
              var5 = var3[var4];
              if (null != var5) {
                var6 = var5.b(-1);
                if (var6 > var2_int) {
                  var2_int = var6;
                }
              }
              var4++;
              if (var7 == 0) {
                continue;
              }
              break;
            }
          }
          stackIn_16_0 = var2_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ld.C(" + param0 + ')');
        }
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        em var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          var3_int = param1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_f.length <= var3_int))) {
            var4 = this.field_f[var3_int];
            stackIn_11_0 = ~var4.field_d.length;
            if (var5 == 0) {
              if (stackIn_11_0 < ~param0) {
                stackIn_8_0 = var3_int;
                return stackIn_8_0;
              }
              param0 = param0 - (-1 + var4.field_d.length);
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = this.field_f.length;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "ld.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fg.field_e = param1;
          bm.a(12, (byte) 1);
          if (param0 != -29) {
            ld.a((byte) 95, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ld.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        try {
          hl.a((byte) -93, (String) null, "");
          if (param0 != 1) {
            field_d = -10;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ld.G(" + param0 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        em var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        try {
          if (null != this.field_f &&
            this.field_f.length != 0 &&
            param2 >= this.field_f[0].field_e) {
            if (param2 > this.field_f[this.field_f.length - 1].field_a) {
              stackIn_16_0 = -1;
              return stackIn_16_0;
            }
            if (param1 != -1) {
              this.a(106, 85);
            }
            if (1 == this.field_f.length) {
              stackIn_24_0 = this.field_f[0].a(param0, -119);
              return stackIn_24_0;
            }
            var4_int = 0;
            var5 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (this.field_f.length <= var5))) {
              var6 = this.field_f[var5];
              stackIn_45_0 = ~param2;
              if (var8 == 0) {
                if (stackIn_45_0 <= ~var6.field_e &&
                  var6.field_a >= param2) {
                  var7 = var6.a(param0, -118);
                  if (var7 == -1) {
                    stackIn_40_0 = -1;
                    return stackIn_40_0;
                  }
                  stackIn_42_0 = var4_int + var7;
                  return stackIn_42_0;
                }
                var4_int = var4_int + (-1 + var6.field_d.length);
                var5++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_45_0 = -1;
            }
            return stackIn_45_0;
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var4), "ld.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, ee param2, int param3, byte param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_35_0Lifetime1;
        int stackIn_35_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Terraphoenix.field_V;
        try {
          var5_int = je.a(-101, 3 * (-param3 + param0));
          var6 = 3 * param3;
          var7 = var5_int - 10;
          am.g((byte) -3);
          if (param2.field_I > 0 &&
            param2.field_f != null) {
            sd.a((byte) 87);
          }
          ae.field_I = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param2.field_l > var8)))) {
            var9 = param2.field_E[var8];
            var10 = param2.field_n[var8];
            var11 = param2.field_p[var8];
            stackOut_10_0 = param1;
            stackIn_44_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var19 == 0) {
              if (stackIn_11_0) {
                var12 = gm.field_l[var9];
                var13 = nb.field_c[var9];
                var14 = gm.field_l[var10] - var12;
                var15 = -var12 + gm.field_l[var11];
                var16 = nb.field_c[var10] - var13;
                var17 = nb.field_c[var11] - var13;
              }
              if (!stackIn_11_0 ||
                !(0 <= -(var16 * var15) + var14 * var17)) {
                var12Lifetime1 = gd.field_e[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = gd.field_e[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = gd.field_e[var11];
                    if (var14 != -2147483648) {
                      var15 = var14 + (var12Lifetime1 + var13Lifetime1) - var6;
                      stackIn_24_0 = fc.field_e.length - 1;
                      if (var7 < 0) {
                        stackIn_25_1 = var15 << -var7;
                      } else {
                        stackIn_25_1 = var15 >> var7;
                      }
                      var16 = stackIn_24_0 - stackIn_25_1;
                      var17 = fc.field_e[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_35_0 = -1;
                          stackIn_35_1 = ~var16;
                          if (stackIn_35_0 < stackIn_35_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = fc.field_e[var16];
                          continue;
                        }
                        stackIn_35_0Lifetime1 = var17;
                        stackIn_35_1Lifetime1 = var16 << 4;
                        var18 = stackIn_35_0Lifetime1 + stackIn_35_1Lifetime1;
                        qh.field_c[var18] = var8;
                        fc.field_e[var16] = 1 + var17;
                        if (param2.field_I > 0 &&
                          null != param2.field_f) {
                          dupTemp$0 = param2.field_f[var8];
                          dk.field_c[dupTemp$0] = dk.field_c[dupTemp$0] + 1;
                        }
                        ae.field_I = ae.field_I + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_44_0 = param4;
          }
          if (stackIn_44_0 <= 121) {
            return;
          }
          if (0 < param2.field_I &&
            null != param2.field_f) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(dk.field_c.length <= var9Lifetime1)) {
              var10Lifetime1 = dk.field_c[var9Lifetime1];
              dk.field_c[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_60_0 = var5;
          stackIn_60_1 = new StringBuilder().append("ld.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_g = "Please try again in a few minutes.";
        field_h = new int[8192];
    }
}
