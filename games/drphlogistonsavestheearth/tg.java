/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    private gi field_a;
    private gi field_e;
    private int field_h;
    static int field_b;
    private int field_f;
    private gi[] field_d;
    static vd field_g;
    static String[] field_c;
    static int[] field_i;

    final gi a(boolean param0, long param1) {
        gi var4 = null;
        gi var5 = null;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = ((tg) this).field_d[(int)(param1 & (long)(((tg) this).field_f + -1))];
        ((tg) this).field_e = var4.field_e;
        L0: while (true) {
          if (var4 == ((tg) this).field_e) {
            if (!param0) {
              tg.a(84);
              ((tg) this).field_e = null;
              return null;
            } else {
              ((tg) this).field_e = null;
              return null;
            }
          } else {
            if ((param1 ^ -1L) == (((tg) this).field_e.field_g ^ -1L)) {
              var5 = ((tg) this).field_e;
              ((tg) this).field_e = ((tg) this).field_e.field_e;
              return var5;
            } else {
              ((tg) this).field_e = ((tg) this).field_e.field_e;
              continue L0;
            }
          }
        }
    }

    final gi b(int param0) {
        if (param0 != -1) {
          ((tg) this).field_f = -101;
          ((tg) this).field_h = 0;
          return ((tg) this).a((byte) -114);
        } else {
          ((tg) this).field_h = 0;
          return ((tg) this).a((byte) -114);
        }
    }

    final gi a(byte param0) {
        int var3 = 0;
        gi var4 = null;
        gi var7 = null;
        gi var8 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 >= ((tg) this).field_h) {
          if (param0 == -114) {
            L0: while (true) {
              if (((tg) this).field_h < ((tg) this).field_f) {
                ((tg) this).field_h = ((tg) this).field_h + 1;
                var8 = ((tg) this).field_d[((tg) this).field_h].field_e;
                if (((tg) this).field_d[-1 + ((tg) this).field_h] != var8) {
                  ((tg) this).field_a = var8.field_e;
                  return var8;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          if (((tg) this).field_d[((tg) this).field_h + -1] == ((tg) this).field_a) {
            if (param0 == -114) {
              L1: while (true) {
                if (((tg) this).field_h < ((tg) this).field_f) {
                  ((tg) this).field_h = ((tg) this).field_h + 1;
                  var4 = ((tg) this).field_d[((tg) this).field_h].field_e;
                  if (((tg) this).field_d[-1 + ((tg) this).field_h] != var4) {
                    ((tg) this).field_a = var4.field_e;
                    return var4;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            var7 = ((tg) this).field_a;
            ((tg) this).field_a = var7.field_e;
            return var7;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_i = null;
        if (param0 == 0) {
            return;
        }
        field_i = null;
    }

    tg(int param0) {
        int var2 = 0;
        gi var3 = null;
        ((tg) this).field_h = 0;
        ((tg) this).field_d = new gi[param0];
        ((tg) this).field_f = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            var3 = new gi();
            ((tg) this).field_d[var2] = new gi();
            var3.field_b = var3;
            var3.field_e = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    final void a(gi param0, long param1, int param2) {
        if (!(null == param0.field_b)) {
            param0.a(-16175);
        }
        gi var5 = ((tg) this).field_d[(int)(param1 & (long)(((tg) this).field_f + param2))];
        param0.field_b = var5.field_b;
        param0.field_e = var5;
        param0.field_b.field_e = param0;
        param0.field_g = param1;
        param0.field_e.field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_g = new vd();
        field_i = new int[4];
    }
}
