/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un extends ci {
    static String field_q;
    private int field_o;
    private int[] field_n;
    private int field_m;
    private int field_p;
    static int[] field_r;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            ((un) this).field_m = 111;
            break L0;
          }
        }
        L1: {
          var18 = ((un) this).field_i.a((byte) 113, param1);
          var3 = var18;
          if (!((un) this).field_i.field_d) {
            break L1;
          } else {
            var7 = ((un) this).field_o * ooa.field_g >> 12;
            var26 = ((un) this).c(0, -126, hba.field_b & -1 + param1);
            var9 = ((un) this).c(0, param0 ^ -36, param1);
            var25 = ((un) this).c(0, -116, param1 - -1 & hba.field_b);
            var11 = 0;
            L2: while (true) {
              if (var11 >= ns.field_g) {
                break L1;
              } else {
                L3: {
                  var12 = (var25[var11] + -var26[var11]) * var7 >> 12;
                  var13 = var7 * (var9[-1 + var11 & una.field_b] + -var9[una.field_b & var11 - -1]) >> 12;
                  var14 = var13 >> 4;
                  var15 = var12 >> 4;
                  if (var14 >= 0) {
                    break L3;
                  } else {
                    var14 = -var14;
                    break L3;
                  }
                }
                L4: {
                  if (0 > var15) {
                    var15 = -var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var14 <= 255) {
                    break L5;
                  } else {
                    var14 = 255;
                    break L5;
                  }
                }
                L6: {
                  if (var15 <= 255) {
                    break L6;
                  } else {
                    var15 = 255;
                    break L6;
                  }
                }
                var16 = 255 & pda.field_b[var14 - -(var15 * (1 + var15) >> 1)];
                var5 = var12 * var16 >> 8;
                var4 = var16 * var13 >> 8;
                var6 = var16 * 4096 >> 8;
                var6 = var6 * ((un) this).field_n[2] >> 12;
                var4 = ((un) this).field_n[0] * var4 >> 12;
                var5 = var5 * ((un) this).field_n[1] >> 12;
                var18[var11] = var6 + var4 - -var5;
                var11++;
                continue L2;
              }
            }
          }
        }
        return var18;
    }

    public un() {
        super(1, true);
        ((un) this).field_p = 3216;
        ((un) this).field_m = 3216;
        ((un) this).field_o = 4096;
        ((un) this).field_n = new int[3];
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (var4_int != 1) {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    ((un) this).field_m = param1.d(param0 + 20);
                    break L1;
                  }
                } else {
                  ((un) this).field_p = param1.d(123);
                  break L1;
                }
              } else {
                ((un) this).field_o = param1.d(param0 + 14);
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                int[] discarded$1 = ((un) this).c(24, 112);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("un.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    private final void c(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var2 = Math.cos((double)((float)((un) this).field_m / 4096.0f));
          ((un) this).field_n[0] = (int)(4096.0 * (Math.sin((double)((float)((un) this).field_p / 4096.0f)) * var2));
          ((un) this).field_n[1] = (int)(Math.cos((double)((float)((un) this).field_p / 4096.0f)) * var2 * 4096.0);
          ((un) this).field_n[2] = (int)(Math.sin((double)((float)((un) this).field_m / 4096.0f)) * 4096.0);
          var4 = ((un) this).field_n[0] * ((un) this).field_n[0] >> 12;
          var5 = ((un) this).field_n[1] * ((un) this).field_n[1] >> 12;
          var6 = ((un) this).field_n[2] * ((un) this).field_n[2] >> 12;
          var7 = (int)(Math.sqrt((double)(var6 + var4 + var5 >> 12)) * 4096.0);
          if (var7 == 0) {
            break L0;
          } else {
            ((un) this).field_n[0] = (((un) this).field_n[0] << 12) / var7;
            ((un) this).field_n[2] = (((un) this).field_n[2] << 12) / var7;
            ((un) this).field_n[1] = (((un) this).field_n[1] << 12) / var7;
            break L0;
          }
        }
    }

    final void b(byte param0) {
        if (param0 != 116) {
            return;
        }
        this.c(28427);
    }

    public static void a(boolean param0) {
        field_r = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Friends";
        field_r = new int[8192];
    }
}
