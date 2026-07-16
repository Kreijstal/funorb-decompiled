/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends am {
    static t[] field_t;
    static sm[] field_s;
    private kj[] field_v;
    static String field_u;

    final static void b(int param0) {
        if (!(on.b(160))) {
            return;
        }
        if (param0 != -23658) {
            field_u = null;
        }
        ka.a(4, false, (byte) -53);
    }

    final static boolean h(byte param0) {
        if (param0 < 51) {
            return true;
        }
        return true;
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = ((s) this).field_l.a(param1, 25657);
        int[] var3 = var4;
        if (!(!((s) this).field_l.field_b)) {
            this.a(((s) this).field_l.a(0), -1);
        }
        if (param0 < 86) {
            return null;
        }
        return var4;
    }

    public s() {
        super(0, true);
    }

    public static void g(byte param0) {
        if (param0 != -73) {
            return;
        }
        field_s = null;
        field_t = null;
        field_u = null;
    }

    private final void a(int[][] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        kj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Torquing.field_u;
        var3 = ci.field_c;
        if (param1 == -1) {
          L0: {
            var4 = um.field_o;
            nn.a(param0, (byte) -114);
            om.a(0, 0, jh.field_A, 0, vp.field_I);
            if (null == ((s) this).field_v) {
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                if (var5 >= ((s) this).field_v.length) {
                  break L0;
                } else {
                  L2: {
                    var6 = ((s) this).field_v[var5];
                    var7 = var6.field_a;
                    var8 = var6.field_c;
                    if (-1 < (var7 ^ -1)) {
                      if (-1 < (var8 ^ -1)) {
                        break L2;
                      } else {
                        var6.a(var4, var3, (byte) 106);
                        break L2;
                      }
                    } else {
                      if (-1 >= (var8 ^ -1)) {
                        var6.a(var3, var4, -105);
                        break L2;
                      } else {
                        var6.a((byte) 60, var4, var3);
                        break L2;
                      }
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        L0: {
          var7 = Torquing.field_u;
          if (param1 == 35) {
            break L0;
          } else {
            s.g((byte) -103);
            break L0;
          }
        }
        L1: {
          if ((param2 ^ -1) != -1) {
            if (1 == param2) {
              L2: {
                stackOut_18_0 = this;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (1 != param0.i((byte) -101)) {
                  stackOut_20_0 = this;
                  stackOut_20_1 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L2;
                } else {
                  stackOut_19_0 = this;
                  stackOut_19_1 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L2;
                }
              }
              ((s) this).field_p = stackIn_21_1 != 0;
              break L1;
            } else {
              break L1;
            }
          } else {
            ((s) this).field_v = new kj[param0.i((byte) -101)];
            var4 = 0;
            L3: while (true) {
              if ((var4 ^ -1) <= (((s) this).field_v.length ^ -1)) {
                break L1;
              } else {
                L4: {
                  var5 = param0.i((byte) -101);
                  var6 = var5;
                  if (0 == var6) {
                    ((s) this).field_v[var4] = (kj) (Object) tl.a(param0, (byte) -51);
                    break L4;
                  } else {
                    if ((var6 ^ -1) != -2) {
                      if (-3 == (var6 ^ -1)) {
                        ((s) this).field_v[var4] = (kj) (Object) c.a(i.c(param1, 40), param0);
                        break L4;
                      } else {
                        if (var6 != 3) {
                          break L4;
                        } else {
                          ((s) this).field_v[var4] = (kj) (Object) bi.a(param0, (byte) 13);
                          break L4;
                        }
                      }
                    } else {
                      ((s) this).field_v[var4] = (kj) (Object) wa.a(false, param0);
                      break L4;
                    }
                  }
                }
                var4++;
                continue L3;
              }
            }
          }
        }
    }

    final int[][] a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = Torquing.field_u;
        if (param0 != -29116) {
            return null;
        }
        int[][] var3 = ((s) this).field_r.a(15142, param1);
        if (!(!((s) this).field_r.field_b)) {
            var4 = ci.field_c;
            var5 = um.field_o;
            var29 = new int[var5][var4];
            var30 = ((s) this).field_r.a(false);
            this.a(var29, param0 ^ 29115);
            for (var8 = 0; var8 < um.field_o; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; ci.field_c > var14; var14++) {
                    var15 = var32[var14];
                    var13[var14] = ie.a(var15 << -1874971868, 4080);
                    var12[var14] = ie.a(65280, var15) >> 49481732;
                    var11[var14] = ie.a(var15 >> 18496300, 4080);
                }
            }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "That name is not available";
    }
}
