/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_c;
    static gk field_b;
    private fq field_a;

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_b = null;
        field_c = null;
        if (param0 != 29770) {
            discarded$0 = jk.a('>', 104);
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!dc.a((byte) -119, param0)) {
                var5 = wo.field_l;
                var2 = var5;
                var3 = 0;
                L1: while (true) {
                  if (var5.length <= var3) {
                    L2: {
                      var6 = wb.field_b;
                      var2 = var6;
                      if (param1 == -26024) {
                        break L2;
                      } else {
                        field_b = (gk) null;
                        break L2;
                      }
                    }
                    var7 = 0;
                    var3 = var7;
                    L3: while (true) {
                      if (var6.length <= var7) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var6[var7];
                        if (var4 == param0) {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4 = var5[var3];
                    if (param0 == var4) {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "jk.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_24_0 != 0;
              }
            }
          }
        }
    }

    final void a(byte param0, wl param1) {
        hl discarded$3 = null;
        this.field_a = param1.a((byte) -49, 24, (byte[]) null, 196584, true);
        hl discarded$0 = new hl(this.field_a, 5126, 2, 0);
        hl discarded$2 = new hl(this.field_a, 5126, 3, 8);
        if (param0 < 34) {
            return;
        }
        try {
            discarded$3 = new hl(this.field_a, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jk() {
        du discarded$0 = new du(786336);
        int discarded$1 = ek.a((byte) 108, 1600);
    }

    static {
        field_c = "Orb Points";
    }
}
