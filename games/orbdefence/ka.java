/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    final static int a(int param0, int param1, int param2) {
        if (param0 == 24316) {
          if (bl.field_n == null) {
            return -1;
          } else {
            if (gb.field_d <= param1) {
              if (param1 < gb.field_d + bl.field_n.field_o) {
                L0: {
                  if (param2 < ua.field_c) {
                    break L0;
                  } else {
                    if (bl.field_n.field_k + ua.field_c <= param2) {
                      break L0;
                    } else {
                      return 0;
                    }
                  }
                }
                if (ce.field_a <= param1) {
                  if (param1 < bl.field_n.field_o + ce.field_a) {
                    if (param2 >= ug.field_q) {
                      if (param2 < ug.field_q + bl.field_n.field_k) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                if (ce.field_a <= param1) {
                  if (param1 < bl.field_n.field_o + ce.field_a) {
                    if (param2 >= ug.field_q) {
                      if (param2 >= ug.field_q + bl.field_n.field_k) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (ce.field_a <= param1) {
                if (param1 < bl.field_n.field_o + ce.field_a) {
                  if (param2 >= ug.field_q) {
                    if (param2 >= ug.field_q + bl.field_n.field_k) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          return -37;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(f.a(param0, var2, 120), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param1 == 1) {
                  break L0;
                } else {
                  ka.a(-76, -42, -14);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("ka.B(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
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
