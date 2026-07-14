/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nva extends dqa implements oo {
    private htb field_x;
    private int field_y;
    boolean field_H;
    sha field_G;
    private htb field_A;
    tia field_w;
    static String field_D;
    static String field_I;
    no field_v;
    private int field_B;
    String field_E;
    private boolean field_z;

    final boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ((nva) this).field_H;
    }

    private final void a(byte param0, String param1) {
        if (null == ((nva) this).field_w.field_L) {
            return;
        }
        int var3 = this.a(param1.toLowerCase(), param0 + -108);
        if (!((var3 ^ -1) != 0)) {
            return;
        }
        if (param0 != 40) {
            ((nva) this).f((byte) 41);
        }
        ((nva) this).field_w.field_H = var3;
        this.e(125);
        ((nva) this).field_E = param1;
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        super.a(param3, param0, param4, 1, param1);
        ((nva) this).field_A.a(0, param2 + param0, ((nva) this).field_B, param2 + 21, 0);
        ((nva) this).field_x.a(-20 + param0, 20, ((nva) this).field_B, 1, 0);
        if (!(!((nva) this).field_H)) {
            ((nva) this).field_G.a(0, param0, -((nva) this).field_B + param4, 1, ((nva) this).field_B);
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          if (!((nva) this).h(0)) {
            break L0;
          } else {
            if (((nva) this).field_w.field_H == -1) {
              break L0;
            } else {
              if (null == ((nva) this).field_w.field_L) {
                break L0;
              } else {
                if (null != ((nva) this).field_G.field_B) {
                  var2 = ((nva) this).field_G.field_y.field_f;
                  var3 = ((nva) this).field_w.field_I;
                  var4 = -var2 + ((nva) this).field_w.field_f;
                  if ((var4 ^ -1) >= -1) {
                    return;
                  } else {
                    L1: {
                      var5 = -93 / ((72 - param0) / 35);
                      var6 = var3 * ((nva) this).field_w.field_H;
                      var7 = var6 + ((nva) this).field_G.field_y.field_t.field_r;
                      var8 = var2 >> -474901470;
                      if (var7 >= var8) {
                        break L1;
                      } else {
                        L2: {
                          var9 = -(var8 + -var6 << 1607015600) / var4;
                          if ((var9 ^ -1) > -1) {
                            var9 = 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ((nva) this).field_G.field_B.field_L = var9;
                        break L1;
                      }
                    }
                    L3: {
                      var8 = -var3 + (3 * var2 >> 1401859266);
                      if (var8 < var7) {
                        L4: {
                          var9 = -(-var6 + var8 << -902604816) / var4;
                          if (-65537 > (var9 ^ -1)) {
                            var9 = 65536;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ((nva) this).field_G.field_B.field_L = var9;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    private final void d(int param0) {
        int var2 = ((nva) this).field_w.e(4);
        int var3 = var2;
        int var4 = 0;
        if (((nva) this).field_y < var3) {
            var3 = ((nva) this).field_y;
            var4 = 1;
        }
        this.b(((nva) this).field_h, ((nva) this).field_r, -20, ((nva) this).field_g, ((nva) this).field_B - -var3);
        ((nva) this).field_w.a(0, ((nva) this).field_h, var2, 1, 0);
        ((nva) this).field_G = new sha(0, 0, 0, 0, (wwa) (Object) new nrb(), (shb) (Object) ((nva) this).field_w, (wwa) null);
        if (var4 != 0) {
            ((nva) this).field_G.a(true, qe.a(0), (byte) -99);
        }
        ((nva) this).field_G.a(0, ((nva) this).field_h, ((nva) this).field_f - ((nva) this).field_B, 1, ((nva) this).field_B);
        ((nva) this).field_H = true;
        ((nva) this).b(param0 ^ -6447, (shb) (Object) ((nva) this).field_G);
        this.e(param0 ^ 20500);
        if (param0 != 20589) {
            Object var5 = null;
            boolean discarded$0 = ((nva) this).a(76, 36, (shb) null, '3');
        }
    }

    final void i(int param0) {
        if (param0 != 21694) {
            ((nva) this).field_H = false;
        }
        if (((nva) this).field_l instanceof aca) {
            ((aca) (Object) ((nva) this).field_l).a(-3, (nva) this);
        }
    }

    nva(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (wwa) null);
        ((nva) this).field_E = "";
        ((nva) this).field_v = loa.field_o;
        ((nva) this).field_w = new tia((nva) this, ((nva) this).field_v, param0, param1);
        ((nva) this).field_y = param2;
        ((nva) this).field_w.field_l = (sba) this;
        ((nva) this).field_H = false;
        ((nva) this).field_A = new htb("", (wwa) (Object) new bpa((nva) this), (sba) this);
        ((nva) this).field_x = new htb();
        ((nva) this).field_x.field_q = (wwa) (Object) new pbb();
        ((nva) this).field_x.field_l = (sba) this;
        ((nva) this).b(-18756, (shb) (Object) ((nva) this).field_A);
        ((nva) this).b(-18756, (shb) (Object) ((nva) this).field_x);
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        if (param0 != 11) {
            return;
        }
        if (((nva) this).h(0)) {
            this.g(5647);
        } else {
            this.d(20589);
        }
    }

    public static void f(int param0) {
        if (param0 > -77) {
            return;
        }
        field_D = null;
        field_I = null;
    }

    final boolean e(byte param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -120) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = ((nva) this).a(27, 77, (shb) null, 'ￔ');
            break L0;
          }
        }
        L1: {
          L2: {
            if (((nva) this).field_z) {
              break L2;
            } else {
              if (!super.e((byte) -120)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void g(int param0) {
        if (!((nva) this).h(param0 ^ param0)) {
            return;
        }
        this.b(((nva) this).field_h, ((nva) this).field_r, -20, ((nva) this).field_g, ((nva) this).field_B);
        ((nva) this).field_H = false;
        ((nva) this).field_G.b(param0 + -9493);
    }

    final void f(byte param0) {
        ((nva) this).field_z = false;
        super.f(param0);
    }

    final boolean a(int param0, shb param1) {
        param1.f((byte) -34);
        if (param0 != 0) {
            boolean discarded$0 = ((nva) this).a(-101, -112, (shb) null, '￭');
        }
        ((nva) this).field_z = true;
        ((nva) this).field_E = "";
        if (null != ((nva) this).field_l) {
            if (((nva) this).field_l instanceof dta) {
                ((dta) (Object) ((nva) this).field_l).a(((nva) this).field_z, (shb) this, true);
            }
        }
        return true;
    }

    final void a(int param0, int param1, int param2, shb param3) {
        super.a(param0, param1, param2, param3);
    }

    final String d(byte param0) {
        if (!((nva) this).field_e) {
            return null;
        }
        if (((nva) this).h(0)) {
            if (((nva) this).field_G.field_e) {
                if ((((nva) this).field_w.field_D ^ -1) != 0) {
                    return ((nva) this).field_w.field_L[((nva) this).field_w.field_D].toString();
                }
            }
        }
        if (!(null == ((nva) this).field_w.g((byte) 96))) {
            return ((nva) this).field_w.g((byte) 96).toString();
        }
        if (param0 != 125) {
            Object var3 = null;
            int discarded$0 = this.a((String) null, -80);
        }
        return super.d((byte) 125);
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        if (param6 >= -17) {
            ((nva) this).field_v = null;
        }
        return super.a(param0, param1, param2, param3, param4, param5, (byte) -93);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (((nva) this).e((byte) -120)) {
          if (param0 == -15834) {
            L0: {
              if (null == ((nva) this).field_w.field_L) {
                break L0;
              } else {
                L1: {
                  var5 = ((nva) this).field_w.field_L.length;
                  if ((param1 ^ -1) == -100) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) == -99) {
                      break L1;
                    } else {
                      L2: {
                        if ((param1 ^ -1) == -106) {
                          break L2;
                        } else {
                          if (param1 != 104) {
                            if (84 == param1) {
                              L3: {
                                if (((nva) this).field_H) {
                                  this.g(5647);
                                  break L3;
                                } else {
                                  this.d(20589);
                                  break L3;
                                }
                              }
                              return true;
                            } else {
                              if (85 == param1) {
                                var6_int = ((nva) this).field_E.length();
                                if ((var6_int ^ -1) < -1) {
                                  ((nva) this).field_E = ((nva) this).field_E.substring(0, -1 + var6_int);
                                  return true;
                                } else {
                                  return true;
                                }
                              } else {
                                if (param3 < 32) {
                                  break L0;
                                } else {
                                  if (param3 < 128) {
                                    var6 = ((nva) this).field_E + param3;
                                    this.a((byte) 40, var6);
                                    return true;
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      L4: {
                        if (((nva) this).h(0)) {
                          break L4;
                        } else {
                          this.d(20589);
                          break L4;
                        }
                      }
                      L5: {
                        var6_int = ((nva) this).field_G.field_y.field_f / ((nva) this).field_w.field_I;
                        if ((param1 ^ -1) == -106) {
                          ((nva) this).field_w.field_H = ((nva) this).field_w.field_H + var6_int;
                          break L5;
                        } else {
                          ((nva) this).field_w.field_H = ((nva) this).field_w.field_H - var6_int;
                          break L5;
                        }
                      }
                      L6: {
                        if (0 <= ((nva) this).field_w.field_H) {
                          break L6;
                        } else {
                          ((nva) this).field_w.field_H = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (((nva) this).field_w.field_H >= var5) {
                          ((nva) this).field_w.field_H = -1 + var5;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.e(120);
                      return true;
                    }
                  }
                }
                L8: {
                  if (((nva) this).h(0)) {
                    break L8;
                  } else {
                    this.d(20589);
                    break L8;
                  }
                }
                L9: {
                  if (param1 == 99) {
                    ((nva) this).field_w.field_H = ((nva) this).field_w.field_H + 1;
                    break L9;
                  } else {
                    ((nva) this).field_w.field_H = ((nva) this).field_w.field_H - 1;
                    break L9;
                  }
                }
                L10: {
                  if (-1 < (((nva) this).field_w.field_H ^ -1)) {
                    ((nva) this).field_w.field_H = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var5 <= ((nva) this).field_w.field_H) {
                    ((nva) this).field_w.field_H = -1 + var5;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                this.e(115);
                return true;
              }
            }
            if (80 != param1) {
              return super.a(-15834, param1, param2, param3);
            } else {
              this.g(5647);
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private final int a(String param0, int param1) {
        int var4 = 0;
        String var5 = null;
        int var6 = VoidHunters.field_G;
        int var3 = -55 / ((45 - param1) / 53);
        param0 = param0.toLowerCase();
        for (var4 = 0; ((nva) this).field_w.field_L.length > var4; var4++) {
            var5 = ((nva) this).field_w.field_L[var4].toString().toLowerCase();
            if (!(!var5.startsWith(param0))) {
                return var4;
            }
        }
        return -1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((nva) this).field_B = param2;
        if (param3 != 1) {
            ((nva) this).field_B = 17;
        }
        this.b(param1, param4, -20, param0, param2);
    }

    final int a(int param0) {
        if (param0 != 0) {
            ((nva) this).field_y = 67;
        }
        return ((nva) this).field_w.field_H;
    }

    final static String a(char param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (!param1) {
            nva.f(-90);
        }
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        fda.field_o = param2;
        mb.field_j = param0;
        if (!param1) {
            String discarded$0 = nva.a('W', true, -7);
        }
        eqa.field_o = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_I = "Activate to confuse nearby missiles";
    }
}
