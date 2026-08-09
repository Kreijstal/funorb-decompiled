/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends tc {
    static qj field_u;
    static bc field_v;

    wg(int param0) {
        this(sg.field_a, param0);
    }

    final String a(boolean param0, lk param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_u = (qj) null;
                break L1;
              }
            }
            stackIn_3_0 = dg.a(param1.field_h.length(), '*', -13810);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean b(boolean param0) {
        if (param0) {
          if (dh.field_a != null) {
            if (!pj.field_a.b(-80)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          wg.b(false);
          if (dh.field_a != null) {
            if (!pj.field_a.b(-80)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        field_u = null;
        field_v = null;
        if (param0 != 13922) {
            field_u = (qj) null;
        }
    }

    private wg(tj param0, int param1) {
        super(param0, param1);
    }

    static {
        field_u = new qj();
    }
}
