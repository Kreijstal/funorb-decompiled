/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static int[][] field_b;
    static String field_g;
    static int[] field_e;
    static di field_a;
    static int[] field_f;
    static ob[] field_c;
    static String[] field_d;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                  param0.getAppletContext().showDocument(p.a((byte) -83, var2, param0), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var2_ref2;
                stackOut_5_1 = new StringBuilder().append("s.A(");
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L1;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L1;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 2056898529 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        if (param1 < 86) {
          return -3;
        } else {
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param0 & ~var2;
        }
    }

    final static String a(ge param0, int param1, boolean param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          try {
            L0: {
              var3_int = param0.c((byte) -115);
              if (80 < var3_int) {
                var3_int = 80;
                break L0;
              } else {
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param0.field_v = param0.field_v + Pool.field_J.a((byte) 36, 0, param0.field_v, var4, param0.field_t, var3_int);
            var5 = tl.a(var3_int, -7510, var4, 0);
            stackOut_5_0 = (String) var5;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_7_0 = "Cabbage";
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("s.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 80 + ',' + true + ')');
        }
    }

    final static dj[] a(byte param0, sj param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        dj[] var4 = null;
        int var5 = 0;
        dj var6 = null;
        int var7 = 0;
        le var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        dj[] stackIn_3_0 = null;
        dj[] stackIn_10_0 = null;
        dj[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj[] stackOut_9_0 = null;
        dj[] stackOut_14_0 = null;
        dj[] stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            if (param1.a((byte) 110)) {
              var8 = param1.a(84);
              L1: while (true) {
                if (var8.field_f != 0) {
                  if (2 == var8.field_f) {
                    stackOut_9_0 = new dj[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var12 = (int[]) var8.field_e;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new dj[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackOut_14_0 = (dj[]) var4;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        var6 = new dj();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << 2];
                        var6.field_i = var3[(var5 << 2) - -1];
                        var6.field_d = var3[(var5 << 2) + 2];
                        var6.field_k = var3[(var5 << 2) + 3];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  cf.a(-123, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new dj[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("s.B(").append(-112).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    final static char a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param0 & 255;
        if (var2 != 0) {
          if (var2 >= 128) {
            if (var2 >= 160) {
              return (char)var2;
            } else {
              L0: {
                var3 = rf.field_a[-128 + var2];
                if (var3 == 0) {
                  var3 = 63;
                  break L0;
                } else {
                  break L0;
                }
              }
              var2 = var3;
              return (char)var2;
            }
          } else {
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_d = null;
        field_b = null;
    }

    final static int[] a(int param0, int param1) {
        int[] stackIn_7_0 = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_4_0 = null;
        int[] stackOut_1_0 = null;
        L0: {
          if (0 != param0) {
            if (param0 == 8) {
              stackOut_6_0 = bc.field_c;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              if (8 <= param0) {
                stackOut_5_0 = dq.field_i;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = v.field_a;
                stackIn_7_0 = stackOut_4_0;
                break L0;
              }
            }
          } else {
            stackOut_1_0 = jc.field_i;
            stackIn_7_0 = stackOut_1_0;
            break L0;
          }
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> has left the lobby.";
        field_c = new ob[25];
        field_e = new int[12];
        field_d = new String[]{"Turn time (seconds)", "Game", "Theme", "Guide"};
    }
}
