/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ea extends Random {
    static String field_d;
    private mh field_f;
    static qr field_a;
    static String field_e;
    static in field_b;
    static qr field_c;

    final static void a(int param0) {
        if (param0 <= 111) {
          field_c = null;
          vp.field_o.field_a = 0;
          vp.field_o.field_p = 0;
          return;
        } else {
          vp.field_o.field_a = 0;
          vp.field_o.field_p = 0;
          return;
        }
    }

    final static bi[] a(int param0, byte param1, int param2, int param3) {
        int var4 = 10;
        bi[] var5 = new bi[9];
        var5[0] = new bi(10, 10);
        var5[1] = new bi(10, 10);
        var5[2] = new bi(10, 10);
        var5[3] = new bi(10, 10);
        var5[5] = new bi(10, 10);
        var5[6] = new bi(10, 10);
        var5[7] = new bi(10, 10);
        var5[8] = new bi(10, 10);
        ra.a(-128);
        var5[0].e();
        ch.a(20, 3974311, var4, 30, 0, 0, 3974311, 30);
        var5[1].e();
        ch.a(20, 3974311, var4, 30, -10, 0, 3974311, 30);
        var5[2].e();
        ch.a(20, 3974311, var4, 30, -20, 0, 3974311, 30);
        var5[3].e();
        ch.a(20, 3974311, var4, 30, 0, -10, 3974311, 30);
        var5[5].e();
        ch.a(20, 3974311, var4, 30, -20, -10, 3974311, 30);
        int var6 = 0;
        var5[6].e();
        ch.a(20, 3974311, var4, 30, 0, -21, 3974311, 30);
        var5[7].e();
        ch.a(20, 3974311, var4, 30, -10, -22, 3974311, 30);
        var5[8].e();
        ch.a(20, 3974311, var4, 30, -20, -21, 3974311, 30);
        cg.i(0);
        return var5;
    }

    protected final int next(int param0) {
        return ((ea) this).field_f.d(13) >> -param0 + 32;
    }

    public final void setSeed(long param0) {
        int[] var4 = new int[2];
        int[] var3 = var4;
        var4[0] = (int)co.a(65535L, param0);
        var4[1] = (int)co.a(param0 >> 32, 65535L);
        ((ea) this).field_f = new mh(var4);
    }

    final static o b(int param0) {
        if (!(qq.field_o != null)) {
            qq.field_o = new o(mf.field_x, 20, 0, 0, 0, 11579568, -1, 0, 0, mf.field_x.field_J, -1, 2147483647, true);
        }
        return qq.field_o;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        field_e = null;
    }

    ea(long param0) {
        ((ea) this).setSeed(param0);
    }

    public ea() {
        this(42L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has entered a game.";
        field_d = "Please wait...";
    }
}
