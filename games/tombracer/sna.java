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
        la var3;
        int var4;
        fsa[] var5_ref_fsa__;
        int var5;
        fsa[] var6_ref_fsa__;
        int var6;
        int var7;
        fsa var8;
        int var9;
        hca var10;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var10 = this.field_l.field_k.field_H[this.field_l.field_x];
          var3 = var10.f((byte) -106);
          var4 = this.field_l.field_k.i(1, this.field_l.field_x);
          if (param0 == 9981) {
            break L0;
          } else {
            this.a(77);
            break L0;
          }
        }
        L1: {
          if (var4 != this.field_g) {
            L2: {
              this.field_g = var4;
              if (0 == this.field_g) {
                this.a(fk.field_j, new wq(), 50, param0 ^ -9907);
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
                  if (this.field_h) {
                    break L4;
                  } else {
                    if (var8.s((byte) -119)) {
                      this.field_h = true;
                      this.a(vh.field_c, (ms) null, 25, -89);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.field_i) {
                  L5: {
                    if (-2 == (var8.E((byte) 3) ^ -1)) {
                      this.field_i = true;
                      this.a(wqa.field_F, new jia(), 25, param0 + -10059);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (!this.field_m) {
                    if (3 == var8.E((byte) 3)) {
                      this.field_m = true;
                      this.a(gca.field_l, (ms) null, 25, -61);
                      var7++;
                      continue L3;
                    } else {
                      var7++;
                      continue L3;
                    }
                  } else {
                    var7++;
                    continue L3;
                  }
                } else {
                  if (!this.field_m) {
                    if (3 == var8.E((byte) 3)) {
                      this.field_m = true;
                      this.a(gca.field_l, (ms) null, 25, -61);
                      var7++;
                      continue L3;
                    } else {
                      var7++;
                      continue L3;
                    }
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        L6: {
          var5 = var10.r((byte) -102);
          if (this.field_e == var5) {
            break L6;
          } else {
            this.field_a = 0;
            this.field_e = var5;
            var6 = fe.field_C[4] + -10;
            if (1 == this.field_e) {
              this.a(tha.field_A, (ms) null, var6, param0 ^ -9888);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          this.field_k = var10.M(-107);
          if (!this.field_d) {
            L8: {
              if (this.field_k) {
                this.field_d = true;
                this.a(uw.field_b, (ms) null, 5, -88);
                break L8;
              } else {
                break L8;
              }
            }
            if (this.field_f) {
              break L7;
            } else {
              if (-1 <= (var10.a(393216, 2) ^ -1)) {
                break L7;
              } else {
                this.field_f = true;
                this.a(lja.field_a, (ms) null, 5, -74);
                break L7;
              }
            }
          } else {
            if (this.field_f) {
              break L7;
            } else {
              if (-1 <= (var10.a(393216, 2) ^ -1)) {
                break L7;
              } else {
                this.field_f = true;
                this.a(lja.field_a, (ms) null, 5, -74);
                break L7;
              }
            }
          }
        }
        L9: {
          L10: {
            if (!this.field_f) {
              break L10;
            } else {
              if (var10.a(393216, 2) != 0) {
                this.field_a = 0;
                break L10;
              } else {
                this.field_a = this.field_a + 1;
                if (!this.field_j) {
                  if (500 < this.field_a) {
                    this.field_j = true;
                    this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  if (this.field_b) {
                    break L9;
                  } else {
                    if (-2 != (var10.u((byte) 127) ^ -1)) {
                      break L9;
                    } else {
                      this.field_b = true;
                      this.a(uj.field_f, (ms) null, 5, -108);
                      break L9;
                    }
                  }
                }
              }
            }
          }
          if (this.field_b) {
            break L9;
          } else {
            if (-2 != (var10.u((byte) 127) ^ -1)) {
              break L9;
            } else {
              this.field_b = true;
              this.a(uj.field_f, (ms) null, 5, -108);
              break L9;
            }
          }
        }
    }

    private final void a(String param0, ms param1, int param2, int param3) {
        dl var5 = null;
        try {
            if (param3 > -56) {
                this.b((byte) 111);
            }
            var5 = new dl(this.field_l, param1);
            var5.a(tea.field_a, param0, vda.field_n, (byte) 21);
            this.field_c.b((byte) -125, new mga(var5, param2));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sna.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        mga var2 = (mga) ((Object) this.field_c.f(-80));
        while (var2 != null) {
            if (var2.field_k > 0 || !this.field_l.d(0)) {
                var2.field_k = var2.field_k - 1;
            }
            var2 = (mga) ((Object) this.field_c.e(108));
        }
        if (param0 != 44) {
            this.a(1);
        }
    }

    final void b(byte param0) {
        if (param0 != -121) {
            this.field_a = -88;
        }
    }

    sna(qh param0) {
        this.field_m = false;
        this.field_d = false;
        this.field_g = -1;
        this.field_h = false;
        this.field_j = false;
        this.field_b = false;
        this.field_i = false;
        this.field_f = false;
        this.field_a = 0;
        this.field_k = false;
        this.field_e = 0;
        this.field_c = new vna();
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sna.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
