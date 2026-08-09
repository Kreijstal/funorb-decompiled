/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static int field_a;

    final static al[] a(un param0, byte param1) {
        al[] stackIn_3_0 = null;
        al[] stackIn_10_0 = null;
        al[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        al[] var4 = null;
        int var5 = 0;
        al var6 = null;
        int var7 = 0;
        un var8 = null;
        gb var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param0.b(5)) {
              var9 = param0.a((byte) -116);
              L1: while (true) {
                if (var9.field_a != 0) {
                  if ((var9.field_a ^ -1) == -3) {
                    stackIn_10_0 = new al[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var11 = (int[]) (var9.field_b);
                      var10 = var11;
                      var3 = var10;
                      var4 = new al[var11.length >> 1010349570];
                      if (param1 > 13) {
                        break L2;
                      } else {
                        var8 = (un) null;
                        ri.a((un) null, (byte) -59);
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackIn_17_0 = (al[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new al();
                        var4[var5] = var6;
                        var6.field_i = var3[var5 << 1475799650];
                        var6.field_g = var3[(var5 << -1692541246) - -1];
                        var6.field_b = var3[2 + (var5 << 632575202)];
                        var6.field_e = var3[3 + (var5 << -1222162238)];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  fh.a(true, 10L);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = new al[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("ri.A(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
    }
}
