/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends ak {
    private te[] field_Gb;
    private int field_Fb;
    private char[] field_Hb;
    static String field_Eb;
    private int[] field_Tb;
    private int field_Ob;
    private lo[] field_Sb;
    private int field_Kb;
    private te field_Pb;
    static String field_Ib;
    private int field_Jb;
    static ea field_Nb;
    private int field_Lb;
    private int field_Rb;
    private int field_Ub;
    private int field_Mb;
    static al field_Qb;

    final static void b(boolean param0, int param1) {
        int var4 = 0;
        ck var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = -84 / ((29 - param1) / 52);
        ck[] var3 = jm.field_d;
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var5.a(100, param0);
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -2671) {
            field_Nb = null;
        }
        u.field_h = param0;
    }

    final void l(int param0) {
        int var3 = 0;
        lo var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        lo[] var6 = ((te) this).field_Sb;
        lo[] var2 = var6;
        if (param0 != 17872) {
            ((te) this).field_Hb = null;
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_U = false;
            var4.field_P = 0;
        }
        if (!(null == ((te) this).field_Pb)) {
            ((te) this).field_Pb.l(17872);
            ((te) this).field_Pb.c(2779);
        }
        ((te) this).field_Pb = null;
        ((te) this).field_Lb = -1;
        this.a(12, (byte) -85);
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) fj.field_c);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) fj.field_c);
        if (param0 != -47) {
            return;
        }
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) fj.field_c);
        jm.field_o = 0;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          ((te) this).field_Fb = 2 * param3 + ((te) this).field_Rb;
          ((te) this).a(param0 - ((te) this).field_Ob, ((te) this).field_Ob, param1, 256, ((te) this).field_Fb);
          if (param5 != ((te) this).field_Ub) {
            ((te) this).field_Ub = param5;
            this.a(((te) this).field_Kb, (byte) -79);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4 == -94) {
            break L1;
          } else {
            ((te) this).field_Gb = null;
            break L1;
          }
        }
        var7 = 0;
        L2: while (true) {
          if (var7 >= ((te) this).field_Mb) {
            L3: {
              if ((((te) this).field_Lb ^ -1) == 0) {
                break L3;
              } else {
                if (((te) this).field_Gb[((te) this).field_Lb] == null) {
                  break L3;
                } else {
                  var7 = ((te) this).field_Gb[((te) this).field_Lb].field_Mb;
                  var8 = ((te) this).field_Jb * (var7 + ((te) this).field_Lb) + ((te) this).field_S;
                  L4: while (true) {
                    if (var8 <= param0) {
                      ((te) this).field_Gb[((te) this).field_Lb].a(var8, param1 + ((te) this).field_Fb, param2, param3, (byte) -94, ((te) this).field_Sb[((te) this).field_Lb].field_gb);
                      break L3;
                    } else {
                      var8 = var8 - ((te) this).field_Jb;
                      continue L4;
                    }
                  }
                }
              }
            }
            return;
          } else {
            ((te) this).field_Sb[var7].a(((te) this).field_Jb, param3, param2, ((te) this).field_Sb[var7].field_S, 0, ((te) this).field_Fb, param4 + -2147483554);
            var7++;
            continue L2;
          }
        }
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
          var7 = Pixelate.field_H ? 1 : 0;
          if ((ke.field_a ^ -1) != -86) {
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
        if (null != ((te) this).field_Pb) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (((te) this).field_Pb.field_Lb == -1) {
                ((te) this).l(17872);
                this.a(0, (byte) -82);
                return true;
              } else {
                break L1;
              }
            }
          }
          return ((te) this).field_Pb.a(param0, 0, param2);
        } else {
          L2: {
            if (null != ((te) this).field_Pb) {
              break L2;
            } else {
              if ((Object) (Object) bo.field_h != this) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  mj.a(false);
                  return true;
                }
              }
            }
          }
          L3: {
            var5 = nj.field_f;
            if (var5 <= param1) {
              break L3;
            } else {
              L4: {
                if (rk.field_d != var5) {
                  break L4;
                } else {
                  var5 = 63;
                  break L4;
                }
              }
              var6 = 0;
              L5: while (true) {
                if (((te) this).field_Hb.length <= var6) {
                  break L3;
                } else {
                  if (var5 != ((te) this).field_Hb[var6]) {
                    var6++;
                    continue L5;
                  } else {
                    this.a(var6, param0, param1 ^ 88, param2);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        te var4 = null;
        lo var5 = null;
        int var6 = 0;
        te var7 = null;
        lo stackIn_5_0 = null;
        lo stackIn_6_0 = null;
        lo stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        lo stackOut_4_0 = null;
        lo stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        lo stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (((te) this).field_Sb.length <= var4_int) {
            L1: {
              if (((te) this).field_Lb != param1) {
                var7 = ((te) this).field_Gb[((te) this).field_Lb];
                var4 = var7;
                if (var4 != null) {
                  var7.b(param0, param1 + 0, param2);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 > (((te) this).field_Kb ^ -1)) {
                this.a(-1 + ((te) this).field_Kb, (byte) -106);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            var5 = ((te) this).field_Sb[var4_int];
            if (1 == var5.field_P) {
              L3: {
                this.a(var4_int, param2, 118, param0);
                stackOut_4_0 = (lo) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((te) this).field_Lb != var4_int) {
                  stackOut_6_0 = (lo) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (lo) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              stackIn_7_0.field_U = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static int n(int param0) {
        if (param0 != 0) {
            return 100;
        }
        return ba.field_f;
    }

    final boolean m(int param0) {
        int var4 = 0;
        lo var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = 0;
        lo[] var3 = ((te) this).field_Sb;
        if (param0 != 14685) {
            return false;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var2 = var2 | (-1 != (var5.field_P ^ -1) ? 1 : 0);
        }
        if (var2 == 0) {
            if ((((te) this).field_Lb ^ -1) != 0) {
                if (!(((te) this).field_Gb[((te) this).field_Lb] == null)) {
                    var2 = ((te) this).field_Gb[((te) this).field_Lb].m(param0 + 0) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    te(long param0, ak param1, ak param2, ak param3, te[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        jl var17 = null;
        jl var18 = null;
        ((te) this).field_Lb = -1;
        ((te) this).field_Hb = param7;
        ((te) this).field_Tb = param5;
        ((te) this).field_Gb = param4;
        ((te) this).field_Mb = ((te) this).field_Tb.length;
        var17 = param3.field_Db;
        var18 = var17;
        ((te) this).field_Jb = var18.field_w + (2 + var18.field_z);
        ((te) this).field_Rb = 0;
        ((te) this).field_Ob = ((te) this).field_Jb * ((te) this).field_Mb;
        ((te) this).field_Sb = new lo[((te) this).field_Mb];
        var11 = "<col=999999>";
        var12 = "</col>";
        var13 = 0;
        L0: while (true) {
          if (var13 >= ((te) this).field_Mb) {
            ((te) this).field_Rb = ((te) this).field_Rb + (10 + fe.field_b.field_A);
            this.a(12, (byte) -85);
            return;
          } else {
            L1: {
              if (((te) this).field_Hb[var13] <= 0) {
                break L1;
              } else {
                param6[var13] = var11 + ig.a(124, ((te) this).field_Hb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (null != ((te) this).field_Gb[var13]) {
                  break L3;
                } else {
                  if (-1 != ((te) this).field_Tb[var13]) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = (Object) (Object) fe.field_b;
              break L2;
            }
            ((te) this).field_Sb[var13] = new lo(0L, param2, (ak) null, param3, (tf) var14, param6[var13]);
            ((te) this).a((ak) (Object) ((te) this).field_Sb[var13], (byte) 26);
            var15 = var17.c(param6[var13]);
            if (var15 > ((te) this).field_Rb) {
              ((te) this).field_Rb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    final int k(int param0) {
        if (param0 != -16200) {
            return 111;
        }
        return ((te) this).field_Fb - -(((te) this).field_Pb != null ? ((te) this).field_Pb.k(-16200) : 0);
    }

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        ((te) this).field_Kb = param0;
        if (param1 > -73) {
            boolean discarded$0 = ((te) this).m(-111);
        }
        for (var5 = 0; var5 < ((te) this).field_Mb; var5++) {
            var3 = var5 * ((te) this).field_Jb;
            var4 = ((te) this).field_Kb * ((te) this).field_Kb;
            ((te) this).field_Sb[var5].field_S = ((-((te) this).field_gb + ((te) this).field_Ub) * var4 + (-var4 + 144) * var3) / 144;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (((te) this).field_Lb != param0) {
            if (((te) this).field_Gb[param0] != null) {
              ((te) this).l(17872);
              this.a(0, (byte) -96);
              ((te) this).field_Lb = param0;
              ((te) this).field_Pb = ((te) this).field_Gb[((te) this).field_Lb];
              oc.a(((te) this).field_Pb, true);
              ((te) this).field_Pb.a(12, (byte) -104);
              break L0;
            } else {
              if (-1 != ((te) this).field_Tb[param0]) {
                L1: {
                  var5 = 32768 | ((te) this).field_Tb[param0];
                  var6 = ce.field_d;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    if (io.field_c != null) {
                      var6 = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if ((kl.a(var6, 0) ^ -1) == -3) {
                    am.a(1, -26931, var6, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = null;
                dg.a(true, ce.field_d, var5, (String) null, jo.field_k, param3);
                di.a(var5, fp.field_e, jo.field_k, (byte) 9, ce.field_d);
                mj.a(false);
                wn.d(-93);
                break L0;
              } else {
                pd.j(-127);
                mj.a(false);
                break L0;
              }
            }
          } else {
            ((te) this).l(17872);
            this.a(0, (byte) -118);
            break L0;
          }
        }
        L3: {
          if (param2 > 54) {
            break L3;
          } else {
            boolean discarded$1 = ((te) this).a(-128, -51, 10);
            break L3;
          }
        }
    }

    public static void j(int param0) {
        field_Qb = null;
        if (param0 != 1) {
            field_Eb = null;
        }
        field_Eb = null;
        field_Nb = null;
        field_Ib = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_Ib = "Please log in to access this feature.";
        field_Nb = new ea(2);
    }
}
