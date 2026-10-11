/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends js {
    static hd field_i;
    static int field_j;
    static int field_g;
    static String field_k;
    private int field_h;
    static hd[] field_m;
    static int field_l;

    final void a(int param0, boolean param1, int param2, js param3) {
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!param1) {
            stackIn_3_1 = -param0 + 256;
          } else {
            stackIn_3_1 = param0;
          }
          this.field_h = stackIn_3_1;
          if (param2 >= -28) {
            field_g = 88;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kt.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        cd.a((byte) -128, g.field_a.field_J, 15);
        if (param0 != -85) {
          field_j = 82;
        }
    }

    final static int a(CharSequence param0, boolean param1, byte param2, int param3) {
        int var9 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          if (param3 >= 2 &&
            param3 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var8 = 37 % ((param2 - 73) / 47);
            var7 = param0.length();
            for (var9 = 0; var9 < var7; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param0.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (var10 != 43 ||
                !param1))) {
                if (var10 >= 48 &&
                  57 >= var10) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  90 >= var10) {
                  var10 -= 55;
                } else if (var10 >= 97 &&
                  var10 <= 122) {
                  var10 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var10 >= param3) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var10 = -var10;
                }
                var11 = var10 + param3 * var6;
                if (var6 != var11 / param3) {
                  throw new NumberFormatException();
                }
                var6 = var11;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_40_0 = var6;
            return stackIn_40_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("kt.C(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static kw a(boolean param0, String param1) {
        RuntimeException var2 = null;
        kw stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lc.field_e.a((byte) -80) &&
            !param1.equals(lc.field_e.a(3))) {
            lc.field_e = su.a(-3505, param1);
          }
          if (param0) {
            field_i = (hd) null;
          }
          stackIn_7_0 = lc.field_e;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("kt.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 >= -5) {
          return false;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 <= 123) {
          byte[] var2 = (byte[]) null;
          kt.a((byte[]) null, false);
        }
        field_k = null;
        field_m = null;
        field_i = null;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 124 / ((38 - param0) / 60);
    }

    final void a(int param0, boolean param1) {
        if (this.field_h != 256) {
          on.a(0, 0, 640, 480, 0, this.field_h);
        } else {
          on.b();
        }
        if (param0 != -5) {
          field_m = (hd[]) null;
        }
    }

    final static String a(byte[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = hf.a((byte) -127, param0.length, 0, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("kt.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    kt() {
        super(-3);
        this.field_h = 256;
    }

    static {
        field_j = -1;
        field_k = "You must play 1 more rated game before playing with the current options.";
    }
}
