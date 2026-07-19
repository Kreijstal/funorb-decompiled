/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nb {
    static int field_e;
    static bg[] field_f;
    static ci[] field_d;
    static int[] field_c;
    static int field_g;
    static si field_b;
    static String field_a;

    final static ci a(int param0, int param1, int param2) {
        ci var3 = null;
        int var4 = 0;
        int var5 = 0;
        ci var6 = null;
        var5 = Terraphoenix.field_V;
        var6 = new ci(param0, param0);
        var3 = var6;
        if (param2 < 117) {
          return (ci) null;
        } else {
          var4 = 0;
          L0: while (true) {
            if (var3.field_z.length <= var4) {
              return var3;
            } else {
              var6.field_z[var4] = param1;
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != -126) {
            field_e = 80;
            qc.a(param0, false, 115);
            return;
        }
        qc.a(param0, false, 115);
    }

    final static void a(int param0) {
        if (!ei.field_R) {
            throw new IllegalStateException();
        }
        wd.field_b = true;
        nb.a(true, (byte) -126);
        q.field_Jb = param0;
    }

    abstract void a(byte param0, dh param1);

    abstract cm c(int param0);

    public static void b(int param0) {
        field_a = null;
        field_f = null;
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            nb.a(25);
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        field_c = new int[8192];
        field_a = "Password is valid";
    }
}
