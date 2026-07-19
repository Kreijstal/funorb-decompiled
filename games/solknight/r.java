/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    private int field_k;
    private int[] field_f;
    private int[] field_h;
    private int field_a;
    private int field_c;
    private int field_j;
    static od[] field_i;
    static nc field_b;
    static o field_d;
    static char[] field_g;
    static String field_e;

    final static wg b(int param0) {
        if (ma.field_o != el.field_p) {
          if (ma.field_o == da.field_d) {
            ma.field_o = el.field_p;
            return vb.field_j;
          } else {
            if (param0 >= 14) {
              return null;
            } else {
              field_g = (char[]) null;
              return null;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final void a(int param0) {
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int dupTemp$9 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        int fieldTemp$5 = this.field_a + 1;
        this.field_a = this.field_a + 1;
        this.field_j = this.field_j + fieldTemp$5;
        if (param0 == 12009) {
          var2 = 0;
          L0: while (true) {
            if (-257 < (var2 ^ -1)) {
              var3 = this.field_h[var2];
              if (var5 == 0) {
                L1: {
                  L2: {
                    if (0 != (2 & var2)) {
                      break L2;
                    } else {
                      L3: {
                        if (-1 == (1 & var2 ^ -1)) {
                          break L3;
                        } else {
                          this.field_c = this.field_c ^ this.field_c >>> 1204613894;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_c = this.field_c ^ this.field_c << -543514227;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if ((1 & var2) != 0) {
                      break L4;
                    } else {
                      this.field_c = this.field_c ^ this.field_c << 741576098;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_c = this.field_c ^ this.field_c >>> -1674131120;
                  break L1;
                }
                this.field_c = this.field_c + this.field_h[var2 + 128 & 255];
                dupTemp$6 = this.field_j + this.field_c + this.field_h[fi.a(1020, var3) >> 249695458];
                var4 = dupTemp$6;
                this.field_h[var2] = dupTemp$6;
                dupTemp$7 = this.field_h[fi.a(var4 >> 1038198280, 1020) >> -146635614] + var3;
                this.field_j = dupTemp$7;
                this.field_f[var2] = dupTemp$7;
                var2++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_k = 0;
          var2 = 0;
          L5: while (true) {
            if (-257 < (var2 ^ -1)) {
              var3 = this.field_h[var2];
              if (var5 == 0) {
                L6: {
                  L7: {
                    if (0 != (2 & var2)) {
                      break L7;
                    } else {
                      L8: {
                        if (-1 == (1 & var2 ^ -1)) {
                          break L8;
                        } else {
                          this.field_c = this.field_c ^ this.field_c >>> 1204613894;
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      this.field_c = this.field_c ^ this.field_c << -543514227;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if ((1 & var2) != 0) {
                      break L9;
                    } else {
                      this.field_c = this.field_c ^ this.field_c << 741576098;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_c = this.field_c ^ this.field_c >>> -1674131120;
                  break L6;
                }
                this.field_c = this.field_c + this.field_h[var2 + 128 & 255];
                dupTemp$8 = this.field_j + this.field_c + this.field_h[fi.a(1020, var3) >> 249695458];
                var4 = dupTemp$8;
                this.field_h[var2] = dupTemp$8;
                dupTemp$9 = this.field_h[fi.a(var4 >> 1038198280, 1020) >> -146635614] + var3;
                this.field_j = dupTemp$9;
                this.field_f[var2] = dupTemp$9;
                var2++;
                if (var5 == 0) {
                  continue L5;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final int a(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        var2 = 58 % ((66 - param0) / 35);
        if (this.field_k == 0) {
          this.a(12009);
          this.field_k = 256;
          fieldTemp$4 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          return this.field_f[fieldTemp$4];
        } else {
          fieldTemp$5 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          return this.field_f[fieldTemp$5];
        }
    }

    r(int[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            this.field_h = new int[256];
            this.field_f = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var2_int) {
                    break L3;
                  } else {
                    this.field_f[var2_int] = param0[var2_int];
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.d(93);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("r.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static da a(int param0, int param1) {
        if (param1 <= 71) {
            return (da) null;
        }
        return ab.a(2097152, param0, 1, false, true, false);
    }

    public static void c(int param0) {
        field_g = null;
        field_d = null;
        int var1 = 121 % ((-28 - param0) / 52);
        field_b = null;
        field_e = null;
        field_i = null;
    }

    private final void d(int param0) {
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
        var11 = SolKnight.field_L ? 1 : 0;
        var10 = -1640531527;
        var4 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var9 = -1640531527;
        var2 = 0;
        L0: while (true) {
          L1: {
            if ((var2 ^ -1) <= -5) {
              var2 = 0;
              break L1;
            } else {
              var3 = var3 ^ var4 << 1173189387;
              var6 = var6 + var3;
              var4 = var4 + var5;
              var4 = var4 ^ var5 >>> -703423006;
              var7 = var7 + var4;
              var5 = var5 + var6;
              var5 = var5 ^ var6 << 1306579432;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> -1864505584;
              var9 = var9 + var6;
              var7 = var7 + var8;
              var7 = var7 ^ var8 << 1085041322;
              var8 = var8 + var9;
              var10 = var10 + var7;
              var8 = var8 ^ var9 >>> -1705574268;
              var3 = var3 + var8;
              var9 = var9 + var10;
              var9 = var9 ^ var10 << 2025044552;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> -1849570999;
              var5 = var5 + var10;
              var3 = var3 + var4;
              var2++;
              if (var11 != 0) {
                break L1;
              } else {
                if (var11 == 0) {
                  continue L0;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (-257 >= (var2 ^ -1)) {
                          break L4;
                        } else {
                          var5 = var5 + this.field_f[var2 + 2];
                          var10 = var10 + this.field_f[var2 - -7];
                          var8 = var8 + this.field_f[var2 - -5];
                          var7 = var7 + this.field_f[var2 + 4];
                          var6 = var6 + this.field_f[var2 + 3];
                          var9 = var9 + this.field_f[6 + var2];
                          var4 = var4 + this.field_f[1 + var2];
                          var3 = var3 + this.field_f[var2];
                          var3 = var3 ^ var4 << -422290325;
                          var6 = var6 + var3;
                          var4 = var4 + var5;
                          var4 = var4 ^ var5 >>> 1345224994;
                          var7 = var7 + var4;
                          var5 = var5 + var6;
                          var5 = var5 ^ var6 << 1139981768;
                          var6 = var6 + var7;
                          var8 = var8 + var5;
                          var6 = var6 ^ var7 >>> -1842368240;
                          var9 = var9 + var6;
                          var7 = var7 + var8;
                          var7 = var7 ^ var8 << -327332886;
                          var8 = var8 + var9;
                          var10 = var10 + var7;
                          var8 = var8 ^ var9 >>> 148293348;
                          var3 = var3 + var8;
                          var9 = var9 + var10;
                          var9 = var9 ^ var10 << 2100529704;
                          var4 = var4 + var9;
                          var10 = var10 + var3;
                          var10 = var10 ^ var3 >>> -817450103;
                          var5 = var5 + var10;
                          var3 = var3 + var4;
                          this.field_h[var2] = var3;
                          this.field_h[1 + var2] = var4;
                          this.field_h[var2 - -2] = var5;
                          this.field_h[3 + var2] = var6;
                          this.field_h[var2 - -4] = var7;
                          this.field_h[5 + var2] = var8;
                          this.field_h[6 + var2] = var9;
                          this.field_h[7 + var2] = var10;
                          var2 += 8;
                          if (var11 != 0) {
                            break L3;
                          } else {
                            if (var11 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var2 = 0;
                      break L3;
                    }
                    L5: {
                      if (param0 > 38) {
                        break L5;
                      } else {
                        this.d(-101);
                        break L5;
                      }
                    }
                    L6: while (true) {
                      if (256 > var2) {
                        var10 = var10 + this.field_h[7 + var2];
                        var5 = var5 + this.field_h[2 + var2];
                        var4 = var4 + this.field_h[1 + var2];
                        var7 = var7 + this.field_h[4 + var2];
                        var8 = var8 + this.field_h[5 + var2];
                        var6 = var6 + this.field_h[3 + var2];
                        var3 = var3 + this.field_h[var2];
                        var9 = var9 + this.field_h[var2 - -6];
                        var3 = var3 ^ var4 << 1784184779;
                        var4 = var4 + var5;
                        var6 = var6 + var3;
                        var4 = var4 ^ var5 >>> -1997580862;
                        var7 = var7 + var4;
                        var5 = var5 + var6;
                        var5 = var5 ^ var6 << -866398008;
                        var6 = var6 + var7;
                        var8 = var8 + var5;
                        var6 = var6 ^ var7 >>> 1874927984;
                        var9 = var9 + var6;
                        var7 = var7 + var8;
                        var7 = var7 ^ var8 << -1459882710;
                        var10 = var10 + var7;
                        var8 = var8 + var9;
                        var8 = var8 ^ var9 >>> -566889948;
                        var9 = var9 + var10;
                        var3 = var3 + var8;
                        var9 = var9 ^ var10 << 1787884008;
                        var10 = var10 + var3;
                        var4 = var4 + var9;
                        var10 = var10 ^ var3 >>> -1875758071;
                        var3 = var3 + var4;
                        var5 = var5 + var10;
                        this.field_h[var2] = var3;
                        this.field_h[var2 + 1] = var4;
                        this.field_h[var2 - -2] = var5;
                        this.field_h[3 + var2] = var6;
                        this.field_h[4 + var2] = var7;
                        this.field_h[5 + var2] = var8;
                        this.field_h[6 + var2] = var9;
                        this.field_h[var2 + 7] = var10;
                        var2 += 8;
                        if (var11 == 0) {
                          continue L6;
                        } else {
                          return;
                        }
                      } else {
                        this.a(12009);
                        this.field_k = 256;
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
          L7: while (true) {
            L8: {
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                break L8;
              } else {
                var5 = var5 + this.field_f[var2 + 2];
                var10 = var10 + this.field_f[var2 - -7];
                var8 = var8 + this.field_f[var2 - -5];
                var7 = var7 + this.field_f[var2 + 4];
                var6 = var6 + this.field_f[var2 + 3];
                var9 = var9 + this.field_f[6 + var2];
                var4 = var4 + this.field_f[1 + var2];
                var3 = var3 + this.field_f[var2];
                var3 = var3 ^ var4 << -422290325;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1345224994;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 1139981768;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1842368240;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << -327332886;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 148293348;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 2100529704;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -817450103;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_h[var2] = var3;
                this.field_h[1 + var2] = var4;
                this.field_h[var2 - -2] = var5;
                this.field_h[3 + var2] = var6;
                this.field_h[var2 - -4] = var7;
                this.field_h[5 + var2] = var8;
                this.field_h[6 + var2] = var9;
                this.field_h[7 + var2] = var10;
                var2 += 8;
                if (var11 != 0) {
                  break L8;
                } else {
                  if (var11 == 0) {
                    continue L7;
                  } else {
                    L9: {
                      var2 = 0;
                      if (param0 > 38) {
                        break L9;
                      } else {
                        this.d(-101);
                        break L9;
                      }
                    }
                    L10: while (true) {
                      if (256 > var2) {
                        var10 = var10 + this.field_h[7 + var2];
                        var5 = var5 + this.field_h[2 + var2];
                        var4 = var4 + this.field_h[1 + var2];
                        var7 = var7 + this.field_h[4 + var2];
                        var8 = var8 + this.field_h[5 + var2];
                        var6 = var6 + this.field_h[3 + var2];
                        var3 = var3 + this.field_h[var2];
                        var9 = var9 + this.field_h[var2 - -6];
                        var3 = var3 ^ var4 << 1784184779;
                        var4 = var4 + var5;
                        var6 = var6 + var3;
                        var4 = var4 ^ var5 >>> -1997580862;
                        var7 = var7 + var4;
                        var5 = var5 + var6;
                        var5 = var5 ^ var6 << -866398008;
                        var6 = var6 + var7;
                        var8 = var8 + var5;
                        var6 = var6 ^ var7 >>> 1874927984;
                        var9 = var9 + var6;
                        var7 = var7 + var8;
                        var7 = var7 ^ var8 << -1459882710;
                        var10 = var10 + var7;
                        var8 = var8 + var9;
                        var8 = var8 ^ var9 >>> -566889948;
                        var9 = var9 + var10;
                        var3 = var3 + var8;
                        var9 = var9 ^ var10 << 1787884008;
                        var10 = var10 + var3;
                        var4 = var4 + var9;
                        var10 = var10 ^ var3 >>> -1875758071;
                        var3 = var3 + var4;
                        var5 = var5 + var10;
                        this.field_h[var2] = var3;
                        this.field_h[var2 + 1] = var4;
                        this.field_h[var2 - -2] = var5;
                        this.field_h[3 + var2] = var6;
                        this.field_h[4 + var2] = var7;
                        this.field_h[5 + var2] = var8;
                        this.field_h[6 + var2] = var9;
                        this.field_h[var2 + 7] = var10;
                        var2 += 8;
                        if (var11 == 0) {
                          continue L10;
                        } else {
                          return;
                        }
                      } else {
                        this.a(12009);
                        this.field_k = 256;
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (param0 <= 38) {
              this.d(-101);
              L11: while (true) {
                if (256 > var2) {
                  var10 = var10 + this.field_h[7 + var2];
                  var5 = var5 + this.field_h[2 + var2];
                  var4 = var4 + this.field_h[1 + var2];
                  var7 = var7 + this.field_h[4 + var2];
                  var8 = var8 + this.field_h[5 + var2];
                  var6 = var6 + this.field_h[3 + var2];
                  var3 = var3 + this.field_h[var2];
                  var9 = var9 + this.field_h[var2 - -6];
                  var3 = var3 ^ var4 << 1784184779;
                  var4 = var4 + var5;
                  var6 = var6 + var3;
                  var4 = var4 ^ var5 >>> -1997580862;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << -866398008;
                  var6 = var6 + var7;
                  var8 = var8 + var5;
                  var6 = var6 ^ var7 >>> 1874927984;
                  var9 = var9 + var6;
                  var7 = var7 + var8;
                  var7 = var7 ^ var8 << -1459882710;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> -566889948;
                  var9 = var9 + var10;
                  var3 = var3 + var8;
                  var9 = var9 ^ var10 << 1787884008;
                  var10 = var10 + var3;
                  var4 = var4 + var9;
                  var10 = var10 ^ var3 >>> -1875758071;
                  var3 = var3 + var4;
                  var5 = var5 + var10;
                  this.field_h[var2] = var3;
                  this.field_h[var2 + 1] = var4;
                  this.field_h[var2 - -2] = var5;
                  this.field_h[3 + var2] = var6;
                  this.field_h[4 + var2] = var7;
                  this.field_h[5 + var2] = var8;
                  this.field_h[6 + var2] = var9;
                  this.field_h[var2 + 7] = var10;
                  var2 += 8;
                  if (var11 == 0) {
                    continue L11;
                  } else {
                    return;
                  }
                } else {
                  this.a(12009);
                  this.field_k = 256;
                  return;
                }
              }
            } else {
              L12: while (true) {
                if (256 > var2) {
                  var10 = var10 + this.field_h[7 + var2];
                  var5 = var5 + this.field_h[2 + var2];
                  var4 = var4 + this.field_h[1 + var2];
                  var7 = var7 + this.field_h[4 + var2];
                  var8 = var8 + this.field_h[5 + var2];
                  var6 = var6 + this.field_h[3 + var2];
                  var3 = var3 + this.field_h[var2];
                  var9 = var9 + this.field_h[var2 - -6];
                  var3 = var3 ^ var4 << 1784184779;
                  var4 = var4 + var5;
                  var6 = var6 + var3;
                  var4 = var4 ^ var5 >>> -1997580862;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << -866398008;
                  var6 = var6 + var7;
                  var8 = var8 + var5;
                  var6 = var6 ^ var7 >>> 1874927984;
                  var9 = var9 + var6;
                  var7 = var7 + var8;
                  var7 = var7 ^ var8 << -1459882710;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> -566889948;
                  var9 = var9 + var10;
                  var3 = var3 + var8;
                  var9 = var9 ^ var10 << 1787884008;
                  var10 = var10 + var3;
                  var4 = var4 + var9;
                  var10 = var10 ^ var3 >>> -1875758071;
                  var3 = var3 + var4;
                  var5 = var5 + var10;
                  this.field_h[var2] = var3;
                  this.field_h[var2 + 1] = var4;
                  this.field_h[var2 - -2] = var5;
                  this.field_h[3 + var2] = var6;
                  this.field_h[4 + var2] = var7;
                  this.field_h[5 + var2] = var8;
                  this.field_h[6 + var2] = var9;
                  this.field_h[var2 + 7] = var10;
                  var2 += 8;
                  if (var11 == 0) {
                    continue L12;
                  } else {
                    return;
                  }
                } else {
                  this.a(12009);
                  this.field_k = 256;
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(da param0, int param1, int param2, e param3) {
        try {
            a.field_i = param1 * l.a((byte) 96) / 1000;
            ae.a(26197, param0);
            pb.a(param0, param2 ^ -89);
            pj.a(param2 + 2, param0);
            qk.e(param2 ^ param2);
            gl.a((byte) 28);
            ad.field_h = 0 + -a.field_i;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "r.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new nc();
        field_e = "Waiting for graphics";
        field_g = new char[128];
    }
}
