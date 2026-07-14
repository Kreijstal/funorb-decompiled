/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends pe {
    static String field_q;
    private Object field_s;
    static hb[] field_p;
    static int[] field_r;

    final static void a(byte param0, String param1) {
        ei.a(param1, param0 ^ -35);
        nf.a(false, ab.field_p, -104);
        if (param0 != -15) {
            boolean discarded$0 = tk.c(false);
        }
    }

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        rk var4 = null;
        if (param2 != null) {
          if (param0 <= -39) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param1) {
                return var3;
              } else {
                return na.a(-12, var3);
              }
            } else {
              if (param2 instanceof rk) {
                var4 = (rk) param2;
                return var4.a(31);
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            tk.i(92);
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param1) {
                return var3;
              } else {
                return na.a(-12, var3);
              }
            } else {
              if (param2 instanceof rk) {
                var4 = (rk) param2;
                return var4.a(31);
              } else {
                throw new IllegalArgumentException();
              }
            }
          }
        } else {
          return null;
        }
    }

    final static boolean c(boolean param0) {
        if (param0) {
            return false;
        }
        return d.field_b.a((byte) -127);
    }

    tk(Object param0, int param1) {
        super(param1);
        ((tk) this).field_s = param0;
    }

    final static qc a(int param0, int param1, int[] param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        qc var9 = null;
        var9 = new qc(param1, param3, param0, param7, param5, param8, param2);
        sb.field_c.a((gg) (Object) var9, -7044);
        ah.a(false, param4, var9);
        if (param6 > -89) {
          return null;
        } else {
          return var9;
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void i(int param0) {
        field_p = null;
        field_r = null;
        if (param0 <= 107) {
            boolean discarded$0 = tk.c(true);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final boolean g(int param0) {
        if (param0 < 110) {
            Object discarded$0 = ((tk) this).h(-105);
            return false;
        }
        return false;
    }

    final Object h(int param0) {
        if (param0 != 31476) {
            ((tk) this).field_s = null;
            return ((tk) this).field_s;
        }
        return ((tk) this).field_s;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
        field_q = "From only <%0>/month";
    }
}
