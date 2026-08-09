/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static vc field_e;
    static String field_c;
    static int field_f;
    static String field_d;
    static int[] field_b;
    static String field_a;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                    param1.getAppletContext().showDocument(ib.a(param1, var2, -5441), "_top");
                    if (param0 < -66) {
                      break L1;
                    } else {
                      field_d = (String) null;
                      return;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_7_0 = (RuntimeException) (var2_ref2);

                stackIn_7_1 = new StringBuilder().append("al.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L2;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L2;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static fh[] b(boolean param0) {
        if (!param0) {
          field_f = -27;
          return new fh[]{ne.field_d, ec.field_b, ae.field_d, cg.field_h, lk.field_A, hf.field_h, qi.field_b, hc.field_b, dl.field_t, tg.field_f, kb.field_l, gg.field_b, kc.field_a, ek.field_a};
        } else {
          return new fh[]{ne.field_d, ec.field_b, ae.field_d, cg.field_h, lk.field_A, hf.field_h, qi.field_b, hc.field_b, dl.field_t, tg.field_f, kb.field_l, gg.field_b, kc.field_a, ek.field_a};
        }
    }

    final static boolean a(int param0) {
        int var1;
        var1 = -35 % ((-12 - param0) / 60);
        if (null != aa.field_r) {
          if (!aa.field_r.c((byte) 17)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_d = (String) null;
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = rh.a((byte) -70, uj.a(param0, (byte) -103));
              if (var2 != null) {
                break L1;
              } else {
                var2 = "";
                break L1;
              }
            }
            if (param1 == 111) {
              stackIn_6_0 = (String) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("al.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_c = "This entry doesn't match";
        field_e = new vc();
        field_d = "Mouse over an icon for details";
        field_b = new int[8192];
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
