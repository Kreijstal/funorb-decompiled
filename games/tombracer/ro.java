/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends wda {
    private int field_v;
    static String field_q;
    private int field_w;
    private boolean field_s;
    private gea field_t;
    private boolean field_o;
    private boolean field_u;
    private int field_r;
    static int field_p;

    final int c(int param0) {
        if (param0 != 1) {
            return 10;
        }
        return 5;
    }

    final void a(boolean param0, int param1) {
        ((ro) this).field_o = param0 ? true : false;
        if (param1 != -606738686) {
            ((ro) this).b((byte) -25);
        }
    }

    ro(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        gea stackIn_6_0 = null;
        gea stackIn_7_0 = null;
        gea stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        gea stackOut_5_0 = null;
        gea stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        gea stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((ro) this).field_s = false;
        try {
          L0: {
            L1: {
              ((ro) this).field_t = new gea(param0.field_E, param1);
              if (7 < param0.field_E) {
                ((ro) this).field_r = ((ro) this).a(param1.b((byte) 44, 8), false);
                break L1;
              } else {
                ((ro) this).field_r = param1.b((byte) 44, 4) << 16;
                break L1;
              }
            }
            L2: {
              if (param0.field_E >= 11) {
                break L2;
              } else {
                L3: {
                  stackOut_5_0 = ((ro) this).field_t;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (1 != param1.b((byte) 44, 1)) {
                    stackOut_7_0 = (gea) (Object) stackIn_7_0;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = (gea) (Object) stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((gea) (Object) stackIn_8_0).a(stackIn_8_1 != 0, 1);
                break L2;
              }
            }
            L4: {
              if (param0.field_E < 12) {
                break L4;
              } else {
                L5: {
                  stackOut_10_0 = this;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (param1.b((byte) 44, 1) != 1) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L5;
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L5;
                  }
                }
                ((ro) this).field_o = stackIn_13_1 != 0;
                if (!((ro) this).field_o) {
                  break L4;
                } else {
                  L6: {
                    stackOut_14_0 = this;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (param1.b((byte) 44, 1) != 1) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L6;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L6;
                    }
                  }
                  ((ro) this).field_u = stackIn_17_1 != 0;
                  ((ro) this).field_v = param1.b((byte) 44, 12);
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ro.<init>(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 4) {
            return;
        }
        ((ro) this).field_u = param1 ? true : false;
    }

    final void b(byte param0) {
        int[][] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[][] var15 = null;
        int[][] var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        if (!((ro) this).field_t.a(-4075)) {
          var19 = ((ro) this).field_t.c(-2);
          var18 = var19;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var2 = var15;
          var3 = 45 / ((-69 - param0) / 42);
          if (var19.length <= ((ro) this).field_w) {
            ((ro) this).field_w = 0;
            if (!((ro) this).field_t.a((byte) 21)) {
              var4 = var15[((ro) this).field_w][0] - -((ro) this).d((byte) -70);
              var5 = var15[((ro) this).field_w][1] - -((ro) this).a(false);
              var6 = -((ro) this).field_n.s(25745) + var4;
              var7 = var5 + -((ro) this).field_n.e(false);
              var8 = ((ro) this).field_r >> 16;
              var8 = var8 * var8;
              var9 = (var6 >> 16) * (var6 >> 16) - -((var7 >> 16) * (var7 >> 16));
              if (var9 > var8) {
                var10 = qva.a((byte) -99, var7, var6);
                if (((ro) this).field_o) {
                  if (((ro) this).field_s) {
                    var11 = cf.a(8192, -16390, var10, ((ro) this).field_n.g(-25787));
                    var12 = ua.a(var11, 39);
                    if (((ro) this).field_v != 0) {
                      if (var12 > ((ro) this).field_v) {
                        ((ro) this).field_n.c(false, -lw.a(var11, (byte) -76) * ((ro) this).field_v);
                        if (!((ro) this).field_u) {
                          var11 = hua.a((byte) 126, var10 >> 2);
                          var12 = bua.a(0, var10 >> 2);
                          var13 = doa.a(2, ((ro) this).field_r, var11);
                          var14 = doa.a(2, ((ro) this).field_r, var12);
                          ((ro) this).field_n.a((byte) -77, var13, var14);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((ro) this).field_n.c(false, -var11);
                        ((ro) this).field_s = false;
                        var11 = hua.a((byte) 126, var10 >> 2);
                        var12 = bua.a(0, var10 >> 2);
                        var13 = doa.a(2, ((ro) this).field_r, var11);
                        var14 = doa.a(2, ((ro) this).field_r, var12);
                        ((ro) this).field_n.a((byte) -77, var13, var14);
                        return;
                      }
                    } else {
                      ((ro) this).field_n.c(false, -var11);
                      ((ro) this).field_s = false;
                      var11 = hua.a((byte) 126, var10 >> 2);
                      var12 = bua.a(0, var10 >> 2);
                      var13 = doa.a(2, ((ro) this).field_r, var11);
                      var14 = doa.a(2, ((ro) this).field_r, var12);
                      ((ro) this).field_n.a((byte) -77, var13, var14);
                      return;
                    }
                  } else {
                    var11 = hua.a((byte) 126, var10 >> 2);
                    var12 = bua.a(0, var10 >> 2);
                    var13 = doa.a(2, ((ro) this).field_r, var11);
                    var14 = doa.a(2, ((ro) this).field_r, var12);
                    ((ro) this).field_n.a((byte) -77, var13, var14);
                    return;
                  }
                } else {
                  var11 = hua.a((byte) 126, var10 >> 2);
                  var12 = bua.a(0, var10 >> 2);
                  var13 = doa.a(2, ((ro) this).field_r, var11);
                  var14 = doa.a(2, ((ro) this).field_r, var12);
                  ((ro) this).field_n.a((byte) -77, var13, var14);
                  return;
                }
              } else {
                ((ro) this).field_n.a((byte) -112, var6, var7);
                ((ro) this).field_s = true;
                ((ro) this).field_w = ((ro) this).field_w + 1;
                return;
              }
            } else {
              ((ro) this).field_j = true;
              return;
            }
          } else {
            var4 = var15[((ro) this).field_w][0] - -((ro) this).d((byte) -70);
            var5 = var15[((ro) this).field_w][1] - -((ro) this).a(false);
            var6 = -((ro) this).field_n.s(25745) + var4;
            var7 = var5 + -((ro) this).field_n.e(false);
            var8 = ((ro) this).field_r >> 16;
            var8 = var8 * var8;
            var9 = (var6 >> 16) * (var6 >> 16) - -((var7 >> 16) * (var7 >> 16));
            if (var9 > var8) {
              var10 = qva.a((byte) -99, var7, var6);
              if (((ro) this).field_o) {
                if (((ro) this).field_s) {
                  var11 = cf.a(8192, -16390, var10, ((ro) this).field_n.g(-25787));
                  var12 = ua.a(var11, 39);
                  if (((ro) this).field_v != 0) {
                    if (var12 > ((ro) this).field_v) {
                      ((ro) this).field_n.c(false, -lw.a(var11, (byte) -76) * ((ro) this).field_v);
                      if (!((ro) this).field_u) {
                        var11 = hua.a((byte) 126, var10 >> 2);
                        var12 = bua.a(0, var10 >> 2);
                        var13 = doa.a(2, ((ro) this).field_r, var11);
                        var14 = doa.a(2, ((ro) this).field_r, var12);
                        ((ro) this).field_n.a((byte) -77, var13, var14);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((ro) this).field_n.c(false, -var11);
                      ((ro) this).field_s = false;
                      var11 = hua.a((byte) 126, var10 >> 2);
                      var12 = bua.a(0, var10 >> 2);
                      var13 = doa.a(2, ((ro) this).field_r, var11);
                      var14 = doa.a(2, ((ro) this).field_r, var12);
                      ((ro) this).field_n.a((byte) -77, var13, var14);
                      return;
                    }
                  } else {
                    ((ro) this).field_n.c(false, -var11);
                    ((ro) this).field_s = false;
                    var11 = hua.a((byte) 126, var10 >> 2);
                    var12 = bua.a(0, var10 >> 2);
                    var13 = doa.a(2, ((ro) this).field_r, var11);
                    var14 = doa.a(2, ((ro) this).field_r, var12);
                    ((ro) this).field_n.a((byte) -77, var13, var14);
                    return;
                  }
                } else {
                  var11 = hua.a((byte) 126, var10 >> 2);
                  var12 = bua.a(0, var10 >> 2);
                  var13 = doa.a(2, ((ro) this).field_r, var11);
                  var14 = doa.a(2, ((ro) this).field_r, var12);
                  ((ro) this).field_n.a((byte) -77, var13, var14);
                  return;
                }
              } else {
                var11 = hua.a((byte) 126, var10 >> 2);
                var12 = bua.a(0, var10 >> 2);
                var13 = doa.a(2, ((ro) this).field_r, var11);
                var14 = doa.a(2, ((ro) this).field_r, var12);
                ((ro) this).field_n.a((byte) -77, var13, var14);
                return;
              }
            } else {
              ((ro) this).field_n.a((byte) -112, var6, var7);
              ((ro) this).field_s = true;
              ((ro) this).field_w = ((ro) this).field_w + 1;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1) {
        ((ro) this).field_v = param0;
        int var3 = 18 % ((37 - param1) / 55);
    }

    final void b(int param0) {
        if (param0 != 1) {
            int discarded$0 = ((ro) this).e(91);
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 98, param1, ((ro) this).field_r);
        param1 = fs.a((byte) 26, param1, ((ro) this).field_w);
        if (param0 != 0) {
          field_q = null;
          return param1;
        } else {
          return param1;
        }
    }

    final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        kh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        kh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        kh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -91);
              if (param1 < -78) {
                break L1;
              } else {
                ((ro) this).field_o = true;
                break L1;
              }
            }
            L2: {
              ((ro) this).field_t.a(param0, 0);
              param0.a((byte) 54, ((ro) this).b(0, ((ro) this).field_r), 8);
              stackOut_2_0 = (kh) param0;
              stackOut_2_1 = -127;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (((ro) this).field_o) {
                stackOut_4_0 = (kh) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L2;
              } else {
                stackOut_3_0 = (kh) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L2;
              }
            }
            L3: {
              ((kh) (Object) stackIn_5_0).a((byte) stackIn_5_1, stackIn_5_2, 1);
              if (!((ro) this).field_o) {
                break L3;
              } else {
                L4: {
                  stackOut_6_0 = (kh) param0;
                  stackOut_6_1 = -126;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (!((ro) this).field_u) {
                    stackOut_8_0 = (kh) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L4;
                  } else {
                    stackOut_7_0 = (kh) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L4;
                  }
                }
                ((kh) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2, 1);
                param0.a((byte) -128, ((ro) this).field_v, 12);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("ro.R(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, gea param1) {
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
              ((ro) this).field_t = param1;
              if (param0 >= 6) {
                break L1;
              } else {
                field_q = null;
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
            stackOut_3_1 = new StringBuilder().append("ro.HA(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    ro(la param0, boolean param1) {
        super(param0, param1);
        ((ro) this).field_s = false;
        try {
            ((ro) this).field_t = new gea();
            ((ro) this).field_r = 131072;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param2) {
              stackOut_5_0 = qt.field_a.b(param1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = bfa.field_c.b(param1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ro.O(").append(-116).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final int e(int param0) {
        if (param0 < 2) {
            field_q = null;
            return ((ro) this).field_r;
        }
        return ((ro) this).field_r;
    }

    public static void f(int param0) {
        field_q = null;
    }

    final void c(byte param0) {
        if (param0 > -116) {
          ((ro) this).field_w = -124;
          super.c((byte) -119);
          ((ro) this).field_t.a(true);
          return;
        } else {
          super.c((byte) -119);
          ((ro) this).field_t.a(true);
          return;
        }
    }

    final void a(byte param0, int param1) {
        ((ro) this).field_r = param1;
        int var3 = 84 % ((-37 - param0) / 46);
    }

    final int d(boolean param0) {
        if (param0) {
            ((ro) this).field_r = -121;
            return ((ro) this).field_w;
        }
        return ((ro) this).field_w;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Enter name of friend to delete from list";
    }
}
