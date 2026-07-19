/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_g;
    private int field_i;
    private int[][] field_a;
    static tf field_f;
    static String field_c;
    static String field_b;
    static String field_d;
    static int field_e;
    private int field_h;
    static int field_j;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final int b(int param0, int param1) {
        if (param1 != 6) {
            field_g = (String) null;
        }
        if (!(this.field_a == null)) {
            param0 = (int)((long)param0 * (long)this.field_h / (long)this.field_i) + 6;
        }
        return param0;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param1) {
            vb.b(0, 0, vb.field_f, vb.field_b, 0, 192);
        } else {
            vb.c();
        }
        if (param2 != -102) {
            return;
        }
        pi.a(param1, false);
    }

    final int a(int param0, int param1) {
        int discarded$0 = 0;
        if (param0 != -128) {
            discarded$0 = this.b(23, -122);
        }
        if (!(null == this.field_a)) {
            param1 = (int)((long)param1 * (long)this.field_h / (long)this.field_i);
        }
        return param1;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        if (!param0) {
            ue.a(false);
        }
        field_g = null;
        field_d = null;
    }

    ue(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param1 != param0) {
          var3 = ic.a(param0, param1, -126);
          param0 = param0 / var3;
          param1 = param1 / var3;
          this.field_i = param0;
          this.field_a = new int[param0][14];
          this.field_h = param1;
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              return;
            } else {
              L1: {
                var5 = this.field_a[var4];
                var6 = 6.0 + (double)var4 / (double)param0;
                var8 = (int)Math.floor(var6 - 7.0 + 1.0);
                if (var8 >= 0) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if ((var9 ^ -1) >= -15) {
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
                      if (var12 < -0.0001) {
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
                  var14 = var14 * (Math.cos(0.2243994752564138 * (-var6 + (double)var8)) * 0.46 + 0.54);
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

    final byte[] a(int param0, byte[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -6 / ((param0 - -18) / 49);
              if (this.field_a == null) {
                break L1;
              } else {
                var4 = (int)((long)param1.length * (long)this.field_h / (long)this.field_i) + 14;
                var16 = new int[var4];
                var14 = var16;
                var5 = var14;
                var6 = 0;
                var7 = 0;
                var8 = 0;
                L2: while (true) {
                  if (param1.length <= var8) {
                    param1 = new byte[var4];
                    var12 = 0;
                    var8 = var12;
                    L3: while (true) {
                      if (var12 >= var4) {
                        break L1;
                      } else {
                        L4: {
                          var9 = var16[var12] - -32768 >> 1873540176;
                          if (-128 > var9) {
                            param1[var12] = (byte)-128;
                            break L4;
                          } else {
                            if (-128 <= (var9 ^ -1)) {
                              param1[var12] = (byte)var9;
                              break L4;
                            } else {
                              param1[var12] = (byte)127;
                              break L4;
                            }
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    var9 = param1[var8];
                    var18 = this.field_a[var7];
                    var11 = 0;
                    L5: while (true) {
                      if (-15 >= (var11 ^ -1)) {
                        var7 = var7 + this.field_h;
                        var11 = var7 / this.field_i;
                        var6 = var6 + var11;
                        var7 = var7 - this.field_i * var11;
                        var8++;
                        continue L2;
                      } else {
                        var5[var6 + var11] = var5[var6 + var11] + var9 * var18[var11];
                        var11++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            stackOut_15_0 = (byte[]) (param1);
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("ue.E(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    static {
        int var0 = 0;
        field_g = "Age:";
        field_c = "Click";
        field_b = "Friends can be added in multiplayer<nbsp>games";
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = 0;
        field_f = new tf();
        for (var0 = 0; var0 < 20; var0++) {
            field_f.a(-83, new me());
        }
        field_j = 250;
    }
}
