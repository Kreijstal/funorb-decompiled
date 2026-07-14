/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static int field_b;
    static byte[][] field_g;
    static String field_c;
    private int[] field_f;
    static long field_a;
    static dj field_e;
    static boolean field_d;
    static vc field_i;
    static eh field_h;

    final static mg[] a(boolean param0, int param1) {
        mg[] var2 = null;
        mg[] var3 = null;
        if (!param0) {
          boolean discarded$2 = md.a(2);
          var3 = new mg[9];
          var2 = var3;
          var3[4] = eg.a(64, (byte) 40, param1);
          return var2;
        } else {
          var3 = new mg[9];
          var2 = var3;
          var3[4] = eg.a(64, (byte) 40, param1);
          return var2;
        }
    }

    final static ck a(String[] args, int param1) {
        ck var2 = null;
        if (param1 != 7655) {
          aj discarded$2 = md.a((byte) -70);
          var2 = new ck(false);
          var2.field_b = args;
          return var2;
        } else {
          var2 = new ck(false);
          var2.field_b = args;
          return var2;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 11265) {
            aj discarded$0 = md.a((byte) -50);
            return true;
        }
        return true;
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            mg[] discarded$11 = md.a(true, 11);
            if (null == he.field_Xb) {
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
            if (null == he.field_Xb) {
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

    final static void a(boolean param0, int param1, boolean param2, int param3, bk param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        sb.field_b[0] = mc.field_c.nextInt();
        sb.field_b[1] = mc.field_c.nextInt();
        sb.field_b[2] = (int)(ph.field_i >> -876140064);
        sb.field_b[3] = (int)ph.field_i;
        gg.field_D.field_l = 0;
        gg.field_D.a(sb.field_b[0], (byte) -42);
        gg.field_D.a(sb.field_b[1], (byte) -42);
        gg.field_D.a(sb.field_b[2], (byte) -42);
        gg.field_D.a(sb.field_b[3], (byte) -42);
        kl.a(gg.field_D, (byte) 111);
        gg.field_D.a((byte) -126, param3);
        param4.a(false, gg.field_D);
        gk.field_g.field_l = 0;
        if (!param0) {
          L0: {
            gk.field_g.a(16, 61);
            gk.field_g.field_l = gk.field_g.field_l + 2;
            var5 = gk.field_g.field_l;
            gk.field_g.a(cj.field_c, (byte) -42);
            gk.field_g.a((byte) -30, vi.field_n);
            var6 = 0;
            if (!wg.field_c) {
              break L0;
            } else {
              var6 = var6 | 1;
              break L0;
            }
          }
          L1: {
            if (!el.field_k) {
              break L1;
            } else {
              var6 = var6 | 4;
              break L1;
            }
          }
          L2: {
            if (param2) {
              var6 = var6 | 8;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (mj.field_B != null) {
              var6 = var6 | 16;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            gk.field_g.a(var6, -114);
            var7 = sh.b(-88, mb.g((byte) -80));
            if (var7 == null) {
              var7 = "";
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            gk.field_g.a(var7, (byte) -63);
            if (null != mj.field_B) {
              gk.field_g.b(mj.field_B, (byte) 127);
              break L5;
            } else {
              break L5;
            }
          }
          nl.a(on.field_a, gg.field_D, (jc) (Object) gk.field_g, ch.field_i, param1);
          gk.field_g.c(-var5 + gk.field_g.field_l, -3991);
          al.b(param1 ^ -1, -1);
          return;
        } else {
          L6: {
            gk.field_g.a(18, param1 ^ -122);
            gk.field_g.field_l = gk.field_g.field_l + 2;
            var5 = gk.field_g.field_l;
            gk.field_g.a(cj.field_c, (byte) -42);
            gk.field_g.a((byte) -30, vi.field_n);
            var6 = 0;
            if (!wg.field_c) {
              break L6;
            } else {
              var6 = var6 | 1;
              break L6;
            }
          }
          L7: {
            if (!el.field_k) {
              break L7;
            } else {
              var6 = var6 | 4;
              break L7;
            }
          }
          L8: {
            if (param2) {
              var6 = var6 | 8;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (mj.field_B != null) {
              var6 = var6 | 16;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            gk.field_g.a(var6, -114);
            var7 = sh.b(-88, mb.g((byte) -80));
            if (var7 == null) {
              var7 = "";
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            gk.field_g.a(var7, (byte) -63);
            if (null != mj.field_B) {
              gk.field_g.b(mj.field_B, (byte) 127);
              break L11;
            } else {
              break L11;
            }
          }
          nl.a(on.field_a, gg.field_D, (jc) (Object) gk.field_g, ch.field_i, param1);
          gk.field_g.c(-var5 + gk.field_g.field_l, -3991);
          al.b(param1 ^ -1, -1);
          return;
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_c = null;
        field_e = null;
        field_g = null;
        int var1 = 80 % ((param0 - 9) / 34);
        field_h = null;
    }

    final static aj a(byte param0) {
        Object var2 = null;
        if (vf.field_f != null) {
          if (param0 > -102) {
            var2 = null;
            md.a(false, -13, true, -83, (bk) null);
            return vf.field_f;
          } else {
            return vf.field_f;
          }
        } else {
          vf.field_f = new aj(dk.field_j, 20, 0, 0, 0, 11579568, -1, 0, 0, dk.field_j.field_H, -1, 2147483647, true);
          if (param0 <= -102) {
            return vf.field_f;
          } else {
            var2 = null;
            md.a(false, -13, true, -83, (bk) null);
            return vf.field_f;
          }
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var3 = (((md) this).field_f.length >> 657014785) - 1;
        var4 = param1 & var3;
        if (param0) {
          L0: while (true) {
            var5 = ((md) this).field_f[var4 + (var4 - -1)];
            if ((var5 ^ -1) != 0) {
              if (((md) this).field_f[var4 + var4] != param1) {
                var4 = var3 & var4 - -1;
                continue L0;
              } else {
                return var5;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -35;
        }
    }

    md(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if (param0.length + (param0.length >> -411620959) < var2) {
            ((md) this).field_f = new int[var2 + var2];
            var3 = 0;
            L1: while (true) {
              if (var2 + var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length > var3) {
                    var4 = -1 + var2 & param0[var3];
                    L3: while (true) {
                      if ((((md) this).field_f[1 + var4 + var4] ^ -1) == 0) {
                        ((md) this).field_f[var4 + var4] = param0[var3];
                        ((md) this).field_f[1 + var4 + var4] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = var2 - 1 & var4 + 1;
                        continue L3;
                      }
                    }
                  } else {
                  }
                }
              } else {
                ((md) this).field_f[var3] = -1;
                var3++;
                continue L1;
              }
            }
          } else {
            var2 = var2 << 1;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_c = "Continue";
        field_d = false;
    }
}
