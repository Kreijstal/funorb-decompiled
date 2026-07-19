/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jh {
    private sk field_d;
    private int field_a;
    private int field_b;
    private sk field_c;

    final boolean a(byte[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        kj var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var5 = this.field_d;
            synchronized (var5) {
              L1: {
                L2: {
                  if (0 > param3) {
                    break L2;
                  } else {
                    if (param3 <= this.field_a) {
                      L3: {
                        if (param1 == -53) {
                          break L3;
                        } else {
                          var8 = (kj) null;
                          jh.a((java.awt.Component) null, (d) null, false, (kj) null, false, -103);
                          break L3;
                        }
                      }
                      L4: {
                        var6 = this.a(255, param3, param2, param0, true) ? 1 : 0;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(255, param3, param2, param0, false) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackOut_8_0 = var6;
                      stackIn_9_0 = stackOut_8_0;
                      break L1;
                    } else {
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
            stackOut_12_0 = (RuntimeException) (var5_ref);
            stackOut_12_1 = new StringBuilder().append("jh.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final byte[] a(int param0, byte param1) {
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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_55_0 = null;
            var18 = Geoblox.field_C;
            var3 = this.field_d;
            synchronized (var3) {
              try {
                L0: {
                  if ((this.field_c.a((byte) 46) ^ -1L) <= ((long)(param0 * 6 + 6) ^ -1L)) {
                    L1: {
                      if (param1 <= -14) {
                        break L1;
                      } else {
                        this.field_d = (sk) null;
                        break L1;
                      }
                    }
                    this.field_c.a(-128, (long)(6 * param0));
                    this.field_c.a(dj.field_F, 6, 0, 9868);
                    var4_int = (dj.field_F[2] & 255) + (((255 & dj.field_F[0]) << 381092272) + (dj.field_F[1] << -50660216 & 65280));
                    var5 = (dj.field_F[3] << 1866970928 & 16711680) + (65280 & dj.field_F[4] << 1639129128) + (255 & dj.field_F[5]);
                    if (-1 >= (var4_int ^ -1)) {
                      if (this.field_a >= var4_int) {
                        if (var5 > 0) {
                          if ((long)var5 <= this.field_d.a((byte) 46) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_52_0 = (byte[]) (var6);
                                stackIn_53_0 = stackOut_52_0;
                                stackOut_53_0 = (byte[]) ((Object) stackIn_53_0);
                                stackIn_54_0 = stackOut_53_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (-1 != (var5 ^ -1)) {
                                  L3: {
                                    this.field_d.a(0, (long)(520 * var5));
                                    var9 = -var7 + var4_int;
                                    if (65535 < param0) {
                                      L4: {
                                        if (510 < var9) {
                                          var9 = 510;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      this.field_d.a(dj.field_F, var9 + var14, 0, 9868);
                                      var10 = (255 & dj.field_F[3]) + ((65280 & dj.field_F[2] << -1174844312) + (-16777216 & dj.field_F[0] << 1123359992) - -(16711680 & dj.field_F[1] << -246972592));
                                      var11 = (255 & dj.field_F[5]) + (65280 & dj.field_F[4] << -1686599576);
                                      var13 = dj.field_F[9] & 255;
                                      var12 = ((dj.field_F[7] & 255) << -1445223224) + ((16711680 & dj.field_F[6] << -963100496) - -(dj.field_F[8] & 255));
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 8;
                                        if (-513 > (var9 ^ -1)) {
                                          var9 = 512;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      this.field_d.a(dj.field_F, var9 - -var14, 0, 9868);
                                      var12 = (255 & dj.field_F[6]) + (((dj.field_F[4] & 255) << -518737456) - -((255 & dj.field_F[5]) << 864422408));
                                      var11 = (255 & dj.field_F[3]) + (dj.field_F[2] << -1610561560 & 65280);
                                      var13 = 255 & dj.field_F[7];
                                      var10 = (dj.field_F[1] & 255) + ((dj.field_F[0] & 255) << 1279629672);
                                      break L3;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var11 == var8) {
                                      if (this.field_b == var13) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if (this.field_d.a((byte) 46) / 520L >= (long)var12) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = dj.field_F[var16];
                                                var16++;
                                                continue L6;
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
                                } else {
                                  stackOut_22_0 = null;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackOut_23_0 = stackIn_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  decompiledRegionSelector0 = 2;
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
                        stackOut_10_0 = null;
                        stackIn_11_0 = stackOut_10_0;
                        stackOut_11_0 = stackIn_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    stackOut_2_0 = null;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_55_0 = null;
                stackIn_56_0 = stackOut_55_0;
                return (byte[]) ((Object) stackIn_56_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_12_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_24_0);
                  } else {
                    return stackIn_54_0;
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

    private final boolean a(int param0, int param1, int param2, byte[] param3, boolean param4) {
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
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
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
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
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
            var16 = Geoblox.field_C;
            try {
              var6_ref2 = this.field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((this.field_d.a((byte) 46) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (this.field_c.a((byte) 46) < (long)(6 + param2 * 6)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_c.a(param0 + -228, (long)(param2 * 6));
                            this.field_c.a(dj.field_F, 6, 0, 9868);
                            var7_int = (dj.field_F[5] & 255) + (((255 & dj.field_F[4]) << 1610645000) + ((255 & dj.field_F[3]) << 413706224));
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (this.field_d.a((byte) 46) / 520L < (long)var7_int) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackOut_12_0 = stackIn_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      dj.field_F[3] = (byte)(var7_int >> -1467494224);
                      dj.field_F[2] = (byte)param1;
                      dj.field_F[1] = (byte)(param1 >> 1003176520);
                      if (param0 == 255) {
                        break L3;
                      } else {
                        this.field_c = (sk) null;
                        break L3;
                      }
                    }
                    dj.field_F[4] = (byte)(var7_int >> -743180568);
                    dj.field_F[5] = (byte)var7_int;
                    dj.field_F[0] = (byte)(param1 >> -489692528);
                    this.field_c.a(param0 + -380, (long)(param2 * 6));
                    this.field_c.a(6, 0, dj.field_F, false);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param1 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param4) {
                              break L6;
                            } else {
                              L7: {
                                this.field_d.a(param0 + -191, (long)(520 * var7_int));
                                if (65535 >= param2) {
                                  try {
                                    L8: {
                                      this.field_d.a(dj.field_F, 8, 0, 9868);
                                      decompiledRegionSelector0 = 0;
                                      break L8;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var11 = ((255 & dj.field_F[0]) << 1107016360) - -(255 & dj.field_F[1]);
                                    var12 = (dj.field_F[3] & 255) + ((255 & dj.field_F[2]) << -183179928);
                                    var13 = 255 & dj.field_F[7];
                                    var10 = (dj.field_F[6] & 255) + ((65280 & dj.field_F[5] << -772216792) + (16711680 & dj.field_F[4] << -57769104));
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_d.a(dj.field_F, 10, 0, 9868);
                                      decompiledRegionSelector1 = 0;
                                      break L10;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var11 = (65280 & dj.field_F[2] << 1899806600) + (((255 & dj.field_F[0]) << 1421127672) + (((dj.field_F[1] & 255) << -71073680) + (255 & dj.field_F[3])));
                                    var13 = dj.field_F[9] & 255;
                                    var10 = (dj.field_F[8] & 255) + ((255 & dj.field_F[6]) << 934910480) - -(65280 & dj.field_F[7] << -133336408);
                                    var12 = (dj.field_F[4] << 2024671784 & 65280) + (255 & dj.field_F[5]);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param2) {
                                  break L12;
                                } else {
                                  if (var9 != var12) {
                                    break L12;
                                  } else {
                                    if (var13 == this.field_b) {
                                      L13: {
                                        if ((var10 ^ -1) > -1) {
                                          break L13;
                                        } else {
                                          if ((this.field_d.a((byte) 46) / 520L ^ -1L) > ((long)var10 ^ -1L)) {
                                            break L13;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackOut_42_0 = stackIn_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              stackOut_36_0 = stackIn_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L14: {
                            if (var10 != 0) {
                              break L14;
                            } else {
                              L15: {
                                param4 = false;
                                var10 = (int)((519L + this.field_d.a((byte) 46)) / 520L);
                                if (var10 != 0) {
                                  break L15;
                                } else {
                                  var10++;
                                  break L15;
                                }
                              }
                              if (var7_int != var10) {
                                break L14;
                              } else {
                                var10++;
                                break L14;
                              }
                            }
                          }
                          L16: {
                            if (512 >= -var8 + param1) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (-65536 <= (param2 ^ -1)) {
                              L18: {
                                dj.field_F[4] = (byte)(var10 >> -1912263152);
                                dj.field_F[2] = (byte)(var9 >> -1443172216);
                                dj.field_F[0] = (byte)(param2 >> 1158595624);
                                dj.field_F[7] = (byte)this.field_b;
                                dj.field_F[1] = (byte)param2;
                                dj.field_F[5] = (byte)(var10 >> 918416584);
                                dj.field_F[3] = (byte)var9;
                                dj.field_F[6] = (byte)var10;
                                this.field_d.a(-97, (long)(520 * var7_int));
                                this.field_d.a(8, 0, dj.field_F, false);
                                var11 = param1 - var8;
                                if (512 < var11) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_d.a(var11, var8, param3, false);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                dj.field_F[6] = (byte)(var10 >> -530636144);
                                dj.field_F[5] = (byte)var9;
                                dj.field_F[2] = (byte)(param2 >> -1213437496);
                                dj.field_F[9] = (byte)this.field_b;
                                dj.field_F[4] = (byte)(var9 >> -1228123480);
                                dj.field_F[1] = (byte)(param2 >> 1114296048);
                                dj.field_F[7] = (byte)(var10 >> 1392408456);
                                dj.field_F[8] = (byte)var10;
                                dj.field_F[3] = (byte)param2;
                                dj.field_F[0] = (byte)(param2 >> 1933282872);
                                this.field_d.a(73, (long)(var7_int * 520));
                                this.field_d.a(10, 0, dj.field_F, false);
                                var11 = param1 - var8;
                                if (510 < var11) {
                                  var11 = 510;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              this.field_d.a(var11, var8, param3, false);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L4;
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
                  return stackIn_7_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_13_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_37_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_43_0 != 0;
                      } else {
                        return stackIn_64_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_69_0 = (RuntimeException) (var6_ref);
                stackOut_69_1 = new StringBuilder().append("jh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
                  break L20;
                } else {
                  stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackOut_70_2 = "{...}";
                  stackIn_72_0 = stackOut_70_0;
                  stackIn_72_1 = stackOut_70_1;
                  stackIn_72_2 = stackOut_70_2;
                  break L20;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_b;
    }

    final static void a(java.awt.Component param0, d param1, boolean param2, kj param3, boolean param4, int param5) {
        qk.a(param5, param4, 10);
        fj.field_p = qk.a(param1, param0, 0, 22050);
        if (param2) {
            return;
        }
        try {
            oh.field_a = qk.a(param1, param0, 1, 1000);
            ge.field_d = new ob();
            oh.field_a.b(ge.field_d);
            uh.field_y = param3;
            wg.a(-15346, oc.field_c);
            ag.a(j.field_gb, (byte) -67);
            fj.field_p.b(param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jh.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    jh(int param0, sk param1, sk param2, int param3) {
        this.field_d = null;
        this.field_a = 65000;
        this.field_c = null;
        try {
            this.field_a = param3;
            this.field_d = param1;
            this.field_c = param2;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
