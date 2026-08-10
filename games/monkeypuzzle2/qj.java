/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends t {
    static boolean field_J;
    static String field_E;
    private int field_G;
    static int field_D;
    static le[] field_C;
    int field_B;
    private oi field_I;
    int field_F;

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                qj.a(-18);
                break L1;
              }
            }
            L2: {
              var3 = ki.a((byte) 43, param2);
              if (-1 != param0.indexOf(param2)) {
                break L2;
              } else {
                if (0 != (param0.indexOf(var3) ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param0.startsWith(param2)) {
                        break L4;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L4;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackIn_14_0 = 0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("qj.G(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final static aj l(int param0) {
        int var1 = -66 % ((param0 - 51) / 60);
        return new aj(pl.a((byte) -69), bb.a((byte) -121));
    }

    final int a(boolean param0) {
        if (!param0) {
            return -126;
        }
        return this.field_I.b(-1);
    }

    final int k(int param0) {
        int var2 = -80 % ((param0 - -20) / 39);
        return this.field_G;
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3 + 0, param4, param5, param6)) {
              L1: {
                if (param3 == -1625) {
                  break L1;
                } else {
                  qj.l(78);
                  break L1;
                }
              }
              stackIn_26_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                var8_int = -param6 + (param1 - this.field_B);
                var9 = -(this.field_B * 2) + this.field_l;
                if (var9 >= var8_int) {
                  break L2;
                } else {
                  var8_int = var9;
                  break L2;
                }
              }
              L3: {
                if ((var8_int ^ -1) > -1) {
                  var8_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8_int = this.field_G * var8_int / var9;
                if ((param2 ^ -1) != -2) {
                  if (param2 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (var12 >= this.field_I.b(param3 ^ 1624)) {
                        if (0 <= var11) {
                          this.field_I.a((byte) 107, var11);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          var13 = this.field_I.d(-22544, var12) + -var8_int;
                          var13 = var13 * var13;
                          if (var13 < var10) {
                            var11 = var12;
                            var10 = var13;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  this.field_I.b(var8_int, -105);
                  break L4;
                }
              }
              stackIn_22_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var8);

            stackIn_29_1 = new StringBuilder().append("qj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0 != 0;
        } else {
          return stackIn_26_0 != 0;
        }
    }

    public static void a(int param0) {
        field_E = null;
        field_C = null;
        if (param0 != 4201) {
            field_C = (le[]) null;
        }
    }

    final int a(boolean param0, int param1) {
        String var4;
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (this.field_I.b(-1) <= param1) {
              break L0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var4 = (String) null;
                  qj.a((String) null, false, (String) null);
                  break L1;
                }
              }
              return this.field_I.d(-22544, param1);
            }
          }
        }
        return -1;
    }

    private qj() throws Throwable {
        throw new Error();
    }

    static {
        field_E = "Instructions";
    }
}
