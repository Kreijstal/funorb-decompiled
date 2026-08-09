/*
 * Decompiled by CFR-JS 0.4.0.
 */
class af implements j, eg {
    int field_j;
    int field_n;
    int field_f;
    int field_g;
    int field_b;
    private boolean field_i;
    int field_o;
    int field_e;
    int field_m;
    int field_a;
    mg field_l;
    private int field_k;
    static int[] field_h;
    int field_d;
    static da field_c;

    private final int c(int param0, rc param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                this.field_b = 126;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_j + -this.field_d + param1.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("af.V(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(boolean param0, rc param1) {
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
              this.a(-21480, param1);
              stackIn_4_0 = param1.field_h.b(62) + (this.field_a + this.field_n);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -119;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("af.A(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(rc param0, int param1, int param2, int param3) {
        try {
            this.a(param1, param2, -3, 0, this.field_o, this.field_k, param0, 0);
            int var5_int = -24 % ((param3 - -6) / 63);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, rc param3, int param4) {
        RuntimeException runtimeException = null;
        int var7 = 0;
        le var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jf var13 = null;
        jf var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 1) {
              L1: {
                if (!param3.b(true)) {
                  break L1;
                } else {
                  L2: {
                    var13 = this.a(-21480, param3);
                    var14 = var13;
                    var7 = var14.a((byte) -94, param0);
                    var8 = var13.field_c[var7];
                    var9 = var14.a(0, param0);
                    var10 = this.a(param3, param4, var9, (byte) 78);
                    var11 = this.a(param3, false, param1) + Math.max(0, var8.field_g);
                    stackIn_5_0 = this.a(param3, false, param1);

                    stackIn_5_1 = this.c(param2 ^ 2, param3);

                    stackIn_5_2 = var8.field_e;

                    if (var14.field_c.length > 1 + var7) {
                      stackIn_6_0 = stackIn_5_0;
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = stackIn_5_2;
                      stackIn_6_3 = var13.field_c[var7 + 1].field_g;
                      break L2;
                    } else {
                      stackIn_6_0 = stackIn_5_0;
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = stackIn_5_2;
                      stackIn_6_3 = var8.field_e;
                      break L2;
                    }
                  }
                  var12 = stackIn_6_0 - -Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
                  kf.a((byte) 97, param4 + param3.field_m, param3.field_j + param1, param3.field_t + param3.field_m + param4, param3.field_x + param1 - -param3.field_j);
                  ph.field_f.a((byte) -67, var11, var12, var10, this.field_m, var10);
                  mf.e(param2 + 4095);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("af.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int param2, rc param3) {
        RuntimeException var5 = null;
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
            if (param1 == -5) {
              stackIn_4_0 = param0 + (param3.field_q + (param3.field_j + param2) - -this.field_d);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -87;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("af.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean b(int param0) {
        if (param0 != -3) {
            return false;
        }
        if (vg.field_J == null) {
            return false;
        }
        if (vg.field_J.d((byte) 125) == null) {
            return false;
        }
        return true;
    }

    af(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, rc param6, int param7) {
        int discarded$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rc var14 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              kf.a((byte) 97, param6.field_m + param0, param1 + param6.field_j, param6.field_m + (param0 + param6.field_t), param6.field_j + param1 + param6.field_x);
              var9_int = this.b(param2 ^ -268, param6);
              if (param2 == -3) {
                break L1;
              } else {
                var14 = (rc) null;
                discarded$0 = this.c(124, (rc) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = this.c(param2 + 6, param6);
                if (!this.field_i) {
                  break L3;
                } else {
                  this.field_l.a(this.b(param6, 0), this.a(param6, param0, param3, (byte) 78), this.a(param7, -5, param1, param6), var9_int, var10, param4, param5, this.field_g, this.field_b, this.field_f);
                  if (var13 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  L6: {
                    L7: {
                      var12 = this.field_b;
                      if (-1 == (var12 ^ -1)) {
                        break L7;
                      } else {
                        L8: {
                          if ((var12 ^ -1) != -3) {
                            break L8;
                          } else {
                            if (var13 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (var12 == 3) {
                          break L5;
                        } else {
                          if (1 != var12) {
                            break L5;
                          } else {
                            if (var13 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    var11 = this.field_l.field_F;
                    if (var13 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  var11 = -this.field_l.field_s + var10;
                  if (var13 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
                var11 = (-this.field_l.field_F + var10 - this.field_l.field_s >> 1126916097) + this.field_l.field_F;
                break L4;
              }
              L9: {
                L10: {
                  L11: {
                    L12: {
                      var12 = this.field_g;
                      if (var12 != 0) {
                        break L12;
                      } else {
                        if (var13 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (var12 == 3) {
                      break L11;
                    } else {
                      if (1 == var12) {
                        break L10;
                      } else {
                        if ((var12 ^ -1) != -3) {
                          break L2;
                        } else {
                          if (var13 == 0) {
                            break L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  this.field_l.c(this.b(param6, param2 + 3), this.a(param6, param0, param3, (byte) 78), var11 + this.a(param7, -5, param1, param6), param4, param5);
                  if (var13 == 0) {
                    break L2;
                  } else {
                    break L10;
                  }
                }
                this.field_l.a(this.b(param6, 0), (var9_int >> -2083757599) + this.a(param6, param0, param3, (byte) 78), this.a(param7, param2 + -2, param1, param6) - -var11, param4, param5);
                if (var13 == 0) {
                  break L2;
                } else {
                  break L9;
                }
              }
              this.field_l.b(this.b(param6, 0), var9_int + this.a(param6, param0, param3, (byte) 78), this.a(param7, -5, param1, param6) - -var11, param4, param5);
              break L2;
            }
            mf.e(4096);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var9 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var9);

            stackIn_34_1 = new StringBuilder().append("af.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L13;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L13;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param7 + ')');
        }
    }

    public final void a(int param0, rc param1, int param2, int param3, int param4, int param5) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jf var17 = null;
        jf var18 = null;
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != param2) {
              L1: {
                L2: {
                  if (param1.b(true)) {
                    L3: {
                      L4: {
                        var17 = this.a(-21480, param1);
                        var18 = var17;
                        if (param0 < param2) {
                          break L4;
                        } else {
                          var9 = param0;
                          var8 = param2;
                          if (var16 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var9 = param2;
                      var8 = param0;
                      break L3;
                    }
                    var10 = var18.a((byte) -106, var8);
                    var11 = var18.a((byte) -121, var9);
                    kf.a((byte) 97, param5 - -param1.field_m, param4 + param1.field_j, param1.field_m + param5 + param1.field_t, param1.field_x + (param1.field_j + param4));
                    var12 = var10;
                    L5: while (true) {
                      L6: {
                        if (var12 > var11) {
                          break L6;
                        } else {
                          var13 = var17.field_c[var12];
                          stackIn_22_0 = var12 ^ -1;

                          stackIn_22_1 = var10 ^ -1;

                          if (var16 != 0) {
                            break L1;
                          } else {
                            L7: {
                              if (stackIn_22_0 == stackIn_22_1) {
                                stackIn_14_0 = var18.a(0, var8);
                                break L7;
                              } else {
                                stackIn_14_0 = var13.field_c[0];
                                break L7;
                              }
                            }
                            L8: {
                              var14 = stackIn_14_0;
                              if (var11 != var12) {
                                if (var13 == null) {
                                  stackIn_19_0 = 0;
                                  break L8;
                                } else {
                                  stackIn_19_0 = var13.field_c[var13.field_c.length - 1];
                                  break L8;
                                }
                              } else {
                                stackIn_19_0 = var18.a(0, var9);
                                break L8;
                              }
                            }
                            var15 = stackIn_19_0;
                            ph.field_f.a(var13.field_g + (this.field_d + param1.field_j + (param4 - -param1.field_q)), this.field_e >>> -574782696, var15 - var14, this.field_e, 1, var13.field_e, this.a(param1, param5, var14, (byte) 78));
                            var12++;
                            if (var16 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      mf.e(4096);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                stackIn_22_0 = -39;
                stackIn_22_1 = (param3 - 34) / 46;
                break L1;
              }
              var7_int = stackIn_22_0 % stackIn_22_1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("af.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(rc param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.field_n = 98;
                break L1;
              }
            }
            stackIn_3_0 = this.a(0, -5, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("af.P(");

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, rc param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.field_f = 89;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, param0, 0, (byte) 78);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("af.U(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final int b(int param0, rc param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 265) {
                break L1;
              } else {
                this.field_j = 108;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_t - (this.field_a - -this.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("af.K(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        RuntimeException runtimeException = null;
        af var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == this.field_l) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(param4, param3, param1, -117);
                if (param0 >= 113) {
                  break L1;
                } else {
                  var7 = (af) null;
                  this.a((af) null, 127);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("af.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(rc param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
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
            if (param1 == 0) {
              this.a(param1 ^ -21480, param0);
              stackIn_4_0 = param0.field_h.a(-2592, param3 + -this.a(param0, false, param4), param2 + -this.a(param5, param0, param1 + 0));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -113;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("af.O(");

            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final jf a(int param0, rc param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        jf stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_h != null) {
                break L1;
              } else {
                param1.field_h = (jf) ((Object) new vk());
                break L1;
              }
            }
            L2: {
              if (param0 == -21480) {
                break L2;
              } else {
                var4 = (rc) null;
                this.a(-117, (rc) null);
                break L2;
              }
            }
            L3: {
              L4: {
                if (this.field_i) {
                  break L4;
                } else {
                  this.a(param1, (byte) 93);
                  if (!SolKnight.field_L) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((vk) ((Object) param1.field_h)).a(this.b(param1, 0), this.field_f, this.field_g, 127, this.field_l, this.b(265, param1), this.c(3, param1), this.field_b);
              break L3;
            }
            stackIn_9_0 = param1.field_h;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("af.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_h = null;
    }

    final void a(af param0, int param1) {
        try {
            param0.field_n = this.field_n;
            param0.field_b = this.field_b;
            param0.field_g = this.field_g;
            param0.field_f = this.field_f;
            param0.field_o = this.field_o;
            param0.field_l = this.field_l;
            param0.field_a = this.field_a;
            if (param1 != 6935) {
                this.field_j = 86;
            }
            param0.field_d = this.field_d;
            param0.field_m = this.field_m;
            param0.field_e = this.field_e;
            param0.field_j = this.field_j;
            param0.field_k = this.field_k;
            param0.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "af.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(rc param0, byte param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != param0.field_h) {
                break L1;
              } else {
                param0.field_h = (jf) ((Object) new vk());
                break L1;
              }
            }
            var3_int = this.b(265, param0);
            if (param1 > 81) {
              L2: {
                L3: {
                  L4: {
                    var4 = this.c(3, param0);
                    var6 = this.field_b;
                    if (var6 == 0) {
                      var5 = this.field_l.field_F;
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      L5: {
                        if (var6 != 2) {
                          break L5;
                        } else {
                          if (var7 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var6 != 3) {
                          break L6;
                        } else {
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (1 == var6) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5 = -this.field_l.field_s + var4;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var5 = this.field_l.field_F + (-this.field_l.field_s + -this.field_l.field_F + var4 >> 649083393);
                break L2;
              }
              L7: {
                L8: {
                  L9: {
                    L10: {
                      L11: {
                        var6 = this.field_g;
                        if (var6 != 0) {
                          break L11;
                        } else {
                          if (var7 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if ((var6 ^ -1) == -4) {
                        break L10;
                      } else {
                        if (-2 == (var6 ^ -1)) {
                          break L9;
                        } else {
                          if ((var6 ^ -1) != -3) {
                            break L7;
                          } else {
                            if (var7 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    if (!(param0.field_h instanceof vk)) {
                      break L7;
                    } else {
                      ((vk) ((Object) param0.field_h)).a(this.field_l, (byte) -111, 0, var5, this.b(param0, 0));
                      if (var7 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (param0.field_h instanceof vk) {
                    ((vk) ((Object) param0.field_h)).a(var3_int >> 521286561, 0, var5, this.field_l, this.b(param0, 0));
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  } else {
                    return;
                  }
                }
                if (param0.field_h instanceof vk) {
                  ((vk) ((Object) param0.field_h)).a(-13323, this.field_l, var5, this.b(param0, 0), var3_int);
                  break L7;
                } else {
                  return;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("af.M(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(rc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 28 % ((-60 - param1) / 61);
            this.a(-21480, param0);
            stackIn_1_0 = param0.field_h.a((byte) 121) + (this.field_d + this.field_j);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("af.J(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(rc param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 78) {
                break L1;
              } else {
                this.field_n = -51;
                break L1;
              }
            }
            stackIn_3_0 = param2 + (param0.field_k + (this.field_a + param1 - -param0.field_m));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("af.S(");

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0) {
        if (param0 != 3) {
            return -52;
        }
        return this.field_l.field_s + this.field_l.field_F;
    }

    String b(rc param0, int param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (rc) null;
                this.a((byte) -115, 127, false, 29, (rc) null);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("af.B(");

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(dl param0, gb param1, byte param2, int param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            di var15 = null;
            String var16 = null;
            String var17 = null;
            byte[][] var18 = null;
            String var19 = null;
            byte[][] var20 = null;
            int var21 = 0;
            int var22 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = SolKnight.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var15 = new di();
                            var15.field_h = param1.j(255);
                            var15.field_o = param1.e(true);
                            var15.field_k = new nj[var15.field_h];
                            var15.field_s = new nj[var15.field_h];
                            var15.field_m = new int[var15.field_h];
                            var15.field_q = new byte[var15.field_h][][];
                            var15.field_p = new int[var15.field_h];
                            var15.field_r = new int[var15.field_h];
                            var5 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var15.field_h <= var5) {
                                statePc = 44;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var6_int = param1.j(255);
                            var22 = -1;
                            var21 = var6_int ^ -1;
                            if (var14 != 0) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_3 instanceof SecurityException ? 39 : ((Object) stateCaught_3 instanceof NullPointerException ? 40 : ((Object) stateCaught_3 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var21 == var22) {
                                statePc = 11;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_4 instanceof SecurityException ? 39 : ((Object) stateCaught_4 instanceof NullPointerException ? 40 : ((Object) stateCaught_4 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_5 instanceof SecurityException ? 39 : ((Object) stateCaught_5 instanceof NullPointerException ? 40 : ((Object) stateCaught_5 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var21 < var22) {
                                statePc = 46;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_6 instanceof SecurityException ? 39 : ((Object) stateCaught_6 instanceof NullPointerException ? 40 : ((Object) stateCaught_6 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_7 instanceof SecurityException ? 39 : ((Object) stateCaught_7 instanceof NullPointerException ? 40 : ((Object) stateCaught_7 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((var6_int ^ -1) == -2) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_8 instanceof SecurityException ? 39 : ((Object) stateCaught_8 instanceof NullPointerException ? 40 : ((Object) stateCaught_8 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var6_int ^ -1) != -3) {
                                statePc = 15;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_9 instanceof SecurityException ? 39 : ((Object) stateCaught_9 instanceof NullPointerException ? 40 : ((Object) stateCaught_9 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_10 instanceof SecurityException ? 39 : ((Object) stateCaught_10 instanceof NullPointerException ? 40 : ((Object) stateCaught_10 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var16 = param1.h(94);
                            var17 = param1.h(36);
                            var9 = 0;
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_11 instanceof SecurityException ? 39 : ((Object) stateCaught_11 instanceof NullPointerException ? 40 : ((Object) stateCaught_11 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_12 instanceof SecurityException ? 39 : ((Object) stateCaught_12 instanceof NullPointerException ? 40 : ((Object) stateCaught_12 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var9 = param1.e(true);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_13 instanceof SecurityException ? 39 : ((Object) stateCaught_13 instanceof NullPointerException ? 40 : ((Object) stateCaught_13 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var15.field_r[var5] = var6_int;
                            var15.field_m[var5] = var9;
                            var15.field_k[var5] = param0.a(0, k.a(var16, (byte) -115), var17);
                            if (var14 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_14 instanceof SecurityException ? 39 : ((Object) stateCaught_14 instanceof NullPointerException ? 40 : ((Object) stateCaught_14 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var6_int == 3) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_15 instanceof SecurityException ? 39 : ((Object) stateCaught_15 instanceof NullPointerException ? 40 : ((Object) stateCaught_15 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((var6_int ^ -1) == -5) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_16 instanceof SecurityException ? 39 : ((Object) stateCaught_16 instanceof NullPointerException ? 40 : ((Object) stateCaught_16 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_17 instanceof SecurityException ? 39 : ((Object) stateCaught_17 instanceof NullPointerException ? 40 : ((Object) stateCaught_17 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var19 = param1.h(123);
                            var8 = param1.h(11);
                            var9 = param1.j(255);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_18 instanceof SecurityException ? 39 : ((Object) stateCaught_18 instanceof NullPointerException ? 40 : ((Object) stateCaught_18 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var11_int >= var9) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = ((Object) stateCaught_19 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_19 instanceof SecurityException ? 39 : ((Object) stateCaught_19 instanceof NullPointerException ? 40 : ((Object) stateCaught_19 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var10[var11_int] = param1.h(19);
                            var11_int++;
                            if (var14 != 0) {
                                statePc = 43;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_20 instanceof SecurityException ? 39 : ((Object) stateCaught_20 instanceof NullPointerException ? 40 : ((Object) stateCaught_20 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var14 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_21 instanceof SecurityException ? 39 : ((Object) stateCaught_21 instanceof NullPointerException ? 40 : ((Object) stateCaught_21 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_22 instanceof SecurityException ? 39 : ((Object) stateCaught_22 instanceof NullPointerException ? 40 : ((Object) stateCaught_22 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var20 = new byte[var9][];
                            var18 = var20;
                            var11 = var18;
                            if (var6_int != 3) {
                                statePc = 29;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_23 instanceof SecurityException ? 39 : ((Object) stateCaught_23 instanceof NullPointerException ? 40 : ((Object) stateCaught_23 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var12_int = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_24 instanceof SecurityException ? 39 : ((Object) stateCaught_24 instanceof NullPointerException ? 40 : ((Object) stateCaught_24 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var9 <= var12_int) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_25 instanceof SecurityException ? 39 : ((Object) stateCaught_25 instanceof NullPointerException ? 40 : ((Object) stateCaught_25 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var13 = param1.e(true);
                            array$0 = new byte[var13];
                            var11[var12_int] = array$0;
                            param1.a(var13, 0, -113, var20[var12_int]);
                            var12_int++;
                            if (var14 != 0) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_26 instanceof SecurityException ? 39 : ((Object) stateCaught_26 instanceof NullPointerException ? 40 : ((Object) stateCaught_26 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var14 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_27 instanceof SecurityException ? 39 : ((Object) stateCaught_27 instanceof NullPointerException ? 40 : ((Object) stateCaught_27 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_28 instanceof SecurityException ? 39 : ((Object) stateCaught_28 instanceof NullPointerException ? 40 : ((Object) stateCaught_28 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var15.field_r[var5] = var6_int;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_29 instanceof SecurityException ? 39 : ((Object) stateCaught_29 instanceof NullPointerException ? 40 : ((Object) stateCaught_29 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var12 = new Class[var9];
                            var13 = 0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_30 instanceof SecurityException ? 39 : ((Object) stateCaught_30 instanceof NullPointerException ? 40 : ((Object) stateCaught_30 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var9 <= var13) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_31 instanceof SecurityException ? 39 : ((Object) stateCaught_31 instanceof NullPointerException ? 40 : ((Object) stateCaught_31 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var12[var13] = k.a(var10[var13], (byte) -106);
                            var13++;
                            if (var14 != 0) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_32 instanceof SecurityException ? 39 : ((Object) stateCaught_32 instanceof NullPointerException ? 40 : ((Object) stateCaught_32 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var14 == 0) {
                                statePc = 31;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_33 instanceof SecurityException ? 39 : ((Object) stateCaught_33 instanceof NullPointerException ? 40 : ((Object) stateCaught_33 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_34 instanceof SecurityException ? 39 : ((Object) stateCaught_34 instanceof NullPointerException ? 40 : ((Object) stateCaught_34 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var15.field_s[var5] = param0.a((byte) 113, var8, var12, k.a(var19, (byte) -101));
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_35 instanceof SecurityException ? 39 : ((Object) stateCaught_35 instanceof NullPointerException ? 40 : ((Object) stateCaught_35 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var15.field_q[var5] = var20;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_36 instanceof SecurityException ? 39 : ((Object) stateCaught_36 instanceof NullPointerException ? 40 : ((Object) stateCaught_36 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            var15.field_p[var5] = -1;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6_ref = (SecurityException) ((Object) caughtException);
                            var15.field_p[var5] = -2;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6_ref2 = (NullPointerException) ((Object) caughtException);
                            var15.field_p[var5] = -3;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var6_ref3 = (Exception) ((Object) caughtException);
                            var15.field_p[var5] = -4;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var6_ref4 = caughtException;
                            var15.field_p[var5] = -5;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var5++;
                            if (var14 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (param2 < -94) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            field_h = (int[]) null;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ga.field_E.a(var15, -7044);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 48;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        var4 = (RuntimeException) ((Object) caughtException);
                        stackIn_50_0 = (RuntimeException) (var4);
                        stackIn_49_0 = stackIn_50_0;
                        stackIn_50_1 = new StringBuilder().append("af.C(");
                        stackIn_49_1 = stackIn_50_1;
                        if (param0 == null) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        stackIn_51_0 = (RuntimeException) ((Object) stackIn_49_0);
                        stackIn_51_1 = (StringBuilder) ((Object) stackIn_49_1);
                        stackIn_51_2 = "{...}";
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                        stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                        stackIn_51_2 = "null";
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        stackIn_53_0 = (RuntimeException) ((Object) stackIn_51_0);
                        stackIn_52_0 = stackIn_53_0;
                        stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
                        stackIn_52_1 = stackIn_53_1;
                        if (param1 == null) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        stackIn_54_0 = (RuntimeException) ((Object) stackIn_52_0);
                        stackIn_54_1 = (StringBuilder) ((Object) stackIn_52_1);
                        stackIn_54_2 = "{...}";
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 53: {
                        stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
                        stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                        stackIn_54_2 = "null";
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        throw fc.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param2 + ',' + param3 + ')');
                    }
                    case 55: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected af() {
    }

    af(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_j = param4;
            this.field_g = param7;
            this.field_i = param12 ? true : false;
            this.field_m = param10;
            this.field_n = param2;
            this.field_e = param11;
            this.field_l = param0;
            this.field_f = param9;
            this.field_o = param5;
            this.field_d = param3;
            this.field_k = param6;
            this.field_b = param8;
            this.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
