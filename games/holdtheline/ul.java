/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static long field_e;
    int field_d;
    int field_g;
    int field_f;
    static String field_a;
    int field_c;
    int field_b;

    public static void a(byte param0) {
        field_a = null;
        int var1 = -20 % ((param0 - -59) / 49);
    }

    final static void a(ei param0, boolean param1, ei param2, int param3, ei param4, ei param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        L0: {
          var8 = HoldTheLine.field_D;
          if (param1) {
            break L0;
          } else {
            ul.a((byte) -113);
            break L0;
          }
        }
        L1: {
          if (param3 != 1) {
            var6 = 0;
            L2: while (true) {
              if (param0.field_e <= var6) {
                break L1;
              } else {
                var9 = var6 + 2;
                var7 = var9;
                L3: while (true) {
                  L4: {
                    stackOut_12_0 = var9;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (-1 != var6) {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = param0.field_e;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = param0.field_e - 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  if (stackIn_15_0 <= (stackIn_15_1 ^ -1)) {
                    var6++;
                    continue L2;
                  } else {
                    qf.a(param5, (vj) param0.field_b[var6], param3, -3, var6, (vj) param0.field_b[var9], var9, param2);
                    var9++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var6 = 0;
            L5: while (true) {
              if (param0.field_e <= var6) {
                break L1;
              } else {
                var7 = 0;
                L6: while (true) {
                  if (var7 >= param4.field_e) {
                    var6++;
                    continue L5;
                  } else {
                    qf.a(param5, (vj) param0.field_b[var6], param3, -3, var6, (vj) param4.field_b[var7], var7, param2);
                    var7++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    ul(int param0, int param1, int param2, int param3, int param4) {
        ((ul) this).field_f = param1;
        ((ul) this).field_c = param2;
        ((ul) this).field_b = param0;
        ((ul) this).field_g = param4;
        ((ul) this).field_d = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking sound effects";
    }
}
