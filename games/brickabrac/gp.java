/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gp implements Iterable {
    static op field_c;
    tk field_a;
    static mh field_d;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            if (param0 > 28) {
              var3 = 1;
              L1: while (true) {
                if (param1.length() <= var3) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (param1.charAt(var3) != var2_int) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("gp.G(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        if (null == bm.field_d) {
          if (!s.a(-121)) {
            if (no.field_p == null) {
              if (jg.b(true)) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param2 -= 4;
        param4 += 2;
        param1 += 2;
        param0 -= 4;
        int var5 = lb.field_c * param1 + param4;
        int var6 = lb.field_c + -param2;
        la.a(lb.field_l, var5, 0, 0, 0, param3, param2, param0, var6);
    }

    final void a(tk param0, byte param1) {
        try {
            if (null != param0.field_n) {
                param0.d(3);
            }
            param0.field_s = ((gp) this).field_a;
            if (param1 > -112) {
                field_d = null;
            }
            param0.field_n = ((gp) this).field_a.field_n;
            param0.field_n.field_s = param0;
            param0.field_s.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "gp.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ae((gp) this);
    }

    gp() {
        ((gp) this).field_a = new tk();
        ((gp) this).field_a.field_n = ((gp) this).field_a;
        ((gp) this).field_a.field_s = ((gp) this).field_a;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
    }

    final tk a(boolean param0) {
        tk var2 = null;
        var2 = ((gp) this).field_a.field_s;
        if (var2 != ((gp) this).field_a) {
          var2.d(3);
          if (param0) {
            gp.a(-105, -93, 51, -34, -59);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (gp.a(-4858)) {
            param0 = false;
        }
        oj.a(param0, (byte) 123);
        if (!(!nf.field_V)) {
            lb.b(sb.field_c.field_d.field_P, sb.field_c.field_d.field_zb, sb.field_c.field_d.field_Ib, sb.field_c.field_d.field_cb);
            sb.field_c.field_d.a(true, param0);
        }
        si.a(7070, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new op();
    }
}
