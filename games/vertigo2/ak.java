/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static int[] field_d;
    static String field_c;
    static String field_f;
    static int field_e;
    private gp field_a;
    private gp field_b;

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        or.a((String) null, param0, 65536, param1);
        if (param2 != 3) {
            ak.a(false, true, -39);
        }
    }

    final gp b(byte param0) {
        gp var2 = null;
        if (param0 != -50) {
            field_e = -33;
            var2 = ((ak) this).field_a.field_p;
            if (!(((ak) this).field_a != var2)) {
                ((ak) this).field_b = null;
                return null;
            }
            ((ak) this).field_b = var2.field_p;
            return var2;
        }
        var2 = ((ak) this).field_a.field_p;
        if (!(((ak) this).field_a != var2)) {
            ((ak) this).field_b = null;
            return null;
        }
        ((ak) this).field_b = var2.field_p;
        return var2;
    }

    final int a(byte param0) {
        int var2 = 0;
        gp var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        if (param0 < 6) {
          ak.b(24);
          var3 = ((ak) this).field_a.field_p;
          L0: while (true) {
            if (var3 == ((ak) this).field_a) {
              return var2;
            } else {
              var3 = var3.field_p;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((ak) this).field_a.field_p;
          L1: while (true) {
            if (var3 == ((ak) this).field_a) {
              return var2;
            } else {
              var3 = var3.field_p;
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        int var1 = 118 % ((64 - param0) / 40);
        field_f = null;
        field_c = null;
    }

    final void a(boolean param0, gp param1) {
        L0: {
          if (null != param1.field_o) {
            param1.a(-125);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_p = ((ak) this).field_a;
        param1.field_o = ((ak) this).field_a.field_o;
        param1.field_o.field_p = param1;
        param1.field_p.field_o = param1;
        if (param0) {
          int discarded$2 = ((ak) this).a((byte) 76);
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        CharSequence var3 = null;
        if (il.field_a) {
          var2 = 83 / ((14 - param0) / 60);
          if (ui.field_g == 2) {
            if (sm.field_Kb != null) {
              var3 = (CharSequence) (Object) param1;
              if (!sm.field_Kb.equals((Object) (Object) rc.a(var3, 320))) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public ak() {
        ((ak) this).field_a = new gp();
        ((ak) this).field_a.field_p = ((ak) this).field_a;
        ((ak) this).field_a.field_o = ((ak) this).field_a;
    }

    final gp a(int param0) {
        gp var2 = null;
        if (param0 <= -8) {
          var2 = ((ak) this).field_a.field_p;
          if (var2 == ((ak) this).field_a) {
            return null;
          } else {
            var2.a(-122);
            return var2;
          }
        } else {
          return null;
        }
    }

    final gp a(boolean param0) {
        gp var2 = null;
        var2 = ((ak) this).field_b;
        if (var2 != ((ak) this).field_a) {
          if (!param0) {
            field_e = 54;
            ((ak) this).field_b = var2.field_p;
            return var2;
          } else {
            ((ak) this).field_b = var2.field_p;
            return var2;
          }
        } else {
          ((ak) this).field_b = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[4];
        field_f = "Your email address is used to identify this account";
        field_c = "You must play 1 more rated game before playing with the current options.";
        field_e = 3;
    }
}
