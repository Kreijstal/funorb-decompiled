/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends hl {
    private int field_Ob;
    private int field_Zb;
    private int field_Sb;
    static String field_Lb;
    private int field_Kb;
    private int[] field_Ub;
    private nh[] field_Qb;
    private int field_Tb;
    private char[] field_Wb;
    static int field_Xb;
    private int field_Rb;
    private le field_Yb;
    private int field_Mb;
    private int field_Nb;
    static String field_Vb;
    private le[] field_Pb;

    le(long param0, hl param1, hl param2, hl param3, le[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        jb var17 = null;
        jb var18 = null;
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
        ((le) this).field_Zb = -1;
        try {
          L0: {
            ((le) this).field_Wb = param7;
            ((le) this).field_Ub = param5;
            ((le) this).field_Pb = param4;
            ((le) this).field_Kb = ((le) this).field_Ub.length;
            var17 = param3.field_Ib;
            var18 = var17;
            ((le) this).field_Ob = 2 - -var18.field_N + var18.field_K;
            ((le) this).field_Mb = 0;
            ((le) this).field_Tb = ((le) this).field_Ob * ((le) this).field_Kb;
            ((le) this).field_Qb = new nh[((le) this).field_Kb];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (var13 >= ((le) this).field_Kb) {
                ((le) this).field_Mb = ((le) this).field_Mb + (10 + ab.field_R.field_t);
                this.e(144, 12);
                break L0;
              } else {
                L2: {
                  if (((le) this).field_Wb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + lg.a(false, ((le) this).field_Wb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != ((le) this).field_Pb[var13]) {
                      break L4;
                    } else {
                      if (-1 != ((le) this).field_Ub[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) ab.field_R;
                  break L3;
                }
                L5: {
                  ((le) this).field_Qb[var13] = new nh(0L, param2, (hl) null, param3, (oh) var14, param6[var13]);
                  ((le) this).a((byte) 97, (hl) (Object) ((le) this).field_Qb[var13]);
                  var15 = var17.b(param6[var13]);
                  if (((le) this).field_Mb >= var15) {
                    break L5;
                  } else {
                    ((le) this).field_Mb = var15;
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
            stackOut_13_1 = new StringBuilder().append("le.<init>(").append(param0).append(',');
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
          throw oi.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    public static void j() {
        field_Lb = null;
        int var1 = 0;
        field_Vb = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = TetraLink.field_J;
        ((le) this).field_Sb = ((le) this).field_Mb + 2 * param0;
        ((le) this).a((byte) -123, ((le) this).field_Sb, param4 - ((le) this).field_Tb, ((le) this).field_Tb, param2);
        if (((le) this).field_Rb != param1) {
            ((le) this).field_Rb = param1;
            this.e(144, ((le) this).field_Nb);
        }
        for (var7 = 0; var7 < ((le) this).field_Kb; var7++) {
            ((le) this).field_Qb[var7].b(param5, ((le) this).field_Sb, ((le) this).field_Qb[var7].field_yb, param3, 0, param0, ((le) this).field_Ob);
        }
        if (~((le) this).field_Zb != param5) {
            if (null != ((le) this).field_Pb[((le) this).field_Zb]) {
                var7 = ((le) this).field_Pb[((le) this).field_Zb].field_Kb;
                var8 = ((le) this).field_Ob * (((le) this).field_Zb - -var7) + ((le) this).field_yb;
                while (var8 > param4) {
                    var8 = var8 - ((le) this).field_Ob;
                }
                ((le) this).field_Pb[((le) this).field_Zb].a(param0, ((le) this).field_Qb[((le) this).field_Zb].field_z, ((le) this).field_Sb + param2, param3, var8, param5);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        le var4 = null;
        nh var5 = null;
        int var6 = 0;
        nh stackIn_5_0 = null;
        nh stackIn_6_0 = null;
        nh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        nh stackOut_4_0 = null;
        nh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        nh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = TetraLink.field_J;
        var4_int = param0;
        L0: while (true) {
          if (((le) this).field_Qb.length <= var4_int) {
            L1: {
              if (((le) this).field_Zb != -1) {
                var4 = ((le) this).field_Pb[((le) this).field_Zb];
                if (var4 == null) {
                  break L1;
                } else {
                  var4.a(0, param1, param2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((le) this).field_Nb <= 0) {
                break L2;
              } else {
                this.e(144, -1 + ((le) this).field_Nb);
                break L2;
              }
            }
            return;
          } else {
            var5 = ((le) this).field_Qb[var4_int];
            if (var5.field_F == 1) {
              L3: {
                this.a(var4_int, param2, param0 ^ 16, param1);
                stackOut_4_0 = (nh) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((le) this).field_Zb != var4_int) {
                  stackOut_6_0 = (nh) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (nh) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              stackIn_7_0.field_zb = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = TetraLink.field_J;
          if (param0 == ((le) this).field_Zb) {
            ((le) this).i(20424);
            this.e(144, 0);
            break L0;
          } else {
            if (null != ((le) this).field_Pb[param0]) {
              ((le) this).i(20424);
              this.e(144, 0);
              ((le) this).field_Zb = param0;
              ((le) this).field_Yb = ((le) this).field_Pb[((le) this).field_Zb];
              int discarded$586 = 123;
              ba.a(((le) this).field_Yb);
              ((le) this).field_Yb.e(144, 12);
              break L0;
            } else {
              if (((le) this).field_Ub[param0] != -1) {
                L1: {
                  var5 = 32768 | ((le) this).field_Ub[param0];
                  var6 = sf.field_d;
                  if (0 != var6) {
                    break L1;
                  } else {
                    if (qb.field_N == null) {
                      break L1;
                    } else {
                      var6 = 1;
                      break L1;
                    }
                  }
                }
                L2: {
                  if (2 != fh.a((byte) 79, var6)) {
                    break L2;
                  } else {
                    vj.a(var6, param3, 1, 90);
                    break L2;
                  }
                }
                var8 = null;
                eo.a(-3, var5, param1, ka.field_m, sf.field_d, (String) null);
                pf.a(ka.field_m, sf.field_d, var5, vj.field_o, (byte) 88);
                int discarded$587 = 42;
                go.c();
                int discarded$588 = 45;
                kj.a();
                break L0;
              } else {
                int discarded$589 = -119;
                cm.a();
                int discarded$590 = 42;
                go.c();
                break L0;
              }
            }
          }
        }
        var5 = 30 / ((-69 - param2) / 55);
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_7_0 = 0;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 != 0) {
                  var6 = hc.field_o;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var6.length <= var3) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L5;
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "le.A(" + 128 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final boolean c(boolean param0) {
        int var4 = 0;
        nh var5 = null;
        int var6 = TetraLink.field_J;
        int var2 = param0 ? 1 : 0;
        nh[] var3 = ((le) this).field_Qb;
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (var5.field_F != 0 ? 1 : 0);
        }
        if (var2 == 0) {
            if (((le) this).field_Zb != -1) {
                if (!(((le) this).field_Pb[((le) this).field_Zb] == null)) {
                    var2 = ((le) this).field_Pb[((le) this).field_Zb].c(false) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    private final void e(int param0, int param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = TetraLink.field_J;
        ((le) this).field_Nb = param1;
        for (var5 = 0; ((le) this).field_Kb > var5; var5++) {
            var3 = var5 * ((le) this).field_Ob;
            var4 = ((le) this).field_Nb * ((le) this).field_Nb;
            ((le) this).field_Qb[var5].field_yb = (var3 * (144 + -var4) + (-((le) this).field_z + ((le) this).field_Rb) * var4) / 144;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = TetraLink.field_J;
        int var5 = -33 / ((-63 - param0) / 34);
        int var4 = dg.field_e == 85 ? 1 : 0;
        if (null != ((le) this).field_Yb) {
            if (var4 != 0) {
                if (!(((le) this).field_Yb.field_Zb != -1)) {
                    ((le) this).i(20424);
                    this.e(144, 0);
                    return true;
                }
            }
            return ((le) this).field_Yb.b(-97, param1, param2);
        }
        if (((le) this).field_Yb == null) {
            if ((Object) (Object) gl.field_o == this) {
                if (!(var4 == 0)) {
                    int discarded$0 = 42;
                    go.c();
                    return true;
                }
            }
        }
        int var6 = tb.field_m;
        if (0 < var6) {
            if (var6 == tk.field_a) {
                var6 = 63;
            }
            for (var7 = 0; var7 < ((le) this).field_Wb.length; var7++) {
                if (!(((le) this).field_Wb[var7] != var6)) {
                    this.a(var7, param1, -126, param2);
                    return true;
                }
            }
        }
        return false;
    }

    final void i(int param0) {
        int var3 = 0;
        nh var4 = null;
        int var5 = TetraLink.field_J;
        nh[] var6 = ((le) this).field_Qb;
        nh[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_zb = false;
            var4.field_F = 0;
        }
        if (param0 != 20424) {
            boolean discarded$0 = ((le) this).c(true);
        }
        if (!(null == ((le) this).field_Yb)) {
            ((le) this).field_Yb.i(20424);
            ((le) this).field_Yb.b(false);
        }
        ((le) this).field_Yb = null;
        ((le) this).field_Zb = -1;
        this.e(144, 12);
    }

    final int h(int param0) {
        if (param0 != 0) {
            return -83;
        }
        return ((le) this).field_Sb + (null == ((le) this).field_Yb ? 0 : ((le) this).field_Yb.h(0));
    }

    final static int d(int param0, int param1) {
        if (param1 != -28583) {
            int discarded$0 = le.d(1, -44);
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
            return param0 >= 6144 ? -km.field_n[-param0 + 8192] : -km.field_n[param0 - 4096];
        }
        return param0 >= 2048 ? km.field_n[4096 - param0] : km.field_n[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "You have entered another game.";
        field_Vb = "Full";
    }
}
