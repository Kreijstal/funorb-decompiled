/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class of {
    static String field_g;
    static um field_a;
    static boolean field_h;
    static int field_e;
    static boolean field_c;
    static byte[][] field_f;
    static String field_b;
    static int field_i;
    static int field_d;

    abstract ad a(boolean param0);

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 88) {
          field_g = null;
          field_f = null;
          field_g = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_g = null;
          field_a = null;
          return;
        }
    }

    abstract int a(int param0, int param1);

    final static void a(int param0) {
        bb.field_f = bb.field_f + 1;
        if (param0 == 0) {
          jg.field_g = jg.field_g + 1;
          if (bb.field_f < 131072) {
            if (jg.field_g > 255) {
              if (-21 > (sl.field_f ^ -1)) {
                jm.field_p = jm.field_p + 1;
                jg.field_g = 0;
                sl.field_f = 0;
                if (mc.field_b.length > jm.field_p) {
                  return;
                } else {
                  jm.field_p = 0;
                  return;
                }
              } else {
                sl.field_f = sl.field_f + 1;
                jg.field_g = 255;
                return;
              }
            } else {
              return;
            }
          } else {
            bb.field_f = 0;
            if (jg.field_g > 255) {
              if (-21 > (sl.field_f ^ -1)) {
                jm.field_p = jm.field_p + 1;
                jg.field_g = 0;
                sl.field_f = 0;
                if (mc.field_b.length > jm.field_p) {
                  return;
                } else {
                  jm.field_p = 0;
                  return;
                }
              } else {
                sl.field_f = sl.field_f + 1;
                jg.field_g = 255;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract byte[] a(int param0, byte param1);

    final static void a(boolean param0, int param1) {
        bh var2 = null;
        int var3 = 0;
        ki var4 = null;
        var3 = client.field_A ? 1 : 0;
        var4 = (ki) (Object) cg.field_c.c((byte) -112);
        L0: while (true) {
          if (var4 == null) {
            if (!param0) {
              var2 = rc.field_e.c((byte) 109);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  gm.b(param1, 47);
                  var2 = rc.field_e.d(true);
                  continue L1;
                }
              }
            } else {
              of.a(true, -48);
              var2 = rc.field_e.c((byte) 109);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  gm.b(param1, 47);
                  var2 = rc.field_e.d(true);
                  continue L2;
                }
              }
            }
          } else {
            kk.a(param1, -15016, var4);
            var4 = (ki) (Object) cg.field_c.d(true);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "That name is not available";
        field_a = new um();
        field_f = new byte[1000][];
        field_b = "ESC - cancel private message";
        field_d = -1;
    }
}
