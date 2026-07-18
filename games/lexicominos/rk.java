/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends tb {
    static ee field_c;
    private int field_e;
    static volatile boolean field_m;
    static int field_g;
    private long field_j;
    private int field_l;
    private long field_h;
    private long[] field_f;
    static aj field_n;
    private long field_i;
    static aj field_d;
    static String field_k;

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((rk) this).field_i = 0L;
              if (param0 == 50) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              if (((rk) this).field_h >= ((rk) this).field_j) {
                break L2;
              } else {
                ((rk) this).field_h = ((rk) this).field_h + (((rk) this).field_j - ((rk) this).field_h);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "rk.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_k = null;
        field_n = null;
        if (!param0) {
            return;
        }
        try {
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "rk.B(" + param0 + ')');
        }
    }

    final long b(int param0) {
        RuntimeException var2 = null;
        long stackIn_5_0 = 0L;
        long stackIn_7_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_6_0 = 0L;
        long stackOut_4_0 = 0L;
        try {
          L0: {
            L1: {
              if (param0 == 255) {
                break L1;
              } else {
                field_m = true;
                break L1;
              }
            }
            ((rk) this).field_h = ((rk) this).field_h + this.c(10);
            if (((rk) this).field_j <= ((rk) this).field_h) {
              stackOut_6_0 = 0L;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = (((rk) this).field_j - ((rk) this).field_h) / 1000000L;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "rk.D(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    private final long c(int param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_18_0 = 0L;
        long stackIn_20_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_17_0 = 0L;
        long stackOut_19_0 = 0L;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_long = System.nanoTime();
              var4 = var2_long - ((rk) this).field_i;
              ((rk) this).field_i = var2_long;
              if (var4 <= -5000000000L) {
                break L1;
              } else {
                if (5000000000L <= var4) {
                  break L1;
                } else {
                  ((rk) this).field_f[((rk) this).field_e] = var4;
                  ((rk) this).field_e = (((rk) this).field_e + 1) % 10;
                  if (((rk) this).field_l >= 1) {
                    break L1;
                  } else {
                    ((rk) this).field_l = ((rk) this).field_l + 1;
                    break L1;
                  }
                }
              }
            }
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (~((rk) this).field_l > ~var8) {
                    break L4;
                  } else {
                    var6 = var6 + ((rk) this).field_f[(((rk) this).field_e - (var8 + -10)) % 10];
                    var8++;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (param0 == 10) {
                  break L3;
                } else {
                  stackOut_17_0 = -86L;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                }
              }
              stackOut_19_0 = var6 / (long)((rk) this).field_l;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "rk.E(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    final int a(long param0, byte param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 113) {
                break L1;
              } else {
                field_g = -117;
                break L1;
              }
            }
            if (((rk) this).field_h < ((rk) this).field_j) {
              ((rk) this).field_i = ((rk) this).field_i + (-((rk) this).field_h + ((rk) this).field_j);
              ((rk) this).field_h = ((rk) this).field_h + (-((rk) this).field_h + ((rk) this).field_j);
              ((rk) this).field_j = ((rk) this).field_j + param0;
              stackOut_15_0 = 1;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              var4_int = 0;
              L2: while (true) {
                ((rk) this).field_j = ((rk) this).field_j + param0;
                var4_int++;
                stackOut_6_0 = ~var4_int;
                stackIn_7_0 = stackOut_6_0;
                L3: while (true) {
                  L4: {
                    if (stackIn_7_0 <= -11) {
                      break L4;
                    } else {
                      if (~((rk) this).field_j > ~((rk) this).field_h) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_9_0 = (~((rk) this).field_j < ~((rk) this).field_h ? -1 : (~((rk) this).field_j == ~((rk) this).field_h ? 0 : 1));
                  stackIn_7_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (var5 != 0) {
                    continue L3;
                  } else {
                    L5: {
                      if (stackIn_10_0 > 0) {
                        ((rk) this).field_j = ((rk) this).field_h;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    stackOut_13_0 = var4_int;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var4, "rk.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_13_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                rk.a(true);
                break L1;
              }
            }
            L2: {
              if (param0 < 2) {
                break L2;
              } else {
                if (param0 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (~var7 >= ~var8) {
                          break L5;
                        } else {
                          var9 = param2.charAt(var8);
                          stackOut_12_0 = -1;
                          stackIn_67_0 = stackOut_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          if (var11 != 0) {
                            break L4;
                          } else {
                            L6: {
                              L7: {
                                if (stackIn_13_0 != ~var8) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (var9 == 45) {
                                      var4_int = 1;
                                      if (var11 == 0) {
                                        break L6;
                                      } else {
                                        break L8;
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                  if (var9 != 43) {
                                    break L7;
                                  } else {
                                    if (param3) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L9: {
                                L10: {
                                  L11: {
                                    if (var9 < 48) {
                                      break L11;
                                    } else {
                                      if (var9 <= 57) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var9 < 65) {
                                      break L12;
                                    } else {
                                      if (var9 > 90) {
                                        break L12;
                                      } else {
                                        var9 -= 55;
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var9 < 97) {
                                      break L13;
                                    } else {
                                      if (var9 <= 122) {
                                        var9 -= 87;
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  stackOut_49_0 = 0;
                                  stackIn_50_0 = stackOut_49_0;
                                  return stackIn_50_0 != 0;
                                }
                                var9 -= 48;
                                break L9;
                              }
                              if (~var9 > ~param0) {
                                L14: {
                                  if (var4_int != 0) {
                                    var9 = -var9;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                var10 = var9 + param0 * var6;
                                if (var6 == var10 / param0) {
                                  var5 = 1;
                                  var6 = var10;
                                  break L6;
                                } else {
                                  stackOut_62_0 = 0;
                                  stackIn_63_0 = stackOut_62_0;
                                  return stackIn_63_0 != 0;
                                }
                              } else {
                                stackOut_55_0 = 0;
                                stackIn_56_0 = stackOut_55_0;
                                return stackIn_56_0 != 0;
                              }
                            }
                            var8++;
                            if (var11 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      stackOut_66_0 = var5;
                      stackIn_67_0 = stackOut_66_0;
                      break L4;
                    }
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var4;
            stackOut_68_1 = new StringBuilder().append("rk.A(").append(param0).append(',').append(param1).append(',');
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param2 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L15;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L15;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + param3 + ')');
        }
        return stackIn_67_0 != 0;
    }

    rk() {
        ((rk) this).field_j = 0L;
        ((rk) this).field_h = 0L;
        ((rk) this).field_f = new long[10];
        ((rk) this).field_e = 0;
        ((rk) this).field_i = 0L;
        ((rk) this).field_l = 1;
        try {
            ((rk) this).field_h = System.nanoTime();
            ((rk) this).field_j = System.nanoTime();
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "rk.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = true;
        field_n = new aj(2, 4, 4, 0);
        field_d = new aj(6, 0, 4, 2);
        field_k = "2 of 4";
    }
}
