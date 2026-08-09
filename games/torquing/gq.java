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
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = param1.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    if (param0 == 25530) {
                      L2: {
                        var3 = var2.indexOf('?');
                        var4 = "reload.ws";
                        if (var3 < 0) {
                          break L2;
                        } else {
                          var4 = var4 + var2.substring(var3);
                          break L2;
                        }
                      }
                      var5 = new java.net.URL(param1.getCodeBase(), var4);
                      param1.getAppletContext().showDocument(og.a(var5, param1, (byte) -80), "_self");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref2);

                stackIn_10_1 = new StringBuilder().append("gq.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L4;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
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
        this.field_a = param0;
    }

    final static void a(int[] param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                gq.a(32);
                break L1;
              }
            }
            L2: {
              param2 = (param2 & 503) >> 1268110023;
              if (param2 >= 2) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            L3: {
              var3_int = stackIn_6_0;
              if (2 != param2) {
                stackIn_9_0 = 0;
                break L3;
              } else {
                stackIn_9_0 = 1;
                break L3;
              }
            }
            L4: {
              var4 = stackIn_9_0;
              if ((1 & param2) == 0) {
                stackIn_12_0 = 0;
                break L4;
              } else {
                stackIn_12_0 = 1;
                break L4;
              }
            }
            var5 = stackIn_12_0;
            var6 = 0;
            L5: while (true) {
              if (var6 >= param0.length) {
                break L0;
              } else {
                L6: {
                  var7 = (param0[var6] & 64512) >> -15559958;
                  var8 = (896 & param0[var6]) >> 406412615;
                  if (2 > var8) {
                    break L6;
                  } else {
                    L7: {
                      L8: {
                        if (-5 < (var7 ^ -1)) {
                          break L8;
                        } else {
                          if ((var7 ^ -1) >= -61) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var3_int != 0) {
                        param0[var6] = gm.a(ie.a(65408, param0[var6]), 64);
                        break L7;
                      } else {
                        param0[var6] = gm.a(ie.a(65408, param0[var6]), 6);
                        break L7;
                      }
                    }
                    L9: {
                      if (var7 <= 4) {
                        break L9;
                      } else {
                        if (var7 >= 12) {
                          break L9;
                        } else {
                          if (var5 == 0) {
                            param0[var6] = gm.a(6, ie.a(param0[var6], 65408));
                            break L9;
                          } else {
                            param0[var6] = gm.a(64, ie.a(param0[var6], 65408));
                            break L9;
                          }
                        }
                      }
                    }
                    if (var7 <= 17) {
                      break L6;
                    } else {
                      if (var7 < 25) {
                        if (var4 != 0) {
                          param0[var6] = gm.a(64, ie.a(65408, param0[var6]));
                          break L6;
                        } else {
                          param0[var6] = gm.a(6, ie.a(65408, param0[var6]));
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var6++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("gq.B(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
