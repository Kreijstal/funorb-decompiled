/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be implements ntb {
    int field_b;
    int field_a;

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        be var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = 34 / ((param0 - 22) / 59);
        var4 = (be) (Object) param1;
        if (var4.field_b == var4.field_b) {
          if (var4.field_a != var4.field_a) {
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

    public final void a(tv param0, int param1) {
        be var3 = null;
        int var4 = 0;
        if (param1 < -19) {
          L0: {
            var3 = (be) (Object) param0;
            var4 = 0;
            if (var3.field_b != var3.field_b) {
              System.out.println("int index has changed. before=" + var3.field_b + ", now=" + var3.field_b);
              var4 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var3.field_a == var3.field_a) {
              break L1;
            } else {
              var4 = 1;
              System.out.println("int value has changed. before=" + var3.field_a + ", now=" + var3.field_a);
              break L1;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of AdminMessage has changed");
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final String toString() {
        return ((be) this).field_b + " to " + ((be) this).field_a;
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((be) this).field_b, 32);
        if (param1 >= -109) {
            return;
        }
        param0.a(-632, ((be) this).field_a, 32);
    }

    final static void a(int param0, boolean param1, kka param2) {
        Object var4 = null;
        if (param0 != 32) {
          var4 = null;
          be.a(-122, false, (kka) null);
          mi.a(param2, param1, 256, (byte) 97);
          return;
        } else {
          mi.a(param2, param1, 256, (byte) 97);
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        be var5 = null;
        be var6 = null;
        var5 = (be) (Object) param1;
        var6 = var5;
        var6.field_a = var5.field_a;
        var6.field_b = var5.field_b;
        if (param0 < 54) {
          ((be) this).field_a = 35;
          return;
        } else {
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        Object var4 = null;
        if (param1) {
          var4 = null;
          be.a(-84, true, (kka) null);
          ((be) this).field_b = param0.i(0, 32);
          ((be) this).field_a = param0.i(0, 32);
          return;
        } else {
          ((be) this).field_b = param0.i(0, 32);
          ((be) this).field_a = param0.i(0, 32);
          return;
        }
    }

    static {
    }
}
