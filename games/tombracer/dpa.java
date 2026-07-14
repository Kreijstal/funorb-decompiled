/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dpa implements fo {
    int field_i;
    boolean field_g;
    kva field_e;
    dpa field_b;
    int field_j;
    int field_a;
    int field_h;
    int field_f;
    int field_d;
    static String field_c;

    public final int e(byte param0) {
        if (param0 > -86) {
          dpa.a(-37);
          return ((dpa) this).field_e.e((byte) -99) + -(((dpa) this).field_h << -1850429168);
        } else {
          return ((dpa) this).field_e.e((byte) -99) + -(((dpa) this).field_h << -1850429168);
        }
    }

    public final int b(byte param0) {
        int var2 = 36 / ((-23 - param0) / 53);
        return ((dpa) this).field_e.b((byte) 95) - -((dpa) this).field_i;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            boolean discarded$0 = ((dpa) this).d((byte) -51);
            return ((dpa) this).field_e.d((byte) 48);
        }
        return ((dpa) this).field_e.d((byte) 48);
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            return 115;
        }
        return ((dpa) this).field_e.c((byte) 125) + ((dpa) this).field_a;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            dpa.a(92);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public final void a(int param0, iq param1) {
        gr var3 = null;
        ka var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var3 = ((dpa) this).field_e.c(-85);
        if (var3 != null) {
          if (var3.a(-102)) {
            if (param0 <= 103) {
              return;
            } else {
              L0: {
                if (-1 == (((dpa) this).field_h ^ -1)) {
                  var4 = ((dpa) this).field_e.a((dpa) this, 44);
                  break L0;
                } else {
                  var4 = ((dpa) this).field_e.a(107, (dpa) this);
                  break L0;
                }
              }
              var5 = dfa.a(((dpa) this).field_f, 2048, -54);
              var6 = ((dpa) this).b((byte) -95);
              var7 = ((dpa) this).c((byte) 117);
              var8 = ((dpa) this).e((byte) -106);
              gqa.a(var5, -83584144, var7, var6, var4, var8);
              return;
            }
          } else {
            return;
          }
        } else {
          if (param0 <= 103) {
            return;
          } else {
            L1: {
              if (-1 == (((dpa) this).field_h ^ -1)) {
                var4 = ((dpa) this).field_e.a((dpa) this, 44);
                break L1;
              } else {
                var4 = ((dpa) this).field_e.a(107, (dpa) this);
                break L1;
              }
            }
            var5 = dfa.a(((dpa) this).field_f, 2048, -54);
            var6 = ((dpa) this).b((byte) -95);
            var7 = ((dpa) this).c((byte) 117);
            var8 = ((dpa) this).e((byte) -106);
            gqa.a(var5, -83584144, var7, var6, var4, var8);
            return;
          }
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            dpa.a(103);
        }
    }

    final dpa b(int param0) {
        dpa var2 = null;
        var2 = new dpa();
        var2.field_h = ((dpa) this).field_h;
        var2.field_f = ((dpa) this).field_f;
        if (param0 < 8) {
          return null;
        } else {
          var2.field_j = ((dpa) this).field_j;
          var2.field_e = ((dpa) this).field_e;
          var2.field_d = ((dpa) this).field_d;
          var2.field_i = ((dpa) this).field_i;
          var2.field_a = ((dpa) this).field_a;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Spectator";
    }
}
