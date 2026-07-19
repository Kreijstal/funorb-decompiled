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
        boolean discarded$2 = false;
        RuntimeException var4 = null;
        jaggl.MapBuffer var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        Object stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_12_0 = null;
        jaggl.MapBuffer stackIn_18_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jaclib.memory.heap.NativeHeapBuffer stackOut_19_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        Object stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackOut_11_0 = null;
        jaggl.MapBuffer stackOut_17_0 = null;
        Object stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                var5 = (jaggl.MapBuffer) null;
                discarded$2 = this.a((jaggl.MapBuffer) null, -94);
                break L1;
              }
            }
            L2: {
              if (this.field_e == 0) {
                this.d(1);
                if (0 >= this.field_f) {
                  this.field_e = 2;
                  stackOut_19_0 = this.field_b;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
                    if (param1) {
                      L4: {
                        stackOut_7_0 = this.field_k;
                        stackOut_7_1 = this.field_d;
                        stackOut_7_2 = null;
                        stackOut_7_3 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        if (!this.field_j) {
                          stackOut_9_0 = stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = stackIn_9_2;
                          stackOut_9_3 = stackIn_9_3;
                          stackOut_9_4 = 35044;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          stackIn_10_3 = stackOut_9_3;
                          stackIn_10_4 = stackOut_9_4;
                          break L4;
                        } else {
                          stackOut_8_0 = stackIn_8_0;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = stackIn_8_2;
                          stackOut_8_3 = stackIn_8_3;
                          stackOut_8_4 = 35040;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_10_3 = stackOut_8_3;
                          stackIn_10_4 = stackOut_8_4;
                          break L4;
                        }
                      }
                      jaggl.OpenGL.glBufferDataARBub(stackIn_10_0, stackIn_10_1, (byte[]) ((Object) stackIn_10_2), stackIn_10_3, stackIn_10_4);
                      if (this.field_h.field_o.c < this.field_g) {
                        break L3;
                      } else {
                        this.field_e = 1;
                        stackOut_11_0 = this.field_h.field_o;
                        stackIn_12_0 = stackOut_11_0;
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
                      stackOut_17_0 = (jaggl.MapBuffer) (param0);
                      stackIn_18_0 = stackOut_17_0;
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
            stackOut_21_0 = null;
            stackIn_22_0 = stackOut_21_0;
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("hl.O(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
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
        if (0 <= this.field_f) {
          return;
        } else {
          L0: {
            if (param0 == 1) {
              break L0;
            } else {
              this.d(14);
              break L0;
            }
          }
          L1: {
            L2: {
              if (!this.field_h.field_fd) {
                break L2;
              } else {
                jaggl.OpenGL.glGenBuffersARB(1, uqa.field_x, 0);
                this.field_f = uqa.field_x[0];
                jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            this.field_f = 0;
            break L1;
          }
          return;
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
        int decompiledRegionSelector0 = 0;
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
              L4: {
                if (-1 <= (var9 ^ -1)) {
                  break L4;
                } else {
                  if (var47 != 0) {
                    decompiledRegionSelector0 = 1;
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
                          L8: {
                            L9: {
                              if (-1 >= (var25 ^ -1)) {
                                break L9;
                              } else {
                                L10: while (true) {
                                  if (-1 >= (var25 ^ -1)) {
                                    break L9;
                                  } else {
                                    var26 = var26 + var37;
                                    var25 = var25 + var33;
                                    var37 = var37 + var30;
                                    var10++;
                                    var33 = var33 + var30;
                                    if (var47 != 0) {
                                      break L8;
                                    } else {
                                      if (var47 == 0) {
                                        continue L10;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (-1 < (var26 ^ -1)) {
                              var25 = var25 + var33;
                              var26 = var26 + var37;
                              var10++;
                              var37 = var37 + var30;
                              break L8;
                            } else {
                              break L7;
                            }
                          }
                          var33 = var33 + var30;
                          break L7;
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
                    L11: {
                      L12: {
                        if (-1 < (var23 ^ -1)) {
                          L13: while (true) {
                            if (0 <= var23) {
                              break L12;
                            } else {
                              var23 = var23 + var31;
                              var24 = var24 + var35;
                              var35 = var35 + var28;
                              var31 = var31 + var28;
                              var8_int++;
                              if (var47 != 0) {
                                break L11;
                              } else {
                                if (var47 == 0) {
                                  continue L13;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                      L14: {
                        if (0 <= var24) {
                          break L14;
                        } else {
                          var24 = var24 + var35;
                          var23 = var23 + var31;
                          var8_int++;
                          var35 = var35 + var28;
                          var31 = var31 + var28;
                          break L14;
                        }
                      }
                      var24 = var24 + -var32;
                      var23 = var23 + -var36;
                      var32 = var32 - var27;
                      var9--;
                      var36 = var36 - var27;
                      break L11;
                    }
                    L15: {
                      var40 = -var9 + param2;
                      var41 = param2 + var9;
                      if (gca.field_d > var41) {
                        break L15;
                      } else {
                        if (hc.field_h < var40) {
                          break L15;
                        } else {
                          L16: {
                            var42 = rp.a(ss.field_c, -16226, pka.field_b, var8_int + param3);
                            var43 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var8_int);
                            if (var39 != 0) {
                              break L16;
                            } else {
                              L17: {
                                if (var40 < gca.field_d) {
                                  break L17;
                                } else {
                                  nra.a((byte) -55, param0, var42, vaa.field_a[var40], var43);
                                  break L17;
                                }
                              }
                              if (var41 <= hc.field_h) {
                                nra.a((byte) -55, param0, var42, vaa.field_a[var41], var43);
                                if (var47 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              } else {
                                break L15;
                              }
                            }
                          }
                          L18: {
                            var44 = rp.a(ss.field_c, -16226, pka.field_b, param3 - -var10);
                            var45 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var10);
                            if (var40 >= gca.field_d) {
                              var58 = vaa.field_a[var40];
                              nra.a((byte) -55, param0, var45, var58, var43);
                              nra.a((byte) -55, param1, var44, var58, var45);
                              nra.a((byte) -55, param0, var42, var58, var44);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          if (var41 <= hc.field_h) {
                            var59 = vaa.field_a[var41];
                            nra.a((byte) -55, param0, var45, var59, var43);
                            nra.a((byte) -55, param1, var44, var59, var45);
                            nra.a((byte) -55, param0, var42, var59, var44);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    if (var47 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var8), "hl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        Object stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        Object stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        Object stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        L0: {
          if (this.field_d >= param1) {
            break L0;
          } else {
            L1: {
              L2: {
                this.d(1);
                if ((this.field_f ^ -1) >= -1) {
                  break L2;
                } else {
                  L3: {
                    jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
                    stackOut_2_0 = this.field_k;
                    stackOut_2_1 = param1;
                    stackOut_2_2 = null;
                    stackOut_2_3 = 0;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_4_2 = stackOut_2_2;
                    stackIn_4_3 = stackOut_2_3;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    stackIn_3_2 = stackOut_2_2;
                    stackIn_3_3 = stackOut_2_3;
                    if (this.field_j) {
                      stackOut_4_0 = stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = stackIn_4_2;
                      stackOut_4_3 = stackIn_4_3;
                      stackOut_4_4 = 35040;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      stackIn_5_3 = stackOut_4_3;
                      stackIn_5_4 = stackOut_4_4;
                      break L3;
                    } else {
                      stackOut_3_0 = stackIn_3_0;
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = stackIn_3_2;
                      stackOut_3_3 = stackIn_3_3;
                      stackOut_3_4 = 35044;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      stackIn_5_3 = stackOut_3_3;
                      stackIn_5_4 = stackOut_3_4;
                      break L3;
                    }
                  }
                  jaggl.OpenGL.glBufferDataARBub(stackIn_5_0, stackIn_5_1, (byte[]) ((Object) stackIn_5_2), stackIn_5_3, stackIn_5_4);
                  this.field_h.field_X = this.field_h.field_X + (-this.field_d + param1);
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_b = this.field_h.a(false, param1, false);
              break L1;
            }
            this.field_d = param1;
            break L0;
          }
        }
        this.field_g = param1;
        var3 = -18 % ((param0 - -30) / 36);
    }

    final boolean a(jaggl.MapBuffer param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
                    L4: {
                      jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
                      if ((this.field_e ^ -1) != -2) {
                        break L4;
                      } else {
                        jaggl.OpenGL.glBufferSubDataARBa(this.field_k, 0, this.field_d, this.field_h.field_o.getAddress());
                        if (!TombRacer.field_G) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (!param0.a()) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L5;
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        break L5;
                      }
                    }
                    var3_int = stackIn_11_0;
                    break L3;
                  }
                }
                this.field_e = 0;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_13_0 = var3_int;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("hl.K(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_14_0 != 0;
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
