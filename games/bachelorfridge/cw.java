/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw extends sna {
    static js field_zb;
    private sna field_vb;
    private sna field_wb;
    private int field_Cb;
    private sna field_Bb;
    static sna field_yb;
    private sna field_Db;
    private sna field_Ab;
    private sna field_xb;

    final boolean f(int param0) {
        if (param0 <= 14) {
            return false;
        }
        return -1 != (this.field_Bb.field_ib ^ -1) ? true : false;
    }

    public static void h(int param0) {
        field_yb = null;
        field_zb = null;
        int var1 = -59 / ((param0 - 43) / 53);
    }

    final boolean f(byte param0) {
        if (this.field_vb.field_R != 0) {
          this.field_Cb = 20;
          return true;
        } else {
          if (0 != this.field_vb.field_ib) {
            L0: {
              if (-1 > (this.field_Cb ^ -1)) {
                this.field_Cb = this.field_Cb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Cb != 0) {
              if (param0 != 62) {
                field_yb = (sna) null;
                return false;
              } else {
                return false;
              }
            } else {
              this.field_Cb = 3;
              return true;
            }
          } else {
            if (param0 == 62) {
              return false;
            } else {
              field_yb = (sna) null;
              return false;
            }
          }
        }
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = -this.field_Bb.field_p + this.field_wb.field_p;
        if (param0 == 7409) {
          L0: {
            if (0 >= var6) {
              break L0;
            } else {
              var7 = this.field_Bb.field_rb;
              var8 = param2 - param3;
              var5 = (var6 / 2 + var8 * var7) / var6;
              break L0;
            }
          }
          if (!param1) {
            L1: {
              if (var5 <= -param3 + param2) {
                break L1;
              } else {
                var5 = -param3 + param2;
                break L1;
              }
            }
            if ((var5 ^ -1) <= -1) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L2: {
              if (0 > var5) {
                var5 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 - param3 >= var5) {
                break L3;
              } else {
                var5 = param2 - param3;
                break L3;
              }
            }
            return var5;
          }
        } else {
          L4: {
            this.a((byte) -100, 39, -69, -35);
            if (0 >= var6) {
              break L4;
            } else {
              var7 = this.field_Bb.field_rb;
              var8 = param2 - param3;
              var5 = (var6 / 2 + var8 * var7) / var6;
              break L4;
            }
          }
          if (!param1) {
            L5: {
              if (var5 <= -param3 + param2) {
                break L5;
              } else {
                var5 = -param3 + param2;
                break L5;
              }
            }
            if ((var5 ^ -1) <= -1) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L6: {
              if (0 > var5) {
                var5 = 0;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param2 - param3 >= var5) {
                break L7;
              } else {
                var5 = param2 - param3;
                break L7;
              }
            }
            return var5;
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          if (-1 != (this.field_Db.field_R ^ -1)) {
            this.field_Cb = 20;
            return true;
          } else {
            if (0 != this.field_Db.field_ib) {
              L0: {
                if ((this.field_Cb ^ -1) < -1) {
                  this.field_Cb = this.field_Cb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (this.field_Cb == 0) {
                this.field_Cb = 3;
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        String var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                var4 = (String) null;
                cw.a((String) null, (String) null, false);
                break L1;
              }
            }
            L2: {
              L3: {
                param1 = jm.a((byte) 75, param1, '_', "");
                var3 = vm.a(param0, (byte) 117);
                if (0 != (param1.indexOf(param0) ^ -1)) {
                  break L3;
                } else {
                  if (-1 == param1.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("cw.EA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        this.field_rb = param4;
        this.field_sb = param0;
        this.field_p = param7;
        this.field_kb = param2;
        this.a((byte) 29, param1, param3, param6);
        if (param5) {
            this.i(52);
        }
    }

    final boolean i(int param0) {
        int var2;
        var2 = -1 % ((param0 - 67) / 48);
        if (this.field_xb.field_R != 0) {
          this.field_Cb = 20;
          return true;
        } else {
          if (0 != this.field_xb.field_ib) {
            L0: {
              if ((this.field_Cb ^ -1) < -1) {
                this.field_Cb = this.field_Cb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Cb == 0) {
              if (this.field_Bb.field_hb + this.field_Bb.field_p + (this.field_Bb.field_I + this.field_Bb.field_M) > gd.field_m) {
                return false;
              } else {
                this.field_Cb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean g(int param0) {
        if (this.field_Ab.field_R == 0) {
          if (-1 != (this.field_Ab.field_ib ^ -1)) {
            L0: {
              if (this.field_Cb > 0) {
                this.field_Cb = this.field_Cb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (0 == this.field_Cb) {
              if (this.field_Bb.field_I + this.field_Bb.field_M <= gd.field_m) {
                if (param0 != 0) {
                  this.field_xb = (sna) null;
                  return false;
                } else {
                  return false;
                }
              } else {
                this.field_Cb = 3;
                return true;
              }
            } else {
              if (param0 != 0) {
                this.field_xb = (sna) null;
                return false;
              } else {
                return false;
              }
            }
          } else {
            if (param0 != 0) {
              this.field_xb = (sna) null;
              return false;
            } else {
              return false;
            }
          }
        } else {
          this.field_Cb = 20;
          return true;
        }
    }

    cw(long param0, sna param1, sna param2, sna param3, sna param4) {
        super(param0, (sna) null);
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
        sna var9 = null;
        sna var10 = null;
        try {
          L0: {
            this.field_Db = new sna(0L, param1);
            this.field_vb = new sna(0L, param2);
            this.a(-1, this.field_Db);
            this.a(-1, this.field_vb);
            this.field_wb = new sna(0L, (sna) null);
            this.a(-1, this.field_wb);
            this.field_Ab = new sna(0L, param3);
            this.field_xb = new sna(0L, param3);
            this.field_xb.field_qb = true;
            var9 = this.field_Ab;
            var10 = var9;
            var10.field_qb = true;
            this.field_wb.a(-1, this.field_Ab);
            this.field_wb.a(-1, this.field_xb);
            this.field_Bb = new sna(0L, param4);
            this.field_Bb.field_ub = true;
            this.field_wb.a(-1, this.field_Bb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("cw.<init>(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        sna var14;
        sna var15;
        sna var16;
        sna var17;
        sna var18;
        sna var19;
        sna stackIn_10_0 = null;
        sna stackIn_10_1 = null;
        sna stackIn_10_2 = null;
        sna stackIn_11_0 = null;
        sna stackIn_11_1 = null;
        sna stackIn_11_2 = null;
        int stackIn_11_3 = 0;
        sna stackIn_14_0 = null;
        sna stackIn_14_1 = null;
        sna stackIn_14_2 = null;
        sna stackIn_15_0 = null;
        sna stackIn_15_1 = null;
        sna stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        sna stackIn_27_0 = null;
        sna stackIn_27_1 = null;
        sna stackIn_27_2 = null;
        sna stackIn_28_0 = null;
        sna stackIn_28_1 = null;
        sna stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        sna stackIn_31_0 = null;
        sna stackIn_31_1 = null;
        sna stackIn_31_2 = null;
        sna stackIn_32_0 = null;
        sna stackIn_32_1 = null;
        sna stackIn_32_2 = null;
        int stackIn_32_3 = 0;
        L0: {
          if (this.field_p < 2 * this.field_sb) {
            var6 = this.field_p / 2;
            var5 = this.field_p / 2;
            break L0;
          } else {
            var5 = this.field_sb;
            var6 = -this.field_sb + this.field_p;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if ((param3 ^ -1) < -1) {
          L1: {
            var8 = param2 * var8 / param3;
            if (var8 >= this.field_sb) {
              break L1;
            } else {
              var8 = this.field_sb;
              break L1;
            }
          }
          L2: {
            if (var7 >= var8) {
              break L2;
            } else {
              var8 = var7;
              break L2;
            }
          }
          L3: {
            var9 = param3 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if ((var9 ^ -1) < -1) {
              var11 = (var9 / 2 + param1 * var10) / var9;
              break L3;
            } else {
              break L3;
            }
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Db;
          var14.field_rb = 0;
          var14.field_kb = 0;
          var14.field_sb = this.field_sb;
          var14.field_p = var5;
          var15 = this.field_vb;
          var15.field_sb = this.field_sb;
          var15.field_rb = var6;
          var15.field_p = -var6 + this.field_p;
          var15.field_kb = 0;
          var16 = this.field_wb;
          var16.field_p = var7;
          var16.field_rb = var5;
          var16.field_kb = 0;
          var16.field_sb = this.field_sb;
          var17 = this.field_Ab;
          var17.field_rb = 0;
          var17.field_p = var12;
          var17.field_sb = this.field_sb;
          var17.field_kb = 0;
          var18 = this.field_xb;
          var18.field_sb = this.field_sb;
          var18.field_kb = 0;
          var18.field_p = -var12 + var7;
          var18.field_rb = var12;
          if (param0 != 29) {
            L4: {
              this.field_Ab = (sna) null;
              var19 = this.field_Bb;
              var19.field_p = var8;
              var19.field_kb = 0;
              stackIn_31_0 = this.field_Db;

              stackIn_31_1 = this.field_vb;

              stackIn_31_2 = this.field_wb;

              if (param3 <= param2) {
                stackIn_32_0 = (sna) ((Object) stackIn_31_0);
                stackIn_32_1 = (sna) ((Object) stackIn_31_1);
                stackIn_32_2 = (sna) ((Object) stackIn_31_2);
                stackIn_32_3 = 0;
                break L4;
              } else {
                stackIn_32_0 = (sna) ((Object) stackIn_31_0);
                stackIn_32_1 = (sna) ((Object) stackIn_31_1);
                stackIn_32_2 = (sna) ((Object) stackIn_31_2);
                stackIn_32_3 = 1;
                break L4;
              }
            }
            stackIn_32_2.field_u = stackIn_32_3 != 0;
            stackIn_32_1.field_u = stackIn_32_3 != 0;
            stackIn_32_0.field_u = stackIn_32_3 != 0;
            var19.field_sb = this.field_sb;
            var19.field_rb = var11;
            return;
          } else {
            L5: {
              var19 = this.field_Bb;
              var19.field_p = var8;
              var19.field_kb = 0;
              stackIn_27_0 = this.field_Db;

              stackIn_27_1 = this.field_vb;

              stackIn_27_2 = this.field_wb;

              if (param3 <= param2) {
                stackIn_28_0 = (sna) ((Object) stackIn_27_0);
                stackIn_28_1 = (sna) ((Object) stackIn_27_1);
                stackIn_28_2 = (sna) ((Object) stackIn_27_2);
                stackIn_28_3 = 0;
                break L5;
              } else {
                stackIn_28_0 = (sna) ((Object) stackIn_27_0);
                stackIn_28_1 = (sna) ((Object) stackIn_27_1);
                stackIn_28_2 = (sna) ((Object) stackIn_27_2);
                stackIn_28_3 = 1;
                break L5;
              }
            }
            stackIn_28_2.field_u = stackIn_28_3 != 0;
            stackIn_28_1.field_u = stackIn_28_3 != 0;
            stackIn_28_0.field_u = stackIn_28_3 != 0;
            var19.field_sb = this.field_sb;
            var19.field_rb = var11;
            return;
          }
        } else {
          L6: {
            var9 = param3 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if ((var9 ^ -1) < -1) {
              var11 = (var9 / 2 + param1 * var10) / var9;
              break L6;
            } else {
              break L6;
            }
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Db;
          var14.field_rb = 0;
          var14.field_kb = 0;
          var14.field_sb = this.field_sb;
          var14.field_p = var5;
          var15 = this.field_vb;
          var15.field_sb = this.field_sb;
          var15.field_rb = var6;
          var15.field_p = -var6 + this.field_p;
          var15.field_kb = 0;
          var16 = this.field_wb;
          var16.field_p = var7;
          var16.field_rb = var5;
          var16.field_kb = 0;
          var16.field_sb = this.field_sb;
          var17 = this.field_Ab;
          var17.field_rb = 0;
          var17.field_p = var12;
          var17.field_sb = this.field_sb;
          var17.field_kb = 0;
          var18 = this.field_xb;
          var18.field_sb = this.field_sb;
          var18.field_kb = 0;
          var18.field_p = -var12 + var7;
          var18.field_rb = var12;
          if (param0 == 29) {
            L7: {
              var19 = this.field_Bb;
              var19.field_p = var8;
              var19.field_kb = 0;
              stackIn_14_0 = this.field_Db;

              stackIn_14_1 = this.field_vb;

              stackIn_14_2 = this.field_wb;

              if (param3 <= param2) {
                stackIn_15_0 = (sna) ((Object) stackIn_14_0);
                stackIn_15_1 = (sna) ((Object) stackIn_14_1);
                stackIn_15_2 = (sna) ((Object) stackIn_14_2);
                stackIn_15_3 = 0;
                break L7;
              } else {
                stackIn_15_0 = (sna) ((Object) stackIn_14_0);
                stackIn_15_1 = (sna) ((Object) stackIn_14_1);
                stackIn_15_2 = (sna) ((Object) stackIn_14_2);
                stackIn_15_3 = 1;
                break L7;
              }
            }
            stackIn_15_2.field_u = stackIn_15_3 != 0;
            stackIn_15_1.field_u = stackIn_15_3 != 0;
            stackIn_15_0.field_u = stackIn_15_3 != 0;
            var19.field_sb = this.field_sb;
            var19.field_rb = var11;
            return;
          } else {
            L8: {
              this.field_Ab = (sna) null;
              var19 = this.field_Bb;
              var19.field_p = var8;
              var19.field_kb = 0;
              stackIn_10_0 = this.field_Db;

              stackIn_10_1 = this.field_vb;

              stackIn_10_2 = this.field_wb;

              if (param3 <= param2) {
                stackIn_11_0 = (sna) ((Object) stackIn_10_0);
                stackIn_11_1 = (sna) ((Object) stackIn_10_1);
                stackIn_11_2 = (sna) ((Object) stackIn_10_2);
                stackIn_11_3 = 0;
                break L8;
              } else {
                stackIn_11_0 = (sna) ((Object) stackIn_10_0);
                stackIn_11_1 = (sna) ((Object) stackIn_10_1);
                stackIn_11_2 = (sna) ((Object) stackIn_10_2);
                stackIn_11_3 = 1;
                break L8;
              }
            }
            stackIn_11_2.field_u = stackIn_11_3 != 0;
            stackIn_11_1.field_u = stackIn_11_3 != 0;
            stackIn_11_0.field_u = stackIn_11_3 != 0;
            var19.field_sb = this.field_sb;
            var19.field_rb = var11;
            return;
          }
        }
    }

    cw(long param0, cw param1) {
        this(param0, param1.field_Db, param1.field_vb, param1.field_Ab, param1.field_Bb);
    }

    static {
    }
}
