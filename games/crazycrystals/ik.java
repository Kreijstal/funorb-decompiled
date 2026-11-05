/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ik {
    int field_a;
    int field_b;
    static int field_e;
    int field_c;
    static wj[] field_g;
    int field_d;
    static String field_f;

    final static String[] a(String param0, byte param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = CrazyCrystals.field_B;
        try {
          var11 = (CharSequence) ((Object) param0);
          var3_int = lp.a(var11, (byte) -40, param2);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = var8 + 1;
          }
          if (param1 != -76) {
            var10 = (String) null;
            ik.a((String) null, (byte) 127, 'ﾸ');
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ik.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 0) {
          return false;
        }
        stackIn_8_0 = (qh.field_i >= this.field_a) && (qh.field_i < this.field_a + this.field_b) && (bm.field_h >= this.field_d) && (bm.field_h < this.field_c + this.field_d);
        return stackIn_8_0;
    }

    final boolean a(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 >= -59) {
          this.a(false, -29, -81);
        }
        stackIn_8_0 = (this.field_a <= to.field_a) && (to.field_a < this.field_b + this.field_a) && (dp.field_h >= this.field_d) && (this.field_d + this.field_c > dp.field_h);
        return stackIn_8_0;
    }

    abstract void a(boolean param0, int param1, int param2);

    public static void a(byte param0) {
        if (param0 <= 99) {
          field_e = -126;
        }
        field_f = null;
        field_g = null;
    }

    static {
        field_f = "To server list";
    }
}
