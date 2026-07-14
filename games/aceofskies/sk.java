/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sk {
    static String field_d;
    bf field_b;
    static Hashtable field_e;
    static boolean field_c;
    static int field_a;

    abstract void a(boolean param0);

    abstract void a(boolean param0, boolean param1);

    void d(int param0) {
        if (param0 != 18580) {
            ((sk) this).c(-55);
        }
    }

    void b(int param0) {
        if (param0 > -117) {
            field_e = (Hashtable) null;
        }
    }

    abstract boolean e(int param0);

    abstract void a(int param0, int param1, jj param2);

    public static void a(byte param0) {
        field_e = null;
        int var1 = -89 % ((0 - param0) / 52);
        field_d = null;
    }

    void c(int param0) {
        if (param0 != 404277666) {
            field_e = (Hashtable) null;
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(boolean param0, byte param1);

    final static rm[] a(rk param0, int param1) {
        int var5 = 0;
        rm var6 = null;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        if (!param0.a((byte) 84)) {
            return new rm[]{};
        }
        en var8 = param0.a(param1 ^ 1175069693);
        while (((en) var8).field_a == 0) {
            wf.a(10L, false);
        }
        if (param1 != 1175069442) {
            return (rm[]) null;
        }
        if (!((((en) var8).field_a ^ -1) != -3)) {
            return new rm[]{};
        }
        int[] var12 = (int[]) (int[]) ((en) var8).field_f;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        rm[] var4 = new rm[var12.length >> 1175069442];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new rm();
            var4[var5] = var6;
            var6.field_f = var3[var5 << 1786747298];
            var6.field_b = var3[1 + (var5 << 404277666)];
            var6.field_d = var3[(var5 << 376585666) - -2];
            var6.field_a = var3[3 + (var5 << 99721154)];
        }
        return var4;
    }

    void a(int param0) {
        if (param0 != 10) {
            field_a = -26;
        }
    }

    void b(byte param0) {
        if (param0 != -25) {
            jj var3 = (jj) null;
            ((sk) this).a(98, 67, (jj) null);
        }
    }

    sk(bf param0) {
        ((sk) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Achieved";
        field_e = new Hashtable();
        field_c = false;
    }
}
