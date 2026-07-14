/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends qc {
    private int field_j;
    private int field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        ((gd) this).field_k = ((gd) this).field_k + param3;
        if (param0) {
          ((gd) this).field_k = -18;
          ((gd) this).field_j = ((gd) this).field_j + 1;
          ph.a(1, (byte) 107, param1, param4);
          return (f) (Object) new aj(bm.field_g);
        } else {
          ((gd) this).field_j = ((gd) this).field_j + 1;
          ph.a(1, (byte) 107, param1, param4);
          return (f) (Object) new aj(bm.field_g);
        }
    }

    final int a(byte param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -53) {
          L0: {
            ((gd) this).field_k = -26;
            if (param1) {
              stackOut_7_0 = 24;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = super.a((byte) -105, param1);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1) {
              stackOut_3_0 = 24;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = super.a((byte) -105, param1);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        pd.field_g[param1] = pd.field_g[param1] + param2 * 1;
        if (!param0) {
            Object var6 = null;
            f discarded$0 = ((gd) this).a(false, -91, -128, -80, (ta) null);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        Object var3 = null;
        if (param0 != 127) {
          L0: {
            var3 = null;
            String discarded$2 = gd.a((byte) 51, (CharSequence) null);
            var2 = ni.a(37, ck.a((byte) 95, param1));
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = ni.a(37, ck.a((byte) 95, param1));
            if (var2 == null) {
              var2 = "";
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        var9 = CrazyCrystals.field_B;
        var11 = new char[param3];
        var10 = var11;
        var4 = var10;
        var5 = 0;
        if (param0 < 3) {
          return null;
        } else {
          var6 = 0;
          L0: while (true) {
            if (param3 <= var6) {
              return new String(var11, 0, var5);
            } else {
              var7 = 255 & param1[param2 + var6];
              if (-1 != (var7 ^ -1)) {
                L1: {
                  if (128 > var7) {
                    break L1;
                  } else {
                    if ((var7 ^ -1) <= -161) {
                      break L1;
                    } else {
                      L2: {
                        var8 = tg.field_d[var7 - 128];
                        if (0 == var8) {
                          var8 = 63;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    }
                  }
                }
                var5++;
                var4[var5] = (char)var7;
                var6++;
                var6++;
                continue L0;
              } else {
                var6++;
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(byte param0) {
        tb.field_d.a(jm.field_k, (int)(Math.random() * 11.0) + 95, 12 * (gi.field_m * ((gd) this).field_j), ((gd) this).field_k / ((gd) this).field_j);
        int var2 = 14 / ((param0 - 29) / 42);
        ((gd) this).field_j = 0;
        ((gd) this).field_k = 0;
    }

    final static java.awt.Canvas c(int param0) {
        if (param0 != 128) {
            return null;
        }
        return (java.awt.Canvas) (ph.field_E == null ? jd.field_D : ph.field_E);
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            return null;
        }
        return (pb) (Object) new uk();
    }

    gd() {
        ((gd) this).field_k = 0;
        ((gd) this).field_j = 0;
    }

    static {
    }
}
