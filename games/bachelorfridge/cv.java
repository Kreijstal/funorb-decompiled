/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cv extends bca {
    final static void a(int param0, String param1, Throwable param2) {
        try {
            ht stackIn_13_0;
            java.net.URL stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            StringBuilder stackIn_13_4;
            ht stackIn_14_0;
            java.net.URL stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            StringBuilder stackIn_14_4;
            String stackIn_14_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            eh var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = BachelorFridge.field_y;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param2 != null) {
                    var3 = sma.a(96, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 != null) {
                        var3 = var3 + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3 = var3 + param1;
                    break L2;
                  }
                }
                sl.a((byte) -86, var3);
                var7 = ig.a(param0 + -19385, var3, ":", "%3a");
                var8 = ig.a(-19384, var7, "@", "%40");
                var9 = ig.a(param0 + -19385, var8, "&", "%26");
                var10 = ig.a(-19384, var9, "#", "%23");
                if (jia.field_m != null) {
                  L4: {
                    stackIn_13_0 = v.field_d;

                    stackIn_13_1 = null;

                    stackIn_13_2 = null;

                    stackIn_13_3 = jia.field_m.getCodeBase();

                    stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(ej.field_p).append("&u=");

                    if (null == da.field_b) {
                      stackIn_14_0 = (ht) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = "" + om.field_v;
                      break L4;
                    } else {
                      stackIn_14_0 = (ht) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = da.field_b;
                      break L4;
                    }
                  }
                  var4 = ((ht) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + ht.field_g + "&v2=" + ht.field_c + "&e=" + var10), param0 + 23);
                  L5: while (true) {
                    if (var4.field_f != 0) {
                      L6: {
                        if (param0 != var4.field_f) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) (var4.field_e);
                          var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      gda.a(false, 1L);
                      continue L5;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        Throwable var9 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 28850) {
                break L1;
              } else {
                var9 = (Throwable) null;
                cv.a(70, (String) null, (Throwable) null);
                break L1;
              }
            }
            incrementValue$2 = param5;
            param5++;
            hba.a(param0, param3, tj.field_b[incrementValue$2], param1 ^ 28853, param4);
            incrementValue$3 = param2;
            param2--;
            hba.a(param0, param3, tj.field_b[incrementValue$3], param1 + -28843, param4);
            var6_int = param5;
            L2: while (true) {
              if (param2 < var6_int) {
                break L0;
              } else {
                var7 = tj.field_b[var6_int];
                var7[param4] = param0;
                var7[param3] = param0;
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "cv.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        bk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5) {
              stackIn_4_0 = new bk(param1, (cv) (this));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (at) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("cv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (at) ((Object) stackIn_4_0);
        }
    }

    final void a(op param0, int param1) {
        try {
            this.a(param0, (byte) -2);
            int var3_int = -4 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cv.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            if (!rs.b(true)) {
              L1: {
                if (kga.field_c == null) {
                  break L1;
                } else {
                  if (kga.field_c.field_f) {
                    lga.c((byte) 112);
                    pja.field_e.a((wj) (new em(pja.field_e, r.field_m)), (byte) 93);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              pja.field_e.a(true, kh.field_q, ef.field_k, param0 + 6382);
              if (param0 == -1) {
                pja.field_e.i(0);
                L2: while (true) {
                  if (!kaa.b(127)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    pja.field_e.a(dla.field_j, (byte) 7, gf.field_k);
                    continue L2;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "cv.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    cv(int param0, nq param1) {
        super(param0, param1);
    }

    cv(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_k = param0.e((byte) 74);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (var2_int < 0) {
                break L0;
              } else {
                this.field_o.a(dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("cv.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
    }
}
