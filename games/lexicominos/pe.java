/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_e;
    static char field_b;
    private int field_i;
    private int field_f;
    private int[] field_g;
    private int[] field_h;
    static String field_a;
    private int field_d;
    static String field_j;
    private int field_c;

    public static void a(byte param0) {
        int var1 = -40 / ((36 - param0) / 44);
        field_j = null;
        field_e = null;
        field_a = null;
    }

    final int c(int param0) {
        if (!(this.field_d != param0)) {
            this.a(param0 ^ -2034);
            this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_g[fieldTemp$0];
    }

    final static void a(int param0, int param1, int param2, le param3, int param4, db[] param5, db[] param6, int param7, le param8, int param9, int param10, int param11, int param12, int param13, boolean param14) {
        try {
            db[] var16 = (db[]) null;
            aj.a(0, param9, 0, ea.field_b, param3, g.field_n, 480, param7, ec.field_c, param8, param13, param0, param5, (db[]) null, param4, true, param12, param6, param2, param10, param1);
            if (param11 > -58) {
                field_e = (String) null;
            }
            bl.a(param14, 2);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
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
        var5 = Lexicominos.field_L ? 1 : 0;
        int fieldTemp$5 = this.field_i + 1;
        this.field_i = this.field_i + 1;
        this.field_f = this.field_f + fieldTemp$5;
        if (param0 == -2034) {
          var2 = 0;
          L0: while (true) {
            if (-257 < (var2 ^ -1)) {
              var3 = this.field_h[var2];
              if (var5 == 0) {
                L1: {
                  L2: {
                    if ((var2 & 2) != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (0 == (var2 & 1)) {
                          break L3;
                        } else {
                          this.field_c = this.field_c ^ this.field_c >>> -1807891514;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_c = this.field_c ^ this.field_c << -1151052115;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (-1 != (1 & var2 ^ -1)) {
                      break L4;
                    } else {
                      this.field_c = this.field_c ^ this.field_c << 924088194;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_c = this.field_c ^ this.field_c >>> 1629135984;
                  break L1;
                }
                this.field_c = this.field_c + this.field_h[255 & 128 + var2];
                dupTemp$6 = this.field_f + this.field_c + this.field_h[vg.a(1020, var3) >> -525883838];
                var4 = dupTemp$6;
                this.field_h[var2] = dupTemp$6;
                dupTemp$7 = this.field_h[vg.a(255, var4 >> -261288888 >> -436990558)] - -var3;
                this.field_f = dupTemp$7;
                this.field_g[var2] = dupTemp$7;
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
          this.field_d = 0;
          var2 = 0;
          L5: while (true) {
            if (-257 < (var2 ^ -1)) {
              var3 = this.field_h[var2];
              if (var5 == 0) {
                L6: {
                  L7: {
                    if ((var2 & 2) != 0) {
                      break L7;
                    } else {
                      L8: {
                        if (0 == (var2 & 1)) {
                          break L8;
                        } else {
                          this.field_c = this.field_c ^ this.field_c >>> -1807891514;
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      this.field_c = this.field_c ^ this.field_c << -1151052115;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (-1 != (1 & var2 ^ -1)) {
                      break L9;
                    } else {
                      this.field_c = this.field_c ^ this.field_c << 924088194;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_c = this.field_c ^ this.field_c >>> 1629135984;
                  break L6;
                }
                this.field_c = this.field_c + this.field_h[255 & 128 + var2];
                dupTemp$8 = this.field_f + this.field_c + this.field_h[vg.a(1020, var3) >> -525883838];
                var4 = dupTemp$8;
                this.field_h[var2] = dupTemp$8;
                dupTemp$9 = this.field_h[vg.a(255, var4 >> -261288888 >> -436990558)] - -var3;
                this.field_f = dupTemp$9;
                this.field_g[var2] = dupTemp$9;
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

    private final void b(int param0) {
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
        var11 = Lexicominos.field_L ? 1 : 0;
        if (param0 == -24892) {
          var8 = -1640531527;
          var4 = -1640531527;
          var3 = -1640531527;
          var6 = -1640531527;
          var5 = -1640531527;
          var10 = -1640531527;
          var9 = -1640531527;
          var7 = -1640531527;
          var2 = 0;
          L0: while (true) {
            L1: {
              if ((var2 ^ -1) <= -5) {
                var2 = 0;
                break L1;
              } else {
                var3 = var3 ^ var4 << -1744189045;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 230049858;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -1354752056;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -928714640;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -1383598294;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -267155900;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 1211697160;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -427202519;
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
                            var4 = var4 + this.field_g[1 + var2];
                            var3 = var3 + this.field_g[var2];
                            var10 = var10 + this.field_g[var2 + 7];
                            var6 = var6 + this.field_g[var2 - -3];
                            var9 = var9 + this.field_g[6 + var2];
                            var8 = var8 + this.field_g[var2 + 5];
                            var5 = var5 + this.field_g[2 + var2];
                            var7 = var7 + this.field_g[var2 - -4];
                            var3 = var3 ^ var4 << 1244647339;
                            var4 = var4 + var5;
                            var6 = var6 + var3;
                            var4 = var4 ^ var5 >>> 2024320354;
                            var5 = var5 + var6;
                            var7 = var7 + var4;
                            var5 = var5 ^ var6 << 852485224;
                            var8 = var8 + var5;
                            var6 = var6 + var7;
                            var6 = var6 ^ var7 >>> -959607888;
                            var7 = var7 + var8;
                            var9 = var9 + var6;
                            var7 = var7 ^ var8 << -1949847414;
                            var8 = var8 + var9;
                            var10 = var10 + var7;
                            var8 = var8 ^ var9 >>> 580294468;
                            var3 = var3 + var8;
                            var9 = var9 + var10;
                            var9 = var9 ^ var10 << -730799000;
                            var4 = var4 + var9;
                            var10 = var10 + var3;
                            var10 = var10 ^ var3 >>> 1723287689;
                            var5 = var5 + var10;
                            var3 = var3 + var4;
                            this.field_h[var2] = var3;
                            this.field_h[1 + var2] = var4;
                            this.field_h[var2 + 2] = var5;
                            this.field_h[var2 - -3] = var6;
                            this.field_h[4 + var2] = var7;
                            this.field_h[var2 + 5] = var8;
                            this.field_h[var2 + 6] = var9;
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
                      L5: while (true) {
                        if (-257 < (var2 ^ -1)) {
                          var9 = var9 + this.field_h[var2 - -6];
                          var8 = var8 + this.field_h[5 + var2];
                          var4 = var4 + this.field_h[var2 + 1];
                          var7 = var7 + this.field_h[var2 + 4];
                          var3 = var3 + this.field_h[var2];
                          var10 = var10 + this.field_h[7 + var2];
                          var5 = var5 + this.field_h[2 + var2];
                          var6 = var6 + this.field_h[var2 - -3];
                          var3 = var3 ^ var4 << -74087637;
                          var6 = var6 + var3;
                          var4 = var4 + var5;
                          var4 = var4 ^ var5 >>> -512437438;
                          var5 = var5 + var6;
                          var7 = var7 + var4;
                          var5 = var5 ^ var6 << -933219704;
                          var6 = var6 + var7;
                          var8 = var8 + var5;
                          var6 = var6 ^ var7 >>> -153572816;
                          var9 = var9 + var6;
                          var7 = var7 + var8;
                          var7 = var7 ^ var8 << -626644502;
                          var8 = var8 + var9;
                          var10 = var10 + var7;
                          var8 = var8 ^ var9 >>> -1133152316;
                          var3 = var3 + var8;
                          var9 = var9 + var10;
                          var9 = var9 ^ var10 << 557812456;
                          var10 = var10 + var3;
                          var4 = var4 + var9;
                          var10 = var10 ^ var3 >>> 2083273353;
                          var5 = var5 + var10;
                          var3 = var3 + var4;
                          this.field_h[var2] = var3;
                          this.field_h[1 + var2] = var4;
                          this.field_h[var2 + 2] = var5;
                          this.field_h[var2 + 3] = var6;
                          this.field_h[4 + var2] = var7;
                          this.field_h[var2 - -5] = var8;
                          this.field_h[6 + var2] = var9;
                          this.field_h[var2 - -7] = var10;
                          var2 += 8;
                          if (var11 == 0) {
                            continue L5;
                          } else {
                            return;
                          }
                        } else {
                          this.a(-2034);
                          this.field_d = 256;
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
            L6: while (true) {
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                L7: while (true) {
                  if (-257 < (var2 ^ -1)) {
                    var9 = var9 + this.field_h[var2 - -6];
                    var8 = var8 + this.field_h[5 + var2];
                    var4 = var4 + this.field_h[var2 + 1];
                    var7 = var7 + this.field_h[var2 + 4];
                    var3 = var3 + this.field_h[var2];
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var6 = var6 + this.field_h[var2 - -3];
                    var3 = var3 ^ var4 << -74087637;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -512437438;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -933219704;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -153572816;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -626644502;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1133152316;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 557812456;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 2083273353;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 + 2] = var5;
                    this.field_h[var2 + 3] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[var2 - -5] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                      continue L7;
                    } else {
                      return;
                    }
                  } else {
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                  }
                }
              } else {
                var4 = var4 + this.field_g[1 + var2];
                var3 = var3 + this.field_g[var2];
                var10 = var10 + this.field_g[var2 + 7];
                var6 = var6 + this.field_g[var2 - -3];
                var9 = var9 + this.field_g[6 + var2];
                var8 = var8 + this.field_g[var2 + 5];
                var5 = var5 + this.field_g[2 + var2];
                var7 = var7 + this.field_g[var2 - -4];
                var3 = var3 ^ var4 << 1244647339;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 2024320354;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 852485224;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> -959607888;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -1949847414;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 580294468;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -730799000;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 1723287689;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_h[var2] = var3;
                this.field_h[1 + var2] = var4;
                this.field_h[var2 + 2] = var5;
                this.field_h[var2 - -3] = var6;
                this.field_h[4 + var2] = var7;
                this.field_h[var2 + 5] = var8;
                this.field_h[var2 + 6] = var9;
                this.field_h[7 + var2] = var10;
                var2 += 8;
                if (var11 == 0) {
                  continue L6;
                } else {
                  L8: while (true) {
                    if (-257 < (var2 ^ -1)) {
                      var9 = var9 + this.field_h[var2 - -6];
                      var8 = var8 + this.field_h[5 + var2];
                      var4 = var4 + this.field_h[var2 + 1];
                      var7 = var7 + this.field_h[var2 + 4];
                      var3 = var3 + this.field_h[var2];
                      var10 = var10 + this.field_h[7 + var2];
                      var5 = var5 + this.field_h[2 + var2];
                      var6 = var6 + this.field_h[var2 - -3];
                      var3 = var3 ^ var4 << -74087637;
                      var6 = var6 + var3;
                      var4 = var4 + var5;
                      var4 = var4 ^ var5 >>> -512437438;
                      var5 = var5 + var6;
                      var7 = var7 + var4;
                      var5 = var5 ^ var6 << -933219704;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> -153572816;
                      var9 = var9 + var6;
                      var7 = var7 + var8;
                      var7 = var7 ^ var8 << -626644502;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> -1133152316;
                      var3 = var3 + var8;
                      var9 = var9 + var10;
                      var9 = var9 ^ var10 << 557812456;
                      var10 = var10 + var3;
                      var4 = var4 + var9;
                      var10 = var10 ^ var3 >>> 2083273353;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      this.field_h[var2] = var3;
                      this.field_h[1 + var2] = var4;
                      this.field_h[var2 + 2] = var5;
                      this.field_h[var2 + 3] = var6;
                      this.field_h[4 + var2] = var7;
                      this.field_h[var2 - -5] = var8;
                      this.field_h[6 + var2] = var9;
                      this.field_h[var2 - -7] = var10;
                      var2 += 8;
                      if (var11 == 0) {
                        continue L8;
                      } else {
                        return;
                      }
                    } else {
                      this.a(-2034);
                      this.field_d = 256;
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    pe(int[] param0) {
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
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            this.field_g = new int[256];
            this.field_h = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var2_int) {
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
                this.b(-24892);
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
            stackOut_7_1 = new StringBuilder().append("pe.<init>(");
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
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Loading graphics";
    }
}
