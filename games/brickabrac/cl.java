/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends vi {
    static long field_q;
    static jp[] field_r;
    private int field_u;
    vl field_p;
    static String field_s;
    int field_t;

    public static void b(boolean param0) {
        field_r = null;
        if (!param0) {
            cl.b(true);
            field_s = null;
            return;
        }
        field_s = null;
    }

    final int a(int param0, StringBuilder param1) {
        int var3 = 0;
        ee var4 = null;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        var3 = -1437511254;
        var3 = var3 + (73 + ((cl) this).field_u * 71 << -223175901);
        var3 = var3 ^ ((cl) this).field_t * 21 - -29298 << 35560329;
        if (param0 >= 79) {
          var4 = (ee) (Object) ((cl) this).field_p.d(-103);
          L0: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              var3 = var3 ^ var4.a(92, param1);
              var4 = (ee) (Object) ((cl) this).field_p.a((byte) 116);
              continue L0;
            }
          }
        } else {
          ((cl) this).field_u = 98;
          var4 = (ee) (Object) ((cl) this).field_p.d(-103);
          L1: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              var3 = var3 ^ var4.a(92, param1);
              var4 = (ee) (Object) ((cl) this).field_p.a((byte) 116);
              continue L1;
            }
          }
        }
    }

    cl() {
        super(0, 0, 0, 0, 0);
        ((cl) this).field_p = new vl();
    }

    final void a(int param0, wq param1) {
        int var3 = 0;
        int var5 = 0;
        Object var6 = null;
        ee var7 = null;
        ee var8 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        ((cl) this).field_u = param1.l(255);
        ((cl) this).field_p.c((byte) -72);
        ((cl) this).field_t = 0;
        var3 = 0;
        if (param0 < 89) {
          var6 = null;
          ((cl) this).a(-40, (wq) null);
          L0: while (true) {
            if (((cl) this).field_u > var3) {
              var8 = new ee();
              var8.a(91, param1);
              ((cl) this).field_p.a((nm) (Object) var8, (byte) 3);
              ((cl) this).field_t = ((cl) this).field_t + var8.field_t;
              var3++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (((cl) this).field_u > var3) {
              var7 = new ee();
              var7.a(91, param1);
              ((cl) this).field_p.a((nm) (Object) var7, (byte) 3);
              ((cl) this).field_t = ((cl) this).field_t + var7.field_t;
              var3++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "The invitation has been withdrawn.";
    }
}
