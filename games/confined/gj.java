/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_f;
    static mn field_b;
    java.awt.Frame field_e;
    static mi field_a;
    static String field_c;
    static bi field_d;
    static String field_g;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_f = true;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "gj.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, df param1) {
        if (param0 > -76) {
            return;
        }
        try {
            si.a(this.field_e, param1, true);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "gj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
        field_c = null;
        if (param0 > -40) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    gj() {
    }

    final static void a(String param0, boolean param1, String[] param2, int param3) {
        int var5 = 0;
        String[] var8 = null;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String[] var6 = null;
        String[] var7 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              na.field_S = b.field_a;
              if (param3 == 255) {
                L2: {
                  stackIn_9_0 = -108;

                  if (wc.field_Ob >= 13) {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 1;
                    break L2;
                  }
                }
                lm.field_e = jj.a((byte) stackIn_10_0, stackIn_10_1 != 0);
                var7 = (String[]) null;
                fc.a(-7212, (String[]) null);
                break L1;
              } else {
                if (param3 < 100) {
                  lm.field_e = gd.a(4, param0, param3);
                  break L1;
                } else {
                  if (105 < param3) {
                    lm.field_e = gd.a(4, param0, param3);
                    break L1;
                  } else {
                    var8 = param2;
                    fc.a(-7212, var8);
                    lm.field_e = p.a(26663, param2);
                    break L1;
                  }
                }
              }
            }
            if (param1) {
              break L0;
            } else {
              var6 = (String[]) null;
              gj.a((String) null, false, (String[]) null, -96);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("gj.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = new mn();
        field_c = "Please try again in a few minutes.";
        field_g = "You have <%0> unread messages!";
    }
}
