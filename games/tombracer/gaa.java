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
        int var3 = 0;
        mra var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -1) {
          if (null != ((gaa) this).field_s) {
            if (((gaa) this).field_h != null) {
              ((gaa) this).field_s.a(((gaa) this).e((byte) -123), (byte) 127, ((gaa) this).c((byte) 105), ((gaa) this).b((byte) -117));
              if (!((gaa) this).field_h.h(18407)) {
                if (((gaa) this).field_k != null) {
                  if (!((gaa) this).field_k.a((byte) 87)) {
                    if (!(((gaa) this).field_k instanceof mra)) {
                      if (((gaa) this).field_k.a(param0 + -85)) {
                        this.a(false);
                        return;
                      } else {
                        this.i(-34);
                        return;
                      }
                    } else {
                      var4 = (mra) (Object) ((gaa) this).field_k;
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
        ((gaa) this).field_r = param3 ? true : false;
        ((gaa) this).field_o = param0;
        ((gaa) this).field_q = param1;
        if (param2 != 1) {
            ((gaa) this).field_m = -128;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        if (((gaa) this).field_s.f(1)) {
          return;
        } else {
          var2 = -54 / ((param0 - 45) / 47);
          if (((gaa) this).field_s != null) {
            ((gaa) this).field_s.a(true, 1011094480);
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
        if (!(null == ((gaa) this).field_s)) {
            ((gaa) this).field_s.e(2);
            ((gaa) this).field_s = null;
        }
    }

    private final void a(boolean param0) {
        if (!(((gaa) this).field_s.f(1))) {
            return;
        }
        Object var3 = null;
        ((gaa) this).a(81, (uw) null, (byte) -45);
        if (!(null == ((gaa) this).field_s)) {
            ((gaa) this).field_s.a(false, 1011094480);
        }
    }

    final int k(byte param0) {
        if (param0 != -99) {
            ((gaa) this).field_m = -101;
            return 8;
        }
        return 8;
    }

    final void a(byte param0, int param1, uw param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.j(0);
              if (param0 > 50) {
                break L1;
              } else {
                field_p = -20;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gaa.V(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void j(int param0) {
        uw var3 = null;
        ev var4 = null;
        sva var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        la var9 = null;
        aga var10 = null;
        aga var11 = null;
        aga var12 = null;
        aga var13 = null;
        aga var14 = null;
        aga var15 = null;
        aga var16 = null;
        aga var17 = null;
        aga var18 = null;
        aga var19 = null;
        aga var20 = null;
        aga var21 = null;
        aga var22 = null;
        aga var23 = null;
        aga var24 = null;
        aga var25 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        if (((gaa) this).field_s != null) {
          return;
        } else {
          if (((gaa) this).field_h != null) {
            var9 = ((gaa) this).field_h.f((byte) -86);
            var3 = var9.j((byte) -105);
            if (var3 == null) {
              return;
            } else {
              var4 = var3.a((byte) 59);
              if (var4 instanceof sva) {
                var5 = (sva) (Object) var4;
                var6 = 0;
                var7 = ((gaa) this).field_q;
                if (var7 == 0) {
                  var6 = 0;
                  var11 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                  ((gaa) this).field_s = new uh(var11);
                  ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                  if (!((gaa) this).field_r) {
                    var5.a((byte) 45, ((gaa) this).field_s);
                    return;
                  } else {
                    ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                    var5.a((byte) 45, ((gaa) this).field_s);
                    return;
                  }
                } else {
                  if (var7 != 1) {
                    if (var7 != 2) {
                      if (var7 == 3) {
                        var7 = ((gaa) this).field_o;
                        if (var7 != 0) {
                          if (1 == var7) {
                            var6 = 6;
                            var22 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                            ((gaa) this).field_s = new uh(var22);
                            ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                            if (!((gaa) this).field_r) {
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            } else {
                              ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            }
                          } else {
                            if (var7 == 2) {
                              var6 = 8;
                              var23 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                              ((gaa) this).field_s = new uh(var23);
                              ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                              if (!((gaa) this).field_r) {
                                var5.a((byte) 45, ((gaa) this).field_s);
                                return;
                              } else {
                                ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                                var5.a((byte) 45, ((gaa) this).field_s);
                                return;
                              }
                            } else {
                              var20 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                              ((gaa) this).field_s = new uh(var20);
                              ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                              if (!((gaa) this).field_r) {
                                var5.a((byte) 45, ((gaa) this).field_s);
                                return;
                              } else {
                                ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                                var5.a((byte) 45, ((gaa) this).field_s);
                                return;
                              }
                            }
                          }
                        } else {
                          var6 = 10;
                          var21 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                          ((gaa) this).field_s = new uh(var21);
                          ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                          if (!((gaa) this).field_r) {
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          } else {
                            ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          }
                        }
                      } else {
                        if (var7 == 4) {
                          var6 = 5;
                          var24 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                          ((gaa) this).field_s = new uh(var24);
                          ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                          if (!((gaa) this).field_r) {
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          } else {
                            ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          }
                        } else {
                          if (var7 == 5) {
                            var6 = 4;
                            var25 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                            ((gaa) this).field_s = new uh(var25);
                            ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                            if (!((gaa) this).field_r) {
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            } else {
                              ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            }
                          } else {
                            var10 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                            ((gaa) this).field_s = new uh(var10);
                            ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                            if (!((gaa) this).field_r) {
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            } else {
                              ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      var7 = ((gaa) this).field_o;
                      if (var7 != 0) {
                        if (var7 != 1) {
                          if (2 == var7) {
                            var6 = 9;
                            var19 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                            ((gaa) this).field_s = new uh(var19);
                            ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                            if (!((gaa) this).field_r) {
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            } else {
                              ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            }
                          } else {
                            var16 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                            ((gaa) this).field_s = new uh(var16);
                            ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                            if (!((gaa) this).field_r) {
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            } else {
                              ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                              var5.a((byte) 45, ((gaa) this).field_s);
                              return;
                            }
                          }
                        } else {
                          var6 = 7;
                          var18 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                          ((gaa) this).field_s = new uh(var18);
                          ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                          if (!((gaa) this).field_r) {
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          } else {
                            ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          }
                        }
                      } else {
                        var6 = 11;
                        var17 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                        ((gaa) this).field_s = new uh(var17);
                        ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                        if (!((gaa) this).field_r) {
                          var5.a((byte) 45, ((gaa) this).field_s);
                          return;
                        } else {
                          ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                          var5.a((byte) 45, ((gaa) this).field_s);
                          return;
                        }
                      }
                    }
                  } else {
                    var7 = ((gaa) this).field_o;
                    if (var7 != 0) {
                      if (1 != var7) {
                        if (2 == var7) {
                          var6 = 14;
                          var15 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                          ((gaa) this).field_s = new uh(var15);
                          ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                          if (!((gaa) this).field_r) {
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          } else {
                            ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          }
                        } else {
                          var12 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                          ((gaa) this).field_s = new uh(var12);
                          ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                          if (!((gaa) this).field_r) {
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          } else {
                            ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                            var5.a((byte) 45, ((gaa) this).field_s);
                            return;
                          }
                        }
                      } else {
                        var6 = 15;
                        var14 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                        ((gaa) this).field_s = new uh(var14);
                        ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                        if (!((gaa) this).field_r) {
                          var5.a((byte) 45, ((gaa) this).field_s);
                          return;
                        } else {
                          ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                          var5.a((byte) 45, ((gaa) this).field_s);
                          return;
                        }
                      }
                    } else {
                      var6 = 16;
                      var13 = new aga(tga.field_a, param0, 0, 0, 0, ((gaa) this).field_n.a(-43946608), ((gaa) this).field_m, var6);
                      ((gaa) this).field_s = new uh(var13);
                      ((gaa) this).field_s.a(((gaa) this).e((byte) -121), (byte) 110, ((gaa) this).c((byte) 107), ((gaa) this).b((byte) -95));
                      if (!((gaa) this).field_r) {
                        var5.a((byte) 45, ((gaa) this).field_s);
                        return;
                      } else {
                        ((gaa) this).field_s.b(uca.field_c.a(50000, 0), 0);
                        var5.a((byte) 45, ((gaa) this).field_s);
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
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < 40) {
                ((gaa) this).field_s = null;
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
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("gaa.FA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gaa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    gaa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -65, param1);
            int var3_int = 46 / ((param0 - -8) / 40);
            param1.a((byte) 0, ((gaa) this).field_q, 4);
            param1.a((byte) 19, ((gaa) this).field_o, 2);
            param1.a((byte) -127, ((gaa) this).field_r ? 1 : 0, 1);
            param1.a((byte) 74, ((gaa) this).field_m / 8, 8);
            if (((gaa) this).field_n == null) {
                ((gaa) this).field_n = new jaa(false, db.field_l);
            }
            ((gaa) this).field_n.a(0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gaa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        ((gaa) this).field_m = param1;
        if (param0 != 1) {
            ((gaa) this).field_q = -24;
        }
    }

    final void a(int param0, la param1, kh param2) {
        super.a(127, param1, param2);
        if (!(param1.field_E >= 18)) {
            return;
        }
        ((gaa) this).field_q = param2.b((byte) 44, 4);
        ((gaa) this).field_o = param2.b((byte) 44, 2);
        ((gaa) this).field_r = 1 == param2.b((byte) 44, 1) ? true : false;
        if (param0 < 119) {
            return;
        }
        try {
            ((gaa) this).field_r = true;
            ((gaa) this).field_m = param2.b((byte) 44, 8) * 8;
            ((gaa) this).field_n = new jaa(false, db.field_l, param1.field_E, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gaa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(float param0, float param1, int param2, jg param3, int param4, int param5, float param6, int param7, int param8, float param9, float param10) {
        byte[] var11 = null;
        RuntimeException var11_ref = null;
        byte[] var12 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var12 = new byte[262144];
          var11 = var12;
          hr.a(param0, 128, 0, 0, 8, var12, param1, 128, param6, param3, param9, 16, param10);
          return var12;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var11_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var11_ref;
            stackOut_2_1 = new StringBuilder().append("gaa.CA(").append(param0).append(',').append(param1).append(',').append(128).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 8 + ',' + 128 + ',' + param6 + ',' + 16 + ',' + 4 + ',' + param9 + ',' + param10 + ')');
        }
    }

    gaa(int param0) {
        super(param0);
        ((gaa) this).field_n = new jaa(false, db.field_l);
        ((gaa) this).field_r = true;
        ((gaa) this).field_m = 128;
    }

    final void a(boolean param0, int param1) {
        ((gaa) this).field_n.a(false, param1);
        if (!param0) {
            this.j(8);
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = -34 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gaa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 250;
    }
}
