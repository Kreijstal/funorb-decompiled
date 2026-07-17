/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private int field_a;
    static String field_h;
    private long[] field_c;
    private long[] field_f;
    private byte[] field_k;
    static int[] field_j;
    private long[] field_l;
    private long[] field_d;
    private long[] field_i;
    static String field_e;
    private byte[] field_g;
    private int field_b;

    public static void a() {
        field_j = null;
        field_e = null;
        field_h = null;
    }

    final static byte[] a(CharSequence param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_68_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_68_0 = (byte[]) var3;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (var5 <= 0) {
                        break L4;
                      } else {
                        if (128 > var5) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (160 > var5) {
                        break L5;
                      } else {
                        if (var5 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (8364 != var5) {
                      if (var5 == 8218) {
                        var3[var4] = (byte) -126;
                        break L2;
                      } else {
                        if (var5 != 402) {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L2;
                            } else {
                              if (var5 != 8224) {
                                if (8225 != var5) {
                                  if (710 == var5) {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (8249 == var5) {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        } else {
                                          if (338 == var5) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (var5 != 381) {
                                              if (8216 == var5) {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              } else {
                                                if (var5 == 8217) {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (8220 != var5) {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (8226 != var5) {
                                                        if (var5 != 8211) {
                                                          if (var5 != 8212) {
                                                            if (var5 != 732) {
                                                              if (var5 != 8482) {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 8250) {
                                                                    if (339 != var5) {
                                                                      if (var5 != 382) {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                }
                              } else {
                                var3[var4] = (byte) -122;
                                break L2;
                              }
                            }
                          }
                        } else {
                          var3[var4] = (byte) -125;
                          break L2;
                        }
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      break L2;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L2;
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var2;
            stackOut_70_1 = new StringBuilder().append("dd.A(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L6;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + -127 + 41);
        }
        return stackIn_69_0;
    }

    final void a(long param0, byte param1, byte[] param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var13 = Main.field_T;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -((int)param0 & 7) & 7;
            var7 = ((dd) this).field_b & 7;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: {
                  if (param1 > 109) {
                    break L2;
                  } else {
                    ((dd) this).field_k = null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (param0 <= 8L) {
                    L4: {
                      if (0L >= param0) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = 255 & param2[var5_int] << var6;
                        ((dd) this).field_k[((dd) this).field_a] = (byte)fj.a((int) ((dd) this).field_k[((dd) this).field_a], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if ((long)var7 + param0 < 8L) {
                        ((dd) this).field_b = (int)((long)((dd) this).field_b + param0);
                        break L5;
                      } else {
                        L6: {
                          ((dd) this).field_a = ((dd) this).field_a + 1;
                          param0 = param0 - (long)(-var7 + 8);
                          ((dd) this).field_b = ((dd) this).field_b + (8 + -var7);
                          if (((dd) this).field_b == 512) {
                            this.a(-9);
                            ((dd) this).field_b = 0;
                            ((dd) this).field_a = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((dd) this).field_k[((dd) this).field_a] = (byte)bc.a(var8 << -var7 + 8, 255);
                        ((dd) this).field_b = ((dd) this).field_b + (int)param0;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int + 1]) >>> 8 - var6;
                      if (0 > var8) {
                        break L7;
                      } else {
                        if (256 > var8) {
                          L8: {
                            ((dd) this).field_k[((dd) this).field_a] = (byte)fj.a((int) ((dd) this).field_k[((dd) this).field_a], var8 >>> var7);
                            ((dd) this).field_b = ((dd) this).field_b + (-var7 + 8);
                            ((dd) this).field_a = ((dd) this).field_a + 1;
                            if (512 != ((dd) this).field_b) {
                              break L8;
                            } else {
                              this.a(-9);
                              ((dd) this).field_b = 0;
                              ((dd) this).field_a = 0;
                              break L8;
                            }
                          }
                          ((dd) this).field_k[((dd) this).field_a] = (byte)bc.a(var8 << 8 + -var7, 255);
                          var5_int++;
                          param0 = param0 - 8L;
                          ((dd) this).field_b = ((dd) this).field_b + var7;
                          continue L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & (int)var9) + (((dd) this).field_g[var11] & 255));
                ((dd) this).field_g[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("dd.F(").append(param0).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final void a(int param0, byte[] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Main.field_T;
        try {
          L0: {
            L1: {
              ((dd) this).field_k[((dd) this).field_a] = (byte)fj.a((int) ((dd) this).field_k[((dd) this).field_a], 128 >>> bc.a(((dd) this).field_b, 7));
              ((dd) this).field_a = ((dd) this).field_a + 1;
              if (((dd) this).field_a <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((dd) this).field_a >= 64) {
                    this.a(-9);
                    ((dd) this).field_a = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((dd) this).field_a;
                    ((dd) this).field_a = ((dd) this).field_a + 1;
                    ((dd) this).field_k[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (((dd) this).field_a >= 32) {
                L4: {
                  if (param0 == 5319) {
                    break L4;
                  } else {
                    ((dd) this).field_a = 123;
                    break L4;
                  }
                }
                og.a(((dd) this).field_g, 0, ((dd) this).field_k, 32, 32);
                this.a(-9);
                var4_int = 0;
                var5 = param2;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((dd) this).field_f[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> 56);
                    param1[var5 + 1] = (byte)(int)(var6 >>> 48);
                    param1[2 + var5] = (byte)(int)(var6 >>> 40);
                    param1[3 + var5] = (byte)(int)(var6 >>> 32);
                    param1[var5 + 4] = (byte)(int)(var6 >>> 24);
                    param1[var5 - -5] = (byte)(int)(var6 >>> 16);
                    param1[var5 - -6] = (byte)(int)(var6 >>> 8);
                    param1[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((dd) this).field_a;
                ((dd) this).field_a = ((dd) this).field_a + 1;
                ((dd) this).field_k[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("dd.D(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        for (var2 = 0; var2 < 32; var2++) {
            ((dd) this).field_g[var2] = (byte) 0;
        }
        ((dd) this).field_b = 0;
        ((dd) this).field_k[0] = (byte) 0;
        ((dd) this).field_a = 0;
        if (param0 <= 20) {
            return;
        }
        for (var2 = 0; var2 < 8; var2++) {
            ((dd) this).field_f[var2] = 0L;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Main.field_T;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    L3: {
                      if (param0 == -9) {
                        break L3;
                      } else {
                        this.a(-54);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((dd) this).field_f[var2] = ji.a(((dd) this).field_f[var2], ji.a(((dd) this).field_i[var2], ((dd) this).field_d[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if (var3 >= 8) {
                            ((dd) this).field_c[0] = ji.a(((dd) this).field_c[0], hj.field_o[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((dd) this).field_i[var3] = ((dd) this).field_l[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((dd) this).field_l[var3] = ((dd) this).field_c[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((dd) this).field_l[var3] = ji.a(((dd) this).field_l[var3], hj.field_k[var7][bc.a((int)(((dd) this).field_i[bc.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((dd) this).field_c[var3] = ((dd) this).field_l[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((dd) this).field_l[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((dd) this).field_l[var3] = ji.a(((dd) this).field_l[var3], hj.field_k[var4][bc.a((int)(((dd) this).field_c[bc.a(var3 + -var4, 7)] >>> var5), 255)]);
                            var4++;
                            var5 -= 8;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((dd) this).field_c[var2] = ((dd) this).field_f[var2];
                ((dd) this).field_i[var2] = ji.a(((dd) this).field_d[var2], ((dd) this).field_f[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((dd) this).field_d[var2] = ji.a(rl.a(255L, (long)((dd) this).field_k[var3 + 7]), ji.a(rl.a((long)((dd) this).field_k[6 + var3], 255L) << 8, ji.a(ji.a(rl.a(4278190080L, (long)((dd) this).field_k[var3 - -4] << 24), ji.a(ji.a(ji.a((long)((dd) this).field_k[var3] << 56, rl.a(71776119061217280L, (long)((dd) this).field_k[var3 + 1] << 48)), rl.a(255L, (long)((dd) this).field_k[var3 - -2]) << 40), rl.a(255L, (long)((dd) this).field_k[3 + var3]) << 32)), rl.a((long)((dd) this).field_k[var3 + 5] << 16, 16711680L))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    dd() {
        ((dd) this).field_f = new long[8];
        ((dd) this).field_a = 0;
        ((dd) this).field_k = new byte[64];
        ((dd) this).field_d = new long[8];
        ((dd) this).field_i = new long[8];
        ((dd) this).field_c = new long[8];
        ((dd) this).field_g = new byte[32];
        ((dd) this).field_b = 0;
        ((dd) this).field_l = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = "Login/Create Account";
    }
}
