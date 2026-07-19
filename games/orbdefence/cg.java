/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    j[] field_g;
    static hj field_d;
    int field_e;
    static fa[] field_c;
    int field_a;
    static String field_h;
    private static long[] field_b;
    static java.applet.Applet field_f;

    public static void d(int param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 0) {
            cg.d(51);
            field_h = null;
            return;
        }
        field_h = null;
    }

    final j a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        j var2 = null;
        j var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        j var11 = null;
        j var12 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        if (-1 != (this.field_e ^ -1)) {
          var2 = this.field_g[0];
          if (param0 == -2) {
            fieldTemp$2 = this.field_e - 1;
            this.field_e = this.field_e - 1;
            this.field_g[0] = this.field_g[fieldTemp$2];
            var11 = this.field_g[fieldTemp$2];
            var3 = var11;
            var4 = 0;
            var9 = this.field_g[0].field_d;
            L0: while (true) {
              L1: {
                var5 = 1 + 2 * var4;
                if (var5 < this.field_e) {
                  break L1;
                } else {
                  if (var10 == 0) {
                    if (var10 != 0) {
                      break L1;
                    } else {
                      return var2;
                    }
                  } else {
                    return var2;
                  }
                }
              }
              L2: {
                var6 = var4 * 2 - -2;
                var7 = this.field_g[var5].field_d;
                if (this.field_e <= var6) {
                  break L2;
                } else {
                  var8 = this.field_g[var6].field_d;
                  if (var7 > var8) {
                    var7 = var8;
                    var5++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var9 < var7) {
                  break L3;
                } else {
                  this.field_g[var4] = this.field_g[var5];
                  this.field_g[var5] = var11;
                  var4 = var5;
                  if (var10 == 0) {
                    continue L0;
                  } else {
                    break L3;
                  }
                }
              }
              return var2;
            }
          } else {
            this.field_a = -105;
            fieldTemp$3 = this.field_e - 1;
            this.field_e = this.field_e - 1;
            this.field_g[0] = this.field_g[fieldTemp$3];
            var12 = this.field_g[fieldTemp$3];
            var3 = var12;
            var4 = 0;
            var9 = this.field_g[0].field_d;
            L4: while (true) {
              L5: {
                var5 = 1 + 2 * var4;
                if (var5 < this.field_e) {
                  break L5;
                } else {
                  if (var10 == 0) {
                    if (var10 != 0) {
                      break L5;
                    } else {
                      return var2;
                    }
                  } else {
                    return var2;
                  }
                }
              }
              L6: {
                var6 = var4 * 2 - -2;
                var7 = this.field_g[var5].field_d;
                if (this.field_e <= var6) {
                  break L6;
                } else {
                  var8 = this.field_g[var6].field_d;
                  if (var7 > var8) {
                    var7 = var8;
                    var5++;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var9 < var7) {
                  break L7;
                } else {
                  this.field_g[var4] = this.field_g[var5];
                  this.field_g[var5] = var12;
                  var4 = var5;
                  if (var10 == 0) {
                    continue L4;
                  } else {
                    break L7;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return null;
        }
    }

    final void a(j param0, byte param1) {
        int fieldTemp$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        j var6 = null;
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
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_e < this.field_a) {
                break L1;
              } else {
                this.c(-1);
                break L1;
              }
            }
            L2: {
              fieldTemp$2 = this.field_e;
              this.field_e = this.field_e + 1;
              var3_int = fieldTemp$2;
              this.field_g[var3_int] = param0;
              var5 = param0.field_d;
              if (param1 == -83) {
                break L2;
              } else {
                field_b = (long[]) null;
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                if ((var3_int ^ -1) >= -1) {
                  break L4;
                } else {
                  var4 = -1 + var3_int >> -1878277695;
                  if (var7 == 0) {
                    L5: {
                      var6 = this.field_g[var4];
                      if (this.field_g[var4].field_d > var5) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_g[var4] = param0;
                    this.field_g[var3_int] = var6;
                    continue L3;
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("cg.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        return this.field_e == 0 ? true : false;
    }

    final static void a(mg param0, java.math.BigInteger param1, int param2, java.math.BigInteger param3, mg param4) {
        try {
            jc.a(param0, 53, param2, param4.field_j, param4.field_i, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "cg.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        j[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        j[] var5 = null;
        j[] var6 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        this.field_a = this.field_a << 1;
        var5 = new j[this.field_a];
        var6 = var5;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_e) {
            this.field_g = var6;
            if (param0 == -1) {
              return;
            } else {
              field_b = (long[]) null;
              return;
            }
          } else {
            var5[var3] = this.field_g[var3];
            var3++;
            if (var4 != 0) {
              if (param0 == -1) {
                return;
              } else {
                field_b = (long[]) null;
                return;
              }
            } else {
              if (var4 == 0) {
                continue L0;
              } else {
                this.field_g = var6;
                if (param0 == -1) {
                  return;
                } else {
                  field_b = (long[]) null;
                  return;
                }
              }
            }
          }
        }
    }

    cg(int param0) {
        if (-1 <= (param0 ^ -1)) {
            param0 = 16;
        }
        this.field_a = param0;
        this.field_g = new j[this.field_a];
    }

    static {
        $cfr$clinit: {
            long var0 = 0L;
            int var2 = 0;
            int var3 = 0;
            field_d = new hj(640, 480);
            field_h = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
            field_b = new long[256];
            var2 = 0;
            L0: while (true) {
              if (256 <= var2) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (8 <= var3) {
                    field_b[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0 ^ -1L) != -2L) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 142835457 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
