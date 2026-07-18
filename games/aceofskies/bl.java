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
            field_g = null;
        }
        field_b = null;
        field_g = null;
    }

    public final String toString() {
        return "" + ((bl) this).field_a;
    }

    final static void c(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == ul.field_r) {
                    break L1;
                  } else {
                    ul.field_r.b((byte) -108);
                    break L1;
                  }
                }
                L2: {
                  if (ii.field_m == null) {
                    break L2;
                  } else {
                    ii.field_m.a((byte) -85);
                    break L2;
                  }
                }
                L3: {
                  if (null != eq.field_e) {
                    {
                      L4: {
                        eq.field_e.a((byte) 106);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (null == wb.field_i) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (wb.field_i.length <= var1_int) {
                        break L6;
                      } else {
                        L8: {
                          if (wb.field_i[var1_int] == null) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw pn.a((Throwable) (Object) var1, "bl.A(" + -18535 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] a(int param0, int param1) {
        try {
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
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_53_0 = null;
            var18 = AceOfSkies.field_G ? 1 : 0;
            var3 = (Object) (Object) ((bl) this).field_f;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 * param0 + 6) <= ((bl) this).field_d.c(param1 ^ -149)) {
                    ((bl) this).field_d.a(true, (long)(param0 * 6));
                    ((bl) this).field_d.a(param1 + -255, 6, s.field_i, 0);
                    var4_int = (param1 & s.field_i[2]) + ((65280 & s.field_i[1] << 8) + (s.field_i[0] << 16 & 16711680));
                    var5 = (255 & s.field_i[5]) + (((255 & s.field_i[3]) << 16) + ((255 & s.field_i[4]) << 8));
                    if (var4_int >= 0) {
                      if (var4_int <= ((bl) this).field_e) {
                        if (var5 > 0) {
                          if (((bl) this).field_f.c(-93) / 520L >= (long)var5) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_50_0 = (byte[]) var6;
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) (Object) stackIn_51_0;
                                stackIn_52_0 = stackOut_51_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L2: {
                                    ((bl) this).field_f.a(true, (long)(var5 * 520));
                                    var9 = -var7 + var4_int;
                                    if (param0 > 65535) {
                                      L3: {
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      var14 = 10;
                                      ((bl) this).field_f.a(param1 ^ 255, var9 - -var14, s.field_i, 0);
                                      var11 = (255 & s.field_i[5]) + (65280 & s.field_i[4] << 8);
                                      var10 = (s.field_i[3] & 255) + (65280 & s.field_i[2] << 8) + (((255 & s.field_i[0]) << 24) + (s.field_i[1] << 16 & 16711680));
                                      var13 = s.field_i[9] & 255;
                                      var12 = (255 & s.field_i[8]) + ((s.field_i[6] << 16 & 16711680) - -(s.field_i[7] << 8 & 65280));
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
                                      ((bl) this).field_f.a(0, var14 + var9, s.field_i, 0);
                                      var10 = (255 & s.field_i[1]) + ((s.field_i[0] & 255) << 8);
                                      var11 = (s.field_i[3] & 255) + (65280 & s.field_i[2] << 8);
                                      var13 = s.field_i[7] & 255;
                                      var12 = (s.field_i[4] << 16 & 16711680) + (((s.field_i[5] & 255) << 8) - -(255 & s.field_i[6]));
                                      break L2;
                                    }
                                  }
                                  if (param0 == var10) {
                                    if (var8 == var11) {
                                      if (var13 == ((bl) this).field_a) {
                                        if (var12 >= 0) {
                                          if ((long)var12 <= ((bl) this).field_f.c(-92) / 520L) {
                                            var15 = var9 + var14;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                var5 = var12;
                                                var8++;
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
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
                                        return (byte[]) (Object) stackIn_39_0;
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
                                  return (byte[]) (Object) stackIn_22_0;
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
                return (byte[]) (Object) stackIn_54_0;
              }
              return stackIn_52_0;
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
        ((bl) this).field_f = null;
        ((bl) this).field_e = 65000;
        ((bl) this).field_d = null;
        try {
            ((bl) this).field_f = param1;
            ((bl) this).field_e = param3;
            ((bl) this).field_a = param0;
            ((bl) this).field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "bl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        Object var8 = null;
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
            if (param1 == 255) {
              break L0;
            } else {
              var8 = null;
              boolean discarded$3 = ((bl) this).a(75, 38, -78, (byte[]) null);
              break L0;
            }
          }
          var5 = (Object) (Object) ((bl) this).field_f;
          synchronized (var5) {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (param0 > ((bl) this).field_e) {
                    break L2;
                  } else {
                    L3: {
                      var6 = this.a(param2, param0, true, param3, 2) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(param2, param0, false, param3, 2) ? 1 : 0;
                        break L3;
                      }
                    }
                    stackOut_9_0 = var6;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_10_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
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
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var1 = new ll[to.field_t];
        var2 = 0;
        L0: while (true) {
          if (to.field_t <= var2) {
            kf.f(1);
            return var1;
          } else {
            var3 = ji.field_b[var2] * ee.field_e[var2];
            var24 = fk.field_a[var2];
            if (!q.field_k[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new ll(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = ud.field_e[pg.a((int) var24[var6], 255)];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var23 = ql.field_p[var2];
              var19 = var23;
              var15 = var19;
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (ll) (Object) new rd(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = vo.a(pg.a(-16777216, var23[var7] << 24), ud.field_e[pg.a(255, (int) var24[var7])]);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static wp a(byte param0, int param1, gk param2, int param3) {
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
          if (tn.a(param2, (byte) -127, param1, param3)) {
            return sq.a(15636);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("bl.B(").append(-123).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ')');
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
              var6_ref2 = (Object) (Object) ((bl) this).field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if (~((bl) this).field_d.c(81) > ~(long)(param0 * 6 + 6)) {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackOut_9_0 = stackIn_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        } else {
                          L2: {
                            ((bl) this).field_d.a(true, (long)(6 * param0));
                            ((bl) this).field_d.a(0, 6, s.field_i, 0);
                            var7_int = (255 & s.field_i[5]) + (65280 & s.field_i[4] << 8) + (s.field_i[3] << 16 & 16711680);
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (~(((bl) this).field_f.c(116) / 520L) > ~(long)var7_int) {
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
                          return stackIn_16_0 != 0;
                        }
                      } else {
                        var7_int = (int)((519L + ((bl) this).field_f.c(-107)) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    s.field_i[4] = (byte)(var7_int >> 8);
                    s.field_i[0] = (byte)(param1 >> 16);
                    s.field_i[1] = (byte)(param1 >> 8);
                    s.field_i[3] = (byte)(var7_int >> 16);
                    s.field_i[2] = (byte)param1;
                    s.field_i[5] = (byte)var7_int;
                    ((bl) this).field_d.a(true, (long)(6 * param0));
                    ((bl) this).field_d.a(6, s.field_i, 0, 120);
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
                                ((bl) this).field_f.a(true, (long)(var7_int * 520));
                                if (param0 > 65535) {
                                  try {
                                    L7: {
                                      ((bl) this).field_f.a(0, 10, s.field_i, 0);
                                      decompiledRegionSelector1 = 0;
                                      break L7;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var10 = ((s.field_i[6] & 255) << 16) + (((s.field_i[7] & 255) << 8) - -(s.field_i[8] & 255));
                                    var12 = (s.field_i[4] << 8 & 65280) + (255 & s.field_i[5]);
                                    var13 = s.field_i[9] & 255;
                                    var11 = (-16777216 & s.field_i[0] << 24) + ((255 & s.field_i[1]) << 16) - (-(s.field_i[2] << 8 & 65280) + -(255 & s.field_i[3]));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((bl) this).field_f.a(0, 8, s.field_i, 0);
                                      decompiledRegionSelector0 = 0;
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var12 = (65280 & s.field_i[2] << 8) + (255 & s.field_i[3]);
                                    var13 = s.field_i[7] & 255;
                                    var10 = (s.field_i[6] & 255) + ((s.field_i[4] & 255) << 16) + (65280 & s.field_i[5] << 8);
                                    var11 = (65280 & s.field_i[0] << 8) + (s.field_i[1] & 255);
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
                                    if (var13 != ((bl) this).field_a) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if ((long)var10 <= ((bl) this).field_f.c(121) / 520L) {
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
                                      return stackIn_42_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_34_0 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackOut_35_0 = stackIn_35_0;
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0 != 0;
                            }
                          }
                          L13: {
                            if (0 == var10) {
                              L14: {
                                var10 = (int)((519L + ((bl) this).field_f.c(64)) / 520L);
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
                                s.field_i[0] = (byte)(param0 >> 24);
                                s.field_i[5] = (byte)var9;
                                s.field_i[7] = (byte)(var10 >> 8);
                                s.field_i[2] = (byte)(param0 >> 8);
                                s.field_i[3] = (byte)param0;
                                s.field_i[6] = (byte)(var10 >> 16);
                                s.field_i[4] = (byte)(var9 >> 8);
                                s.field_i[1] = (byte)(param0 >> 16);
                                s.field_i[9] = (byte)((bl) this).field_a;
                                ((bl) this).field_f.a(true, (long)(var7_int * 520));
                                ((bl) this).field_f.a(10, s.field_i, 0, 108);
                                var11 = param1 - var8;
                                if (510 >= var11) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              ((bl) this).field_f.a(var11, param3, var8, 105);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                s.field_i[1] = (byte)param0;
                                s.field_i[2] = (byte)(var9 >> 8);
                                s.field_i[4] = (byte)(var10 >> 16);
                                s.field_i[0] = (byte)(param0 >> 8);
                                s.field_i[6] = (byte)var10;
                                s.field_i[5] = (byte)(var10 >> 8);
                                s.field_i[7] = (byte)((bl) this).field_a;
                                s.field_i[3] = (byte)var9;
                                ((bl) this).field_f.a(true, (long)(520 * var7_int));
                                ((bl) this).field_f.a(8, s.field_i, 0, 84);
                                var11 = -var8 + param1;
                                if (512 < var11) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((bl) this).field_f.a(var11, param3, var8, 103);
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
                return stackIn_64_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) var6_ref;
                stackOut_69_1 = new StringBuilder().append("bl.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param3 == null) {
                  stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                  stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L19;
                } else {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L19;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + 2 + ')');
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
