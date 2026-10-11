/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static long field_e;
    static int field_g;
    static boolean field_d;
    static pf field_a;
    static String field_f;
    static int field_c;
    int field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(dj param0, int param1, dj param2, dj param3, boolean param4) {
        try {
          gl.field_E = co.a("", param1 - 118);
          gl.field_E.a(false, -54);
          ll.a(param2, param3, param0, -19041);
          if (param1 != -1) {
            dj var6 = (dj) null;
            nk.a((dj) null, 101, (dj) null, (dj) null, false);
          }
          mm.c((byte) -70);
          fk.field_F = ic.field_S;
          tk.field_a = ic.field_S;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "nk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -11486) {
          return;
        }
        field_f = null;
        field_a = null;
    }

    final static boolean b(int param0) {
        lf.field_n = true;
        qh.field_e = pd.a(-22826) + (long)param0;
        return 11 == fl.field_a ? true : false;
    }

    final static boolean a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          var2_int = 0;
          if (param0 != 8) {
            return false;
          }
          while (true) {
            if (8 <= var2_int) {
              return false;
            }
            if (param1[var2_int] == 0) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("nk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 <= 50) {
          field_g = 56;
          return (int)(1000000000L / ea.field_a);
        }
        return (int)(1000000000L / ea.field_a);
    }

    nk(int param0) {
        this.field_b = param0;
    }

    static {
        field_f = "Create your own free Jagex account";
        field_d = false;
        field_c = 1044;
    }
}
