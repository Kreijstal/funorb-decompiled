/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends sf {
    static int field_ab;
    static String field_Z;

    final static void a(int param0, hj param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (0 != ((param1.field_p | (param1.field_k | param1.field_o) | param1.field_u) & 3)) {
              var2_int = param1.field_o + (param1.field_p & 3);
              var3 = param1.field_k + (param1.field_u & 3);
              var2_int = 4 - ((var2_int & 3) - var2_int);
              var3 = var3 + (-(var3 & 3) + 4);
              var4 = new int[var2_int * var3];
              var5 = 0;
              var6 = (3 & param1.field_p) + var2_int * (3 & param1.field_u);
              var7 = 0;
              L1: while (true) {
                if (var7 >= param1.field_k) {
                  L2: {
                    if (param0 == 2408) {
                      break L2;
                    } else {
                      hj[] discarded$3 = sl.d((byte) -106);
                      break L2;
                    }
                  }
                  param1.field_u = param1.field_u & -4;
                  param1.field_p = param1.field_p & -4;
                  param1.field_k = var3;
                  param1.field_o = var2_int;
                  param1.field_v = var4;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (param1.field_o <= var8) {
                      var6 = var6 + (var2_int - param1.field_o);
                      var7++;
                      continue L1;
                    } else {
                      int incrementValue$4 = var6;
                      var6++;
                      int incrementValue$5 = var5;
                      var5++;
                      var4[incrementValue$4] = param1.field_v[incrementValue$5];
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("sl.C(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void c() {
        field_Z = null;
    }

    final static hj[] d(byte param0) {
        hj[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        byte[] var13 = null;
        int[] var14 = null;
        byte[] var17 = null;
        int[] var18 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        L0: {
          var8 = OrbDefence.field_D ? 1 : 0;
          var1 = new hj[ec.field_K];
          var2 = 0;
          if (param0 < -82) {
            break L0;
          } else {
            var9 = null;
            sl.a(16, (hj) null);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= ec.field_K) {
            md.a((byte) -127);
            return var1;
          } else {
            var3 = wh.field_b[var2] * m.field_a[var2];
            var24 = fl.field_a[var2];
            if (!ha.field_g[var2]) {
              var11 = new int[var3];
              var27 = var11;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new hj(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var27);
                  var2++;
                  continue L1;
                } else {
                  var11[var6] = vc.field_g[vi.a(255, (int) var24[var6])];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var25 = md.field_i[var2];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var10 = var13;
              var5 = var10;
              var26 = new int[var3];
              var22 = var26;
              var18 = var22;
              var14 = var18;
              var6_ref_int__ = var14;
              var7 = 0;
              L3: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (hj) (Object) new ra(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var26);
                  var2++;
                  continue L1;
                } else {
                  var6_ref_int__[var7] = ge.a(vc.field_g[vi.a(255, (int) var24[var7])], vi.a(-16777216, var25[var7] << 24));
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    private sl() throws Throwable {
        super(0L, (sf) null);
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = -1;
        field_Z = "CONGRATULATIONS!<br><br>You have managed to defeat all the Norbs thus far. To continue you must become a member!";
    }
}
