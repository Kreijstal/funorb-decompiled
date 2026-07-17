/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha extends br {
    static oi[] field_j;
    static String field_h;
    int field_f;
    static ul field_g;
    ek field_m;
    static String field_n;
    static String field_k;
    static ao field_i;
    static ja field_l;

    public static void a(int param0) {
        field_l = null;
        field_g = null;
        field_i = null;
        field_n = null;
        field_h = null;
        field_k = null;
        field_j = null;
        if (param0 != 21342) {
            ha.a(-3);
        }
    }

    final static ob b(boolean param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        ob var2 = null;
        ig stackIn_4_0 = null;
        ob stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        ig stackOut_2_0 = null;
        ob stackOut_6_0 = null;
        ig stackOut_3_0 = null;
        try {
          var1_int = 0;
          stackOut_2_0 = ok.field_p;
          stackIn_4_0 = stackOut_2_0;
          L0: while (true) {
            var2 = ((ig) (Object) stackIn_4_0).a(var1_int, 32767);
            if (var2.field_y) {
              stackOut_6_0 = (ob) var2;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              var1_int++;
              stackOut_3_0 = ok.field_p;
              stackIn_4_0 = stackOut_3_0;
              continue L0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    ha(ek param0, int param1) {
        try {
            ((ha) this).field_m = param0;
            ((ha) this).field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = "Beguile them... The carrot may work better than the stick.";
        field_j = new oi[255];
        field_n = "Detonate a zombie to stun anything close to it.";
        field_k = "Only show lobby chat from my friends";
        for (var0 = 0; var0 < field_j.length; var0++) {
            field_j[var0] = new oi();
        }
        field_i = new ao(11, 0, 1, 2);
        Random discarded$0 = new Random();
    }
}
