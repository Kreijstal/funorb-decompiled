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
        int var2 = Transmogrify.field_A ? 1 : 0;
        if (!ae.a(-12863)) {
            // if_acmpeq L113
            if (!(!ub.field_c.field_c)) {
                qd.b(param0 + 3);
                oi.field_k.b((qg) (Object) new ll(oi.field_k, fi.field_w), (byte) -71);
            }
            return;
        }
        boolean discarded$8 = oi.field_k.a(fc.field_f, ij.field_a, true, 4);
        oi.field_k.l(param0 ^ param0);
        while (pc.b(param0 ^ -121)) {
            boolean discarded$9 = oi.field_k.a(-81, sg.field_n, ch.field_d);
        }
        return;
    }

    final static void a(byte[] param0, int param1) {
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
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        var15 = Transmogrify.field_A ? 1 : 0;
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
        L0: while (true) {
          L1: {
            if (ih.field_b <= var4) {
              break L1;
            } else {
              gj.field_j[var4] = var16.a((byte) -93);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          var5 = 22 % ((param1 - 19) / 47);
          L2: while (true) {
            L3: {
              if (var4 >= ih.field_b) {
                break L3;
              } else {
                re.field_a[var4] = var16.a((byte) -118);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (ih.field_b <= var4) {
                  break L5;
                } else {
                  ql.field_b[var4] = var16.a((byte) -115);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (var4 >= ih.field_b) {
                    break L7;
                  } else {
                    wk.field_b[var4] = var16.a((byte) -112);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_h = -(3 * (-1 + var3)) + param0.length - 7 - ih.field_b * 8;
                rg.field_D = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        rg.field_D[var4] = var16.g((byte) 124);
                        if (0 != rg.field_D[var4]) {
                          break L10;
                        } else {
                          rg.field_D[var4] = 1;
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var17.field_h = 0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (var4 >= ih.field_b) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
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
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var12 >= var7) {
                                    break L16;
                                  } else {
                                    var8[var12] = var16.b(true);
                                    var12++;
                                    if (0 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if ((var11 & 2) == 0) {
                                  break L13;
                                } else {
                                  var12 = 0;
                                  L17: while (true) {
                                    L18: {
                                      if (var7 <= var12) {
                                        break L18;
                                      } else {
                                        L19: {
                                          var9[var12] = var16.b(true);
                                          var13 = var16.b(true);
                                          stackOut_31_0 = var10;
                                          stackIn_33_0 = stackOut_31_0;
                                          stackIn_32_0 = stackOut_31_0;
                                          if (var13 == -1) {
                                            stackOut_33_0 = stackIn_33_0;
                                            stackOut_33_1 = 0;
                                            stackIn_34_0 = stackOut_33_0;
                                            stackIn_34_1 = stackOut_33_1;
                                            break L19;
                                          } else {
                                            stackOut_32_0 = stackIn_32_0;
                                            stackOut_32_1 = 1;
                                            stackIn_34_0 = stackOut_32_0;
                                            stackIn_34_1 = stackOut_32_1;
                                            break L19;
                                          }
                                        }
                                        var10 = stackIn_34_0 | stackIn_34_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L20: while (true) {
                            L21: {
                              if (var12 >= var5) {
                                break L21;
                              } else {
                                var13 = 0;
                                L22: while (true) {
                                  L23: {
                                    if (var6 <= var13) {
                                      break L23;
                                    } else {
                                      var8[var12 + var5 * var13] = var16.b(true);
                                      var13++;
                                      if (0 == 0) {
                                        continue L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            if ((var11 & 2) == 0) {
                              break L13;
                            } else {
                              var12 = 0;
                              L24: while (true) {
                                if (var5 <= var12) {
                                  break L13;
                                } else {
                                  var13 = 0;
                                  L25: while (true) {
                                    L26: {
                                      if (var13 >= var6) {
                                        break L26;
                                      } else {
                                        L27: {
                                          var9[var12 + var5 * var13] = var16.b(true);
                                          var14 = var16.b(true);
                                          stackOut_48_0 = var10;
                                          stackIn_50_0 = stackOut_48_0;
                                          stackIn_49_0 = stackOut_48_0;
                                          if (0 == (var14 ^ -1)) {
                                            stackOut_50_0 = stackIn_50_0;
                                            stackOut_50_1 = 0;
                                            stackIn_51_0 = stackOut_50_0;
                                            stackIn_51_1 = stackOut_50_1;
                                            break L27;
                                          } else {
                                            stackOut_49_0 = stackIn_49_0;
                                            stackOut_49_1 = 1;
                                            stackIn_51_0 = stackOut_49_0;
                                            stackIn_51_1 = stackOut_49_1;
                                            break L27;
                                          }
                                        }
                                        var10 = stackIn_51_0 | stackIn_51_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L24;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        cc.field_e[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_e = null;
        field_h = null;
        int var1 = -87 / ((55 - param0) / 36);
        field_g = null;
        field_o = null;
        field_i = null;
        field_k = null;
    }

    final static void a(ci param0, byte param1) {
        ml.b(param0.a("", (byte) 95, "headers.packvorbis"));
        ml var2 = ml.a(param0, "jagex logo2.packvorbis", "");
        if (param1 != -80) {
            Object var3 = null;
            kf.a((ci) null, (byte) 29);
        }
        hb discarded$0 = var2.b();
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        if (param1 > -79) {
            field_i = null;
        }
        if (((kf) this).field_d <= ((kf) this).field_f) {
            var4 = 0;
            do {
                var4++;
                ((kf) this).field_d = ((kf) this).field_d + param0;
                // if_icmpge L68
            } while (((kf) this).field_d < ((kf) this).field_f);
            if (((kf) this).field_d < ((kf) this).field_f) {
                ((kf) this).field_d = ((kf) this).field_f;
            }
            return var4;
        }
        ((kf) this).field_l = ((kf) this).field_l + (((kf) this).field_d - ((kf) this).field_f);
        ((kf) this).field_f = ((kf) this).field_f + (-((kf) this).field_f + ((kf) this).field_d);
        ((kf) this).field_d = ((kf) this).field_d + param0;
        return 1;
    }

    final long c(int param0) {
        ((kf) this).field_f = ((kf) this).field_f + this.f(param0 + 125);
        if (param0 != 0) {
            field_i = null;
        }
        if ((((kf) this).field_d ^ -1L) < (((kf) this).field_f ^ -1L)) {
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
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = Transmogrify.field_A ? 1 : 0;
        param0.d();
        int var3 = ga.a(param0.field_w[0], (byte) -107);
        int var4 = (var3 & 252) >> 798133154;
        if (!(-1 <= (var4 ^ -1))) {
            throw new IllegalArgumentException();
        }
        int var5 = var3 & 3;
        int var6 = 1;
        int var8 = -8 % ((param2 - 0) / 56);
        int var7 = 0;
        int var9 = 0;
        int var10 = 1;
        while (var9 <= var5) {
            var6++;
            var7 = var10 * ga.a(param0.field_w[var6], (byte) -85) + var7;
            var9++;
            var10 = var10 * 255;
        }
        int[] var25 = new int[var7];
        for (var10 = 0; var7 > var10; var10++) {
            var11 = 0;
            var12 = 0;
            var13 = 1;
            while (var12 < 4) {
                var6++;
                var11 = var13 * ga.a(param0.field_w[var6], (byte) -42) + var11;
                var12++;
                var13 = var13 * 255;
            }
            if (param1) {
                if (0 == var11) {
                    var11 = 16711935;
                }
            }
            var25[var10] = var11;
        }
        var10 = 255 * ga.a(param0.field_w[var6], (byte) -86) + ga.a(param0.field_w[var6 + 1], (byte) -81);
        var6 += 2;
        var11 = 255 * ga.a(param0.field_w[var6], (byte) -90) + ga.a(param0.field_w[1 + var6], (byte) -41);
        var6 += 2;
        var12 = 255 * ga.a(param0.field_w[var6], (byte) -92) - -ga.a(param0.field_w[1 + var6], (byte) -119);
        var6 += 2;
        var13 = ga.a(param0.field_w[var6], (byte) -121) * 255 - -ga.a(param0.field_w[var6 + 1], (byte) -113);
        var6 += 2;
        int var14 = 255 * ga.a(param0.field_w[var6], (byte) -87) - -ga.a(param0.field_w[1 + var6], (byte) -60);
        var6 += 2;
        int var15 = ga.a(param0.field_w[var6], (byte) -128) * 255 + ga.a(param0.field_w[var6 + 1], (byte) -113);
        var6 += 2;
        ti var16 = new ti(var14, var15);
        var16.field_l = var11;
        var16.field_u = var10;
        var16.field_r = var12;
        var16.field_s = var13;
        for (var17 = 0; var16.field_w.length > var17; var17++) {
            var18 = 0;
            var19 = 0;
            var20 = 1;
            while (var5 >= var19) {
                var6++;
                var18 = var20 * ga.a(param0.field_w[var6], (byte) -108) + var18;
                var20 = var20 * 255;
                var19++;
            }
            var16.field_w[var17] = var25[var18];
        }
        return var16;
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
