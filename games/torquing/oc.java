/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int[] field_b;
    static String[] field_a;

    final static int a(boolean param0) {
        return oh.field_d;
    }

    final static void a(byte param0) {
        if (param0 != 105) {
            oc.a((byte) -39);
        }
    }

    final static void a(byte param0, int param1, int param2, byte[] param3, int param4, int param5, int param6, int param7, int param8, byte[] param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var13 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var10_int = -(param7 >> 2);
              param7 = -(param7 & 3);
              var11 = -param4;
              if (param1 == 0) {
                break L1;
              } else {
                var14 = null;
                oc.a((byte) 85, -27, -103, (byte[]) null, -92, 65, 54, -2, 85, (byte[]) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var11 >= 0) {
                break L0;
              } else {
                var12 = var10_int;
                L3: while (true) {
                  if (0 <= var12) {
                    var12 = param7;
                    L4: while (true) {
                      if (var12 >= 0) {
                        param2 = param2 + param6;
                        param8 = param8 + param5;
                        var11++;
                        continue L2;
                      } else {
                        L5: {
                          int incrementValue$10 = param8;
                          param8++;
                          param0 = param9[incrementValue$10];
                          if (param0 != 0) {
                            int incrementValue$11 = param2;
                            param2++;
                            param3[incrementValue$11] = (byte)param0;
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
                      int incrementValue$12 = param8;
                      param8++;
                      param0 = param9[incrementValue$12];
                      if (param0 == 0) {
                        param2++;
                        break L6;
                      } else {
                        int incrementValue$13 = param2;
                        param2++;
                        param3[incrementValue$13] = (byte)param0;
                        break L6;
                      }
                    }
                    L7: {
                      int incrementValue$14 = param8;
                      param8++;
                      param0 = param9[incrementValue$14];
                      if (0 == param0) {
                        param2++;
                        break L7;
                      } else {
                        int incrementValue$15 = param2;
                        param2++;
                        param3[incrementValue$15] = (byte)param0;
                        break L7;
                      }
                    }
                    L8: {
                      int incrementValue$16 = param8;
                      param8++;
                      param0 = param9[incrementValue$16];
                      if (param0 == 0) {
                        param2++;
                        break L8;
                      } else {
                        int incrementValue$17 = param2;
                        param2++;
                        param3[incrementValue$17] = (byte)param0;
                        break L8;
                      }
                    }
                    L9: {
                      int incrementValue$18 = param8;
                      param8++;
                      param0 = param9[incrementValue$18];
                      if (param0 != 0) {
                        int incrementValue$19 = param2;
                        param2++;
                        param3[incrementValue$19] = (byte)param0;
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
            stackOut_27_0 = (RuntimeException) var10;
            stackOut_27_1 = new StringBuilder().append("oc.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param9 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
