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
            field_g = null;
        }
        if (!(((ue) this).field_a == null)) {
            param0 = (int)((long)param0 * (long)((ue) this).field_h / (long)((ue) this).field_i) + 6;
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
        if (param0 != -128) {
            int discarded$0 = ((ue) this).b(23, -122);
        }
        if (!(null == ((ue) this).field_a)) {
            param1 = (int)((long)param1 * (long)((ue) this).field_h / (long)((ue) this).field_i);
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
          ((ue) this).field_i = param0;
          ((ue) this).field_a = new int[param0][14];
          ((ue) this).field_h = param1;
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
            } else {
              L1: {
                var5 = ((ue) this).field_a[var4];
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
        }
    }

    final byte[] a(int param0, byte[] param1) {
        int var3 = 0;
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
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var3 = -6 / ((param0 - -18) / 49);
          if (((ue) this).field_a == null) {
            break L0;
          } else {
            var4 = (int)((long)param1.length * (long)((ue) this).field_h / (long)((ue) this).field_i) + 14;
            var20 = new int[var4];
            var18 = var20;
            var16 = var18;
            var14 = var16;
            var5 = var14;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (param1.length <= var8) {
                param1 = new byte[var4];
                var12 = 0;
                var8 = var12;
                L2: while (true) {
                  if (var12 >= var4) {
                    break L0;
                  } else {
                    var9 = var20[var12] - -32768 >> 1873540176;
                    if (-128 > var9) {
                      param1[var12] = (byte)-128;
                      var12++;
                      continue L2;
                    } else {
                      if (-128 <= (var9 ^ -1)) {
                        param1[var12] = (byte)var9;
                        var12++;
                        continue L2;
                      } else {
                        param1[var12] = (byte)127;
                        var12++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var9 = param1[var8];
                var19 = ((ue) this).field_a[var7];
                var11 = 0;
                L3: while (true) {
                  if (-15 >= (var11 ^ -1)) {
                    var7 = var7 + ((ue) this).field_h;
                    var11 = var7 / ((ue) this).field_i;
                    var6 = var6 + var11;
                    var7 = var7 - ((ue) this).field_i * var11;
                    var8++;
                    continue L1;
                  } else {
                    var5[var6 + var11] = var5[var6 + var11] + var9 * var19[var11];
                    var11++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_g = "Age:";
        field_c = "Click";
        field_b = "Friends can be added in multiplayer<nbsp>games";
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = 0;
        field_f = new tf();
        for (var0 = 0; var0 < 20; var0++) {
            field_f.a(-83, (hf) (Object) new me());
        }
        field_j = 250;
    }
}
