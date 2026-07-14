/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    int[] field_d;
    int field_i;
    static String field_c;
    static int[] field_e;
    static String field_b;
    int field_h;
    static String field_g;
    static int field_f;
    static int field_a;

    final static sa a(int param0, rc param1) {
        sa var2 = new sa(param1, (pi) (Object) param1);
        hj.field_b.a((byte) -107, (pi) (Object) var2);
        hj.field_f.b((um) (Object) param1);
        if (param0 != 1963987425) {
            field_c = null;
        }
        return var2;
    }

    final static void a(byte param0) {
        tm var3 = null;
        tm var1 = null;
        tm var4 = null;
        int var2 = MinerDisturbance.field_ab;
        if (param0 > -84) {
            field_f = 8;
        }
        while (true) {
            var3 = (tm) (Object) ok.field_b.e(63854);
            var1 = var3;
            if (null == (tm) (Object) ok.field_b.e(63854)) {
                break;
            }
            ke.field_X[var3.field_s] = false;
        }
        while (true) {
            var4 = (tm) (Object) ec.field_c.e(63854);
            var1 = var4;
            if (null == (tm) (Object) ec.field_c.e(63854)) {
                break;
            }
            ke.field_X[var4.field_s] = false;
        }
    }

    mg(int param0, int param1, int param2) {
        ((mg) this).field_h = param0;
        ((mg) this).field_d = new int[param2 + 1];
        ((mg) this).field_i = param1;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -23719) {
            break L0;
          } else {
            mg.a((byte) -12);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((mg) this).field_d == null) {
              break L2;
            } else {
              if (((mg) this).field_d.length == 0) {
                break L2;
              } else {
                stackOut_4_0 = ((mg) this).field_d[((mg) this).field_d.length + -1];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_g = null;
        if (param0 < 48) {
            field_b = null;
        }
        field_c = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        if (((mg) this).field_d != null) {
            // if_icmpeq L24
        } else {
            return 0;
        }
        for (var3 = 1; var3 < ((mg) this).field_d.length; var3++) {
            if (!(((mg) this).field_d[var3] + ((mg) this).field_d[-1 + var3] >> 1963987425 <= param0)) {
                return var3 - 1;
            }
        }
        if (param1 != -24040) {
            return -91;
        }
        return ((mg) this).field_d.length - 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[1024];
        field_b = "Gas mask: Prevents gas causing asphyxiation.";
        field_g = "Click to continue";
        field_c = "Flaming Firework";
    }
}
