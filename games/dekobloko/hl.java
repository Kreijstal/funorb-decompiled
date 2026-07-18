/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    int field_n;
    int field_k;
    static int[] field_e;
    int field_l;
    String field_o;
    static int field_d;
    int field_m;
    w field_f;
    boolean field_j;
    int field_i;
    static String field_b;
    int[] field_q;
    static String field_c;
    String field_h;
    static String field_a;
    String field_p;
    String field_g;
    long field_r;

    final int b(byte param0) {
        L0: {
          if (((hl) this).field_j) {
            break L0;
          } else {
            L1: {
              if (2 != ((hl) this).field_m) {
                break L1;
              } else {
                if (((hl) this).field_l > 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (~uc.field_g != ~((hl) this).field_r) {
              L2: {
                if (2 != jj.field_b) {
                  break L2;
                } else {
                  int discarded$10 = 3;
                  if (qe.a(((hl) this).field_o)) {
                    return 1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param0 == 94) {
                return 0;
              } else {
                ((hl) this).field_p = null;
                return 0;
              }
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    final static boolean a() {
        return sg.a(cf.field_c, 113, fm.field_d);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              int discarded$9 = 0;
              db.a((java.awt.Component) (Object) param0);
              if (param1 < -29) {
                break L1;
              } else {
                var3 = null;
                hl.a((java.awt.Canvas) null, (byte) -79);
                break L1;
              }
            }
            L2: {
              al.a(-2204, (java.awt.Component) (Object) param0);
              if (uc.field_e != null) {
                uc.field_e.a((java.awt.Component) (Object) param0, -63);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("hl.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -21128) {
            hl.a(-128);
        }
        field_e = null;
        field_a = null;
        field_b = null;
    }

    hl(boolean param0) {
        ((hl) this).field_i = vl.field_k;
        ((hl) this).field_r = fc.field_h;
        ((hl) this).field_g = qm.field_e;
        ((hl) this).field_p = ad.field_x;
        ((hl) this).field_n = ic.field_a;
        ((hl) this).field_l = tg.field_c;
        if (!param0) {
            ((hl) this).field_q = null;
        } else {
            ((hl) this).field_q = fa.field_q;
        }
        ((hl) this).field_m = mf.field_R;
        ((hl) this).field_j = fm.field_f;
        ((hl) this).field_k = dh.field_d;
        ((hl) this).field_h = ib.field_pb;
        ((hl) this).field_o = sa.field_B;
    }

    hl(int param0, String param1, int param2, String param3, String param4) {
        try {
            ((hl) this).field_i = 0;
            ((hl) this).field_n = 0;
            ((hl) this).field_m = param0;
            ((hl) this).field_g = param3;
            ((hl) this).field_l = 0;
            ((hl) this).field_k = param2;
            ((hl) this).field_q = null;
            ((hl) this).field_r = 0L;
            ((hl) this).field_o = param1;
            ((hl) this).field_h = param4;
            ((hl) this).field_j = true;
            ((hl) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "hl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[4];
        field_b = "Decline invitation to <%0>'s game";
        field_c = "Who can join";
        field_a = null;
    }
}
