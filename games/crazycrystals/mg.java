/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg {
    static dl[] field_b;
    static String field_h;
    static ko field_d;
    static int field_e;
    static db field_c;
    static int field_a;
    static db field_g;
    static String field_f;

    abstract void a(ng param0, byte param1);

    abstract wh a(int param0);

    public static void b(int param0) {
        if (param0 >= -86) {
          field_a = -24;
          field_d = null;
          field_g = null;
          field_b = null;
          field_h = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_g = null;
          field_b = null;
          field_h = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, db param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (le.field_g != null) {
                break L1;
              } else {
                le.field_g = new dl[4][];
                cd.field_v = new int[10];
                cd.field_v[2] = 8;
                cd.field_v[7] = 12;
                cd.field_v[6] = 8;
                cd.field_v[1] = 4;
                cd.field_v[5] = 4;
                cd.field_v[9] = 12;
                break L1;
              }
            }
            L2: {
              if (param0 < -99) {
                break L2;
              } else {
                mg.b(-23);
                break L2;
              }
            }
            var2_int = 0;
            L3: while (true) {
              if (var2_int >= 4) {
                break L0;
              } else {
                L4: {
                  if (null != le.field_g[var2_int]) {
                    var2_int++;
                    var2_int++;
                    break L4;
                  } else {
                    le.field_g[var2_int] = bf.a(-1, oe.field_d[var2_int], "", param1);
                    var2_int++;
                    break L4;
                  }
                }
                var2_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("mg.B(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Hole";
        field_e = 100;
        field_f = "Please check if address is correct";
    }
}
