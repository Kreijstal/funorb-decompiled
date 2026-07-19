/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae {
    static String field_c;
    private int field_a;
    static vc field_f;
    private int field_g;
    static String field_b;
    static String field_e;
    private pf field_h;
    private pf field_d;

    public final String toString() {
        return "" + this.field_a;
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
            var5 = this.field_h;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param0 < (param1 ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_g >= param1) {
                      L3: {
                        var6 = this.a(param2, true, param3, param1, (byte) -15) ? 1 : 0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          var6 = this.a(param2, false, param3, param1, (byte) -15) ? 1 : 0;
                          break L3;
                        }
                      }
                      stackOut_6_0 = var6;
                      stackIn_7_0 = stackOut_6_0;
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
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5_ref);
            stackOut_10_1 = new StringBuilder().append("ae.C(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final boolean a(byte[] param0, boolean param1, int param2, int param3, byte param4) {
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
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_66_0 = 0;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            var16 = Confined.field_J ? 1 : 0;
            try {
              var6_ref2 = this.field_h;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param1) {
                        var7_int = (int)((this.field_h.b((byte) 99) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if ((long)(param2 * 6 + 6) > this.field_d.b((byte) 97)) {
                          stackOut_5_0 = 0;
                          stackIn_6_0 = stackOut_5_0;
                          stackOut_6_0 = stackIn_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_d.a((byte) 123, (long)(6 * param2));
                            this.field_d.a(0, gi.field_db, (byte) 122, 6);
                            var7_int = (gi.field_db[5] & 255) + (gi.field_db[3] << 80007984 & 16711680) - -(65280 & gi.field_db[4] << -1374026936);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((this.field_h.b((byte) 111) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
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
                    gi.field_db[2] = (byte)param3;
                    gi.field_db[0] = (byte)(param3 >> 1141638128);
                    gi.field_db[4] = (byte)(var7_int >> -1670097176);
                    gi.field_db[1] = (byte)(param3 >> 636735624);
                    gi.field_db[5] = (byte)var7_int;
                    gi.field_db[3] = (byte)(var7_int >> 463273040);
                    this.field_d.a((byte) 123, (long)(6 * param2));
                    this.field_d.a(6, (byte) 9, 0, gi.field_db);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param3 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param1) {
                              L6: {
                                this.field_h.a((byte) 123, (long)(var7_int * 520));
                                if (65535 < param2) {
                                  try {
                                    L7: {
                                      this.field_h.a(0, gi.field_db, (byte) 107, 10);
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
                                    var13 = gi.field_db[9] & 255;
                                    var10 = (65280 & gi.field_db[7] << 1558216712) + (((255 & gi.field_db[6]) << 986335632) - -(gi.field_db[8] & 255));
                                    var12 = (gi.field_db[5] & 255) + (65280 & gi.field_db[4] << -1665764664);
                                    var11 = (16711680 & gi.field_db[1] << -1609961424) + (((gi.field_db[0] & 255) << -9011944) - -(gi.field_db[2] << -1536628504 & 65280)) + (255 & gi.field_db[3]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_h.a(0, gi.field_db, (byte) 89, 8);
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
                                    var13 = gi.field_db[7] & 255;
                                    var10 = (gi.field_db[6] & 255) + ((16711680 & gi.field_db[4] << 1088006384) - -((255 & gi.field_db[5]) << 1577761576));
                                    var12 = (65280 & gi.field_db[2] << -1184060728) + (255 & gi.field_db[3]);
                                    var11 = ((255 & gi.field_db[0]) << 761202984) + (255 & gi.field_db[1]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (var11 != param2) {
                                  break L11;
                                } else {
                                  if (var12 != var9) {
                                    break L11;
                                  } else {
                                    if (this.field_a == var13) {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if ((this.field_h.b((byte) 99) / 520L ^ -1L) <= ((long)var10 ^ -1L)) {
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
                                    } else {
                                      break L11;
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
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L14: {
                                param1 = false;
                                var10 = (int)((519L + this.field_h.b((byte) 113)) / 520L);
                                if (0 == var10) {
                                  var10++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var10 == var7_int) {
                                var10++;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if ((-var8 + param3 ^ -1) < -513) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (-65536 > (param2 ^ -1)) {
                              L17: {
                                gi.field_db[7] = (byte)(var10 >> -2074814520);
                                gi.field_db[1] = (byte)(param2 >> 1968794192);
                                gi.field_db[4] = (byte)(var9 >> -550605880);
                                gi.field_db[3] = (byte)param2;
                                gi.field_db[0] = (byte)(param2 >> 190050360);
                                gi.field_db[5] = (byte)var9;
                                gi.field_db[6] = (byte)(var10 >> 1107353648);
                                gi.field_db[8] = (byte)var10;
                                gi.field_db[9] = (byte)this.field_a;
                                gi.field_db[2] = (byte)(param2 >> -1087352312);
                                this.field_h.a((byte) 123, (long)(520 * var7_int));
                                this.field_h.a(10, (byte) 9, 0, gi.field_db);
                                var11 = -var8 + param3;
                                if (510 >= var11) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              this.field_h.a(var11, (byte) 9, var8, param0);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                gi.field_db[2] = (byte)(var9 >> 1270171784);
                                gi.field_db[4] = (byte)(var10 >> -1192307920);
                                gi.field_db[7] = (byte)this.field_a;
                                gi.field_db[6] = (byte)var10;
                                gi.field_db[3] = (byte)var9;
                                gi.field_db[5] = (byte)(var10 >> -1530090488);
                                gi.field_db[1] = (byte)param2;
                                gi.field_db[0] = (byte)(param2 >> -942517752);
                                this.field_h.a((byte) 123, (long)(520 * var7_int));
                                this.field_h.a(8, (byte) 9, 0, gi.field_db);
                                var11 = -var8 + param3;
                                if (512 < var11) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_h.a(var11, (byte) 9, var8, param0);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      L19: {
                        if (param4 == -15) {
                          break L19;
                        } else {
                          field_e = (String) null;
                          break L19;
                        }
                      }
                      stackOut_63_0 = 1;
                      stackIn_64_0 = stackOut_63_0;
                      stackOut_64_0 = stackIn_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_66_0 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  return stackIn_67_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_7_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_13_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_42_0 != 0;
                      } else {
                        return stackIn_65_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_70_0 = (RuntimeException) (var6_ref);
                stackOut_70_1 = new StringBuilder().append("ae.A(");
                stackIn_72_0 = stackOut_70_0;
                stackIn_72_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (param0 == null) {
                  stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackOut_72_2 = "null";
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  stackIn_73_2 = stackOut_72_2;
                  break L20;
                } else {
                  stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                  stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                  stackOut_71_2 = "{...}";
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_73_2 = stackOut_71_2;
                  break L20;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_43_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_51_0 = null;
            var18 = Confined.field_J ? 1 : 0;
            var3 = this.field_h;
            synchronized (var3) {
              try {
                L0: {
                  if (((long)(6 * param1 + 6) ^ -1L) >= (this.field_d.b((byte) 107) ^ -1L)) {
                    this.field_d.a((byte) 123, (long)(6 * param1));
                    this.field_d.a(0, gi.field_db, (byte) 95, 6);
                    var4_int = (gi.field_db[2] & 255) + ((16711680 & gi.field_db[0] << -1912100464) - -((255 & gi.field_db[1]) << -1136463032));
                    var5 = ((255 & gi.field_db[3]) << 1386407952) + ((65280 & gi.field_db[param0] << -336636024) - -(gi.field_db[5] & 255));
                    if (var4_int >= 0) {
                      if (this.field_g >= var4_int) {
                        if (-1 > (var5 ^ -1)) {
                          if (((long)var5 ^ -1L) >= (this.field_h.b((byte) 98) / 520L ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackOut_48_0 = (byte[]) (var6);
                                stackIn_49_0 = stackOut_48_0;
                                stackOut_49_0 = (byte[]) ((Object) stackIn_49_0);
                                stackIn_50_0 = stackOut_49_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    this.field_h.a((byte) 123, (long)(520 * var5));
                                    var9 = -var7 + var4_int;
                                    if (65535 >= param1) {
                                      L3: {
                                        var14 = 8;
                                        if (512 >= var9) {
                                          break L3;
                                        } else {
                                          var9 = 512;
                                          break L3;
                                        }
                                      }
                                      this.field_h.a(0, gi.field_db, (byte) 96, var9 + var14);
                                      var11 = (gi.field_db[3] & 255) + (65280 & gi.field_db[2] << 1821060008);
                                      var10 = (255 & gi.field_db[1]) + ((gi.field_db[0] & 255) << -1769949368);
                                      var12 = (255 & gi.field_db[6]) + (gi.field_db[5] << 1952977256 & 65280) + (16711680 & gi.field_db[4] << 1110178448);
                                      var13 = 255 & gi.field_db[7];
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 10;
                                        if ((var9 ^ -1) >= -511) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      this.field_h.a(0, gi.field_db, (byte) 119, var14 + var9);
                                      var11 = (255 & gi.field_db[5]) + (65280 & gi.field_db[4] << 470455496);
                                      var12 = (gi.field_db[8] & 255) + (gi.field_db[7] << 1551564200 & 65280) + (gi.field_db[6] << 322698832 & 16711680);
                                      var13 = 255 & gi.field_db[9];
                                      var10 = (gi.field_db[3] & 255) + (((255 & gi.field_db[1]) << -735618960) + ((255 & gi.field_db[0]) << 1891977336) + (65280 & gi.field_db[2] << 35335464));
                                      break L2;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (var13 == this.field_a) {
                                        if ((var12 ^ -1) <= -1) {
                                          if (((long)var12 ^ -1L) >= (this.field_h.b((byte) 106) / 520L ^ -1L)) {
                                            var15 = var9 + var14;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                var8++;
                                                var5 = var12;
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = gi.field_db[var16];
                                                var16++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = stackOut_41_0;
                                            stackOut_42_0 = stackIn_42_0;
                                            stackIn_43_0 = stackOut_42_0;
                                            decompiledRegionSelector0 = 3;
                                            break L0;
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
                                  stackOut_20_0 = null;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackOut_21_0 = stackIn_21_0;
                                  stackIn_22_0 = stackOut_21_0;
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
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        stackOut_9_0 = stackIn_9_0;
                        stackIn_10_0 = stackOut_9_0;
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
                stackOut_51_0 = null;
                stackIn_52_0 = stackOut_51_0;
                return (byte[]) ((Object) stackIn_52_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_4_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_10_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_22_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_43_0);
                    } else {
                      return stackIn_50_0;
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

    public static void a(int param0) {
        if (param0 < 12) {
            String var2 = (String) null;
            ae.a((String) null, -84);
        }
        field_f = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    final static void a(String param0, int param1) {
        try {
            if (param1 != 0) {
                String var3 = (String) null;
                ae.a((String) null, -38);
            }
            ag.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ae.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ae(int param0, pf param1, pf param2, int param3) {
        this.field_h = null;
        this.field_d = null;
        this.field_g = 65000;
        try {
            this.field_h = param1;
            this.field_a = param0;
            this.field_d = param2;
            this.field_g = param3;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ae.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = "Press <%0> to fire your nuclear missile when you most need it";
        field_e = "You already have spread fire";
        field_c = "<col=FFFFFF>Shield:</col> upgrade awarded every four levels or if you've missed one; restore awarded if your shield is low or lost.";
    }
}
