/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static String field_b;
    static vh field_c;
    static int field_a;

    final static void a(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                hg.a(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hg.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        if (param0 == 0) {
          o.field_C.c(param1, param3);
          if (param2) {
            L0: {
              var4 = uf.field_X % o.field_C.field_z * 2;
              if (var4 < o.field_C.field_z) {
                break L0;
              } else {
                var4 = o.field_C.field_z + (-var4 + o.field_C.field_z);
                break L0;
              }
            }
            if (10 > var4) {
              var4 = 10;
              wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
              return;
            } else {
              if (-40 + o.field_C.field_z >= var4) {
                wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
                return;
              } else {
                var4 = -40 + o.field_C.field_z;
                wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          field_b = (String) null;
          o.field_C.c(param1, param3);
          if (param2) {
            L1: {
              var4 = uf.field_X % o.field_C.field_z * 2;
              if (var4 < o.field_C.field_z) {
                break L1;
              } else {
                var4 = o.field_C.field_z + (-var4 + o.field_C.field_z);
                break L1;
              }
            }
            if (10 > var4) {
              var4 = 10;
              wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
              return;
            } else {
              if (-40 + o.field_C.field_z >= var4) {
                wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
                return;
              } else {
                var4 = -40 + o.field_C.field_z;
                wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static java.awt.Container a(boolean param0) {
        if (param0) {
            String var2 = (String) null;
            hg.a((String) null, true);
            if (!(null == op.field_e)) {
                return (java.awt.Container) ((Object) op.field_e);
            }
            return (java.awt.Container) ((Object) hk.d(95));
        }
        if (!(null == op.field_e)) {
            return (java.awt.Container) ((Object) op.field_e);
        }
        return (java.awt.Container) ((Object) hk.d(95));
    }

    public static void b(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
            field_c = (vh) null;
        }
    }

    static {
        field_b = "Try again";
    }
}
