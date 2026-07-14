/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends wm {
    private String field_t;
    static vj field_r;
    static String field_u;
    static ud[] field_v;
    static int field_p;
    static ck field_q;
    private boolean field_s;

    jm(rk param0) {
        super(param0);
        ((jm) this).field_s = false;
    }

    final tb b(String param0, byte param1) {
        Object var4 = null;
        cd var5 = null;
        cd var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        tb stackIn_12_0 = null;
        tb stackIn_18_0 = null;
        tb stackIn_30_0 = null;
        tb stackIn_36_0 = null;
        tb stackOut_29_0 = null;
        tb stackOut_28_0 = null;
        tb stackOut_35_0 = null;
        tb stackOut_34_0 = null;
        tb stackOut_11_0 = null;
        tb stackOut_10_0 = null;
        tb stackOut_17_0 = null;
        tb stackOut_16_0 = null;
        if (param1 == -40) {
          var8 = (CharSequence) (Object) param0;
          if (!rd.a(var8, param1 ^ 27418)) {
            return vm.field_u;
          } else {
            if (!param0.equals((Object) (Object) ((jm) this).field_t)) {
              var6 = f.a(param1 + -11039, param0);
              if (var6 != null) {
                if (null != var6.field_f) {
                  return jb.field_j;
                } else {
                  L0: {
                    ((jm) this).field_s = var6.field_n;
                    ((jm) this).field_t = param0;
                    if (((jm) this).field_s) {
                      stackOut_29_0 = dc.field_b;
                      stackIn_30_0 = stackOut_29_0;
                      break L0;
                    } else {
                      stackOut_28_0 = vm.field_u;
                      stackIn_30_0 = stackOut_28_0;
                      break L0;
                    }
                  }
                  return stackIn_30_0;
                }
              } else {
                return jb.field_j;
              }
            } else {
              L1: {
                if (((jm) this).field_s) {
                  stackOut_35_0 = dc.field_b;
                  stackIn_36_0 = stackOut_35_0;
                  break L1;
                } else {
                  stackOut_34_0 = vm.field_u;
                  stackIn_36_0 = stackOut_34_0;
                  break L1;
                }
              }
              return stackIn_36_0;
            }
          }
        } else {
          var4 = null;
          String discarded$1 = jm.a('�', (String) null, (String) null, 32);
          var7 = (CharSequence) (Object) param0;
          if (!rd.a(var7, param1 ^ 27418)) {
            return vm.field_u;
          } else {
            if (!param0.equals((Object) (Object) ((jm) this).field_t)) {
              var5 = f.a(param1 + -11039, param0);
              if (var5 != null) {
                if (null != var5.field_f) {
                  return jb.field_j;
                } else {
                  L2: {
                    ((jm) this).field_s = var5.field_n;
                    ((jm) this).field_t = param0;
                    if (((jm) this).field_s) {
                      stackOut_11_0 = dc.field_b;
                      stackIn_12_0 = stackOut_11_0;
                      break L2;
                    } else {
                      stackOut_10_0 = vm.field_u;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                  return stackIn_12_0;
                }
              } else {
                return jb.field_j;
              }
            } else {
              L3: {
                if (((jm) this).field_s) {
                  stackOut_17_0 = dc.field_b;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = vm.field_u;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              return stackIn_18_0;
            }
          }
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            ((jm) this).field_s = true;
            ((jm) this).field_t = null;
            return;
        }
        ((jm) this).field_t = null;
    }

    final static void a(int param0, boolean param1) {
        Object var3 = null;
        if (param0 == 0) {
          if (ph.n(-30146)) {
            wj.a(0, -80, true, 2, param1, bc.field_K);
            return;
          } else {
            we.field_b.f(9, -4);
            mn.field_c = true;
            ef.field_N = dl.field_M;
            return;
          }
        } else {
          var3 = null;
          String discarded$5 = jm.a('_', (String) null, (String) null, -55);
          if (ph.n(-30146)) {
            wj.a(0, -80, true, 2, param1, bc.field_K);
            return;
          } else {
            we.field_b.f(9, -4);
            mn.field_c = true;
            ef.field_N = dl.field_M;
            return;
          }
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        cd var4 = null;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param0;
        var3 = ij.a(5, var5);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (!param0.equals((Object) (Object) ((jm) this).field_t)) {
              var4 = f.a(param1 + -11068, param0);
              if (var4 != null) {
                if (null == var4.field_f) {
                  ((jm) this).field_t = param0;
                  ((jm) this).field_s = var4.field_n;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (param1 == -11) {
            if (!((jm) this).field_s) {
              return of.field_g;
            } else {
              return ed.field_e;
            }
          } else {
            jm.a(109, false);
            if (!((jm) this).field_s) {
              return of.field_g;
            } else {
              return ed.field_e;
            }
          }
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_r = null;
        field_u = null;
        if (param0 <= 41) {
            field_q = null;
            field_v = null;
            return;
        }
        field_v = null;
    }

    final static String a(char param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = client.field_A ? 1 : 0;
        var4 = param1.length();
        var5 = param2.length();
        var6 = var4;
        var7 = -1 + var5;
        if (var7 != param3) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param1.indexOf((int) param0, var8_int);
            if (-1 <= var8_int) {
              var6 = var6 + var7;
              var8_int++;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = 0;
              L1: while (true) {
                var10 = param1.indexOf((int) param0, var9);
                if ((var10 ^ -1) > -1) {
                  StringBuilder discarded$6 = var13.append(param1.substring(var9));
                  return var13.toString();
                } else {
                  StringBuilder discarded$7 = var13.append(param1.substring(var9, var10));
                  var9 = 1 + var10;
                  StringBuilder discarded$8 = var13.append(param2);
                  continue L1;
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          var9 = 0;
          L2: while (true) {
            var10 = param1.indexOf((int) param0, var9);
            if ((var10 ^ -1) > -1) {
              StringBuilder discarded$9 = var12.append(param1.substring(var9));
              return var12.toString();
            } else {
              StringBuilder discarded$10 = var12.append(param1.substring(var9, var10));
              var9 = 1 + var10;
              StringBuilder discarded$11 = var12.append(param2);
              continue L2;
            }
          }
        }
    }

    final static void a(boolean param0, fm param1, int param2, byte param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        L0: {
          pd.field_h[0] = gg.field_A.nextInt();
          pd.field_h[1] = gg.field_A.nextInt();
          pd.field_h[2] = (int)(lc.field_j >> -457716384);
          vi.field_A.field_n = 0;
          pd.field_h[3] = (int)lc.field_j;
          vi.field_A.a(pd.field_h[0], false);
          vi.field_A.a(pd.field_h[1], false);
          if (param3 >= 123) {
            break L0;
          } else {
            jm.e(2);
            break L0;
          }
        }
        vi.field_A.a(pd.field_h[2], false);
        vi.field_A.a(pd.field_h[3], false);
        i.a(vi.field_A, 0);
        vi.field_A.d(-1, param2);
        param1.a(vi.field_A, (byte) 124);
        we.field_b.field_n = 0;
        if (param0) {
          L1: {
            we.field_b.a(true, 18);
            we.field_b.field_n = we.field_b.field_n + 2;
            var5 = we.field_b.field_n;
            we.field_b.a(re.field_v, false);
            we.field_b.a(rm.field_c, (byte) 0);
            var6 = 0;
            if (ce.field_w) {
              var6 = var6 | 1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (ci.field_c) {
              var6 = var6 | 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!param4) {
              break L3;
            } else {
              var6 = var6 | 8;
              break L3;
            }
          }
          L4: {
            if (null == vh.field_f) {
              break L4;
            } else {
              var6 = var6 | 16;
              break L4;
            }
          }
          L5: {
            we.field_b.a(true, var6);
            var7 = a.a(se.h(25144), (byte) 114);
            if (var7 == null) {
              var7 = "";
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            we.field_b.a(0, var7);
            if (vh.field_f != null) {
              we.field_b.b(8, vh.field_f);
              break L6;
            } else {
              break L6;
            }
          }
          re.a(uk.field_p, ea.field_k, (wl) (Object) we.field_b, vi.field_A, 0);
          we.field_b.b(true, we.field_b.field_n - var5);
          wj.c(4792, -1);
          return;
        } else {
          L7: {
            we.field_b.a(true, 16);
            we.field_b.field_n = we.field_b.field_n + 2;
            var5 = we.field_b.field_n;
            we.field_b.a(re.field_v, false);
            we.field_b.a(rm.field_c, (byte) 0);
            var6 = 0;
            if (ce.field_w) {
              var6 = var6 | 1;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (ci.field_c) {
              var6 = var6 | 4;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (!param4) {
              break L9;
            } else {
              var6 = var6 | 8;
              break L9;
            }
          }
          L10: {
            if (null == vh.field_f) {
              break L10;
            } else {
              var6 = var6 | 16;
              break L10;
            }
          }
          L11: {
            we.field_b.a(true, var6);
            var7 = a.a(se.h(25144), (byte) 114);
            if (var7 == null) {
              var7 = "";
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            we.field_b.a(0, var7);
            if (vh.field_f != null) {
              we.field_b.b(8, vh.field_f);
              break L12;
            } else {
              break L12;
            }
          }
          re.a(uk.field_p, ea.field_k, (wl) (Object) we.field_b, vi.field_A, 0);
          we.field_b.b(true, we.field_b.field_n - var5);
          wj.c(4792, -1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new vj();
        field_v = new ud[4];
        field_p = 0;
    }
}
