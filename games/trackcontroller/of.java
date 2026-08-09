/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends ec {
    static String field_g;
    static int field_f;

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, boolean param2) {
        Object var3 = null;
        Object var4 = null;
        java.applet.Applet var5 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                var5 = (java.applet.Applet) null;
                of.a(-79, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              var3 = null;
              var4 = null;
              if (null == field_g) {
                break L2;
              } else {
                if (!field_g.equals(param0.getParameter("settings"))) {
                  var3 = field_g;
                  var4 = var3;
                  var4 = var3;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (null == sa.field_P) {
                break L3;
              } else {
                if (sa.field_P.equals(param0.getParameter("session"))) {
                  break L3;
                } else {
                  var4 = sa.field_P;
                  break L3;
                }
              }
            }
            stackIn_10_0 = ue.a(param1, 56, (String) (var3), -1, (String) (var4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("of.A(");

            if (param0 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static void c(byte param0) {
        java.net.URL var3 = null;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = hd.field_p;
        synchronized (var1) {
          L0: {
            L1: {
              rj.field_a = db.field_bb;
              pa.field_a = pa.field_a + 1;
              if (param0 == 66) {
                break L1;
              } else {
                var3 = (java.net.URL) null;
                of.a((java.applet.Applet) null, (java.net.URL) null, false);
                break L1;
              }
            }
            kf.field_b = la.field_s;
            fg.field_a = wi.field_a;
            mg.field_a = hd.field_q;
            hd.field_q = false;
            uk.field_a = wf.field_d;
            db.field_X = sa.field_M;
            wg.field_e = ch.field_x;
            wf.field_d = 0;
            break L0;
          }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_g = null;
    }

    of(long param0, String param1) {
        super(param0, param1);
    }

    final nh a(boolean param0) {
        if (param0) {
            of.c((byte) 60);
            return be.field_m;
        }
        return be.field_m;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                  param1.getAppletContext().showDocument(of.a(param1, var2, false), "_top");
                  var3 = 10 % ((27 - param0) / 32);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("of.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
