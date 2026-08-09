/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gaa extends dg {
    private int field_q;
    static int field_p;
    private jaa field_n;
    private int field_m;
    private int field_o;
    private uh field_s;
    private boolean field_r;

    final void d(int param0) {
        int var3;
        mra var4;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -1) {
          if (null != this.field_s) {
            if (this.field_h != null) {
              this.field_s.a(this.e((byte) -123), (byte) 127, this.c((byte) 105), this.b((byte) -117));
              if (!this.field_h.h(18407)) {
                if (this.field_k != null) {
                  if (!this.field_k.a((byte) 87)) {
                    if (!(this.field_k instanceof mra)) {
                      if (this.field_k.a(param0 + -85)) {
                        this.a(false);
                        return;
                      } else {
                        this.i(-34);
                        return;
                      }
                    } else {
                      var4 = (mra) ((Object) this.field_k);
                      if (var4.b(-90)) {
                        this.a(false);
                        return;
                      } else {
                        this.i(94);
                        return;
                      }
                    }
                  } else {
                    this.k(24642);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                this.k(24642);
                return;
              }
            } else {
              this.k(param0 ^ -24643);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_r = param3 ? true : false;
        this.field_o = param0;
        this.field_q = param1;
        if (param2 != 1) {
            this.field_m = -128;
        }
    }

    private final void i(int param0) {
        int var2;
        if (this.field_s.f(1)) {
          return;
        } else {
          var2 = -54 / ((param0 - 45) / 47);
          if (this.field_s != null) {
            this.field_s.a(true, 1011094480);
            return;
          } else {
            return;
          }
        }
    }

    private final void k(int param0) {
        if (param0 != 24642) {
            return;
        }
        if (!(null == this.field_s)) {
            this.field_s.e(2);
            this.field_s = null;
        }
    }

    private final void a(boolean param0) {
        uw var3;
        if (!this.field_s.f(1)) {
          return;
        } else {
          if (param0) {
            L0: {
              var3 = (uw) null;
              this.a(81, (uw) null, (byte) -45);
              if (null != this.field_s) {
                this.field_s.a(false, 1011094480);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (null != this.field_s) {
                this.field_s.a(false, 1011094480);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    final int k(byte param0) {
        if (param0 != -99) {
            this.field_m = -101;
            return 8;
        }
        return 8;
    }

    final void a(byte param0, int param1, uw param2) {
        try {
            this.j(0);
            if (param0 <= 50) {
                field_p = -20;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gaa.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(int param0) {
        uw var3;
        ev var4;
        sva var5;
        int var6;
        int var7;
        int var8;
        la var9;
        aga var10;
        aga var11;
        aga var12;
        aga var13;
        aga var14;
        aga var15;
        aga var16;
        aga var17;
        aga var18;
        aga var19;
        aga var20;
        aga var21;
        aga var22;
        aga var23;
        aga var24;
        aga var25;
        var8 = TombRacer.field_G ? 1 : 0;
        if (this.field_s != null) {
          return;
        } else {
          if (this.field_h != null) {
            var9 = this.field_h.f((byte) -86);
            var3 = var9.j((byte) -105);
            if (var3 == null) {
              return;
            } else {
              var4 = var3.a((byte) 59);
              if (var4 instanceof sva) {
                var5 = (sva) ((Object) var4);
                var6 = 0;
                var7 = this.field_q;
                if (var7 == 0) {
                  var6 = 0;
                  var11 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                  this.field_s = new uh(var11);
                  this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                  if (!this.field_r) {
                    var5.a((byte) 45, this.field_s);
                    return;
                  } else {
                    this.field_s.b(uca.field_c.a(50000, 0), 0);
                    var5.a((byte) 45, this.field_s);
                    return;
                  }
                } else {
                  if (var7 != 1) {
                    if (-3 != (var7 ^ -1)) {
                      if (-4 == (var7 ^ -1)) {
                        var7 = this.field_o;
                        if (var7 != 0) {
                          if (1 == var7) {
                            var6 = 6;
                            var22 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                            this.field_s = new uh(var22);
                            this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                            if (!this.field_r) {
                              var5.a((byte) 45, this.field_s);
                              return;
                            } else {
                              this.field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, this.field_s);
                              return;
                            }
                          } else {
                            if (var7 == 2) {
                              var6 = 8;
                              var23 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                              this.field_s = new uh(var23);
                              this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                              if (!this.field_r) {
                                var5.a((byte) 45, this.field_s);
                                return;
                              } else {
                                this.field_s.b(uca.field_c.a(50000, 0), 0);
                                var5.a((byte) 45, this.field_s);
                                return;
                              }
                            } else {
                              var20 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                              this.field_s = new uh(var20);
                              this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                              if (!this.field_r) {
                                var5.a((byte) 45, this.field_s);
                                return;
                              } else {
                                this.field_s.b(uca.field_c.a(50000, 0), 0);
                                var5.a((byte) 45, this.field_s);
                                return;
                              }
                            }
                          }
                        } else {
                          var6 = 10;
                          var21 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                          this.field_s = new uh(var21);
                          this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                          if (!this.field_r) {
                            var5.a((byte) 45, this.field_s);
                            return;
                          } else {
                            this.field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, this.field_s);
                            return;
                          }
                        }
                      } else {
                        if ((var7 ^ -1) == -5) {
                          var6 = 5;
                          var24 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                          this.field_s = new uh(var24);
                          this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                          if (!this.field_r) {
                            var5.a((byte) 45, this.field_s);
                            return;
                          } else {
                            this.field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, this.field_s);
                            return;
                          }
                        } else {
                          if ((var7 ^ -1) == -6) {
                            var6 = 4;
                            var25 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                            this.field_s = new uh(var25);
                            this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                            if (!this.field_r) {
                              var5.a((byte) 45, this.field_s);
                              return;
                            } else {
                              this.field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, this.field_s);
                              return;
                            }
                          } else {
                            var10 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                            this.field_s = new uh(var10);
                            this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                            if (!this.field_r) {
                              var5.a((byte) 45, this.field_s);
                              return;
                            } else {
                              this.field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, this.field_s);
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      var7 = this.field_o;
                      if (-1 != (var7 ^ -1)) {
                        if (var7 != 1) {
                          if (2 == var7) {
                            var6 = 9;
                            var19 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                            this.field_s = new uh(var19);
                            this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                            if (!this.field_r) {
                              var5.a((byte) 45, this.field_s);
                              return;
                            } else {
                              this.field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, this.field_s);
                              return;
                            }
                          } else {
                            var16 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                            this.field_s = new uh(var16);
                            this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                            if (!this.field_r) {
                              var5.a((byte) 45, this.field_s);
                              return;
                            } else {
                              this.field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, this.field_s);
                              return;
                            }
                          }
                        } else {
                          var6 = 7;
                          var18 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                          this.field_s = new uh(var18);
                          this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                          if (!this.field_r) {
                            var5.a((byte) 45, this.field_s);
                            return;
                          } else {
                            this.field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, this.field_s);
                            return;
                          }
                        }
                      } else {
                        var6 = 11;
                        var17 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                        this.field_s = new uh(var17);
                        this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                        if (!this.field_r) {
                          var5.a((byte) 45, this.field_s);
                          return;
                        } else {
                          this.field_s.b(uca.field_c.a(50000, 0), 0);
                          var5.a((byte) 45, this.field_s);
                          return;
                        }
                      }
                    }
                  } else {
                    var7 = this.field_o;
                    if (-1 != (var7 ^ -1)) {
                      if (1 != var7) {
                        if (2 == var7) {
                          var6 = 14;
                          var15 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                          this.field_s = new uh(var15);
                          this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                          if (!this.field_r) {
                            var5.a((byte) 45, this.field_s);
                            return;
                          } else {
                            this.field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, this.field_s);
                            return;
                          }
                        } else {
                          var12 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                          this.field_s = new uh(var12);
                          this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                          if (!this.field_r) {
                            var5.a((byte) 45, this.field_s);
                            return;
                          } else {
                            this.field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, this.field_s);
                            return;
                          }
                        }
                      } else {
                        var6 = 15;
                        var14 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                        this.field_s = new uh(var14);
                        this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                        if (!this.field_r) {
                          var5.a((byte) 45, this.field_s);
                          return;
                        } else {
                          this.field_s.b(uca.field_c.a(50000, 0), 0);
                          var5.a((byte) 45, this.field_s);
                          return;
                        }
                      }
                    } else {
                      var6 = 16;
                      var13 = new aga(tga.field_a, param0, 0, 0, 0, this.field_n.a(-43946608), this.field_m, var6);
                      this.field_s = new uh(var13);
                      this.field_s.a(this.e((byte) -121), (byte) 110, this.c((byte) 107), this.b((byte) -95));
                      if (!this.field_r) {
                        var5.a((byte) 45, this.field_s);
                        return;
                      } else {
                        this.field_s.b(uca.field_c.a(50000, 0), 0);
                        var5.a((byte) 45, this.field_s);
                        return;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, uw param1, byte param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 < 40) {
                this.field_s = (uh) null;
                this.k(24642);
                break L1;
              } else {
                this.k(24642);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("gaa.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gaa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    gaa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -65, param1);
            int var3_int = 46 / ((param0 - -8) / 40);
            param1.a((byte) 0, this.field_q, 4);
            param1.a((byte) 19, this.field_o, 2);
            param1.a((byte) -127, this.field_r ? 1 : 0, 1);
            param1.a((byte) 74, this.field_m / 8, 8);
            if (this.field_n == null) {
                this.field_n = new jaa(false, db.field_l);
            }
            this.field_n.a(0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gaa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_m = param1;
        if (param0 != 1) {
            this.field_q = -24;
        }
    }

    final void a(int param0, la param1, kh param2) {
        super.a(127, param1, param2);
        if (!(param1.field_E >= 18)) {
            return;
        }
        this.field_q = param2.b((byte) 44, 4);
        this.field_o = param2.b((byte) 44, 2);
        this.field_r = 1 == param2.b((byte) 44, 1) ? true : false;
        if (param0 < 119) {
            return;
        }
        try {
            this.field_r = true;
            this.field_m = param2.b((byte) 44, 8) * 8;
            this.field_n = new jaa(false, db.field_l, param1.field_E, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gaa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(float param0, float param1, int param2, jg param3, int param4, int param5, float param6, int param7, int param8, float param9, float param10) {
        byte[] var11 = null;
        RuntimeException var11_ref = null;
        byte[] var12 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var12 = new byte[param7 * (param2 * param5)];
            var11 = var12;
            hr.a(param0, param2, 0, 0, param4, var12, param1, param5, param6, param3, param9, param7, param10);
            if (param8 == 4) {
              stackIn_4_0 = (byte[]) (var12);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var11_ref);

            stackIn_7_1 = new StringBuilder().append("gaa.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    gaa(int param0) {
        super(param0);
        this.field_n = new jaa(false, db.field_l);
        this.field_r = true;
        this.field_m = 128;
    }

    final void a(boolean param0, int param1) {
        this.field_n.a(false, param1);
        if (!param0) {
            this.j(8);
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = -34 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gaa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_p = 250;
    }
}
