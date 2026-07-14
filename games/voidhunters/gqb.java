/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gqb implements ntb {
    int field_c;
    static String field_b;
    static int field_a;

    public final void a(tv param0, int param1) {
        gqb var3 = null;
        int var4 = 0;
        var3 = (gqb) (Object) param0;
        var4 = 0;
        if (param1 >= -19) {
          L0: {
            field_b = null;
            if (var3.field_c == var3.field_c) {
              break L0;
            } else {
              System.out.println("int cooldown has changed. before=" + var3.field_c + ", now=" + var3.field_c);
              var4 = 1;
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              System.out.println("This instance of TimedSpecialOrderBehaviour has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (var3.field_c == var3.field_c) {
              break L2;
            } else {
              System.out.println("int cooldown has changed. before=" + var3.field_c + ", now=" + var3.field_c);
              var4 = 1;
              break L2;
            }
          }
          L3: {
            if (var4 != 0) {
              System.out.println("This instance of TimedSpecialOrderBehaviour has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = -108 / ((param0 - 22) / 59);
        gqb var3 = (gqb) (Object) param1;
        return var3.field_c != var3.field_c ? true : false;
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
            return;
        }
        gqb var5 = (gqb) (Object) param1;
        gqb var6 = var5;
        var6.field_c = var5.field_c;
    }

    public final void b(faa param0, int param1) {
        if (param1 >= -109) {
          gqb.a(55);
          param0.a(-632, ((gqb) this).field_c, 32);
          return;
        } else {
          param0.a(-632, ((gqb) this).field_c, 32);
          return;
        }
    }

    final static sg a(boolean param0) {
        ml var2 = null;
        ml var4 = null;
        ml var5 = null;
        ml var6 = null;
        ml var7 = null;
        ml var8 = null;
        sg var9 = null;
        var9 = new sg();
        var2 = new ml(0);
        var4 = new ml(14);
        var2.a(1, 0, var4);
        var5 = new ml(12);
        var5.field_a = new aqa();
        var5.a((byte) -82, 8);
        var5.field_a.a(true, 1024);
        var2.a(1, 1, var5);
        var6 = new ml(12);
        var6.field_a = new aqa();
        var6.a((byte) -64, 4);
        var6.field_a.a(true, 1024);
        var2.a(1, 2, var6);
        var7 = new ml(12);
        var7.field_a = new aqa();
        var7.a((byte) -113, 2);
        var7.field_a.a(true, 1024);
        var2.a(1, 3, var7);
        var8 = new ml(12);
        if (param0) {
          field_a = 66;
          var8.field_a = new aqa();
          var8.a((byte) -92, 1);
          var8.field_a.a(true, 1024);
          var2.a(1, 4, var8);
          var9.field_k = var2;
          var9.e((byte) 119);
          return var9;
        } else {
          var8.field_a = new aqa();
          var8.a((byte) -92, 1);
          var8.field_a.a(true, 1024);
          var2.a(1, 4, var8);
          var9.field_k = var2;
          var9.e((byte) 119);
          return var9;
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          ((gqb) this).field_c = 57;
          ((gqb) this).field_c = param0.i(0, 32);
          return;
        } else {
          ((gqb) this).field_c = param0.i(0, 32);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 121) {
            gqb.a(-50);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Create a free Account";
        field_a = 0;
    }
}
