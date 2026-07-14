/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qv extends ci {
    private int field_q;
    private int field_n;
    private int field_p;
    private int field_r;
    static int field_m;
    static kb field_o;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            int[] discarded$1 = ((qv) this).c(94, -103);
            break L0;
          }
        }
        L1: {
          var15 = ((qv) this).field_i.a((byte) 20, param1);
          var3 = var15;
          if (!((qv) this).field_i.field_d) {
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= ns.field_g) {
                break L1;
              } else {
                var5 = (ht.field_Fb[var4] << 1898795372) / ((qv) this).field_q + ((qv) this).field_n;
                var6 = (sj.field_b[param1] << 155959180) / ((qv) this).field_q + ((qv) this).field_p;
                var7 = var5;
                var8 = var6;
                var9 = var5;
                var10 = var6;
                var11 = var5 * var5 >> 378726476;
                var12 = var6 * var6 >> 1320982476;
                var13 = 0;
                L3: while (true) {
                  L4: {
                    if (16384 <= var12 + var11) {
                      break L4;
                    } else {
                      if (((qv) this).field_r <= var13) {
                        break L4;
                      } else {
                        var10 = 2 * (var9 * var10 >> 156095276) - -var8;
                        var9 = var7 + var11 - var12;
                        var11 = var9 * var9 >> 1229981932;
                        var12 = var10 * var10 >> 1074359500;
                        var13++;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    stackOut_9_0 = (int[]) var15;
                    stackOut_9_1 = var4;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (((qv) this).field_r - 1 <= var13) {
                      stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L5;
                    } else {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = (var13 << -538468084) / ((qv) this).field_r;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L5;
                    }
                  }
                  stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var15;
    }

    final static int[][] a(boolean param0, int param1, int param2, float param3, int param4, byte param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        if (param5 >= -46) {
            field_m = -82;
        }
        int[][] var15 = new int[param8][param4];
        int[][] var14 = var15;
        int[][] var13 = var14;
        int[][] var9 = var13;
        lva var10 = new lva();
        var10.field_x = (int)(param3 * 4096.0f);
        var10.field_n = param2;
        var10.field_s = param0 ? true : false;
        var10.field_w = param7;
        var10.field_u = param6;
        var10.b((byte) 116);
        uta.a(0, param8, param4);
        for (var11 = 0; var11 < param8; var11++) {
            var10.a(var15[var11], -1, var11);
        }
        return var9;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 == 107) {
          L0: {
            var4 = param2;
            if (-1 != var4) {
              if (1 == var4) {
                ((qv) this).field_r = param1.d(121);
                break L0;
              } else {
                if (-3 == var4) {
                  ((qv) this).field_n = param1.d(124);
                  break L0;
                } else {
                  if (3 == var4) {
                    ((qv) this).field_p = param1.d(121);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              ((qv) this).field_q = param1.d(param0 + 16);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
            int[][] discarded$0 = qv.a(false, 72, -128, 0.8583102226257324f, -87, (byte) 7, -60, -76, -111);
        }
    }

    public qv() {
        super(0, true);
        ((qv) this).field_q = 1365;
        ((qv) this).field_n = 0;
        ((qv) this).field_p = 0;
        ((qv) this).field_r = 20;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = null;
    }
}
