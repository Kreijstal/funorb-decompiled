/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gqa implements ntb {
    String field_b;
    int field_a;

    public final void b(faa param0, int param1) {
        Object var4 = null;
        if (param1 > -109) {
          var4 = null;
          ((gqa) this).b((faa) null, 29);
          param0.a(-632, ((gqa) this).field_a, 32);
          param0.r(32712);
          param0.b((byte) 0, ((gqa) this).field_b);
          param0.q(-110);
          return;
        } else {
          param0.a(-632, ((gqa) this).field_a, 32);
          param0.r(32712);
          param0.b((byte) 0, ((gqa) this).field_b);
          param0.q(-110);
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          return;
        } else {
          ((gqa) this).field_a = param0.i(0, 32);
          param0.f((byte) -118);
          ((gqa) this).field_b = param0.g(-1609246200);
          param0.p(-23497);
          return;
        }
    }

    public final void a(tv param0, int param1) {
        gqa var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var3 = (gqa) (Object) param0;
          var4 = 0;
          if (var3.field_a == var3.field_a) {
            break L0;
          } else {
            iva.a(-6940, "int playerid has changed. before=" + var3.field_a + ", now=" + var3.field_a);
            var4 = 1;
            break L0;
          }
        }
        L1: {
          if (var3.field_b.equals((Object) (Object) var3.field_b)) {
            break L1;
          } else {
            iva.a(-6940, "String displayname has changed. ");
            var4 = 1;
            break L1;
          }
        }
        if (param1 >= -19) {
          L2: {
            var5 = null;
            ((gqa) this).a((faa) null, false);
            if (var4 != 0) {
              tfb.a((byte) -58, "This instance of PlayerJoin has changed");
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (var4 != 0) {
              tfb.a((byte) -58, "This instance of PlayerJoin has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        gqa var5 = null;
        gqa var6 = null;
        var5 = (gqa) (Object) param1;
        var6 = var5;
        if (param0 <= 54) {
          ((gqa) this).field_b = null;
          var6.field_a = var5.field_a;
          var6.field_b = var5.field_b;
          return;
        } else {
          var6.field_a = var5.field_a;
          var6.field_b = var5.field_b;
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        gqa var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var4 = 36 / ((22 - param0) / 59);
        var3 = (gqa) (Object) param1;
        if (var3.field_a == var3.field_a) {
          if (!var3.field_b.equals((Object) (Object) var3.field_b)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    static {
    }
}
