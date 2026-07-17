/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm extends le {
    static String field_q;
    private int field_o;
    private short[] field_k;
    private int field_i;
    private byte[] field_j;
    private int field_n;
    private int field_l;
    private int field_p;
    private int field_m;

    final void c(byte param0) {
        ((vm) this).field_j = ihb.a((byte) 36, ((vm) this).field_l);
        this.d(30866);
        if (param0 > -35) {
            Object var3 = null;
            ((vm) this).a(-21, 74, (ds) null);
        }
    }

    public vm() {
        super(0, true);
        ((vm) this).field_j = new byte[512];
        ((vm) this).field_o = 2;
        ((vm) this).field_l = 0;
        ((vm) this).field_k = new short[512];
        ((vm) this).field_i = 2048;
        ((vm) this).field_n = 1;
        ((vm) this).field_m = 5;
        ((vm) this).field_p = 5;
    }

    private final void d(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        Random var5 = new Random((long)((vm) this).field_l);
        Random var2 = var5;
        ((vm) this).field_k = new short[512];
        if (!(((vm) this).field_i <= 0)) {
            for (var3 = 0; 512 > var3; var3++) {
                ((vm) this).field_k[var3] = (short)hob.a(var5, ((vm) this).field_i, 120);
            }
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  ((vm) this).field_l = param2.e((byte) -127);
                  break L1;
                } else {
                  if (var4_int == 2) {
                    ((vm) this).field_i = param2.e(1869);
                    break L1;
                  } else {
                    if (var4_int != 3) {
                      if (var4_int == 4) {
                        ((vm) this).field_n = param2.e((byte) -97);
                        break L1;
                      } else {
                        if (var4_int == 5) {
                          ((vm) this).field_m = param2.e((byte) -97);
                          break L1;
                        } else {
                          if (var4_int == 6) {
                            ((vm) this).field_p = param2.e((byte) -87);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    } else {
                      ((vm) this).field_o = param2.e((byte) -108);
                      break L1;
                    }
                  }
                }
              } else {
                int dupTemp$1 = param2.e((byte) -123);
                ((vm) this).field_p = dupTemp$1;
                ((vm) this).field_m = dupTemp$1;
                break L1;
              }
            }
            L2: {
              if (param1 < -60) {
                break L2;
              } else {
                ((vm) this).field_l = -121;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("vm.F(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        byte[] stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        byte[] stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        byte[] stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        double stackIn_38_0 = 0.0;
        double stackIn_39_0 = 0.0;
        double stackIn_40_0 = 0.0;
        int stackIn_40_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        byte[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        byte[] stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        byte[] stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        byte[] stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        double stackOut_37_0 = 0.0;
        double stackOut_39_0 = 0.0;
        int stackOut_39_1 = 0;
        double stackOut_38_0 = 0.0;
        int stackOut_38_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var19 = VoidHunters.field_G;
          if (param1) {
            break L0;
          } else {
            ((vm) this).c((byte) 33);
            break L0;
          }
        }
        L1: {
          var3 = ((vm) this).field_f.a((byte) 118, param0);
          if (!((vm) this).field_f.field_e) {
            break L1;
          } else {
            var4 = 2048 - -(sj.field_p[param0] * ((vm) this).field_p);
            var5 = var4 >> 12;
            var6 = var5 + 1;
            var14 = 0;
            L2: while (true) {
              if (~hob.field_d >= ~var14) {
                break L1;
              } else {
                woa.field_b = 2147483647;
                qd.field_b = 2147483647;
                fd.field_q = 2147483647;
                hi.field_b = 2147483647;
                var15 = 2048 - -(grb.field_l[var14] * ((vm) this).field_m);
                var16 = var15 >> 12;
                var17 = var16 - -1;
                var8 = var5 + -1;
                L3: while (true) {
                  if (~var6 > ~var8) {
                    L4: {
                      var18 = ((vm) this).field_o;
                      if (0 == var18) {
                        var3[var14] = fd.field_q;
                        break L4;
                      } else {
                        if (var18 == 1) {
                          var3[var14] = hi.field_b;
                          break L4;
                        } else {
                          if (var18 != 3) {
                            if (4 != var18) {
                              if (2 == var18) {
                                var3[var14] = -fd.field_q + hi.field_b;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              var3[var14] = woa.field_b;
                              break L4;
                            }
                          } else {
                            var3[var14] = qd.field_b;
                            break L4;
                          }
                        }
                      }
                    }
                    var14++;
                    continue L2;
                  } else {
                    L5: {
                      stackOut_7_0 = ((vm) this).field_j;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (~var8 > ~((vm) this).field_p) {
                        stackOut_9_0 = (byte[]) (Object) stackIn_9_0;
                        stackOut_9_1 = var8;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L5;
                      } else {
                        stackOut_8_0 = (byte[]) (Object) stackIn_8_0;
                        stackOut_8_1 = var8 + -((vm) this).field_p;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L5;
                      }
                    }
                    var12 = stackIn_10_0[stackIn_10_1 & 255] & 255;
                    var7 = var16 - 1;
                    L6: while (true) {
                      if (var7 > var17) {
                        var8++;
                        continue L3;
                      } else {
                        L7: {
                          stackOut_12_0 = 2;
                          stackOut_12_1 = 255;
                          stackOut_12_2 = ((vm) this).field_j;
                          stackOut_12_3 = 255;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_14_3 = stackOut_12_3;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          stackIn_13_3 = stackOut_12_3;
                          if (~((vm) this).field_m >= ~var7) {
                            stackOut_14_0 = stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = (byte[]) (Object) stackIn_14_2;
                            stackOut_14_3 = stackIn_14_3;
                            stackOut_14_4 = -((vm) this).field_m + var7;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            break L7;
                          } else {
                            stackOut_13_0 = stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = (byte[]) (Object) stackIn_13_2;
                            stackOut_13_3 = stackIn_13_3;
                            stackOut_13_4 = var7;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            break L7;
                          }
                        }
                        L8: {
                          var13 = stackIn_15_0 * (stackIn_15_1 & stackIn_15_2[stackIn_15_3 & stackIn_15_4 + var12]);
                          int incrementValue$1 = var13;
                          var13++;
                          var9 = -((vm) this).field_k[incrementValue$1] - ((var7 << 12) - var15);
                          var10 = var4 - ((var8 << 12) + ((vm) this).field_k[var13]);
                          var18 = ((vm) this).field_n;
                          if (var18 != 1) {
                            if (var18 != 3) {
                              if (var18 == 4) {
                                L9: {
                                  if (0 > var9) {
                                    stackOut_36_0 = -var9;
                                    stackIn_37_0 = stackOut_36_0;
                                    break L9;
                                  } else {
                                    stackOut_35_0 = var9;
                                    stackIn_37_0 = stackOut_35_0;
                                    break L9;
                                  }
                                }
                                L10: {
                                  var9 = (int)(Math.sqrt((double)((float)stackIn_37_0 / 4096.0f)) * 4096.0);
                                  stackOut_37_0 = 4096.0;
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_38_0 = stackOut_37_0;
                                  if (var10 < 0) {
                                    stackOut_39_0 = stackIn_39_0;
                                    stackOut_39_1 = -var10;
                                    stackIn_40_0 = stackOut_39_0;
                                    stackIn_40_1 = stackOut_39_1;
                                    break L10;
                                  } else {
                                    stackOut_38_0 = stackIn_38_0;
                                    stackOut_38_1 = var10;
                                    stackIn_40_0 = stackOut_38_0;
                                    stackIn_40_1 = stackOut_38_1;
                                    break L10;
                                  }
                                }
                                var10 = (int)(stackIn_40_0 * Math.sqrt((double)((float)stackIn_40_1 / 4096.0f)));
                                var11 = var9 - -var10;
                                var11 = var11 * var11 >> 12;
                                break L8;
                              } else {
                                if (5 == var18) {
                                  var10 = var10 * var10;
                                  var9 = var9 * var9;
                                  var11 = (int)(4096.0 * Math.sqrt(Math.sqrt((double)((float)(var9 + var10) / 16777216.0f))));
                                  break L8;
                                } else {
                                  if (var18 != 2) {
                                    var11 = (int)(Math.sqrt((double)((float)(var9 * var9 - -(var10 * var10)) / 16777216.0f)) * 4096.0);
                                    break L8;
                                  } else {
                                    L11: {
                                      if (var10 >= 0) {
                                        stackOut_44_0 = var10;
                                        stackIn_45_0 = stackOut_44_0;
                                        break L11;
                                      } else {
                                        stackOut_43_0 = -var10;
                                        stackIn_45_0 = stackOut_43_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      stackOut_45_0 = stackIn_45_0;
                                      stackIn_47_0 = stackOut_45_0;
                                      stackIn_46_0 = stackOut_45_0;
                                      if (var9 < 0) {
                                        stackOut_47_0 = stackIn_47_0;
                                        stackOut_47_1 = -var9;
                                        stackIn_48_0 = stackOut_47_0;
                                        stackIn_48_1 = stackOut_47_1;
                                        break L12;
                                      } else {
                                        stackOut_46_0 = stackIn_46_0;
                                        stackOut_46_1 = var9;
                                        stackIn_48_0 = stackOut_46_0;
                                        stackIn_48_1 = stackOut_46_1;
                                        break L12;
                                      }
                                    }
                                    var11 = stackIn_48_0 + stackIn_48_1;
                                    break L8;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (var9 >= 0) {
                                  stackOut_26_0 = var9;
                                  stackIn_27_0 = stackOut_26_0;
                                  break L13;
                                } else {
                                  stackOut_25_0 = -var9;
                                  stackIn_27_0 = stackOut_25_0;
                                  break L13;
                                }
                              }
                              L14: {
                                var9 = stackIn_27_0;
                                if (0 > var10) {
                                  stackOut_29_0 = -var10;
                                  stackIn_30_0 = stackOut_29_0;
                                  break L14;
                                } else {
                                  stackOut_28_0 = var10;
                                  stackIn_30_0 = stackOut_28_0;
                                  break L14;
                                }
                              }
                              L15: {
                                var10 = stackIn_30_0;
                                if (var10 >= var9) {
                                  stackOut_32_0 = var10;
                                  stackIn_33_0 = stackOut_32_0;
                                  break L15;
                                } else {
                                  stackOut_31_0 = var9;
                                  stackIn_33_0 = stackOut_31_0;
                                  break L15;
                                }
                              }
                              var11 = stackIn_33_0;
                              break L8;
                            }
                          } else {
                            var11 = var9 * var9 - -(var10 * var10) >> 12;
                            break L8;
                          }
                        }
                        L16: {
                          if (fd.field_q > var11) {
                            woa.field_b = qd.field_b;
                            qd.field_b = hi.field_b;
                            hi.field_b = fd.field_q;
                            fd.field_q = var11;
                            break L16;
                          } else {
                            if (~var11 <= ~hi.field_b) {
                              if (~qd.field_b >= ~var11) {
                                if (~var11 <= ~woa.field_b) {
                                  break L16;
                                } else {
                                  woa.field_b = var11;
                                  break L16;
                                }
                              } else {
                                woa.field_b = qd.field_b;
                                qd.field_b = var11;
                                break L16;
                              }
                            } else {
                              woa.field_b = qd.field_b;
                              qd.field_b = hi.field_b;
                              hi.field_b = var11;
                              break L16;
                            }
                          }
                        }
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    public static void e(byte param0) {
        if (param0 != 110) {
            vm.e((byte) -75);
        }
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Defend your base with blueprint ships. No respawns.";
    }
}
