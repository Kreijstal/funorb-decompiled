/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_e;
    static int field_b;
    static hj[] field_i;
    static bm[] field_g;
    static bm[] field_d;
    static byte[][] field_h;
    volatile boolean field_a;
    static gn field_c;
    java.awt.Frame field_f;
    static e field_j;

    public static void b(int param0) {
        field_h = null;
        if (param0 != 0) {
          field_e = null;
          field_c = null;
          field_j = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_i = null;
          return;
        } else {
          field_c = null;
          field_j = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_i = null;
          return;
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static String c(int param0) {
        if (param0 != 4) {
            ef.b(12);
            if (!(bb.field_a != sf.field_n)) {
                return qd.field_k;
            }
            return o.field_d;
        }
        if (!(bb.field_a != sf.field_n)) {
            return qd.field_k;
        }
        return o.field_d;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ef) this).field_a = true;
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static void a(gn param0, byte param1, gn param2) {
        if (param1 >= -94) {
            return;
        }
        n.field_w = param0;
        be.field_i = param2;
    }

    final void a(ib param0, int param1) {
        if (param1 != 50) {
            String discarded$0 = ef.c(62);
            rd.a((byte) 118, param0, ((ef) this).field_f);
            return;
        }
        rd.a((byte) 118, param0, ((ef) this).field_f);
    }

    final static float a(float param0, wd param1, int param2, float param3) {
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        qm var14 = null;
        qm var15 = null;
        qm var16 = null;
        qm var17 = null;
        if (param1.field_k != 0) {
          return 0.0f;
        } else {
          if (param2 != 14) {
            field_h = null;
            var15 = param1.a(false, param3);
            var14 = param1.a(false, param0);
            var6 = (float)(var14.field_h + -var15.field_h);
            var7 = (float)(var14.field_f - var15.field_f);
            var8 = (-param3 + param0) * param1.f(param2 ^ 60) * param1.field_o;
            var9 = var8 * -var6;
            var10 = -var7 * var8;
            var11 = var7 * var7 + var6 * var6;
            var12 = (float)Math.sqrt((double)(var11 * var11 + (var9 * var9 + var10 * var10)));
            var10 = var10 / var12;
            var9 = var9 / var12;
            return (var9 + var10) * -5.0f;
          } else {
            var17 = param1.a(false, param3);
            var16 = param1.a(false, param0);
            var6 = (float)(var16.field_h + -var17.field_h);
            var7 = (float)(var16.field_f - var17.field_f);
            var8 = (-param3 + param0) * param1.f(param2 ^ 60) * param1.field_o;
            var9 = var8 * -var6;
            var10 = -var7 * var8;
            var11 = var7 * var7 + var6 * var6;
            var12 = (float)Math.sqrt((double)(var11 * var11 + (var9 * var9 + var10 * var10)));
            var10 = var10 / var12;
            var9 = var9 / var12;
            return (var9 + var10) * -5.0f;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    ef() {
    }

    final static void a(int param0) {
        if (!mn.field_a) {
          throw new IllegalStateException();
        } else {
          bn.field_j = true;
          ol.a(true, (byte) -90);
          if (param0 <= 106) {
            field_i = null;
            bk.field_w = 0;
            return;
          } else {
            bk.field_w = 0;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This game has been updated! Please reload this page.";
        field_h = new byte[50][];
        field_j = new e(14, 0, 4, 1);
    }
}
