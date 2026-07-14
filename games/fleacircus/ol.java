/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static ca field_d;
    static String[] field_a;
    static java.awt.Canvas field_e;
    static int[] field_c;
    static String[] field_b;
    static rk field_f;

    final static ad a(int param0) {
        if (param0 >= -98) {
            return null;
        }
        return new ad(ti.a((byte) -120), rl.a(true));
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = null;
        }
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final static hm a(String param0, int param1, int param2) {
        if (param1 <= 55) {
            Object var4 = null;
            hm discarded$0 = ol.a((String) null, 81, 32);
        }
        jk var3 = new jk();
        ((hm) (Object) var3).field_a = param0;
        ((hm) (Object) var3).field_e = param2;
        return (hm) (Object) var3;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          L1: {
            var5 = fleas.field_A ? 1 : 0;
            if (param0 <= 0) {
              break L1;
            } else {
              if (param0 < 128) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param0 < 160) {
              if (param1 < -84) {
                if (param0 == 0) {
                  break L2;
                } else {
                  var6 = fh.field_e;
                  var2 = var6;
                  var3 = 0;
                  L3: while (true) {
                    if (var3 >= var6.length) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (var4 == param0) {
                        return true;
                      } else {
                        var3++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              if (param0 <= 255) {
                break L0;
              } else {
                if (param1 < -84) {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    var6 = fh.field_e;
                    var2 = var6;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= var6.length) {
                        break L2;
                      } else {
                        var4 = var6[var3];
                        if (var4 == param0) {
                          return true;
                        } else {
                          var3++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  return true;
                }
              }
            }
          }
          return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_c = new int[8192];
        field_b = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
