/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ng {
    static boolean field_b;
    static boolean[] field_a;

    final static tg[] a() {
        int var2 = 0;
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Bounce.field_N;
        tg[] var1 = new tg[nj.field_p];
        for (var2 = 0; var2 < nj.field_p; var2++) {
            var3 = qh.field_i[var2] * ih.field_V[var2];
            var10 = ph.field_c[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = he.field_k[da.b((int) var10[var6], 255)];
            }
            var1[var2] = new tg(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var11);
        }
        int discarded$0 = 122;
        vb.a();
        return var1;
    }

    final static boolean a(int param0) {
        return vd.field_b != null && vd.field_b.b((byte) 121);
    }

    abstract sb b(byte param0);

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == bl.field_e) {
              break L1;
            } else {
              if (bl.field_e.length >= param2) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          bl.field_e = new int[param2 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == sj.field_j) {
              break L3;
            } else {
              if (sj.field_j.length >= param2) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          sj.field_j = new int[2 * param2];
          break L2;
        }
        L4: {
          L5: {
            if (null == nh.field_S) {
              break L5;
            } else {
              if (param2 <= nh.field_S.length) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          nh.field_S = new int[param2 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (gk.field_i == null) {
              break L7;
            } else {
              if (gk.field_i.length < param2) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          gk.field_i = new int[2 * param2];
          break L6;
        }
        L8: {
          L9: {
            if (th.field_c == null) {
              break L9;
            } else {
              if (th.field_c.length < param2) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          th.field_c = new int[2 * param2];
          break L8;
        }
        L10: {
          L11: {
            if (null == ij.field_b) {
              break L11;
            } else {
              if (param2 <= ij.field_b.length) {
                break L10;
              } else {
                break L11;
              }
            }
          }
          ij.field_b = new int[2 * param2];
          break L10;
        }
        L12: {
          L13: {
            if (w.field_f == null) {
              break L13;
            } else {
              if (param1 + param2 > w.field_f.length) {
                break L13;
              } else {
                break L12;
              }
            }
          }
          w.field_f = new int[2 * (param2 - -param1)];
          break L12;
        }
        L14: {
          L15: {
            if (pg.field_a == null) {
              break L15;
            } else {
              if (pg.field_a.length >= param2) {
                break L14;
              } else {
                break L15;
              }
            }
          }
          pg.field_a = new boolean[param2 * 2];
          break L14;
        }
        mg.field_n = 2147483647;
        va.field_b = 2147483647;
        w.field_d = -2147483648;
        q.field_M = 0;
        uc.field_A = -2147483648;
    }

    abstract void a(boolean param0, wi param1);

    public static void b() {
        field_a = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_13_0 = 0;
        var5 = Bounce.field_N;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (md.a(106, param1)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var6 = a.field_b;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = nh.field_O;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param1 == var4) {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2_ref, "ng.D(" + -95 + ',' + param1 + ')');
        }
        return stackIn_24_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new boolean[112];
        field_b = false;
    }
}
