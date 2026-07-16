/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends hl {
    private hl field_Wb;
    private hl field_Sb;
    private hl field_Pb;
    static int[] field_Ub;
    private hl field_Rb;
    private hl field_Vb;
    private hl field_Yb;
    static int field_Mb;
    private int field_Tb;
    static int[][] field_Ob;
    static int field_Xb;
    static int field_Kb;
    static oh field_Lb;
    static ah field_Nb;
    static hl field_Qb;

    final boolean e(boolean param0) {
        if (!param0) {
            return true;
        }
        return 0 != ((bl) this).field_Rb.field_T ? true : false;
    }

    public static void e(byte param0) {
        field_Nb = null;
        field_Ub = null;
        if (param0 < 115) {
            hl discarded$0 = bl.d(true);
        }
        field_Ob = null;
        field_Lb = null;
        field_Qb = null;
    }

    final boolean d(byte param0) {
        if (-1 != (((bl) this).field_Pb.field_F ^ -1)) {
            ((bl) this).field_Tb = 20;
            return true;
        }
        if (!(((bl) this).field_Pb.field_T == 0)) {
            if (0 < ((bl) this).field_Tb) {
                ((bl) this).field_Tb = ((bl) this).field_Tb - 1;
            }
            if (0 == ((bl) this).field_Tb) {
                if (!(((bl) this).field_Rb.field_Db + ((bl) this).field_Rb.field_z <= a.field_a)) {
                    ((bl) this).field_Tb = 3;
                    return true;
                }
            }
        }
        if (param0 != -125) {
            return false;
        }
        return false;
    }

    final static void a(int[] param0, oh[][] param1, String[] param2, ah param3, int[] param4, int param5, byte[] param6, String[][] param7, String[] param8, String[] param9, oh[][] param10, boolean param11, byte[] param12, String[][] param13, kh[] param14, int param15, int param16, int param17, ah param18, ah param19) {
        if (param17 != -11842) {
            field_Qb = null;
        }
        ti.a(param19, (byte) 63, param14, param4, param18);
        vg.a((byte) 53, param18);
        em.a(param9, param16, param5, param8, param1, param2, param0, param18, param6, param10, 109, param7, param15, param13, param12);
        r.a(param18, param3, true, param11);
        ma.c(param17 ^ -19985);
        pd.b(false);
        ch.a(false);
    }

    bl(long param0, hl param1, hl param2, hl param3, hl param4) {
        super(param0, (hl) null);
        ((bl) this).field_Vb = new hl(0L, param1);
        ((bl) this).field_Yb = new hl(0L, param2);
        ((bl) this).a((byte) -98, ((bl) this).field_Vb);
        ((bl) this).a((byte) -124, ((bl) this).field_Yb);
        ((bl) this).field_Wb = new hl(0L, (hl) null);
        ((bl) this).a((byte) 40, ((bl) this).field_Wb);
        ((bl) this).field_Pb = new hl(0L, param3);
        ((bl) this).field_Sb = new hl(0L, param3);
        hl var9 = ((bl) this).field_Pb;
        hl var10 = var9;
        ((bl) this).field_Sb.field_Cb = true;
        var10.field_Cb = true;
        ((bl) this).field_Wb.a((byte) 51, ((bl) this).field_Pb);
        ((bl) this).field_Wb.a((byte) 83, ((bl) this).field_Sb);
        ((bl) this).field_Rb = new hl(0L, param4);
        ((bl) this).field_Rb.field_qb = true;
        ((bl) this).field_Wb.a((byte) 51, ((bl) this).field_Rb);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        ((bl) this).field_Hb = param3;
        if (!param5) {
            bl.e((byte) 60);
        }
        ((bl) this).field_yb = param2;
        ((bl) this).field_R = param1;
        ((bl) this).field_M = param0;
        ((bl) this).a(80, param6, param4, param7);
    }

    bl(long param0, bl param1) {
        this(param0, param1.field_Vb, param1.field_Yb, param1.field_Pb, param1.field_Rb);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hl var14 = null;
        hl var15 = null;
        hl var16 = null;
        hl var17 = null;
        hl var18 = null;
        hl var19 = null;
        hl stackIn_15_0 = null;
        hl stackIn_15_1 = null;
        hl stackIn_15_2 = null;
        hl stackIn_16_0 = null;
        hl stackIn_16_1 = null;
        hl stackIn_16_2 = null;
        hl stackIn_17_0 = null;
        hl stackIn_17_1 = null;
        hl stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        hl stackOut_14_0 = null;
        hl stackOut_14_1 = null;
        hl stackOut_14_2 = null;
        hl stackOut_16_0 = null;
        hl stackOut_16_1 = null;
        hl stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        hl stackOut_15_0 = null;
        hl stackOut_15_1 = null;
        hl stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        L0: {
          if (((bl) this).field_R < ((bl) this).field_Hb * 2) {
            var6 = ((bl) this).field_R / 2;
            var5 = ((bl) this).field_R / 2;
            break L0;
          } else {
            var6 = ((bl) this).field_R + -((bl) this).field_Hb;
            var5 = ((bl) this).field_Hb;
            break L0;
          }
        }
        L1: {
          var7 = var6 - var5;
          var8 = var7;
          if (0 < param2) {
            L2: {
              var8 = param3 * var8 / param2;
              if (((bl) this).field_Hb > var8) {
                var8 = ((bl) this).field_Hb;
                break L2;
              } else {
                break L2;
              }
            }
            if (var7 >= var8) {
              break L1;
            } else {
              var8 = var7;
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var9 = param2 - param3;
          var10 = -var8 + var7;
          var11 = 0;
          if (param0 >= 41) {
            break L3;
          } else {
            field_Ob = null;
            break L3;
          }
        }
        L4: {
          if (0 >= var9) {
            break L4;
          } else {
            var11 = (var9 / 2 + param1 * var10) / var9;
            break L4;
          }
        }
        L5: {
          var12 = var8 / 2 + var11;
          var14 = ((bl) this).field_Vb;
          var14.field_Hb = ((bl) this).field_Hb;
          var14.field_R = var5;
          var14.field_yb = 0;
          var14.field_M = 0;
          var15 = ((bl) this).field_Yb;
          var15.field_yb = var6;
          var15.field_Hb = ((bl) this).field_Hb;
          var15.field_M = 0;
          var15.field_R = ((bl) this).field_R - var6;
          var16 = ((bl) this).field_Wb;
          var16.field_M = 0;
          var16.field_yb = var5;
          var16.field_Hb = ((bl) this).field_Hb;
          var16.field_R = var7;
          var17 = ((bl) this).field_Pb;
          var17.field_yb = 0;
          var17.field_M = 0;
          var17.field_R = var12;
          var17.field_Hb = ((bl) this).field_Hb;
          var18 = ((bl) this).field_Sb;
          var18.field_Hb = ((bl) this).field_Hb;
          var18.field_R = var7 + -var12;
          var18.field_yb = var12;
          var18.field_M = 0;
          var19 = ((bl) this).field_Rb;
          var19.field_Hb = ((bl) this).field_Hb;
          var19.field_M = 0;
          var19.field_yb = var11;
          stackOut_14_0 = ((bl) this).field_Vb;
          stackOut_14_1 = ((bl) this).field_Yb;
          stackOut_14_2 = ((bl) this).field_Wb;
          stackIn_16_0 = stackOut_14_0;
          stackIn_16_1 = stackOut_14_1;
          stackIn_16_2 = stackOut_14_2;
          stackIn_15_0 = stackOut_14_0;
          stackIn_15_1 = stackOut_14_1;
          stackIn_15_2 = stackOut_14_2;
          if (param3 >= param2) {
            stackOut_16_0 = (hl) (Object) stackIn_16_0;
            stackOut_16_1 = (hl) (Object) stackIn_16_1;
            stackOut_16_2 = (hl) (Object) stackIn_16_2;
            stackOut_16_3 = 0;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            stackIn_17_2 = stackOut_16_2;
            stackIn_17_3 = stackOut_16_3;
            break L5;
          } else {
            stackOut_15_0 = (hl) (Object) stackIn_15_0;
            stackOut_15_1 = (hl) (Object) stackIn_15_1;
            stackOut_15_2 = (hl) (Object) stackIn_15_2;
            stackOut_15_3 = 1;
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_17_2 = stackOut_15_2;
            stackIn_17_3 = stackOut_15_3;
            break L5;
          }
        }
        stackIn_17_2.field_S = stackIn_17_3 != 0;
        stackIn_17_1.field_S = stackIn_17_3 != 0;
        stackIn_17_0.field_S = stackIn_17_3 != 0;
        var19.field_R = var8;
    }

    final static hl d(boolean param0) {
        if (!param0) {
            field_Ub = null;
        }
        return pj.field_f.field_Kb;
    }

    final boolean c(boolean param0) {
        if (!(-1 == (((bl) this).field_Vb.field_F ^ -1))) {
            ((bl) this).field_Tb = 20;
            return true;
        }
        if (((bl) this).field_Vb.field_T != 0) {
            if (((bl) this).field_Tb > 0) {
                ((bl) this).field_Tb = ((bl) this).field_Tb - 1;
            }
            if (!(((bl) this).field_Tb != 0)) {
                ((bl) this).field_Tb = 3;
                return true;
            }
        }
        if (!param0) {
            return true;
        }
        return false;
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = param2;
          var6 = -((bl) this).field_Rb.field_R + ((bl) this).field_Wb.field_R;
          if (var6 > 0) {
            var7 = ((bl) this).field_Rb.field_yb;
            var8 = -param3 + param0;
            var5 = (var7 * var8 + var6 / 2) / var6;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1) {
            L2: {
              if (var5 < 0) {
                var5 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            if (var5 <= param0 + -param3) {
              break L1;
            } else {
              var5 = param0 - param3;
              break L1;
            }
          } else {
            L3: {
              if (var5 <= param0 + -param3) {
                break L3;
              } else {
                var5 = -param3 + param0;
                break L3;
              }
            }
            if (var5 >= 0) {
              break L1;
            } else {
              var5 = 0;
              break L1;
            }
          }
        }
        return var5;
    }

    final boolean i(int param0) {
        if (param0 >= -12) {
            field_Lb = null;
        }
        if (!(((bl) this).field_Yb.field_F == 0)) {
            ((bl) this).field_Tb = 20;
            return true;
        }
        if (((bl) this).field_Yb.field_T != 0) {
            if (((bl) this).field_Tb > 0) {
                ((bl) this).field_Tb = ((bl) this).field_Tb - 1;
            }
            if (((bl) this).field_Tb != 0) {
                return false;
            }
            ((bl) this).field_Tb = 3;
            return true;
        }
        return false;
    }

    final boolean h(int param0) {
        if (param0 >= -25) {
            ((bl) this).a(-125, 94, -48, 36, 74, false, -16, 123);
        }
        if (!(-1 == (((bl) this).field_Sb.field_F ^ -1))) {
            ((bl) this).field_Tb = 20;
            return true;
        }
        if (0 != ((bl) this).field_Sb.field_T) {
            if (!(((bl) this).field_Tb <= 0)) {
                ((bl) this).field_Tb = ((bl) this).field_Tb - 1;
            }
            if (((bl) this).field_Tb == 0) {
                if (((bl) this).field_Rb.field_z - -((bl) this).field_Rb.field_Db + ((bl) this).field_Rb.field_R - -((bl) this).field_Rb.field_mb > a.field_a) {
                    return false;
                }
                ((bl) this).field_Tb = 3;
                return true;
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_Ub = new int[256];
        field_Mb = 0;
        var1 = 0;
        L0: while (true) {
          if ((var1 ^ -1) <= -257) {
            field_Xb = 0;
            field_Kb = 2;
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                field_Ub[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0) != 1) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1683335745 ^ -306674912;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
