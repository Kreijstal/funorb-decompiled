/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ehb {
    static Boolean field_f;
    static int field_g;
    static int field_e;
    private fh field_b;
    private vga field_c;
    private gnb field_d;
    private int field_a;

    final void a(long param0, byte param1, fh param2) {
        fh var6 = null;
        fh var7 = null;
        fh var8 = null;
        fh var9 = null;
        if (param1 <= -9) {
          if (0 == ((ehb) this).field_a) {
            var8 = ((ehb) this).field_c.b((byte) 77);
            var8.b(-3846);
            var8.d((byte) -35);
            if (var8 != ((ehb) this).field_b) {
              ((ehb) this).field_d.a(param0, (ksa) (Object) param2, (byte) -126);
              ((ehb) this).field_c.a(param2, -94);
              return;
            } else {
              var9 = ((ehb) this).field_c.b((byte) -128);
              var9.b(-3846);
              var9.d((byte) -35);
              ((ehb) this).field_d.a(param0, (ksa) (Object) param2, (byte) -126);
              ((ehb) this).field_c.a(param2, -94);
              return;
            }
          } else {
            ((ehb) this).field_a = ((ehb) this).field_a - 1;
            ((ehb) this).field_d.a(param0, (ksa) (Object) param2, (byte) -126);
            ((ehb) this).field_c.a(param2, -94);
            return;
          }
        } else {
          ((ehb) this).field_a = 91;
          if (0 == ((ehb) this).field_a) {
            var6 = ((ehb) this).field_c.b((byte) 77);
            var6.b(-3846);
            var6.d((byte) -35);
            if (var6 != ((ehb) this).field_b) {
              ((ehb) this).field_d.a(param0, (ksa) (Object) param2, (byte) -126);
              ((ehb) this).field_c.a(param2, -94);
              return;
            } else {
              var7 = ((ehb) this).field_c.b((byte) -128);
              var7.b(-3846);
              var7.d((byte) -35);
              ((ehb) this).field_d.a(param0, (ksa) (Object) param2, (byte) -126);
              ((ehb) this).field_c.a(param2, -94);
              return;
            }
          } else {
            ((ehb) this).field_a = ((ehb) this).field_a - 1;
            ((ehb) this).field_d.a(param0, (ksa) (Object) param2, (byte) -126);
            ((ehb) this).field_c.a(param2, -94);
            return;
          }
        }
    }

    final fh a(long param0, int param1) {
        fh var4 = null;
        int var5 = 0;
        var4 = (fh) (Object) ((ehb) this).field_d.a(param0, 117);
        if (var4 != null) {
          ((ehb) this).field_c.a(var4, -74);
          var5 = -104 % ((-26 - param1) / 38);
          return var4;
        } else {
          var5 = -104 % ((-26 - param1) / 38);
          return var4;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            ehb.a(false);
        }
    }

    ehb(int param0) {
        ((ehb) this).field_b = new fh();
        ((ehb) this).field_c = new vga();
        ((ehb) this).field_a = param0;
        int var2 = 1;
        while (param0 > var2 + var2) {
            var2 = var2 + var2;
        }
        ((ehb) this).field_d = new gnb(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 5;
    }
}
