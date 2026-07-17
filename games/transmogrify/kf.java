/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends td {
    private long field_d;
    private long field_f;
    private long field_l;
    private long[] field_n;
    private int field_j;
    private int field_m;
    static qj field_o;
    static String[] field_k;
    static ii[] field_h;
    static int[] field_g;
    static String field_e;
    static pg field_i;
    static int field_p;

    private final long f(int param0) {
        int var8 = 0;
        int var9 = Transmogrify.field_A ? 1 : 0;
        long var2 = System.nanoTime();
        if (param0 <= 97) {
            ((kf) this).field_n = null;
        }
        long var4 = var2 - ((kf) this).field_l;
        ((kf) this).field_l = var2;
        if (var4 > -5000000000L) {
            if (!(var4 >= 5000000000L)) {
                ((kf) this).field_n[((kf) this).field_m] = var4;
                ((kf) this).field_m = (((kf) this).field_m + 1) % 10;
                if (((kf) this).field_j < 1) {
                    ((kf) this).field_j = ((kf) this).field_j + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((kf) this).field_j; var8++) {
            var6 = var6 + ((kf) this).field_n[(10 + (((kf) this).field_m - var8)) % 10];
        }
        return var6 / (long)((kf) this).field_j;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (ae.a(-12863)) {
              boolean discarded$17 = oi.field_k.a(fc.field_f, ij.field_a, true, 4);
              oi.field_k.l(param0 ^ param0);
              L1: while (true) {
                if (!pc.b(param0 ^ -121)) {
                  break L0;
                } else {
                  boolean discarded$18 = oi.field_k.a(-81, sg.field_n, ch.field_d);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == ub.field_c) {
                  break L2;
                } else {
                  if (ub.field_c.field_c) {
                    qd.b(param0 + 3);
                    oi.field_k.b((qg) (Object) new ll(oi.field_k, fi.field_w), (byte) -71);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "kf.C(" + param0 + 41);
        }
    }

    final static void a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        oa var16 = null;
        oa var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var16 = new oa(param0);
            var17 = var16;
            var17.field_h = param0.length - 2;
            ih.field_b = var17.a((byte) -126);
            wk.field_b = new int[ih.field_b];
            ld.field_e = new byte[ih.field_b][];
            ql.field_b = new int[ih.field_b];
            gj.field_j = new int[ih.field_b];
            re.field_a = new int[ih.field_b];
            cc.field_e = new boolean[ih.field_b];
            re.field_K = new byte[ih.field_b][];
            var17.field_h = param0.length - (7 + ih.field_b * 8);
            pj.field_y = var17.a((byte) -122);
            ll.field_U = var17.a((byte) -100);
            var3 = (var17.d((byte) 102) & 255) - -1;
            var4 = 0;
            L1: while (true) {
              if (ih.field_b <= var4) {
                var4 = 0;
                var5 = 22 % ((param1 - 19) / 47);
                L2: while (true) {
                  if (var4 >= ih.field_b) {
                    var4 = 0;
                    L3: while (true) {
                      if (ih.field_b <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= ih.field_b) {
                            var17.field_h = -(3 * (-1 + var3)) + param0.length - 7 - ih.field_b * 8;
                            rg.field_D = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_h = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= ih.field_b) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = ql.field_b[var4];
                                      var6 = wk.field_b[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      re.field_K[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      ld.field_e[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.d((byte) 40);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var5) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var5 <= var12) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.b(true);
                                                        var9[var12 + var5 * var13] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_42_0 = var10;
                                                        stackIn_44_0 = stackOut_42_0;
                                                        stackIn_43_0 = stackOut_42_0;
                                                        if (var14 == -1) {
                                                          stackOut_44_0 = stackIn_44_0;
                                                          stackOut_44_1 = 0;
                                                          stackIn_45_0 = stackOut_44_0;
                                                          stackIn_45_1 = stackOut_44_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_43_0 = stackIn_43_0;
                                                          stackOut_43_1 = 1;
                                                          stackIn_45_0 = stackOut_43_0;
                                                          stackIn_45_1 = stackOut_43_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_45_0 | stackIn_45_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var12 + var5 * var13] = var17.b(true);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var12 >= var7) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.b(true);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_27_0 = var10;
                                                    stackIn_29_0 = stackOut_27_0;
                                                    stackIn_28_0 = stackOut_27_0;
                                                    if (var13 == -1) {
                                                      stackOut_29_0 = stackIn_29_0;
                                                      stackOut_29_1 = 0;
                                                      stackIn_30_0 = stackOut_29_0;
                                                      stackIn_30_1 = stackOut_29_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_28_0 = stackIn_28_0;
                                                      stackOut_28_1 = 1;
                                                      stackIn_30_0 = stackOut_28_0;
                                                      stackIn_30_1 = stackOut_28_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_30_0 | stackIn_30_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.b(true);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    cc.field_e[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  rg.field_D[var4] = var17.g((byte) 124);
                                  if (0 != rg.field_D[var4]) {
                                    break L16;
                                  } else {
                                    rg.field_D[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            wk.field_b[var4] = var17.a((byte) -112);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        ql.field_b[var4] = var17.a((byte) -115);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    re.field_a[var4] = var17.a((byte) -118);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                gj.field_j[var4] = var16.a((byte) -93);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("kf.D(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param1 + 41);
        }
    }

    public static void e(int param0) {
        field_e = null;
        field_h = null;
        int var1 = 87;
        field_g = null;
        field_o = null;
        field_i = null;
        field_k = null;
    }

    final static void a(ci param0, byte param1) {
        ml var2 = null;
        try {
            ml.b(param0.a("", (byte) 95, "headers.packvorbis"));
            var2 = ml.a(param0, "jagex logo2.packvorbis", "");
            if (param1 != -80) {
                Object var3 = null;
                kf.a((ci) null, (byte) 29);
            }
            hb discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "kf.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param1 <= -79) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        if (((kf) this).field_d > ((kf) this).field_f) {
          ((kf) this).field_l = ((kf) this).field_l + (((kf) this).field_d - ((kf) this).field_f);
          ((kf) this).field_f = ((kf) this).field_f + (-((kf) this).field_f + ((kf) this).field_d);
          ((kf) this).field_d = ((kf) this).field_d + param0;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              var4++;
              ((kf) this).field_d = ((kf) this).field_d + param0;
              if (var4 >= 10) {
                break L2;
              } else {
                if (((kf) this).field_d < ((kf) this).field_f) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((kf) this).field_d >= ((kf) this).field_f) {
                break L3;
              } else {
                ((kf) this).field_d = ((kf) this).field_f;
                break L3;
              }
            }
            return var4;
          }
        }
    }

    final long c(int param0) {
        ((kf) this).field_f = ((kf) this).field_f + this.f(param0 + 125);
        if (param0 != 0) {
            field_i = null;
        }
        if (~((kf) this).field_d < ~((kf) this).field_f) {
            return (((kf) this).field_d + -((kf) this).field_f) / 1000000L;
        }
        return 0L;
    }

    final void a(int param0) {
        if (!(((kf) this).field_f >= ((kf) this).field_d)) {
            ((kf) this).field_f = ((kf) this).field_f + (-((kf) this).field_f + ((kf) this).field_d);
        }
        ((kf) this).field_l = (long)param0;
    }

    final static ti a(ti param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int var15 = 0;
        ti var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var25 = null;
        ti stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        ti stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var21 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            param0.d();
            var3_int = ga.a(param0.field_w[0], (byte) -107);
            var4 = (var3_int & 252) >> 2;
            if (var4 > 0) {
              throw new IllegalArgumentException();
            } else {
              var5 = var3_int & 3;
              var6 = 1;
              var8 = -8 % (param2 / 56);
              var7 = 0;
              var9 = 0;
              var10 = 1;
              L1: while (true) {
                if (var9 > var5) {
                  var25 = new int[var7];
                  var10 = 0;
                  L2: while (true) {
                    if (var7 <= var10) {
                      var10 = 255 * ga.a(param0.field_w[var6], (byte) -86) + ga.a(param0.field_w[var6 + 1], (byte) -81);
                      var6 += 2;
                      var11 = 255 * ga.a(param0.field_w[var6], (byte) -90) + ga.a(param0.field_w[1 + var6], (byte) -41);
                      var6 += 2;
                      var12 = 255 * ga.a(param0.field_w[var6], (byte) -92) - -ga.a(param0.field_w[1 + var6], (byte) -119);
                      var6 += 2;
                      var13 = ga.a(param0.field_w[var6], (byte) -121) * 255 - -ga.a(param0.field_w[var6 + 1], (byte) -113);
                      var6 += 2;
                      var14 = 255 * ga.a(param0.field_w[var6], (byte) -87) - -ga.a(param0.field_w[1 + var6], (byte) -60);
                      var6 += 2;
                      var15 = ga.a(param0.field_w[var6], (byte) -128) * 255 + ga.a(param0.field_w[var6 + 1], (byte) -113);
                      var6 += 2;
                      var16 = new ti(var14, var15);
                      var16.field_l = var11;
                      var16.field_u = var10;
                      var16.field_r = var12;
                      var16.field_s = var13;
                      var17 = 0;
                      L3: while (true) {
                        if (var16.field_w.length <= var17) {
                          stackOut_22_0 = (ti) var16;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          var18 = 0;
                          var19 = 0;
                          var20 = 1;
                          L4: while (true) {
                            if (var5 < var19) {
                              var16.field_w[var17] = var25[var18];
                              var17++;
                              continue L3;
                            } else {
                              int incrementValue$3 = var6;
                              var6++;
                              var18 = var20 * ga.a(param0.field_w[incrementValue$3], (byte) -108) + var18;
                              var20 = var20 * 255;
                              var19++;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      L5: while (true) {
                        if (var12 >= 4) {
                          L6: {
                            if (!param1) {
                              break L6;
                            } else {
                              if (0 != var11) {
                                break L6;
                              } else {
                                var11 = 16711935;
                                break L6;
                              }
                            }
                          }
                          var25[var10] = var11;
                          var10++;
                          continue L2;
                        } else {
                          int incrementValue$4 = var6;
                          var6++;
                          var11 = var13 * ga.a(param0.field_w[incrementValue$4], (byte) -42) + var11;
                          var12++;
                          var13 = var13 * 255;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  int incrementValue$5 = var6;
                  var6++;
                  var7 = var10 * ga.a(param0.field_w[incrementValue$5], (byte) -85) + var7;
                  var9++;
                  var10 = var10 * 255;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("kf.H(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_23_0;
    }

    kf() {
        ((kf) this).field_f = 0L;
        ((kf) this).field_d = 0L;
        ((kf) this).field_j = 1;
        ((kf) this).field_l = 0L;
        ((kf) this).field_n = new long[10];
        ((kf) this).field_m = 0;
        ((kf) this).field_f = System.nanoTime();
        ((kf) this).field_d = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[255];
        field_o = new qj();
        field_g = new int[8192];
    }
}
