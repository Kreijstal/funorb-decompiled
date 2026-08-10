/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private int field_e;
    boolean field_i;
    private int field_a;
    int field_h;
    int field_d;
    private int field_f;
    static int field_j;
    private int field_c;
    static int field_b;
    private int field_g;

    final void a(byte param0) {
        this.field_e = 0;
        this.field_g = 0;
        int var2 = -114 / ((38 - param0) / 37);
        this.field_a = 0;
        if (0 == this.field_f) {
            if (!((da.field_b ^ -1) != -99)) {
                if ((this.field_d ^ -1) >= -1) {
                    this.field_d = this.field_h;
                }
                this.field_d = this.field_d - 1;
                this.field_i = false;
            }
        }
        if (this.field_f == 0) {
            this.field_a = da.field_b;
        }
        if (this.field_f == 0) {
            if (!(da.field_b != 99)) {
                this.field_d = this.field_d + 1;
                if (!(this.field_h > this.field_d)) {
                    this.field_d = 0;
                }
                this.field_i = false;
            }
        }
    }

    final boolean a(int param0) {
        if (param0 != -104) {
            return false;
        }
        return (this.field_a ^ -1) == -104 ? true : false;
    }

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        var29 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            o.a(qb.field_b, 0, 307200, -1);
            var1_int = 0;
            L1: while (true) {
              if (41 <= var1_int) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    field_b = -104;
                    break L2;
                  }
                }
                break L0;
              } else {
                var2 = og.field_f[var1_int][0];
                var3 = we.field_b[var1_int][0];
                var4 = bg.field_f[var1_int][0];
                var5 = 0;
                var6 = 1;
                L3: while (true) {
                  if ((var6 ^ -1) <= -11) {
                    var1_int += 40;
                    continue L1;
                  } else {
                    L4: {
                      var7 = og.field_f[var1_int][var6];
                      var8 = we.field_b[var1_int][var6];
                      var9 = bg.field_f[var1_int][var6];
                      var10 = ce.field_c[-1 + var6];
                      var11 = var7 - (var2 + -1);
                      if ((var11 ^ -1) < -1) {
                        var14 = var3 << -2051384748;
                        var17 = (-var4 + var9 << 1627165076) / var11;
                        var16 = var4 << 1664440116;
                        var12 = 1 + var7;
                        var13 = var5 << 1857184820;
                        var15 = (var8 - var3 << 781453076) / var11;
                        var18 = -2147483648;
                        break L4;
                      } else {
                        var13 = 311 + (-var5 + -var10) << 841764532;
                        var11 = 1 + -var7 + var2;
                        var14 = var8 << 2089411284;
                        var12 = var2 + 1;
                        var18 = 0;
                        var17 = (-var9 + var4 << 143015892) / var11;
                        var15 = (-var8 + var3 << 313852052) / var11;
                        var16 = var9 << -1734402444;
                        break L4;
                      }
                    }
                    var19 = (var10 << -1840765292) / var11;
                    var2 = var7;
                    var5 = var5 + var10;
                    var3 = var8;
                    L5: while (true) {
                      if (var11 <= 0) {
                        var4 = var9;
                        var6++;
                        continue L3;
                      } else {
                        L6: {
                          var20 = var14 >> 1773830644;
                          var21 = 1 + (var16 >> -886200364) + -var20;
                          var22 = 471859200 / var21;
                          var23 = (471859200 - var21 * var22) / 2;
                          var24 = lf.field_f * var20 + var12 + -var11;
                          if ((var21 + var20 ^ -1) < -481) {
                            var21 = 480 - var20;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if ((var20 ^ -1) > -1) {
                            var21 = var21 + var20;
                            var23 = var23 - var20 * var22;
                            var24 = var24 - var20 * lf.field_f;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var25 = var19 / 2 + var13;
                        if (325058560 >= var25) {
                          var26 = (var25 >> -480320377 | var18) & -2048;
                          var14 = var14 + var15;
                          var27 = -var21;
                          L8: while (true) {
                            if (-1 >= (var27 ^ -1)) {
                              var16 = var16 + var17;
                              var13 = var13 + var19;
                              var11--;
                              continue L5;
                            } else {
                              L9: {
                                var28 = var22 / 2 + var23;
                                if (-470810625 <= (var28 ^ -1)) {
                                  qb.field_b[var24] = tb.a(var26, var28 >> -671557838);
                                  var23 = var23 + var22;
                                  var24 = var24 + lf.field_f;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var27++;
                              continue L8;
                            }
                          }
                        } else {
                          var11--;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "fi.L(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_i = param1 ? true : false;
        this.field_f = param0;
        if (!this.field_i) {
            this.field_d = param3;
        } else {
            this.field_d = param2;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        var4 = 29 / ((param2 - -54) / 46);
        if (param1 < this.field_h) {
          if (this.field_h <= param0) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              this.field_e = 0;
              this.field_g = 0;
              this.field_a = 0;
              if (0 == nk.field_z) {
                break L0;
              } else {
                this.field_c = tc.field_a;
                this.field_f = nk.field_z;
                this.field_d = param0;
                this.field_i = true;
                this.field_g = nk.field_z;
                this.field_e = nk.field_z;
                break L0;
              }
            }
            L1: {
              if (this.field_f != 0) {
                L2: {
                  if (ul.field_o != 0) {
                    L3: {
                      if (0 >= this.field_c) {
                        this.field_c = sf.field_a;
                        this.field_g = this.field_f;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.field_c = this.field_c - 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (nk.field_z != 0) {
                  break L1;
                } else {
                  if (ul.field_o != 0) {
                    break L1;
                  } else {
                    this.field_f = 0;
                    break L1;
                  }
                }
              } else {
                if (nk.field_z != 0) {
                  break L1;
                } else {
                  if (ul.field_o != 0) {
                    break L1;
                  } else {
                    this.field_f = 0;
                    break L1;
                  }
                }
              }
            }
            L4: {
              if (-1 != (this.field_f ^ -1)) {
                break L4;
              } else {
                L5: {
                  if (this.field_i) {
                    break L5;
                  } else {
                    if (ob.field_c) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                if ((param1 ^ -1) <= -1) {
                  L6: {
                    if (param1 == this.field_d) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_i = true;
                  this.field_d = param1;
                  break L4;
                } else {
                  if (!this.field_i) {
                    break L4;
                  } else {
                    this.field_d = -1;
                    break L4;
                  }
                }
              }
            }
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final boolean d(byte param0) {
        if (param0 < 83) {
            this.field_d = 93;
        }
        return -98 == (this.field_a ^ -1) ? true : false;
    }

    final boolean e(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == 471859200) {
          L0: {
            L1: {
              if (2 == this.field_g) {
                break L1;
              } else {
                if (96 != this.field_a) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 84) {
            return;
        }
        if (!(this.field_f != 0)) {
            this.field_i = false;
            this.field_d = param0;
        }
    }

    final static db[] a(sh param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 > 54) {
              break L0;
            } else {
              field_j = -68;
              break L0;
            }
          }
          if (nb.a(param3, param1, (byte) 126, param0)) {
            return df.a((byte) 91);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("fi.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean d(int param0) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_j = -108;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_g != 0) {
              break L2;
            } else {
              if (this.field_a == 84) {
                break L2;
              } else {
                if (this.field_a != 83) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean f(int param0) {
        int var2 = -30 % ((31 - param0) / 62);
        return -97 == (this.field_a ^ -1) ? true : false;
    }

    final boolean b(boolean param0) {
        int stackIn_8_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (0 != this.field_e) {
                break L1;
              } else {
                if ((this.field_a ^ -1) == -85) {
                  break L1;
                } else {
                  if (-84 != (this.field_a ^ -1)) {
                    stackIn_8_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final void b(byte param0) {
        int var2 = 6 / ((-65 - param0) / 52);
        this.field_e = 0;
        this.field_a = 0;
        this.field_g = 0;
        if (!(-1 != (this.field_f ^ -1))) {
            this.field_a = da.field_b;
        }
    }

    final boolean c(int param0) {
        if (param0 != -1) {
            field_b = 67;
        }
        return (this.field_f ^ -1) != -1 ? true : false;
    }

    final void c(byte param0) {
        int var2;
        L0: {
          this.field_g = 0;
          this.field_e = 0;
          this.field_a = 0;
          if (0 != this.field_f) {
            break L0;
          } else {
            this.field_a = da.field_b;
            break L0;
          }
        }
        L1: {
          if (-1 == (this.field_f ^ -1)) {
            if (-97 == (da.field_b ^ -1)) {
              L2: {
                if (this.field_d > 0) {
                  break L2;
                } else {
                  this.field_d = this.field_h;
                  break L2;
                }
              }
              this.field_i = false;
              this.field_d = this.field_d - 1;
              if (-1 != (this.field_f ^ -1)) {
                break L1;
              } else {
                if (da.field_b != 97) {
                  break L1;
                } else {
                  this.field_d = this.field_d + 1;
                  this.field_i = false;
                  if (this.field_h > this.field_d) {
                    break L1;
                  } else {
                    this.field_d = 0;
                    break L1;
                  }
                }
              }
            } else {
              if (-1 != (this.field_f ^ -1)) {
                break L1;
              } else {
                if (da.field_b != 97) {
                  break L1;
                } else {
                  this.field_d = this.field_d + 1;
                  this.field_i = false;
                  if (this.field_h > this.field_d) {
                    break L1;
                  } else {
                    this.field_d = 0;
                    break L1;
                  }
                }
              }
            }
          } else {
            if (-1 != (this.field_f ^ -1)) {
              break L1;
            } else {
              if (da.field_b != 97) {
                break L1;
              } else {
                this.field_d = this.field_d + 1;
                this.field_i = false;
                if (this.field_h > this.field_d) {
                  break L1;
                } else {
                  this.field_d = 0;
                  break L1;
                }
              }
            }
          }
        }
        var2 = 43 % ((43 - param0) / 41);
    }

    final boolean b(int param0) {
        int stackIn_9_0 = 0;
        if (param0 == -98) {
          L0: {
            L1: {
              if (this.field_g == 1) {
                break L1;
              } else {
                if (-98 == (this.field_a ^ -1)) {
                  break L1;
                } else {
                  if ((this.field_a ^ -1) == -85) {
                    break L1;
                  } else {
                    if (-84 != (this.field_a ^ -1)) {
                      stackIn_9_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    final boolean e(byte param0) {
        if (param0 != -60) {
            return true;
        }
        return 102 == this.field_a ? true : false;
    }

    fi(int param0) {
        this.field_i = false;
        this.field_d = 0;
        this.field_h = param0;
    }

    static {
        field_b = 2;
    }
}
