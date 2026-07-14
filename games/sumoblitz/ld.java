/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends sp implements ai {
    private wp field_I;
    boolean field_A;
    private int field_M;
    private int field_H;
    mc field_J;
    private boolean field_K;
    hd field_B;
    private wp field_O;
    static ri[] field_F;
    static int field_D;
    String field_L;
    vn field_G;
    static int field_C;
    static bw field_N;

    private final void j(int param0) {
        int var2 = ((ld) this).field_B.e((byte) -128);
        int var3 = var2;
        int var4 = 0;
        if (var3 > ((ld) this).field_H) {
            var3 = ((ld) this).field_H;
            var4 = 1;
        }
        this.c(((ld) this).field_r, ((ld) this).field_q, 8725, ((ld) this).field_v, var3 + ((ld) this).field_M);
        ((ld) this).field_B.a(114, 0, 0, var2, ((ld) this).field_q);
        ((ld) this).field_J = new mc(0, 0, 0, 0, (mh) (Object) new tm(), (pk) (Object) ((ld) this).field_B, (mh) null);
        if (var4 != 0) {
            ((ld) this).field_J.a(1332, true, hb.a((byte) 35));
        }
        ((ld) this).field_J.a(-126, 0, ((ld) this).field_M, ((ld) this).field_p + -((ld) this).field_M, ((ld) this).field_q);
        ((ld) this).field_A = true;
        int var5 = 32 % ((param0 - -71) / 49);
        ((ld) this).a((pk) (Object) ((ld) this).field_J, 72);
        this.k(-1);
    }

    final String c(int param0) {
        if (((ld) this).field_k) {
          L0: {
            if (param0 == -6696) {
              break L0;
            } else {
              ((ld) this).field_L = null;
              break L0;
            }
          }
          L1: {
            if (!((ld) this).i(param0 ^ -6708)) {
              break L1;
            } else {
              if (!((ld) this).field_J.field_k) {
                break L1;
              } else {
                if ((((ld) this).field_B.field_N ^ -1) != 0) {
                  return ((ld) this).field_B.field_K[((ld) this).field_B.field_N].toString();
                } else {
                  break L1;
                }
              }
            }
          }
          if (((ld) this).field_B.a(-47) != null) {
            return ((ld) this).field_B.a(param0 ^ 6783).toString();
          } else {
            return super.c(-6696);
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ld) this).field_M = param3;
        this.c(param1, param4, 8725, param2, param3);
        int var6 = 101 % ((28 - param0) / 63);
    }

    final boolean a(pk param0, byte param1) {
        if (param1 != 61) {
            return true;
        }
        param0.c((byte) 115);
        ((ld) this).field_K = true;
        ((ld) this).field_L = "";
        if (null != ((ld) this).field_o) {
            if (!(((ld) this).field_o instanceof fc)) {
                return true;
            }
            ((fc) (Object) ((ld) this).field_o).a(((ld) this).field_K, (pk) this, -90);
        }
        return true;
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 >= -42) {
            ((ld) this).field_J = null;
        }
        return super.a(param0, -54, param2, param3, param4, param5, param6);
    }

    final void c(byte param0) {
        int var2 = 4 / ((param0 - 64) / 51);
        ((ld) this).field_K = false;
        super.c((byte) 116);
    }

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            ((ld) this).h(24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ld) this).field_K) {
              break L2;
            } else {
              if (!super.d(-1)) {
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

    public static void a(byte param0) {
        field_F = null;
        int var1 = -53 / ((-1 - param0) / 59);
        field_N = null;
    }

    final void a(int param0, int param1, pk param2, int param3) {
        int var5 = -76 % ((-25 - param1) / 45);
        super.a(param0, 85, param2, param3);
    }

    private final void e(byte param0) {
        if (!((ld) this).i(20)) {
            return;
        }
        this.c(((ld) this).field_r, ((ld) this).field_q, 8725, ((ld) this).field_v, ((ld) this).field_M);
        ((ld) this).field_A = false;
        if (param0 != 65) {
            return;
        }
        ((ld) this).field_J.b(false);
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 8725) {
            ((ld) this).a(-95, -108, -69, 98, 124);
        }
        super.a(-108, param0, param3, param4, param1);
        ((ld) this).field_O.a(98, 0, 0, ((ld) this).field_M, param1 + -20);
        ((ld) this).field_I.a(99, param1 + -20, 0, ((ld) this).field_M, 20);
        if (!(!((ld) this).field_A)) {
            ((ld) this).field_J.a(-91, 0, ((ld) this).field_M, -((ld) this).field_M + param4, param1);
        }
    }

    final void h(int param0) {
        if (param0 != 0) {
            this.e((byte) 67);
        }
        if (((ld) this).field_o instanceof hs) {
            ((hs) (Object) ((ld) this).field_o).a((byte) -13, (ld) this);
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!((ld) this).i(param0 + 21)) {
            break L0;
          } else {
            if (((ld) this).field_B.field_L == -1) {
              break L0;
            } else {
              if (((ld) this).field_B.field_K == null) {
                break L0;
              } else {
                if (null != ((ld) this).field_J.field_B) {
                  var2 = ((ld) this).field_J.field_D.field_p;
                  var3 = ((ld) this).field_B.field_J;
                  var4 = -var2 + ((ld) this).field_B.field_p;
                  if (param0 == -1) {
                    if (var4 > 0) {
                      L1: {
                        var5 = ((ld) this).field_B.field_L * var3;
                        var6 = ((ld) this).field_J.field_D.field_y.field_v + var5;
                        var7 = var2 >> 422830658;
                        if (var7 > var6) {
                          L2: {
                            var8 = -(-var5 + var7 << 580280272) / var4;
                            if (0 > var8) {
                              var8 = 0;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          ((ld) this).field_J.field_B.field_D = var8;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L3: {
                        var7 = (var2 * 3 >> 1983003714) + -var3;
                        if (var6 <= var7) {
                          break L3;
                        } else {
                          L4: {
                            var8 = -(var7 + -var5 << -1708218512) / var4;
                            if (var8 <= 65536) {
                              break L4;
                            } else {
                              var8 = 65536;
                              break L4;
                            }
                          }
                          ((ld) this).field_J.field_B.field_D = var8;
                          break L3;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
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

    final static void a(String param0, byte param1) {
        rj.a((byte) -94, param0);
        if (param1 != -47) {
            field_C = 74;
        }
        oc.a(us.field_m, false, (byte) -89);
    }

    final boolean i(int param0) {
        if (param0 != 20) {
            field_C = -95;
        }
        return ((ld) this).field_A;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (((ld) this).d(-1)) {
          L0: {
            if (null != ((ld) this).field_B.field_K) {
              L1: {
                var5 = ((ld) this).field_B.field_K.length;
                if (param3 == 99) {
                  break L1;
                } else {
                  if ((param3 ^ -1) == -99) {
                    break L1;
                  } else {
                    L2: {
                      if (105 == param3) {
                        break L2;
                      } else {
                        if (-105 != (param3 ^ -1)) {
                          if (84 != param3) {
                            if (param3 == 85) {
                              var6_int = ((ld) this).field_L.length();
                              if (0 < var6_int) {
                                ((ld) this).field_L = ((ld) this).field_L.substring(0, var6_int + -1);
                                return true;
                              } else {
                                return true;
                              }
                            } else {
                              if (32 > param1) {
                                break L0;
                              } else {
                                if (param1 < 128) {
                                  var6 = ((ld) this).field_L + param1;
                                  this.a(false, var6);
                                  return true;
                                } else {
                                  break L0;
                                }
                              }
                            }
                          } else {
                            L3: {
                              if (((ld) this).field_A) {
                                this.e((byte) 65);
                                break L3;
                              } else {
                                this.j(-120);
                                break L3;
                              }
                            }
                            return true;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (((ld) this).i(20)) {
                        break L4;
                      } else {
                        this.j(-126);
                        break L4;
                      }
                    }
                    L5: {
                      var6_int = ((ld) this).field_J.field_D.field_p / ((ld) this).field_B.field_J;
                      if (param3 == 105) {
                        ((ld) this).field_B.field_L = ((ld) this).field_B.field_L + var6_int;
                        break L5;
                      } else {
                        ((ld) this).field_B.field_L = ((ld) this).field_B.field_L - var6_int;
                        break L5;
                      }
                    }
                    L6: {
                      if (-1 >= (((ld) this).field_B.field_L ^ -1)) {
                        break L6;
                      } else {
                        ((ld) this).field_B.field_L = 0;
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 <= ((ld) this).field_B.field_L) {
                        ((ld) this).field_B.field_L = var5 + -1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.k(-1);
                    return true;
                  }
                }
              }
              L8: {
                if (!((ld) this).i(20)) {
                  this.j(-122);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param3 != 99) {
                  ((ld) this).field_B.field_L = ((ld) this).field_B.field_L - 1;
                  break L9;
                } else {
                  ((ld) this).field_B.field_L = ((ld) this).field_B.field_L + 1;
                  break L9;
                }
              }
              L10: {
                if (0 > ((ld) this).field_B.field_L) {
                  ((ld) this).field_B.field_L = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var5 > ((ld) this).field_B.field_L) {
                  break L11;
                } else {
                  ((ld) this).field_B.field_L = var5 + -1;
                  break L11;
                }
              }
              this.k(-1);
              return true;
            } else {
              break L0;
            }
          }
          if (param2 >= 9) {
            if (-81 != (param3 ^ -1)) {
              return super.a(param0, param1, (byte) 102, param3);
            } else {
              this.e((byte) 65);
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (param1 != 710) {
            field_C = -21;
        }
        if (((ld) this).i(20)) {
            this.e((byte) 65);
        } else {
            this.j(119);
        }
    }

    ld(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (mh) null);
        ((ld) this).field_G = kw.field_b;
        ((ld) this).field_L = "";
        ((ld) this).field_B = new hd((ld) this, ((ld) this).field_G, param0, param1);
        ((ld) this).field_H = param2;
        ((ld) this).field_A = false;
        ((ld) this).field_B.field_o = (qm) this;
        ((ld) this).field_O = new wp("", (mh) (Object) new dv((ld) this), (qm) this);
        ((ld) this).field_I = new wp();
        ((ld) this).field_I.field_w = (mh) (Object) new fm();
        ((ld) this).field_I.field_o = (qm) this;
        ((ld) this).a((pk) (Object) ((ld) this).field_O, 125);
        ((ld) this).a((pk) (Object) ((ld) this).field_I, 74);
    }

    private final int a(String param0, int param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        param0 = param0.toLowerCase();
        if (param1 != -2860) {
            field_N = null;
        }
        for (var3 = 0; var3 < ((ld) this).field_B.field_K.length; var3++) {
            var4 = ((ld) this).field_B.field_K[var3].toString().toLowerCase();
            if (!(!var4.startsWith(param0))) {
                return var3;
            }
        }
        return -1;
    }

    final int g(int param0) {
        int var2 = -105 / ((param0 - -37) / 54);
        return ((ld) this).field_B.field_L;
    }

    private final void a(boolean param0, String param1) {
        if (((ld) this).field_B.field_K == null) {
            return;
        }
        int var3 = this.a(param1.toLowerCase(), -2860);
        if ((var3 ^ -1) == 0) {
            return;
        }
        ((ld) this).field_B.field_L = var3;
        if (param0) {
            Object var4 = null;
            ld.a((String) null, (byte) -13);
        }
        this.k(-1);
        ((ld) this).field_L = param1;
    }

    static {
    }
}
