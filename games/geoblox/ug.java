/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static int field_c;
    static vg field_a;
    static String field_b;

    final static StringBuilder a(StringBuilder param0, byte param1, char param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = Geoblox.field_C;
        if (param1 < -125) {
          var4 = param0.length();
          param0.setLength(param3);
          var5 = var4;
          L0: while (true) {
            if (param3 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param2);
              var5++;
              continue L0;
            }
          }
        } else {
          var7 = null;
          dm discarded$2 = ug.a((String) null, (rh) null, (byte) 14, (String) null);
          var4 = param0.length();
          param0.setLength(param3);
          var5 = var4;
          L1: while (true) {
            if (param3 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param2);
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        me var5 = null;
        var5 = (me) (Object) ue.field_f.e(1);
        if (var5 == null) {
          el.field_o.a((byte) 127, param0);
          return;
        } else {
          var5.field_k = 0.0f;
          var5.field_f = param0;
          var5.field_m = Integer.toString(param0);
          var5.field_n = (float)param4;
          var5.field_h = param3;
          if (!param1) {
            field_b = null;
            var5.field_i = (float)param2;
            md.field_a.a(-95, (hf) (Object) var5);
            return;
          } else {
            var5.field_i = (float)param2;
            md.field_a.a(-95, (hf) (Object) var5);
            return;
          }
        }
    }

    final static dm a(String param0, rh param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.a((byte) 127, param3);
        var5 = param1.a(param0, -57, var4);
        if (param2 != -78) {
          return null;
        } else {
          return qc.a(var4, param2 ^ -95, var5, param1);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 9144) {
            Object var2 = null;
            dm discarded$0 = ug.a((String) null, (rh) null, (byte) 53, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email (Login):";
    }
}
