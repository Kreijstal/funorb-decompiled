/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_b;
    static String field_a;

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (gk.field_e == -1 &&
            oi.field_f == -1) {
            gk.field_e = ei.field_a;
            oi.field_f = p.field_a;
          }
          boolean decompiledFrameRemainder0 = true;
          ka.field_a = ka.field_a + 1;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(pf.field_b));
          } else {
            decompiledFrameRemainder0 = (null == pf.field_b);
          }
          if (decompiledFrameRemainder0) {
            if (!ac.field_b) {
              if (cj.field_e <= ka.field_a) {
                stackIn_17_0 = (ka.field_a < cj.field_e + id.field_a) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              ka.field_a = 0;
            } else {
              if (ac.field_b) {
                ka.field_a = cj.field_e;
              } else {
                if (var2_int == 0) {
                  ka.field_a = 0;
                } else {
                  ka.field_a = cj.field_e;
                }
              }
            }
            if (param1 != null) {
              ac.field_b = false;
            } else {
              if (var2_int != 0) {
                ac.field_b = true;
              }
            }
            oa.field_G = gk.field_e;
            nj.field_a = oi.field_f;
          }
          if (!ac.field_b &&
            cj.field_e > ka.field_a &&
            oe.field_d) {
            ka.field_a = 0;
            nj.field_a = oi.field_f;
            oa.field_G = gk.field_e;
          }
          pf.field_b = param1;
          if (param0 <= 8) {
            ef.a(false);
          }
          gk.field_e = -1;
          if (ac.field_b &&
            ik.field_l == ka.field_a) {
            ka.field_a = 0;
            ac.field_b = false;
          }
          oi.field_f = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("ef.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          field_b = -19;
        }
    }

    static {
        field_a = "Confirm Email:";
    }
}
