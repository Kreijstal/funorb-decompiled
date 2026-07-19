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
                  if (-11 > (var2 ^ -1)) {
                    var2 = 0;
                    L3: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        this.field_d[var2] = un.a(this.field_d[var2], un.a(this.field_k[var2], this.field_e[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (-9 >= (var3 ^ -1)) {
                        var3 = 0;
                        L5: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            this.field_f[0] = un.a(this.field_f[0], aj.field_w[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_k[var3] = this.field_a[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                this.field_a[var3] = this.field_f[var3];
                                var4 = 0;
                                var5 = 56;
                                L8: while (true) {
                                  if (var4 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    this.field_a[var3] = un.a(this.field_a[var3], aj.field_t[var4][pg.a(255, (int)(this.field_k[pg.a(-var4 + var3, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var4++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_f[var3] = this.field_a[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        this.field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            this.field_a[var3] = un.a(this.field_a[var3], aj.field_t[var4][pg.a((int)(this.field_f[pg.a(var3 - var4, 7)] >>> var5), 255)]);
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
                this.field_f[var2] = this.field_d[var2];
                this.field_k[var2] = un.a(this.field_e[var2], this.field_d[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_e[var2] = un.a(ct.a(255L, (long)this.field_j[7 + var3]), un.a(ct.a((long)this.field_j[6 + var3] << 497826760, 65280L), un.a(ct.a(255L, (long)this.field_j[var3 - -5]) << -288143920, un.a(un.a(un.a(un.a((long)this.field_j[var3] << -1472861000, ct.a((long)this.field_j[1 + var3], 255L) << 1640223600), ct.a((long)this.field_j[2 + var3], 255L) << 939656424), ct.a((long)this.field_j[var3 + 3], 255L) << -316181664), ct.a((long)this.field_j[4 + var3] << -1446632168, 4278190080L)))));
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
            if (param1 == 17337) {
              L1: {
                var2 = param0.getParameter("username");
                if (var2 == null) {
                  break L1;
                } else {
                  var3 = (CharSequence) ((Object) var2);
                  if (AceOfSkies.a(var3, -119) != 0L) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("wb.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte[] param0, byte param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
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
        int decompiledRegionSelector0 = 0;
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
              this.field_j[this.field_g] = (byte)vo.a((int) this.field_j[this.field_g], 128 >>> pg.a(7, this.field_c));
              this.field_g = this.field_g + 1;
              if (-33 > (this.field_g ^ -1)) {
                L2: while (true) {
                  if (64 <= this.field_g) {
                    this.a((byte) 114);
                    this.field_g = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_g;
                    this.field_g = this.field_g + 1;
                    this.field_j[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (-33 >= (this.field_g ^ -1)) {
                au.a(this.field_h, 0, this.field_j, 32, 32);
                this.a((byte) 107);
                if (param1 == 82) {
                  var4_int = 0;
                  var5 = param2;
                  L4: while (true) {
                    if ((var4_int ^ -1) <= -9) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = this.field_d[var4_int];
                      param0[var5] = (byte)(int)(var6 >>> 1258650744);
                      param0[1 + var5] = (byte)(int)(var6 >>> -1715064144);
                      param0[var5 - -2] = (byte)(int)(var6 >>> 971803944);
                      param0[var5 + 3] = (byte)(int)(var6 >>> 1600824352);
                      param0[var5 + 4] = (byte)(int)(var6 >>> -1910840488);
                      param0[var5 - -5] = (byte)(int)(var6 >>> -1809315248);
                      param0[6 + var5] = (byte)(int)(var6 >>> -2102918904);
                      param0[var5 - -7] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      continue L4;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                fieldTemp$3 = this.field_g;
                this.field_g = this.field_g + 1;
                this.field_j[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("wb.F(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static fn a(boolean param0, String param1, String param2, long param3, boolean param4) {
        RuntimeException var6 = null;
        java.applet.Applet var7 = null;
        ki stackIn_5_0 = null;
        ko stackIn_8_0 = null;
        pm stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ki stackOut_4_0 = null;
        pm stackOut_9_0 = null;
        ko stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                var7 = (java.applet.Applet) null;
                wb.a((java.applet.Applet) null, -75);
                break L1;
              }
            }
            L2: {
              if ((param3 ^ -1L) != -1L) {
                break L2;
              } else {
                if (param1 == null) {
                  break L2;
                } else {
                  stackOut_4_0 = new ki(param1, param2);
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!param0) {
              stackOut_9_0 = new pm(param3, param2);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_7_0 = new ko(param3, param2);
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("wb.G(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fn) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (fn) ((Object) stackIn_8_0);
          } else {
            return (fn) ((Object) stackIn_10_0);
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            this.field_h[var2] = (byte) 0;
        }
        this.field_c = 0;
        this.field_g = 0;
        this.field_j[0] = (byte)param0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            this.field_d[var2] = 0L;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
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
            var7 = 7 & this.field_c;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (0 > var11) {
                L2: while (true) {
                  if (-9L <= (param2 ^ -1L)) {
                    L3: {
                      if ((param2 ^ -1L) < -1L) {
                        var8 = 255 & param1[var5_int] << var6;
                        this.field_j[this.field_g] = (byte)vo.a((int) this.field_j[this.field_g], var8 >>> var7);
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if ((param2 + (long)var7 ^ -1L) > -9L) {
                        this.field_c = (int)((long)this.field_c + param2);
                        break L4;
                      } else {
                        L5: {
                          this.field_g = this.field_g + 1;
                          param2 = param2 - (long)(8 - var7);
                          this.field_c = this.field_c + (-var7 + 8);
                          if (-513 != (this.field_c ^ -1)) {
                            break L5;
                          } else {
                            this.a((byte) 123);
                            this.field_g = 0;
                            this.field_c = 0;
                            break L5;
                          }
                        }
                        this.field_j[this.field_g] = (byte)pg.a(255, var8 << -var7 + 8);
                        this.field_c = this.field_c + (int)param2;
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
                            this.field_j[this.field_g] = (byte)vo.a((int) this.field_j[this.field_g], var8 >>> var7);
                            this.field_c = this.field_c + (8 + -var7);
                            this.field_g = this.field_g + 1;
                            if (-513 != (this.field_c ^ -1)) {
                              break L7;
                            } else {
                              this.a((byte) 109);
                              this.field_c = 0;
                              this.field_g = 0;
                              break L7;
                            }
                          }
                          this.field_j[this.field_g] = (byte)pg.a(255, var8 << 8 + -var7);
                          param2 = param2 - 8L;
                          this.field_c = this.field_c + var7;
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
                var12 = var12 + ((this.field_h[var11] & 255) - -((int)var9 & 255));
                this.field_h[var11] = (byte)var12;
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
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("wb.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
    }

    wb() {
        this.field_g = 0;
        this.field_c = 0;
        this.field_h = new byte[32];
        this.field_e = new long[8];
        this.field_f = new long[8];
        this.field_a = new long[8];
        this.field_d = new long[8];
        this.field_j = new byte[64];
        this.field_k = new long[8];
    }

    static {
        field_b = new char[]{(char)91, (char)93, (char)35};
        nb.a(10536, 50);
    }
}
