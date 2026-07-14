/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends b implements tsa {
    cca field_F;
    private rj field_I;
    private boolean field_B;
    private rj field_E;
    static bna field_D;
    boolean field_G;
    String field_w;
    static java.awt.Frame field_x;
    je field_z;
    private int field_C;
    private int field_A;
    il field_H;
    static String field_y;

    private final void a(String param0, byte param1) {
        if (param1 != 106) {
            Object var4 = null;
            ((rla) this).a(36, -37, (ae) null, 57);
        }
        if (!(((rla) this).field_z.field_I != null)) {
            return;
        }
        int var3 = this.a((byte) 126, param0.toLowerCase());
        if (!((var3 ^ -1) != 0)) {
            return;
        }
        ((rla) this).field_z.field_G = var3;
        this.c(101);
        ((rla) this).field_w = param0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param4 >= gca.field_d) {
            if (hc.field_h >= param4) {
                param1 = rp.a(ss.field_c, -16226, pka.field_b, param1);
                param0 = rp.a(ss.field_c, param2 ^ 16224, pka.field_b, param0);
                uea.a(param0, param3, param4, param1, false);
            }
        }
        if (param2 != -2) {
            rla.a(-75, 34, (byte) 59, 71, -47);
        }
    }

    rla(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (isa) null);
        ((rla) this).field_H = mj.field_J;
        ((rla) this).field_w = "";
        ((rla) this).field_z = new je((rla) this, ((rla) this).field_H, param0, param1);
        ((rla) this).field_z.field_h = (qc) this;
        ((rla) this).field_G = false;
        ((rla) this).field_A = param2;
        ((rla) this).field_I = new rj("", (isa) (Object) new fua((rla) this), (qc) this);
        ((rla) this).field_E = new rj();
        ((rla) this).field_E.field_r = (isa) (Object) new ema();
        ((rla) this).field_E.field_h = (qc) this;
        ((rla) this).a((ae) (Object) ((rla) this).field_I, -1);
        ((rla) this).a((ae) (Object) ((rla) this).field_E, -1);
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a((byte) -31, param4, param0, param2, param1);
        ((rla) this).field_I.a((byte) -31, param4 - 20, ((rla) this).field_C, 0, 0);
        if (param3) {
            this.a((byte) -97);
        }
        ((rla) this).field_E.a((byte) -31, 20, ((rla) this).field_C, -20 + param4, 0);
        if (!(!((rla) this).field_G)) {
            ((rla) this).field_F.a((byte) -31, param4, -((rla) this).field_C + param0, 0, ((rla) this).field_C);
        }
    }

    final boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -34) {
            break L0;
          } else {
            ((rla) this).field_w = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((rla) this).field_B) {
              break L2;
            } else {
              if (!super.b((byte) -34)) {
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

    private final void a(byte param0) {
        if (!(((rla) this).j((byte) -82))) {
            return;
        }
        this.a(((rla) this).field_C, ((rla) this).field_n, ((rla) this).field_i, false, ((rla) this).field_m);
        ((rla) this).field_G = false;
        ((rla) this).field_F.p(76);
        if (param0 < 82) {
            field_y = null;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        super.a(param0, param1, param2, param3);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        if (param0 < 70) {
            return false;
        }
        return super.a(107, param1, param2, param3, param4, param5, param6);
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        if (((rla) this).j((byte) -73)) {
            this.a((byte) 119);
        } else {
            this.d(-21088);
        }
        if (param4 < 44) {
            ((rla) this).field_G = false;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!((rla) this).j((byte) 106)) {
            break L0;
          } else {
            if (-1 == ((rla) this).field_z.field_G) {
              break L0;
            } else {
              if (((rla) this).field_z.field_I == null) {
                break L0;
              } else {
                if (((rla) this).field_F.field_x != null) {
                  var2 = ((rla) this).field_F.field_A.field_p;
                  var3 = ((rla) this).field_z.field_K;
                  var4 = ((rla) this).field_z.field_p + -var2;
                  if (-1 > (var4 ^ -1)) {
                    var5 = var3 * ((rla) this).field_z.field_G;
                    var6 = ((rla) this).field_F.field_A.field_x.field_n + var5;
                    if (param0 > 35) {
                      L1: {
                        var7 = var2 >> -1086752894;
                        if (var7 > var6) {
                          L2: {
                            var8 = -(-var5 + var7 << 774006480) / var4;
                            if ((var8 ^ -1) <= -1) {
                              break L2;
                            } else {
                              var8 = 0;
                              break L2;
                            }
                          }
                          ((rla) this).field_F.field_x.field_O = var8;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L3: {
                        var7 = (3 * var2 >> -1283527774) - var3;
                        if (var7 < var6) {
                          L4: {
                            var8 = -(var7 + -var5 << 1275572080) / var4;
                            if (var8 > 65536) {
                              var8 = 65536;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((rla) this).field_F.field_x.field_O = var8;
                          break L3;
                        } else {
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

    private final void d(int param0) {
        int var2 = ((rla) this).field_z.c(23112);
        int var3 = var2;
        int var4 = 0;
        if (param0 != -21088) {
            ((rla) this).field_C = -126;
        }
        if (var3 > ((rla) this).field_A) {
            var4 = 1;
            var3 = ((rla) this).field_A;
        }
        this.a(((rla) this).field_C + var3, ((rla) this).field_n, ((rla) this).field_i, false, ((rla) this).field_m);
        ((rla) this).field_z.a((byte) -31, ((rla) this).field_m, var2, 0, 0);
        ((rla) this).field_F = new cca(0, 0, 0, 0, (isa) (Object) new pu(), (ae) (Object) ((rla) this).field_z, (isa) null);
        if (!(var4 == 0)) {
            ((rla) this).field_F.a(1, st.b(-5412), true);
        }
        ((rla) this).field_F.a((byte) -31, ((rla) this).field_m, ((rla) this).field_p - ((rla) this).field_C, 0, ((rla) this).field_C);
        ((rla) this).field_G = true;
        ((rla) this).a((ae) (Object) ((rla) this).field_F, -1);
        this.c(43);
    }

    final boolean j(byte param0) {
        int var2 = 56 % ((param0 - 11) / 53);
        return ((rla) this).field_G;
    }

    public static void b(boolean param0) {
        field_x = null;
        field_D = null;
        if (!param0) {
            field_y = null;
        }
        field_y = null;
    }

    final void a(int param0) {
        if (!(!(((rla) this).field_h instanceof eaa))) {
            ((eaa) (Object) ((rla) this).field_h).a(-3, (rla) this);
        }
        if (param0 != 99) {
            boolean discarded$0 = ((rla) this).b((byte) -17);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        ((rla) this).field_C = param2;
        if (param0 != -31) {
            return;
        }
        this.a(param2, param4, param3, false, param1);
    }

    final int i(byte param0) {
        if (param0 <= 9) {
            return -96;
        }
        return ((rla) this).field_z.field_G;
    }

    final void f(byte param0) {
        int var2 = 1 / ((-38 - param0) / 60);
        ((rla) this).field_B = false;
        super.f((byte) 41);
    }

    final String d(byte param0) {
        int var2 = 70 / ((-58 - param0) / 60);
        if (!((rla) this).field_f) {
            return null;
        }
        if (((rla) this).j((byte) -46)) {
            if (((rla) this).field_F.field_f) {
                if (-1 != ((rla) this).field_z.field_H) {
                    return ((rla) this).field_z.field_I[((rla) this).field_z.field_H].toString();
                }
            }
        }
        if (((rla) this).field_z.d(117) != null) {
            return ((rla) this).field_z.d(121).toString();
        }
        return super.d((byte) 79);
    }

    final boolean a(ae param0, boolean param1) {
        param0.f((byte) -120);
        if (param1) {
            ((rla) this).field_w = null;
        }
        ((rla) this).field_B = true;
        ((rla) this).field_w = "";
        if (((rla) this).field_h != null) {
            if (!(((rla) this).field_h instanceof vfa)) {
                return true;
            }
            ((vfa) (Object) ((rla) this).field_h).a((ae) this, (byte) -75, ((rla) this).field_B);
        }
        return true;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (!((rla) this).b((byte) -34)) {
          return false;
        } else {
          L0: {
            if (param3) {
              break L0;
            } else {
              ((rla) this).a((byte) 94, -22, -43, -18, -59);
              break L0;
            }
          }
          L1: {
            if (null == ((rla) this).field_z.field_I) {
              break L1;
            } else {
              L2: {
                var5 = ((rla) this).field_z.field_I.length;
                if (param2 == 99) {
                  break L2;
                } else {
                  if (-99 != (param2 ^ -1)) {
                    L3: {
                      if (105 == param2) {
                        break L3;
                      } else {
                        if (-105 == (param2 ^ -1)) {
                          break L3;
                        } else {
                          if (param2 == 84) {
                            L4: {
                              if (((rla) this).field_G) {
                                this.a((byte) 122);
                                break L4;
                              } else {
                                this.d(-21088);
                                break L4;
                              }
                            }
                            return true;
                          } else {
                            if (-86 == (param2 ^ -1)) {
                              var6_int = ((rla) this).field_w.length();
                              if (var6_int > 0) {
                                ((rla) this).field_w = ((rla) this).field_w.substring(0, -1 + var6_int);
                                return true;
                              } else {
                                return true;
                              }
                            } else {
                              if (param0 < 32) {
                                break L1;
                              } else {
                                if (param0 < 128) {
                                  var6 = ((rla) this).field_w + param0;
                                  this.a(var6, (byte) 106);
                                  return true;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L5: {
                      if (((rla) this).j((byte) 88)) {
                        break L5;
                      } else {
                        this.d(-21088);
                        break L5;
                      }
                    }
                    L6: {
                      var6_int = ((rla) this).field_F.field_A.field_p / ((rla) this).field_z.field_K;
                      if (105 == param2) {
                        ((rla) this).field_z.field_G = ((rla) this).field_z.field_G + var6_int;
                        break L6;
                      } else {
                        ((rla) this).field_z.field_G = ((rla) this).field_z.field_G - var6_int;
                        break L6;
                      }
                    }
                    L7: {
                      if (((rla) this).field_z.field_G >= 0) {
                        break L7;
                      } else {
                        ((rla) this).field_z.field_G = 0;
                        break L7;
                      }
                    }
                    L8: {
                      if (((rla) this).field_z.field_G < var5) {
                        break L8;
                      } else {
                        ((rla) this).field_z.field_G = var5 + -1;
                        break L8;
                      }
                    }
                    this.c(46);
                    return true;
                  } else {
                    break L2;
                  }
                }
              }
              L9: {
                if (!((rla) this).j((byte) 101)) {
                  this.d(-21088);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (param2 == 99) {
                  ((rla) this).field_z.field_G = ((rla) this).field_z.field_G + 1;
                  break L10;
                } else {
                  ((rla) this).field_z.field_G = ((rla) this).field_z.field_G - 1;
                  break L10;
                }
              }
              L11: {
                if (0 > ((rla) this).field_z.field_G) {
                  ((rla) this).field_z.field_G = 0;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (((rla) this).field_z.field_G >= var5) {
                  ((rla) this).field_z.field_G = var5 + -1;
                  break L12;
                } else {
                  break L12;
                }
              }
              this.c(84);
              return true;
            }
          }
          if ((param2 ^ -1) != -81) {
            return super.a(param0, param1, param2, true);
          } else {
            this.a((byte) 125);
            return false;
          }
        }
    }

    private final int a(byte param0, String param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        param1 = param1.toLowerCase();
        if (param0 < 116) {
            Object var6 = null;
            int discarded$0 = this.a((byte) 25, (String) null);
        }
        for (var3 = 0; var3 < ((rla) this).field_z.field_I.length; var3++) {
            var4 = ((rla) this).field_z.field_I[var3].toString().toLowerCase();
            if (var4.startsWith(param1)) {
                return var3;
            }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Year";
    }
}
