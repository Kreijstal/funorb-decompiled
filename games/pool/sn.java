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
        try {
            int var3_int = -25 % ((-43 - param1) / 35);
            this.b(11755);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "sn.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_i.h((byte) -119);
              var3 = this.field_i.j(25);
              var5 = -15 / ((-30 - param0) / 45);
              var4 = this.field_i.h(119);
              var6 = em.h(36);
              if (-1891 < (var4 ^ -1)) {
                break L1;
              } else {
                if (var6 + -3 < var4) {
                  break L1;
                } else {
                  if (!qp.a((byte) 123, var4, var3, var2_int)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
            }
            stackIn_4_0 = nr.a(new String[]{"1890", Integer.toString(-3 + var6)}, -1, ej.field_c);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return ij.field_n;
        }
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
        try {
          L0: {
            L1: {
              if (param0 == -14836) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            var2_int = this.field_i.h((byte) -119);
            var3 = this.field_i.j(param0 ^ -14827);
            var4 = this.field_i.h(49);
            var5 = em.h(param0 + 14872);
            if (1890 <= var4) {
              if (-3 + var5 < var4) {
                stackIn_8_0 = gp.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (qp.a((byte) 122, var4, var3, var2_int)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_11_0 = gp.field_d;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = gp.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return gp.field_d;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return kr.field_e;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    public final void a(sl param0, boolean param1) {
        RuntimeException runtimeException = null;
        sl var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var4 = (sl) null;
                this.a((sl) null, -31);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sn.R(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public sn() {
    }

    public final boolean d(int param0) {
        if (param0 != -3) {
            sn.h(41);
            return this.field_i.g((byte) 114);
        }
        return this.field_i.g((byte) 114);
    }

    static {
        field_j = "Spots";
        field_l = "Lobby";
        field_k = "Random";
    }
}
