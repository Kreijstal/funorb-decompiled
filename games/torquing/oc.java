/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int[] field_b;
    static String[] field_a;

    final static int a(boolean param0) {
        if (param0) {
          oc.b(true);
        }
        return oh.field_d;
    }

    final static void a(byte param0) {
        if (param0 != 105) {
          oc.a((byte) -39);
        }
    }

    final static void a(byte param0, int param1, int param2, byte[] param3, int param4, int param5, int param6, int param7, int param8, byte[] param9) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int var12Lifetime1;
        var13 = Torquing.field_u;
        try {
          var10_int = -(param7 >> 2);
          param7 = -(param7 & 3);
          var11 = -param4;
          if (param1 != 0) {
            var14 = (byte[]) null;
            oc.a((byte) 85, -27, -103, (byte[]) null, -92, 65, 54, -2, 85, (byte[]) null);
          }
          while (var11 < 0) {
            for (var12 = var10_int; 0 > var12; var12++) {
              incrementValue$2 = param8;
              param8++;
              param0 = param9[incrementValue$2];
              if (param0 == 0) {
                param2++;
              } else {
                incrementValue$3 = param2;
                param2++;
                param3[incrementValue$3] = (byte)param0;
              }
              incrementValue$4 = param8;
              param8++;
              param0 = param9[incrementValue$4];
              if (0 == param0) {
                param2++;
              } else {
                incrementValue$5 = param2;
                param2++;
                param3[incrementValue$5] = (byte)param0;
              }
              incrementValue$6 = param8;
              param8++;
              param0 = param9[incrementValue$6];
              if (param0 == 0) {
                param2++;
              } else {
                incrementValue$7 = param2;
                param2++;
                param3[incrementValue$7] = (byte)param0;
              }
              incrementValue$8 = param8;
              param8++;
              param0 = param9[incrementValue$8];
              if (param0 != 0) {
                incrementValue$9 = param2;
                param2++;
                param3[incrementValue$9] = (byte)param0;
              } else {
                param2++;
              }
            }
            for (var12Lifetime1 = param7; var12Lifetime1 < 0; var12Lifetime1++) {
              incrementValue$0 = param8;
              param8++;
              param0 = param9[incrementValue$0];
              if (param0 != 0) {
                incrementValue$1 = param2;
                param2++;
                param3[incrementValue$1] = (byte)param0;
              } else {
                param2++;
              }
            }
            param2 = param2 + param6;
            param8 = param8 + param5;
            var11++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_29_0 = var10;
          stackIn_29_1 = new StringBuilder().append("oc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (param0) {
          return;
        }
        field_a = null;
    }

    static {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
