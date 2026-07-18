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
            ((roa) this).field_e = false;
            return ((roa) this).field_v;
        }
        return ((roa) this).field_v;
    }

    final int d(int param0) {
        if (param0 <= 18) {
            ((roa) this).field_k = -112;
            return ((roa) this).field_d;
        }
        return ((roa) this).field_d;
    }

    final void a(kh param0, byte param1) {
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
              param0.a((byte) -127, ((roa) this).field_r, 5);
              if (param1 > 3) {
                break L1;
              } else {
                boolean discarded$2 = this.a((byte) 22);
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
            stackOut_3_1 = new StringBuilder().append("roa.M(");
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        if (param1 <= 11) {
            return;
        }
        ((roa) this).field_v = param0;
    }

    final up b(byte param0) {
        if (param0 != -16) {
            ((roa) this).a(6, true);
            return ((roa) this).field_f;
        }
        return ((roa) this).field_f;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        if (!param1) {
          ((roa) this).field_q = ((roa) this).field_p;
          var3 = -22 / ((46 - param0) / 36);
          return;
        } else {
          ((roa) this).field_q = -1;
          var3 = -22 / ((46 - param0) / 36);
          return;
        }
    }

    final void c(int param0) {
        if (!(((roa) this).field_v <= 0)) {
            ((roa) this).field_v = ((roa) this).field_v - 1;
        }
        if (param0 >= -1) {
            ((roa) this).field_w = -55;
            return;
        }
    }

    final void b(int param0, boolean param1) {
        if (param1) {
            ((roa) this).field_f = null;
            ((roa) this).field_v = param0;
            return;
        }
        ((roa) this).field_v = param0;
    }

    final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 12111) {
          if (!this.a((byte) 125)) {
            if (-1 < ((roa) this).field_q) {
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
          ((roa) this).field_f = null;
          if (this.a((byte) 125)) {
            return true;
          } else {
            L0: {
              if (-1 <= ((roa) this).field_q) {
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
            return null;
        }
        return ci.a(((roa) this).field_r, -1);
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
        int stackIn_5_0 = 0;
        ep stackIn_28_0 = null;
        ep stackIn_29_0 = null;
        ep stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        ep stackOut_27_0 = null;
        ep stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        ep stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 < ((roa) this).field_v) {
                break L1;
              } else {
                if (!((roa) this).a(12111)) {
                  break L1;
                } else {
                  L2: {
                    var11_int = hua.a((byte) 122, param0 >> 2);
                    if (!param9) {
                      break L2;
                    } else {
                      ((roa) this).field_w = 123;
                      break L2;
                    }
                  }
                  L3: {
                    var12 = bua.a(0, param0 >> 2);
                    var13 = param3 + gqa.a(var11_int, (byte) 24, param8);
                    var14 = param4 - -gqa.a(var12, (byte) 24, param8);
                    if (!((roa) this).field_m) {
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
                    if (((roa) this).field_g <= var16) {
                      L5: {
                        ((roa) this).field_v = ((roa) this).field_h;
                        if (((roa) this).field_q > 0) {
                          ((roa) this).field_q = ((roa) this).field_q - 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (((roa) this).field_e) {
                          param5.b(false).a((byte) 89, param1, var14, var13, param0);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      param5.a(param4, param3, ((roa) this).field_o, param1, (byte) 6);
                      stackOut_43_0 = 1;
                      stackIn_44_0 = stackOut_43_0;
                      break L0;
                    } else {
                      L7: {
                        var17 = param0;
                        if (0 >= ((roa) this).field_s) {
                          break L7;
                        } else {
                          var17 = var17 + (var15.a(((roa) this).field_s, 0) + -(((roa) this).field_s / 2));
                          break L7;
                        }
                      }
                      L8: {
                        var18 = hua.a((byte) 110, var17 >> 2);
                        var19 = bua.a(0, var17 >> 2);
                        var20 = ((roa) this).field_n;
                        if (((roa) this).field_w > 0) {
                          var20 = var20 + var15.a(((roa) this).field_w, 0);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        var21 = param6 + gqa.a(var18, (byte) 24, var20);
                        var22 = param7 + gqa.a(var19, (byte) 24, var20);
                        var23 = param5.a(var14, var13, 127, param1);
                        var23.a(((roa) this).field_a, param5, ((roa) this).field_l, 66, ((roa) this).field_b, ((roa) this).field_k);
                        var23.b(var21, var22, (byte) -92);
                        var24 = var15.a(8192, 0);
                        if (3 == ((roa) this).field_b) {
                          var25 = -512 + var15.a(1024, 0);
                          var23.b(7, var25, var24);
                          break L9;
                        } else {
                          if (((roa) this).field_b != 2) {
                            break L9;
                          } else {
                            var23.b(7, 128, var24);
                            break L9;
                          }
                        }
                      }
                      L10: {
                        var23.a(-126, new up(param2, ((roa) this).field_f));
                        if (((roa) this).field_i == -1) {
                          break L10;
                        } else {
                          var23.a(((roa) this).field_i, -38);
                          break L10;
                        }
                      }
                      L11: {
                        if (!((roa) this).field_x) {
                          break L11;
                        } else {
                          var23.b(true, 101);
                          break L11;
                        }
                      }
                      L12: {
                        if (!((roa) this).field_c) {
                          break L12;
                        } else {
                          L13: {
                            stackOut_27_0 = (ep) var23;
                            stackIn_29_0 = stackOut_27_0;
                            stackIn_28_0 = stackOut_27_0;
                            if (param9) {
                              stackOut_29_0 = (ep) (Object) stackIn_29_0;
                              stackOut_29_1 = 0;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              break L13;
                            } else {
                              stackOut_28_0 = (ep) (Object) stackIn_28_0;
                              stackOut_28_1 = 1;
                              stackIn_30_0 = stackOut_28_0;
                              stackIn_30_1 = stackOut_28_1;
                              break L13;
                            }
                          }
                          ((ep) (Object) stackIn_30_0).a(stackIn_30_1 != 0, true);
                          break L12;
                        }
                      }
                      L14: {
                        if (!((roa) this).field_j) {
                          break L14;
                        } else {
                          var23.c(true, true);
                          break L14;
                        }
                      }
                      L15: {
                        if (((roa) this).field_y) {
                          var23.b(-1, true);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var23.field_m = ((roa) this).field_t;
                      var16++;
                      continue L4;
                    }
                  }
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var11 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var11;
            stackOut_45_1 = new StringBuilder().append("roa.F(").append(param0).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L16;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L16;
            }
          }
          L17: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param5 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L17;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L17;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        return stackIn_44_0 != 0;
    }

    private final boolean a(byte param0) {
        if (param0 < 99) {
            return false;
        }
        return ((roa) this).field_q == -1 ? true : false;
    }

    roa() {
        ((roa) this).field_i = -1;
        ((roa) this).field_o = -1;
        ((roa) this).field_g = 1;
        ((roa) this).field_t = -1;
        ((roa) this).field_y = true;
        ((roa) this).field_a = 524288;
        ((roa) this).field_n = 524288;
        ((roa) this).field_k = 100;
        ((roa) this).field_l = 524288;
    }

    final int a(boolean param0) {
        if (!param0) {
            up discarded$0 = ((roa) this).b((byte) -20);
            return ((roa) this).field_h;
        }
        return ((roa) this).field_h;
    }

    static {
    }
}
