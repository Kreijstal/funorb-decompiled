/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static String field_a;
    static String field_f;
    private int field_c;
    static String field_d;
    private int field_e;
    static boolean field_g;
    private int[][] field_b;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_f = null;
    }

    final int a(int param0, int param1) {
        if (param1 != 6) {
            return 61;
        }
        if (!(null == ((u) this).field_b)) {
            param0 = 6 - -(int)((long)param0 * (long)((u) this).field_c / (long)((u) this).field_e);
        }
        return param0;
    }

    final static void a() {
        kb.b(808);
        oh.a(100, 4);
    }

    final byte[] a(byte[] param0, boolean param1) {
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
        Object stackIn_18_0 = null;
        byte[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_19_0 = null;
        Object stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (((u) this).field_b == null) {
                break L1;
              } else {
                var3_int = 14 + (int)((long)param0.length * (long)((u) this).field_c / (long)((u) this).field_e);
                var20 = new int[var3_int];
                var18 = var20;
                var16 = var18;
                var14 = var16;
                var4 = var14;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if (param0.length <= var7) {
                    param0 = new byte[var3_int];
                    var12 = 0;
                    var7 = var12;
                    L3: while (true) {
                      if (var3_int <= var12) {
                        break L1;
                      } else {
                        L4: {
                          var8 = var20[var12] + 32768 >> 16;
                          if (var8 < -128) {
                            param0[var12] = (byte) -128;
                            break L4;
                          } else {
                            if (127 >= var8) {
                              param0[var12] = (byte)var8;
                              break L4;
                            } else {
                              param0[var12] = (byte) 127;
                              break L4;
                            }
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    var8 = param0[var7];
                    var19 = ((u) this).field_b[var6];
                    var10 = 0;
                    L5: while (true) {
                      if (14 <= var10) {
                        var6 = var6 + ((u) this).field_c;
                        var10 = var6 / ((u) this).field_e;
                        var5 = var5 + var10;
                        var6 = var6 - ((u) this).field_e * var10;
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
              }
            }
            if (param1) {
              stackOut_19_0 = (byte[]) param0;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              stackOut_17_0 = null;
              stackIn_18_0 = stackOut_17_0;
              return (byte[]) (Object) stackIn_18_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("u.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_20_0;
    }

    u(int param0, int param1) {
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
          var3 = ed.a(param0, (byte) -104, param1);
          param0 = param0 / var3;
          param1 = param1 / var3;
          ((u) this).field_c = param1;
          ((u) this).field_b = new int[param0][14];
          ((u) this).field_e = param0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = ((u) this).field_b[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (-7.0 + var6));
                if (var8 >= 0) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if (14 >= var9) {
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
                      var12 = ((double)var8 - var6) * 3.141592653589793;
                      var14 = var10;
                      if (-0.0001 > var12) {
                        break L5;
                      } else {
                        if (0.0001 >= var12) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + 0.46 * Math.cos(0.2243994752564138 * (-var6 + (double)var8)));
                  var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
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

    final static tg a(int param0, gk param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (c.a(param1, false, param3, param2)) {
            int discarded$2 = 1;
            return ne.a();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("u.A(").append(0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        if (((u) this).field_b != null) {
            param1 = (int)((long)param1 * (long)((u) this).field_c / (long)((u) this).field_e);
        }
        if (param0) {
            return -13;
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Player 1";
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
