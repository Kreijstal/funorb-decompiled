/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static int field_b;
    private int field_g;
    private int[][] field_e;
    static te field_d;
    private int field_f;
    static int field_a;
    static int field_c;

    public static void a(byte param0) {
        int var1 = -60 % ((0 - param0) / 62);
        field_d = null;
    }

    final int a(int param0, int param1) {
        if (!(((o) this).field_e == null)) {
            param0 = (int)((long)((o) this).field_g * (long)param0 / (long)((o) this).field_f);
        }
        if (param1 >= -70) {
            Object var4 = null;
            byte[] discarded$0 = ((o) this).a(true, (byte[]) null);
        }
        return param0;
    }

    final static le[] a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        le[] var1 = new le[eg.field_c];
        for (var2 = 0; var2 < eg.field_c; var2++) {
            var3 = ra.field_ab[var2] * da.field_c[var2];
            var4 = cb.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = fk.field_d[ch.a((int) var4[var6], 255)];
            }
            var1[var2] = new le(nj.field_d, qk.field_a, qc.field_P[var2], mb.field_b[var2], da.field_c[var2], ra.field_ab[var2], var5);
        }
        gb.a(-85);
        if (!param0) {
            return null;
        }
        return var1;
    }

    final int a(int param0, byte param1) {
        if (!(null == ((o) this).field_e)) {
            param0 = 6 - -(int)((long)((o) this).field_g * (long)param0 / (long)((o) this).field_f);
        }
        if (param1 <= 20) {
            field_b = -31;
        }
        return param0;
    }

    final byte[] a(boolean param0, byte[] param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        L0: {
          var11 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            var12 = null;
            byte[] discarded$1 = ((o) this).a(false, (byte[]) null);
            break L0;
          }
        }
        L1: {
          if (null == ((o) this).field_e) {
            break L1;
          } else {
            var3 = 14 + (int)((long)((o) this).field_g * (long)param1.length / (long)((o) this).field_f);
            var21 = new int[var3];
            var19 = var21;
            var17 = var19;
            var15 = var17;
            var4 = var15;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= param1.length) {
                param1 = new byte[var3];
                var13 = 0;
                var7 = var13;
                L3: while (true) {
                  if (var3 <= var13) {
                    break L1;
                  } else {
                    var8 = 32768 + var21[var13] >> 1514084656;
                    if (127 < (var8 ^ -1)) {
                      param1[var13] = (byte)-128;
                      var13++;
                      continue L3;
                    } else {
                      if (127 < var8) {
                        param1[var13] = (byte)127;
                        var13++;
                        continue L3;
                      } else {
                        param1[var13] = (byte)var8;
                        var13++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var8 = param1[var7];
                var20 = ((o) this).field_e[var6];
                var10 = 0;
                L4: while (true) {
                  if (-15 >= (var10 ^ -1)) {
                    var6 = var6 + ((o) this).field_g;
                    var10 = var6 / ((o) this).field_f;
                    var6 = var6 - ((o) this).field_f * var10;
                    var5 = var5 + var10;
                    var7++;
                    continue L2;
                  } else {
                    var4[var10 + var5] = var4[var10 + var5] + var8 * var20[var10];
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        return param1;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        if (!param1) {
            return;
        }
        param0.addMouseListener((java.awt.event.MouseListener) (Object) we.field_n);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) we.field_n);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) we.field_n);
    }

    final static de a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        de var5 = (de) (Object) qa.field_d.a((byte) -117);
        int var6 = -26 / ((11 - param4) / 54);
        while (var5 != null) {
            if (param0 == var5.field_k) {
                return var5;
            }
            var5 = (de) (Object) qa.field_d.d((byte) 63);
        }
        de var5_ref = new de();
        var5_ref.field_e = param3;
        var5_ref.field_h = param1;
        var5_ref.field_k = param0;
        qa.field_d.a(-8212, (ug) (Object) var5_ref);
        w.a(-95, param2, var5_ref);
        return var5_ref;
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 != 76) {
            return null;
        }
        return gf.field_b.a(param1, "", 62);
    }

    o(int param0, int param1) {
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
          var3 = ed.a(param0, param1, 0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((o) this).field_g = param1;
          ((o) this).field_f = param0;
          ((o) this).field_e = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
            } else {
              L1: {
                var5 = ((o) this).field_e[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (var6 - 7.0));
                if (var8 <= -1) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if (-15 >= var9) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
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
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.46 * Math.cos(0.2243994752564138 * (-var6 + (double)var8)) + 0.54);
                  var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_d = new te(10, 2, 2, 0);
    }
}
