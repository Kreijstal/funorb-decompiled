/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends je {
    static df field_Qb;
    private nf[] field_Sb;
    private int field_Kb;
    static int field_Wb;
    private int field_Xb;
    static int[][] field_Vb;
    static String field_Jb;
    private wk[] field_Ub;
    private je field_Tb;
    private je field_Nb;
    static String field_Ob;
    private int field_Pb;
    private int field_Lb;
    private int field_Yb;
    private int field_Rb;
    private int[] field_Mb;
    private int field_Ib;

    final void a(boolean param0, String param1, int param2, wk param3) {
        boolean discarded$0 = false;
        try {
            if (param0) {
                discarded$0 = this.d((byte) 111);
            }
            this.field_Sb[this.field_Lb] = new nf(0L, (je) null, (je) null, this.field_Tb, param3, param1);
            this.field_Sb[this.field_Lb].field_mb = this.field_Ub;
            this.field_Sb[this.field_Lb].field_ub = true;
            this.field_Sb[this.field_Lb].field_Fb = 1;
            this.a(this.field_Sb[this.field_Lb], 86);
            this.field_Mb[this.field_Lb] = param2;
            this.field_Lb = this.field_Lb + 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "np.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    np(np param0) {
        this(param0, param0.field_Ub, param0.field_Nb, param0.field_Tb, param0.field_Rb, param0.field_Pb, param0.field_Yb, param0.field_Xb, param0.field_Ib);
    }

    final static void a(boolean param0, byte param1) {
        gd var3 = null;
        if (cd.c(9501)) {
          if (!param0) {
            ee.field_v.a(0, -118, 0);
            if (param1 < -111) {
              return;
            } else {
              var3 = (gd) null;
              np.a(false, (gd) null);
              return;
            }
          } else {
            qn.b(0, 0, qn.field_l, qn.field_g, 0, 192);
            ee.field_v.a(0, -118, 0);
            if (param1 < -111) {
              return;
            } else {
              var3 = (gd) null;
              np.a(false, (gd) null);
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean d(byte param0) {
        if (param0 >= 59) {
          if (1 != (this.field_Kb ^ -1)) {
            return false;
          } else {
            if (rs.field_q == 13) {
              this.field_Kb = -1;
              return true;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void k(int param0) {
        rs.field_t = 0;
        if (param0 <= 63) {
            field_Jb = (String) null;
            hh.a((byte) 126);
            return;
        }
        hh.a((byte) 126);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 == (this.field_Lb ^ -1)) {
            this.field_Sb[this.field_Lb] = new nf(0L, (je) null, (je) null, this.field_Nb, (wk) null, va.field_F);
            this.field_Sb[this.field_Lb].field_Fb = 1;
            this.a(this.field_Sb[this.field_Lb], 43);
            this.field_Mb[this.field_Lb] = -1;
            this.field_Lb = this.field_Lb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 == -118) {
          var6 = 0;
          var7 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var7 >= this.field_Lb) {
                  break L3;
                } else {
                  var8 = this.field_Sb[var7].a(param3 ^ 35, this.field_Yb, this.field_Pb);
                  stackOut_7_0 = var6;
                  stackOut_7_1 = var8;
                  stackIn_13_0 = stackOut_7_0;
                  stackIn_13_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (var11 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (stackIn_8_0 < stackIn_8_1) {
                        var6 = var8;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7++;
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var6 = var6 + 2 * this.field_Rb;
              var7 = this.field_Xb + this.field_Lb * this.field_Ib + this.field_Xb;
              var8 = jp.a(param4, param2, var6, -1);
              stackOut_12_0 = var7;
              stackOut_12_1 = 0;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L2;
            }
            var9 = pd.a(stackIn_13_0, stackIn_13_1, param1, param0);
            this.a(var7, -20500, var6, var9, var8);
            var10 = 0;
            L5: while (true) {
              if (this.field_Lb > var10) {
                this.field_Sb[var10].a(this.field_Ib, this.field_Pb, -30061, -(2 * this.field_Rb) + var6, this.field_Ib * var10 + this.field_Xb, this.field_Rb, this.field_Yb);
                var10++;
                if (var11 == 0) {
                  continue L5;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    np(je param0, wk[] param1, je param2, je param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Sb = new nf[256];
        this.field_Kb = -2;
        this.field_Mb = new int[256];
        try {
            this.field_Rb = param4;
            this.field_Nb = param2;
            this.field_Pb = param5;
            this.field_Ub = param1;
            this.field_Yb = param6;
            this.field_Ib = param8;
            this.field_Xb = param7;
            this.field_Tb = param3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "np.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void e(byte param0) {
        field_Qb = null;
        if (param0 != 5) {
          np.k(-69);
          field_Jb = null;
          field_Vb = (int[][]) null;
          field_Ob = null;
          return;
        } else {
          field_Jb = null;
          field_Vb = (int[][]) null;
          field_Ob = null;
          return;
        }
    }

    final void a(int param0, String param1, byte param2) {
        try {
            if (param2 >= -98) {
                np.k(-112);
            }
            this.field_Sb[this.field_Lb] = new nf(0L, (je) null, (je) null, this.field_Tb, (wk) null, param1);
            this.field_Sb[this.field_Lb].field_mb = this.field_Ub;
            this.field_Sb[this.field_Lb].field_ub = true;
            this.field_Sb[this.field_Lb].field_Fb = 1;
            this.a(this.field_Sb[this.field_Lb], 55);
            this.field_Mb[this.field_Lb] = param0;
            this.field_Lb = this.field_Lb + 1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "np.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, gd param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                np.e((byte) 102);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= param1.field_I) {
                    break L4;
                  } else {
                    param1.field_o[var2_int] = 0;
                    var2_int++;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                param1.field_R = ih.field_E;
                param1.field_Z = ih.field_E;
                param1.field_t = ih.field_E;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("np.G(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(true, param1);
        if (!param1) {
          return -2;
        } else {
          L0: {
            var3 = 0;
            if (param0 > 93) {
              break L0;
            } else {
              this.field_Kb = -92;
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              if (var3 >= this.field_Lb) {
                break L2;
              } else {
                var6 = -1;
                var5 = this.field_Sb[var3].field_yb ^ -1;
                if (var4 != 0) {
                  if (var5 != var6) {
                    return -1;
                  } else {
                    return this.field_Kb;
                  }
                } else {
                  if (var5 == var6) {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  } else {
                    return this.field_Mb[var3];
                  }
                }
              }
            }
            if (tr.field_A != 0) {
              return -1;
            } else {
              return this.field_Kb;
            }
          }
        }
    }

    static {
        field_Vb = new int[][]{new int[]{0, 0, 0}, new int[]{2, 0, 0}, new int[]{5, 0, 0}, new int[]{10, 0, 0}, new int[]{0, 2, 0}, new int[]{0, 3, 0}, new int[]{0, 0, 1}};
        field_Jb = "Cancel draw";
        field_Ob = "Mind control";
    }
}
