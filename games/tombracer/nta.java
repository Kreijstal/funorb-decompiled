/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nta implements fo {
    private int field_g;
    static String field_e;
    private int field_a;
    private bua field_f;
    private int field_i;
    static String[] field_b;
    private int field_c;
    static int field_d;
    private int field_j;
    static int field_h;

    final void a(byte param0, uw param1, int param2) {
        if (!(param1 != null)) {
            return;
        }
        try {
            param1.a((byte) -100, 2, (fo) this);
            int var4_int = 5 / ((-52 - param0) / 57);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nta.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            field_e = null;
            return ((nta) this).field_g;
        }
        return ((nta) this).field_g;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
    }

    public final void f(int param0) {
        L0: {
          if (((nta) this).field_a > 0) {
            ((nta) this).field_a = ((nta) this).field_a - 1;
            break L0;
          } else {
            break L0;
          }
        }
        ((nta) this).field_f.a(0);
        if (param0 != -4366) {
          field_d = -24;
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, iq param1) {
        ka var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var3 = ((nta) this).field_f.b((byte) 74);
            gqa.a(((nta) this).field_c, -83584144, ((nta) this).c((byte) 106), ((nta) this).b((byte) 90), var3, ((nta) this).e((byte) -106));
            if (param0 >= 103) {
              break L0;
            } else {
              ((nta) this).field_j = -39;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("nta.DB(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            ((nta) this).f(-64);
            return ((nta) this).field_i;
        }
        return ((nta) this).field_i;
    }

    public final boolean d(byte param0) {
        if (param0 == 48) {
          if (-1 == ((nta) this).field_a) {
            return true;
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (-1 == ((nta) this).field_a) {
            return true;
          } else {
            return false;
          }
        }
    }

    public final int b(byte param0) {
        int var2 = -32 % ((-23 - param0) / 53);
        return ((nta) this).field_j;
    }

    nta(int param0, int param1, int param2, bua param3, int param4, int param5) {
        try {
            ((nta) this).field_a = param5;
            ((nta) this).field_j = param0;
            ((nta) this).field_c = param4;
            ((nta) this).field_i = param1;
            ((nta) this).field_g = param2;
            ((nta) this).field_f = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nta.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"<%0> went squish", "<%0> was smushed", "<%0> became two-dimensional", "<%0> was pulverised", "<%0> got stuck between a rock and a hard place", "<%0> couldn't take the pressure", "<%0> felt the squeeze", "<%0> always wanted to be thinner"};
        field_e = "The invitation has been withdrawn.";
        field_h = -2073743619;
    }
}
