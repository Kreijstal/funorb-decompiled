/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends bw {
    long field_f;
    int field_i;
    byte[] field_h;
    static wba field_g;
    static String field_j;
    static int field_k;

    final static kv a(kv param0, byte param1) {
        if (param1 != 112) {
            bs.a(-13);
        }
        kv var2 = new kv(param0.field_n, param0.field_o);
        var2.b();
        param0.c(0, 0, 65793);
        hga.field_U.a((byte) 14);
        return var2;
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        if (param0 < 88) {
            Object var2 = null;
            kv discarded$0 = bs.a((kv) null, (byte) -55);
        }
    }

    final static void c(byte param0) {
        int[] var1 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        var4 = BachelorFridge.field_y;
        if (!dma.field_a) {
          L0: {
            if (dma.field_a) {
              break L0;
            } else {
              if (null == vla.field_x) {
                vla.field_x = cn.a((byte) -68, 4);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (dma.field_a) {
              break L1;
            } else {
              if (vla.field_x.field_j) {
                var19 = sg.field_q;
                var15 = var19;
                var13 = var15;
                var11 = var13;
                var6 = var11;
                var1 = var6;
                var20 = vla.field_x.field_m;
                var3 = 0;
                L2: while (true) {
                  if ((var3 ^ -1) <= -9) {
                    var21 = nga.field_i;
                    var17 = var21;
                    var14 = var17;
                    var12 = var14;
                    var8 = var12;
                    var1 = var8;
                    var22 = vla.field_x.field_m;
                    var10 = 0;
                    var3 = var10;
                    L3: while (true) {
                      if ((var10 ^ -1) <= -9) {
                        dma.field_a = true;
                        vla.field_x = null;
                        break L1;
                      } else {
                        var8[var10] = dda.a(var21[var10], var22[var10] ^ -1);
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var6[var3] = mp.a(var19[var3], var20[var3]);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          L4: {
            if (param0 <= -106) {
              break L4;
            } else {
              var5 = null;
              kv discarded$1 = bs.a((kv) null, (byte) 34);
              break L4;
            }
          }
          L5: {
            if (!dma.field_a) {
              break L5;
            } else {
              of.b(115);
              dca.d(-122);
              if (-9 != (iba.field_s ^ -1)) {
                break L5;
              } else {
                if (hs.a(false, nga.field_i)) {
                  break L5;
                } else {
                  lg.a(true, 0, false);
                  break L5;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    bs(long param0, int param1, byte[] param2) {
        ((bs) this).field_h = param2;
        ((bs) this).field_f = param0;
        ((bs) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new wba(3);
        field_j = "Name";
        field_k = 256;
    }
}
