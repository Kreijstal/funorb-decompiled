/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends RuntimeException {
    static int field_c;
    static dl field_b;
    static String[] field_a;

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (rl.field_m == -1 &&
            ln.field_J == -1) {
            rl.field_m = an.field_g;
            ln.field_J = me.field_I;
          }
          boolean decompiledFrameRemainder0 = true;
          jh.field_f = jh.field_f + 1;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(cb.field_c));
          } else {
            decompiledFrameRemainder0 = (cb.field_c == null);
          }
          if (decompiledFrameRemainder0) {
            if (!oh.field_i) {
              if (jh.field_f >= oa.field_e) {
                stackIn_17_0 = (jh.field_f < qc.field_e + oa.field_e) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              jh.field_f = 0;
            } else {
              if (oh.field_i) {
                jh.field_f = oa.field_e;
              } else {
                if (var2_int == 0) {
                  jh.field_f = 0;
                } else {
                  jh.field_f = oa.field_e;
                }
              }
            }
            if (param1 != null) {
              oh.field_i = false;
            } else {
              if (var2_int != 0) {
                oh.field_i = true;
              }
            }
            mo.field_p = rl.field_m;
            ka.field_p = ln.field_J;
          }
          var2_intLifetime1 = -49 / ((param0 + 45) / 60);
          cb.field_c = param1;
          if (!oh.field_i &&
            oa.field_e > jh.field_f &&
            tl.field_d) {
            mo.field_p = rl.field_m;
            ka.field_p = ln.field_J;
            jh.field_f = 0;
          }
          rl.field_m = -1;
          ln.field_J = -1;
          if (oh.field_i) {
            if (mk.field_Q != jh.field_f) {
              return;
            }
            jh.field_f = 0;
            oh.field_i = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("qg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 <= 49) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    qg() {
    }

    final static boolean a(int param0) {
        if (param0 > -61) {
          return true;
        }
        return mj.field_p != -1 ? true : false;
    }

    static {
        field_c = -1;
        field_a = new String[16];
    }
}
