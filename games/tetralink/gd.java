/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends hl {
    static String field_ec;
    hl field_Vb;
    boolean field_Tb;
    int field_Sb;
    int field_Qb;
    hl field_Ob;
    int field_Ub;
    boolean field_cc;
    int field_Xb;
    boolean field_Kb;
    int field_dc;
    long field_bc;
    hl field_Wb;
    long field_Nb;
    hl field_Lb;
    hl field_ac;
    static int field_Mb;
    int field_Pb;
    String field_Rb;
    static int[] field_Zb;
    String field_Yb;

    public static void h() {
        field_Zb = null;
        field_ec = null;
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
            if (param0 <= 26) {
                ((gd) this).field_Rb = null;
            }
            ((gd) this).field_Yb = param2;
            ((gd) this).field_Rb = param1;
            var5 = (CharSequence) (Object) ((gd) this).field_Rb;
            String discarded$0 = cc.a(var5, (byte) 104);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "gd.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(byte param0, gd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_7_0 = false;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (((gd) this).field_Kb) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param1.field_Kb) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            if (stackIn_6_0 == stackIn_6_1) {
              L3: {
                if (((gd) this).field_cc) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              if (stackIn_12_0 == (param1.field_cc ? 1 : 0)) {
                stackOut_14_0 = ((gd) this).field_cc;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                L4: {
                  var3_int = -22 % ((-21 - param0) / 55);
                  if (param1.field_bc <= ((gd) this).field_bc) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                break L0;
              }
            } else {
              stackOut_7_0 = ((gd) this).field_Kb;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("gd.B(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            ((gd) this).field_Xb = -80;
            if (((gd) this).a(2)) {
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
            if (((gd) this).a(2)) {
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

    final static oh[] e() {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = TetraLink.field_J;
        oh[] var1 = new oh[vj.field_n];
        for (var2 = 0; vj.field_n > var2; var2++) {
            var3 = sn.field_e[var2] * je.field_h[var2];
            var4 = ga.field_a[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ti.field_c[pl.a((int) var4[var6], 255)];
            }
            var1[var2] = new oh(wm.field_l, mm.field_w, qa.field_x[var2], i.field_t[var2], je.field_h[var2], sn.field_e[var2], var5);
        }
        var2 = 1;
        an.b(-104);
        return var1;
    }

    final static void a(String param0, int param1, String param2, int param3, rb param4, int[] param5, long param6, hl param7, int param8) {
        try {
            bi.field_d = param4;
            hd.field_s = new pf(param7, param6, param0, param2, param8, param3, param5);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "gd.A(" + (param0 != null ? "{...}" : "null") + 44 + 255 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 44 + param8 + 41);
        }
    }

    gd(String param0, String param1, long param2) {
        super(0L, (hl) null);
        CharSequence var6 = null;
        try {
            ((gd) this).field_Yb = param1;
            ((gd) this).field_Rb = param0;
            ((gd) this).field_Nb = param2;
            var6 = (CharSequence) (Object) ((gd) this).field_Rb;
            String discarded$0 = cc.a(var6, (byte) 115);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "gd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_6_0 = 0;
        var8 = TetraLink.field_J;
        try {
          L0: {
            var3_int = 0;
            var4 = pj.field_e;
            L1: while (true) {
              if (pj.field_h.length <= var3_int) {
                stackOut_16_0 = -1;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L2: {
                  var5 = ml.field_mb[var3_int];
                  if (var5 >= 0) {
                    var6 = fi.a(true, pj.field_h[var3_int], (byte) -89);
                    var7 = vg.field_Lb + -(var6 >> 1);
                    var4 = var4 + mn.field_c;
                    if (!tb.a(param1, -io.field_a + var7, var4, param0, var6 + (io.field_a << 1), bj.field_d - -(da.field_e << 1), -113)) {
                      var4 = var4 + ((da.field_e << 1) + mn.field_c - -bj.field_d);
                      var3_int++;
                      break L2;
                    } else {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    }
                  } else {
                    var4 = var4 + la.field_e;
                    var3_int++;
                    break L2;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "gd.I(" + param0 + 44 + param1 + 44 + 8395 + 41);
        }
        return stackIn_17_0;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        jj.field_b = param3;
        rn.field_b = param4;
        la.field_e = param2;
        bj.field_d = param0;
    }

    final static void d(int param0, int param1) {
        ik.field_e = param0 >> 4 & 3;
        me.field_b = param0 >> 2 & 3;
        if (!(2 >= ik.field_e)) {
            ik.field_e = 2;
        }
        if (!(me.field_b <= 2)) {
            me.field_b = 2;
        }
        mc.field_f = 3 & param0;
        if (!(mc.field_f <= 2)) {
            mc.field_f = 2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ec = "Your request to join has been declined.";
        field_Mb = 50;
    }
}
