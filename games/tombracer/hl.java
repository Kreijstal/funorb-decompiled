/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;

abstract class hl implements mta {
    private jaclib.memory.heap.NativeHeapBuffer field_b;
    private int field_f;
    static String field_i;
    static String field_a;
    kda field_h;
    private int field_g;
    private int field_e;
    private int field_k;
    static oc[] field_c;
    private int field_d;
    private boolean field_j;

    final jaclib.memory.Buffer a(jaggl.MapBuffer param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_10_0 = null;
        jaggl.MapBuffer stackIn_16_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        jaclib.memory.heap.NativeHeapBuffer stackOut_17_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackOut_9_0 = null;
        jaggl.MapBuffer stackOut_15_0 = null;
        Object stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (((hl) this).field_e == 0) {
                this.d(1);
                if (0 >= ((hl) this).field_f) {
                  ((hl) this).field_e = 2;
                  stackOut_17_0 = ((hl) this).field_b;
                  stackIn_18_0 = stackOut_17_0;
                  return (jaclib.memory.Buffer) (Object) stackIn_18_0;
                } else {
                  L2: {
                    jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
                    if (param1) {
                      L3: {
                        stackOut_5_0 = ((hl) this).field_k;
                        stackOut_5_1 = ((hl) this).field_d;
                        stackOut_5_2 = null;
                        stackOut_5_3 = 0;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        stackIn_6_2 = stackOut_5_2;
                        stackIn_6_3 = stackOut_5_3;
                        if (!((hl) this).field_j) {
                          stackOut_7_0 = stackIn_7_0;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = stackIn_7_2;
                          stackOut_7_3 = stackIn_7_3;
                          stackOut_7_4 = 35044;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          stackIn_8_3 = stackOut_7_3;
                          stackIn_8_4 = stackOut_7_4;
                          break L3;
                        } else {
                          stackOut_6_0 = stackIn_6_0;
                          stackOut_6_1 = stackIn_6_1;
                          stackOut_6_2 = stackIn_6_2;
                          stackOut_6_3 = stackIn_6_3;
                          stackOut_6_4 = 35040;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          stackIn_8_3 = stackOut_6_3;
                          stackIn_8_4 = stackOut_6_4;
                          break L3;
                        }
                      }
                      jaggl.OpenGL.glBufferDataARBub(stackIn_8_0, stackIn_8_1, (byte[]) (Object) stackIn_8_2, stackIn_8_3, stackIn_8_4);
                      if (((hl) this).field_h.field_o.c < ((hl) this).field_g) {
                        break L2;
                      } else {
                        ((hl) this).field_e = 1;
                        stackOut_9_0 = ((hl) this).field_h.field_o;
                        stackIn_10_0 = stackOut_9_0;
                        return (jaclib.memory.Buffer) (Object) stackIn_10_0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (!param0.b()) {
                    if (param0.a(((hl) this).field_k, ((hl) this).field_g, 35001)) {
                      ((hl) this).field_e = 2;
                      stackOut_15_0 = (jaggl.MapBuffer) param0;
                      stackIn_16_0 = stackOut_15_0;
                      return (jaclib.memory.Buffer) (Object) stackIn_16_0;
                    } else {
                      break L1;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                break L1;
              }
            }
            stackOut_19_0 = null;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("hl.O(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 44 + 1 + 41);
        }
        return (jaclib.memory.Buffer) (Object) stackIn_20_0;
    }

    private final void d(int param0) {
        if (!(0 > ((hl) this).field_f)) {
            return;
        }
        if (param0 != 1) {
            this.d(14);
        }
        if (((hl) this).field_h.field_fd) {
            jaggl.OpenGL.glGenBuffersARB(1, uqa.field_x, 0);
            ((hl) this).field_f = uqa.field_x[0];
            jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
        } else {
            ((hl) this).field_f = 0;
        }
    }

    protected final void finalize() throws Throwable {
        ((hl) this).a(12574);
        super.finalize();
    }

    final void c(int param0) {
        if (param0 != -3) {
            return;
        }
        if (((hl) this).field_h.field_fd) {
            jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var47 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = 0;
              var9 = param7;
              var10 = 0;
              var11 = -param6 + param5;
              var12 = param7 - param6;
              var13 = param5 * param5;
              var14 = param7 * param7;
              var15 = var11 * var11;
              var16 = var12 * var12;
              var17 = var14 << 1;
              if (param4) {
                break L1;
              } else {
                hl.a(-80, 16, -30, 69, false, -29, -88, -33);
                break L1;
              }
            }
            L2: {
              L3: {
                var18 = var13 << 1;
                var19 = var16 << 1;
                var20 = var15 << 1;
                var21 = param7 << 1;
                var22 = var12 << 1;
                var23 = var17 + (1 + -var21) * var13;
                var24 = var14 - var18 * (var21 + -1);
                var25 = (1 + -var22) * var15 + var19;
                var26 = -(var20 * (var22 + -1)) + var16;
                var27 = var13 << 2;
                var28 = var14 << 2;
                var29 = var15 << 2;
                var30 = var16 << 2;
                var31 = 3 * var17;
                var32 = (-3 + var21) * var18;
                var33 = 3 * var19;
                var34 = var20 * (-3 + var22);
                var35 = var28;
                var36 = var27 * (-1 + param7);
                var37 = var30;
                var38 = var29 * (var12 - 1);
                if (~gca.field_d < ~param2) {
                  break L3;
                } else {
                  if (hc.field_h >= param2) {
                    var57 = vaa.field_a[param2];
                    var40 = rp.a(ss.field_c, -16226, pka.field_b, -param5 + param3);
                    var41 = rp.a(ss.field_c, -16226, pka.field_b, param5 + param3);
                    var42 = rp.a(ss.field_c, -16226, pka.field_b, param3 + -var11);
                    var43 = rp.a(ss.field_c, -16226, pka.field_b, param3 + var11);
                    nra.a((byte) -55, param0, var42, var57, var40);
                    nra.a((byte) -55, param1, var43, var57, var42);
                    nra.a((byte) -55, param0, var41, var57, var43);
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              break L2;
            }
            L4: while (true) {
              if (var9 <= 0) {
                break L0;
              } else {
                L5: {
                  if (var9 > var12) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L5;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L5;
                  }
                }
                L6: {
                  var39 = stackIn_12_0;
                  if (var39 != 0) {
                    L7: {
                      if (var25 >= 0) {
                        break L7;
                      } else {
                        L8: while (true) {
                          if (var25 >= 0) {
                            break L7;
                          } else {
                            var26 = var26 + var37;
                            var25 = var25 + var33;
                            var37 = var37 + var30;
                            var10++;
                            var33 = var33 + var30;
                            continue L8;
                          }
                        }
                      }
                    }
                    L9: {
                      if (var26 < 0) {
                        var25 = var25 + var33;
                        var26 = var26 + var37;
                        var10++;
                        var37 = var37 + var30;
                        var33 = var33 + var30;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var26 = var26 + -var34;
                    var25 = var25 + -var38;
                    var38 = var38 - var29;
                    var34 = var34 - var29;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L10: {
                  if (var23 < 0) {
                    L11: while (true) {
                      if (0 <= var23) {
                        break L10;
                      } else {
                        var23 = var23 + var31;
                        var24 = var24 + var35;
                        var35 = var35 + var28;
                        var31 = var31 + var28;
                        var8_int++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                L12: {
                  if (0 <= var24) {
                    break L12;
                  } else {
                    var24 = var24 + var35;
                    var23 = var23 + var31;
                    var8_int++;
                    var35 = var35 + var28;
                    var31 = var31 + var28;
                    break L12;
                  }
                }
                L13: {
                  var24 = var24 + -var32;
                  var23 = var23 + -var36;
                  var32 = var32 - var27;
                  var9--;
                  var36 = var36 - var27;
                  var40 = -var9 + param2;
                  var41 = param2 + var9;
                  if (~gca.field_d < ~var41) {
                    break L13;
                  } else {
                    if (~hc.field_h > ~var40) {
                      break L13;
                    } else {
                      var42 = rp.a(ss.field_c, -16226, pka.field_b, var8_int + param3);
                      var43 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var8_int);
                      if (var39 != 0) {
                        L14: {
                          var44 = rp.a(ss.field_c, -16226, pka.field_b, param3 - -var10);
                          var45 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var10);
                          if (~var40 <= ~gca.field_d) {
                            var58 = vaa.field_a[var40];
                            nra.a((byte) -55, param0, var45, var58, var43);
                            nra.a((byte) -55, param1, var44, var58, var45);
                            nra.a((byte) -55, param0, var42, var58, var44);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        if (var41 <= hc.field_h) {
                          var59 = vaa.field_a[var41];
                          nra.a((byte) -55, param0, var45, var59, var43);
                          nra.a((byte) -55, param1, var44, var59, var45);
                          nra.a((byte) -55, param0, var42, var59, var44);
                          break L13;
                        } else {
                          continue L4;
                        }
                      } else {
                        L15: {
                          if (var40 < gca.field_d) {
                            break L15;
                          } else {
                            nra.a((byte) -55, param0, var42, vaa.field_a[var40], var43);
                            break L15;
                          }
                        }
                        if (var41 <= hc.field_h) {
                          nra.a((byte) -55, param0, var42, vaa.field_a[var41], var43);
                          continue L4;
                        } else {
                          continue L4;
                        }
                      }
                    }
                  }
                }
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var8, "hl.J(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void e() {
        field_i = null;
        int var1 = 35;
        field_c = null;
        field_a = null;
    }

    void a(int param0) {
        if (param0 != 12574) {
            ((hl) this).a(72);
        }
        if (!(0 >= ((hl) this).field_f)) {
            ((hl) this).field_h.a(((hl) this).field_g, ((hl) this).field_f, (byte) 62);
            ((hl) this).field_f = -1;
        }
    }

    void a(int param0, int param1) {
        if (((hl) this).field_d < param1) {
            this.d(1);
            if (((hl) this).field_f > 0) {
                jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
                jaggl.OpenGL.glBufferDataARBub(((hl) this).field_k, param1, (byte[]) null, 0, !((hl) this).field_j ? 35044 : 35040);
                ((hl) this).field_h.field_X = ((hl) this).field_h.field_X + (-((hl) this).field_d + param1);
            } else {
                ((hl) this).field_b = ((hl) this).field_h.a(false, param1, false);
            }
            ((hl) this).field_d = param1;
        }
        ((hl) this).field_g = param1;
        int var3 = -18 % ((param0 - -30) / 36);
    }

    final boolean a(jaggl.MapBuffer param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 91) {
                break L1;
              } else {
                ((hl) this).field_e = -84;
                break L1;
              }
            }
            L2: {
              var3_int = 1;
              if (-1 != ((hl) this).field_e) {
                L3: {
                  if (-1 >= ((hl) this).field_f) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
                    if (((hl) this).field_e != 1) {
                      L4: {
                        if (!param0.a()) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          break L4;
                        } else {
                          stackOut_8_0 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          break L4;
                        }
                      }
                      var3_int = stackIn_10_0;
                      break L3;
                    } else {
                      jaggl.OpenGL.glBufferSubDataARBa(((hl) this).field_k, 0, ((hl) this).field_d, ((hl) this).field_h.field_o.getAddress());
                      break L3;
                    }
                  }
                }
                ((hl) this).field_e = 0;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_12_0 = var3_int;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("hl.K(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final long b(boolean param0) {
        if (!param0) {
            return -36L;
        }
        return ((hl) this).field_f != 0 ? 0L : ((hl) this).field_b.getAddress();
    }

    hl(kda param0, int param1, boolean param2) {
        ((hl) this).field_f = -1;
        ((hl) this).field_e = 0;
        try {
            ((hl) this).field_k = param1;
            ((hl) this).field_j = param2 ? true : false;
            ((hl) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "RANK";
    }
}
