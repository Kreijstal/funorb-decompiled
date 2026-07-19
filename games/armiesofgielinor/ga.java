/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static wk[] field_k;
    private int[] field_e;
    private int[] field_c;
    static je field_i;
    private int field_f;
    static wk[] field_a;
    private int field_j;
    static kd field_g;
    private int field_b;
    static String field_d;
    private int field_h;

    private final void b(boolean param0) {
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = -1640531527;
        var4 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          L1: {
            if (4 <= var2) {
              var2 = 0;
              break L1;
            } else {
              var3 = var3 ^ var4 << -1885353909;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> -1316851006;
              var5 = var5 + var6;
              var7 = var7 + var4;
              var5 = var5 ^ var6 << 1622318312;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> 341056080;
              var7 = var7 + var8;
              var9 = var9 + var6;
              var7 = var7 ^ var8 << -626919062;
              var8 = var8 + var9;
              var10 = var10 + var7;
              var8 = var8 ^ var9 >>> -857000252;
              var3 = var3 + var8;
              var9 = var9 + var10;
              var9 = var9 ^ var10 << -920355608;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> 510930409;
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
                        if (256 <= var2) {
                          break L4;
                        } else {
                          var3 = var3 + this.field_e[var2];
                          var10 = var10 + this.field_e[7 + var2];
                          var5 = var5 + this.field_e[2 + var2];
                          var8 = var8 + this.field_e[var2 - -5];
                          var7 = var7 + this.field_e[var2 + 4];
                          var6 = var6 + this.field_e[3 + var2];
                          var9 = var9 + this.field_e[6 + var2];
                          var4 = var4 + this.field_e[var2 - -1];
                          var3 = var3 ^ var4 << 1547421899;
                          var4 = var4 + var5;
                          var6 = var6 + var3;
                          var4 = var4 ^ var5 >>> -439065630;
                          var5 = var5 + var6;
                          var7 = var7 + var4;
                          var5 = var5 ^ var6 << 1624644072;
                          var8 = var8 + var5;
                          var6 = var6 + var7;
                          var6 = var6 ^ var7 >>> 1430611120;
                          var7 = var7 + var8;
                          var9 = var9 + var6;
                          var7 = var7 ^ var8 << 1491474730;
                          var8 = var8 + var9;
                          var10 = var10 + var7;
                          var8 = var8 ^ var9 >>> -1911678940;
                          var9 = var9 + var10;
                          var3 = var3 + var8;
                          var9 = var9 ^ var10 << 142563720;
                          var10 = var10 + var3;
                          var4 = var4 + var9;
                          var10 = var10 ^ var3 >>> 1468163305;
                          var3 = var3 + var4;
                          var5 = var5 + var10;
                          this.field_c[var2] = var3;
                          this.field_c[var2 + 1] = var4;
                          this.field_c[var2 - -2] = var5;
                          this.field_c[var2 + 3] = var6;
                          this.field_c[4 + var2] = var7;
                          this.field_c[var2 - -5] = var8;
                          this.field_c[6 + var2] = var9;
                          this.field_c[var2 - -7] = var10;
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
                      if (256 > var2) {
                        var5 = var5 + this.field_c[var2 + 2];
                        var7 = var7 + this.field_c[4 + var2];
                        var3 = var3 + this.field_c[var2];
                        var4 = var4 + this.field_c[var2 - -1];
                        var6 = var6 + this.field_c[var2 - -3];
                        var10 = var10 + this.field_c[var2 - -7];
                        var8 = var8 + this.field_c[5 + var2];
                        var9 = var9 + this.field_c[var2 - -6];
                        var3 = var3 ^ var4 << 527788939;
                        var4 = var4 + var5;
                        var6 = var6 + var3;
                        var4 = var4 ^ var5 >>> 911965250;
                        var7 = var7 + var4;
                        var5 = var5 + var6;
                        var5 = var5 ^ var6 << -168900152;
                        var8 = var8 + var5;
                        var6 = var6 + var7;
                        var6 = var6 ^ var7 >>> -2032299984;
                        var7 = var7 + var8;
                        var9 = var9 + var6;
                        var7 = var7 ^ var8 << 1091566890;
                        var10 = var10 + var7;
                        var8 = var8 + var9;
                        var8 = var8 ^ var9 >>> -584796;
                        var9 = var9 + var10;
                        var3 = var3 + var8;
                        var9 = var9 ^ var10 << 1358174600;
                        var10 = var10 + var3;
                        var4 = var4 + var9;
                        var10 = var10 ^ var3 >>> 387978569;
                        var5 = var5 + var10;
                        var3 = var3 + var4;
                        this.field_c[var2] = var3;
                        this.field_c[var2 + 1] = var4;
                        this.field_c[var2 + 2] = var5;
                        this.field_c[var2 + 3] = var6;
                        this.field_c[var2 + 4] = var7;
                        this.field_c[var2 + 5] = var8;
                        this.field_c[6 + var2] = var9;
                        this.field_c[var2 - -7] = var10;
                        var2 += 8;
                        if (var11 == 0) {
                          continue L5;
                        } else {
                          return;
                        }
                      } else {
                        this.a(param0);
                        this.field_b = 256;
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
          L6: while (true) {
            if (256 <= var2) {
              var2 = 0;
              L7: while (true) {
                if (256 > var2) {
                  var5 = var5 + this.field_c[var2 + 2];
                  var7 = var7 + this.field_c[4 + var2];
                  var3 = var3 + this.field_c[var2];
                  var4 = var4 + this.field_c[var2 - -1];
                  var6 = var6 + this.field_c[var2 - -3];
                  var10 = var10 + this.field_c[var2 - -7];
                  var8 = var8 + this.field_c[5 + var2];
                  var9 = var9 + this.field_c[var2 - -6];
                  var3 = var3 ^ var4 << 527788939;
                  var4 = var4 + var5;
                  var6 = var6 + var3;
                  var4 = var4 ^ var5 >>> 911965250;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << -168900152;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> -2032299984;
                  var7 = var7 + var8;
                  var9 = var9 + var6;
                  var7 = var7 ^ var8 << 1091566890;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> -584796;
                  var9 = var9 + var10;
                  var3 = var3 + var8;
                  var9 = var9 ^ var10 << 1358174600;
                  var10 = var10 + var3;
                  var4 = var4 + var9;
                  var10 = var10 ^ var3 >>> 387978569;
                  var5 = var5 + var10;
                  var3 = var3 + var4;
                  this.field_c[var2] = var3;
                  this.field_c[var2 + 1] = var4;
                  this.field_c[var2 + 2] = var5;
                  this.field_c[var2 + 3] = var6;
                  this.field_c[var2 + 4] = var7;
                  this.field_c[var2 + 5] = var8;
                  this.field_c[6 + var2] = var9;
                  this.field_c[var2 - -7] = var10;
                  var2 += 8;
                  if (var11 == 0) {
                    continue L7;
                  } else {
                    return;
                  }
                } else {
                  this.a(param0);
                  this.field_b = 256;
                  return;
                }
              }
            } else {
              var3 = var3 + this.field_e[var2];
              var10 = var10 + this.field_e[7 + var2];
              var5 = var5 + this.field_e[2 + var2];
              var8 = var8 + this.field_e[var2 - -5];
              var7 = var7 + this.field_e[var2 + 4];
              var6 = var6 + this.field_e[3 + var2];
              var9 = var9 + this.field_e[6 + var2];
              var4 = var4 + this.field_e[var2 - -1];
              var3 = var3 ^ var4 << 1547421899;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> -439065630;
              var5 = var5 + var6;
              var7 = var7 + var4;
              var5 = var5 ^ var6 << 1624644072;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> 1430611120;
              var7 = var7 + var8;
              var9 = var9 + var6;
              var7 = var7 ^ var8 << 1491474730;
              var8 = var8 + var9;
              var10 = var10 + var7;
              var8 = var8 ^ var9 >>> -1911678940;
              var9 = var9 + var10;
              var3 = var3 + var8;
              var9 = var9 ^ var10 << 142563720;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> 1468163305;
              var3 = var3 + var4;
              var5 = var5 + var10;
              this.field_c[var2] = var3;
              this.field_c[var2 + 1] = var4;
              this.field_c[var2 - -2] = var5;
              this.field_c[var2 + 3] = var6;
              this.field_c[4 + var2] = var7;
              this.field_c[var2 - -5] = var8;
              this.field_c[6 + var2] = var9;
              this.field_c[var2 - -7] = var10;
              var2 += 8;
              if (var11 == 0) {
                continue L6;
              } else {
                L8: while (true) {
                  if (256 > var2) {
                    var5 = var5 + this.field_c[var2 + 2];
                    var7 = var7 + this.field_c[4 + var2];
                    var3 = var3 + this.field_c[var2];
                    var4 = var4 + this.field_c[var2 - -1];
                    var6 = var6 + this.field_c[var2 - -3];
                    var10 = var10 + this.field_c[var2 - -7];
                    var8 = var8 + this.field_c[5 + var2];
                    var9 = var9 + this.field_c[var2 - -6];
                    var3 = var3 ^ var4 << 527788939;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 911965250;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -168900152;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -2032299984;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 1091566890;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -584796;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1358174600;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 387978569;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_c[var2] = var3;
                    this.field_c[var2 + 1] = var4;
                    this.field_c[var2 + 2] = var5;
                    this.field_c[var2 + 3] = var6;
                    this.field_c[var2 + 4] = var7;
                    this.field_c[var2 + 5] = var8;
                    this.field_c[6 + var2] = var9;
                    this.field_c[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                      continue L8;
                    } else {
                      return;
                    }
                  } else {
                    this.a(param0);
                    this.field_b = 256;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        int var1 = -102 / ((param0 - 45) / 43);
        field_i = null;
        field_d = null;
        field_g = null;
        field_k = null;
        field_a = null;
    }

    private final void a(boolean param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int fieldTemp$3 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_j = this.field_j + fieldTemp$3;
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) > -257) {
              var3 = this.field_c[var2];
              if (var5 == 0) {
                L1: {
                  L2: {
                    if (-1 != (var2 & 2 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (0 != (1 & var2)) {
                          break L3;
                        } else {
                          this.field_f = this.field_f ^ this.field_f << 2019060749;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_f = this.field_f ^ this.field_f >>> 681687238;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if ((var2 & 1) == 0) {
                      break L4;
                    } else {
                      this.field_f = this.field_f ^ this.field_f >>> -170062224;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_f = this.field_f ^ this.field_f << -45955454;
                  break L1;
                }
                this.field_f = this.field_f + this.field_c[var2 + 128 & 255];
                dupTemp$4 = this.field_j + (this.field_c[rn.a(255, var3 >> 811609538)] + this.field_f);
                var4 = dupTemp$4;
                this.field_c[var2] = dupTemp$4;
                dupTemp$5 = this.field_c[rn.a(var4 >> -1106998904, 1020) >> -277124574] + var3;
                this.field_j = dupTemp$5;
                this.field_e[var2] = dupTemp$5;
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
        if (0 != this.field_b) {
          if (param0 != 256) {
            this.a(false);
            fieldTemp$4 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_e[fieldTemp$4];
          } else {
            fieldTemp$5 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_e[fieldTemp$5];
          }
        } else {
          this.a(true);
          this.field_b = 256;
          if (param0 == 256) {
            fieldTemp$6 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_e[fieldTemp$6];
          } else {
            this.a(false);
            fieldTemp$7 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_e[fieldTemp$7];
          }
        }
    }

    ga(int[] param0) {
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
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_e = new int[256];
            this.field_c = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= param0.length) {
                    break L3;
                  } else {
                    this.field_e[var2_int] = param0[var2_int];
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
                this.b(true);
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
            stackOut_7_1 = new StringBuilder().append("ga.<init>(");
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
    }
}
