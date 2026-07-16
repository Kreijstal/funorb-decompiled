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
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        jb var17 = null;
        jb var18 = null;
        ((le) this).field_Zb = -1;
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
        L0: while (true) {
          if (var13 >= ((le) this).field_Kb) {
            ((le) this).field_Mb = ((le) this).field_Mb + (10 + ab.field_R.field_t);
            this.e(144, 12);
            return;
          } else {
            L1: {
              if (((le) this).field_Wb[var13] <= 0) {
                break L1;
              } else {
                param6[var13] = var11 + lg.a(false, ((le) this).field_Wb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (null != ((le) this).field_Pb[var13]) {
                  break L3;
                } else {
                  if (-1 != ((le) this).field_Ub[var13]) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = (Object) (Object) ab.field_R;
              break L2;
            }
            ((le) this).field_Qb[var13] = new nh(0L, param2, (hl) null, param3, (oh) var14, param6[var13]);
            ((le) this).a((byte) 97, (hl) (Object) ((le) this).field_Qb[var13]);
            var15 = var17.b(param6[var13]);
            if (((le) this).field_Mb < var15) {
              ((le) this).field_Mb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    public static void j(int param0) {
        field_Lb = null;
        int var1 = -107 % ((10 - param0) / 47);
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
            ((le) this).field_Qb[var7].b(param5 + 0, ((le) this).field_Sb, ((le) this).field_Qb[var7].field_yb, param3, 0, param0, ((le) this).field_Ob);
        }
        if ((((le) this).field_Zb ^ -1) != param5) {
            if (null != ((le) this).field_Pb[((le) this).field_Zb]) {
                var7 = ((le) this).field_Pb[((le) this).field_Zb].field_Kb;
                var8 = ((le) this).field_Ob * (((le) this).field_Zb - -var7) + ((le) this).field_yb;
                while (var8 > param4) {
                    var8 = var8 - ((le) this).field_Ob;
                }
                ((le) this).field_Pb[((le) this).field_Zb].a(param0, ((le) this).field_Qb[((le) this).field_Zb].field_z, ((le) this).field_Sb + param2, param3, var8, param5 + 0);
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
              if ((((le) this).field_Zb ^ -1) != 0) {
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
              ba.a(((le) this).field_Yb, 123);
              ((le) this).field_Yb.e(144, 12);
              break L0;
            } else {
              if ((((le) this).field_Ub[param0] ^ -1) != 0) {
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
                go.c((byte) 42);
                kj.a((byte) 45);
                break L0;
              } else {
                cm.a((byte) -119);
                go.c((byte) 42);
                break L0;
              }
            }
          }
        }
        var5 = 30 / ((-69 - param2) / 55);
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          L1: {
            var5 = TetraLink.field_J;
            if (param1 <= 0) {
              break L1;
            } else {
              if (param1 < 128) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param1 < 160) {
              if (param1 != 0) {
                var6 = hc.field_o;
                var2 = var6;
                var3 = 0;
                L3: while (true) {
                  if (var6.length <= var3) {
                    break L2;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L3;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                break L2;
              }
            } else {
              if (param1 <= 255) {
                break L0;
              } else {
                if (param1 != 0) {
                  var6 = hc.field_o;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var6.length <= var3) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L4;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
          }
          L5: {
            if (param0 == 128) {
              break L5;
            } else {
              le.j(100);
              break L5;
            }
          }
          return false;
        }
        return true;
    }

    final boolean c(boolean param0) {
        int var4 = 0;
        nh var5 = null;
        int var6 = TetraLink.field_J;
        int var2 = param0 ? 1 : 0;
        nh[] var3 = ((le) this).field_Qb;
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (-1 != (var5.field_F ^ -1) ? 1 : 0);
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
        if (param0 != 144) {
            return;
        }
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
        int var4 = (dg.field_e ^ -1) == -86 ? 1 : 0;
        if (null != ((le) this).field_Yb) {
            if (var4 != 0) {
                if (!((((le) this).field_Yb.field_Zb ^ -1) != 0)) {
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
                    go.c((byte) 42);
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
            return -6145 >= (param0 ^ -1) ? -km.field_n[-param0 + 8192] : -km.field_n[param0 - 4096];
        }
        return -2049 >= (param0 ^ -1) ? km.field_n[4096 - param0] : km.field_n[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "You have entered another game.";
        field_Vb = "Full";
    }
}
