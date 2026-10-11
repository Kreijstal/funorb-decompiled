/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class agb implements dja {
    public final tv a(byte param0) {
        int var2 = -61 % ((param0 + 64) / 50);
        return (tv) ((Object) new tt());
    }

    final static long a(CharSequence param0, int param1) {
        int var5 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        var7 = VoidHunters.field_G;
        try {
          var2_long = 0L;
          if (param1 != -49) {
            var8 = (CharSequence) null;
            agb.a((CharSequence) null, 54);
          }
          var4 = param0.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(1 - (-var6 + 65));
            } else if (97 <= var6 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + (1 + var6));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(27 + var6 - 48);
              }
            }
            if (177917621779460413L > var2_long) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("agb.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          this.a((byte) 63);
          return (tv[]) ((Object) new tt[param1]);
        }
        return (tv[]) ((Object) new tt[param1]);
    }

    static {
    }
}
