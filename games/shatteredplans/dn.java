/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends hb {
    static String field_k;
    static vd field_h;
    private db field_i;
    static String field_g;
    static int field_l;
    static qr field_f;
    static String field_j;

    final static String a(String param0, boolean param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param0.length();
        var3 = new char[var2];
        if (!param1) {
          field_j = null;
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return new String(var3);
            } else {
              var3[-var4 + var2 + -1] = param0.charAt(var4);
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (var2 <= var4) {
              return new String(var3);
            } else {
              var3[-var4 + var2 + -1] = param0.charAt(var4);
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, fk param1, byte param2) {
        sl var3 = null;
        int var4 = 0;
        sl var6 = null;
        sl var7 = null;
        if (param2 == 13) {
          var7 = js.field_f;
          var3 = var7;
          var7.h(param0, 255);
          var7.field_j = var7.field_j + 1;
          var4 = var7.field_j;
          var7.c(1, (byte) -60);
          if (param1.field_n != null) {
            var7.c(param1.field_n.length, (byte) -66);
            var7.a(0, param1.field_n.length, param1.field_n, 22186);
            int discarded$8 = var7.a(var4, param2 ^ -40);
            var7.field_j = var7.field_j - 4;
            param1.field_j = var7.a(16711680);
            var7.b(var7.field_j - var4, (byte) 119);
            return;
          } else {
            var7.c(0, (byte) -76);
            int discarded$9 = var7.a(var4, param2 ^ -40);
            var7.field_j = var7.field_j - 4;
            param1.field_j = var7.a(16711680);
            var7.b(var7.field_j - var4, (byte) 119);
            return;
          }
        } else {
          field_f = null;
          var6 = js.field_f;
          var3 = var6;
          var6.h(param0, 255);
          var6.field_j = var6.field_j + 1;
          var4 = var6.field_j;
          var6.c(1, (byte) -60);
          if (param1.field_n != null) {
            var6.c(param1.field_n.length, (byte) -66);
            var6.a(0, param1.field_n.length, param1.field_n, 22186);
            int discarded$10 = var6.a(var4, param2 ^ -40);
            var6.field_j = var6.field_j - 4;
            param1.field_j = var6.a(16711680);
            var6.b(var6.field_j - var4, (byte) 119);
            return;
          } else {
            var6.c(0, (byte) -76);
            int discarded$11 = var6.a(var4, param2 ^ -40);
            var6.field_j = var6.field_j - 4;
            param1.field_j = var6.a(16711680);
            var6.b(var6.field_j - var4, (byte) 119);
            return;
          }
        }
    }

    final static gq[] a(int param0) {
        if (param0 != 4) {
          return null;
        } else {
          return new gq[]{on.field_g, nd.field_c, td.field_O, ss.field_c, cl.field_p, kf.field_c, tf.field_j, na.field_I, ld.field_h, lc.field_b, m.field_A, mc.field_r, ks.field_a, ro.field_c};
        }
    }

    public static void d(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 != -107) {
          field_h = null;
          field_j = null;
          field_g = null;
          field_h = null;
          return;
        } else {
          field_j = null;
          field_g = null;
          field_h = null;
          return;
        }
    }

    final oh a(boolean param0) {
        if (param0) {
            oh discarded$0 = ((dn) this).a((byte) -124);
            return (oh) (Object) ((dn) this).field_i.b(32);
        }
        return (oh) (Object) ((dn) this).field_i.b(32);
    }

    final oh a(byte param0) {
        if (param0 < 99) {
            field_k = null;
            return (oh) (Object) ((dn) this).field_i.c(-127);
        }
        return (oh) (Object) ((dn) this).field_i.c(-127);
    }

    final int b(byte param0) {
        if (param0 != -61) {
            return -111;
        }
        return ((dn) this).field_i.c((byte) -73);
    }

    dn(db param0) {
        ((dn) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Email is valid";
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
