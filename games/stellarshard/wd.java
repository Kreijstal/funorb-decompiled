/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int field_a;
    static int[] field_e;
    static boolean field_c;
    static int field_b;
    static int field_d;

    final static boolean a(int param0, boolean param1, int param2, String param3, String param4, String param5, mj param6) {
        RuntimeException var7 = null;
        jg var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ok.field_a != o.field_l) {
            return false;
          }
          var8 = new jg(na.field_d, param6);
          na.field_d.a((byte) 84, (rj) (var8));
          if (param2 != 5) {
            field_d = -43;
          }
          if (ah.d(-12171)) {
            var8.p(87);
            return true;
          }
          sb.field_a = param3;
          o.field_l = dj.field_a;
          u.field_k = param0;
          lc.field_p = param5;
          hi.field_d = null;
          qe.field_o = param1;
          kc.field_c = param4;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > 75) {
          field_e = null;
          return;
        }
        mj var2 = (mj) null;
        wd.a(70, true, -68, (String) null, (String) null, (String) null, (mj) null);
        field_e = null;
    }

    static {
        field_e = new int[]{0, 5, 1, 2, 3, 0};
        field_c = true;
    }
}
