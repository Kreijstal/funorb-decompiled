/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends li {
    int field_p;
    int[] field_u;
    int[] field_y;
    wk[] field_t;
    static cc field_s;
    static cr field_v;
    static String field_x;
    byte[][][] field_q;
    int[] field_o;
    int field_n;
    static r field_r;
    wk[] field_w;

    final static boolean a(char param0, byte param1) {
        if (param1 > -87) {
          field_v = (cr) null;
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (param0 <= 122) {
            return true;
          }
          return false;
        }
        if (param0 >= 65) {
          if (param0 <= 90) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (param0 <= 122) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 <= 122) {
          return true;
        }
        return false;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, jj param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        cl[] var10 = null;
        wk var11 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!param3.a(-124)) {
            return null;
          }
          if (param1 == 0) {
            var10 = an.a(8315, param3);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (param4 == var10[var8].field_b &&
                param0 == var10[var8].field_a && ((0 == param2 ||
                var10[var8].field_e == param2) &&
                (var7_int == 0 ||
                !(var10[var8].field_g <= param1)))) {
                param1 = var10[var8].field_g;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              stackIn_23_0 = null;
              return (java.awt.Frame) (stackIn_23_0);
            }
          }
          var11 = param3.a(param0, param4, param2, param1, 1636602704);
          while (var11.field_b == 0) {
            um.a(true, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_d);
          if (param5 < 20) {
            field_s = (cc) null;
          }
          if (var7 == null) {
            return null;
          }
          if (var11.field_b != 2) {
            return var7;
          }
          br.a(var7, param3, 8);
          stackIn_35_0 = null;
          return (java.awt.Frame) (stackIn_35_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_38_0 = var6_ref;
          stackIn_38_1 = new StringBuilder().append("oc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_x = null;
        field_v = null;
        field_s = null;
        field_r = null;
        if (param0 != -27171) {
          field_s = (cc) null;
        }
    }

    oc() {
    }

    static {
        field_x = "Please log in to access this feature.";
    }
}
