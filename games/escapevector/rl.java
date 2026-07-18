/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends hg {
    int field_g;
    static String field_l;
    static te field_k;
    static int field_h;
    int field_i;
    static boolean field_j;

    public static void d() {
        field_l = null;
        field_k = null;
    }

    final static void e(int param0) {
        if (mj.field_d != 0) {
          de.field_j = true;
          if (param0 == -46) {
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          } else {
            rl.e(-10);
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          }
        } else {
          sj.a(8192, (byte) 51);
          de.field_j = true;
          if (param0 != -46) {
            rl.e(-10);
            if (20 <= mj.field_d) {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          } else {
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0, byte param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                stackOut_39_0 = var5;
                stackIn_40_0 = stackOut_39_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var9 == 45) {
                        var4_int = 1;
                        var8++;
                        break L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          var8++;
                          break L2;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (90 >= var9) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (122 < var9) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  }
                  if (var9 >= 10) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0 != 0;
                  } else {
                    L8: {
                      if (var4_int != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var6 * 10 + var9;
                    if (var10 / 10 == var6) {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    } else {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
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
          L9: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("rl.A(").append(10).append(',').append(84).append(',').append(true).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param3 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
        return stackIn_40_0 != 0;
    }

    private rl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Out of fuel!";
        field_j = false;
    }
}
