/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static String field_b;
    static String[] field_c;
    static ed field_e;
    private cn field_a;
    private hg field_d;

    public static void a(boolean param0) {
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final hg a(byte param0, hg param1) {
        hg var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        Object stackIn_6_0 = null;
        hg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        hg stackOut_9_0 = null;
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
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = ((wf) this).field_a.field_d.field_d;
                break L1;
              }
            }
            if (((wf) this).field_a.field_d == var3) {
              ((wf) this).field_d = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (hg) (Object) stackIn_6_0;
            } else {
              L2: {
                ((wf) this).field_d = var3.field_d;
                if (param0 >= 33) {
                  break L2;
                } else {
                  var4 = null;
                  hg discarded$2 = ((wf) this).a((byte) 25, (hg) null);
                  break L2;
                }
              }
              stackOut_9_0 = (hg) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("wf.F(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final hg c(int param0) {
        hg var2 = null;
        var2 = ((wf) this).field_a.field_d.field_b;
        if (((wf) this).field_a.field_d == var2) {
          ((wf) this).field_d = null;
          return null;
        } else {
          if (param0 != 15) {
            return null;
          } else {
            ((wf) this).field_d = var2.field_b;
            return var2;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (!(0 >= param0)) {
            var2 = 1;
            if (param0 > 65535) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (255 < param0) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(15 >= param0)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (3 < param0) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (param0 > 1) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if (!(-256 <= param0)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(param0 >= -16)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(param0 >= -4)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(param0 >= -2)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    final hg a(int param0, hg param1) {
        hg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        hg stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hg stackOut_8_0 = null;
        Object stackOut_6_0 = null;
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
              if (param1 == null) {
                var3 = ((wf) this).field_a.field_d.field_b;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            L2: {
              if (param0 == -12818) {
                break L2;
              } else {
                field_e = null;
                break L2;
              }
            }
            if (var3 != ((wf) this).field_a.field_d) {
              ((wf) this).field_d = var3.field_b;
              stackOut_8_0 = (hg) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((wf) this).field_d = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (hg) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("wf.H(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final hg a(byte param0) {
        if (param0 <= 35) {
            return null;
        }
        hg var2 = ((wf) this).field_d;
        if (!(((wf) this).field_a.field_d != var2)) {
            ((wf) this).field_d = null;
            return null;
        }
        ((wf) this).field_d = var2.field_d;
        return var2;
    }

    final hg a(int param0) {
        hg var2 = null;
        var2 = ((wf) this).field_d;
        if (var2 != ((wf) this).field_a.field_d) {
          if (param0 <= 23) {
            return null;
          } else {
            ((wf) this).field_d = var2.field_b;
            return var2;
          }
        } else {
          ((wf) this).field_d = null;
          return null;
        }
    }

    final hg b(int param0) {
        hg var2 = null;
        if (param0 != -31616) {
            Object var3 = null;
            hg discarded$0 = ((wf) this).a(-5, (hg) null);
            var2 = ((wf) this).field_a.field_d.field_d;
            if (!(((wf) this).field_a.field_d != var2)) {
                ((wf) this).field_d = null;
                return null;
            }
            ((wf) this).field_d = var2.field_d;
            return var2;
        }
        var2 = ((wf) this).field_a.field_d.field_d;
        if (!(((wf) this).field_a.field_d != var2)) {
            ((wf) this).field_d = null;
            return null;
        }
        ((wf) this).field_d = var2.field_d;
        return var2;
    }

    wf(cn param0) {
        try {
            ((wf) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading extra data";
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
