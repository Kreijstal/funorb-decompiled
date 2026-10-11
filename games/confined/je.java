/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends vf {
    private int field_y;
    private int field_w;
    static String field_v;
    private int field_x;
    private nf[] field_u;

    public static void c(int param0) {
        field_v = null;
        if (param0 >= -67) {
          field_v = (String) null;
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = hh.a(0, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!bg.a(175, var4.charAt(0)) &&
                !bg.a(param0 ^ 175, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                for (var6 = param0; var6 < param2.length(); var6++) {
                  var7 = param2.charAt(var6);
                  if (!bg.a(param0 ^ 175, (char) var7)) {
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
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("je.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        try {
          if (param0 > -97) {
            var9 = (CharSequence) null;
            je.a(126, true, (CharSequence) null);
          }
          if (!param3.field_w) {
            stackIn_8_0 = (param3.e((byte) -18)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param3 instanceof rg) {
            param2 = param2 & ((rg) (param3)).field_L;
          }
          if (param2) {
            if (var6_int != 0) {
              stackIn_16_0 = this.field_x;
            } else {
              stackIn_16_0 = this.field_y;
            }
          } else {
            stackIn_16_0 = this.field_w;
          }
          var7 = stackIn_16_0;
          stackIn_19_0 = (param2) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          qj.a(this.field_u, param3.field_m + param4 + (param3.field_z - this.field_u[0].field_x >> 1), param3.field_F, 55, param1 + param3.field_q, var7);
          this.field_a.a(param3.field_B, param1 + param3.field_q, param4 + param3.field_m - 2, param3.field_F, param3.field_z, var8, -1, 1, 1, this.field_a.field_C);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("je.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    public je() {
        this(2188450, 2591221, 9543);
    }

    private je(int param0, int param1, int param2) {
        this.field_w = param2;
        this.field_x = param1;
        this.field_u = em.field_d;
        this.field_y = param0;
        this.field_a = fd.field_k;
    }

    static {
    }
}
