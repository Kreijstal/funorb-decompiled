/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sna {
    private qh field_l;
    private boolean field_m;
    private int field_g;
    private boolean field_j;
    private vna field_c;
    private boolean field_d;
    private boolean field_h;
    private boolean field_b;
    private boolean field_f;
    private boolean field_i;
    private int field_a;
    private boolean field_k;
    private int field_e;

    final void a(int param0) {
        la var3 = null;
        int var4 = 0;
        int var5 = 0;
        fsa[] var5_ref_fsa__ = null;
        fsa[] var6_ref_fsa__ = null;
        int var6 = 0;
        int var7 = 0;
        fsa var8 = null;
        int var9 = 0;
        hca var10 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var10 = ((sna) this).field_l.field_k.field_H[((sna) this).field_l.field_x];
          var3 = var10.f((byte) -106);
          var4 = ((sna) this).field_l.field_k.i(1, ((sna) this).field_l.field_x);
          if (param0 == 9981) {
            break L0;
          } else {
            ((sna) this).a(77);
            break L0;
          }
        }
        L1: {
          if (var4 != ((sna) this).field_g) {
            L2: {
              ((sna) this).field_g = var4;
              if (0 == ((sna) this).field_g) {
                this.a(fk.field_j, (ms) (Object) new wq(), 50, param0 ^ -9907);
                break L2;
              } else {
                break L2;
              }
            }
            var5_ref_fsa__ = var3.n(16);
            var6_ref_fsa__ = var5_ref_fsa__;
            var7 = 0;
            L3: while (true) {
              if (var7 >= var6_ref_fsa__.length) {
                break L1;
              } else {
                L4: {
                  var8 = var6_ref_fsa__[var7];
                  if (((sna) this).field_h) {
                    break L4;
                  } else {
                    if (var8.s((byte) -119)) {
                      ((sna) this).field_h = true;
                      this.a(vh.field_c, (ms) null, 25, -89);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (((sna) this).field_i) {
                    if (((sna) this).field_m) {
                      break L5;
                    } else {
                      if (3 == var8.E((byte) 3)) {
                        ((sna) this).field_m = true;
                        this.a(gca.field_l, (ms) null, 25, -61);
                        break L5;
                      } else {
                        if (((sna) this).field_m) {
                          break L5;
                        } else {
                          if (3 != var8.E((byte) 3)) {
                            break L5;
                          } else {
                            ((sna) this).field_m = true;
                            this.a(gca.field_l, (ms) null, 25, -61);
                            break L5;
                          }
                        }
                      }
                    }
                  } else {
                    if (((sna) this).field_m) {
                      break L5;
                    } else {
                      if (3 == var8.E((byte) 3)) {
                        ((sna) this).field_m = true;
                        this.a(gca.field_l, (ms) null, 25, -61);
                        break L5;
                      } else {
                        if (((sna) this).field_m) {
                          break L5;
                        } else {
                          if (3 != var8.E((byte) 3)) {
                            break L5;
                          } else {
                            ((sna) this).field_m = true;
                            this.a(gca.field_l, (ms) null, 25, -61);
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                var7++;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        L6: {
          var5 = var10.r((byte) -102);
          if (((sna) this).field_e == var5) {
            break L6;
          } else {
            ((sna) this).field_a = 0;
            ((sna) this).field_e = var5;
            var6 = fe.field_C[4] + -10;
            if (1 == ((sna) this).field_e) {
              this.a(tha.field_A, (ms) null, var6, param0 ^ -9888);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          ((sna) this).field_k = var10.M(-107);
          if (((sna) this).field_d) {
            if (((sna) this).field_f) {
              break L7;
            } else {
              if (-1 <= (var10.a(393216, 2) ^ -1)) {
                break L7;
              } else {
                ((sna) this).field_f = true;
                this.a(lja.field_a, (ms) null, 5, -74);
                break L7;
              }
            }
          } else {
            if (((sna) this).field_f) {
              break L7;
            } else {
              if (-1 <= (var10.a(393216, 2) ^ -1)) {
                break L7;
              } else {
                ((sna) this).field_f = true;
                this.a(lja.field_a, (ms) null, 5, -74);
                break L7;
              }
            }
          }
        }
        L8: {
          if (((sna) this).field_f) {
            L9: {
              if (var10.a(393216, 2) != 0) {
                ((sna) this).field_a = 0;
                break L9;
              } else {
                ((sna) this).field_a = ((sna) this).field_a + 1;
                if (!((sna) this).field_j) {
                  if (500 < ((sna) this).field_a) {
                    ((sna) this).field_j = true;
                    this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  if (((sna) this).field_b) {
                    break L8;
                  } else {
                    if (-2 != (var10.u((byte) 127) ^ -1)) {
                      break L8;
                    } else {
                      ((sna) this).field_b = true;
                      this.a(uj.field_f, (ms) null, 5, -108);
                      break L8;
                    }
                  }
                }
              }
            }
            if (((sna) this).field_b) {
              break L8;
            } else {
              if (-2 != (var10.u((byte) 127) ^ -1)) {
                break L8;
              } else {
                ((sna) this).field_b = true;
                this.a(uj.field_f, (ms) null, 5, -108);
                break L8;
              }
            }
          } else {
            if (((sna) this).field_b) {
              break L8;
            } else {
              if (-2 != (var10.u((byte) 127) ^ -1)) {
                break L8;
              } else {
                ((sna) this).field_b = true;
                this.a(uj.field_f, (ms) null, 5, -108);
                break L8;
              }
            }
          }
        }
    }

    private final void a(String param0, ms param1, int param2, int param3) {
        if (param3 > -56) {
            ((sna) this).b((byte) 111);
        }
        dl var5 = new dl(((sna) this).field_l, param1);
        var5.a(tea.field_a, param0, vda.field_n, (byte) 21);
        ((sna) this).field_c.b((byte) -125, (vg) (Object) new mga(var5, param2));
    }

    final void a(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        mga var2 = (mga) (Object) ((sna) this).field_c.f(-80);
        while (var2 != null) {
            if (var2.field_k <= 0) {
                // ifne L88
                ((sna) this).field_l.a((me) (Object) var2.field_h, param0 ^ 644);
                var2.p(param0 ^ 18);
            } else {
                var2.field_k = var2.field_k - 1;
            }
            var2 = (mga) (Object) ((sna) this).field_c.e(108);
        }
        if (param0 != 44) {
            ((sna) this).a(1);
        }
    }

    final void b(byte param0) {
        if (param0 != -121) {
            ((sna) this).field_a = -88;
        }
    }

    sna(qh param0) {
        ((sna) this).field_m = false;
        ((sna) this).field_d = false;
        ((sna) this).field_g = -1;
        ((sna) this).field_h = false;
        ((sna) this).field_j = false;
        ((sna) this).field_b = false;
        ((sna) this).field_i = false;
        ((sna) this).field_f = false;
        ((sna) this).field_a = 0;
        ((sna) this).field_k = false;
        ((sna) this).field_e = 0;
        ((sna) this).field_c = new vna();
        ((sna) this).field_l = param0;
    }

    static {
    }
}
