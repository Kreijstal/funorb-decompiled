/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends ej {
    static go field_g;
    static String[] field_f;
    static String field_h;
    private java.nio.ByteBuffer field_i;
    static e field_k;
    static int[] field_j;

    final static void a(int param0, int param1) {
        int var3 = 0;
        fb var4 = null;
        jg var5 = null;
        var3 = HoldTheLine.field_D;
        var4 = (fb) (Object) bj.field_O.b((byte) 89);
        L0: while (true) {
          if (var4 == null) {
            var5 = (jg) (Object) pc.field_e.b((byte) 86);
            L1: while (true) {
              if (var5 == null) {
                if (param1 != 0) {
                  la.a(41, -85);
                  return;
                } else {
                  return;
                }
              } else {
                gd.a(var5, (byte) 86, param0);
                var5 = (jg) (Object) pc.field_e.c((byte) 90);
                continue L1;
              }
            }
          } else {
            dn.a(var4, param0, 111);
            var4 = (fb) (Object) bj.field_O.c((byte) 87);
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_f = null;
        if (param0 > -52) {
          field_h = null;
          field_k = null;
          field_h = null;
          field_g = null;
          return;
        } else {
          field_k = null;
          field_h = null;
          field_g = null;
          return;
        }
    }

    la() {
    }

    final byte[] a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((la) this).field_i.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$9 = ((la) this).field_i.position(0);
        if (param0 < 14) {
          return null;
        } else {
          java.nio.ByteBuffer discarded$10 = ((la) this).field_i.get(var3);
          return var3;
        }
    }

    final void a(int param0, byte[] param1) {
        ((la) this).field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$10 = ((la) this).field_i.position(0);
        java.nio.ByteBuffer discarded$16 = ((la) this).field_i.put(param1);
        if (param0 <= 94) {
            field_f = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "1pt";
        field_k = new e(15, 0, 1, 0);
    }
}
