/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends he {
    int field_k;
    int field_p;
    int field_q;
    int field_l;
    static vg field_m;
    int field_o;
    int field_n;

    final static boolean b(byte param0) {
        if (param0 != 34) {
          CharSequence var2 = (CharSequence) null;
          ie.a(false, (CharSequence) null);
          if (cd.field_e < 10) {
            return false;
          }
          if (!vg.field_d) {
            return !g.j(param0 - 27) ? true : false;
          }
          return false;
        }
        if (cd.field_e < 10) {
          return false;
        }
        if (!vg.field_d) {
          return !g.j(param0 - 27) ? true : false;
        }
        return false;
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 != -11) {
          ie.e(75);
        }
    }

    final static void a(byte param0, long param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            if (param0 != 10) {
              field_m = (vg) null;
            }
            Thread.sleep(param1);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (CharSequence) null;
            ie.a(false, (CharSequence) null);
          }
          stackIn_3_0 = bd.a(true, param1, (byte) 122, 10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ie.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void f(int param0) {
        if (param0 != -11) {
          ie.b((byte) 44);
        }
    }

    ie() {
    }

    static {
    }
}
