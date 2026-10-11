/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends cb {
    static ea field_l;
    static ea[] field_k;
    static int field_j;
    static String field_i;

    public static void f(int param0) {
        if (param0 != -27836) {
          wj.g(-60);
        }
        field_k = null;
        field_l = null;
        field_i = null;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = MinerDisturbance.field_ab;
        try {
          if (param1 < 1) {
            field_j = 99;
          }
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (fg.a(-1975005818, param0)) {
            return true;
          }
          var8 = mf.field_f;
          var7 = var8;
          var6 = var7;
          var2 = var6;
          for (var3 = 0; var3 < var8.length; var3++) {
            var4 = var8[var3];
            if (~param0 == ~var4) {
              return true;
            }
          }
          var2Lifetime1 = ml.field_c;
          for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime1.length; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 == param0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "wj.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean g(int param0) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          var1_int = 17 / ((param0 - 60) / 57);
          for (var2 = 0; var2 < 35; var2++) {
            if (th.field_b[var2][cm.field_o] &&
              !d.a(var2, cm.field_o, (byte) 68)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "wj.E(" + param0 + ')');
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 10 % ((49 - param0) / 56);
          if (this.a(param1, 5) != fg.field_d) {
            return null;
          }
          stackIn_3_0 = vd.field_r;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final ag a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        ag stackIn_5_0 = null;
        ag stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 5) {
            var4 = (String) null;
            this.a((byte) 97, (String) null);
          }
          var5 = (CharSequence) ((Object) param0);
          if (!oi.a(-19804, var5)) {
            stackIn_5_0 = fg.field_d;
            return stackIn_5_0;
          }
          var6 = (CharSequence) ((Object) param0);
          var3_int = md.a(var6, true);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return sc.field_a;
          }
          stackIn_10_0 = fg.field_d;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wj.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    wj(ui param0) {
        super(param0);
    }

    static {
        field_k = new ea[4];
        field_i = "Suggested names: ";
    }
}
