/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends kg {
    static int field_P;
    private int field_F;
    static gq field_O;
    int field_M;
    static vr field_K;
    private hn field_J;
    static int field_G;
    static boolean field_L;
    static qr field_N;
    static boolean[][] field_E;
    int field_I;

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        vg var15 = null;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 101, param3, param4, param5, param6)) {
              L1: {
                var8_int = -this.field_M + param1 + -param4;
                var9 = -(2 * this.field_M) + this.field_x;
                if (var9 >= var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (-1 >= (var8_int ^ -1)) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = this.field_F * var8_int / var9;
                if (param0 == 1) {
                  this.field_J.a(13378, var8_int);
                  break L3;
                } else {
                  if ((param0 ^ -1) != -3) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_J.a((byte) 56) <= var12) {
                        if (0 > var11) {
                          return true;
                        } else {
                          this.field_J.a(var11, false);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_J.a((byte) -117, var12);
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var11 = var12;
                            var10 = var13;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = 1;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L6: {
                if (param2 > 95) {
                  break L6;
                } else {
                  var15 = (vg) null;
                  discarded$1 = this.a(83, 56, (byte) 48, -95, 108, -98, (vg) null);
                  break L6;
                }
              }
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var8);
            stackOut_26_1 = new StringBuilder().append("td.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_25_0 != 0;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        if (param3 != param0) {
          L0: {
            if (param0 <= param3) {
              break L0;
            } else {
              var7 = param0;
              param0 = param3;
              param3 = var7;
              var7 = param2;
              param2 = param5;
              param5 = var7;
              break L0;
            }
          }
          if (param0 < param6) {
            if (param6 <= param3) {
              if ((-param0 + param6) * (param5 - param2) <= (-param2 + param4) * (-param0 + param3)) {
                if (param1 > -74) {
                  field_P = -5;
                  return false;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(byte param0) {
        int var2 = -76 / ((param0 - 68) / 51);
        return this.field_F;
    }

    public static void a(int param0) {
        field_O = null;
        int var1 = 20 % ((param0 - -38) / 60);
        field_N = null;
        field_K = null;
        field_E = (boolean[][]) null;
    }

    final int g(byte param0) {
        if (param0 != 93) {
            field_K = (vr) null;
            return this.field_J.a((byte) 56);
        }
        return this.field_J.a((byte) 56);
    }

    final int a(int param0, byte param1) {
        int discarded$2 = 0;
        if ((param0 ^ -1) <= -1) {
          if (param0 < this.field_J.a((byte) 56)) {
            if (param1 != -58) {
              discarded$2 = this.a((byte) -8);
              return this.field_J.a((byte) 124, param0);
            } else {
              return this.field_J.a((byte) 124, param0);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private td() throws Throwable {
        throw new Error();
    }

    static {
        field_P = 0;
        field_O = new gq(2, 4, 4, 0);
    }
}
