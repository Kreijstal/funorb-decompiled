/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends qi {
    static af field_V;
    static volatile int field_bb;
    static int field_Z;
    private int field_cb;
    static int field_Y;
    private nb field_X;
    static ck field_U;
    private ck field_eb;
    static String[] field_db;
    private String field_ab;
    static String[] field_gb;
    static int field_fb;
    static String field_W;

    pa(nb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, vh.a(1424));
        try {
            this.field_ab = param1;
            this.field_X = param0;
            this.b(param5, param4, param2, param3, -16555);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        String var5 = null;
        tb var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ce var14 = null;
        ck var17 = null;
        Object var18 = null;
        ck var19 = null;
        ck var20 = null;
        ck var21 = null;
        Object var22 = null;
        nl var22_ref = null;
        ck var23 = null;
        ck var24 = null;
        ck var25 = null;
        Object var26 = null;
        ck var27 = null;
        ck var28 = null;
        ck var29 = null;
        ck var30 = null;
        ck var31 = null;
        ck var32 = null;
        nl var33 = null;
        nl var34 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var18 = null;
                var22 = null;
                var26 = null;
                var13 = client.field_A ? 1 : 0;
                var6 = this.field_X.a(20350);
                if (var6 == le.field_o) {
                  var5 = qi.field_T;
                  if (var13 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (jb.field_j != var6) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        var5 = qi.field_T;
                        if (var13 == 0) {
                          break L5;
                        } else {
                          var5 = this.field_X.b((byte) 107);
                          if (var5 == null) {
                            var5 = this.field_ab;
                            break L5;
                          } else {
                            if (var5.equals(this.field_E)) {
                              break L4;
                            } else {
                              this.field_E = var5;
                              this.a(2874);
                              break L4;
                            }
                          }
                        }
                      }
                      if (var5.equals(this.field_E)) {
                        break L4;
                      } else {
                        this.field_E = var5;
                        this.a(2874);
                        break L4;
                      }
                    }
                    L6: {
                      super.a(param0, -105, param2, param3);
                      var6 = this.field_X.a(20350);
                      var33 = (nl) ((Object) this.field_p);
                      var9 = this.field_u + param0;
                      if (param1 < -103) {
                        break L6;
                      } else {
                        var14 = (ce) null;
                        discarded$4 = this.a(true, (ce) null);
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        var10 = var33.a(param3, 0, (ce) (this)) + (var33.a((ce) (this), (byte) 44).b(-1) >> -492294047);
                        if (le.field_o == var6) {
                          break L8;
                        } else {
                          if (jb.field_j == var6) {
                            break L8;
                          } else {
                            L9: {
                              if (var6 != vm.field_u) {
                                break L9;
                              } else {
                                var19 = tl.field_u[2];
                                var19.f(var9, var10 - (var19.field_H >> 1308895041), 256);
                                if (var13 == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (var6 != dc.field_b) {
                              break L7;
                            } else {
                              var20 = tl.field_u[1];
                              var20.f(var9, var10 + -(var20.field_H >> -833126175), 256);
                              if (var13 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      L10: {
                        L11: {
                          var21 = tl.field_u[0];
                          var17 = var21;
                          var11 = var21.field_K << 519281857;
                          var12 = var21.field_C << 422930689;
                          if (this.field_eb == null) {
                            break L11;
                          } else {
                            if (var11 > this.field_eb.field_I) {
                              break L11;
                            } else {
                              if (var12 <= this.field_eb.field_H) {
                                tb.a(true, this.field_eb);
                                hk.b();
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        this.field_eb = new ck(var11, var12);
                        tb.a(true, this.field_eb);
                        if (var13 == 0) {
                          break L10;
                        } else {
                          tb.a(true, this.field_eb);
                          hk.b();
                          break L10;
                        }
                      }
                      var21.a(112, 144, var21.field_K << -1720750332, var21.field_C << 122544644, -this.field_cb << -138915254, 4096);
                      mk.a((byte) -5);
                      this.field_eb.f(var9 - (var21.field_K >> 476953697), var10 - var21.field_C, 256);
                      break L7;
                    }
                    return;
                  }
                }
              }
              var5 = this.field_X.b((byte) 107);
              if (var5 == null) {
                var5 = this.field_ab;
                break L2;
              } else {
                if (var5.equals(this.field_E)) {
                  break L0;
                } else {
                  this.field_E = var5;
                  this.a(2874);
                  super.a(param0, -105, param2, param3);
                  var6 = this.field_X.a(20350);
                  var22_ref = (nl) ((Object) this.field_p);
                  var9 = this.field_u + param0;
                  if (param1 < -103) {
                    break L1;
                  } else {
                    var14 = (ce) null;
                    discarded$5 = this.a(true, (ce) null);
                    break L1;
                  }
                }
              }
            }
            if (var5.equals(this.field_E)) {
              break L0;
            } else {
              this.field_E = var5;
              this.a(2874);
              super.a(param0, -105, param2, param3);
              var6 = this.field_X.a(20350);
              var22_ref = (nl) ((Object) this.field_p);
              var9 = this.field_u + param0;
              if (param1 < -103) {
                break L1;
              } else {
                var14 = (ce) null;
                discarded$6 = this.a(true, (ce) null);
                break L1;
              }
            }
          }
          var10 = var22_ref.a(param3, 0, (ce) (this)) + (var22_ref.a((ce) (this), (byte) 44).b(-1) >> -492294047);
          if (le.field_o != var6) {
            if (jb.field_j != var6) {
              L12: {
                if (var6 != vm.field_u) {
                  break L12;
                } else {
                  var23 = tl.field_u[2];
                  var23.f(var9, var10 - (var23.field_H >> 1308895041), 256);
                  if (var13 != 0) {
                    break L12;
                  } else {
                    return;
                  }
                }
              }
              if (var6 != dc.field_b) {
                return;
              } else {
                L13: {
                  var24 = tl.field_u[1];
                  var24.f(var9, var10 + -(var24.field_H >> -833126175), 256);
                  if (var13 == 0) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        var25 = tl.field_u[0];
                        var11 = var25.field_K << 519281857;
                        var12 = var25.field_C << 422930689;
                        if (this.field_eb == null) {
                          break L15;
                        } else {
                          if (var11 > this.field_eb.field_I) {
                            break L15;
                          } else {
                            if (var12 <= this.field_eb.field_H) {
                              tb.a(true, this.field_eb);
                              hk.b();
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      this.field_eb = new ck(var11, var12);
                      tb.a(true, this.field_eb);
                      if (var13 == 0) {
                        break L14;
                      } else {
                        tb.a(true, this.field_eb);
                        hk.b();
                        break L14;
                      }
                    }
                    var25.a(112, 144, var25.field_K << -1720750332, var25.field_C << 122544644, -this.field_cb << -138915254, 4096);
                    mk.a((byte) -5);
                    this.field_eb.f(var9 - (var25.field_K >> 476953697), var10 - var25.field_C, 256);
                    break L13;
                  }
                }
                return;
              }
            } else {
              L16: {
                L17: {
                  var25 = tl.field_u[0];
                  var11 = var25.field_K << 519281857;
                  var12 = var25.field_C << 422930689;
                  if (this.field_eb == null) {
                    break L17;
                  } else {
                    if (var11 > this.field_eb.field_I) {
                      break L17;
                    } else {
                      if (var12 <= this.field_eb.field_H) {
                        tb.a(true, this.field_eb);
                        hk.b();
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                this.field_eb = new ck(var11, var12);
                tb.a(true, this.field_eb);
                if (var13 == 0) {
                  break L16;
                } else {
                  tb.a(true, this.field_eb);
                  hk.b();
                  break L16;
                }
              }
              var25.a(112, 144, var25.field_K << -1720750332, var25.field_C << 122544644, -this.field_cb << -138915254, 4096);
              mk.a((byte) -5);
              this.field_eb.f(var9 - (var25.field_K >> 476953697), var10 - var25.field_C, 256);
              return;
            }
          } else {
            L18: {
              L19: {
                var25 = tl.field_u[0];
                var11 = var25.field_K << 519281857;
                var12 = var25.field_C << 422930689;
                if (this.field_eb == null) {
                  break L19;
                } else {
                  if (var11 > this.field_eb.field_I) {
                    break L19;
                  } else {
                    if (var12 <= this.field_eb.field_H) {
                      tb.a(true, this.field_eb);
                      hk.b();
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
              }
              this.field_eb = new ck(var11, var12);
              tb.a(true, this.field_eb);
              if (var13 == 0) {
                break L18;
              } else {
                tb.a(true, this.field_eb);
                hk.b();
                break L18;
              }
            }
            var25.a(112, 144, var25.field_K << -1720750332, var25.field_C << 122544644, -this.field_cb << -138915254, 4096);
            mk.a((byte) -5);
            this.field_eb.f(var9 - (var25.field_K >> 476953697), var10 - var25.field_C, 256);
            return;
          }
        }
        super.a(param0, -105, param2, param3);
        var6 = this.field_X.a(20350);
        var34 = (nl) ((Object) this.field_p);
        var9 = this.field_u + param0;
        if (param1 < -103) {
          L20: {
            var10 = var34.a(param3, 0, (ce) (this)) + (var34.a((ce) (this), (byte) 44).b(-1) >> -492294047);
            if (le.field_o == var6) {
              break L20;
            } else {
              if (jb.field_j == var6) {
                break L20;
              } else {
                L21: {
                  if (var6 != vm.field_u) {
                    break L21;
                  } else {
                    var30 = tl.field_u[2];
                    var30.f(var9, var10 - (var30.field_H >> 1308895041), 256);
                    if (var13 != 0) {
                      break L21;
                    } else {
                      return;
                    }
                  }
                }
                if (var6 == dc.field_b) {
                  var31 = tl.field_u[1];
                  var31.f(var9, var10 + -(var31.field_H >> -833126175), 256);
                  if (var13 != 0) {
                    break L20;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          L22: {
            var32 = tl.field_u[0];
            var11 = var32.field_K << 519281857;
            var12 = var32.field_C << 422930689;
            if (this.field_eb == null) {
              break L22;
            } else {
              if (var11 > this.field_eb.field_I) {
                break L22;
              } else {
                if (var12 > this.field_eb.field_H) {
                  this.field_eb = new ck(var11, var12);
                  tb.a(true, this.field_eb);
                  if (var13 == 0) {
                    var32.a(112, 144, var32.field_K << -1720750332, var32.field_C << 122544644, -this.field_cb << -138915254, 4096);
                    mk.a((byte) -5);
                    this.field_eb.f(var9 - (var32.field_K >> 476953697), var10 - var32.field_C, 256);
                    return;
                  } else {
                    tb.a(true, this.field_eb);
                    hk.b();
                    var32.a(112, 144, var32.field_K << -1720750332, var32.field_C << 122544644, -this.field_cb << -138915254, 4096);
                    mk.a((byte) -5);
                    this.field_eb.f(var9 - (var32.field_K >> 476953697), var10 - var32.field_C, 256);
                    return;
                  }
                } else {
                  tb.a(true, this.field_eb);
                  hk.b();
                  var32.a(112, 144, var32.field_K << -1720750332, var32.field_C << 122544644, -this.field_cb << -138915254, 4096);
                  mk.a((byte) -5);
                  this.field_eb.f(var9 - (var32.field_K >> 476953697), var10 - var32.field_C, 256);
                  return;
                }
              }
            }
          }
          this.field_eb = new ck(var11, var12);
          tb.a(true, this.field_eb);
          if (var13 != 0) {
            tb.a(true, this.field_eb);
            hk.b();
            var32.a(112, 144, var32.field_K << -1720750332, var32.field_C << 122544644, -this.field_cb << -138915254, 4096);
            mk.a((byte) -5);
            this.field_eb.f(var9 - (var32.field_K >> 476953697), var10 - var32.field_C, 256);
            return;
          } else {
            var32.a(112, 144, var32.field_K << -1720750332, var32.field_C << 122544644, -this.field_cb << -138915254, 4096);
            mk.a((byte) -5);
            this.field_eb.f(var9 - (var32.field_K >> 476953697), var10 - var32.field_C, 256);
            return;
          }
        } else {
          L23: {
            var14 = (ce) null;
            discarded$7 = this.a(true, (ce) null);
            var10 = var34.a(param3, 0, (ce) (this)) + (var34.a((ce) (this), (byte) 44).b(-1) >> -492294047);
            if (le.field_o == var6) {
              break L23;
            } else {
              if (jb.field_j == var6) {
                break L23;
              } else {
                L24: {
                  if (var6 != vm.field_u) {
                    break L24;
                  } else {
                    var27 = tl.field_u[2];
                    var27.f(var9, var10 - (var27.field_H >> 1308895041), 256);
                    if (var13 != 0) {
                      break L24;
                    } else {
                      return;
                    }
                  }
                }
                if (var6 == dc.field_b) {
                  var28 = tl.field_u[1];
                  var28.f(var9, var10 + -(var28.field_H >> -833126175), 256);
                  if (var13 != 0) {
                    break L23;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          L25: {
            var29 = tl.field_u[0];
            var17 = var29;
            var11 = var29.field_K << 519281857;
            var12 = var29.field_C << 422930689;
            if (this.field_eb == null) {
              break L25;
            } else {
              if (var11 > this.field_eb.field_I) {
                break L25;
              } else {
                if (var12 > this.field_eb.field_H) {
                  L26: {
                    this.field_eb = new ck(var11, var12);
                    tb.a(true, this.field_eb);
                    if (var13 == 0) {
                      break L26;
                    } else {
                      tb.a(true, this.field_eb);
                      hk.b();
                      break L26;
                    }
                  }
                  var29.a(112, 144, var29.field_K << -1720750332, var29.field_C << 122544644, -this.field_cb << -138915254, 4096);
                  mk.a((byte) -5);
                  this.field_eb.f(var9 - (var29.field_K >> 476953697), var10 - var29.field_C, 256);
                  return;
                } else {
                  tb.a(true, this.field_eb);
                  hk.b();
                  var29.a(112, 144, var29.field_K << -1720750332, var29.field_C << 122544644, -this.field_cb << -138915254, 4096);
                  mk.a((byte) -5);
                  this.field_eb.f(var9 - (var29.field_K >> 476953697), var10 - var29.field_C, 256);
                  return;
                }
              }
            }
          }
          this.field_eb = new ck(var11, var12);
          tb.a(true, this.field_eb);
          if (var13 != 0) {
            tb.a(true, this.field_eb);
            hk.b();
            var29.a(112, 144, var29.field_K << -1720750332, var29.field_C << 122544644, -this.field_cb << -138915254, 4096);
            mk.a((byte) -5);
            this.field_eb.f(var9 - (var29.field_K >> 476953697), var10 - var29.field_C, 256);
            return;
          } else {
            var29.a(112, 144, var29.field_K << -1720750332, var29.field_C << 122544644, -this.field_cb << -138915254, 4096);
            mk.a((byte) -5);
            this.field_eb.f(var9 - (var29.field_K >> 476953697), var10 - var29.field_C, 256);
            return;
          }
        }
    }

    public static void h(byte param0) {
        field_U = null;
        field_db = null;
        field_gb = null;
        if (param0 <= 19) {
          field_bb = -63;
          field_V = null;
          field_W = null;
          return;
        } else {
          field_V = null;
          field_W = null;
          return;
        }
    }

    final static int b(int param0, int param1) {
        if (-5 >= (param0 ^ -1)) {
          if (param1 <= 45) {
            field_W = (String) null;
            return 400 - -(50 * (-2 + param0) * (param0 + -3));
          } else {
            return 400 - -(50 * (-2 + param0) * (param0 + -3));
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("pa.EC(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final String c(byte param0) {
        if (param0 == 113) {
            return null;
        }
        ce var3 = (ce) null;
        this.a((ce) null, -51, 86, -72);
        return null;
    }

    final static void g(byte param0) {
        int var1 = (-640 + wj.field_Lb) / 2;
        int var2 = dl.field_M * dl.field_M;
        int var3 = var2 - lg.field_W * lg.field_W;
        int var4 = 50 / ((param0 - 51) / 46);
        g.field_R.a(199, 0, 90, -90 + (-120 + hk.field_i) + -4, -(var3 * 199 / var2) + var1);
        wm.field_h.a(438, 0, 0, -4 + (hk.field_i + -120), 202 + (var1 - -(438 * var3 / var2)));
    }

    final void a(ce param0, int param1, int param2, int param3) {
        try {
            this.field_cb = this.field_cb + 1;
            if (param1 <= 38) {
                field_gb = (String[]) null;
            }
            super.a(param0, 109, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_bb = 0;
        field_Z = -1;
        field_V = new af();
        field_gb = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_W = "Eight-bit";
    }
}
