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

    public static void a(int param0) {
        field_g = null;
        if (param0 < 108) {
            field_h = (na) null;
        }
        field_h = null;
    }

    final int c(int param0) {
        if (!(param0 != this.field_d)) {
            this.b(param0 ^ 0);
            this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_a[fieldTemp$0];
    }

    private final void d(int param0) {
        int var2 = 0;
        int var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 8273) {
            return;
        }
        int var6 = -1640531527;
        int var4 = -1640531527;
        int var3 = -1640531527;
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var8 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
            var3 = var3 ^ var4 << 573062603;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 929804802;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 19940136;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 1533786544;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1573691690;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -1167363356;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 1607644456;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -869402487;
            var3 = var3 + var4;
            var5 = var5 + var10;
        }
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var5 = var5 + this.field_a[2 + var2];
            var4 = var4 + this.field_a[var2 - -1];
            var6 = var6 + this.field_a[var2 + 3];
            var9 = var9 + this.field_a[6 + var2];
            var7 = var7 + this.field_a[4 + var2];
            var10 = var10 + this.field_a[var2 - -7];
            var3 = var3 + this.field_a[var2];
            var8 = var8 + this.field_a[var2 - -5];
            var3 = var3 ^ var4 << -850095765;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 1288611490;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -914708728;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 532454032;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1520898710;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -45382492;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 1187904808;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 2076644009;
            var3 = var3 + var4;
            var5 = var5 + var10;
            this.field_i[var2] = var3;
            this.field_i[1 + var2] = var4;
            this.field_i[var2 + 2] = var5;
            this.field_i[3 + var2] = var6;
            this.field_i[4 + var2] = var7;
            this.field_i[5 + var2] = var8;
            this.field_i[6 + var2] = var9;
            this.field_i[var2 - -7] = var10;
        }
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var6 = var6 + this.field_i[3 + var2];
            var8 = var8 + this.field_i[var2 - -5];
            var7 = var7 + this.field_i[var2 - -4];
            var3 = var3 + this.field_i[var2];
            var5 = var5 + this.field_i[2 + var2];
            var4 = var4 + this.field_i[var2 + 1];
            var10 = var10 + this.field_i[var2 - -7];
            var9 = var9 + this.field_i[var2 + 6];
            var3 = var3 ^ var4 << -1534587381;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 585986754;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -364741208;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -531678064;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -1428087446;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -577372732;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1415483064;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 248481641;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_i[var2] = var3;
            this.field_i[1 + var2] = var4;
            this.field_i[2 + var2] = var5;
            this.field_i[var2 + 3] = var6;
            this.field_i[4 + var2] = var7;
            this.field_i[var2 - -5] = var8;
            this.field_i[6 + var2] = var9;
            this.field_i[var2 - -7] = var10;
        }
        this.b(0);
        this.field_d = 256;
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                L2: {
                  if (param1 <= -53) {
                    break L2;
                  } else {
                    field_e = 83;
                    break L2;
                  }
                }
                var4 = 0;
                L3: while (true) {
                  if (var4 >= eg.field_c) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= eg.field_c) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= eg.field_c) {
                            var17.field_h = -(3 * (var3 + -1)) + -(8 * eg.field_c) + (-7 + param0.length);
                            fk.field_d = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var3 <= var4) {
                                var17.field_h = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= eg.field_c) {
                                    break L0;
                                  } else {
                                    var5 = da.field_c[var4];
                                    var6 = ra.field_ab[var4];
                                    var7 = var6 * var5;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    cb.field_b[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    jj.field_E[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.a((byte) 114);
                                    stackIn_24_0 = -1;
                                    stackIn_24_1 = var11 & 1 ^ -1;
                                    L8: {
                                      if (stackIn_24_0 != stackIn_24_1) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var5) {
                                            if (0 == (var11 & 2)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var5) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L11: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L10;
                                                    } else {
                                                      L12: {
                                                        dupTemp$0 = var17.k(-117);
                                                        var9[var5 * var13 + var12] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_48_0 = var10;

                                                        if (-1 == var14) {
                                                          stackIn_49_0 = stackIn_48_0;
                                                          stackIn_49_1 = 0;
                                                          break L12;
                                                        } else {
                                                          stackIn_49_0 = stackIn_48_0;
                                                          stackIn_49_1 = 1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_49_0 | stackIn_49_1;
                                                      var13++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L13: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L9;
                                              } else {
                                                var8[var12 + var5 * var13] = var17.k(34);
                                                var13++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L14: while (true) {
                                          if (var12 >= var7) {
                                            if (0 == (2 & var11)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L15: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L16: {
                                                    dupTemp$1 = var17.k(-108);
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_33_0 = var10;

                                                    if ((var13 ^ -1) == 0) {
                                                      stackIn_34_0 = stackIn_33_0;
                                                      stackIn_34_1 = 0;
                                                      break L16;
                                                    } else {
                                                      stackIn_34_0 = stackIn_33_0;
                                                      stackIn_34_1 = 1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_34_0 | stackIn_34_1;
                                                  var12++;
                                                  continue L15;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.k(-77);
                                            var12++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    j.field_d[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  fk.field_d[var4] = var17.c((byte) -121);
                                  if (fk.field_d[var4] != 0) {
                                    break L17;
                                  } else {
                                    fk.field_d[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            ra.field_ab[var4] = var17.j(17277);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        da.field_c[var4] = var17.j(17277);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    mb.field_b[var4] = var17.j(17277);
                    var4++;
                    continue L3;
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
          L18: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("ol.B(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L18;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int fieldTemp$0 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_f = this.field_f + fieldTemp$0;
        var2 = param0;
        L0: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L1: {
              var3 = this.field_i[var2];
              if ((var2 & 2) == 0) {
                if (-1 != (1 & var2 ^ -1)) {
                  this.field_b = this.field_b ^ this.field_b >>> 1428725478;
                  break L1;
                } else {
                  this.field_b = this.field_b ^ this.field_b << 1363682445;
                  break L1;
                }
              } else {
                if (0 != (var2 & 1)) {
                  this.field_b = this.field_b ^ this.field_b >>> 200121584;
                  break L1;
                } else {
                  this.field_b = this.field_b ^ this.field_b << -316251678;
                  break L1;
                }
              }
            }
            this.field_b = this.field_b + this.field_i[var2 - -128 & 255];
            dupTemp$1 = this.field_i[ch.a(1020, var3) >> -765259934] + (this.field_b - -this.field_f);
            var4 = dupTemp$1;
            this.field_i[var2] = dupTemp$1;
            dupTemp$2 = var3 + this.field_i[ch.a(var4, 261285) >> 662818120 >> -1828268158];
            this.field_f = dupTemp$2;
            this.field_a[var2] = dupTemp$2;
            var2++;
            continue L0;
          }
        }
    }

    ol(int[] param0) {
        int var2_int = 0;
        try {
            this.field_a = new int[256];
            this.field_i = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_a[var2_int] = param0[var2_int];
            }
            this.d(8273);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ol.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ad a(int param0, int param1) {
        if (param0 >= -87) {
            field_g = (id) null;
        }
        return em.a(false, param1, false, true, 1, 50);
    }

    static {
        field_h = new na();
        field_e = 256;
    }
}
