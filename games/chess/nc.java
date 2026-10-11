/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends fb {
    private int field_R;
    int field_M;
    static pj field_N;
    int field_U;
    static jc field_O;
    private ml field_S;
    static String field_Q;
    static String field_P;
    static int field_T;

    final int a(int param0, byte param1) {
        if (param1 != 86) {
          return 60;
        }
        if (0 > param0) {
          return -1;
        }
        if (param0 < this.field_S.a(true)) {
          return this.field_S.c(param0, 1);
        }
        return -1;
    }

    public static void e(byte param0) {
        field_Q = null;
        int var1 = -3 / ((-55 - param0) / 42);
        field_N = null;
        field_P = null;
        field_O = null;
    }

    final int f(byte param0) {
        if (param0 < 51) {
          this.field_S = (ml) null;
          return this.field_R;
        }
        return this.field_R;
    }

    final boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Chess.field_G;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -param6 + (param1 - this.field_U);
          var9 = this.field_y - 2 * this.field_U;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_R / var9;
          if (param0 == 1) {
            this.field_S.a(var8_int, (byte) 43);
          } else {
            if (2 == param0) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_S.a(true) > var12; var12++) {
                var13 = -var8_int + this.field_S.c(var12, 1);
                var13 = var13 * var13;
                if (var13 < var10) {
                  var10 = var13;
                  var11 = var12;
                }
              }
              if (var11 < 0) {
                return true;
              }
              this.field_S.a(-1, var11);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_27_0 = var8;
          stackIn_27_1 = new StringBuilder().append("nc.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
          field_P = (String) null;
          return this.field_S.a(true);
        }
        return this.field_S.a(true);
    }

    final static boolean j(int param0) {
        if (param0 < 120) {
          nc.e((byte) -4);
          if (rm.field_Q < 10) {
            return false;
          }
          if (!ad.field_b) {
            return !ub.a(21549) ? true : false;
          }
          return false;
        }
        if (rm.field_Q < 10) {
          return false;
        }
        if (!ad.field_b) {
          return !ub.a(21549) ? true : false;
        }
        return false;
    }

    final static void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        r var1 = null;
        ln var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        r var1Lifetime1;
        var2 = Chess.field_G;
        try {
          var1 = (r) (bb.field_d.g(-18110));
          while (var1 != null) {
            if (var1.field_Sb > 0) {
              var1.field_Sb = var1.field_Sb - 1;
              if (var1.field_Sb == 0) {
                var1.field_Mb = 0;
                if (var1.l(1)) {
                  var1.c(-2193);
                }
              }
            }
            var1 = (r) (bb.field_d.a((byte) -94));
          }
          var1_ref = (ln) (nk.field_t.g(-18110));
          while (var1_ref != null) {
            if (var1_ref.field_Hb > 0) {
              var1_ref.field_Hb = var1_ref.field_Hb - 1;
              if (var1_ref.field_Hb == 0) {
                var1_ref.field_jc = 0;
                if (var1_ref.m(-23901)) {
                  var1_ref.c(-2193);
                }
              }
            }
            var1_ref = (ln) (nk.field_t.a((byte) -114));
          }
          if (param0 != 20579) {
            nc.j(-85);
          }
          var1Lifetime1 = (r) (pd.field_Sb.g(-18110));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_Sb > 0) {
              var1Lifetime1.field_Sb = var1Lifetime1.field_Sb - 1;
              if (0 != var1Lifetime1.field_Sb) {
                var1Lifetime1 = (r) (pd.field_Sb.a((byte) -125));
                continue;
              }
              var1Lifetime1.field_Mb = 0;
              if (var1Lifetime1.l(1)) {
                var1Lifetime1.c(-2193);
              }
            }
            var1Lifetime1 = (r) (pd.field_Sb.a((byte) -125));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref2), "nc.RA(" + param0 + ')');
        }
    }

    private nc() throws Throwable {
        throw new Error();
    }

    static {
        field_N = new pj();
        field_O = new jc();
        field_Q = "Connection timed out. Please try using a different server.";
        field_P = "Loading fonts";
    }
}
