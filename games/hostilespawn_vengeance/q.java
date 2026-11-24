/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_k;
    static int field_d;
    static int field_h;
    static bd field_c;
    static bn field_b;
    static String field_l;
    static na field_j;
    static ql field_g;
    static String field_a;
    static int[][] field_e;
    static RawPcmStream field_i;
    static bd field_f;
    static String[] field_m;
    static int field_n;

    final static void b(int param0) {
        qb var1 = null;
        int var2 = HostileSpawn.field_I ? 1 : 0;
        qb var1Lifetime1;
        try {
          uj.field_m.serviceOutput();
          if (param0 != 14470) {
            field_l = (String) null;
          }
          eb.field_e.serviceOutput();
          de.field_n = de.field_n - 1;
          if (de.field_n == 0) {
            de.field_n = 200;
            var1 = (qb) (jn.field_H.beginForward(param0 ^ -14500));
            while (var1 != null) {
              if (!var1.field_j.isLinked(3000)) {
                var1.unlink(param0 ^ -14511);
              }
              var1 = (qb) (jn.field_H.nextForward(12684));
            }
            if (ej.field_g != null) {
              var1Lifetime1 = (qb) (ej.field_g.beginForward(-27));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_j.isLinked(param0 - 11470)) {
                  var1Lifetime1.unlink(-17);
                }
                var1Lifetime1 = (qb) (ej.field_g.nextForward(12684));
              }
            }
          }
          if (uh.field_l != null) {
            if (uh.field_l.isMidiReady(323697071)) {
              return;
            }
            id.field_t = null;
          }
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "q.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_f = null;
        field_g = null;
        field_l = null;
        field_e = (int[][]) null;
        field_c = null;
        field_a = null;
        field_j = null;
        if (param0 == 50) {
          field_i = null;
          field_b = null;
          return;
        }
        q.c(-56);
        field_i = null;
        field_b = null;
    }

    final static String c(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        if (od.field_I == ti.field_b) {
          return qi.field_G;
        }
        return fc.field_y;
    }

    static {
        jn.a(256, 50);
        field_l = "You destroyed the main reactor for this level. Activate another reactor to restore power to the lift.";
        field_i = null;
        field_a = "Find a way back to the lift.";
        field_n = 5701664;
        field_m = new String[]{"Highscores: Kerrus", "Highscores: Vengeance"};
    }
}
