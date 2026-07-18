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
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                L1: {
                  nf.field_l = new hj(5000);
                  ff.field_D = new hj(5000);
                  dh.field_x = param12;
                  ua.field_c = param8;
                  if (!param10) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                kc.field_D = stackIn_3_0 != 0;
                cl.field_w = param5;
                ai.field_d = param9;
                wd.field_g = param7;
                pi.field_h = param2;
                lf.field_c = param13;
                l.field_b = param4;
                kf.field_p = param0;
                qb.field_k = param3;
                if (null == l.field_b.field_v) {
                  break L0;
                } else {
                  {
                    L2: {
                      ah.field_b = new we(l.field_b.field_v, 64, 0);
                      break L2;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var15_ref;
                stackOut_10_1 = new StringBuilder().append("ol.C(").append(param0).append(',').append(5000).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param4 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L3;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L3;
                }
              }
              L4: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param5).append(',').append(5000).append(',').append(param7).append(',').append(param8).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param9 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L4;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param10 + ',' + 64 + ',' + param12 + ',' + param13 + ')');
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
            if (((ol) this).field_g.length == 0) {
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
              if (((ol) this).field_g.length != 0) {
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
        field_e = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            Object var6 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param0.getDocumentBase().getFile();
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (var3 >= 0) {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var5 = new java.net.URL(param0.getCodeBase(), var4);
                    param0.getAppletContext().showDocument(dh.a(param0, (byte) 117, var5), "_self");
                    if (param1 == 30194) {
                      break L1;
                    } else {
                      var6 = null;
                      ol.a((java.applet.Applet) null, 39);
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
                stackOut_8_0 = (RuntimeException) var2_ref2;
                stackOut_8_1 = new StringBuilder().append("ol.B(");
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
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
                if (((ol) this).field_g[var3] + ((ol) this).field_g[-1 + var3] >> 1 <= param1) {
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
          if (param1 < -1) {
            L0: {
              var2 = 1;
              if (param1 <= 65535) {
                break L0;
              } else {
                var2 += 16;
                param1 = param1 >> 16;
                break L0;
              }
            }
            L1: {
              if (param1 > 255) {
                param1 = param1 >> 8;
                var2 += 8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 > 15) {
                var2 += 4;
                param1 = param1 >> 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 > 3) {
                var2 += 2;
                param1 = param1 >> 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 > 1) {
                param1 = param1 >> 1;
                var2++;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            L5: {
              var2 = 2;
              if (-65536 <= param1) {
                break L5;
              } else {
                param1 = param1 >> 16;
                var2 += 16;
                break L5;
              }
            }
            L6: {
              if (255 <= param1) {
                break L6;
              } else {
                var2 += 8;
                param1 = param1 >> 8;
                break L6;
              }
            }
            L7: {
              if (-16 > param1) {
                param1 = param1 >> 4;
                var2 += 4;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param1 >= -4) {
                break L8;
              } else {
                var2 += 2;
                param1 = param1 >> 2;
                break L8;
              }
            }
            L9: {
              if (param1 >= -2) {
                break L9;
              } else {
                var2++;
                param1 = param1 >> 1;
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
