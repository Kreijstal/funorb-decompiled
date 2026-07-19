/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static sl field_h;
    static hj[] field_d;
    static int field_e;
    static String field_g;
    static String field_c;
    static ki field_b;
    static long field_a;
    static String field_f;

    public static void a(byte param0) {
        String discarded$2 = null;
        field_g = null;
        field_b = null;
        field_h = null;
        if (param0 != 29) {
          discarded$2 = am.b(-56);
          field_f = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 == -4062) {
          if (null == cd.field_w) {
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          } else {
            cd.field_w.c();
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          }
        } else {
          am.a(-120);
          if (null != cd.field_w) {
            cd.field_w.c();
            if (null == wf.field_b) {
              return;
            } else {
              wf.field_b.c();
              return;
            }
          } else {
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          }
        }
    }

    final static String b(int param0) {
        int var1 = 0;
        if (qc.field_g != mg.field_m) {
          if (tg.field_c == mg.field_m) {
            return pg.field_a;
          } else {
            if (!bd.field_u.a(false)) {
              return pg.field_a;
            } else {
              var1 = 8 % ((55 - param0) / 40);
              return vh.field_k;
            }
          }
        } else {
          return bh.field_e;
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        Object var2 = null;
        ha var3 = null;
        int var4 = 0;
        ha stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        ha stackOut_3_0 = null;
        ca stackOut_5_0 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 6 % ((param1 - 15) / 33);
            var3 = (ha) ((Object) oa.field_d.b((byte) -111));
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    tl.a(-128, var3, param0);
                    stackOut_3_0 = (ha) ((Object) oa.field_d.d(853));
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_4_0;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = mj.field_m.b((byte) -123);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              var2 = stackIn_6_0;
              L4: while (true) {
                if (var2 == null) {
                  break L0;
                } else {
                  tg.a(-126, param0);
                  var2 = mj.field_m.d(853);
                  if (var4 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (var2), "am.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_g = "CHAIN SHOT";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
