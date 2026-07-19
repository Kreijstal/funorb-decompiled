/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends ji {
    static cb field_z;
    private int field_E;
    private int field_C;
    static String field_D;
    static String field_y;
    static si[] field_B;
    private int field_A;

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 110) {
              L1: {
                var4_int = param1;
                if (-1 != (var4_int ^ -1)) {
                  if (-2 != (var4_int ^ -1)) {
                    if (var4_int == 2) {
                      this.field_A = param2.a((byte) -11);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_E = param2.h(-11);
                    break L1;
                  }
                } else {
                  this.field_C = param2.h(-11);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("up.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void g(int param0) {
        if (param0 != -3144) {
            field_y = (String) null;
        }
        field_B = null;
        field_z = null;
        field_y = null;
        field_D = null;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param1 >= 91) {
            break L0;
          } else {
            this.field_A = 97;
            break L0;
          }
        }
        L1: {
          var13 = this.field_x.a(param0, (byte) 62);
          var12 = var13;
          var3 = var12;
          if (!this.field_x.field_i) {
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= we.field_M) {
                break L1;
              } else {
                L3: {
                  var5 = rh.field_O[var4];
                  var6 = lf.field_y[param0];
                  var7 = var5 * this.field_C >> 327136492;
                  var8 = var6 * this.field_E >> -1006957460;
                  var9 = var5 % (4096 / this.field_C) * this.field_C;
                  var10 = this.field_E * (var6 % (4096 / this.field_E));
                  if (this.field_A <= var10) {
                    break L3;
                  } else {
                    var7 = var7 - var8;
                    L4: while (true) {
                      if (var7 >= 0) {
                        L5: while (true) {
                          if (var7 <= 3) {
                            var13 = var12;
                            if (var7 == 1) {
                              var13 = var12;
                              if (this.field_A <= var9) {
                                break L3;
                              } else {
                                var13[var4] = 0;
                                var4++;
                                continue L2;
                              }
                            } else {
                              var13[var4] = 0;
                              var4++;
                              continue L2;
                            }
                          } else {
                            var7 -= 4;
                            continue L5;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L4;
                      }
                    }
                  }
                }
                L6: {
                  if (var9 >= this.field_A) {
                    break L6;
                  } else {
                    var7 = var7 - var8;
                    L7: while (true) {
                      if (-1 >= (var7 ^ -1)) {
                        L8: while (true) {
                          if ((var7 ^ -1) >= -4) {
                            if (var7 <= 0) {
                              break L6;
                            } else {
                              var13[var4] = 0;
                              var4++;
                              continue L2;
                            }
                          } else {
                            var7 -= 4;
                            continue L8;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L7;
                      }
                    }
                  }
                }
                var13[var4] = 4096;
                var4++;
                continue L2;
              }
            }
          }
        }
        return var3;
    }

    public up() {
        super(0, true);
        this.field_E = 1;
        this.field_A = 204;
        this.field_C = 1;
    }

    static {
        field_D = "Message game";
        field_y = "Unrated game";
        field_B = new si[3];
    }
}
