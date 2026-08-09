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
        if (-1 != (this.field_Cb.field_R ^ -1)) {
            this.field_Ab = 20;
            return true;
        }
        if (this.field_Cb.field_ib != param0) {
            if (!((this.field_Ab ^ -1) >= -1)) {
                this.field_Ab = this.field_Ab - 1;
            }
            if (-1 == (this.field_Ab ^ -1)) {
                if (gd.field_m >= this.field_wb.field_M + this.field_wb.field_I) {
                    return false;
                }
                this.field_Ab = 3;
                return true;
            }
        }
        return false;
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          var6 = this.field_zb.field_sb + -this.field_wb.field_sb;
          if (var6 <= 0) {
            break L0;
          } else {
            var7 = this.field_wb.field_kb;
            var8 = param3 + -param2;
            var5 = (var7 * var8 - -(var6 / 2)) / var6;
            break L0;
          }
        }
        L1: {
          if (!param1) {
            L2: {
              if (var5 > param3 - param2) {
                var5 = param3 - param2;
                break L2;
              } else {
                break L2;
              }
            }
            if (var5 >= 0) {
              break L1;
            } else {
              var5 = 0;
              break L1;
            }
          } else {
            L3: {
              if (0 <= var5) {
                break L3;
              } else {
                var5 = 0;
                break L3;
              }
            }
            if (-param2 + param3 >= var5) {
              break L1;
            } else {
              var5 = param3 - param2;
              break L1;
            }
          }
        }
        if (param0 <= -27) {
          return var5;
        } else {
          return 124;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        sna stackIn_17_0 = null;
        sna stackIn_17_1 = null;
        sna stackIn_17_2 = null;
        sna stackIn_18_0 = null;
        sna stackIn_18_1 = null;
        sna stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        sna var15;
        sna var16;
        sna var17;
        sna var18;
        sna var19;
        sna var20;
        L0: {
          var14 = BachelorFridge.field_y;
          if (this.field_sb >= this.field_p * 2) {
            var5 = this.field_p;
            var6 = this.field_sb + -this.field_p;
            break L0;
          } else {
            var6 = this.field_sb / 2;
            var5 = this.field_sb / 2;
            break L0;
          }
        }
        L1: {
          var7 = -var5 + var6;
          var8 = var7;
          if (param1 < param0) {
            L2: {
              var8 = var8 * param1 / param0;
              if (var8 >= this.field_p) {
                break L2;
              } else {
                var8 = this.field_p;
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
          var15 = this.field_Fb;
          var15.field_kb = 0;
          var15.field_rb = 0;
          var15.field_sb = var5;
          var15.field_p = this.field_p;
          var16 = this.field_Eb;
          var16.field_kb = var6;
          if (param3 < -2) {
            break L4;
          } else {
            this.field_vb = true;
            break L4;
          }
        }
        L5: {
          var16.field_p = this.field_p;
          var16.field_rb = 0;
          var16.field_sb = -var6 + this.field_sb;
          var17 = this.field_zb;
          var17.field_kb = var5;
          var17.field_sb = var7;
          var17.field_rb = 0;
          var17.field_p = this.field_p;
          var18 = this.field_Cb;
          var18.field_kb = 0;
          var18.field_p = this.field_p;
          var18.field_rb = 0;
          var18.field_sb = var12;
          var19 = this.field_Gb;
          var19.field_p = this.field_p;
          var19.field_kb = var12;
          var19.field_rb = 0;
          var19.field_sb = var7 - var12;
          var20 = this.field_wb;
          var20.field_kb = var11;
          stackIn_17_0 = this.field_Fb;

          stackIn_17_1 = this.field_Eb;

          stackIn_17_2 = this.field_zb;

          if (param1 >= param0) {
            stackIn_18_0 = (sna) ((Object) stackIn_17_0);
            stackIn_18_1 = (sna) ((Object) stackIn_17_1);
            stackIn_18_2 = (sna) ((Object) stackIn_17_2);
            stackIn_18_3 = 0;
            break L5;
          } else {
            stackIn_18_0 = (sna) ((Object) stackIn_17_0);
            stackIn_18_1 = (sna) ((Object) stackIn_17_1);
            stackIn_18_2 = (sna) ((Object) stackIn_17_2);
            stackIn_18_3 = 1;
            break L5;
          }
        }
        stackIn_18_2.field_u = stackIn_18_3 != 0;
        stackIn_18_1.field_u = stackIn_18_3 != 0;
        stackIn_18_0.field_u = stackIn_18_3 != 0;
        var20.field_p = this.field_p;
        var20.field_rb = 0;
        var20.field_sb = var8;
    }

    gba(String param0, sna param1, kv param2, kv param3, sna param4, sna param5, boolean param6) {
        this(ew.a((byte) 8, (CharSequence) ((Object) param0)), param1, param2, param3, param4, param5, param6);
    }

    final boolean f(byte param0) {
        if (param0 >= -117) {
            return false;
        }
        return 0 != this.field_wb.field_ib ? true : false;
    }

    final void b(int param0, int param1, int param2, byte param3) {
        if (!this.field_vb) {
            this.a(param0, param2, param1, (byte) -32);
        } else {
            this.b(param0, param2, true, param1);
        }
        if (param3 != -117) {
            field_Hb = (int[]) null;
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
        try {
            this.field_Fb.field_v = param2;
            this.field_Eb.field_v = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gba.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    gba(long param0, gba param1, boolean param2) {
        this(param0, param1.field_Fb, param1.field_Eb, param1.field_Cb, param1.field_wb, param2);
    }

    final boolean h(int param0) {
        if (this.field_Gb.field_R != param0) {
            this.field_Ab = 20;
            return true;
        }
        if (0 != this.field_Gb.field_ib) {
            if (!((this.field_Ab ^ -1) >= -1)) {
                this.field_Ab = this.field_Ab - 1;
            }
            if (this.field_Ab == 0) {
                if (gd.field_m < this.field_wb.field_p + (this.field_wb.field_M + this.field_wb.field_I) + this.field_wb.field_hb) {
                    return false;
                }
                this.field_Ab = 3;
                return true;
            }
        }
        return false;
    }

    final boolean g(int param0) {
        if (!(this.field_Fb.field_R == 0)) {
            this.field_Ab = 20;
            return true;
        }
        if (this.field_Fb.field_ib != 0) {
            if ((this.field_Ab ^ -1) < -1) {
                this.field_Ab = this.field_Ab - 1;
            }
            if (this.field_Ab == 0) {
                this.field_Ab = 3;
                return true;
            }
        }
        if (param0 != 25910) {
            this.field_Cb = (sna) null;
            return false;
        }
        return false;
    }

    final boolean b(boolean param0) {
        if (!(this.field_Eb.field_R == 0)) {
            this.field_Ab = 20;
            return true;
        }
        if (param0) {
            this.f(-108);
        }
        if (this.field_Eb.field_ib != 0) {
            if (!(this.field_Ab <= 0)) {
                this.field_Ab = this.field_Ab - 1;
            }
            if (0 == this.field_Ab) {
                this.field_Ab = 3;
                return true;
            }
        }
        return false;
    }

    private final void b(int param0, int param1, boolean param2, int param3) {
        sna stackIn_17_0 = null;
        sna stackIn_17_1 = null;
        sna stackIn_17_2 = null;
        sna stackIn_18_0 = null;
        sna stackIn_18_1 = null;
        sna stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        sna var15;
        sna var16;
        sna var17;
        sna var18;
        sna var19;
        sna var20;
        L0: {
          var14 = BachelorFridge.field_y;
          if (2 * this.field_sb > this.field_p) {
            var6 = this.field_p / 2;
            var5 = this.field_p / 2;
            break L0;
          } else {
            var6 = -this.field_sb + this.field_p;
            var5 = this.field_sb;
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
              if (this.field_sb <= var8) {
                break L2;
              } else {
                var8 = this.field_sb;
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
          var15 = this.field_Fb;
          var15.field_p = var5;
          var15.field_kb = 0;
          var15.field_rb = 0;
          var15.field_sb = this.field_sb;
          var16 = this.field_Eb;
          var16.field_kb = 0;
          var16.field_p = this.field_p + -var6;
          var16.field_sb = this.field_sb;
          var16.field_rb = var6;
          var17 = this.field_zb;
          var17.field_sb = this.field_sb;
          var17.field_rb = var5;
          var17.field_kb = 0;
          if (param2) {
            break L4;
          } else {
            this.field_vb = true;
            break L4;
          }
        }
        L5: {
          var17.field_p = var7;
          var18 = this.field_Cb;
          var18.field_kb = 0;
          var18.field_sb = this.field_sb;
          var18.field_p = var12;
          var18.field_rb = 0;
          var19 = this.field_Gb;
          var19.field_sb = this.field_sb;
          var19.field_kb = 0;
          var19.field_p = -var12 + var7;
          var19.field_rb = var12;
          var20 = this.field_wb;
          var20.field_p = var8;
          var20.field_rb = var11;
          var20.field_sb = this.field_sb;
          stackIn_17_0 = this.field_Fb;

          stackIn_17_1 = this.field_Eb;

          stackIn_17_2 = this.field_zb;

          if (param0 <= param1) {
            stackIn_18_0 = (sna) ((Object) stackIn_17_0);
            stackIn_18_1 = (sna) ((Object) stackIn_17_1);
            stackIn_18_2 = (sna) ((Object) stackIn_17_2);
            stackIn_18_3 = 0;
            break L5;
          } else {
            stackIn_18_0 = (sna) ((Object) stackIn_17_0);
            stackIn_18_1 = (sna) ((Object) stackIn_17_1);
            stackIn_18_2 = (sna) ((Object) stackIn_17_2);
            stackIn_18_3 = 1;
            break L5;
          }
        }
        stackIn_18_2.field_u = stackIn_18_3 != 0;
        stackIn_18_1.field_u = stackIn_18_3 != 0;
        stackIn_18_0.field_u = stackIn_18_3 != 0;
        var20.field_kb = 0;
    }

    private gba(long param0, sna param1, sna param2, sna param3, sna param4, boolean param5) {
        super(param0, (sna) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        sna var10 = null;
        sna var11 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((gba) (this)).field_vb = stackIn_4_1 != 0;
            this.field_Fb = new sna(0L, param1);
            this.field_Eb = new sna(0L, param2);
            this.a(-1, this.field_Fb);
            this.a(-1, this.field_Eb);
            this.field_zb = new sna(0L, (sna) null);
            this.a(-1, this.field_zb);
            this.field_Cb = new sna(0L, param3);
            this.field_Gb = new sna(0L, param3);
            var10 = this.field_Cb;
            var11 = var10;
            this.field_Gb.field_qb = true;
            var11.field_qb = true;
            this.field_zb.a(-1, this.field_Cb);
            this.field_zb.a(-1, this.field_Gb);
            this.field_wb = new sna(0L, param4);
            this.field_wb.field_ub = true;
            this.field_zb.a(-1, this.field_wb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("gba.<init>(").append(param0).append(',');

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
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_18_2 + ',' + param5 + ')');
        }
    }

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          var6 = -this.field_wb.field_p + this.field_zb.field_p;
          if (-1 > (var6 ^ -1)) {
            var7 = this.field_wb.field_rb;
            var8 = -param2 + param3;
            var5 = (var8 * var7 + var6 / 2) / var6;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0) {
            L2: {
              if (-1 >= (var5 ^ -1)) {
                break L2;
              } else {
                var5 = 0;
                break L2;
              }
            }
            if (-param2 + param3 < var5) {
              var5 = param3 - param2;
              break L1;
            } else {
              break L1;
            }
          } else {
            L3: {
              if (param3 + -param2 >= var5) {
                break L3;
              } else {
                var5 = param3 - param2;
                break L3;
              }
            }
            if (0 <= var5) {
              break L1;
            } else {
              var5 = 0;
              break L1;
            }
          }
        }
        L4: {
          if (param1 >= 15) {
            break L4;
          } else {
            field_xb = (kv) null;
            break L4;
          }
        }
        return var5;
    }

    static {
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
