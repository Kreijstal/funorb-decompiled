/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    int field_a;
    static int field_b;

    final static void a() {
        km.a(117);
        ff.field_a = true;
        cf.field_f = true;
        dc.field_a.h(21);
        jk.a(af.field_a, (byte) -79, false);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
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
              try {
                L0: {
                  var2 = param1.getDocumentBase().getFile();
                  var4 = var2;
                  var4 = var2;
                  L1: {
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (var3 < 0) {
                      break L1;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L1;
                    }
                  }
                  var5 = new java.net.URL(param1.getCodeBase(), var4);
                  param1.getAppletContext().showDocument(og.a(var5, param1, (byte) -80), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L2;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var2_ref2;
                stackOut_8_1 = new StringBuilder().append("gq.C(").append(25530).append(',');
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param1 == null) {
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
              throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    gq(int param0) {
        ((gq) this).field_a = param0;
    }

    final static void a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              param2 = (param2 & 503) >> 7;
              if (param2 >= 2) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0;
              if (2 != param2) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_7_0;
              if ((1 & param2) == 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var5 = stackIn_10_0;
            var6 = 0;
            L4: while (true) {
              if (var6 >= param0.length) {
                break L0;
              } else {
                L5: {
                  var7 = (param0[var6] & 64512) >> 10;
                  var8 = (896 & param0[var6]) >> 7;
                  if (2 > var8) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (var7 < 4) {
                          break L7;
                        } else {
                          if (var7 <= 60) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var3_int != 0) {
                        param0[var6] = gm.a(ie.a(65408, param0[var6]), 64);
                        break L6;
                      } else {
                        param0[var6] = gm.a(ie.a(65408, param0[var6]), 6);
                        break L6;
                      }
                    }
                    L8: {
                      if (var7 <= 4) {
                        break L8;
                      } else {
                        if (var7 >= 12) {
                          break L8;
                        } else {
                          if (var5 == 0) {
                            param0[var6] = gm.a(6, ie.a(param0[var6], 65408));
                            break L8;
                          } else {
                            param0[var6] = gm.a(64, ie.a(param0[var6], 65408));
                            break L8;
                          }
                        }
                      }
                    }
                    if (var7 <= 17) {
                      break L5;
                    } else {
                      if (var7 < 25) {
                        if (var4 != 0) {
                          param0[var6] = gm.a(64, ie.a(65408, param0[var6]));
                          break L5;
                        } else {
                          param0[var6] = gm.a(6, ie.a(65408, param0[var6]));
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var6++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("gq.B(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + 4 + ',' + param2 + ')');
        }
    }

    static {
    }
}
