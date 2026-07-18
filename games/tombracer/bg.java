/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends wda {
    private int field_q;
    static String field_p;
    static iu field_s;
    private boolean field_u;
    private int field_v;
    static int field_t;
    private boolean field_r;
    private ir field_o;

    final void b(byte param0) {
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
        hca var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var3 = -93 % ((param0 - -69) / 42);
        var14 = ((bg) this).field_n.H(-122);
        if (var14.u(-25561)) {
          return;
        } else {
          ((bg) this).field_o.field_f = var14.d(3);
          ((bg) this).field_o.field_d = var14.e(9648);
          ((bg) this).field_n.a(((bg) this).field_o, 30);
          var4 = ((bg) this).field_o.field_f - ((bg) this).field_n.s(25745);
          var5 = ((bg) this).field_o.field_d + -((bg) this).field_n.e(false);
          var6 = ((bg) this).field_q >> 16;
          var6 = var6 * var6;
          var7 = (var4 >> 16) * (var4 >> 16) + (var5 >> 16) * (var5 >> 16);
          if (var7 <= var6) {
            return;
          } else {
            if (var4 != 0) {
              L0: {
                if (((bg) this).field_u) {
                  var8 = ua.a(var4, -106);
                  var9 = ua.a(var5, -115);
                  var10 = 0;
                  var11 = 0;
                  if (!((bg) this).field_r) {
                    L1: {
                      if (((bg) this).field_r) {
                        break L1;
                      } else {
                        if (var9 * 4 >= 3 * var8) {
                          break L1;
                        } else {
                          L2: {
                            ((bg) this).field_r = true;
                            if (var4 > 0) {
                              var10 = ((bg) this).field_v;
                              break L2;
                            } else {
                              var10 = -((bg) this).field_v;
                              break L2;
                            }
                          }
                          if (var8 >= ua.a(var10, -103)) {
                            ((bg) this).field_n.a((byte) -120, var10, var11);
                            return;
                          } else {
                            var10 = var4;
                            ((bg) this).field_n.a((byte) -120, var10, var11);
                            return;
                          }
                        }
                      }
                    }
                    L3: {
                      ((bg) this).field_r = false;
                      if (var5 > 0) {
                        var11 = ((bg) this).field_v;
                        break L3;
                      } else {
                        var11 = -((bg) this).field_v;
                        break L3;
                      }
                    }
                    if (var9 < ua.a(var11, 60)) {
                      var11 = var5;
                      ((bg) this).field_n.a((byte) -120, var10, var11);
                      break L0;
                    } else {
                      ((bg) this).field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  } else {
                    if (var8 * 4 >= var9 * 3) {
                      L4: {
                        ((bg) this).field_r = true;
                        if (var4 > 0) {
                          var10 = ((bg) this).field_v;
                          break L4;
                        } else {
                          var10 = -((bg) this).field_v;
                          break L4;
                        }
                      }
                      if (var8 < ua.a(var10, -103)) {
                        var10 = var4;
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      } else {
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    } else {
                      L5: {
                        if (((bg) this).field_r) {
                          break L5;
                        } else {
                          if (var9 * 4 >= 3 * var8) {
                            break L5;
                          } else {
                            L6: {
                              ((bg) this).field_r = true;
                              if (var4 > 0) {
                                var10 = ((bg) this).field_v;
                                break L6;
                              } else {
                                var10 = -((bg) this).field_v;
                                break L6;
                              }
                            }
                            if (var8 < ua.a(var10, -103)) {
                              var10 = var4;
                              ((bg) this).field_n.a((byte) -120, var10, var11);
                              return;
                            } else {
                              ((bg) this).field_n.a((byte) -120, var10, var11);
                              return;
                            }
                          }
                        }
                      }
                      L7: {
                        ((bg) this).field_r = false;
                        if (var5 > 0) {
                          var11 = ((bg) this).field_v;
                          break L7;
                        } else {
                          var11 = -((bg) this).field_v;
                          break L7;
                        }
                      }
                      if (var9 < ua.a(var11, 60)) {
                        var11 = var5;
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      } else {
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    }
                  }
                } else {
                  L8: {
                    if (0 != var4) {
                      break L8;
                    } else {
                      if (var5 == 0) {
                        var5 = 1;
                        break L8;
                      } else {
                        var8 = qva.a((byte) -73, var5, var4);
                        var9 = hua.a((byte) 107, var8 >> 2);
                        var10 = bua.a(0, var8 >> 2);
                        var11 = doa.a(2, ((bg) this).field_v, var9);
                        var12 = doa.a(2, ((bg) this).field_v, var10);
                        ((bg) this).field_n.a((byte) -113, var11, var12);
                        return;
                      }
                    }
                  }
                  var8 = qva.a((byte) -73, var5, var4);
                  var9 = hua.a((byte) 107, var8 >> 2);
                  var10 = bua.a(0, var8 >> 2);
                  var11 = doa.a(2, ((bg) this).field_v, var9);
                  var12 = doa.a(2, ((bg) this).field_v, var10);
                  ((bg) this).field_n.a((byte) -113, var11, var12);
                  break L0;
                }
              }
              return;
            } else {
              if (var5 != 0) {
                L9: {
                  if (((bg) this).field_u) {
                    L10: {
                      L11: {
                        var8 = ua.a(var4, -106);
                        var9 = ua.a(var5, -115);
                        var10 = 0;
                        var11 = 0;
                        if (!((bg) this).field_r) {
                          break L11;
                        } else {
                          if (var8 * 4 >= var9 * 3) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if (((bg) this).field_r) {
                          break L12;
                        } else {
                          if (var9 * 4 >= 3 * var8) {
                            break L12;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        ((bg) this).field_r = false;
                        if (var5 > 0) {
                          var11 = ((bg) this).field_v;
                          break L13;
                        } else {
                          var11 = -((bg) this).field_v;
                          break L13;
                        }
                      }
                      if (var9 < ua.a(var11, 60)) {
                        var11 = var5;
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        break L9;
                      } else {
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    }
                    L14: {
                      ((bg) this).field_r = true;
                      if (var4 > 0) {
                        var10 = ((bg) this).field_v;
                        break L14;
                      } else {
                        var10 = -((bg) this).field_v;
                        break L14;
                      }
                    }
                    if (var8 < ua.a(var10, -103)) {
                      var10 = var4;
                      ((bg) this).field_n.a((byte) -120, var10, var11);
                      return;
                    } else {
                      ((bg) this).field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  } else {
                    L15: {
                      if (0 != var4) {
                        break L15;
                      } else {
                        if (var5 == 0) {
                          var5 = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var8 = qva.a((byte) -73, var5, var4);
                    var9 = hua.a((byte) 107, var8 >> 2);
                    var10 = bua.a(0, var8 >> 2);
                    var11 = doa.a(2, ((bg) this).field_v, var9);
                    var12 = doa.a(2, ((bg) this).field_v, var10);
                    ((bg) this).field_n.a((byte) -113, var11, var12);
                    break L9;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        ((bg) this).field_q = param1;
        int var3 = 108 / ((param0 - -57) / 33);
    }

    final void a(kh param0, byte param1) {
        if (param1 >= -78) {
            return;
        }
        try {
            super.a(param0, (byte) -83);
            param0.a((byte) -128, ((bg) this).field_q >> 16, 10);
            param0.a((byte) -25, ((bg) this).b(0, ((bg) this).field_v), 8);
            param0.a((byte) -128, ((bg) this).field_u ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bg.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bg(la param0, boolean param1) {
        super(param0, param1);
        ((bg) this).field_r = true;
        ((bg) this).field_o = new ir();
        try {
            ((bg) this).field_q = 1048576;
            ((bg) this).field_v = 131072;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        ((bg) this).field_r = true;
        ((bg) this).field_o = new ir();
        try {
          L0: {
            L1: {
              ((bg) this).field_q = param1.b((byte) 44, 10) << 16;
              if (7 < param0.field_E) {
                ((bg) this).field_v = ((bg) this).a(param1.b((byte) 44, 8), false);
                break L1;
              } else {
                ((bg) this).field_v = param1.b((byte) 44, 4) << 16;
                break L1;
              }
            }
            L2: {
              if (((bg) this).c(true).field_E < 3) {
                ((bg) this).field_u = false;
                break L2;
              } else {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (1 == param1.b((byte) 44, 1)) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((bg) this).field_u = stackIn_8_1 != 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("bg.<init>(");
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            ((bg) this).field_q = 125;
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 75, param1, ((bg) this).field_v);
        if (param0 != 0) {
            int discarded$0 = ((bg) this).a(-97, -102);
            return param1;
        }
        return param1;
    }

    final void a(boolean param0, int param1) {
        ((bg) this).field_v = param1;
        if (param0) {
            field_p = null;
        }
    }

    public static void e(byte param0) {
        field_s = null;
        field_p = null;
    }

    final void a(int param0, fsa param1) {
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
              super.a(66, param1);
              if (param0 > 35) {
                break L1;
              } else {
                ((bg) this).c(65, 104);
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
            stackOut_3_1 = new StringBuilder().append("bg.F(").append(param0).append(',');
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

    final int c(int param0) {
        if (param0 != 1) {
            ((bg) this).b((byte) -128);
            return 1;
        }
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Play free version";
    }
}
