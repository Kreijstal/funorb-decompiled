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
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -13019) {
                break L1;
              } else {
                ce.l(-70);
                break L1;
              }
            }
            stackIn_3_0 = this.field_u;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.L(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final void b(int param0, uw param1) {
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
                      if (var4 < this.field_s) {
                        this.field_r[var3_int][var4].a(55);
                        var4++;
                        continue L4;
                      } else {
                        var3_int++;
                        continue L3;
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
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("ce.WA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final int n(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 87) {
              stackIn_4_0 = this.field_q;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -127;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (!(this.field_k instanceof lpa)) {
                break L1;
              } else {
                this.field_m = (lpa) ((Object) this.field_k);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ce.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ce.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_10_0);

            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public static void l(int param0) {
        try {
            field_w = null;
            field_n = null;
            if (param0 != 30389) {
                field_n = (String[]) null;
            }
            field_A = (int[][]) null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.P(" + param0 + ')');
        }
    }

    ce(int param0) {
        super(param0);
        this.field_p = false;
        this.field_t = null;
        this.field_o = null;
        this.field_v = null;
    }

    private final void a(boolean param0) {
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        eh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        la var17 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var17 = this.a(18);
                var3 = this.field_h.d(3);
                var4 = this.field_h.e(9648);
                this.field_z = this.field_h.c(-84) / 2097152;
                this.field_s = this.field_h.a((byte) 55) / 2097152;
                if (1 >= this.field_z) {
                  break L2;
                } else {
                  if (-2 <= (this.field_s ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if (this.field_q == 2) {
                this.field_q = 0;
                break L1;
              } else {
                break L1;
              }
            }
            if (this.p((byte) 77)) {
              L3: {
                this.field_r = new eh[this.field_z][this.field_s];
                var5 = 1048576 + (-(this.field_h.a((byte) 55) / 2) + var4);
                if (param0) {
                  break L3;
                } else {
                  this.field_o = (fla) null;
                  break L3;
                }
              }
              var6 = 0;
              L4: while (true) {
                if (this.field_s <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = -(this.field_h.c(-117) / 2) + (var3 + 1048576);
                  var8 = 0;
                  L5: while (true) {
                    if (this.field_z <= var8) {
                      var5 = var5 + 2097152;
                      var6++;
                      continue L4;
                    } else {
                      L6: {
                        var9 = new eh();
                        this.field_r[var8][var6] = var9;
                        if (0 != this.field_q) {
                          L7: {
                            if (var8 > 0) {
                              stackIn_25_0 = 1;
                              break L7;
                            } else {
                              stackIn_25_0 = 0;
                              break L7;
                            }
                          }
                          L8: {
                            var10 = stackIn_25_0;
                            if (var8 >= -1 + this.field_z) {
                              stackIn_29_0 = 0;
                              break L8;
                            } else {
                              stackIn_29_0 = 1;
                              break L8;
                            }
                          }
                          L9: {
                            var11 = stackIn_29_0;
                            if ((var6 ^ -1) >= -1) {
                              stackIn_33_0 = 0;
                              break L9;
                            } else {
                              stackIn_33_0 = 1;
                              break L9;
                            }
                          }
                          L10: {
                            var12 = stackIn_33_0;
                            if (this.field_s - 1 <= var6) {
                              stackIn_37_0 = 0;
                              break L10;
                            } else {
                              stackIn_37_0 = 1;
                              break L10;
                            }
                          }
                          L11: {
                            var13 = stackIn_37_0;
                            var14 = 0;
                            if (var10 == 0) {
                              break L11;
                            } else {
                              var14++;
                              break L11;
                            }
                          }
                          L12: {
                            if (var11 != 0) {
                              var14++;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            if (var12 != 0) {
                              var14++;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            if (var13 != 0) {
                              var14++;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            var15 = 0;
                            if ((var14 ^ -1) == -5) {
                              var9.field_h = 2;
                              break L15;
                            } else {
                              if ((var14 ^ -1) != -4) {
                                if (2 == var14) {
                                  L16: {
                                    var9.field_h = 1;
                                    if (var10 != 0) {
                                      break L16;
                                    } else {
                                      if (var12 == 0) {
                                        var15 = 512;
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  L17: {
                                    if (var10 != 0) {
                                      break L17;
                                    } else {
                                      if (var13 != 0) {
                                        break L17;
                                      } else {
                                        var15 = 0;
                                        break L15;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (var11 != 0) {
                                      break L18;
                                    } else {
                                      if (var12 == 0) {
                                        var15 = 1024;
                                        break L15;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  if (var11 != 0) {
                                    break L15;
                                  } else {
                                    if (var13 == 0) {
                                      var15 = -512;
                                      break L15;
                                    } else {
                                      var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                                      var9.field_e = (ce) (this);
                                      var9.field_b = var17.e(true).a(100, 0);
                                      var9.field_c = var5 + -var4;
                                      var9.field_d = -var3 + var7;
                                      var9.field_f = this.a(var9, 2);
                                      var7 = var7 + 2097152;
                                      var8++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  var9.field_h = 2;
                                  break L15;
                                }
                              } else {
                                L19: {
                                  if (var12 != 0) {
                                    if (var13 == 0) {
                                      var15 = 0;
                                      break L19;
                                    } else {
                                      if (var11 != 0) {
                                        var15 = 512;
                                        break L19;
                                      } else {
                                        var15 = -512;
                                        break L19;
                                      }
                                    }
                                  } else {
                                    var15 = 1024;
                                    break L19;
                                  }
                                }
                                var9.field_h = 0;
                                break L15;
                              }
                            }
                          }
                          var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                          break L6;
                        } else {
                          var9.field_a = 512;
                          break L6;
                        }
                      }
                      var9.field_e = (ce) (this);
                      var9.field_b = var17.e(true).a(100, 0);
                      var9.field_c = var5 + -var4;
                      var9.field_d = -var3 + var7;
                      var9.field_f = this.a(var9, 2);
                      var7 = var7 + 2097152;
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              this.o((byte) 95);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int i(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1024) {
              stackIn_4_0 = this.field_x;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 21;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, int param1) {
        w var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            super.a((byte) 92, param1);
            var3 = (w) ((Object) this.a(29).field_G);
            var4 = -57 % ((7 - param0) / 36);
            if (var3 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3.a(new fm(3, this.b((byte) -93), this.c((byte) 115), this.e((byte) -89)), -58);
                if (this.field_t == null) {
                  break L1;
                } else {
                  this.field_t.a(-120, var3);
                  this.field_t = null;
                  break L1;
                }
              }
              L2: {
                if (null == this.field_o) {
                  break L2;
                } else {
                  this.field_o.a(-100, var3);
                  this.field_o = null;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "ce.LA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        int var4_int = 0;
        w var4_ref = null;
        Object var5 = null;
        int var5_int = 0;
        fsa var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        vna var15 = null;
        uja var16 = null;
        int var17 = 0;
        Object var18 = null;
        wda var18_ref = null;
        int var19 = 0;
        var4 = null;
        var5 = null;
        var18 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.d(-1);
              var2_int = 0;
              var3 = 0;
              if (this.field_m != null) {
                if (!this.field_m.d(false)) {
                  break L1;
                } else {
                  this.field_u = -131072 + uca.field_c.a(262144, param0 ^ -1);
                  this.field_x = uca.field_c.a(262144, param0 + 1) + -131072;
                  var2_int = 1;
                  if (this.field_m.g((byte) 120)) {
                    var2_int = 0;
                    var4_int = 0;
                    L2: while (true) {
                      if (this.field_z <= var4_int) {
                        var3 = 1;
                        break L1;
                      } else {
                        var5_int = 0;
                        L3: while (true) {
                          if (this.field_s > var5_int) {
                            this.field_r[var4_int][var5_int].field_g.a(0);
                            var5_int++;
                            continue L3;
                          } else {
                            var4_int++;
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var4_ref = (w) ((Object) this.a(94).field_G);
            if (var4_ref == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L4: {
                if (param0 == -1) {
                  break L4;
                } else {
                  this.field_t = (fla) null;
                  break L4;
                }
              }
              L5: {
                var5_ref = (fsa) ((Object) this.field_h);
                var6 = 1;
                var7 = this.b((byte) 84) - var4_ref.field_h >> -934761200;
                var8 = this.c((byte) 126) + -var4_ref.field_c >> -1940922704;
                var9 = (double)ua.a(var7, -118);
                var11 = (double)ua.a(var8, -125);
                var13 = Math.sqrt(var11 * var11 + var9 * var9);
                if (768.0 <= var13) {
                  var6 = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (1 != this.field_q) {
                  L7: {
                    L8: {
                      if (var2_int == 0) {
                        break L8;
                      } else {
                        if (this.field_t != null) {
                          break L8;
                        } else {
                          this.field_t = var4_ref.a(new fm(19, this.b((byte) 84), this.c((byte) 123), this.e((byte) -118)), param0 ^ 57);
                          break L7;
                        }
                      }
                    }
                    if (var2_int != 0) {
                      break L7;
                    } else {
                      if (null == this.field_t) {
                        break L7;
                      } else {
                        this.field_t.a(param0 + -117, var4_ref);
                        this.field_t = null;
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (var3 == 0) {
                      break L9;
                    } else {
                      if (!this.field_p) {
                        var4_ref.a(new fm(7, this.b((byte) -109), this.c((byte) 125), this.e((byte) -115)), param0 ^ 57);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    stackIn_50_0 = this;

                    if (var3 == 0) {
                      stackIn_51_0 = this;
                      stackIn_51_1 = 0;
                      break L10;
                    } else {
                      stackIn_51_0 = this;
                      stackIn_51_1 = 1;
                      break L10;
                    }
                  }
                  ((ce) (this)).field_p = stackIn_51_1 != 0;
                  var15 = var5_ref.field_B;
                  var16 = new uja(var15);
                  var17 = 0;
                  var18_ref = (wda) ((Object) var16.a(true));
                  L11: while (true) {
                    if (var18_ref == null) {
                      if (var17 != 0) {
                        break L6;
                      } else {
                        if (this.field_v == null) {
                          break L6;
                        } else {
                          this.field_v.a(param0 + 15, var4_ref);
                          this.field_v = null;
                          break L6;
                        }
                      }
                    } else {
                      L12: {
                        if (!(var18_ref instanceof ro)) {
                          break L12;
                        } else {
                          L13: {
                            if (((ro) ((Object) var18_ref)).d(false) != this.field_y) {
                              var4_ref.a(new fm(20, this.b((byte) 39), this.c((byte) 109), this.e((byte) -116)), -58);
                              this.field_y = ((ro) ((Object) var18_ref)).d(false);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          if (!var18_ref.a(-58)) {
                            break L12;
                          } else {
                            if (-1 == (this.field_y ^ -1)) {
                              L14: {
                                L15: {
                                  if (((ro) ((Object) var18_ref)).e(69) != 4096) {
                                    break L15;
                                  } else {
                                    if (this.field_v != null) {
                                      break L15;
                                    } else {
                                      this.field_v = var4_ref.a(new fm(21, this.b((byte) 114), this.c((byte) 94), this.e((byte) -124)), -58);
                                      break L14;
                                    }
                                  }
                                }
                                if (-327681 != (((ro) ((Object) var18_ref)).e(114) ^ -1)) {
                                  break L14;
                                } else {
                                  if (null == this.field_v) {
                                    this.field_v = var4_ref.a(new fm(22, this.b((byte) -86), this.c((byte) 101), this.e((byte) -113)), -58);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var17 = 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var18_ref = (wda) ((Object) var16.a(-1));
                      continue L11;
                    }
                  }
                } else {
                  L16: {
                    if (this.field_o != null) {
                      break L16;
                    } else {
                      if (var6 != 0) {
                        this.field_o = var4_ref.a(new fm(9, this.b((byte) -101), this.c((byte) 99), this.e((byte) -98)), param0 ^ 57);
                        break L6;
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (this.field_o == null) {
                    break L6;
                  } else {
                    if (var6 != 0) {
                      break L6;
                    } else {
                      this.field_o.a(param0 + 112, var4_ref);
                      this.field_o = null;
                      break L6;
                    }
                  }
                }
              }
              L17: {
                if (this.field_o != null) {
                  this.field_o.a(this.b((byte) -97), var4_ref.field_c, param0 ^ 127, var4_ref.field_h, this.c((byte) 96));
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (this.field_t != null) {
                  this.field_t.a(this.b((byte) 103), var4_ref.field_c, -128, var4_ref.field_h, this.c((byte) 127));
                  break L18;
                } else {
                  break L18;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, kh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a((byte) -58, param1);
            var3_int = -7 % ((param0 - -8) / 40);
            param1.a((byte) -16, this.field_q, 4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ce.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void h(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var6 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        eh var4 = null;
        int var5 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.h(119);
            if (this.field_r == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 > 0) {
                var2_int = 0;
                L1: while (true) {
                  if (this.field_z <= var2_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    L2: while (true) {
                      if (this.field_s > var3) {
                        var4 = this.field_r[var2_int][var3];
                        var5 = mpa.field_W[var4.field_h];
                        var4.field_a = dfa.a(-var4.field_a + var5, 2048, 65);
                        var4.field_d = -var4.field_d;
                        var3++;
                        continue L2;
                      } else {
                        var2_int++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.HA(" + param0 + ')');
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

    final void b(int param0, byte param1) {
        try {
            if (param1 != 23) {
                field_B = false;
            }
            this.field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(uw param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 82) {
                break L1;
              } else {
                this.b(-71, (uw) null);
                break L1;
              }
            }
            super.a(param0, 105);
            this.field_r = (eh[][]) null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("ce.RA(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 40) {
                break L1;
              } else {
                this.field_v = (fla) null;
                break L1;
              }
            }
            L2: {
              if (null == this.field_r) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (this.field_z <= var4_int) {
                    break L2;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (this.field_s > var5) {
                        param1.a(param0, this.field_r[var4_int][var5], (byte) -33);
                        var5++;
                        continue L4;
                      } else {
                        var4_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ce.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    private final void o(byte param0) {
        eh var3 = null;
        eh var2 = null;
        try {
            this.field_s = 1;
            this.field_z = 1;
            this.field_r = new eh[1][1];
            if (param0 < 74) {
                this.a((byte) 41, 36);
            }
            var3 = new eh();
            var2 = var3;
            var2.field_a = 0;
            var2.field_c = 0;
            var2.field_d = 0;
            var2.field_h = 0;
            var2.field_e = (ce) (this);
            var2.field_b = this.a(53).e(true).a(100, 0);
            var2.field_f = this.a(var3, 2);
            this.field_r[0][0] = var3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.B(" + param0 + ')');
        }
    }

    final int k(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_h.j(-1)) {
              stackIn_4_0 = 2;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -99) {
                  break L1;
                } else {
                  this.field_r = (eh[][]) null;
                  break L1;
                }
              }
              var2_int = this.field_q;
              if (-3 != (var2_int ^ -1)) {
                if ((var2_int ^ -1) == -2) {
                  stackIn_16_0 = 5;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_18_0 = 3;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_14_0 = 2;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_18_0;
            }
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
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 50) {
                break L1;
              } else {
                this.n((byte) 0);
                break L1;
              }
            }
            L2: {
              if (null == this.field_r) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (this.field_z <= var4_int) {
                    break L2;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 < this.field_s) {
                        param2.a((byte) -111, param1, this.field_r[var4_int][var5]);
                        var5++;
                        continue L4;
                      } else {
                        var4_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ce.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(127, param1, param2);
              this.field_q = param2.b((byte) 44, 4);
              if (param0 > 119) {
                break L1;
              } else {
                this.field_s = -69;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ce.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void j(int param0) {
        psa var1 = null;
        psa var2 = null;
        try {
            var1 = new psa();
            var2 = new psa(var1);
            var1.d(128, 9, param0 + 6);
            var2.d(128, 9, 32460);
            if (param0 != 32454) {
                ce.l(-98);
            }
            ab.field_n = new sq(var1, var2);
            wea.a(22050, 1024, ab.field_n, true, (java.awt.Component) ((Object) nma.field_l), dsa.field_c);
            wra.a(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ce.R(" + param0 + ')');
        }
    }

    private final int a(eh param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
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
                            stackIn_38_0 = 56;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            stackIn_36_0 = 55;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        } else {
                          stackIn_33_0 = 54;
                          decompiledRegionSelector0 = 5;
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
                            stackIn_51_0 = 61;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          } else {
                            stackIn_49_0 = 60;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          }
                        } else {
                          if (param0.field_b < 33) {
                            stackIn_46_0 = 57;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          } else {
                            if ((param0.field_b ^ -1) > -67) {
                              stackIn_44_0 = 58;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackIn_42_0 = 59;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      if (4 == var3_int) {
                        if (33 > param0.field_b) {
                          stackIn_59_0 = 110;
                          decompiledRegionSelector0 = 15;
                          break L0;
                        } else {
                          if (param0.field_b < 66) {
                            stackIn_57_0 = 111;
                            decompiledRegionSelector0 = 14;
                            break L0;
                          } else {
                            stackIn_55_0 = 112;
                            decompiledRegionSelector0 = 13;
                            break L0;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    stackIn_23_0 = 26;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (-34 < (param0.field_b ^ -1)) {
                stackIn_21_0 = 51;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if ((param0.field_b ^ -1) > -67) {
                  stackIn_19_0 = 52;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_17_0 = 53;
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
            stackIn_63_0 = (RuntimeException) (var3);

            stackIn_63_1 = new StringBuilder().append("ce.H(");

            if (param0 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L3;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_36_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_38_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_42_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_44_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_46_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_49_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_51_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_55_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_57_0;
                                    } else {
                                      return stackIn_59_0;
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
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = 63 / ((param4 - -38) / 47);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ce.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean p(byte param0) {
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 7) {
                break L1;
              } else {
                this.b(-54, (uw) null);
                break L1;
              }
            }
            L2: {
              if ((this.field_q ^ -1) == -2) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ce.T(" + param0 + ')');
        }
        return stackIn_6_0 != 0;
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
