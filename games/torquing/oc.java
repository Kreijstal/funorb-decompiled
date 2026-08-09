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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        var13 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var10_int = -(param7 >> -790564990);
              param7 = -(param7 & 3);
              var11 = -param4;
              if (param1 == 0) {
                break L1;
              } else {
                var14 = (byte[]) null;
                oc.a((byte) 85, -27, -103, (byte[]) null, -92, 65, 54, -2, 85, (byte[]) null);
                break L1;
              }
            }
            L2: while (true) {
              if (-1 >= (var11 ^ -1)) {
                break L0;
              } else {
                var12 = var10_int;
                L3: while (true) {
                  if (0 <= var12) {
                    var12 = param7;
                    L4: while (true) {
                      if ((var12 ^ -1) <= -1) {
                        param2 = param2 + param6;
                        param8 = param8 + param5;
                        var11++;
                        continue L2;
                      } else {
                        L5: {
                          incrementValue$0 = param8;
                          param8++;
                          param0 = param9[incrementValue$0];
                          if (param0 != 0) {
                            incrementValue$1 = param2;
                            param2++;
                            param3[incrementValue$1] = (byte)param0;
                            break L5;
                          } else {
                            param2++;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      incrementValue$2 = param8;
                      param8++;
                      param0 = param9[incrementValue$2];
                      if (param0 == 0) {
                        param2++;
                        break L6;
                      } else {
                        incrementValue$3 = param2;
                        param2++;
                        param3[incrementValue$3] = (byte)param0;
                        break L6;
                      }
                    }
                    L7: {
                      incrementValue$4 = param8;
                      param8++;
                      param0 = param9[incrementValue$4];
                      if (0 == param0) {
                        param2++;
                        break L7;
                      } else {
                        incrementValue$5 = param2;
                        param2++;
                        param3[incrementValue$5] = (byte)param0;
                        break L7;
                      }
                    }
                    L8: {
                      incrementValue$6 = param8;
                      param8++;
                      param0 = param9[incrementValue$6];
                      if (param0 == 0) {
                        param2++;
                        break L8;
                      } else {
                        incrementValue$7 = param2;
                        param2++;
                        param3[incrementValue$7] = (byte)param0;
                        break L8;
                      }
                    }
                    L9: {
                      incrementValue$8 = param8;
                      param8++;
                      param0 = param9[incrementValue$8];
                      if (param0 != 0) {
                        incrementValue$9 = param2;
                        param2++;
                        param3[incrementValue$9] = (byte)param0;
                        break L9;
                      } else {
                        param2++;
                        break L9;
                      }
                    }
                    var12++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var10 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var10);

            stackIn_29_1 = new StringBuilder().append("oc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ')');
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
