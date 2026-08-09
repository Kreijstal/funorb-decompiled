/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends ig implements sk {
    private bg field_W;
    private int field_Z;
    static boolean field_U;
    static bd field_ab;
    static jb[] field_V;
    static int[] field_X;
    static String field_Y;
    static bd field_T;

    public final bg a(byte param0) {
        int var2 = -60 % ((param0 - 35) / 39);
        return this.field_W;
    }

    final void a(bg param0, byte param1) {
        try {
            this.field_W = param0;
            if (param1 >= -37) {
                field_ab = (bd) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "sf.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
          field_V = (jb[]) null;
          pf.b(511);
          si.f(param3, param1, param0, param2);
          return;
        } else {
          pf.b(511);
          si.f(param3, param1, param0, param2);
          return;
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_Z = -param3 + (j.field_c - this.field_v);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "sf.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void e(byte param0) {
        super.e(param0);
        if (this.field_W != null) {
            this.field_W.a(true);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 60) {
              stackIn_4_0 = in.a(true, 10, -59, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("sf.EB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static double a(int param0, double param1) {
        if (param0 != 24) {
            return 0.5905378176354061;
        }
        return param1 * 24.0 - (double)uj.field_p.field_g;
    }

    public static void p(int param0) {
        CharSequence var2;
        field_T = null;
        field_V = null;
        field_X = null;
        field_ab = null;
        if (param0 != 10) {
          var2 = (CharSequence) null;
          sf.a((byte) 48, (CharSequence) null);
          field_Y = null;
          return;
        } else {
          field_Y = null;
          return;
        }
    }

    final String e(int param0) {
        if (param0 == 34) {
          if (this.field_u) {
            if (this.field_i == null) {
              return null;
            } else {
              jg.a(-128, rb.field_m, j.field_c - (this.field_Z + -this.field_s));
              return this.field_i;
            }
          } else {
            return null;
          }
        } else {
          field_X = (int[]) null;
          if (this.field_u) {
            if (this.field_i == null) {
              return null;
            } else {
              jg.a(-128, rb.field_m, j.field_c - (this.field_Z + -this.field_s));
              return this.field_i;
            }
          } else {
            return null;
          }
        }
    }

    sf(String param0, mh param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_U = false;
        field_Y = "Find the <%0>";
        field_V = new jb[51];
    }
}
