/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends mh {
    private mh field_ac;
    static String field_Qb;
    private int field_Tb;
    private mh field_Yb;
    private mh field_Zb;
    static int[] field_Pb;
    static sp field_Ub;
    private mh field_Vb;
    private mh field_Wb;
    static String field_Rb;
    private mh field_Xb;
    static int[] field_Sb;

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = -128 % ((-55 - param3) / 47);
        ((fj) this).field_cb = param2;
        ((fj) this).field_Ib = param4;
        ((fj) this).field_zb = param7;
        ((fj) this).field_P = param0;
        ((fj) this).a(-98, param6, param5, param1);
    }

    final boolean j(int param0) {
        if (((fj) this).field_Zb.field_L != 0) {
          ((fj) this).field_Tb = 20;
          return true;
        } else {
          if (0 != ((fj) this).field_Zb.field_Ob) {
            if (((fj) this).field_Tb <= 0) {
              if (((fj) this).field_Tb != 0) {
                if (param0 != 2) {
                  boolean discarded$5 = ((fj) this).i(36);
                  return false;
                } else {
                  return false;
                }
              } else {
                if (((fj) this).field_Vb.field_db + ((fj) this).field_Vb.field_Db <= po.field_a) {
                  if (param0 != 2) {
                    boolean discarded$6 = ((fj) this).i(36);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  ((fj) this).field_Tb = 3;
                  return true;
                }
              }
            } else {
              ((fj) this).field_Tb = ((fj) this).field_Tb - 1;
              if (((fj) this).field_Tb == 0) {
                if (((fj) this).field_Vb.field_db + ((fj) this).field_Vb.field_Db > po.field_a) {
                  ((fj) this).field_Tb = 3;
                  return true;
                } else {
                  if (param0 != 2) {
                    boolean discarded$7 = ((fj) this).i(36);
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                if (param0 != 2) {
                  boolean discarded$8 = ((fj) this).i(36);
                  return false;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (param0 != 2) {
              boolean discarded$9 = ((fj) this).i(36);
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        wd.field_w.a(param2, 0, 5, 640, (byte) 64);
        if (!(null == hd.field_a)) {
            hd.field_a.a(0, -ah.field_v + param4, param2, param0, param4, param2);
        }
    }

    final boolean d(byte param0) {
        int var2 = 0;
        var2 = -127 % ((-24 - param0) / 34);
        if (((fj) this).field_ac.field_L != 0) {
          ((fj) this).field_Tb = 20;
          return true;
        } else {
          if (0 != ((fj) this).field_ac.field_Ob) {
            if (0 >= ((fj) this).field_Tb) {
              if (((fj) this).field_Tb == 0) {
                if (((fj) this).field_Vb.field_C + ((fj) this).field_Vb.field_cb + (((fj) this).field_Vb.field_db + ((fj) this).field_Vb.field_Db) > po.field_a) {
                  return false;
                } else {
                  ((fj) this).field_Tb = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              ((fj) this).field_Tb = ((fj) this).field_Tb - 1;
              if (((fj) this).field_Tb == 0) {
                if (((fj) this).field_Vb.field_C + ((fj) this).field_Vb.field_cb + (((fj) this).field_Vb.field_db + ((fj) this).field_Vb.field_Db) > po.field_a) {
                  return false;
                } else {
                  ((fj) this).field_Tb = 3;
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        int var2 = -124 % ((35 - param1) / 37);
        return 1 + param0;
    }

    final boolean f(byte param0) {
        if (param0 != 57) {
            return false;
        }
        return ((fj) this).field_Vb.field_Ob != 0 ? true : false;
    }

    fj(long param0, mh param1, mh param2, mh param3, mh param4) {
        super(param0, (mh) null);
        RuntimeException var7 = null;
        mh var9 = null;
        mh var10 = null;
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
            ((fj) this).field_Yb = new mh(0L, param1);
            ((fj) this).field_Wb = new mh(0L, param2);
            ((fj) this).a(((fj) this).field_Yb, 0);
            ((fj) this).a(((fj) this).field_Wb, 0);
            ((fj) this).field_Xb = new mh(0L, (mh) null);
            ((fj) this).a(((fj) this).field_Xb, 0);
            ((fj) this).field_Zb = new mh(0L, param3);
            ((fj) this).field_ac = new mh(0L, param3);
            ((fj) this).field_ac.field_Lb = true;
            var9 = ((fj) this).field_Zb;
            var10 = var9;
            var10.field_Lb = true;
            ((fj) this).field_Xb.a(((fj) this).field_Zb, 0);
            ((fj) this).field_Xb.a(((fj) this).field_ac, 0);
            ((fj) this).field_Vb = new mh(0L, param4);
            ((fj) this).field_Vb.field_nb = true;
            ((fj) this).field_Xb.a(((fj) this).field_Vb, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("fj.<init>(").append(param0).append(44);
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
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
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
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final boolean h(int param0) {
        if (param0 == ((fj) this).field_Yb.field_L) {
          if (((fj) this).field_Yb.field_Ob != 0) {
            if (0 >= ((fj) this).field_Tb) {
              if (((fj) this).field_Tb != 0) {
                return false;
              } else {
                ((fj) this).field_Tb = 3;
                return true;
              }
            } else {
              ((fj) this).field_Tb = ((fj) this).field_Tb - 1;
              if (((fj) this).field_Tb != 0) {
                return false;
              } else {
                ((fj) this).field_Tb = 3;
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          ((fj) this).field_Tb = 20;
          return true;
        }
    }

    fj(long param0, fj param1) {
        this(param0, param1.field_Yb, param1.field_Wb, param1.field_Zb, param1.field_Vb);
    }

    public static void e(byte param0) {
        Object var2 = null;
        field_Sb = null;
        field_Rb = null;
        field_Ub = null;
        field_Qb = null;
        if (param0 != 33) {
          var2 = null;
          fj.a(31, (String) null, 82, (bi) null, 55, -109);
          field_Pb = null;
          return;
        } else {
          field_Pb = null;
          return;
        }
    }

    final int a(int param0, int param1, byte param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var5 = 0;
          var7 = -116 % ((49 - param2) / 47);
          var6 = -((fj) this).field_Vb.field_cb + ((fj) this).field_Xb.field_cb;
          if (0 < var6) {
            var8 = ((fj) this).field_Vb.field_zb;
            var9 = -param1 + param0;
            var5 = (var6 / 2 + var8 * var9) / var6;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param3) {
          L1: {
            if (-param1 + param0 < var5) {
              var5 = -param1 + param0;
              break L1;
            } else {
              break L1;
            }
          }
          if (var5 >= 0) {
            return var5;
          } else {
            var5 = 0;
            return var5;
          }
        } else {
          L2: {
            if (var5 < 0) {
              var5 = 0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (-param1 + param0 >= var5) {
              break L3;
            } else {
              var5 = -param1 + param0;
              break L3;
            }
          }
          return var5;
        }
    }

    final static jp[] a(int param0, int param1, int param2, int param3, int param4) {
        return mn.a(0, 1, 1, 9361, 65793, 1, 3, 0, 0);
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
        mh var14 = null;
        mh var15 = null;
        mh var16 = null;
        mh var17 = null;
        mh var18 = null;
        mh var19 = null;
        mh stackIn_9_0 = null;
        mh stackIn_9_1 = null;
        mh stackIn_9_2 = null;
        mh stackIn_10_0 = null;
        mh stackIn_10_1 = null;
        mh stackIn_10_2 = null;
        mh stackIn_11_0 = null;
        mh stackIn_11_1 = null;
        mh stackIn_11_2 = null;
        int stackIn_11_3 = 0;
        mh stackIn_23_0 = null;
        mh stackIn_23_1 = null;
        mh stackIn_23_2 = null;
        mh stackIn_24_0 = null;
        mh stackIn_24_1 = null;
        mh stackIn_24_2 = null;
        mh stackIn_25_0 = null;
        mh stackIn_25_1 = null;
        mh stackIn_25_2 = null;
        int stackIn_25_3 = 0;
        mh stackOut_22_0 = null;
        mh stackOut_22_1 = null;
        mh stackOut_22_2 = null;
        mh stackOut_24_0 = null;
        mh stackOut_24_1 = null;
        mh stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        mh stackOut_23_0 = null;
        mh stackOut_23_1 = null;
        mh stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        mh stackOut_8_0 = null;
        mh stackOut_8_1 = null;
        mh stackOut_8_2 = null;
        mh stackOut_10_0 = null;
        mh stackOut_10_1 = null;
        mh stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        mh stackOut_9_0 = null;
        mh stackOut_9_1 = null;
        mh stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        L0: {
          if (((fj) this).field_Ib * 2 > ((fj) this).field_cb) {
            var6 = ((fj) this).field_cb / 2;
            var5 = ((fj) this).field_cb / 2;
            break L0;
          } else {
            var5 = ((fj) this).field_Ib;
            var6 = ((fj) this).field_cb - ((fj) this).field_Ib;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param1 > 0) {
          L1: {
            var8 = var8 * param3 / param1;
            if (((fj) this).field_Ib <= var8) {
              break L1;
            } else {
              var8 = ((fj) this).field_Ib;
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
            var9 = -param3 + param1;
            var10 = var7 - var8;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + var10 * param2) / var9;
              break L3;
            } else {
              break L3;
            }
          }
          var12 = var11 - -(var8 / 2);
          var14 = ((fj) this).field_Yb;
          var14.field_zb = 0;
          var14.field_cb = var5;
          var14.field_Ib = ((fj) this).field_Ib;
          var14.field_P = 0;
          var15 = ((fj) this).field_Wb;
          var15.field_zb = var6;
          var15.field_cb = ((fj) this).field_cb + -var6;
          var15.field_P = 0;
          var15.field_Ib = ((fj) this).field_Ib;
          var16 = ((fj) this).field_Xb;
          var16.field_zb = var5;
          var16.field_cb = var7;
          var16.field_P = 0;
          var16.field_Ib = ((fj) this).field_Ib;
          var17 = ((fj) this).field_Zb;
          var17.field_Ib = ((fj) this).field_Ib;
          var17.field_cb = var12;
          var17.field_P = 0;
          var17.field_zb = 0;
          var18 = ((fj) this).field_ac;
          var18.field_Ib = ((fj) this).field_Ib;
          if (param0 > -75) {
            return;
          } else {
            L4: {
              var18.field_cb = var7 - var12;
              var18.field_zb = var12;
              var18.field_P = 0;
              var19 = ((fj) this).field_Vb;
              var19.field_zb = var11;
              stackOut_22_0 = ((fj) this).field_Yb;
              stackOut_22_1 = ((fj) this).field_Wb;
              stackOut_22_2 = ((fj) this).field_Xb;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              if (param1 <= param3) {
                stackOut_24_0 = (mh) (Object) stackIn_24_0;
                stackOut_24_1 = (mh) (Object) stackIn_24_1;
                stackOut_24_2 = (mh) (Object) stackIn_24_2;
                stackOut_24_3 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                break L4;
              } else {
                stackOut_23_0 = (mh) (Object) stackIn_23_0;
                stackOut_23_1 = (mh) (Object) stackIn_23_1;
                stackOut_23_2 = (mh) (Object) stackIn_23_2;
                stackOut_23_3 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                stackIn_25_3 = stackOut_23_3;
                break L4;
              }
            }
            stackIn_25_2.field_eb = stackIn_25_3 != 0;
            stackIn_25_1.field_eb = stackIn_25_3 != 0;
            stackIn_25_0.field_eb = stackIn_25_3 != 0;
            var19.field_cb = var8;
            var19.field_Ib = ((fj) this).field_Ib;
            var19.field_P = 0;
            return;
          }
        } else {
          L5: {
            var9 = -param3 + param1;
            var10 = var7 - var8;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + var10 * param2) / var9;
              break L5;
            } else {
              break L5;
            }
          }
          var12 = var11 - -(var8 / 2);
          var14 = ((fj) this).field_Yb;
          var14.field_zb = 0;
          var14.field_cb = var5;
          var14.field_Ib = ((fj) this).field_Ib;
          var14.field_P = 0;
          var15 = ((fj) this).field_Wb;
          var15.field_zb = var6;
          var15.field_cb = ((fj) this).field_cb + -var6;
          var15.field_P = 0;
          var15.field_Ib = ((fj) this).field_Ib;
          var16 = ((fj) this).field_Xb;
          var16.field_zb = var5;
          var16.field_cb = var7;
          var16.field_P = 0;
          var16.field_Ib = ((fj) this).field_Ib;
          var17 = ((fj) this).field_Zb;
          var17.field_Ib = ((fj) this).field_Ib;
          var17.field_cb = var12;
          var17.field_P = 0;
          var17.field_zb = 0;
          var18 = ((fj) this).field_ac;
          var18.field_Ib = ((fj) this).field_Ib;
          if (param0 > -75) {
            return;
          } else {
            L6: {
              var18.field_cb = var7 - var12;
              var18.field_zb = var12;
              var18.field_P = 0;
              var19 = ((fj) this).field_Vb;
              var19.field_zb = var11;
              stackOut_8_0 = ((fj) this).field_Yb;
              stackOut_8_1 = ((fj) this).field_Wb;
              stackOut_8_2 = ((fj) this).field_Xb;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              if (param1 <= param3) {
                stackOut_10_0 = (mh) (Object) stackIn_10_0;
                stackOut_10_1 = (mh) (Object) stackIn_10_1;
                stackOut_10_2 = (mh) (Object) stackIn_10_2;
                stackOut_10_3 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                break L6;
              } else {
                stackOut_9_0 = (mh) (Object) stackIn_9_0;
                stackOut_9_1 = (mh) (Object) stackIn_9_1;
                stackOut_9_2 = (mh) (Object) stackIn_9_2;
                stackOut_9_3 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_11_3 = stackOut_9_3;
                break L6;
              }
            }
            stackIn_11_2.field_eb = stackIn_11_3 != 0;
            stackIn_11_1.field_eb = stackIn_11_3 != 0;
            stackIn_11_0.field_eb = stackIn_11_3 != 0;
            var19.field_cb = var8;
            var19.field_Ib = ((fj) this).field_Ib;
            var19.field_P = 0;
            return;
          }
        }
    }

    final static void a(int param0, String param1, int param2, bi param3, int param4, int param5) {
        try {
            if (param4 != -15531) {
                fj.e((byte) 21);
            }
            sa.a(param2, param3, param1, 320, param0, param5, -126);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "fj.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean i(int param0) {
        if (0 != ((fj) this).field_Wb.field_L) {
          ((fj) this).field_Tb = 20;
          return true;
        } else {
          if (param0 == 2) {
            if (((fj) this).field_Wb.field_Ob != 0) {
              L0: {
                if (((fj) this).field_Tb > 0) {
                  ((fj) this).field_Tb = ((fj) this).field_Tb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((fj) this).field_Tb == 0) {
                ((fj) this).field_Tb = 3;
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ub = null;
        field_Rb = "Return to Main Menu";
        field_Sb = new int[]{15091200, 16494651, 3781573, 12658477, 26679};
    }
}
