/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends mi {
    int field_B;
    static int[] field_A;
    int field_x;
    private int field_y;
    static int field_z;
    private ot field_w;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
        var14 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!super.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_23_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_B + (param2 - param1);
                var9 = this.field_q + -(2 * this.field_B);
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if ((var8_int ^ -1) <= -1) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_y / var9;
                if ((param3 ^ -1) != -2) {
                  if (-3 == (param3 ^ -1)) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (this.field_w.a((byte) 123) <= var12) {
                        if (-1 < (var11 ^ -1)) {
                          break L3;
                        } else {
                          this.field_w.a(var11, (byte) -58);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_w.b(var12, 1);
                          var13 = var13 * var13;
                          if ((var13 ^ -1) > (var10 ^ -1)) {
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
                  } else {
                    return true;
                  }
                } else {
                  this.field_w.a((byte) -50, var8_int);
                  break L3;
                }
              }
              stackIn_21_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var8);

            stackIn_26_1 = new StringBuilder().append("pf.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    final int c(boolean param0) {
        if (!param0) {
            return 16;
        }
        return this.field_w.a((byte) -114);
    }

    final int a(int param0) {
        if (param0 != -3) {
            return -123;
        }
        return this.field_y;
    }

    final int a(boolean param0, int param1) {
        if (-1 >= (param1 ^ -1)) {
          if (this.field_w.a((byte) -32) > param1) {
            if (param0) {
              return -3;
            } else {
              return this.field_w.b(param1, 1);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private pf() throws Throwable {
        throw new Error();
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_A = (int[]) null;
            field_A = null;
            return;
        }
        field_A = null;
    }

    static {
        field_A = new int[8192];
    }
}
