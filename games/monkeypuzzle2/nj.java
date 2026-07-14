/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_d;
    static int field_a;
    static String[] field_c;
    static int field_b;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_a = 96;
            break L0;
          }
        }
        L1: {
          if ((param1 ^ -1) != -101) {
            break L1;
          } else {
            if ((fd.field_r ^ -1) >= -1) {
              break L1;
            } else {
              fd.field_r = fd.field_r - 1;
              var2_ref_byte__ = wa.field_a[fd.field_r - 1];
              wa.field_a[fd.field_r] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if ((param1 ^ -1) != -5001) {
            break L2;
          } else {
            if (ak.field_r > 0) {
              ak.field_r = ak.field_r - 1;
              var2_ref_byte__ = hk.field_f[ak.field_r - 1];
              hk.field_f[ak.field_r] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if ((param1 ^ -1) != -30001) {
            break L3;
          } else {
            if (0 >= jg.field_lb) {
              break L3;
            } else {
              jg.field_lb = jg.field_lb - 1;
              var2_ref_byte__ = bl.field_k[jg.field_lb - 1];
              bl.field_k[jg.field_lb] = null;
              return var2_ref_byte__;
            }
          }
        }
        L4: {
          if (me.field_g == null) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= tf.field_c.length) {
                break L4;
              } else {
                if (tf.field_c[var2] == param1) {
                  if ((me.field_i[var2] ^ -1) < -1) {
                    me.field_i[var2] = me.field_i[var2] - 1;
                    var3 = me.field_g[var2][me.field_i[var2] - 1];
                    me.field_g[var2][me.field_i[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param1];
    }

    final static int a(boolean param0, int param1, String param2, String param3, boolean param4, int param5, String param6) {
        if (!param4) {
            byte[] discarded$0 = nj.a(-90, 124);
        }
        aj var7 = new aj(param3);
        aj var8 = new aj(param6);
        return qh.a(param5, var8, -1, param0, var7, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != -151) {
            field_c = null;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if ((uj.field_i ^ -1) > -1) {
          return;
        } else {
          L0: {
            var3 = param1 - 135;
            var4 = -35 + param2;
            var5 = 256;
            if ((uj.field_i ^ -1) <= -76) {
              break L0;
            } else {
              var5 = (uj.field_i << 148348328) / 75;
              break L0;
            }
          }
          L1: {
            if (param0 == -21639) {
              break L1;
            } else {
              field_c = null;
              break L1;
            }
          }
          L2: {
            if (uj.field_i <= 200) {
              break L2;
            } else {
              var5 = (-uj.field_i + 250 << -1629282392) / 50;
              break L2;
            }
          }
          L3: {
            mc.a(-8497, rj.field_H);
            ig.b();
            ge.d();
            ec.b(-128);
            if (-257 < (var5 ^ -1)) {
              ge.c(0, 0, ge.field_h, ge.field_g, 0, 256 - var5);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            tj.b(653);
            if ((uj.field_i ^ -1) <= -151) {
              ki.field_H.b(15 + var3, var4 + 10, var5);
              break L4;
            } else {
              rj.field_H.e(var3, var4);
              break L4;
            }
          }
          L5: {
            var6 = uj.field_i - 125;
            if (-1 <= (var6 ^ -1)) {
              break L5;
            } else {
              if (50 <= var6) {
                break L5;
              } else {
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  ca.field_f.c(var3, var4, var7);
                  break L5;
                } else {
                  if (var6 < 30) {
                    ca.field_f.c(var3, var4, 256);
                    break L5;
                  } else {
                    var7 = (50 - var6) * 256 / 20;
                    ca.field_f.c(var3, var4, var7);
                    break L5;
                  }
                }
              }
            }
          }
          L6: {
            var6 = -140 + uj.field_i;
            if (0 >= var6) {
              break L6;
            } else {
              L7: {
                var7 = 256;
                if ((var6 ^ -1) > -21) {
                  var7 = 256 * var6 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              dj.field_b.b(var3 - -15, 10 + var4, var5 * var7 >> 44628424);
              break L6;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_a = -1;
    }
}
