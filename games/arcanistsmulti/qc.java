/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static am field_c;
    static String field_b;
    static int field_e;
    static String field_g;
    static String field_f;
    static int field_a;
    static kc field_d;

    final static void a(boolean param0) {
        hi.a(-123, param0);
        ob.field_Y.b(480, 8110, 640);
        ob.field_Y.a((byte) -119, 1024, 1280);
        dh.a(rl.field_h, 9, 6);
        dh.a(me.field_H, 9, 8);
        if (!ArcanistsMulti.i((byte) -77)) {
          dh.a(gh.field_l, 9, 1);
          dh.a(ql.field_b, 9, 2);
          dh.a(eg.field_g, 9, 4);
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        ab var3 = he.field_e;
        var3.b((byte) -38, param2);
        if (!param0) {
          var3.f(3, (byte) -22);
          var3.f(9, (byte) -98);
          var3.c(param1, (byte) -60);
          return;
        }
        field_e = 51;
        var3.f(3, (byte) -22);
        var3.f(9, (byte) -98);
        var3.c(param1, (byte) -60);
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          if (param0 != 640) {
            field_c = (am) null;
          }
          var4 = gk.a(param2, param0 - 653);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!rk.a((byte) 127, var4.charAt(0)) &&
              !rk.a((byte) 121, var4.charAt(-1 + var4.length()))) {
              var5 = 0;
              for (var6 = 0; param2.length() > var6; var6++) {
                var7 = param2.charAt(var6);
                if (!rk.a((byte) -63, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("qc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_d = null;
        int var1 = -113 / ((param0 + 9) / 62);
    }

    static {
        field_c = new am();
        field_e = 250;
        field_g = "<%0> has resigned and left.";
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_f = "Reject";
    }
}
