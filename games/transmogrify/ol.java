/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ol {
    static int[] field_d;
    static String field_c;
    int field_f;
    static int field_b;
    int field_a;
    int[] field_g;
    static String field_e;

    final static void a(int param0, int param1, int param2, long param3, fe param4, int param5, int param6, boolean param7, int param8, String param9, boolean param10, int param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            L0: {
              nf.field_l = new hj(param1);
              ff.field_D = new hj(param6);
              dh.field_x = param12;
              ua.field_c = param8;
              if (!param10) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            kc.field_D = stackIn_3_0 != 0;
            cl.field_w = param5;
            ai.field_d = param9;
            if (param11 == 64) {
              wd.field_g = param7;
              pi.field_h = param2;
              lf.field_c = param13;
              l.field_b = param4;
              kf.field_p = param0;
              qb.field_k = param3;
              if (null == l.field_b.field_v) {
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              } else {
                try {
                  ah.field_b = new we(l.field_b.field_v, 64, 0);
                } catch (java.io.IOException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -26) {
          if (null != ((ol) this).field_g) {
            if (-1 == (((ol) this).field_g.length ^ -1)) {
              return 0;
            } else {
              return ((ol) this).field_g[-1 + ((ol) this).field_g.length];
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          ol.a(false);
          if (null == ((ol) this).field_g) {
            return 0;
          } else {
            L0: {
              if (-1 != (((ol) this).field_g.length ^ -1)) {
                stackOut_4_0 = ((ol) this).field_g[-1 + ((ol) this).field_g.length];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        if (param0) {
            field_d = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            Object var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = param0.getDocumentBase().getFile();
                            var3 = var2.indexOf('?');
                            var4 = "reload.ws";
                            if (-1 >= (var3 ^ -1)) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var4 = var4 + var2.substring(var3);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = new java.net.URL(param0.getCodeBase(), var4);
                            param0.getAppletContext().showDocument(dh.a(param0, (byte) 117, var5), "_self");
                            if (param1 == 30194) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = null;
                            ol.a((java.applet.Applet) null, 39);
                            return;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
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

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (((ol) this).field_g != null) {
          if (((ol) this).field_g.length != 0) {
            var3 = 1;
            L0: while (true) {
              if (((ol) this).field_g.length <= var3) {
                if (param0 != 29791) {
                  ((ol) this).field_g = null;
                  return -1 + ((ol) this).field_g.length;
                } else {
                  return -1 + ((ol) this).field_g.length;
                }
              } else {
                if (((ol) this).field_g[var3] + ((ol) this).field_g[-1 + var3] >> 814495393 <= param1) {
                  var3++;
                  continue L0;
                } else {
                  return -1 + var3;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    ol(int param0, int param1, int param2) {
        ((ol) this).field_g = new int[param2 - -1];
        ((ol) this).field_a = param0;
        ((ol) this).field_f = param1;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == 0) {
          return 0;
        } else {
          if ((param1 ^ -1) >= -1) {
            L0: {
              var2 = 2;
              if (-65536 <= param1) {
                break L0;
              } else {
                param1 = param1 >> 16;
                var2 += 16;
                break L0;
              }
            }
            L1: {
              if (255 >= (param1 ^ -1)) {
                break L1;
              } else {
                var2 += 8;
                param1 = param1 >> 8;
                break L1;
              }
            }
            if (param0 != -23755) {
              return 48;
            } else {
              L2: {
                if (-16 > param1) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((param1 ^ -1) <= 3) {
                  break L3;
                } else {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L3;
                }
              }
              L4: {
                if ((param1 ^ -1) <= 1) {
                  break L4;
                } else {
                  var2++;
                  param1 = param1 >> 1;
                  break L4;
                }
              }
              return var2;
            }
          } else {
            L5: {
              var2 = 1;
              if ((param1 ^ -1) >= -65536) {
                break L5;
              } else {
                var2 += 16;
                param1 = param1 >> 16;
                break L5;
              }
            }
            L6: {
              if (param1 > 255) {
                param1 = param1 >> 8;
                var2 += 8;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((param1 ^ -1) < -16) {
                var2 += 4;
                param1 = param1 >> 4;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((param1 ^ -1) < -4) {
                var2 += 2;
                param1 = param1 >> 2;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((param1 ^ -1) < -2) {
                param1 = param1 >> 1;
                var2++;
                break L9;
              } else {
                break L9;
              }
            }
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = "All";
        field_e = "Connection lost. <%0>";
    }
}
