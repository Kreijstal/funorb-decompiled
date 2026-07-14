/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ff extends pl {
    private String[] field_I;
    static oj field_H;
    private oi field_G;
    private dd field_F;
    static int field_J;

    final void b(int param0, int param1, int param2, int param3) {
        super.b(-120, param1, param2, param3);
        int var5 = param1 - ((ff) this).field_o;
        int var6 = -((ff) this).field_l + param2;
        if (param0 > -45) {
            ((ff) this).a(-20, (byte) -111, 69, -112);
        }
        dd var7 = this.a((byte) -117, var6, var5);
        if (var7 != null) {
            if (!(null == ((ff) this).field_s)) {
                ((ng) (Object) ((ff) this).field_s).a(var7.field_k, (ff) this, param3, 111);
            }
        }
    }

    ff(String param0, bf param1) {
        super(param0, (ce) null);
        ((ff) this).field_F = null;
        ((ff) this).field_w = param1;
    }

    public static void d(int param0) {
        int var1 = 65 % ((param0 - 84) / 40);
        field_H = null;
    }

    String c(boolean param0) {
        if (((ff) this).field_F == null) {
            return null;
        }
        if (null == ((ff) this).field_I) {
            return null;
        }
        if (param0) {
            return null;
        }
        if (((ff) this).field_F.field_k >= ((ff) this).field_I.length) {
            return null;
        }
        return ((ff) this).field_I[((ff) this).field_F.field_k];
    }

    final static sc c(int param0, int param1, int param2, int param3) {
        sc var4 = new sc();
        var4.field_n = new int[param1];
        var4.field_k = param3;
        tg.field_c.a((wl) (Object) var4, false);
        ld.a(param0, var4, param2 ^ param2);
        return var4;
    }

    void a(int param0, int param1, int param2, ub param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0 ^ 0, param1, param2, param3);
        if (param0 != 10000536) {
            ((ff) this).field_G = null;
        }
        ((ff) this).field_F = null;
        if (!(!((ff) this).field_v)) {
            var5 = pg.field_n - param2 + -((ff) this).field_o;
            var6 = -((ff) this).field_l + (fi.field_B + -param1);
            ((ff) this).field_F = this.a((byte) -120, var6, var5);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((ff) this).a(127, param0, ((qe) (Object) ((ff) this).field_w).a((byte) 89, (ub) this), param2, param3);
        if (param1 != 61) {
            field_H = null;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (-1 != (param2 ^ -1)) {
            return;
        }
        qe var5 = (qe) (Object) ((ff) this).field_w;
        dd var6 = ((ff) this).field_F;
        if (var6 != null) {
            var7 = var5.a((ub) this, param1 + 0, param0);
            var8 = var5.a(true, param3, (ub) this);
            do {
                nh.a((byte) 69, 2 + var6.field_o, var6.field_j + (var8 - 2), 2 + var6.field_n, var7 + (var6.field_i + -2));
                var6 = var6.field_l;
            } while (var6 != null);
        }
    }

    final static nj a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = wizardrun.field_H;
        nj var5 = (nj) (Object) pc.field_l.b((byte) 93);
        while (var5 != null) {
            if (!(param1 != var5.field_l)) {
                return var5;
            }
            var5 = (nj) (Object) pc.field_l.d(8192);
        }
        nj var5_ref = new nj();
        var5_ref.field_j = param0;
        var5_ref.field_l = param1;
        var5_ref.field_o = param4;
        pc.field_l.a((wl) (Object) var5_ref, false);
        ri.a(var5_ref, param3, (byte) 121);
        if (param2 != 59) {
            nj discarded$0 = ff.a(88, 105, (byte) -48, -68, 37);
        }
        return var5_ref;
    }

    final void e(int param0) {
        int var2 = 0;
        qe var3 = null;
        af var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        dd var10 = null;
        int var11 = 0;
        fg var12 = null;
        int var13 = 0;
        int var14 = 0;
        dd var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var16 = wizardrun.field_H;
        ((ff) this).field_G = new oi();
        var2 = param0;
        var3 = (qe) (Object) ((ff) this).field_w;
        var4 = var3.a((ub) this, (byte) 116);
        L0: while (true) {
          var5 = ((ff) this).field_k.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((ff) this).field_k.indexOf(">", var5);
            var6 = ((ff) this).field_k.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ff) this).field_k.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) 110, var5);
            var9 = var4.a((byte) 89, var2);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_d[var11];
                  if (var11 == var8) {
                    stackOut_6_0 = var4.a(62, var5);
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var12.field_e[0];
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_7_0;
                  if (var11 == var9) {
                    stackOut_11_0 = var4.a(62, var2);
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (var12 != null) {
                      stackOut_10_0 = var12.field_e[-1 + var12.field_e.length];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var14 = stackIn_12_0;
                  var15 = new dd(var7, var13, var12.field_a, var14 - var13, Math.max(var3.a((byte) -104), -var12.field_a + var12.field_b));
                  if (var10 != null) {
                    var10.field_l = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var10 = var15;
                ((ff) this).field_G.a((wl) (Object) var15, false);
                var11++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        int var5 = 0;
        int var6 = wizardrun.field_H;
        if (param0 != 1) {
            ((ff) this).field_F = null;
        }
        if (null != ((ff) this).field_I) {
            // if_icmplt L103
        }
        String[] var7 = new String[1 + param2];
        String[] var4 = var7;
        if (!(((ff) this).field_I == null)) {
            for (var5 = 0; ((ff) this).field_I.length > var5; var5++) {
                var7[var5] = ((ff) this).field_I[var5];
            }
        }
        ((ff) this).field_I = var4;
        ((ff) this).field_I[param2] = param1;
    }

    boolean a(ub param0, int param1) {
        if (param1 != 8) {
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(126, param1, param2, param3, param4);
        if (param0 < 108) {
            return;
        }
        ((ff) this).e(0);
    }

    private final dd a(byte param0, int param1, int param2) {
        dd var4 = null;
        dd var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        if (param0 <= -91) {
          var4 = (dd) (Object) ((ff) this).field_G.b((byte) 80);
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (dd) (Object) ((ff) this).field_G.d(8192);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_i > param2) {
                      break L2;
                    } else {
                      if (param1 < var5.field_j) {
                        break L2;
                      } else {
                        if (var5.field_i - -var5.field_o <= param2) {
                          break L2;
                        } else {
                          if (param1 <= var5.field_j - -var5.field_n) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_l;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new oj();
    }
}
