/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_c;
    private qb field_d;
    private bk field_e;
    static String field_b;
    static volatile int field_a;

    final qb b(byte param0) {
        qb var2 = ((qd) this).field_e.field_a.field_d;
        if (!(var2 != ((qd) this).field_e.field_a)) {
            ((qd) this).field_d = null;
            return null;
        }
        ((qd) this).field_d = ((qb) var2).field_d;
        if (param0 != -33) {
            return (qb) null;
        }
        return var2;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != -2057) {
            field_a = 11;
        }
    }

    final qb a(int param0, qb param1) {
        qb var3 = null;
        if (param1 == null) {
            var3 = ((qd) this).field_e.field_a.field_d;
        } else {
            var3 = param1;
        }
        if (param0 != 25755) {
            qb var4 = (qb) null;
            qb discarded$0 = ((qd) this).a((byte) 72, (qb) null);
        }
        if (!(((qd) this).field_e.field_a != var3)) {
            ((qd) this).field_d = null;
            return null;
        }
        ((qd) this).field_d = ((qb) var3).field_d;
        return var3;
    }

    final qb a(byte param0, qb param1) {
        qb var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((qd) this).field_e.field_a.field_a;
        }
        if (var3 == ((qd) this).field_e.field_a) {
            ((qd) this).field_d = null;
            return null;
        }
        ((qd) this).field_d = ((qb) var3).field_a;
        int var4 = 95 / ((param0 - -78) / 33);
        return var3;
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Main.field_T;
          var3 = 0;
          var4 = ((CharSequence) param2).length();
          if (param0 <= -54) {
            break L0;
          } else {
            qd.c(-56);
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param1 == ((CharSequence) param2).charAt(var5)) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final qb a(byte param0) {
        qb var2 = ((qd) this).field_d;
        if (!(((qd) this).field_e.field_a != var2)) {
            ((qd) this).field_d = null;
            return null;
        }
        ((qd) this).field_d = ((qb) var2).field_a;
        if (param0 < 55) {
            return (qb) null;
        }
        return var2;
    }

    final qb c(byte param0) {
        qb var2 = ((qd) this).field_e.field_a.field_a;
        if (((qd) this).field_e.field_a == var2) {
            ((qd) this).field_d = null;
            return null;
        }
        if (param0 != -13) {
            ((qd) this).field_e = (bk) null;
        }
        ((qd) this).field_d = ((qb) var2).field_a;
        return var2;
    }

    final qb a(int param0) {
        qb var2 = ((qd) this).field_d;
        if (param0 != 28869) {
            return (qb) null;
        }
        if (!(((qd) this).field_e.field_a != var2)) {
            ((qd) this).field_d = null;
            return null;
        }
        ((qd) this).field_d = ((qb) var2).field_d;
        return var2;
    }

    final static nk b(int param0) {
        if (tj.field_F == jc.field_P) {
            throw new IllegalStateException();
        }
        int var1 = -14 % ((param0 - -25) / 60);
        if (gg.field_b != jc.field_P) {
            return null;
        }
        jc.field_P = tj.field_F;
        return mh.field_a;
    }

    qd(bk param0) {
        ((qd) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accept";
        field_a = 0;
    }
}
