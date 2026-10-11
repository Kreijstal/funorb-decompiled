/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fq {
    int field_h;
    int field_d;
    int field_e;
    static String field_f;
    static int field_g;
    static double field_j;
    int field_k;
    static boolean field_i;
    static String field_a;
    int field_l;
    int field_c;
    static int[] field_b;

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_b = null;
        if (param0 > -122) {
          field_f = (String) null;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              if (param1 != -16) {
                return;
              }
              param0.getAppletContext().showDocument(ar.a(param0, var2, 0), "_top");
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
            stackIn_8_1 = new StringBuilder().append("fq.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "Offer rematch";
        field_a = "Your game";
        field_b = new int[8192];
    }
}
