/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    private int field_g;
    private p field_i;
    static int field_c;
    static p field_f;
    static wf field_a;
    private int field_d;
    static int[] field_b;
    static hl field_h;
    private p field_e;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
            if (param2 == 13061) {
              break L0;
            } else {
              var8 = null;
              sk.a((byte) 95, (oh) null);
              break L0;
            }
          }
          var5 = (Object) (Object) ((sk) this).field_i;
          synchronized (var5) {
            L1: {
              L2: {
                if (0 > param1) {
                  break L2;
                } else {
                  if (((sk) this).field_g < param1) {
                    break L2;
                  } else {
                    L3: {
                      var6 = this.a(true, param1, param3, 4, param0) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(false, param1, param3, 4, param0) ? 1 : 0;
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
            stackOut_13_1 = new StringBuilder().append("sk.J(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, byte[] param4) {
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
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_62_0 = 0;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            String stackIn_68_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_61_0 = 0;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            var16 = TetraLink.field_J;
            try {
              var6_ref2 = (Object) (Object) ((sk) this).field_i;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param0) {
                        if (((sk) this).field_e.b(-200000001) >= (long)(6 + param2 * 6)) {
                          L2: {
                            ((sk) this).field_e.a((long)(param2 * 6), 0);
                            ((sk) this).field_e.a(cf.field_q, 6, 0, (byte) 46);
                            var7_int = (65280 & cf.field_q[4] << 8) + (16711680 & cf.field_q[3] << 16) - -(cf.field_q[5] & 255);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((long)var7_int > ((sk) this).field_i.b(-200000001) / 520L) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackOut_14_0 = stackIn_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0 != 0;
                        } else {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        }
                      } else {
                        var7_int = (int)((519L + ((sk) this).field_i.b(-200000001)) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    cf.field_q[2] = (byte)param1;
                    cf.field_q[0] = (byte)(param1 >> 16);
                    cf.field_q[5] = (byte)var7_int;
                    cf.field_q[3] = (byte)(var7_int >> 16);
                    cf.field_q[1] = (byte)(param1 >> 8);
                    cf.field_q[4] = (byte)(var7_int >> 8);
                    ((sk) this).field_e.a((long)(6 * param2), 0);
                    ((sk) this).field_e.a(-19735, cf.field_q, 0, 6);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param1 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (!param0) {
                              break L5;
                            } else {
                              L6: {
                                ((sk) this).field_i.a((long)(var7_int * 520), 0);
                                if (param2 > 65535) {
                                  try {
                                    L7: {
                                      ((sk) this).field_i.a(cf.field_q, 10, 0, (byte) 54);
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
                                    var12 = (cf.field_q[5] & 255) + ((cf.field_q[4] & 255) << 8);
                                    var13 = cf.field_q[9] & 255;
                                    var11 = ((255 & cf.field_q[2]) << 8) + ((255 & cf.field_q[0]) << 24) - (-((255 & cf.field_q[1]) << 16) + -(255 & cf.field_q[3]));
                                    var10 = ((255 & cf.field_q[6]) << 16) + (cf.field_q[7] << 8 & 65280) + (255 & cf.field_q[8]);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((sk) this).field_i.a(cf.field_q, 8, 0, (byte) 43);
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
                                    var13 = cf.field_q[7] & 255;
                                    var12 = ((255 & cf.field_q[2]) << 8) - -(255 & cf.field_q[3]);
                                    var11 = ((cf.field_q[0] & 255) << 8) - -(255 & cf.field_q[1]);
                                    var10 = (16711680 & cf.field_q[4] << 16) + (cf.field_q[5] << 8 & 65280) + (cf.field_q[6] & 255);
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
                                    if (((sk) this).field_d != var13) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if ((long)var10 <= ((sk) this).field_i.b(-200000001) / 520L) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      stackOut_39_0 = 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackOut_40_0 = stackIn_40_0;
                                      stackIn_41_0 = stackOut_40_0;
                                      return stackIn_41_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              stackOut_34_0 = stackIn_34_0;
                              stackIn_35_0 = stackOut_34_0;
                              return stackIn_35_0 != 0;
                            }
                          }
                          L13: {
                            if (var10 != 0) {
                              break L13;
                            } else {
                              L14: {
                                var10 = (int)((519L + ((sk) this).field_i.b(-200000001)) / 520L);
                                param0 = false;
                                if (var10 != 0) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (var10 != var7_int) {
                                break L13;
                              } else {
                                var10++;
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (512 < -var8 + param1) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (param2 > 65535) {
                              L17: {
                                cf.field_q[6] = (byte)(var10 >> 16);
                                cf.field_q[1] = (byte)(param2 >> 16);
                                cf.field_q[4] = (byte)(var9 >> 8);
                                cf.field_q[7] = (byte)(var10 >> 8);
                                cf.field_q[5] = (byte)var9;
                                cf.field_q[3] = (byte)param2;
                                cf.field_q[8] = (byte)var10;
                                cf.field_q[2] = (byte)(param2 >> 8);
                                cf.field_q[0] = (byte)(param2 >> 24);
                                cf.field_q[9] = (byte)((sk) this).field_d;
                                ((sk) this).field_i.a((long)(520 * var7_int), 0);
                                ((sk) this).field_i.a(-19735, cf.field_q, 0, 10);
                                var11 = -var8 + param1;
                                if (var11 <= 510) {
                                  break L17;
                                } else {
                                  var11 = 510;
                                  break L17;
                                }
                              }
                              ((sk) this).field_i.a(-19735, param4, var8, var11);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                cf.field_q[1] = (byte)param2;
                                cf.field_q[5] = (byte)(var10 >> 8);
                                cf.field_q[3] = (byte)var9;
                                cf.field_q[0] = (byte)(param2 >> 8);
                                cf.field_q[2] = (byte)(var9 >> 8);
                                cf.field_q[4] = (byte)(var10 >> 16);
                                cf.field_q[7] = (byte)((sk) this).field_d;
                                cf.field_q[6] = (byte)var10;
                                ((sk) this).field_i.a((long)(520 * var7_int), 0);
                                ((sk) this).field_i.a(-19735, cf.field_q, 0, 8);
                                var11 = param1 - var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((sk) this).field_i.a(-19735, param4, var8, var11);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_58_0 = 1;
                      stackIn_59_0 = stackOut_58_0;
                      stackOut_59_0 = stackIn_59_0;
                      stackIn_60_0 = stackOut_59_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_61_0 = 0;
                  stackIn_62_0 = stackOut_61_0;
                  return stackIn_62_0 != 0;
                }
                return stackIn_60_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_65_0 = (RuntimeException) var6_ref;
                stackOut_65_1 = new StringBuilder().append("sk.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(4).append(44);
                stackIn_67_0 = stackOut_65_0;
                stackIn_67_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (param4 == null) {
                  stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                  stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                  stackOut_67_2 = "null";
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  stackIn_68_2 = stackOut_67_2;
                  break L19;
                } else {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "{...}";
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  stackIn_68_2 = stackOut_66_2;
                  break L19;
                }
              }
              throw oi.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (aa.field_bc != null) {
            ci.c(67);
            ba.a(1);
            uk.field_x = (float)(aa.field_bc.field_i == 1 ? 0.0 : 3.141592653589793);
        } else {
            uk.field_x = 3.1415927410125732f;
        }
        sa.a(-90, true);
        ti.field_g[param0] = (double)rn.field_d * Math.sin((double)dj.field_h);
        ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
        eo.a(-53);
        wb.a(false, param0 + -7869);
        bf discarded$0 = lb.a(pi.field_c, 573509761);
        int var1 = ui.a(3, param0 + 1692);
        if (var1 == se.field_b) {
            var1 = (se.field_b + 1) % 3;
        }
        se.field_b = var1;
        dl.a(27654, qc.field_bb[var1 + 1]);
    }

    final byte[] a(byte param0, int param1) {
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_41_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_47_0 = null;
            Object stackIn_48_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_47_0 = null;
            Object stackOut_40_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_56_0 = null;
            var18 = TetraLink.field_J;
            var3 = (Object) (Object) ((sk) this).field_i;
            synchronized (var3) {
              try {
                L0: {
                  if (((sk) this).field_e.b(-200000001) >= (long)(6 * param1 + 6)) {
                    ((sk) this).field_e.a((long)(param1 * 6), 0);
                    ((sk) this).field_e.a(cf.field_q, 6, 0, (byte) 92);
                    var4_int = (255 & cf.field_q[2]) + ((16711680 & cf.field_q[0] << 16) + ((cf.field_q[1] & 255) << 8));
                    var5 = (cf.field_q[5] & 255) + ((255 & cf.field_q[3]) << 16) + (65280 & cf.field_q[4] << 8);
                    if (0 <= var4_int) {
                      if (((sk) this).field_g >= var4_int) {
                        if (var5 > 0) {
                          if ((long)var5 <= ((sk) this).field_i.b(param0 ^ 200000029) / 520L) {
                            if (param0 == -30) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var4_int <= var7) {
                                  stackOut_53_0 = (byte[]) var6;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                                  stackIn_55_0 = stackOut_54_0;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      ((sk) this).field_i.a((long)(520 * var5), 0);
                                      var9 = -var7 + var4_int;
                                      if (param1 > 65535) {
                                        L3: {
                                          if (var9 <= 510) {
                                            break L3;
                                          } else {
                                            var9 = 510;
                                            break L3;
                                          }
                                        }
                                        var14 = 10;
                                        ((sk) this).field_i.a(cf.field_q, var9 - -var14, 0, (byte) 112);
                                        var10 = (255 & cf.field_q[3]) + (cf.field_q[2] << 8 & 65280) + (cf.field_q[0] << 24 & -16777216) - -((cf.field_q[1] & 255) << 16);
                                        var12 = (65280 & cf.field_q[7] << 8) + ((255 & cf.field_q[6]) << 16) - -(cf.field_q[8] & 255);
                                        var13 = cf.field_q[9] & 255;
                                        var11 = (cf.field_q[5] & 255) + ((255 & cf.field_q[4]) << 8);
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
                                        ((sk) this).field_i.a(cf.field_q, var14 + var9, 0, (byte) 56);
                                        var13 = 255 & cf.field_q[7];
                                        var10 = ((255 & cf.field_q[0]) << 8) - -(cf.field_q[1] & 255);
                                        var11 = (cf.field_q[3] & 255) + (cf.field_q[2] << 8 & 65280);
                                        var12 = (255 & cf.field_q[6]) + ((255 & cf.field_q[4]) << 16) + (cf.field_q[5] << 8 & 65280);
                                        break L2;
                                      }
                                    }
                                    if (param1 == var10) {
                                      if (var8 == var11) {
                                        if (var13 == ((sk) this).field_d) {
                                          if (var12 >= 0) {
                                            if (((sk) this).field_i.b(-200000001) / 520L >= (long)var12) {
                                              var15 = var14 + var9;
                                              var8++;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var5 = var12;
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = cf.field_q[var16];
                                                  var16++;
                                                  continue L5;
                                                }
                                              }
                                            } else {
                                              stackOut_46_0 = null;
                                              stackIn_47_0 = stackOut_46_0;
                                              stackOut_47_0 = stackIn_47_0;
                                              stackIn_48_0 = stackOut_47_0;
                                              return (byte[]) (Object) stackIn_48_0;
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          stackOut_40_0 = null;
                                          stackIn_41_0 = stackOut_40_0;
                                          stackOut_41_0 = stackIn_41_0;
                                          stackIn_42_0 = stackOut_41_0;
                                          return (byte[]) (Object) stackIn_42_0;
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
                              stackOut_18_0 = null;
                              stackIn_19_0 = stackOut_18_0;
                              stackOut_19_0 = stackIn_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              return (byte[]) (Object) stackIn_20_0;
                            }
                          } else {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            return (byte[]) (Object) stackIn_16_0;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        stackOut_9_0 = stackIn_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        return (byte[]) (Object) stackIn_10_0;
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
                stackOut_56_0 = null;
                stackIn_57_0 = stackOut_56_0;
                return (byte[]) (Object) stackIn_57_0;
              }
              return stackIn_55_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.awt.Frame a(int param0, ie param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        nl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        nl[] var10 = null;
        vl var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            if (param1.a((byte) -119)) {
              L1: {
                if (param0 != 0) {
                  break L1;
                } else {
                  int discarded$2 = 37956674;
                  var10 = mn.a(param1);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (param3 != var10[var8].field_k) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
              var11 = param1.a(0, 0, param3, param5, param0);
              L4: while (true) {
                if (var11.field_d != 0) {
                  var7 = (java.awt.Frame) var11.field_f;
                  if (var7 != null) {
                    if (var11.field_d == 2) {
                      int discarded$3 = 0;
                      r.a(param1, var7);
                      stackOut_26_0 = null;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    return null;
                  }
                } else {
                  tb.a(false, 10L);
                  continue L4;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("sk.E(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + 10 + 44 + param3 + 44 + 0 + 44 + param5 + 41);
        }
        return (java.awt.Frame) (Object) stackIn_27_0;
    }

    final static void a(byte param0, oh param1) {
        if (param0 < 104) {
            return;
        }
        try {
            nm.b((byte) 96);
            ra.a(param1.field_C, param1.field_t, param1.field_F);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "sk.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final String toString() {
        return "" + ((sk) this).field_d;
    }

    public static void c() {
        field_b = null;
        field_f = null;
        field_a = null;
        field_h = null;
    }

    final static hm a(byte param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        hm stackIn_6_0 = null;
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
        hm stackOut_5_0 = null;
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
              var4_long = 0L;
              var6 = null;
              if (-1 == param1.indexOf('@')) {
                var7 = (CharSequence) (Object) param1;
                var4_long = il.a(-23718, var7);
                break L1;
              } else {
                var6 = (Object) (Object) param1;
                break L1;
              }
            }
            stackOut_5_0 = ug.a(var4_long, (String) var6, false, param3, -6336);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("sk.G(").append(-79).append(44);
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void b() {
        RuntimeException var1 = null;
        gd var1_ref = null;
        el var1_ref2 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TetraLink.field_J;
        try {
          L0: {
            var1_ref = (gd) (Object) gl.field_p.c(false);
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (el) (Object) jl.field_a.c(false);
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (gd) (Object) ui.field_d.c(false);
                    L3: while (true) {
                      if (var1_ref == null) {
                        var1_int = 0;
                        break L0;
                      } else {
                        L4: {
                          if (0 >= var1_ref.field_Sb) {
                            break L4;
                          } else {
                            var1_ref.field_Sb = var1_ref.field_Sb - 1;
                            if (var1_ref.field_Sb == 0) {
                              var1_ref.field_Xb = 0;
                              if (var1_ref.d((byte) -1)) {
                                var1_ref.b(false);
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              var1_ref = (gd) (Object) ui.field_d.a((byte) -70);
                              continue L3;
                            }
                          }
                        }
                        var1_ref = (gd) (Object) ui.field_d.a((byte) -70);
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (var1_ref2.field_Ub > 0) {
                        var1_ref2.field_Ub = var1_ref2.field_Ub - 1;
                        if (var1_ref2.field_Ub != 0) {
                          break L5;
                        } else {
                          var1_ref2.field_gc = 0;
                          if (var1_ref2.h(-597)) {
                            var1_ref2.b(false);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var1_ref2 = (el) (Object) jl.field_a.a((byte) -70);
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (var1_ref.field_Sb > 0) {
                    var1_ref.field_Sb = var1_ref.field_Sb - 1;
                    if (var1_ref.field_Sb == 0) {
                      var1_ref.field_Xb = 0;
                      if (!var1_ref.d((byte) -1)) {
                        break L6;
                      } else {
                        var1_ref.b(false);
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var1_ref = (gd) (Object) gl.field_p.a((byte) -70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "sk.I(" + -117 + 41);
        }
    }

    sk(int param0, p param1, p param2, int param3) {
        ((sk) this).field_i = null;
        ((sk) this).field_g = 65000;
        ((sk) this).field_e = null;
        try {
            ((sk) this).field_e = param2;
            ((sk) this).field_g = param3;
            ((sk) this).field_d = param0;
            ((sk) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "sk.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static String a(String[] args, String param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param2 > 118) {
                break L1;
              } else {
                field_c = -116;
                break L1;
              }
            }
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L2: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = 2 + var6_int;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3_int) {
                      break L4;
                    } else {
                      if (!fd.a(param1.charAt(var5), (byte) 112)) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int + 2, var5);
                  int discarded$7 = 10;
                  if (!ni.a((CharSequence) (Object) var7_ref_String)) {
                    continue L2;
                  } else {
                    if (var5 >= var3_int) {
                      continue L2;
                    } else {
                      if (62 == param1.charAt(var5)) {
                        var5++;
                        int discarded$8 = 10;
                        var8 = rc.a((CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (args[var8].length() - (-var6_int + var5));
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L5: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (var8 < 0) {
                    StringBuilder discarded$9 = var6.append(param1.substring(var7));
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    var5 = var8 - -2;
                    L6: while (true) {
                      L7: {
                        if (var3_int <= var5) {
                          break L7;
                        } else {
                          if (!fd.a(param1.charAt(var5), (byte) 115)) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param1.substring(2 + var8, var5);
                      int discarded$10 = 10;
                      if (ni.a((CharSequence) (Object) var9)) {
                        if (var5 >= var3_int) {
                          continue L5;
                        } else {
                          if (param1.charAt(var5) != 62) {
                            continue L5;
                          } else {
                            var5++;
                            int discarded$11 = 10;
                            var10 = rc.a((CharSequence) (Object) var9);
                            StringBuilder discarded$12 = var6.append(param1.substring(var7, var8));
                            StringBuilder discarded$13 = var6.append(args[var10]);
                            var7 = var5;
                            continue L5;
                          }
                        }
                      } else {
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("sk.D(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (args == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
        return stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 256;
        field_b = new int[]{100, 100, 100, 100, 200, 100, 100, 200};
    }
}
