/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nb extends ld {
    static String field_W;
    static mh field_V;
    private int field_Q;
    private int field_P;
    private int field_S;
    private int field_O;
    private int field_R;
    private int field_U;
    static String field_T;

    void a(boolean param0) {
        if (((nb) this).field_S <= 0) {
            return;
        }
        ((nb) this).a(((nb) this).field_R, (byte) 48, ((nb) this).field_Q);
        ((nb) this).field_S = 0;
        ((nb) this).m(-7718);
        if (!param0) {
            field_V = null;
        }
    }

    void m(int param0) {
        if (param0 != -7718) {
            ((nb) this).a(false, -93, 109, -69);
        }
    }

    nb(pk param0, int param1, int param2) {
        super(param0, param1, param2);
        ((nb) this).field_S = 0;
        ((nb) this).field_P = 0;
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((nb) this).field_S > 0) {
            var2 = ((nb) this).field_R;
            var3 = ((nb) this).field_Q;
            int fieldTemp$0 = ((nb) this).field_P + 1;
            ((nb) this).field_P = ((nb) this).field_P + 1;
            if (((nb) this).field_S <= fieldTemp$0) {
                ((nb) this).field_S = 0;
                ((nb) this).m(-7718);
            } else {
                var4 = ((nb) this).field_P * (-((nb) this).field_P + 2 * ((nb) this).field_S);
                var5 = ((nb) this).field_S * ((nb) this).field_S;
                var2 = (((nb) this).field_R - ((nb) this).field_O) * var4 / var5 + ((nb) this).field_O;
                var3 = var4 * (-((nb) this).field_U + ((nb) this).field_Q) / var5 + ((nb) this).field_U;
            }
            ((nb) this).a(var2, (byte) 69, var3);
        }
        return super.l(-1);
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = TetraLink.field_J;
        ra.b(param2 + 6, param0 + 35, -12 + ((nb) this).field_F, ((nb) this).field_u - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (var7 >= var4) {
            var4 = 22;
            var5 = 194;
            var6 = 169;
            var7 = 0;
            var8 = param0 + 35;
            L1: while (true) {
              if (var7 >= var4) {
                L2: {
                  if (param1 > 66) {
                    break L2;
                  } else {
                    field_W = null;
                    break L2;
                  }
                }
                ac.field_c.c(((nb) this).field_F + (param2 + -90), 10 + param0);
                gh.a(-10 + ((nb) this).field_F, param2 + 5, param0 + 35, hn.field_O, -125);
                gh.a(((nb) this).field_F, param2, ((nb) this).field_u + (param0 + -22), mc.field_i, -125);
                var4 = -79 + ((nb) this).field_u;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = param0 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (var6 + -var5) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 8 | var9 << 16);
                    ra.g(param2, var8, 6, var9);
                    ra.g(-6 + (((nb) this).field_F + param2), var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = (-var5 + var6) * var7 / var4 + var5;
                var9 = var9 | (var9 << 16 | var9 << 8);
                ra.g(param2, var8, 6, var9);
                ra.g(-6 + (param2 - -((nb) this).field_F), var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (ra.field_i <= var8) {
              if (var8 < ra.field_g) {
                L4: {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var10 = 0;
                  var11 = ((nb) this).field_F;
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (var10 > 20) {
                        break L4;
                      } else {
                        var12 = (20 + -var7) * (-var7 + 20) - -((-var10 + 20) * (20 - var10));
                        if (462 >= var12) {
                          if (var12 >= 420) {
                            var13 = (-var12 + 462) * var9 / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            ra.field_b[ra.field_f * var8 - (-param2 - var10)] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (20 >= var7) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (-var7 + 20) + var13 * var13;
                          if (var14 > 462) {
                            break L8;
                          } else {
                            if (420 > var14) {
                              var12 = var11 + 1;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << 16 | var15 << 8);
                              ra.field_b[var11 + var8 * ra.field_f + param2] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 16 | var9 << 8);
                ra.g(param2 + var10, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    public static void n(int param0) {
        field_V = null;
        field_W = null;
        field_T = null;
    }

    boolean h(int param0) {
        ((nb) this).a(true);
        if (param0 != 652390224) {
            boolean discarded$0 = ((nb) this).h(37);
        }
        return super.h(param0);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
            ((nb) this).a(param2, (byte) 70, param3);
            return;
        }
        if (!param0) {
            ((nb) this).a(false, -128, -93, -15);
        }
        ((nb) this).field_R = param2;
        ((nb) this).field_O = ((nb) this).field_F;
        ((nb) this).field_U = ((nb) this).field_u;
        ((nb) this).field_P = 0;
        ((nb) this).field_Q = param3;
        ((nb) this).field_S = param1;
    }

    final static void a(int param0, byte param1) {
        int var2 = 21 / ((-78 - param1) / 33);
        int var3 = (-640 + cf.field_n) / 2;
        int var4 = ma.field_f * ma.field_f;
        int var5 = -(param0 * param0) + var4;
        tl.field_P.a((byte) -110, 199, 90, -90 + ra.field_e + -124, var3 - var5 * 199 / var4);
        fk.field_V.a((byte) -107, 438, 0, -4 + (ra.field_e + -120), var5 * 438 / var4 + var3 + 202);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Password is valid";
        field_T = "Back";
        field_V = new mh();
    }
}
