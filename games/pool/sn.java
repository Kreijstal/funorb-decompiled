/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends gg implements pe, ha {
    static qb[] field_h;
    static String field_l;
    static String field_j;
    eq field_i;
    static String field_k;
    static vh field_m;
    static byte[] field_n;

    public final void a(sl param0, int param1) {
        int var3 = -25 % ((-43 - param1) / 35);
        ((sn) this).b(11755);
    }

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
        field_l = null;
        field_h = null;
        if (param0 != -119) {
          sn.a((byte) -90);
          field_k = null;
          field_j = null;
          return;
        } else {
          field_k = null;
          field_j = null;
          return;
        }
    }

    final String f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((sn) this).field_i.h((byte) -119);
              var3 = ((sn) this).field_i.j(25);
              var5 = -15 / ((-30 - param0) / 45);
              var4 = ((sn) this).field_i.h(119);
              var6 = em.h(36);
              if (-1891 < (var4 ^ -1)) {
                break L1;
              } else {
                if (var6 + -3 < var4) {
                  break L1;
                } else {
                  if (!qp.a((byte) 123, var4, var3, var2_int)) {
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
            stackOut_3_0 = nr.a(new String[2], -1, ej.field_c);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        return ij.field_n;
    }

    final static boolean h(int param0) {
        if (param0 != -3) {
            return true;
        }
        if (null == sm.field_C) {
            return false;
        }
        if (!sm.field_C.f(20628)) {
            return false;
        }
        return true;
    }

    final na g(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        na stackIn_4_0 = null;
        na stackIn_8_0 = null;
        na stackIn_11_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        na stackOut_7_0 = null;
        na stackOut_10_0 = null;
        na stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -14836) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var2_int = ((sn) this).field_i.h((byte) -119);
            var3 = ((sn) this).field_i.j(param0 ^ -14827);
            var4 = ((sn) this).field_i.h(49);
            var5 = em.h(param0 + 14872);
            if (1890 <= var4) {
              if (-3 + var5 < var4) {
                stackOut_7_0 = gp.field_d;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (qp.a((byte) 122, var4, var3, var2_int)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackOut_10_0 = gp.field_d;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_3_0 = gp.field_d;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return gp.field_d;
        }
        if (decompiledRegionSelector0 == 0) {
          return kr.field_e;
        } else {
          return stackIn_11_0;
        }
    }

    public final void a(sl param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            ((sn) this).a((sl) null, -31);
        }
    }

    public sn() {
    }

    public final boolean d(int param0) {
        if (param0 != -3) {
            boolean discarded$0 = sn.h(41);
            return ((sn) this).field_i.g((byte) 114);
        }
        return ((sn) this).field_i.g((byte) 114);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Spots";
        field_l = "Lobby";
        field_k = "Random";
    }
}
