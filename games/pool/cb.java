/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static String[] field_f;
    static int field_d;
    static ko field_e;
    static String field_c;
    static java.security.SecureRandom field_a;
    static int field_g;
    static String[] field_b;

    final static void a(Object param0, sj param1, int param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Pool.field_O;
        if (param1.field_a != null) {
          if (param2 > 57) {
            var3_int = 0;
            L0: while (true) {
              L1: {
                if (50 <= var3_int) {
                  break L1;
                } else {
                  if (null == param1.field_a.peekEvent()) {
                    break L1;
                  } else {
                    cf.a(-121, 1L);
                    var3_int++;
                    continue L0;
                  }
                }
              }
              try {
                L2: {
                  L3: {
                    if (param0 == null) {
                      break L3;
                    } else {
                      param1.field_a.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                      break L3;
                    }
                  }
                  break L2;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  break L4;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static byte[] a(int param0, int param1, oq param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param2.e(param1, param0 + -28);
        if (0 != var4) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param3 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param2.e(3, 66);
            var6 = (byte)param2.e(8, 77);
            if (-1 > (var5 ^ -1)) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param3[var7] = (byte)(param2.e(var5, 49) + var6);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param3[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          if (param0 == 50) {
            return param3;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 28555) {
            field_c = null;
        }
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_c = "Previous";
        field_g = 480;
        field_d = 0;
        field_e = new ko();
        field_b = new String[]{"Modern", "Plasma", "Aztec", "Polar", "Space"};
    }
}
