/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static vna field_f;
    static String field_c;
    private String field_a;
    static int field_d;
    static String[] field_e;
    static boolean field_b;

    final boolean a(String param0, int param1) {
        if (param1 != 5) {
            return false;
        }
        return ((nl) this).field_a.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          if (param5 == 14375) {
            break L0;
          } else {
            nl.a(-36, -84, -86, 3, 107, 83);
            break L0;
          }
        }
        L1: {
          if (hc.field_h < param2) {
            break L1;
          } else {
            if (gca.field_d <= param3) {
              L2: {
                if (param1 < pka.field_b) {
                  param1 = pka.field_b;
                  var6 = 0;
                  break L2;
                } else {
                  if (param1 <= ss.field_c) {
                    var6 = 1;
                    break L2;
                  } else {
                    var6 = 0;
                    param1 = ss.field_c;
                    break L2;
                  }
                }
              }
              L3: {
                if (pka.field_b > param4) {
                  param4 = pka.field_b;
                  var7 = 0;
                  break L3;
                } else {
                  if (ss.field_c >= param4) {
                    var7 = 1;
                    break L3;
                  } else {
                    param4 = ss.field_c;
                    var7 = 0;
                    break L3;
                  }
                }
              }
              L4: {
                if (param2 < gca.field_d) {
                  param2 = gca.field_d;
                  break L4;
                } else {
                  param2++;
                  nra.a((byte) -55, param0, param4, vaa.field_a[param2], param1);
                  break L4;
                }
              }
              L5: {
                if (hc.field_h >= param3) {
                  param3--;
                  nra.a((byte) -55, param0, param4, vaa.field_a[param3], param1);
                  break L5;
                } else {
                  param3 = hc.field_h;
                  break L5;
                }
              }
              L6: {
                if (var6 == 0) {
                  break L6;
                } else {
                  if (var7 != 0) {
                    var8 = param2;
                    L7: while (true) {
                      if (var8 > param3) {
                        break L1;
                      } else {
                        var14 = vaa.field_a[var8];
                        var13 = var14;
                        var12 = var13;
                        var11 = var12;
                        var9 = var11;
                        var14[param4] = param0;
                        var9[param1] = param0;
                        var8++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
              if (var6 == 0) {
                if (var7 == 0) {
                  break L1;
                } else {
                  var8 = param2;
                  L8: while (true) {
                    if (var8 > param3) {
                      break L1;
                    } else {
                      vaa.field_a[var8][param4] = param0;
                      var8++;
                      continue L8;
                    }
                  }
                }
              } else {
                var8 = param2;
                L9: while (true) {
                  if (param3 < var8) {
                    break L1;
                  } else {
                    vaa.field_a[var8][param1] = param0;
                    var8++;
                    continue L9;
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
    }

    final static wv a(int param0, byte param1) {
        if (param1 != 50) {
            field_f = null;
        }
        return uw.field_g[param0];
    }

    nl(String param0) {
        ((nl) this).field_a = param0;
    }

    final void a(java.applet.Applet param0, int param1) {
        lha.a(((nl) this).field_a, "jagex-last-login-method", (byte) 121, 31536000L, param0);
        if (param1 != 5) {
            Object var4 = null;
            boolean discarded$0 = ((nl) this).a((String) null, -66);
        }
    }

    public static void a(byte param0) {
        if (param0 > -35) {
            nl.a(55, 84, -11, -72, -118, -51);
        }
        field_c = null;
        field_e = null;
        field_f = null;
    }

    final static pha a(boolean param0, long param1) {
        if (!param0) {
            pha discarded$0 = nl.a(false, 56L);
        }
        return (pha) (Object) fua.field_a.a(-126, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 5;
        field_c = "Loading...";
        field_f = new vna();
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = false;
    }
}
