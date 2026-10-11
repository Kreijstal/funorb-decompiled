/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dh {
    static long field_b;
    int[] field_c;
    java.awt.Image field_f;
    int field_a;
    static de field_e;
    static String field_g;
    int field_d;

    abstract void a(java.awt.Graphics param0, int param1, int param2, byte param3);

    final void b(int param0) {
        int var2 = -12 % ((param0 + 53) / 62);
        bi.a(this.field_c, this.field_d, this.field_a);
    }

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static void c(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var2;
        var2 = ZombieDawn.field_J;
        if (param0 == 256) {
          if (rc.field_p == f.field_k) {
            fieldTemp$3 = ln.field_b;
            ln.field_b = ln.field_b + 1;
            if (fieldTemp$3 < 16) {
              return;
            }
            if (sc.field_a) {
              td.a(112);
            } else {
              cc.d(0);
            }
            rc.field_p = bg.field_k;
            return;
          }
          if (rc.field_p != bg.field_k) {
            if (bb.field_f != rc.field_p) {
              return;
            }
            fieldTemp$2 = ln.field_b;
            ln.field_b = ln.field_b - 1;
            if (0 < fieldTemp$2) {
              return;
            }
            rc.field_p = rc.field_x;
            return;
          }
        } else {
          field_e = (de) null;
          if (rc.field_p == f.field_k) {
            fieldTemp$1 = ln.field_b;
            ln.field_b = ln.field_b + 1;
            if (fieldTemp$1 < 16) {
              return;
            }
            if (sc.field_a) {
              td.a(112);
            } else {
              cc.d(0);
            }
            rc.field_p = bg.field_k;
            return;
          }
          if (rc.field_p != bg.field_k) {
            if (bb.field_f != rc.field_p) {
              return;
            }
            fieldTemp$0 = ln.field_b;
            ln.field_b = ln.field_b - 1;
            if (0 < fieldTemp$0) {
              return;
            }
            rc.field_p = rc.field_x;
            return;
          }
        }
        if (!po.w(13296)) {
          if (null != sc.field_c) {
            gm.a(sc.field_c, (byte) 110, 3);
          }
          sl.a((byte) 47);
          if (hp.field_C) {
            hp.field_C = false;
            cn.a(false, false);
          }
        }
        rc.field_p = bb.field_f;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 16) {
          dh.c(-103);
          field_g = null;
          return;
        }
        field_g = null;
    }

    static {
        field_e = new de(256);
        field_g = "Unpacking graphics";
    }
}
