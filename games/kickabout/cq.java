/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cq extends gn {
    int field_l;
    static int field_g;
    static js field_h;
    static double field_f;
    static hu field_e;
    long field_i;
    static ut field_j;
    static int field_n;
    int field_k;
    static StringBuilder field_m;

    public static void b(int param0) {
        field_h = null;
        field_j = null;
        if (param0 <= 46) {
            field_j = null;
        }
        field_m = null;
        field_e = null;
    }

    public final String toString() {
        String var1 = null;
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        L0: {
          var2 = Kickabout.field_G;
          var3 = "Auction Log [";
          var1 = var3;
          var1 = var3;
          if (((cq) this).field_k != 0) {
            if (((cq) this).field_k != 1) {
              if (((cq) this).field_k == 2) {
                var1 = var3 + "Own]";
                break L0;
              } else {
                if (((cq) this).field_k == 3) {
                  var1 = var3 + "Outbid]";
                  break L0;
                } else {
                  var1 = var3 + "NO TYPE]";
                  break L0;
                }
              }
            } else {
              var1 = var3 + "Buy]";
              break L0;
            }
          } else {
            var1 = var3 + "Bid]";
            break L0;
          }
        }
        var4 = var1 + ", [INDEX==" + ((cq) this).field_l + "]";
        var1 = var4 + ", [ID==" + ((cq) this).field_i + "]\n";
        return var1;
    }

    final static int a(int param0) {
        if (param0 != 1315216324) {
            int discarded$0 = cq.a(0);
        }
        return fc.field_a + (q.field_b << 2) + (ng.field_a << 4);
    }

    final static uo a(int param0, sj param1, int param2, int param3, sj param4) {
        RuntimeException var5 = null;
        Object var6 = null;
        uo stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        uo stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (cu.a(param2, param4, param3, 123)) {
              L1: {
                if (param0 == 10) {
                  break L1;
                } else {
                  var6 = null;
                  cq.a((java.applet.Applet) null, (byte) -14);
                  break L1;
                }
              }
              stackOut_5_0 = tt.a(12015, param1.b(param3, -32669, param2));
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("cq.H(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44).append(param3).append(44);
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
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 126) {
                field_h = null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                param0.getAppletContext().showDocument(qr.a(param0, var2, 3), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, String param1, byte param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_15_0 = null;
        String stackOut_19_0 = null;
        String stackOut_23_0 = null;
        String stackOut_27_0 = null;
        String stackOut_11_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            if (param0 != 3) {
              if (6 != param0) {
                if (param0 == 7) {
                  stackOut_8_0 = fv.field_a;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  if (param0 != 8) {
                    if (param0 == 9) {
                      stackOut_15_0 = cv.field_g;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (param0 == 10) {
                        stackOut_19_0 = vs.field_c;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param0 == 11) {
                          stackOut_23_0 = go.field_a;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (param0 == 14) {
                            stackOut_27_0 = vo.a((byte) -18, nm.field_a, new String[1]);
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                  } else {
                    stackOut_11_0 = rc.field_e;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                stackOut_4_0 = bg.field_s;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ol.field_E;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("cq.F(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L1;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + 112 + 41);
        }
        return stackIn_28_0;
    }

    final static void a(boolean param0, int param1) {
        ir.a(param0, 16355);
        rg.a((byte) -125, param0);
    }

    final static ut[] a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var7 = Kickabout.field_G;
        ut[] var8 = new ut[9];
        ut[] var4 = var8;
        var8[0] = lh.a(param2, (byte) -96, param0);
        for (var5 = 1; var5 < 9; var5++) {
            var8[var5] = var8[0];
        }
        int var6 = 0;
        var8[4] = lh.a(param1, (byte) -96, 64);
        return var4;
    }

    cq(int param0, int param1, long param2) {
        ((cq) this).field_i = param2;
        ((cq) this).field_l = param1;
        ((cq) this).field_k = param0;
    }

    cq(iw param0) {
        int var2_int = 0;
        try {
            int discarded$0 = param0.h((byte) -126);
            var2_int = param0.h((byte) -124);
            ((cq) this).field_k = var2_int & 15;
            ((cq) this).field_l = (15 & var2_int >> 4) + -1;
            ((cq) this).field_i = param0.i((byte) -124);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "cq.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean e(int param0) {
        return !la.a(100) && 2 <= tk.field_Ib;
    }

    final static Object a(byte[] param0, boolean param1, int param2) {
        ll var3 = null;
        RuntimeException var3_ref = null;
        ll stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll stackOut_5_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param2 < param0.length) {
                var3 = new ll();
                ((pf) (Object) var3).a(param0, 21820);
                stackOut_5_0 = (ll) var3;
                stackIn_6_0 = stackOut_5_0;
                return (Object) (Object) stackIn_6_0;
              } else {
                if (!param1) {
                  stackOut_10_0 = (byte[]) param0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = vq.a(82, param0);
                  stackIn_9_0 = stackOut_8_0;
                  return (Object) (Object) stackIn_9_0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("cq.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (Object) (Object) stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = (js) (Object) new hj();
        field_m = new StringBuilder(80);
    }
}
