/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class hb {
    static String field_a;
    static java.awt.Image field_i;
    static int field_f;
    private int field_g;
    private int field_b;
    private ga field_e;
    private rj field_h;
    static String field_c;
    static String field_d;

    final static void a(Throwable param0, int param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ce var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            uf stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            uf stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            uf stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            Throwable decompiledCaughtException = null;
            uf stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            uf stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            uf stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            var6 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 != null) {
                    var3_ref = j.a(false, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  }
                }
                re.a((byte) 53, var3_ref);
                var7 = bb.a(var3_ref, (byte) -82, "%3a", ":");
                var8 = bb.a(var7, (byte) -82, "%40", "@");
                var9 = bb.a(var8, (byte) -82, "%26", "&");
                var10 = bb.a(var9, (byte) -82, "%23", "#");
                if (param1 == 0) {
                  if (null != qf.field_b) {
                    L4: {
                      stackOut_12_0 = re.field_f;
                      stackOut_12_1 = 0;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = qf.field_b.getCodeBase();
                      stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(lj.field_a).append("&u=");
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_14_4 = stackOut_12_4;
                      stackIn_14_5 = stackOut_12_5;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      if (null != ac.field_b) {
                        stackOut_14_0 = (uf) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = null;
                        stackOut_14_3 = null;
                        stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                        stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                        stackOut_14_6 = ac.field_b;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        stackIn_15_4 = stackOut_14_4;
                        stackIn_15_5 = stackOut_14_5;
                        stackIn_15_6 = stackOut_14_6;
                        break L4;
                      } else {
                        stackOut_13_0 = (uf) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = null;
                        stackOut_13_3 = null;
                        stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                        stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                        stackOut_13_6 = "" + fi.field_p;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_15_3 = stackOut_13_3;
                        stackIn_15_4 = stackOut_13_4;
                        stackIn_15_5 = stackOut_13_5;
                        stackIn_15_6 = stackOut_13_6;
                        break L4;
                      }
                    }
                    var4 = ((uf) (Object) stackIn_15_0).a(stackIn_15_1 != 0, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + uf.field_e + "&v2=" + uf.field_g + "&e=" + var10));
                    L5: while (true) {
                      if (0 != var4.field_f) {
                        L6: {
                          if (var4.field_f != 1) {
                            break L6;
                          } else {
                            var5 = (DataInputStream) var4.field_e;
                            int discarded$1 = var5.read();
                            var5.close();
                            break L6;
                          }
                        }
                        break L0;
                      } else {
                        wl.a(1L, false);
                        continue L5;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cg[] a(int param0, la param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        cg[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        cg var6 = null;
        int var7 = 0;
        cg[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        cg[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.d(0, 8);
            if (var2_int <= 0) {
              var3 = param1.d(0, 12);
              var4 = new cg[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_13_0 = (cg[]) var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    if (lf.a((byte) -68, param1)) {
                      var6 = new cg();
                      int discarded$102 = param1.d(0, 24);
                      int discarded$103 = param1.d(0, 24);
                      var6.field_a = param1.d(0, 24);
                      int discarded$104 = param1.d(0, 9);
                      int discarded$105 = param1.d(0, 12);
                      int discarded$106 = param1.d(0, 12);
                      int discarded$107 = param1.d(0, 12);
                      var4[var5] = var6;
                      var5++;
                      break L2;
                    } else {
                      var6_int = param1.d(0, be.d((byte) -98, -1 + var5));
                      var4[var5] = var4[var6_int];
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("hb.A(").append(12).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final Object a(long param0, byte param1) {
        int var5 = 0;
        Object var6 = null;
        ad var7 = null;
        vh var8 = null;
        var8 = (vh) (Object) ((hb) this).field_e.a(param0, 20);
        var5 = 79 / ((param1 - -50) / 50);
        if (var8 != null) {
          var6 = var8.a((byte) 52);
          if (var6 == null) {
            var8.a(-110);
            var8.e(0);
            ((hb) this).field_g = ((hb) this).field_g + var8.field_o;
            return null;
          } else {
            L0: {
              if (var8.f(-19429)) {
                var7 = new ad(var6, var8.field_o);
                ((hb) this).field_e.a((fc) (Object) var7, var8.field_b, -1);
                ((hb) this).field_h.a((gb) (Object) var7, 8466);
                ((vh) (Object) var7).field_m = 0L;
                var8.a(-57);
                var8.e(0);
                break L0;
              } else {
                ((hb) this).field_h.a((gb) (Object) var8, 8466);
                var8.field_m = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    private final void a(byte param0, vh param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -92) {
                break L1;
              } else {
                var4 = null;
                hb.a((Throwable) null, 126, (String) null);
                break L1;
              }
            }
            if (param1 == null) {
              break L0;
            } else {
              param1.a(-113);
              param1.e(0);
              ((hb) this).field_g = ((hb) this).field_g + param1.field_o;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("hb.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    private final void a(long param0, int param1) {
        vh var4 = (vh) (Object) ((hb) this).field_e.a(param0, 20);
        this.a((byte) -108, var4);
    }

    private final void a(int param0, int param1, long param2, Object param3) {
        vh var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (((hb) this).field_b < 1) {
              throw new IllegalStateException();
            } else {
              this.a(param2, -89);
              ((hb) this).field_g = ((hb) this).field_g - 1;
              L1: while (true) {
                if (((hb) this).field_g >= 0) {
                  break L0;
                } else {
                  var6 = (vh) (Object) ((hb) this).field_h.a(65);
                  this.a((byte) -103, var6);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6_ref;
            stackOut_9_1 = new StringBuilder().append("hb.D(").append(1).append(',').append(-84).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private hb() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_i = null;
        field_a = null;
    }

    final void a(int param0, Object param1, long param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(1, -84, param2, param1);
              if (param0 < -26) {
                break L1;
              } else {
                Object discarded$2 = ((hb) this).a(-15L, (byte) -124);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hb.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "OK";
        field_d = "Type your password again to make sure it's correct";
        field_c = "Time bonus: ";
        field_f = 0;
    }
}
