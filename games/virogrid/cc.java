/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cc extends aj {
    static float field_x;
    static mg field_u;
    static String[] field_v;
    static km field_w;

    final static lc[] a(byte param0) {
        if (param0 != -104) {
          cc.a(-65, 105, true, false);
          return new lc[]{pm.field_q, dn.field_d, db.field_z, pn.field_z, gf.field_z, na.field_Fb, af.field_l, ud.field_c, lm.field_i, ji.field_b, dk.field_s, oj.field_Xb, vl.field_f, oe.field_e};
        } else {
          return new lc[]{pm.field_q, dn.field_d, db.field_z, pn.field_z, gf.field_z, na.field_Fb, af.field_l, ud.field_c, lm.field_i, ji.field_b, dk.field_s, oj.field_Xb, vl.field_f, oe.field_e};
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                bf.a(true, param1.field_g, param1.field_l + param0, param3 + param1.field_u, param1.field_m);
                break L1;
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2, param3, param4 + 0);
            if (param4 == -23294) {
              break L0;
            } else {
              field_x = -0.093443363904953f;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("cc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        if (param2) {
            return 38;
        }
        return sn.h(3938);
    }

    cc(int param0) {
        this(dj.field_h, param0);
    }

    final static void a(boolean param0, he param1, boolean param2, jc param3) {
        he stackIn_6_0 = null;
        he stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        he stackIn_9_0 = null;
        he stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        he stackIn_13_0 = null;
        he stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        he stackIn_16_0 = null;
        he stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        he stackIn_19_0 = null;
        he stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        he stackIn_22_0 = null;
        he stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                param1.field_ic = param3.g(11132);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.field_vc = param3.g(11132);
              param1.field_fc = param3.g(11132);
              var4_int = param3.g(11132);
              stackIn_6_0 = (he) (param1);

              if ((128 & var4_int) == 0) {
                stackIn_7_0 = (he) ((Object) stackIn_6_0);
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = (he) ((Object) stackIn_6_0);
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0.field_Sb = stackIn_7_1 != 0;
              stackIn_9_0 = (he) (param1);

              if ((var4_int & 64) == 0) {
                stackIn_10_0 = (he) ((Object) stackIn_9_0);
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = (he) ((Object) stackIn_9_0);
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              L5: {
                stackIn_10_0.field_kc = stackIn_10_1 != 0;
                stackIn_13_0 = (he) (param1);

                if (!param1.field_Sb) {
                  break L5;
                } else {
                  stackIn_13_0 = (he) ((Object) stackIn_13_0);

                  if (param1.field_vc <= param1.field_ic) {
                    break L5;
                  } else {
                    stackIn_14_0 = (he) ((Object) stackIn_13_0);
                    stackIn_14_1 = 1;
                    break L4;
                  }
                }
              }
              stackIn_14_0 = (he) ((Object) stackIn_13_0);
              stackIn_14_1 = 0;
              break L4;
            }
            L6: {
              stackIn_14_0.field_Ib = stackIn_14_1 != 0;
              stackIn_16_0 = (he) (param1);

              if (0 != (16 & var4_int)) {
                stackIn_17_0 = (he) ((Object) stackIn_16_0);
                stackIn_17_1 = 2;
                break L6;
              } else {
                stackIn_17_0 = (he) ((Object) stackIn_16_0);
                stackIn_17_1 = 1;
                break L6;
              }
            }
            L7: {
              stackIn_17_0.field_lc = stackIn_17_1;
              stackIn_19_0 = (he) (param1);

              if ((var4_int & 32) == 0) {
                stackIn_20_0 = (he) ((Object) stackIn_19_0);
                stackIn_20_1 = 0;
                break L7;
              } else {
                stackIn_20_0 = (he) ((Object) stackIn_19_0);
                stackIn_20_1 = 1;
                break L7;
              }
            }
            L8: {
              stackIn_20_0.field_Ub = stackIn_20_1 != 0;
              stackIn_22_0 = (he) (param1);

              if (0 == (8 & var4_int)) {
                stackIn_23_0 = (he) ((Object) stackIn_22_0);
                stackIn_23_1 = 0;
                break L8;
              } else {
                stackIn_23_0 = (he) ((Object) stackIn_22_0);
                stackIn_23_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_23_0.field_Rb = stackIn_23_1 != 0;
              if ((4 & var4_int) == 0) {
                stackIn_26_0 = 0;
                break L9;
              } else {
                stackIn_26_0 = 1;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_26_0;
              param3.a(0, param1.field_Pb.length, param2, param1.field_Pb);
              if ((2 & var4_int) == 0) {
                stackIn_29_0 = 0;
                break L10;
              } else {
                stackIn_29_0 = 1;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_29_0;
              param1.field_ac = param3.c((byte) 47);
              param1.field_Hb = hc.a(-9986) - (long)param3.d((byte) 119);
              if (var5 != 0) {
                param1.field_mc = param3.d((byte) 127);
                break L11;
              } else {
                param1.field_mc = -1;
                break L11;
              }
            }
            param1.field_gc = param3.e((byte) -60);
            var7 = param3.field_l;
            param1.field_Qb = param3.h(-119);
            if (var6 != 0) {
              param3.field_l = var7;
              param1.field_Zb = new String[param1.field_ic];
              var8 = 0;
              L12: while (true) {
                if (param1.field_ic <= var8) {
                  break L0;
                } else {
                  param1.field_Zb[var8] = param3.h(-119);
                  var8++;
                  continue L12;
                }
              }
            } else {
              param1.field_Zb = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var4);

            stackIn_40_1 = new StringBuilder().append("cc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L14;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L14;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_41_0), stackIn_44_2 + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_w = null;
        field_u = null;
        field_v = null;
    }

    cc(e param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    static {
        field_u = new mg(270, 70);
        field_v = new String[]{"2D - Fastest", "2D - Best", "3D - Fastest", "3D - Best"};
    }
}
