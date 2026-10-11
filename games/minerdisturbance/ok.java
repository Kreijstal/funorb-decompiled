/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ok implements jm {
    static ta field_b;
    private long field_c;
    static String[][] field_d;
    static String field_a;

    public final void c(int param0) {
        if (param0 != -11) {
          return;
        }
        this.field_c = sf.a((byte) -87);
    }

    public final ag b(int param0) {
        if (param0 != 24595) {
          this.field_c = 39L;
          if (this.a(false)) {
            return ke.field_W;
          }
          if (!(sf.a((byte) 105) >= 350L + this.field_c)) {
            return nn.field_f;
          }
          return this.b(false);
        }
        if (this.a(false)) {
          return ke.field_W;
        }
        if (!(sf.a((byte) 105) >= 350L + this.field_c)) {
          return nn.field_f;
        }
        return this.b(false);
    }

    public final String a(int param0) {
        if (this.a(false)) {
          return null;
        }
        if (sf.a((byte) 107) < (this.field_c + 350L)) {
          return null;
        }
        if (param0 == 7320) {
          return this.e(96);
        }
        return (String) null;
    }

    abstract ag b(boolean param0);

    final static boolean a(int param0, CharSequence param1, boolean param2) {
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
        int var7Lifetime1;
        var8 = MinerDisturbance.field_ab;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int < 1) {
            return false;
          }
          if (12 < var3_int) {
            return false;
          }
          var4 = cl.a(-95, param1);
          if (var4 != null &&
            1 <= var4.length()) {
            if (!ra.a(121, var4.charAt(0)) &&
              !ra.a(119, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              for (var6 = 0; param1.length() > var6; var6++) {
                var7 = param1.charAt(var6);
                if (!ra.a(117, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (2 <= var5 &&
                  !param2) {
                  return false;
                }
              }
              var7Lifetime1 = -108 % ((-14 - param0) / 55);
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
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("ok.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_b = null;
        field_a = null;
        if (param0 == 1627) {
          field_d = (String[][]) null;
          return;
        }
        field_d = (String[][]) null;
        field_d = (String[][]) null;
    }

    abstract String e(int param0);

    static {
        field_b = new ta();
        field_d = new String[][]{null, new String[]{"Cold: This is the measure of how cold you are. If you get too cold you'll freeze to death. You warm up when you're on dry land."}};
        field_a = "A Miner and a Survivor";
    }
}
