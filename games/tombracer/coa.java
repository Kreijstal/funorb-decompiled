/*
 * Decompiled by CFR-JS 0.4.0.
 */
class coa extends ci {
    private int field_o;
    int field_m;
    int[] field_p;
    static mla field_s;
    static String field_n;
    int field_r;
    static int[] field_q;

    final void a(byte param0, uia param1, int param2) {
        if (param0 != 107) {
            ((coa) this).field_r = -60;
        }
        if (0 == param2) {
            ((coa) this).field_o = param1.d(122);
        }
    }

    public coa() {
        super(0, false);
        ((coa) this).field_o = -1;
    }

    final int a(int param0) {
        if (param0 < 96) {
            ((coa) this).b(-44);
        }
        return ((coa) this).field_o;
    }

    final void b(int param0) {
        super.b(-77);
        if (param0 >= -32) {
            return;
        }
        ((coa) this).field_p = null;
    }

    int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var16 = ((coa) this).field_h.a(param0, (byte) -66);
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (param1 == -1) {
          L0: {
            if (!((coa) this).field_h.field_f) {
              break L0;
            } else {
              if (!((coa) this).a(false)) {
                break L0;
              } else {
                L1: {
                  var4 = var16[0];
                  var5 = var16[1];
                  var6 = var16[2];
                  stackOut_4_0 = ((coa) this).field_m;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (qda.field_i != ((coa) this).field_r) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = ((coa) this).field_r * param0 / qda.field_i;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = param0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                var7 = stackIn_7_0 * stackIn_7_1;
                if (((coa) this).field_m != ns.field_g) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= ns.field_g) {
                      break L0;
                    } else {
                      var9 = ((coa) this).field_m * var8 / ns.field_g;
                      var10 = ((coa) this).field_p[var7 - -var9];
                      var6[var8] = sea.c(4080, var10 << -2003868700);
                      var5[var8] = sea.c(var10, 65280) >> -1311564892;
                      var4[var8] = sea.c(16711680, var10) >> 943686380;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (ns.field_g <= var8) {
                      break L0;
                    } else {
                      var7++;
                      var9 = ((coa) this).field_p[var7];
                      var6[var8] = sea.c(4080, var9 << 768834820);
                      var5[var8] = sea.c(4080, var9 >> -521245468);
                      var4[var8] = sea.c(var9, 16711680) >> -939575860;
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final boolean a(boolean param0) {
        if (!(null == ((coa) this).field_p)) {
            return true;
        }
        if (param0) {
            return true;
        }
        if (((coa) this).field_o > -1) {
            return false;
        }
        jpa var2 = -1 <= gla.field_m ? jpa.a(np.field_m, gla.field_m, ((coa) this).field_o) : jpa.a(np.field_m, ((coa) this).field_o);
        var2.d();
        ((coa) this).field_p = var2.e();
        ((coa) this).field_r = var2.field_a;
        ((coa) this).field_m = var2.field_i;
        return true;
    }

    public static void c(int param0) {
        field_s = null;
        if (param0 != 16711680) {
            coa.c(90);
        }
        field_n = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_n = "<%0> chose character: <%1>";
        field_s = new mla();
        field_q = new int[256];
        var1 = 0;
        L0: while (true) {
          if (-257 >= var1) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_q[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 == (var0 & 1)) {
                  var0 = var0 >>> -743502079 ^ -306674912;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
