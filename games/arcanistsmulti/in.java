/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in extends kc {
    private kc field_Ib;
    static kc field_Jb;
    private kc field_Cb;
    private kc field_Mb;
    static co field_Gb;
    private int field_Bb;
    static java.awt.Frame field_Eb;
    private kc field_Lb;
    static byte[] field_Nb;
    static int[] field_Fb;
    private kc field_Hb;
    static String field_Kb;
    private kc field_Db;

    final boolean e(int param0) {
        int var2 = 0;
        if (((in) this).field_Hb.field_U != 0) {
          ((in) this).field_Bb = 20;
          return true;
        } else {
          if (0 != ((in) this).field_Hb.field_P) {
            L0: {
              if (0 < ((in) this).field_Bb) {
                ((in) this).field_Bb = ((in) this).field_Bb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((in) this).field_Bb == 0) {
              if (me.field_I >= ((in) this).field_Cb.field_nb - -((in) this).field_Cb.field_bb) {
                var2 = 83 % ((param0 - -69) / 52);
                return false;
              } else {
                ((in) this).field_Bb = 3;
                return true;
              }
            } else {
              var2 = 83 % ((param0 - -69) / 52);
              return false;
            }
          } else {
            var2 = 83 % ((param0 - -69) / 52);
            return false;
          }
        }
    }

    final boolean f(byte param0) {
        if (((in) this).field_Mb.field_U != 0) {
          ((in) this).field_Bb = 20;
          return true;
        } else {
          if (0 != ((in) this).field_Mb.field_P) {
            if (-1 <= ((in) this).field_Bb) {
              if (((in) this).field_Bb != 0) {
                if (param0 != 59) {
                  field_Jb = null;
                  return false;
                } else {
                  return false;
                }
              } else {
                ((in) this).field_Bb = 3;
                return true;
              }
            } else {
              ((in) this).field_Bb = ((in) this).field_Bb - 1;
              if (-1 != ((in) this).field_Bb) {
                if (param0 == 59) {
                  return false;
                } else {
                  field_Jb = null;
                  return false;
                }
              } else {
                ((in) this).field_Bb = 3;
                return true;
              }
            }
          } else {
            if (param0 != 59) {
              field_Jb = null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final boolean f(int param0) {
        int var2 = -50 / ((param0 - 44) / 41);
        return ((in) this).field_Cb.field_P != 0 ? true : false;
    }

    in(long param0, in param1) {
        this(param0, param1.field_Mb, param1.field_Ib, param1.field_Hb, param1.field_Cb);
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
        kc var14 = null;
        kc var15 = null;
        kc var16 = null;
        kc var17 = null;
        kc var18 = null;
        kc var19 = null;
        kc stackIn_10_0 = null;
        kc stackIn_10_1 = null;
        kc stackIn_10_2 = null;
        kc stackIn_11_0 = null;
        kc stackIn_11_1 = null;
        kc stackIn_11_2 = null;
        kc stackIn_12_0 = null;
        kc stackIn_12_1 = null;
        kc stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        kc stackIn_24_0 = null;
        kc stackIn_24_1 = null;
        kc stackIn_24_2 = null;
        kc stackIn_25_0 = null;
        kc stackIn_25_1 = null;
        kc stackIn_25_2 = null;
        kc stackIn_26_0 = null;
        kc stackIn_26_1 = null;
        kc stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        kc stackOut_23_0 = null;
        kc stackOut_23_1 = null;
        kc stackOut_23_2 = null;
        kc stackOut_25_0 = null;
        kc stackOut_25_1 = null;
        kc stackOut_25_2 = null;
        int stackOut_25_3 = 0;
        kc stackOut_24_0 = null;
        kc stackOut_24_1 = null;
        kc stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        kc stackOut_9_0 = null;
        kc stackOut_9_1 = null;
        kc stackOut_9_2 = null;
        kc stackOut_11_0 = null;
        kc stackOut_11_1 = null;
        kc stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        kc stackOut_10_0 = null;
        kc stackOut_10_1 = null;
        kc stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        L0: {
          if (((in) this).field_x * 2 <= ((in) this).field_I) {
            var6 = -((in) this).field_x + ((in) this).field_I;
            var5 = ((in) this).field_x;
            break L0;
          } else {
            var6 = ((in) this).field_I / 2;
            var5 = ((in) this).field_I / 2;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (0 < param3) {
          L1: {
            var8 = var8 * param1 / param3;
            if (var8 < ((in) this).field_x) {
              var8 = ((in) this).field_x;
              break L1;
            } else {
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
            var9 = param3 - param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L3;
            } else {
              break L3;
            }
          }
          var12 = var11 - -(var8 / 2);
          var14 = ((in) this).field_Mb;
          var14.field_db = 0;
          var14.field_T = 0;
          var14.field_I = var5;
          var14.field_x = ((in) this).field_x;
          var15 = ((in) this).field_Ib;
          var15.field_x = ((in) this).field_x;
          var15.field_I = ((in) this).field_I - var6;
          var15.field_db = var6;
          var15.field_T = 0;
          var16 = ((in) this).field_Lb;
          var16.field_x = ((in) this).field_x;
          var16.field_I = var7;
          var16.field_db = var5;
          var16.field_T = 0;
          var17 = ((in) this).field_Hb;
          var17.field_I = var12;
          var17.field_T = 0;
          var17.field_db = 0;
          var17.field_x = ((in) this).field_x;
          var18 = ((in) this).field_Db;
          var18.field_T = 0;
          var18.field_db = var12;
          if (param0 > 87) {
            L4: {
              var18.field_x = ((in) this).field_x;
              var18.field_I = var7 + -var12;
              var19 = ((in) this).field_Cb;
              var19.field_x = ((in) this).field_x;
              var19.field_T = 0;
              stackOut_23_0 = ((in) this).field_Mb;
              stackOut_23_1 = ((in) this).field_Ib;
              stackOut_23_2 = ((in) this).field_Lb;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              if (param1 >= param3) {
                stackOut_25_0 = (kc) (Object) stackIn_25_0;
                stackOut_25_1 = (kc) (Object) stackIn_25_1;
                stackOut_25_2 = (kc) (Object) stackIn_25_2;
                stackOut_25_3 = 0;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                stackIn_26_3 = stackOut_25_3;
                break L4;
              } else {
                stackOut_24_0 = (kc) (Object) stackIn_24_0;
                stackOut_24_1 = (kc) (Object) stackIn_24_1;
                stackOut_24_2 = (kc) (Object) stackIn_24_2;
                stackOut_24_3 = 1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_26_2 = stackOut_24_2;
                stackIn_26_3 = stackOut_24_3;
                break L4;
              }
            }
            stackIn_26_2.field_ub = stackIn_26_3 != 0;
            stackIn_26_1.field_ub = stackIn_26_3 != 0;
            stackIn_26_0.field_ub = stackIn_26_3 != 0;
            var19.field_db = var11;
            var19.field_I = var8;
            return;
          } else {
            return;
          }
        } else {
          L5: {
            var9 = param3 - param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L5;
            } else {
              break L5;
            }
          }
          var12 = var11 - -(var8 / 2);
          var14 = ((in) this).field_Mb;
          var14.field_db = 0;
          var14.field_T = 0;
          var14.field_I = var5;
          var14.field_x = ((in) this).field_x;
          var15 = ((in) this).field_Ib;
          var15.field_x = ((in) this).field_x;
          var15.field_I = ((in) this).field_I - var6;
          var15.field_db = var6;
          var15.field_T = 0;
          var16 = ((in) this).field_Lb;
          var16.field_x = ((in) this).field_x;
          var16.field_I = var7;
          var16.field_db = var5;
          var16.field_T = 0;
          var17 = ((in) this).field_Hb;
          var17.field_I = var12;
          var17.field_T = 0;
          var17.field_db = 0;
          var17.field_x = ((in) this).field_x;
          var18 = ((in) this).field_Db;
          var18.field_T = 0;
          var18.field_db = var12;
          if (param0 > 87) {
            L6: {
              var18.field_x = ((in) this).field_x;
              var18.field_I = var7 + -var12;
              var19 = ((in) this).field_Cb;
              var19.field_x = ((in) this).field_x;
              var19.field_T = 0;
              stackOut_9_0 = ((in) this).field_Mb;
              stackOut_9_1 = ((in) this).field_Ib;
              stackOut_9_2 = ((in) this).field_Lb;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              if (param1 >= param3) {
                stackOut_11_0 = (kc) (Object) stackIn_11_0;
                stackOut_11_1 = (kc) (Object) stackIn_11_1;
                stackOut_11_2 = (kc) (Object) stackIn_11_2;
                stackOut_11_3 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L6;
              } else {
                stackOut_10_0 = (kc) (Object) stackIn_10_0;
                stackOut_10_1 = (kc) (Object) stackIn_10_1;
                stackOut_10_2 = (kc) (Object) stackIn_10_2;
                stackOut_10_3 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                break L6;
              }
            }
            stackIn_12_2.field_ub = stackIn_12_3 != 0;
            stackIn_12_1.field_ub = stackIn_12_3 != 0;
            stackIn_12_0.field_ub = stackIn_12_3 != 0;
            var19.field_db = var11;
            var19.field_I = var8;
            return;
          } else {
            return;
          }
        }
    }

    public static void g() {
        field_Jb = null;
        field_Nb = null;
        field_Kb = null;
        field_Fb = null;
        field_Gb = null;
        field_Eb = null;
    }

    in(long param0, kc param1, kc param2, kc param3, kc param4) {
        super(param0, (kc) null);
        RuntimeException var7 = null;
        kc var9 = null;
        kc var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((in) this).field_Mb = new kc(0L, param1);
            ((in) this).field_Ib = new kc(0L, param2);
            ((in) this).a(((in) this).field_Mb, 116);
            ((in) this).a(((in) this).field_Ib, 105);
            ((in) this).field_Lb = new kc(0L, (kc) null);
            ((in) this).a(((in) this).field_Lb, 107);
            ((in) this).field_Hb = new kc(0L, param3);
            ((in) this).field_Db = new kc(0L, param3);
            var9 = ((in) this).field_Hb;
            var10 = var9;
            ((in) this).field_Db.field_yb = true;
            var10.field_yb = true;
            ((in) this).field_Lb.a(((in) this).field_Hb, 72);
            ((in) this).field_Lb.a(((in) this).field_Db, 83);
            ((in) this).field_Cb = new kc(0L, param4);
            ((in) this).field_Cb.field_H = true;
            ((in) this).field_Lb.a(((in) this).field_Cb, 89);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("in.<init>(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final int a(int param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var5 = 0;
        var6 = -((in) this).field_Cb.field_I + ((in) this).field_Lb.field_I;
        if (param3 == -55) {
          L0: {
            if (var6 > 0) {
              var7 = ((in) this).field_Cb.field_db;
              var8 = -param0 + param1;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (param2) {
            L1: {
              if (var5 >= 0) {
                break L1;
              } else {
                var5 = 0;
                break L1;
              }
            }
            if (param1 + -param0 >= var5) {
              return var5;
            } else {
              var5 = param1 - param0;
              return var5;
            }
          } else {
            L2: {
              if (var5 <= param1 + -param0) {
                break L2;
              } else {
                var5 = -param0 + param1;
                break L2;
              }
            }
            if (var5 < 0) {
              var5 = 0;
              return var5;
            } else {
              return var5;
            }
          }
        } else {
          L3: {
            ((in) this).a(-125, 112, -79, 37);
            if (var6 > 0) {
              var7 = ((in) this).field_Cb.field_db;
              var8 = -param0 + param1;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L3;
            } else {
              break L3;
            }
          }
          if (param2) {
            L4: {
              if (var5 >= 0) {
                break L4;
              } else {
                var5 = 0;
                break L4;
              }
            }
            if (param1 + -param0 >= var5) {
              return var5;
            } else {
              var5 = param1 - param0;
              return var5;
            }
          } else {
            L5: {
              if (var5 <= param1 + -param0) {
                break L5;
              } else {
                var5 = -param0 + param1;
                break L5;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1) {
          return;
        } else {
          ((in) this).field_T = param7;
          ((in) this).field_x = param5;
          ((in) this).field_db = param0;
          ((in) this).field_I = param2;
          ((in) this).a(89, param6, param4, param3);
          return;
        }
    }

    final boolean e(boolean param0) {
        if (!param0) {
            boolean discarded$5 = ((in) this).f(116);
            if (((in) this).field_Ib.field_U != 0) {
                ((in) this).field_Bb = 20;
                return true;
            }
            if (0 == ((in) this).field_Ib.field_P) {
                return false;
            }
            if (((in) this).field_Bb <= 0) {
                if (((in) this).field_Bb != 0) {
                    return false;
                }
                ((in) this).field_Bb = 3;
                return true;
            }
            ((in) this).field_Bb = ((in) this).field_Bb - 1;
            if (!(((in) this).field_Bb != 0)) {
                ((in) this).field_Bb = 3;
                return true;
            }
            return false;
        }
        if (((in) this).field_Ib.field_U != 0) {
            ((in) this).field_Bb = 20;
            return true;
        }
        if (0 != ((in) this).field_Ib.field_P) {
            if (((in) this).field_Bb > 0) {
                ((in) this).field_Bb = ((in) this).field_Bb - 1;
                if (!(((in) this).field_Bb != 0)) {
                    ((in) this).field_Bb = 3;
                    return true;
                }
                return false;
            }
            if (((in) this).field_Bb != 0) {
                return false;
            }
            ((in) this).field_Bb = 3;
            return true;
        }
        return false;
    }

    final boolean f(boolean param0) {
        if (((in) this).field_Db.field_U != 0) {
          ((in) this).field_Bb = 20;
          return true;
        } else {
          if (((in) this).field_Db.field_P != 0) {
            L0: {
              if (0 < ((in) this).field_Bb) {
                ((in) this).field_Bb = ((in) this).field_Bb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((in) this).field_Bb == 0) {
              if (me.field_I < ((in) this).field_Cb.field_B + ((in) this).field_Cb.field_bb + ((in) this).field_Cb.field_nb - -((in) this).field_Cb.field_I) {
                if (!param0) {
                  field_Gb = null;
                  return false;
                } else {
                  return false;
                }
              } else {
                ((in) this).field_Bb = 3;
                return true;
              }
            } else {
              if (!param0) {
                field_Gb = null;
                return false;
              } else {
                return false;
              }
            }
          } else {
            if (!param0) {
              field_Gb = null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = new int[]{33, 34, 35};
        field_Kb = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available you will lose a third of your health (<%1>). If you fail to do this within the time limit you will lose half of your health! (<%0>)";
    }
}
