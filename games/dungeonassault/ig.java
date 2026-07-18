/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String[] field_b;
    static int field_a;

    final static void a(int param0, boolean param1) {
        im.field_b.a(param1, false);
    }

    final static void a(String[] args) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var3 = 0;
            var2_int = -1;
            var4 = 0;
            L1: while (true) {
              if (args.length <= var4) {
                break L0;
              } else {
                L2: {
                  var5 = args[var4];
                  if (var2_int == -1) {
                    break L2;
                  } else {
                    int discarded$7 = 30496;
                    args[var4] = jk.a(new String[1], "<col=<%0>>") + var5;
                    break L2;
                  }
                }
                L3: {
                  var6 = en.a(var5, -8634, "<col=");
                  var7 = en.a(var5, -8634, "</col>");
                  if (var6 > var7) {
                    var8 = var5.indexOf('>', var6);
                    if (var8 == -1) {
                      break L3;
                    } else {
                      var9 = var5.substring(5 + var6, var8);
                      int discarded$8 = 16;
                      var2_int = hl.a(-120, (CharSequence) (Object) var9);
                      break L3;
                    }
                  } else {
                    if (var7 != -1) {
                      var2_int = -1;
                      var4++;
                      break L3;
                    } else {
                      var4++;
                      break L3;
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("ig.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (args == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + -121 + ')');
        }
    }

    final static void c() {
        int var1 = 0;
        if (oo.field_d <= 32) {
            sf.d(-110, 0);
        } else {
            var1 = oo.field_d % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            sf.d(62, -var1 + oo.field_d);
        }
    }

    public static void a() {
        field_b = null;
    }

    final static int b() {
        int var1 = 0;
        int var2 = 0;
        if (null != dd.field_E) {
          if (!dd.field_E.field_w) {
            return 0;
          } else {
            var1 = of.field_l + 20;
            var2 = var1 - 452;
            return var2 * dd.field_E.field_F / dd.field_E.field_G;
          }
        } else {
          return 0;
        }
    }

    static {
    }
}
