/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ip implements Iterator {
    static String field_h;
    static String field_f;
    private up field_a;
    static String field_g;
    static String field_d;
    static long field_b;
    private df field_c;
    private df field_e;

    public final boolean hasNext() {
        return ((ip) this).field_e != ((ip) this).field_a.field_a;
    }

    public final Object next() {
        df var1 = ((ip) this).field_e;
        if (((ip) this).field_a.field_a != var1) {
            ((ip) this).field_e = var1.field_h;
        } else {
            ((ip) this).field_e = null;
            var1 = null;
        }
        ((ip) this).field_c = var1;
        return (Object) (Object) var1;
    }

    final static hc[] a(int param0, sl param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        hc[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        hc var6_ref_hc = null;
        int var7 = 0;
        hc[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        hc[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.b((byte) 93, 8);
            if (0 >= var2_int) {
              L1: {
                var3 = param1.b((byte) 116, 12);
                var4 = new hc[var3];
                if (param0 == 24243) {
                  break L1;
                } else {
                  field_d = null;
                  break L1;
                }
              }
              var5 = 0;
              L2: while (true) {
                if (var3 <= var5) {
                  stackOut_15_0 = (hc[]) var4;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L3: {
                    if (!ng.a(param1, (byte) -95)) {
                      var6 = param1.b((byte) 127, a.a(var5 + -1, 1));
                      var4[var5] = var4[var6];
                      var5++;
                      break L3;
                    } else {
                      var6_ref_hc = new hc();
                      int discarded$6 = param1.b((byte) 122, 24);
                      int discarded$7 = param1.b((byte) 80, 24);
                      var6_ref_hc.field_a = param1.b((byte) 87, 24);
                      int discarded$8 = param1.b((byte) 100, 9);
                      int discarded$9 = param1.b((byte) 122, 12);
                      int discarded$10 = param1.b((byte) 106, 12);
                      int discarded$11 = param1.b((byte) 122, 12);
                      var4[var5] = var6_ref_hc;
                      var5++;
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ip.A(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    final static boolean a(byte param0) {
        if (param0 >= -90) {
            return false;
        }
        return ~np.field_a.field_fc == ~ec.field_p ? true : false;
    }

    public static void a(int param0) {
        field_d = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    public final void remove() {
        if (!(((ip) this).field_c != null)) {
            throw new IllegalStateException();
        }
        ((ip) this).field_c.a(16);
        ((ip) this).field_c = null;
    }

    ip(up param0) {
        ((ip) this).field_c = null;
        try {
            ((ip) this).field_a = param0;
            ((ip) this).field_e = ((ip) this).field_a.field_a.field_h;
            ((ip) this).field_c = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ip.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Click to stop animation.";
        field_g = "You need to play 1 more rated game to unlock this option.";
        field_d = "Set up new game";
        field_f = "Use this alternative as your account name";
    }
}
