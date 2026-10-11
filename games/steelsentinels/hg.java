/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static long[] field_c;
    boolean field_d;
    static wk[] field_i;
    String field_b;
    String field_g;
    static boolean field_h;
    static String field_f;
    static String field_a;
    static gh field_e;

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        try {
          si.field_m = si.field_m + 1;
          if (pe.field_d == -1 &&
            jj.field_c == -1) {
            jj.field_c = pi.field_c;
            pe.field_d = oh.field_f;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 == null) {
            decompiledFrameRemainder0 = (rc.field_b == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(rc.field_b));
          }
          if (decompiledFrameRemainder0) {
            if (!pg.field_A) {
              if (ik.field_c <= si.field_m) {
                stackIn_17_0 = (si.field_m < ni.field_c + ik.field_c) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              si.field_m = 0;
            } else {
              if (pg.field_A) {
                si.field_m = ik.field_c;
              } else {
                if (var2_int != 0) {
                  si.field_m = ik.field_c;
                } else {
                  si.field_m = 0;
                }
              }
            }
            if (param1 != null) {
              pg.field_A = false;
            } else {
              if (var2_int != 0) {
                pg.field_A = true;
              }
            }
            t.field_l = jj.field_c;
            eh.field_a = pe.field_d;
          }
          if (!pg.field_A &&
            si.field_m < ik.field_c &&
            ik.field_a) {
            t.field_l = jj.field_c;
            si.field_m = 0;
            eh.field_a = pe.field_d;
          }
          if (param0 > -125) {
            return;
          }
          rc.field_b = param1;
          if (pg.field_A &&
            si.field_m == ql.field_Ub) {
            si.field_m = 0;
            pg.field_A = false;
          }
          pe.field_d = -1;
          jj.field_c = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("hg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          db.a(-1, (java.awt.Component) ((Object) param1));
          al.a(true, (java.awt.Component) ((Object) param1));
          if (null != nc.field_j) {
            nc.field_j.a((java.awt.Component) ((Object) param1), false);
          }
          if (param0 == -93) {
            return;
          }
          field_h = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_i = null;
        field_c = null;
        field_f = null;
        if (param0 >= 82) {
          field_a = null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        hg.a((byte) 122, (java.awt.Canvas) null);
        field_a = null;
    }

    static {
        field_c = new long[32];
        field_h = false;
        field_f = "Go Back";
        field_a = "FULL ACCESS";
    }
}
