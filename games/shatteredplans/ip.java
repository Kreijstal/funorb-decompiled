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
        return this.field_e != this.field_a.field_a;
    }

    public final Object next() {
        df var1 = this.field_e;
        if (this.field_a.field_a != var1) {
            this.field_e = var1.field_h;
        } else {
            this.field_e = null;
            var1 = null;
        }
        this.field_c = var1;
        return var1;
    }

    final static hc[] a(int param0, sl param1) {
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        hc[] var4 = null;
        int var5 = 0;
        hc var6_ref_hc = null;
        int var6 = 0;
        int var7 = 0;
        hc[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        hc[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
                  field_d = (String) null;
                  break L1;
                }
              }
              var5 = 0;
              L2: while (true) {
                if (var3 <= var5) {
                  stackOut_13_0 = (hc[]) (var4);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L3: {
                    if (!ng.a(param1, (byte) -95)) {
                      var6 = param1.b((byte) 127, a.a(var5 + -1, 1));
                      var4[var5] = var4[var6];
                      break L3;
                    } else {
                      var6_ref_hc = new hc();
                      discarded$30 = param1.b((byte) 122, 24);
                      discarded$31 = param1.b((byte) 80, 24);
                      var6_ref_hc.field_a = param1.b((byte) 87, 24);
                      discarded$32 = param1.b((byte) 100, 9);
                      discarded$33 = param1.b((byte) 122, 12);
                      discarded$34 = param1.b((byte) 106, 12);
                      discarded$35 = param1.b((byte) 122, 12);
                      var4[var5] = var6_ref_hc;
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
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("ip.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final static boolean a(byte param0) {
        if (param0 >= -90) {
            return false;
        }
        return (np.field_a.field_fc ^ -1L) == (ec.field_p ^ -1L) ? true : false;
    }

    public static void a(int param0) {
        hc[] discarded$2 = null;
        sl var2 = null;
        if (param0 <= 123) {
          var2 = (sl) null;
          discarded$2 = ip.a(-22, (sl) null);
          field_d = null;
          field_h = null;
          field_g = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_h = null;
          field_g = null;
          field_f = null;
          return;
        }
    }

    public final void remove() {
        if (!(this.field_c != null)) {
            throw new IllegalStateException();
        }
        this.field_c.a(16);
        this.field_c = null;
    }

    ip(up param0) {
        this.field_c = null;
        try {
            this.field_a = param0;
            this.field_e = this.field_a.field_a.field_h;
            this.field_c = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ip.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Click to stop animation.";
        field_g = "You need to play 1 more rated game to unlock this option.";
        field_d = "Set up new game";
        field_f = "Use this alternative as your account name";
    }
}
