/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static boolean field_j;
    private int[] field_c;
    private int field_f;
    static int field_b;
    static ja field_h;
    static String field_l;
    private int field_k;
    static boolean field_i;
    private int field_a;
    private int[] field_g;
    private int field_e;
    static String field_d;

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            kj.field_r.b(-102);
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-33 >= (var1_int ^ -1)) {
                    break L3;
                  } else {
                    dc.field_Ib[var1_int] = 0L;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 26673) {
                  break L2;
                } else {
                  o.b(-5);
                  break L2;
                }
              }
              var1_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (-33 >= (var1_int ^ -1)) {
                      break L6;
                    } else {
                      pj.field_K[var1_int] = 0L;
                      var1_int++;
                      if (var2 != 0) {
                        break L5;
                      } else {
                        if (var2 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ic.field_a = 0;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "o.F(" + param0 + ')');
        }
    }

    private final void c(int param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int fieldTemp$3 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        this.field_e = this.field_e + fieldTemp$3;
        var2 = 0;
        if (param0 == 2) {
          L0: while (true) {
            if (-257 < (var2 ^ -1)) {
              var3 = this.field_c[var2];
              if (var5 == 0) {
                L1: {
                  L2: {
                    if ((2 & var2) != 0) {
                      break L2;
                    } else {
                      L3: {
                        if ((1 & var2) == 0) {
                          break L3;
                        } else {
                          this.field_a = this.field_a ^ this.field_a >>> 143456070;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_a = this.field_a ^ this.field_a << 30377645;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (-1 == (var2 & 1 ^ -1)) {
                      break L4;
                    } else {
                      this.field_a = this.field_a ^ this.field_a >>> -465059280;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_a = this.field_a ^ this.field_a << 1147010754;
                  break L1;
                }
                this.field_a = this.field_a + this.field_c[255 & var2 + 128];
                dupTemp$4 = this.field_c[tq.b(var3 >> 2130026562, 255)] - (-this.field_a + -this.field_e);
                var4 = dupTemp$4;
                this.field_c[var2] = dupTemp$4;
                dupTemp$5 = var3 + this.field_c[tq.b(var4 >> 2054902344, 1020) >> -2036713214];
                this.field_e = dupTemp$5;
                this.field_g[var2] = dupTemp$5;
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
          return;
        }
    }

    final int a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (param0 <= -20) {
          if (this.field_k == 0) {
            this.c(2);
            this.field_k = 256;
            fieldTemp$4 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            return this.field_g[fieldTemp$4];
          } else {
            fieldTemp$5 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            return this.field_g[fieldTemp$5];
          }
        } else {
          field_b = -115;
          if (this.field_k != 0) {
            fieldTemp$6 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            return this.field_g[fieldTemp$6];
          } else {
            this.c(2);
            this.field_k = 256;
            fieldTemp$7 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            return this.field_g[fieldTemp$7];
          }
        }
    }

    public static void b(int param0) {
        field_l = null;
        field_d = null;
        field_h = null;
        if (param0 == -13532) {
            return;
        }
        o.b(-51);
    }

    private final void a(boolean param0) {
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
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = -1640531527;
        var10 = -1640531527;
        var6 = -1640531527;
        var7 = -1640531527;
        var5 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var4 = -1640531527;
        var2 = 0;
        L0: while (true) {
          L1: {
            if (4 <= var2) {
              var2 = 0;
              break L1;
            } else {
              var3 = var3 ^ var4 << -1613804693;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> -1121109854;
              var5 = var5 + var6;
              var7 = var7 + var4;
              var5 = var5 ^ var6 << 913084296;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> -691264880;
              var9 = var9 + var6;
              var7 = var7 + var8;
              var7 = var7 ^ var8 << -683511286;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> -1328579900;
              var9 = var9 + var10;
              var3 = var3 + var8;
              var9 = var9 ^ var10 << 688162056;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> -1655429527;
              var3 = var3 + var4;
              var5 = var5 + var10;
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
                          var9 = var9 + this.field_g[var2 + 6];
                          var10 = var10 + this.field_g[7 + var2];
                          var7 = var7 + this.field_g[4 + var2];
                          var3 = var3 + this.field_g[var2];
                          var5 = var5 + this.field_g[var2 + 2];
                          var8 = var8 + this.field_g[5 + var2];
                          var4 = var4 + this.field_g[1 + var2];
                          var6 = var6 + this.field_g[3 + var2];
                          var3 = var3 ^ var4 << 1979023147;
                          var4 = var4 + var5;
                          var6 = var6 + var3;
                          var4 = var4 ^ var5 >>> -1830220158;
                          var5 = var5 + var6;
                          var7 = var7 + var4;
                          var5 = var5 ^ var6 << 664497352;
                          var6 = var6 + var7;
                          var8 = var8 + var5;
                          var6 = var6 ^ var7 >>> -1421901168;
                          var7 = var7 + var8;
                          var9 = var9 + var6;
                          var7 = var7 ^ var8 << 1588423242;
                          var8 = var8 + var9;
                          var10 = var10 + var7;
                          var8 = var8 ^ var9 >>> 391159908;
                          var3 = var3 + var8;
                          var9 = var9 + var10;
                          var9 = var9 ^ var10 << 302716168;
                          var4 = var4 + var9;
                          var10 = var10 + var3;
                          var10 = var10 ^ var3 >>> -1688836407;
                          var5 = var5 + var10;
                          var3 = var3 + var4;
                          this.field_c[var2] = var3;
                          this.field_c[1 + var2] = var4;
                          this.field_c[2 + var2] = var5;
                          this.field_c[3 + var2] = var6;
                          this.field_c[var2 + 4] = var7;
                          this.field_c[5 + var2] = var8;
                          this.field_c[6 + var2] = var9;
                          this.field_c[var2 + 7] = var10;
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
                    L5: while (true) {
                      if (var2 >= 256) {
                        if (!param0) {
                          this.c(2);
                          this.field_k = 256;
                          return;
                        } else {
                          this.c(104);
                          this.c(2);
                          this.field_k = 256;
                          return;
                        }
                      } else {
                        var9 = var9 + this.field_c[var2 + 6];
                        var5 = var5 + this.field_c[2 + var2];
                        var6 = var6 + this.field_c[3 + var2];
                        var4 = var4 + this.field_c[1 + var2];
                        var3 = var3 + this.field_c[var2];
                        var8 = var8 + this.field_c[5 + var2];
                        var10 = var10 + this.field_c[7 + var2];
                        var7 = var7 + this.field_c[4 + var2];
                        var3 = var3 ^ var4 << 912764459;
                        var4 = var4 + var5;
                        var6 = var6 + var3;
                        var4 = var4 ^ var5 >>> -1922193342;
                        var5 = var5 + var6;
                        var7 = var7 + var4;
                        var5 = var5 ^ var6 << 689781704;
                        var8 = var8 + var5;
                        var6 = var6 + var7;
                        var6 = var6 ^ var7 >>> 136627088;
                        var9 = var9 + var6;
                        var7 = var7 + var8;
                        var7 = var7 ^ var8 << -215086742;
                        var8 = var8 + var9;
                        var10 = var10 + var7;
                        var8 = var8 ^ var9 >>> -1417220188;
                        var9 = var9 + var10;
                        var3 = var3 + var8;
                        var9 = var9 ^ var10 << -1419521080;
                        var4 = var4 + var9;
                        var10 = var10 + var3;
                        var10 = var10 ^ var3 >>> -2047021143;
                        var3 = var3 + var4;
                        var5 = var5 + var10;
                        this.field_c[var2] = var3;
                        this.field_c[var2 - -1] = var4;
                        this.field_c[2 + var2] = var5;
                        this.field_c[var2 - -3] = var6;
                        this.field_c[var2 + 4] = var7;
                        this.field_c[var2 - -5] = var8;
                        this.field_c[var2 - -6] = var9;
                        this.field_c[7 + var2] = var10;
                        var2 += 8;
                        if (var11 == 0) {
                          continue L5;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L6: while (true) {
            L7: {
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                break L7;
              } else {
                var9 = var9 + this.field_g[var2 + 6];
                var10 = var10 + this.field_g[7 + var2];
                var7 = var7 + this.field_g[4 + var2];
                var3 = var3 + this.field_g[var2];
                var5 = var5 + this.field_g[var2 + 2];
                var8 = var8 + this.field_g[5 + var2];
                var4 = var4 + this.field_g[1 + var2];
                var6 = var6 + this.field_g[3 + var2];
                var3 = var3 ^ var4 << 1979023147;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -1830220158;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 664497352;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1421901168;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 1588423242;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 391159908;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 302716168;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -1688836407;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_c[var2] = var3;
                this.field_c[1 + var2] = var4;
                this.field_c[2 + var2] = var5;
                this.field_c[3 + var2] = var6;
                this.field_c[var2 + 4] = var7;
                this.field_c[5 + var2] = var8;
                this.field_c[6 + var2] = var9;
                this.field_c[var2 + 7] = var10;
                var2 += 8;
                if (var11 != 0) {
                  break L7;
                } else {
                  if (var11 == 0) {
                    continue L6;
                  } else {
                    var2 = 0;
                    L8: while (true) {
                      if (var2 < 256) {
                        var9 = var9 + this.field_c[var2 + 6];
                        var5 = var5 + this.field_c[2 + var2];
                        var6 = var6 + this.field_c[3 + var2];
                        var4 = var4 + this.field_c[1 + var2];
                        var3 = var3 + this.field_c[var2];
                        var8 = var8 + this.field_c[5 + var2];
                        var10 = var10 + this.field_c[7 + var2];
                        var7 = var7 + this.field_c[4 + var2];
                        var3 = var3 ^ var4 << 912764459;
                        var4 = var4 + var5;
                        var6 = var6 + var3;
                        var4 = var4 ^ var5 >>> -1922193342;
                        var5 = var5 + var6;
                        var7 = var7 + var4;
                        var5 = var5 ^ var6 << 689781704;
                        var8 = var8 + var5;
                        var6 = var6 + var7;
                        var6 = var6 ^ var7 >>> 136627088;
                        var9 = var9 + var6;
                        var7 = var7 + var8;
                        var7 = var7 ^ var8 << -215086742;
                        var8 = var8 + var9;
                        var10 = var10 + var7;
                        var8 = var8 ^ var9 >>> -1417220188;
                        var9 = var9 + var10;
                        var3 = var3 + var8;
                        var9 = var9 ^ var10 << -1419521080;
                        var4 = var4 + var9;
                        var10 = var10 + var3;
                        var10 = var10 ^ var3 >>> -2047021143;
                        var3 = var3 + var4;
                        var5 = var5 + var10;
                        this.field_c[var2] = var3;
                        this.field_c[var2 - -1] = var4;
                        this.field_c[2 + var2] = var5;
                        this.field_c[var2 - -3] = var6;
                        this.field_c[var2 + 4] = var7;
                        this.field_c[var2 - -5] = var8;
                        this.field_c[var2 - -6] = var9;
                        this.field_c[7 + var2] = var10;
                        var2 += 8;
                        if (var11 == 0) {
                          continue L8;
                        } else {
                          return;
                        }
                      } else {
                        if (!param0) {
                          this.c(2);
                          this.field_k = 256;
                          return;
                        } else {
                          this.c(104);
                          this.c(2);
                          this.field_k = 256;
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
            L9: while (true) {
              if (var2 >= 256) {
                if (!param0) {
                  this.c(2);
                  this.field_k = 256;
                  return;
                } else {
                  this.c(104);
                  this.c(2);
                  this.field_k = 256;
                  return;
                }
              } else {
                var9 = var9 + this.field_c[var2 + 6];
                var5 = var5 + this.field_c[2 + var2];
                var6 = var6 + this.field_c[3 + var2];
                var4 = var4 + this.field_c[1 + var2];
                var3 = var3 + this.field_c[var2];
                var8 = var8 + this.field_c[5 + var2];
                var10 = var10 + this.field_c[7 + var2];
                var7 = var7 + this.field_c[4 + var2];
                var3 = var3 ^ var4 << 912764459;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -1922193342;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 689781704;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 136627088;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << -215086742;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -1417220188;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -1419521080;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -2047021143;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_c[var2] = var3;
                this.field_c[var2 - -1] = var4;
                this.field_c[2 + var2] = var5;
                this.field_c[var2 - -3] = var6;
                this.field_c[var2 + 4] = var7;
                this.field_c[var2 - -5] = var8;
                this.field_c[var2 - -6] = var9;
                this.field_c[7 + var2] = var10;
                var2 += 8;
                if (var11 == 0) {
                  continue L9;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    o(int[] param0) {
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
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_c = new int[256];
            this.field_g = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= param0.length) {
                    break L3;
                  } else {
                    this.field_g[var2_int] = param0[var2_int];
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
                this.a(false);
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
            stackOut_7_1 = new StringBuilder().append("o.<init>(");
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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(u param0, int param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, param1);
        var3.a(-54, 2);
        if (param2 >= -69) {
            return;
        }
        try {
            var3.a(125, 0);
            var3.a(-55, param0.field_g);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "o.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "If you are not, please change your password to something more obscure!";
        field_i = true;
        field_d = "Type your email address again to make sure it's correct";
    }
}
