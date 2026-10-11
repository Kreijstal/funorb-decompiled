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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 1) {
            field_b = (ue) null;
          }
          var2_int = param0.b(16711935);
          if (255 == var2_int) {
            return null;
          }
          stackIn_6_0 = new nq(var2_int >> 5, var2_int & 31);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("qi.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
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
        int var2 = BachelorFridge.field_y;
        if ((dj.field_c.field_h.field_h & 1 << dj.field_c.field_n) != 0) {
          lr.field_k[10] = cd.field_k;
          if (param0 < 27) {
            field_b = (ue) null;
            return;
          }
          return;
        }
        if (0 == dj.field_c.field_h.field_h) {
          lr.field_k[10] = nt.field_w;
          if (param0 < 27) {
            field_b = (ue) null;
            return;
          }
          return;
        }
        lr.field_k[10] = gt.field_r;
        if (param0 >= 27) {
          return;
        }
        field_b = (ue) null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        lu var3 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != -1) {
          var3 = (lu) null;
          qi.a((lu) null, (byte) 14);
        }
        if (null == uc.field_m) {
          return;
        }
        var1 = uc.field_m;
        synchronized (var1) {
          uc.field_m = null;
        }
    }

    static {
        field_a = "Are you sure you want to delete this creature?";
    }
}
