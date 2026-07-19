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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              c.field_S = c.field_S + 1;
              if ((kb.field_r ^ -1) != param0) {
                break L1;
              } else {
                if (0 == (rf.field_a ^ -1)) {
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
                  if (param1.equals(gf.field_b)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ok.field_w) {
                  if (c.field_S >= oh.field_db) {
                    if (fj.field_b + oh.field_db > c.field_S) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  c.field_S = 0;
                  break L5;
                } else {
                  L6: {
                    if (ok.field_w) {
                      break L6;
                    } else {
                      if (var2_int == 0) {
                        c.field_S = 0;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  c.field_S = oh.field_db;
                  if (var3 == 0) {
                    break L5;
                  } else {
                    c.field_S = 0;
                    break L5;
                  }
                }
              }
              L7: {
                aa.field_t = kb.field_r;
                gg.field_f = rf.field_a;
                if (param1 == null) {
                  break L7;
                } else {
                  ok.field_w = false;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                }
              }
              if (var2_int != 0) {
                ok.field_w = true;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (ok.field_w) {
                break L8;
              } else {
                if (oh.field_db <= c.field_S) {
                  break L8;
                } else {
                  if (!pl.field_c) {
                    break L8;
                  } else {
                    aa.field_t = kb.field_r;
                    gg.field_f = rf.field_a;
                    c.field_S = 0;
                    break L8;
                  }
                }
              }
            }
            L9: {
              gf.field_b = param1;
              kb.field_r = -1;
              if (!ok.field_w) {
                break L9;
              } else {
                if (wb.field_y == c.field_S) {
                  ok.field_w = false;
                  c.field_S = 0;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            rf.field_a = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var2);
            stackOut_42_1 = new StringBuilder().append("df.D(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
    }

    final static void a(int param0, long param1) {
        try {
            try {
                Thread.sleep(param1);
            } catch (InterruptedException interruptedException) {
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
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param0.getDocumentBase().getFile();
                      var4 = var2;
                      var4 = var2;
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (var3 < 0) {
                        break L2;
                      } else {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      }
                    }
                    var5 = new java.net.URL(param0.getCodeBase(), var4);
                    param0.getAppletContext().showDocument(ib.a(param0, var5, param1 ^ -15686), "_self");
                    if (param1 == 10245) {
                      break L1;
                    } else {
                      df.a((byte) 57);
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
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var2_ref2);
                stackOut_7_1 = new StringBuilder().append("df.E(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L3;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L3;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
