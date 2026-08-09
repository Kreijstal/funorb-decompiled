/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String field_b;
    static int field_e;
    static um field_h;
    static boolean field_f;
    static fo field_g;
    static int field_d;
    static int field_a;
    static boolean field_c;

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        bv var5 = null;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -29) {
                break L1;
              } else {
                se.a(93);
                break L1;
              }
            }
            var6 = (CharSequence) ((Object) param0);
            if (!hg.a((byte) -90, var6)) {
              stackIn_5_0 = bc.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!gt.a(param0, (byte) -114)) {
                if (2 == th.field_a) {
                  if (!si.a(param0, -3404)) {
                    if (-101 < (vg.field_p ^ -1)) {
                      if (!jj.a(89, param0)) {
                        var5 = vl.field_n;
                        var5.h(32161, param1);
                        var5.field_q = var5.field_q + 1;
                        var4 = var5.field_q;
                        var5.b(1, 2);
                        var5.b(param0, 13851);
                        var5.e(var5.field_q + -var4, 5930);
                        stackIn_22_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        stackIn_20_0 = fo.a(4800, ql.field_p, new String[]{param0});
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = wh.field_d;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = fo.a(4800, ts.field_k, new String[]{param0});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_11_0 = ct.field_m;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = am.field_F;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("se.A(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    return (String) ((Object) stackIn_22_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_f = false;
        }
        field_b = null;
        field_g = null;
        field_h = null;
    }

    final static wk[] a(byte param0) {
        wk[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = new wk[iw.field_n];
        var2 = 0;
        L0: while (true) {
          if (iw.field_n <= var2) {
            if (param0 == 32) {
              rj.d((byte) 101);
              return var1;
            } else {
              return (wk[]) null;
            }
          } else {
            var3 = c.field_e[var2] * qm.field_K[var2];
            var20 = vj.field_j[var2];
            if (ne.field_e[var2]) {
              var22 = cq.field_z[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L1: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (wk) ((Object) new nj(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var16));
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = oe.c(qv.field_j[rn.a((int) var20[var7], 255)], rn.a((int) var22[var7], 255) << -1607052648);
                  var7++;
                  continue L1;
                }
              }
            } else {
              var9 = new int[var3];
              var21 = var9;
              var6_int = 0;
              L2: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new wk(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var21);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = qv.field_j[rn.a(255, (int) var20[var6_int])];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        field_b = "Enter name of friend to delete from list";
        field_a = 480;
        field_c = false;
        field_f = false;
    }
}
