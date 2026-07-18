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
        mg[] var3 = new mg[9];
        mg[] var2 = var3;
        var3[4] = eg.a(64, (byte) 40, param1);
        return var2;
    }

    final static ck a(String[] args, int param1) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        ck stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new ck(false);
            var2.field_b = args;
            stackOut_0_0 = (ck) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("md.H(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (args == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 7655 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(int param0) {
        return true;
    }

    final static boolean a(boolean param0) {
        return null != he.field_Xb;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, bk param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              sb.field_b[0] = mc.field_c.nextInt();
              sb.field_b[1] = mc.field_c.nextInt();
              sb.field_b[2] = (int)(ph.field_i >> 32);
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
              if (param0) {
                gk.field_g.a(18, -122);
                break L1;
              } else {
                gk.field_g.a(16, 61);
                break L1;
              }
            }
            L2: {
              gk.field_g.field_l = gk.field_g.field_l + 2;
              var5_int = gk.field_g.field_l;
              gk.field_g.a(cj.field_c, (byte) -42);
              gk.field_g.a((byte) -30, vi.field_n);
              var6 = 0;
              if (!wg.field_c) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (!el.field_k) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (param2) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (mj.field_B != null) {
                var6 = var6 | 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              gk.field_g.a(var6, -114);
              var7 = sh.b(-88, mb.g((byte) -80));
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              gk.field_g.a(var7, (byte) -63);
              if (null != mj.field_B) {
                gk.field_g.b(mj.field_B, (byte) 127);
                break L7;
              } else {
                break L7;
              }
            }
            nl.a(on.field_a, gg.field_D, (jc) (Object) gk.field_g, ch.field_i, 0);
            gk.field_g.c(-var5_int + gk.field_g.field_l, -3991);
            al.b(-1, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("md.C(").append(param0).append(',').append(0).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_c = null;
        field_e = null;
        field_g = null;
        int var1 = 0;
        field_h = null;
    }

    final static aj a(byte param0) {
        if (vf.field_f == null) {
          vf.field_f = new aj(dk.field_j, 20, 0, 0, 0, 11579568, -1, 0, 0, dk.field_j.field_H, -1, 2147483647, true);
          return vf.field_f;
        } else {
          return vf.field_f;
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var3 = (((md) this).field_f.length >> 1) - 1;
        var4 = param1 & var3;
        if (param0) {
          L0: while (true) {
            var5 = ((md) this).field_f[var4 + (var4 - -1)];
            if (var5 != -1) {
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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (param0.length + (param0.length >> 1) < var2_int) {
                ((md) this).field_f = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = -1 + var2_int & param0[var3];
                        L4: while (true) {
                          if (((md) this).field_f[1 + var4 + var4] == -1) {
                            ((md) this).field_f[var4 + var4] = param0[var3];
                            ((md) this).field_f[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int - 1 & var4 + 1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((md) this).field_f[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("md.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
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
