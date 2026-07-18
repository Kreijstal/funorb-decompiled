/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo {
    private gb field_d;
    static boolean field_a;
    static ah field_f;
    private gb field_c;
    static String field_b;
    static boolean field_e;

    final int d(int param0) {
        int var4 = TetraLink.field_J;
        int var2 = param0;
        gb var3 = ((jo) this).field_d.field_o;
        while (var3 != ((jo) this).field_d) {
            var3 = var3.field_o;
            var2++;
        }
        return var2;
    }

    final static boolean b(int param0) {
        if (hn.field_M == null) {
            return false;
        }
        if (!hn.field_M.d(0)) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
    }

    final gb a(boolean param0) {
        gb var2 = null;
        var2 = ((jo) this).field_c;
        if (((jo) this).field_d == var2) {
          ((jo) this).field_c = null;
          return null;
        } else {
          if (param0) {
            field_a = true;
            ((jo) this).field_c = var2.field_o;
            return var2;
          } else {
            ((jo) this).field_c = var2.field_o;
            return var2;
          }
        }
    }

    final gb a(byte param0) {
        int var2 = 0;
        gb var3 = null;
        var2 = 15 % ((param0 - 20) / 62);
        var3 = ((jo) this).field_d.field_o;
        if (var3 == ((jo) this).field_d) {
          ((jo) this).field_c = null;
          return null;
        } else {
          ((jo) this).field_c = var3.field_o;
          return var3;
        }
    }

    final gb c(int param0) {
        gb var2 = null;
        if (param0 == -15464) {
          var2 = ((jo) this).field_d.field_o;
          if (var2 == ((jo) this).field_d) {
            return null;
          } else {
            var2.e(0);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          hg.field_f[param1] = param0;
          kk.field_X[param1] = new cl(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("jo.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + -13850 + ')');
        }
    }

    public jo() {
        ((jo) this).field_d = new gb();
        ((jo) this).field_d.field_o = ((jo) this).field_d;
        ((jo) this).field_d.field_s = ((jo) this).field_d;
    }

    final void a(gb param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_s) {
                param0.e(param1);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_s = ((jo) this).field_d.field_s;
            param0.field_o = ((jo) this).field_d;
            param0.field_s.field_o = param0;
            param0.field_o.field_s = param0;
            if (param1 == 0) {
              break L0;
            } else {
              field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("jo.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have not yet unlocked this option for use.";
    }
}
