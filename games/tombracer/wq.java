/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq implements ms {
    static String field_d;
    static String field_a;
    private cia field_b;
    private boolean field_c;

    public final int a(boolean param0) {
        if (param0) {
            return 32;
        }
        return 140;
    }

    public static void b(boolean param0) {
        field_a = null;
        if (!param0) {
            wq.b(true);
            field_d = null;
            return;
        }
        field_d = null;
    }

    public final int a(int param0) {
        if (param0 != -8660) {
            field_a = null;
            return 140;
        }
        return 140;
    }

    public final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (((wq) this).field_c) {
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!((wq) this).field_c) {
            ((wq) this).field_b.c(param0 ^ -7104);
            break L1;
          } else {
            break L1;
          }
        }
        var2 = ((wq) this).field_b.a((byte) 25);
        var3 = ((wq) this).field_b.a(param0 + 7726);
        var4 = 0;
        if (param0 == -7109) {
          L2: {
            if ((var2 ^ -1) > -1) {
              var2 = 0;
              var4 = 1;
              break L2;
            } else {
              if (((wq) this).a(false) >= var2) {
                break L2;
              } else {
                var4 = 1;
                var2 = ((wq) this).a(false);
                if (var3 >= 0) {
                  if (((wq) this).a(-8660) < var3) {
                    var4 = 1;
                    var3 = ((wq) this).a(param0 + -1551);
                    if (var4 == 0) {
                      return;
                    } else {
                      ((wq) this).field_b.a(var2, var3, 1823844912);
                      return;
                    }
                  } else {
                    if (var4 == 0) {
                      return;
                    } else {
                      ((wq) this).field_b.a(var2, var3, 1823844912);
                      return;
                    }
                  }
                } else {
                  var4 = 1;
                  var3 = 0;
                  if (var4 == 0) {
                    return;
                  } else {
                    ((wq) this).field_b.a(var2, var3, 1823844912);
                    return;
                  }
                }
              }
            }
          }
          if (var3 >= 0) {
            if (((wq) this).a(-8660) < var3) {
              var4 = 1;
              var3 = ((wq) this).a(param0 + -1551);
              if (var4 != 0) {
                ((wq) this).field_b.a(var2, var3, 1823844912);
                return;
              } else {
                return;
              }
            } else {
              if (var4 != 0) {
                ((wq) this).field_b.a(var2, var3, 1823844912);
                return;
              } else {
                return;
              }
            }
          } else {
            var4 = 1;
            var3 = 0;
            if (var4 == 0) {
              return;
            } else {
              ((wq) this).field_b.a(var2, var3, 1823844912);
              return;
            }
          }
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, int param2) {
        qk.a(1073807617, tga.field_a, param0, 55, 40, 40, 4, param2 + ((wq) this).a(false) / 2 + -20);
        qk.a(1073807617, tga.field_a, -40 + (param0 - -((wq) this).a(-8660)), 101, 40, 40, 4, ((wq) this).a(false) / 2 + (param2 - 20));
        qk.a(1073807617, tga.field_a, param0 - (-(((wq) this).a(-8660) / 2) - -20), 127, 40, 40, 4, param2);
        qk.a(1073807617, tga.field_a, param0 + ((wq) this).a(-8660) / 2 + -20, 97, 40, 40, 4, -40 + (param2 + ((wq) this).a(false)));
        if (param1 == 20726) {
          if (!((wq) this).field_c) {
            if (!oj.field_tb[kda.field_hd]) {
              L0: {
                if (oj.field_tb[mi.field_k]) {
                  cha.a(((wq) this).a(false) / 2 + (param2 + -20), param1 + -20724, tga.field_a, 4, param0, 40, 1080057857, 2, 40);
                  cha.a(param2 + ((wq) this).a(false) / 2 - 20, param1 + -20724, tga.field_a, 4, param0, 40, 1080057857, 2, 40);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (!oj.field_tb[mf.field_a]) {
                if (oj.field_tb[fp.field_a]) {
                  L1: {
                    cha.a(-20 + (param2 + ((wq) this).a(false) / 2), 2, tga.field_a, 4, -40 + (param0 - -((wq) this).a(-8660)), 40, 1080057857, 2, 40);
                    cha.a(-20 + ((wq) this).a(false) / 2 + param2, 2, tga.field_a, 4, ((wq) this).a(param1 ^ -28966) + param0 - 40, 40, 1080057857, 2, 40);
                    if (!((wq) this).field_c) {
                      qr.field_v.a(-6710887, param1 ^ -20727, ((wq) this).a(false) / 2 + param2, -16711423, param0 - -30, tra.field_z[mi.field_k]);
                      qr.field_v.a(-6710887, -1, ((wq) this).a(false) / 2 + param2, -16711423, ((wq) this).a(-8660) + param0 + -10, tra.field_z[fp.field_a]);
                      qr.field_v.a(-6710887, -1, param2 - -20, -16711423, 10 + ((wq) this).a(-8660) / 2 + param0, tra.field_z[kda.field_hd]);
                      qr.field_v.a(-6710887, param1 + -20727, -20 + (param2 - -((wq) this).a(false)), -16711423, 10 + (param0 + ((wq) this).a(param1 ^ -28966) / 2), tra.field_z[mf.field_a]);
                      ((wq) this).field_b.b(param2, param0, -82);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                } else {
                  L2: {
                    if (!((wq) this).field_c) {
                      qr.field_v.a(-6710887, param1 ^ -20727, ((wq) this).a(false) / 2 + param2, -16711423, param0 - -30, tra.field_z[mi.field_k]);
                      qr.field_v.a(-6710887, -1, ((wq) this).a(false) / 2 + param2, -16711423, ((wq) this).a(-8660) + param0 + -10, tra.field_z[fp.field_a]);
                      qr.field_v.a(-6710887, -1, param2 - -20, -16711423, 10 + ((wq) this).a(-8660) / 2 + param0, tra.field_z[kda.field_hd]);
                      qr.field_v.a(-6710887, param1 + -20727, -20 + (param2 - -((wq) this).a(false)), -16711423, 10 + (param0 + ((wq) this).a(param1 ^ -28966) / 2), tra.field_z[mf.field_a]);
                      ((wq) this).field_b.b(param2, param0, -82);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                cha.a(-40 + (param2 + ((wq) this).a(false)), 2, tga.field_a, 4, ((wq) this).a(-8660) / 2 + param0 - 20, 40, 1080057857, 2, 40);
                cha.a(-40 + ((wq) this).a(false) + param2, param1 ^ 20724, tga.field_a, 4, -20 + param0 - -(((wq) this).a(param1 ^ -28966) / 2), 40, 1080057857, 2, 40);
                if (!oj.field_tb[fp.field_a]) {
                  L3: {
                    if (!((wq) this).field_c) {
                      qr.field_v.a(-6710887, param1 ^ -20727, ((wq) this).a(false) / 2 + param2, -16711423, param0 - -30, tra.field_z[mi.field_k]);
                      qr.field_v.a(-6710887, -1, ((wq) this).a(false) / 2 + param2, -16711423, ((wq) this).a(-8660) + param0 + -10, tra.field_z[fp.field_a]);
                      qr.field_v.a(-6710887, -1, param2 - -20, -16711423, 10 + ((wq) this).a(-8660) / 2 + param0, tra.field_z[kda.field_hd]);
                      qr.field_v.a(-6710887, param1 + -20727, -20 + (param2 - -((wq) this).a(false)), -16711423, 10 + (param0 + ((wq) this).a(param1 ^ -28966) / 2), tra.field_z[mf.field_a]);
                      ((wq) this).field_b.b(param2, param0, -82);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  L4: {
                    cha.a(-20 + (param2 + ((wq) this).a(false) / 2), 2, tga.field_a, 4, -40 + (param0 - -((wq) this).a(-8660)), 40, 1080057857, 2, 40);
                    cha.a(-20 + ((wq) this).a(false) / 2 + param2, 2, tga.field_a, 4, ((wq) this).a(param1 ^ -28966) + param0 - 40, 40, 1080057857, 2, 40);
                    if (!((wq) this).field_c) {
                      qr.field_v.a(-6710887, param1 ^ -20727, ((wq) this).a(false) / 2 + param2, -16711423, param0 - -30, tra.field_z[mi.field_k]);
                      qr.field_v.a(-6710887, -1, ((wq) this).a(false) / 2 + param2, -16711423, ((wq) this).a(-8660) + param0 + -10, tra.field_z[fp.field_a]);
                      qr.field_v.a(-6710887, -1, param2 - -20, -16711423, 10 + ((wq) this).a(-8660) / 2 + param0, tra.field_z[kda.field_hd]);
                      qr.field_v.a(-6710887, param1 + -20727, -20 + (param2 - -((wq) this).a(false)), -16711423, 10 + (param0 + ((wq) this).a(param1 ^ -28966) / 2), tra.field_z[mf.field_a]);
                      ((wq) this).field_b.b(param2, param0, -82);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              }
            } else {
              L5: {
                cha.a(param2, param1 + -20724, tga.field_a, 4, -20 + (param0 - -(((wq) this).a(-8660) / 2)), 40, 1080057857, 2, 40);
                cha.a(param2, 2, tga.field_a, 4, ((wq) this).a(-8660) / 2 + param0 - 20, 40, 1080057857, 2, 40);
                if (oj.field_tb[mi.field_k]) {
                  cha.a(((wq) this).a(false) / 2 + (param2 + -20), param1 + -20724, tga.field_a, 4, param0, 40, 1080057857, 2, 40);
                  cha.a(param2 + ((wq) this).a(false) / 2 - 20, param1 + -20724, tga.field_a, 4, param0, 40, 1080057857, 2, 40);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (!oj.field_tb[mf.field_a]) {
                  break L6;
                } else {
                  cha.a(-40 + (param2 + ((wq) this).a(false)), 2, tga.field_a, 4, ((wq) this).a(-8660) / 2 + param0 - 20, 40, 1080057857, 2, 40);
                  cha.a(-40 + ((wq) this).a(false) + param2, param1 ^ 20724, tga.field_a, 4, -20 + param0 - -(((wq) this).a(param1 ^ -28966) / 2), 40, 1080057857, 2, 40);
                  break L6;
                }
              }
              L7: {
                if (!oj.field_tb[fp.field_a]) {
                  break L7;
                } else {
                  cha.a(-20 + (param2 + ((wq) this).a(false) / 2), 2, tga.field_a, 4, -40 + (param0 - -((wq) this).a(-8660)), 40, 1080057857, 2, 40);
                  cha.a(-20 + ((wq) this).a(false) / 2 + param2, 2, tga.field_a, 4, ((wq) this).a(param1 ^ -28966) + param0 - 40, 40, 1080057857, 2, 40);
                  break L7;
                }
              }
              L8: {
                if (!((wq) this).field_c) {
                  qr.field_v.a(-6710887, param1 ^ -20727, ((wq) this).a(false) / 2 + param2, -16711423, param0 - -30, tra.field_z[mi.field_k]);
                  qr.field_v.a(-6710887, -1, ((wq) this).a(false) / 2 + param2, -16711423, ((wq) this).a(-8660) + param0 + -10, tra.field_z[fp.field_a]);
                  qr.field_v.a(-6710887, -1, param2 - -20, -16711423, 10 + ((wq) this).a(-8660) / 2 + param0, tra.field_z[kda.field_hd]);
                  qr.field_v.a(-6710887, param1 + -20727, -20 + (param2 - -((wq) this).a(false)), -16711423, 10 + (param0 + ((wq) this).a(param1 ^ -28966) / 2), tra.field_z[mf.field_a]);
                  ((wq) this).field_b.b(param2, param0, -82);
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            }
          } else {
            L9: {
              if (!((wq) this).field_c) {
                qr.field_v.a(-6710887, param1 ^ -20727, ((wq) this).a(false) / 2 + param2, -16711423, param0 - -30, tra.field_z[mi.field_k]);
                qr.field_v.a(-6710887, -1, ((wq) this).a(false) / 2 + param2, -16711423, ((wq) this).a(-8660) + param0 + -10, tra.field_z[fp.field_a]);
                qr.field_v.a(-6710887, -1, param2 - -20, -16711423, 10 + ((wq) this).a(-8660) / 2 + param0, tra.field_z[kda.field_hd]);
                qr.field_v.a(-6710887, param1 + -20727, -20 + (param2 - -((wq) this).a(false)), -16711423, 10 + (param0 + ((wq) this).a(param1 ^ -28966) / 2), tra.field_z[mf.field_a]);
                ((wq) this).field_b.b(param2, param0, -82);
                break L9;
              } else {
                break L9;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int a(String param0, uia param1, int param2) {
        int var3 = param1.field_h;
        CharSequence var5 = (CharSequence) (Object) param0;
        byte[] var4 = us.a(var5, false);
        param1.c(var4.length, (byte) 111);
        param1.field_h = param1.field_h + nma.field_m.a((byte) -109, param1.field_g, param2, param1.field_h, var4.length, var4);
        return param1.field_h - var3;
    }

    public wq() {
        ((wq) this).field_b = new cia();
        ((wq) this).field_b.a(((wq) this).a(false) / 2, 15 + ((wq) this).a(-8660) / 2, 1823844912);
    }

    final static boolean b(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != 8000) {
          L0: {
            field_d = null;
            if (-1 == (param1 & 65536)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param1 & 65536)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final boolean a(int param0, int param1, char param2) {
        if (param0 != -18602) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Difficulty: ";
        field_a = "This game has been updated! Please reload this page.";
    }
}
