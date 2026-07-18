/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends gh {
    private int field_Sb;
    static String field_ec;
    private int field_jc;
    static String field_Zb;
    private int field_pc;
    private mg field_mc;
    private qh[] field_Yb;
    private int[] field_bc;
    static boolean field_ac;
    private mg[] field_Vb;
    static String field_gc;
    private int field_Xb;
    static String field_ic;
    private int field_dc;
    private int field_fc;
    private int field_Wb;
    static int field_hc;
    private int field_oc;
    static String field_Tb;
    static String field_lc;
    static String field_nc;
    static gh field_Ub;
    static int field_kc;
    private char[] field_cc;

    private final void c(int param0, int param1) {
        int var4 = 0;
        int var3 = 0;
        int var7 = SteelSentinels.field_G;
        ((mg) this).field_fc = param1;
        int var5 = 0;
        int var6 = -114 / ((param0 - -35) / 45);
        while (((mg) this).field_dc > var5) {
            var4 = ((mg) this).field_fc * ((mg) this).field_fc;
            var3 = ((mg) this).field_jc * var5;
            ((mg) this).field_Yb[var5].field_eb = ((-((mg) this).field_cb + ((mg) this).field_Xb) * var4 + var3 * (-var4 + 144)) / 144;
            var5++;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = SteelSentinels.field_G;
          if (param0 == ((mg) this).field_Sb) {
            ((mg) this).l(-124);
            this.c(87, 0);
            break L0;
          } else {
            if (((mg) this).field_Vb[param0] != null) {
              ((mg) this).l(77);
              this.c(-89, 0);
              ((mg) this).field_Sb = param0;
              ((mg) this).field_mc = ((mg) this).field_Vb[((mg) this).field_Sb];
              wc.a(((mg) this).field_mc, -116);
              ((mg) this).field_mc.c(43, 12);
              break L0;
            } else {
              if (((mg) this).field_bc[param0] == -1) {
                jd.m(-6);
                ke.a(2);
                break L0;
              } else {
                L1: {
                  var5 = ((mg) this).field_bc[param0] | 32768;
                  var6 = ib.field_b;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (null == nf.field_b) {
                      break L1;
                    } else {
                      var6 = 1;
                      break L1;
                    }
                  }
                }
                L2: {
                  if (ei.a(var6, 1) == 2) {
                    il.a(1, var6, param1, -18853);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = null;
                oe.a(param2, en.field_e, -6988, ib.field_b, var5, (String) null);
                qj.a(ti.field_p, en.field_e, ib.field_b, -29368, var5);
                ke.a(2);
                wi.c((byte) -119);
                break L0;
              }
            }
          }
        }
    }

    public static void k(int param0) {
        field_lc = null;
        field_gc = null;
        field_Zb = null;
        if (param0 != -31097) {
            return;
        }
        field_Tb = null;
        field_ec = null;
        field_ic = null;
        field_Ub = null;
        field_nc = null;
    }

    final static void a(int[] param0, int param1, int param2) {
        try {
            uc.field_e[param2] = param0;
            i.field_e[param2] = new ji(param2);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "mg.C(" + (param0 != null ? "{...}" : "null") + ',' + 7411 + ',' + param2 + ')');
        }
    }

    mg(long param0, gh param1, gh param2, gh param3, mg[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        mi var17 = null;
        mi var18 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        ((mg) this).field_Sb = -1;
        try {
          L0: {
            ((mg) this).field_Vb = param4;
            ((mg) this).field_cc = param7;
            ((mg) this).field_bc = param5;
            ((mg) this).field_dc = ((mg) this).field_bc.length;
            var17 = param3.field_L;
            var18 = var17;
            ((mg) this).field_jc = var18.field_F + 2 - -var18.field_G;
            ((mg) this).field_Wb = 0;
            ((mg) this).field_pc = ((mg) this).field_jc * ((mg) this).field_dc;
            ((mg) this).field_Yb = new qh[((mg) this).field_dc];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (var13 >= ((mg) this).field_dc) {
                ((mg) this).field_Wb = ((mg) this).field_Wb + (10 + ik.field_g.field_z);
                this.c(117, 12);
                break L0;
              } else {
                L2: {
                  if (0 >= ((mg) this).field_cc[var13]) {
                    break L2;
                  } else {
                    param6[var13] = var11 + fa.a(((mg) this).field_cc[var13], 29448).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != ((mg) this).field_Vb[var13]) {
                      break L4;
                    } else {
                      if (((mg) this).field_bc[var13] != -1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) ik.field_g;
                  break L3;
                }
                L5: {
                  ((mg) this).field_Yb[var13] = new qh(0L, param2, (gh) null, param3, (wk) var14, param6[var13]);
                  ((mg) this).a((gh) (Object) ((mg) this).field_Yb[var13], 121);
                  var15 = var17.c(param6[var13]);
                  if (((mg) this).field_Wb >= var15) {
                    break L5;
                  } else {
                    ((mg) this).field_Wb = var15;
                    break L5;
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param7 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = SteelSentinels.field_G;
          if (param3 == 27) {
            break L0;
          } else {
            field_lc = null;
            break L0;
          }
        }
        L1: {
          ((mg) this).field_oc = ((mg) this).field_Wb - -(2 * param2);
          ((mg) this).a(0, -((mg) this).field_pc + param5, ((mg) this).field_pc, param4, ((mg) this).field_oc);
          if (((mg) this).field_Xb != param1) {
            ((mg) this).field_Xb = param1;
            this.c(-97, ((mg) this).field_fc);
            break L1;
          } else {
            break L1;
          }
        }
        var7 = 0;
        L2: while (true) {
          if (((mg) this).field_dc <= var7) {
            L3: {
              if (-1 == ((mg) this).field_Sb) {
                break L3;
              } else {
                if (((mg) this).field_Vb[((mg) this).field_Sb] == null) {
                  break L3;
                } else {
                  var7 = ((mg) this).field_Vb[((mg) this).field_Sb].field_dc;
                  var8 = ((mg) this).field_eb - -((((mg) this).field_Sb - -var7) * ((mg) this).field_jc);
                  L4: while (true) {
                    if (var8 <= param5) {
                      ((mg) this).field_Vb[((mg) this).field_Sb].a(param0, ((mg) this).field_Yb[((mg) this).field_Sb].field_cb, param2, (byte) 27, param4 + ((mg) this).field_oc, var8);
                      break L3;
                    } else {
                      var8 = var8 - ((mg) this).field_jc;
                      continue L4;
                    }
                  }
                }
              }
            }
            return;
          } else {
            ((mg) this).field_Yb[var7].a(((mg) this).field_jc, ((mg) this).field_oc, param2, 0, param0, ((mg) this).field_Yb[var7].field_eb, (byte) 121);
            var7++;
            continue L2;
          }
        }
    }

    final boolean m(int param0) {
        int var4 = 0;
        qh var5_ref_qh = null;
        int var6 = SteelSentinels.field_G;
        int var2 = 0;
        qh[] var3 = ((mg) this).field_Yb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5_ref_qh = var3[var4];
            var2 = var2 | (var5_ref_qh.field_Eb != 0 ? 1 : 0);
        }
        int var5 = -60 % ((param0 - -18) / 63);
        if (var2 == 0) {
            if (((mg) this).field_Sb != -1) {
                if (((mg) this).field_Vb[((mg) this).field_Sb] != null) {
                    var2 = ((mg) this).field_Vb[((mg) this).field_Sb].m(75) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        mg var4 = null;
        qh var5 = null;
        int var6 = 0;
        mg var7 = null;
        qh stackIn_5_0 = null;
        qh stackIn_6_0 = null;
        qh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        qh stackOut_4_0 = null;
        qh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        qh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = SteelSentinels.field_G;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((mg) this).field_Yb.length) {
            L1: {
              if (-1 != ((mg) this).field_Sb) {
                var7 = ((mg) this).field_Vb[((mg) this).field_Sb];
                var4 = var7;
                if (var4 == null) {
                  break L1;
                } else {
                  var7.a((byte) 111, param1, param2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (0 >= ((mg) this).field_fc) {
                break L2;
              } else {
                this.c(127, -1 + ((mg) this).field_fc);
                break L2;
              }
            }
            L3: {
              if (param0 >= 28) {
                break L3;
              } else {
                mg.k(119);
                break L3;
              }
            }
            return;
          } else {
            var5 = ((mg) this).field_Yb[var4_int];
            if (1 == var5.field_Eb) {
              L4: {
                this.a(var4_int, param2, param1, 119);
                stackOut_4_0 = (qh) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4_int != ((mg) this).field_Sb) {
                  stackOut_6_0 = (qh) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L4;
                } else {
                  stackOut_5_0 = (qh) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L4;
                }
              }
              stackIn_7_0.field_G = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            boolean discarded$0 = mg.b(false);
        }
        return vl.field_r;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          if (85 != ei.field_q) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (((mg) this).field_mc != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (((mg) this).field_mc.field_Sb != -1) {
                break L1;
              } else {
                ((mg) this).l(18);
                this.c(param0 ^ -25528, 0);
                return true;
              }
            }
          }
          return ((mg) this).field_mc.a(25542, param1, param2);
        } else {
          L2: {
            if (((mg) this).field_mc != null) {
              break L2;
            } else {
              if (this != (Object) (Object) jk.field_i) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  ke.a(2);
                  return true;
                }
              }
            }
          }
          var5 = de.field_c;
          if (param0 == 25542) {
            if (var5 > 0) {
              L3: {
                if (v.field_g != var5) {
                  break L3;
                } else {
                  var5 = 63;
                  break L3;
                }
              }
              var6 = 0;
              L4: while (true) {
                if (((mg) this).field_cc.length <= var6) {
                  return false;
                } else {
                  if (((mg) this).field_cc[var6] == var5) {
                    this.a(var6, param2, param1, 119);
                    return true;
                  } else {
                    var6++;
                    continue L4;
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void l(int param0) {
        int var3 = 0;
        qh var4 = null;
        int var5 = SteelSentinels.field_G;
        qh[] var6 = ((mg) this).field_Yb;
        qh[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_G = false;
            var4.field_Eb = 0;
        }
        var3 = -17 / ((-59 - param0) / 58);
        if (((mg) this).field_mc != null) {
            ((mg) this).field_mc.l(45);
            ((mg) this).field_mc.b(4);
        }
        ((mg) this).field_mc = null;
        ((mg) this).field_Sb = -1;
        this.c(37, 12);
    }

    final int j(int param0) {
        if (param0 != 0) {
            this.c(38, 77);
        }
        return ((mg) this).field_oc - -(null != ((mg) this).field_mc ? ((mg) this).field_mc.j(param0) : 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ec = "Achievements";
        field_gc = "Show all private chat";
        field_ac = true;
        field_ic = "Please remove <%0> from your friend list first.";
        field_hc = 0;
        field_Zb = "PROGRESS BEYOND THIS POINT REQUIRES YOU TO LOG IN OR CREATE A FREE ACCOUNT.";
        field_nc = "START MISSION";
        field_lc = "Email is valid";
        field_Tb = "Advanced Training";
    }
}
