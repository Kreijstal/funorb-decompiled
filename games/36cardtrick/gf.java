/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_d;
    String field_i;
    private int field_b;
    float field_g;
    static String field_a;
    static kh field_e;
    static String[] field_h;
    private int field_f;
    private t[] field_c;

    private final void a(t param0, int param1, byte param2) {
        float var4 = 0.0f;
        var4 = (float)(1 + ((gf) this).field_f) + (float)param1 / 100.0f;
        if (param2 == 73) {
          ((gf) this).field_g = var4 * (float)((gf) this).field_b / (float)(1 + ((gf) this).field_d);
          if (0 != param1) {
            ((gf) this).field_i = param0.field_a + " - " + param1 + "%";
            return;
          } else {
            ((gf) this).field_i = param0.field_g;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_e = null;
        int var1 = -48 % ((41 - param0) / 57);
    }

    final boolean a(int param0) {
        t var2 = null;
        int var2_int = 0;
        int var3 = 0;
        t var4 = null;
        var3 = Main.field_T;
        L0: while (true) {
          if (((gf) this).field_f < ((gf) this).field_d) {
            var4 = ((gf) this).field_c[((gf) this).field_f];
            var2 = var4;
            if (!var4.field_d.b(4)) {
              this.a(var4, 0, (byte) 73);
              return false;
            } else {
              L1: {
                if ((var4.field_c ^ -1) > -1) {
                  break L1;
                } else {
                  if (var4.field_d.a(var4.field_c, 70)) {
                    break L1;
                  } else {
                    this.a(var2, var4.field_d.a((byte) 60, var4.field_c), (byte) 73);
                    return false;
                  }
                }
              }
              L2: {
                if (null == var4.field_b) {
                  break L2;
                } else {
                  if (!var4.field_d.b(4, var4.field_b)) {
                    this.a(var2, var4.field_d.a(var4.field_b, 0), (byte) 73);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_c >= 0) {
                  break L3;
                } else {
                  if (null != var4.field_b) {
                    break L3;
                  } else {
                    if (null == var4.field_a) {
                      break L3;
                    } else {
                      if (!var4.field_d.a((byte) 29)) {
                        this.a(var2, var4.field_d.a(2), (byte) 73);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((gf) this).field_f = ((gf) this).field_f + 1;
              continue L0;
            }
          } else {
            var2_int = -46 / ((59 - param0) / 39);
            return true;
          }
        }
    }

    final static md[] a(int param0, le param1) {
        int var5 = 0;
        md var6 = null;
        int var7 = Main.field_T;
        if (!param1.b((byte) -117)) {
            return new md[]{};
        }
        if (param0 != -2) {
            return null;
        }
        vi var8 = param1.a((byte) 104);
        while (var8.field_a == 0) {
            wk.a((byte) -117, 10L);
        }
        if (!((var8.field_a ^ -1) != -3)) {
            return new md[]{};
        }
        int[] var12 = (int[]) var8.field_e;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        md[] var4 = new md[var12.length >> 1506736002];
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = new md();
            var4[var5] = var6;
            var6.field_b = var3[var5 << -338692862];
            var6.field_a = var3[1 + (var5 << -1008314494)];
            var6.field_d = var3[(var5 << -1555115902) - -2];
            var6.field_c = var3[3 + (var5 << 157481794)];
        }
        return var4;
    }

    private gf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Cancel";
        field_h = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
