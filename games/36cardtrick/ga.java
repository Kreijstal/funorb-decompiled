/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga implements Runnable {
    le field_a;
    volatile gd[] field_e;
    volatile boolean field_d;
    volatile boolean field_c;
    static ha[] field_b;

    final static void a(boolean param0, int param1) {
        sd.field_c.a(0, (byte) -124, 0);
        if (param1 < 35) {
            field_b = null;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (!param0) {
            Object var2 = null;
            oh discarded$0 = ga.a(-5, (wb[]) null, (byte[]) null);
        }
    }

    final static oh a(int param0, wb[] param1, byte[] param2) {
        int var9 = 0;
        int var10 = Main.field_T;
        if (!(256 == param1.length)) {
            throw new IllegalArgumentException();
        }
        int var3 = 81 % ((56 - param0) / 43);
        int[] var26 = new int[256];
        int[] var21 = var26;
        int[] var16 = var21;
        int[] var11 = var16;
        int[] var4 = var11;
        int[] var27 = new int[256];
        int[] var22 = var27;
        int[] var17 = var22;
        int[] var12 = var17;
        int[] var5 = var12;
        int[] var28 = new int[256];
        int[] var23 = var28;
        int[] var18 = var23;
        int[] var13 = var18;
        int[] var6 = var13;
        int[] var29 = new int[256];
        int[] var24 = var29;
        int[] var19 = var24;
        int[] var14 = var19;
        int[] var7 = var14;
        byte[][] var30 = new byte[256][];
        byte[][] var25 = var30;
        byte[][] var20 = var25;
        byte[][] var15 = var20;
        byte[][] var8 = var15;
        for (var9 = 0; 256 > var9; var9++) {
            var4[var9] = param1[var9].field_h;
            var5[var9] = param1[var9].field_c;
            var6[var9] = param1[var9].field_g;
            var7[var9] = param1[var9].field_b;
            var8[var9] = param1[var9].field_i;
        }
        return new oh(param2, var26, var27, var28, var29, var30);
    }

    final static void a(boolean param0) {
        if (!param0) {
            field_b = null;
        }
        if (gj.field_a == null) {
            return;
        }
        bg.a((java.awt.Canvas) (Object) gj.field_a, (byte) -111);
        gj.field_a.a((byte) -81, jk.field_a);
        gj.field_a = null;
        if (!(null == wc.field_A)) {
            wc.field_A.a((byte) 10);
        }
        tb.field_c.requestFocus();
    }

    public final void run() {
        int var1_int = 0;
        gd var2 = null;
        int var4 = Main.field_T;
        ((ga) this).field_c = true;
        try {
            while (!((ga) this).field_d) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = ((ga) this).field_e[var1_int];
                    if (var2 != null) {
                        var2.f();
                    }
                }
                wk.a((byte) -123, 10L);
                Main.a((Object) null, ((ga) this).field_a, (byte) 109);
            }
        } catch (Exception exception) {
            Object var5 = null;
            k.a((Throwable) (Object) exception, (byte) -96, (String) null);
        } finally {
            ((ga) this).field_c = false;
        }
    }

    ga() {
        ((ga) this).field_e = new gd[2];
        ((ga) this).field_d = false;
        ((ga) this).field_c = false;
    }

    static {
    }
}
