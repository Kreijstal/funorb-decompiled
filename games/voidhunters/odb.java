/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class odb implements ntb {
    int field_a;
    static llb field_b;
    int field_d;
    int field_c;

    public final void b(byte param0, tv param1) {
        odb var5 = null;
        odb var6 = null;
        var5 = (odb) (Object) param1;
        var6 = var5;
        var6.field_a = var5.field_a;
        var6.field_d = var5.field_d;
        if (param0 < 54) {
          return;
        } else {
          var6.field_c = var5.field_c;
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          ((odb) this).field_a = -41;
          ((odb) this).field_a = param0.i(0, 32);
          ((odb) this).field_d = param0.i(0, 32);
          ((odb) this).field_c = param0.i(0, 32);
          return;
        } else {
          ((odb) this).field_a = param0.i(0, 32);
          ((odb) this).field_d = param0.i(0, 32);
          ((odb) this).field_c = param0.i(0, 32);
          return;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        odb var5 = null;
        if (param1 <= -19) {
          L0: {
            var5 = (odb) (Object) param0;
            var4 = 0;
            if (var5.field_a != var5.field_a) {
              System.out.println("int target_id has changed. before=" + var5.field_a + ", now=" + var5.field_a);
              var4 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var5.field_d == var5.field_d) {
              break L1;
            } else {
              var4 = 1;
              System.out.println("int target_x has changed. before=" + var5.field_d + ", now=" + var5.field_d);
              break L1;
            }
          }
          L2: {
            if (var5.field_c == var5.field_c) {
              break L2;
            } else {
              System.out.println("int target_y has changed. before=" + var5.field_c + ", now=" + var5.field_c);
              var4 = 1;
              break L2;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of TargetLock has changed");
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((odb) this).field_a, 32);
        param0.a(-632, ((odb) this).field_d, 32);
        param0.a(-632, ((odb) this).field_c, 32);
        if (param1 >= -109) {
            ((odb) this).field_c = -84;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        odb var4 = null;
        var3 = -108 / ((22 - param0) / 59);
        var4 = (odb) (Object) param1;
        if (var4.field_a == var4.field_a) {
          if (var4.field_d == var4.field_d) {
            if (var4.field_c != var4.field_c) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
    }
}
