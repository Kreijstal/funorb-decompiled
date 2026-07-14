/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class twa implements ntb {
    int field_a;
    static String[] field_b;

    public final void b(faa param0, int param1) {
        param0.a(-632, ((twa) this).field_a, 32);
        if (param1 >= -109) {
            Object var4 = null;
            boolean discarded$0 = ((twa) this).a((byte) 94, (tv) null);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 32) {
            twa.a(-98);
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            twa.b(40);
            ((twa) this).field_a = param0.i(0, 32);
            return;
        }
        ((twa) this).field_a = param0.i(0, 32);
    }

    public final void a(tv param0, int param1) {
        twa var3 = null;
        int var4 = 0;
        var3 = (twa) (Object) param0;
        if (param1 >= -19) {
          L0: {
            field_b = null;
            var4 = 0;
            if (var3.field_a == var3.field_a) {
              break L0;
            } else {
              var4 = 1;
              System.out.println("int choice has changed. before=" + var3.field_a + ", now=" + var3.field_a);
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              System.out.println("This instance of SpawnChoice has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            var4 = 0;
            if (var3.field_a == var3.field_a) {
              break L2;
            } else {
              var4 = 1;
              System.out.println("int choice has changed. before=" + var3.field_a + ", now=" + var3.field_a);
              break L2;
            }
          }
          L3: {
            if (var4 != 0) {
              System.out.println("This instance of SpawnChoice has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        twa var5 = null;
        twa var6 = null;
        var5 = (twa) (Object) param1;
        var6 = var5;
        if (param0 <= 54) {
          ((twa) this).field_a = 85;
          var6.field_a = var5.field_a;
          return;
        } else {
          var6.field_a = var5.field_a;
          return;
        }
    }

    final static void b(int param0) {
        lba.a(-1);
        if (param0 <= 25) {
          field_b = null;
          tla.field_c = true;
          vu.field_xb = true;
          klb.field_r.g((byte) -17);
          fa.a(ega.field_p, -122, false);
          return;
        } else {
          tla.field_c = true;
          vu.field_xb = true;
          klb.field_r.g((byte) -17);
          fa.a(ega.field_p, -122, false);
          return;
        }
    }

    twa() {
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = 36 % ((22 - param0) / 59);
        twa var3 = (twa) (Object) param1;
        return var3.field_a != var3.field_a ? true : false;
    }

    twa(int param0) {
        ((twa) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
