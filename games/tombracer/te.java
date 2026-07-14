/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static int field_b;
    private vna field_a;

    final void a(int param0) {
        if (param0 != -10430) {
            return;
        }
        ((te) this).field_a.d(8);
    }

    final void a(uw param0, int param1) {
        kua var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 == -28255) {
          var3 = (kua) (Object) ((te) this).field_a.f(-80);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              param0.a((byte) 25, var3.f((byte) 103), (fo) (Object) var3);
              var3 = (kua) (Object) ((te) this).field_a.e(111);
              continue L0;
            }
          }
        } else {
          field_b = 19;
          var3 = (kua) (Object) ((te) this).field_a.f(-80);
          L1: while (true) {
            if (var3 == null) {
              return;
            } else {
              param0.a((byte) 25, var3.f((byte) 103), (fo) (Object) var3);
              var3 = (kua) (Object) ((te) this).field_a.e(111);
              continue L1;
            }
          }
        }
    }

    final void a(int param0, vna param1) {
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        kua var6_ref = null;
        var6 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 == 23436) {
          var6_ref = (kua) (Object) param1.f(-80);
          L0: while (true) {
            if (var6_ref == null) {
              return;
            } else {
              ((te) this).field_a.b((byte) -97, (vg) (Object) new kua(var6_ref));
              var6_ref = (kua) (Object) param1.e(121);
              continue L0;
            }
          }
        } else {
          var5 = null;
          ((te) this).a(71, (vna) null);
          var6_ref = (kua) (Object) param1.f(-80);
          L1: while (true) {
            if (var6_ref == null) {
              return;
            } else {
              ((te) this).field_a.b((byte) -97, (vg) (Object) new kua(var6_ref));
              var6_ref = (kua) (Object) param1.e(121);
              continue L1;
            }
          }
        }
    }

    final void a(la param0, int param1) {
        int var4 = 0;
        kua var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 <= -59) {
          var5 = (kua) (Object) ((te) this).field_a.f(-80);
          L0: while (true) {
            if (var5 == null) {
              return;
            } else {
              var5.a(param0, (byte) -72);
              var5 = (kua) (Object) ((te) this).field_a.e(107);
              continue L0;
            }
          }
        } else {
          ((te) this).a(-81);
          var5 = (kua) (Object) ((te) this).field_a.f(-80);
          L1: while (true) {
            if (var5 == null) {
              return;
            } else {
              var5.a(param0, (byte) -72);
              var5 = (kua) (Object) ((te) this).field_a.e(107);
              continue L1;
            }
          }
        }
    }

    te() {
        ((te) this).field_a = new vna();
    }

    static {
    }
}
