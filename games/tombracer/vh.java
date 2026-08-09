/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private long[] field_m;
    private long[] field_j;
    private long[] field_f;
    private byte[] field_d;
    private int field_a;
    static String field_c;
    private long[] field_i;
    static int field_g;
    private long[] field_l;
    static String field_b;
    private int field_k;
    private byte[] field_e;
    static float[] field_h;

    private final void a(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (!param0) {
            break L0;
          } else {
            this.a(false);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L2: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L3: while (true) {
                  if ((var2 ^ -1) < -11) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        this.field_l[var2] = oo.a(this.field_l[var2], oo.a(this.field_m[var2], this.field_f[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            this.field_i[0] = oo.a(this.field_i[0], vka.field_H[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    this.field_f[var3] = this.field_j[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_j[var3] = this.field_i[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_j[var3] = oo.a(this.field_j[var3], vka.field_I[var7][sea.c(255, (int)(this.field_f[sea.c(var3 - var7, 7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_i[var3] = this.field_j[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_j[var3] = oo.a(this.field_j[var3], vka.field_I[var4][sea.c(255, (int)(this.field_i[sea.c(-var4 + var3, 7)] >>> var5))]);
                            var5 -= 8;
                            var4++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                dupTemp$0 = this.field_l[var2];
                arrayValue$1 = this.field_m[var2];
                this.field_i[var2] = dupTemp$0;
                this.field_f[var2] = oo.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L2;
              }
            }
          } else {
            this.field_m[var2] = oo.a(oo.a(oo.a(oo.a(vi.a((long)this.field_e[4 + var3] << -1477755624, 4278190080L), oo.a(vi.a(255L, (long)this.field_e[3 + var3]) << -695232672, oo.a(oo.a((long)this.field_e[var3] << -1281742984, vi.a((long)this.field_e[1 + var3] << 659222064, 71776119061217280L)), vi.a(280375465082880L, (long)this.field_e[var3 - -2] << -1133955800)))), vi.a((long)this.field_e[5 + var3], 255L) << -319200432), vi.a(255L, (long)this.field_e[6 + var3]) << -856835576), vi.a((long)this.field_e[7 + var3], 255L));
            var2++;
            var3 += 8;
            continue L1;
          }
        }
    }

    final void a(byte[] param0, long param1, byte param2) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -59) {
                break L1;
              } else {
                this.field_m = (long[]) null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = -((int)param1 & 7) + 8 & 7;
            var7 = 7 & this.field_a;
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (-1 < (var11 ^ -1)) {
                L3: while (true) {
                  if ((param1 ^ -1L) >= -9L) {
                    L4: {
                      if (-1L > (param1 ^ -1L)) {
                        stackIn_18_0 = param0[var5_int] << var6;
                        stackIn_18_1 = 255;
                        var8 = stackIn_18_0 & stackIn_18_1;
                        this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (-9L >= (param1 + (long)var7 ^ -1L)) {
                        L6: {
                          this.field_a = this.field_a + (8 + -var7);
                          param1 = param1 - (long)(-var7 + 8);
                          this.field_k = this.field_k + 1;
                          if (-513 != (this.field_a ^ -1)) {
                            break L6;
                          } else {
                            this.a(false);
                            this.field_a = 0;
                            this.field_k = 0;
                            break L6;
                          }
                        }
                        this.field_e[this.field_k] = (byte)sea.c(255, var8 << 8 + -var7);
                        this.field_a = this.field_a + (int)param1;
                        break L5;
                      } else {
                        this.field_a = (int)((long)this.field_a + param1);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
                      if (-1 < (var8 ^ -1)) {
                        break L7;
                      } else {
                        if (-257 < (var8 ^ -1)) {
                          L8: {
                            this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], var8 >>> var7);
                            this.field_a = this.field_a + (8 - var7);
                            this.field_k = this.field_k + 1;
                            if ((this.field_a ^ -1) == -513) {
                              this.a(false);
                              this.field_k = 0;
                              this.field_a = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.field_e[this.field_k] = (byte)sea.c(255, var8 << 8 + -var7);
                          var5_int++;
                          this.field_a = this.field_a + var7;
                          param1 = param1 - 8L;
                          continue L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & this.field_d[var11]) - -((int)var9 & 255));
                this.field_d[var11] = (byte)var12;
                var9 = var9 >>> 8;
                var12 = var12 >>> 8;
                var11--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("vh.F(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        upa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kh var14 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var14 = vc.field_q;
            var2 = var14.h(255);
            var3 = (upa) ((Object) ina.field_d.f(param0 ^ 100));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_n != var2) {
                    var3 = (upa) ((Object) ina.field_d.e(117));
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                dea.a(60);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  var4 = var14.h(255);
                  if (param0 == -44) {
                    break L3;
                  } else {
                    vh.a((byte) 81);
                    break L3;
                  }
                }
                L4: {
                  if (-1 != (var4 ^ -1)) {
                    bra.field_M[0] = fna.field_k;
                    var5 = var3.field_k;
                    var6_int = 1;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        dc.a(var4, var5, (byte) 47);
                        var6_int = 0;
                        L6: while (true) {
                          if (var6_int >= var4) {
                            ri.a(var5, (byte) 29);
                            dupTemp$0 = new String[2][var5];
                            var3.field_h = dupTemp$0;
                            var6 = dupTemp$0;
                            dupTemp$1 = new int[2][4 * var5];
                            var3.field_m = dupTemp$1;
                            var7 = dupTemp$1;
                            var8 = ola.field_Eb;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var8 <= var9) {
                                var9 = 0;
                                var13 = 0;
                                var10 = var13;
                                L8: while (true) {
                                  if (var8 <= var9) {
                                    break L4;
                                  } else {
                                    L9: {
                                      var11 = boa.field_n[var5 - -var9];
                                      var6[1][var13] = bra.field_M[var11];
                                      var7[1][4 * var13] = jk.field_h[var11];
                                      var7[1][1 + var13 * 4] = cu.field_o[var11];
                                      var7[1][4 * var13 - -2] = bq.field_h[var11];
                                      var7[1][3 + 4 * var13] = im.field_o[var11];
                                      if (ue.a(bra.field_M[var11], param0 + 44)) {
                                        if (0 != im.field_o[var11] + (bq.field_h[var11] + cu.field_o[var11])) {
                                          break L9;
                                        } else {
                                          var6[1][var13] = null;
                                          var13--;
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var13++;
                                    var9++;
                                    continue L8;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = boa.field_n[var9];
                                  var6[0][var10] = bra.field_M[var11];
                                  var7[0][4 * var10] = jk.field_h[var11];
                                  var7[0][1 + 4 * var10] = cu.field_o[var11];
                                  var7[0][2 + 4 * var10] = bq.field_h[var11];
                                  var7[0][var10 * 4 + 3] = im.field_o[var11];
                                  if (!ue.a(bra.field_M[var11], 0)) {
                                    break L10;
                                  } else {
                                    if (-1 != (im.field_o[var11] + cu.field_o[var11] + bq.field_h[var11] ^ -1)) {
                                      break L10;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              dga.a(var14, 0);
                              if (var6_int != 0) {
                                qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -90);
                                break L11;
                              } else {
                                var3.field_g = ir.field_a;
                                var3.field_f = kc.field_b;
                                var3.field_l = tna.field_f;
                                var3.field_j = vd.field_p;
                                qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -97);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        bra.field_M[var6_int] = var14.e((byte) -76);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3.field_i = true;
                var3.p(7);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "vh.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            this.field_d[var2] = (byte) 0;
        }
        this.field_a = 0;
        this.field_k = 0;
        this.field_e[0] = (byte) 0;
        var2 = 0;
        int var3 = 115 / ((param0 - 58) / 35);
        while (8 > var2) {
            this.field_l[var2] = 0L;
            var2++;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 >= -15) {
            return;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_e[this.field_k] = (byte)fh.a((int) this.field_e[this.field_k], 128 >>> sea.c(this.field_a, 7));
              this.field_k = this.field_k + 1;
              if (this.field_k <= param1) {
                break L1;
              } else {
                L2: while (true) {
                  if (-65 >= (this.field_k ^ -1)) {
                    this.a(false);
                    this.field_k = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_k;
                    this.field_k = this.field_k + 1;
                    this.field_e[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (this.field_k >= 32) {
                lua.a(this.field_d, 0, this.field_e, 32, 32);
                this.a(false);
                var4_int = 0;
                var5 = param0;
                L4: while (true) {
                  if (-9 >= (var4_int ^ -1)) {
                    break L0;
                  } else {
                    var6 = this.field_l[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> -1463451784);
                    param2[var5 + 1] = (byte)(int)(var6 >>> -827882896);
                    param2[var5 + 2] = (byte)(int)(var6 >>> -1783396312);
                    param2[var5 - -3] = (byte)(int)(var6 >>> -791915424);
                    param2[var5 + 4] = (byte)(int)(var6 >>> 311221400);
                    param2[var5 - -5] = (byte)(int)(var6 >>> -622824880);
                    param2[6 + var5] = (byte)(int)(var6 >>> -747024504);
                    param2[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                fieldTemp$3 = this.field_k;
                this.field_k = this.field_k + 1;
                this.field_e[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("vh.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2, lj param3) {
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -27201) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            if (!param1) {
              L2: {
                if (param0 != param3.n(31974).field_d) {
                  stackIn_10_0 = 0;
                  break L2;
                } else {
                  stackIn_10_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L3: {
                if (param3.i((byte) 84).field_d != param0) {
                  stackIn_6_0 = 0;
                  break L3;
                } else {
                  stackIn_6_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("vh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    vh() {
        this.field_m = new long[8];
        this.field_a = 0;
        this.field_j = new long[8];
        this.field_f = new long[8];
        this.field_i = new long[8];
        this.field_d = new byte[32];
        this.field_l = new long[8];
        this.field_e = new byte[64];
        this.field_k = 0;
    }

    static {
        field_c = "Some objects in the game can be pushed or pulled. Walk into them holding <img=8><img=9>";
        field_h = new float[4];
        field_b = "3rd";
    }
}
