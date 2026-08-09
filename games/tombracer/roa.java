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
        boolean discarded$0 = false;
        try {
            param0.a((byte) -127, this.field_r, 5);
            if (param1 <= 3) {
                discarded$0 = this.a((byte) 22);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "roa.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        int var3;
        if (!param1) {
          this.field_q = this.field_p;
          var3 = -22 / ((46 - param0) / 36);
          return;
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
        if (param0 == 12111) {
          if (!this.a((byte) 125)) {
            if (-1 > (this.field_q ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_f = (up) null;
          if (this.a((byte) 125)) {
            return true;
          } else {
            L0: {
              if (-1 <= (this.field_q ^ -1)) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
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
        int stackIn_5_0 = 0;
        ep stackIn_31_0 = null;
        ep stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
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
                    if (this.field_g <= var16) {
                      L5: {
                        this.field_v = this.field_h;
                        if (-1 > (this.field_q ^ -1)) {
                          this.field_q = this.field_q - 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (this.field_e) {
                          param5.b(false).a((byte) 89, param1, var14, var13, param0);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      param5.a(param4, param3, this.field_o, param1, (byte) 6);
                      stackIn_46_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L7: {
                        var17 = param0;
                        if (0 >= this.field_s) {
                          break L7;
                        } else {
                          var17 = var17 + (var15.a(this.field_s, 0) + -(this.field_s / 2));
                          break L7;
                        }
                      }
                      L8: {
                        var18 = hua.a((byte) 110, var17 >> 1383929250);
                        var19 = bua.a(0, var17 >> 68619330);
                        var20 = this.field_n;
                        if (this.field_w > 0) {
                          var20 = var20 + var15.a(this.field_w, 0);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        var21 = param6 + gqa.a(var18, (byte) 24, var20);
                        var22 = param7 + gqa.a(var19, (byte) 24, var20);
                        var23 = param5.a(var14, var13, 127, param1);
                        var23.a(this.field_a, param5, this.field_l, 66, this.field_b, this.field_k);
                        var23.b(var21, var22, (byte) -92);
                        var24 = var15.a(8192, 0);
                        if (3 == this.field_b) {
                          var25 = -512 + var15.a(1024, 0);
                          var23.b(7, var25, var24);
                          break L9;
                        } else {
                          if (this.field_b != 2) {
                            break L9;
                          } else {
                            var23.b(7, 128, var24);
                            break L9;
                          }
                        }
                      }
                      L10: {
                        var23.a(-126, new up(param2, this.field_f));
                        if ((this.field_i ^ -1) == 0) {
                          break L10;
                        } else {
                          var23.a(this.field_i, -38);
                          break L10;
                        }
                      }
                      L11: {
                        if (!this.field_x) {
                          break L11;
                        } else {
                          var23.b(true, 101);
                          break L11;
                        }
                      }
                      L12: {
                        if (!this.field_c) {
                          break L12;
                        } else {
                          L13: {
                            stackIn_31_0 = (ep) (var23);

                            if (param9) {
                              stackIn_32_0 = (ep) ((Object) stackIn_31_0);
                              stackIn_32_1 = 0;
                              break L13;
                            } else {
                              stackIn_32_0 = (ep) ((Object) stackIn_31_0);
                              stackIn_32_1 = 1;
                              break L13;
                            }
                          }
                          ((ep) (Object) stackIn_32_0).a(stackIn_32_1 != 0, true);
                          break L12;
                        }
                      }
                      L14: {
                        if (!this.field_j) {
                          break L14;
                        } else {
                          var23.c(true, true);
                          break L14;
                        }
                      }
                      L15: {
                        if (this.field_y) {
                          var23.b(-1, true);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var23.field_m = this.field_t;
                      var16++;
                      continue L4;
                    }
                  }
                }
              }
            }
            stackIn_5_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var11 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var11);

            stackIn_49_1 = new StringBuilder().append("roa.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L16;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L17;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L17;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_50_0), stackIn_53_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_46_0 != 0;
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
        if (!param0) {
            this.b((byte) -20);
            return this.field_h;
        }
        return this.field_h;
    }

    static {
    }
}
