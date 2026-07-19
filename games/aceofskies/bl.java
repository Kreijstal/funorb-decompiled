/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl {
    static int field_c;
    private int field_a;
    private int field_e;
    static String field_g;
    private gh field_f;
    private gh field_d;
    static pa[] field_b;

    public static void d(int param0) {
        if (param0 >= -121) {
            field_g = (String) null;
        }
        field_b = null;
        field_g = null;
    }

    public final String toString() {
        return "" + this.field_a;
    }

    final static void c(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param0 == -18535) {
                    break L1;
                  } else {
                    field_g = (String) null;
                    break L1;
                  }
                }
                L2: {
                  if (null == ul.field_r) {
                    break L2;
                  } else {
                    ul.field_r.b((byte) -108);
                    break L2;
                  }
                }
                L3: {
                  if (ii.field_m == null) {
                    break L3;
                  } else {
                    ii.field_m.a((byte) -85);
                    break L3;
                  }
                }
                L4: {
                  if (null != eq.field_e) {
                    try {
                      L5: {
                        eq.field_e.a((byte) 106);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (null == wb.field_i) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (wb.field_i.length <= var1_int) {
                        break L7;
                      } else {
                        if (wb.field_i[var1_int] != null) {
                          try {
                            L9: {
                              wb.field_i[var1_int].a((byte) 106);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          var1_int++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw pn.a((Throwable) ((Object) var1), "bl.A(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$1 = 0;
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            byte[] var6 = null;
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_39_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_53_0 = null;
            var18 = AceOfSkies.field_G ? 1 : 0;
            var3 = this.field_f;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 * param0 + 6) <= this.field_d.c(param1 ^ -149)) {
                    this.field_d.a(true, (long)(param0 * 6));
                    this.field_d.a(param1 + -255, 6, s.field_i, 0);
                    var4_int = (param1 & s.field_i[2]) + ((65280 & s.field_i[1] << 2095501992) + (s.field_i[0] << -1301839664 & 16711680));
                    var5 = (255 & s.field_i[5]) + (((255 & s.field_i[3]) << -759442320) + ((255 & s.field_i[4]) << -1358287576));
                    if ((var4_int ^ -1) <= -1) {
                      if (var4_int <= this.field_e) {
                        if ((var5 ^ -1) < -1) {
                          if (this.field_f.c(-93) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_50_0 = (byte[]) (var6);
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) ((Object) stackIn_51_0);
                                stackIn_52_0 = stackOut_51_0;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    this.field_f.a(true, (long)(var5 * 520));
                                    var9 = -var7 + var4_int;
                                    if (-65536 > (param0 ^ -1)) {
                                      L3: {
                                        if (-511 > (var9 ^ -1)) {
                                          var9 = 510;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      var14 = 10;
                                      this.field_f.a(param1 ^ 255, var9 - -var14, s.field_i, 0);
                                      var11 = (255 & s.field_i[5]) + (65280 & s.field_i[4] << -300694392);
                                      var10 = (s.field_i[3] & 255) + (65280 & s.field_i[2] << -578691512) + (((255 & s.field_i[0]) << 1802446904) + (s.field_i[1] << 671733232 & 16711680));
                                      var13 = s.field_i[9] & 255;
                                      var12 = (255 & s.field_i[8]) + ((s.field_i[6] << -1580401296 & 16711680) - -(s.field_i[7] << -660295480 & 65280));
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 8;
                                        if (512 < var9) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      this.field_f.a(0, var14 + var9, s.field_i, 0);
                                      var10 = (255 & s.field_i[1]) + ((s.field_i[0] & 255) << -384019064);
                                      var11 = (s.field_i[3] & 255) + (65280 & s.field_i[2] << 1993913736);
                                      var13 = s.field_i[7] & 255;
                                      var12 = (s.field_i[4] << 826308880 & 16711680) + (((s.field_i[5] & 255) << -1556359160) - -(255 & s.field_i[6]));
                                      break L2;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == this.field_a) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if ((long)var12 <= this.field_f.c(-92) / 520L) {
                                            var15 = var9 + var14;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                var5 = var12;
                                                var8++;
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = s.field_i[var16];
                                                var16++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        stackOut_37_0 = null;
                                        stackIn_38_0 = stackOut_37_0;
                                        stackOut_38_0 = stackIn_38_0;
                                        stackIn_39_0 = stackOut_38_0;
                                        decompiledRegionSelector0 = 1;
                                        break L0;
                                      }
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    return null;
                                  }
                                } else {
                                  stackOut_20_0 = null;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackOut_21_0 = stackIn_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  decompiledRegionSelector0 = 0;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_53_0 = null;
                stackIn_54_0 = stackOut_53_0;
                return (byte[]) ((Object) stackIn_54_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_22_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_39_0);
                } else {
                  return stackIn_52_0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0) {
        if (param0 <= 55) {
            bl.d(54);
        }
        return (int)(1000000000L / ld.field_b);
    }

    bl(int param0, gh param1, gh param2, int param3) {
        this.field_f = null;
        this.field_e = 65000;
        this.field_d = null;
        try {
            this.field_f = param1;
            this.field_e = param3;
            this.field_a = param0;
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        boolean discarded$4 = false;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        byte[] var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 255) {
                break L1;
              } else {
                var8 = (byte[]) null;
                discarded$4 = this.a(75, 38, -78, (byte[]) null);
                break L1;
              }
            }
            var5 = this.field_f;
            synchronized (var5) {
              L2: {
                L3: {
                  if (param0 < 0) {
                    break L3;
                  } else {
                    if (param0 > this.field_e) {
                      break L3;
                    } else {
                      L4: {
                        var6 = this.a(param2, param0, true, param3, 2) ? 1 : 0;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(param2, param0, false, param3, 2) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackOut_9_0 = var6;
                      stackIn_10_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5_ref);
            stackOut_13_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static ll[] b(int param0) {
        ll[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var21 = null;
        int[] var22 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var1 = new ll[to.field_t];
        var2 = 0;
        L0: while (true) {
          if (to.field_t <= var2) {
            if (param0 > -79) {
              return (ll[]) null;
            } else {
              kf.f(1);
              return var1;
            }
          } else {
            var3 = ji.field_b[var2] * ee.field_e[var2];
            var21 = fk.field_a[var2];
            if (!q.field_k[var2]) {
              var10 = new int[var3];
              var22 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new ll(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = ud.field_e[pg.a((int) var21[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var15 = ql.field_p[var2];
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var17 = new int[var3];
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (ll) ((Object) new rd(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var17));
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = vo.a(pg.a(-16777216, var15[var7] << -1927948328), ud.field_e[pg.a(255, (int) var21[var7])]);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static wp a(byte param0, int param1, gk param2, int param3) {
        int discarded$2 = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
            if (param0 <= -89) {
              break L0;
            } else {
              discarded$2 = bl.a(63);
              break L0;
            }
          }
          if (tn.a(param2, (byte) -127, param1, param3)) {
            return sq.a(15636);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("bl.B(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final boolean a(int param0, int param1, boolean param2, byte[] param3, int param4) {
        try {
            Object var6 = null;
            RuntimeException var6_ref = null;
            Object var6_ref2 = null;
            IOException var7 = null;
            int var7_int = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_66_0 = 0;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            String stackIn_72_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_65_0 = 0;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var16 = AceOfSkies.field_G ? 1 : 0;
            try {
              var6_ref2 = this.field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if ((this.field_d.c(param4 + 79) ^ -1L) > ((long)(param0 * 6 + 6) ^ -1L)) {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackOut_9_0 = stackIn_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_d.a(true, (long)(6 * param0));
                            this.field_d.a(0, 6, s.field_i, 0);
                            var7_int = (255 & s.field_i[5]) + (65280 & s.field_i[4] << 1681713832) + (s.field_i[3] << -1151027824 & 16711680);
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if ((this.field_f.c(116) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackOut_15_0 = stackIn_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((519L + this.field_f.c(param4 + -109)) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    s.field_i[4] = (byte)(var7_int >> -1398234456);
                    s.field_i[0] = (byte)(param1 >> 1255800624);
                    s.field_i[1] = (byte)(param1 >> -231360280);
                    s.field_i[3] = (byte)(var7_int >> -779111344);
                    s.field_i[param4] = (byte)param1;
                    s.field_i[5] = (byte)var7_int;
                    this.field_d.a(true, (long)(6 * param0));
                    this.field_d.a(6, s.field_i, 0, 120);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param1 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param2) {
                              break L5;
                            } else {
                              L6: {
                                this.field_f.a(true, (long)(var7_int * 520));
                                if (param0 > 65535) {
                                  try {
                                    L7: {
                                      this.field_f.a(0, 10, s.field_i, 0);
                                      decompiledRegionSelector0 = 0;
                                      break L7;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var10 = ((s.field_i[6] & 255) << -522140272) + (((s.field_i[7] & 255) << 145211560) - -(s.field_i[8] & 255));
                                    var12 = (s.field_i[4] << -466228440 & 65280) + (255 & s.field_i[5]);
                                    var13 = s.field_i[9] & 255;
                                    var11 = (-16777216 & s.field_i[0] << 566083640) + ((255 & s.field_i[1]) << -365370032) - (-(s.field_i[2] << 561057288 & 65280) + -(255 & s.field_i[3]));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_f.a(0, 8, s.field_i, 0);
                                      decompiledRegionSelector1 = 0;
                                      break L9;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var12 = (65280 & s.field_i[2] << -408984152) + (255 & s.field_i[3]);
                                    var13 = s.field_i[7] & 255;
                                    var10 = (s.field_i[6] & 255) + ((s.field_i[4] & 255) << -121613552) + (65280 & s.field_i[5] << 472341992);
                                    var11 = (65280 & s.field_i[0] << 1590782408) + (s.field_i[1] & 255);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param0 != var11) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (var13 != this.field_a) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (-1 < (var10 ^ -1)) {
                                          break L12;
                                        } else {
                                          if ((long)var10 <= this.field_f.c(121) / 520L) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackOut_41_0 = stackIn_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackOut_34_0 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackOut_35_0 = stackIn_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L13: {
                            if (0 == var10) {
                              L14: {
                                var10 = (int)((519L + this.field_f.c(64)) / 520L);
                                param2 = false;
                                if (var10 == 0) {
                                  var10++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var7_int == var10) {
                                var10++;
                                break L13;
                              } else {
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (512 < param1 + -var8) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (65535 < param0) {
                              L17: {
                                s.field_i[8] = (byte)var10;
                                s.field_i[0] = (byte)(param0 >> 290647224);
                                s.field_i[5] = (byte)var9;
                                s.field_i[7] = (byte)(var10 >> 156680840);
                                s.field_i[2] = (byte)(param0 >> 1809738472);
                                s.field_i[3] = (byte)param0;
                                s.field_i[6] = (byte)(var10 >> 1941027152);
                                s.field_i[4] = (byte)(var9 >> -1959096696);
                                s.field_i[1] = (byte)(param0 >> 1863668240);
                                s.field_i[9] = (byte)this.field_a;
                                this.field_f.a(true, (long)(var7_int * 520));
                                this.field_f.a(10, s.field_i, 0, 108);
                                var11 = param1 - var8;
                                if (510 >= var11) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              this.field_f.a(var11, param3, var8, 105);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                s.field_i[1] = (byte)param0;
                                s.field_i[2] = (byte)(var9 >> -874853944);
                                s.field_i[4] = (byte)(var10 >> -1667994064);
                                s.field_i[0] = (byte)(param0 >> 1937914056);
                                s.field_i[6] = (byte)var10;
                                s.field_i[5] = (byte)(var10 >> 816137000);
                                s.field_i[7] = (byte)this.field_a;
                                s.field_i[3] = (byte)var9;
                                this.field_f.a(true, (long)(520 * var7_int));
                                this.field_f.a(8, s.field_i, 0, 84);
                                var11 = -var8 + param1;
                                if (512 < var11) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_f.a(var11, param3, var8, param4 ^ 101);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      stackOut_62_0 = 1;
                      stackIn_63_0 = stackOut_62_0;
                      stackOut_63_0 = stackIn_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_65_0 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  return stackIn_66_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_10_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_16_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_42_0 != 0;
                      } else {
                        return stackIn_64_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) (var6_ref);
                stackOut_69_1 = new StringBuilder().append("bl.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param3 == null) {
                  stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                  stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L19;
                } else {
                  stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L19;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
