/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends qb {
    int field_j;
    static int field_h;
    vi[] field_r;
    byte[][][] field_l;
    vi[] field_p;
    int[] field_i;
    int field_o;
    static char field_n;
    static int[] field_q;
    static int[] field_g;
    int[] field_m;
    int[] field_k;

    final static boolean a(boolean param0, char param1) {
        ib var3;
        char stackIn_5_0 = 0;
        char stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        if (Character.isISOControl(param1)) {
          return false;
        } else {
          L0: {
            stackIn_5_0 = param1;

            if (param0) {
              stackIn_6_0 = stackIn_5_0;
              stackIn_6_1 = 0;
              break L0;
            } else {
              stackIn_6_0 = stackIn_5_0;
              stackIn_6_1 = 1;
              break L0;
            }
          }
          if (!ph.a(stackIn_6_0, stackIn_6_1 != 0)) {
            if (param1 != 45) {
              if (160 != param1) {
                if (32 != param1) {
                  if (param1 != 95) {
                    if (!param0) {
                      var3 = (ib) null;
                      fd.a(-68, (ib) null, false);
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static int a(int param0) {
        if (param0 != -28506) {
            field_g = (int[]) null;
            return kl.field_E;
        }
        return kl.field_E;
    }

    public static void b(byte param0) {
        field_q = null;
        if (param0 != 3) {
            ib var2 = (ib) null;
            fd.a(21, (ib) null, false);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void a(int param0, ib param1, boolean param2) {
        try {
            gh.a(li.a(param1, 100, param0), (byte) -109);
            if (param2) {
                field_h = 107;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "fd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    fd() {
    }

    static {
        field_h = 0;
        field_g = new int[8192];
    }
}
