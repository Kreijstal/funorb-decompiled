/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends dg {
    static String field_w;
    private int field_s;
    private lpa field_m;
    private int field_q;
    private boolean field_p;
    private static String[] field_n;
    private int field_x;
    private fla field_t;
    static boolean field_B;
    static int[][] field_A;
    private eh[][] field_r;
    private fla field_v;
    private int field_u;
    private fla field_o;
    private int field_y;
    private int field_z;

    final int k(int param0) {
        if (param0 != -13019) {
            ce.l(-70);
        }
        return this.field_u;
    }

    final void b(int param0, uw param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_r != null) {
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            L2: {
              super.b(param0, param1);
              if (this.field_r != null) {
                var3_int = 0;
                L3: while (true) {
                  if (this.field_z <= var3_int) {
                    break L2;
                  } else {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= this.field_s) {
                        var3_int++;
                        continue L3;
                      } else {
                        this.field_r[var3_int][var4].a(55);
                        var4++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ce.WA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final int n(byte param0) {
        if (param0 != 87) {
            return -127;
        }
        return this.field_q;
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
            if (this.field_k instanceof lpa) {
                this.field_m = (lpa) ((Object) this.field_k);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (!(param2 instanceof im)) {
                break L1;
              } else {
                this.field_q = 1;
                break L1;
              }
            }
            L2: {
              if (!param0.b(true)) {
                break L2;
              } else {
                this.field_q = 3;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ce.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
    }

    public static void l(int param0) {
        field_w = null;
        field_n = null;
        if (param0 != 30389) {
            field_n = (String[]) null;
        }
        field_A = (int[][]) null;
    }

    ce(int param0) {
        super(param0);
        this.field_p = false;
        this.field_t = null;
        this.field_o = null;
        this.field_v = null;
    }

    private final void a(boolean param0) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        eh var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        la var17;
        L0: {
          L1: {
            var16 = TombRacer.field_G ? 1 : 0;
            var17 = this.a(18);
            var3 = this.field_h.d(3);
            var4 = this.field_h.e(9648);
            this.field_z = this.field_h.c(-84) / 2097152;
            this.field_s = this.field_h.a((byte) 55) / 2097152;
            if (1 >= this.field_z) {
              break L1;
            } else {
              if (-2 <= (this.field_s ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          if (this.field_q == 2) {
            this.field_q = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (this.p((byte) 77)) {
          L2: {
            this.field_r = new eh[this.field_z][this.field_s];
            var5 = 1048576 + (-(this.field_h.a((byte) 55) / 2) + var4);
            if (param0) {
              break L2;
            } else {
              this.field_o = (fla) null;
              break L2;
            }
          }
          var6 = 0;
          L3: while (true) {
            if (this.field_s <= var6) {
              return;
            } else {
              var7 = -(this.field_h.c(-117) / 2) + (var3 + 1048576);
              var8 = 0;
              L4: while (true) {
                if (this.field_z <= var8) {
                  var5 = var5 + 2097152;
                  var6++;
                  continue L3;
                } else {
                  L5: {
                    var9 = new eh();
                    this.field_r[var8][var6] = var9;
                    if (0 != this.field_q) {
                      L6: {
                        if (var8 <= 0) {
                          stackIn_19_0 = 0;
                          break L6;
                        } else {
                          stackIn_19_0 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        var10 = stackIn_19_0;
                        if (var8 >= -1 + this.field_z) {
                          stackIn_22_0 = 0;
                          break L7;
                        } else {
                          stackIn_22_0 = 1;
                          break L7;
                        }
                      }
                      L8: {
                        var11 = stackIn_22_0;
                        if ((var6 ^ -1) >= -1) {
                          stackIn_25_0 = 0;
                          break L8;
                        } else {
                          stackIn_25_0 = 1;
                          break L8;
                        }
                      }
                      L9: {
                        var12 = stackIn_25_0;
                        if (this.field_s - 1 <= var6) {
                          stackIn_28_0 = 0;
                          break L9;
                        } else {
                          stackIn_28_0 = 1;
                          break L9;
                        }
                      }
                      L10: {
                        var13 = stackIn_28_0;
                        var14 = 0;
                        if (var10 == 0) {
                          break L10;
                        } else {
                          var14++;
                          break L10;
                        }
                      }
                      L11: {
                        if (var11 != 0) {
                          var14++;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (var12 != 0) {
                          var14++;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (var13 != 0) {
                          var14++;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var15 = 0;
                        if ((var14 ^ -1) == -5) {
                          var9.field_h = 2;
                          break L14;
                        } else {
                          if ((var14 ^ -1) != -4) {
                            if (2 == var14) {
                              L15: {
                                var9.field_h = 1;
                                if (var10 != 0) {
                                  break L15;
                                } else {
                                  if (var12 == 0) {
                                    var15 = 512;
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (var10 != 0) {
                                  break L16;
                                } else {
                                  if (var13 != 0) {
                                    break L16;
                                  } else {
                                    var15 = 0;
                                    break L14;
                                  }
                                }
                              }
                              L17: {
                                if (var11 != 0) {
                                  break L17;
                                } else {
                                  if (var12 == 0) {
                                    var15 = 1024;
                                    break L14;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              if (var11 != 0) {
                                break L14;
                              } else {
                                if (var13 == 0) {
                                  var15 = -512;
                                  break L14;
                                } else {
                                  var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                                  var9.field_e = (ce) (this);
                                  var9.field_b = var17.e(true).a(100, 0);
                                  var9.field_c = var5 + -var4;
                                  var9.field_d = -var3 + var7;
                                  var9.field_f = this.a(var9, 2);
                                  var7 = var7 + 2097152;
                                  var8++;
                                  continue L4;
                                }
                              }
                            } else {
                              var9.field_h = 2;
                              break L14;
                            }
                          } else {
                            if (var12 != 0) {
                              L18: {
                                if (var13 == 0) {
                                  var15 = 0;
                                  break L18;
                                } else {
                                  if (var11 != 0) {
                                    var15 = 512;
                                    break L18;
                                  } else {
                                    var15 = -512;
                                    var9.field_h = 0;
                                    break L14;
                                  }
                                }
                              }
                              var9.field_h = 0;
                              break L14;
                            } else {
                              var15 = 1024;
                              var9.field_h = 0;
                              break L14;
                            }
                          }
                        }
                      }
                      var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                      break L5;
                    } else {
                      var9.field_a = 512;
                      break L5;
                    }
                  }
                  var9.field_e = (ce) (this);
                  var9.field_b = var17.e(true).a(100, 0);
                  var9.field_c = var5 + -var4;
                  var9.field_d = -var3 + var7;
                  var9.field_f = this.a(var9, 2);
                  var7 = var7 + 2097152;
                  var8++;
                  continue L4;
                }
              }
            }
          }
        } else {
          this.o((byte) 95);
          return;
        }
    }

    final int i(int param0) {
        if (param0 != 1024) {
            return 21;
        }
        return this.field_x;
    }

    final void a(byte param0, int param1) {
        super.a((byte) 92, param1);
        w var3 = (w) ((Object) this.a(29).field_G);
        int var4 = -57 % ((7 - param0) / 36);
        if (!(var3 != null)) {
            return;
        }
        var3.a(new fm(3, this.b((byte) -93), this.c((byte) 115), this.e((byte) -89)), -58);
        if (this.field_t != null) {
            this.field_t.a(-120, var3);
            this.field_t = null;
        }
        if (null != this.field_o) {
            this.field_o.a(-100, var3);
            this.field_o = null;
        }
    }

    final void d(int param0) {
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int var2;
        int var3;
        int var4_int;
        w var4;
        int var5_int;
        fsa var5;
        int var6;
        int var7;
        int var8;
        double var9;
        double var11;
        double var13;
        vna var15;
        uja var16;
        int var17;
        Object var18;
        wda var18_ref;
        int var19;
        L0: {
          var18 = null;
          var19 = TombRacer.field_G ? 1 : 0;
          super.d(-1);
          var2 = 0;
          var3 = 0;
          if (this.field_m != null) {
            if (!this.field_m.d(false)) {
              break L0;
            } else {
              this.field_u = -131072 + uca.field_c.a(262144, param0 ^ -1);
              this.field_x = uca.field_c.a(262144, param0 + 1) + -131072;
              var2 = 1;
              if (this.field_m.g((byte) 120)) {
                var2 = 0;
                var4_int = 0;
                L1: while (true) {
                  if (this.field_z <= var4_int) {
                    var3 = 1;
                    break L0;
                  } else {
                    var5_int = 0;
                    L2: while (true) {
                      if (this.field_s <= var5_int) {
                        var4_int++;
                        continue L1;
                      } else {
                        this.field_r[var4_int][var5_int].field_g.a(0);
                        var5_int++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var4 = (w) ((Object) this.a(94).field_G);
        if (var4 == null) {
          return;
        } else {
          L3: {
            if (param0 == -1) {
              break L3;
            } else {
              this.field_t = (fla) null;
              break L3;
            }
          }
          L4: {
            var5 = (fsa) ((Object) this.field_h);
            var6 = 1;
            var7 = this.b((byte) 84) - var4.field_h >> -934761200;
            var8 = this.c((byte) 126) + -var4.field_c >> -1940922704;
            var9 = (double)ua.a(var7, -118);
            var11 = (double)ua.a(var8, -125);
            var13 = Math.sqrt(var11 * var11 + var9 * var9);
            if (768.0 <= var13) {
              var6 = 0;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (1 != this.field_q) {
              L6: {
                if (var2 != 0) {
                  if (this.field_t == null) {
                    this.field_t = var4.a(new fm(19, this.b((byte) 84), this.c((byte) 123), this.e((byte) -118)), param0 ^ 57);
                    break L6;
                  } else {
                    if (var2 != 0) {
                      break L6;
                    } else {
                      if (null == this.field_t) {
                        break L6;
                      } else {
                        this.field_t.a(param0 + -117, var4);
                        this.field_t = null;
                        break L6;
                      }
                    }
                  }
                } else {
                  if (null == this.field_t) {
                    break L6;
                  } else {
                    this.field_t.a(param0 + -117, var4);
                    this.field_t = null;
                    break L6;
                  }
                }
              }
              L7: {
                if (var3 == 0) {
                  break L7;
                } else {
                  if (!this.field_p) {
                    var4.a(new fm(7, this.b((byte) -109), this.c((byte) 125), this.e((byte) -115)), param0 ^ 57);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                stackIn_43_0 = this;

                if (var3 == 0) {
                  stackIn_44_0 = this;
                  stackIn_44_1 = 0;
                  break L8;
                } else {
                  stackIn_44_0 = this;
                  stackIn_44_1 = 1;
                  break L8;
                }
              }
              ((ce) (this)).field_p = stackIn_44_1 != 0;
              var15 = var5.field_B;
              var16 = new uja(var15);
              var17 = 0;
              var18_ref = (wda) ((Object) var16.a(true));
              L9: while (true) {
                if (var18_ref == null) {
                  if (var17 != 0) {
                    break L5;
                  } else {
                    if (this.field_v == null) {
                      break L5;
                    } else {
                      this.field_v.a(param0 + 15, var4);
                      this.field_v = null;
                      break L5;
                    }
                  }
                } else {
                  L10: {
                    if (!(var18_ref instanceof ro)) {
                      break L10;
                    } else {
                      L11: {
                        if (((ro) ((Object) var18_ref)).d(false) != this.field_y) {
                          var4.a(new fm(20, this.b((byte) 39), this.c((byte) 109), this.e((byte) -116)), -58);
                          this.field_y = ((ro) ((Object) var18_ref)).d(false);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if (!var18_ref.a(-58)) {
                        break L10;
                      } else {
                        if (-1 == (this.field_y ^ -1)) {
                          L12: {
                            L13: {
                              if (((ro) ((Object) var18_ref)).e(69) != 4096) {
                                break L13;
                              } else {
                                if (this.field_v != null) {
                                  break L13;
                                } else {
                                  this.field_v = var4.a(new fm(21, this.b((byte) 114), this.c((byte) 94), this.e((byte) -124)), -58);
                                  break L12;
                                }
                              }
                            }
                            if (-327681 != (((ro) ((Object) var18_ref)).e(114) ^ -1)) {
                              break L12;
                            } else {
                              if (null == this.field_v) {
                                this.field_v = var4.a(new fm(22, this.b((byte) -86), this.c((byte) 101), this.e((byte) -113)), -58);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var17 = 1;
                          break L10;
                        } else {
                          var18_ref = (wda) ((Object) var16.a(-1));
                          continue L9;
                        }
                      }
                    }
                  }
                  var18_ref = (wda) ((Object) var16.a(-1));
                  continue L9;
                }
              }
            } else {
              L14: {
                if (this.field_o != null) {
                  break L14;
                } else {
                  if (var6 != 0) {
                    this.field_o = var4.a(new fm(9, this.b((byte) -101), this.c((byte) 99), this.e((byte) -98)), param0 ^ 57);
                    break L5;
                  } else {
                    break L14;
                  }
                }
              }
              if (this.field_o == null) {
                break L5;
              } else {
                if (var6 != 0) {
                  break L5;
                } else {
                  this.field_o.a(param0 + 112, var4);
                  this.field_o = null;
                  break L5;
                }
              }
            }
          }
          L15: {
            if (this.field_o != null) {
              this.field_o.a(this.b((byte) -97), var4.field_c, param0 ^ 127, var4.field_h, this.c((byte) 96));
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (this.field_t != null) {
              this.field_t.a(this.b((byte) 103), var4.field_c, -128, var4.field_h, this.c((byte) 127));
              break L16;
            } else {
              break L16;
            }
          }
          return;
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) -58, param1);
            int var3_int = -7 % ((param0 - -8) / 40);
            param1.a((byte) -16, this.field_q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        eh var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.h(119);
        if (!(this.field_r != null)) {
            return;
        }
        if (param0 <= 0) {
            return;
        }
        for (var2 = 0; this.field_z > var2; var2++) {
            for (var3 = 0; this.field_s > var3; var3++) {
                var4 = this.field_r[var2][var3];
                var5 = mpa.field_W[var4.field_h];
                var4.field_a = dfa.a(-var4.field_a + var5, 2048, 65);
                var4.field_d = -var4.field_d;
            }
        }
    }

    final void b(int param0, byte param1) {
        if (param1 != 23) {
            field_B = false;
        }
        this.field_q = param0;
    }

    final void a(uw param0, int param1) {
        try {
            if (param1 < 82) {
                uw var4 = (uw) null;
                this.b(-71, (uw) null);
            }
            super.a(param0, 105);
            this.field_r = (eh[][]) null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
            if (param2 <= 40) {
                this.field_v = (fla) null;
            }
            if (null != this.field_r) {
                for (var4_int = 0; this.field_z > var4_int; var4_int++) {
                    for (var5 = 0; this.field_s > var5; var5++) {
                        param1.a(param0, this.field_r[var4_int][var5], (byte) -33);
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void o(byte param0) {
        this.field_s = 1;
        this.field_z = 1;
        this.field_r = new eh[1][1];
        if (param0 < 74) {
            this.a((byte) 41, 36);
        }
        eh var3 = new eh();
        eh var2 = var3;
        var2.field_a = 0;
        var2.field_c = 0;
        var2.field_d = 0;
        var2.field_h = 0;
        var2.field_e = (ce) (this);
        var2.field_b = this.a(53).e(true).a(100, 0);
        var2.field_f = this.a(var3, 2);
        this.field_r[0][0] = var3;
    }

    final int k(byte param0) {
        int var2;
        if (this.field_h.j(-1)) {
          return 2;
        } else {
          L0: {
            if (param0 == -99) {
              break L0;
            } else {
              this.field_r = (eh[][]) null;
              break L0;
            }
          }
          var2 = this.field_q;
          if (-3 != (var2 ^ -1)) {
            if ((var2 ^ -1) == -2) {
              return 5;
            } else {
              return 3;
            }
          } else {
            return 2;
          }
        }
    }

    ce(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_p = false;
        this.field_t = null;
        this.field_o = null;
        this.field_v = null;
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
            if (param0 <= 50) {
                this.n((byte) 0);
            }
            if (null != this.field_r) {
                for (var4_int = 0; this.field_z > var4_int; var4_int++) {
                    for (var5 = 0; var5 < this.field_s; var5++) {
                        param2.a((byte) -111, param1, this.field_r[var4_int][var5]);
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        try {
            super.a(127, param1, param2);
            this.field_q = param2.b((byte) 44, 4);
            if (param0 <= 119) {
                this.field_s = -69;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void j(int param0) {
        psa var1 = new psa();
        psa var2 = new psa(var1);
        var1.d(128, 9, param0 + 6);
        var2.d(128, 9, 32460);
        if (param0 != 32454) {
            ce.l(-98);
        }
        ab.field_n = new sq(var1, var2);
        wea.a(22050, 1024, ab.field_n, true, (java.awt.Component) ((Object) nma.field_l), dsa.field_c);
        wra.a(0);
    }

    private final int a(eh param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == 2) {
              L1: {
                var3_int = this.field_q;
                if (var3_int != 0) {
                  if ((var3_int ^ -1) != -2) {
                    if (var3_int == 2) {
                      var3_int = param0.field_h;
                      if (-1 == (var3_int ^ -1)) {
                        if (33 <= param0.field_b) {
                          if (-67 >= (param0.field_b ^ -1)) {
                            stackIn_31_0 = 56;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackIn_29_0 = 55;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          stackIn_26_0 = 54;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        if (1 != var3_int) {
                          L2: {
                            if ((var3_int ^ -1) == -3) {
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          if (-51 >= (param0.field_b ^ -1)) {
                            stackIn_44_0 = 61;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          } else {
                            stackIn_42_0 = 60;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          }
                        } else {
                          if (param0.field_b < 33) {
                            stackIn_39_0 = 57;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          } else {
                            if ((param0.field_b ^ -1) > -67) {
                              stackIn_37_0 = 58;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              stackIn_35_0 = 59;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      if (4 == var3_int) {
                        if (33 > param0.field_b) {
                          stackIn_52_0 = 110;
                          decompiledRegionSelector0 = 14;
                          break L0;
                        } else {
                          if (param0.field_b < 66) {
                            stackIn_50_0 = 111;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          } else {
                            stackIn_48_0 = 112;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return 26;
                  }
                } else {
                  break L1;
                }
              }
              if (-34 < (param0.field_b ^ -1)) {
                stackIn_18_0 = 51;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if ((param0.field_b ^ -1) > -67) {
                  stackIn_16_0 = 52;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_14_0 = 53;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = -64;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var3);

            stackIn_55_1 = new StringBuilder().append("ce.H(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L3;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_26_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_29_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_35_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_37_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_39_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_42_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_44_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_48_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_50_0;
                                  } else {
                                    return stackIn_52_0;
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
              }
            }
          }
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 63 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean p(byte param0) {
        if (param0 < 7) {
            uw var3 = (uw) null;
            this.b(-54, (uw) null);
        }
        return (this.field_q ^ -1) != -2 ? true : false;
    }

    static {
        field_n = new String[17];
        field_n[5] = "Path Move";
        field_n[7] = "Face Player";
        field_n[9] = "Circle Movement";
        field_n[15] = "Teleport";
        field_n[2] = "Locomotor Controller";
        field_n[16] = "Sweep Rotate";
        field_n[4] = "Mirror Mover";
        field_n[10] = "Face Point";
        field_n[1] = "Approach Player";
        field_n[13] = "Constrain To Facing Arc";
        field_n[6] = "Rotate";
        field_n[0] = "Simple Move";
        field_n[8] = "Constrain To Circle";
        field_n[12] = "Constrain To Lattice";
        field_n[14] = "Track Player";
        field_n[3] = "Flee";
        field_n[11] = "Constrain To Rectangle";
        field_B = true;
        field_w = "<%0> is already on your friend list.";
    }
}
