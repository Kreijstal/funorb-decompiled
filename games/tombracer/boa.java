/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class boa extends dg {
    private int field_m;
    static pl field_s;
    static long field_t;
    private fla field_w;
    private int field_v;
    static int[] field_n;
    private fla field_r;
    private fla field_q;
    private fla field_x;
    private fla field_u;
    static float[] field_y;
    private int field_p;
    static int field_o;

    final void a(int param0, la param1, kh param2) {
        try {
            if (param0 <= 119) {
                boa.a(false);
            }
            super.a(122, param1, param2);
            this.field_v = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "boa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        super.a((byte) 97, param1);
        this.a(28).b(false).a(this.field_h.e(9648), this.field_h.g((byte) 115), (byte) 46, this.field_h.d(3));
        w var5 = (w) ((Object) this.a(30).field_G);
        if (var5 == null) {
            return;
        }
        int var4 = -67 / ((7 - param0) / 36);
        if (-1 == (this.field_v ^ -1)) {
            var5.a(new fm(3, this.b((byte) -118), this.c((byte) 95), this.e((byte) -89)), -58);
        } else {
            var5.a(new fm(2, this.b((byte) -122), this.c((byte) 109), this.e((byte) -97)), -58);
        }
        if (null != this.field_r) {
            this.field_r.a(-98, var5);
            this.field_r = null;
        }
        if (!(this.field_q == null)) {
            this.field_q.a(-111, var5);
            this.field_q = null;
        }
        if (null != this.field_x) {
            this.field_x.a(27, var5);
            this.field_x = null;
        }
    }

    final void a(int param0, uw param1) {
        w var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            super.a(-61, param1);
            var3 = (w) ((Object) this.a(21).field_G);
            if (var3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_r == null) {
                  break L1;
                } else {
                  this.field_r.a(50, var3);
                  this.field_r = null;
                  break L1;
                }
              }
              if (param0 < -39) {
                L2: {
                  if (null != this.field_q) {
                    this.field_q.a(-89, var3);
                    this.field_q = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_x == null) {
                    break L3;
                  } else {
                    this.field_x.a(117, var3);
                    this.field_x = null;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("boa.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (param2 instanceof mra) {
                this.field_v = 8;
                break L1;
              } else {
                L2: {
                  if (4194304 != param0.c(-92)) {
                    break L2;
                  } else {
                    if ((param0.a((byte) 55) ^ -1) != -4194305) {
                      break L2;
                    } else {
                      this.field_v = 10;
                      break L1;
                    }
                  }
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("boa.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param0 <= 104) {
            field_o = 62;
        }
        this.field_v = param1;
    }

    boa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_m = 1;
        this.field_p = 1;
    }

    private final boolean i(int param0) {
        int stackIn_14_0 = 0;
        kh var3;
        L0: {
          if (param0 == 77) {
            break L0;
          } else {
            var3 = (kh) null;
            this.a(42, (la) null, (kh) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_v ^ -1) == -6) {
              break L2;
            } else {
              if (8 == this.field_v) {
                break L2;
              } else {
                if (-11 == (this.field_v ^ -1)) {
                  break L2;
                } else {
                  if ((this.field_v ^ -1) == -12) {
                    break L2;
                  } else {
                    if (-13 == (this.field_v ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_v == 13) {
                        break L2;
                      } else {
                        if ((this.field_v ^ -1) == -15) {
                          break L2;
                        } else {
                          if (-16 == (this.field_v ^ -1)) {
                            break L2;
                          } else {
                            if (-17 != (this.field_v ^ -1)) {
                              stackIn_14_0 = 0;
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackIn_14_0 = 1;
          break L1;
        }
        return stackIn_14_0 != 0;
    }

    public static void a(boolean param0) {
        field_y = null;
        if (param0) {
            return;
        }
        field_s = null;
        field_n = null;
    }

    final void d(int param0) {
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        fsa var3;
        int var4;
        int var7_int;
        nv var7;
        nv var8_ref_nv;
        int var8;
        pc var9;
        int var10;
        w var11;
        vna var12;
        uja var13;
        vna var14;
        uja var15;
        vna var16;
        uja var17;
        var10 = TombRacer.field_G ? 1 : 0;
        var11 = (w) ((Object) this.a(111).field_G);
        if (var11 != null) {
          L0: {
            L1: {
              L2: {
                var3 = (fsa) ((Object) this.field_h);
                var4 = var3.d(50, false) ? 1 : 0;
                if (this.field_r == null) {
                  break L2;
                } else {
                  if (this.field_r.l((byte) -116)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4 == 0) {
                break L1;
              } else {
                if (!this.i(param0 ^ -78)) {
                  if (-10 == (this.field_v ^ -1)) {
                    this.field_r = var11.a(new fm(4, this.b((byte) -112), this.c((byte) 92), this.e((byte) -87)), -58);
                    break L0;
                  } else {
                    this.field_r = var11.a(new fm(1, this.b((byte) 39), this.c((byte) 92), this.e((byte) -109)), -58);
                    break L0;
                  }
                } else {
                  this.field_r = var11.a(new fm(0, this.b((byte) -113), this.c((byte) 118), this.e((byte) -114)), -58);
                  break L0;
                }
              }
            }
            if (null == this.field_r) {
              break L0;
            } else {
              if (var4 == 0) {
                this.field_r.a(-96, var11);
                this.field_r = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L3: {
            if (11 == this.field_v) {
              var12 = var3.field_u;
              var13 = new uja(var12);
              var7_int = 0;
              var8_ref_nv = (nv) ((Object) var13.a(true));
              L4: while (true) {
                if (var8_ref_nv == null) {
                  L5: {
                    L6: {
                      if (var7_int == 0) {
                        break L6;
                      } else {
                        L7: {
                          if (this.field_x == null) {
                            break L7;
                          } else {
                            if (this.field_x.l((byte) -100)) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.field_x = var11.a(new fm(5, this.b((byte) -97), this.c((byte) 107), this.e((byte) -107)), -58);
                        break L5;
                      }
                    }
                    if (var7_int != 0) {
                      break L5;
                    } else {
                      if (null != this.field_x) {
                        var11.a(new fm(6, this.b((byte) 117), this.c((byte) 108), this.e((byte) -116)), -58);
                        this.field_x.a(81, var11);
                        this.field_x = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (null == this.field_x) {
                    break L3;
                  } else {
                    this.field_x.a(this.b((byte) -114), var11.field_c, -128, var11.field_h, this.c((byte) 105));
                    break L3;
                  }
                } else {
                  L8: {
                    if (var8_ref_nv instanceof ska) {
                      var7_int = var7_int != 0 | ((ska) ((Object) var8_ref_nv)).g((byte) -68) ? 1 : 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var8_ref_nv = (nv) ((Object) var13.a(-1));
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          L9: {
            if (16 != this.field_v) {
              break L9;
            } else {
              var14 = var3.field_u;
              var15 = new uja(var14);
              var7 = (nv) ((Object) var15.a(true));
              L10: while (true) {
                if (var7 == null) {
                  break L9;
                } else {
                  L11: {
                    if (!(var7 instanceof ov)) {
                      break L11;
                    } else {
                      if (((ov) ((Object) var7)).b(-98)) {
                        var8 = 1;
                        var9 = ((ov) ((Object) var7)).c(param0 ^ -105);
                        L12: while (true) {
                          L13: {
                            if (var9.field_h == null) {
                              break L13;
                            } else {
                              if (4 <= var8) {
                                break L13;
                              } else {
                                var9 = var9.field_h;
                                var8++;
                                continue L12;
                              }
                            }
                          }
                          L14: {
                            if (this.field_w == null) {
                              break L14;
                            } else {
                              if (var8 != this.field_m) {
                                break L14;
                              } else {
                                if (!this.field_w.l((byte) 91)) {
                                  break L14;
                                } else {
                                  var7 = (nv) ((Object) var15.a(-1));
                                  continue L10;
                                }
                              }
                            }
                          }
                          L15: {
                            if (this.field_m < var8) {
                              var11.a(-92, new fm(var8 - 2 + 34, this.b((byte) 30), this.c((byte) 105), this.e((byte) -105)));
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            this.field_m = var8;
                            if (null != this.field_w) {
                              this.field_w.a(-119, var11);
                              this.field_w = null;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          this.field_w = var11.a(new fm(29 - -this.field_m - 1, this.b((byte) -80), this.c((byte) 109), this.e((byte) -97)), -58);
                          break L11;
                        }
                      } else {
                        if (null == this.field_w) {
                          break L11;
                        } else {
                          this.field_w.a(-94, var11);
                          this.field_w = null;
                          var7 = (nv) ((Object) var15.a(-1));
                          continue L10;
                        }
                      }
                    }
                  }
                  var7 = (nv) ((Object) var15.a(-1));
                  continue L10;
                }
              }
            }
          }
          L17: {
            if (this.field_v != 15) {
              break L17;
            } else {
              var16 = var3.field_u;
              var17 = new uja(var16);
              var7 = (nv) ((Object) var17.a(true));
              L18: while (true) {
                if (var7 == null) {
                  break L17;
                } else {
                  if (var7 instanceof ov) {
                    if (((ov) ((Object) var7)).b(-19)) {
                      var8 = 1;
                      var9 = ((ov) ((Object) var7)).c(param0 ^ -110);
                      L19: while (true) {
                        L20: {
                          if (var9.field_h == null) {
                            break L20;
                          } else {
                            if (var8 >= 4) {
                              break L20;
                            } else {
                              var9 = var9.field_h;
                              var8++;
                              continue L19;
                            }
                          }
                        }
                        L21: {
                          L22: {
                            if (null == this.field_u) {
                              break L22;
                            } else {
                              if (var8 != this.field_p) {
                                break L22;
                              } else {
                                if (this.field_u.l((byte) -90)) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          stackIn_75_0 = var8 ^ -1;
                          stackIn_75_1 = this.field_p ^ -1;
                          L23: {
                            if (stackIn_75_0 < stackIn_75_1) {
                              var11.a(-104, new fm(var8 + -2 + 44, this.b((byte) -85), this.c((byte) 125), this.e((byte) -117)));
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            this.field_p = var8;
                            if (this.field_u != null) {
                              this.field_u.a(-123, var11);
                              this.field_u = null;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          this.field_u = var11.a(new fm(39 - -this.field_p + -1, this.b((byte) 87), this.c((byte) 127), this.e((byte) -111)), -58);
                          break L21;
                        }
                        var7 = (nv) ((Object) var17.a(-1));
                        continue L18;
                      }
                    } else {
                      if (this.field_u != null) {
                        this.field_u.a(param0 + -100, var11);
                        this.field_u = null;
                        var7 = (nv) ((Object) var17.a(-1));
                        continue L18;
                      } else {
                        var7 = (nv) ((Object) var17.a(-1));
                        continue L18;
                      }
                    }
                  } else {
                    var7 = (nv) ((Object) var17.a(-1));
                    continue L18;
                  }
                }
              }
            }
          }
          L25: {
            L26: {
              if (!var3.j(param0)) {
                break L26;
              } else {
                if (null != this.field_q) {
                  break L26;
                } else {
                  this.field_q = var11.a(new fm(7, this.b((byte) 122), this.c((byte) 92), this.e((byte) -99)), param0 ^ 57);
                  break L25;
                }
              }
            }
            if (var3.j(-1)) {
              break L25;
            } else {
              if (null != this.field_q) {
                this.field_q.a(66, var11);
                this.field_q = null;
                break L25;
              } else {
                break L25;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -100, param1);
            param1.a((byte) 42, this.field_v, 4);
            int var3_int = 108 / ((param0 - -8) / 40);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "boa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        super.h(106);
        if (param0 <= 0) {
            field_n = (int[]) null;
        }
    }

    boa(int param0) {
        super(param0);
        this.field_m = 1;
        this.field_p = 1;
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "boa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 38 % ((param4 - -38) / 47);
              var7 = 0;
              var8 = null;
              var9 = this.field_v;
              if (var9 == 0) {
                var8 = df.field_J[4];
                break L1;
              } else {
                if (1 == var9) {
                  var8 = df.field_J[5];
                  break L1;
                } else {
                  if (var9 == 2) {
                    var8 = df.field_J[7];
                    break L1;
                  } else {
                    if (-4 == (var9 ^ -1)) {
                      var8 = df.field_J[9];
                      var7 = 4096;
                      break L1;
                    } else {
                      if (var9 == 4) {
                        var8 = df.field_J[8];
                        break L1;
                      } else {
                        if ((var9 ^ -1) != -6) {
                          if ((var9 ^ -1) == -9) {
                            var8 = df.field_J[6];
                            break L1;
                          } else {
                            if (9 == var9) {
                              var7 = 2048;
                              var8 = df.field_J[27];
                              break L1;
                            } else {
                              if ((var9 ^ -1) != -11) {
                                if ((var9 ^ -1) != -13) {
                                  if (var9 != 11) {
                                    if (-14 != (var9 ^ -1)) {
                                      if (-15 != (var9 ^ -1)) {
                                        if (-16 == (var9 ^ -1)) {
                                          var8 = df.field_J[15];
                                          break L1;
                                        } else {
                                          if (16 == var9) {
                                            var8 = df.field_J[16];
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      } else {
                                        var8 = df.field_J[14];
                                        break L1;
                                      }
                                    } else {
                                      var8 = df.field_J[13];
                                      break L1;
                                    }
                                  } else {
                                    var8 = df.field_J[11];
                                    break L1;
                                  }
                                } else {
                                  var8 = df.field_J[12];
                                  break L1;
                                }
                              } else {
                                var8 = df.field_J[70];
                                break L1;
                              }
                            }
                          }
                        } else {
                          L2: {
                            var9 = 77;
                            if (this.field_g < 33) {
                              var9 = 77;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          L3: {
                            if ((this.field_g ^ -1) > -67) {
                              var9 = 78;
                              break L3;
                            } else {
                              var9 = 79;
                              break L3;
                            }
                          }
                          var8 = df.field_J[var9];
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (var8 == null) {
                break L4;
              } else {
                var9 = dfa.a(4096 + (var7 - this.field_h.g(-25787)) >> 2111911170, 2048, -28);
                gqa.a(var9, -83584144, param1, param2, (ka) (var8), param3);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var6);

            stackIn_49_1 = new StringBuilder().append("boa.D(");

            if (param0 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L5;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_t = 0L;
        field_y = new float[4];
        field_s = new pl(3);
        field_o = 0;
    }
}
