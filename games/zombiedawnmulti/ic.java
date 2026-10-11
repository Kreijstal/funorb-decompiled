/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ic {
    static th field_c;
    static String field_l;
    static String field_b;
    static String[] field_k;
    static String field_i;
    static int field_e;
    static int field_d;
    static String field_f;
    static int[] field_h;
    static int field_a;
    static String field_j;
    static int field_g;

    abstract void a(k param0, int param1);

    abstract pi b(int param0);

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param2 < 40) {
                field_a = -65;
              }
              var3 = new java.net.URL(param0.getCodeBase(), param1);
              var3 = gf.a(param0, true, var3);
              f.a(param0, true, (byte) 125, var3.toString());
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ic.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 > 51) {
          field_c = null;
          field_j = null;
          field_f = null;
          field_l = null;
          field_b = null;
          field_k = null;
          field_h = null;
          field_i = null;
          return;
        }
    }

    static {
        field_c = new th();
        field_l = "Zombie Colours";
        field_i = "Lethal";
        field_f = "Close";
        field_b = "Realistic";
        field_j = "Meddle with their affairs...";
        field_h = new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 9, 9, 9, 7, 6, 6};
        field_k = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_e = -1;
    }
}
