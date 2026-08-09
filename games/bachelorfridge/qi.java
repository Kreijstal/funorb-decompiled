/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static ue field_b;
    static String field_a;

    final static nq a(lu param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        nq stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 1) {
                break L1;
              } else {
                field_b = (ue) null;
                break L1;
              }
            }
            var2_int = param0.b(16711935);
            if (255 != var2_int) {
              stackIn_6_0 = new nq(var2_int >> 1651991109, var2_int & 31);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("qi.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 10) {
            field_a = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        int var2;
        var2 = BachelorFridge.field_y;
        if (-1 == (dj.field_c.field_h.field_h & 1 << dj.field_c.field_n ^ -1)) {
          if (0 != dj.field_c.field_h.field_h) {
            lr.field_k[10] = gt.field_r;
            if (param0 < 27) {
              field_b = (ue) null;
              return;
            } else {
              return;
            }
          } else {
            lr.field_k[10] = nt.field_w;
            if (param0 >= 27) {
              return;
            } else {
              field_b = (ue) null;
              return;
            }
          }
        } else {
          lr.field_k[10] = cd.field_k;
          if (param0 >= 27) {
            return;
          } else {
            field_b = (ue) null;
            return;
          }
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        lu var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            var3 = (lu) null;
            qi.a((lu) null, (byte) 14);
            break L0;
          }
        }
        if (null == uc.field_m) {
          return;
        } else {
          var1 = uc.field_m;
          synchronized (var1) {
            L1: {
              uc.field_m = null;
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_a = "Are you sure you want to delete this creature?";
    }
}
