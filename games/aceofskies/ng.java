/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends rg {
    private String field_K;
    private boolean field_O;
    static String[] field_J;
    private ss field_L;
    private boolean field_P;
    private String field_M;

    final void k(int param0) {
        ((ng) this).field_O = true;
        int var2 = 105 / ((param0 - -39) / 32);
        ((ng) this).field_L.field_u = false;
    }

    final void a(boolean param0, int param1, String param2, float param3) {
        if ((param0 ? 1 : 0) == (!((ng) this).field_P ? 1 : 0)) {
            ((ng) this).field_P = param0 ? true : false;
            if (((ng) this).field_P) {
                ((ng) this).field_L.a(4210752, 8405024, (byte) 54);
                ((ng) this).field_L.field_u = true;
            } else {
                ((ng) this).field_L.a(4210752, 2113632, (byte) 71);
                if (((ng) this).field_O) {
                    ((ng) this).field_L.field_u = false;
                }
            }
        }
        if (param1 >= -80) {
            ((ng) this).field_O = false;
        }
        ((ng) this).field_K = param2;
        ((ng) this).field_L.field_z = (int)(param3 / 100.0f * 65536.0f);
    }

    ng(lt param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((ng) this).field_M = param1;
        if (((ng) this).field_M != null) {
            var3 = b.field_c.a(((ng) this).field_M, 260, b.field_c.field_I);
            ((ng) this).a(300, (byte) 29, var3 + 150);
        }
        ((ng) this).field_L = new ss(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ng) this).field_P = false;
        ((ng) this).field_L.field_u = true;
        ((ng) this).field_O = false;
        ((ng) this).a((ea) (Object) ((ng) this).field_L, 1);
    }

    final static void a(hc param0, String param1, co param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = AceOfSkies.field_G ? 1 : 0;
          if (param4 == 30) {
            break L0;
          } else {
            field_J = (String[]) null;
            break L0;
          }
        }
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (var7 >= param1.length()) {
            return;
          } else {
            L2: {
              var8 = param1.charAt(var7);
              if (60 != var8) {
                break L2;
              } else {
                var6 = (var5 >> -50427512) + ((co) param2).field_h[0] + param0.a(param1.substring(0, var7));
                break L2;
              }
            }
            L3: {
              if (0 != (var6 ^ -1)) {
                ((co) param2).field_h[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (var8 != 32) {
                    break L4;
                  } else {
                    var5 = var5 + param3;
                    break L4;
                  }
                }
                ((co) param2).field_h[var7] = ((co) param2).field_h[0] + (var5 >> 719042120) + (param0.a(param1.substring(0, 1 + var7)) + -param0.a((char) var8));
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    public static void j(int param0) {
        field_J = null;
        if (param0 != 11617) {
            co var2 = (co) null;
            ng.a((hc) null, (String) null, (co) null, 27, (byte) -23);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        this.a(param0, param1, param2);
        b.field_c.c(((ng) this).field_K, (((ng) this).field_q >> 1128664705) + param1, 103 + param2, 16777215, -1);
        if (null != ((ng) this).field_M) {
            vp.b(20 + param1, 120 + param2 - 7, 260, 8421504);
            int discarded$0 = b.field_c.a(((ng) this).field_M, 20 + param1, 128 + param2, 260, 100, 16777215, -1, 1, 0, b.field_c.field_I);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
