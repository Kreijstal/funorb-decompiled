/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends ma {
    int field_Q;
    static vj field_S;
    static wl field_R;
    static ck[] field_O;
    static int[] field_T;
    static int field_N;
    static String[] field_M;
    static String field_U;
    static int field_P;

    public static void g(int param0) {
        field_M = null;
        field_U = null;
        field_T = null;
        field_S = null;
        if (param0 != 0) {
            return;
        }
        field_O = null;
        field_R = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ck var7 = null;
        ck var8 = null;
        if (param1 <= -103) {
          if (0 == param2) {
            if (null == ((ef) this).field_L) {
              return;
            } else {
              if (((ef) this).field_Q == 0) {
                return;
              } else {
                if (((ef) this).field_Q == 256) {
                  ((ef) this).field_L.a(param0 + ((ef) this).field_u, -128, param2, ((ef) this).field_D + param3);
                  return;
                } else {
                  var8 = new ck(((ef) this).field_L.field_t, ((ef) this).field_L.field_y);
                  tb.a(true, var8);
                  ((ef) this).field_L.a(0, -107, param2, 0);
                  mk.a((byte) -5);
                  var8.c(param0 - -((ef) this).field_u, param3 - -((ef) this).field_D, ((ef) this).field_Q);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          ef.f((byte) -51);
          if (0 == param2) {
            if (null == ((ef) this).field_L) {
              return;
            } else {
              if (((ef) this).field_Q == 0) {
                return;
              } else {
                if (((ef) this).field_Q == 256) {
                  ((ef) this).field_L.a(param0 + ((ef) this).field_u, -128, param2, ((ef) this).field_D + param3);
                  return;
                } else {
                  var7 = new ck(((ef) this).field_L.field_t, ((ef) this).field_L.field_y);
                  tb.a(true, var7);
                  ((ef) this).field_L.a(0, -107, param2, 0);
                  mk.a((byte) -5);
                  var7.c(param0 - -((ef) this).field_u, param3 - -((ef) this).field_D, ((ef) this).field_Q);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    ef(ce param0) {
        super(param0.field_u, param0.field_D, param0.field_t, param0.field_y, (gl) null, (kg) null);
        try {
            param0.b(((ef) this).field_y, ((ef) this).field_t, 0, 0, -16555);
            ((ef) this).field_Q = 256;
            ((ef) this).field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ef.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public ef() {
        super(0, 0, 0, 0, (gl) null, (kg) null);
        ((ef) this).field_Q = 256;
    }

    final static void f(byte param0) {
        if (ac.field_B == le.field_m.field_i) {
          L0: {
            if (0 < bl.field_T) {
              bl.field_T = bl.field_T - 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (bl.field_T > 0) {
              int discarded$4 = -100;
              on.b();
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 < 51) {
            ef.g(-58);
            return;
          } else {
            return;
          }
        } else {
          L2: {
            qc.field_Y = qc.field_Y + (le.field_m.field_i + -ac.field_B);
            ac.field_B = le.field_m.field_i;
            if (0 < bl.field_T) {
              bl.field_T = bl.field_T - 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (bl.field_T > 0) {
              int discarded$5 = -100;
              on.b();
              break L3;
            } else {
              break L3;
            }
          }
          if (param0 >= 51) {
            return;
          } else {
            ef.g(-58);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new vj();
    }
}
