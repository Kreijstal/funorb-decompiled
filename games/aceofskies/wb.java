/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static char[] field_b;
    private int field_g;
    private long[] field_e;
    private int field_c;
    private long[] field_d;
    static gh[] field_i;
    private byte[] field_h;
    private long[] field_f;
    private byte[] field_j;
    private long[] field_a;
    private long[] field_k;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        var4 = 116 % ((param0 - 75) / 32);
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((wb) this).field_d[var2] = un.a(((wb) this).field_d[var2], un.a(((wb) this).field_k[var2], ((wb) this).field_e[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L5: while (true) {
                          if (var3 >= 8) {
                            ((wb) this).field_f[0] = un.a(((wb) this).field_f[0], aj.field_w[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((wb) this).field_k[var3] = ((wb) this).field_a[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((wb) this).field_a[var3] = ((wb) this).field_f[var3];
                                var4 = 0;
                                var5 = 56;
                                L8: while (true) {
                                  if (var4 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((wb) this).field_a[var3] = un.a(((wb) this).field_a[var3], aj.field_t[var4][pg.a(255, (int)(((wb) this).field_k[pg.a(-var4 + var3, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var4++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((wb) this).field_f[var3] = ((wb) this).field_a[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((wb) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((wb) this).field_a[var3] = un.a(((wb) this).field_a[var3], aj.field_t[var4][pg.a((int)(((wb) this).field_f[pg.a(var3 - var4, 7)] >>> var5), 255)]);
                            var5 -= 8;
                            var4++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((wb) this).field_f[var2] = ((wb) this).field_d[var2];
                ((wb) this).field_k[var2] = un.a(((wb) this).field_e[var2], ((wb) this).field_d[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((wb) this).field_e[var2] = un.a(ct.a(255L, (long)((wb) this).field_j[7 + var3]), un.a(ct.a((long)((wb) this).field_j[6 + var3] << 8, 65280L), un.a(ct.a(255L, (long)((wb) this).field_j[var3 - -5]) << 16, un.a(un.a(un.a(un.a((long)((wb) this).field_j[var3] << 56, ct.a((long)((wb) this).field_j[1 + var3], 255L) << 48), ct.a((long)((wb) this).field_j[2 + var3], 255L) << 40), ct.a((long)((wb) this).field_j[var3 + 3], 255L) << 32), ct.a((long)((wb) this).field_j[4 + var3] << 24, 4278190080L)))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (AceOfSkies.a(var3, -119) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("wb.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 17337 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((wb) this).field_j[((wb) this).field_g] = (byte)vo.a((int) ((wb) this).field_j[((wb) this).field_g], 128 >>> pg.a(7, ((wb) this).field_c));
              ((wb) this).field_g = ((wb) this).field_g + 1;
              if (((wb) this).field_g > 32) {
                L2: while (true) {
                  if (64 <= ((wb) this).field_g) {
                    this.a((byte) 114);
                    ((wb) this).field_g = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((wb) this).field_g;
                    ((wb) this).field_g = ((wb) this).field_g + 1;
                    ((wb) this).field_j[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((wb) this).field_g >= 32) {
                au.a(((wb) this).field_h, 0, ((wb) this).field_j, 32, 32);
                this.a((byte) 107);
                if (param1 == 82) {
                  var4_int = 0;
                  var5 = param2;
                  L4: while (true) {
                    if (var4_int >= 8) {
                      break L0;
                    } else {
                      var6 = ((wb) this).field_d[var4_int];
                      param0[var5] = (byte)(int)(var6 >>> 56);
                      param0[1 + var5] = (byte)(int)(var6 >>> 48);
                      param0[var5 - -2] = (byte)(int)(var6 >>> 40);
                      param0[var5 + 3] = (byte)(int)(var6 >>> 32);
                      param0[var5 + 4] = (byte)(int)(var6 >>> 24);
                      param0[var5 - -5] = (byte)(int)(var6 >>> 16);
                      param0[6 + var5] = (byte)(int)(var6 >>> 8);
                      param0[var5 - -7] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                int fieldTemp$3 = ((wb) this).field_g;
                ((wb) this).field_g = ((wb) this).field_g + 1;
                ((wb) this).field_j[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("wb.F(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static fn a(boolean param0, String param1, String param2, long param3, boolean param4) {
        RuntimeException var6 = null;
        ki stackIn_3_0 = null;
        ko stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ki stackOut_2_0 = null;
        ko stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param3 != 0L) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  stackOut_2_0 = new ki(param1, param2);
                  stackIn_3_0 = stackOut_2_0;
                  return (fn) (Object) stackIn_3_0;
                }
              }
            }
            stackOut_4_0 = new ko(param3, param2);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("wb.G(").append(false).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + true + ')');
        }
        return (fn) (Object) stackIn_5_0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            ((wb) this).field_h[var2] = (byte) 0;
        }
        ((wb) this).field_c = 0;
        ((wb) this).field_g = 0;
        ((wb) this).field_j[0] = (byte)param0;
        for (var2 = 0; var2 < 8; var2++) {
            ((wb) this).field_d[var2] = 0L;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_b = null;
    }

    final void a(int param0, byte[] param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param0 - ((int)param2 & 7) & 7;
            var7 = 7 & ((wb) this).field_c;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (0 > var11) {
                L2: while (true) {
                  if (param2 <= 8L) {
                    L3: {
                      if (param2 > 0L) {
                        var8 = 255 & param1[var5_int] << var6;
                        ((wb) this).field_j[((wb) this).field_g] = (byte)vo.a((int) ((wb) this).field_j[((wb) this).field_g], var8 >>> var7);
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (param2 + (long)var7 < 8L) {
                        ((wb) this).field_c = (int)((long)((wb) this).field_c + param2);
                        break L4;
                      } else {
                        L5: {
                          ((wb) this).field_g = ((wb) this).field_g + 1;
                          param2 = param2 - (long)(8 - var7);
                          ((wb) this).field_c = ((wb) this).field_c + (-var7 + 8);
                          if (((wb) this).field_c != 512) {
                            break L5;
                          } else {
                            this.a((byte) 123);
                            ((wb) this).field_g = 0;
                            ((wb) this).field_c = 0;
                            break L5;
                          }
                        }
                        ((wb) this).field_j[((wb) this).field_g] = (byte)pg.a(255, var8 << -var7 + 8);
                        ((wb) this).field_c = ((wb) this).field_c + (int)param2;
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = param1[var5_int] << var6 & 255 | (255 & param1[var5_int + 1]) >>> 8 - var6;
                      if (0 > var8) {
                        break L6;
                      } else {
                        if (var8 < 256) {
                          L7: {
                            ((wb) this).field_j[((wb) this).field_g] = (byte)vo.a((int) ((wb) this).field_j[((wb) this).field_g], var8 >>> var7);
                            ((wb) this).field_c = ((wb) this).field_c + (8 + -var7);
                            ((wb) this).field_g = ((wb) this).field_g + 1;
                            if (((wb) this).field_c != 512) {
                              break L7;
                            } else {
                              this.a((byte) 109);
                              ((wb) this).field_c = 0;
                              ((wb) this).field_g = 0;
                              break L7;
                            }
                          }
                          ((wb) this).field_j[((wb) this).field_g] = (byte)pg.a(255, var8 << 8 + -var7);
                          param2 = param2 - 8L;
                          ((wb) this).field_c = ((wb) this).field_c + var7;
                          var5_int++;
                          continue L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((((wb) this).field_h[var11] & 255) - -((int)var9 & 255));
                ((wb) this).field_h[var11] = (byte)var12;
                var9 = var9 >>> 8;
                var12 = var12 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("wb.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ')');
        }
    }

    wb() {
        ((wb) this).field_g = 0;
        ((wb) this).field_c = 0;
        ((wb) this).field_h = new byte[32];
        ((wb) this).field_e = new long[8];
        ((wb) this).field_f = new long[8];
        ((wb) this).field_a = new long[8];
        ((wb) this).field_d = new long[8];
        ((wb) this).field_j = new byte[64];
        ((wb) this).field_k = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[]{'[', ']', '#'};
        nb.a(10536, 50);
    }
}
