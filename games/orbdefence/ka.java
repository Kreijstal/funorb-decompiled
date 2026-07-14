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
            Exception exception = null;
            java.net.URL var2 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                            param0.getAppletContext().showDocument(f.a(param0, var2, 120), "_top");
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
                        if (param1 != 1) {
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
                        int discarded$2 = ka.a(-76, -42, -14);
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

    static {
    }
}
