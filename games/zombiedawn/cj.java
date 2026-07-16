/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static af field_g;
    static java.awt.Canvas field_d;
    static String[][] field_a;
    static String field_e;
    private vo field_f;
    private le field_b;
    static mf field_i;
    static String[] field_h;
    static int[] field_c;

    final le a(int param0) {
        le var2 = ((cj) this).field_b;
        if (var2 == ((cj) this).field_f.field_b) {
            ((cj) this).field_b = null;
            return null;
        }
        ((cj) this).field_b = var2.field_d;
        if (param0 != 17) {
            return null;
        }
        return var2;
    }

    final static cg a(int param0, int param1) {
        cg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        cg[] var5 = null;
        var4 = ZombieDawn.field_J;
        var5 = c.b(19795);
        var2 = var5;
        var3 = param1;
        L0: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_f != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    final le a(le param0, byte param1) {
        le var3 = null;
        if (param1 != -128) {
            field_c = null;
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((cj) this).field_f.field_b.field_d;
        }
        if (!(((cj) this).field_f.field_b != var3)) {
            ((cj) this).field_b = null;
            return null;
        }
        ((cj) this).field_b = var3.field_d;
        return var3;
    }

    final le c(byte param0) {
        le var2 = ((cj) this).field_f.field_b.field_b;
        if (param0 > -113) {
            cj.b(-19);
        }
        if (!(((cj) this).field_f.field_b != var2)) {
            ((cj) this).field_b = null;
            return null;
        }
        ((cj) this).field_b = var2.field_b;
        return var2;
    }

    final le b(byte param0) {
        if (param0 != -21) {
            le discarded$0 = ((cj) this).c((byte) 123);
        }
        le var2 = ((cj) this).field_f.field_b.field_d;
        if (var2 == ((cj) this).field_f.field_b) {
            ((cj) this).field_b = null;
            return null;
        }
        ((cj) this).field_b = var2.field_d;
        return var2;
    }

    final static ll a(boolean param0, byte param1, String param2, String param3) {
        CharSequence var7 = null;
        if (param1 <= 25) {
            field_e = null;
        }
        long var4 = 0L;
        Object var6 = null;
        if (param2.indexOf('@') != -1) {
            var6 = (Object) (Object) param2;
        } else {
            var7 = (CharSequence) (Object) param2;
            var4 = sd.a(-66, var7);
        }
        return sn.a((byte) -116, var4, param0, param3, (String) var6);
    }

    final static void a(String param0, int param1, int param2, int param3, int param4) {
        tc.field_s[tc.field_t] = param1;
        tc.field_y[tc.field_t] = param3;
        tc.field_x[tc.field_t] = param0;
        if (param2 > -82) {
            field_e = null;
        }
        tc.field_w[tc.field_t] = param4;
        tc.field_t = tc.field_t + 1;
    }

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param0 == 15) {
            break L0;
          } else {
            var5 = null;
            cj.a((String) null, -43, -34, 75, -12);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (param1.length() <= var2) {
            return false;
          } else {
            var3 = param1.charAt(var2);
            if (!cb.a(60, (char) var3)) {
              if (!bj.a((char) var3, 91)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void d(byte param0) {
        if (param0 <= 99) {
            return;
        }
        og.b(-111, 17);
    }

    public static void b(int param0) {
        field_i = null;
        field_c = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_g = null;
        if (param0 != 25808) {
            field_h = null;
        }
        field_h = null;
    }

    final le a(byte param0) {
        le var2 = ((cj) this).field_b;
        if (((cj) this).field_f.field_b == var2) {
            ((cj) this).field_b = null;
            return null;
        }
        ((cj) this).field_b = var2.field_b;
        if (param0 != 61) {
            field_e = null;
        }
        return var2;
    }

    final le a(int param0, le param1) {
        le var3 = null;
        if (param0 != -3549) {
            return null;
        }
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((cj) this).field_f.field_b.field_b;
        }
        if (!(var3 != ((cj) this).field_f.field_b)) {
            ((cj) this).field_b = null;
            return null;
        }
        ((cj) this).field_b = var3.field_b;
        return var3;
    }

    cj(vo param0) {
        ((cj) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[][]{new String[4], new String[4]};
        field_g = new af();
        field_c = new int[]{220, 347, 515, -1};
    }
}
