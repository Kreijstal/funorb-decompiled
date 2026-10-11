/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ra implements dm {
    private long field_a;
    static mn field_c;
    static mn field_d;
    static String field_b;

    public static void b(boolean param0) {
        if (!param0) {
          field_c = (mn) null;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final fi a(int param0) {
        if (this.a(true)) {
          return gi.field_bb;
        }
        if (!((this.field_a + 350L) <= ri.a(-3))) {
          return ab.field_b;
        }
        if (param0 != -3621) {
          this.b((byte) 22);
        }
        return this.c(true);
    }

    public final String a(byte param0) {
        if (param0 < 65) {
          this.field_a = -60L;
        }
        if (this.a(true)) {
          return null;
        }
        if (ri.a(-3) < (350L + this.field_a)) {
          return null;
        }
        return this.b((byte) 126);
    }

    final static long a(CharSequence param0, int param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param0.length();
          var5 = 0;
          if (param1 < 115) {
            var8 = (CharSequence) null;
            ra.a((CharSequence) null, 84);
          }
          while (var5 < var4) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(var6 - 64);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + var6 + 1);
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-21 + var6);
              }
            }
            if (var2_long < 177917621779460413L) {
              var5++;
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (0L != var2_long) {
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
          stackIn_25_1 = new StringBuilder().append("ra.K(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(int param0) {
        if (param0 > -46) {
          this.field_a = -58L;
        }
        this.field_a = ri.a(-3);
    }

    abstract fi c(boolean param0);

    abstract String b(byte param0);

    static {
        field_c = new mn();
        field_d = new mn();
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
