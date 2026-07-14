/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cj extends rm {
    static int[] field_K;
    private od field_H;
    static String field_M;
    static float field_G;
    private ah field_I;
    private String[] field_J;
    static String field_L;

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((cj) this).j(0);
    }

    String f(int param0) {
        if (param0 != 0) {
            od discarded$0 = this.a((byte) -75, 19, 29);
        }
        if (null == ((cj) this).field_H) {
            return null;
        }
        if (((cj) this).field_J == null) {
            return null;
        }
        if (((cj) this).field_H.field_k >= ((cj) this).field_J.length) {
            return null;
        }
        return ((cj) this).field_J[((cj) this).field_H.field_k];
    }

    final void a(int param0, String param1, boolean param2) {
        String[] var8 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        if (null != ((cj) this).field_J) {
            // if_icmple L25
        } else {
            var8 = new String[param0 - -1];
            var4 = var8;
            if (!(null == ((cj) this).field_J)) {
                for (var5 = 0; var5 < ((cj) this).field_J.length; var5++) {
                    var8[var5] = ((cj) this).field_J[var5];
                }
            }
            ((cj) this).field_J = var4;
        }
        ((cj) this).field_J[param0] = param1;
        if (!param2) {
            Object var7 = null;
            cj.a((gn) null, (gn) null, (gn) null, 76, false);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param3 - ((cj) this).field_k;
        int var6 = param1 + -((cj) this).field_o;
        od var7 = this.a((byte) 124, var5, var6);
        if (var7 != null) {
            if (!(((cj) this).field_t == null)) {
                ((qa) (Object) ((cj) this).field_t).a((cj) this, var7.field_k, (byte) -106, param0);
            }
        }
    }

    boolean a(n param0, int param1) {
        if (param1 != -25823) {
            ((cj) this).field_J = null;
            return false;
        }
        return false;
    }

    final static void a(gn param0, gn param1, gn param2, int param3, boolean param4) {
        fj.field_o = qn.a("", -7079);
        fj.field_o.a(false, 107);
        i.a(true, param0, param1, param2);
        qj.h(-1);
        ak.field_b = gg.field_M;
        if (param3 < 98) {
            field_M = null;
        }
        bb.field_a = gg.field_M;
    }

    void a(int param0, n param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((cj) this).field_H = null;
        if (!(!((cj) this).field_p)) {
            var5 = nc.field_g + (-param0 + -((cj) this).field_k);
            var6 = rf.field_X + -param2 + -((cj) this).field_o;
            ((cj) this).field_H = this.a((byte) 124, var5, var6);
        }
    }

    private final od a(byte param0, int param1, int param2) {
        od var4 = null;
        od var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = HoldTheLine.field_D;
          if (param0 > 121) {
            break L0;
          } else {
            var7 = null;
            cj.a((gn) null, (gn) null, (gn) null, -102, false);
            break L0;
          }
        }
        var4 = (od) (Object) ((cj) this).field_I.b((byte) 104);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (od) (Object) ((cj) this).field_I.c((byte) 104);
                continue L1;
              } else {
                L3: {
                  if (param1 < var5.field_j) {
                    break L3;
                  } else {
                    if (param2 < var5.field_s) {
                      break L3;
                    } else {
                      if (param1 >= var5.field_n + var5.field_j) {
                        break L3;
                      } else {
                        if (var5.field_l + var5.field_s < param2) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_p;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        vc var5 = (vc) (Object) ((cj) this).field_l;
        od var6 = ((cj) this).field_H;
        if (var6 == null) {
        } else {
            var7 = var5.a((n) this, param2, 13112);
            var8 = var5.a(param0 ^ 1337393829, (n) this, param1);
            do {
                ei.a(var6.field_l - -2, var6.field_n + 2, var7 + (var6.field_j + -2), -2 + var8 - -var6.field_s, (byte) 19);
                var6 = var6.field_p;
            } while (var6 != null);
        }
    }

    final static dk k(int param0) {
        int var1 = 31 % ((param0 - 66) / 35);
        if (wd.field_p == null) {
            wd.field_p = new dk(mo.field_w, 20, 0, 0, 0, 11579568, -1, 0, 0, mo.field_w.field_G, -1, 2147483647, true);
        }
        return wd.field_p;
    }

    final void j(int param0) {
        int var2 = 0;
        vc var3 = null;
        lm var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        od var10 = null;
        int var11 = 0;
        lf var12 = null;
        int var13 = 0;
        int var14 = 0;
        od var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var16 = HoldTheLine.field_D;
        ((cj) this).field_I = new ah();
        var2 = param0;
        var3 = (vc) (Object) ((cj) this).field_l;
        var4 = var3.a((byte) 20, (n) this);
        L0: while (true) {
          var5 = ((cj) this).field_q.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((cj) this).field_q.indexOf(">", var5);
            var6 = ((cj) this).field_q.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((cj) this).field_q.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, param0 ^ -22539);
            var9 = var4.b(var2, -22539);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_b[var11];
                  if (var11 != var8) {
                    stackOut_6_0 = var12.field_c[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var4.a(16777215, var5);
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_7_0;
                  if (var11 != var9) {
                    if (var12 == null) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var12.field_c[-1 + var12.field_c.length];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  } else {
                    stackOut_8_0 = var4.a(16777215, var2);
                    stackIn_12_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_12_0;
                  var15 = new od(var7, var13, var12.field_h, var14 - var13, Math.max(var3.a(true), -var12.field_h + var12.field_k));
                  if (var10 != null) {
                    var10.field_p = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((cj) this).field_I.a((byte) -97, (hl) (Object) var15);
                var10 = var15;
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_L = null;
        field_M = null;
        if (param0 != -1) {
            return;
        }
        field_K = null;
    }

    cj(String param0, dh param1) {
        super(param0, (tb) null);
        ((cj) this).field_H = null;
        ((cj) this).field_l = param1;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((cj) this).a(param3, (byte) 122, param2, ((vc) (Object) ((cj) this).field_l).a((n) this, -121), param0);
        int var5 = 51 % ((69 - param1) / 32);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Practice";
        field_L = "Ready";
        field_K = new int[]{331, 404, 477, 550};
    }
}
