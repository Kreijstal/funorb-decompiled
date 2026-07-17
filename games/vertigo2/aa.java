/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends cr {
    private int[] field_Ob;
    private int field_Rb;
    static int[] field_Jb;
    private aa field_Ib;
    private char[] field_Hb;
    private int field_Pb;
    static int field_Vb;
    private int field_Tb;
    private int field_Mb;
    private aa[] field_Wb;
    private int field_Ub;
    private int field_Qb;
    static String[] field_Sb;
    private nk[] field_Lb;
    private int field_Kb;
    private int field_Nb;

    final boolean a(int param0, boolean param1, int param2) {
        int var6 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        int var4 = de.field_f == 85 ? 1 : 0;
        if (null != ((aa) this).field_Ib) {
            if (var4 != 0) {
                if (!(((aa) this).field_Ib.field_Ub != -1)) {
                    ((aa) this).a((byte) 34);
                    this.c(0, 0);
                    return true;
                }
            }
            return ((aa) this).field_Ib.a(param0, false, param2);
        }
        if (null == ((aa) this).field_Ib) {
            if ((Object) (Object) ji.field_n == this) {
                if (var4 != 0) {
                    bm.g(0);
                    return true;
                }
            }
        }
        int var5 = ji.field_r;
        if (!(var5 <= 0)) {
            if (v.field_c == var5) {
                var5 = 63;
            }
            for (var6 = 0; ((aa) this).field_Hb.length > var6; var6++) {
                if (!(((aa) this).field_Hb[var6] != var5)) {
                    this.a(var6, param2, 32768, param0);
                    return true;
                }
            }
        }
        if (param1) {
            ((aa) this).a((byte) -1);
        }
        return false;
    }

    aa(long param0, cr param1, cr param2, cr param3, aa[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        cc var17 = null;
        cc var18 = null;
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
        ((aa) this).field_Ub = -1;
        try {
          L0: {
            ((aa) this).field_Hb = param7;
            ((aa) this).field_Wb = param4;
            ((aa) this).field_Ob = param5;
            ((aa) this).field_Tb = ((aa) this).field_Ob.length;
            var17 = param3.field_z;
            var18 = var17;
            ((aa) this).field_Mb = 2 + var18.field_z + var18.field_M;
            ((aa) this).field_Rb = ((aa) this).field_Mb * ((aa) this).field_Tb;
            ((aa) this).field_Lb = new nk[((aa) this).field_Tb];
            ((aa) this).field_Nb = 0;
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (var13 >= ((aa) this).field_Tb) {
                ((aa) this).field_Nb = ((aa) this).field_Nb + (fm.field_g.field_x + 10);
                this.c(0, 12);
                break L0;
              } else {
                L2: {
                  if (0 >= ((aa) this).field_Hb[var13]) {
                    break L2;
                  } else {
                    param6[var13] = var11 + bj.a(0, ((aa) this).field_Hb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (((aa) this).field_Wb[var13] != null) {
                      break L4;
                    } else {
                      if (-1 != ((aa) this).field_Ob[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) fm.field_g;
                  break L3;
                }
                L5: {
                  ((aa) this).field_Lb[var13] = new nk(0L, param2, (cr) null, param3, (er) var14, param6[var13]);
                  ((aa) this).b((cr) (Object) ((aa) this).field_Lb[var13], 118);
                  var15 = var17.c(param6[var13]);
                  if (var15 <= ((aa) this).field_Nb) {
                    break L5;
                  } else {
                    ((aa) this).field_Nb = var15;
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
            stackOut_13_1 = new StringBuilder().append("aa.<init>(").append(param0).append(44);
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
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
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
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
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
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
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
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
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Vertigo2.field_L ? 1 : 0;
          var7 = 22 % ((-86 - param5) / 40);
          ((aa) this).field_Qb = param3 * 2 + ((aa) this).field_Nb;
          ((aa) this).a(107, ((aa) this).field_Qb, ((aa) this).field_Rb, param0 - ((aa) this).field_Rb, param4);
          if (param1 != ((aa) this).field_Kb) {
            ((aa) this).field_Kb = param1;
            this.c(0, ((aa) this).field_Pb);
            break L0;
          } else {
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (var8 >= ((aa) this).field_Tb) {
            L2: {
              if (((aa) this).field_Ub == -1) {
                break L2;
              } else {
                if (((aa) this).field_Wb[((aa) this).field_Ub] != null) {
                  var8 = ((aa) this).field_Wb[((aa) this).field_Ub].field_Tb;
                  var9 = ((aa) this).field_N + ((aa) this).field_Mb * (((aa) this).field_Ub - -var8);
                  L3: while (true) {
                    if (param0 >= var9) {
                      ((aa) this).field_Wb[((aa) this).field_Ub].a(var9, ((aa) this).field_Lb[((aa) this).field_Ub].field_C, param2, param3, param4 - -((aa) this).field_Qb, 122);
                      break L2;
                    } else {
                      var9 = var9 - ((aa) this).field_Mb;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            return;
          } else {
            ((aa) this).field_Lb[var8].a(((aa) this).field_Lb[var8].field_N, ((aa) this).field_Qb, param2, ((aa) this).field_Mb, param3, 1, 0);
            var8++;
            continue L1;
          }
        }
    }

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        ((aa) this).field_Pb = param1;
        for (var5 = param0; ((aa) this).field_Tb > var5; var5++) {
            var3 = ((aa) this).field_Mb * var5;
            var4 = ((aa) this).field_Pb * ((aa) this).field_Pb;
            ((aa) this).field_Lb[var5].field_N = ((-((aa) this).field_C + ((aa) this).field_Kb) * var4 + var3 * (-var4 + 144)) / 144;
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        nk var4 = null;
        int var5 = Vertigo2.field_L ? 1 : 0;
        nk[] var6 = ((aa) this).field_Lb;
        nk[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_tb = 0;
            var4.field_V = false;
        }
        if (param0 != 34) {
            this.a(-5, -11, -120, 53);
        }
        if (null != ((aa) this).field_Ib) {
            ((aa) this).field_Ib.a((byte) 34);
            ((aa) this).field_Ib.c(2);
        }
        ((aa) this).field_Ib = null;
        ((aa) this).field_Ub = -1;
        this.c(param0 ^ 34, 12);
    }

    final int k(int param0) {
        if (param0 != 12282) {
            ((aa) this).field_Pb = 32;
        }
        return ((aa) this).field_Qb - -(((aa) this).field_Ib != null ? ((aa) this).field_Ib.k(12282) : 0);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if (((aa) this).field_Ub != param0) {
            if (((aa) this).field_Wb[param0] != null) {
              ((aa) this).a((byte) 34);
              this.c(0, 0);
              ((aa) this).field_Ub = param0;
              ((aa) this).field_Ib = ((aa) this).field_Wb[((aa) this).field_Ub];
              int discarded$2 = -1;
              bq.a(((aa) this).field_Ib);
              ((aa) this).field_Ib.c(0, 12);
              break L0;
            } else {
              if (((aa) this).field_Ob[param0] == -1) {
                int discarded$3 = 110;
                or.b();
                bm.g(0);
                break L0;
              } else {
                L1: {
                  var5 = ((aa) this).field_Ob[param0] | 32768;
                  var6 = ui.field_g;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (null == gd.field_j) {
                      break L1;
                    } else {
                      var6 = 1;
                      break L1;
                    }
                  }
                }
                L2: {
                  if (ab.a(0, var6) == 2) {
                    cf.a(var6, 1, param3, (byte) 119);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = null;
                tf.a(ui.field_g, ea.field_b, 47, (String) null, param1, var5);
                ug.a(ui.field_g, param2 + -32771, var5, ie.field_Nb, ea.field_b);
                bm.g(param2 + -32768);
                kk.a((byte) 43);
                break L0;
              }
            }
          } else {
            ((aa) this).a((byte) 34);
            this.c(param2 + -32768, 0);
            break L0;
          }
        }
        L3: {
          if (param2 == 32768) {
            break L3;
          } else {
            ((aa) this).field_Wb = null;
            break L3;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        aa var4 = null;
        nk var5 = null;
        int var6 = 0;
        aa var7 = null;
        nk stackIn_5_0 = null;
        nk stackIn_6_0 = null;
        nk stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        nk stackOut_4_0 = null;
        nk stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        nk stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((aa) this).field_Lb.length) {
            L1: {
              if (param1 == 538) {
                break L1;
              } else {
                ((aa) this).a((byte) -37);
                break L1;
              }
            }
            L2: {
              if (((aa) this).field_Ub == -1) {
                break L2;
              } else {
                var7 = ((aa) this).field_Wb[((aa) this).field_Ub];
                var4 = var7;
                if (var4 != null) {
                  var7.a(param0, 538, param2);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((aa) this).field_Pb > 0) {
                this.c(0, -1 + ((aa) this).field_Pb);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = ((aa) this).field_Lb[var4_int];
            if (1 == var5.field_tb) {
              L4: {
                this.a(var4_int, param0, 32768, param2);
                stackOut_4_0 = (nk) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((aa) this).field_Ub != var4_int) {
                  stackOut_6_0 = (nk) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L4;
                } else {
                  stackOut_5_0 = (nk) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L4;
                }
              }
              stackIn_7_0.field_V = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    public static void m(int param0) {
        field_Jb = null;
        if (param0 != -29238) {
            aa.m(73);
        }
        field_Sb = null;
    }

    final boolean l(int param0) {
        int var4 = 0;
        nk var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        nk[] var3 = ((aa) this).field_Lb;
        for (var4 = param0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_tb ? 1 : 0);
        }
        if (var2 == 0) {
            if (((aa) this).field_Ub != -1) {
                if (!(((aa) this).field_Wb[((aa) this).field_Ub] == null)) {
                    var2 = ((aa) this).field_Wb[((aa) this).field_Ub].l(0) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = new int[]{7, 28};
        field_Sb = new String[]{"Block", "Fan", "Portal", "Glue", "Barrier", "Trap", "Bomb", "Cracked", "Puller", "Pusher", "Metal", "Phased"};
    }
}
