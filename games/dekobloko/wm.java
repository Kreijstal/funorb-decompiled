/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wm extends ba implements qh {
    private rk field_j;
    static int field_l;
    static ck field_n;
    static String field_k;
    static ck field_o;
    static String field_g;
    static String field_m;
    static String field_i;
    static w field_h;

    abstract tb b(String param0, byte param1);

    final String e(byte param0) {
        if (param0 <= 2) {
          field_n = null;
          return ((wm) this).a(((wm) this).field_j.field_E, (byte) -11);
        } else {
          return ((wm) this).a(((wm) this).field_j.field_E, (byte) -11);
        }
    }

    final static void d(int param0) {
        oa.field_f = de.field_V.c((byte) -38);
        CharSequence var2 = (CharSequence) (Object) oa.field_f;
        h.field_c = kf.a(var2, (byte) 2);
        if (param0 != 140) {
            java.awt.Container discarded$0 = wm.f((byte) 98);
        }
    }

    final tb b(int param0) {
        if (param0 != -5520) {
          ((wm) this).field_j = null;
          return ((wm) this).b(((wm) this).field_j.field_E, (byte) -40);
        } else {
          return ((wm) this).b(((wm) this).field_j.field_E, (byte) -40);
        }
    }

    abstract String a(String param0, byte param1);

    public final void a(int param0, rk param1) {
        if (param0 != 16737894) {
            return;
        }
        try {
            ((wm) this).c((byte) -51);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "wm.N(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static java.awt.Container f(byte param0) {
        if (!(hg.field_c == null)) {
            return (java.awt.Container) (Object) hg.field_c;
        }
        if (param0 <= 123) {
            wm.d(74);
            return (java.awt.Container) (Object) se.h(25144);
        }
        return (java.awt.Container) (Object) se.h(25144);
    }

    public final void b(int param0, rk param1) {
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
              if (param0 == -2569) {
                break L1;
              } else {
                field_n = null;
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
            stackOut_3_1 = new StringBuilder().append("wm.K(").append(param0).append(44);
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
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = 112 / ((param0 - 72) / 40);
        if (null != ((wm) this).field_j.field_E) {
          if (0 == ((wm) this).field_j.field_E.length()) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    wm(rk param0) {
        try {
            ((wm) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "wm.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_h = null;
        field_i = null;
        field_n = null;
        field_o = null;
        field_m = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Please wait...";
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_o = new ck(540, 140);
        field_m = "Chain Bonus: ";
        field_i = "<%0> would need a rating of <%1> to play with the current options.";
    }
}
