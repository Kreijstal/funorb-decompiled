/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class it extends ara implements ntb {
    int field_k;
    static String field_m;
    static int field_j;
    int field_l;
    int field_i;

    public final boolean a(byte param0, tv param1) {
        it var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var4 = 10 / ((22 - param0) / 59);
            var3 = (it) (Object) param1;
            if (super.a((byte) -47, param1)) {
              break L1;
            } else {
              if (var3.field_k != var3.field_k) {
                break L1;
              } else {
                if (var3.field_l != var3.field_l) {
                  break L1;
                } else {
                  if (var3.field_i == var3.field_i) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final void a(lta param0, byte param1) {
        if (param1 >= -91) {
            Object var4 = null;
            ((it) this).b((byte) -77, (tv) null);
        }
    }

    public final void a(tv param0, int param1) {
        super.a(param0, -71);
        it var5 = (it) (Object) param0;
        int var4 = 0;
        if (!(var5.field_k == var5.field_k)) {
            System.out.println("int owner has changed. before=" + var5.field_k + ", now=" + var5.field_k);
            var4 = 1;
        }
        if (param1 >= -19) {
            ((it) this).field_i = 98;
        }
        if (!(var5.field_l == var5.field_l)) {
            System.out.println("int team has changed. before=" + var5.field_l + ", now=" + var5.field_l);
            var4 = 1;
        }
        if (var5.field_i != var5.field_i) {
            var4 = 1;
            System.out.println("int hyperdrive_timer has changed. before=" + var5.field_i + ", now=" + var5.field_i);
        }
        if (!(var4 == 0)) {
            System.out.println("This instance of EscapePod has changed, where owner=" + var5.field_k);
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -111);
        if (param1 >= -109) {
            field_j = -125;
        }
        param0.a(-632, ((it) this).field_k, 32);
        param0.a(-632, ((it) this).field_l, 32);
        param0.a(-632, ((it) this).field_i, 32);
    }

    final static boolean a(boolean[] param0, boolean[] param1, int param2) {
        int var5 = VoidHunters.field_G;
        if (param2 != 32) {
            return false;
        }
        if (!(param1 != null)) {
            return param0 != null ? true : false;
        }
        if (param0 == null) {
            return true;
        }
        if (!(param1.length == param0.length)) {
            return true;
        }
        int var3 = 0;
        int var4 = -3 + param1.length;
        while (var3 < var4) {
            if ((!param1[var3] ? 1 : 0) != (!param0[var3] ? 1 : 0)) {
                return true;
            }
            var3++;
            if (!((param1[var3] ? 1 : 0) != (!param0[var3] ? 1 : 0))) {
                return true;
            }
            var3++;
            if (!(param0[var3] == param1[var3])) {
                return true;
            }
            var3++;
            if (!((!param1[var3] ? 1 : 0) == (!param0[var3] ? 1 : 0))) {
                return true;
            }
            var3++;
        }
        var4 += 3;
        while (var3 < var4) {
            if ((!param0[var3] ? 1 : 0) != (!param1[var3] ? 1 : 0)) {
                return true;
            }
            var3++;
        }
        return false;
    }

    it() {
        ((it) this).field_i = 3 * oq.field_l;
    }

    public static void c(int param0) {
        field_m = null;
        if (param0 != 3) {
            field_j = -19;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((it) this).field_k = param0.i(0, 32);
        ((it) this).field_l = param0.i(0, 32);
        ((it) this).field_i = param0.i(0, 32);
    }

    public final void b(byte param0, tv param1) {
        super.b((byte) 110, param1);
        if (param0 < 54) {
            return;
        }
        it var5 = (it) (Object) param1;
        it var6 = var5;
        var6.field_l = var5.field_l;
        var6.field_i = var5.field_i;
        var6.field_k = var5.field_k;
    }

    final void c(byte param0) {
        if (((it) this).field_i > 0) {
            ((it) this).field_i = ((it) this).field_i - 1;
        }
        if (param0 != -7) {
            Object var3 = null;
            ((it) this).a((faa) null, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Please check if address is correct";
    }
}
