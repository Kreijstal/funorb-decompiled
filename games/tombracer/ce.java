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
        return ((ce) this).field_u;
    }

    final void b(int param0, uw param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ce) this).field_r != null) {
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            L2: {
              super.b(param0, param1);
              if (((ce) this).field_r != null) {
                var3_int = 0;
                L3: while (true) {
                  if (((ce) this).field_z <= var3_int) {
                    break L2;
                  } else {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= ((ce) this).field_s) {
                        var3_int++;
                        continue L3;
                      } else {
                        ((ce) this).field_r[var3_int][var4].a(55);
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
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ce.WA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final int n(byte param0) {
        if (param0 != 87) {
            return -127;
        }
        return ((ce) this).field_q;
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (!(((ce) this).field_k instanceof lpa)) {
                break L1;
              } else {
                ((ce) this).field_m = (lpa) (Object) ((ce) this).field_k;
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
            stackOut_3_1 = new StringBuilder().append("ce.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (!(param2 instanceof im)) {
                break L1;
              } else {
                ((ce) this).field_q = 1;
                break L1;
              }
            }
            L2: {
              if (!param0.b(true)) {
                break L2;
              } else {
                ((ce) this).field_q = 3;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ce.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void l(int param0) {
        field_w = null;
        field_n = null;
        if (param0 != 30389) {
            field_n = null;
        }
        field_A = null;
    }

    ce(int param0) {
        super(param0);
        ((ce) this).field_p = false;
        ((ce) this).field_t = null;
        ((ce) this).field_o = null;
        ((ce) this).field_v = null;
    }

    private final void a(boolean param0) {
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
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          L1: {
            var16 = TombRacer.field_G ? 1 : 0;
            var17 = ((ce) this).a(18);
            var3 = ((ce) this).field_h.d(3);
            var4 = ((ce) this).field_h.e(9648);
            ((ce) this).field_z = ((ce) this).field_h.c(-84) / 2097152;
            ((ce) this).field_s = ((ce) this).field_h.a((byte) 55) / 2097152;
            if (1 >= ((ce) this).field_z) {
              break L1;
            } else {
              if (((ce) this).field_s <= 1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          if (((ce) this).field_q == 2) {
            ((ce) this).field_q = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (this.p((byte) 77)) {
          ((ce) this).field_r = new eh[((ce) this).field_z][((ce) this).field_s];
          var5 = 1048576 + (-(((ce) this).field_h.a((byte) 55) / 2) + var4);
          var6 = 0;
          L2: while (true) {
            if (((ce) this).field_s <= var6) {
              return;
            } else {
              var7 = -(((ce) this).field_h.c(-117) / 2) + (var3 + 1048576);
              var8 = 0;
              L3: while (true) {
                if (((ce) this).field_z <= var8) {
                  var5 = var5 + 2097152;
                  var6++;
                  continue L2;
                } else {
                  L4: {
                    var9 = new eh();
                    ((ce) this).field_r[var8][var6] = var9;
                    if (0 != ((ce) this).field_q) {
                      L5: {
                        if (var8 <= 0) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L5;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L5;
                        }
                      }
                      L6: {
                        var10 = stackIn_17_0;
                        if (var8 >= -1 + ((ce) this).field_z) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L6;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L6;
                        }
                      }
                      L7: {
                        var11 = stackIn_20_0;
                        if (var6 <= 0) {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          break L7;
                        } else {
                          stackOut_21_0 = 1;
                          stackIn_23_0 = stackOut_21_0;
                          break L7;
                        }
                      }
                      L8: {
                        var12 = stackIn_23_0;
                        if (((ce) this).field_s - 1 <= var6) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L8;
                        } else {
                          stackOut_24_0 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          break L8;
                        }
                      }
                      L9: {
                        var13 = stackIn_26_0;
                        var14 = 0;
                        if (var10 == 0) {
                          break L9;
                        } else {
                          var14++;
                          break L9;
                        }
                      }
                      L10: {
                        if (var11 != 0) {
                          var14++;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (var12 != 0) {
                          var14++;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (var13 != 0) {
                          var14++;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        var15 = 0;
                        if (var14 == 4) {
                          var9.field_h = 2;
                          break L13;
                        } else {
                          if (var14 != 3) {
                            if (2 == var14) {
                              L14: {
                                var9.field_h = 1;
                                if (var10 != 0) {
                                  break L14;
                                } else {
                                  if (var12 == 0) {
                                    var15 = 512;
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L15: {
                                if (var10 != 0) {
                                  break L15;
                                } else {
                                  if (var13 != 0) {
                                    break L15;
                                  } else {
                                    var15 = 0;
                                    break L13;
                                  }
                                }
                              }
                              L16: {
                                if (var11 != 0) {
                                  break L16;
                                } else {
                                  if (var12 == 0) {
                                    var15 = 1024;
                                    break L13;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (var11 != 0) {
                                break L13;
                              } else {
                                if (var13 == 0) {
                                  var15 = -512;
                                  break L13;
                                } else {
                                  var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                                  var9.field_e = (ce) this;
                                  var9.field_b = var17.e(true).a(100, 0);
                                  var9.field_c = var5 + -var4;
                                  var9.field_d = -var3 + var7;
                                  var9.field_f = this.a(var9, 2);
                                  var7 = var7 + 2097152;
                                  var8++;
                                  continue L3;
                                }
                              }
                            } else {
                              var9.field_h = 2;
                              break L13;
                            }
                          } else {
                            if (var12 != 0) {
                              L17: {
                                if (var13 == 0) {
                                  var15 = 0;
                                  break L17;
                                } else {
                                  if (var11 != 0) {
                                    var15 = 512;
                                    break L17;
                                  } else {
                                    var15 = -512;
                                    var9.field_h = 0;
                                    break L13;
                                  }
                                }
                              }
                              var9.field_h = 0;
                              break L13;
                            } else {
                              var15 = 1024;
                              var9.field_h = 0;
                              break L13;
                            }
                          }
                        }
                      }
                      var9.field_a = dfa.a(var15 + mpa.field_W[var9.field_h], 2048, -70);
                      break L4;
                    } else {
                      var9.field_a = 512;
                      break L4;
                    }
                  }
                  var9.field_e = (ce) this;
                  var9.field_b = var17.e(true).a(100, 0);
                  var9.field_c = var5 + -var4;
                  var9.field_d = -var3 + var7;
                  var9.field_f = this.a(var9, 2);
                  var7 = var7 + 2097152;
                  var8++;
                  continue L3;
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
        return ((ce) this).field_x;
    }

    final void a(byte param0, int param1) {
        super.a((byte) 92, param1);
        w var3 = (w) (Object) ((ce) this).a(29).field_G;
        int var4 = -57 % ((7 - param0) / 36);
        if (!(var3 != null)) {
            return;
        }
        fla discarded$3 = var3.a(new fm(3, ((ce) this).b((byte) -93), ((ce) this).c((byte) 115), ((ce) this).e((byte) -89)), -58);
        if (((ce) this).field_t != null) {
            ((ce) this).field_t.a(-120, var3);
            ((ce) this).field_t = null;
        }
        if (null != ((ce) this).field_o) {
            ((ce) this).field_o.a(-100, var3);
            ((ce) this).field_o = null;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        w var4 = null;
        int var4_int = 0;
        fsa var5 = null;
        int var5_int = 0;
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
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        L0: {
          var18 = null;
          var19 = TombRacer.field_G ? 1 : 0;
          super.d(-1);
          var2 = 0;
          var3 = 0;
          if (((ce) this).field_m != null) {
            if (!((ce) this).field_m.d(false)) {
              break L0;
            } else {
              ((ce) this).field_u = -131072 + uca.field_c.a(262144, ~param0);
              ((ce) this).field_x = uca.field_c.a(262144, param0 + 1) + -131072;
              var2 = 1;
              if (((ce) this).field_m.g((byte) 120)) {
                var2 = 0;
                var4_int = 0;
                L1: while (true) {
                  if (((ce) this).field_z <= var4_int) {
                    var3 = 1;
                    break L0;
                  } else {
                    var5_int = 0;
                    L2: while (true) {
                      if (((ce) this).field_s <= var5_int) {
                        var4_int++;
                        continue L1;
                      } else {
                        ((ce) this).field_r[var4_int][var5_int].field_g.a(0);
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
        var4 = (w) (Object) ((ce) this).a(94).field_G;
        if (var4 == null) {
          return;
        } else {
          L3: {
            if (param0 == -1) {
              break L3;
            } else {
              ((ce) this).field_t = null;
              break L3;
            }
          }
          L4: {
            var5 = (fsa) (Object) ((ce) this).field_h;
            var6 = 1;
            var7 = ((ce) this).b((byte) 84) - var4.field_h >> 16;
            var8 = ((ce) this).c((byte) 126) + -var4.field_c >> 16;
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
            if (1 != ((ce) this).field_q) {
              L6: {
                if (var2 != 0) {
                  if (((ce) this).field_t == null) {
                    ((ce) this).field_t = var4.a(new fm(19, ((ce) this).b((byte) 84), ((ce) this).c((byte) 123), ((ce) this).e((byte) -118)), param0 ^ 57);
                    break L6;
                  } else {
                    if (var2 != 0) {
                      break L6;
                    } else {
                      if (null == ((ce) this).field_t) {
                        break L6;
                      } else {
                        ((ce) this).field_t.a(param0 + -117, var4);
                        ((ce) this).field_t = null;
                        break L6;
                      }
                    }
                  }
                } else {
                  if (null == ((ce) this).field_t) {
                    break L6;
                  } else {
                    ((ce) this).field_t.a(param0 + -117, var4);
                    ((ce) this).field_t = null;
                    break L6;
                  }
                }
              }
              L7: {
                if (var3 == 0) {
                  break L7;
                } else {
                  if (!((ce) this).field_p) {
                    fla discarded$2 = var4.a(new fm(7, ((ce) this).b((byte) -109), ((ce) this).c((byte) 125), ((ce) this).e((byte) -115)), param0 ^ 57);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                stackOut_41_0 = this;
                stackIn_43_0 = stackOut_41_0;
                stackIn_42_0 = stackOut_41_0;
                if (var3 == 0) {
                  stackOut_43_0 = this;
                  stackOut_43_1 = 0;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  break L8;
                } else {
                  stackOut_42_0 = this;
                  stackOut_42_1 = 1;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  break L8;
                }
              }
              ((ce) this).field_p = stackIn_44_1 != 0;
              var15 = var5.field_B;
              var16 = new uja(var15);
              var17 = 0;
              var18_ref = (wda) (Object) var16.a(true);
              L9: while (true) {
                if (var18_ref == null) {
                  if (var17 != 0) {
                    break L5;
                  } else {
                    if (((ce) this).field_v == null) {
                      break L5;
                    } else {
                      ((ce) this).field_v.a(param0 + 15, var4);
                      ((ce) this).field_v = null;
                      break L5;
                    }
                  }
                } else {
                  L10: {
                    if (!(var18_ref instanceof ro)) {
                      break L10;
                    } else {
                      L11: {
                        if (((ro) (Object) var18_ref).d(false) != ((ce) this).field_y) {
                          fla discarded$3 = var4.a(new fm(20, ((ce) this).b((byte) 39), ((ce) this).c((byte) 109), ((ce) this).e((byte) -116)), -58);
                          ((ce) this).field_y = ((ro) (Object) var18_ref).d(false);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      if (!var18_ref.a(-58)) {
                        break L10;
                      } else {
                        if (((ce) this).field_y == 0) {
                          L12: {
                            L13: {
                              if (((ro) (Object) var18_ref).e(69) != 4096) {
                                break L13;
                              } else {
                                if (((ce) this).field_v != null) {
                                  break L13;
                                } else {
                                  ((ce) this).field_v = var4.a(new fm(21, ((ce) this).b((byte) 114), ((ce) this).c((byte) 94), ((ce) this).e((byte) -124)), -58);
                                  break L12;
                                }
                              }
                            }
                            if (((ro) (Object) var18_ref).e(114) != 327680) {
                              break L12;
                            } else {
                              if (null == ((ce) this).field_v) {
                                ((ce) this).field_v = var4.a(new fm(22, ((ce) this).b((byte) -86), ((ce) this).c((byte) 101), ((ce) this).e((byte) -113)), -58);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var17 = 1;
                          break L10;
                        } else {
                          var18_ref = (wda) (Object) var16.a(-1);
                          continue L9;
                        }
                      }
                    }
                  }
                  var18_ref = (wda) (Object) var16.a(-1);
                  continue L9;
                }
              }
            } else {
              L14: {
                if (((ce) this).field_o != null) {
                  break L14;
                } else {
                  if (var6 != 0) {
                    ((ce) this).field_o = var4.a(new fm(9, ((ce) this).b((byte) -101), ((ce) this).c((byte) 99), ((ce) this).e((byte) -98)), param0 ^ 57);
                    break L5;
                  } else {
                    break L14;
                  }
                }
              }
              if (((ce) this).field_o == null) {
                break L5;
              } else {
                if (var6 != 0) {
                  break L5;
                } else {
                  ((ce) this).field_o.a(param0 + 112, var4);
                  ((ce) this).field_o = null;
                  break L5;
                }
              }
            }
          }
          L15: {
            if (((ce) this).field_o != null) {
              ((ce) this).field_o.a(((ce) this).b((byte) -97), var4.field_c, param0 ^ 127, var4.field_h, ((ce) this).c((byte) 96));
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (((ce) this).field_t != null) {
              ((ce) this).field_t.a(((ce) this).b((byte) 103), var4.field_c, -128, var4.field_h, ((ce) this).c((byte) 127));
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
            param1.a((byte) -16, ((ce) this).field_q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ce.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        eh var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.h(119);
        if (!(((ce) this).field_r != null)) {
            return;
        }
        if (param0 <= 0) {
            return;
        }
        for (var2 = 0; ((ce) this).field_z > var2; var2++) {
            for (var3 = 0; ((ce) this).field_s > var3; var3++) {
                var4 = ((ce) this).field_r[var2][var3];
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
        ((ce) this).field_q = param0;
    }

    final void a(uw param0, int param1) {
        try {
            if (param1 < 82) {
                Object var4 = null;
                ((ce) this).b(-71, (uw) null);
            }
            super.a(param0, 105);
            ((ce) this).field_r = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ce.RA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, uw param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 40) {
                break L1;
              } else {
                ((ce) this).field_v = null;
                break L1;
              }
            }
            L2: {
              if (null == ((ce) this).field_r) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (((ce) this).field_z <= var4_int) {
                    break L2;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (((ce) this).field_s <= var5) {
                        var4_int++;
                        continue L3;
                      } else {
                        param1.a(param0, (fo) (Object) ((ce) this).field_r[var4_int][var5], (byte) -33);
                        var5++;
                        continue L4;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ce.FA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    private final void o(byte param0) {
        ((ce) this).field_s = 1;
        ((ce) this).field_z = 1;
        ((ce) this).field_r = new eh[1][1];
        eh var3 = new eh();
        eh var2 = var3;
        var2.field_a = 0;
        var2.field_c = 0;
        var2.field_d = 0;
        var2.field_h = 0;
        var2.field_e = (ce) this;
        var2.field_b = ((ce) this).a(53).e(true).a(100, 0);
        var2.field_f = this.a(var3, 2);
        ((ce) this).field_r[0][0] = var3;
    }

    final int k(byte param0) {
        int var2 = 0;
        if (((ce) this).field_h.j(-1)) {
          return 2;
        } else {
          L0: {
            if (param0 == -99) {
              break L0;
            } else {
              ((ce) this).field_r = null;
              break L0;
            }
          }
          var2 = ((ce) this).field_q;
          if (var2 != 2) {
            if (var2 == 1) {
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
        ((ce) this).field_p = false;
        ((ce) this).field_t = null;
        ((ce) this).field_o = null;
        ((ce) this).field_v = null;
    }

    final void a(byte param0, int param1, uw param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 50) {
                break L1;
              } else {
                int discarded$2 = ((ce) this).n((byte) 0);
                break L1;
              }
            }
            L2: {
              if (null == ((ce) this).field_r) {
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (((ce) this).field_z <= var4_int) {
                    break L2;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= ((ce) this).field_s) {
                        var4_int++;
                        continue L3;
                      } else {
                        param2.a((byte) -111, param1, (fo) (Object) ((ce) this).field_r[var4_int][var5]);
                        var5++;
                        continue L4;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ce.V(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(127, param1, param2);
              ((ce) this).field_q = param2.b((byte) 44, 4);
              if (param0 > 119) {
                break L1;
              } else {
                ((ce) this).field_s = -69;
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
            stackOut_3_1 = new StringBuilder().append("ce.G(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void j(int param0) {
        psa var1 = new psa();
        psa var2 = new psa((l) (Object) var1);
        var1.d(128, 9, 32460);
        var2.d(128, 9, 32460);
        ab.field_n = new sq((l) (Object) var1, (l) (Object) var2);
        wea.a(22050, 1024, ab.field_n, true, (java.awt.Component) (Object) nma.field_l, dsa.field_c);
        wra.a(0);
    }

    private final int a(eh param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ((ce) this).field_q;
              if (var3_int != 0) {
                if (var3_int != 1) {
                  if (var3_int == 2) {
                    var3_int = param0.field_h;
                    if (var3_int == 0) {
                      if (33 <= param0.field_b) {
                        if (param0.field_b >= 66) {
                          stackOut_29_0 = 56;
                          stackIn_30_0 = stackOut_29_0;
                          return stackIn_30_0;
                        } else {
                          stackOut_27_0 = 55;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        }
                      } else {
                        stackOut_24_0 = 54;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      }
                    } else {
                      if (1 != var3_int) {
                        L2: {
                          if (var3_int == 2) {
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        if (param0.field_b >= 50) {
                          stackOut_42_0 = 61;
                          stackIn_43_0 = stackOut_42_0;
                          return stackIn_43_0;
                        } else {
                          stackOut_40_0 = 60;
                          stackIn_41_0 = stackOut_40_0;
                          return stackIn_41_0;
                        }
                      } else {
                        if (param0.field_b < 33) {
                          stackOut_37_0 = 57;
                          stackIn_38_0 = stackOut_37_0;
                          return stackIn_38_0;
                        } else {
                          if (param0.field_b < 66) {
                            stackOut_35_0 = 58;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0;
                          } else {
                            stackOut_33_0 = 59;
                            stackIn_34_0 = stackOut_33_0;
                            return stackIn_34_0;
                          }
                        }
                      }
                    }
                  } else {
                    if (4 == var3_int) {
                      if (33 > param0.field_b) {
                        stackOut_50_0 = 110;
                        stackIn_51_0 = stackOut_50_0;
                        break L0;
                      } else {
                        if (param0.field_b < 66) {
                          stackOut_48_0 = 111;
                          stackIn_49_0 = stackOut_48_0;
                          return stackIn_49_0;
                        } else {
                          stackOut_46_0 = 112;
                          stackIn_47_0 = stackOut_46_0;
                          return stackIn_47_0;
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
            if (param0.field_b < 33) {
              stackOut_16_0 = 51;
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0;
            } else {
              if (param0.field_b < 66) {
                stackOut_14_0 = 52;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                stackOut_12_0 = 53;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var3;
            stackOut_52_1 = new StringBuilder().append("ce.H(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L3;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + 2 + 41);
        }
        return stackIn_51_0;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = 63 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ce.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final boolean p(byte param0) {
        return ((ce) this).field_q != 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
