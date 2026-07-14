/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so implements ntb {
    static phb field_e;
    static int field_b;
    int field_a;
    int field_c;
    static String field_d;
    static int[] field_f;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_f = null;
        if (param0 != 61) {
            field_b = 59;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        so var6 = null;
        var6 = (so) (Object) param0;
        if (param1 <= -19) {
          L0: {
            var4 = 0;
            if (((so) this).field_a != var6.field_a) {
              System.out.println("int id has changed. before=" + var6.field_a + ", now=" + ((so) this).field_a);
              var4 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((so) this).field_c == var6.field_c) {
              break L1;
            } else {
              System.out.println("int value has changed. before=" + var6.field_c + ", now=" + ((so) this).field_c);
              var4 = 1;
              break L1;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of SettingsChange has changed");
            return;
          } else {
            return;
          }
        } else {
          L2: {
            var5 = null;
            ((so) this).a((faa) null, false);
            var4 = 0;
            if (((so) this).field_a != var6.field_a) {
              System.out.println("int id has changed. before=" + var6.field_a + ", now=" + ((so) this).field_a);
              var4 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((so) this).field_c == var6.field_c) {
              break L3;
            } else {
              System.out.println("int value has changed. before=" + var6.field_c + ", now=" + ((so) this).field_c);
              var4 = 1;
              break L3;
            }
          }
          if (var4 == 0) {
            return;
          } else {
            System.out.println("This instance of SettingsChange has changed");
            return;
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        ((so) this).field_a = param0.i(0, 32);
        ((so) this).field_c = param0.i(0, 32);
        if (param1) {
            field_f = null;
        }
    }

    so() {
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((so) this).field_a, 32);
        param0.a(-632, ((so) this).field_c, 32);
        if (param1 >= -109) {
            Object var4 = null;
            ((so) this).b((faa) null, 25);
        }
    }

    so(int param0, int param1) {
        ((so) this).field_c = param1;
        ((so) this).field_a = param0;
    }

    public final boolean a(byte param0, tv param1) {
        so var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = (so) (Object) param1;
        var4 = -54 / ((22 - param0) / 59);
        if (var3.field_a == var3.field_a) {
          if (var3.field_c != var3.field_c) {
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

    public final void b(byte param0, tv param1) {
        so var5 = null;
        so var6 = null;
        var5 = (so) (Object) param1;
        var6 = var5;
        var6.field_a = var5.field_a;
        var6.field_c = var5.field_c;
        if (param0 <= 54) {
          ((so) this).field_c = -97;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 3;
        field_d = "Create";
    }
}
