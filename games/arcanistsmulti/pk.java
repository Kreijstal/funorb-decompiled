/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pk implements Iterable {
    static String field_b;
    static String field_f;
    private pg field_e;
    int field_d;
    pg[] field_c;
    static ll[] field_a;
    static String field_g;

    final static qb[] a() {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        qb[] var1 = new qb[h.field_J];
        for (var2 = 0; var2 < h.field_J; var2++) {
            var3 = jg.field_p[var2] * ho.field_i[var2];
            var4 = ln.field_I[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = ph.field_c[dg.a((int) var4[var6], 255)];
            }
            var1[var2] = new qb(pb.field_g, gn.field_a, hl.field_l[var2], be.field_d[var2], jg.field_p[var2], ho.field_i[var2], var5);
        }
        int discarded$0 = -18229;
        dk.a();
        return var1;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new jf((pk) this);
    }

    final void a(byte param0, pg param1, long param2) {
        pg var5 = null;
        try {
            if (param1.field_a != null) {
                param1.a(true);
            }
            if (param0 > -17) {
                pk.a(75);
            }
            var5 = ((pk) this).field_c[(int)(param2 & (long)(-1 + ((pk) this).field_d))];
            param1.field_a = var5.field_a;
            param1.field_b = var5;
            param1.field_a.field_b = param1;
            param1.field_b.field_a = param1;
            param1.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 != -14987) {
            field_a = null;
        }
        field_b = null;
    }

    final pg a(byte param0, long param1) {
        pg var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var5 = -25 / ((param0 - 51) / 52);
        pg var4 = ((pk) this).field_c[(int)((long)(((pk) this).field_d + -1) & param1)];
        ((pk) this).field_e = var4.field_b;
        while (((pk) this).field_e != var4) {
            if (!(~param1 != ~((pk) this).field_e.field_e)) {
                var6 = ((pk) this).field_e;
                ((pk) this).field_e = ((pk) this).field_e.field_b;
                return var6;
            }
            ((pk) this).field_e = ((pk) this).field_e.field_b;
        }
        ((pk) this).field_e = null;
        return null;
    }

    pk(int param0) {
        int var2 = 0;
        pg var3 = null;
        ((pk) this).field_c = new pg[param0];
        ((pk) this).field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            pg dupTemp$0 = new pg();
            var3 = dupTemp$0;
            ((pk) this).field_c[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_b = var3;
        }
    }

    final static ll[] a(String param0, int param1, String param2, eg param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ll[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              var4_int = param3.c(param0, -91);
              if (param1 == 0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var5 = param3.a(param2, (byte) 96, var4_int);
            stackOut_2_0 = ko.a(var4_int, (byte) 126, var5, param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("pk.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "From <%0>: ";
        field_b = "Makes you and your minions extra bouncy and able to freeze the sea";
        field_g = "Underdark spells focus on stealing health and turning minions into zombies.";
    }
}
