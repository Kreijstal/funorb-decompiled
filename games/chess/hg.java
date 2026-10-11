/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static ci field_f;
    static wg field_b;
    static String field_a;
    static int[] field_d;
    int field_c;
    int field_e;

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
          hg.a(-93, false, -114);
          if (param2 >= 2) {
            return 2;
          }
          if (5 > param0) {
            return 0;
          }
          return 1;
        }
        if (param2 >= 2) {
          return 2;
        }
        if (5 > param0) {
          return 0;
        }
        return 1;
    }

    final static void a(int param0, int param1, ci param2, int param3, ci param4, int param5, boolean param6, int param7, ci param8, byte[] param9) {
        int var11 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = Chess.field_G;
        try {
          qh.field_g = param0;
          wk.field_e = param9;
          gb.field_t = -1L;
          qa.field_e = param9.length;
          g.field_f = new byte[(qh.field_g + 7) / 8];
          ud.field_b = false;
          pd.field_Rb = null;
          ib.field_d = null;
          var10_int = 0;
          for (var11 = 0; wk.field_e.length > var11; var11++) {
            var10_int = var10_int + (wk.field_e[var11] & 255);
          }
          var10_int = (var10_int + 7) / 8;
          fe.field_d = new byte[var10_int];
          if (null == param2.field_I) {
            param2.field_I = new jc();
          }
          if (!param6) {
            return;
          }
          bb.field_d = param2.field_I;
          bb.field_d.e(-31023);
          d.field_Mb = new dk(param5);
          fm.field_W = -1;
          jf.field_b = -1;
          cn.field_g = 0;
          cb.field_f = 0;
          if (param8.field_I == null) {
            param8.field_I = new jc();
          }
          nk.field_t = param8.field_I;
          nk.field_t.e(-31023);
          ae.field_f = new dk(param1);
          if (param4.field_I == null) {
            param4.field_I = new jc();
          }
          pd.field_Sb = param4.field_I;
          pd.field_Sb.e(-31023);
          cm.field_v = new dk(param3);
          eg.field_e = 0L;
          ig.field_g = param7;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_17_0 = var10;
          stackIn_17_1 = new StringBuilder().append("hg.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param9 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static double a(byte param0, double param1, double param2) {
        if (param0 == 26) {
          return Math.sqrt(param1 * param1 + param2 * param2);
        }
        field_a = (String) null;
        return Math.sqrt(param1 * param1 + param2 * param2);
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 > -9) {
          field_a = (String) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    hg(int param0, int param1, int param2, int param3) {
        this.field_e = param0;
        this.field_c = param3;
    }

    static {
        field_a = "OK";
    }
}
