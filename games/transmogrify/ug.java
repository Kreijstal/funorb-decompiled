/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static ti field_f;
    static int[] field_c;
    private int[] field_j;
    private int field_i;
    private int field_d;
    private int[] field_e;
    private int field_g;
    private int field_a;
    static int field_b;
    static int field_h;

    final static void b(boolean param0) {
        if (param0) {
          if (-1 > (eh.field_a ^ -1)) {
            if (!mg.field_d) {
              if (!dk.field_b) {
                if (!qj.b((byte) 92)) {
                  if (rh.field_t == null) {
                    rh.field_t = tl.a(bc.field_b, 36, new int[]{(eh.field_a << -1338186874) + qi.field_c.field_o}, 3, qf.field_e, vh.field_n, 65506, 29, hf.field_j);
                    sh.field_c = null;
                    return;
                  } else {
                    sh.field_c = null;
                    return;
                  }
                } else {
                  sh.field_c = null;
                  return;
                }
              } else {
                sh.field_c = null;
                return;
              }
            } else {
              sh.field_c = null;
              return;
            }
          } else {
            sh.field_c = null;
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        int fieldTemp$3 = this.field_i + 1;
        this.field_i = this.field_i + 1;
        this.field_g = this.field_g + fieldTemp$3;
        var2 = param0;
        L0: while (true) {
          if (256 > var2) {
            var3 = this.field_j[var2];
            if (var5 == 0) {
              L1: {
                L2: {
                  if ((2 & var2) == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (0 == (var2 & 1)) {
                        break L3;
                      } else {
                        this.field_d = this.field_d ^ this.field_d >>> 831279824;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_d = this.field_d ^ this.field_d << 242003714;
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
                    this.field_d = this.field_d ^ this.field_d >>> 1566330470;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_d = this.field_d ^ this.field_d << 245170285;
                break L1;
              }
              this.field_d = this.field_d + this.field_j[255 & var2 - -128];
              dupTemp$4 = this.field_d + this.field_j[vg.c(1020, var3) >> -761188798] - -this.field_g;
              var4 = dupTemp$4;
              this.field_j[var2] = dupTemp$4;
              dupTemp$5 = var3 + this.field_j[vg.c(var4 >> -1867198904 >> -1313846750, 255)];
              this.field_g = dupTemp$5;
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
    }

    final int a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        if (-1 == (this.field_a ^ -1)) {
          this.b(0);
          this.field_a = 256;
          var2 = -39 / ((11 - param0) / 54);
          fieldTemp$4 = this.field_a - 1;
          this.field_a = this.field_a - 1;
          return this.field_e[fieldTemp$4];
        } else {
          var2 = -39 / ((11 - param0) / 54);
          fieldTemp$5 = this.field_a - 1;
          this.field_a = this.field_a - 1;
          return this.field_e[fieldTemp$5];
        }
    }

    ug(int[] param0) {
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
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            this.field_e = new int[256];
            this.field_j = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var2_int) {
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
                this.a(true);
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
            stackOut_7_1 = new StringBuilder().append("ug.<init>(");
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
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 94) {
            field_f = (ti) null;
            field_c = null;
            field_f = null;
            return;
        }
        field_c = null;
        field_f = null;
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
        var11 = Transmogrify.field_A ? 1 : 0;
        if (param0) {
          var3 = -1640531527;
          var7 = -1640531527;
          var4 = -1640531527;
          var6 = -1640531527;
          var8 = -1640531527;
          var10 = -1640531527;
          var9 = -1640531527;
          var5 = -1640531527;
          var2 = 0;
          L0: while (true) {
            L1: {
              if (4 <= var2) {
                var2 = 0;
                break L1;
              } else {
                var3 = var3 ^ var4 << -2034127477;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 512554882;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -2030340216;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> -1010064912;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 1201596682;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -1583053948;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -758434520;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -1157398231;
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
                          if ((var2 ^ -1) <= -257) {
                            break L4;
                          } else {
                            var6 = var6 + this.field_e[3 + var2];
                            var9 = var9 + this.field_e[var2 + 6];
                            var8 = var8 + this.field_e[var2 + 5];
                            var7 = var7 + this.field_e[4 + var2];
                            var5 = var5 + this.field_e[2 + var2];
                            var10 = var10 + this.field_e[7 + var2];
                            var4 = var4 + this.field_e[1 + var2];
                            var3 = var3 + this.field_e[var2];
                            var3 = var3 ^ var4 << -46797589;
                            var6 = var6 + var3;
                            var4 = var4 + var5;
                            var4 = var4 ^ var5 >>> 1465481378;
                            var5 = var5 + var6;
                            var7 = var7 + var4;
                            var5 = var5 ^ var6 << -1178978456;
                            var6 = var6 + var7;
                            var8 = var8 + var5;
                            var6 = var6 ^ var7 >>> -1154249776;
                            var9 = var9 + var6;
                            var7 = var7 + var8;
                            var7 = var7 ^ var8 << 1280557386;
                            var10 = var10 + var7;
                            var8 = var8 + var9;
                            var8 = var8 ^ var9 >>> -915717020;
                            var9 = var9 + var10;
                            var3 = var3 + var8;
                            var9 = var9 ^ var10 << -249297528;
                            var10 = var10 + var3;
                            var4 = var4 + var9;
                            var10 = var10 ^ var3 >>> 2003739529;
                            var5 = var5 + var10;
                            var3 = var3 + var4;
                            this.field_j[var2] = var3;
                            this.field_j[var2 - -1] = var4;
                            this.field_j[var2 - -2] = var5;
                            this.field_j[3 + var2] = var6;
                            this.field_j[4 + var2] = var7;
                            this.field_j[var2 + 5] = var8;
                            this.field_j[var2 - -6] = var9;
                            this.field_j[7 + var2] = var10;
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
                        if ((var2 ^ -1) > -257) {
                          var4 = var4 + this.field_j[1 + var2];
                          var10 = var10 + this.field_j[var2 - -7];
                          var7 = var7 + this.field_j[var2 + 4];
                          var3 = var3 + this.field_j[var2];
                          var9 = var9 + this.field_j[6 + var2];
                          var8 = var8 + this.field_j[5 + var2];
                          var5 = var5 + this.field_j[var2 + 2];
                          var6 = var6 + this.field_j[var2 - -3];
                          var3 = var3 ^ var4 << -142864757;
                          var6 = var6 + var3;
                          var4 = var4 + var5;
                          var4 = var4 ^ var5 >>> -499508510;
                          var7 = var7 + var4;
                          var5 = var5 + var6;
                          var5 = var5 ^ var6 << 1037602824;
                          var8 = var8 + var5;
                          var6 = var6 + var7;
                          var6 = var6 ^ var7 >>> -156107024;
                          var7 = var7 + var8;
                          var9 = var9 + var6;
                          var7 = var7 ^ var8 << 42938026;
                          var8 = var8 + var9;
                          var10 = var10 + var7;
                          var8 = var8 ^ var9 >>> -490659868;
                          var9 = var9 + var10;
                          var3 = var3 + var8;
                          var9 = var9 ^ var10 << 172814728;
                          var4 = var4 + var9;
                          var10 = var10 + var3;
                          var10 = var10 ^ var3 >>> 364873961;
                          var5 = var5 + var10;
                          var3 = var3 + var4;
                          this.field_j[var2] = var3;
                          this.field_j[1 + var2] = var4;
                          this.field_j[2 + var2] = var5;
                          this.field_j[3 + var2] = var6;
                          this.field_j[var2 - -4] = var7;
                          this.field_j[var2 - -5] = var8;
                          this.field_j[6 + var2] = var9;
                          this.field_j[7 + var2] = var10;
                          var2 += 8;
                          if (var11 == 0) {
                            continue L5;
                          } else {
                            return;
                          }
                        } else {
                          this.b(0);
                          this.field_a = 256;
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
            L6: while (true) {
              if ((var2 ^ -1) <= -257) {
                var2 = 0;
                L7: while (true) {
                  if ((var2 ^ -1) > -257) {
                    var4 = var4 + this.field_j[1 + var2];
                    var10 = var10 + this.field_j[var2 - -7];
                    var7 = var7 + this.field_j[var2 + 4];
                    var3 = var3 + this.field_j[var2];
                    var9 = var9 + this.field_j[6 + var2];
                    var8 = var8 + this.field_j[5 + var2];
                    var5 = var5 + this.field_j[var2 + 2];
                    var6 = var6 + this.field_j[var2 - -3];
                    var3 = var3 ^ var4 << -142864757;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -499508510;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 1037602824;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -156107024;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 42938026;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -490659868;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 172814728;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 364873961;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_j[var2] = var3;
                    this.field_j[1 + var2] = var4;
                    this.field_j[2 + var2] = var5;
                    this.field_j[3 + var2] = var6;
                    this.field_j[var2 - -4] = var7;
                    this.field_j[var2 - -5] = var8;
                    this.field_j[6 + var2] = var9;
                    this.field_j[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                      continue L7;
                    } else {
                      return;
                    }
                  } else {
                    this.b(0);
                    this.field_a = 256;
                    return;
                  }
                }
              } else {
                var6 = var6 + this.field_e[3 + var2];
                var9 = var9 + this.field_e[var2 + 6];
                var8 = var8 + this.field_e[var2 + 5];
                var7 = var7 + this.field_e[4 + var2];
                var5 = var5 + this.field_e[2 + var2];
                var10 = var10 + this.field_e[7 + var2];
                var4 = var4 + this.field_e[1 + var2];
                var3 = var3 + this.field_e[var2];
                var3 = var3 ^ var4 << -46797589;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1465481378;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -1178978456;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1154249776;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 1280557386;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -915717020;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -249297528;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 2003739529;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_j[var2] = var3;
                this.field_j[var2 - -1] = var4;
                this.field_j[var2 - -2] = var5;
                this.field_j[3 + var2] = var6;
                this.field_j[4 + var2] = var7;
                this.field_j[var2 + 5] = var8;
                this.field_j[var2 - -6] = var9;
                this.field_j[7 + var2] = var10;
                var2 += 8;
                if (var11 == 0) {
                  continue L6;
                } else {
                  L8: while (true) {
                    if ((var2 ^ -1) > -257) {
                      var4 = var4 + this.field_j[1 + var2];
                      var10 = var10 + this.field_j[var2 - -7];
                      var7 = var7 + this.field_j[var2 + 4];
                      var3 = var3 + this.field_j[var2];
                      var9 = var9 + this.field_j[6 + var2];
                      var8 = var8 + this.field_j[5 + var2];
                      var5 = var5 + this.field_j[var2 + 2];
                      var6 = var6 + this.field_j[var2 - -3];
                      var3 = var3 ^ var4 << -142864757;
                      var6 = var6 + var3;
                      var4 = var4 + var5;
                      var4 = var4 ^ var5 >>> -499508510;
                      var7 = var7 + var4;
                      var5 = var5 + var6;
                      var5 = var5 ^ var6 << 1037602824;
                      var8 = var8 + var5;
                      var6 = var6 + var7;
                      var6 = var6 ^ var7 >>> -156107024;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << 42938026;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> -490659868;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << 172814728;
                      var4 = var4 + var9;
                      var10 = var10 + var3;
                      var10 = var10 ^ var3 >>> 364873961;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      this.field_j[var2] = var3;
                      this.field_j[1 + var2] = var4;
                      this.field_j[2 + var2] = var5;
                      this.field_j[3 + var2] = var6;
                      this.field_j[var2 - -4] = var7;
                      this.field_j[var2 - -5] = var8;
                      this.field_j[6 + var2] = var9;
                      this.field_j[7 + var2] = var10;
                      var2 += 8;
                      if (var11 == 0) {
                        continue L8;
                      } else {
                        return;
                      }
                    } else {
                      this.b(0);
                      this.field_a = 256;
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

    static {
        field_f = new ti(540, 140);
        field_h = 0;
    }
}
