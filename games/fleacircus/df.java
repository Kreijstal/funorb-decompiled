/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static dd field_b;
    static String field_c;
    static int field_a;

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              c.field_S = c.field_S + 1;
              if (~kb.field_r != param0) {
                break L1;
              } else {
                if (rf.field_a == -1) {
                  kb.field_r = ag.field_f;
                  rf.field_a = kc.field_b;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  if (gf.field_b != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (param1.equals((Object) (Object) gf.field_b)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (ok.field_w) {
                    break L5;
                  } else {
                    if (c.field_S < oh.field_db) {
                      break L5;
                    } else {
                      if (~(fj.field_b + oh.field_db) >= ~c.field_S) {
                        break L5;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              }
              L6: {
                var2_int = stackIn_14_0;
                if (param1 == null) {
                  c.field_S = 0;
                  break L6;
                } else {
                  if (ok.field_w) {
                    c.field_S = oh.field_db;
                    break L6;
                  } else {
                    if (var2_int == 0) {
                      c.field_S = 0;
                      break L6;
                    } else {
                      c.field_S = oh.field_db;
                      break L6;
                    }
                  }
                }
              }
              aa.field_t = kb.field_r;
              gg.field_f = rf.field_a;
              if (param1 == null) {
                if (var2_int != 0) {
                  ok.field_w = true;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                ok.field_w = false;
                break L2;
              }
            }
            L7: {
              if (ok.field_w) {
                break L7;
              } else {
                if (~oh.field_db >= ~c.field_S) {
                  break L7;
                } else {
                  if (!pl.field_c) {
                    break L7;
                  } else {
                    aa.field_t = kb.field_r;
                    gg.field_f = rf.field_a;
                    c.field_S = 0;
                    break L7;
                  }
                }
              }
            }
            L8: {
              gf.field_b = param1;
              kb.field_r = -1;
              if (!ok.field_w) {
                break L8;
              } else {
                if (wb.field_y == c.field_S) {
                  ok.field_w = false;
                  c.field_S = 0;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            rf.field_a = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("df.D(").append(param0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L9;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
    }

    final static void a(int param0, long param1) {
        try {
            {
                Thread.sleep(param1);
            }
            int var3 = 17 / ((-52 - param0) / 58);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        int var1 = -58 % ((param0 - -7) / 47);
        field_b = null;
        field_c = null;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var2 = param0.getDocumentBase().getFile();
                  var4 = var2;
                  var4 = var2;
                  var3 = var2.indexOf('?');
                  var4 = "reload.ws";
                  if (var3 < 0) {
                    break L0;
                  } else {
                    var4 = var4 + var2.substring(var3);
                    break L0;
                  }
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(ib.a(param0, var5, -5441), "_self");
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("df.E(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 10245 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
