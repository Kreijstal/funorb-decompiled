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
        ((fi) this).field_e = 0;
        ((fi) this).field_g = 0;
        int var2 = -114 / ((38 - param0) / 37);
        ((fi) this).field_a = 0;
        if (0 == ((fi) this).field_f) {
            if (!(da.field_b != 98)) {
                if (((fi) this).field_d <= 0) {
                    ((fi) this).field_d = ((fi) this).field_h;
                }
                ((fi) this).field_d = ((fi) this).field_d - 1;
                ((fi) this).field_i = false;
            }
        }
        if (((fi) this).field_f == 0) {
            ((fi) this).field_a = da.field_b;
        }
        if (((fi) this).field_f == 0) {
            if (!(da.field_b != 99)) {
                ((fi) this).field_d = ((fi) this).field_d + 1;
                if (!(((fi) this).field_h > ((fi) this).field_d)) {
                    ((fi) this).field_d = 0;
                }
                ((fi) this).field_i = false;
            }
        }
    }

    final boolean a(int param0) {
        if (param0 != -104) {
            return false;
        }
        return ((fi) this).field_a == 103 ? true : false;
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        var29 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            o.a(qb.field_b, 0, 307200, -1);
            var1_int = 0;
            L1: while (true) {
              if (41 <= var1_int) {
                break L0;
              } else {
                var2 = og.field_f[var1_int][0];
                var3 = we.field_b[var1_int][0];
                var4 = bg.field_f[var1_int][0];
                var5 = 0;
                var6 = 1;
                L2: while (true) {
                  if (var6 >= 10) {
                    var1_int += 40;
                    continue L1;
                  } else {
                    L3: {
                      var7 = og.field_f[var1_int][var6];
                      var8 = we.field_b[var1_int][var6];
                      var9 = bg.field_f[var1_int][var6];
                      var10 = ce.field_c[-1 + var6];
                      var11 = var7 - (var2 + -1);
                      if (var11 > 0) {
                        var14 = var3 << 20;
                        var17 = (-var4 + var9 << 20) / var11;
                        var16 = var4 << 20;
                        var12 = 1 + var7;
                        var13 = var5 << 20;
                        var15 = (var8 - var3 << 20) / var11;
                        var18 = -2147483648;
                        break L3;
                      } else {
                        var13 = 311 + (-var5 + -var10) << 20;
                        var11 = 1 + -var7 + var2;
                        var14 = var8 << 20;
                        var12 = var2 + 1;
                        var18 = 0;
                        var17 = (-var9 + var4 << 20) / var11;
                        var15 = (-var8 + var3 << 20) / var11;
                        var16 = var9 << 20;
                        break L3;
                      }
                    }
                    var19 = (var10 << 20) / var11;
                    var2 = var7;
                    var5 = var5 + var10;
                    var3 = var8;
                    L4: while (true) {
                      if (var11 <= 0) {
                        var4 = var9;
                        var6++;
                        continue L2;
                      } else {
                        L5: {
                          var20 = var14 >> 20;
                          var21 = 1 + (var16 >> 20) + -var20;
                          var22 = 471859200 / var21;
                          var23 = (471859200 - var21 * var22) / 2;
                          var24 = lf.field_f * var20 + var12 + -var11;
                          if (var21 + var20 > 480) {
                            var21 = 480 - var20;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (var20 < 0) {
                            var21 = var21 + var20;
                            var23 = var23 - var20 * var22;
                            var24 = var24 - var20 * lf.field_f;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          var25 = var19 / 2 + var13;
                          if (325058560 < var25) {
                            break L7;
                          } else {
                            var26 = (var25 >> 7 | var18) & -2048;
                            var14 = var14 + var15;
                            var27 = -var21;
                            L8: while (true) {
                              if (var27 >= 0) {
                                var16 = var16 + var17;
                                var13 = var13 + var19;
                                break L7;
                              } else {
                                L9: {
                                  var28 = var22 / 2 + var23;
                                  if (var28 <= 470810624) {
                                    qb.field_b[var24] = tb.a(var26, var28 >> 18);
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
                          }
                        }
                        var11--;
                        continue L4;
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
          throw ld.a((Throwable) (Object) var1, "fi.L(" + false + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        ((fi) this).field_i = param1 ? true : false;
        ((fi) this).field_f = param0;
        if (!((fi) this).field_i) {
            ((fi) this).field_d = param3;
        } else {
            ((fi) this).field_d = param2;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = 29 / ((param2 - -54) / 46);
        if (~param1 > ~((fi) this).field_h) {
          if (~((fi) this).field_h >= ~param0) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              ((fi) this).field_e = 0;
              ((fi) this).field_g = 0;
              ((fi) this).field_a = 0;
              if (0 == nk.field_z) {
                break L0;
              } else {
                ((fi) this).field_c = tc.field_a;
                ((fi) this).field_f = nk.field_z;
                ((fi) this).field_d = param0;
                ((fi) this).field_i = true;
                ((fi) this).field_g = nk.field_z;
                ((fi) this).field_e = nk.field_z;
                break L0;
              }
            }
            L1: {
              if (((fi) this).field_f == 0) {
                break L1;
              } else {
                if (ul.field_o != 0) {
                  L2: {
                    if (0 >= ((fi) this).field_c) {
                      ((fi) this).field_c = sf.field_a;
                      ((fi) this).field_g = ((fi) this).field_f;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((fi) this).field_c = ((fi) this).field_c - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (nk.field_z != 0) {
                break L3;
              } else {
                if (ul.field_o != 0) {
                  break L3;
                } else {
                  ((fi) this).field_f = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (((fi) this).field_f != 0) {
                break L4;
              } else {
                L5: {
                  if (((fi) this).field_i) {
                    break L5;
                  } else {
                    if (ob.field_c) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                if (param1 >= 0) {
                  L6: {
                    if (param1 == ((fi) this).field_d) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((fi) this).field_i = true;
                  ((fi) this).field_d = param1;
                  break L4;
                } else {
                  if (!((fi) this).field_i) {
                    break L4;
                  } else {
                    ((fi) this).field_d = -1;
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
            ((fi) this).field_d = 93;
        }
        return ((fi) this).field_a == 97 ? true : false;
    }

    final boolean e(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 471859200) {
          L0: {
            L1: {
              if (2 == ((fi) this).field_g) {
                break L1;
              } else {
                if (96 != ((fi) this).field_a) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
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
        if (!(((fi) this).field_f != 0)) {
            ((fi) this).field_i = false;
            ((fi) this).field_d = param0;
        }
    }

    final static db[] a(sh param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (nb.a(param3, param1, (byte) 126, param0)) {
            int discarded$2 = 91;
            return df.a();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("fi.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + 62 + ',' + param3 + ')');
        }
    }

    final boolean d(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
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
            if (((fi) this).field_g != 0) {
              break L2;
            } else {
              if (((fi) this).field_a == 84) {
                break L2;
              } else {
                if (((fi) this).field_a != 83) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean f(int param0) {
        int var2 = -30 % ((31 - param0) / 62);
        return ((fi) this).field_a == 96 ? true : false;
    }

    final boolean b(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (0 != ((fi) this).field_e) {
                break L1;
              } else {
                if (((fi) this).field_a == 84) {
                  break L1;
                } else {
                  if (((fi) this).field_a != 83) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final void b(byte param0) {
        int var2 = 6 / ((-65 - param0) / 52);
        ((fi) this).field_e = 0;
        ((fi) this).field_a = 0;
        ((fi) this).field_g = 0;
        if (!(((fi) this).field_f != 0)) {
            ((fi) this).field_a = da.field_b;
        }
    }

    final boolean c(int param0) {
        if (param0 != -1) {
            field_b = 67;
        }
        return ((fi) this).field_f != 0 ? true : false;
    }

    final void c(byte param0) {
        int var2 = 0;
        L0: {
          ((fi) this).field_g = 0;
          ((fi) this).field_e = 0;
          ((fi) this).field_a = 0;
          if (0 != ((fi) this).field_f) {
            break L0;
          } else {
            ((fi) this).field_a = da.field_b;
            break L0;
          }
        }
        L1: {
          if (-1 == ((fi) this).field_f) {
            if (((fi) this).field_f != 0) {
              break L1;
            } else {
              if (da.field_b != 97) {
                break L1;
              } else {
                ((fi) this).field_d = ((fi) this).field_d + 1;
                ((fi) this).field_i = false;
                if (((fi) this).field_h > ((fi) this).field_d) {
                  break L1;
                } else {
                  ((fi) this).field_d = 0;
                  break L1;
                }
              }
            }
          } else {
            if (-1 != ((fi) this).field_f) {
              break L1;
            } else {
              if (da.field_b != 97) {
                break L1;
              } else {
                ((fi) this).field_d = ((fi) this).field_d + 1;
                ((fi) this).field_i = false;
                if (((fi) this).field_h > ((fi) this).field_d) {
                  break L1;
                } else {
                  ((fi) this).field_d = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == -98) {
          L0: {
            L1: {
              if (((fi) this).field_g == 1) {
                break L1;
              } else {
                if (((fi) this).field_a == 97) {
                  break L1;
                } else {
                  if (((fi) this).field_a == 84) {
                    break L1;
                  } else {
                    if (((fi) this).field_a != 83) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
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
        return 102 == ((fi) this).field_a ? true : false;
    }

    fi(int param0) {
        ((fi) this).field_i = false;
        ((fi) this).field_d = 0;
        ((fi) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 2;
    }
}
