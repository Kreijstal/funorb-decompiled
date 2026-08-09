/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends gg {
    static int[] field_k;
    int field_p;
    int field_l;
    int field_n;
    int field_m;
    static String field_r;
    static String field_q;
    int field_s;
    int field_o;

    final static void a(int param0, java.awt.Component param1) {
        if (param0 != -28092) {
            return;
        }
        try {
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener(pk.field_e);
            param1.addFocusListener(pk.field_e);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "fk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_r = null;
        if (param0 != 23976) {
            field_k = (int[]) null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final static hl d(int param0) {
        if (param0 < 70) {
            return (hl) null;
        }
        return ok.field_b;
    }

    fk(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param5;
        this.field_p = param1;
        this.field_o = param4;
        this.field_l = param0;
        this.field_m = param2;
        this.field_s = param3;
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2, byte param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param3 >= 71) {
                  L1: {
                    if (ej.field_k.startsWith("win")) {
                      if (li.a(param2, (byte) -5)) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                      break L2;
                    }
                  } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    qe.a(12, "MGR1: " + param2, (Throwable) null);
                    return;
                  }
                  return;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var4_ref);

                stackIn_13_1 = new StringBuilder().append("fk.A(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L3;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L4;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L4;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_r = "Your email address is used to identify this account";
        field_q = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
