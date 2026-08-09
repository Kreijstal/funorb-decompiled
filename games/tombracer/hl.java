/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        jaggl.MapBuffer var5 = null;
        int stackIn_9_0;
        int stackIn_9_1;
        Object stackIn_9_2;
        int stackIn_9_3;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        Object stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_12_0 = null;
        jaggl.MapBuffer stackIn_18_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                var5 = (jaggl.MapBuffer) null;
                this.a((jaggl.MapBuffer) null, -94);
                break L1;
              }
            }
            L2: {
              if (this.field_e == 0) {
                this.d(1);
                if (0 >= this.field_f) {
                  this.field_e = 2;
                  stackIn_20_0 = this.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
                    if (param1) {
                      L4: {
                        stackIn_9_0 = this.field_k;

                        stackIn_9_1 = this.field_d;

                        stackIn_9_2 = null;

                        stackIn_9_3 = 0;

                        if (!this.field_j) {
                          stackIn_10_0 = stackIn_9_0;
                          stackIn_10_1 = stackIn_9_1;
                          stackIn_10_2 = stackIn_9_2;
                          stackIn_10_3 = stackIn_9_3;
                          stackIn_10_4 = 35044;
                          break L4;
                        } else {
                          stackIn_10_0 = stackIn_9_0;
                          stackIn_10_1 = stackIn_9_1;
                          stackIn_10_2 = stackIn_9_2;
                          stackIn_10_3 = stackIn_9_3;
                          stackIn_10_4 = 35040;
                          break L4;
                        }
                      }
                      jaggl.OpenGL.glBufferDataARBub(stackIn_10_0, stackIn_10_1, (byte[]) ((Object) stackIn_10_2), stackIn_10_3, stackIn_10_4);
                      if (this.field_h.field_o.c < this.field_g) {
                        break L3;
                      } else {
                        this.field_e = 1;
                        stackIn_12_0 = this.field_h.field_o;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  if (!param0.b()) {
                    if (param0.a(this.field_k, this.field_g, 35001)) {
                      this.field_e = 2;
                      stackIn_18_0 = (jaggl.MapBuffer) (param0);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                break L2;
              }
            }
            stackIn_22_0 = null;
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("hl.O(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jaclib.memory.Buffer) ((Object) stackIn_12_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jaclib.memory.Buffer) ((Object) stackIn_18_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (jaclib.memory.Buffer) ((Object) stackIn_20_0);
            } else {
              return (jaclib.memory.Buffer) ((Object) stackIn_22_0);
            }
          }
        }
    }

    private final void d(int param0) {
        if (!(0 > this.field_f)) {
            return;
        }
        if (param0 != 1) {
            this.d(14);
        }
        if (this.field_h.field_fd) {
            jaggl.OpenGL.glGenBuffersARB(1, uqa.field_x, 0);
            this.field_f = uqa.field_x[0];
            jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
        } else {
            this.field_f = 0;
        }
    }

    protected final void finalize() throws Throwable {
        this.a(12574);
        super.finalize();
    }

    final void c(int param0) {
        if (param0 != -3) {
            return;
        }
        if (this.field_h.field_fd) {
            jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
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
              var17 = var14 << -713296351;
              if (param4) {
                break L1;
              } else {
                hl.a(-80, 16, -30, 69, false, -29, -88, -33);
                break L1;
              }
            }
            L2: {
              var18 = var13 << -146044127;
              var19 = var16 << 1233342305;
              var20 = var15 << 1206563009;
              var21 = param7 << 1140297729;
              var22 = var12 << 700102785;
              var23 = var17 + (1 + -var21) * var13;
              var24 = var14 - var18 * (var21 + -1);
              var25 = (1 + -var22) * var15 + var19;
              var26 = -(var20 * (var22 + -1)) + var16;
              var27 = var13 << 216442178;
              var28 = var14 << 116045154;
              var29 = var15 << 343087554;
              var30 = var16 << -776850750;
              var31 = 3 * var17;
              var32 = (-3 + var21) * var18;
              var33 = 3 * var19;
              var34 = var20 * (-3 + var22);
              var35 = var28;
              var36 = var27 * (-1 + param7);
              var37 = var30;
              var38 = var29 * (var12 - 1);
              if (gca.field_d > param2) {
                break L2;
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
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: while (true) {
              if (-1 <= (var9 ^ -1)) {
                break L0;
              } else {
                L4: {
                  if (var9 > var12) {
                    stackIn_11_0 = 0;
                    break L4;
                  } else {
                    stackIn_11_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var39 = stackIn_11_0;
                  if (var39 != 0) {
                    L6: {
                      if (-1 >= (var25 ^ -1)) {
                        break L6;
                      } else {
                        L7: while (true) {
                          if (-1 >= (var25 ^ -1)) {
                            break L6;
                          } else {
                            var26 = var26 + var37;
                            var25 = var25 + var33;
                            var37 = var37 + var30;
                            var10++;
                            var33 = var33 + var30;
                            continue L7;
                          }
                        }
                      }
                    }
                    L8: {
                      if (-1 < (var26 ^ -1)) {
                        var25 = var25 + var33;
                        var26 = var26 + var37;
                        var10++;
                        var37 = var37 + var30;
                        var33 = var33 + var30;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var26 = var26 + -var34;
                    var25 = var25 + -var38;
                    var38 = var38 - var29;
                    var34 = var34 - var29;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L9: {
                  if (-1 < (var23 ^ -1)) {
                    L10: while (true) {
                      if (0 <= var23) {
                        break L9;
                      } else {
                        var23 = var23 + var31;
                        var24 = var24 + var35;
                        var35 = var35 + var28;
                        var31 = var31 + var28;
                        var8_int++;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                L11: {
                  if (0 <= var24) {
                    break L11;
                  } else {
                    var24 = var24 + var35;
                    var23 = var23 + var31;
                    var8_int++;
                    var35 = var35 + var28;
                    var31 = var31 + var28;
                    break L11;
                  }
                }
                var24 = var24 + -var32;
                var23 = var23 + -var36;
                var32 = var32 - var27;
                var9--;
                var36 = var36 - var27;
                var40 = -var9 + param2;
                var41 = param2 + var9;
                if (gca.field_d > var41) {
                  continue L3;
                } else {
                  if (hc.field_h < var40) {
                    continue L3;
                  } else {
                    var42 = rp.a(ss.field_c, -16226, pka.field_b, var8_int + param3);
                    var43 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var8_int);
                    if (var39 != 0) {
                      L12: {
                        var44 = rp.a(ss.field_c, -16226, pka.field_b, param3 - -var10);
                        var45 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var10);
                        if (var40 >= gca.field_d) {
                          var58 = vaa.field_a[var40];
                          nra.a((byte) -55, param0, var45, var58, var43);
                          nra.a((byte) -55, param1, var44, var58, var45);
                          nra.a((byte) -55, param0, var42, var58, var44);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      if (var41 <= hc.field_h) {
                        var59 = vaa.field_a[var41];
                        nra.a((byte) -55, param0, var45, var59, var43);
                        nra.a((byte) -55, param1, var44, var59, var45);
                        nra.a((byte) -55, param0, var42, var59, var44);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    } else {
                      L13: {
                        if (var40 < gca.field_d) {
                          break L13;
                        } else {
                          nra.a((byte) -55, param0, var42, vaa.field_a[var40], var43);
                          break L13;
                        }
                      }
                      if (var41 <= hc.field_h) {
                        nra.a((byte) -55, param0, var42, vaa.field_a[var41], var43);
                        continue L3;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var8), "hl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void e(int param0) {
        field_i = null;
        int var1 = -35 / ((param0 - -82) / 44);
        field_c = null;
        field_a = null;
    }

    void a(int param0) {
        if (param0 != 12574) {
            this.a(72);
        }
        if (!(0 >= this.field_f)) {
            this.field_h.a(this.field_g, this.field_f, (byte) 62);
            this.field_f = -1;
        }
    }

    void a(int param0, int param1) {
        if (this.field_d < param1) {
            this.d(1);
            if ((this.field_f ^ -1) < -1) {
                jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
                jaggl.OpenGL.glBufferDataARBub(this.field_k, param1, (byte[]) null, 0, !this.field_j ? 35044 : 35040);
                this.field_h.field_X = this.field_h.field_X + (-this.field_d + param1);
            } else {
                this.field_b = this.field_h.a(false, param1, false);
            }
            this.field_d = param1;
        }
        this.field_g = param1;
        int var3 = -18 % ((param0 - -30) / 36);
    }

    final boolean a(jaggl.MapBuffer param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 91) {
                break L1;
              } else {
                this.field_e = -84;
                break L1;
              }
            }
            L2: {
              var3_int = 1;
              if (-1 != (this.field_e ^ -1)) {
                L3: {
                  if (-1 <= (this.field_f ^ -1)) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
                    if ((this.field_e ^ -1) != -2) {
                      L4: {
                        if (!param0.a()) {
                          stackIn_10_0 = 0;
                          break L4;
                        } else {
                          stackIn_10_0 = 1;
                          break L4;
                        }
                      }
                      var3_int = stackIn_10_0;
                      break L3;
                    } else {
                      jaggl.OpenGL.glBufferSubDataARBa(this.field_k, 0, this.field_d, this.field_h.field_o.getAddress());
                      break L3;
                    }
                  }
                }
                this.field_e = 0;
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_13_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("hl.K(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final long b(boolean param0) {
        if (!param0) {
            return -36L;
        }
        return -1 != (this.field_f ^ -1) ? 0L : this.field_b.getAddress();
    }

    hl(kda param0, int param1, boolean param2) {
        this.field_f = -1;
        this.field_e = 0;
        try {
            this.field_k = param1;
            this.field_j = param2 ? true : false;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "RANK";
    }
}
