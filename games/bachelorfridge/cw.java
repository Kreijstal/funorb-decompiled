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
        return ((cw) this).field_Bb.field_ib != 0 ? true : false;
    }

    public static void h() {
        field_yb = null;
        field_zb = null;
        int var1 = 59;
    }

    final boolean f(byte param0) {
        if (((cw) this).field_vb.field_R != 0) {
          ((cw) this).field_Cb = 20;
          return true;
        } else {
          if (0 != ((cw) this).field_vb.field_ib) {
            L0: {
              if (((cw) this).field_Cb > 0) {
                ((cw) this).field_Cb = ((cw) this).field_Cb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((cw) this).field_Cb != 0) {
              if (param0 != 62) {
                field_yb = null;
                return false;
              } else {
                return false;
              }
            } else {
              ((cw) this).field_Cb = 3;
              return true;
            }
          } else {
            if (param0 == 62) {
              return false;
            } else {
              field_yb = null;
              return false;
            }
          }
        }
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var5 = 0;
        var6 = -((cw) this).field_Bb.field_p + ((cw) this).field_wb.field_p;
        if (param0 == 7409) {
          L0: {
            if (0 >= var6) {
              break L0;
            } else {
              var7 = ((cw) this).field_Bb.field_rb;
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
            if (var5 >= 0) {
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
            ((cw) this).a((byte) -100, 39, -69, -35);
            if (0 >= var6) {
              break L4;
            } else {
              var7 = ((cw) this).field_Bb.field_rb;
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
            if (var5 >= 0) {
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
          if (((cw) this).field_Db.field_R != 0) {
            ((cw) this).field_Cb = 20;
            return true;
          } else {
            if (0 != ((cw) this).field_Db.field_ib) {
              L0: {
                if (((cw) this).field_Cb > 0) {
                  ((cw) this).field_Cb = ((cw) this).field_Cb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((cw) this).field_Cb == 0) {
                ((cw) this).field_Cb = 3;
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
        RuntimeException var3_ref = null;
        Object var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = cw.a((String) null, (String) null, false);
                break L1;
              }
            }
            L2: {
              L3: {
                param1 = jm.a((byte) 75, param1, '_', "");
                var3 = vm.a(param0, (byte) 117);
                if (param1.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if (-1 == param1.indexOf(var3)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("cw.EA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        ((cw) this).field_rb = param4;
        ((cw) this).field_sb = param0;
        ((cw) this).field_p = param7;
        ((cw) this).field_kb = param2;
        ((cw) this).a((byte) 29, param1, param3, param6);
        if (param5) {
            boolean discarded$0 = ((cw) this).i(52);
        }
    }

    final boolean i(int param0) {
        int var2 = 0;
        var2 = -1 % ((param0 - 67) / 48);
        if (((cw) this).field_xb.field_R != 0) {
          ((cw) this).field_Cb = 20;
          return true;
        } else {
          if (0 != ((cw) this).field_xb.field_ib) {
            L0: {
              if (((cw) this).field_Cb > 0) {
                ((cw) this).field_Cb = ((cw) this).field_Cb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((cw) this).field_Cb == 0) {
              if (((cw) this).field_Bb.field_hb + ((cw) this).field_Bb.field_p + (((cw) this).field_Bb.field_I + ((cw) this).field_Bb.field_M) > gd.field_m) {
                return false;
              } else {
                ((cw) this).field_Cb = 3;
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
        if (((cw) this).field_Ab.field_R != 0) {
            ((cw) this).field_Cb = 20;
            return true;
        }
        if (((cw) this).field_Ab.field_ib == 0) {
            if (param0 != 0) {
                ((cw) this).field_xb = null;
                return false;
            }
            return false;
        }
        if (!(((cw) this).field_Cb <= 0)) {
            ((cw) this).field_Cb = ((cw) this).field_Cb - 1;
        }
        if (0 != ((cw) this).field_Cb) {
            if (param0 != 0) {
                ((cw) this).field_xb = null;
                return false;
            }
            return false;
        }
        if (((cw) this).field_Bb.field_I + ((cw) this).field_Bb.field_M <= gd.field_m) {
            if (param0 != 0) {
                ((cw) this).field_xb = null;
                return false;
            }
            return false;
        }
        ((cw) this).field_Cb = 3;
        return true;
    }

    cw(long param0, sna param1, sna param2, sna param3, sna param4) {
        super(param0, (sna) null);
        RuntimeException var7 = null;
        sna var9 = null;
        sna var10 = null;
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
            ((cw) this).field_Db = new sna(0L, param1);
            ((cw) this).field_vb = new sna(0L, param2);
            ((cw) this).a(-1, ((cw) this).field_Db);
            ((cw) this).a(-1, ((cw) this).field_vb);
            ((cw) this).field_wb = new sna(0L, (sna) null);
            ((cw) this).a(-1, ((cw) this).field_wb);
            ((cw) this).field_Ab = new sna(0L, param3);
            ((cw) this).field_xb = new sna(0L, param3);
            ((cw) this).field_xb.field_qb = true;
            var9 = ((cw) this).field_Ab;
            var10 = var9;
            var10.field_qb = true;
            ((cw) this).field_wb.a(-1, ((cw) this).field_Ab);
            ((cw) this).field_wb.a(-1, ((cw) this).field_xb);
            ((cw) this).field_Bb = new sna(0L, param4);
            ((cw) this).field_Bb.field_ub = true;
            ((cw) this).field_wb.a(-1, ((cw) this).field_Bb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("cw.<init>(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sna var14 = null;
        sna var15 = null;
        sna var16 = null;
        sna var17 = null;
        sna var18 = null;
        sna var19 = null;
        sna stackIn_9_0 = null;
        sna stackIn_9_1 = null;
        sna stackIn_9_2 = null;
        sna stackIn_10_0 = null;
        sna stackIn_10_1 = null;
        sna stackIn_10_2 = null;
        sna stackIn_11_0 = null;
        sna stackIn_11_1 = null;
        sna stackIn_11_2 = null;
        int stackIn_11_3 = 0;
        sna stackIn_13_0 = null;
        sna stackIn_13_1 = null;
        sna stackIn_13_2 = null;
        sna stackIn_14_0 = null;
        sna stackIn_14_1 = null;
        sna stackIn_14_2 = null;
        sna stackIn_15_0 = null;
        sna stackIn_15_1 = null;
        sna stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        sna stackIn_26_0 = null;
        sna stackIn_26_1 = null;
        sna stackIn_26_2 = null;
        sna stackIn_27_0 = null;
        sna stackIn_27_1 = null;
        sna stackIn_27_2 = null;
        sna stackIn_28_0 = null;
        sna stackIn_28_1 = null;
        sna stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        sna stackIn_30_0 = null;
        sna stackIn_30_1 = null;
        sna stackIn_30_2 = null;
        sna stackIn_31_0 = null;
        sna stackIn_31_1 = null;
        sna stackIn_31_2 = null;
        sna stackIn_32_0 = null;
        sna stackIn_32_1 = null;
        sna stackIn_32_2 = null;
        int stackIn_32_3 = 0;
        sna stackOut_29_0 = null;
        sna stackOut_29_1 = null;
        sna stackOut_29_2 = null;
        sna stackOut_31_0 = null;
        sna stackOut_31_1 = null;
        sna stackOut_31_2 = null;
        int stackOut_31_3 = 0;
        sna stackOut_30_0 = null;
        sna stackOut_30_1 = null;
        sna stackOut_30_2 = null;
        int stackOut_30_3 = 0;
        sna stackOut_25_0 = null;
        sna stackOut_25_1 = null;
        sna stackOut_25_2 = null;
        sna stackOut_27_0 = null;
        sna stackOut_27_1 = null;
        sna stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        sna stackOut_26_0 = null;
        sna stackOut_26_1 = null;
        sna stackOut_26_2 = null;
        int stackOut_26_3 = 0;
        sna stackOut_12_0 = null;
        sna stackOut_12_1 = null;
        sna stackOut_12_2 = null;
        sna stackOut_14_0 = null;
        sna stackOut_14_1 = null;
        sna stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        sna stackOut_13_0 = null;
        sna stackOut_13_1 = null;
        sna stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        sna stackOut_8_0 = null;
        sna stackOut_8_1 = null;
        sna stackOut_8_2 = null;
        sna stackOut_10_0 = null;
        sna stackOut_10_1 = null;
        sna stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        sna stackOut_9_0 = null;
        sna stackOut_9_1 = null;
        sna stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        L0: {
          if (((cw) this).field_p < 2 * ((cw) this).field_sb) {
            var6 = ((cw) this).field_p / 2;
            var5 = ((cw) this).field_p / 2;
            break L0;
          } else {
            var5 = ((cw) this).field_sb;
            var6 = -((cw) this).field_sb + ((cw) this).field_p;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param3 > 0) {
          L1: {
            var8 = param2 * var8 / param3;
            if (var8 >= ((cw) this).field_sb) {
              break L1;
            } else {
              var8 = ((cw) this).field_sb;
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
            if (var9 > 0) {
              var11 = (var9 / 2 + param1 * var10) / var9;
              break L3;
            } else {
              break L3;
            }
          }
          var12 = var11 + var8 / 2;
          var14 = ((cw) this).field_Db;
          var14.field_rb = 0;
          var14.field_kb = 0;
          var14.field_sb = ((cw) this).field_sb;
          var14.field_p = var5;
          var15 = ((cw) this).field_vb;
          var15.field_sb = ((cw) this).field_sb;
          var15.field_rb = var6;
          var15.field_p = -var6 + ((cw) this).field_p;
          var15.field_kb = 0;
          var16 = ((cw) this).field_wb;
          var16.field_p = var7;
          var16.field_rb = var5;
          var16.field_kb = 0;
          var16.field_sb = ((cw) this).field_sb;
          var17 = ((cw) this).field_Ab;
          var17.field_rb = 0;
          var17.field_p = var12;
          var17.field_sb = ((cw) this).field_sb;
          var17.field_kb = 0;
          var18 = ((cw) this).field_xb;
          var18.field_sb = ((cw) this).field_sb;
          var18.field_kb = 0;
          var18.field_p = -var12 + var7;
          var18.field_rb = var12;
          if (param0 != 29) {
            L4: {
              ((cw) this).field_Ab = null;
              var19 = ((cw) this).field_Bb;
              var19.field_p = var8;
              var19.field_kb = 0;
              stackOut_29_0 = ((cw) this).field_Db;
              stackOut_29_1 = ((cw) this).field_vb;
              stackOut_29_2 = ((cw) this).field_wb;
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              if (param3 <= param2) {
                stackOut_31_0 = (sna) (Object) stackIn_31_0;
                stackOut_31_1 = (sna) (Object) stackIn_31_1;
                stackOut_31_2 = (sna) (Object) stackIn_31_2;
                stackOut_31_3 = 0;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                stackIn_32_3 = stackOut_31_3;
                break L4;
              } else {
                stackOut_30_0 = (sna) (Object) stackIn_30_0;
                stackOut_30_1 = (sna) (Object) stackIn_30_1;
                stackOut_30_2 = (sna) (Object) stackIn_30_2;
                stackOut_30_3 = 1;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                stackIn_32_3 = stackOut_30_3;
                break L4;
              }
            }
            stackIn_32_2.field_u = stackIn_32_3 != 0;
            stackIn_32_1.field_u = stackIn_32_3 != 0;
            stackIn_32_0.field_u = stackIn_32_3 != 0;
            var19.field_sb = ((cw) this).field_sb;
            var19.field_rb = var11;
            return;
          } else {
            L5: {
              var19 = ((cw) this).field_Bb;
              var19.field_p = var8;
              var19.field_kb = 0;
              stackOut_25_0 = ((cw) this).field_Db;
              stackOut_25_1 = ((cw) this).field_vb;
              stackOut_25_2 = ((cw) this).field_wb;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              if (param3 <= param2) {
                stackOut_27_0 = (sna) (Object) stackIn_27_0;
                stackOut_27_1 = (sna) (Object) stackIn_27_1;
                stackOut_27_2 = (sna) (Object) stackIn_27_2;
                stackOut_27_3 = 0;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                stackIn_28_2 = stackOut_27_2;
                stackIn_28_3 = stackOut_27_3;
                break L5;
              } else {
                stackOut_26_0 = (sna) (Object) stackIn_26_0;
                stackOut_26_1 = (sna) (Object) stackIn_26_1;
                stackOut_26_2 = (sna) (Object) stackIn_26_2;
                stackOut_26_3 = 1;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_28_2 = stackOut_26_2;
                stackIn_28_3 = stackOut_26_3;
                break L5;
              }
            }
            stackIn_28_2.field_u = stackIn_28_3 != 0;
            stackIn_28_1.field_u = stackIn_28_3 != 0;
            stackIn_28_0.field_u = stackIn_28_3 != 0;
            var19.field_sb = ((cw) this).field_sb;
            var19.field_rb = var11;
            return;
          }
        } else {
          L6: {
            var9 = param3 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + param1 * var10) / var9;
              break L6;
            } else {
              break L6;
            }
          }
          var12 = var11 + var8 / 2;
          var14 = ((cw) this).field_Db;
          var14.field_rb = 0;
          var14.field_kb = 0;
          var14.field_sb = ((cw) this).field_sb;
          var14.field_p = var5;
          var15 = ((cw) this).field_vb;
          var15.field_sb = ((cw) this).field_sb;
          var15.field_rb = var6;
          var15.field_p = -var6 + ((cw) this).field_p;
          var15.field_kb = 0;
          var16 = ((cw) this).field_wb;
          var16.field_p = var7;
          var16.field_rb = var5;
          var16.field_kb = 0;
          var16.field_sb = ((cw) this).field_sb;
          var17 = ((cw) this).field_Ab;
          var17.field_rb = 0;
          var17.field_p = var12;
          var17.field_sb = ((cw) this).field_sb;
          var17.field_kb = 0;
          var18 = ((cw) this).field_xb;
          var18.field_sb = ((cw) this).field_sb;
          var18.field_kb = 0;
          var18.field_p = -var12 + var7;
          var18.field_rb = var12;
          if (param0 == 29) {
            L7: {
              var19 = ((cw) this).field_Bb;
              var19.field_p = var8;
              var19.field_kb = 0;
              stackOut_12_0 = ((cw) this).field_Db;
              stackOut_12_1 = ((cw) this).field_vb;
              stackOut_12_2 = ((cw) this).field_wb;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              if (param3 <= param2) {
                stackOut_14_0 = (sna) (Object) stackIn_14_0;
                stackOut_14_1 = (sna) (Object) stackIn_14_1;
                stackOut_14_2 = (sna) (Object) stackIn_14_2;
                stackOut_14_3 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                stackIn_15_3 = stackOut_14_3;
                break L7;
              } else {
                stackOut_13_0 = (sna) (Object) stackIn_13_0;
                stackOut_13_1 = (sna) (Object) stackIn_13_1;
                stackOut_13_2 = (sna) (Object) stackIn_13_2;
                stackOut_13_3 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_15_2 = stackOut_13_2;
                stackIn_15_3 = stackOut_13_3;
                break L7;
              }
            }
            stackIn_15_2.field_u = stackIn_15_3 != 0;
            stackIn_15_1.field_u = stackIn_15_3 != 0;
            stackIn_15_0.field_u = stackIn_15_3 != 0;
            var19.field_sb = ((cw) this).field_sb;
            var19.field_rb = var11;
            return;
          } else {
            L8: {
              ((cw) this).field_Ab = null;
              var19 = ((cw) this).field_Bb;
              var19.field_p = var8;
              var19.field_kb = 0;
              stackOut_8_0 = ((cw) this).field_Db;
              stackOut_8_1 = ((cw) this).field_vb;
              stackOut_8_2 = ((cw) this).field_wb;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              if (param3 <= param2) {
                stackOut_10_0 = (sna) (Object) stackIn_10_0;
                stackOut_10_1 = (sna) (Object) stackIn_10_1;
                stackOut_10_2 = (sna) (Object) stackIn_10_2;
                stackOut_10_3 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                break L8;
              } else {
                stackOut_9_0 = (sna) (Object) stackIn_9_0;
                stackOut_9_1 = (sna) (Object) stackIn_9_1;
                stackOut_9_2 = (sna) (Object) stackIn_9_2;
                stackOut_9_3 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_11_3 = stackOut_9_3;
                break L8;
              }
            }
            stackIn_11_2.field_u = stackIn_11_3 != 0;
            stackIn_11_1.field_u = stackIn_11_3 != 0;
            stackIn_11_0.field_u = stackIn_11_3 != 0;
            var19.field_sb = ((cw) this).field_sb;
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
