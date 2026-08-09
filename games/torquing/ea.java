/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends am {
    static int field_v;
    static String field_u;
    static int field_t;
    static String[] field_s;

    final static void a(boolean param0, byte param1, boolean param2) {
        String var4 = (String) null;
        vb.a(param0, (String) null, param2, 4805);
        if (param1 != 126) {
            ea.a(false, (byte) -96, true);
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[][] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        var12 = Torquing.field_u;
        var20 = this.field_r.a(15142, param1);
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (this.field_r.field_b) {
          var28 = this.c(24066, param1, 0);
          var29 = var28[0];
          var30 = var28[1];
          var31 = var28[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          var11 = 0;
          L0: while (true) {
            if (ci.field_c <= var11) {
              if (param0 != -29116) {
                return (int[][]) null;
              } else {
                return var3;
              }
            } else {
              var8[var11] = 4096 - var29[var11];
              var9[var11] = 4096 + -var30[var11];
              var10[var11] = -var31[var11] + 4096;
              var11++;
              continue L0;
            }
          }
        } else {
          if (param0 != -29116) {
            return (int[][]) null;
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
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        var6 = Torquing.field_u;
        var7 = this.field_l.a(param1, 25657);
        var3 = var7;
        if (this.field_l.field_b) {
          var4 = this.b(0, 0, param1);
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
        if (!param0) {
            field_t = 116;
            field_u = null;
            return;
        }
        field_u = null;
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-1 == (param2 ^ -1)) {
                L2: {
                  stackIn_4_0 = this;

                  if (-2 != (param0.i((byte) -101) ^ -1)) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                ((ea) (this)).field_p = stackIn_5_1 != 0;
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
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ea.H(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public ea() {
        super(1, false);
    }

    static {
        field_u = "Gyro<br>Press 'INS' or 'CTRL' to brake";
        field_s = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_v = -2147483648;
    }
}
