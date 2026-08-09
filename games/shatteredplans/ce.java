/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends rr {
    static String field_u;
    static bi field_v;
    static String field_w;
    static km field_x;

    private ce(nq param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(char param0, byte param1) {
        int var2;
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!ef.a(param0, false)) {
            if (param0 != 45) {
              if (160 != param0) {
                if (param0 != 32) {
                  if (95 == param0) {
                    return true;
                  } else {
                    var2 = -121 % ((param1 - 43) / 57);
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        sq.field_o = true;
        if (!param1) {
            return;
        }
        try {
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            lg.a(var4, param0, 60, var2, var3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ce.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String b(boolean param0, vg param1) {
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
                field_w = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = ad.a('*', param1.field_s.length(), -34);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ce.L(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    ce(int param0) {
        this(gn.field_u, param0);
    }

    final static void a(String param0, String param1, byte param2) {
        try {
            if (!(null == ji.field_G)) {
                ji.field_G.i((byte) -104);
            }
            no.field_e = new ri(param0, param1, false, true, true);
            if (param2 != 3) {
                java.applet.Applet var4 = (java.applet.Applet) null;
                ce.a((java.applet.Applet) null, true);
            }
            ae.field_f.b(no.field_e, 122);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ce.O(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_x = null;
        field_w = null;
        field_u = null;
        field_v = null;
        if (!param0) {
            field_v = (bi) null;
        }
    }

    static {
        field_u = "Chat view has been scrolled up. Scroll down to chat.";
        field_w = "This game has been updated! Please reload this page.";
    }
}
