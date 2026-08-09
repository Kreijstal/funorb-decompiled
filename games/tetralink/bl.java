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
        return 0 != this.field_Rb.field_T ? true : false;
    }

    public static void e(byte param0) {
        field_Nb = null;
        field_Ub = null;
        if (param0 < 115) {
            bl.d(true);
        }
        field_Ob = (int[][]) null;
        field_Lb = null;
        field_Qb = null;
    }

    final boolean d(byte param0) {
        if (-1 != (this.field_Pb.field_F ^ -1)) {
            this.field_Tb = 20;
            return true;
        }
        if (!(this.field_Pb.field_T == 0)) {
            if (0 < this.field_Tb) {
                this.field_Tb = this.field_Tb - 1;
            }
            if (0 == this.field_Tb) {
                if (!(this.field_Rb.field_Db + this.field_Rb.field_z <= a.field_a)) {
                    this.field_Tb = 3;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          L0: {
            L1: {
              if (param17 == -11842) {
                break L1;
              } else {
                field_Qb = (hl) null;
                break L1;
              }
            }
            ti.a(param19, (byte) 63, param14, param4, param18);
            vg.a((byte) 53, param18);
            em.a(param9, param16, param5, param8, param1, param2, param0, param18, param6, param10, 109, param7, param15, param13, param12);
            r.a(param18, param3, true, param11);
            ma.c(param17 ^ -19985);
            pd.b(false);
            ch.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var20);

            stackIn_6_1 = new StringBuilder().append("bl.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L13;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L14;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L15;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

            if (param19 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L16;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L16;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_49_2 + ')');
        }
    }

    bl(long param0, hl param1, hl param2, hl param3, hl param4) {
        super(param0, (hl) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        hl var9 = null;
        hl var10 = null;
        try {
          L0: {
            this.field_Vb = new hl(0L, param1);
            this.field_Yb = new hl(0L, param2);
            this.a((byte) -98, this.field_Vb);
            this.a((byte) -124, this.field_Yb);
            this.field_Wb = new hl(0L, (hl) null);
            this.a((byte) 40, this.field_Wb);
            this.field_Pb = new hl(0L, param3);
            this.field_Sb = new hl(0L, param3);
            var9 = this.field_Pb;
            var10 = var9;
            this.field_Sb.field_Cb = true;
            var10.field_Cb = true;
            this.field_Wb.a((byte) 51, this.field_Pb);
            this.field_Wb.a((byte) 83, this.field_Sb);
            this.field_Rb = new hl(0L, param4);
            this.field_Rb.field_qb = true;
            this.field_Wb.a((byte) 51, this.field_Rb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("bl.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        this.field_Hb = param3;
        if (!param5) {
            bl.e((byte) 60);
        }
        this.field_yb = param2;
        this.field_R = param1;
        this.field_M = param0;
        this.a(80, param6, param4, param7);
    }

    bl(long param0, bl param1) {
        this(param0, param1.field_Vb, param1.field_Yb, param1.field_Pb, param1.field_Rb);
    }

    final void a(int param0, int param1, int param2, int param3) {
        hl stackIn_16_0 = null;
        hl stackIn_16_1 = null;
        hl stackIn_16_2 = null;
        hl stackIn_17_0 = null;
        hl stackIn_17_1 = null;
        hl stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        hl var14;
        hl var15;
        hl var16;
        hl var17;
        hl var18;
        hl var19;
        L0: {
          if (this.field_R < this.field_Hb * 2) {
            var6 = this.field_R / 2;
            var5 = this.field_R / 2;
            break L0;
          } else {
            var6 = this.field_R + -this.field_Hb;
            var5 = this.field_Hb;
            break L0;
          }
        }
        L1: {
          var7 = var6 - var5;
          var8 = var7;
          if (0 < param2) {
            L2: {
              var8 = param3 * var8 / param2;
              if (this.field_Hb > var8) {
                var8 = this.field_Hb;
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
            field_Ob = (int[][]) null;
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
          var14 = this.field_Vb;
          var14.field_Hb = this.field_Hb;
          var14.field_R = var5;
          var14.field_yb = 0;
          var14.field_M = 0;
          var15 = this.field_Yb;
          var15.field_yb = var6;
          var15.field_Hb = this.field_Hb;
          var15.field_M = 0;
          var15.field_R = this.field_R - var6;
          var16 = this.field_Wb;
          var16.field_M = 0;
          var16.field_yb = var5;
          var16.field_Hb = this.field_Hb;
          var16.field_R = var7;
          var17 = this.field_Pb;
          var17.field_yb = 0;
          var17.field_M = 0;
          var17.field_R = var12;
          var17.field_Hb = this.field_Hb;
          var18 = this.field_Sb;
          var18.field_Hb = this.field_Hb;
          var18.field_R = var7 + -var12;
          var18.field_yb = var12;
          var18.field_M = 0;
          var19 = this.field_Rb;
          var19.field_Hb = this.field_Hb;
          var19.field_M = 0;
          var19.field_yb = var11;
          stackIn_16_0 = this.field_Vb;

          stackIn_16_1 = this.field_Yb;

          stackIn_16_2 = this.field_Wb;

          if (param3 >= param2) {
            stackIn_17_0 = (hl) ((Object) stackIn_16_0);
            stackIn_17_1 = (hl) ((Object) stackIn_16_1);
            stackIn_17_2 = (hl) ((Object) stackIn_16_2);
            stackIn_17_3 = 0;
            break L5;
          } else {
            stackIn_17_0 = (hl) ((Object) stackIn_16_0);
            stackIn_17_1 = (hl) ((Object) stackIn_16_1);
            stackIn_17_2 = (hl) ((Object) stackIn_16_2);
            stackIn_17_3 = 1;
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
            field_Ub = (int[]) null;
        }
        return pj.field_f.field_Kb;
    }

    final boolean c(boolean param0) {
        if (!(-1 == (this.field_Vb.field_F ^ -1))) {
            this.field_Tb = 20;
            return true;
        }
        if (this.field_Vb.field_T != 0) {
            if (this.field_Tb > 0) {
                this.field_Tb = this.field_Tb - 1;
            }
            if (!(this.field_Tb != 0)) {
                this.field_Tb = 3;
                return true;
            }
        }
        if (!param0) {
            return true;
        }
        return false;
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = param2;
          var6 = -this.field_Rb.field_R + this.field_Wb.field_R;
          if (var6 > 0) {
            var7 = this.field_Rb.field_yb;
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
            field_Lb = (oh) null;
        }
        if (!(this.field_Yb.field_F == 0)) {
            this.field_Tb = 20;
            return true;
        }
        if (this.field_Yb.field_T != 0) {
            if (this.field_Tb > 0) {
                this.field_Tb = this.field_Tb - 1;
            }
            if (this.field_Tb != 0) {
                return false;
            }
            this.field_Tb = 3;
            return true;
        }
        return false;
    }

    final boolean h(int param0) {
        if (param0 >= -25) {
            this.a(-125, 94, -48, 36, 74, false, -16, 123);
        }
        if (!(-1 == (this.field_Sb.field_F ^ -1))) {
            this.field_Tb = 20;
            return true;
        }
        if (0 != this.field_Sb.field_T) {
            if (!(this.field_Tb <= 0)) {
                this.field_Tb = this.field_Tb - 1;
            }
            if (this.field_Tb == 0) {
                if (this.field_Rb.field_z - -this.field_Rb.field_Db + this.field_Rb.field_R - -this.field_Rb.field_mb > a.field_a) {
                    return false;
                }
                this.field_Tb = 3;
                return true;
            }
        }
        return false;
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_Ub = new int[256];
            field_Mb = 0;
            var1 = 0;
            L0: while (true) {
              if ((var1 ^ -1) <= -257) {
                field_Xb = 0;
                field_Kb = 2;
                break $cfr$clinit;
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
}
