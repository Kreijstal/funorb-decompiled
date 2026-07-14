/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class os extends gea implements oo {
    private boolean field_V;
    private ttb field_R;
    private no field_T;
    private boolean field_S;
    private boolean field_W;
    private boolean field_U;

    final void l(byte param0) {
        if (!((os) this).field_z) {
          return;
        } else {
          ((os) this).field_z = false;
          if (!((os) this).field_W) {
            if (((os) this).field_U) {
              lja.e((byte) 90);
              if (param0 != -106) {
                ((os) this).field_V = true;
                return;
              } else {
                return;
              }
            } else {
              if (param0 == -106) {
                return;
              } else {
                ((os) this).field_V = true;
                return;
              }
            }
          } else {
            kia.a((byte) 63);
            if (param0 == -106) {
              return;
            } else {
              ((os) this).field_V = true;
              return;
            }
          }
        }
    }

    os(ida param0, no param1, String param2, boolean param3, boolean param4) {
        super(param0, (shb) (Object) new nna((os) null, param1, param2), 77, 10, 10);
        ((os) this).field_W = param3 ? true : false;
        ((os) this).field_S = false;
        ((os) this).field_U = param4 ? true : false;
        ((os) this).field_T = param1;
        ((os) this).field_V = false;
        ((os) this).field_R = new ttb(13, 50, 274, 30, 15, 2113632, 4210752);
        ((os) this).field_R.field_x = true;
        ((os) this).b(-18756, (shb) (Object) ((os) this).field_R);
    }

    final void g(int param0) {
        int var2 = 102 % ((param0 - 24) / 59);
        ((os) this).field_R.b(2121792, -21202, 4210752);
        nna var3 = new nna((os) this, ((os) this).field_T, vaa.field_o);
        var3.a(-123, nna.field_D, 15);
        ((os) this).b((shb) (Object) var3, -53);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if ((param1 ^ -1) != -14) {
          if (param0 != -15834) {
            return false;
          } else {
            return super.a(-15834, param1, param2, param3);
          }
        } else {
          ((os) this).l((byte) -106);
          return true;
        }
    }

    public void a(int param0, int param1, int param2, htb param3, int param4) {
        Object var7 = null;
        if (((os) this).field_V) {
          cea.a(-123, 3);
          ((os) this).l((byte) -106);
          if (param0 == 11) {
            return;
          } else {
            var7 = null;
            ((os) this).a(false, (String) null, 35);
            return;
          }
        } else {
          lc.a((byte) 86, vpa.b((byte) -92), "tochangedisplayname.ws");
          if (param0 == 11) {
            return;
          } else {
            var7 = null;
            ((os) this).a(false, (String) null, 35);
            return;
          }
        }
    }

    final void a(boolean param0, String param1, int param2) {
        nna var4 = null;
        int var5 = 0;
        nna var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        nna stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        nna stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        nna stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        nna stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        nna stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        nna stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        var5 = VoidHunters.field_G;
        if (((os) this).field_S) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (param2 != 256) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          L1: {
            ((os) this).field_V = stackIn_6_1 != 0;
            stackOut_6_0 = this;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (!param0) {
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L1;
            } else {
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
          }
          ((os) this).field_S = stackIn_9_1 != 0;
          ((os) this).field_R.b(8405024, -21202, 4210752);
          var6 = new nna((os) this, ((os) this).field_T, param1);
          var4 = var6;
          if (-6 == (param2 ^ -1)) {
            var6.a(-123, fma.field_c, 11);
            var6.a(-115, vda.field_q, 17);
            if (param2 == -4) {
              var6.a(-125, mab.field_h, 7);
              ((os) this).b((shb) (Object) var6, 94);
              return;
            } else {
              if (-5 == param2) {
                var6.a(-119, eia.field_p, 8);
                ((os) this).b((shb) (Object) var6, 94);
                return;
              } else {
                if (6 != param2) {
                  if ((param2 ^ -1) == -10) {
                    htb discarded$4 = var6.a((byte) 111, keb.field_o, (sba) this);
                    ((os) this).b((shb) (Object) var6, 94);
                    return;
                  } else {
                    ((os) this).b((shb) (Object) var6, 94);
                    return;
                  }
                } else {
                  var6.a(-126, lia.field_c, 9);
                  ((os) this).b((shb) (Object) var6, 94);
                  return;
                }
              }
            }
          } else {
            if (param2 == 256) {
              htb discarded$5 = var6.a((byte) 127, kj.field_p, (sba) this);
              if (param2 == -4) {
                var6.a(-125, mab.field_h, 7);
                ((os) this).b((shb) (Object) var6, 94);
                return;
              } else {
                if (-5 == param2) {
                  var6.a(-119, eia.field_p, 8);
                  ((os) this).b((shb) (Object) var6, 94);
                  return;
                } else {
                  if (6 != param2) {
                    if ((param2 ^ -1) == -10) {
                      htb discarded$6 = var6.a((byte) 111, keb.field_o, (sba) this);
                      ((os) this).b((shb) (Object) var6, 94);
                      return;
                    } else {
                      ((os) this).b((shb) (Object) var6, 94);
                      return;
                    }
                  } else {
                    var6.a(-126, lia.field_c, 9);
                    ((os) this).b((shb) (Object) var6, 94);
                    return;
                  }
                }
              }
            } else {
              L2: {
                stackOut_11_0 = (nna) var6;
                stackOut_11_1 = -128;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (((os) this).field_W) {
                  stackOut_13_0 = (nna) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = kj.field_p;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L2;
                } else {
                  stackOut_12_0 = (nna) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = vab.field_a;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L2;
                }
              }
              ((nna) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, -1);
              if (param2 == -4) {
                var6.a(-125, mab.field_h, 7);
                ((os) this).b((shb) (Object) var6, 94);
                return;
              } else {
                if (-5 == param2) {
                  var6.a(-119, eia.field_p, 8);
                  ((os) this).b((shb) (Object) var6, 94);
                  return;
                } else {
                  if (6 != param2) {
                    if ((param2 ^ -1) == -10) {
                      htb discarded$7 = var6.a((byte) 111, keb.field_o, (sba) this);
                      ((os) this).b((shb) (Object) var6, 94);
                      return;
                    } else {
                      ((os) this).b((shb) (Object) var6, 94);
                      return;
                    }
                  } else {
                    var6.a(-126, lia.field_c, 9);
                    ((os) this).b((shb) (Object) var6, 94);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
