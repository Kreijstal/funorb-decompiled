/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends dg {
    private int field_r;
    private int field_m;
    private int field_t;
    static int field_o;
    private boolean field_p;
    private rea field_v;
    private int field_n;
    private int field_q;
    private boolean field_u;
    private fla field_s;

    final void a(int param0, la param1, kh param2) {
        try {
          super.a(120, param1, param2);
          this.field_q = param2.b((byte) 44, 4);
          if (param0 <= 119) {
            iq var5 = (iq) null;
            this.a((iq) null, 87, -34, 68, (byte) 5);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final int e(byte param0) {
        if (param0 < -86) {
          return super.e((byte) -108) + (this.field_r << 16);
        }
        this.e((byte) 28);
        return super.e((byte) -108) + (this.field_r << 16);
    }

    final void a(byte param0, kh param1) {
        try {
          super.a((byte) 85, param1);
          int var3_int = -96 / ((param0 + 8) / 40);
          param1.a((byte) -125, this.field_q, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dc(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_n = 160;
    }

    final static void a(int param0, int param1, byte param2) {
        if (null == pd.field_p ||
          !(param0 <= pd.field_p.length)) {
          pd.field_p = new int[param0 * 2];
        }
        if (null == jk.field_h ||
          !(param0 <= jk.field_h.length)) {
          jk.field_h = new int[param0 * 2];
        }
        if (cu.field_o == null) {
          cu.field_o = new int[param0 * 2];
          if (null == bq.field_h) {
            bq.field_h = new int[param0 * 2];
            if (im.field_o == null ||
              !(param0 <= im.field_o.length)) {
              im.field_o = new int[param0 * 2];
            }
            if (ic.field_c == null ||
              !(param0 <= ic.field_c.length)) {
              ic.field_c = new int[param0 * 2];
            }
            if (boa.field_n == null ||
              !(param1 + param0 <= boa.field_n.length)) {
              boa.field_n = new int[2 * (param1 + param0)];
            }
            if (gja.field_B == null ||
              !(gja.field_B.length >= param0)) {
              gja.field_B = new boolean[2 * param0];
            }
          } else {
            if (bq.field_h.length < param0) {
              bq.field_h = new int[param0 * 2];
              if (im.field_o == null ||
                !(param0 <= im.field_o.length)) {
                im.field_o = new int[param0 * 2];
              }
              if (ic.field_c == null ||
                !(param0 <= ic.field_c.length)) {
                ic.field_c = new int[param0 * 2];
              }
              if (boa.field_n == null ||
                !(param1 + param0 <= boa.field_n.length)) {
                boa.field_n = new int[2 * (param1 + param0)];
              }
              if (gja.field_B == null ||
                !(gja.field_B.length >= param0)) {
                gja.field_B = new boolean[2 * param0];
              }
            } else {
              if (im.field_o == null) {
                im.field_o = new int[param0 * 2];
                if (ic.field_c == null ||
                  !(param0 <= ic.field_c.length)) {
                  ic.field_c = new int[param0 * 2];
                }
                if (boa.field_n == null ||
                  !(param1 + param0 <= boa.field_n.length)) {
                  boa.field_n = new int[2 * (param1 + param0)];
                }
                if (gja.field_B == null ||
                  !(gja.field_B.length >= param0)) {
                  gja.field_B = new boolean[2 * param0];
                }
              } else {
                if (param0 > im.field_o.length) {
                  im.field_o = new int[param0 * 2];
                  if (ic.field_c == null ||
                    !(param0 <= ic.field_c.length)) {
                    ic.field_c = new int[param0 * 2];
                  }
                  if (boa.field_n == null ||
                    !(param1 + param0 <= boa.field_n.length)) {
                    boa.field_n = new int[2 * (param1 + param0)];
                  }
                  if (gja.field_B == null ||
                    !(gja.field_B.length >= param0)) {
                    gja.field_B = new boolean[2 * param0];
                  }
                } else {
                  if (ic.field_c == null ||
                    !(param0 <= ic.field_c.length)) {
                    ic.field_c = new int[param0 * 2];
                  }
                  if (boa.field_n == null ||
                    !(param1 + param0 <= boa.field_n.length)) {
                    boa.field_n = new int[2 * (param1 + param0)];
                  }
                  if (gja.field_B == null) {
                    gja.field_B = new boolean[2 * param0];
                  } else {
                    if (gja.field_B.length < param0) {
                      gja.field_B = new boolean[2 * param0];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (cu.field_o.length >= param0) {
            if (null == bq.field_h) {
              bq.field_h = new int[param0 * 2];
              if (im.field_o == null ||
                !(param0 <= im.field_o.length)) {
                im.field_o = new int[param0 * 2];
              }
              if (ic.field_c == null ||
                !(param0 <= ic.field_c.length)) {
                ic.field_c = new int[param0 * 2];
              }
              if (boa.field_n == null ||
                !(param1 + param0 <= boa.field_n.length)) {
                boa.field_n = new int[2 * (param1 + param0)];
              }
              if (gja.field_B == null ||
                !(gja.field_B.length >= param0)) {
                gja.field_B = new boolean[2 * param0];
              }
            } else {
              if (bq.field_h.length < param0) {
                bq.field_h = new int[param0 * 2];
                if (im.field_o == null ||
                  !(param0 <= im.field_o.length)) {
                  im.field_o = new int[param0 * 2];
                }
                if (ic.field_c == null ||
                  !(param0 <= ic.field_c.length)) {
                  ic.field_c = new int[param0 * 2];
                }
                if (boa.field_n == null ||
                  !(param1 + param0 <= boa.field_n.length)) {
                  boa.field_n = new int[2 * (param1 + param0)];
                }
                if (gja.field_B == null ||
                  !(gja.field_B.length >= param0)) {
                  gja.field_B = new boolean[2 * param0];
                }
              } else {
                if (im.field_o == null) {
                  im.field_o = new int[param0 * 2];
                  if (ic.field_c == null ||
                    !(param0 <= ic.field_c.length)) {
                    ic.field_c = new int[param0 * 2];
                  }
                  if (boa.field_n == null ||
                    !(param1 + param0 <= boa.field_n.length)) {
                    boa.field_n = new int[2 * (param1 + param0)];
                  }
                  if (gja.field_B == null ||
                    !(gja.field_B.length >= param0)) {
                    gja.field_B = new boolean[2 * param0];
                  }
                } else {
                  if (param0 > im.field_o.length) {
                    im.field_o = new int[param0 * 2];
                    if (ic.field_c == null ||
                      !(param0 <= ic.field_c.length)) {
                      ic.field_c = new int[param0 * 2];
                    }
                    if (boa.field_n == null ||
                      !(param1 + param0 <= boa.field_n.length)) {
                      boa.field_n = new int[2 * (param1 + param0)];
                    }
                    if (gja.field_B == null ||
                      !(gja.field_B.length >= param0)) {
                      gja.field_B = new boolean[2 * param0];
                    }
                  } else {
                    if (ic.field_c == null ||
                      !(param0 <= ic.field_c.length)) {
                      ic.field_c = new int[param0 * 2];
                    }
                    if (boa.field_n == null ||
                      !(param1 + param0 <= boa.field_n.length)) {
                      boa.field_n = new int[2 * (param1 + param0)];
                    }
                    if (gja.field_B == null) {
                      gja.field_B = new boolean[2 * param0];
                    } else {
                      if (gja.field_B.length < param0) {
                        gja.field_B = new boolean[2 * param0];
                      }
                    }
                  }
                }
              }
            }
          } else {
            cu.field_o = new int[param0 * 2];
            if (null == bq.field_h) {
              bq.field_h = new int[param0 * 2];
              if (im.field_o == null ||
                !(param0 <= im.field_o.length)) {
                im.field_o = new int[param0 * 2];
              }
              if (ic.field_c == null ||
                !(param0 <= ic.field_c.length)) {
                ic.field_c = new int[param0 * 2];
              }
              if (boa.field_n == null ||
                !(param1 + param0 <= boa.field_n.length)) {
                boa.field_n = new int[2 * (param1 + param0)];
              }
              if (gja.field_B == null) {
                gja.field_B = new boolean[2 * param0];
              } else {
                if (gja.field_B.length < param0) {
                  gja.field_B = new boolean[2 * param0];
                }
              }
            } else {
              if (bq.field_h.length < param0) {
                bq.field_h = new int[param0 * 2];
                if (im.field_o == null ||
                  !(param0 <= im.field_o.length)) {
                  im.field_o = new int[param0 * 2];
                }
                if (ic.field_c == null ||
                  !(param0 <= ic.field_c.length)) {
                  ic.field_c = new int[param0 * 2];
                }
                if (boa.field_n == null ||
                  !(param1 + param0 <= boa.field_n.length)) {
                  boa.field_n = new int[2 * (param1 + param0)];
                }
                if (gja.field_B == null ||
                  !(gja.field_B.length >= param0)) {
                  gja.field_B = new boolean[2 * param0];
                }
              } else {
                if (im.field_o == null) {
                  im.field_o = new int[param0 * 2];
                  if (ic.field_c == null ||
                    !(param0 <= ic.field_c.length)) {
                    ic.field_c = new int[param0 * 2];
                  }
                  if (boa.field_n == null ||
                    !(param1 + param0 <= boa.field_n.length)) {
                    boa.field_n = new int[2 * (param1 + param0)];
                  }
                } else {
                  if (param0 <= im.field_o.length) {
                    if (ic.field_c == null ||
                      !(param0 <= ic.field_c.length)) {
                      ic.field_c = new int[param0 * 2];
                    }
                    if (boa.field_n == null ||
                      !(param1 + param0 <= boa.field_n.length)) {
                      boa.field_n = new int[2 * (param1 + param0)];
                    }
                  } else {
                    im.field_o = new int[param0 * 2];
                    if (ic.field_c == null ||
                      !(param0 <= ic.field_c.length)) {
                      ic.field_c = new int[param0 * 2];
                    }
                    if (boa.field_n == null ||
                      !(param1 + param0 <= boa.field_n.length)) {
                      boa.field_n = new int[2 * (param1 + param0)];
                    }
                  }
                }
                if (gja.field_B == null) {
                  gja.field_B = new boolean[2 * param0];
                } else {
                  if (gja.field_B.length < param0) {
                    gja.field_B = new boolean[2 * param0];
                  }
                }
              }
            }
          }
        }
        ota.field_c = 2147483647;
        if (param2 != 47) {
          field_o = -102;
        }
        ma.field_g = -2147483648;
        kc.field_a = 2147483647;
        ap.field_d = -2147483648;
        ola.field_Eb = 0;
    }

    final void d(int param0) {
        int var2;
        int var3;
        int var6;
        int var7;
        fsa var8;
        w var9;
        Object var16;
        Object var17;
        int stackIn_16_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_149_0 = 0;
        fsa var10;
        w var11;
        fsa var12;
        w var13;
        fsa var14;
        w var15;
        w var17_ref;
        fsa var18;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        var17 = null;
        var16 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        super.d(param0);
        if (null == this.field_v) {
          return;
        }
        var2 = this.field_r;
        this.field_t = 0;
        this.field_r = this.field_n;
        this.field_m = 0;
        var3 = 1;
        if (this.field_v.c(76)) {
          this.field_t = -2 + uca.field_c.a(5, 0);
          var3 = 0;
          this.field_m = uca.field_c.a(5, ~param0) - 2;
        } else {
          if (this.field_v.r(-98)) {
            var3 = 0;
            this.field_r = this.field_n - this.field_n * this.field_v.g((byte) -107) / this.field_v.j((byte) 90);
            if (this.field_r == 0 &&
              var2 != 0) {
              this.a(42).b(false).a(0, this.c((byte) 92), 0, 0, 0, this.b((byte) 52));
            }
            var13 = (w) (this.a(param0 + 44).field_G);
            if (var13 == null) {
              return;
            }
            var12 = (fsa) (this.field_h);
            if (var12.d(param0 + 51, false)) {
              stackIn_85_0 = (var3 != 0) ? 1 : 0;
            } else {
              stackIn_85_0 = 0;
            }
            var6 = stackIn_85_0;
            if (this.field_s == null &&
              var6 != 0) {
              var13.a(new fm(56, this.b((byte) -93), this.c((byte) 124), this.e((byte) -118)), -58);
              this.field_s = var13.a(new fm(57, this.b((byte) 32), this.c((byte) 118), this.e((byte) -95)), -58);
            } else {
              if (this.field_s != null &&
                var6 == 0) {
                this.field_s.a(1, var13);
                this.field_s = null;
                var13.a(new fm(58, this.b((byte) -99), this.c((byte) 95), this.e((byte) -122)), param0 ^ 57);
              }
            }
            if (var6 == 0 &&
              !this.field_u &&
              this.field_v.c(110)) {
              var13.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
            }
            this.field_u = this.field_v.c(param0 - 77);
            if (var6 == 0 &&
              !this.field_p &&
              this.field_v.r(-110)) {
              var13.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
            }
            this.field_p = this.field_v.r(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var13.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
            }
            return;
          }
          if (this.field_v.s(param0 ^ -61)) {
            var3 = 0;
            this.field_r = 0;
            if (this.field_r == 0 &&
              var2 != 0) {
              this.a(42).b(false).a(0, this.c((byte) 92), 0, 0, 0, this.b((byte) 52));
            }
            var9 = (w) (this.a(param0 + 44).field_G);
            if (var9 == null) {
              return;
            }
            var8 = (fsa) (this.field_h);
            if (var8.d(param0 + 51, false)) {
              stackIn_16_0 = (var3 != 0) ? 1 : 0;
            } else {
              stackIn_16_0 = 0;
            }
            var6Lifetime3 = stackIn_16_0;
            if (this.field_s == null &&
              var6Lifetime3 != 0) {
              var9.a(new fm(56, this.b((byte) -93), this.c((byte) 124), this.e((byte) -118)), -58);
              this.field_s = var9.a(new fm(57, this.b((byte) 32), this.c((byte) 118), this.e((byte) -95)), -58);
            } else {
              if (this.field_s != null &&
                var6Lifetime3 == 0) {
                this.field_s.a(1, var9);
                this.field_s = null;
                var9.a(new fm(58, this.b((byte) -99), this.c((byte) 95), this.e((byte) -122)), param0 ^ 57);
              }
            }
            if (var6Lifetime3 == 0 &&
              !this.field_u &&
              this.field_v.c(110)) {
              var9.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
            }
            this.field_u = this.field_v.c(param0 - 77);
            if (var6Lifetime3 == 0 &&
              !this.field_p &&
              this.field_v.r(-110)) {
              var9.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
            }
            this.field_p = this.field_v.r(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var9.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
            }
            return;
          }
          if (this.field_v.l(param0 - 4)) {
            var3 = 0;
            this.field_r = this.field_n * this.field_v.g((byte) -120) / this.field_v.d(false);
            if (this.field_r == 0 &&
              var2 != 0) {
              this.a(42).b(false).a(0, this.c((byte) 92), 0, 0, 0, this.b((byte) 52));
            }
            var11 = (w) (this.a(param0 + 44).field_G);
            if (var11 == null) {
              return;
            }
            var10 = (fsa) (this.field_h);
            if (var10.d(param0 + 51, false)) {
              stackIn_51_0 = (var3 != 0) ? 1 : 0;
            } else {
              stackIn_51_0 = 0;
            }
            var6Lifetime4 = stackIn_51_0;
            if (this.field_s == null &&
              var6Lifetime4 != 0) {
              var11.a(new fm(56, this.b((byte) -93), this.c((byte) 124), this.e((byte) -118)), -58);
              this.field_s = var11.a(new fm(57, this.b((byte) 32), this.c((byte) 118), this.e((byte) -95)), -58);
            } else {
              if (this.field_s != null &&
                var6Lifetime4 == 0) {
                this.field_s.a(1, var11);
                this.field_s = null;
                var11.a(new fm(58, this.b((byte) -99), this.c((byte) 95), this.e((byte) -122)), param0 ^ 57);
              }
            }
            if (var6Lifetime4 == 0 &&
              !this.field_u &&
              this.field_v.c(110)) {
              var11.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
            }
            this.field_u = this.field_v.c(param0 - 77);
            if (var6Lifetime4 == 0 &&
              !this.field_p &&
              this.field_v.r(-110)) {
              var11.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
            }
            this.field_p = this.field_v.r(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
            }
            return;
          }
        }
        if (this.field_r == 0) {
          if (var2 == 0) {
            var15 = (w) (this.a(param0 + 44).field_G);
            if (var15 == null) {
              return;
            }
            var14 = (fsa) (this.field_h);
            if (var14.d(param0 + 51, false)) {
              stackIn_118_0 = (var3 != 0) ? 1 : 0;
            } else {
              stackIn_118_0 = 0;
            }
            var6Lifetime1 = stackIn_118_0;
            if (this.field_s == null &&
              var6Lifetime1 != 0) {
              var15.a(new fm(56, this.b((byte) -93), this.c((byte) 124), this.e((byte) -118)), -58);
              this.field_s = var15.a(new fm(57, this.b((byte) 32), this.c((byte) 118), this.e((byte) -95)), -58);
            } else {
              if (this.field_s != null &&
                var6Lifetime1 == 0) {
                this.field_s.a(1, var15);
                this.field_s = null;
                var15.a(new fm(58, this.b((byte) -99), this.c((byte) 95), this.e((byte) -122)), param0 ^ 57);
              }
            }
            if (var6Lifetime1 == 0 &&
              !this.field_u &&
              this.field_v.c(110)) {
              var15.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
            }
            this.field_u = this.field_v.c(param0 - 77);
            if (var6Lifetime1 == 0 &&
              !this.field_p &&
              this.field_v.r(-110)) {
              var15.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
            }
            this.field_p = this.field_v.r(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var15.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
            }
            return;
          }
          this.a(42).b(false).a(0, this.c((byte) 92), 0, 0, 0, this.b((byte) 52));
        }
        var17_ref = (w) (this.a(param0 + 44).field_G);
        if (var17_ref == null) {
          return;
        }
        var18 = (fsa) (this.field_h);
        if (var18.d(param0 + 51, false)) {
          stackIn_149_0 = (var3 == 0) ? 0 : 1;
        } else {
          stackIn_149_0 = 0;
        }
        var6Lifetime2 = stackIn_149_0;
        if (this.field_s == null &&
          var6Lifetime2 != 0) {
          var17_ref.a(new fm(56, this.b((byte) -93), this.c((byte) 124), this.e((byte) -118)), -58);
          this.field_s = var17_ref.a(new fm(57, this.b((byte) 32), this.c((byte) 118), this.e((byte) -95)), -58);
          if (var6Lifetime2 == 0 &&
            !this.field_u &&
            this.field_v.c(110)) {
            var17_ref.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
            this.field_u = this.field_v.c(param0 - 77);
            if (!this.field_p &&
              this.field_v.r(-110)) {
              var17_ref.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
            }
            this.field_p = this.field_v.r(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var17_ref.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
            }
            return;
          }
          this.field_u = this.field_v.c(param0 - 77);
          if (var6Lifetime2 == 0 &&
            !this.field_p) {
            if (!this.field_v.r(-110)) {
              this.field_p = this.field_v.r(-59);
              if (this.field_r == 0 &&
                var2 != 0) {
                var17_ref.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
              }
              return;
            }
            var17_ref.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
          }
          this.field_p = this.field_v.r(-59);
          if (this.field_r != 0) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          var17_ref.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
          return;
        }
        if (this.field_s != null) {
          if (var6Lifetime2 == 0) {
            this.field_s.a(1, var17_ref);
            this.field_s = null;
            var17_ref.a(new fm(58, this.b((byte) -99), this.c((byte) 95), this.e((byte) -122)), param0 ^ 57);
            if (!this.field_u &&
              this.field_v.c(110)) {
              var17_ref.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
            }
            this.field_u = this.field_v.c(param0 - 77);
            if (!this.field_p &&
              this.field_v.r(-110)) {
              var17_ref.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
            }
          } else {
            if (var6Lifetime2 == 0 &&
              !this.field_u &&
              this.field_v.c(110)) {
              var17_ref.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
            }
            this.field_u = this.field_v.c(param0 - 77);
            if (var6Lifetime2 == 0 &&
              !this.field_p &&
              this.field_v.r(-110)) {
              var17_ref.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
            }
          }
          this.field_p = this.field_v.r(-59);
          if (this.field_r == 0 &&
            var2 != 0) {
            var17_ref.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
          }
          return;
        }
        if (var6Lifetime2 == 0 &&
          !this.field_u &&
          this.field_v.c(110)) {
          var17_ref.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
          this.field_u = this.field_v.c(param0 - 77);
          if (!this.field_p) {
            if (!this.field_v.r(-110)) {
              this.field_p = this.field_v.r(-59);
              if (this.field_r == 0 &&
                var2 != 0) {
                var17_ref.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
              }
              return;
            }
            var17_ref.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
          }
          this.field_p = this.field_v.r(-59);
          if (this.field_r != 0) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          var17_ref.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
          return;
        }
        this.field_u = this.field_v.c(param0 - 77);
        if (var6Lifetime2 == 0 &&
          !this.field_p) {
          if (!this.field_v.r(-110)) {
            this.field_p = this.field_v.r(-59);
            if (this.field_r != 0) {
              return;
            }
            if (var2 == 0) {
              return;
            }
            var17_ref.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
            return;
          }
          var17_ref.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
        }
        this.field_p = this.field_v.r(-59);
        if (this.field_r == 0 &&
          var2 != 0) {
          var17_ref.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
          return;
        }
        return;
    }

    dc(int param0) {
        super(param0);
        this.field_n = 160;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        ka var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = param2 + (this.field_t << 16);
          param3 = param3 + (this.field_r << 16);
          var7 = param1 + (this.field_m << 16);
          var8 = dfa.a(4096 - this.field_h.g(-25787) >> 2, 2048, -120);
          var10 = 14 % ((param4 + 38) / 47);
          var11 = this.field_q;
          if (var11 != 0 &&
            var11 == 1) {
            var9 = df.field_J[74];
          } else {
            var9 = df.field_J[74];
          }
          gqa.a(var8, -83584144, var7, var6_int, var9, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("dc.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          super.a(param0, param1, param2);
          if (param0 instanceof rea) {
            this.field_v = (rea) (param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("dc.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_o = 6;
    }
}
