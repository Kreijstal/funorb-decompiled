/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String[] field_b;
    static int field_a;

    final static void a(int param0, boolean param1) {
        if (param0 >= -15) {
            field_b = (String[]) null;
            im.field_b.a(param1, false);
            return;
        }
        im.field_b.a(param1, false);
    }

    final static void a(String[] args, byte param1) {
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var3 = -88 % ((-51 - param1) / 40);
            var2_int = -1;
            var4 = 0;
            L1: while (true) {
              if (args.length <= var4) {
                break L0;
              } else {
                L2: {
                  var5 = args[var4];
                  if (0 == (var2_int ^ -1)) {
                    break L2;
                  } else {
                    args[var4] = jk.a(new String[]{Integer.toString(var2_int, 16)}, "<col=<%0>>", 30496) + var5;
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
                      var2_int = hl.a(-120, (CharSequence) ((Object) var9), 16);
                      break L3;
                    }
                  } else {
                    if ((var7 ^ -1) != 0) {
                      var2_int = -1;
                      break L3;
                    } else {
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
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("ig.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (args == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        if (param0 > -25) {
          return;
        } else {
          L0: {
            if ((oo.field_d ^ -1) < -33) {
              L1: {
                var1 = oo.field_d % 32;
                if (-1 != (var1 ^ -1)) {
                  break L1;
                } else {
                  var1 = 32;
                  break L1;
                }
              }
              sf.d(62, -var1 + oo.field_d);
              break L0;
            } else {
              sf.d(-110, 0);
              break L0;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        if (param0 != -2898) {
            discarded$0 = ig.b(-47);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (null != dd.field_E) {
          if (!dd.field_E.field_w) {
            if (param0 != 31131) {
              field_a = 4;
              return 0;
            } else {
              return 0;
            }
          } else {
            var1 = of.field_l + 20;
            var2 = var1 - 452;
            return var2 * dd.field_E.field_F / dd.field_E.field_G;
          }
        } else {
          if (param0 != 31131) {
            field_a = 4;
            return 0;
          } else {
            return 0;
          }
        }
    }

    static {
    }
}
