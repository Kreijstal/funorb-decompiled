/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    private int field_a;
    private int[] field_e;
    static boolean field_b;
    static hr[] field_j;
    private int[] field_c;
    static int field_k;
    static hr[] field_f;
    private int field_g;
    private int field_h;
    static ri[] field_d;
    private int field_i;

    private final void c(byte param0) {
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
        var11 = Sumoblitz.field_L ? 1 : 0;
        var3 = -1640531527;
        var9 = -1640531527;
        var4 = -1640531527;
        var7 = -1640531527;
        var6 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L0: while (true) {
          L1: {
            if ((var2 ^ -1) <= -5) {
              if (param0 == -34) {
                break L1;
              } else {
                return;
              }
            } else {
              var3 = var3 ^ var4 << 1620079211;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> 1284820354;
              var7 = var7 + var4;
              var5 = var5 + var6;
              var5 = var5 ^ var6 << 2146230568;
              var6 = var6 + var7;
              var8 = var8 + var5;
              var6 = var6 ^ var7 >>> 7164592;
              var9 = var9 + var6;
              var7 = var7 + var8;
              var7 = var7 ^ var8 << 1204422826;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> 1940018756;
              var9 = var9 + var10;
              var3 = var3 + var8;
              var9 = var9 ^ var10 << -1386676568;
              var4 = var4 + var9;
              var10 = var10 + var3;
              var10 = var10 ^ var3 >>> 1376008201;
              var3 = var3 + var4;
              var5 = var5 + var10;
              var2++;
              if (var11 != 0) {
                break L1;
              } else {
                if (var11 == 0) {
                  continue L0;
                } else {
                  if (param0 == -34) {
                    var2 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if ((var2 ^ -1) <= -257) {
                            break L4;
                          } else {
                            var10 = var10 + this.field_c[7 + var2];
                            var9 = var9 + this.field_c[6 + var2];
                            var5 = var5 + this.field_c[var2 - -2];
                            var3 = var3 + this.field_c[var2];
                            var8 = var8 + this.field_c[var2 - -5];
                            var6 = var6 + this.field_c[var2 - -3];
                            var7 = var7 + this.field_c[var2 + 4];
                            var4 = var4 + this.field_c[var2 + 1];
                            var3 = var3 ^ var4 << -1370058901;
                            var6 = var6 + var3;
                            var4 = var4 + var5;
                            var4 = var4 ^ var5 >>> -1724460478;
                            var5 = var5 + var6;
                            var7 = var7 + var4;
                            var5 = var5 ^ var6 << 288187176;
                            var8 = var8 + var5;
                            var6 = var6 + var7;
                            var6 = var6 ^ var7 >>> 428664624;
                            var9 = var9 + var6;
                            var7 = var7 + var8;
                            var7 = var7 ^ var8 << -850029974;
                            var10 = var10 + var7;
                            var8 = var8 + var9;
                            var8 = var8 ^ var9 >>> -1827942780;
                            var9 = var9 + var10;
                            var3 = var3 + var8;
                            var9 = var9 ^ var10 << -213057272;
                            var4 = var4 + var9;
                            var10 = var10 + var3;
                            var10 = var10 ^ var3 >>> -1996027735;
                            var3 = var3 + var4;
                            var5 = var5 + var10;
                            this.field_e[var2] = var3;
                            this.field_e[1 + var2] = var4;
                            this.field_e[var2 + 2] = var5;
                            this.field_e[3 + var2] = var6;
                            this.field_e[var2 - -4] = var7;
                            this.field_e[5 + var2] = var8;
                            this.field_e[var2 - -6] = var9;
                            this.field_e[var2 - -7] = var10;
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
                          var4 = var4 + this.field_e[var2 - -1];
                          var9 = var9 + this.field_e[6 + var2];
                          var3 = var3 + this.field_e[var2];
                          var5 = var5 + this.field_e[2 + var2];
                          var6 = var6 + this.field_e[var2 - -3];
                          var7 = var7 + this.field_e[4 + var2];
                          var8 = var8 + this.field_e[var2 + 5];
                          var10 = var10 + this.field_e[7 + var2];
                          var3 = var3 ^ var4 << -473847637;
                          var4 = var4 + var5;
                          var6 = var6 + var3;
                          var4 = var4 ^ var5 >>> 446935170;
                          var7 = var7 + var4;
                          var5 = var5 + var6;
                          var5 = var5 ^ var6 << -749239064;
                          var8 = var8 + var5;
                          var6 = var6 + var7;
                          var6 = var6 ^ var7 >>> 743673136;
                          var7 = var7 + var8;
                          var9 = var9 + var6;
                          var7 = var7 ^ var8 << -545628886;
                          var10 = var10 + var7;
                          var8 = var8 + var9;
                          var8 = var8 ^ var9 >>> 528468420;
                          var3 = var3 + var8;
                          var9 = var9 + var10;
                          var9 = var9 ^ var10 << -1998193720;
                          var10 = var10 + var3;
                          var4 = var4 + var9;
                          var10 = var10 ^ var3 >>> -696768343;
                          var5 = var5 + var10;
                          var3 = var3 + var4;
                          this.field_e[var2] = var3;
                          this.field_e[var2 - -1] = var4;
                          this.field_e[2 + var2] = var5;
                          this.field_e[3 + var2] = var6;
                          this.field_e[var2 - -4] = var7;
                          this.field_e[var2 + 5] = var8;
                          this.field_e[6 + var2] = var9;
                          this.field_e[var2 - -7] = var10;
                          var2 += 8;
                          if (var11 == 0) {
                            continue L5;
                          } else {
                            return;
                          }
                        } else {
                          this.a((byte) 87);
                          this.field_g = 256;
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          var2 = 0;
          L6: while (true) {
            if ((var2 ^ -1) <= -257) {
              var2 = 0;
              L7: while (true) {
                if (256 > var2) {
                  var4 = var4 + this.field_e[var2 - -1];
                  var9 = var9 + this.field_e[6 + var2];
                  var3 = var3 + this.field_e[var2];
                  var5 = var5 + this.field_e[2 + var2];
                  var6 = var6 + this.field_e[var2 - -3];
                  var7 = var7 + this.field_e[4 + var2];
                  var8 = var8 + this.field_e[var2 + 5];
                  var10 = var10 + this.field_e[7 + var2];
                  var3 = var3 ^ var4 << -473847637;
                  var4 = var4 + var5;
                  var6 = var6 + var3;
                  var4 = var4 ^ var5 >>> 446935170;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << -749239064;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> 743673136;
                  var7 = var7 + var8;
                  var9 = var9 + var6;
                  var7 = var7 ^ var8 << -545628886;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> 528468420;
                  var3 = var3 + var8;
                  var9 = var9 + var10;
                  var9 = var9 ^ var10 << -1998193720;
                  var10 = var10 + var3;
                  var4 = var4 + var9;
                  var10 = var10 ^ var3 >>> -696768343;
                  var5 = var5 + var10;
                  var3 = var3 + var4;
                  this.field_e[var2] = var3;
                  this.field_e[var2 - -1] = var4;
                  this.field_e[2 + var2] = var5;
                  this.field_e[3 + var2] = var6;
                  this.field_e[var2 - -4] = var7;
                  this.field_e[var2 + 5] = var8;
                  this.field_e[6 + var2] = var9;
                  this.field_e[var2 - -7] = var10;
                  var2 += 8;
                  if (var11 == 0) {
                    continue L7;
                  } else {
                    return;
                  }
                } else {
                  this.a((byte) 87);
                  this.field_g = 256;
                  return;
                }
              }
            } else {
              var10 = var10 + this.field_c[7 + var2];
              var9 = var9 + this.field_c[6 + var2];
              var5 = var5 + this.field_c[var2 - -2];
              var3 = var3 + this.field_c[var2];
              var8 = var8 + this.field_c[var2 - -5];
              var6 = var6 + this.field_c[var2 - -3];
              var7 = var7 + this.field_c[var2 + 4];
              var4 = var4 + this.field_c[var2 + 1];
              var3 = var3 ^ var4 << -1370058901;
              var6 = var6 + var3;
              var4 = var4 + var5;
              var4 = var4 ^ var5 >>> -1724460478;
              var5 = var5 + var6;
              var7 = var7 + var4;
              var5 = var5 ^ var6 << 288187176;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> 428664624;
              var9 = var9 + var6;
              var7 = var7 + var8;
              var7 = var7 ^ var8 << -850029974;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> -1827942780;
              var9 = var9 + var10;
              var3 = var3 + var8;
              var9 = var9 ^ var10 << -213057272;
              var4 = var4 + var9;
              var10 = var10 + var3;
              var10 = var10 ^ var3 >>> -1996027735;
              var3 = var3 + var4;
              var5 = var5 + var10;
              this.field_e[var2] = var3;
              this.field_e[1 + var2] = var4;
              this.field_e[var2 + 2] = var5;
              this.field_e[3 + var2] = var6;
              this.field_e[var2 - -4] = var7;
              this.field_e[5 + var2] = var8;
              this.field_e[var2 - -6] = var9;
              this.field_e[var2 - -7] = var10;
              var2 += 8;
              if (var11 == 0) {
                continue L6;
              } else {
                L8: while (true) {
                  if (256 > var2) {
                    var4 = var4 + this.field_e[var2 - -1];
                    var9 = var9 + this.field_e[6 + var2];
                    var3 = var3 + this.field_e[var2];
                    var5 = var5 + this.field_e[2 + var2];
                    var6 = var6 + this.field_e[var2 - -3];
                    var7 = var7 + this.field_e[4 + var2];
                    var8 = var8 + this.field_e[var2 + 5];
                    var10 = var10 + this.field_e[7 + var2];
                    var3 = var3 ^ var4 << -473847637;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 446935170;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -749239064;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 743673136;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -545628886;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 528468420;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << -1998193720;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -696768343;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_e[var2] = var3;
                    this.field_e[var2 - -1] = var4;
                    this.field_e[2 + var2] = var5;
                    this.field_e[3 + var2] = var6;
                    this.field_e[var2 - -4] = var7;
                    this.field_e[var2 + 5] = var8;
                    this.field_e[6 + var2] = var9;
                    this.field_e[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                      continue L8;
                    } else {
                      return;
                    }
                  } else {
                    this.a((byte) 87);
                    this.field_g = 256;
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final int a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 != 256) {
          L0: {
            this.c((byte) -25);
            if (-1 == (this.field_g ^ -1)) {
              this.a((byte) -45);
              this.field_g = 256;
              break L0;
            } else {
              break L0;
            }
          }
          fieldTemp$2 = this.field_g - 1;
          this.field_g = this.field_g - 1;
          return this.field_c[fieldTemp$2];
        } else {
          L1: {
            if (-1 == (this.field_g ^ -1)) {
              this.a((byte) -45);
              this.field_g = 256;
              break L1;
            } else {
              break L1;
            }
          }
          fieldTemp$3 = this.field_g - 1;
          this.field_g = this.field_g - 1;
          return this.field_c[fieldTemp$3];
        }
    }

    public static void b(byte param0) {
        field_j = null;
        field_d = null;
        if (param0 > -110) {
            field_b = false;
            field_f = null;
            return;
        }
        field_f = null;
    }

    private final void a(byte param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3 = 71 % ((param0 - 17) / 37);
        int fieldTemp$3 = this.field_a + 1;
        this.field_a = this.field_a + 1;
        this.field_h = this.field_h + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 < 256) {
            var4 = this.field_e[var2];
            if (var6 == 0) {
              L1: {
                L2: {
                  if (0 != (var2 & 2)) {
                    break L2;
                  } else {
                    L3: {
                      if ((1 & var2) != 0) {
                        break L3;
                      } else {
                        this.field_i = this.field_i ^ this.field_i << 1230149325;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_i = this.field_i ^ this.field_i >>> -2050135962;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (0 == (1 & var2)) {
                    break L4;
                  } else {
                    this.field_i = this.field_i ^ this.field_i >>> 809640560;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_i = this.field_i ^ this.field_i << -1992104414;
                break L1;
              }
              this.field_i = this.field_i + this.field_e[var2 - -128 & 255];
              dupTemp$4 = this.field_i + this.field_e[eb.a(1020, var4) >> 408673442] - -this.field_h;
              var5 = dupTemp$4;
              this.field_e[var2] = dupTemp$4;
              dupTemp$5 = var4 + this.field_e[eb.a(255, var5 >> 1802644232 >> -1933610206)];
              this.field_h = dupTemp$5;
              this.field_c[var2] = dupTemp$5;
              var2++;
              if (var6 == 0) {
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
    }

    final static l[] a(int param0, pl param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        l[] var4 = null;
        int var5 = 0;
        l var6_ref_l = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        l[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        l[] stackOut_11_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.b(8, (byte) -97);
            if (var2_int <= 0) {
              L1: {
                var3 = param1.b(12, (byte) -115);
                var4 = new l[var3];
                var5 = 0;
                if (param0 <= -74) {
                  break L1;
                } else {
                  field_k = 85;
                  break L1;
                }
              }
              L2: while (true) {
                if (var3 <= var5) {
                  stackOut_11_0 = (l[]) (var4);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if (!kh.a(param1, false)) {
                        break L4;
                      } else {
                        var6_ref_l = new l();
                        discarded$12 = param1.b(24, (byte) -89);
                        discarded$13 = param1.b(24, (byte) -117);
                        var6_ref_l.field_b = param1.b(24, (byte) -119);
                        discarded$14 = param1.b(9, (byte) -119);
                        discarded$15 = param1.b(12, (byte) -101);
                        discarded$16 = param1.b(12, (byte) -125);
                        discarded$17 = param1.b(12, (byte) -93);
                        var4[var5] = var6_ref_l;
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var6 = param1.b(si.c(-1 + var5, 1), (byte) -123);
                    var4[var5] = var4[var6];
                    break L3;
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("ok.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (l[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_12_0;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        gk var4_ref_gk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        gk var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            pn.field_k = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = mr.field_b.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var1_int <= var3) {
                  var3 = pn.field_k[9] >> 1569026248;
                  break L2;
                } else {
                  var4_ref_gk = mr.field_b[var3];
                  var17 = var4_ref_gk;
                  var17 = var4_ref_gk;
                  var4_ref_gk.a(false);
                  cb.a((byte) 79, var3);
                  var5 = var4_ref_gk.field_T - -var4_ref_gk.field_t >> 1711988353;
                  var6 = var4_ref_gk.field_j + var4_ref_gk.field_f >> 391965089;
                  var7 = var4_ref_gk.field_P + var4_ref_gk.field_S >> -842464895;
                  var8 = pn.field_k[9] >> 1580014146;
                  var9 = pn.field_k[10] >> -1150545406;
                  var10_int = pn.field_k[11] >> 23789186;
                  var11 = var9 * uc.field_b[4] + uc.field_b[3] * var8 + uc.field_b[5] * var10_int >> -251536114;
                  var12 = var10_int * uc.field_b[8] + uc.field_b[7] * var9 + var8 * uc.field_b[6] >> -716730706;
                  var13 = uc.field_b[11] * var10_int + (uc.field_b[9] * var8 - -(uc.field_b[10] * var9)) >> 847025198;
                  var2[var3] = var13 * var7 + var11 * var5 - -(var12 * var6) >> -782169744;
                  var3++;
                  if (var19 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                var4 = pn.field_k[10] >> -1918756472;
                var5 = pn.field_k[11] >> -859604472;
                var6 = td.field_u << -1012459644;
                var7 = 0;
                var8 = ic.b(var6, -431) >> -2131437624;
                var9 = cn.c(param0 + -256, var6) >> -2059849112;
                if (ko.field_p == -1) {
                  break L3;
                } else {
                  if ((pi.field_e ^ -1) != 0) {
                    var9 = -128;
                    var7 = ko.field_p + -320;
                    var8 = -pi.field_e + 240;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              var10 = (double)param0 / Math.sqrt((double)(var9 * var9 + (var7 * var7 + var8 * var8)));
              var7 = (int)((double)var7 * var10);
              var8 = (int)((double)var8 * var10);
              var9 = (int)((double)var9 * var10);
              var12 = -var3 + var7;
              var13 = -var4 + var8;
              var14 = var9 - var5;
              var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 + var14 * var14)));
              var13 = (int)((double)var13 * var10);
              var12 = (int)((double)var12 * var10);
              var14 = (int)((double)var14 * var10);
              var15 = 0;
              L4: while (true) {
                stackOut_12_0 = var15;
                stackOut_12_1 = mr.field_b.length;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                L5: while (true) {
                  if (stackIn_13_0 >= stackIn_13_1) {
                    break L0;
                  } else {
                    var16 = 0;
                    if (var19 == 0) {
                      var17_int = 1;
                      L6: while (true) {
                        if (mr.field_b.length <= var17_int) {
                          var21[var16] = -2147483648;
                          var17 = mr.field_b[var16];
                          cb.a((byte) 79, var16);
                          var18 = 0;
                          L7: while (true) {
                            L8: {
                              if (3 <= var18) {
                                up.a(pn.field_k, uc.field_b, false, false, var17, true, -1622738130);
                                qu.a(var7, var17, var14, var12, var9, var13, (byte) -9, var8);
                                var15++;
                                break L8;
                              } else {
                                uc.field_b[var18] = uc.field_b[var18] + kh.field_c[var15][var18];
                                var18++;
                                if (var19 != 0) {
                                  break L8;
                                } else {
                                  continue L7;
                                }
                              }
                            }
                            continue L4;
                          }
                        } else {
                          stackOut_18_0 = var21[var17_int] ^ -1;
                          stackOut_18_1 = var21[var16] ^ -1;
                          stackIn_13_0 = stackOut_18_0;
                          stackIn_13_1 = stackOut_18_1;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          if (var19 != 0) {
                            continue L5;
                          } else {
                            L9: {
                              if (stackIn_19_0 >= stackIn_19_1) {
                                break L9;
                              } else {
                                var16 = var17_int;
                                break L9;
                              }
                            }
                            var17_int++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ok.F(" + param0 + ')');
        }
    }

    ok(int[] param0) {
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
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            this.field_c = new int[256];
            this.field_e = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var2_int) {
                    break L3;
                  } else {
                    this.field_c[var2_int] = param0[var2_int];
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
                this.c((byte) -34);
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
            stackOut_7_1 = new StringBuilder().append("ok.<init>(");
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_b = false;
    }
}
