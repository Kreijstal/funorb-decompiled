/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class av {
    String field_c;
    static hd[] field_b;
    int field_a;
    static String field_d;

    final static void a(int param0, int param1, int[] param2, ea param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        for (var4 = param3.field_c + param1; param3.field_l >= var4; var4++) {
            for (var5 = param3.field_i + 1; param3.field_d >= var5; var5++) {
                for (var6 = param3.field_k + 1; param3.field_e >= var6; var6++) {
                    param2[var6 + (var5 << -437025851) + ((var4 << 16080938) - (-(var4 << 526685670) + (-var4 + -var5)))] = param0;
                }
                var5++;
            }
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    public static void b(int param0) {
        field_d = null;
        if (param0 <= 68) {
            return;
        }
        field_b = null;
    }

    final java.net.Socket c(int param0) throws IOException {
        if (param0 != 16080938) {
            return null;
        }
        return new java.net.Socket(((av) this).field_c, ((av) this).field_a);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "to the Final";
    }
}
