/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gba extends sna {
    private sna field_Fb;
    private int field_Ab;
    private sna field_zb;
    private boolean field_vb;
    static kv field_xb;
    private sna field_Eb;
    private sna field_wb;
    private sna field_Gb;
    private static int[] field_Hb;
    private sna field_Cb;
    static int field_Bb;
    static kv[] field_Db;
    static String field_yb;
    static String field_Ib;

    final boolean f(int param0) {
        if (-1 != (((gba) this).field_Cb.field_R ^ -1)) {
            ((gba) this).field_Ab = 20;
            return true;
        }
        if (((gba) this).field_Cb.field_ib != param0) {
            if (!(((gba) this).field_Ab >= -1)) {
                ((gba) this).field_Ab = ((gba) this).field_Ab - 1;
            }
            if (-1 == ((gba) this).field_Ab) {
                if (gd.field_m >= ((gba) this).field_wb.field_M + ((gba) this).field_wb.field_I) {
                    return false;
                }
                ((gba) this).field_Ab = 3;
                return true;
            }
        }
        return false;
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var6 = ((gba) this).field_zb.field_sb + -((gba) this).field_wb.field_sb;
        if (var6 > 0) {
            var7 = ((gba) this).field_wb.field_kb;
            var8 = param3 + -param2;
            var5 = (var7 * var8 - -(var6 / 2)) / var6;
        }
        if (param1) {
            if (0 > var5) {
                var5 = 0;
            }
            // if_icmpge L116
            var5 = param3 - param2;
        } else {
            if (!(var5 <= param3 - param2)) {
                var5 = param3 - param2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
        }
        if (param0 > -27) {
            return 124;
        }
        return var5;
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        sna var15 = null;
        sna var16 = null;
        sna var17 = null;
        sna var18 = null;
        sna var19 = null;
        sna var20 = null;
        sna stackIn_16_0 = null;
        sna stackIn_16_1 = null;
        sna stackIn_16_2 = null;
        sna stackIn_17_0 = null;
        sna stackIn_17_1 = null;
        sna stackIn_17_2 = null;
        sna stackIn_18_0 = null;
        sna stackIn_18_1 = null;
        sna stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        sna stackOut_15_0 = null;
        sna stackOut_15_1 = null;
        sna stackOut_15_2 = null;
        sna stackOut_17_0 = null;
        sna stackOut_17_1 = null;
        sna stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        sna stackOut_16_0 = null;
        sna stackOut_16_1 = null;
        sna stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var14 = BachelorFridge.field_y;
          if (((gba) this).field_sb >= ((gba) this).field_p * 2) {
            var5 = ((gba) this).field_p;
            var6 = ((gba) this).field_sb + -((gba) this).field_p;
            break L0;
          } else {
            var6 = ((gba) this).field_sb / 2;
            var5 = ((gba) this).field_sb / 2;
            break L0;
          }
        }
        L1: {
          var7 = -var5 + var6;
          var8 = var7;
          if (param1 < param0) {
            L2: {
              var8 = var8 * param1 / param0;
              if (var8 >= ((gba) this).field_p) {
                break L2;
              } else {
                var8 = ((gba) this).field_p;
                break L2;
              }
            }
            if (var8 > var7) {
              var8 = var7;
              break L1;
            } else {
              break L1;
            }
          } else {
            var7 = 0;
            break L1;
          }
        }
        L3: {
          var9 = -param1 + param0;
          var10 = -var8 + var7;
          var11 = 0;
          if (-1 > (var9 ^ -1)) {
            var11 = (var9 / 2 + var10 * param2) / var9;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var12 = var11 - -(var8 / 2);
          var15 = ((gba) this).field_Fb;
          var15.field_kb = 0;
          var15.field_rb = 0;
          var15.field_sb = var5;
          var15.field_p = ((gba) this).field_p;
          var16 = ((gba) this).field_Eb;
          var16.field_kb = var6;
          if (param3 < -2) {
            break L4;
          } else {
            ((gba) this).field_vb = true;
            break L4;
          }
        }
        L5: {
          var16.field_p = ((gba) this).field_p;
          var16.field_rb = 0;
          var16.field_sb = -var6 + ((gba) this).field_sb;
          var17 = ((gba) this).field_zb;
          var17.field_kb = var5;
          var17.field_sb = var7;
          var17.field_rb = 0;
          var17.field_p = ((gba) this).field_p;
          var18 = ((gba) this).field_Cb;
          var18.field_kb = 0;
          var18.field_p = ((gba) this).field_p;
          var18.field_rb = 0;
          var18.field_sb = var12;
          var19 = ((gba) this).field_Gb;
          var19.field_p = ((gba) this).field_p;
          var19.field_kb = var12;
          var19.field_rb = 0;
          var19.field_sb = var7 - var12;
          var20 = ((gba) this).field_wb;
          var20.field_kb = var11;
          stackOut_15_0 = ((gba) this).field_Fb;
          stackOut_15_1 = ((gba) this).field_Eb;
          stackOut_15_2 = ((gba) this).field_zb;
          stackIn_17_0 = stackOut_15_0;
          stackIn_17_1 = stackOut_15_1;
          stackIn_17_2 = stackOut_15_2;
          stackIn_16_0 = stackOut_15_0;
          stackIn_16_1 = stackOut_15_1;
          stackIn_16_2 = stackOut_15_2;
          if (param1 >= param0) {
            stackOut_17_0 = (sna) (Object) stackIn_17_0;
            stackOut_17_1 = (sna) (Object) stackIn_17_1;
            stackOut_17_2 = (sna) (Object) stackIn_17_2;
            stackOut_17_3 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            stackIn_18_3 = stackOut_17_3;
            break L5;
          } else {
            stackOut_16_0 = (sna) (Object) stackIn_16_0;
            stackOut_16_1 = (sna) (Object) stackIn_16_1;
            stackOut_16_2 = (sna) (Object) stackIn_16_2;
            stackOut_16_3 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_18_2 = stackOut_16_2;
            stackIn_18_3 = stackOut_16_3;
            break L5;
          }
        }
        ((sna) (Object) stackIn_18_2).field_u = stackIn_18_3 != 0;
        ((sna) (Object) stackIn_18_1).field_u = stackIn_18_3 != 0;
        ((sna) (Object) stackIn_18_0).field_u = stackIn_18_3 != 0;
        var20.field_p = ((gba) this).field_p;
        var20.field_rb = 0;
        var20.field_sb = var8;
    }

    gba(String param0, sna param1, kv param2, kv param3, sna param4, sna param5, boolean param6) {
        this(ew.a((byte) 8, (CharSequence) (Object) param0), param1, param2, param3, param4, param5, param6);
    }

    final boolean f(byte param0) {
        if (param0 >= -117) {
            return false;
        }
        return 0 != ((gba) this).field_wb.field_ib ? true : false;
    }

    final void b(int param0, int param1, int param2, byte param3) {
        if (!((gba) this).field_vb) {
            this.a(param0, param2, param1, (byte) -32);
        } else {
            this.b(param0, param2, true, param1);
        }
        if (param3 != -117) {
            field_Hb = null;
        }
    }

    public static void i(int param0) {
        field_Db = null;
        if (param0 != 2) {
            gba.i(-103);
        }
        field_Ib = null;
        field_yb = null;
        field_xb = null;
        field_Hb = null;
    }

    private gba(long param0, sna param1, kv param2, kv param3, sna param4, sna param5, boolean param6) {
        this(param0, param1, param1, param4, param5, param6);
        ((gba) this).field_Fb.field_v = param2;
        ((gba) this).field_Eb.field_v = param3;
    }

    gba(long param0, gba param1, boolean param2) {
        this(param0, param1.field_Fb, param1.field_Eb, param1.field_Cb, param1.field_wb, param2);
    }

    final boolean h(int param0) {
        if (((gba) this).field_Gb.field_R != param0) {
            ((gba) this).field_Ab = 20;
            return true;
        }
        if (0 != ((gba) this).field_Gb.field_ib) {
            if (!((((gba) this).field_Ab ^ -1) >= -1)) {
                ((gba) this).field_Ab = ((gba) this).field_Ab - 1;
            }
            if (((gba) this).field_Ab == 0) {
                if (gd.field_m < ((gba) this).field_wb.field_p + (((gba) this).field_wb.field_M + ((gba) this).field_wb.field_I) + ((gba) this).field_wb.field_hb) {
                    return false;
                }
                ((gba) this).field_Ab = 3;
                return true;
            }
        }
        return false;
    }

    final boolean g(int param0) {
        if (!(((gba) this).field_Fb.field_R == 0)) {
            ((gba) this).field_Ab = 20;
            return true;
        }
        if (((gba) this).field_Fb.field_ib != 0) {
            if ((((gba) this).field_Ab ^ -1) < -1) {
                ((gba) this).field_Ab = ((gba) this).field_Ab - 1;
            }
            if (((gba) this).field_Ab == 0) {
                ((gba) this).field_Ab = 3;
                return true;
            }
        }
        if (param0 != 25910) {
            ((gba) this).field_Cb = null;
            return false;
        }
        return false;
    }

    final boolean b(boolean param0) {
        if (!(((gba) this).field_Eb.field_R == 0)) {
            ((gba) this).field_Ab = 20;
            return true;
        }
        if (param0) {
            boolean discarded$0 = ((gba) this).f(-108);
        }
        if (((gba) this).field_Eb.field_ib != 0) {
            if (!(((gba) this).field_Ab <= 0)) {
                ((gba) this).field_Ab = ((gba) this).field_Ab - 1;
            }
            if (0 == ((gba) this).field_Ab) {
                ((gba) this).field_Ab = 3;
                return true;
            }
        }
        return false;
    }

    private final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        sna var15 = null;
        sna var16 = null;
        sna var17 = null;
        sna var18 = null;
        sna var19 = null;
        sna var20 = null;
        sna stackIn_16_0 = null;
        sna stackIn_16_1 = null;
        sna stackIn_16_2 = null;
        sna stackIn_17_0 = null;
        sna stackIn_17_1 = null;
        sna stackIn_17_2 = null;
        sna stackIn_18_0 = null;
        sna stackIn_18_1 = null;
        sna stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        sna stackOut_15_0 = null;
        sna stackOut_15_1 = null;
        sna stackOut_15_2 = null;
        sna stackOut_17_0 = null;
        sna stackOut_17_1 = null;
        sna stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        sna stackOut_16_0 = null;
        sna stackOut_16_1 = null;
        sna stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var14 = BachelorFridge.field_y;
          if (2 * ((gba) this).field_sb > ((gba) this).field_p) {
            var6 = ((gba) this).field_p / 2;
            var5 = ((gba) this).field_p / 2;
            break L0;
          } else {
            var6 = -((gba) this).field_sb + ((gba) this).field_p;
            var5 = ((gba) this).field_sb;
            break L0;
          }
        }
        L1: {
          var7 = var6 - var5;
          var8 = var7;
          if (param0 <= param1) {
            var7 = 0;
            break L1;
          } else {
            L2: {
              var8 = var8 * param1 / param0;
              if (((gba) this).field_sb <= var8) {
                break L2;
              } else {
                var8 = ((gba) this).field_sb;
                break L2;
              }
            }
            if (var7 < var8) {
              var8 = var7;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          var9 = param0 + -param1;
          var10 = var7 - var8;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + var10 * param3) / var9;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var12 = var8 / 2 + var11;
          var15 = ((gba) this).field_Fb;
          var15.field_p = var5;
          var15.field_kb = 0;
          var15.field_rb = 0;
          var15.field_sb = ((gba) this).field_sb;
          var16 = ((gba) this).field_Eb;
          var16.field_kb = 0;
          var16.field_p = ((gba) this).field_p + -var6;
          var16.field_sb = ((gba) this).field_sb;
          var16.field_rb = var6;
          var17 = ((gba) this).field_zb;
          var17.field_sb = ((gba) this).field_sb;
          var17.field_rb = var5;
          var17.field_kb = 0;
          if (param2) {
            break L4;
          } else {
            ((gba) this).field_vb = true;
            break L4;
          }
        }
        L5: {
          var17.field_p = var7;
          var18 = ((gba) this).field_Cb;
          var18.field_kb = 0;
          var18.field_sb = ((gba) this).field_sb;
          var18.field_p = var12;
          var18.field_rb = 0;
          var19 = ((gba) this).field_Gb;
          var19.field_sb = ((gba) this).field_sb;
          var19.field_kb = 0;
          var19.field_p = -var12 + var7;
          var19.field_rb = var12;
          var20 = ((gba) this).field_wb;
          var20.field_p = var8;
          var20.field_rb = var11;
          var20.field_sb = ((gba) this).field_sb;
          stackOut_15_0 = ((gba) this).field_Fb;
          stackOut_15_1 = ((gba) this).field_Eb;
          stackOut_15_2 = ((gba) this).field_zb;
          stackIn_17_0 = stackOut_15_0;
          stackIn_17_1 = stackOut_15_1;
          stackIn_17_2 = stackOut_15_2;
          stackIn_16_0 = stackOut_15_0;
          stackIn_16_1 = stackOut_15_1;
          stackIn_16_2 = stackOut_15_2;
          if (param0 <= param1) {
            stackOut_17_0 = (sna) (Object) stackIn_17_0;
            stackOut_17_1 = (sna) (Object) stackIn_17_1;
            stackOut_17_2 = (sna) (Object) stackIn_17_2;
            stackOut_17_3 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            stackIn_18_3 = stackOut_17_3;
            break L5;
          } else {
            stackOut_16_0 = (sna) (Object) stackIn_16_0;
            stackOut_16_1 = (sna) (Object) stackIn_16_1;
            stackOut_16_2 = (sna) (Object) stackIn_16_2;
            stackOut_16_3 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_18_2 = stackOut_16_2;
            stackIn_18_3 = stackOut_16_3;
            break L5;
          }
        }
        ((sna) (Object) stackIn_18_2).field_u = stackIn_18_3 != 0;
        ((sna) (Object) stackIn_18_1).field_u = stackIn_18_3 != 0;
        ((sna) (Object) stackIn_18_0).field_u = stackIn_18_3 != 0;
        var20.field_kb = 0;
    }

    private gba(long param0, sna param1, sna param2, sna param3, sna param4, boolean param5) {
        super(param0, (sna) null);
        ((gba) this).field_vb = param5 ? true : false;
        ((gba) this).field_Fb = new sna(0L, param1);
        ((gba) this).field_Eb = new sna(0L, param2);
        ((gba) this).a(-1, ((gba) this).field_Fb);
        ((gba) this).a(-1, ((gba) this).field_Eb);
        ((gba) this).field_zb = new sna(0L, (sna) null);
        ((gba) this).a(-1, ((gba) this).field_zb);
        ((gba) this).field_Cb = new sna(0L, param3);
        ((gba) this).field_Gb = new sna(0L, param3);
        sna var10 = ((gba) this).field_Cb;
        sna var11 = var10;
        ((gba) this).field_Gb.field_qb = true;
        var11.field_qb = true;
        ((gba) this).field_zb.a(-1, ((gba) this).field_Cb);
        ((gba) this).field_zb.a(-1, ((gba) this).field_Gb);
        ((gba) this).field_wb = new sna(0L, param4);
        ((gba) this).field_wb.field_ub = true;
        ((gba) this).field_zb.a(-1, ((gba) this).field_wb);
    }

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var6 = -((gba) this).field_wb.field_p + ((gba) this).field_zb.field_p;
        if (!(-1 <= (var6 ^ -1))) {
            var7 = ((gba) this).field_wb.field_rb;
            var8 = -param2 + param3;
            var5 = (var8 * var7 + var6 / 2) / var6;
        }
        if (!param0) {
            if (param3 + -param2 < var5) {
                var5 = param3 - param2;
            }
            // if_icmple L125
            var5 = 0;
        } else {
            if (-1 < (var5 ^ -1)) {
                var5 = 0;
            }
            if (!(-param2 + param3 >= var5)) {
                var5 = param3 - param2;
            }
        }
        if (param1 < 15) {
            field_xb = null;
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_Hb = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)(-1 + (var0 << 1957389825));
            var6 = (long)(1 + (var0 << -53349535));
            var2 = (int)((var4 * var4 >> 1891100946) - 32768L);
            var3 = (int)((var6 * var6 >> -4714798) + -32768L);
            if (var3 >= field_Hb.length) {
                var3 = field_Hb.length + -1;
            }
            for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
                field_Hb[var1] = var0;
            }
        }
        field_Ib = "Please log in to access this feature.";
    }
}
