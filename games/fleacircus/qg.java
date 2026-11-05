/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static int[] field_a;
    static int field_c;
    static qc field_b;
    static String[] field_d;
    static ke field_f;
    static oc field_e;

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0) {
          return;
        }
        field_e = null;
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_7_0 = false;
        if (param1 >= -38) {
          field_e = (oc) null;
        }
        stackIn_7_0 = (0 == param0) || (param0 == 18);
        return stackIn_7_0;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
          java.net.URL var3 = null;
          if (param2 != 0) {
            ih var4 = (ih) null;
            qg.a((byte) 102, (short[]) null, -60, (ih) null);
          }
          try {
            var3 = new java.net.URL(param1.getCodeBase(), param0);
            var3 = ib.a(param1, var3, -5441);
            me.a(param1, param2 - 126, var3.toString(), true);
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static short[] a(byte param0, short[] param1, int param2, ih param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          var4_int = param3.b(param2, (byte) -87);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new short[var4_int];
          }
          var5 = param3.b(4, (byte) -87);
          if (param0 != 125) {
            field_a = (int[]) null;
          }
          var6 = (short)param3.b(16, (byte) -87);
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)(param3.b(var5, (byte) -87) + var6);
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)var6;
            }
          }
          stackIn_18_0 = (short[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("qg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_a = new int[40];
    }
}
