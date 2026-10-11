/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static fe field_b;
    static er[] field_a;
    static int field_d;
    static String field_c;
    static int[] field_e;
    static boolean[][] field_f;

    public static void a(byte param0) {
        field_f = (boolean[][]) null;
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = -53 / ((-39 - param0) / 33);
        field_c = null;
    }

    final static boolean a(int param0) {
        if (param0 == 1) {
          return pd.field_c.b(-83);
        }
        int[] var2 = (int[]) null;
        sf.a((int[]) null, (byte) -70, 6, -67, (int[]) null);
        return pd.field_c.b(-83);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(ar.a(param0, var2, 0), "_top");
              if (param1 < -40) {
                return;
              }
              field_d = 84;
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
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("sf.B(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int[] param0, byte param1, int param2, int param3, int[] param4) {
        int var10 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != 17) {
            return;
          }
          if (param3 >= param2) {
            return;
          }
          var5_int = (param2 + param3) / 2;
          var6 = param3;
          var7 = param0[var5_int];
          param0[var5_int] = param0[param2];
          param0[param2] = var7;
          var8 = param4[var5_int];
          param4[var5_int] = param4[param2];
          param4[param2] = var8;
          stackIn_8_0 = (2147483647 == var7) ? 0 : 1;
          var9 = stackIn_8_0;
          for (var10 = param3; param2 > var10; var10++) {
            if (param0[var10] > -(var10 & var9) + var7) {
              var11 = param0[var10];
              param0[var10] = param0[var6];
              param0[var6] = var11;
              var12 = param4[var10];
              param4[var10] = param4[var6];
              param4[var6++] = var12;
            }
          }
          param0[param2] = param0[var6];
          param0[var6] = var7;
          param4[param2] = param4[var6];
          param4[var6] = var8;
          sf.a(param0, (byte) 17, -1 + var6, param3, param4);
          sf.a(param0, (byte) 17, param2, 1 + var6, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("sf.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_c = "Name is available";
        field_e = new int[]{400, 450, 700, 400, 700, 700, 1750, 1250, 2000, 2000, 1000, 1700, 1250, 2800, 4500, 5250, 4000, 6500, 3800, 4000, 5000, 4000, 3250, 5250, 5250, 6000, 3000, 4750, 10000, 3500, 3750, 5750, 5750, 4000, 5000, 6000, 6000, 4500, 4500, 5250, 4750, 5750, 4750, 4750, 3000, 4500, 5250, 8500, 4250, 6000};
    }
}
