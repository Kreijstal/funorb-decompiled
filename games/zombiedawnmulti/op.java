/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends ae {
    static String field_l;
    static String field_o;
    private int field_p;
    static String field_n;
    private int field_q;
    static String field_k;
    static String field_j;
    static int field_i;
    static kb field_m;

    final void a(byte param0) {
        super.a((byte) -54);
        mi.field_Kb.a((br) this, false);
        if (param0 > -47) {
            field_l = null;
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            int discarded$22 = 120;
            if (!op.a()) {
              L2: {
                if (rn.field_f == null) {
                  break L2;
                } else {
                  if (!rn.field_f.field_e) {
                    break L2;
                  } else {
                    rn.a(param0 ^ -79);
                    me.field_k.b(3016, (cf) (Object) new vm(me.field_k, hl.field_b));
                    break L2;
                  }
                }
              }
              return;
            } else {
              boolean discarded$23 = me.field_k.a(jk.field_g, (byte) -27, fg.field_j, true);
              me.field_k.h((byte) -109);
              L3: while (true) {
                if (!ba.c(-1)) {
                  break L0;
                } else {
                  boolean discarded$24 = me.field_k.a(param0 + -2, pn.field_d, sj.field_p);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "op.G(" + param0 + ')');
        }
    }

    final static String a(boolean param0, boolean param1) {
        int var4 = 0;
        if (!(!param1)) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        return t.field_f[var4];
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            Object var6 = null;
            ((op) this).a(-70, (qd) null);
        }
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          field_n = null;
          super.a(0, param1);
          ((op) this).field_p = param2;
          ((op) this).field_q = param3;
          return;
        } else {
          super.a(0, param1);
          ((op) this).field_p = param2;
          ((op) this).field_q = param3;
          return;
        }
    }

    private final static boolean a() {
        int var1 = 19;
        if (me.field_k == null) {
            return false;
        }
        if (me.field_k.j((byte) -122) == null) {
            return false;
        }
        return true;
    }

    final void a(int param0, qd param1) {
        RuntimeException runtimeException = null;
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
            L1: {
              param1.b(((op) this).field_p, (byte) 127, ((op) this).field_q);
              if (param0 == 0) {
                break L1;
              } else {
                ((op) this).field_p = -21;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("op.D(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void c() {
        field_o = null;
        field_l = null;
        field_m = null;
        field_j = null;
        field_n = null;
        field_k = null;
    }

    op() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Disruptive behaviour";
        field_k = "Options";
        field_j = "Melt a zombie into a puddle of goo that will slow down humans. Makes humans a lot easier to catch.";
        field_l = "Please wait...";
        field_n = "<%0> is not a member, and cannot play with the current options.";
        field_i = -1;
    }
}
