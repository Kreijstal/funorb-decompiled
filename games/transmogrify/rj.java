/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rj {
    static ti[] field_a;
    static boolean field_b;

    abstract int a(int param0);

    final static String a(ci param0, byte param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_5_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) -123)) {
              var9 = param0.a(false);
              var2 = var9;
              var3 = param0.b(79, "index");
              var4 = 0;
              var5 = var9;
              if (param1 <= -2) {
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var6 >= var5.length) {
                      break L2;
                    } else {
                      L3: {
                        var7 = var5[var6];
                        if (var3 != var7) {
                          var4 = var4 + param0.a(true, var7);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var6++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_13_0 = ne.field_c + " - " + var4 / (-1 + var9.length) + "%";
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = (String) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = bd.field_r;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2_ref);
            stackOut_15_1 = new StringBuilder().append("rj.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static h b(boolean param0) {
        h discarded$4 = null;
        h discarded$5 = null;
        if (null != eh.field_e) {
          if (!param0) {
            discarded$4 = rj.b(false);
            return eh.field_e;
          } else {
            return eh.field_e;
          }
        } else {
          eh.field_e = new h(al.field_i, 20, 0, 0, 0, 11579568, -1, 0, 0, al.field_i.field_y, -1, 2147483647, true);
          if (param0) {
            return eh.field_e;
          } else {
            discarded$5 = rj.b(false);
            return eh.field_e;
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_b = false;
        }
    }

    abstract void a(boolean param0, java.awt.Component param1);

    abstract void a(byte param0, java.awt.Component param1);

    static {
    }
}
