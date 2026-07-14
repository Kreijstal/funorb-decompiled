/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends am {
    static db field_s;
    private int field_t;
    private int field_u;
    private int field_v;

    final void a(byte param0) {
        if (param0 <= 123) {
            return;
        }
        ie.a(14837);
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var11 = Torquing.field_u;
          if (param0 > 86) {
            break L0;
          } else {
            field_s = null;
            break L0;
          }
        }
        var16 = ((sd) this).field_l.a(param1, 25657);
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (((sd) this).field_l.field_b) {
          var4 = dp.field_a[param1];
          var5 = -2048 + var4 >> -497498143;
          var6 = 0;
          L1: while (true) {
            if (ci.field_c > var6) {
              L2: {
                var8 = q.field_b[var6];
                var9 = var8 + -2048 >> 1606297889;
                if (((sd) this).field_v == 0) {
                  var7 = ((sd) this).field_u * (-var4 + var8);
                  break L2;
                } else {
                  var10 = var9 * var9 + var5 * var5 >> -119568564;
                  var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
                  var7 = (int)(3.141592653589793 * (double)(((sd) this).field_u * var7));
                  break L2;
                }
              }
              L3: {
                var7 = var7 - (var7 & -4096);
                if (((sd) this).field_t == 0) {
                  var7 = jh.field_x[(var7 & 4091) >> -1531317916] + 4096 >> 1488568801;
                  break L3;
                } else {
                  if (2 != ((sd) this).field_t) {
                    break L3;
                  } else {
                    L4: {
                      // wide iinc 7 -2048
                      if (-1 >= (var7 ^ -1)) {
                        break L4;
                      } else {
                        var7 = -var7;
                        break L4;
                      }
                    }
                    var7 = 2048 - var7 << -1805164319;
                    var16[var6] = var7;
                    var6++;
                    continue L1;
                  }
                }
              }
              var16[var6] = var7;
              var6++;
              continue L1;
            } else {
              return var12;
            }
          }
        } else {
          return var12;
        }
    }

    final static void a(rm param0, int param1, int param2) {
        int var3 = 0;
        byte[] var24 = null;
        byte[] var16 = null;
        byte[] var12 = null;
        byte[] var8 = null;
        byte[] var4 = null;
        short[] var25 = null;
        short[] var17 = null;
        short[] var13 = null;
        short[] var9 = null;
        short[] var5 = null;
        short[] var26 = null;
        short[] var18 = null;
        short[] var14 = null;
        short[] var10 = null;
        short[] var6 = null;
        short[] var27 = null;
        short[] var19 = null;
        short[] var15 = null;
        short[] var11 = null;
        short[] var7 = null;
        byte[] var28 = null;
        byte[] var20 = null;
        short[] var29 = null;
        short[] var21 = null;
        short[] var30 = null;
        short[] var22 = null;
        short[] var31 = null;
        short[] var23 = null;
        if (param2 != 0) {
            field_s = null;
            if (!(param0.field_u != null)) {
                param0.field_u = new short[param1];
                param0.field_n = new short[param1];
                param0.field_x = new short[param1];
                param0.field_s = new byte[param1];
                return;
            }
            if (!(param1 + param0.field_k < param0.field_u.length)) {
                var3 = (3 + 3 * param0.field_k) / 2;
                var24 = new byte[var3];
                var16 = var24;
                var12 = var16;
                var8 = var12;
                var4 = var8;
                var25 = new short[var3];
                var17 = var25;
                var13 = var17;
                var9 = var13;
                var5 = var9;
                var26 = new short[var3];
                var18 = var26;
                var14 = var18;
                var10 = var14;
                var6 = var10;
                var27 = new short[var3];
                var19 = var27;
                var15 = var19;
                var11 = var15;
                var7 = var11;
                dk.a(param0.field_s, 0, var24, 0, param0.field_k);
                dk.a(param0.field_u, 0, var25, 0, param0.field_k);
                dk.a(param0.field_n, 0, var26, 0, param0.field_k);
                dk.a(param0.field_x, 0, var27, 0, param0.field_k);
                param0.field_s = var4;
                param0.field_n = var6;
                param0.field_u = var5;
                param0.field_x = var7;
            }
            return;
        }
        if (!(param0.field_u != null)) {
            param0.field_u = new short[param1];
            param0.field_n = new short[param1];
            param0.field_x = new short[param1];
            param0.field_s = new byte[param1];
            return;
        }
        if (!(param1 + param0.field_k < param0.field_u.length)) {
            var3 = (3 + 3 * param0.field_k) / 2;
            var28 = new byte[var3];
            var20 = var28;
            var12 = var20;
            var8 = var12;
            var4 = var8;
            var29 = new short[var3];
            var21 = var29;
            var13 = var21;
            var9 = var13;
            var5 = var9;
            var30 = new short[var3];
            var22 = var30;
            var14 = var22;
            var10 = var14;
            var6 = var10;
            var31 = new short[var3];
            var23 = var31;
            var15 = var23;
            var11 = var15;
            var7 = var11;
            dk.a(param0.field_s, 0, var28, 0, param0.field_k);
            dk.a(param0.field_u, 0, var29, 0, param0.field_k);
            dk.a(param0.field_n, 0, var30, 0, param0.field_k);
            dk.a(param0.field_x, 0, var31, 0, param0.field_k);
            param0.field_s = var4;
            param0.field_n = var6;
            param0.field_u = var5;
            param0.field_x = var7;
        }
    }

    public static void g(byte param0) {
        int var1 = -127 / ((54 - param0) / 60);
        field_s = null;
    }

    public sd() {
        super(0, true);
        ((sd) this).field_t = 0;
        ((sd) this).field_u = 1;
        ((sd) this).field_v = 0;
    }

    final static la a(boolean param0, int param1, byte param2, int param3, boolean param4) {
        if (param2 > -62) {
            return null;
        }
        return hc.a(false, param0, param3, 8505, param4, param1);
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2) {
          L0: {
            boolean discarded$8 = sd.b(107);
            if (qk.field_q.c(484)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (qk.field_q.c(484)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        if (param1 == 35) {
          var4 = param2;
          if (0 != var4) {
            if (var4 != 1) {
              if (3 != var4) {
                return;
              } else {
                ((sd) this).field_u = param0.i((byte) -101);
                return;
              }
            } else {
              ((sd) this).field_t = param0.i((byte) -101);
              return;
            }
          } else {
            ((sd) this).field_v = param0.i((byte) -101);
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
