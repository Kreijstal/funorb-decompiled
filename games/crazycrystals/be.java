/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class be implements Iterable {
    static String field_b;
    static int field_c;
    ij field_f;
    static db field_e;
    static am field_d;
    static String field_a;

    public static void a(byte param0) {
        field_b = null;
        int var1 = -11;
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_7_0 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_int = 0;
            var4 = pf.field_n;
            L1: while (true) {
              if (je.field_i.length <= var3_int) {
                stackOut_14_0 = -1;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L2: {
                  var5 = ub.field_b[var3_int];
                  if (var5 >= 0) {
                    var6 = vm.a((byte) 96, true, je.field_i[var3_int]);
                    var4 = var4 + a.field_a;
                    var7 = -(var6 >> 1) + oa.field_b;
                    if (wn.a(var6 - -(to.field_d << 1), param1, param2, var7 - to.field_d, (byte) -30, gh.field_w + (bn.field_c << 1), var4)) {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      var4 = var4 + (gh.field_w + ((bn.field_c << 1) - -a.field_a));
                      var3_int++;
                      break L2;
                    }
                  } else {
                    var4 = var4 + io.field_O;
                    var3_int++;
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var3, "be.A(" + -1013410975 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wk((be) this);
    }

    final void a(byte param0, ij param1) {
        if (param1.field_g != null) {
            param1.a(1);
        }
        param1.field_g = ((be) this).field_f.field_g;
        param1.field_j = ((be) this).field_f;
        if (param0 < 7) {
            return;
        }
        try {
            param1.field_g.field_j = param1;
            param1.field_j.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "be.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private be() throws Throwable {
        throw new Error();
    }

    final ij a(int param0) {
        ij var2 = null;
        Object var3 = null;
        var2 = ((be) this).field_f.field_j;
        if (var2 != ((be) this).field_f) {
          if (param0 != 30244) {
            var3 = null;
            ((be) this).a((byte) 94, (ij) null);
            var2.a(1);
            return var2;
          } else {
            var2.a(1);
            return var2;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unpacking music";
        field_a = "Please try again in a few minutes.";
    }
}
