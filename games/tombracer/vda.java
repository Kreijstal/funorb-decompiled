/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vda extends ci {
    private int field_r;
    static boolean field_q;
    private int field_p;
    private int field_o;
    static String field_n;
    static iu[] field_m;

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[][] var23;
        int[][] var31;
        int[] var32;
        int[] var33;
        int[] var34;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            this.field_r = 10;
            break L0;
          }
        }
        L1: {
          var23 = this.field_h.a(param0, (byte) 123);
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (this.field_h.field_f) {
            var31 = this.a(param0, 0, -1);
            var32 = var31[0];
            var34 = var31[1];
            var33 = var31[2];
            var8 = var23[0];
            var9 = var23[1];
            var10 = var23[2];
            var11 = 0;
            L2: while (true) {
              if (var11 >= ns.field_g) {
                break L1;
              } else {
                L3: {
                  var12 = var32[var11];
                  var13 = var33[var11];
                  var14 = var34[var11];
                  if (var12 != var13) {
                    break L3;
                  } else {
                    if (var13 == var14) {
                      var8[var11] = this.field_r * var12 >> 1754141132;
                      var9[var11] = this.field_p * var13 >> -1035565524;
                      var10[var11] = var14 * this.field_o >> -1317739860;
                      var11++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var8[var11] = this.field_r;
                var9[var11] = this.field_p;
                var10[var11] = this.field_o;
                var11++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                field_m = (iu[]) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int != 0) {
                if (-2 != (var4_int ^ -1)) {
                  if (2 == var4_int) {
                    this.field_o = param1.d(127);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  this.field_p = param1.d(123);
                  break L2;
                }
              } else {
                this.field_r = param1.d(125);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("vda.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    public vda() {
        super(1, false);
        this.field_p = 4096;
        this.field_r = 4096;
        this.field_o = 4096;
    }

    public static void d(byte param0) {
        if (param0 != 90) {
            return;
        }
        field_m = null;
        field_n = null;
    }

    static {
        field_n = "Press <img=12><img=13><img=14><img=15> to continue...";
    }
}
