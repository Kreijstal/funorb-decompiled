/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu {
    static tp field_e;
    static int field_a;
    private tc field_c;
    private at field_b;
    static String field_d;
    private bb field_f;
    static je field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException decompiledCaughtException = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = op.field_c[0][param1];
            var6 = var5_int << 1 & 105984 | (13566159 & var5_int) << 1;
            param0 += 16;
            var7 = 3;
            if (param3 >= 62) {
              L1: {
                if (cu.field_a) {
                  break L1;
                } else {
                  var7 = 2;
                  break L1;
                }
              }
              var8 = -64;
              L2: while (true) {
                if (var8 >= 16) {
                  if (!cu.field_a) {
                    return;
                  } else {
                    var8 = -59;
                    L3: while (true) {
                      if (8 <= var8) {
                        break L0;
                      } else {
                        L4: {
                          var9 = var8;
                          if (var9 < 0) {
                            var9 = 256 - -(var9 << 2);
                            break L4;
                          } else {
                            var9 = -(var9 * var9 << 3) + 256;
                            break L4;
                          }
                        }
                        var10 = var8 / 4;
                        var11 = param0 + (-var10 + -16 + -var8 / 2 << 16 >> 16);
                        var12 = param4 - -(var8 * 2);
                        var13 = 1 + var9 / 5 - var10;
                        var14 = var9 >> 3;
                        qn.c(var11, var12, var13, var6, var14);
                        qn.c(var11, 1 + var12, var13, var6, var14);
                        var15 = var11;
                        var15 = var15 + var11 >> 1 << 8;
                        var16 = (var13 << 8) / 6;
                        var17 = var15 - (-(var16 / 2) - (4 * ae.b(var8 + param2 << 4, 100) >> 8));
                        var18 = var9 >> 4;
                        var19 = 0;
                        L5: while (true) {
                          if (3 <= var19) {
                            var17 = var16 / 4 + var15 - -(var16 / 2);
                            var16 = var16 / 2;
                            var19 = 0;
                            L6: while (true) {
                              if (var19 >= 3) {
                                var8++;
                                continue L3;
                              } else {
                                qn.c(var17 >> 8, var12, var16 >> 8, var5_int, var18);
                                qn.c(var17 >> 8, 1 + var12, var16 >> 8, var5_int, var18);
                                var17 = var17 + 4 * var16;
                                var19++;
                                continue L6;
                              }
                            }
                          } else {
                            qn.c(var17 >> 8, var12, var16 >> 8, var5_int, var18);
                            qn.c(var17 >> 8, 1 + var12, var16 >> 8, var5_int, var18);
                            var17 = var17 + var16 * 2;
                            var19++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L7: {
                    var9 = var8;
                    if (var9 >= 0) {
                      var9 = 256 + -(var9 * var9 << 3);
                      break L7;
                    } else {
                      var9 = (var9 << 2) + 256;
                      break L7;
                    }
                  }
                  var10 = var8 / 4;
                  var11 = (-var10 + -16 + -var8 / 2 << 16 >> 16) + param0;
                  var12 = param4 + var8 * 2;
                  var13 = -var10 + (var9 / 5 - -1);
                  var14 = var9 >> var7;
                  qn.c(var11, var12, var13, var6, var14);
                  qn.c(var11, var12 - -1, var13, var6, var14);
                  var15 = var11;
                  var15 = var11 + var15 >> 1 << 8;
                  var16 = (var13 << 8) / 6;
                  var17 = var16 / 2 + (var15 - -(g.a(-1, param2 + var8 << 5) * 4 >> 8));
                  var18 = var9 >> 3;
                  var19 = 0;
                  L8: while (true) {
                    if (3 <= var19) {
                      var17 = var16 / 4 + (var16 / 2 + var15);
                      var16 = var16 / 2;
                      var19 = 0;
                      L9: while (true) {
                        if (var19 >= 3) {
                          var8++;
                          continue L2;
                        } else {
                          qn.c(var17 >> 8, var12, var16 >> 8, var5_int, var18);
                          qn.c(var17 >> 8, 1 + var12, var16 >> 8, var5_int, var18);
                          var17 = var17 + var16 * 4;
                          var19++;
                          continue L9;
                        }
                      }
                    } else {
                      qn.c(var17 >> 8, var12, var16 >> 8, var5_int, var18);
                      qn.c(var17 >> 8, 1 + var12, var16 >> 8, var5_int, var18);
                      var17 = var17 + 2 * var16;
                      var19++;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "eu.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final tc d(byte param0) {
        if (param0 < 42) {
            Object var3 = null;
            ((eu) this).a(57, (jd) null);
        }
        return ((eu) this).field_c;
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 != -55) {
            eu.a((byte) 5);
        }
        field_e = null;
    }

    private final boolean c(byte param0) {
        L0: {
          if (null == ((eu) this).field_c) {
            break L0;
          } else {
            if (((eu) this).field_c.field_b == null) {
              break L0;
            } else {
              if (param0 == -33) {
                return false;
              } else {
                field_g = null;
                return false;
              }
            }
          }
        }
        ((eu) this).field_c = null;
        return true;
    }

    final void a(int param0, jd param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param0 <= -90) {
              L1: {
                if ((Object) (Object) ((eu) this).field_c != (Object) (Object) param1) {
                  ((eu) this).field_c = (tc) (Object) param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("eu.E(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(int param0) {
        if (param0 <= 11) {
            ((eu) this).field_f = null;
        }
        int discarded$0 = 10201;
        this.c();
        if (null != ((eu) this).field_c) {
            tc discarded$1 = ((eu) this).field_f.a(((eu) this).field_c, true);
            ((eu) this).field_c = ((eu) this).field_f.b(50);
        }
        if (((eu) this).field_c == null) {
            ((eu) this).field_c = ((eu) this).field_f.c(50);
        }
    }

    final int b(byte param0) {
        if (param0 <= 31) {
            int discarded$0 = ((eu) this).b((byte) 71);
        }
        return ((eu) this).field_b.b(false);
    }

    final static void a(int param0, int param1, int param2, jd param3) {
        try {
            int discarded$0 = 2;
            cd.a(27, param2 + -16, param1);
            int var4_int = 110 / ((49 - param0) / 39);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "eu.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        int discarded$0 = 10201;
        this.c();
        if (null != ((eu) this).field_c) {
            tc discarded$1 = ((eu) this).field_f.a(false, ((eu) this).field_c);
            ((eu) this).field_c = ((eu) this).field_f.b((byte) -112);
        }
        if (param0 >= -50) {
            boolean discarded$2 = this.c((byte) 124);
        }
        if (!(((eu) this).field_c != null)) {
            ((eu) this).field_c = ((eu) this).field_f.a(50);
        }
    }

    private final void c() {
        if (!(!this.c((byte) -33))) {
            ((eu) this).field_f = new bb(((eu) this).field_b);
        }
    }

    eu(at param0) {
        try {
            ((eu) this).field_b = param0;
            ((eu) this).field_f = new bb(((eu) this).field_b);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "eu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Secret achievement";
        field_a = 20;
    }
}
