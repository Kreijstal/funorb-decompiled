/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static boolean field_d;
    static String field_b;
    static String field_c;
    static String field_e;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != 0) {
            field_a = 69;
        }
    }

    final static void a(byte param0) {
        CharSequence var2;
        CharSequence var3;
        if (param0 < 76) {
          uc.a(96, (byte) 96);
          w.field_a = nf.field_l.g(12248);
          var2 = (CharSequence) ((Object) w.field_a);
          kf.field_e = hj.a((byte) -125, var2);
          return;
        } else {
          w.field_a = nf.field_l.g(12248);
          var3 = (CharSequence) ((Object) w.field_a);
          kf.field_e = hj.a((byte) -125, var3);
          return;
        }
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              if (param2) {
                stackIn_7_0 = tb.field_c.a(param0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = ce.field_b.a(param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -6;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("uc.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(int param0, byte param1) {
        lb.field_a = param0;
        if (param1 < -116) {
          if (null == jk.field_D) {
            if (null != jj.field_a) {
              jj.field_a.a(param0, false);
              return;
            } else {
              return;
            }
          } else {
            jk.field_D.a((byte) 101, param0);
            if (null == jj.field_a) {
              return;
            } else {
              jj.field_a.a(param0, false);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 0) {
                  try {
                    L1: {
                      var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                      param1.getAppletContext().showDocument(dh.a(param1, (byte) -112, var2), "_top");
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    return;
                  }
                  return;
                } else {
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("uc.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Best each";
        field_d = true;
        field_c = "Please check if address is correct";
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = 0;
    }
}
