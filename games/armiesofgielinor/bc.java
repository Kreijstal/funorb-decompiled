/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc {
    private int field_c;
    static String field_h;
    static String field_d;
    private ue field_g;
    static String field_f;
    static ru[][] field_j;
    static String field_k;
    private ue field_l;
    private int field_b;
    static ic field_a;
    static boolean field_e;
    static String field_i;

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var5 = this.field_l;
            synchronized (var5) {
              L1: {
                L2: {
                  if (-1 < (param1 ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_c >= param1) {
                      L3: {
                        var6 = this.a(param3, param2, true, param1, (byte) -52) ? 1 : 0;
                        var7 = -85 % ((param0 - -68) / 56);
                        if (var6 == 0) {
                          var6 = this.a(param3, param2, false, param1, (byte) 104) ? 1 : 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      stackIn_8_0 = var6;
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
            stackIn_13_0 = (RuntimeException) (var5_ref);

            stackIn_13_1 = new StringBuilder().append("bc.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0) {
        if (param0 != 2858) {
            mo var2 = (mo) null;
            bc.a(-95, (mo) null);
        }
        ng.x(90);
    }

    final static void a(int param0, mo param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (-4 >= (var2_int ^ -1)) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= lk.field_h) {
                    dupTemp$0 = param1.a(true);
                    am.field_D[dupTemp$0] = am.field_D[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= lk.field_h) {
                        L4: {
                          lk.field_h = var2_int;
                          if (param0 == 3208) {
                            break L4;
                          } else {
                            field_k = (String) null;
                            break L4;
                          }
                        }
                        fieldTemp$1 = lk.field_h;
                        lk.field_h = lk.field_h + 1;
                        an.field_F[fieldTemp$1] = param1;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if ((param1.field_b ^ -1) != (an.field_F[var3].field_b ^ -1)) {
                              break L6;
                            } else {
                              var4 = an.field_F[var3].a(true);
                              if (am.field_D[var4] > vj.field_g) {
                                am.field_D[var4] = am.field_D[var4] - 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          an.field_F[incrementValue$2] = an.field_F[var3];
                          break L5;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_b == an.field_F[var2_int].field_b) {
                        dupTemp$3 = an.field_F[var2_int].a(true);
                        am.field_D[dupTemp$3] = am.field_D[dupTemp$3] + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                am.field_D[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("bc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    private final boolean a(int param0, byte[] param1, boolean param2, int param3, byte param4) {
        try {
            int stackIn_9_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_64_0 = 0;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            String stackIn_70_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            Object var6 = null;
            RuntimeException var6_ref = null;
            int var7_int = 0;
            IOException var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            EOFException var15 = null;
            int var17 = 0;
            var17 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              var6 = this.field_l;
              synchronized (var6) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if (this.field_g.a(true) < (long)(6 * param0 + 6)) {
                          stackIn_9_0 = 0;

                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_g.a(-1, (long)(param0 * 6));
                            this.field_g.a(0, tn.field_db, (byte) -103, 6);
                            var7_int = ((255 & tn.field_db[3]) << -1536732848) - -(tn.field_db[4] << -1590498392 & 65280) - -(tn.field_db[5] & 255);
                            if (-1 <= (var7_int ^ -1)) {
                              break L2;
                            } else {
                              if ((long)var7_int <= this.field_l.a(true) / 520L) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackIn_15_0 = 0;

                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((519L + this.field_l.a(true)) / 520L);
                        if (-1 == (var7_int ^ -1)) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    tn.field_db[2] = (byte)param3;
                    tn.field_db[5] = (byte)var7_int;
                    tn.field_db[3] = (byte)(var7_int >> 687875440);
                    tn.field_db[1] = (byte)(param3 >> -1659381336);
                    tn.field_db[4] = (byte)(var7_int >> -856363512);
                    var8 = 27 / ((66 - param4) / 35);
                    tn.field_db[0] = (byte)(param3 >> -2093889104);
                    this.field_g.a(-1, (long)(param0 * 6));
                    this.field_g.a(6, 0, (byte) 56, tn.field_db);
                    var9 = 0;
                    var10 = 0;
                    L3: while (true) {
                      L4: {
                        if (param3 <= var9) {
                          break L4;
                        } else {
                          L5: {
                            var11 = 0;
                            if (!param2) {
                              break L5;
                            } else {
                              L6: {
                                this.field_l.a(-1, (long)(520 * var7_int));
                                if (65535 >= param0) {
                                  try {
                                    L7: {
                                      this.field_l.a(0, tn.field_db, (byte) -103, 8);
                                      decompiledRegionSelector0 = 0;
                                      break L7;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var13 = (tn.field_db[3] & 255) + (65280 & tn.field_db[2] << -950061176);
                                    var11 = (255 & tn.field_db[6]) + ((16711680 & tn.field_db[4] << -2078564400) - -(tn.field_db[5] << -384822040 & 65280));
                                    var12 = (255 & tn.field_db[1]) + ((255 & tn.field_db[0]) << -824812408);
                                    var14 = tn.field_db[7] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_l.a(0, tn.field_db, (byte) -103, 10);
                                      decompiledRegionSelector1 = 0;
                                      break L9;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var11 = (255 & tn.field_db[8]) + (16711680 & tn.field_db[6] << -1381243760) + (65280 & tn.field_db[7] << 2012773128);
                                    var12 = (255 & tn.field_db[3]) + ((tn.field_db[1] << 279330320 & 16711680) + (((255 & tn.field_db[0]) << -432054408) - -((255 & tn.field_db[2]) << 106064616)));
                                    var14 = tn.field_db[9] & 255;
                                    var13 = ((255 & tn.field_db[4]) << 2082763560) - -(tn.field_db[5] & 255);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param0 != var12) {
                                  break L11;
                                } else {
                                  if (var10 != var13) {
                                    break L11;
                                  } else {
                                    if (var14 == this.field_b) {
                                      L12: {
                                        if (var11 < 0) {
                                          break L12;
                                        } else {
                                          if (this.field_l.a(true) / 520L < (long)var11) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackIn_41_0 = 0;

                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackIn_35_0 = 0;

                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L13: {
                            if (-1 != (var11 ^ -1)) {
                              break L13;
                            } else {
                              L14: {
                                var11 = (int)((this.field_l.a(true) - -519L) / 520L);
                                param2 = false;
                                if (-1 != (var11 ^ -1)) {
                                  break L14;
                                } else {
                                  var11++;
                                  break L14;
                                }
                              }
                              if (var7_int == var11) {
                                var11++;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if ((param3 - var9 ^ -1) < -513) {
                              break L15;
                            } else {
                              var11 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param0 > 65535) {
                              L17: {
                                tn.field_db[6] = (byte)(var11 >> 582524592);
                                tn.field_db[0] = (byte)(param0 >> 509524280);
                                tn.field_db[3] = (byte)param0;
                                tn.field_db[4] = (byte)(var10 >> -1165377176);
                                tn.field_db[9] = (byte)this.field_b;
                                tn.field_db[1] = (byte)(param0 >> 791356048);
                                tn.field_db[7] = (byte)(var11 >> -932251896);
                                tn.field_db[2] = (byte)(param0 >> -530339000);
                                tn.field_db[5] = (byte)var10;
                                tn.field_db[8] = (byte)var11;
                                this.field_l.a(-1, (long)(var7_int * 520));
                                this.field_l.a(10, 0, (byte) 63, tn.field_db);
                                var12 = -var9 + param3;
                                if (510 >= var12) {
                                  break L17;
                                } else {
                                  var12 = 510;
                                  break L17;
                                }
                              }
                              this.field_l.a(var12, var9, (byte) 110, param1);
                              var9 = var9 + var12;
                              break L16;
                            } else {
                              L18: {
                                tn.field_db[2] = (byte)(var10 >> -189794744);
                                tn.field_db[0] = (byte)(param0 >> 1678634056);
                                tn.field_db[3] = (byte)var10;
                                tn.field_db[1] = (byte)param0;
                                tn.field_db[7] = (byte)this.field_b;
                                tn.field_db[4] = (byte)(var11 >> 1245661424);
                                tn.field_db[6] = (byte)var11;
                                tn.field_db[5] = (byte)(var11 >> 831654120);
                                this.field_l.a(-1, (long)(var7_int * 520));
                                this.field_l.a(8, 0, (byte) 44, tn.field_db);
                                var12 = param3 + -var9;
                                if ((var12 ^ -1) < -513) {
                                  var12 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_l.a(var12, var9, (byte) 78, param1);
                              var9 = var9 + var12;
                              break L16;
                            }
                          }
                          var7_int = var11;
                          var10++;
                          continue L3;
                        }
                      }
                      stackIn_61_0 = 1;

                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackIn_64_0 = 0;
                  return stackIn_64_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_9_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_15_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_41_0 != 0;
                      } else {
                        return stackIn_61_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_69_0 = (RuntimeException) (var6_ref);

                stackIn_69_1 = new StringBuilder().append("bc.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackIn_70_2 = "null";
                  break L19;
                } else {
                  stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackIn_70_2 = "{...}";
                  break L19;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$2 = 0;
            Object var3 = null;
            Object var3_ref = null;
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
            int var18 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_43_0 = null;
            byte[] stackIn_49_0 = null;
            Object stackIn_52_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var4 = null;
            var18 = ArmiesOfGielinor.field_M ? 1 : 0;
            var3_ref = this.field_l;
            synchronized (var3_ref) {
              try {
                L0: {
                  if (((long)(6 * param1 - -6) ^ -1L) >= (this.field_g.a(true) ^ -1L)) {
                    this.field_g.a(-1, (long)(6 * param1));
                    this.field_g.a(0, tn.field_db, (byte) -103, 6);
                    var4_int = (tn.field_db[0] << -1931386480 & 16711680) + (tn.field_db[1] << 208955240 & 65280) - -(tn.field_db[2] & 255);
                    var5 = (tn.field_db[3] << -1862779824 & 16711680) - (-(65280 & tn.field_db[4] << -1893295704) + -(255 & tn.field_db[5]));
                    if (0 <= var4_int) {
                      if (var4_int <= this.field_c) {
                        if (param0 < var5) {
                          if ((long)var5 <= this.field_l.a(true) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackIn_49_0 = (byte[]) (var6);

                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                if (-1 != (var5 ^ -1)) {
                                  L2: {
                                    this.field_l.a(-1, (long)(var5 * 520));
                                    var9 = var4_int + -var7;
                                    if (65535 < param1) {
                                      L3: {
                                        if ((var9 ^ -1) >= -511) {
                                          break L3;
                                        } else {
                                          var9 = 510;
                                          break L3;
                                        }
                                      }
                                      var14 = 10;
                                      this.field_l.a(0, tn.field_db, (byte) -103, var9 + var14);
                                      var11 = (65280 & tn.field_db[4] << 2139212648) + (tn.field_db[5] & 255);
                                      var13 = tn.field_db[9] & 255;
                                      var12 = ((tn.field_db[7] & 255) << -815295032) + (16711680 & tn.field_db[6] << 1341775696) + (255 & tn.field_db[8]);
                                      var10 = ((tn.field_db[0] & 255) << -980111784) - (-((tn.field_db[1] & 255) << 1912573744) + -((tn.field_db[2] & 255) << 623847944)) + (tn.field_db[3] & 255);
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 8;
                                        if ((var9 ^ -1) < -513) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      this.field_l.a(0, tn.field_db, (byte) -103, var14 + var9);
                                      var10 = (255 & tn.field_db[1]) + ((tn.field_db[0] & 255) << 644079336);
                                      var11 = (255 & tn.field_db[3]) + ((tn.field_db[2] & 255) << -1357958360);
                                      var13 = tn.field_db[7] & 255;
                                      var12 = (tn.field_db[6] & 255) + ((255 & tn.field_db[5]) << -599995064) + (16711680 & tn.field_db[4] << -1585123120);
                                      break L2;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var8 == var11) {
                                      if (var13 == this.field_b) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= this.field_l.a(true) / 520L) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                continue L1;
                                              } else {
                                                incrementValue$2 = var7;
                                                var7++;
                                                var6[incrementValue$2] = tn.field_db[var16];
                                                var16++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackIn_43_0 = null;

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
                                      return null;
                                    }
                                  } else {
                                    return null;
                                  }
                                } else {
                                  return null;
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
                    stackIn_3_0 = null;

                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackIn_52_0 = null;
                return (byte[]) ((Object) stackIn_52_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_3_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_43_0);
                } else {
                  return stackIn_49_0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    bc(int param0, ue param1, ue param2, int param3) {
        this.field_c = 65000;
        this.field_l = null;
        this.field_g = null;
        try {
            this.field_l = param1;
            this.field_g = param2;
            this.field_b = param0;
            this.field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_k = null;
        if (param0 != 1) {
            bc.b(11);
        }
        field_f = null;
        field_h = null;
        field_j = (ru[][]) null;
        field_i = null;
        field_d = null;
    }

    static {
        field_d = "Invalid name";
        field_h = "Talons are of no use to ground units.";
        field_f = "Please wait";
        field_k = "Spectate <%0>'s game";
        field_i = "Unpacking graphics";
    }
}
