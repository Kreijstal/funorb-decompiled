/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private int field_e;
    private int field_d;
    private int field_h;
    private int[] field_a;
    static String field_g;
    private int[] field_b;
    static String field_f;
    private int field_c;

    private final void b(byte param0) {
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
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        var3 = -1640531527;
        var4 = -1640531527;
        var10 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var2 ^ -1) <= -257) {
                    break L3;
                  } else {
                    var3 = var3 + this.field_b[var2];
                    var7 = var7 + this.field_b[4 + var2];
                    var9 = var9 + this.field_b[var2 - -6];
                    var6 = var6 + this.field_b[3 + var2];
                    var4 = var4 + this.field_b[var2 - -1];
                    var10 = var10 + this.field_b[7 + var2];
                    var5 = var5 + this.field_b[2 + var2];
                    var8 = var8 + this.field_b[5 + var2];
                    var3 = var3 ^ var4 << 1804709163;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -1735692478;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -2091789144;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1580576816;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -569356086;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 436163012;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 806583368;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 314337065;
                    var3 = var3 + var4;
                    stackOut_18_0 = var5 + var10;
                    stackIn_21_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      var5 = stackIn_19_0;
                      this.field_a[var2] = var3;
                      this.field_a[var2 + 1] = var4;
                      this.field_a[var2 - -2] = var5;
                      this.field_a[3 + var2] = var6;
                      this.field_a[4 + var2] = var7;
                      this.field_a[var2 + 5] = var8;
                      this.field_a[6 + var2] = var9;
                      this.field_a[7 + var2] = var10;
                      var2 += 8;
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_20_0 = -97 / ((param0 - 3) / 50);
                stackIn_21_0 = stackOut_20_0;
                break L2;
              }
              var11 = stackIn_21_0;
              var2 = 0;
              L4: while (true) {
                if ((var2 ^ -1) > -257) {
                  var3 = var3 + this.field_a[var2];
                  var5 = var5 + this.field_a[2 + var2];
                  var6 = var6 + this.field_a[var2 - -3];
                  var10 = var10 + this.field_a[7 + var2];
                  var9 = var9 + this.field_a[6 + var2];
                  var8 = var8 + this.field_a[var2 - -5];
                  var7 = var7 + this.field_a[4 + var2];
                  var4 = var4 + this.field_a[1 + var2];
                  var3 = var3 ^ var4 << 2144811691;
                  var6 = var6 + var3;
                  var4 = var4 + var5;
                  var4 = var4 ^ var5 >>> -312752702;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << 381529576;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> -1692030064;
                  var7 = var7 + var8;
                  var9 = var9 + var6;
                  var7 = var7 ^ var8 << 2049751370;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> -744832892;
                  var9 = var9 + var10;
                  var3 = var3 + var8;
                  var9 = var9 ^ var10 << 833802664;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> 1952118441;
                  var5 = var5 + var10;
                  var3 = var3 + var4;
                  this.field_a[var2] = var3;
                  this.field_a[var2 + 1] = var4;
                  this.field_a[var2 - -2] = var5;
                  this.field_a[3 + var2] = var6;
                  this.field_a[4 + var2] = var7;
                  this.field_a[5 + var2] = var8;
                  this.field_a[6 + var2] = var9;
                  this.field_a[7 + var2] = var10;
                  var2 += 8;
                  if (var12 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                } else {
                  this.a((byte) 122);
                  this.field_c = 256;
                  return;
                }
              }
            }
          } else {
            var3 = var3 ^ var4 << 1801650827;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -310078782;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -2038878872;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -760076432;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1770921366;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -123761468;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1957349912;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -1161653559;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            if (var12 == 0) {
              continue L0;
            } else {
              L5: while (true) {
                L6: {
                  L7: {
                    if ((var2 ^ -1) <= -257) {
                      break L7;
                    } else {
                      var3 = var3 + this.field_b[var2];
                      var7 = var7 + this.field_b[4 + var2];
                      var9 = var9 + this.field_b[var2 - -6];
                      var6 = var6 + this.field_b[3 + var2];
                      var4 = var4 + this.field_b[var2 - -1];
                      var10 = var10 + this.field_b[7 + var2];
                      var5 = var5 + this.field_b[2 + var2];
                      var8 = var8 + this.field_b[5 + var2];
                      var3 = var3 ^ var4 << 1804709163;
                      var6 = var6 + var3;
                      var4 = var4 + var5;
                      var4 = var4 ^ var5 >>> -1735692478;
                      var5 = var5 + var6;
                      var7 = var7 + var4;
                      var5 = var5 ^ var6 << -2091789144;
                      var8 = var8 + var5;
                      var6 = var6 + var7;
                      var6 = var6 ^ var7 >>> -1580576816;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << -569356086;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> 436163012;
                      var3 = var3 + var8;
                      var9 = var9 + var10;
                      var9 = var9 ^ var10 << 806583368;
                      var4 = var4 + var9;
                      var10 = var10 + var3;
                      var10 = var10 ^ var3 >>> 314337065;
                      var3 = var3 + var4;
                      stackOut_4_0 = var5 + var10;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var12 != 0) {
                        break L6;
                      } else {
                        var5 = stackIn_5_0;
                        this.field_a[var2] = var3;
                        this.field_a[var2 + 1] = var4;
                        this.field_a[var2 - -2] = var5;
                        this.field_a[3 + var2] = var6;
                        this.field_a[4 + var2] = var7;
                        this.field_a[var2 + 5] = var8;
                        this.field_a[6 + var2] = var9;
                        this.field_a[7 + var2] = var10;
                        var2 += 8;
                        if (var12 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_6_0 = -97 / ((param0 - 3) / 50);
                  stackIn_7_0 = stackOut_6_0;
                  break L6;
                }
                var11 = stackIn_7_0;
                var2 = 0;
                L8: while (true) {
                  if ((var2 ^ -1) > -257) {
                    var3 = var3 + this.field_a[var2];
                    var5 = var5 + this.field_a[2 + var2];
                    var6 = var6 + this.field_a[var2 - -3];
                    var10 = var10 + this.field_a[7 + var2];
                    var9 = var9 + this.field_a[6 + var2];
                    var8 = var8 + this.field_a[var2 - -5];
                    var7 = var7 + this.field_a[4 + var2];
                    var4 = var4 + this.field_a[1 + var2];
                    var3 = var3 ^ var4 << 2144811691;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -312752702;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 381529576;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1692030064;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 2049751370;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -744832892;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 833802664;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 1952118441;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_a[var2] = var3;
                    this.field_a[var2 + 1] = var4;
                    this.field_a[var2 - -2] = var5;
                    this.field_a[3 + var2] = var6;
                    this.field_a[4 + var2] = var7;
                    this.field_a[5 + var2] = var8;
                    this.field_a[6 + var2] = var9;
                    this.field_a[7 + var2] = var10;
                    var2 += 8;
                    if (var12 == 0) {
                      continue L8;
                    } else {
                      return;
                    }
                  } else {
                    this.a((byte) 122);
                    this.field_c = 256;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 > -62) {
            field_f = (String) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final int a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        L0: {
          if (0 == this.field_c) {
            this.a((byte) 119);
            this.field_c = 256;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 128) {
          this.field_d = -48;
          fieldTemp$4 = this.field_c - 1;
          this.field_c = this.field_c - 1;
          return this.field_b[fieldTemp$4];
        } else {
          fieldTemp$5 = this.field_c - 1;
          this.field_c = this.field_c - 1;
          return this.field_b[fieldTemp$5];
        }
    }

    private final void a(byte param0) {
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        int dupTemp$9 = 0;
        int discarded$10 = 0;
        int fieldTemp$11 = 0;
        int dupTemp$12 = 0;
        int dupTemp$13 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 >= 118) {
          fieldTemp$7 = this.field_h + 1;
          this.field_h = this.field_h + 1;
          this.field_e = this.field_e + fieldTemp$7;
          var2 = 0;
          L0: while (true) {
            if (256 > var2) {
              var3 = this.field_a[var2];
              if (var5 == 0) {
                L1: {
                  L2: {
                    if (-1 != (var2 & 2 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if ((1 & var2) != 0) {
                          break L3;
                        } else {
                          this.field_d = this.field_d ^ this.field_d << -1089389779;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_d = this.field_d ^ this.field_d >>> 330912006;
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
                      this.field_d = this.field_d ^ this.field_d >>> 1507026576;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_d = this.field_d ^ this.field_d << -114091742;
                  break L1;
                }
                this.field_d = this.field_d + this.field_a[128 + var2 & 255];
                dupTemp$8 = this.field_a[vi.a(var3 >> 352516226, 255)] + (this.field_d + this.field_e);
                var4 = dupTemp$8;
                this.field_a[var2] = dupTemp$8;
                dupTemp$9 = var3 + this.field_a[vi.a(var4 >> -539804984 >> -2070968158, 255)];
                this.field_e = dupTemp$9;
                this.field_b[var2] = dupTemp$9;
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
          discarded$10 = this.a(92);
          fieldTemp$11 = this.field_h + 1;
          this.field_h = this.field_h + 1;
          this.field_e = this.field_e + fieldTemp$11;
          var2 = 0;
          L5: while (true) {
            if (256 > var2) {
              var3 = this.field_a[var2];
              if (var5 == 0) {
                L6: {
                  L7: {
                    if (-1 != (var2 & 2 ^ -1)) {
                      break L7;
                    } else {
                      L8: {
                        if ((1 & var2) != 0) {
                          break L8;
                        } else {
                          this.field_d = this.field_d ^ this.field_d << -1089389779;
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      this.field_d = this.field_d ^ this.field_d >>> 330912006;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if ((var2 & 1) == 0) {
                      break L9;
                    } else {
                      this.field_d = this.field_d ^ this.field_d >>> 1507026576;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_d = this.field_d ^ this.field_d << -114091742;
                  break L6;
                }
                this.field_d = this.field_d + this.field_a[128 + var2 & 255];
                dupTemp$12 = this.field_a[vi.a(var3 >> 352516226, 255)] + (this.field_d + this.field_e);
                var4 = dupTemp$12;
                this.field_a[var2] = dupTemp$12;
                dupTemp$13 = var3 + this.field_a[vi.a(var4 >> -539804984 >> -2070968158, 255)];
                this.field_e = dupTemp$13;
                this.field_b[var2] = dupTemp$13;
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

    re(int[] param0) {
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
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            this.field_b = new int[256];
            this.field_a = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= param0.length) {
                    break L3;
                  } else {
                    this.field_b[var2_int] = param0[var2_int];
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
                this.b((byte) 92);
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
            stackOut_7_1 = new StringBuilder().append("re.<init>(");
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
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_g = "FLYBO";
        field_f = "ZOOMO";
    }
}
