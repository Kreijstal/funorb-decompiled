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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          var5 = (Object) (Object) ((bc) this).field_l;
          synchronized (var5) {
            L0: {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (((bc) this).field_c >= param1) {
                    L2: {
                      var6 = this.a(param3, param2, true, param1, (byte) -52) ? 1 : 0;
                      var7 = -85 % ((param0 - -68) / 56);
                      if (var6 == 0) {
                        var6 = this.a(param3, param2, false, param1, (byte) 104) ? 1 : 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    stackOut_7_0 = var6;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("bc.D(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final static void a() {
        int discarded$0 = 90;
        ng.x();
    }

    final static void a(int param0, mo param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= lk.field_h) {
                    int dupTemp$4 = param1.a(true);
                    am.field_D[dupTemp$4] = am.field_D[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= lk.field_h) {
                        L4: {
                          lk.field_h = var2_int;
                          if (param0 == 3208) {
                            break L4;
                          } else {
                            field_k = null;
                            break L4;
                          }
                        }
                        int fieldTemp$5 = lk.field_h;
                        lk.field_h = lk.field_h + 1;
                        an.field_F[fieldTemp$5] = param1;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param1.field_b != an.field_F[var3].field_b) {
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
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          an.field_F[incrementValue$6] = an.field_F[var3];
                          break L5;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_b == an.field_F[var2_int].field_b) {
                        int dupTemp$7 = an.field_F[var2_int].a(true);
                        am.field_D[dupTemp$7] = am.field_D[dupTemp$7] + 1;
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
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("bc.E(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    private final boolean a(int param0, byte[] param1, boolean param2, int param3, byte param4) {
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
            int var14 = 0;
            EOFException var15 = null;
            Throwable var16 = null;
            int var17 = 0;
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            String stackIn_70_2 = null;
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
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            var17 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              var6_ref2 = (Object) (Object) ((bc) this).field_l;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param2) {
                        if (((bc) this).field_g.a(true) < (long)(6 * param0 + 6)) {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackOut_9_0 = stackIn_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        } else {
                          L2: {
                            ((bc) this).field_g.a(-1, (long)(param0 * 6));
                            ((bc) this).field_g.a(0, tn.field_db, (byte) -103, 6);
                            var7_int = ((255 & tn.field_db[3]) << 16) - -(tn.field_db[4] << 8 & 65280) - -(tn.field_db[5] & 255);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((long)var7_int <= ((bc) this).field_l.a(true) / 520L) {
                                break L1;
                              } else {
                                break L2;
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
                        var7_int = (int)((519L + ((bc) this).field_l.a(true)) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    tn.field_db[2] = (byte)param3;
                    tn.field_db[5] = (byte)var7_int;
                    tn.field_db[3] = (byte)(var7_int >> 16);
                    tn.field_db[1] = (byte)(param3 >> 8);
                    tn.field_db[4] = (byte)(var7_int >> 8);
                    var8 = 27 / ((66 - param4) / 35);
                    tn.field_db[0] = (byte)(param3 >> 16);
                    ((bc) this).field_g.a(-1, (long)(param0 * 6));
                    ((bc) this).field_g.a(6, 0, (byte) 56, tn.field_db);
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
                                ((bc) this).field_l.a(-1, (long)(520 * var7_int));
                                if (65535 >= param0) {
                                  try {
                                    L7: {
                                      ((bc) this).field_l.a(0, tn.field_db, (byte) -103, 8);
                                      decompiledRegionSelector1 = 0;
                                      break L7;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var13 = (tn.field_db[3] & 255) + (65280 & tn.field_db[2] << 8);
                                    var11 = (255 & tn.field_db[6]) + ((16711680 & tn.field_db[4] << 16) - -(tn.field_db[5] << 8 & 65280));
                                    var12 = (255 & tn.field_db[1]) + ((255 & tn.field_db[0]) << 8);
                                    var14 = tn.field_db[7] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((bc) this).field_l.a(0, tn.field_db, (byte) -103, 10);
                                      decompiledRegionSelector0 = 0;
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var11 = (255 & tn.field_db[8]) + (16711680 & tn.field_db[6] << 16) + (65280 & tn.field_db[7] << 8);
                                    var12 = (255 & tn.field_db[3]) + ((tn.field_db[1] << 16 & 16711680) + (((255 & tn.field_db[0]) << 24) - -((255 & tn.field_db[2]) << 8)));
                                    var14 = tn.field_db[9] & 255;
                                    var13 = ((255 & tn.field_db[4]) << 8) - -(tn.field_db[5] & 255);
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
                                  if (~var10 != ~var13) {
                                    break L11;
                                  } else {
                                    if (~var14 == ~((bc) this).field_b) {
                                      L12: {
                                        if (var11 < 0) {
                                          break L12;
                                        } else {
                                          if (((bc) this).field_l.a(true) / 520L < (long)var11) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_40_0 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackOut_41_0 = stackIn_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      return stackIn_42_0 != 0;
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
                              return stackIn_36_0 != 0;
                            }
                          }
                          L13: {
                            if (var11 != 0) {
                              break L13;
                            } else {
                              L14: {
                                var11 = (int)((((bc) this).field_l.a(true) - -519L) / 520L);
                                param2 = false;
                                if (var11 != 0) {
                                  break L14;
                                } else {
                                  var11++;
                                  break L14;
                                }
                              }
                              if (~var7_int == ~var11) {
                                var11++;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (param3 - var9 > 512) {
                              break L15;
                            } else {
                              var11 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param0 > 65535) {
                              L17: {
                                tn.field_db[6] = (byte)(var11 >> 16);
                                tn.field_db[0] = (byte)(param0 >> 24);
                                tn.field_db[3] = (byte)param0;
                                tn.field_db[4] = (byte)(var10 >> 8);
                                tn.field_db[9] = (byte)((bc) this).field_b;
                                tn.field_db[1] = (byte)(param0 >> 16);
                                tn.field_db[7] = (byte)(var11 >> 8);
                                tn.field_db[2] = (byte)(param0 >> 8);
                                tn.field_db[5] = (byte)var10;
                                tn.field_db[8] = (byte)var11;
                                ((bc) this).field_l.a(-1, (long)(var7_int * 520));
                                ((bc) this).field_l.a(10, 0, (byte) 63, tn.field_db);
                                var12 = -var9 + param3;
                                if (510 >= var12) {
                                  break L17;
                                } else {
                                  var12 = 510;
                                  break L17;
                                }
                              }
                              ((bc) this).field_l.a(var12, var9, (byte) 110, param1);
                              var9 = var9 + var12;
                              break L16;
                            } else {
                              L18: {
                                tn.field_db[2] = (byte)(var10 >> 8);
                                tn.field_db[0] = (byte)(param0 >> 8);
                                tn.field_db[3] = (byte)var10;
                                tn.field_db[1] = (byte)param0;
                                tn.field_db[7] = (byte)((bc) this).field_b;
                                tn.field_db[4] = (byte)(var11 >> 16);
                                tn.field_db[6] = (byte)var11;
                                tn.field_db[5] = (byte)(var11 >> 8);
                                ((bc) this).field_l.a(-1, (long)(var7_int * 520));
                                ((bc) this).field_l.a(8, 0, (byte) 44, tn.field_db);
                                var12 = param3 + -var9;
                                if (var12 > 512) {
                                  var12 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((bc) this).field_l.a(var12, var9, (byte) 78, param1);
                              var9 = var9 + var12;
                              break L16;
                            }
                          }
                          var7_int = var11;
                          var10++;
                          continue L3;
                        }
                      }
                      stackOut_60_0 = 1;
                      stackIn_61_0 = stackOut_60_0;
                      stackOut_61_0 = stackIn_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  return stackIn_64_0 != 0;
                }
                return stackIn_62_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) var6_ref;
                stackOut_67_1 = new StringBuilder().append("bc.F(").append(param0).append(',');
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param1 == null) {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L19;
                } else {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L19;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((bc) this).field_b;
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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_51_0 = null;
            var18 = ArmiesOfGielinor.field_M ? 1 : 0;
            var3 = (Object) (Object) ((bc) this).field_l;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(6 * param1 - -6) >= ~((bc) this).field_g.a(true)) {
                    ((bc) this).field_g.a(-1, (long)(6 * param1));
                    ((bc) this).field_g.a(0, tn.field_db, (byte) -103, 6);
                    var4_int = (tn.field_db[0] << 16 & 16711680) + (tn.field_db[1] << 8 & 65280) - -(tn.field_db[2] & 255);
                    var5 = (tn.field_db[3] << 16 & 16711680) - (-(65280 & tn.field_db[4] << 8) + -(255 & tn.field_db[5]));
                    if (0 <= var4_int) {
                      if (var4_int <= ((bc) this).field_c) {
                        if (param0 < var5) {
                          if ((long)var5 <= ((bc) this).field_l.a(true) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackOut_48_0 = (byte[]) var6;
                                stackIn_49_0 = stackOut_48_0;
                                stackOut_49_0 = (byte[]) (Object) stackIn_49_0;
                                stackIn_50_0 = stackOut_49_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    ((bc) this).field_l.a(-1, (long)(var5 * 520));
                                    var9 = var4_int + -var7;
                                    if (65535 < param1) {
                                      L3: {
                                        if (var9 <= 510) {
                                          break L3;
                                        } else {
                                          var9 = 510;
                                          break L3;
                                        }
                                      }
                                      var14 = 10;
                                      ((bc) this).field_l.a(0, tn.field_db, (byte) -103, var9 + var14);
                                      var11 = (65280 & tn.field_db[4] << 8) + (tn.field_db[5] & 255);
                                      var13 = tn.field_db[9] & 255;
                                      var12 = ((tn.field_db[7] & 255) << 8) + (16711680 & tn.field_db[6] << 16) + (255 & tn.field_db[8]);
                                      var10 = ((tn.field_db[0] & 255) << 24) - (-((tn.field_db[1] & 255) << 16) + -((tn.field_db[2] & 255) << 8)) + (tn.field_db[3] & 255);
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 8;
                                        if (var9 > 512) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      ((bc) this).field_l.a(0, tn.field_db, (byte) -103, var14 + var9);
                                      var10 = (255 & tn.field_db[1]) + ((tn.field_db[0] & 255) << 8);
                                      var11 = (255 & tn.field_db[3]) + ((tn.field_db[2] & 255) << 8);
                                      var13 = tn.field_db[7] & 255;
                                      var12 = (tn.field_db[6] & 255) + ((255 & tn.field_db[5]) << 8) + (16711680 & tn.field_db[4] << 16);
                                      break L2;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var8 == var11) {
                                      if (var13 == ((bc) this).field_b) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= ((bc) this).field_l.a(true) / 520L) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var16 >= var15) {
                                                continue L1;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = tn.field_db[var16];
                                                var16++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackOut_42_0 = null;
                                            stackIn_43_0 = stackOut_42_0;
                                            stackOut_43_0 = stackIn_43_0;
                                            stackIn_44_0 = stackOut_43_0;
                                            return (byte[]) (Object) stackIn_44_0;
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
                    stackOut_2_0 = null;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    return (byte[]) (Object) stackIn_4_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_51_0 = null;
                stackIn_52_0 = stackOut_51_0;
                return (byte[]) (Object) stackIn_52_0;
              }
              return stackIn_50_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    bc(int param0, ue param1, ue param2, int param3) {
        ((bc) this).field_c = 65000;
        ((bc) this).field_l = null;
        ((bc) this).field_g = null;
        try {
            ((bc) this).field_l = param1;
            ((bc) this).field_g = param2;
            ((bc) this).field_b = param0;
            ((bc) this).field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "bc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
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
        field_j = null;
        field_i = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invalid name";
        field_h = "Talons are of no use to ground units.";
        field_f = "Please wait";
        field_k = "Spectate <%0>'s game";
        field_i = "Unpacking graphics";
    }
}
