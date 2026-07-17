/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends am {
    static int field_v;
    static String field_u;
    static int field_t;
    static String[] field_s;

    final static void a(boolean param0, byte param1, boolean param2) {
        Object var4 = null;
        vb.a(param0, (String) null, param2, 4805);
        if (param1 != 126) {
            ea.a(false, (byte) -96, true);
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[][] var20 = null;
        int[][] var25 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        var12 = Torquing.field_u;
        var30 = ((ea) this).field_r.a(15142, param1);
        var25 = var30;
        var20 = var25;
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (((ea) this).field_r.field_b) {
          var29 = ((ea) this).c(24066, param1, 0);
          var31 = var29[0];
          var32 = var29[1];
          var33 = var29[2];
          var8 = var30[0];
          var9 = var30[1];
          var10 = var30[2];
          var11 = 0;
          L0: while (true) {
            if (ci.field_c <= var11) {
              if (param0 != -29116) {
                return null;
              } else {
                return var3;
              }
            } else {
              var8[var11] = 4096 - var31[var11];
              var9[var11] = 4096 + -var32[var11];
              var10[var11] = -var33[var11] + 4096;
              var11++;
              continue L0;
            }
          }
        } else {
          if (param0 != -29116) {
            return null;
          } else {
            return var3;
          }
        }
    }

    final static void b(int param0, int param1) {
        if (param1 == of.field_m) {
          return;
        } else {
          of.field_m = param1;
          if (vd.field_c == null) {
            if (param0 > -11) {
              ea.b(-97, 25);
              return;
            } else {
              return;
            }
          } else {
            vd.field_c.a(64 * param1 / 160);
            if (param0 <= -11) {
              return;
            } else {
              ea.b(-97, 25);
              return;
            }
          }
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = Torquing.field_u;
        var7 = ((ea) this).field_l.a(param1, 25657);
        var3 = var7;
        if (((ea) this).field_l.field_b) {
          var4 = ((ea) this).b(0, 0, param1);
          var5 = 0;
          L0: while (true) {
            if (ci.field_c > var5) {
              var7[var5] = -var4[var5] + 4096;
              var5++;
              continue L0;
            } else {
              if (param0 <= 86) {
                field_v = 42;
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          if (param0 <= 86) {
            field_v = 42;
            return var3;
          } else {
            return var3;
          }
        }
    }

    public static void a(boolean param0) {
        field_s = null;
        field_u = null;
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param0.i((byte) -101) != 1) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((ea) this).field_p = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == 35) {
              break L0;
            } else {
              ea.b(-102, -67);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ea.H(");
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public ea() {
        super(1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Gyro<br>Press 'INS' or 'CTRL' to brake";
        field_s = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_v = -2147483648;
    }
}
