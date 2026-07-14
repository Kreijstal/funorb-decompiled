/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private ms[] field_i;
    static int field_c;
    private int field_b;
    private int field_a;
    static iw field_f;
    private ms field_e;
    private ms field_d;
    static jn field_g;
    static String field_h;

    final ms a(boolean param0) {
        ms var2 = null;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if ((((te) this).field_b ^ -1) >= -1) {
            break L0;
          } else {
            if (((te) this).field_i[((te) this).field_b - 1] == ((te) this).field_d) {
              break L0;
            } else {
              var2 = ((te) this).field_d;
              ((te) this).field_d = var2.field_b;
              return var2;
            }
          }
        }
        if (param0) {
          L1: while (true) {
            if (((te) this).field_a > ((te) this).field_b) {
              ((te) this).field_b = ((te) this).field_b + 1;
              var2 = ((te) this).field_i[((te) this).field_b].field_b;
              if (((te) this).field_i[-1 + ((te) this).field_b] != var2) {
                ((te) this).field_d = var2.field_b;
                return var2;
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
    }

    final ms a(int param0, long param1) {
        ms var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 102) {
            return null;
        }
        ms var4 = ((te) this).field_i[(int)(param1 & (long)(-1 + ((te) this).field_a))];
        ((te) this).field_e = var4.field_b;
        while (((te) this).field_e != var4) {
            if (!((param1 ^ -1L) != (((te) this).field_e.field_h ^ -1L))) {
                var5 = ((te) this).field_e;
                ((te) this).field_e = ((te) this).field_e.field_b;
                return var5;
            }
            ((te) this).field_e = ((te) this).field_e.field_b;
        }
        ((te) this).field_e = null;
        return null;
    }

    final void c(int param0) {
        int var2 = 0;
        ms var3 = null;
        ms var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 6407) {
            return;
        }
        for (var2 = 0; ((te) this).field_a > var2; var2++) {
            var3 = ((te) this).field_i[var2];
            while (true) {
                var4 = var3.field_b;
                if (var4 == var3) {
                    break;
                }
                var4.b(false);
            }
        }
        ((te) this).field_d = null;
        ((te) this).field_e = null;
    }

    public static void b(int param0) {
        if (param0 != 6406) {
            te.b(41);
        }
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final ms a(int param0) {
        ((te) this).field_b = 0;
        if (param0 < 36) {
            return null;
        }
        return ((te) this).a(true);
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
            field_h = null;
        }
        return (is.a(!param0 ? true : false, param1, param2) | oj.b(param1, param2, -126) | pk.a(param1, param2, 52)) & jf.a(param1, (byte) -91, param2);
    }

    final void a(ms param0, int param1, long param2) {
        if (param0.field_g != null) {
            param0.b(false);
        }
        ms var5 = ((te) this).field_i[(int)(param2 & (long)(param1 + ((te) this).field_a))];
        param0.field_g = var5.field_g;
        param0.field_b = var5;
        param0.field_g.field_b = param0;
        param0.field_b.field_g = param0;
        param0.field_h = param2;
    }

    final static int a(int param0, iw param1) {
        if (param0 == -21339) {
          if (m.field_X != param1) {
            if (nl.field_p != param1) {
              if (field_f != param1) {
                if (kd.field_b != param1) {
                  if (param1 == ps.field_c) {
                    return 6410;
                  } else {
                    if (rg.field_A == param1) {
                      return 6145;
                    } else {
                      throw new IllegalStateException();
                    }
                  }
                } else {
                  return 6409;
                }
              } else {
                return 6406;
              }
            } else {
              return 6408;
            }
          } else {
            return 6407;
          }
        } else {
          return 57;
        }
    }

    te(int param0) {
        int var2 = 0;
        ms var3 = null;
        ((te) this).field_b = 0;
        ((te) this).field_a = param0;
        ((te) this).field_i = new ms[param0];
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new ms();
            ((te) this).field_i[var2] = new ms();
            var3.field_b = var3;
            var3.field_g = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_f = new iw(1);
        field_g = new jn();
        field_h = "Cancel";
    }
}
