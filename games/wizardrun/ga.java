/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static ji field_e;
    static ae field_c;
    static rj field_d;
    static boolean field_a;
    static int field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != -44) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ga.a((java.applet.Applet) null, (byte) -46);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, int param1, int param2, boolean param3) {
        int var9 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
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
        var12 = wizardrun.field_H;
        try {
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = -22 / ((-39 - param2) / 59);
            for (var9 = 0; var7 > var9; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param0.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (var10 != 43 ||
                !param3))) {
                if (var10 >= 48 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  var10 <= 90) {
                  var10 -= 55;
                } else {
                  if (var10 < 97) {
                    return false;
                  }
                  if (var10 > 122) {
                    return false;
                  }
                  var10 -= 87;
                }
                if (var10 >= param1) {
                  return false;
                }
                if (var4_int != 0) {
                  var10 = -var10;
                }
                var11 = var10 + var6 * param1;
                if (var6 != var11 / param1) {
                  return false;
                }
                var5 = 1;
                var6 = var11;
              }
            }
            stackIn_39_0 = var5;
            return stackIn_39_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("ga.B(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              if (param1 > -28) {
                ga.a(40);
              }
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              var3 = var2.indexOf('?');
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(jl.a(-122, var5, param0), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("ga.A(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = new ae();
        field_a = false;
        field_d = new rj(1);
    }
}
