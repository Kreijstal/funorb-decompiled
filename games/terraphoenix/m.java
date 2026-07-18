/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static String field_h;
    private int field_f;
    private int[][] field_d;
    static String field_e;
    static String field_a;
    static String field_b;
    static ci field_g;
    private int field_c;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        var2 = Terraphoenix.field_V;
        try {
          L0: {
            boolean discarded$4 = jl.field_I.a(true, qf.field_c, wd.field_a, 115);
            jl.field_I.i((byte) 126);
            L1: while (true) {
              if (!fd.d(1)) {
                if (ga.field_c != -1) {
                  var1_int = ga.field_c;
                  bm.a(-1, (byte) 1);
                  stackOut_7_0 = var1_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  if (fd.field_k) {
                    stackOut_11_0 = 3;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    if (pe.field_a != ua.field_d) {
                      if (vc.field_a.a(-109)) {
                        if (ua.field_d == qe.field_f) {
                          stackOut_21_0 = 2;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          return -1;
                        }
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  }
                }
              } else {
                boolean discarded$5 = jl.field_I.a(lf.field_c, ua.field_g, (byte) -121);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "m.D(" + 1 + ')');
        }
        return stackIn_22_0;
    }

    final int a(int param0, boolean param1) {
        if (!param1) {
            ((m) this).field_d = null;
        }
        if (!(null == ((m) this).field_d)) {
            param0 = (int)((long)((m) this).field_f * (long)param0 / (long)((m) this).field_c);
        }
        return param0;
    }

    public static void a(byte param0) {
        field_h = null;
        field_e = null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2, int param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            try {
              L0: {
                L1: {
                  if (he.field_o.startsWith("win")) {
                    if (!ue.a(param2, 0)) {
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
                {
                  L2: {
                    param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var4_ref;
                stackOut_8_1 = new StringBuilder().append("m.B(");
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
                  break L4;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L4;
                }
              }
              L5: {
                stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param2 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 46) {
            int discarded$0 = ((m) this).a(43, false);
        }
        if (!(null == ((m) this).field_d)) {
            param1 = (int)((long)((m) this).field_f * (long)param1 / (long)((m) this).field_c) + 6;
        }
        return param1;
    }

    final byte[] a(byte param0, byte[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        Object stackIn_3_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == 109) {
              L1: {
                if (null != ((m) this).field_d) {
                  var3_int = 14 + (int)((long)param1.length * (long)((m) this).field_f / (long)((m) this).field_c);
                  var20 = new int[var3_int];
                  var18 = var20;
                  var16 = var18;
                  var14 = var16;
                  var4 = var14;
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  L2: while (true) {
                    if (~param1.length >= ~var7) {
                      param1 = new byte[var3_int];
                      var12 = 0;
                      var7 = var12;
                      L3: while (true) {
                        if (var3_int <= var12) {
                          break L1;
                        } else {
                          L4: {
                            var8 = 32768 + var20[var12] >> 16;
                            if (var8 < -128) {
                              param1[var12] = (byte) -128;
                              break L4;
                            } else {
                              if (var8 <= 127) {
                                param1[var12] = (byte)var8;
                                break L4;
                              } else {
                                param1[var12] = (byte) 127;
                                break L4;
                              }
                            }
                          }
                          var12++;
                          continue L3;
                        }
                      }
                    } else {
                      var8 = param1[var7];
                      var19 = ((m) this).field_d[var6];
                      var10 = 0;
                      L5: while (true) {
                        if (14 <= var10) {
                          var6 = var6 + ((m) this).field_f;
                          var10 = var6 / ((m) this).field_c;
                          var5 = var5 + var10;
                          var6 = var6 - ((m) this).field_c * var10;
                          var7++;
                          continue L2;
                        } else {
                          var4[var10 + var5] = var4[var10 + var5] + var19[var10] * var8;
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_20_0 = (byte[]) param1;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("m.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    m(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param0 != param1) {
          var3 = ge.a(-1, param1, param0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((m) this).field_d = new int[param0][14];
          ((m) this).field_f = param1;
          ((m) this).field_c = param0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = ((m) this).field_d[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (-7.0 + var6));
                if (0 <= var8) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var8 >= var9) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = 3.141592653589793 * ((double)var8 - var6);
                      var14 = var10;
                      if (var12 < -0.0001) {
                        break L5;
                      } else {
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46);
                  var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Not enough time to fire";
        field_b = "Efficency";
        field_e = null;
        field_a = "Increase grenade number";
    }
}
