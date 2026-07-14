/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    private int field_e;
    static int[] field_g;
    static String field_f;
    private int field_h;
    static int[] field_d;
    private rf field_i;
    private rf[] field_b;
    private rf field_a;
    static mj field_c;

    final void a(long param0, byte param1, rf param2) {
        rf var6 = null;
        rf var5 = null;
        if (param2.field_d != null) {
            param2.b(4);
            var6 = ((ih) this).field_b[(int)(param0 & (long)(((ih) this).field_e + -1))];
            var5 = var6;
            param2.field_d = var6.field_d;
            if (param1 == -100) {
                param2.field_a = var5;
                param2.field_d.field_a = param2;
                param2.field_b = param0;
                param2.field_a.field_d = param2;
                return;
            }
            rf discarded$0 = ((ih) this).a(-118);
            param2.field_a = var5;
            param2.field_d.field_a = param2;
            param2.field_b = param0;
            param2.field_a.field_d = param2;
            return;
        }
        rf var7 = ((ih) this).field_b[(int)(param0 & (long)(((ih) this).field_e + -1))];
        var5 = var7;
        param2.field_d = var7.field_d;
        if (param1 != -100) {
            rf discarded$1 = ((ih) this).a(-118);
            param2.field_a = var5;
            param2.field_d.field_a = param2;
            param2.field_b = param0;
            param2.field_a.field_d = param2;
            return;
        }
        param2.field_a = var5;
        param2.field_d.field_a = param2;
        param2.field_b = param0;
        param2.field_a.field_d = param2;
    }

    final rf a(int param0) {
        if (param0 != -1) {
            rf discarded$0 = ((ih) this).a(-125L, (byte) 91);
            ((ih) this).field_h = 0;
            return ((ih) this).a((byte) 111);
        }
        ((ih) this).field_h = 0;
        return ((ih) this).a((byte) 111);
    }

    final rf a(byte param0) {
        int var2 = 0;
        int var4 = 0;
        rf var5 = null;
        rf var6 = null;
        rf var10 = null;
        rf var13 = null;
        var4 = StarCannon.field_A;
        var2 = -28 % ((36 - param0) / 51);
        if (0 < ((ih) this).field_h) {
          if (((ih) this).field_b[((ih) this).field_h + -1] != ((ih) this).field_a) {
            var13 = ((ih) this).field_a;
            ((ih) this).field_a = var13.field_a;
            return var13;
          } else {
            L0: while (true) {
              if (((ih) this).field_h < ((ih) this).field_e) {
                ((ih) this).field_h = ((ih) this).field_h + 1;
                var5 = ((ih) this).field_b[((ih) this).field_h].field_a;
                var10 = var5;
                if (var5 == ((ih) this).field_b[-1 + ((ih) this).field_h]) {
                  continue L0;
                } else {
                  ((ih) this).field_a = var10.field_a;
                  return var10;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          L1: while (true) {
            if (((ih) this).field_h < ((ih) this).field_e) {
              ((ih) this).field_h = ((ih) this).field_h + 1;
              var5 = ((ih) this).field_b[((ih) this).field_h].field_a;
              var6 = var5;
              if (var5 == ((ih) this).field_b[-1 + ((ih) this).field_h]) {
                continue L1;
              } else {
                ((ih) this).field_a = var6.field_a;
                return var6;
              }
            } else {
              return null;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        int var1 = -125 / ((-78 - param0) / 46);
        field_g = null;
    }

    ih(int param0) {
        int var2 = 0;
        rf var3 = null;
        ((ih) this).field_h = 0;
        ((ih) this).field_b = new rf[param0];
        ((ih) this).field_e = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new rf();
            ((ih) this).field_b[var2] = new rf();
            var3.field_a = var3;
            var3.field_d = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    final rf a(long param0, byte param1) {
        rf var4 = null;
        rf var5 = null;
        int var6 = 0;
        var6 = StarCannon.field_A;
        var4 = ((ih) this).field_b[(int)(param0 & (long)(((ih) this).field_e - 1))];
        ((ih) this).field_i = var4.field_a;
        if (param1 < 5) {
          return null;
        } else {
          L0: while (true) {
            if (var4 == ((ih) this).field_i) {
              ((ih) this).field_i = null;
              return null;
            } else {
              if ((param0 ^ -1L) == (((ih) this).field_i.field_b ^ -1L)) {
                var5 = ((ih) this).field_i;
                ((ih) this).field_i = ((ih) this).field_i.field_a;
                return var5;
              } else {
                ((ih) this).field_i = ((ih) this).field_i.field_a;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[8192];
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = new int[16384];
        field_c = new mj("");
    }
}
