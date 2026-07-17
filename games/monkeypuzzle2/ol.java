/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private int field_b;
    private int[] field_i;
    private int[] field_a;
    private int field_d;
    static na field_h;
    private int field_f;
    private int field_c;
    static id field_g;
    static int field_e;

    public static void a() {
        field_g = null;
        field_h = null;
    }

    final int c(int param0) {
        if (!(param0 != ((ol) this).field_d)) {
            this.b(param0);
            ((ol) this).field_d = 256;
        }
        int fieldTemp$0 = ((ol) this).field_d - 1;
        ((ol) this).field_d = ((ol) this).field_d - 1;
        return ((ol) this).field_a[fieldTemp$0];
    }

    private final void d() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        var6 = -1640531527;
        var4 = -1640531527;
        var3 = -1640531527;
        var10 = -1640531527;
        var9 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.b(0);
                    ((ol) this).field_d = 256;
                    return;
                  } else {
                    var6 = var6 + ((ol) this).field_i[3 + var2];
                    var8 = var8 + ((ol) this).field_i[var2 - -5];
                    var7 = var7 + ((ol) this).field_i[var2 - -4];
                    var3 = var3 + ((ol) this).field_i[var2];
                    var5 = var5 + ((ol) this).field_i[2 + var2];
                    var4 = var4 + ((ol) this).field_i[var2 + 1];
                    var10 = var10 + ((ol) this).field_i[var2 - -7];
                    var9 = var9 + ((ol) this).field_i[var2 + 6];
                    var3 = var3 ^ var4 << 11;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 8;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 16;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 10;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ol) this).field_i[var2] = var3;
                    ((ol) this).field_i[1 + var2] = var4;
                    ((ol) this).field_i[2 + var2] = var5;
                    ((ol) this).field_i[var2 + 3] = var6;
                    ((ol) this).field_i[4 + var2] = var7;
                    ((ol) this).field_i[var2 - -5] = var8;
                    ((ol) this).field_i[6 + var2] = var9;
                    ((ol) this).field_i[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var5 = var5 + ((ol) this).field_a[2 + var2];
                var4 = var4 + ((ol) this).field_a[var2 - -1];
                var6 = var6 + ((ol) this).field_a[var2 + 3];
                var9 = var9 + ((ol) this).field_a[6 + var2];
                var7 = var7 + ((ol) this).field_a[4 + var2];
                var10 = var10 + ((ol) this).field_a[var2 - -7];
                var3 = var3 + ((ol) this).field_a[var2];
                var8 = var8 + ((ol) this).field_a[var2 - -5];
                var3 = var3 ^ var4 << 11;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 2;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 8;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 16;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 10;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((ol) this).field_i[var2] = var3;
                ((ol) this).field_i[1 + var2] = var4;
                ((ol) this).field_i[var2 + 2] = var5;
                ((ol) this).field_i[3 + var2] = var6;
                ((ol) this).field_i[4 + var2] = var7;
                ((ol) this).field_i[5 + var2] = var8;
                ((ol) this).field_i[6 + var2] = var9;
                ((ol) this).field_i[var2 - -7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 2;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 8;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 9;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(byte[] param0) {
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
        gk var16 = null;
        gk var17 = null;
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
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var16 = new gk(param0);
            var17 = var16;
            var17.field_h = -2 + param0.length;
            eg.field_c = var17.j(17277);
            ra.field_ab = new int[eg.field_c];
            j.field_d = new boolean[eg.field_c];
            cb.field_b = new byte[eg.field_c][];
            qc.field_P = new int[eg.field_c];
            da.field_c = new int[eg.field_c];
            mb.field_b = new int[eg.field_c];
            jj.field_E = new byte[eg.field_c][];
            var17.field_h = -7 + param0.length - 8 * eg.field_c;
            nj.field_d = var17.j(17277);
            qk.field_a = var17.j(17277);
            var3 = (255 & var17.a((byte) 114)) - -1;
            var4 = 0;
            L1: while (true) {
              if (var4 >= eg.field_c) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= eg.field_c) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= eg.field_c) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= eg.field_c) {
                            var17.field_h = -(3 * (var3 + -1)) + -(8 * eg.field_c) + (-7 + param0.length);
                            fk.field_d = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_h = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= eg.field_c) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = da.field_c[var4];
                                      var6 = ra.field_ab[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      cb.field_b[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      jj.field_E[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.a((byte) 114);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var5) {
                                            if (0 == (var11 & 2)) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.k(-117);
                                                        var9[var5 * var13 + var12] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_42_0 = var10;
                                                        stackIn_44_0 = stackOut_42_0;
                                                        stackIn_43_0 = stackOut_42_0;
                                                        if (-1 == var14) {
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
                                                var8[var12 + var5 * var13] = var17.k(34);
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
                                            if (0 == (2 & var11)) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.k(-108);
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
                                            var8[var12] = var17.k(-77);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    j.field_d[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  fk.field_d[var4] = var17.c((byte) -121);
                                  if (fk.field_d[var4] != 0) {
                                    break L16;
                                  } else {
                                    fk.field_d[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            ra.field_ab[var4] = var17.j(17277);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        da.field_c[var4] = var17.j(17277);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    mb.field_b[var4] = var17.j(17277);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                qc.field_P[var4] = var16.j(17277);
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
            stackOut_49_1 = new StringBuilder().append("ol.B(");
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
          throw la.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + -83 + 41);
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int fieldTemp$3 = ((ol) this).field_c + 1;
        ((ol) this).field_c = ((ol) this).field_c + 1;
        ((ol) this).field_f = ((ol) this).field_f + fieldTemp$3;
        var2 = param0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((ol) this).field_i[var2];
              if ((var2 & 2) == 0) {
                if ((1 & var2) != 0) {
                  ((ol) this).field_b = ((ol) this).field_b ^ ((ol) this).field_b >>> 6;
                  break L1;
                } else {
                  ((ol) this).field_b = ((ol) this).field_b ^ ((ol) this).field_b << 13;
                  break L1;
                }
              } else {
                if (0 != (var2 & 1)) {
                  ((ol) this).field_b = ((ol) this).field_b ^ ((ol) this).field_b >>> 16;
                  break L1;
                } else {
                  ((ol) this).field_b = ((ol) this).field_b ^ ((ol) this).field_b << 2;
                  break L1;
                }
              }
            }
            ((ol) this).field_b = ((ol) this).field_b + ((ol) this).field_i[var2 - -128 & 255];
            int dupTemp$4 = ((ol) this).field_i[ch.a(1020, var3) >> 2] + (((ol) this).field_b - -((ol) this).field_f);
            var4 = dupTemp$4;
            ((ol) this).field_i[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((ol) this).field_i[ch.a(var4, 261285) >> 8 >> 2];
            ((ol) this).field_f = dupTemp$5;
            ((ol) this).field_a[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    ol(int[] param0) {
        int var2_int = 0;
        try {
            ((ol) this).field_a = new int[256];
            ((ol) this).field_i = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((ol) this).field_a[var2_int] = param0[var2_int];
            }
            int discarded$0 = 8273;
            this.d();
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ol.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static ad a(int param0, int param1) {
        if (param0 >= -87) {
            field_g = null;
        }
        int discarded$0 = 50;
        return em.a(false, param1, false, true, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new na();
        field_e = 256;
    }
}
