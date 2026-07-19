/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_d;
    static int field_b;
    private int field_a;
    static String field_m;
    static String[] field_f;
    static int field_j;
    private int[] field_e;
    private int[] field_l;
    private int field_c;
    static byte[][][] field_h;
    static int[] field_i;
    private int field_g;
    private int field_k;

    final static void a(boolean param0, String param1, String param2) {
        try {
            af.a(param2, param0, param1, (byte) 50);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "pc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) {
        int dupTemp$6 = 0;
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int dupTemp$9 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        int fieldTemp$5 = this.field_a + 1;
        this.field_a = this.field_a + 1;
        this.field_k = this.field_k + fieldTemp$5;
        if (param0 == 2) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) > -257) {
              var3 = this.field_l[var2];
              if (var5 == 0) {
                L1: {
                  L2: {
                    if ((2 & var2) == 0) {
                      break L2;
                    } else {
                      L3: {
                        if (0 != (var2 & 1)) {
                          break L3;
                        } else {
                          this.field_g = this.field_g ^ this.field_g << -1391240510;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_g = this.field_g ^ this.field_g >>> -532527344;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (0 != (1 & var2)) {
                      break L4;
                    } else {
                      this.field_g = this.field_g ^ this.field_g << -1837300083;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_g = this.field_g ^ this.field_g >>> -341989914;
                  break L1;
                }
                this.field_g = this.field_g + this.field_l[255 & var2 + 128];
                dupTemp$6 = this.field_k + (this.field_l[sc.a(var3 >> 1698005762, 255)] + this.field_g);
                var4 = dupTemp$6;
                this.field_l[var2] = dupTemp$6;
                dupTemp$7 = this.field_l[sc.a(var4 >> 1267318600 >> -587620766, 255)] + var3;
                this.field_k = dupTemp$7;
                this.field_e[var2] = dupTemp$7;
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
          this.field_e = (int[]) null;
          var2 = 0;
          L5: while (true) {
            if ((var2 ^ -1) > -257) {
              var3 = this.field_l[var2];
              if (var5 == 0) {
                L6: {
                  L7: {
                    if ((2 & var2) == 0) {
                      break L7;
                    } else {
                      L8: {
                        if (0 != (var2 & 1)) {
                          break L8;
                        } else {
                          this.field_g = this.field_g ^ this.field_g << -1391240510;
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      this.field_g = this.field_g ^ this.field_g >>> -532527344;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (0 != (1 & var2)) {
                      break L9;
                    } else {
                      this.field_g = this.field_g ^ this.field_g << -1837300083;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_g = this.field_g ^ this.field_g >>> -341989914;
                  break L6;
                }
                this.field_g = this.field_g + this.field_l[255 & var2 + 128];
                dupTemp$8 = this.field_k + (this.field_l[sc.a(var3 >> 1698005762, 255)] + this.field_g);
                var4 = dupTemp$8;
                this.field_l[var2] = dupTemp$8;
                dupTemp$9 = this.field_l[sc.a(var4 >> 1267318600 >> -587620766, 255)] + var3;
                this.field_k = dupTemp$9;
                this.field_e[var2] = dupTemp$9;
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

    private final void a(byte param0) {
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
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
        var11 = fleas.field_A ? 1 : 0;
        var4 = -1640531527;
        var8 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var5 = -1640531527;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (-5 >= (var2 ^ -1)) {
                break L2;
              } else {
                var3 = var3 ^ var4 << -2015297717;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 668902946;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -436004888;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 13382000;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -1448364374;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -834576252;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 407289352;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -1797963831;
                var3 = var3 + var4;
                var5 = var5 + var10;
                var2++;
                if (var11 != 0) {
                  break L1;
                } else {
                  if (var11 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = 0;
            break L1;
          }
          L3: while (true) {
            if (-257 >= (var2 ^ -1)) {
              var2 = 0;
              L4: while (true) {
                if (256 <= var2) {
                  this.b(2);
                  this.field_c = 256;
                  if (param0 == -125) {
                    return;
                  } else {
                    discarded$9 = this.a(-54);
                    return;
                  }
                } else {
                  var10 = var10 + this.field_l[7 + var2];
                  var6 = var6 + this.field_l[var2 - -3];
                  var9 = var9 + this.field_l[var2 + 6];
                  var8 = var8 + this.field_l[5 + var2];
                  var4 = var4 + this.field_l[1 + var2];
                  var3 = var3 + this.field_l[var2];
                  var5 = var5 + this.field_l[var2 + 2];
                  var7 = var7 + this.field_l[var2 + 4];
                  var3 = var3 ^ var4 << -1800222357;
                  var4 = var4 + var5;
                  var6 = var6 + var3;
                  var4 = var4 ^ var5 >>> -1119398814;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << -2078926168;
                  var6 = var6 + var7;
                  var8 = var8 + var5;
                  var6 = var6 ^ var7 >>> -471242704;
                  var7 = var7 + var8;
                  var9 = var9 + var6;
                  var7 = var7 ^ var8 << -272567606;
                  var8 = var8 + var9;
                  var10 = var10 + var7;
                  var8 = var8 ^ var9 >>> -1705790300;
                  var9 = var9 + var10;
                  var3 = var3 + var8;
                  var9 = var9 ^ var10 << -1200075448;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> -1831714679;
                  var5 = var5 + var10;
                  var3 = var3 + var4;
                  this.field_l[var2] = var3;
                  this.field_l[1 + var2] = var4;
                  this.field_l[var2 - -2] = var5;
                  this.field_l[3 + var2] = var6;
                  this.field_l[var2 + 4] = var7;
                  this.field_l[var2 - -5] = var8;
                  this.field_l[6 + var2] = var9;
                  this.field_l[7 + var2] = var10;
                  var2 += 8;
                  if (var11 != 0) {
                    if (param0 == -125) {
                      return;
                    } else {
                      discarded$10 = this.a(-54);
                      return;
                    }
                  } else {
                    if (var11 == 0) {
                      continue L4;
                    } else {
                      this.b(2);
                      this.field_c = 256;
                      if (param0 == -125) {
                        return;
                      } else {
                        discarded$11 = this.a(-54);
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              var10 = var10 + this.field_e[var2 - -7];
              var3 = var3 + this.field_e[var2];
              var5 = var5 + this.field_e[var2 - -2];
              var9 = var9 + this.field_e[var2 + 6];
              var8 = var8 + this.field_e[var2 + 5];
              var6 = var6 + this.field_e[3 + var2];
              var7 = var7 + this.field_e[var2 - -4];
              var4 = var4 + this.field_e[var2 + 1];
              var3 = var3 ^ var4 << 752481515;
              var6 = var6 + var3;
              var4 = var4 + var5;
              var4 = var4 ^ var5 >>> 1252690018;
              var7 = var7 + var4;
              var5 = var5 + var6;
              var5 = var5 ^ var6 << 378258120;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> 995108848;
              var7 = var7 + var8;
              var9 = var9 + var6;
              var7 = var7 ^ var8 << 1868451370;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> -124228988;
              var3 = var3 + var8;
              var9 = var9 + var10;
              var9 = var9 ^ var10 << 1914765640;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> -1948714423;
              var5 = var5 + var10;
              var3 = var3 + var4;
              this.field_l[var2] = var3;
              this.field_l[var2 + 1] = var4;
              this.field_l[2 + var2] = var5;
              this.field_l[var2 - -3] = var6;
              this.field_l[4 + var2] = var7;
              this.field_l[5 + var2] = var8;
              this.field_l[6 + var2] = var9;
              this.field_l[var2 - -7] = var10;
              var2 += 8;
              if (var11 == 0) {
                if (var11 == 0) {
                  continue L3;
                } else {
                  var2 = 0;
                  L5: while (true) {
                    if (256 > var2) {
                      var10 = var10 + this.field_l[7 + var2];
                      var6 = var6 + this.field_l[var2 - -3];
                      var9 = var9 + this.field_l[var2 + 6];
                      var8 = var8 + this.field_l[5 + var2];
                      var4 = var4 + this.field_l[1 + var2];
                      var3 = var3 + this.field_l[var2];
                      var5 = var5 + this.field_l[var2 + 2];
                      var7 = var7 + this.field_l[var2 + 4];
                      var3 = var3 ^ var4 << -1800222357;
                      var4 = var4 + var5;
                      var6 = var6 + var3;
                      var4 = var4 ^ var5 >>> -1119398814;
                      var7 = var7 + var4;
                      var5 = var5 + var6;
                      var5 = var5 ^ var6 << -2078926168;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> -471242704;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << -272567606;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> -1705790300;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << -1200075448;
                      var4 = var4 + var9;
                      var10 = var10 + var3;
                      var10 = var10 ^ var3 >>> -1831714679;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      this.field_l[var2] = var3;
                      this.field_l[1 + var2] = var4;
                      this.field_l[var2 - -2] = var5;
                      this.field_l[3 + var2] = var6;
                      this.field_l[var2 + 4] = var7;
                      this.field_l[var2 - -5] = var8;
                      this.field_l[6 + var2] = var9;
                      this.field_l[7 + var2] = var10;
                      var2 += 8;
                      if (var11 == 0) {
                        if (var11 == 0) {
                          continue L5;
                        } else {
                          L6: {
                            this.b(2);
                            this.field_c = 256;
                            if (param0 == -125) {
                              break L6;
                            } else {
                              discarded$12 = this.a(-54);
                              break L6;
                            }
                          }
                          return;
                        }
                      } else {
                        L7: {
                          if (param0 == -125) {
                            break L7;
                          } else {
                            discarded$13 = this.a(-54);
                            break L7;
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        this.b(2);
                        this.field_c = 256;
                        if (param0 == -125) {
                          break L8;
                        } else {
                          discarded$14 = this.a(-54);
                          break L8;
                        }
                      }
                      return;
                    }
                  }
                }
              } else {
                L9: while (true) {
                  if (256 <= var2) {
                    L10: {
                      this.b(2);
                      this.field_c = 256;
                      if (param0 == -125) {
                        break L10;
                      } else {
                        discarded$15 = this.a(-54);
                        break L10;
                      }
                    }
                    return;
                  } else {
                    var10 = var10 + this.field_l[7 + var2];
                    var6 = var6 + this.field_l[var2 - -3];
                    var9 = var9 + this.field_l[var2 + 6];
                    var8 = var8 + this.field_l[5 + var2];
                    var4 = var4 + this.field_l[1 + var2];
                    var3 = var3 + this.field_l[var2];
                    var5 = var5 + this.field_l[var2 + 2];
                    var7 = var7 + this.field_l[var2 + 4];
                    var3 = var3 ^ var4 << -1800222357;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1119398814;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -2078926168;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -471242704;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -272567606;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1705790300;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1200075448;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1831714679;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_l[var2] = var3;
                    this.field_l[1 + var2] = var4;
                    this.field_l[var2 - -2] = var5;
                    this.field_l[3 + var2] = var6;
                    this.field_l[var2 + 4] = var7;
                    this.field_l[var2 - -5] = var8;
                    this.field_l[6 + var2] = var9;
                    this.field_l[7 + var2] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                      if (param0 != -125) {
                        discarded$16 = this.a(-54);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var11 == 0) {
                        continue L9;
                      } else {
                        L11: {
                          this.b(2);
                          this.field_c = 256;
                          if (param0 == -125) {
                            break L11;
                          } else {
                            discarded$17 = this.a(-54);
                            break L11;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(boolean param0) {
        String var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          if (wi.field_b == 0) {
            if (-1 == (fleas.field_L ^ -1)) {
              if (hj.field_a[1] == 0) {
                if (-1 != (hj.field_a[0] ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var2 = (String) null;
          pc.a(false, (String) null, (String) null);
          if (wi.field_b == 0) {
            if (-1 == (fleas.field_L ^ -1)) {
              if (hj.field_a[1] == 0) {
                if (-1 != (hj.field_a[0] ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_f = null;
        field_i = null;
        field_m = null;
        field_h = (byte[][][]) null;
        int var1 = -53 / ((-72 - param0) / 43);
    }

    final int a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (param0 == 995108848) {
          if (this.field_c == 0) {
            this.b(2);
            this.field_c = 256;
            fieldTemp$4 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_e[fieldTemp$4];
          } else {
            fieldTemp$5 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_e[fieldTemp$5];
          }
        } else {
          field_m = (String) null;
          if (this.field_c != 0) {
            fieldTemp$6 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_e[fieldTemp$6];
          } else {
            this.b(2);
            this.field_c = 256;
            fieldTemp$7 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_e[fieldTemp$7];
          }
        }
    }

    pc(int[] param0) {
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
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            this.field_e = new int[256];
            this.field_l = new int[256];
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
                this.a((byte) -125);
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
            stackOut_7_1 = new StringBuilder().append("pc.<init>(");
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
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_m = "Create a free account to store your progress.";
        field_i = new int[8192];
        field_d = "Achievements";
    }
}
