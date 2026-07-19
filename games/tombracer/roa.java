/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class roa {
    int field_l;
    private int field_i;
    int field_t;
    boolean field_c;
    up field_f;
    int field_h;
    static float field_u;
    int field_p;
    private boolean field_j;
    int field_s;
    int field_o;
    boolean field_m;
    private int field_w;
    int field_k;
    private int field_v;
    int field_d;
    int field_r;
    int field_q;
    int field_b;
    private boolean field_e;
    boolean field_y;
    private int field_g;
    int field_n;
    int field_a;
    boolean field_x;

    final int b(int param0) {
        if (param0 != 524288) {
            this.field_e = false;
            return this.field_v;
        }
        return this.field_v;
    }

    final int d(int param0) {
        if (param0 <= 18) {
            this.field_k = -112;
            return this.field_d;
        }
        return this.field_d;
    }

    final void a(kh param0, byte param1) {
        boolean discarded$2 = false;
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
              param0.a((byte) -127, this.field_r, 5);
              if (param1 > 3) {
                break L1;
              } else {
                discarded$2 = this.a((byte) 22);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("roa.M(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        if (param1 <= 11) {
            return;
        }
        this.field_v = param0;
    }

    final up b(byte param0) {
        if (param0 != -16) {
            this.a(6, true);
            return this.field_f;
        }
        return this.field_f;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        if (!param1) {
          this.field_q = this.field_p;
          if (TombRacer.field_G) {
            this.field_q = -1;
            var3 = -22 / ((46 - param0) / 36);
            return;
          } else {
            var3 = -22 / ((46 - param0) / 36);
            return;
          }
        } else {
          this.field_q = -1;
          var3 = -22 / ((46 - param0) / 36);
          return;
        }
    }

    final void c(int param0) {
        if (!(this.field_v <= 0)) {
            this.field_v = this.field_v - 1;
        }
        if (param0 >= -1) {
            this.field_w = -55;
            return;
        }
    }

    final void b(int param0, boolean param1) {
        if (param1) {
            this.field_f = (up) null;
            this.field_v = param0;
            return;
        }
        this.field_v = param0;
    }

    final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 12111) {
          if (!this.a((byte) 125)) {
            if (-1 > (this.field_q ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_f = (up) null;
          if (this.a((byte) 125)) {
            return true;
          } else {
            L0: {
              if (-1 <= (this.field_q ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final roa e(int param0) {
        if (param0 != -1) {
            return (roa) null;
        }
        return ci.a(this.field_r, -1);
    }

    final boolean a(int param0, int param1, gma param2, int param3, int param4, la param5, int param6, int param7, int param8, boolean param9) {
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        qea var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        ep var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_5_0 = 0;
        ep stackIn_33_0 = null;
        ep stackIn_34_0 = null;
        ep stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ep stackOut_32_0 = null;
        ep stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        ep stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 < this.field_v) {
                break L1;
              } else {
                if (!this.a(12111)) {
                  break L1;
                } else {
                  L2: {
                    var11_int = hua.a((byte) 122, param0 >> -1481705246);
                    if (!param9) {
                      break L2;
                    } else {
                      this.field_w = 123;
                      break L2;
                    }
                  }
                  L3: {
                    var12 = bua.a(0, param0 >> 242314882);
                    var13 = param3 + gqa.a(var11_int, (byte) 24, param8);
                    var14 = param4 - -gqa.a(var12, (byte) 24, param8);
                    if (!this.field_m) {
                      param7 = 0;
                      param6 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var15 = param5.q(-121);
                  var16 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        L7: {
                          if (this.field_g <= var16) {
                            break L7;
                          } else {
                            var17 = param0;
                            var28 = this.field_s;
                            var27 = 0;
                            if (var26 != 0) {
                              if (var27 > var28) {
                                break L6;
                              } else {
                                break L5;
                              }
                            } else {
                              L8: {
                                if (var27 >= var28) {
                                  break L8;
                                } else {
                                  var17 = var17 + (var15.a(this.field_s, 0) + -(this.field_s / 2));
                                  break L8;
                                }
                              }
                              L9: {
                                var18 = hua.a((byte) 110, var17 >> 1383929250);
                                var19 = bua.a(0, var17 >> 68619330);
                                var20 = this.field_n;
                                if (this.field_w > 0) {
                                  var20 = var20 + var15.a(this.field_w, 0);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                L11: {
                                  var21 = param6 + gqa.a(var18, (byte) 24, var20);
                                  var22 = param7 + gqa.a(var19, (byte) 24, var20);
                                  var23 = param5.a(var14, var13, 127, param1);
                                  var23.a(this.field_a, param5, this.field_l, 66, this.field_b, this.field_k);
                                  var23.b(var21, var22, (byte) -92);
                                  var24 = var15.a(8192, 0);
                                  if (3 == this.field_b) {
                                    break L11;
                                  } else {
                                    if (this.field_b != 2) {
                                      break L10;
                                    } else {
                                      var23.b(7, 128, var24);
                                      if (var26 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                var25 = -512 + var15.a(1024, 0);
                                var23.b(7, var25, var24);
                                break L10;
                              }
                              L12: {
                                var23.a(-126, new up(param2, this.field_f));
                                if ((this.field_i ^ -1) == 0) {
                                  break L12;
                                } else {
                                  var23.a(this.field_i, -38);
                                  break L12;
                                }
                              }
                              L13: {
                                if (!this.field_x) {
                                  break L13;
                                } else {
                                  var23.b(true, 101);
                                  break L13;
                                }
                              }
                              L14: {
                                if (!this.field_c) {
                                  break L14;
                                } else {
                                  L15: {
                                    stackOut_32_0 = (ep) (var23);
                                    stackIn_34_0 = stackOut_32_0;
                                    stackIn_33_0 = stackOut_32_0;
                                    if (param9) {
                                      stackOut_34_0 = (ep) ((Object) stackIn_34_0);
                                      stackOut_34_1 = 0;
                                      stackIn_35_0 = stackOut_34_0;
                                      stackIn_35_1 = stackOut_34_1;
                                      break L15;
                                    } else {
                                      stackOut_33_0 = (ep) ((Object) stackIn_33_0);
                                      stackOut_33_1 = 1;
                                      stackIn_35_0 = stackOut_33_0;
                                      stackIn_35_1 = stackOut_33_1;
                                      break L15;
                                    }
                                  }
                                  ((ep) (Object) stackIn_35_0).a(stackIn_35_1 != 0, true);
                                  break L14;
                                }
                              }
                              L16: {
                                if (!this.field_j) {
                                  break L16;
                                } else {
                                  var23.c(true, true);
                                  break L16;
                                }
                              }
                              L17: {
                                if (this.field_y) {
                                  var23.b(-1, true);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              var23.field_m = this.field_t;
                              var16++;
                              if (var26 == 0) {
                                continue L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        this.field_v = this.field_h;
                        if (-1 > (this.field_q ^ -1)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                      this.field_q = this.field_q - 1;
                      break L5;
                    }
                    L18: {
                      if (this.field_e) {
                        param5.b(false).a((byte) 89, param1, var14, var13, param0);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    param5.a(param4, param3, this.field_o, param1, (byte) 6);
                    stackOut_48_0 = 1;
                    stackIn_49_0 = stackOut_48_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var11 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var11);
            stackOut_50_1 = new StringBuilder().append("roa.F(").append(param0).append(',').append(param1).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L19;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L19;
            }
          }
          L20: {
            stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
            stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param5 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L20;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L20;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_49_0 != 0;
        }
    }

    private final boolean a(byte param0) {
        if (param0 < 99) {
            return false;
        }
        return (this.field_q ^ -1) == 0 ? true : false;
    }

    roa() {
        this.field_i = -1;
        this.field_o = -1;
        this.field_g = 1;
        this.field_t = -1;
        this.field_y = true;
        this.field_a = 524288;
        this.field_n = 524288;
        this.field_k = 100;
        this.field_l = 524288;
    }

    final int a(boolean param0) {
        up discarded$0 = null;
        if (!param0) {
            discarded$0 = this.b((byte) -20);
            return this.field_h;
        }
        return this.field_h;
    }

    static {
    }
}
