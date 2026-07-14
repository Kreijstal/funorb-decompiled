/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mc extends hh {
    static r field_x;
    static cn[] field_w;

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        if (param4) {
            ll.a(2, param2 - -param1.field_q, param1.field_x, param1.field_s, param3 - -param1.field_v);
        }
        super.a(param0, param1, param2, param3, param4);
    }

    mc(se param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    public static void c(int param0) {
        field_x = null;
        field_w = null;
        int var1 = 44 / ((param0 - -51) / 47);
    }

    mc(int param0) {
        this(lp.field_C, param0);
    }

    final static void b(int param0, int param1) {
        am.field_d = (param0 << -531048592) / param1;
        am.field_g = 100 * param0 / 150;
        am.field_c = param0 * 400 / 150;
    }

    final static void a(byte param0, int param1, int[] param2) {
        if (param0 <= 15) {
            mc.c(21);
        }
        tg.field_f[param1] = param2;
        bf.field_f[param1] = (qe) (Object) new qc(param1);
    }

    final static void a(String param0, int param1, boolean param2, boolean[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        var6 = DungeonAssault.field_K;
        if (ed.c(param2)) {
          var7 = null;
          throw new RuntimeException((String) null);
        } else {
          if (eh.a(true, param0)) {
            var8 = null;
            throw new RuntimeException((String) null);
          } else {
            if (null == gm.field_d) {
              var9 = null;
              throw new RuntimeException((String) null);
            } else {
              L0: {
                if (!gm.field_d.field_H) {
                  ac.field_B.d((byte) -89, 58);
                  break L0;
                } else {
                  break L0;
                }
              }
              o.a(121);
              ac.field_B.d((byte) -105, 61);
              var4 = 0;
              var5 = 0;
              L1: while (true) {
                if ((var5 ^ -1) <= -9) {
                  ac.field_B.i(param1, -97);
                  ac.field_B.a(6, var4);
                  return;
                } else {
                  if (param3[var5]) {
                    var4 = var4 | 1 << var5;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new r();
    }
}
