/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends ji {
    private jq[] field_z;
    static nj field_B;
    static lg field_A;
    static er field_y;
    static String field_E;
    static lb field_D;

    public qo() {
        super(0, true);
    }

    public static void b(byte param0) {
        if (param0 > -89) {
            return;
        }
        field_y = null;
        field_E = null;
        field_A = null;
        field_D = null;
        field_B = null;
    }

    final int[][] b(int param0, int param1) {
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
        int var16 = Vertigo2.field_L ? 1 : 0;
        int[][] var3 = ((qo) this).field_v.a(param1, -2);
        if (param0 != -3780) {
            return null;
        }
        if (((qo) this).field_v.field_c) {
            var4 = we.field_M;
            var5 = aa.field_Vb;
            var29 = new int[var5][var4];
            var30 = ((qo) this).field_v.a(0);
            this.a(17989, var29);
            for (var8 = 0; var8 < aa.field_Vb; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; we.field_M > var14; var14++) {
                    var15 = var32[var14];
                    var13[var14] = b.a(var15, 255) << -983162300;
                    var12[var14] = b.a(4080, var15 >> -1647127836);
                    var11[var14] = b.a(var15 >> 796373644, 4080);
                }
            }
        }
        return var3;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if (param1 != 0) {
            if (1 != param1) {
              break L0;
            } else {
              L1: {
                stackOut_16_0 = this;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if ((param2.h(-11) ^ -1) != -2) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L1;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L1;
                }
              }
              ((qo) this).field_o = stackIn_19_1 != 0;
              break L0;
            }
          } else {
            ((qo) this).field_z = new jq[param2.h(param0 + -121)];
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((qo) this).field_z.length) {
                break L0;
              } else {
                var5 = param2.h(-11);
                var6 = var5;
                if (var6 != 0) {
                  if (var6 == 1) {
                    ((qo) this).field_z[var4] = (jq) (Object) ug.a(param2, 46);
                    var4++;
                    continue L2;
                  } else {
                    if (var6 == -3) {
                      ((qo) this).field_z[var4] = (jq) (Object) td.a(false, param2);
                      var4++;
                      continue L2;
                    } else {
                      if (-4 == var6) {
                        ((qo) this).field_z[var4] = (jq) (Object) rb.a((byte) 104, param2);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  ((qo) this).field_z[var4] = (jq) (Object) lb.a(param2, (byte) 92);
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param0 == 110) {
            break L3;
          } else {
            this.a(12, (int[][]) null);
            break L3;
          }
        }
    }

    final int[] c(int param0, int param1) {
        if (param1 <= 91) {
            int[][] discarded$0 = ((qo) this).b(-13, -62);
        }
        int[] var4 = ((qo) this).field_x.a(param0, (byte) 98);
        int[] var3 = var4;
        if (((qo) this).field_x.field_i) {
            this.a(17989, ((qo) this).field_x.a(100));
        }
        return var4;
    }

    private final void a(int param0, int[][] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jq var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          if (param0 == 17989) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        L1: {
          var3 = we.field_M;
          var4 = aa.field_Vb;
          eo.a(0, param1);
          ec.a(fk.field_x, 0, rm.field_z, 0, (byte) -16);
          if (((qo) this).field_z != null) {
            var5 = 0;
            L2: while (true) {
              if (((qo) this).field_z.length <= var5) {
                break L1;
              } else {
                var6 = ((qo) this).field_z[var5];
                var7 = var6.field_g;
                var8 = var6.field_a;
                if (var7 < 0) {
                  if (var8 >= 0) {
                    var6.a(var4, var3, 45);
                    var5++;
                    continue L2;
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  if (-1 < (var8 ^ -1)) {
                    var6.a(var4, (byte) -117, var3);
                    var5++;
                    continue L2;
                  } else {
                    var6.b(var3, (byte) 124, var4);
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_B = new nj();
    }
}
