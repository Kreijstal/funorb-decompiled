/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends km {
    private char[] field_Jb;
    private int field_Lb;
    private int field_Ob;
    private oj[] field_Wb;
    static lc field_Xb;
    private int field_Eb;
    private int field_Nb;
    static java.awt.Image field_Gb;
    private static long[] field_Mb;
    static eh field_Fb;
    static int field_Vb;
    static int field_Kb;
    private int field_Pb;
    private oj field_Qb;
    private int field_Hb;
    private int[] field_Sb;
    private hk[] field_Ib;
    private int field_Rb;
    static int field_Yb;
    static el field_Ub;
    private int field_Tb;

    final boolean i(int param0) {
        int var4 = 0;
        hk var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        int var2 = 0;
        hk[] var3 = ((oj) this).field_Ib;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_nb ? 1 : 0);
        }
        if (var2 == 0) {
            if (((oj) this).field_Tb != -1) {
                if (((oj) this).field_Wb[((oj) this).field_Tb] != null) {
                    var2 = ((oj) this).field_Wb[((oj) this).field_Tb].i(-9184) ? 1 : 0;
                }
            }
        }
        if (param0 != -9184) {
            ((oj) this).field_Jb = null;
        }
        return var2 != 0;
    }

    oj(long param0, km param1, km param2, km param3, oj[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        e var17 = null;
        e var18 = null;
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
        ((oj) this).field_Tb = -1;
        try {
          L0: {
            ((oj) this).field_Jb = param7;
            ((oj) this).field_Sb = param5;
            ((oj) this).field_Wb = param4;
            ((oj) this).field_Nb = ((oj) this).field_Sb.length;
            var17 = param3.field_C;
            var18 = var17;
            ((oj) this).field_Ob = 2 + (var18.field_H + var18.field_G);
            ((oj) this).field_Lb = ((oj) this).field_Nb * ((oj) this).field_Ob;
            ((oj) this).field_Eb = 0;
            ((oj) this).field_Ib = new hk[((oj) this).field_Nb];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (var13 >= ((oj) this).field_Nb) {
                ((oj) this).field_Eb = ((oj) this).field_Eb + (da.field_h.field_u - -10);
                this.b(12, (byte) 49);
                break L0;
              } else {
                L2: {
                  if (0 >= ((oj) this).field_Jb[var13]) {
                    break L2;
                  } else {
                    param6[var13] = var11 + mb.a(true, ((oj) this).field_Jb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != ((oj) this).field_Wb[var13]) {
                      break L4;
                    } else {
                      if (-1 != ((oj) this).field_Sb[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) da.field_h;
                  break L3;
                }
                L5: {
                  ((oj) this).field_Ib[var13] = new hk(0L, param2, (km) null, param3, (mg) var14, param6[var13]);
                  ((oj) this).a(0, (km) (Object) ((oj) this).field_Ib[var13]);
                  var15 = var17.a(param6[var13]);
                  if (var15 <= ((oj) this).field_Eb) {
                    break L5;
                  } else {
                    ((oj) this).field_Eb = var15;
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
            stackOut_13_1 = new StringBuilder().append("oj.<init>(").append(param0).append(',');
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
          throw kg.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param0 <= -118) {
            break L0;
          } else {
            boolean discarded$1 = ((oj) this).a(false, -98, -15);
            break L0;
          }
        }
        L1: {
          if (~param2 != ~((oj) this).field_Tb) {
            if (null != ((oj) this).field_Wb[param2]) {
              ((oj) this).h(1026);
              this.b(0, (byte) 49);
              ((oj) this).field_Tb = param2;
              ((oj) this).field_Qb = ((oj) this).field_Wb[((oj) this).field_Tb];
              nb.a(false, ((oj) this).field_Qb);
              ((oj) this).field_Qb.b(12, (byte) 49);
              break L1;
            } else {
              if (((oj) this).field_Sb[param2] == -1) {
                aa.a((byte) 83);
                f.a((byte) -38);
                break L1;
              } else {
                L2: {
                  var5 = ((oj) this).field_Sb[param2] | 32768;
                  var6 = sd.field_e;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    if (wl.field_d != null) {
                      var6 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (id.a(var6, (byte) 55) == 2) {
                    sd.a(1, param3, var6, (byte) 58);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var8 = null;
                jl.a(var5, sd.field_e, va.field_d, param1, (byte) 39, (String) null);
                uk.a(var5, 5, va.field_d, sd.field_e, oc.field_n);
                f.a((byte) -128);
                gg.a(15810);
                break L1;
              }
            }
          } else {
            ((oj) this).h(1026);
            this.b(0, (byte) 49);
            break L1;
          }
        }
    }

    final void h(int param0) {
        int var3 = 0;
        hk var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        hk[] var6 = ((oj) this).field_Ib;
        hk[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_nb = 0;
            var4.field_xb = false;
        }
        if (null != ((oj) this).field_Qb) {
            ((oj) this).field_Qb.h(param0);
            ((oj) this).field_Qb.a(false);
        }
        ((oj) this).field_Tb = -1;
        ((oj) this).field_Qb = null;
        this.b(12, (byte) 49);
        if (param0 != 1026) {
            ((oj) this).field_Nb = -75;
        }
    }

    final boolean a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (um.field_Gb != 85) {
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
        if (null != ((oj) this).field_Qb) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (((oj) this).field_Qb.field_Tb != -1) {
                break L1;
              } else {
                ((oj) this).h(1026);
                this.b(0, (byte) 49);
                return true;
              }
            }
          }
          return ((oj) this).field_Qb.a(true, param1, param2);
        } else {
          L2: {
            if (((oj) this).field_Qb != null) {
              break L2;
            } else {
              if ((Object) (Object) dk.field_v != this) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  f.a((byte) -99);
                  return true;
                }
              }
            }
          }
          L3: {
            if (param0) {
              break L3;
            } else {
              oj.e((byte) 20);
              break L3;
            }
          }
          var5 = nm.field_d;
          if (var5 > 0) {
            L4: {
              if (ne.field_a != var5) {
                break L4;
              } else {
                var5 = 63;
                break L4;
              }
            }
            var6 = 0;
            L5: while (true) {
              if (var6 >= ((oj) this).field_Jb.length) {
                return false;
              } else {
                if (var5 != ((oj) this).field_Jb[var6]) {
                  var6++;
                  continue L5;
                } else {
                  this.a(-120, param2, var6, param1);
                  return true;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void f(byte param0) {
        int var1 = 0;
        field_Xb = null;
        field_Fb = null;
        field_Ub = null;
        field_Mb = null;
        field_Gb = null;
    }

    final static boolean j(int param0) {
        return nm.a(mb.g((byte) -90), 123);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        ((oj) this).field_Rb = ((oj) this).field_Eb - -(param1 * 2);
        ((oj) this).a(param2, ((oj) this).field_Lb, ((oj) this).field_Rb, (byte) -113, param3 + -((oj) this).field_Lb);
        if (!(((oj) this).field_Hb == param4)) {
            ((oj) this).field_Hb = param4;
            this.b(((oj) this).field_Pb, (byte) 49);
        }
        for (var7 = param5; var7 < ((oj) this).field_Nb; var7++) {
            ((oj) this).field_Ib[var7].a(((oj) this).field_Rb, 0, 2, ((oj) this).field_Ib[var7].field_F, param0, ((oj) this).field_Ob, param1);
        }
        if (((oj) this).field_Tb != -1) {
            if (!(null == ((oj) this).field_Wb[((oj) this).field_Tb])) {
                var7 = ((oj) this).field_Wb[((oj) this).field_Tb].field_Nb;
                var8 = ((oj) this).field_F + ((oj) this).field_Ob * (var7 + ((oj) this).field_Tb);
                while (var8 > param3) {
                    var8 = var8 - ((oj) this).field_Ob;
                }
                ((oj) this).field_Wb[((oj) this).field_Tb].a(param0, param1, param2 - -((oj) this).field_Rb, var8, ((oj) this).field_Ib[((oj) this).field_Tb].field_J, 0);
            }
        }
    }

    final static void a(int param0, wg param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, wg param11, byte param12, int param13, e param14, int param15, int param16, e param17, int param18, wg param19, int param20) {
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            wf.a(480, param17, 0, param14);
            vb.a(param0, (byte) 90, param16, param20, param18);
            bj.a(param8, 23, param15);
            sh.a((byte) -40, param9, param19, param11, param2, param5);
            ld.a(-1, 0, 0, param1);
            qd.a(param4, (byte) 41, param7, param13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("oj.I(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',').append(0).append(',').append(param4).append(',').append(param5).append(',').append(0).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(480).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param11 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(-29).append(',').append(param13).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param14 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param15).append(',').append(param16).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param17 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param18).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param19 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param20 + ')');
        }
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        pm var1_ref = null;
        float var1_float = 0.0f;
        float var2_float = 0.0f;
        ij var2 = null;
        fl var3 = null;
        ij var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ij var7 = null;
        ij stackIn_79_0 = null;
        ij stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        ij stackIn_80_0 = null;
        ij stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        ij stackIn_81_0 = null;
        ij stackIn_81_1 = null;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        int stackIn_109_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_78_0 = null;
        ij stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        ij stackOut_80_0 = null;
        ij stackOut_80_1 = null;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        ij stackOut_79_0 = null;
        ij stackOut_79_1 = null;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ln.field_g == bc.field_c) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var1_int = 1;
                    if (gb.field_H.field_g) {
                      break L3;
                    } else {
                      if (!ke.field_p.field_g) {
                        break L3;
                      } else {
                        em.field_c = sg.field_i;
                        jk.field_c = 2;
                        ec.field_z = sj.field_o;
                        var2_float = -cf.field_c + ec.field_z;
                        L4: while (true) {
                          if ((double)var2_float >= -3.141592653589793) {
                            L5: while (true) {
                              if ((double)var2_float <= 3.141592653589793) {
                                L6: {
                                  if ((double)Math.abs(var2_float) > 0.01) {
                                    break L6;
                                  } else {
                                    if ((double)Math.abs(lj.field_r - em.field_c) <= 0.05) {
                                      lj.field_r = em.field_c;
                                      cf.field_c = ec.field_z;
                                      vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                                      vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                                      gb.c((byte) -44);
                                      break L2;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var1_int = 0;
                                break L2;
                              } else {
                                var2_float = (float)((double)var2_float - 6.283185307179586);
                                continue L5;
                              }
                            }
                          } else {
                            var2_float = (float)((double)var2_float + 6.283185307179586);
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  if (!gb.field_H.field_g) {
                    break L2;
                  } else {
                    if (!ke.field_p.field_g) {
                      cf.field_c = sj.field_o;
                      lj.field_r = sg.field_i;
                      vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                      vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                      ke.field_p.field_g = true;
                      gb.c((byte) -44);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L7: {
                  ke.field_p.field_k = gb.field_H.field_k;
                  if (!gb.field_H.field_d) {
                    L8: {
                      if (!ke.field_p.field_d) {
                        break L8;
                      } else {
                        mj.field_D = 0;
                        ke.field_p.field_d = false;
                        break L8;
                      }
                    }
                    mj.field_D = mj.field_D + 16384;
                    if (mj.field_D >= 262144) {
                      mj.field_D = 262144;
                      break L7;
                    } else {
                      var1_int = 0;
                      break L7;
                    }
                  } else {
                    mj.field_D = mj.field_D - 16384;
                    if (mj.field_D > 0) {
                      var1_int = 0;
                      break L7;
                    } else {
                      mj.field_D = 0;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (gb.field_H.field_f > ke.field_p.field_f) {
                    ke.field_p.field_f = ke.field_p.field_f + 1;
                    break L9;
                  } else {
                    if (ke.field_p.field_f > gb.field_H.field_f) {
                      ke.field_p.field_f = ke.field_p.field_f - 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (ke.field_p.field_f == gb.field_H.field_f) {
                    break L10;
                  } else {
                    var1_int = 0;
                    break L10;
                  }
                }
                ke.field_p.field_m = gb.field_H.field_m;
                ke.field_p.field_e = gb.field_H.field_e;
                if (var1_int == 0) {
                  break L1;
                } else {
                  ke.field_p = gb.field_H;
                  ln.field_g = bc.field_c;
                  break L1;
                }
              }
            }
            L11: {
              if (jk.field_c != 0) {
                L12: while (true) {
                  if ((double)cf.field_c >= -3.141592653589793) {
                    L13: while (true) {
                      if (-3.141592653589793 <= (double)ec.field_z) {
                        L14: while (true) {
                          if (3.141592653589793 >= (double)cf.field_c) {
                            L15: while (true) {
                              if ((double)ec.field_z <= 3.141592653589793) {
                                var1_float = ec.field_z - cf.field_c;
                                L16: while (true) {
                                  if ((double)var1_float >= -3.141592653589793) {
                                    L17: while (true) {
                                      if ((double)var1_float <= 3.141592653589793) {
                                        L18: {
                                          var2_float = em.field_c - lj.field_r;
                                          cf.field_c = cf.field_c + 0.05000000074505806f * var1_float;
                                          lj.field_r = lj.field_r + var2_float * 0.05000000074505806f;
                                          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                                          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                                          gb.c((byte) -44);
                                          if ((double)Math.abs(var1_float) >= 0.0001) {
                                            break L18;
                                          } else {
                                            if (0.05 > (double)Math.abs(var2_float)) {
                                              lj.field_r = em.field_c;
                                              cf.field_c = ec.field_z;
                                              jk.field_c = 0;
                                              vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                                              vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                                              gb.c((byte) -44);
                                              break L11;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        if ((double)Math.abs(var1_float) >= 0.1) {
                                          break L11;
                                        } else {
                                          if (Math.abs(var2_float) < 1.0f) {
                                            jk.field_c = 1;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      } else {
                                        var1_float = (float)((double)var1_float - 6.283185307179586);
                                        continue L17;
                                      }
                                    }
                                  } else {
                                    var1_float = (float)((double)var1_float + 6.283185307179586);
                                    continue L16;
                                  }
                                }
                              } else {
                                ec.field_z = (float)((double)ec.field_z - 6.283185307179586);
                                continue L15;
                              }
                            }
                          } else {
                            cf.field_c = (float)((double)cf.field_c - 6.283185307179586);
                            continue L14;
                          }
                        }
                      } else {
                        ec.field_z = (float)((double)ec.field_z + 6.283185307179586);
                        continue L13;
                      }
                    }
                  } else {
                    cf.field_c = (float)((double)cf.field_c + 6.283185307179586);
                    continue L12;
                  }
                }
              } else {
                break L11;
              }
            }
            L19: {
              if (hm.field_c == 10) {
                L20: {
                  ad.field_g[0] = 1.0;
                  mj.field_D = 262144;
                  em.field_c = 80.0f;
                  lj.field_r = 80.0f;
                  ad.field_g[2] = 0.0;
                  co.field_h = 0;
                  we.field_k = 50.0f;
                  ao.field_Hb = 52.5f;
                  cf.field_c = sj.field_o;
                  if (id.field_r < 10) {
                    jk.field_c = 2;
                    vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                    vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                    gb.c((byte) -44);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                if (id.field_r <= 350) {
                  ec.field_z = sj.field_o;
                  em.field_c = 80.0f;
                  break L19;
                } else {
                  break L19;
                }
              } else {
                break L19;
              }
            }
            var1_ref = (pm) (Object) gd.field_n.a((byte) -122);
            L21: while (true) {
              if (var1_ref == null) {
                var2 = (ij) (Object) sk.field_a.a((byte) -69);
                L22: while (true) {
                  if (var2 == null) {
                    L23: {
                      if (0 != sh.a(4712, 40)) {
                        break L23;
                      } else {
                        L24: {
                          stackOut_78_0 = null;
                          stackOut_78_1 = null;
                          stackOut_78_2 = sh.a(4712, 3);
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_80_1 = stackOut_78_1;
                          stackIn_80_2 = stackOut_78_2;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          stackIn_79_2 = stackOut_78_2;
                          if (sh.a(4712, 2) != 0) {
                            stackOut_80_0 = null;
                            stackOut_80_1 = null;
                            stackOut_80_2 = stackIn_80_2;
                            stackOut_80_3 = 0;
                            stackIn_81_0 = stackOut_80_0;
                            stackIn_81_1 = stackOut_80_1;
                            stackIn_81_2 = stackOut_80_2;
                            stackIn_81_3 = stackOut_80_3;
                            break L24;
                          } else {
                            stackOut_79_0 = null;
                            stackOut_79_1 = null;
                            stackOut_79_2 = stackIn_79_2;
                            stackOut_79_3 = 1;
                            stackIn_81_0 = stackOut_79_0;
                            stackIn_81_1 = stackOut_79_1;
                            stackIn_81_2 = stackOut_79_2;
                            stackIn_81_3 = stackOut_79_3;
                            break L24;
                          }
                        }
                        var7 = new ij(stackIn_81_2, stackIn_81_3 != 0, sh.a(4712, 64));
                        var3_ref = (ij) (Object) sk.field_a.a((byte) -64);
                        L25: while (true) {
                          L26: {
                            if (var3_ref == null) {
                              break L26;
                            } else {
                              if (var7.field_l <= var3_ref.field_l) {
                                var3_ref = (ij) (Object) sk.field_a.a(16213);
                                continue L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                          if (var3_ref != null) {
                            td.a((l) (Object) var3_ref, (byte) -93, (l) (Object) var7);
                            break L23;
                          } else {
                            sk.field_a.a((l) (Object) var7, (byte) -69);
                            break L23;
                          }
                        }
                      }
                    }
                    var3 = (fl) (Object) sh.field_tb.a((byte) -68);
                    L27: while (true) {
                      if (var3 == null) {
                        L28: {
                          if (ke.field_p.field_e <= 0) {
                            break L28;
                          } else {
                            L29: {
                              if (ke.field_p.field_e == 1) {
                                break L29;
                              } else {
                                if (sh.a(4712, ke.field_p.field_e) == 0) {
                                  break L29;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            L30: while (true) {
                              var4 = -4096 + sh.a(4712, 8193);
                              var5 = -4096 + sh.a(4712, 8193);
                              if (var4 * var4 - -(var5 * var5) >= 8388608) {
                                continue L30;
                              } else {
                                var3 = new fl(0, 1638400, 0, var4, -8192, var5, 150);
                                sh.field_tb.a((l) (Object) var3, (byte) -104);
                                break L28;
                              }
                            }
                          }
                        }
                        L31: {
                          if (param0 <= -32) {
                            break L31;
                          } else {
                            field_Mb = null;
                            break L31;
                          }
                        }
                        L32: {
                          L33: {
                            if (-4 == hm.field_c) {
                              break L33;
                            } else {
                              if (-2 == hm.field_c) {
                                break L33;
                              } else {
                                L34: {
                                  if (gb.field_H.field_g) {
                                    stackOut_108_0 = 2;
                                    stackIn_109_0 = stackOut_108_0;
                                    break L34;
                                  } else {
                                    stackOut_107_0 = 1;
                                    stackIn_109_0 = stackOut_107_0;
                                    break L34;
                                  }
                                }
                                wn.field_C = stackIn_109_0;
                                break L32;
                              }
                            }
                          }
                          wn.field_C = 0;
                          break L32;
                        }
                        L35: {
                          if (wn.field_C != he.field_ec) {
                            int fieldTemp$4 = ai.field_f + 8;
                            ai.field_f = ai.field_f + 8;
                            if (fieldTemp$4 >= 256) {
                              ai.field_f = 0;
                              he.field_ec = wn.field_C;
                              break L35;
                            } else {
                              break L35;
                            }
                          } else {
                            ai.field_f = 0;
                            break L35;
                          }
                        }
                        L36: {
                          var4 = 0;
                          if (wn.field_C == 2) {
                            var4 = vg.field_H.a(sl.field_a) - -17;
                            if (var4 >= 135) {
                              break L36;
                            } else {
                              var4 = 135;
                              break L36;
                            }
                          } else {
                            if (wn.field_C != 1) {
                              break L36;
                            } else {
                              var4 = vg.field_H.a(o.field_a) + 25;
                              break L36;
                            }
                          }
                        }
                        kd.field_t = kd.field_t + 0.10000000149011612f * (-kd.field_t + (float)var4);
                        break L0;
                      } else {
                        L37: {
                          int fieldTemp$5 = var3.field_o - 1;
                          var3.field_o = var3.field_o - 1;
                          if (fieldTemp$5 > 0) {
                            var3.field_p = var3.field_p + var3.field_l;
                            var3.field_m = var3.field_m + var3.field_h;
                            var3.field_n = var3.field_n + var3.field_q;
                            var3.field_l = var3.field_l + 48;
                            break L37;
                          } else {
                            var3.a(false);
                            break L37;
                          }
                        }
                        var3 = (fl) (Object) sh.field_tb.a(16213);
                        continue L27;
                      }
                    }
                  } else {
                    L38: {
                      int fieldTemp$6 = var2.field_o + 1;
                      var2.field_o = var2.field_o + 1;
                      if (fieldTemp$6 <= 83) {
                        break L38;
                      } else {
                        var2.a(false);
                        break L38;
                      }
                    }
                    var2 = (ij) (Object) sk.field_a.a(16213);
                    continue L22;
                  }
                }
              } else {
                L39: {
                  int fieldTemp$7 = var1_ref.field_r - 1;
                  var1_ref.field_r = var1_ref.field_r - 1;
                  if (0 != fieldTemp$7) {
                    break L39;
                  } else {
                    var1_ref.a(false);
                    break L39;
                  }
                }
                var1_ref = (pm) (Object) gd.field_n.a(16213);
                continue L21;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "oj.J(" + param0 + ')');
        }
    }

    final int g(int param0) {
        if (param0 != -10) {
            ((oj) this).field_Jb = null;
        }
        return ((oj) this).field_Rb + (((oj) this).field_Qb == null ? 0 : ((oj) this).field_Qb.g(-10));
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        oj var4 = null;
        hk var5_ref_hk = null;
        int var5 = 0;
        int var6 = 0;
        oj var7 = null;
        hk stackIn_5_0 = null;
        hk stackIn_6_0 = null;
        hk stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hk stackOut_4_0 = null;
        hk stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        hk stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((oj) this).field_Ib.length) {
            L1: {
              var5 = -102 / ((19 - param1) / 36);
              if (((oj) this).field_Tb != -1) {
                var7 = ((oj) this).field_Wb[((oj) this).field_Tb];
                var4 = var7;
                if (var4 == null) {
                  break L1;
                } else {
                  var7.b(param0, -65, param2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((oj) this).field_Pb <= 0) {
                break L2;
              } else {
                this.b(-1 + ((oj) this).field_Pb, (byte) 49);
                break L2;
              }
            }
            return;
          } else {
            var5_ref_hk = ((oj) this).field_Ib[var4_int];
            if (var5_ref_hk.field_nb == 1) {
              L3: {
                this.a(-119, param2, var4_int, param0);
                stackOut_4_0 = (hk) var5_ref_hk;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4_int != ((oj) this).field_Tb) {
                  stackOut_6_0 = (hk) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (hk) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              stackIn_7_0.field_xb = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            we.field_h = param1 * 6;
            ve.field_x = new int[we.field_h + (we.field_h * (1 + we.field_h) / 2 - -1)];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= we.field_h) {
                break L0;
              } else {
                var3 = var2_int * var2_int;
                var4 = 0;
                L2: while (true) {
                  if (var2_int < var4) {
                    var2_int++;
                    continue L1;
                  } else {
                    L3: {
                      L4: {
                        var5 = var4 * var4;
                        var6 = var5 + var3;
                        if (0 != var5) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            of.a(2, aj.field_g, var2_int, var4);
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var7 = aj.field_g * param1 / var6;
                        stackOut_8_0 = 2;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (0 < var7) {
                          stackOut_10_0 = stackIn_10_0;
                          stackOut_10_1 = var7;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          break L5;
                        } else {
                          stackOut_9_0 = stackIn_9_0;
                          stackOut_9_1 = 0;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          break L5;
                        }
                      }
                      of.a(stackIn_11_0, stackIn_11_1, var2_int, var4);
                      break L3;
                    }
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "oj.G(" + -9 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, byte param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        ((oj) this).field_Pb = param0;
        for (var5 = 0; ((oj) this).field_Nb > var5; var5++) {
            var3 = ((oj) this).field_Ob * var5;
            var4 = ((oj) this).field_Pb * ((oj) this).field_Pb;
            ((oj) this).field_Ib[var5].field_F = (var3 * (144 + -var4) + (((oj) this).field_Hb - ((oj) this).field_J) * var4) / 144;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_Xb = new lc(13, 0, 1, 0);
        field_Mb = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_Mb[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L) == 1L) {
                  var0 = var0 >>> 1 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
