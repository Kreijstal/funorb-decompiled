/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends ab implements dr, dn {
    static pt field_t;
    private bm field_x;
    private boolean field_B;
    private mi field_D;
    static int field_u;
    private mi field_z;
    private boolean field_C;
    private bm field_v;
    private mi field_w;
    private String field_y;
    private boolean field_E;
    static int field_A;

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        if (!(this.field_y == null)) {
            discarded$0 = qo.field_b.a(this.field_y, 20 + param3 - -this.field_p, 15 + param2 - -this.field_h, this.field_q - 40, this.field_n, 16777215, -1, 1, 0, qo.field_b.field_I);
        }
        if (!(null == this.field_w)) {
            vp.b(param3 + 10, param2 - -134, -20 + this.field_q, 4210752);
        }
        if (param0 <= 64) {
            return;
        }
        super.a((byte) 77, param1, param2, param3);
    }

    final static float a(float param0, int param1) {
        if (param1 > -55) {
            field_u = -54;
        }
        return param0 * (param0 * param0) * (param0 * (-15.0f + param0 * 6.0f) + 10.0f);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(-20, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param1 ^ -1)) {
                if (param1 == 99) {
                  stackOut_9_0 = this.a(80, param3);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = -87 % ((param0 - -53) / 33);
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackOut_5_0 = this.b(param3, -101);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("ce.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final void a(String param0, int param1) {
        bm var3 = null;
        String var4 = null;
        try {
            var3 = this.field_v;
            var4 = param0;
            var3.a(-20975, var4, false);
            if (param1 < 43) {
                bm var5 = (bm) null;
                this.b((bm) null, 39);
            }
            this.field_x.f((byte) -2);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ce.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void h(int param0) {
        this.field_v.f((byte) -2);
        this.field_x.f((byte) -2);
        if (param0 != 310) {
            this.field_x = (bm) null;
        }
    }

    final String d(boolean param0) {
        if (param0) {
            return (String) null;
        }
        if (!(null != this.field_v.field_f)) {
            return "";
        }
        return this.field_v.field_f;
    }

    final static void a(byte param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        uc var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        ga var6_ref_ga = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        dl var28 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 116) {
                break L1;
              } else {
                field_A = -61;
                break L1;
              }
            }
            L2: {
              var28 = nm.field_c;
              var2 = var28.g(-85);
              if (var2 == 0) {
                var3 = var28.i((byte) 0);
                var4 = (uc) ((Object) nh.field_g.d(268435455));
                L3: while (true) {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      if (var3 != var4.field_n) {
                        var4 = (uc) ((Object) nh.field_g.b((byte) 103));
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4 != null) {
                    L5: {
                      var5 = var28.g(param0 + -167);
                      if (var5 == 0) {
                        break L5;
                      } else {
                        var6 = var4.field_j;
                        pe.field_b[0].field_f = null;
                        var7 = var4.field_m;
                        pe.field_b[0].field_e = fj.field_a;
                        pe.field_b[0].field_g = false;
                        var8_int = 1;
                        L6: while (true) {
                          if (var8_int >= var5) {
                            dupTemp$6 = new String[3][var6];
                            var4.field_e = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            dupTemp$7 = new long[3][var6];
                            var4.field_f = dupTemp$7;
                            var10 = dupTemp$7;
                            dupTemp$8 = new int[3][var6 * var7];
                            var4.field_h = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.g(-119);
                            if ((var18 ^ -1) >= -1) {
                              break L5;
                            } else {
                              var19 = 0;
                              L7: while (true) {
                                if (var19 >= var18) {
                                  break L5;
                                } else {
                                  L8: {
                                    var20 = var28.g(param0 ^ 69);
                                    var21 = pe.field_b[var20].field_e;
                                    var22 = var28.h((byte) -32);
                                    var24 = var28.field_g;
                                    if (var6 <= var19) {
                                      break L8;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = pe.field_b[var20].field_f;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L9: while (true) {
                                        if (var7 <= var25) {
                                          break L8;
                                        } else {
                                          incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var28.a((byte) 124);
                                          var25++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var21 == null) {
                                      break L10;
                                    } else {
                                      if (!fd.a(var21, (byte) -6)) {
                                        break L10;
                                      } else {
                                        var8[1][var13] = fj.field_a;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var28.field_g = var24;
                                        var25 = 0;
                                        L11: while (true) {
                                          if (var7 <= var25) {
                                            break L10;
                                          } else {
                                            incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var28.a((byte) 114);
                                            var25++;
                                            continue L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var6 <= var14) {
                                      break L12;
                                    } else {
                                      if (!pe.field_b[var20].field_g) {
                                        pe.field_b[var20].field_g = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = pe.field_b[var20].field_f;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_g = var24;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var7 <= var25) {
                                            break L12;
                                          } else {
                                            incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var28.a((byte) 113);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            L14: {
                              pe.field_b[var8_int].field_e = var28.h(-17883);
                              pe.field_b[var8_int].field_g = false;
                              if ((var28.g(-47) ^ -1) != -2) {
                                pe.field_b[var8_int].field_f = null;
                                break L14;
                              } else {
                                pe.field_b[var8_int].field_f = var28.h(param0 ^ -17839);
                                break L14;
                              }
                            }
                            var8_int++;
                            continue L6;
                          }
                        }
                      }
                    }
                    var4.field_i = true;
                    var4.c(param0 ^ -16);
                    break L2;
                  } else {
                    te.b(true);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                if ((var2 ^ -1) == -2) {
                  var3 = var28.i((byte) 0);
                  var4_long = var28.h((byte) 64);
                  var6_ref_ga = (ga) ((Object) tq.field_d.d(268435455));
                  L15: while (true) {
                    L16: {
                      if (var6_ref_ga == null) {
                        break L16;
                      } else {
                        if (var6_ref_ga.field_m != var3) {
                          var6_ref_ga = (ga) ((Object) tq.field_d.b((byte) 103));
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (var6_ref_ga != null) {
                      var6_ref_ga.field_j = var4_long;
                      var6_ref_ga.c(-127);
                      break L2;
                    } else {
                      te.b(true);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  v.a("HS1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                  te.b(true);
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "ce.JA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void b(bm param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == this.field_v) {
                discarded$2 = this.field_x.a((ea) (this), (byte) -42);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_x != param0) {
                break L2;
              } else {
                this.d((byte) -85);
                break L2;
              }
            }
            L3: {
              if (param1 == -40) {
                break L3;
              } else {
                this.field_D = (mi) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ce.V(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static boolean g(int param0) {
        if (param0 != -3) {
            return false;
        }
        return nl.field_s;
    }

    private final void d(byte param0) {
        L0: {
          L1: {
            if (fh.e(31574)) {
              break L1;
            } else {
              if (-1 <= (this.field_v.field_f.length() ^ -1)) {
                break L0;
              } else {
                if (0 >= this.field_x.field_f.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          s.a(this.field_x.field_f, false, this.field_v.field_f);
          break L0;
        }
        L2: {
          if (param0 <= -59) {
            break L2;
          } else {
            this.d((byte) -4);
            break L2;
          }
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 != this.field_D) {
                  if (param1 != this.field_w) {
                    if (this.field_z == param1) {
                      if (!this.field_C) {
                        if (this.field_E) {
                          pj.b((byte) -75);
                          break L2;
                        } else {
                          rb.i(-112);
                          break L2;
                        }
                      } else {
                        ps.b(17);
                        break L2;
                      }
                    } else {
                      var6_int = 122 % ((param4 - -27) / 61);
                      break L1;
                    }
                  } else {
                    cu.c((byte) 104);
                    break L2;
                  }
                } else {
                  this.d((byte) -84);
                  break L2;
                }
              }
              var6_int = 122 % ((param4 - -27) / 61);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("ce.DA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(bm param0, int param1) {
        RuntimeException runtimeException = null;
        String var4 = null;
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
              if (param1 == -6525) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((String) null, 56);
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
            stackOut_3_1 = new StringBuilder().append("ce.W(");
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
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    ce(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ir) null);
        bc dupTemp$2 = null;
        bc dupTemp$3 = null;
        RuntimeException var6 = null;
        qb var6_ref = null;
        hc var7 = null;
        String var8 = null;
        gu var9 = null;
        bc var12 = null;
        bc var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        mi stackIn_17_1 = null;
        mi stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        mi stackIn_18_1 = null;
        mi stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        mi stackIn_19_1 = null;
        mi stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        mi stackOut_16_1 = null;
        mi stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        mi stackOut_18_1 = null;
        mi stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        mi stackOut_17_1 = null;
        mi stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ce) (this)).field_E = stackIn_4_1 != 0;
              this.field_y = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((ce) (this)).field_B = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ce) (this)).field_C = stackIn_10_1 != 0;
              if (!this.field_C) {
                break L4;
              } else {
                L5: {
                  if (this.field_B) {
                    break L5;
                  } else {
                    if (!this.field_E) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_v = (bm) ((Object) new kk(param0, (no) (this), 100));
              this.field_x = (bm) ((Object) new kk("", (no) (this), 20));
              if (!this.field_C) {
                L7: {
                  this.field_D = new mi(ms.field_a, (no) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!this.field_E) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = eu.field_j;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = nu.field_a;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((ce) (this)).field_z = new mi(stackIn_19_3, (no) null);
                if (!this.field_B) {
                  break L6;
                } else {
                  this.field_w = new mi(jd.field_b, (no) (this));
                  break L6;
                }
              } else {
                this.field_D = new mi(hg.field_z, (no) null);
                this.field_z = new mi(mb.field_s, (no) null);
                this.field_v.field_u = false;
                break L6;
              }
            }
            L8: {
              this.field_v.field_e = (ir) ((Object) new sl(10000536));
              this.field_x.field_e = (ir) ((Object) new ul(10000536));
              var6_ref = new qb();
              this.field_D.field_e = (ir) ((Object) var6_ref);
              if (null == this.field_z) {
                break L8;
              } else {
                this.field_z.field_e = (ir) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              this.field_v.field_k = ae.field_g;
              if (null == this.field_w) {
                break L9;
              } else {
                this.field_w.field_e = (ir) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              if (this.field_w == null) {
                break L10;
              } else {
                this.field_w.field_k = cl.field_db;
                break L10;
              }
            }
            L11: {
              if (this.field_C) {
                this.field_z.field_k = gq.field_d;
                break L11;
              } else {
                if (this.field_E) {
                  this.field_z.field_k = td.field_c;
                  this.field_z.field_e = (ir) ((Object) new wg());
                  break L11;
                } else {
                  this.field_z.field_e = (ir) ((Object) new wg());
                  break L11;
                }
              }
            }
            L12: {
              this.field_h = 15;
              var7 = qo.field_b;
              if (null == this.field_y) {
                break L12;
              } else {
                this.field_h = this.field_h + (5 + var7.a(this.field_y, this.field_q + -40, var7.field_I));
                break L12;
              }
            }
            L13: {
              var8 = kk.field_J;
              var9 = lc.a(17123, bm.m(125));
              if (ef.field_k != var9) {
                if (lp.field_f != var9) {
                  break L13;
                } else {
                  var8 = io.field_e;
                  break L13;
                }
              } else {
                var8 = hu.field_b;
                break L13;
              }
            }
            L14: {
              dupTemp$2 = new bc(10, this.field_h, -20 + this.field_q, 25, this.field_v, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.a(dupTemp$2, 1);
              this.field_h = this.field_h + (((ea) ((Object) var12)).field_n - -5);
              dupTemp$3 = new bc(10, this.field_h, -20 + this.field_q, 25, this.field_x, false, 80, 3, var7, 16777215, vj.field_b);
              var13 = dupTemp$3;
              this.a(dupTemp$3, 1);
              this.field_D.field_o = (no) (this);
              this.field_h = this.field_h + (5 + ((ea) ((Object) var13)).field_n);
              if (null == this.field_w) {
                break L14;
              } else {
                this.field_w.field_o = (no) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_z) {
                break L15;
              } else {
                this.field_z.field_o = (no) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_w != null) {
                this.field_D.a(30, 85, this.field_h, -95 + this.field_q, (byte) 126);
                this.field_h = this.field_h + 60;
                break L16;
              } else {
                this.field_D.a(30, 8, this.field_h, -6 + (this.field_q - 10), (byte) 126);
                this.field_h = this.field_h + 35;
                break L16;
              }
            }
            L17: {
              if (null == this.field_w) {
                break L17;
              } else {
                this.field_w.a(30, 8, this.field_h, this.field_q + -6 + -10, (byte) 126);
                this.field_h = this.field_h + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_z == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_C) {
                    break L19;
                  } else {
                    if (!this.field_E) {
                      this.field_z.a(20, 8, this.field_h, 40, (byte) 126);
                      this.field_h = this.field_h + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_z.a(30, 8, this.field_h, this.field_q + -6 - 10, (byte) 127);
                this.field_h = this.field_h + 35;
                break L18;
              }
            }
            L20: {
              this.a(this.field_h - -3, 0, 0, this.field_q, (byte) 126);
              this.a(this.field_D, 1);
              if (this.field_w == null) {
                break L20;
              } else {
                this.a(this.field_w, 1);
                break L20;
              }
            }
            L21: {
              if (null == this.field_z) {
                break L21;
              } else {
                this.a(this.field_z, 1);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("ce.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static ll[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != -29003) {
            field_t = (pt) null;
        }
        return qk.a(3, 1, param3, param4, 1, 1, param1, -128, param0);
    }

    public static void i(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 35) / 61);
    }

    static {
        field_t = new pt();
    }
}
