/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends fn implements eg {
    static boolean field_Z;
    private int field_W;
    private n field_bb;
    static String field_Y;
    static String field_X;
    static long field_ab;

    final void d(byte param0) {
        n discarded$2 = null;
        if (param0 >= -114) {
          L0: {
            discarded$2 = this.a(-106);
            super.d((byte) -117);
            if (null != this.field_bb) {
              this.field_bb.a(124);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.d((byte) -117);
            if (null != this.field_bb) {
              this.field_bb.a(124);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final String h(int param0) {
        if (this.field_t) {
          if (this.field_s != null) {
            ip.a(ko.field_b, this.field_l - this.field_W + sm.field_d, (byte) 113);
            if (param0 != 21384) {
              return (String) null;
            } else {
              return this.field_s;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static ls[] a(int param0, hd param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        ls[] var4 = null;
        int var5 = 0;
        ls var6 = null;
        int var7 = 0;
        wo var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        ls[] stackIn_3_0 = null;
        ls[] stackIn_11_0 = null;
        ls[] stackIn_17_0 = null;
        ls[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ls[] stackOut_10_0 = null;
        ls[] stackOut_16_0 = null;
        ls[] stackOut_19_0 = null;
        ls[] stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1.b(false)) {
              var8 = param1.b(-20681);
              L1: while (true) {
                L2: {
                  L3: {
                    if (0 != var8.field_g) {
                      break L3;
                    } else {
                      nu.a(10L, 0);
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (2 != var8.field_g) {
                    break L2;
                  } else {
                    stackOut_10_0 = new ls[]{};
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                L4: {
                  var10 = (int[]) (var8.field_f);
                  var9 = var10;
                  var3 = var9;
                  var4 = new ls[var10.length >> 332236098];
                  if (param0 < -3) {
                    break L4;
                  } else {
                    field_X = (String) null;
                    break L4;
                  }
                }
                var5 = 0;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var5 >= var4.length) {
                        break L7;
                      } else {
                        var6 = new ls();
                        stackOut_16_0 = (ls[]) (var4);
                        stackIn_20_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var7 != 0) {
                          break L6;
                        } else {
                          stackIn_17_0[var5] = var6;
                          var6.field_b = var3[var5 << -918933630];
                          var6.field_a = var3[(var5 << -195324254) - -1];
                          var6.field_f = var3[(var5 << -1608325406) - -2];
                          var6.field_e = var3[(var5 << 2147214882) + 3];
                          var5++;
                          if (var7 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_19_0 = (ls[]) (var4);
                    stackIn_20_0 = stackOut_19_0;
                    break L6;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = new ls[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("ma.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    public final n a(int param0) {
        n discarded$0 = null;
        if (param0 != -918933630) {
            discarded$0 = this.a(-10);
            return this.field_bb;
        }
        return this.field_bb;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int discarded$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param1 != 3) {
          L0: {
            discarded$1 = ma.a(71, -15, 73, 84);
            if (-1 != (param2 & 1 ^ -1)) {
              stackOut_10_0 = -param0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = param0;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            stackOut_11_0 = stackIn_11_0;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (-1 == (param2 & 2 ^ -1)) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = param3;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L1;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = -param3;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L1;
            }
          }
          return stackIn_14_0 + stackIn_14_1;
        } else {
          L2: {
            if (-1 != (param2 & 1 ^ -1)) {
              stackOut_3_0 = -param0;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = param0;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (-1 == (param2 & 2 ^ -1)) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = param3;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L3;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = -param3;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L3;
            }
          }
          return stackIn_7_0 + stackIn_7_1;
        }
    }

    ma(String param0, qo param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(byte param0, n param1) {
        RuntimeException runtimeException = null;
        n var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_bb = param1;
              if (param0 == 16) {
                break L1;
              } else {
                var4 = (n) null;
                this.a((byte) -62, (n) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ma.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            if (param0 != 32722) {
                this.field_W = 103;
            }
            super.a(param0 + 0, param1, param2, param3);
            this.field_W = sm.field_d + -this.field_B + -param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ma.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_X = null;
        field_Y = null;
        int var1 = 21 % ((param0 - -67) / 48);
    }

    static {
        field_Y = "Units";
        field_X = "Items that can be given to units to improve their abilities in battle.";
        field_Z = true;
    }
}
