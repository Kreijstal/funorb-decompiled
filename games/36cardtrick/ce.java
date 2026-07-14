/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends java.awt.Canvas {
    static int field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        ((ce) this).field_a.paint(param0);
    }

    final static kc a(int param0, String param1, String param2, qk param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param0 >= -125) {
          var6 = (Object) null;
          byte[] discarded$2 = ce.a(true, 19, (Object) null);
          var4 = param3.a(18659, param2);
          var5 = param3.a(var4, param1, (byte) 7);
          return rh.a(var4, param3, var5, -30851);
        } else {
          var4 = param3.a(18659, param2);
          var5 = param3.a(var4, param1, (byte) 7);
          return rh.a(var4, param3, var5, -30851);
        }
    }

    final static void a(int param0) {
        cb var1 = null;
        w var2 = null;
        qk var3 = null;
        var1 = (cb) ha.field_d.a((byte) 74);
        if (param0 == 0) {
          if (var1 == null) {
            mc.a((byte) -128);
            return;
          } else {
            var2 = rd.field_j;
            int discarded$9 = var2.e((byte) 127);
            int discarded$10 = var2.e((byte) 124);
            int discarded$11 = var2.e((byte) 124);
            int discarded$12 = var2.e((byte) 126);
            var1.c(96);
            return;
          }
        } else {
          var3 = (qk) null;
          kc discarded$13 = ce.a(-22, (String) null, (String) null, (qk) null);
          if (var1 == null) {
            mc.a((byte) -128);
            return;
          } else {
            var2 = rd.field_j;
            int discarded$14 = var2.e((byte) 127);
            int discarded$15 = var2.e((byte) 124);
            int discarded$16 = var2.e((byte) 124);
            int discarded$17 = var2.e((byte) 126);
            var1.c(96);
            return;
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((ce) this).field_a.update(param0);
    }

    final static void a(qb param0, int param1, qb param2) {
        if (param1 == 0) {
          if (null != ((qb) param2).field_a) {
            param2.c(112);
            param2.field_d = param0;
            param2.field_a = ((qb) param0).field_a;
            ((qb) param2).field_a.field_d = param2;
            ((qb) param2).field_d.field_a = param2;
            return;
          } else {
            param2.field_d = param0;
            param2.field_a = ((qb) param0).field_a;
            ((qb) param2).field_a.field_d = param2;
            ((qb) param2).field_d.field_a = param2;
            return;
          }
        } else {
          field_b = 70;
          if (null == ((qb) param2).field_a) {
            param2.field_d = param0;
            param2.field_a = ((qb) param0).field_a;
            ((qb) param2).field_a.field_d = param2;
            ((qb) param2).field_d.field_a = param2;
            return;
          } else {
            param2.c(112);
            param2.field_d = param0;
            param2.field_a = ((qb) param0).field_a;
            ((qb) param2).field_a.field_d = param2;
            ((qb) param2).field_d.field_a = param2;
            return;
          }
        }
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        vf var4 = null;
        if (param1 == 0) {
          if (param2 != null) {
            if (!(param2 instanceof byte[])) {
              if (param2 instanceof vf) {
                var4 = (vf) param2;
                return var4.a((byte) 25);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              var3 = (byte[]) (byte[]) param2;
              if (!param0) {
                return var3;
              } else {
                return bf.a(param1 ^ 0, var3);
              }
            }
          } else {
            return null;
          }
        } else {
          field_b = -25;
          if (param2 != null) {
            if (!(param2 instanceof byte[])) {
              if (param2 instanceof vf) {
                var4 = (vf) param2;
                return var4.a((byte) 25);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              var3 = (byte[]) (byte[]) param2;
              if (!param0) {
                return var3;
              } else {
                return bf.a(param1 ^ 0, var3);
              }
            }
          } else {
            return null;
          }
        }
    }

    ce(java.awt.Component param0) {
        ((ce) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
