/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends cj {
    static String field_Jb;
    private cj field_Lb;
    static ja field_Mb;
    private cj field_Fb;
    static th field_Kb;
    static int field_Gb;
    static String field_Nb;
    static cj[] field_Ib;
    static int field_Hb;

    mi(long param0, ja param1, ja param2, int param3, cj param4, String param5) {
        this(param0, (cj) null, param4, param5);
        try {
            ((mi) this).field_Lb.field_lb = param3;
            ((mi) this).field_Lb.field_rb = param2;
            ((mi) this).field_Lb.field_O = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    mi(long param0, mi param1, String param2) {
        this(param0, param1.field_Lb, param1.field_Fb, param2);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        ((mi) this).a(param5, param0, param3, param4, -3344);
        int var7 = 121 / ((param1 - -34) / 45);
        this.e(true, param2);
    }

    final int a(byte param0, int param1) {
        if (param0 <= 92) {
            this.e(false, -106);
            return param1 + (((mi) this).field_Lb.e(0) + ((mi) this).field_Fb.e(0));
        }
        return param1 + (((mi) this).field_Lb.e(0) + ((mi) this).field_Fb.e(0));
    }

    private final void e(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
            mi.b(-119, -84);
            ((mi) this).field_Lb.a(((mi) this).field_z, 0, ((mi) this).field_Lb.e(0), 0, -3344);
            var3 = param1 + ((mi) this).field_Lb.field_zb;
            ((mi) this).field_Fb.a(((mi) this).field_z, 0, ((mi) this).field_zb - var3, var3, -3344);
            return;
        }
        ((mi) this).field_Lb.a(((mi) this).field_z, 0, ((mi) this).field_Lb.e(0), 0, -3344);
        var3 = param1 + ((mi) this).field_Lb.field_zb;
        ((mi) this).field_Fb.a(((mi) this).field_z, 0, ((mi) this).field_zb - var3, var3, -3344);
    }

    public static void d() {
        field_Kb = null;
        field_Ib = null;
        field_Nb = null;
        field_Mb = null;
        field_Jb = null;
    }

    final static void a(jh param0, int param1) {
        jh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 < -52) {
            param0.a(true);
            var2 = (jh) (Object) tn.field_C.c(79);
            L0: while (true) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  if (!var2.a(param0, (byte) -53)) {
                    break L1;
                  } else {
                    var2 = (jh) (Object) tn.field_C.b(6);
                    continue L0;
                  }
                }
              }
              if (var2 == null) {
                tn.field_C.a((br) (Object) param0, false);
                return;
              } else {
                int discarded$2 = 1;
                vc.a((br) (Object) var2, (br) (Object) param0);
                return;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("mi.CA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private mi(long param0, cj param1, cj param2, String param3) {
        super(param0, (cj) null);
        try {
            ((mi) this).field_Lb = new cj(0L, param1);
            ((mi) this).field_Fb = new cj(0L, param2);
            ((mi) this).field_Fb.field_wb = param3;
            ((mi) this).a((byte) 50, ((mi) this).field_Lb);
            ((mi) this).a((byte) 50, ((mi) this).field_Fb);
            ((mi) this).f(-128);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param1);
        var2.a(109, param0);
        var2.a(-116, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "Report <%0> for abuse";
        field_Kb = new th();
        field_Nb = "Visit the Account Management section on the main site to view.";
    }
}
