/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static tf[] field_d;
    static String field_b;
    static boolean field_a;
    static String field_c;
    static int field_e;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 32) {
            return;
        }
        field_c = null;
    }

    final static void a(ak param0, int param1, ak param2) {
        if (param0.field_L != null) {
          if (param1 != 64) {
            return;
          } else {
            L0: {
              if (param2.field_L == null) {
                param2.field_L = new bb();
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (null == vm.field_b) {
                vm.field_b = new vg(64);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == hq.field_q) {
                hq.field_q = new vg(64);
                break L2;
              } else {
                break L2;
              }
            }
            bq.field_b = param2.field_L;
            vp.field_Hb = param0.field_L;
            bd.a((byte) -1);
            return;
          }
        } else {
          param0.field_L = new bb();
          if (param1 != 64) {
            return;
          } else {
            L3: {
              if (param2.field_L == null) {
                param2.field_L = new bb();
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == vm.field_b) {
                vm.field_b = new vg(64);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null == hq.field_q) {
                hq.field_q = new vg(64);
                break L5;
              } else {
                break L5;
              }
            }
            bq.field_b = param2.field_L;
            vp.field_Hb = param0.field_L;
            bd.a((byte) -1);
            return;
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                            param0.getAppletContext().showDocument(lg.a(false, param0, var2), "_top");
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param1 != 19) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        var3 = null;
                        fc.a((java.applet.Applet) null, (byte) -14);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (param0 < -30) {
          if (32 < wn.field_u) {
            L0: {
              var1 = wn.field_u % 32;
              if (var1 != 0) {
                break L0;
              } else {
                var1 = 32;
                break L0;
              }
            }
            jg.a(wn.field_u - var1, -8);
            return;
          } else {
            jg.a(0, 119);
            return;
          }
        } else {
          field_c = null;
          if (32 < wn.field_u) {
            L1: {
              var1 = wn.field_u % 32;
              if (var1 != 0) {
                break L1;
              } else {
                var1 = 32;
                break L1;
              }
            }
            jg.a(wn.field_u - var1, -8);
            return;
          } else {
            jg.a(0, 119);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Month";
        field_c = "Just play";
    }
}
