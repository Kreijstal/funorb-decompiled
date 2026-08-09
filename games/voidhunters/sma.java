/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sma extends le {
    private int field_i;
    private int field_j;

    final int[] a(int param0, boolean param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = VoidHunters.field_G;
          var3 = this.field_f.a((byte) -117, param0);
          if (!this.field_f.field_e) {
            break L0;
          } else {
            var4 = this.a(0, param0, 255);
            var5 = 0;
            L1: while (true) {
              if (var5 >= hob.field_d) {
                break L0;
              } else {
                var6 = var4[var5];
                if ((this.field_j ^ -1) < (var6 ^ -1)) {
                  var3[var5] = this.field_j;
                  var5++;
                  continue L1;
                } else {
                  if (var6 > this.field_i) {
                    var3[var5] = this.field_i;
                    var5++;
                    continue L1;
                  } else {
                    var3[var5] = var6;
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        if (param1) {
          return var3;
        } else {
          return (int[]) null;
        }
    }

    public sma() {
        super(1, false);
        this.field_i = 4096;
        this.field_j = 0;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        ds var16;
        int[][] var17;
        int[][] var19;
        int[] var23;
        int[] var24;
        int[] var25;
        int[][] var27;
        int[] var31;
        int[] var32;
        int[] var33;
        int[][] var38;
        int[] var39;
        int[] var40;
        int[] var41;
        L0: {
          var15 = VoidHunters.field_G;
          if (param0 == 255) {
            break L0;
          } else {
            var16 = (ds) null;
            this.a(-114, -34, (ds) null);
            break L0;
          }
        }
        L1: {
          var27 = this.field_d.a(param1, (byte) -117);
          var19 = var27;
          var17 = var19;
          var3 = var17;
          if (!this.field_d.field_g) {
            break L1;
          } else {
            var38 = this.a((byte) 94, 0, param1);
            var39 = var38[0];
            var40 = var38[1];
            var41 = var38[2];
            var31 = var27[0];
            var23 = var31;
            var8 = var23;
            var32 = var27[1];
            var24 = var32;
            var9 = var24;
            var33 = var27[2];
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L2: while (true) {
              if (hob.field_d <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var39[var11];
                  var13 = var40[var11];
                  var14 = var41[var11];
                  if (this.field_j <= var12) {
                    if (var12 > this.field_i) {
                      var8[var11] = this.field_i;
                      break L3;
                    } else {
                      var31[var11] = var12;
                      break L3;
                    }
                  } else {
                    var8[var11] = this.field_j;
                    break L3;
                  }
                }
                L4: {
                  if (var13 >= this.field_j) {
                    if (var13 <= this.field_i) {
                      var32[var11] = var13;
                      break L4;
                    } else {
                      var9[var11] = this.field_i;
                      break L4;
                    }
                  } else {
                    var9[var11] = this.field_j;
                    break L4;
                  }
                }
                if (this.field_j <= var14) {
                  if (var14 <= this.field_i) {
                    var33[var11] = var14;
                    var11++;
                    continue L2;
                  } else {
                    var10[var11] = this.field_i;
                    var11++;
                    continue L2;
                  }
                } else {
                  var10[var11] = this.field_j;
                  var11++;
                  continue L2;
                }
              }
            }
          }
        }
        return var3;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                this.field_j = -128;
                break L1;
              }
            }
            L2: {
              var4_int = param0;
              if (var4_int != 0) {
                if (var4_int != 1) {
                  if (2 == var4_int) {
                    L3: {
                      stackIn_13_0 = this;

                      if (-2 != (param2.e((byte) -101) ^ -1)) {
                        stackIn_14_0 = this;
                        stackIn_14_1 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = this;
                        stackIn_14_1 = 1;
                        break L3;
                      }
                    }
                    ((sma) (this)).field_g = stackIn_14_1 != 0;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  this.field_i = param2.e(1869);
                  break L2;
                }
              } else {
                this.field_j = param2.e(1869);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("sma.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    static {
    }
}
