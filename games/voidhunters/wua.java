/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wua extends le {
    private int field_j;
    static int field_k;
    private int field_i;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                this.a(28, false);
                break L1;
              }
            }
            var4_int = param0;
            if (var4_int != 0) {
              if (1 != var4_int) {
                break L0;
              } else {
                this.field_i = param2.e(1869);
                return;
              }
            } else {
              this.field_j = param2.e(1869);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("wua.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        var7 = VoidHunters.field_G;
        var8 = this.field_f.a((byte) 117, param0);
        var3 = var8;
        if (param1) {
          if (this.field_f.field_e) {
            var4 = this.a(0, param0, 255);
            var5 = 0;
            L0: while (true) {
              if (hob.field_d > var5) {
                L1: {
                  L2: {
                    var6 = var4[var5];
                    stackIn_10_0 = (int[]) (var8);

                    stackIn_10_1 = var5;

                    if (this.field_j > var6) {
                      break L2;
                    } else {
                      stackIn_10_0 = (int[]) ((Object) stackIn_10_0);

                      if (this.field_i < var6) {
                        break L2;
                      } else {
                        stackIn_11_0 = (int[]) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 4096;
                        break L1;
                      }
                    }
                  }
                  stackIn_11_0 = (int[]) ((Object) stackIn_10_0);
                  stackIn_11_1 = stackIn_10_1;
                  stackIn_11_2 = 0;
                  break L1;
                }
                stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                var5++;
                continue L0;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        } else {
          return (int[]) null;
        }
    }

    public wua() {
        super(1, true);
        this.field_i = 4096;
        this.field_j = 0;
    }

    static {
    }
}
