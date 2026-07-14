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
            var7 = ((un) this).field_o * ooa.field_g >> -1117378100;
            var26 = ((un) this).c(0, -126, hba.field_b & -1 + param1);
            var9 = ((un) this).c(0, param0 ^ -36, param1);
            var25 = ((un) this).c(0, -116, param1 - -1 & hba.field_b);
            var11 = 0;
            L2: while (true) {
              if (var11 >= ns.field_g) {
                break L1;
              } else {
                L3: {
                  var12 = (var25[var11] + -var26[var11]) * var7 >> -580672500;
                  var13 = var7 * (var9[-1 + var11 & una.field_b] + -var9[una.field_b & var11 - -1]) >> 1557055244;
                  var14 = var13 >> -577099804;
                  var15 = var12 >> 397617732;
                  if ((var14 ^ -1) <= -1) {
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
                  if ((var15 ^ -1) >= -256) {
                    break L6;
                  } else {
                    var15 = 255;
                    break L6;
                  }
                }
                var16 = 255 & pda.field_b[var14 - -(var15 * (1 + var15) >> 885331841)];
                var5 = var12 * var16 >> -1744199224;
                var4 = var16 * var13 >> 2065884872;
                var6 = var16 * 4096 >> 1171917128;
                var6 = var6 * ((un) this).field_n[2] >> -463689204;
                var4 = ((un) this).field_n[0] * var4 >> 1113290092;
                var5 = var5 * ((un) this).field_n[1] >> 989269644;
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
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          var4 = param2;
          if (var4 != 0) {
            if ((var4 ^ -1) != -2) {
              if (2 != var4) {
                break L0;
              } else {
                ((un) this).field_m = param1.d(param0 + 20);
                break L0;
              }
            } else {
              ((un) this).field_p = param1.d(123);
              break L0;
            }
          } else {
            ((un) this).field_o = param1.d(param0 + 14);
            break L0;
          }
        }
        L1: {
          if (param0 == 107) {
            break L1;
          } else {
            int[] discarded$1 = ((un) this).c(24, 112);
            break L1;
          }
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
          var4 = ((un) this).field_n[0] * ((un) this).field_n[0] >> -2115637396;
          var5 = ((un) this).field_n[1] * ((un) this).field_n[1] >> 885633420;
          var6 = ((un) this).field_n[2] * ((un) this).field_n[2] >> -1271222740;
          if (param0 == 28427) {
            break L0;
          } else {
            ((un) this).b((byte) -32);
            break L0;
          }
        }
        L1: {
          var7 = (int)(Math.sqrt((double)(var6 + var4 + var5 >> 291581964)) * 4096.0);
          if (var7 == 0) {
            break L1;
          } else {
            ((un) this).field_n[0] = (((un) this).field_n[0] << -2007394740) / var7;
            ((un) this).field_n[2] = (((un) this).field_n[2] << 555811276) / var7;
            ((un) this).field_n[1] = (((un) this).field_n[1] << -3381684) / var7;
            break L1;
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
        if (!param0) {
            return;
        }
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
