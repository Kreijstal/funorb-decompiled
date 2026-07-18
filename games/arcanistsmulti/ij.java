/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends kc {
    private int field_Db;
    private char[] field_Lb;
    private int field_Kb;
    static qb field_Tb;
    static String field_Rb;
    static String field_Gb;
    static String field_Cb;
    private int field_Mb;
    private nl[] field_Bb;
    private int field_Qb;
    private int field_Jb;
    static String field_Ob;
    static String[] field_Ub;
    private int field_Nb;
    private int field_Hb;
    private int field_Eb;
    private ij[] field_Fb;
    static qb[] field_Pb;
    private ij field_Sb;
    private int[] field_Ib;

    private final static void a(int param0, int param1, int param2, long param3, String param4) {
        rf.field_n = param3;
        vh.field_A = param4;
        qj.field_c = param1;
        if (param0 != -1) {
            return;
        }
        try {
            hi.field_g = param2;
            bo.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ij.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0, int param1) {
        return param0 >= 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (((ij) this).field_Hb != param3) {
            if (null != ((ij) this).field_Fb[param3]) {
              ((ij) this).e(46);
              this.c(-99, 0);
              ((ij) this).field_Hb = param3;
              ((ij) this).field_Sb = ((ij) this).field_Fb[((ij) this).field_Hb];
              vl.a((byte) 121, ((ij) this).field_Sb);
              ((ij) this).field_Sb.c(-111, 12);
              break L0;
            } else {
              if (((ij) this).field_Ib[param3] == -1) {
                int discarded$25 = -19741;
                ua.g();
                gb.a(14);
                break L0;
              } else {
                L1: {
                  var5 = 32768 | ((ij) this).field_Ib[param3];
                  var6 = nj.field_c;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (null == wi.field_f) {
                      break L1;
                    } else {
                      var6 = 1;
                      break L1;
                    }
                  }
                }
                L2: {
                  if (oh.a((byte) 122, var6) != 2) {
                    break L2;
                  } else {
                    ea.a(param2, 1, true, var6);
                    break L2;
                  }
                }
                var8 = null;
                sd.a(var5, (String) null, 70, param1, nj.field_c, so.field_p);
                ij.a(param0 ^ -13, nj.field_c, var5, gg.field_e, so.field_p);
                gb.a(14);
                cf.a(-113);
                break L0;
              }
            }
          } else {
            ((ij) this).e(-100);
            this.c(-56, 0);
            break L0;
          }
        }
        L3: {
          if (param0 == 12) {
            break L3;
          } else {
            ((ij) this).field_Kb = 86;
            break L3;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        ij var4 = null;
        nl var5 = null;
        int var6 = 0;
        ij var7 = null;
        nl stackIn_5_0 = null;
        nl stackIn_6_0 = null;
        nl stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        nl stackOut_4_0 = null;
        nl stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        nl stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (((ij) this).field_Bb.length <= var4_int) {
            L1: {
              if (param1 == -10284) {
                break L1;
              } else {
                ((ij) this).field_Db = 41;
                break L1;
              }
            }
            L2: {
              if (-1 != ((ij) this).field_Hb) {
                var7 = ((ij) this).field_Fb[((ij) this).field_Hb];
                var4 = var7;
                if (var4 != null) {
                  var7.a(param0, -10284, param2);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (((ij) this).field_Qb > 0) {
                this.c(param1 ^ 10345, ((ij) this).field_Qb - 1);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = ((ij) this).field_Bb[var4_int];
            if (var5.field_U == 1) {
              L4: {
                this.a(param1 ^ -10280, param2, param0, var4_int);
                stackOut_4_0 = (nl) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4_int != ((ij) this).field_Hb) {
                  stackOut_6_0 = (nl) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L4;
                } else {
                  stackOut_5_0 = (nl) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L4;
                }
              }
              stackIn_7_0.field_ab = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void e(int param0) {
        int var3 = 0;
        nl var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        nl[] var6 = ((ij) this).field_Bb;
        nl[] var2_ref_nl__ = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_U = 0;
            var4.field_ab = false;
        }
        if (!(((ij) this).field_Sb == null)) {
            ((ij) this).field_Sb.e(78);
            ((ij) this).field_Sb.a(true);
        }
        ((ij) this).field_Sb = null;
        int var2 = -112 % ((-38 - param0) / 54);
        ((ij) this).field_Hb = -1;
        this.c(-99, 12);
    }

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        ((ij) this).field_Qb = param1;
        if (param0 >= -50) {
            return;
        }
        for (var5 = 0; var5 < ((ij) this).field_Jb; var5++) {
            var3 = ((ij) this).field_Db * var5;
            var4 = ((ij) this).field_Qb * ((ij) this).field_Qb;
            ((ij) this).field_Bb[var5].field_db = (var3 * (-var4 + 144) + var4 * (-((ij) this).field_nb + ((ij) this).field_Mb)) / 144;
        }
    }

    ij(long param0, kc param1, kc param2, kc param3, ij[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        dj var17 = null;
        dj var18 = null;
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
        ((ij) this).field_Hb = -1;
        try {
          L0: {
            ((ij) this).field_Ib = param5;
            ((ij) this).field_Fb = param4;
            ((ij) this).field_Lb = param7;
            ((ij) this).field_Jb = ((ij) this).field_Ib.length;
            var17 = param3.field_Z;
            var18 = var17;
            ((ij) this).field_Db = var18.field_m + 2 - -var18.field_C;
            ((ij) this).field_Eb = ((ij) this).field_Db * ((ij) this).field_Jb;
            ((ij) this).field_Kb = 0;
            ((ij) this).field_Bb = new nl[((ij) this).field_Jb];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (((ij) this).field_Jb <= var13) {
                ((ij) this).field_Kb = ((ij) this).field_Kb + (ql.field_c.field_n + 10);
                this.c(-70, 12);
                break L0;
              } else {
                L2: {
                  if (((ij) this).field_Lb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + hg.a(3, ((ij) this).field_Lb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (((ij) this).field_Fb[var13] != null) {
                      break L4;
                    } else {
                      if (-1 != ((ij) this).field_Ib[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) ql.field_c;
                  break L3;
                }
                L5: {
                  ((ij) this).field_Bb[var13] = new nl(0L, param2, (kc) null, param3, (qb) var14, param6[var13]);
                  ((ij) this).a((kc) (Object) ((ij) this).field_Bb[var13], 90);
                  var15 = var17.b(param6[var13]);
                  if (var15 <= ((ij) this).field_Kb) {
                    break L5;
                  } else {
                    ((ij) this).field_Kb = var15;
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
            stackOut_13_1 = new StringBuilder().append("ij.<init>(").append(param0).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    final boolean f(byte param0) {
        int var4 = 0;
        nl var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = 0;
        nl[] var3 = ((ij) this).field_Bb;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_U ? 1 : 0);
        }
        if (param0 != 93) {
            ((ij) this).field_Kb = 102;
        }
        if (var2 == 0) {
            if (((ij) this).field_Hb != -1) {
                if (((ij) this).field_Fb[((ij) this).field_Hb] != null) {
                    var2 = ((ij) this).field_Fb[((ij) this).field_Hb].f((byte) 93) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          ((ij) this).field_Nb = ((ij) this).field_Kb + 2 * param0;
          ((ij) this).a(((ij) this).field_Nb, param1, param2 - ((ij) this).field_Eb, ((ij) this).field_Eb, (byte) -120);
          if (((ij) this).field_Mb == param4) {
            break L0;
          } else {
            ((ij) this).field_Mb = param4;
            this.c(-95, ((ij) this).field_Qb);
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (var7 >= ((ij) this).field_Jb) {
            L2: {
              if (param3) {
                break L2;
              } else {
                field_Tb = null;
                break L2;
              }
            }
            L3: {
              if (((ij) this).field_Hb == -1) {
                break L3;
              } else {
                if (null != ((ij) this).field_Fb[((ij) this).field_Hb]) {
                  var7 = ((ij) this).field_Fb[((ij) this).field_Hb].field_Jb;
                  var8 = ((ij) this).field_db + (((ij) this).field_Hb + var7) * ((ij) this).field_Db;
                  L4: while (true) {
                    if (var8 <= param2) {
                      ((ij) this).field_Fb[((ij) this).field_Hb].a(param0, param1 - -((ij) this).field_Nb, var8, param3, ((ij) this).field_Bb[((ij) this).field_Hb].field_nb, param5);
                      break L3;
                    } else {
                      var8 = var8 - ((ij) this).field_Db;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            ((ij) this).field_Bb[var7].a(param0, 0, ((ij) this).field_Db, ((ij) this).field_Nb, 0, ((ij) this).field_Bb[var7].field_db, param5);
            var7++;
            continue L1;
          }
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((ij) this).b(39, 104, -123);
        }
        return ((ij) this).field_Nb + (null == ((ij) this).field_Sb ? 0 : ((ij) this).field_Sb.f(param0));
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (vn.field_d != 85) {
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
        if (((ij) this).field_Sb != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (((ij) this).field_Sb.field_Hb != -1) {
                break L1;
              } else {
                ((ij) this).e(42);
                this.c(-103, 0);
                return true;
              }
            }
          }
          return ((ij) this).field_Sb.b(100, param1, param2);
        } else {
          L2: {
            if (null != ((ij) this).field_Sb) {
              break L2;
            } else {
              if (this != (Object) (Object) nn.field_q) {
                break L2;
              } else {
                if (var4 != 0) {
                  gb.a(14);
                  return true;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            var5 = ed.field_Bb;
            if (param0 >= 76) {
              break L3;
            } else {
              this.c(22, -124);
              break L3;
            }
          }
          L4: {
            if (0 >= var5) {
              break L4;
            } else {
              L5: {
                if (se.field_E != var5) {
                  break L5;
                } else {
                  var5 = 63;
                  break L5;
                }
              }
              var6 = 0;
              L6: while (true) {
                if (((ij) this).field_Lb.length <= var6) {
                  break L4;
                } else {
                  if (((ij) this).field_Lb[var6] == var5) {
                    this.a(12, param1, param2, var6);
                    return true;
                  } else {
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    public static void g() {
        field_Ob = null;
        field_Tb = null;
        field_Gb = null;
        field_Ub = null;
        field_Pb = null;
        field_Cb = null;
        field_Rb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Sorted by win percentage";
        field_Gb = "<%0> has entered another game.";
        field_Rb = "Don't mind";
        field_Ub = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to ArcanistsMultiText.text_benefits."};
        field_Ob = "Click  to buy this spellbook!";
    }
}
