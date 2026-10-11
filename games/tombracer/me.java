/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me extends vg {
    boolean field_h;
    qh field_i;
    static String field_f;
    ff field_g;

    abstract boolean a(int param0, char param1, byte param2);

    abstract void a(byte param0);

    abstract boolean a(boolean param0);

    final boolean c(byte param0) {
        if (param0 > -109) {
          me.a(109);
        }
        return this.field_h;
    }

    public static void a(int param0) {
        if (param0 != 17355) {
          field_f = (String) null;
        }
        field_f = null;
    }

    void b(int param0) {
        if (param0 != -10968) {
          this.c((byte) -2);
        }
        this.field_h = true;
    }

    abstract void b(byte param0);

    me(qh param0) {
        try {
          this.field_i = param0;
          this.field_g = param0.field_k;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static short[] a(byte param0, int param1, kh param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2.b((byte) 44, param1);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new short[var4_int];
          }
          var5 = param2.b((byte) 44, 4);
          var6 = (short)param2.b((byte) 44, 16);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (short)(param2.b((byte) 44, var5) + var6);
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)var6;
            }
          }
          if (param0 <= 64) {
            field_f = (String) null;
          }
          stackIn_18_0 = (short[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("me.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
