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
        int fieldTemp$4 = 0;
        j dupTemp$5 = null;
        int fieldTemp$6 = 0;
        j dupTemp$7 = null;
        j var2;
        j var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        j var11;
        j var12;
        var10 = OrbDefence.field_D ? 1 : 0;
        if (-1 != (this.field_e ^ -1)) {
          var2 = this.field_g[0];
          if (param0 == -2) {
            fieldTemp$4 = this.field_e - 1;
            this.field_e = this.field_e - 1;
            dupTemp$5 = this.field_g[fieldTemp$4];
            this.field_g[0] = dupTemp$5;
            var11 = dupTemp$5;
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
            fieldTemp$6 = this.field_e - 1;
            this.field_e = this.field_e - 1;
            dupTemp$7 = this.field_g[fieldTemp$6];
            this.field_g[0] = dupTemp$7;
            var12 = dupTemp$7;
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
        j dupTemp$3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        j var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                      dupTemp$3 = this.field_g[var4];
                      var6 = dupTemp$3;
                      if (dupTemp$3.field_d > var5) {
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
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("cg.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    this.field_a = this.field_a << 1;
                    var5 = new j[this.field_a];
                    var6 = var5;
                    var2 = var6;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 >= this.field_e) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var5[var3] = this.field_g[var3];
                    var3++;
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_g = var6;
                    if (param0 == -1) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_b = (long[]) null;
                    return;
                }
                case 7: {
                    return;
                }
                case 9: {
                    this.field_g = var6;
                    if (param0 == -1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_b = (long[]) null;
                    return;
                }
                case 11: {
                    return;
                }
                case 13: {
                    if (param0 == -1) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    field_b = (long[]) null;
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
            long var0;
            int var2;
            int var3;
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
