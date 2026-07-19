/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et extends k {
    static java.awt.Image field_m;
    private int field_o;
    static int field_l;
    private int field_k;
    static kv field_p;
    private int field_n;

    final void d(byte param0) {
        int[] discarded$0 = null;
        gea.a(4231);
        if (param0 != -68) {
            discarded$0 = this.a(-5, -83);
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 >= -40) {
            et.d(-100);
        }
        field_m = null;
    }

    final int[] a(int param0, int param1) {
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
        int[] var14 = null;
        L0: {
          var11 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            this.field_o = -26;
            break L0;
          }
        }
        L1: {
          var14 = this.field_j.a(param0, -1);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (this.field_j.field_m) {
            var4 = tj.field_f[param0];
            var5 = -2048 + var4 >> 1914696353;
            var6 = 0;
            L2: while (true) {
              if (var6 >= hh.field_d) {
                break L1;
              } else {
                L3: {
                  var8 = jq.field_k[var6];
                  var9 = -2048 + var8 >> 1437591073;
                  if (this.field_k != 0) {
                    var10 = var9 * var9 - -(var5 * var5) >> 831162476;
                    var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
                    var7 = (int)(3.141592653589793 * (double)(this.field_n * var7));
                    break L3;
                  } else {
                    var7 = this.field_n * (var8 + -var4);
                    break L3;
                  }
                }
                L4: {
                  var7 = var7 - (var7 & -4096);
                  if (this.field_o == 0) {
                    var7 = 4096 + baa.field_z[var7 >> 1807660068 & 255] >> -1266543263;
                    break L4;
                  } else {
                    if (this.field_o == 2) {
                      L5: {
                        var7 -= 2048;
                        if (-1 >= (var7 ^ -1)) {
                          break L5;
                        } else {
                          var7 = -var7;
                          break L5;
                        }
                      }
                      var7 = 2048 - var7 << -1188395071;
                      break L4;
                    } else {
                      var14[var6] = var7;
                      var6++;
                      continue L2;
                    }
                  }
                }
                var14[var6] = var7;
                var6++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var12;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 == -71) {
              L1: {
                var4_int = param2;
                if (var4_int == 0) {
                  this.field_k = param1.b(16711935);
                  break L1;
                } else {
                  if (var4_int != 1) {
                    if (-4 != (var4_int ^ -1)) {
                      break L1;
                    } else {
                      this.field_n = param1.b(16711935);
                      break L1;
                    }
                  } else {
                    this.field_o = param1.b(16711935);
                    break L1;
                  }
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
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("et.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public et() {
        super(0, true);
        this.field_o = 0;
        this.field_k = 0;
        this.field_n = 1;
    }

    static {
    }
}
