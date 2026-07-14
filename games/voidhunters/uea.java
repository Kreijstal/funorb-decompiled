/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uea extends bob {
    private vv field_r;
    private vv[] field_q;
    static String field_p;

    final vv a(int param0, int param1) {
        if (param1 != -1) {
            uea.a((byte) -96);
        }
        ((uea) this).field_q[param0] = new vv();
        return new vv();
    }

    final void a(int param0, phb[] param1, int param2) {
        int var4 = param0;
        if (null == ((uea) this).field_q[var4]) {
            ((uea) this).field_q[var4] = new vv();
        }
        if (param2 != 15486) {
            ((uea) this).field_q = null;
        }
        ((uea) this).field_q[param0].field_b = param1;
    }

    final static uma a(ds param0, int param1) {
        int var2 = 50 / ((param1 - -28) / 55);
        return new uma(param0.a(true), param0.a(true), param0.a(true), param0.a(true), param0.c((byte) -81), param0.c((byte) -45), param0.e((byte) -119));
    }

    final static void c(int param0) {
        faa var2 = bk.field_w;
        faa var1 = var2;
        bk.field_w = im.field_q;
        im.field_q = var2;
        if (!(null != bk.field_w)) {
            bk.field_w = new faa(1048576);
        }
        if (param0 != 9487) {
            field_p = null;
        }
    }

    private final void a(uea param0, int param1, boolean param2) {
        int var4 = 0;
        vv var5 = null;
        vv var6 = null;
        vv var6_ref = null;
        int var7 = 0;
        vv stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vv stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        vv stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        vv stackIn_8_2 = null;
        vv stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        vv stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        vv stackOut_7_2 = null;
        vv stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        vv stackOut_6_2 = null;
        L0: {
          var7 = VoidHunters.field_G;
          super.a(param1 + -130, (bob) (Object) param0);
          if (!param2) {
            cua.a((Object[]) (Object) ((uea) this).field_q, 0, (Object[]) (Object) param0.field_q, 0, 6);
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (-7 >= (var4 ^ -1)) {
                break L0;
              } else {
                var5 = ((uea) this).field_q[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  L2: {
                    var6_ref = param0.field_q[var4];
                    stackOut_5_0 = (vv) var5;
                    stackOut_5_1 = 105;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var6_ref != null) {
                      stackOut_7_0 = (vv) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = (vv) var6_ref;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L2;
                    } else {
                      param0.field_q[var4] = new vv();
                      stackOut_6_0 = (vv) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = new vv();
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L2;
                    }
                  }
                  ((vv) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2);
                  var4++;
                  continue L1;
                } else {
                  param0.field_q[var4] = null;
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L3: {
          if (param1 == 6) {
            break L3;
          } else {
            ((uea) this).field_r = null;
            break L3;
          }
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 != -18) {
            uea.a((byte) 52, true, false, 58);
        }
    }

    final void a(phb[] param0, byte param1) {
        vv[] var3 = null;
        int var4 = 0;
        vv var5 = null;
        int var6 = 0;
        vv[] var7 = null;
        var6 = VoidHunters.field_G;
        if (param1 == -54) {
          var7 = ((uea) this).field_q;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_b = param0;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dla stackIn_9_0 = null;
        dla stackIn_10_0 = null;
        dla stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        dla stackOut_8_0 = null;
        dla stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        dla stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          if (param0 == 88) {
            break L0;
          } else {
            field_p = null;
            break L0;
          }
        }
        L1: {
          var4 = 0;
          if (-1 == param3) {
            amb.a(-30428, param2);
            break L1;
          } else {
            if (param3 == -2) {
              dma.a();
              wna.field_e = true;
              break L1;
            } else {
              if (param1) {
                amb.a(-30428, false);
                lo.field_a[param3].c((byte) 65);
                break L1;
              } else {
                L2: {
                  if (null != wca.field_b) {
                    break L2;
                  } else {
                    wca.field_b = new dla();
                    break L2;
                  }
                }
                var4 = 1;
                if (null == wca.field_b) {
                  lo.field_a[param3].c((byte) 65);
                  break L1;
                } else {
                  L3: {
                    stackOut_8_0 = wca.field_b;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (0 != (lo.field_a[param3].a(noa.field_q, pk.field_o, 6868) ^ -1)) {
                      stackOut_10_0 = (dla) (Object) stackIn_10_0;
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L3;
                    } else {
                      stackOut_9_0 = (dla) (Object) stackIn_9_0;
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L3;
                    }
                  }
                  ((dla) (Object) stackIn_11_0).a(stackIn_11_1 != 0, (byte) 55);
                  lo.field_a[param3].c((byte) 65);
                  break L1;
                }
              }
            }
          }
        }
        L4: {
          if (var4 != 0) {
            break L4;
          } else {
            wca.field_b = null;
            break L4;
          }
        }
        L5: {
          var5 = 1;
          var6 = 13421772;
          if (li.field_i) {
            var7 = 3;
            pj.a(og.field_r, de.a(var7, 300), nma.field_b[var7], -125, var6, ip.field_p.width, pk.field_o, var5, noa.field_q, ip.field_p.height);
            break L5;
          } else {
            break L5;
          }
        }
    }

    final void a(int param0, phb param1) {
        vv[] var3 = null;
        int var4 = 0;
        vv var5 = null;
        int var6 = 0;
        Object var7 = null;
        vv[] var8 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (param0 == 32460) {
            break L0;
          } else {
            var7 = null;
            ((uea) this).a((phb[]) null, (byte) -127);
            break L0;
          }
        }
        var8 = ((uea) this).field_q;
        var3 = var8;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var8.length) {
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_e = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        vv var7 = null;
        int var8 = 0;
        vv var10 = null;
        htb var11 = null;
        vv var12 = null;
        vv var13 = null;
        vv var14 = null;
        vv var15 = null;
        shb stackIn_3_0 = null;
        shb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof htb) {
            stackOut_2_0 = (shb) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (shb) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (htb) (Object) stackIn_3_0;
          qca.a(param1.field_h + param2 - -param1.field_g, param3 + param1.field_r + param1.field_f, param2 + param1.field_g, true, param3 + param1.field_r);
          if (var11 == null) {
            break L1;
          } else {
            param4 = param4 & var11.field_x;
            break L1;
          }
        }
        L2: {
          var8 = 14 % ((param0 - -27) / 35);
          var7 = ((uea) this).field_q[0];
          ((uea) this).field_r.a(120);
          var7.a(((uea) this).field_r, param2, param1, param3, -2879, (uea) this);
          if (var11 != null) {
            L3: {
              if (var11.field_u) {
                var12 = ((uea) this).field_q[1];
                if (var12 != null) {
                  var12.a(((uea) this).field_r, param2, param1, param3, -2879, (uea) this);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (var11.field_e) {
              L4: {
                var13 = ((uea) this).field_q[3];
                if (var11.field_n == 0) {
                  break L4;
                } else {
                  if (var13 != null) {
                    var13.a(((uea) this).field_r, param2, param1, param3, -2879, (uea) this);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var10 = ((uea) this).field_q[2];
              if (var10 == null) {
                break L2;
              } else {
                var10.a(((uea) this).field_r, param2, param1, param3, -2879, (uea) this);
                break L2;
              }
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (param1.e((byte) -120)) {
            var14 = ((uea) this).field_q[5];
            if (var14 != null) {
              var14.a(((uea) this).field_r, param2, param1, param3, -2879, (uea) this);
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (param4) {
            break L6;
          } else {
            var15 = ((uea) this).field_q[4];
            if (var15 == null) {
              break L6;
            } else {
              var15.a(((uea) this).field_r, param2, param1, param3, -2879, (uea) this);
              break L6;
            }
          }
        }
        ((uea) this).field_r.a((uea) this, false, param2, param1, param3);
        bia.a((byte) 124);
    }

    public uea() {
        ((uea) this).field_q = new vv[6];
        ((uea) this).field_r = new vv();
        ((uea) this).field_q[0] = new vv();
        vv var1 = new vv();
        var1.a(120);
    }

    uea(uea param0, boolean param1) {
        this();
        param0.a((uea) this, 6, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Buying or selling an account";
    }
}
