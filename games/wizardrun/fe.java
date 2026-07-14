/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends mf {
    static int field_l;
    private og field_k;

    fe(og param0, og param1) {
        super(param0);
        ((fe) this).field_k = param1;
    }

    final ok a(int param0, String param1) {
        dk var3 = null;
        ok stackIn_5_0 = null;
        ok stackIn_13_0 = null;
        ok stackIn_22_0 = null;
        ok stackOut_21_0 = null;
        ok stackOut_20_0 = null;
        ok stackOut_12_0 = null;
        ok stackOut_11_0 = null;
        ok stackOut_4_0 = null;
        ok stackOut_3_0 = null;
        if (((fe) this).field_k instanceof wa) {
          var3 = ((wa) (Object) ((fe) this).field_k).a((byte) 119);
          if (var3 != null) {
            if (var3.a(true) == gf.field_V) {
              if (param0 != -1) {
                return null;
              } else {
                L0: {
                  if (!param1.equals((Object) (Object) ((fe) this).field_k.field_k)) {
                    stackOut_21_0 = hg.field_c;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = gf.field_V;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                return stackIn_22_0;
              }
            } else {
              return hg.field_c;
            }
          } else {
            if (param0 != -1) {
              return null;
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((fe) this).field_k.field_k)) {
                  stackOut_12_0 = hg.field_c;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  stackOut_11_0 = gf.field_V;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
              }
              return stackIn_13_0;
            }
          }
        } else {
          if (param0 != -1) {
            return null;
          } else {
            L2: {
              if (!param1.equals((Object) (Object) ((fe) this).field_k.field_k)) {
                stackOut_4_0 = hg.field_c;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = gf.field_V;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final String a(String param0, int param1) {
        dk var3 = null;
        if (((fe) this).field_k instanceof wa) {
          var3 = ((wa) (Object) ((fe) this).field_k).a((byte) 113);
          if (var3 != null) {
            if (var3.a(true) == gf.field_V) {
              if (param0.equals((Object) (Object) ((fe) this).field_k.field_k)) {
                return var3.a(-2864);
              } else {
                return ec.field_h;
              }
            } else {
              return var3.a(-2864);
            }
          } else {
            if (param1 != -1) {
              fe.c((byte) -51);
              if (param0.equals((Object) (Object) ((fe) this).field_k.field_k)) {
                return null;
              } else {
                return ec.field_h;
              }
            } else {
              if (param0.equals((Object) (Object) ((fe) this).field_k.field_k)) {
                return null;
              } else {
                return ec.field_h;
              }
            }
          }
        } else {
          if (param1 != -1) {
            fe.c((byte) -51);
            if (param0.equals((Object) (Object) ((fe) this).field_k.field_k)) {
              return null;
            } else {
              return ec.field_h;
            }
          } else {
            if (param0.equals((Object) (Object) ((fe) this).field_k.field_k)) {
              return null;
            } else {
              return ec.field_h;
            }
          }
        }
    }

    final static void c(byte param0) {
        int var2 = 0;
        ob var3 = null;
        ob var4 = null;
        var2 = wizardrun.field_H;
        var3 = new ob();
        var4 = var3;
        var4.field_b = 0;
        if (param0 > 91) {
          L0: while (true) {
            if (var4.field_b >= 20) {
              L1: {
                if (-1 == (wi.field_K ^ -1)) {
                  ld.field_d.e(aa.field_ib.field_b * 24, 336 - aa.field_ib.field_a * 24);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              var4.field_a = 0;
              L2: while (true) {
                if (var4.field_a >= 15) {
                  var4.field_b = var4.field_b + 1;
                  continue L0;
                } else {
                  L3: {
                    if ((tc.field_l.field_j[var3.a((byte) -68)] ^ -1) >= -1) {
                      break L3;
                    } else {
                      lk.field_b[-1 + tc.field_l.field_j[var3.a((byte) -68)]].e(32 * var4.field_b, 32 * (-var4.field_a + 14));
                      break L3;
                    }
                  }
                  L4: {
                    if (0 < tc.field_l.field_a[var3.a((byte) -68)]) {
                      if (oc.field_b[-1 + tc.field_l.field_a[var3.a((byte) -68)]] != null) {
                        oc.field_b[-1 + tc.field_l.field_a[var3.a((byte) -68)]][0].e(var4.field_b * 32, 32 * (-1 + (15 + -var4.field_a)));
                        if (!tc.field_l.field_d[var3.a((byte) -68)]) {
                          break L4;
                        } else {
                          if (!ke.field_w) {
                            break L4;
                          } else {
                            ed.d(32 * var4.field_b, -32 + (480 + -(var4.field_a * 32)), 32, 32, 16777215, 128);
                            break L4;
                          }
                        }
                      } else {
                        if (!tc.field_l.field_d[var3.a((byte) -68)]) {
                          break L4;
                        } else {
                          if (!ke.field_w) {
                            break L4;
                          } else {
                            ed.d(32 * var4.field_b, -32 + (480 + -(var4.field_a * 32)), 32, 32, 16777215, 128);
                            break L4;
                          }
                        }
                      }
                    } else {
                      if (!tc.field_l.field_d[var3.a((byte) -68)]) {
                        break L4;
                      } else {
                        if (!ke.field_w) {
                          break L4;
                        } else {
                          ed.d(32 * var4.field_b, -32 + (480 + -(var4.field_a * 32)), 32, 32, 16777215, 128);
                          break L4;
                        }
                      }
                    }
                  }
                  var4.field_a = var4.field_a + 1;
                  continue L2;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
    }
}
