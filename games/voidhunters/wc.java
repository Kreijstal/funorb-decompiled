/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    private ij field_c;
    static String field_d;
    static dja field_a;
    private ksa field_b;

    final ksa a(byte param0) {
        ksa var2 = null;
        var2 = ((wc) this).field_b;
        if (param0 == 108) {
          if (var2 == ((wc) this).field_c.field_a) {
            ((wc) this).field_b = null;
            return null;
          } else {
            ((wc) this).field_b = var2.field_a;
            return var2;
          }
        } else {
          return null;
        }
    }

    final ksa b(byte param0) {
        ksa var2 = null;
        if (param0 > 61) {
          var2 = ((wc) this).field_c.field_a.field_a;
          if (((wc) this).field_c.field_a == var2) {
            ((wc) this).field_b = null;
            return null;
          } else {
            ((wc) this).field_b = var2.field_a;
            return var2;
          }
        } else {
          return null;
        }
    }

    final ksa c(int param0) {
        ksa var2 = ((wc) this).field_c.field_a.field_c;
        if (param0 != 570) {
            ((wc) this).field_c = null;
            if (!(var2 != ((wc) this).field_c.field_a)) {
                ((wc) this).field_b = null;
                return null;
            }
            ((wc) this).field_b = var2.field_c;
            return var2;
        }
        if (!(var2 != ((wc) this).field_c.field_a)) {
            ((wc) this).field_b = null;
            return null;
        }
        ((wc) this).field_b = var2.field_c;
        return var2;
    }

    final ksa a(int param0) {
        ksa var2 = null;
        Object var3 = null;
        if (param0 == 19072) {
          var2 = ((wc) this).field_b;
          if (((wc) this).field_c.field_a == var2) {
            ((wc) this).field_b = null;
            return null;
          } else {
            ((wc) this).field_b = var2.field_c;
            return var2;
          }
        } else {
          var3 = null;
          ksa discarded$2 = ((wc) this).a((ksa) null, 109);
          var2 = ((wc) this).field_b;
          if (((wc) this).field_c.field_a == var2) {
            ((wc) this).field_b = null;
            return null;
          } else {
            ((wc) this).field_b = var2.field_c;
            return var2;
          }
        }
    }

    final ksa a(byte param0, ksa param1) {
        ksa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ksa stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        ksa stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 87) {
                break L1;
              } else {
                ksa discarded$2 = ((wc) this).a(73);
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                var3 = param1;
                break L2;
              } else {
                var3 = ((wc) this).field_c.field_a.field_a;
                break L2;
              }
            }
            if (var3 == ((wc) this).field_c.field_a) {
              ((wc) this).field_b = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (ksa) (Object) stackIn_8_0;
            } else {
              ((wc) this).field_b = var3.field_a;
              stackOut_9_0 = (ksa) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("wc.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void b(int param0) {
        if (param0 != -20221) {
            wc.b(-115);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    final ksa a(ksa param0, int param1) {
        ksa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        ksa stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ksa stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = ((wc) this).field_c.field_a.field_c;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 != ((wc) this).field_c.field_a) {
              L2: {
                ((wc) this).field_b = var3.field_c;
                if (param1 == -28791) {
                  break L2;
                } else {
                  field_d = null;
                  break L2;
                }
              }
              stackOut_8_0 = (ksa) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((wc) this).field_b = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ksa) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("wc.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    wc(ij param0) {
        try {
            ((wc) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "wc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "To play a multiplayer game, please log in or create a free account.";
    }
}
