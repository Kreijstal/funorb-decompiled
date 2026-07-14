/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class of extends te implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String[] field_h;
    static String field_n;
    static int[] field_m;
    static String field_i;
    private java.awt.image.ColorModel field_l;
    private java.awt.image.ImageConsumer field_j;
    static byte[][] field_k;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((of) this).addConsumer(param0);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((of) this).field_j) {
            ((of) this).field_j = null;
        }
    }

    private final synchronized void a(boolean param0) {
        if (!(null != ((of) this).field_j)) {
            return;
        }
        ((of) this).field_j.setPixels(0, 0, ((of) this).field_b, ((of) this).field_f, ((of) this).field_l, ((of) this).field_c, 0, ((of) this).field_b);
        if (!param0) {
            field_n = null;
        }
        ((of) this).field_j.imageComplete(2);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((of) this).field_j = param0;
        param0.setDimensions(((of) this).field_b, ((of) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((of) this).field_l);
        param0.setHints(14);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        ((of) this).field_c = new int[1 + param1 * param0];
        ((of) this).field_b = param0;
        ((of) this).field_f = param1;
        ((of) this).field_l = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        if (param2 != -36) {
            Object var6 = null;
            ((of) this).addConsumer((java.awt.image.ImageConsumer) null);
        }
        ((of) this).field_d = param3.createImage((java.awt.image.ImageProducer) this);
        this.a(true);
        boolean discarded$0 = param3.prepareImage(((of) this).field_d, (java.awt.image.ImageObserver) this);
        this.a(true);
        boolean discarded$1 = param3.prepareImage(((of) this).field_d, (java.awt.image.ImageObserver) this);
        this.a(true);
        boolean discarded$2 = param3.prepareImage(((of) this).field_d, (java.awt.image.ImageObserver) this);
        ((of) this).a(0);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        this.a(true);
        if (param3 <= 34) {
            Object var6 = null;
            ((of) this).a(16, 118, (byte) 14, (java.awt.Component) null);
        }
        boolean discarded$0 = param2.drawImage(((of) this).field_d, param1, param0, (java.awt.image.ImageObserver) this);
    }

    public static void b(int param0) {
        if (param0 < 66) {
            field_n = null;
        }
        field_n = null;
        field_h = null;
        field_i = null;
        field_k = null;
        field_m = null;
    }

    final static ef[] a(he param0, int param1) {
        int var5 = 0;
        ef var6 = null;
        int var7 = Terraphoenix.field_V;
        if (!param0.b(2)) {
            return new ef[]{};
        }
        mf var8 = param0.a(-84);
        while (var8.field_d == 0) {
            gi.a((byte) -64, 10L);
        }
        if ((var8.field_d ^ -1) == -3) {
            return new ef[]{};
        }
        int[] var12 = (int[]) var8.field_e;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        ef[] var4 = new ef[var12.length >> 289190274];
        if (param1 != 5) {
            return null;
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ef();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 1999408194];
            var6.field_e = var3[1 + (var5 << -942380542)];
            var6.field_g = var3[2 + (var5 << 78991650)];
            var6.field_f = var3[3 + (var5 << -1660728830)];
        }
        return var4;
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((of) this).field_j == param0;
    }

    of() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Armour: ";
        field_m = new int[]{1, 1, 1, 2, 3, 2, 3, 2, 2, 2, 3, 5, 5, 10, 10, 10, 3};
        field_i = "Toggle schematic view";
        field_h = new String[]{"", "", "", "", "", "", "Experimental Laser", "Laser Carbine", "Alien Weapon", "Large Alien Weapon", "Pulse Carbine", "Pulse Grenade", "New Alien Weapons", "New Alien Weapons", "Heavy Fusion Gun", "Fusion Launcher", "Fusion Rifle", "Alien Shield", "", "", ""};
    }
}
