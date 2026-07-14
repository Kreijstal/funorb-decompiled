/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static kk field_b;
    static String[] field_c;
    private int[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -1) {
            ff.a(-90);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void b(int param0) {
        cf.field_p = null;
        ka.field_f = null;
        qe.field_z = null;
        vb.field_a = null;
        if (param0 < 21) {
          field_b = null;
          qk.field_M = null;
          j.field_f = null;
          return;
        } else {
          qk.field_M = null;
          j.field_f = null;
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        if (-1 != (param4 ^ -1)) {
          var7 = param3;
          param4 = param4 + param2;
          var8 = param1;
          L0: while (true) {
            L1: {
              var9 = param0[var8];
              if (var9 >= 0) {
                var7++;
                break L1;
              } else {
                var7 = ((ff) this).field_a[var7];
                break L1;
              }
            }
            L2: {
              var10 = ((ff) this).field_a[var7];
              if (((ff) this).field_a[var7] >= 0) {
                break L2;
              } else {
                param2++;
                param5[param2] = (byte)(var10 ^ -1);
                if (param4 > param2) {
                  var7 = 0;
                  break L2;
                } else {
                  return 1 + (var8 - param1);
                }
              }
            }
            L3: {
              if ((var9 & 64) == 0) {
                var7++;
                break L3;
              } else {
                var7 = ((ff) this).field_a[var7];
                break L3;
              }
            }
            L4: {
              var10 = ((ff) this).field_a[var7];
              if (((ff) this).field_a[var7] < 0) {
                param2++;
                param5[param2] = (byte)(var10 ^ -1);
                if (param2 < param4) {
                  var7 = 0;
                  break L4;
                } else {
                  return 1 + (var8 - param1);
                }
              } else {
                break L4;
              }
            }
            L5: {
              if ((var9 & 32) != 0) {
                var7 = ((ff) this).field_a[var7];
                break L5;
              } else {
                var7++;
                break L5;
              }
            }
            L6: {
              var10 = ((ff) this).field_a[var7];
              if (0 <= ((ff) this).field_a[var7]) {
                break L6;
              } else {
                param2++;
                param5[param2] = (byte)(var10 ^ -1);
                if (param4 > param2) {
                  var7 = 0;
                  break L6;
                } else {
                  return 1 + (var8 - param1);
                }
              }
            }
            L7: {
              if (0 != (16 & var9)) {
                var7 = ((ff) this).field_a[var7];
                break L7;
              } else {
                var7++;
                break L7;
              }
            }
            L8: {
              var10 = ((ff) this).field_a[var7];
              if (-1 < (((ff) this).field_a[var7] ^ -1)) {
                param2++;
                param5[param2] = (byte)var10;
                if (param4 > param2) {
                  var7 = 0;
                  break L8;
                } else {
                  return 1 + (var8 - param1);
                }
              } else {
                break L8;
              }
            }
            L9: {
              if (-1 == (var9 & 8)) {
                var7++;
                break L9;
              } else {
                var7 = ((ff) this).field_a[var7];
                break L9;
              }
            }
            L10: {
              var10 = ((ff) this).field_a[var7];
              if (((ff) this).field_a[var7] < 0) {
                param2++;
                param5[param2] = (byte)(var10 ^ -1);
                if (param2 < param4) {
                  var7 = 0;
                  break L10;
                } else {
                  return 1 + (var8 - param1);
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (0 != (4 & var9)) {
                var7 = ((ff) this).field_a[var7];
                break L11;
              } else {
                var7++;
                break L11;
              }
            }
            L12: {
              var10 = ((ff) this).field_a[var7];
              if (-1 >= (((ff) this).field_a[var7] ^ -1)) {
                break L12;
              } else {
                param2++;
                param5[param2] = (byte)(var10 ^ -1);
                if (param4 > param2) {
                  var7 = 0;
                  break L12;
                } else {
                  return 1 + (var8 - param1);
                }
              }
            }
            L13: {
              if ((var9 & 2) != 0) {
                var7 = ((ff) this).field_a[var7];
                break L13;
              } else {
                var7++;
                break L13;
              }
            }
            L14: {
              var10 = ((ff) this).field_a[var7];
              if (((ff) this).field_a[var7] >= 0) {
                break L14;
              } else {
                param2++;
                param5[param2] = (byte)var10;
                if (param4 > param2) {
                  var7 = 0;
                  break L14;
                } else {
                  return 1 + (var8 - param1);
                }
              }
            }
            L15: {
              if (-1 != (var9 & 1)) {
                var7 = ((ff) this).field_a[var7];
                break L15;
              } else {
                var7++;
                break L15;
              }
            }
            var10 = ((ff) this).field_a[var7];
            if (0 > ((ff) this).field_a[var7]) {
              param2++;
              param5[param2] = (byte)(var10 ^ -1);
              if (param2 < param4) {
                var7 = 0;
                var8++;
                var8++;
                continue L0;
              } else {
                return 1 + (var8 - param1);
              }
            } else {
              var8++;
              var8++;
              continue L0;
            }
          }
        } else {
          return 0;
        }
    }

    private ff() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
