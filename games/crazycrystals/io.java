/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends rf {
    static u field_P;
    private int field_E;
    private dl field_K;
    private n field_L;
    private String field_N;
    static ko field_H;
    static am field_M;
    static String field_J;
    static int field_O;
    static String[] field_I;

    final String a(byte param0) {
        if (param0 < -23) {
            return null;
        }
        return (String) null;
    }

    final boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("io.P(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, db param1, db param2) {
        try {
            oj.field_H = param2;
            ka.field_m = param1;
            if (param0 != 4096) {
                field_P = (u) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "io.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        un var2;
        field_H = null;
        field_P = null;
        field_M = null;
        field_J = null;
        if (param0 > -120) {
          var2 = (un) null;
          io.a(89, 18, -26, (un) null, -101, 42);
          field_I = null;
          return;
        } else {
          field_I = null;
          return;
        }
    }

    io(n param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, c.b(false));
        try {
            this.field_N = param1;
            this.field_L = param0;
            this.a(param5, param2, param3, param4, (byte) -52);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "io.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        oi var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        dl var19;
        Object var22;
        Object var27;
        Object var31;
        Object var35;
        Object var39;
        Object var43;
        Object var47;
        fi var51;
        String var5;
        int var11;
        int var12;
        dl var20;
        dl var21;
        dl var23;
        dl var24;
        dl var25;
        String var26;
        dl var28;
        dl var29;
        dl var30;
        dl var32;
        dl var33;
        dl var34;
        dl var36;
        dl var37;
        dl var38;
        dl var40;
        dl var41;
        dl var42;
        dl var44;
        dl var45;
        dl var46;
        dl var48;
        dl var49;
        dl var50;
        fi var52;
        fi var53;
        fi var54;
        fi var55;
        fi var56;
        fi var57;
        fi var58;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var35 = null;
        var39 = null;
        var43 = null;
        var47 = null;
        var13 = CrazyCrystals.field_B;
        var6 = this.field_L.c((byte) 45);
        if (ta.field_h != var6) {
          if (ec.field_h != var6) {
            L0: {
              var5 = this.field_L.a(-16774);
              if (var5 != null) {
                break L0;
              } else {
                var5 = this.field_N;
                break L0;
              }
            }
            if (var5.equals(this.field_o)) {
              if (param1 <= -12) {
                L1: {
                  super.a(param0, (byte) -110, param2, param3);
                  var6 = this.field_L.c((byte) 45);
                  var58 = (fi) ((Object) this.field_i);
                  var9 = param2 + this.field_r;
                  var10 = var58.a(param0, (byte) 50, (qm) (this)) + (var58.a((qm) (this), 1).a((byte) -90) >> 2599841);
                  if (var6 == ta.field_h) {
                    break L1;
                  } else {
                    if (ec.field_h == var6) {
                      break L1;
                    } else {
                      if (var6 == rk.field_c) {
                        var49 = ao.field_b[2];
                        var49.d(var9, -(var49.field_u >> -555861823) + var10, 256);
                        return;
                      } else {
                        if (ih.field_b == var6) {
                          var48 = ao.field_b[1];
                          var48.d(var9, -(var48.field_u >> 1038170945) + var10, 256);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                L2: {
                  var50 = ao.field_b[0];
                  var11 = var50.field_n << 1349035009;
                  var12 = var50.field_o << 972466497;
                  if (this.field_K == null) {
                    break L2;
                  } else {
                    if (var11 > this.field_K.field_l) {
                      break L2;
                    } else {
                      if (var12 > this.field_K.field_u) {
                        break L2;
                      } else {
                        em.a((byte) 38, this.field_K);
                        kh.a();
                        var50.a(112, 144, var50.field_n << 1964502436, var50.field_o << 405078276, -this.field_E << 74410538, 4096);
                        lg.a(1);
                        this.field_K.d(var9 - (var50.field_n >> -787078303), var10 + -var50.field_o, 256);
                        return;
                      }
                    }
                  }
                }
                this.field_K = new dl(var11, var12);
                em.a((byte) 38, this.field_K);
                var50.a(112, 144, var50.field_n << 1964502436, var50.field_o << 405078276, -this.field_E << 74410538, 4096);
                lg.a(1);
                this.field_K.d(var9 - (var50.field_n >> -787078303), var10 + -var50.field_o, 256);
                return;
              } else {
                L3: {
                  this.field_N = (String) null;
                  super.a(param0, (byte) -110, param2, param3);
                  var6 = this.field_L.c((byte) 45);
                  var57 = (fi) ((Object) this.field_i);
                  var9 = param2 + this.field_r;
                  var10 = var57.a(param0, (byte) 50, (qm) (this)) + (var57.a((qm) (this), 1).a((byte) -90) >> 2599841);
                  if (var6 == ta.field_h) {
                    break L3;
                  } else {
                    if (ec.field_h == var6) {
                      break L3;
                    } else {
                      if (var6 != rk.field_c) {
                        if (ih.field_b == var6) {
                          var44 = ao.field_b[1];
                          var44.d(var9, -(var44.field_u >> 1038170945) + var10, 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var45 = ao.field_b[2];
                        var45.d(var9, -(var45.field_u >> -555861823) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                L4: {
                  var46 = ao.field_b[0];
                  var11 = var46.field_n << 1349035009;
                  var12 = var46.field_o << 972466497;
                  if (this.field_K == null) {
                    break L4;
                  } else {
                    if (var11 > this.field_K.field_l) {
                      break L4;
                    } else {
                      if (var12 > this.field_K.field_u) {
                        break L4;
                      } else {
                        em.a((byte) 38, this.field_K);
                        kh.a();
                        var46.a(112, 144, var46.field_n << 1964502436, var46.field_o << 405078276, -this.field_E << 74410538, 4096);
                        lg.a(1);
                        this.field_K.d(var9 - (var46.field_n >> -787078303), var10 + -var46.field_o, 256);
                        return;
                      }
                    }
                  }
                }
                this.field_K = new dl(var11, var12);
                em.a((byte) 38, this.field_K);
                var46.a(112, 144, var46.field_n << 1964502436, var46.field_o << 405078276, -this.field_E << 74410538, 4096);
                lg.a(1);
                this.field_K.d(var9 - (var46.field_n >> -787078303), var10 + -var46.field_o, 256);
                return;
              }
            } else {
              this.field_o = var5;
              this.b(true);
              if (param1 <= -12) {
                L5: {
                  super.a(param0, (byte) -110, param2, param3);
                  var6 = this.field_L.c((byte) 45);
                  var56 = (fi) ((Object) this.field_i);
                  var9 = param2 + this.field_r;
                  var10 = var56.a(param0, (byte) 50, (qm) (this)) + (var56.a((qm) (this), 1).a((byte) -90) >> 2599841);
                  if (var6 == ta.field_h) {
                    break L5;
                  } else {
                    if (ec.field_h == var6) {
                      break L5;
                    } else {
                      if (var6 != rk.field_c) {
                        if (ih.field_b == var6) {
                          var40 = ao.field_b[1];
                          var40.d(var9, -(var40.field_u >> 1038170945) + var10, 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var41 = ao.field_b[2];
                        var41.d(var9, -(var41.field_u >> -555861823) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                var42 = ao.field_b[0];
                var11 = var42.field_n << 1349035009;
                var12 = var42.field_o << 972466497;
                if (this.field_K != null) {
                  if (var11 <= this.field_K.field_l) {
                    if (var12 <= this.field_K.field_u) {
                      em.a((byte) 38, this.field_K);
                      kh.a();
                      var42.a(112, 144, var42.field_n << 1964502436, var42.field_o << 405078276, -this.field_E << 74410538, 4096);
                      lg.a(1);
                      this.field_K.d(var9 - (var42.field_n >> -787078303), var10 + -var42.field_o, 256);
                      return;
                    } else {
                      this.field_K = new dl(var11, var12);
                      em.a((byte) 38, this.field_K);
                      var42.a(112, 144, var42.field_n << 1964502436, var42.field_o << 405078276, -this.field_E << 74410538, 4096);
                      lg.a(1);
                      this.field_K.d(var9 - (var42.field_n >> -787078303), var10 + -var42.field_o, 256);
                      return;
                    }
                  } else {
                    this.field_K = new dl(var11, var12);
                    em.a((byte) 38, this.field_K);
                    var42.a(112, 144, var42.field_n << 1964502436, var42.field_o << 405078276, -this.field_E << 74410538, 4096);
                    lg.a(1);
                    this.field_K.d(var9 - (var42.field_n >> -787078303), var10 + -var42.field_o, 256);
                    return;
                  }
                } else {
                  this.field_K = new dl(var11, var12);
                  em.a((byte) 38, this.field_K);
                  var42.a(112, 144, var42.field_n << 1964502436, var42.field_o << 405078276, -this.field_E << 74410538, 4096);
                  lg.a(1);
                  this.field_K.d(var9 - (var42.field_n >> -787078303), var10 + -var42.field_o, 256);
                  return;
                }
              } else {
                L6: {
                  L7: {
                    this.field_N = (String) null;
                    super.a(param0, (byte) -110, param2, param3);
                    var6 = this.field_L.c((byte) 45);
                    var55 = (fi) ((Object) this.field_i);
                    var9 = param2 + this.field_r;
                    var10 = var55.a(param0, (byte) 50, (qm) (this)) + (var55.a((qm) (this), 1).a((byte) -90) >> 2599841);
                    if (var6 == ta.field_h) {
                      break L7;
                    } else {
                      if (ec.field_h == var6) {
                        break L7;
                      } else {
                        if (var6 == rk.field_c) {
                          var37 = ao.field_b[2];
                          var37.d(var9, -(var37.field_u >> -555861823) + var10, 256);
                          break L6;
                        } else {
                          if (ih.field_b == var6) {
                            var36 = ao.field_b[1];
                            var36.d(var9, -(var36.field_u >> 1038170945) + var10, 256);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      var38 = ao.field_b[0];
                      var11 = var38.field_n << 1349035009;
                      var12 = var38.field_o << 972466497;
                      if (this.field_K == null) {
                        break L9;
                      } else {
                        if (var11 > this.field_K.field_l) {
                          break L9;
                        } else {
                          if (var12 > this.field_K.field_u) {
                            break L9;
                          } else {
                            em.a((byte) 38, this.field_K);
                            kh.a();
                            break L8;
                          }
                        }
                      }
                    }
                    this.field_K = new dl(var11, var12);
                    em.a((byte) 38, this.field_K);
                    break L8;
                  }
                  var38.a(112, 144, var38.field_n << 1964502436, var38.field_o << 405078276, -this.field_E << 74410538, 4096);
                  lg.a(1);
                  this.field_K.d(var9 - (var38.field_n >> -787078303), var10 + -var38.field_o, 256);
                  break L6;
                }
                return;
              }
            }
          } else {
            L10: {
              var26 = vo.field_b;
              if (var26.equals(this.field_o)) {
                break L10;
              } else {
                this.field_o = var26;
                this.b(true);
                break L10;
              }
            }
            if (param1 <= -12) {
              L11: {
                super.a(param0, (byte) -110, param2, param3);
                var6 = this.field_L.c((byte) 45);
                var54 = (fi) ((Object) this.field_i);
                var9 = param2 + this.field_r;
                var10 = var54.a(param0, (byte) 50, (qm) (this)) + (var54.a((qm) (this), 1).a((byte) -90) >> 2599841);
                if (var6 == ta.field_h) {
                  break L11;
                } else {
                  if (ec.field_h == var6) {
                    break L11;
                  } else {
                    if (var6 != rk.field_c) {
                      if (ih.field_b != var6) {
                        return;
                      } else {
                        var32 = ao.field_b[1];
                        var32.d(var9, -(var32.field_u >> 1038170945) + var10, 256);
                        return;
                      }
                    } else {
                      var33 = ao.field_b[2];
                      var33.d(var9, -(var33.field_u >> -555861823) + var10, 256);
                      return;
                    }
                  }
                }
              }
              var34 = ao.field_b[0];
              var11 = var34.field_n << 1349035009;
              var12 = var34.field_o << 972466497;
              if (this.field_K != null) {
                if (var11 <= this.field_K.field_l) {
                  if (var12 > this.field_K.field_u) {
                    this.field_K = new dl(var11, var12);
                    em.a((byte) 38, this.field_K);
                    var34.a(112, 144, var34.field_n << 1964502436, var34.field_o << 405078276, -this.field_E << 74410538, 4096);
                    lg.a(1);
                    this.field_K.d(var9 - (var34.field_n >> -787078303), var10 + -var34.field_o, 256);
                    return;
                  } else {
                    em.a((byte) 38, this.field_K);
                    kh.a();
                    var34.a(112, 144, var34.field_n << 1964502436, var34.field_o << 405078276, -this.field_E << 74410538, 4096);
                    lg.a(1);
                    this.field_K.d(var9 - (var34.field_n >> -787078303), var10 + -var34.field_o, 256);
                    return;
                  }
                } else {
                  this.field_K = new dl(var11, var12);
                  em.a((byte) 38, this.field_K);
                  var34.a(112, 144, var34.field_n << 1964502436, var34.field_o << 405078276, -this.field_E << 74410538, 4096);
                  lg.a(1);
                  this.field_K.d(var9 - (var34.field_n >> -787078303), var10 + -var34.field_o, 256);
                  return;
                }
              } else {
                this.field_K = new dl(var11, var12);
                em.a((byte) 38, this.field_K);
                var34.a(112, 144, var34.field_n << 1964502436, var34.field_o << 405078276, -this.field_E << 74410538, 4096);
                lg.a(1);
                this.field_K.d(var9 - (var34.field_n >> -787078303), var10 + -var34.field_o, 256);
                return;
              }
            } else {
              L12: {
                L13: {
                  this.field_N = (String) null;
                  super.a(param0, (byte) -110, param2, param3);
                  var6 = this.field_L.c((byte) 45);
                  var53 = (fi) ((Object) this.field_i);
                  var9 = param2 + this.field_r;
                  var10 = var53.a(param0, (byte) 50, (qm) (this)) + (var53.a((qm) (this), 1).a((byte) -90) >> 2599841);
                  if (var6 == ta.field_h) {
                    break L13;
                  } else {
                    if (ec.field_h == var6) {
                      break L13;
                    } else {
                      if (var6 == rk.field_c) {
                        var29 = ao.field_b[2];
                        var29.d(var9, -(var29.field_u >> -555861823) + var10, 256);
                        break L12;
                      } else {
                        if (ih.field_b == var6) {
                          var28 = ao.field_b[1];
                          var28.d(var9, -(var28.field_u >> 1038170945) + var10, 256);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                }
                L14: {
                  L15: {
                    var30 = ao.field_b[0];
                    var11 = var30.field_n << 1349035009;
                    var12 = var30.field_o << 972466497;
                    if (this.field_K == null) {
                      break L15;
                    } else {
                      if (var11 > this.field_K.field_l) {
                        break L15;
                      } else {
                        if (var12 > this.field_K.field_u) {
                          break L15;
                        } else {
                          em.a((byte) 38, this.field_K);
                          kh.a();
                          break L14;
                        }
                      }
                    }
                  }
                  this.field_K = new dl(var11, var12);
                  em.a((byte) 38, this.field_K);
                  break L14;
                }
                var30.a(112, 144, var30.field_n << 1964502436, var30.field_o << 405078276, -this.field_E << 74410538, 4096);
                lg.a(1);
                this.field_K.d(var9 - (var30.field_n >> -787078303), var10 + -var30.field_o, 256);
                break L12;
              }
              return;
            }
          }
        } else {
          L16: {
            var17 = vo.field_b;
            if (var17.equals(this.field_o)) {
              break L16;
            } else {
              this.field_o = var17;
              this.b(true);
              break L16;
            }
          }
          if (param1 <= -12) {
            L17: {
              super.a(param0, (byte) -110, param2, param3);
              var6 = this.field_L.c((byte) 45);
              var52 = (fi) ((Object) this.field_i);
              var9 = param2 + this.field_r;
              var10 = var52.a(param0, (byte) 50, (qm) (this)) + (var52.a((qm) (this), 1).a((byte) -90) >> 2599841);
              if (var6 == ta.field_h) {
                break L17;
              } else {
                if (ec.field_h == var6) {
                  break L17;
                } else {
                  if (var6 != rk.field_c) {
                    if (ih.field_b != var6) {
                      return;
                    } else {
                      var23 = ao.field_b[1];
                      var23.d(var9, -(var23.field_u >> 1038170945) + var10, 256);
                      return;
                    }
                  } else {
                    var24 = ao.field_b[2];
                    var24.d(var9, -(var24.field_u >> -555861823) + var10, 256);
                    return;
                  }
                }
              }
            }
            var25 = ao.field_b[0];
            var11 = var25.field_n << 1349035009;
            var12 = var25.field_o << 972466497;
            if (this.field_K != null) {
              if (var11 <= this.field_K.field_l) {
                if (var12 <= this.field_K.field_u) {
                  em.a((byte) 38, this.field_K);
                  kh.a();
                  var25.a(112, 144, var25.field_n << 1964502436, var25.field_o << 405078276, -this.field_E << 74410538, 4096);
                  lg.a(1);
                  this.field_K.d(var9 - (var25.field_n >> -787078303), var10 + -var25.field_o, 256);
                  return;
                } else {
                  this.field_K = new dl(var11, var12);
                  em.a((byte) 38, this.field_K);
                  var25.a(112, 144, var25.field_n << 1964502436, var25.field_o << 405078276, -this.field_E << 74410538, 4096);
                  lg.a(1);
                  this.field_K.d(var9 - (var25.field_n >> -787078303), var10 + -var25.field_o, 256);
                  return;
                }
              } else {
                this.field_K = new dl(var11, var12);
                em.a((byte) 38, this.field_K);
                var25.a(112, 144, var25.field_n << 1964502436, var25.field_o << 405078276, -this.field_E << 74410538, 4096);
                lg.a(1);
                this.field_K.d(var9 - (var25.field_n >> -787078303), var10 + -var25.field_o, 256);
                return;
              }
            } else {
              this.field_K = new dl(var11, var12);
              em.a((byte) 38, this.field_K);
              var25.a(112, 144, var25.field_n << 1964502436, var25.field_o << 405078276, -this.field_E << 74410538, 4096);
              lg.a(1);
              this.field_K.d(var9 - (var25.field_n >> -787078303), var10 + -var25.field_o, 256);
              return;
            }
          } else {
            L18: {
              L19: {
                this.field_N = (String) null;
                super.a(param0, (byte) -110, param2, param3);
                var6 = this.field_L.c((byte) 45);
                var51 = (fi) ((Object) this.field_i);
                var9 = param2 + this.field_r;
                var10 = var51.a(param0, (byte) 50, (qm) (this)) + (var51.a((qm) (this), 1).a((byte) -90) >> 2599841);
                if (var6 == ta.field_h) {
                  break L19;
                } else {
                  if (ec.field_h == var6) {
                    break L19;
                  } else {
                    if (var6 == rk.field_c) {
                      var20 = ao.field_b[2];
                      var20.d(var9, -(var20.field_u >> -555861823) + var10, 256);
                      break L18;
                    } else {
                      if (ih.field_b == var6) {
                        var19 = ao.field_b[1];
                        var19.d(var9, -(var19.field_u >> 1038170945) + var10, 256);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
              }
              L20: {
                L21: {
                  var21 = ao.field_b[0];
                  var11 = var21.field_n << 1349035009;
                  var12 = var21.field_o << 972466497;
                  if (this.field_K == null) {
                    break L21;
                  } else {
                    if (var11 > this.field_K.field_l) {
                      break L21;
                    } else {
                      if (var12 > this.field_K.field_u) {
                        break L21;
                      } else {
                        em.a((byte) 38, this.field_K);
                        kh.a();
                        break L20;
                      }
                    }
                  }
                }
                this.field_K = new dl(var11, var12);
                em.a((byte) 38, this.field_K);
                break L20;
              }
              var21.a(112, 144, var21.field_n << 1964502436, var21.field_o << 405078276, -this.field_E << 74410538, 4096);
              lg.a(1);
              this.field_K.d(var9 - (var21.field_n >> -787078303), var10 + -var21.field_o, 256);
              break L18;
            }
            return;
          }
        }
    }

    final static dd a(int param0, int param1, int param2, un param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        dd var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        dd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = pg.a((byte) 112, param4, param0, param1, param3, param5);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new dd();
                if (param2 == 1038170945) {
                  break L1;
                } else {
                  field_M = (am) null;
                  break L1;
                }
              }
              var7.field_e = var8;
              var7.field_e.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, 0, param0, param4);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackIn_6_0 = (dd) (var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("io.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dd) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            int var5_int = 31 / ((-50 - param1) / 59);
            this.field_E = this.field_E + 1;
            super.a(param0, 72, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "io.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_P = new u();
        field_J = "This level is available as a taster of the '<%0>' section.";
        field_I = new String[]{"Over 50 more mind-bending puzzles", "Lasers and explosions", "Spiders to kill, balls to trap", "Make everything work together", "Picture levels, variety levels ...", "... and some truly zany levels!", "12 exacting two-player puzzles", "Kill each other ...", "... or work and die together!", "5 crazy three-player puzzles", "And you thought two was bad!", "25 frantic arcade levels", "Race and outrun the bombs!", "Spiders and balls take chase!", "Dodge balls for England!", "Start avalanches and chain reactions!", null, null, "<col=FF0000>WARNING: serious challenges ahead."};
    }
}
