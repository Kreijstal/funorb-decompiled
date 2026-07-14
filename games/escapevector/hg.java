/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hg {
    static java.applet.Applet field_c;
    hg field_d;
    long field_e;
    static String field_a;
    hg field_b;
    static String field_f;

    final static boolean b(int param0) {
        if (param0 != 12) {
            return false;
        }
        if (null == pn.field_pb) {
            return false;
        }
        if (pn.field_pb.n(0) == null) {
            return false;
        }
        return true;
    }

    final boolean b(byte param0) {
        if (param0 == 48) {
          if (((hg) this).field_d == null) {
            return false;
          } else {
            return true;
          }
        } else {
          hg.c(-37);
          if (((hg) this).field_d == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, cc param2) {
        int var4 = 0;
        c var5 = null;
        var5 = om.field_c;
        var5.a(param1, true);
        var5.field_m = var5.field_m + 1;
        var4 = var5.field_m;
        if (param0 > -20) {
          return;
        } else {
          var5.f(1, -123);
          var5.f(param2.field_i, -123);
          var5.d(12680, param2.field_m);
          var5.a((byte) 126, param2.field_n);
          var5.a((byte) 127, param2.field_h);
          var5.a((byte) 123, param2.field_o);
          var5.a((byte) 125, param2.field_g);
          int discarded$1 = var5.c(var4, -61);
          var5.e(118, -var4 + var5.field_m);
          return;
        }
    }

    final static ui[] a(c param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        ui[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        ui var6 = null;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        var2 = param0.j(8, 8);
        if (0 >= var2) {
          var3 = param0.j(12, 8);
          var4 = new ui[var3];
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              if (param1 != 22178) {
                return null;
              } else {
                return var4;
              }
            } else {
              if (da.a(param0, (byte) -116)) {
                var6 = new ui();
                int discarded$6 = param0.j(24, param1 ^ 22186);
                int discarded$7 = param0.j(24, 8);
                var6.field_c = param0.j(24, param1 ^ 22186);
                int discarded$8 = param0.j(9, 8);
                int discarded$9 = param0.j(12, param1 ^ 22186);
                int discarded$10 = param0.j(12, 8);
                int discarded$11 = param0.j(12, 8);
                var4[var5] = var6;
                var5++;
                var5++;
                continue L0;
              } else {
                var6_int = param0.j(wf.a(var5 + -1, 24787), 8);
                var4[var5] = var4[var6_int];
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 > -26) {
            hg.c(6);
        }
    }

    final static void a(int param0) {
        if (param0 != 12) {
            hg.c(-66);
        }
    }

    final void c(byte param0) {
        if (((hg) this).field_d == null) {
          return;
        } else {
          if (param0 > -8) {
            boolean discarded$2 = hg.b(-128);
            ((hg) this).field_d.field_b = ((hg) this).field_b;
            ((hg) this).field_b.field_d = ((hg) this).field_d;
            ((hg) this).field_b = null;
            ((hg) this).field_d = null;
            return;
          } else {
            ((hg) this).field_d.field_b = ((hg) this).field_b;
            ((hg) this).field_b.field_d = ((hg) this).field_d;
            ((hg) this).field_b = null;
            ((hg) this).field_d = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Targets: ";
        field_a = "Create a free account to start using this feature";
    }
}
