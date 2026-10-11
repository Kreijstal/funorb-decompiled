/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static long field_c;
    private String field_b;
    static pf field_a;

    final static boolean a(int param0, char param1) {
        boolean stackIn_6_0 = false;
        if (param0 != -1) {
          bh.a(98, '<');
        }
        stackIn_6_0 = (param1 >= 48) && (param1 <= 57);
        return stackIn_6_0;
    }

    final static String b(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = stellarshard.field_B;
        var6 = "(" + ld.field_E + " " + t.field_e + " " + ig.field_y + ") " + ja.field_t;
        var1 = var6;
        if (param0 >= -94) {
          bh.a(68, '￑');
        }
        if (ue.field_b > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < ue.field_b; var2++) {
            var7 = var1 + ' ';
            var3 = ae.field_N.field_r[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 5 / ((-61 - param0) / 44);
          stackIn_1_0 = this.field_b.equals(param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("bh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 103 / ((param0 + 26) / 44);
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
          if (param1 != 73) {
            field_a = (pf) null;
          }
          b.a(this.field_b, (byte) 38, 31536000L, "jagex-last-login-method", param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "bh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bh(String param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
