/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    int field_a;
    static int field_b;

    final static void a(int param0) {
        if (param0 < 106) {
            return;
        }
        km.a(117);
        ff.field_a = true;
        cf.field_f = true;
        dc.field_a.h(21);
        jk.a(af.field_a, (byte) -79, false);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            int var3 = 0;
            java.net.URL var5 = null;
            String var2 = param1.getDocumentBase().getFile();
            String var4 = var2;
            var4 = var2;
            if (param0 != 25530) {
                return;
            }
            try {
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (var3 >= 0) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(og.a(var5, param1, (byte) -80), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var9 = Torquing.field_u;
          if (param1 == 4) {
            break L0;
          } else {
            gq.a(32);
            break L0;
          }
        }
        L1: {
          param2 = (param2 & 503) >> 1268110023;
          if (param2 >= 2) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_5_0;
          if (2 != param2) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_8_0;
          if ((1 & param2) == 0) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        var5 = stackIn_11_0;
        var6 = 0;
        L4: while (true) {
          if (var6 >= param0.length) {
            return;
          } else {
            var7 = (param0[var6] & 64512) >> -15559958;
            var8 = (896 & param0[var6]) >> 406412615;
            if (2 <= var8) {
              L5: {
                L6: {
                  if (-5 < (var7 ^ -1)) {
                    break L6;
                  } else {
                    if ((var7 ^ -1) >= -61) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (var3 != 0) {
                  param0[var6] = gm.a(ie.a(65408, param0[var6]), 64);
                  break L5;
                } else {
                  param0[var6] = gm.a(ie.a(65408, param0[var6]), 6);
                  break L5;
                }
              }
              L7: {
                if (var7 <= 4) {
                  break L7;
                } else {
                  if (var7 >= 12) {
                    break L7;
                  } else {
                    if (var5 == 0) {
                      param0[var6] = gm.a(6, ie.a(param0[var6], 65408));
                      break L7;
                    } else {
                      param0[var6] = gm.a(64, ie.a(param0[var6], 65408));
                      break L7;
                    }
                  }
                }
              }
              if (var7 > 17) {
                if (var7 < 25) {
                  if (var4 != 0) {
                    param0[var6] = gm.a(64, ie.a(65408, param0[var6]));
                    var6++;
                    continue L4;
                  } else {
                    param0[var6] = gm.a(6, ie.a(65408, param0[var6]));
                    var6++;
                    continue L4;
                  }
                } else {
                  var6++;
                  continue L4;
                }
              } else {
                var6++;
                continue L4;
              }
            } else {
              var6++;
              continue L4;
            }
          }
        }
    }

    static {
    }
}
