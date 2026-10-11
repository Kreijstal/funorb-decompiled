/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static String field_f;
    String field_g;
    String field_d;
    static int field_b;
    static oi field_c;
    boolean field_h;
    static String[] field_a;
    static o field_e;

    final static String a(String param0, int param1, String param2, String param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = wizardrun.field_H;
        try {
          var4_int = param3.length();
          var5 = param0.length();
          var6 = param2.length();
          if (param1 == var5) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = var6 - var5;
          if (0 != var8) {
            var9_int = 0;
            while (true) {
              var9_int = param3.indexOf(param0, var9_int);
              if (var9_int < 0) {
                break;
              }
              var9_int = var9_int + var5;
              var7 = var7 + var8;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param3.indexOf(param0, var10);
            if (var11 < 0) {
              discarded$2 = var9.append(param3.substring(var10));
              stackIn_14_0 = var9.toString();
              return stackIn_14_0;
            }
            discarded$0 = var9.append(param3.substring(var10, var11));
            discarded$1 = var9.append(param2);
            var10 = var11 + var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("wg.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static o[] a(int param0, int param1) {
        o[] var3 = null;
        o[] var2 = null;
        if (param1 == 9) {
          var3 = new o[9];
          var2 = var3;
          var3[4] = id.a((byte) 98, param0, 64);
          return var2;
        }
        return (o[]) null;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_a = null;
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        }
        String var2 = (String) null;
        wg.a((String) null, 30, (String) null, (String) null);
        field_a = null;
        field_f = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 1234) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(jl.a(param0 - 1338, var2, param1), "_top");
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
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("wg.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "World:<col=ffff00>";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
