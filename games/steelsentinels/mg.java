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
        var7 = SteelSentinels.field_G;
        if (param3 > 79) {
          L0: {
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
                if ((((mg) this).field_bc[param0] ^ -1) == 0) {
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
                    if (-3 == (ei.a(var6, 1) ^ -1)) {
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
          return;
        } else {
          return;
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
        if (param1 != 7411) {
            field_Tb = null;
        }
        uc.field_e[param2] = param0;
        i.field_e[param2] = new ji(param2);
    }

    mg(long param0, gh param1, gh param2, gh param3, mg[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        wk var14 = null;
        int var15 = 0;
        mi var17 = null;
        mi var18 = null;
        ((mg) this).field_Sb = -1;
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
        L0: while (true) {
          if (var13 >= ((mg) this).field_dc) {
            ((mg) this).field_Wb = ((mg) this).field_Wb + (10 + ik.field_g.field_z);
            this.c(117, 12);
          } else {
            L1: {
              if (0 >= ((mg) this).field_cc[var13]) {
                break L1;
              } else {
                param6[var13] = var11 + fa.a(((mg) this).field_cc[var13], 29448).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (null != ((mg) this).field_Vb[var13]) {
                  break L3;
                } else {
                  if ((((mg) this).field_bc[var13] ^ -1) != 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = ik.field_g;
              break L2;
            }
            ((mg) this).field_Yb[var13] = new qh(0L, param2, (gh) null, param3, var14, param6[var13]);
            ((mg) this).a((gh) (Object) ((mg) this).field_Yb[var13], 121);
            var15 = var17.c(param6[var13]);
            if (((mg) this).field_Wb < var15) {
              ((mg) this).field_Wb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
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
              if (0 != (((mg) this).field_mc.field_Sb ^ -1)) {
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
        return ((mg) this).field_oc - -(null != ((mg) this).field_mc ? ((mg) this).field_mc.j(param0 + 0) : 0);
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
