/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qg {
    qfa field_b;
    static soa field_a;

    public static void c(int param0) {
        field_a = null;
        if (param0 != -15081) {
            field_a = null;
        }
    }

    abstract void a(int param0);

    abstract void a(boolean param0, boolean param1);

    abstract void a(boolean param0, int param1);

    final static int a(slb param0, boolean param1) {
        if (!param1) {
          if (param0 != qcb.field_q) {
            if (param0 != tma.field_q) {
              if (param0 != pja.field_l) {
                if (param0 == pea.field_d) {
                  return 34166;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                return 34168;
              }
            } else {
              return 34167;
            }
          } else {
            return 5890;
          }
        } else {
          return 104;
        }
    }

    abstract boolean b(int param0);

    qg(qfa param0) {
        ((qg) this).field_b = param0;
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, byte param1, pib param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        vja discarded$0 = new vja();
    }
}
