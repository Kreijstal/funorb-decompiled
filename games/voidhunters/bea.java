/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bea implements ntb {
    static float[] field_f;
    int[] field_c;
    private dmb[] field_b;
    private static String[] field_a;
    int field_d;
    static int field_e;

    private final int a(rsb param0, int param1, int param2, Random param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        tfa var7_ref_tfa = null;
        int var7 = 0;
        tfa var8 = null;
        int var9 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_19_0 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param2 == 13145) {
                break L1;
              } else {
                this.a(false, -19, -17, false, (pe) null, false, (Random) null);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param0.field_c.length <= var6) {
                    break L4;
                  } else {
                    var7_ref_tfa = param0.a(var6, (byte) 59);
                    stackOut_6_0 = var7_ref_tfa.field_a;
                    stackIn_20_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_7_0) {
                            break L6;
                          } else {
                            if (foa.field_p != 1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (~var7_ref_tfa.field_h != ~param1) {
                          break L5;
                        } else {
                          var5_int++;
                          break L5;
                        }
                      }
                      var6++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_19_0 = -1;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              }
              if (stackIn_20_0 > ~var5_int) {
                var6 = hob.a(param3, var5_int, 118);
                var5_int = 0;
                var7 = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (~param0.field_c.length >= ~var7) {
                        break L9;
                      } else {
                        var8 = param0.a(var7, (byte) 59);
                        stackOut_25_0 = var8.field_a;
                        stackIn_45_0 = stackOut_25_0 ? 1 : 0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var9 != 0) {
                          break L8;
                        } else {
                          L10: {
                            L11: {
                              if (stackIn_26_0) {
                                break L11;
                              } else {
                                if (foa.field_p != 1) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (param1 != var8.field_h) {
                              break L10;
                            } else {
                              if (var5_int == var6) {
                                stackOut_40_0 = var7;
                                stackIn_41_0 = stackOut_40_0;
                                return stackIn_41_0;
                              } else {
                                var5_int++;
                                break L10;
                              }
                            }
                          }
                          var7++;
                          if (var9 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_44_0 = -1;
                    stackIn_45_0 = stackOut_44_0;
                    break L8;
                  }
                  break L0;
                }
              } else {
                stackOut_21_0 = -1;
                stackIn_22_0 = stackOut_21_0;
                return stackIn_22_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var5;
            stackOut_46_1 = new StringBuilder().append("bea.KA(");
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L12;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L12;
            }
          }
          L13: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param3 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L13;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
        return stackIn_45_0;
    }

    private final int[][] a(int param0, int param1, int param2, boolean param3) {
        int[][] var5 = null;
        RuntimeException var5_ref = null;
        int[][] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_e = 13;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3) {
                  break L3;
                } else {
                  var5 = new int[][]{new int[8]};
                  if (VoidHunters.field_G == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var5 = new int[][]{new int[6]};
              break L2;
            }
            stackOut_6_0 = (int[][]) var5;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var5_ref, "bea.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    private final int[] a(int param0, Random param1, byte param2, int[][] param3) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object stackIn_14_0 = null;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int[] stackIn_46_0 = null;
        int[] stackIn_50_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int[] stackOut_45_0 = null;
        int[] stackOut_49_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_array = new int[]{ku.field_c, wj.field_o, apb.field_a, ltb.field_p};
              var6 = cg.field_r;
              if (((bea) this).field_c[18] <= 0) {
                break L1;
              } else {
                var5_array[1] = var5_array[1] + var6;
                break L1;
              }
            }
            L2: {
              if (((bea) this).field_c[19] > 0) {
                var5_array[0] = var5_array[0] + var6;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = pla.a(param0, -4) ? 1 : 0;
              if (var7 != 0) {
                var5_array[2] = 0;
                break L3;
              } else {
                break L3;
              }
            }
            var8 = 0;
            if (param2 > 41) {
              var9 = 20;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var9 > 28) {
                      break L6;
                    } else {
                      var8 = var8 + ((bea) this).field_c[var9];
                      var9++;
                      if (var16 != 0) {
                        break L5;
                      } else {
                        if (var16 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var5_array[2] = var5_array[2] + Math.min(var8, 5);
                  var9 = this.a(var5_array, 262144);
                  break L5;
                }
                var10 = this.a(param1, param3, var5_array, var9, 101);
                var11 = 0;
                var12 = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (~var10.length >= ~var12) {
                        break L9;
                      } else {
                        stackOut_24_0 = var10[var12];
                        stackOut_24_1 = 2;
                        stackIn_32_0 = stackOut_24_0;
                        stackIn_32_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (var16 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (stackIn_25_0 == stackIn_25_1) {
                              var11++;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var12++;
                          if (var16 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var12 = 2;
                    stackOut_31_0 = 13;
                    stackOut_31_1 = param0;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    break L8;
                  }
                  L11: {
                    if (stackIn_32_0 != stackIn_32_1) {
                      break L11;
                    } else {
                      var12 = 8;
                      break L11;
                    }
                  }
                  L12: {
                    L13: {
                      if (~var12 >= ~var11) {
                        break L13;
                      } else {
                        L14: {
                          if (var7 == 0) {
                            break L14;
                          } else {
                            if (var8 != 0) {
                              break L14;
                            } else {
                              break L13;
                            }
                          }
                        }
                        var13 = var12 + -var11;
                        var14 = 0;
                        L15: while (true) {
                          if (var14 >= var13) {
                            break L13;
                          } else {
                            var15 = hob.a(param1, param3.length, 120);
                            stackOut_45_0 = (int[]) var10;
                            stackIn_50_0 = stackOut_45_0;
                            stackIn_46_0 = stackOut_45_0;
                            if (var16 != 0) {
                              break L12;
                            } else {
                              stackIn_46_0[var15] = 2;
                              var14++;
                              if (var16 == 0) {
                                continue L15;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_49_0 = (int[]) var10;
                    stackIn_50_0 = stackOut_49_0;
                    break L12;
                  }
                  break L0;
                }
              }
            } else {
              stackOut_13_0 = null;
              stackIn_14_0 = stackOut_13_0;
              return (int[]) (Object) stackIn_14_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5;
            stackOut_51_1 = new StringBuilder().append("bea.NA(").append(param0).append(',');
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L16;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L16;
            }
          }
          L17: {
            stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param2).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L17;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L17;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ')');
        }
        return stackIn_50_0;
    }

    private final void a(pe param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        bba var8 = null;
        bba var9 = null;
        cqb var10 = null;
        bba var11 = null;
        cqb var12 = null;
        bba var13 = null;
        vp var14 = null;
        uoa var15 = null;
        bba var16 = null;
        vp var17 = null;
        uoa var18 = null;
        nbb var19 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var5_int = 0;
            var6 = 1;
            var7 = 15000;
            if (param1 == 5985) {
              var8 = new bba();
              var8.a((byte) -105, (wm) (Object) new dab(0));
              var8.a((rna) (Object) new pob(var5_int, var7), true);
              var8.a((rna) (Object) new cf(var5_int, 1), true);
              var8.a((rna) (Object) new pob(var6, var7), true);
              var8.a((rna) (Object) new cf(var6, 2), true);
              param0.a(var8, param1 + -6023);
              var9 = new bba();
              var10 = new cqb(var6, 1);
              ((wm) (Object) var10).field_a = true;
              var9.a((byte) -125, (wm) (Object) var10);
              var9.a((rna) (Object) new ika(0), true);
              param0.a(var9, -38);
              var11 = new bba();
              var12 = new cqb(var5_int, 1);
              ((wm) (Object) var12).field_a = true;
              var11.a((byte) -111, (wm) (Object) var12);
              var11.a((rna) (Object) new ika(1), true);
              param0.a(var11, -38);
              var13 = new bba();
              var14 = new vp(0, 47);
              var15 = new uoa(var6, -1);
              var13.a((byte) -102, (wm) (Object) var14);
              var13.a((rna) (Object) var15, true);
              param0.a(var13, -38);
              var16 = new bba();
              var17 = new vp(1, 47);
              var18 = new uoa(var5_int, -1);
              var16.a((byte) -122, (wm) (Object) var17);
              var16.a((rna) (Object) var18, true);
              param0.a(var16, -38);
              var19 = new nbb(new ml(47), false);
              var19.a(0, 0, (byte) 89);
              param0.a(var19, (byte) 100);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("bea.Q(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, Random param1, rsb param2, byte param3, int param4) {
        RuntimeException runtimeException = null;
        pe var6 = null;
        sg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bba var11 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var6 = param2.field_g;
              var7 = t.a(4, (byte) 101);
              var7.a(param0, param4, (byte) -68);
              var8 = 1;
              var7.h(17704, var8);
              var9 = this.a(param2, var8, 13145, param1);
              var7.g(var9, 98);
              if (var9 != -1) {
                break L1;
              } else {
                var7.a(new aoa(), 4);
                break L1;
              }
            }
            var10 = -13 % ((22 - param3) / 62);
            var7.a(4096, -17);
            var6.a(var7, (byte) 115);
            var11 = new bba();
            var11.a((byte) -108, (wm) (Object) new cc(var7.c(false)));
            var11.a((rna) (Object) new ika(0), true);
            var6.a(var11, -38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("bea.DA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = 0;
              if (param1 == 262144) {
                break L1;
              } else {
                bea.a(73);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 >= param0.length) {
                    break L4;
                  } else {
                    stackOut_5_0 = var3_int + param0[var4];
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      var3_int = stackIn_6_0;
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_7_0 = var3_int;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("bea.MA(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final static asb a(int param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        asb stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        asb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 1) {
              stackOut_3_0 = mla.a(true, false, -61, false, param1, 1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (asb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "bea.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(Random param0, int param1, pe param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        sg var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_58_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var24 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 > 58) {
                break L1;
              } else {
                this.a((rsb) null, (Random) null, (pe) null, 72);
                break L1;
              }
            }
            L2: {
              var4_int = param2.g((byte) -122) / 2;
              var5 = param2.m(1) / 2;
              var6 = hob.a(param0, 2, 118);
              var7 = ((bea) this).field_c[29];
              var8 = ((bea) this).field_c[30];
              if (var7 > 0) {
                var6 = var6 + var7;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var8 <= 0) {
                break L3;
              } else {
                var6 = var6 - var8;
                break L3;
              }
            }
            L4: {
              if (var6 <= 4) {
                break L4;
              } else {
                var6 = 4;
                break L4;
              }
            }
            L5: {
              if (0 > var6) {
                var6 = 0;
                break L5;
              } else {
                break L5;
              }
            }
            var9 = 0;
            L6: while (true) {
              stackOut_17_0 = ~var9;
              stackIn_18_0 = stackOut_17_0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (stackIn_18_0 <= ~var6) {
                      break L9;
                    } else {
                      var10 = 0;
                      var11 = 0;
                      var12 = 262144;
                      if (var24 != 0) {
                        break L8;
                      } else {
                        var13 = 0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (1000 <= var13) {
                                break L12;
                              } else {
                                var10 = hob.a(param0, var4_int, 118) - var4_int / 2;
                                var11 = -(var5 / 2) + hob.a(param0, var5, 122);
                                stackOut_22_0 = param2.a(var12 - -cab.field_p, var11, false, var10);
                                stackIn_30_0 = stackOut_22_0 ? 1 : 0;
                                stackIn_23_0 = stackOut_22_0;
                                if (var24 != 0) {
                                  break L11;
                                } else {
                                  if (!stackIn_23_0) {
                                    break L12;
                                  } else {
                                    var13++;
                                    if (var24 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            var13 = vob.a(param0, (byte) 72);
                            stackOut_29_0 = 1 + hob.a(param0, 3, 127);
                            stackIn_30_0 = stackOut_29_0;
                            break L11;
                          }
                          var14 = stackIn_30_0;
                          var15 = 0;
                          L13: while (true) {
                            L14: {
                              if (var15 >= 2) {
                                break L14;
                              } else {
                                stackOut_32_0 = 0;
                                stackIn_18_0 = stackOut_32_0;
                                stackIn_33_0 = stackOut_32_0;
                                if (var24 != 0) {
                                  continue L7;
                                } else {
                                  var16 = stackIn_33_0;
                                  L15: while (true) {
                                    stackOut_34_0 = ~var16;
                                    stackOut_34_1 = ~var14;
                                    stackIn_35_0 = stackOut_34_0;
                                    stackIn_35_1 = stackOut_34_1;
                                    L16: while (true) {
                                      L17: {
                                        L18: {
                                          if (stackIn_35_0 <= stackIn_35_1) {
                                            break L18;
                                          } else {
                                            var17 = t.a(var13, (byte) 101);
                                            var17.h(17704, 2);
                                            var17.a(new aoa(), 4);
                                            stackOut_36_0 = 0;
                                            stackIn_59_0 = stackOut_36_0;
                                            stackIn_37_0 = stackOut_36_0;
                                            if (var24 != 0) {
                                              break L17;
                                            } else {
                                              var18 = stackIn_37_0;
                                              L19: while (true) {
                                                L20: {
                                                  if (var18 >= 1000) {
                                                    break L20;
                                                  } else {
                                                    var19 = hob.a(param0, 8192, 117);
                                                    var20 = hob.a(param0, var12, 127) >> 573153480;
                                                    var21 = var20 * (fc.a(var19, (byte) 81) >> 199121416) + var10;
                                                    stackOut_39_0 = ~var21;
                                                    stackOut_39_1 = ~-var4_int;
                                                    stackIn_35_0 = stackOut_39_0;
                                                    stackIn_35_1 = stackOut_39_1;
                                                    stackIn_40_0 = stackOut_39_0;
                                                    stackIn_40_1 = stackOut_39_1;
                                                    if (var24 != 0) {
                                                      continue L16;
                                                    } else {
                                                      L21: {
                                                        if (stackIn_40_0 <= stackIn_40_1) {
                                                          break L21;
                                                        } else {
                                                          var21 = -var4_int;
                                                          break L21;
                                                        }
                                                      }
                                                      L22: {
                                                        var22 = var11 + var20 * (eu.a(var19, 56) >> 188371304);
                                                        if (var21 <= var4_int) {
                                                          break L22;
                                                        } else {
                                                          var21 = var4_int;
                                                          break L22;
                                                        }
                                                      }
                                                      L23: {
                                                        if (~-var5 < ~var22) {
                                                          var22 = -var5;
                                                          break L23;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                      L24: {
                                                        if (var5 >= var22) {
                                                          break L24;
                                                        } else {
                                                          var22 = var5;
                                                          break L24;
                                                        }
                                                      }
                                                      L25: {
                                                        var17.a(var21, var22, (byte) -55);
                                                        var23 = hob.a(param0, 8192, 124);
                                                        var17.a(var23, -21);
                                                        var17.i(0);
                                                        if (param2.a(-11924, (anb) (Object) var17)) {
                                                          break L25;
                                                        } else {
                                                          if (var24 == 0) {
                                                            break L20;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      var18++;
                                                      if (var24 == 0) {
                                                        continue L19;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                }
                                                param2.a(var17, (byte) 79);
                                                var16++;
                                                if (var24 == 0) {
                                                  continue L15;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var10 = -var10;
                                        stackOut_58_0 = -var11;
                                        stackIn_59_0 = stackOut_58_0;
                                        break L17;
                                      }
                                      var11 = stackIn_59_0;
                                      var15++;
                                      if (var24 == 0) {
                                        continue L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var9++;
                            if (var24 == 0) {
                              continue L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L8;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var4 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var4;
            stackOut_62_1 = new StringBuilder().append("bea.EB(");
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L26;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L26;
            }
          }
          L27: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param1).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param2 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L27;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L27;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ')');
        }
    }

    private final int[] a(int param0, int param1, int[] param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var4 = new int[2 * param0];
              cua.a(param2, 0, var4, 0, param2.length);
              param2 = var4;
              if (param1 < -83) {
                break L1;
              } else {
                ((bea) this).field_c = null;
                break L1;
              }
            }
            stackOut_3_0 = (int[]) param2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("bea.FB(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, Random param1, rsb param2) {
        RuntimeException var4 = null;
        pe var4_ref = null;
        sg[] var5 = null;
        int var6_int = 0;
        ij var6 = null;
        rdb var7 = null;
        sg var7_ref = null;
        una var7_ref2 = null;
        int var8_int = 0;
        bba[] var8 = null;
        int var9 = 0;
        bba var10 = null;
        wm[] var11 = null;
        wm[] var12 = null;
        rna[] var12_array = null;
        int var13_int = 0;
        rna[] var13 = null;
        wm var14_ref_wm = null;
        int var14 = 0;
        rna var15 = null;
        cf var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_37_0 = false;
        boolean stackIn_63_0 = false;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        boolean stackOut_36_0 = false;
        boolean stackOut_62_0 = false;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            var4_ref = param2.field_g;
            var5 = var4_ref.d(1000);
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (~var5.length >= ~var6_int) {
                  break L2;
                } else {
                  L3: {
                    var7_ref = var5[var6_int];
                    if (var7_ref != null) {
                      var8_int = mjb.b(21957, var7_ref.q((byte) 91));
                      var7_ref.h(param0 + 17705, var8_int);
                      if (var7_ref.o((byte) -117) < 0) {
                        break L3;
                      } else {
                        var9 = this.a(param2, var8_int, 13145, param1);
                        var7_ref.g(var9, 98);
                        if (-1 == var9) {
                          var7_ref.a(new aoa(), param0 ^ -5);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var6_int++;
                  if (var19 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6 = var4_ref.f((byte) 24);
              var7 = (rdb) (Object) var6.d(0);
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var7) {
                      break L6;
                    } else {
                      var7.a(mjb.b(param0 + 21958, var7.d(121)), (byte) -96);
                      var7 = (rdb) (Object) var6.a((byte) 66);
                      if (var19 != 0) {
                        break L5;
                      } else {
                        if (var19 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param0 == -1) {
                    break L5;
                  } else {
                    ((bea) this).field_c = null;
                    break L5;
                  }
                }
                L7: {
                  L8: {
                    var7_ref2 = var4_ref.e(0);
                    if (null == var7_ref2) {
                      break L8;
                    } else {
                      var8 = var7_ref2.b(1);
                      if (var8 != null) {
                        var9 = 0;
                        L9: while (true) {
                          stackOut_26_0 = ~var9;
                          stackIn_27_0 = stackOut_26_0;
                          L10: while (true) {
                            if (stackIn_27_0 <= ~var8.length) {
                              break L8;
                            } else {
                              var10 = var8[var9];
                              var11 = var10.a((byte) -128);
                              if (var19 != 0) {
                                break L7;
                              } else {
                                L11: {
                                  if (var11 != null) {
                                    var12 = var11;
                                    var13_int = 0;
                                    L12: while (true) {
                                      if (var12.length <= var13_int) {
                                        break L11;
                                      } else {
                                        var14_ref_wm = var12[var13_int];
                                        stackOut_36_0 = var14_ref_wm instanceof om;
                                        stackIn_27_0 = stackOut_36_0 ? 1 : 0;
                                        stackIn_37_0 = stackOut_36_0;
                                        if (var19 != 0) {
                                          continue L10;
                                        } else {
                                          L13: {
                                            L14: {
                                              if (stackIn_37_0) {
                                                break L14;
                                              } else {
                                                L15: {
                                                  if (var14_ref_wm instanceof jsb) {
                                                    break L15;
                                                  } else {
                                                    L16: {
                                                      if (!(var14_ref_wm instanceof vp)) {
                                                        break L16;
                                                      } else {
                                                        this.a(var14_ref_wm, var4_ref, 0, param0 ^ -14277);
                                                        if (var19 == 0) {
                                                          break L13;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                    }
                                                    if (!(var14_ref_wm instanceof ih)) {
                                                      break L13;
                                                    } else {
                                                      this.a(var14_ref_wm, var4_ref, 1, param0 ^ -14277);
                                                      if (var19 == 0) {
                                                        break L13;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                                this.a(var14_ref_wm, var4_ref, 0, 14276);
                                                if (var19 == 0) {
                                                  break L13;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            this.a(var14_ref_wm, var4_ref, 0, param0 ^ -14277);
                                            break L13;
                                          }
                                          var13_int++;
                                          if (var19 == 0) {
                                            continue L12;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                                L17: {
                                  var12_array = var10.c((byte) -42);
                                  if (var12_array == null) {
                                    break L17;
                                  } else {
                                    var13 = var12_array;
                                    var14 = 0;
                                    L18: while (true) {
                                      if (var14 >= var13.length) {
                                        break L17;
                                      } else {
                                        var15 = var13[var14];
                                        stackOut_62_0 = var15 instanceof ika;
                                        stackIn_27_0 = stackOut_62_0 ? 1 : 0;
                                        stackIn_63_0 = stackOut_62_0;
                                        if (var19 != 0) {
                                          continue L10;
                                        } else {
                                          L19: {
                                            L20: {
                                              if (!stackIn_63_0) {
                                                break L20;
                                              } else {
                                                this.a(var15, 17333, var4_ref, 0);
                                                if (var19 == 0) {
                                                  break L19;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            if (var15 instanceof cf) {
                                              L21: {
                                                L22: {
                                                  var16 = (cf) (Object) var15;
                                                  var17 = var16.a(1, -106);
                                                  var18 = fq.field_o[var17];
                                                  if (var18 == 0) {
                                                    break L22;
                                                  } else {
                                                    if (var18 != 1) {
                                                      break L21;
                                                    } else {
                                                      var17--;
                                                      if (var19 == 0) {
                                                        break L21;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                }
                                                var17++;
                                                break L21;
                                              }
                                              var16.a(var4_ref, false, 1, var17);
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                          var14++;
                                          if (var19 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var9++;
                                if (var19 == 0) {
                                  continue L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  break L7;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var4 = decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) var4;
            stackOut_85_1 = new StringBuilder().append("bea.O(").append(param0).append(',');
            stackIn_88_0 = stackOut_85_0;
            stackIn_88_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param1 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L23;
            } else {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "{...}";
              stackIn_89_0 = stackOut_86_0;
              stackIn_89_1 = stackOut_86_1;
              stackIn_89_2 = stackOut_86_2;
              break L23;
            }
          }
          L24: {
            stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
            stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',');
            stackIn_92_0 = stackOut_89_0;
            stackIn_92_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param2 == null) {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L24;
            } else {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "{...}";
              stackIn_93_0 = stackOut_90_0;
              stackIn_93_1 = stackOut_90_1;
              stackIn_93_2 = stackOut_90_2;
              break L24;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_93_0, stackIn_93_2 + ')');
        }
    }

    private final int a(byte param0, Random param1, int[][] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = -2147483648;
            var5 = -1;
            if (param0 == 52) {
              var6 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6 >= param2.length) {
                      break L3;
                    } else {
                      var7 = param2[var6];
                      var8 = tf.a(14, -127, var7);
                      stackOut_6_0 = ~var4_int;
                      stackOut_6_1 = ~var8;
                      stackIn_13_0 = stackOut_6_0;
                      stackIn_13_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 <= stackIn_7_1) {
                            break L4;
                          } else {
                            var5 = var6;
                            var4_int = var8;
                            break L4;
                          }
                        }
                        var6++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6 = var5;
                  stackOut_12_0 = var6;
                  stackOut_12_1 = -1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                }
                L5: {
                  if ((stackIn_13_0 ^ stackIn_13_1) != 0) {
                    break L5;
                  } else {
                    var6 = hob.a(param1, param2.length, 125);
                    break L5;
                  }
                }
                stackOut_15_0 = var6;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 21;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("bea.I(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(byte param0, Object param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            Object discarded$3 = wqb.field_e.put(param1, (Object) (Object) new Integer(param2));
            var3_int = -38 / ((param0 - 80) / 33);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("bea.BA(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1, anb[] param2, anb[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param3 != null) {
                    var5_int = 0;
                    L4: while (true) {
                      if (param3.length <= var5_int) {
                        break L3;
                      } else {
                        stackOut_6_0 = ~param0;
                        stackOut_6_1 = ~param3[var5_int].c(false);
                        stackIn_17_0 = stackOut_6_0;
                        stackIn_17_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (stackIn_7_0 == stackIn_7_1) {
                            stackOut_11_0 = param2[var5_int].c(false);
                            stackIn_12_0 = stackOut_11_0;
                            return stackIn_12_0;
                          } else {
                            var5_int++;
                            if (var6 == 0) {
                              continue L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (param1 == 0) {
                  break L1;
                } else {
                  stackOut_15_0 = -55;
                  stackOut_15_1 = -57;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L2;
                }
              }
              bea.a(stackIn_17_0, stackIn_17_1, (mm) null, -12, 46, false, 71, -25);
              break L1;
            }
            stackOut_18_0 = param0;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("bea.IB(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_19_0;
    }

    private final void a(rsb param0, Random param1, pe param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var5_int = param0.field_e.d(6472);
            var6 = qta.a(var5_int, 9) ? 1 : 0;
            this.a(var5_int, false, param2);
            this.a(true, var5_int, param3 ^ 31938, true, param2, var6 != 0, param1);
            param0.field_g.a(0, (bea) this);
            if (param3 == 4581) {
              this.a(var5_int, var6 != 0, param1, param0, 95);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("bea.JA(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    private final anb[] a(rsb param0, anb[] param1, byte param2, Random param3) {
        Object var5 = null;
        int var6 = 0;
        anb var7 = null;
        sg var8 = null;
        nbb var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_22_0 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_21_0 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        Object stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var5 = null;
                if (param1 != null) {
                  var6 = 0;
                  L3: while (true) {
                    if (param1.length <= var6) {
                      break L2;
                    } else {
                      var7 = param1[var6];
                      stackOut_6_0 = var7 instanceof sg;
                      stackIn_22_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var11 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (!stackIn_7_0) {
                              break L5;
                            } else {
                              L6: {
                                var8 = new sg();
                                var7.b((byte) 66, (tv) (Object) var8);
                                var8.field_k.g(0);
                                var8.a(rrb.a(22433, 4096 + var8.e(0)), -29);
                                var8.a(-var8.field_d, -var8.field_e, (byte) 45);
                                var9 = mjb.b(21957, var8.q((byte) 64));
                                var8.h(17704, var9);
                                if (var8.o((byte) -117) < 0) {
                                  break L6;
                                } else {
                                  var10 = this.a(param0, var9, 13145, param3);
                                  var8.g(var10, -97);
                                  if (-1 == var10) {
                                    var8.a(new aoa(), 4);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              param0.field_g.a(var8, (byte) 85);
                              var5 = (Object) (Object) (anb[]) (Object) ija.a((Object) (Object) var8, (Object[]) var5, 0, ebb.field_a);
                              if (var11 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (!(var7 instanceof nbb)) {
                            break L4;
                          } else {
                            var8_ref = new nbb();
                            var7.b((byte) 67, (tv) (Object) var8_ref);
                            var8_ref.a(rrb.a(22433, var8_ref.e(0) + 4096), -93);
                            var8_ref.a(-var8_ref.field_d, -var8_ref.field_e, (byte) -112);
                            param0.field_g.a(var8_ref, (byte) 53);
                            var5 = (Object) (Object) (anb[]) (Object) ija.a((Object) (Object) var8_ref, (Object[]) var5, 0, ebb.field_a);
                            break L4;
                          }
                        }
                        var6++;
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_21_0 = -113 / ((-46 - param2) / 44);
              stackIn_22_0 = stackOut_21_0;
              break L1;
            }
            var6 = stackIn_22_0;
            stackOut_22_0 = var5;
            stackIn_23_0 = stackOut_22_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_24_0 = var5;
            stackOut_24_1 = new StringBuilder().append("bea.TA(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_25_0 = stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_32_0 = stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return (anb[]) (Object) stackIn_23_0;
    }

    private final anb[] a(int param0, int param1, pe param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        bba var8 = null;
        bba var9 = null;
        bba var10 = null;
        bba var11 = null;
        bba var12 = null;
        cqb var13 = null;
        int var14 = 0;
        bba var15 = null;
        cqb var16 = null;
        int var17 = 0;
        int var18 = 0;
        Object var19 = null;
        int var20 = 0;
        sg var21 = null;
        int var22 = 0;
        int var23 = 0;
        anb[] stackIn_4_0 = null;
        anb[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        anb[] stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = 0;
            var6 = 1;
            var7 = 100;
            var8 = new bba();
            var8.a((byte) -119, (wm) (Object) new dab(0));
            var8.a((rna) (Object) new pob(var5_int, 0), true);
            var8.a((rna) (Object) new cf(var5_int, 6), true);
            var8.a((rna) (Object) new pob(var6, 0), true);
            var8.a((rna) (Object) new cf(var6, 7), true);
            param2.a(var8, -38);
            var9 = new bba();
            var9.a((rna) (Object) new pob(var5_int, 0), true);
            var9.a((rna) (Object) new pob(var6, 0), true);
            param2.a(var9, -38);
            var10 = new bba();
            var10.a((byte) -109, (wm) (Object) new ih(-1, 0));
            var10.a((rna) (Object) new tt(var5_int, 0), true);
            param2.a(var10, -38);
            var11 = new bba();
            var11.a((byte) -99, (wm) (Object) new ih(-1, 1));
            var11.a((rna) (Object) new tt(var6, 0), true);
            param2.a(var11, -38);
            var12 = new bba();
            var13 = new cqb(var5_int, var7);
            var12.a((byte) -107, (wm) (Object) var13);
            var14 = -47 % ((10 - param3) / 50);
            var12.a((rna) (Object) new ika(0), true);
            param2.a(var12, -38);
            var15 = new bba();
            var16 = new cqb(var6, var7);
            var15.a((byte) -122, (wm) (Object) var16);
            var15.a((rna) (Object) new ika(1), true);
            param2.a(var15, -38);
            var17 = 4;
            var18 = ar.a(param1 / 4, (byte) 115, param0 / 4) >> -262898040;
            var19 = null;
            var20 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var17 <= var20) {
                    break L3;
                  } else {
                    var21 = rpa.a(2, 1, true);
                    var22 = 2048 * var20 / (var17 + -1) + 2048;
                    var21.a(param1 - -(var18 * (fc.a(var22, (byte) 127) >> 468405896)), (eu.a(var22, 50) >> -1368489688) * var18 + param0, (byte) -95);
                    var21.a(new aoa(), 4);
                    var21.h(17704, 1);
                    param2.a(var21, (byte) 81);
                    stackOut_3_0 = (anb[]) (Object) ija.a((Object) (Object) var21, (Object[]) var19, 0, ebb.field_a);
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var23 != 0) {
                      break L2;
                    } else {
                      var19 = (Object) (Object) stackIn_4_0;
                      var20++;
                      if (var23 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = var19;
                stackIn_6_0 = (anb[]) (Object) stackOut_5_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("bea.HB(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    private final void a(int param0, bba[] param1, cq[] param2, cq[] param3, pe param4, anb[] param5, byte param6, anb[] param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        bba var10 = null;
        bba var11 = null;
        wm[] var12 = null;
        rna[] var13 = null;
        int var14 = 0;
        wm var15 = null;
        rna var15_ref = null;
        ika var16 = null;
        iia var16_ref = null;
        cc var16_ref2 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_28_0 = 0;
        boolean stackIn_31_0 = false;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_27_0 = 0;
        boolean stackOut_30_0 = false;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            if (param6 == 54) {
              var9_int = param0;
              L1: while (true) {
                stackOut_4_0 = ~var9_int;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_5_0 <= ~param1.length) {
                        break L4;
                      } else {
                        var10 = param1[var9_int];
                        var11 = new bba();
                        var10.b((byte) 64, (tv) (Object) var11);
                        var12 = var11.a((byte) -128);
                        var13 = var11.c((byte) -42);
                        if (var19 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (null == var12) {
                                  break L7;
                                } else {
                                  var14 = 0;
                                  L8: while (true) {
                                    if (~var14 <= ~var12.length) {
                                      break L7;
                                    } else {
                                      var15 = var12[var14];
                                      stackOut_12_0 = var15 instanceof cc;
                                      stackIn_28_0 = stackOut_12_0 ? 1 : 0;
                                      stackIn_13_0 = stackOut_12_0;
                                      if (var19 != 0) {
                                        break L6;
                                      } else {
                                        L9: {
                                          L10: {
                                            if (!stackIn_13_0) {
                                              break L10;
                                            } else {
                                              var16_ref2 = (cc) (Object) var15;
                                              var17 = this.a(var16_ref2.a((byte) -117, 0), 0, param5, param7);
                                              var16_ref2.a(param4, param6 + -56, 0, var17);
                                              if (var19 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          if (var15 instanceof iia) {
                                            var16_ref = (iia) (Object) var15;
                                            var17 = this.a(var16_ref.a((byte) -103, 0), 0, param5, param7);
                                            var16_ref.a(param4, -2, 0, var17);
                                            var18 = this.a(var16_ref.a((byte) -110, 1), -2950, param3, param4, param2);
                                            var16_ref.a(param4, -2, 1, var18);
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                        var14++;
                                        if (var19 == 0) {
                                          continue L8;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (null != var13) {
                                stackOut_27_0 = 0;
                                stackIn_28_0 = stackOut_27_0;
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                            var14 = stackIn_28_0;
                            L11: while (true) {
                              if (var13.length <= var14) {
                                break L5;
                              } else {
                                var15_ref = var13[var14];
                                stackOut_30_0 = var15_ref instanceof ika;
                                stackIn_5_0 = stackOut_30_0 ? 1 : 0;
                                stackIn_31_0 = stackOut_30_0;
                                if (var19 != 0) {
                                  continue L2;
                                } else {
                                  L12: {
                                    if (!stackIn_31_0) {
                                      break L12;
                                    } else {
                                      var16 = (ika) (Object) var15_ref;
                                      var17 = var16.a(0, -118);
                                      var18 = mjb.b(21957, var17);
                                      var16.a(param4, false, 0, var18);
                                      break L12;
                                    }
                                  }
                                  var14++;
                                  if (var19 == 0) {
                                    continue L11;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          param4.a(var11, param6 + -92);
                          var9_int++;
                          if (var19 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var9 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var9;
            stackOut_36_1 = new StringBuilder().append("bea.CB(").append(param0).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L13;
            }
          }
          L14: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L14;
            }
          }
          L15: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L15;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L15;
            }
          }
          L16: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param4 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L16;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L16;
            }
          }
          L17: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param5 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L17;
            }
          }
          L18: {
            stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',').append(param6).append(',');
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param7 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L18;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L18;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ')');
        }
    }

    private final anb[] a(int param0, int param1, pe param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        bba var9 = null;
        bba var10_ref_bba = null;
        int var10 = 0;
        cqb var11 = null;
        int var11_int = 0;
        bba var11_ref = null;
        ih var12 = null;
        bba var12_ref = null;
        int var12_int = 0;
        bba var13 = null;
        int var13_int = 0;
        jsb var14 = null;
        bba var14_ref = null;
        int var14_int = 0;
        tt var15_ref_tt = null;
        int var15 = 0;
        bba var16_ref_bba = null;
        int var16 = 0;
        Object var17 = null;
        int var17_int = 0;
        pob var18_ref_pob = null;
        int var18 = 0;
        rba var18_ref_rba = null;
        sg var19 = null;
        int var20 = 0;
        int var21 = 0;
        anb[] stackIn_10_0 = null;
        anb[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        anb[] stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var21 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 1;
              var7 = 2;
              if (param0 > 107) {
                break L1;
              } else {
                ((bea) this).b((byte) 3, (tv) null);
                break L1;
              }
            }
            var8 = 500;
            var9 = new bba();
            var9.a((byte) -107, (wm) (Object) new dab(0));
            var9.a((rna) (Object) new pob(var5_int, var8), true);
            var9.a((rna) (Object) new cf(var5_int, 8), true);
            var9.a((rna) (Object) new pob(var6, var8), true);
            var9.a((rna) (Object) new cf(var6, 9), true);
            var9.a((rna) (Object) new pob(var7, 0), true);
            param2.a(var9, -38);
            var10_ref_bba = new bba();
            var11 = new cqb(var6, 1);
            ((wm) (Object) var11).field_a = true;
            var10_ref_bba.a((byte) -127, (wm) (Object) var11);
            var12 = new ih(-1, 1);
            ((wm) (Object) var12).field_a = true;
            var10_ref_bba.a((byte) -112, (wm) (Object) var12);
            var10_ref_bba.a((rna) (Object) new ika(0), true);
            param2.a(var10_ref_bba, -38);
            var13 = new bba();
            var14 = new jsb(0);
            var13.a((byte) -110, (wm) (Object) var14);
            var15_ref_tt = new tt(var5_int, 1);
            var13.a((rna) (Object) var15_ref_tt, true);
            param2.a(var13, -38);
            var16_ref_bba = new bba();
            var17 = (Object) (Object) new cqb(var5_int, 0);
            ((wm) var17).field_a = true;
            var16_ref_bba.a((byte) -128, (wm) var17);
            var18_ref_pob = new pob(var5_int, 0);
            var16_ref_bba.a((rna) (Object) var18_ref_pob, true);
            param2.a(var16_ref_bba, -38);
            var10_ref_bba = new bba();
            var11 = new cqb(var5_int, 1);
            ((wm) (Object) var11).field_a = true;
            var10_ref_bba.a((byte) -101, (wm) (Object) var11);
            var12 = new ih(-1, 0);
            ((wm) (Object) var12).field_a = true;
            var10_ref_bba.a((byte) -125, (wm) (Object) var12);
            var10_ref_bba.a((rna) (Object) new ika(1), true);
            param2.a(var10_ref_bba, -38);
            var13 = new bba();
            var14 = new jsb(1);
            var13.a((byte) -103, (wm) (Object) var14);
            var15_ref_tt = new tt(var6, 1);
            var13.a((rna) (Object) var15_ref_tt, true);
            param2.a(var13, -38);
            var16_ref_bba = new bba();
            var17 = (Object) (Object) new cqb(var6, 0);
            ((wm) var17).field_a = true;
            var16_ref_bba.a((byte) -119, (wm) var17);
            var18_ref_pob = new pob(var6, 0);
            var16_ref_bba.a((rna) (Object) var18_ref_pob, true);
            param2.a(var16_ref_bba, -38);
            var10 = 3;
            var11_int = 0;
            L2: while (true) {
              L3: {
                if (~var10 >= ~var11_int) {
                  break L3;
                } else {
                  var12_int = param2.g((byte) -122);
                  var13_int = var12_int / var10;
                  var14_int = param2.m(1);
                  var15 = var14_int / var10;
                  var16 = var13_int * var11_int + -var12_int / 2 + var13_int / 2;
                  var17_int = -var14_int / 2 - -(var11_int * var15) - -(var15 / 2);
                  var18_ref_rba = new rba(var16, var17_int);
                  param2.a(var18_ref_rba, (byte) -123);
                  var11_int++;
                  if (var21 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var11_ref = new bba();
              var11_ref.a((rna) (Object) new uoa(var7, 1), true);
              param2.a(var11_ref, -38);
              var12_ref = new bba();
              var12_ref.a((byte) -123, (wm) (Object) new cqb(var7, oq.field_v));
              var12_ref.a((byte) -107, (wm) (Object) new om(1));
              var12_ref.a((rna) (Object) new jpa(var5_int, 1), true);
              param2.a(var12_ref, -38);
              var13 = new bba();
              var13.a((byte) -116, (wm) (Object) new cqb(var7, oq.field_v));
              var13.a((byte) -125, (wm) (Object) new om(0));
              var13.a((rna) (Object) new jpa(var6, 1), true);
              param2.a(var13, -38);
              var14_ref = new bba();
              var14_ref.a((byte) -107, (wm) (Object) new cqb(var7, oq.field_v));
              var14_ref.a((rna) (Object) new pob(var7, 0), true);
              param2.a(var14_ref, -38);
              var15 = 2;
              var16 = ar.a(param1 / 4, (byte) 116, param3 / 4) >> -771944440;
              var17 = null;
              var18 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var15 <= var18) {
                      break L6;
                    } else {
                      var19 = rpa.a(2, 2, true);
                      var20 = var18 * 2048 / (-1 + var15) + 2048;
                      var19.a(param1 + (fc.a(var20, (byte) -107) >> -1535256344) * var16, (eu.a(var20, 59) >> 886980136) * var16 + param3, (byte) -127);
                      var19.a(new aoa(), 4);
                      var19.h(17704, 1);
                      param2.a(var19, (byte) 92);
                      stackOut_9_0 = (anb[]) (Object) ija.a((Object) (Object) var19, (Object[]) var17, 0, ebb.field_a);
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var21 != 0) {
                        break L5;
                      } else {
                        var17 = (Object) (Object) stackIn_10_0;
                        var18++;
                        if (var21 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_11_0 = var17;
                  stackIn_12_0 = (anb[]) (Object) stackOut_11_0;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("bea.M(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_12_0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException runtimeException = null;
        Class[] var3 = null;
        dja[] var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ((bea) this).field_d = param0.i(0, 32);
              ((bea) this).field_c = wkb.a((byte) 37, ((bea) this).field_c, param0, 8);
              var3 = new Class[]{rgb.class, ptb.class};
              var4 = new dja[]{rma.field_d, kn.field_q};
              ((bea) this).field_b = (dmb[]) (Object) iq.a(var4, (tv[]) (Object) ((bea) this).field_b, var3, ra.field_o, 8, param0, 1, -25);
              if (!param1) {
                break L1;
              } else {
                ((bea) this).field_b = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("bea.H(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, una param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        bba var5 = null;
        int var6_int = 0;
        cqb var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4_int = 10;
            var5 = new bba();
            var5.a((byte) -119, (wm) (Object) new dab(0));
            var5.a((rna) (Object) new pob(var4_int, de.field_p * oq.field_l), true);
            var5.a((rna) (Object) new cf(var4_int, param1 + 4), true);
            var6_int = -51 / ((-71 - param0) / 48);
            param2.a(0, var5);
            var5 = new bba();
            var5.a((byte) -99, (wm) (Object) new cqb(var4_int, 1));
            var5.a((rna) (Object) new uoa(var4_int, -1), true);
            param2.a(0, var5);
            var5 = new bba();
            var6 = new cqb(var4_int, 1);
            ((wm) (Object) var6).field_a = true;
            var5.a((byte) -122, (wm) (Object) var6);
            var5.a((rna) (Object) new ika(param1), true);
            param2.a(0, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("bea.J(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final cq[] a(bba[] param0, pe param1, int param2, boolean param3) {
        Object var5 = null;
        int var6 = 0;
        bba var7 = null;
        int var8 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var5 = null;
            var6 = param2;
            L1: while (true) {
              L2: {
                L3: {
                  if (~param0.length >= ~var6) {
                    break L3;
                  } else {
                    var7 = param0[var6];
                    var5 = (Object) (Object) this.a(var7.a((byte) -123), (cq[]) var5, -95, param1);
                    var6++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param3) {
                  break L2;
                } else {
                  ((bea) this).a(true, (dmb) null);
                  break L2;
                }
              }
              stackOut_10_0 = var5;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var5;
            stackOut_12_1 = new StringBuilder().append("bea.V(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (cq[]) (Object) stackIn_11_0;
    }

    private final void a(pe param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        bba var5 = null;
        bba var6 = null;
        cqb var7 = null;
        via var8 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4_int = 10;
            var5 = new bba();
            var5.a((byte) -117, (wm) (Object) new dab(0));
            var5.a((rna) (Object) new pob(var4_int, 300 * oq.field_l), true);
            var5.a((rna) (Object) new cf(var4_int, param1), true);
            param0.a(var5, param1 ^ -39);
            var6 = new bba();
            var6.a((byte) -128, (wm) (Object) new cqb(var4_int, 1));
            var6.a((rna) (Object) new uoa(var4_int, -1), true);
            param0.a(var6, -38);
            var6 = new bba();
            var7 = new cqb(var4_int, 1);
            ((wm) (Object) var7).field_a = true;
            var6.a((byte) -106, (wm) (Object) var7);
            var8 = new via();
            var6.a((rna) (Object) var8, true);
            param0.a(var6, -38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("bea.W(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final anb[] b(int param0, int param1, pe param2, int param3) {
        sg var5 = null;
        RuntimeException var5_ref = null;
        bba var6 = null;
        int var7 = 0;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5 = t.a(1, (byte) 47);
            var5.a(param3, param1, (byte) 95);
            var5.a(new aoa(), 4);
            var5.h(17704, 1);
            var7 = 7 % ((23 - param0) / 36);
            param2.a(var5, (byte) 99);
            var6 = new bba();
            var6.a((byte) -112, (wm) (Object) new cc(var5.c(false)));
            var6.a((rna) (Object) new ika(0), true);
            param2.a(var6, -38);
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("bea.S(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param3 + ')');
        }
        return (anb[]) (Object) stackIn_1_0;
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, pe param4, boolean param5, Random param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int[][] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var8_int = param4.g((byte) -122) >> -1927866399;
              if (param5) {
                break L1;
              } else {
                break L1;
              }
            }
            var9 = param4.m(1) >> 1823875553;
            var10 = null;
            var10 = this.a(0, var8_int, var9, param5);
            var10 = this.a(param2 ^ -27942, 50, param6, var10);
            if (param2 == 27943) {
              L2: {
                var11 = this.a(param6, var10, (byte) 65, param1, var8_int);
                if (param5) {
                  var12 = var10.length;
                  var11 = this.a(var12, -88, var11);
                  var10 = this.a(var10, var11, var12, (byte) 115);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                this.a(param6, var10, var11, param4, param0, 4);
                if (param3) {
                  this.a(param6, param4, var10, param2 + -27942, var11);
                  break L3;
                } else {
                  break L3;
                }
              }
              pd.field_g = var10;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("bea.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param5).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param6 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    private final int[] a(Random param0, int[][] param1, int[] param2, int param3, int param4) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] stackIn_7_0 = null;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 >= 78) {
                break L1;
              } else {
                int[][] discarded$2 = this.a((int[][]) null, (int[]) null, 31, (byte) 87);
                break L1;
              }
            }
            var6 = new int[param1.length];
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var7 >= param1.length) {
                    break L4;
                  } else {
                    var8 = this.a(param3, param0, param2, (byte) 63);
                    stackOut_6_0 = (int[]) var6;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      stackIn_7_0[var7] = var8;
                      var7++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = (int[]) var6;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6_ref;
            stackOut_12_1 = new StringBuilder().append("bea.JB(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_11_0;
    }

    private final void a(wm param0, pe param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param0.a((byte) -118, param2);
              if (param3 == 14276) {
                break L1;
              } else {
                ((bea) this).field_b = null;
                break L1;
              }
            }
            param0.a(param1, -2, param2, mjb.b(21957, var5_int));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("bea.GA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, rsb param1) {
        Random var3 = null;
        RuntimeException var3_ref = null;
        pe var4 = null;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((bea) this).field_c == null) {
                ((bea) this).field_c = new int[31];
                break L1;
              } else {
                break L1;
              }
            }
            var3 = new Random((long)((bea) this).field_d);
            var4 = param1.field_g;
            var4.g(11184895);
            var5 = -67 / ((param0 - -45) / 36);
            this.a(param1, var3, var4, 4581);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("bea.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    private final int[][] a(int[][] param0, int[] param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8_int = 0;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_3_0 = null;
        int[][] stackIn_7_0 = null;
        int[][] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_6_0 = null;
        int[][] stackOut_22_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param3 == 115) {
              var5_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var5_int <= ~param2) {
                      break L3;
                    } else {
                      stackOut_6_0 = (int[][]) param0;
                      stackIn_23_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var11 != 0) {
                        break L2;
                      } else {
                        var6 = stackIn_7_0[var5_int];
                        var7 = new int[var6.length];
                        var8_int = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (~var6.length >= ~var8_int) {
                                break L6;
                              } else {
                                var9 = var6[var8_int];
                                var10 = var6[1 + var8_int];
                                var7[var8_int] = -var9;
                                var7[var8_int - -1] = -var10;
                                var8_int += 2;
                                if (var11 != 0) {
                                  break L5;
                                } else {
                                  if (var11 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            param1[param0.length] = param1[var5_int];
                            break L5;
                          }
                          var8 = new int[1 + param0.length][];
                          var9 = 0;
                          L7: while (true) {
                            L8: {
                              L9: {
                                if (var9 >= param0.length) {
                                  break L9;
                                } else {
                                  var8[var9] = param0[var9];
                                  var9++;
                                  if (var11 != 0) {
                                    break L8;
                                  } else {
                                    if (var11 == 0) {
                                      continue L7;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var8[param0.length] = var7;
                              param0 = var8;
                              var5_int++;
                              break L8;
                            }
                            if (var11 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_22_0 = (int[][]) param0;
                  stackIn_23_0 = stackOut_22_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (int[][]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("bea.DB(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_23_0;
    }

    private final boolean a(int param0, int param1, int[] param2, int param3, byte param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var7_int = 1;
              var8 = param1 + -param0;
              var9 = param3 - param5;
              var10 = ecb.a(var9, (byte) -77, var8);
              if (param4 > 43) {
                break L1;
              } else {
                int discarded$1 = this.a((byte) 47, (Random) null, (int[][]) null);
                break L1;
              }
            }
            var11 = (eu.a(var10 * 4, 103) + 65536) / 2;
            var12 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var12 >= param2.length) {
                    break L4;
                  } else {
                    var13 = param2[var12];
                    var14 = param2[1 + var12];
                    var15 = param2[(2 + var12) % param2.length];
                    var16 = param2[(3 + var12) % param2.length];
                    var17 = lv.a(var11, var14, var16, param1, var13, 8, var15, param3, 87);
                    stackOut_6_0 = var17;
                    stackIn_22_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_7_0 != -1) {
                            break L6;
                          } else {
                            if (257 != var17) {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        stackOut_13_0 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        break L5;
                      }
                      L7: {
                        var18 = stackIn_16_0;
                        if (var18 == 0) {
                          break L7;
                        } else {
                          var7_int = 0;
                          if (var19 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var12 += 2;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_21_0 = var7_int;
                stackIn_22_0 = stackOut_21_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("bea.FA(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_22_0 != 0;
    }

    private final anb[] a(byte param0, pe param1, wm[] param2, anb[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        wm var6 = null;
        cc var7 = null;
        iia var7_ref = null;
        anb var8 = null;
        int var9 = 0;
        anb[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        anb[] stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 >= 33) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              if (null != param2) {
                var5_int = 0;
                L3: while (true) {
                  if (~param2.length >= ~var5_int) {
                    break L2;
                  } else {
                    L4: {
                      L5: {
                        var6 = param2[var5_int];
                        if (var6 instanceof cc) {
                          break L5;
                        } else {
                          if (!(var6 instanceof iia)) {
                            break L4;
                          } else {
                            L6: {
                              var7_ref = (iia) (Object) var6;
                              var8 = param1.d((byte) -27, var7_ref.a((byte) -116, 0));
                              if (var8 == null) {
                                break L6;
                              } else {
                                param3 = (anb[]) (Object) kn.a((Object[]) (Object) param3, (Object) (Object) var8, true, ebb.field_a, -104);
                                break L6;
                              }
                            }
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var7 = (cc) (Object) var6;
                      var8 = param1.d((byte) -27, var7.a((byte) -110, 0));
                      if (null != var8) {
                        param3 = (anb[]) (Object) kn.a((Object[]) (Object) param3, (Object) (Object) var8, true, ebb.field_a, -90);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var5_int++;
                    if (var9 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_21_0 = (anb[]) param3;
            stackIn_22_0 = stackOut_21_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("bea.OA(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_22_0;
    }

    public final boolean a(byte param0, tv param1) {
        bea var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (bea) (Object) param1;
                var4 = 3 / ((22 - param0) / 59);
                if (var3.field_d != ((bea) this).field_d) {
                  break L2;
                } else {
                  if (wpb.a(var3.field_c, ((bea) this).field_c, (byte) 28)) {
                    break L2;
                  } else {
                    if (!dn.a((tv[]) (Object) var3.field_b, true, 1, (tv[]) (Object) ((bea) this).field_b, 126)) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("bea.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void a(int param0, int param1, int param2, int param3, Random param4, pe param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        cq var9 = null;
        cq var10 = null;
        int var11 = 0;
        int var12 = 0;
        bba var13 = null;
        bba var14 = null;
        cqb var15 = null;
        bba var16 = null;
        cqb var17 = null;
        int var18 = 0;
        int var19 = 0;
        bba var20 = null;
        int var21 = 0;
        sg var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        bba var25 = null;
        bba var26 = null;
        int var27 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var27 = VoidHunters.field_G;
        try {
          L0: {
            var8_int = 524288;
            var9 = new cq(-(var8_int / 2) + param6, -(var8_int / 2) + param2);
            var9.field_d = var8_int;
            var9.field_e = var8_int;
            param5.a(5706, var9);
            var10 = new cq(param1 + -(var8_int / 2), -(var8_int / 2) + param0);
            var10.field_e = var8_int;
            var10.field_d = var8_int;
            param5.a(5706, var10);
            var11 = 0;
            var12 = 1;
            var13 = new bba();
            var13.a((byte) -118, (wm) (Object) new dab(0));
            var13.a((rna) (Object) new pob(var11, oq.field_l * 600), true);
            var13.a((rna) (Object) new cf(var11, 1), true);
            var13.a((rna) (Object) new pob(var12, oq.field_l * 600), true);
            var13.a((rna) (Object) new cf(var12, 2), true);
            param5.a(var13, -38);
            var14 = new bba();
            var15 = new cqb(var12, 1);
            ((wm) (Object) var15).field_a = true;
            var14.a((byte) -106, (wm) (Object) var15);
            var14.a((rna) (Object) new ika(0), true);
            param5.a(var14, -38);
            var16 = new bba();
            var17 = new cqb(var11, 1);
            ((wm) (Object) var17).field_a = true;
            var16.a((byte) -98, (wm) (Object) var17);
            var16.a((rna) (Object) new ika(1), true);
            param5.a(var16, -38);
            var18 = 5;
            if (param3 <= -115) {
              var19 = Math.min(param5.g((byte) -122), param5.m(1)) / 16;
              var20 = new bba();
              var21 = 0;
              L1: while (true) {
                stackOut_4_0 = ~var18;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_5_0 >= ~var21) {
                        break L4;
                      } else {
                        var22 = rpa.a(2, -1, true);
                        var22.h(17704, 2);
                        var23 = hob.a(param4, 8192, 122);
                        var24 = hob.a(param4, var19, 126) >> -1215987320;
                        if (var27 != 0) {
                          break L3;
                        } else {
                          var25_int = 0;
                          L5: while (true) {
                            L6: {
                              if (1000 <= var25_int) {
                                break L6;
                              } else {
                                var22.a((fc.a(var23, (byte) -108) >> -821342968) * var24, (eu.a(var23, 127) >> -1829549240) * var24, (byte) -112);
                                var22.i(0);
                                stackOut_9_0 = param5.a(-11924, (anb) (Object) var22);
                                stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var27 != 0) {
                                  continue L2;
                                } else {
                                  if (!stackIn_10_0) {
                                    break L6;
                                  } else {
                                    var25_int++;
                                    if (var27 == 0) {
                                      continue L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            param5.a(var22, (byte) 90);
                            var20.a((byte) -112, (wm) (Object) new cc(var22.c(false)));
                            var25 = new bba();
                            var25.a((byte) -123, (wm) (Object) new iia(var22.c(false), -2 + param5.e(true)));
                            var25.a((rna) (Object) new uoa(var12, -1), true);
                            param5.a(var25, -38);
                            var26 = new bba();
                            var26.a((byte) -120, (wm) (Object) new iia(var22.c(false), -1 + param5.e(true)));
                            var26.a((rna) (Object) new uoa(var11, -1), true);
                            param5.a(var26, -38);
                            var21++;
                            if (var27 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var20.a((rna) (Object) new ika(-1), true);
                    param5.a(var20, -38);
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("bea.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param5 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param6 + ')');
        }
    }

    private final int a(una param0, byte param1) {
        RuntimeException var3 = null;
        boolean[] var3_array = null;
        bba[] var4 = null;
        int var5 = 0;
        bba var6_ref_bba = null;
        int var6 = 0;
        rna[] var7_ref_rna__ = null;
        int var7 = 0;
        int var8 = 0;
        rna var9 = null;
        ika var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_33_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            var3_array = new boolean[2];
            var4 = param0.b(1);
            if (null != var4) {
              var5 = 0;
              L1: while (true) {
                stackOut_5_0 = var4.length;
                stackIn_6_0 = stackOut_5_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_6_0 <= var5) {
                        break L4;
                      } else {
                        var6_ref_bba = var4[var5];
                        var7_ref_rna__ = var6_ref_bba.c((byte) -42);
                        if (var12 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (null != var7_ref_rna__) {
                                break L6;
                              } else {
                                if (var12 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var8 = 0;
                            L7: while (true) {
                              if (~var7_ref_rna__.length >= ~var8) {
                                break L5;
                              } else {
                                var9 = var7_ref_rna__[var8];
                                stackOut_16_0 = var9 instanceof ika;
                                stackIn_6_0 = stackOut_16_0 ? 1 : 0;
                                stackIn_17_0 = stackOut_16_0;
                                if (var12 != 0) {
                                  continue L2;
                                } else {
                                  L8: {
                                    if (stackIn_17_0) {
                                      var10 = (ika) (Object) var9;
                                      var11 = var10.a(0, -103);
                                      if (var11 < 0) {
                                        break L8;
                                      } else {
                                        if (~var3_array.length < ~var11) {
                                          var3_array[var11] = true;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                  var8++;
                                  if (var12 == 0) {
                                    continue L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          var5++;
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var5 = -1;
                    break L3;
                  }
                  L9: {
                    var6 = 0;
                    if (param1 == -66) {
                      break L9;
                    } else {
                      field_a = null;
                      break L9;
                    }
                  }
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var6 >= var3_array.length) {
                          break L12;
                        } else {
                          var7 = var3_array[var6] ? 1 : 0;
                          stackOut_33_0 = var7;
                          stackIn_43_0 = stackOut_33_0;
                          stackIn_34_0 = stackOut_33_0;
                          if (var12 != 0) {
                            break L11;
                          } else {
                            L13: {
                              if (stackIn_34_0 == 0) {
                                L14: {
                                  if (-1 != var5) {
                                    break L14;
                                  } else {
                                    var5 = var6;
                                    if (var12 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var5 = -2;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var6++;
                            if (var12 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      stackOut_42_0 = var5;
                      stackIn_43_0 = stackOut_42_0;
                      break L11;
                    }
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var3;
            stackOut_44_1 = new StringBuilder().append("bea.VA(");
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L15;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L15;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param1 + ')');
        }
        return stackIn_43_0;
    }

    final static void a(int param0, int param1, mm param2, int param3, int param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        cna[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        cna var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        cna[][] stackIn_61_0 = null;
        cna[][] stackIn_63_0 = null;
        cna[][] stackIn_65_0 = null;
        cna[][] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_55_0 = 0;
        cna[][] stackOut_60_0 = null;
        cna[][] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        cna[][] stackOut_61_0 = null;
        cna[][] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        int stackOut_164_0 = 0;
        int stackOut_164_1 = 0;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        RuntimeException stackOut_172_0 = null;
        StringBuilder stackOut_172_1 = null;
        String stackOut_172_2 = null;
        RuntimeException stackOut_170_0 = null;
        StringBuilder stackOut_170_1 = null;
        String stackOut_170_2 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (~param3 > ~param0) {
                    break L3;
                  } else {
                    var8_int = 1;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (ncb.field_a.length <= var9) {
                            break L6;
                          } else {
                            var10_ref_int__ = ncb.field_a[var9];
                            var11 = 0;
                            stackOut_4_0 = 0;
                            stackIn_56_0 = stackOut_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            if (var15 != 0) {
                              break L5;
                            } else {
                              var12 = stackIn_5_0;
                              L7: while (true) {
                                L8: {
                                  L9: {
                                    L10: {
                                      if (~var10_ref_int__.length >= ~var12) {
                                        break L10;
                                      } else {
                                        var13_int = var10_ref_int__[var12];
                                        var14 = var10_ref_int__[1 + var12];
                                        stackOut_7_0 = ~var13_int;
                                        stackIn_31_0 = stackOut_7_0;
                                        stackIn_8_0 = stackOut_7_0;
                                        if (var15 != 0) {
                                          break L9;
                                        } else {
                                          L11: {
                                            if (stackIn_8_0 != 0) {
                                              L12: {
                                                if (~var13_int != ~param3) {
                                                  break L12;
                                                } else {
                                                  if (~param1 != ~var14) {
                                                    break L12;
                                                  } else {
                                                    var11 = 1;
                                                    if (var15 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              }
                                              if (param3 <= var13_int) {
                                                break L8;
                                              } else {
                                                if ((255 & tib.field_i[var13_int]) != var14) {
                                                  break L8;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            } else {
                                              if (var14 != ieb.field_o[param7]) {
                                                break L8;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          var12 += 2;
                                          if (var15 == 0) {
                                            continue L7;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_30_0 = var11;
                                    stackIn_31_0 = stackOut_30_0;
                                    break L9;
                                  }
                                  L13: {
                                    if (stackIn_31_0 != 0) {
                                      break L13;
                                    } else {
                                      if (param3 == ocb.field_l) {
                                        break L13;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  var12 = 0;
                                  L14: while (true) {
                                    L15: {
                                      L16: {
                                        if (var10_ref_int__.length <= var12) {
                                          break L16;
                                        } else {
                                          var13_int = var10_ref_int__[var12];
                                          stackOut_39_0 = ~var13_int;
                                          stackIn_53_0 = stackOut_39_0;
                                          stackIn_40_0 = stackOut_39_0;
                                          if (var15 != 0) {
                                            break L15;
                                          } else {
                                            L17: {
                                              L18: {
                                                if (stackIn_40_0 == 0) {
                                                  break L18;
                                                } else {
                                                  if (~param3 < ~var13_int) {
                                                    mia.field_a[var13_int] = true;
                                                    if (var15 == 0) {
                                                      break L17;
                                                    } else {
                                                      break L18;
                                                    }
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              nr.field_p = true;
                                              break L17;
                                            }
                                            var12 += 2;
                                            if (var15 == 0) {
                                              continue L14;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_52_0 = 0;
                                      stackIn_53_0 = stackOut_52_0;
                                      break L15;
                                    }
                                    var8_int = stackIn_53_0;
                                    break L8;
                                  }
                                }
                                var9++;
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        stackOut_55_0 = var8_int;
                        stackIn_56_0 = stackOut_55_0;
                        break L5;
                      }
                      L19: {
                        if (stackIn_56_0 != 0) {
                          hrb.field_b = true;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      if (var15 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L20: {
                  stackOut_60_0 = inb.field_q;
                  stackIn_65_0 = stackOut_60_0;
                  stackIn_61_0 = stackOut_60_0;
                  if (param3 == -1) {
                    stackOut_65_0 = (cna[][]) (Object) stackIn_65_0;
                    stackOut_65_1 = 1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    break L20;
                  } else {
                    stackOut_61_0 = (cna[][]) (Object) stackIn_61_0;
                    stackIn_63_0 = stackOut_61_0;
                    stackOut_63_0 = (cna[][]) (Object) stackIn_63_0;
                    stackOut_63_1 = 4 - -param3;
                    stackIn_66_0 = stackOut_63_0;
                    stackIn_66_1 = stackOut_63_1;
                    break L20;
                  }
                }
                L21: {
                  var8_array = stackIn_66_0[stackIn_66_1];
                  var9 = 1;
                  if (param5) {
                    L22: {
                      if (-1 == param3) {
                        break L22;
                      } else {
                        var10 = 0;
                        L23: while (true) {
                          L24: {
                            L25: {
                              if (~(-1 + var8_array.length) >= ~var10) {
                                break L25;
                              } else {
                                stackOut_72_0 = -1;
                                stackOut_72_1 = ~(nkb.field_p[(param6 - -var10) / 8] & 1 << (param6 + var10 & 7));
                                stackIn_82_0 = stackOut_72_0;
                                stackIn_82_1 = stackOut_72_1;
                                stackIn_73_0 = stackOut_72_0;
                                stackIn_73_1 = stackOut_72_1;
                                if (var15 != 0) {
                                  break L24;
                                } else {
                                  L26: {
                                    if (stackIn_73_0 != stackIn_73_1) {
                                      var9 = 0;
                                      if (var15 == 0) {
                                        break L25;
                                      } else {
                                        break L26;
                                      }
                                    } else {
                                      break L26;
                                    }
                                  }
                                  var10++;
                                  if (var15 == 0) {
                                    continue L23;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            stackOut_81_0 = param6;
                            stackOut_81_1 = vu.field_zb[param3] & 255;
                            stackIn_82_0 = stackOut_81_0;
                            stackIn_82_1 = stackOut_81_1;
                            break L24;
                          }
                          param6 = stackIn_82_0 + stackIn_82_1;
                          if (var15 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L27: while (true) {
                      if (var10 >= ieb.field_o.length) {
                        break L21;
                      } else {
                        stackOut_85_0 = -1;
                        stackOut_85_1 = ~(ce.field_o[var10 / 8] & 1 << (var10 & 7));
                        stackIn_165_0 = stackOut_85_0;
                        stackIn_165_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L28: {
                            if (stackIn_86_0 != stackIn_86_1) {
                              var9 = 0;
                              if (var15 == 0) {
                                break L21;
                              } else {
                                break L28;
                              }
                            } else {
                              break L28;
                            }
                          }
                          var10++;
                          if (var15 == 0) {
                            continue L27;
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                  } else {
                    break L21;
                  }
                }
                var10 = 0;
                var11 = 0;
                L29: while (true) {
                  L30: {
                    L31: {
                      if (param3 != -1) {
                        stackOut_99_0 = -1;
                        stackIn_100_0 = stackOut_99_0;
                        break L31;
                      } else {
                        stackOut_96_0 = ieb.field_o.length;
                        stackIn_100_0 = stackOut_96_0;
                        stackIn_97_0 = stackOut_96_0;
                        if (var15 != 0) {
                          break L31;
                        } else {
                          stackOut_97_0 = stackIn_97_0;
                          stackIn_101_0 = stackOut_97_0;
                          break L30;
                        }
                      }
                    }
                    stackOut_100_0 = stackIn_100_0 + var8_array.length;
                    stackIn_101_0 = stackOut_100_0;
                    break L30;
                  }
                  L32: {
                    if (stackIn_101_0 <= var11) {
                      break L32;
                    } else {
                      L33: {
                        L34: {
                          if (-1 == param3) {
                            break L34;
                          } else {
                            tib.field_i[param3] = (byte)var11;
                            if (var15 == 0) {
                              break L33;
                            } else {
                              break L34;
                            }
                          }
                        }
                        param7 = var11;
                        break L33;
                      }
                      L35: {
                        L36: {
                          L37: {
                            if (param3 != -1) {
                              break L37;
                            } else {
                              if (ieb.field_o.length == 1) {
                                break L36;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L38: {
                            L39: {
                              var13 = var8_array[var11 + 1];
                              if (param5) {
                                break L39;
                              } else {
                                L40: {
                                  if (-1 != param3) {
                                    if (var11 != (255 & lqa.field_o.field_Pb[param3])) {
                                      stackOut_126_0 = 0;
                                      stackIn_127_0 = stackOut_126_0;
                                      break L40;
                                    } else {
                                      stackOut_124_0 = 1;
                                      stackIn_127_0 = stackOut_124_0;
                                      break L40;
                                    }
                                  } else {
                                    if (ieb.field_o[var11] != lqa.field_o.field_Fb) {
                                      stackOut_122_0 = 0;
                                      stackIn_127_0 = stackOut_122_0;
                                      break L40;
                                    } else {
                                      stackOut_120_0 = 1;
                                      stackIn_127_0 = stackOut_120_0;
                                      break L40;
                                    }
                                  }
                                }
                                var12 = stackIn_127_0;
                                if (var15 == 0) {
                                  break L38;
                                } else {
                                  break L39;
                                }
                              }
                            }
                            L41: {
                              L42: {
                                if (var13.field_J) {
                                  break L42;
                                } else {
                                  L43: {
                                    if (var9 == 0) {
                                      break L43;
                                    } else {
                                      if (!var13.field_y) {
                                        break L43;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                  stackOut_139_0 = 0;
                                  stackIn_140_0 = stackOut_139_0;
                                  break L41;
                                }
                              }
                              stackOut_137_0 = 1;
                              stackIn_140_0 = stackOut_137_0;
                              break L41;
                            }
                            var12 = stackIn_140_0;
                            break L38;
                          }
                          if (var15 == 0) {
                            break L35;
                          } else {
                            break L36;
                          }
                        }
                        var12 = 1;
                        break L35;
                      }
                      L44: {
                        if (var12 == 0) {
                          break L44;
                        } else {
                          bea.a(param0, param1, param2, param3 + 1, 91, param5, param6, param7);
                          var10 = 1;
                          break L44;
                        }
                      }
                      if (!hrb.field_b) {
                        var11++;
                        if (var15 == 0) {
                          continue L29;
                        } else {
                          break L32;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  if (var10 != 0) {
                    break L2;
                  } else {
                    var11 = 0;
                    L45: while (true) {
                      if (~var11 <= ~(var8_array.length + -1)) {
                        break L2;
                      } else {
                        stackOut_151_0 = -1;
                        stackOut_151_1 = param3;
                        stackIn_165_0 = stackOut_151_0;
                        stackIn_165_1 = stackOut_151_1;
                        stackIn_152_0 = stackOut_151_0;
                        stackIn_152_1 = stackOut_151_1;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L46: {
                            L47: {
                              if (stackIn_152_0 == stackIn_152_1) {
                                break L47;
                              } else {
                                tib.field_i[param3] = (byte)var11;
                                if (var15 == 0) {
                                  break L46;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            param7 = var11;
                            break L46;
                          }
                          bea.a(param0, param1, param2, 1 + param3, 110, param5, param6, param7);
                          if (hrb.field_b) {
                            return;
                          } else {
                            var11++;
                            if (var15 == 0) {
                              continue L45;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_164_0 = param4;
              stackOut_164_1 = 90;
              stackIn_165_0 = stackOut_164_0;
              stackIn_165_1 = stackOut_164_1;
              break L1;
            }
            L48: {
              if (stackIn_165_0 > stackIn_165_1) {
                break L48;
              } else {
                field_a = null;
                break L48;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L49: {
            var8 = decompiledCaughtException;
            stackOut_169_0 = (RuntimeException) var8;
            stackOut_169_1 = new StringBuilder().append("bea.MB(").append(param0).append(',').append(param1).append(',');
            stackIn_172_0 = stackOut_169_0;
            stackIn_172_1 = stackOut_169_1;
            stackIn_170_0 = stackOut_169_0;
            stackIn_170_1 = stackOut_169_1;
            if (param2 == null) {
              stackOut_172_0 = (RuntimeException) (Object) stackIn_172_0;
              stackOut_172_1 = (StringBuilder) (Object) stackIn_172_1;
              stackOut_172_2 = "null";
              stackIn_173_0 = stackOut_172_0;
              stackIn_173_1 = stackOut_172_1;
              stackIn_173_2 = stackOut_172_2;
              break L49;
            } else {
              stackOut_170_0 = (RuntimeException) (Object) stackIn_170_0;
              stackOut_170_1 = (StringBuilder) (Object) stackIn_170_1;
              stackOut_170_2 = "{...}";
              stackIn_173_0 = stackOut_170_0;
              stackIn_173_1 = stackOut_170_1;
              stackIn_173_2 = stackOut_170_2;
              break L49;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_173_0, stackIn_173_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException runtimeException = null;
        bea var3 = null;
        Class[] var4 = null;
        dja[] var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = (bea) (Object) param1;
              var3.field_d = ((bea) this).field_d;
              var3.field_c = dob.a(var3.field_c, (byte) -117, ((bea) this).field_c);
              if (param0 > 54) {
                break L1;
              } else {
                anb[] discarded$3 = this.a(87, -72, (pe) null, 18);
                break L1;
              }
            }
            var4 = new Class[]{rgb.class, ptb.class};
            var5 = new dja[]{rma.field_d, kn.field_q};
            var3.field_b = (dmb[]) (Object) hla.a(var4, (tv[]) (Object) ((bea) this).field_b, var5, -115, (tv[]) (Object) var3.field_b, 1, ra.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("bea.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final int a(int param0, Random param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var6 = -78 / ((-30 - param3) / 39);
            var5_int = 0;
            var7 = hob.a(param1, param0, 124);
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param2.length <= var8) {
                    break L3;
                  } else {
                    var9 = param2[var8];
                    stackOut_3_0 = var9;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 > var7) {
                            break L5;
                          } else {
                            var7 = var7 - var9;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_int = var8;
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_12_0 = var5_int;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("bea.RA(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    final void a(boolean param0, dmb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((bea) this).field_b = (dmb[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((bea) this).field_b, 0, ra.field_o);
              if (param0) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bea.UA(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    private final int[] a(Random param0, int[][] param1, byte param2, int param3, int param4) {
        RuntimeException var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int[] stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        byte stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int[] stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var6_array = this.a(param3, param0, (byte) 94, param1);
                if (param3 != 8) {
                  break L2;
                } else {
                  if (param1 != null) {
                    var7 = param4 / 4;
                    var8 = 0;
                    L3: while (true) {
                      stackOut_8_0 = ~var8;
                      stackOut_8_1 = ~param1.length;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      L4: while (true) {
                        if (stackIn_9_0 <= stackIn_9_1) {
                          break L2;
                        } else {
                          stackOut_10_0 = var6_array[var8];
                          stackOut_10_1 = 2;
                          stackIn_35_0 = stackOut_10_0;
                          stackIn_35_1 = stackOut_10_1;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          if (var12 != 0) {
                            break L1;
                          } else {
                            L5: {
                              L6: {
                                if (stackIn_11_0 == stackIn_11_1) {
                                  break L6;
                                } else {
                                  if (var12 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var9 = param1[var8];
                              if (!this.a(var9, 30506, var7)) {
                                var6_array[var8] = 3;
                                var10 = 0;
                                L7: while (true) {
                                  if (var10 >= param1.length) {
                                    break L5;
                                  } else {
                                    var11 = param1[var8];
                                    stackOut_22_0 = -3;
                                    stackOut_22_1 = ~var6_array[var10];
                                    stackIn_9_0 = stackOut_22_0;
                                    stackIn_9_1 = stackOut_22_1;
                                    stackIn_23_0 = stackOut_22_0;
                                    stackIn_23_1 = stackOut_22_1;
                                    if (var12 != 0) {
                                      continue L4;
                                    } else {
                                      L8: {
                                        if (stackIn_23_0 == stackIn_23_1) {
                                          break L8;
                                        } else {
                                          if (this.a(var11, 30506, var7)) {
                                            var6_array[var10] = 2;
                                            if (var12 == 0) {
                                              break L5;
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      var10++;
                                      if (var12 == 0) {
                                        continue L7;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                            var8++;
                            if (var12 == 0) {
                              continue L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_34_0 = param2;
              stackOut_34_1 = 65;
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              break L1;
            }
            L9: {
              if (stackIn_35_0 == stackIn_35_1) {
                break L9;
              } else {
                ((bea) this).a(-89, (rsb) null);
                break L9;
              }
            }
            stackOut_38_0 = (int[]) var6_array;
            stackIn_39_0 = stackOut_38_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var6;
            stackOut_40_1 = new StringBuilder().append("bea.E(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L10;
            }
          }
          L11: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_39_0;
    }

    private final void a(int param0, boolean param1, Random param2, rsb param3, int param4) {
        pe var6 = null;
        RuntimeException var6_ref = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              var6 = param3.field_g;
              var6.b(param0, (byte) 23);
              var6.b((byte) 80);
              this.a(0, param1, param0, param2, param3);
              this.a(param1, param2, var6, 0);
              if (qab.a(33, param0)) {
                this.a(ksb.b(-100, param0), false, var6);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param4 >= 34) {
                break L2;
              } else {
                boolean discarded$1 = this.a(42, 83, (int[]) null, 99, (byte) -48, -83);
                break L2;
              }
            }
            L3: {
              var6.a(0);
              if (!gj.a(param0, 22681)) {
                break L3;
              } else {
                this.a(param2, 90, var6);
                break L3;
              }
            }
            L4: {
              L5: {
                if (snb.a(param3, (byte) -24)) {
                  break L5;
                } else {
                  var6.a(48, false);
                  if (VoidHunters.field_G == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              this.a(-1, param2, param3);
              var6.a(48, true);
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6_ref;
            stackOut_17_1 = new StringBuilder().append("bea.KB(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param4 + ')');
        }
    }

    final void a(pe param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        Random var5 = null;
        dmb[] var6 = null;
        int var7 = 0;
        dmb var8 = null;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = param0.d(false);
              var4 = qta.a(var3_int, 9) ? 1 : 0;
              var5 = new Random((long)((bea) this).field_d);
              if (param1 == 0) {
                break L1;
              } else {
                bea.a((byte) 80, (Object) null, -58);
                break L1;
              }
            }
            L2: {
              L3: {
                this.a(false, var3_int, 27943, false, param0, var4 != 0, var5);
                if (null == ((bea) this).field_b) {
                  break L3;
                } else {
                  var6 = ((bea) this).field_b;
                  var7 = 0;
                  L4: while (true) {
                    if (~var6.length >= ~var7) {
                      break L3;
                    } else {
                      var8 = var6[var7];
                      var8.a(param0, true);
                      var7++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("bea.N(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, pe param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        int var20 = 0;
        rdb var21 = null;
        int var22 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                anb[] discarded$1 = this.a(-44, 117, (pe) null, 24);
                break L1;
              }
            }
            var4_int = param2.g((byte) -122);
            var5 = param2.m(1);
            var6 = 51200;
            var7 = 4;
            var8 = 2;
            var9 = 0;
            L2: while (true) {
              stackOut_5_0 = ~var9;
              stackOut_5_1 = -3;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 <= stackIn_6_1) {
                      break L5;
                    } else {
                      var10 = 0;
                      var11 = 0;
                      var12 = 2 * var9 + -1;
                      var13 = 2 * var4_int / 3 * var9;
                      var14 = var12 * (var6 * 2) + (var13 + -var4_int / 3);
                      var15 = var5 / 3 + -(var5 * 2 / 3 * var9);
                      if (var22 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (!param0) {
                            break L6;
                          } else {
                            if (var9 == 1) {
                              var14 = 2 * (var12 * var6);
                              var15 = 0;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var16 = 2;
                          if (!param0) {
                            break L7;
                          } else {
                            var16 = 4;
                            break L7;
                          }
                        }
                        L8: {
                          var17 = 1 + var16;
                          var18 = var6 * var17 + -var4_int / 2 + -var14;
                          if (var18 > 0) {
                            var14 = var14 + var18;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          var18 = var14 + var17 * var6 + -(var4_int / 2);
                          if (0 >= var18) {
                            break L9;
                          } else {
                            var14 = var14 - var18;
                            break L9;
                          }
                        }
                        L10: {
                          var19 = -var15 + (var17 * var6 + -var5 / 2);
                          if (var19 > 0) {
                            var15 = var15 + var19;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          var19 = -(var5 / 2) - (-(var17 * var6) - var15);
                          if (0 >= var19) {
                            break L11;
                          } else {
                            var15 = var15 - var19;
                            break L11;
                          }
                        }
                        var20 = 0;
                        L12: while (true) {
                          L13: {
                            if (~var20 <= ~var7) {
                              break L13;
                            } else {
                              var21 = new rdb(var10 + var14, var15 + var11, var9);
                              param2.a((byte) -90, var21);
                              var10 = var10 + 51200 * var16 * var12;
                              stackOut_33_0 = ~(var8 + -1);
                              stackOut_33_1 = ~(var20 % var8);
                              stackIn_6_0 = stackOut_33_0;
                              stackIn_6_1 = stackOut_33_1;
                              stackIn_34_0 = stackOut_33_0;
                              stackIn_34_1 = stackOut_33_1;
                              if (var22 != 0) {
                                continue L3;
                              } else {
                                L14: {
                                  if (stackIn_34_0 == stackIn_34_1) {
                                    var10 = 0;
                                    var11 = var11 + -var12 * 51200 * var16;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                var20++;
                                if (var22 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var9++;
                          if (var22 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("bea.AB(").append(param0).append(',').append(param1).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L15;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L15;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
    }

    private final anb[] a(int param0, Random param1, int param2, int param3, pe param4) {
        RuntimeException var6 = null;
        sg var6_ref = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ml var12_ref_ml = null;
        int var12 = 0;
        nbb var13 = null;
        cq var13_ref = null;
        int var14_int = 0;
        bba var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var6_ref = rpa.a(1, 1, true);
            var6_ref.a(param2, param3, (byte) -108);
            var6_ref.a(new aoa(), param0 ^ 4);
            var6_ref.h(17704, param0);
            param4.a(var6_ref, (byte) 107);
            var7 = null;
            var8 = param4.f(24797);
            var9 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 <= var9) {
                    break L3;
                  } else {
                    var10 = 8192 * var9 / var8;
                    var11 = 2 * var6_ref.g(-123);
                    var12_ref_ml = new ml(26);
                    var13 = new nbb(var12_ref_ml, false);
                    var14_int = (var11 >> -1859707544) * (fc.a(var10, (byte) 115) >> -1214084440);
                    var15 = (eu.a(var10, 119) >> -278350744) * (var11 >> 1630839016);
                    var13.a(var14_int + param2, param3 - -var15, (byte) -61);
                    var16 = hob.a(param1, 8192, 126);
                    var13.a(var16, -107);
                    param4.a(var13, (byte) 99);
                    var7 = (Object) (Object) (anb[]) (Object) ija.a((Object) (Object) var13, (Object[]) var7, param0, ebb.field_a);
                    var9++;
                    if (var17 != 0) {
                      break L2;
                    } else {
                      if (var17 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var9 = -param4.g((byte) -122) / 2;
                var10 = param4.g((byte) -122) / 2;
                var11 = 262144;
                break L2;
              }
              L4: {
                var12 = -var11 + var10;
                if (~Math.abs(-param2 + var9) < ~Math.abs(var10 + -param3)) {
                  var12 = var9;
                  break L4;
                } else {
                  break L4;
                }
              }
              var13_ref = new cq(var12, param3 + -(var11 / 2));
              var13_ref.field_e = var11;
              var13_ref.field_d = var11;
              param4.a(5706, var13_ref);
              var14 = new bba();
              var14.a((byte) -112, (wm) (Object) new cc(var6_ref.c(false)));
              var14.a((rna) (Object) new ika(1), true);
              param4.a(var14, -38);
              var14 = new bba();
              var14.a((byte) -107, (wm) (Object) new iia(var6_ref.c(false), param4.e(true) - 1));
              var14.a((rna) (Object) new ika(0), true);
              param4.a(var14, param0 + -38);
              stackOut_12_0 = var7;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("bea.LB(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return (anb[]) (Object) stackIn_13_0;
    }

    private final int[][] a(int param0, int param1, Random param2, int[][] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        long var15 = 0L;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var28_int = 0;
        Object var28 = null;
        int var29_int = 0;
        Object var29 = null;
        int var30_int = 0;
        int[][] var30 = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int[][] stackIn_7_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int[][] stackIn_53_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_6_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int[][] stackOut_52_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var38 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                ((bea) this).field_d = -113;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5_int >= param1) {
                    break L4;
                  } else {
                    var6 = this.a((byte) 52, param2, param3);
                    stackOut_6_0 = (int[][]) param3;
                    stackIn_53_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var38 != 0) {
                      break L3;
                    } else {
                      var7 = stackIn_7_0[var6];
                      var8 = ela.a((byte) -118, var7);
                      var9 = var8[0];
                      var10 = var8[1];
                      var11 = var8[2];
                      var12 = var8[3];
                      var13 = -var9 + var10;
                      var14 = var12 - var11;
                      var15 = (long)ar.a(var13, (byte) 118, var14);
                      var17 = var9 + hob.a(param2, var13, 116);
                      var18 = var11 + hob.a(param2, var14, 126);
                      var19 = hob.a(param2, 8192, 118);
                      var20 = (int)((long)(fc.a(var19, (byte) -84) >> -1164039832) * (var15 >> -1874099192));
                      var21 = (int)((var15 >> -1463331384) * (long)(eu.a(var19, 62) >> 1247841736));
                      var17 = var17 - var20;
                      var18 = var18 - var21;
                      var22 = var20 * 2 + var17;
                      var23 = 2 * var21 + var18;
                      var24 = 0;
                      var25 = new int[2];
                      var26 = new int[2];
                      var27 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var27 >= var7.length) {
                              break L7;
                            } else {
                              var28_int = var7[var27];
                              var29_int = var7[var27 - -1];
                              var30_int = var7[(var27 + 2) % var7.length];
                              var31 = var7[(3 + var27) % var7.length];
                              var32 = ng.a(8, var29_int, (byte) 113, var28_int, var22, var30_int, var18, var17, var23, var31);
                              stackOut_9_0 = -1;
                              stackOut_9_1 = var32;
                              stackIn_23_0 = stackOut_9_0;
                              stackIn_23_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var38 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (stackIn_10_0 == stackIn_10_1) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (var24 == 2) {
                                        var24++;
                                        if (var38 == 0) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var25[var24] = var27 >> -813020799;
                                    var26[var24] = var32;
                                    var24++;
                                    break L8;
                                  }
                                }
                                var27 += 2;
                                if (var38 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_22_0 = -3;
                          stackOut_22_1 = ~var24;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          break L6;
                        }
                        L10: {
                          L11: {
                            if (stackIn_23_0 != stackIn_23_1) {
                              break L11;
                            } else {
                              var27 = 0;
                              var28 = null;
                              var29 = null;
                              var30_int = 0;
                              L12: while (true) {
                                L13: {
                                  L14: {
                                    if (var7.length <= var30_int) {
                                      break L14;
                                    } else {
                                      var31 = var7[var30_int];
                                      var32 = var7[var30_int - -1];
                                      var33 = var7[(2 + var30_int) % var7.length];
                                      var34 = var7[(var30_int - -3) % var7.length];
                                      var35 = var30_int >> 2115689505;
                                      stackOut_26_0 = -2;
                                      stackOut_26_1 = ~var27;
                                      stackIn_41_0 = stackOut_26_0;
                                      stackIn_41_1 = stackOut_26_1;
                                      stackIn_27_0 = stackOut_26_0;
                                      stackIn_27_1 = stackOut_26_1;
                                      if (var38 != 0) {
                                        break L13;
                                      } else {
                                        L15: {
                                          L16: {
                                            if (stackIn_27_0 == stackIn_27_1) {
                                              break L16;
                                            } else {
                                              var28 = (Object) (Object) kdb.a((int[]) var28, var31, (byte) -102);
                                              var28 = (Object) (Object) kdb.a((int[]) var28, var32, (byte) -118);
                                              if (var38 == 0) {
                                                break L15;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          var29 = (Object) (Object) kdb.a((int[]) var29, var31, (byte) -96);
                                          var29 = (Object) (Object) kdb.a((int[]) var29, var32, (byte) -114);
                                          break L15;
                                        }
                                        L17: {
                                          if (var27 >= 2) {
                                            break L17;
                                          } else {
                                            if (~var35 == ~var25[var27]) {
                                              var36 = ((-var31 + var33) * var26[var27] >> -416252184) + var31;
                                              var37 = (var26[var27] * (-var32 + var34) >> 1317681768) + var32;
                                              var28 = (Object) (Object) kdb.a((int[]) var28, var36, (byte) -113);
                                              var28 = (Object) (Object) kdb.a((int[]) var28, var37, (byte) -104);
                                              var29 = (Object) (Object) kdb.a((int[]) var29, var36, (byte) -113);
                                              var29 = (Object) (Object) kdb.a((int[]) var29, var37, (byte) -126);
                                              var27++;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var30_int += 2;
                                        if (var38 == 0) {
                                          continue L12;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  param3[var6] = (int[]) var28;
                                  stackOut_40_0 = 1;
                                  stackOut_40_1 = param3.length;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  break L13;
                                }
                                var30 = new int[stackIn_41_0 + stackIn_41_1][];
                                var31 = 0;
                                L18: while (true) {
                                  L19: {
                                    L20: {
                                      if (var31 >= param3.length) {
                                        break L20;
                                      } else {
                                        var30[var31] = param3[var31];
                                        var31++;
                                        if (var38 != 0) {
                                          break L19;
                                        } else {
                                          if (var38 == 0) {
                                            continue L18;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                    var30[param3.length] = (int[]) var29;
                                    param3 = var30;
                                    break L19;
                                  }
                                  if (var38 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                          param1++;
                          break L10;
                        }
                        var5_int++;
                        if (var38 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_52_0 = (int[][]) param3;
                stackIn_53_0 = stackOut_52_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var5 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var5;
            stackOut_54_1 = new StringBuilder().append("bea.L(").append(param0).append(',').append(param1).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param2 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L21;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L21;
            }
          }
          L22: {
            stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param3 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L22;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L22;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ')');
        }
        return stackIn_53_0;
    }

    private final cq[] a(int param0, pe param1, cq[] param2) {
        Object var4 = null;
        int var5 = 0;
        cq var6 = null;
        cq var7 = null;
        int var8 = 0;
        Object stackIn_3_0 = null;
        cq[] stackIn_8_0 = null;
        cq[] stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq[] stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var4 = null;
            if (param0 == -7665) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= param2.length) {
                        break L2;
                      } else {
                        var6 = param2[var5];
                        var7 = new cq(0, 0);
                        var6.b((byte) 107, (tv) (Object) var7);
                        var7.field_f = -var7.field_e + -var7.field_f;
                        var7.field_g = -var7.field_g + -var7.field_d;
                        param1.a(5706, var7);
                        stackOut_7_0 = (cq[]) (Object) ija.a((Object) (Object) var7, (Object[]) var4, 0, wsb.field_e);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var8 != 0) {
                          break L1;
                        } else {
                          var4 = (Object) (Object) stackIn_8_0;
                          var5++;
                          if (var8 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_9_0 = var4;
                stackIn_10_0 = (cq[]) (Object) stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (cq[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = (Object) (Object) decompiledCaughtException;
            stackOut_11_0 = var4;
            stackOut_11_1 = new StringBuilder().append("bea.T(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    private final void a(int param0, boolean param1, int param2, Random param3, rsb param4) {
        RuntimeException var6 = null;
        pe var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        una var11 = null;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        bba[] var16 = null;
        bha var17 = null;
        anb[] var17_array = null;
        cq[] var18 = null;
        anb[] var19 = null;
        cq[] var20 = null;
        int var21 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        var21 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var6_ref = param4.field_g;
                var7 = var6_ref.g((byte) -122) / 3;
                var8 = -var6_ref.m(1) / 3;
                var9 = -var7;
                var10 = -var8;
                var11 = var6_ref.e(param0);
                if (null == var11) {
                  break L2;
                } else {
                  if (null == var11.b(1)) {
                    break L2;
                  } else {
                    stackOut_5_0 = var6_ref.e(0).b(1).length;
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            var12 = stackIn_8_0;
            var13 = null;
            var14 = 1;
            var15 = 0;
            var16_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (~param4.field_c.length >= ~var16_int) {
                    break L5;
                  } else {
                    var17 = param4.field_c[var16_int];
                    stackOut_10_0 = var17.field_a;
                    stackIn_21_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var21 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_11_0) {
                            break L7;
                          } else {
                            if (1 != foa.field_p) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var15++;
                        break L6;
                      }
                      var16_int++;
                      if (var21 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var16_int = param2;
                stackOut_20_0 = -1;
                stackIn_21_0 = stackOut_20_0;
                break L4;
              }
              L8: {
                L9: {
                  if (stackIn_21_0 == ~var16_int) {
                    break L9;
                  } else {
                    L10: {
                      if (4 != var16_int) {
                        break L10;
                      } else {
                        if (var21 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (1 == var16_int) {
                        break L11;
                      } else {
                        L12: {
                          if (var16_int != 5) {
                            break L12;
                          } else {
                            if (var21 == 0) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          L14: {
                            L15: {
                              L16: {
                                L17: {
                                  if (var16_int != 2) {
                                    break L17;
                                  } else {
                                    if (var21 == 0) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if (var16_int == 6) {
                                  break L16;
                                } else {
                                  if (var16_int == 3) {
                                    break L15;
                                  } else {
                                    if (var16_int == 7) {
                                      break L14;
                                    } else {
                                      L18: {
                                        if (var16_int != 8) {
                                          break L18;
                                        } else {
                                          if (var21 == 0) {
                                            break L13;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (var16_int == 9) {
                                        var13 = (Object) (Object) this.a(109, var7, var6_ref, var8);
                                        var14 = 0;
                                        break L8;
                                      } else {
                                        L19: {
                                          L20: {
                                            if (var16_int == 10) {
                                              this.a(var6_ref, 5985, var8, var7);
                                              var14 = 0;
                                              if (var21 == 0) {
                                                break L8;
                                              } else {
                                                break L20;
                                              }
                                            } else {
                                              L21: {
                                                if (var16_int != 12) {
                                                  break L21;
                                                } else {
                                                  if (var21 == 0) {
                                                    break L20;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              if (var16_int != 11) {
                                                break L8;
                                              } else {
                                                if (var21 == 0) {
                                                  break L19;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                          }
                                          var14 = 0;
                                          this.a(var6_ref, var8, -1, lga.a((byte) -2, param2), 2, var15, var7);
                                          if (var21 == 0) {
                                            break L8;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        this.a(var6_ref, param0 + 3, var15);
                                        var14 = 0;
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                              this.a(var7, param3, param4, (byte) 97, var8);
                              if (var21 == 0) {
                                break L8;
                              } else {
                                break L15;
                              }
                            }
                            this.a(var15, var6_ref, var7, var8, param3, 2097152);
                            if (var21 == 0) {
                              break L8;
                            } else {
                              break L14;
                            }
                          }
                          var14 = 0;
                          this.a(var8, var7, var10, -118, param3, var6_ref, var9);
                          if (var21 == 0) {
                            break L8;
                          } else {
                            break L13;
                          }
                        }
                        var14 = 0;
                        var13 = (Object) (Object) this.a(var8, var7, var6_ref, (byte) -85);
                        break L8;
                      }
                    }
                    var13 = (Object) (Object) this.a(0, param3, var9, var10, var6_ref);
                    break L8;
                  }
                }
                var13 = (Object) (Object) this.b(122, var8, var6_ref, var7);
                break L8;
              }
              L22: {
                if (param1) {
                  anb[] discarded$1 = this.a(param4, (anb[]) var13, (byte) 95, param3);
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                if (!param1) {
                  break L23;
                } else {
                  if (var14 == 0) {
                    break L23;
                  } else {
                    if (var6_ref.e(0) == null) {
                      break L23;
                    } else {
                      if (var6_ref.e(0).b(param0 + 1) == null) {
                        break L23;
                      } else {
                        var16 = var6_ref.e(0).b(1);
                        var17_array = this.a(var12, param0 ^ -18656, var6_ref, var16);
                        var18 = this.a(var16, var6_ref, var12, true);
                        var19 = this.a(param4, var17_array, (byte) 61, param3);
                        var20 = this.a(-7665, var6_ref, var18);
                        this.a(var12, var16, var18, var20, var6_ref, var19, (byte) 54, var17_array);
                        break L23;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_104_0 = (RuntimeException) var6;
            stackOut_104_1 = new StringBuilder().append("bea.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_107_0 = stackOut_104_0;
            stackIn_107_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param3 == null) {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L24;
            } else {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "{...}";
              stackIn_108_0 = stackOut_105_0;
              stackIn_108_1 = stackOut_105_1;
              stackIn_108_2 = stackOut_105_2;
              break L24;
            }
          }
          L25: {
            stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
            stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',');
            stackIn_111_0 = stackOut_108_0;
            stackIn_111_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param4 == null) {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L25;
            } else {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "{...}";
              stackIn_112_0 = stackOut_109_0;
              stackIn_112_1 = stackOut_109_1;
              stackIn_112_2 = stackOut_109_2;
              break L25;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_112_0, stackIn_112_2 + ')');
        }
    }

    private final cq[] a(wm[] param0, cq[] param1, int param2, pe param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        wm var6 = null;
        iia var7 = null;
        cq var8 = null;
        int var9 = 0;
        Object stackIn_3_0 = null;
        cq[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if (param2 < -49) {
              L1: {
                if (null != param0) {
                  var5_int = 0;
                  L2: while (true) {
                    if (~var5_int <= ~param0.length) {
                      break L1;
                    } else {
                      L3: {
                        var6 = param0[var5_int];
                        if (!(var6 instanceof iia)) {
                          break L3;
                        } else {
                          var7 = (iia) (Object) var6;
                          var8 = param3.e((byte) -61, var7.a((byte) -123, 1));
                          if (null != var8) {
                            param1 = (cq[]) (Object) kn.a((Object[]) (Object) param1, (Object) (Object) var8, true, wsb.field_e, -102);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5_int++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_15_0 = (cq[]) param1;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (cq[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("bea.BB(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_16_0;
    }

    private final void a(Random param0, pe param1, int[][] param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int var20 = 0;
        crb var21_ref_crb = null;
        int var21 = 0;
        crb[] var22_ref_crb__ = null;
        int var22 = 0;
        int var23 = 0;
        crb[] var24_ref_crb__ = null;
        int var24 = 0;
        int var25 = 0;
        crb var26 = null;
        ml var26_ref = null;
        int var27_int = 0;
        nbb var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_11_0 = false;
        crb stackIn_13_0 = null;
        crb stackIn_16_0 = null;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_40_2 = false;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        boolean stackIn_50_0 = false;
        int[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        boolean stackIn_73_0 = false;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_122_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_10_0 = false;
        crb stackOut_12_0 = null;
        crb stackOut_15_0 = null;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        boolean stackOut_39_2 = false;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        boolean stackOut_49_0 = false;
        int[] stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_57_0 = 0;
        boolean stackOut_72_0 = false;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        var30 = VoidHunters.field_G;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              stackOut_2_0 = ~param2.length;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= ~var6_int) {
                      break L4;
                    } else {
                      var7 = param2[var6_int];
                      var8 = ela.a((byte) -101, var7);
                      var9 = var8[0];
                      var10 = var8[1];
                      var11 = var8[2];
                      var12 = var8[3];
                      var13 = Math.min(tf.a(14, param3 + -120, var7), 1000);
                      var14 = var10 + -var9;
                      var15 = -var11 + var12;
                      var16 = param4[var6_int];
                      stackOut_4_0 = var16;
                      stackOut_4_1 = 1;
                      stackIn_102_0 = stackOut_4_0;
                      stackIn_102_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_5_0 != stackIn_5_1) {
                              break L6;
                            } else {
                              var17 = var13 / 16;
                              var18_int = 0;
                              L7: while (true) {
                                L8: {
                                  if (var18_int >= var17) {
                                    break L8;
                                  } else {
                                    var19 = hob.a(param0, var14, 123) + var9;
                                    var20 = var11 + hob.a(param0, var15, 118);
                                    stackOut_10_0 = fra.a(var7, var20, 2, var19);
                                    stackIn_3_0 = stackOut_10_0 ? 1 : 0;
                                    stackIn_11_0 = stackOut_10_0;
                                    if (var30 != 0) {
                                      continue L2;
                                    } else {
                                      L9: {
                                        if (!stackIn_11_0) {
                                          break L9;
                                        } else {
                                          var21_ref_crb = new crb(new ml(gnb.a(param0, (byte) 97)));
                                          var21_ref_crb.a(var19, var20, (byte) -97);
                                          stackOut_12_0 = (crb) var21_ref_crb;
                                          stackIn_13_0 = stackOut_12_0;
                                          L10: while (true) {
                                            ((crb) (Object) stackIn_13_0).a(hob.a(param0, 8192, 116), -64);
                                            var22_ref_crb__ = param1.a(true);
                                            var23 = 0;
                                            var24_ref_crb__ = var22_ref_crb__;
                                            var25 = 0;
                                            L11: while (true) {
                                              L12: {
                                                if (var25 >= var24_ref_crb__.length) {
                                                  break L12;
                                                } else {
                                                  var26 = var24_ref_crb__[var25];
                                                  stackOut_15_0 = (crb) var26;
                                                  stackIn_13_0 = stackOut_15_0;
                                                  stackIn_16_0 = stackOut_15_0;
                                                  if (var30 != 0) {
                                                    continue L10;
                                                  } else {
                                                    L13: {
                                                      L14: {
                                                        if (stackIn_16_0 != null) {
                                                          break L14;
                                                        } else {
                                                          if (var30 == 0) {
                                                            break L13;
                                                          } else {
                                                            break L14;
                                                          }
                                                        }
                                                      }
                                                      var27_int = var21_ref_crb.d(false) + -var26.d(false);
                                                      var28 = var21_ref_crb.g((byte) 118) + -var26.g((byte) -124);
                                                      var29 = ar.a(var27_int, (byte) 112, var28);
                                                      if (var29 < var21_ref_crb.field_k.i((byte) -112).field_l + var26.field_k.i((byte) -112).field_l) {
                                                        var23 = 1;
                                                        if (var30 == 0) {
                                                          break L12;
                                                        } else {
                                                          break L13;
                                                        }
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                    var25++;
                                                    if (var30 == 0) {
                                                      continue L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var23 != 0) {
                                                break L9;
                                              } else {
                                                param1.a((byte) 126, var21_ref_crb);
                                                break L9;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var18_int++;
                                      if (var30 == 0) {
                                        continue L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                if (var30 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var16 == 2) {
                            var17 = var13 / 8;
                            var18 = new int[56];
                            var19 = 0;
                            L15: while (true) {
                              L16: {
                                L17: {
                                  L18: {
                                    if (~var18.length >= ~var19) {
                                      break L18;
                                    } else {
                                      stackOut_39_0 = (int[]) var18;
                                      stackOut_39_1 = var19;
                                      stackOut_39_2 = fbb.b(var19, 15923);
                                      stackIn_57_0 = stackOut_39_0;
                                      stackIn_57_1 = stackOut_39_1;
                                      stackIn_57_2 = stackOut_39_2 ? 1 : 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackIn_40_1 = stackOut_39_1;
                                      stackIn_40_2 = stackOut_39_2;
                                      if (var30 != 0) {
                                        break L17;
                                      } else {
                                        L19: {
                                          stackOut_40_0 = (int[]) (Object) stackIn_40_0;
                                          stackOut_40_1 = stackIn_40_1;
                                          stackIn_45_0 = stackOut_40_0;
                                          stackIn_45_1 = stackOut_40_1;
                                          stackIn_41_0 = stackOut_40_0;
                                          stackIn_41_1 = stackOut_40_1;
                                          if (stackIn_40_2) {
                                            stackOut_45_0 = (int[]) (Object) stackIn_45_0;
                                            stackOut_45_1 = stackIn_45_1;
                                            stackOut_45_2 = qqb.field_b;
                                            stackIn_46_0 = stackOut_45_0;
                                            stackIn_46_1 = stackOut_45_1;
                                            stackIn_46_2 = stackOut_45_2;
                                            break L19;
                                          } else {
                                            stackOut_41_0 = (int[]) (Object) stackIn_41_0;
                                            stackOut_41_1 = stackIn_41_1;
                                            stackIn_43_0 = stackOut_41_0;
                                            stackIn_43_1 = stackOut_41_1;
                                            stackOut_43_0 = (int[]) (Object) stackIn_43_0;
                                            stackOut_43_1 = stackIn_43_1;
                                            stackOut_43_2 = 0;
                                            stackIn_46_0 = stackOut_43_0;
                                            stackIn_46_1 = stackOut_43_1;
                                            stackIn_46_2 = stackOut_43_2;
                                            break L19;
                                          }
                                        }
                                        stackIn_46_0[stackIn_46_1] = stackIn_46_2;
                                        var19++;
                                        if (var30 == 0) {
                                          continue L15;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  var19 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var19 >= 56) {
                                        break L21;
                                      } else {
                                        stackOut_49_0 = tr.a(param3 + -127, var19);
                                        stackIn_58_0 = stackOut_49_0 ? 1 : 0;
                                        stackIn_50_0 = stackOut_49_0;
                                        if (var30 != 0) {
                                          break L16;
                                        } else {
                                          L22: {
                                            if (!stackIn_50_0) {
                                              break L22;
                                            } else {
                                              var18[var19] = 0;
                                              break L22;
                                            }
                                          }
                                          var19++;
                                          if (var30 == 0) {
                                            continue L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    var18[12] = 0;
                                    var18[28] = 0;
                                    var18[19] = 0;
                                    var18[20] = 0;
                                    var18[14] = 0;
                                    var18[17] = 0;
                                    var18[47] = 0;
                                    var19 = opb.field_o;
                                    stackOut_56_0 = (int[]) var18;
                                    stackOut_56_1 = 22;
                                    stackOut_56_2 = var18[22] + ((bea) this).field_c[25] * var19;
                                    stackIn_57_0 = stackOut_56_0;
                                    stackIn_57_1 = stackOut_56_1;
                                    stackIn_57_2 = stackOut_56_2;
                                    break L17;
                                  }
                                }
                                stackIn_57_0[stackIn_57_1] = stackIn_57_2;
                                stackOut_57_0 = 0;
                                stackIn_58_0 = stackOut_57_0;
                                break L16;
                              }
                              L23: {
                                if (stackIn_58_0 < ((bea) this).field_c[23]) {
                                  var20 = var19 * ((bea) this).field_c[23] / 4;
                                  var18[35] = var18[35] + var20;
                                  var18[37] = var18[37] + var20;
                                  var18[51] = var18[51] + var20;
                                  var18[36] = var18[36] + var20;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                var18[42] = var18[42] + var19 * ((bea) this).field_c[21];
                                var18[45] = var18[45] + var19 * ((bea) this).field_c[20];
                                if (((bea) this).field_c[24] <= 0) {
                                  break L24;
                                } else {
                                  var20 = var19 * ((bea) this).field_c[24] / 10;
                                  var18[32] = var18[32] + var20;
                                  var18[31] = var18[31] + var20;
                                  var18[38] = var18[38] + var20;
                                  var18[33] = var18[33] + var20;
                                  var18[40] = var18[40] + var20;
                                  var18[34] = var18[34] + var20;
                                  var18[30] = var18[30] + var20;
                                  var18[41] = var18[41] + var20;
                                  var18[39] = var18[39] + var20;
                                  var18[29] = var18[29] + var20;
                                  break L24;
                                }
                              }
                              L25: {
                                if (((bea) this).field_c[22] <= 0) {
                                  break L25;
                                } else {
                                  var20 = ((bea) this).field_c[22] * var19 / 2;
                                  var18[43] = var18[43] + var20;
                                  var18[44] = var18[44] + var20;
                                  break L25;
                                }
                              }
                              L26: {
                                if (((bea) this).field_c[26] <= 0) {
                                  break L26;
                                } else {
                                  var20 = ((bea) this).field_c[26] * var19 / 3;
                                  var18[26] = var18[26] + var20;
                                  var18[18] = var18[18] + var20;
                                  var18[27] = var18[27] + var20;
                                  break L26;
                                }
                              }
                              L27: {
                                var18[13] = var18[13] + ((bea) this).field_c[27] * var19;
                                if (0 >= ((bea) this).field_c[28]) {
                                  break L27;
                                } else {
                                  var20 = var19 * ((bea) this).field_c[28] / 5;
                                  var18[15] = var18[15] + var20;
                                  var18[16] = var18[16] + var20;
                                  var18[25] = var18[25] + var20;
                                  var18[24] = var18[24] + var20;
                                  var18[23] = var18[23] + var20;
                                  break L27;
                                }
                              }
                              var20 = this.a(var18, param3 + 262143);
                              var21 = -1;
                              var22 = 0;
                              L28: while (true) {
                                if (var22 >= var17) {
                                  break L5;
                                } else {
                                  var23 = hob.a(param0, var14, 117) + var9;
                                  var24 = var11 + hob.a(param0, var15, 119);
                                  stackOut_72_0 = fra.a(var7, var24, 2, var23);
                                  stackIn_3_0 = stackOut_72_0 ? 1 : 0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (var30 != 0) {
                                    continue L2;
                                  } else {
                                    L29: {
                                      if (!stackIn_73_0) {
                                        break L29;
                                      } else {
                                        L30: {
                                          L31: {
                                            var25 = var21;
                                            if (-1 != var25) {
                                              break L31;
                                            } else {
                                              var25 = this.a(var20, param0, var18, (byte) -75);
                                              if (1 != qjb.field_d) {
                                                break L30;
                                              } else {
                                                L32: {
                                                  L33: {
                                                    var21 = var25;
                                                    if (38 != var25) {
                                                      break L33;
                                                    } else {
                                                      var21 = 39;
                                                      if (var30 == 0) {
                                                        break L32;
                                                      } else {
                                                        break L33;
                                                      }
                                                    }
                                                  }
                                                  if (var25 != 39) {
                                                    break L32;
                                                  } else {
                                                    var21 = 38;
                                                    break L32;
                                                  }
                                                }
                                                L34: {
                                                  if (var25 == 36) {
                                                    break L34;
                                                  } else {
                                                    if (var25 == 51) {
                                                      var21 = 36;
                                                      if (var30 == 0) {
                                                        break L30;
                                                      } else {
                                                        break L34;
                                                      }
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                }
                                                var21 = 51;
                                                if (var30 == 0) {
                                                  break L30;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                            }
                                          }
                                          var21 = -1;
                                          break L30;
                                        }
                                        var26_ref = new ml(var25);
                                        var27 = new nbb(var26_ref, false);
                                        var27.a(var23, var24, (byte) 85);
                                        var27.a(hob.a(param0, 8192, param3 ^ 119), -47);
                                        param1.a(var27, (byte) 104);
                                        break L29;
                                      }
                                    }
                                    L35: {
                                      if (var17 - 1 > var22) {
                                        break L35;
                                      } else {
                                        if (var21 >= 0) {
                                          var22--;
                                          break L35;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    var22++;
                                    if (var30 == 0) {
                                      continue L28;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var6_int++;
                        if (var30 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_101_0 = param3;
                  stackOut_101_1 = 1;
                  stackIn_102_0 = stackOut_101_0;
                  stackIn_102_1 = stackOut_101_1;
                  break L3;
                }
                L36: {
                  if (stackIn_102_0 == stackIn_102_1) {
                    break L36;
                  } else {
                    ((bea) this).b((byte) 84, (tv) null);
                    break L36;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var6 = decompiledCaughtException;
            stackOut_106_0 = (RuntimeException) var6;
            stackOut_106_1 = new StringBuilder().append("bea.HA(");
            stackIn_109_0 = stackOut_106_0;
            stackIn_109_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param0 == null) {
              stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
              stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
              stackOut_109_2 = "null";
              stackIn_110_0 = stackOut_109_0;
              stackIn_110_1 = stackOut_109_1;
              stackIn_110_2 = stackOut_109_2;
              break L37;
            } else {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "{...}";
              stackIn_110_0 = stackOut_107_0;
              stackIn_110_1 = stackOut_107_1;
              stackIn_110_2 = stackOut_107_2;
              break L37;
            }
          }
          L38: {
            stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
            stackOut_110_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_110_2).append(',');
            stackIn_113_0 = stackOut_110_0;
            stackIn_113_1 = stackOut_110_1;
            stackIn_111_0 = stackOut_110_0;
            stackIn_111_1 = stackOut_110_1;
            if (param1 == null) {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L38;
            } else {
              stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
              stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
              stackOut_111_2 = "{...}";
              stackIn_114_0 = stackOut_111_0;
              stackIn_114_1 = stackOut_111_1;
              stackIn_114_2 = stackOut_111_2;
              break L38;
            }
          }
          L39: {
            stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',');
            stackIn_117_0 = stackOut_114_0;
            stackIn_117_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param2 == null) {
              stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
              stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
              stackOut_117_2 = "null";
              stackIn_118_0 = stackOut_117_0;
              stackIn_118_1 = stackOut_117_1;
              stackIn_118_2 = stackOut_117_2;
              break L39;
            } else {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "{...}";
              stackIn_118_0 = stackOut_115_0;
              stackIn_118_1 = stackOut_115_1;
              stackIn_118_2 = stackOut_115_2;
              break L39;
            }
          }
          L40: {
            stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
            stackOut_118_1 = ((StringBuilder) (Object) stackIn_118_1).append(stackIn_118_2).append(',').append(param3).append(',');
            stackIn_121_0 = stackOut_118_0;
            stackIn_121_1 = stackOut_118_1;
            stackIn_119_0 = stackOut_118_0;
            stackIn_119_1 = stackOut_118_1;
            if (param4 == null) {
              stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "null";
              stackIn_122_0 = stackOut_121_0;
              stackIn_122_1 = stackOut_121_1;
              stackIn_122_2 = stackOut_121_2;
              break L40;
            } else {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "{...}";
              stackIn_122_0 = stackOut_119_0;
              stackIn_122_1 = stackOut_119_1;
              stackIn_122_2 = stackOut_119_2;
              break L40;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_122_0, stackIn_122_2 + ')');
        }
    }

    private final void a(pe param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        bba var11 = null;
        int var12 = 0;
        int var13_int = 0;
        bba var13 = null;
        cqb var14 = null;
        ih var15 = null;
        bba var16 = null;
        jsb var17 = null;
        tt var18 = null;
        bba var19 = null;
        cqb var20 = null;
        pob var21 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var8_int = 0;
              var9 = 1;
              var10 = (param5 - -1) / 2;
              if (var10 > 0) {
                break L1;
              } else {
                var10 = 1;
                break L1;
              }
            }
            L2: {
              var11 = new bba();
              var11.a((byte) -106, (wm) (Object) new dab(0));
              var11.a((rna) (Object) new pob(var8_int, var10), true);
              var11.a((rna) (Object) new cf(var8_int, 8), true);
              var11.a((rna) (Object) new pob(var9, var10), true);
              var11.a((rna) (Object) new cf(var9, 9), true);
              var12 = param4;
              if (param2 == -1) {
                var13_int = param3;
                var11.a((rna) (Object) new pob(var12, var13_int), true);
                var11.a((rna) (Object) new cf(var12, 3), true);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              param0.a(var11, -38);
              if (param2 != -1) {
                break L3;
              } else {
                var13 = new bba();
                var13.a((byte) -124, (wm) (Object) new cqb(var12, 1));
                var13.a((rna) (Object) new uoa(var12, -1), true);
                param0.a(var13, -38);
                break L3;
              }
            }
            var13 = new bba();
            var14 = new cqb(var9, 1);
            ((wm) (Object) var14).field_a = true;
            var13.a((byte) -124, (wm) (Object) var14);
            var15 = new ih(-1, 1);
            ((wm) (Object) var15).field_a = true;
            var13.a((byte) -113, (wm) (Object) var15);
            var13.a((rna) (Object) new ika(0), true);
            param0.a(var13, -38);
            var16 = new bba();
            var17 = new jsb(0);
            var16.a((byte) -110, (wm) (Object) var17);
            var18 = new tt(var8_int, 3);
            var16.a((rna) (Object) var18, true);
            param0.a(var16, param4 + -40);
            var19 = new bba();
            var20 = new cqb(var8_int, 0);
            ((wm) (Object) var20).field_a = true;
            var19.a((byte) -127, (wm) (Object) var20);
            var21 = new pob(var8_int, 0);
            var19.a((rna) (Object) var21, true);
            param0.a(var19, param4 + -40);
            var13 = new bba();
            var14 = new cqb(var8_int, 1);
            ((wm) (Object) var14).field_a = true;
            var13.a((byte) -128, (wm) (Object) var14);
            var15 = new ih(-1, 0);
            ((wm) (Object) var15).field_a = true;
            var13.a((byte) -104, (wm) (Object) var15);
            var13.a((rna) (Object) new ika(1), true);
            param0.a(var13, param4 ^ -40);
            var16 = new bba();
            var17 = new jsb(1);
            var16.a((byte) -121, (wm) (Object) var17);
            var18 = new tt(var9, 3);
            var16.a((rna) (Object) var18, true);
            param0.a(var16, -38);
            var19 = new bba();
            var20 = new cqb(var9, 0);
            ((wm) (Object) var20).field_a = true;
            var19.a((byte) -118, (wm) (Object) var20);
            var21 = new pob(var9, 0);
            var19.a((rna) (Object) var21, true);
            param0.a(var19, -38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var8;
            stackOut_10_1 = new StringBuilder().append("bea.CA(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            field_f = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "bea.AA(" + param0 + ')');
        }
    }

    private final void a(rna param0, int param1, pe param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 == 17333) {
              var5_int = param0.a(param3, -113);
              param0.a(param2, false, param3, mjb.b(21957, var5_int));
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("bea.P(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        Class[] var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              param0.a(-632, ((bea) this).field_d, 32);
              if (param1 < -109) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = 8;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((bea) this).field_c == null) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = ((bea) this).field_c.length;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                break L2;
              }
            }
            pgb.a(stackIn_7_0, stackIn_7_1, 21, param0, ((bea) this).field_c);
            var3 = new Class[]{rgb.class, ptb.class};
            pjb.a(param0, (tv[]) (Object) ((bea) this).field_b, 8, 1, var3, 126);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("bea.B(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    private final boolean a(int[] param0, int param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4 = ela.a((byte) -102, param0);
              var5 = (var4[1] + var4[0]) / 2;
              var6 = (var4[3] + var4[2]) / 2;
              if (param1 == 30506) {
                break L1;
              } else {
                ((bea) this).field_d = 72;
                break L1;
              }
            }
            L2: {
              var7 = ar.a(var5, (byte) 111, var6);
              if (~param2 >= ~var7) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("bea.QA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final void a(tv param0, int param1) {
        RuntimeException runtimeException = null;
        bea var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var3 = (bea) (Object) param0;
              boolean discarded$3 = tja.a((ntb[]) (Object) var3.field_b, 1, (ntb[]) (Object) ((bea) this).field_b, true, 5547);
              var4 = 0;
              if (var3.field_d == ((bea) this).field_d) {
                break L1;
              } else {
                System.out.println("int seed has changed. before=" + var3.field_d + ", now=" + ((bea) this).field_d);
                var4 = 1;
                break L1;
              }
            }
            L2: {
              if (param1 < -19) {
                break L2;
              } else {
                field_a = null;
                break L2;
              }
            }
            L3: {
              if (ikb.a(((bea) this).field_c, var3.field_c, false)) {
                var4 = 1;
                System.out.println("int[] option_totals has changed. ");
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!dn.a((tv[]) (Object) var3.field_b, true, 1, (tv[]) (Object) ((bea) this).field_b, -12)) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("MapClearanceArea[] clearance_areas has changed. ");
                break L4;
              }
            }
            L5: {
              if (var4 != 0) {
                System.out.println("This instance of MissionBuilder has changed");
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("bea.F(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, Random param1, pe param2, int param3) {
        RuntimeException runtimeException = null;
        una var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param0) {
              return;
            } else {
              var5 = param2.e(param3);
              if (var5 == null) {
                return;
              } else {
                L1: {
                  var6 = this.a(var5, (byte) -66);
                  if (var6 >= 0) {
                    this.a(-125, var6, var5);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("bea.LA(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
    }

    private final anb[] a(int param0, int param1, pe param2, bba[] param3) {
        Object var5 = null;
        int var6 = 0;
        bba var7 = null;
        int var8 = 0;
        anb[] stackIn_7_0 = null;
        anb[] stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        anb[] stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5 = null;
              if (param1 == -18656) {
                break L1;
              } else {
                int[] discarded$2 = this.a((Random) null, (int[][]) null, (int[]) null, 44, -95);
                break L1;
              }
            }
            var6 = param0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param3.length >= ~var6) {
                    break L4;
                  } else {
                    var7 = param3[var6];
                    stackOut_6_0 = this.a((byte) 127, param2, var7.a((byte) -120), (anb[]) var5);
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      var5 = (Object) (Object) stackIn_7_0;
                      var6++;
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_8_0 = var5;
                stackIn_9_0 = (anb[]) (Object) stackOut_8_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var5;
            stackOut_10_1 = new StringBuilder().append("bea.K(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_9_0;
    }

    private final void a(int param0, boolean param1, pe param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 524288;
                var5 = 4194304;
                if (12 == param0) {
                  break L2;
                } else {
                  if (11 == param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var5 = var5 / 2;
              break L1;
            }
            L3: {
              var6 = -((bea) this).field_c[15] + ((bea) this).field_c[14];
              if (!param1) {
                break L3;
              } else {
                field_a = null;
                break L3;
              }
            }
            L4: {
              var5 = var5 + var4_int * var6;
              if (~var5 <= ~var4_int) {
                break L4;
              } else {
                var5 = var4_int;
                break L4;
              }
            }
            L5: {
              L6: {
                if (1 == param0) {
                  break L6;
                } else {
                  if (param0 == 5) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              if (var5 >= 2097152) {
                break L5;
              } else {
                var5 = 2097152;
                break L5;
              }
            }
            L7: {
              param2.a(var5, (byte) 36);
              var7 = 2097152;
              var8 = ((bea) this).field_c[16] + -((bea) this).field_c[17];
              var7 = var7 + var4_int * var8;
              if (~var7 > ~var4_int) {
                var7 = var4_int;
                break L7;
              } else {
                break L7;
              }
            }
            param2.e(var7, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("bea.IA(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    private final void a(int param0, pe param1, int param2, int param3, Random param4, int param5) {
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        String var8 = null;
        int[] var9 = null;
        sg var10 = null;
        bba var11 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            this.a(param1, param3, 1, lga.a((byte) -2, 3), param5 + -2097150, param0, param2);
            try {
              L1: {
                L2: {
                  var7_int = hob.a(param4, field_a.length, 127);
                  var8 = field_a[var7_int];
                  var9 = hta.a(var8, true, true);
                  var10 = ae.a(var9, (byte) 65);
                  var10.a(0, 0, (byte) 30);
                  var10.a(new aoa(), param5 + -2097148);
                  var10.h(param5 + -2079448, 1);
                  param1.a(var10, (byte) 100);
                  if (param5 == 2097152) {
                    break L2;
                  } else {
                    ((bea) this).field_d = 0;
                    break L2;
                  }
                }
                var11 = new bba();
                var11.a((byte) -98, (wm) (Object) new cc(var10.c(false)));
                var11.a((rna) (Object) new ika(0), true);
                param1.a(var11, -38);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var7 = (Exception) (Object) decompiledCaughtException;
                var7.printStackTrace();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var7_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("bea.EA(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param5 + ')');
        }
    }

    private final int a(int param0, int param1, cq[] param2, pe param3, cq[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (null != param4) {
                  var6_int = 0;
                  L3: while (true) {
                    if (var6_int >= param4.length) {
                      break L2;
                    } else {
                      stackOut_6_0 = param0;
                      stackOut_6_1 = param3.a(param4[var6_int], param1 + 2958);
                      stackIn_15_0 = stackOut_6_0;
                      stackIn_15_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        if (stackIn_7_0 == stackIn_7_1) {
                          stackOut_11_0 = param3.a(param2[var6_int], 87);
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0;
                        } else {
                          var6_int++;
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_14_0 = param1;
              stackOut_14_1 = -2950;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              break L1;
            }
            L4: {
              if (stackIn_15_0 == stackIn_15_1) {
                break L4;
              } else {
                this.a(54, false, -51, (Random) null, (rsb) null);
                break L4;
              }
            }
            stackOut_18_0 = param0;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("bea.GB(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_19_0;
    }

    private final void a(Random param0, int[][] param1, int[] param2, pe param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int[] var9 = null;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        qob var25 = null;
        int var26 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var26 = VoidHunters.field_G;
        try {
          L0: {
            var7_int = 0;
            L1: while (true) {
              stackOut_2_0 = ~var7_int;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= ~param1.length) {
                      break L4;
                    } else {
                      var8 = param1[var7_int];
                      var9 = ela.a((byte) -94, var8);
                      var10 = var9[0];
                      var11 = var9[1];
                      var12 = var9[2];
                      var13 = var9[3];
                      var14 = Math.min(tf.a(14, -85, var8), 1000);
                      var15 = var11 + -var10;
                      var16 = var13 + -var12;
                      var17 = param2[var7_int];
                      stackOut_4_0 = 0;
                      stackOut_4_1 = var17;
                      stackIn_18_0 = stackOut_4_0;
                      stackIn_18_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var26 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_5_0 == stackIn_5_1) {
                            var18 = 2 * var14;
                            var19 = (var9[0] - -var9[1]) / 2;
                            var20 = (var9[2] + var9[3]) / 2;
                            var21 = 0;
                            L6: while (true) {
                              if (~var21 <= ~var18) {
                                break L5;
                              } else {
                                var22 = hob.a(param0, var15, 116) - -var10;
                                var23 = hob.a(param0, var16, 120) + var12;
                                stackOut_11_0 = fra.a(var8, var23, 2, var22);
                                stackIn_3_0 = stackOut_11_0 ? 1 : 0;
                                stackIn_12_0 = stackOut_11_0;
                                if (var26 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    if (!stackIn_12_0) {
                                      break L7;
                                    } else {
                                      var24 = this.a(var19, var22, var8, var23, (byte) 105, var20) ? 1 : 0;
                                      if (var24 == 0) {
                                        break L7;
                                      } else {
                                        var25 = new qob(var22, var23);
                                        param3.a(param4, var25, (byte) -71);
                                        break L7;
                                      }
                                    }
                                  }
                                  var21++;
                                  if (var26 == 0) {
                                    continue L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var7_int++;
                        if (var26 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_17_0 = param5;
                  stackOut_17_1 = 4;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L3;
                }
                L8: {
                  if (stackIn_18_0 == stackIn_18_1) {
                    break L8;
                  } else {
                    this.a(15, (Random) null, (rsb) null, (byte) -65, 46);
                    break L8;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("bea.WA(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new float[2];
        field_a = new String[]{"AAEAKQEoAyABHv8CDwMPBA--BSX-AigDIAEiAg8DDwQrBSv-AhkDGQQZBSIAKwEPAg8GK---AygBJQMgAg8DDwQPBR7-----ASkBKAMgAR7-Ag8DDwQP-wUl-wIoAyABIgIPAw8EKwUr-wIZAxkEGQUiACsBDwIPBiv--wMoASUDIAIPAw8EDwUe-----wIpASgDIAEe-wIPAw8ED-8FJf8CKAMgASICDwMPBCsFK-8CGQMZBBkFIgArAQ8CDwYr--8DKAElAyACDwMPBA8FHv----8DKQEoAyABHv8CDwMPBA--BSX-AigDIAEiAg8DDwQrBSv-AhkDGQQZBSIAKwEPAg8GK---AygBJQMgAg8DDwQPBR7---8", "AAEAKQEoABsDIAAkAR7-Ag8DDwQP--8CKAItAx0AIAEiAg8DDwQrBSv-AhkDGQQZBSIAKwEPAg8GK---BC3-AygDIAIPAw8EDwUeACT--wYb-wEpASgAGwMgACQBHv8CDwMPBA---wIoAi0DHQAgASICDwMPBCsFK-8CGQMZBBkFIgArAQ8CDwYr--8ELf8DKAMgAg8DDwQPBR4AJP--Bhv-AikBKAAbAyAAJAEe-wIPAw8ED---AigCLQMdACABIgIPAw8EKwUr-wIZAxkEGQUiACsBDwIPBiv--wQt-wMoAyACDwMPBA8FHgAk--8GG-8DKQEoABsDIAAkAR7-Ag8DDwQP--8CKAItAx0AIAEiAg8DDwQrBSv-AhkDGQQZBSIAKwEPAg8GK---BC3-AygDIAIPAw8EDwUeACT--wYb"};
    }
}
