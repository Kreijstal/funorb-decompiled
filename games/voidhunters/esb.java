/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class esb extends qq implements mkb {
    static asb field_j;
    private byte field_i;

    final int b(byte param0) {
        if (param0 != 125) {
          this.field_i = (byte) -12;
          return this.field_i;
        }
        return this.field_i;
    }

    public final boolean a(int param0, int param1, int param2) {
        this.field_i = (byte)param0;
        super.a(25427, param1);
        if (param2 <= 81) {
          this.a(-84);
          return true;
        }
        return true;
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        if (param1 > 16) {
          return super.a(false, param0, this.field_d.field_Vc);
        }
        CharSequence var4 = (CharSequence) null;
        esb.a(-9, (CharSequence) null);
        return super.a(false, param0, this.field_d.field_Vc);
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          var2_int = param1.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param0 <= 2) {
            field_j = (asb) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 + 32);
            } else if ((97 > var5 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_22_0 = new String(var8);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("esb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final boolean b(int param0) {
        if (param0 == -20836) {
          return super.a((byte) -124, this.field_d.field_Vc);
        }
        CharSequence var3 = (CharSequence) null;
        esb.a(91, (CharSequence) null);
        return super.a((byte) -124, this.field_d.field_Vc);
    }

    public static void e(int param0) {
        if (param0 >= -104) {
          CharSequence var2 = (CharSequence) null;
          esb.a(27, (CharSequence) null);
          field_j = null;
          return;
        }
        field_j = null;
    }

    esb(jp param0, boolean param1) {
        super(param0, 34962, param1);
    }

    public final void a(int param0) {
        if (param0 > -84) {
          return;
        }
        super.a(-119);
    }

    static {
    }
}
