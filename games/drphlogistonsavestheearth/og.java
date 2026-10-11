/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    String field_g;
    static he[] field_e;
    int field_a;
    String[] field_h;
    static he[] field_c;
    boolean field_b;
    boolean field_d;
    static vd field_f;

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        if (param0 < 20) {
          return;
        }
        field_c = null;
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          try {
            if (!bl.field_r.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = param1;
            while (true) {
              if (param0.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var2_ref2;
          stackIn_20_1 = new StringBuilder().append("og.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (!gf.field_G) {
          throw new IllegalStateException();
        }
        gm.field_M = true;
        qb.a(-127, false);
        if (param0 >= 55) {
          af.field_b = 0;
          return;
        }
    }

    og(boolean param0) {
        this.field_b = param0 ? true : false;
    }

    static {
    }
}
