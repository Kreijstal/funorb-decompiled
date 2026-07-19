/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb {
    private int field_b;
    private int field_e;
    private int field_a;
    private int[] field_c;
    private int field_d;
    private int[] field_f;
    static uf field_h;
    static bc field_g;

    final int b(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (this.field_b != 0) {
          if (param0 != 123) {
            this.field_b = 27;
            fieldTemp$4 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$4];
          } else {
            fieldTemp$5 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$5];
          }
        } else {
          this.a(4094);
          this.field_b = 256;
          if (param0 == 123) {
            fieldTemp$6 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$6];
          } else {
            this.field_b = 27;
            fieldTemp$7 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$7];
          }
        }
    }

    final static int a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = Bounce.field_N;
        var1 = (int)(11.0 * Math.random());
        if (var1 != 10) {
          if (param0) {
            var2 = ne.field_w;
            if (var2 == 0) {
              return 0;
            } else {
              if ((var2 ^ -1) != -2) {
                if (var2 != 2) {
                  if (-4 == (var2 ^ -1)) {
                    if (-8 <= (var1 ^ -1)) {
                      if (-2 == (var1 ^ -1)) {
                        return 2;
                      } else {
                        if (2 != var1) {
                          if ((var1 ^ -1) == -4) {
                            return 3;
                          } else {
                            if (var1 != 4) {
                              if (var1 == 5) {
                                return 4;
                              } else {
                                if (var1 != 6) {
                                  return 0;
                                } else {
                                  return 4;
                                }
                              }
                            } else {
                              return 3;
                            }
                          }
                        } else {
                          return 2;
                        }
                      }
                    } else {
                      return 1;
                    }
                  } else {
                    if (var2 != 4) {
                      if ((var2 ^ -1) == -6) {
                        if (var1 > 2) {
                          return 2;
                        } else {
                          return 0;
                        }
                      } else {
                        if (var2 != 6) {
                          if (var2 != 7) {
                            if (8 != var2) {
                              if (-10 != (var2 ^ -1)) {
                                return 0;
                              } else {
                                ne.field_w = 0;
                                return 0;
                              }
                            } else {
                              return (int)(Math.random() * 4.0);
                            }
                          } else {
                            return 2;
                          }
                        } else {
                          if (var1 <= 3) {
                            return 2;
                          } else {
                            return 1;
                          }
                        }
                      }
                    } else {
                      return var1 % 2 + 3;
                    }
                  }
                } else {
                  L0: {
                    if ((var1 ^ -1) >= -4) {
                      break L0;
                    } else {
                      if (7 < var1) {
                        break L0;
                      } else {
                        return 1;
                      }
                    }
                  }
                  if (7 >= var1) {
                    return 0;
                  } else {
                    return 2;
                  }
                }
              } else {
                if (6 >= var1) {
                  return 0;
                } else {
                  return 1;
                }
              }
            }
          } else {
            field_g = (bc) null;
            var2 = ne.field_w;
            if (var2 != 0) {
              if ((var2 ^ -1) != -2) {
                if (var2 != 2) {
                  if (-4 == (var2 ^ -1)) {
                    if (-8 <= (var1 ^ -1)) {
                      if (-2 != (var1 ^ -1)) {
                        if (2 != var1) {
                          if ((var1 ^ -1) != -4) {
                            if (var1 != 4) {
                              if (var1 != 5) {
                                if (var1 != 6) {
                                  return 0;
                                } else {
                                  return 4;
                                }
                              } else {
                                return 4;
                              }
                            } else {
                              return 3;
                            }
                          } else {
                            return 3;
                          }
                        } else {
                          return 2;
                        }
                      } else {
                        return 2;
                      }
                    } else {
                      return 1;
                    }
                  } else {
                    if (var2 != 4) {
                      if ((var2 ^ -1) == -6) {
                        if (var1 > 2) {
                          return 2;
                        } else {
                          return 0;
                        }
                      } else {
                        if (var2 != 6) {
                          if (var2 != 7) {
                            if (8 != var2) {
                              if (-10 == (var2 ^ -1)) {
                                ne.field_w = 0;
                                return 0;
                              } else {
                                return 0;
                              }
                            } else {
                              return (int)(Math.random() * 4.0);
                            }
                          } else {
                            return 2;
                          }
                        } else {
                          if (var1 > 3) {
                            return 1;
                          } else {
                            return 2;
                          }
                        }
                      }
                    } else {
                      return var1 % 2 + 3;
                    }
                  }
                } else {
                  if ((var1 ^ -1) < -4) {
                    if (7 < var1) {
                      if (7 < var1) {
                        return 2;
                      } else {
                        return 0;
                      }
                    } else {
                      return 1;
                    }
                  } else {
                    if (7 < var1) {
                      return 2;
                    } else {
                      return 0;
                    }
                  }
                }
              } else {
                if (6 < var1) {
                  return 1;
                } else {
                  return 0;
                }
              }
            } else {
              return 0;
            }
          }
        } else {
          return 5;
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -1402584374) {
          field_g = (bc) null;
          l.a(param0, false, param1 + 1402584396);
          return;
        } else {
          l.a(param0, false, param1 + 1402584396);
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            if (param0 <= jc.field_g.field_h) {
              return true;
            } else {
              if (dh.field_a == null) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = dh.field_a.d(param1 ^ param1);
                    if (0 < var2_int) {
                      L1: {
                        if (-jc.field_g.field_h + param0 < var2_int) {
                          var2_int = -jc.field_g.field_h + param0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      dh.field_a.a(jc.field_g.field_i, true, var2_int, jc.field_g.field_h);
                      qe.field_k = fa.a(-96);
                      jc.field_g.field_h = jc.field_g.field_h + var2_int;
                      if (jc.field_g.field_h < param0) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        jc.field_g.field_h = 0;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      L2: {
                        if (var2_int < 0) {
                          kc.a((byte) 18);
                          break L2;
                        } else {
                          if (ph.a((byte) -111) <= 30000L) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            kc.a((byte) 18);
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    kc.a((byte) 18);
                    decompiledRegionSelector0 = 3;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_14_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_16_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            if (nd.a(param1, 60)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ab.a(param1, (byte) -12)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (hc.b(param1, 0)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (param0 < -122) {
                      break L1;
                    } else {
                      discarded$2 = qb.a(-112, 114);
                      break L1;
                    }
                  }
                  if (param2.length() == 0) {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (pf.a(128, param1, param2)) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!ee.a(-1, param2, param1)) {
                        if (!ah.a(param1, param2, (byte) 8)) {
                          stackOut_28_0 = 1;
                          stackIn_29_0 = stackOut_28_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var3);
            stackOut_30_1 = new StringBuilder().append("qb.F(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L2;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L2;
            }
          }
          L3: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L3;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0 != 0;
                    } else {
                      return stackIn_29_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0) {
        boolean discarded$7 = false;
        int dupTemp$8 = 0;
        int dupTemp$9 = 0;
        int dupTemp$10 = 0;
        int dupTemp$11 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        var5 = Bounce.field_N;
        int fieldTemp$6 = this.field_a + 1;
        this.field_a = this.field_a + 1;
        this.field_e = this.field_e + fieldTemp$6;
        var2 = 0;
        if (param0 != 4094) {
          var6 = (String) null;
          discarded$7 = qb.a(-56, (String) null, (String) null);
          L0: while (true) {
            if (-257 < (var2 ^ -1)) {
              L1: {
                var3 = this.field_c[var2];
                if ((var2 & 2) != 0) {
                  if (-1 != (var2 & 1 ^ -1)) {
                    this.field_d = this.field_d ^ this.field_d >>> -1467927664;
                    break L1;
                  } else {
                    this.field_d = this.field_d ^ this.field_d << 293306466;
                    break L1;
                  }
                } else {
                  if ((1 & var2) == 0) {
                    this.field_d = this.field_d ^ this.field_d << 1477099821;
                    break L1;
                  } else {
                    this.field_d = this.field_d ^ this.field_d >>> -1328936858;
                    break L1;
                  }
                }
              }
              this.field_d = this.field_d + this.field_c[255 & var2 - -128];
              dupTemp$8 = this.field_e + this.field_c[da.b(1020, var3) >> 839191426] - -this.field_d;
              var4 = dupTemp$8;
              this.field_c[var2] = dupTemp$8;
              dupTemp$9 = this.field_c[da.b(255, var4 >> -2116620216 >> -963449630)] - -var3;
              this.field_e = dupTemp$9;
              this.field_f[var2] = dupTemp$9;
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L2: while (true) {
            if (-257 < (var2 ^ -1)) {
              L3: {
                var3 = this.field_c[var2];
                if ((var2 & 2) != 0) {
                  if (-1 != (var2 & 1 ^ -1)) {
                    this.field_d = this.field_d ^ this.field_d >>> -1467927664;
                    break L3;
                  } else {
                    this.field_d = this.field_d ^ this.field_d << 293306466;
                    break L3;
                  }
                } else {
                  if ((1 & var2) == 0) {
                    this.field_d = this.field_d ^ this.field_d << 1477099821;
                    break L3;
                  } else {
                    this.field_d = this.field_d ^ this.field_d >>> -1328936858;
                    break L3;
                  }
                }
              }
              this.field_d = this.field_d + this.field_c[255 & var2 - -128];
              dupTemp$10 = this.field_e + this.field_c[da.b(1020, var3) >> 839191426] - -this.field_d;
              var4 = dupTemp$10;
              this.field_c[var2] = dupTemp$10;
              dupTemp$11 = this.field_c[da.b(255, var4 >> -2116620216 >> -963449630)] - -var3;
              this.field_e = dupTemp$11;
              this.field_f[var2] = dupTemp$11;
              var2++;
              continue L2;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        boolean discarded$2 = false;
        String var2 = null;
        field_h = null;
        if (param0 != -30) {
          var2 = (String) null;
          discarded$2 = qb.a(-124, (String) null, (String) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

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
        var11 = Bounce.field_N;
        var5 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var9 = -1640531527;
        var8 = -1640531527;
        var10 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (-5 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -257) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    qb.a(false, 81);
                    break L2;
                  }
                }
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.a(4094);
                    this.field_b = 256;
                    return;
                  } else {
                    var7 = var7 + this.field_c[4 + var2];
                    var6 = var6 + this.field_c[3 + var2];
                    var4 = var4 + this.field_c[1 + var2];
                    var10 = var10 + this.field_c[7 + var2];
                    var5 = var5 + this.field_c[var2 + 2];
                    var3 = var3 + this.field_c[var2];
                    var9 = var9 + this.field_c[6 + var2];
                    var8 = var8 + this.field_c[var2 - -5];
                    var3 = var3 ^ var4 << 1888958123;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 1870285570;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 698341416;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 1805907120;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -1402584374;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 1161985156;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1103737704;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1393887127;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_c[var2] = var3;
                    this.field_c[var2 - -1] = var4;
                    this.field_c[var2 - -2] = var5;
                    this.field_c[var2 - -3] = var6;
                    this.field_c[var2 + 4] = var7;
                    this.field_c[var2 + 5] = var8;
                    this.field_c[var2 + 6] = var9;
                    this.field_c[7 + var2] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var3 = var3 + this.field_f[var2];
                var5 = var5 + this.field_f[var2 - -2];
                var7 = var7 + this.field_f[4 + var2];
                var10 = var10 + this.field_f[var2 + 7];
                var8 = var8 + this.field_f[var2 - -5];
                var4 = var4 + this.field_f[1 + var2];
                var9 = var9 + this.field_f[6 + var2];
                var6 = var6 + this.field_f[3 + var2];
                var3 = var3 ^ var4 << -425151349;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -2066021054;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 1656200616;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -305168464;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -85294262;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -1238596316;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -249137528;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -1567309975;
                var5 = var5 + var10;
                var3 = var3 + var4;
                this.field_c[var2] = var3;
                this.field_c[1 + var2] = var4;
                this.field_c[var2 + 2] = var5;
                this.field_c[var2 - -3] = var6;
                this.field_c[var2 - -4] = var7;
                this.field_c[5 + var2] = var8;
                this.field_c[var2 - -6] = var9;
                this.field_c[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << -22226581;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -143710334;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -997537112;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -2056422128;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -937905782;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 436568516;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -871028824;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -1481573751;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    qb(int[] param0) {
        int var2_int = 0;
        try {
            this.field_f = new int[256];
            this.field_c = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_f[var2_int] = param0[var2_int];
            }
            this.b(false);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "qb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new uf();
        field_g = new bc();
    }
}
