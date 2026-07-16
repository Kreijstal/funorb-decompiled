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
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = Torquing.field_u;
          var10 = -(param7 >> -790564990);
          param7 = -(param7 & 3);
          var11 = -param4;
          if (param1 == 0) {
            break L0;
          } else {
            var14 = null;
            oc.a((byte) 85, -27, -103, (byte[]) null, -92, 65, 54, -2, 85, (byte[]) null);
            break L0;
          }
        }
        L1: while (true) {
          if (-1 >= (var11 ^ -1)) {
            return;
          } else {
            var12 = var10;
            L2: while (true) {
              if (0 <= var12) {
                var12 = param7;
                L3: while (true) {
                  if ((var12 ^ -1) <= -1) {
                    param2 = param2 + param6;
                    param8 = param8 + param5;
                    var11++;
                    continue L1;
                  } else {
                    int incrementValue$10 = param8;
                    param8++;
                    param0 = param9[incrementValue$10];
                    if (param0 != 0) {
                      int incrementValue$11 = param2;
                      param2++;
                      param3[incrementValue$11] = (byte)param0;
                      var12++;
                      continue L3;
                    } else {
                      param2++;
                      var12++;
                      continue L3;
                    }
                  }
                }
              } else {
                L4: {
                  int incrementValue$12 = param8;
                  param8++;
                  param0 = param9[incrementValue$12];
                  if (param0 == 0) {
                    param2++;
                    break L4;
                  } else {
                    int incrementValue$13 = param2;
                    param2++;
                    param3[incrementValue$13] = (byte)param0;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$14 = param8;
                  param8++;
                  param0 = param9[incrementValue$14];
                  if (0 == param0) {
                    param2++;
                    break L5;
                  } else {
                    int incrementValue$15 = param2;
                    param2++;
                    param3[incrementValue$15] = (byte)param0;
                    break L5;
                  }
                }
                L6: {
                  int incrementValue$16 = param8;
                  param8++;
                  param0 = param9[incrementValue$16];
                  if (param0 == 0) {
                    param2++;
                    break L6;
                  } else {
                    int incrementValue$17 = param2;
                    param2++;
                    param3[incrementValue$17] = (byte)param0;
                    break L6;
                  }
                }
                int incrementValue$18 = param8;
                param8++;
                param0 = param9[incrementValue$18];
                if (param0 != 0) {
                  int incrementValue$19 = param2;
                  param2++;
                  param3[incrementValue$19] = (byte)param0;
                  var12++;
                  continue L2;
                } else {
                  param2++;
                  var12++;
                  continue L2;
                }
              }
            }
          }
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
