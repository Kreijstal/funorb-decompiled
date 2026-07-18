/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lc {
    private int field_i;
    private so field_g;
    private int field_h;
    static vn field_j;
    private int field_n;
    static String field_r;
    private qb field_b;
    private int field_l;
    private int field_m;
    private double field_f;
    static String field_c;
    static String field_a;
    static on[] field_q;
    private int field_d;
    static String field_o;
    static String field_k;
    static String field_e;
    static String field_p;

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!ArcanistsMulti.i((byte) -120)) {
              L1: {
                L2: {
                  L3: {
                    if (param1 > 0) {
                      break L3;
                    } else {
                      int discarded$4 = mi.field_B.a(rl.field_i, param2, -48 + param0, 300, 80, 0, -1, 1, 1, mi.field_B.field_C);
                      int discarded$5 = mi.field_B.a(aa.field_j, param2, param0 + 24, 300, 32, 0, -1, 1, 1, mi.field_B.field_C);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    int discarded$6 = mi.field_B.a(ic.field_b, param2, -48 + param0, 300, 80, 0, -1, 1, 1, mi.field_B.field_C);
                    param0 += 24;
                    param2 += 16;
                    int discarded$7 = mi.field_B.a(ug.field_l + param1, param2, param0, 70, 32, 0, -1, 1, 1, mi.field_B.field_C);
                    param2 += 90;
                    if (param1 <= 99) {
                      break L4;
                    } else {
                      param2 += 8;
                      break L4;
                    }
                  }
                  var5_int = 0;
                  L5: while (true) {
                    if (~var5_int <= ~param1) {
                      break L2;
                    } else {
                      stackOut_14_0 = param1;
                      stackOut_14_1 = 5 + var5_int;
                      stackIn_29_0 = stackOut_14_0;
                      stackIn_29_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        L6: {
                          L7: {
                            if (stackIn_15_0 <= stackIn_15_1) {
                              break L7;
                            } else {
                              param2 -= 4;
                              tg.field_b[8].a(param2, param0);
                              param2 += 15;
                              var5_int += 4;
                              if (~var5_int != ~((-(param1 % 10) + param1) / 2 + -1)) {
                                break L6;
                              } else {
                                if (param1 <= 50) {
                                  break L6;
                                } else {
                                  param0 += 8;
                                  param2 = param2 - var5_int * 2;
                                  if (var6 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          tg.field_b[7].a(param2, param0);
                          param2 += 9;
                          break L6;
                        }
                        var5_int++;
                        if (var6 == 0) {
                          continue L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_28_0 = 97;
                stackOut_28_1 = (param3 - 56) / 48;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                break L1;
              }
              var5_int = stackIn_29_0 % stackIn_29_1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "lc.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        try {
          L0: {
            if (6 == ((lc) this).field_l) {
              if (!lc.a((byte) 112)) {
                L1: {
                  stackOut_6_0 = this.b(param1, 200);
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (param1 >= 2) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 300;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = 150;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    break L1;
                  }
                }
                stackOut_10_0 = stackIn_10_0 + stackIn_10_1;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_4_0 = this.b(param1, 200) - -320;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              if (7 == ((lc) this).field_l) {
                stackOut_15_0 = 200 + this.b(param1, 200);
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0;
              } else {
                if (((lc) this).field_l != 11) {
                  if (((lc) this).field_l != 12) {
                    if (((lc) this).field_l != 14) {
                      if (3 != ((lc) this).field_l) {
                        if (((lc) this).field_l == 9) {
                          stackOut_52_0 = 440;
                          stackIn_53_0 = stackOut_52_0;
                          return stackIn_53_0;
                        } else {
                          L2: {
                            if (~((lc) this).field_l == param0) {
                              if (param1 == 0) {
                                stackOut_60_0 = 220;
                                stackIn_61_0 = stackOut_60_0;
                                return stackIn_61_0;
                              } else {
                                if (param1 == 1) {
                                  stackOut_65_0 = 420;
                                  stackIn_66_0 = stackOut_65_0;
                                  return stackIn_66_0;
                                } else {
                                  if (param1 != 2) {
                                    break L2;
                                  } else {
                                    stackOut_68_0 = 620;
                                    stackIn_69_0 = stackOut_68_0;
                                    return stackIn_69_0;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                          stackOut_70_0 = eo.field_b[((lc) this).field_l];
                          stackIn_71_0 = stackOut_70_0;
                          break L0;
                        }
                      } else {
                        stackOut_47_0 = 560;
                        stackIn_48_0 = stackOut_47_0;
                        return stackIn_48_0;
                      }
                    } else {
                      stackOut_44_0 = this.b(param1, param0 ^ -193) + 200;
                      stackIn_45_0 = stackOut_44_0;
                      return stackIn_45_0;
                    }
                  } else {
                    if (param1 == 0) {
                      stackOut_36_0 = 271;
                      stackIn_37_0 = stackOut_36_0;
                      return stackIn_37_0;
                    } else {
                      if (param1 != 1) {
                        stackOut_41_0 = 200 + this.b(param1, 200);
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0;
                      } else {
                        stackOut_39_0 = 619;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      }
                    }
                  }
                } else {
                  if (param1 == 0) {
                    stackOut_23_0 = 295;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0;
                  } else {
                    if (param1 != 1) {
                      stackOut_28_0 = 200 + this.b(param1, 200);
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0;
                    } else {
                      stackOut_26_0 = 611;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.V(" + param0 + ',' + param1 + ')');
        }
        return stackIn_71_0;
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 112) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_3_0 = qe.field_p;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "lc.F(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (re.field_r != 1) {
                break L1;
              } else {
                L2: {
                  var2_int = dd.field_g;
                  if (ke.field_K != var2_int) {
                    break L2;
                  } else {
                    ke.field_K = -1;
                    if (!ArcanistsMulti.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var2_int == -1) {
                  break L1;
                } else {
                  ke.field_K = var2_int;
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == -1) {
                break L3;
              } else {
                ((lc) this).field_g = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "lc.C(" + param0 + ')');
        }
    }

    final static int a(boolean param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_1_0 = 0;
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
            if (param2 <= -82) {
              if (!param0) {
                stackOut_6_0 = ob.field_T.b(param1);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = vd.field_c.b(param1);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -107;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    private final void b(byte param0) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12_int = 0;
        String[] var12 = null;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        qb var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        String stackIn_37_0 = null;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        String stackOut_36_0 = null;
        String stackOut_35_0 = null;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        byte stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      var23 = ArcanistsMulti.field_G ? 1 : 0;
                                      var3 = uc.field_a + 96;
                                      var4 = 64 + bi.field_I;
                                      var5 = var4;
                                      var6 = 512;
                                      var12_int = fh.field_e;
                                      if (var12_int != 0) {
                                        break L14;
                                      } else {
                                        if (var23 == 0) {
                                          L15: {
                                            var2 = wm.field_J;
                                            var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 16);
                                            var2 = nj.field_j;
                                            var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 16);
                                            var2 = ud.field_u;
                                            var3 = var3 + (16 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
                                            if (ArcanistsMulti.i((byte) -121)) {
                                              stackOut_36_0 = cb.field_d;
                                              stackIn_37_0 = stackOut_36_0;
                                              break L15;
                                            } else {
                                              stackOut_35_0 = cn.field_J;
                                              stackIn_37_0 = stackOut_35_0;
                                              break L15;
                                            }
                                          }
                                          var2 = stackIn_37_0;
                                          var2 = tj.a(119, new String[2], var2);
                                          var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 16);
                                          var2 = fd.field_c;
                                          var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 32);
                                          if (var23 == 0) {
                                            break L1;
                                          } else {
                                            break L13;
                                          }
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L16: {
                                      if (var12_int != 1) {
                                        break L16;
                                      } else {
                                        if (var23 == 0) {
                                          break L13;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    if (var12_int == 2) {
                                      break L12;
                                    } else {
                                      if (3 == var12_int) {
                                        break L11;
                                      } else {
                                        if (var12_int == 4) {
                                          break L10;
                                        } else {
                                          L17: {
                                            if (var12_int != 5) {
                                              break L17;
                                            } else {
                                              if (var23 == 0) {
                                                break L9;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          if (var12_int == 6) {
                                            break L8;
                                          } else {
                                            if (var12_int == 7) {
                                              break L7;
                                            } else {
                                              if (var12_int == 8) {
                                                break L6;
                                              } else {
                                                L18: {
                                                  if (var12_int != 9) {
                                                    break L18;
                                                  } else {
                                                    if (var23 == 0) {
                                                      break L5;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                if (var12_int == 10) {
                                                  break L4;
                                                } else {
                                                  if (var12_int == 11) {
                                                    break L3;
                                                  } else {
                                                    if (12 == var12_int) {
                                                      break L2;
                                                    } else {
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var2 = fj.field_g;
                                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                  var2 = md.field_e;
                                  var3 = var3 + (16 - -((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C)));
                                  var2 = qm.field_l;
                                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                  var2 = cc.field_b;
                                  var2 = tj.a(118, new String[4], var2);
                                  var3 = var3 + (16 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                                  var2 = ch.field_e;
                                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                  var2 = vf.field_p;
                                  var2 = tj.a(124, new String[2], var2);
                                  var3 = var3 + (32 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m));
                                  if (var23 == 0) {
                                    break L1;
                                  } else {
                                    break L12;
                                  }
                                }
                                var2 = lf.field_d;
                                var3 = var3 + (8 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
                                var7 = var4;
                                var9 = 45 + bi.field_I;
                                var8 = 550;
                                var10 = 230 - -bi.field_I;
                                de.e(var9, var3, var8, 60, 16777215, 128);
                                var2 = cf.field_e;
                                var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                                bb.field_g[0].c(var4, var3);
                                var4 += 40;
                                bb.field_g[12].b(var4, var3);
                                var3 += 20;
                                bb.field_g[14].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                bb.field_g[38].b(var4, var3);
                                var3 += 20;
                                bb.field_g[43].b(var4, var3);
                                var3 -= 20;
                                var4 += 20;
                                bb.field_g[44].b(var4, var3);
                                var3 += 20;
                                bb.field_g[49].b(var4, var3);
                                var3 -= 20;
                                var4 += 20;
                                bb.field_g[51].b(var4, var3);
                                var3 += 20;
                                bb.field_g[61].b(var4, var3);
                                var3 -= 20;
                                var4 += 20;
                                bb.field_g[64].b(var4, var3);
                                var3 += 20;
                                bb.field_g[96].b(var4, var3);
                                var3 -= 20;
                                var4 += 20;
                                bb.field_g[100].b(var4, var3);
                                var3 += 20;
                                bb.field_g[108].b(var4, var3);
                                var4 += 20;
                                var3 += 30;
                                var2 = pm.field_g;
                                var4 = var7;
                                int discarded$27 = mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                                de.e(var9, var3, var8, 60, 16777215, 128);
                                var2 = p.field_h;
                                var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                                bb.field_g[1].c(var4, var3);
                                var4 += 40;
                                bb.field_g[8].b(var4, var3);
                                var3 += 20;
                                bb.field_g[10].b(var4, var3);
                                var3 -= 20;
                                var4 += 20;
                                bb.field_g[19].b(var4, var3);
                                var3 += 20;
                                bb.field_g[26].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                bb.field_g[31].b(var4, var3);
                                var3 += 20;
                                bb.field_g[34].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                bb.field_g[45].b(var4, var3);
                                var3 += 20;
                                bb.field_g[56].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                bb.field_g[132].b(var4, var3);
                                var3 += 20;
                                bb.field_g[97].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                bb.field_g[101].b(var4, var3);
                                var3 += 20;
                                bb.field_g[115].b(var4, var3);
                                var3 -= 20;
                                var4 += 20;
                                var3 += 50;
                                var2 = field_o;
                                int discarded$28 = mi.field_B.a(var2, var10, var3 - 65, 356, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                var4 = var7;
                                de.e(var9, var3, var8, 60, 16777215, 128);
                                var2 = ma.field_S;
                                var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                                bb.field_g[7].c(var4, var3);
                                var4 += 40;
                                bb.field_g[20].b(var4, var3);
                                var3 += 20;
                                bb.field_g[72].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                bb.field_g[135].b(var4, var3);
                                var3 += 20;
                                var3 += 30;
                                var2 = oj.field_a;
                                var4 = var7;
                                int discarded$29 = mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                                de.e(var9, var3, var8, 60, 16777215, 128);
                                var2 = mn.field_q;
                                var3 = var3 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                                bb.field_g[3].c(var4, var3);
                                var4 += 40;
                                bb.field_g[13].b(var4, var3);
                                var3 += 20;
                                bb.field_g[24].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                bb.field_g[36].b(var4, var3);
                                var3 += 20;
                                bb.field_g[98].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                bb.field_g[99].b(var4, var3);
                                var3 += 20;
                                bb.field_g[114].b(var4, var3);
                                var4 += 20;
                                var3 -= 20;
                                var2 = am.field_b;
                                var3 += 30;
                                var4 = var7;
                                int discarded$30 = mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                if (var23 == 0) {
                                  break L1;
                                } else {
                                  break L11;
                                }
                              }
                              var9 = 45 + bi.field_I;
                              var10 = bi.field_I - -290;
                              var2 = jf.field_i;
                              var8 = 550;
                              var7 = var4;
                              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                              var7 = var4;
                              de.e(var9, var3, var8, 60, 16777215, 128);
                              var2 = qj.field_b;
                              var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                              bb.field_g[2].c(var4, var3);
                              var4 += 40;
                              bb.field_g[15].b(var4, var3);
                              var3 += 20;
                              bb.field_g[25].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[32].b(var4, var3);
                              var3 += 20;
                              bb.field_g[33].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[35].b(var4, var3);
                              var3 += 20;
                              bb.field_g[37].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[53].b(var4, var3);
                              var3 += 20;
                              bb.field_g[54].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[59].b(var4, var3);
                              var3 += 20;
                              bb.field_g[65].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[66].b(var4, var3);
                              var3 += 20;
                              bb.field_g[71].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[76].b(var4, var3);
                              var3 += 20;
                              bb.field_g[77].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[133].b(var4, var3);
                              var3 += 20;
                              var2 = hn.field_i;
                              var3 += 30;
                              int discarded$31 = mi.field_B.a(var2, var10, var3 + -65, 286, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                              var4 = var7;
                              de.e(var9, var3, var8, 60, 16777215, 128);
                              var2 = rc.field_f;
                              var3 = var3 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                              bb.field_g[4].c(var4, var3);
                              var4 += 40;
                              bb.field_g[5].b(var4, var3);
                              var3 += 20;
                              bb.field_g[9].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[11].b(var4, var3);
                              var3 += 20;
                              bb.field_g[17].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[21].b(var4, var3);
                              var3 += 20;
                              bb.field_g[29].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[39].b(var4, var3);
                              var3 += 20;
                              bb.field_g[41].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[42].b(var4, var3);
                              var3 += 20;
                              bb.field_g[52].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[55].b(var4, var3);
                              var3 += 20;
                              bb.field_g[63].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[67].b(var4, var3);
                              var3 += 20;
                              bb.field_g[68].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[74].b(var4, var3);
                              var3 += 20;
                              bb.field_g[106].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[109].b(var4, var3);
                              var3 += 20;
                              bb.field_g[112].b(var4, var3);
                              var3 += 30;
                              var4 += 20;
                              var2 = sn.field_J;
                              var4 = var7;
                              int discarded$32 = mi.field_B.a(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                              de.e(var9, var3, var8, 60, 16777215, 128);
                              var2 = me.field_P;
                              var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                              bb.field_g[73].c(var4, var3);
                              var4 += 40;
                              bb.field_g[22].b(var4, var3);
                              var3 += 20;
                              bb.field_g[46].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[48].b(var4, var3);
                              var3 += 20;
                              bb.field_g[60].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[103].b(var4, var3);
                              var3 += 20;
                              var3 += 30;
                              var2 = jd.field_e;
                              int discarded$33 = mi.field_B.a(var2, var10, var3 + -65, 286, 60, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                              var4 = var7;
                              de.e(var9, var3, var8, 60, 16777215, 128);
                              de.h(0, var3 - -60, an.field_f, an.field_j);
                              de.c(var9, var3, var8, 105, 25, 16777215, 128);
                              de.a();
                              var2 = om.field_L;
                              var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                              bb.field_g[75].c(var4, var3);
                              var4 += 40;
                              bb.field_g[6].b(var4, var3);
                              var3 += 20;
                              bb.field_g[16].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[18].b(var4, var3);
                              var3 += 20;
                              bb.field_g[23].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[27].b(var4, var3);
                              var3 += 20;
                              bb.field_g[28].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[30].b(var4, var3);
                              var3 += 20;
                              bb.field_g[40].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[47].b(var4, var3);
                              var3 += 20;
                              bb.field_g[50].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[57].b(var4, var3);
                              var3 += 20;
                              bb.field_g[58].b(var4, var3);
                              var3 -= 20;
                              var4 += 20;
                              bb.field_g[62].b(var4, var3);
                              var3 += 20;
                              bb.field_g[69].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[70].b(var4, var3);
                              var3 += 20;
                              bb.field_g[102].b(var4, var3);
                              var4 += 20;
                              var3 -= 20;
                              bb.field_g[104].b(var4, var3);
                              var3 += 20;
                              bb.field_g[110].b(var4, var3);
                              var4 += 20;
                              var3 += 30;
                              var2 = gb.field_e;
                              int discarded$34 = mi.field_B.a(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                              var2 = jn.field_b;
                              int discarded$35 = mi.field_B.a(var2, var5, -5 + var3, var6, 60, 0, -1, 1, 0, mi.field_B.field_C + mi.field_B.field_m);
                              var4 = var7;
                              if (var23 == 0) {
                                break L1;
                              } else {
                                break L10;
                              }
                            }
                            L19: {
                              var2 = n.field_e;
                              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                              var4 = 320 + (bi.field_I + -80);
                              var3 = -70 + uc.field_a + 240;
                              de.a(-1 + var4, var3 + -1, 162, 122, 0);
                              md.field_f[2].c(var4, -24 + var3, 160, 160);
                              de.b(var4 - 170, var3 + 22, var4 - 10, 22 + var3, 16711680);
                              de.b(var4 + 5, 5 + var3 - -15, -10 + var4, var3 - -22, 16711680);
                              mi.field_B.a(ue.field_a, -180 + var4, 20 + var3, 0, 16711680);
                              de.a(var4 + 5, var3 + 5, 50, 30, 6, 16711680);
                              de.c(5 + var4, var3 - -5, 50, 30, 6, 16711680, 64);
                              de.b(-170 + var4, -18 + var3, var4 + 40, -18 + var3, 65280);
                              de.b(10 + (var4 - -70), var3, var4 - -40, var3 + -18, 65280);
                              mi.field_B.a(lh.field_h, var4 - 180, -20 + var3, 0, 65280);
                              de.a(70 + var4, var3, 20, 15, 4, 65280);
                              de.c(70 + var4, var3, 20, 15, 4, 65280, 64);
                              de.b(180 + (160 + var4), var3 - -22, 10 + (160 + var4), var3 - -22, 33023);
                              de.b(var4 + 145 - -10, var3 + 10, 160 + var4 + 10, var3 - -22, 33023);
                              mi.field_B.c(u.field_m, 160 + var4 + 180, 20 + var3, 0, 33023);
                              de.a(145 + var4, 5 + var3, 10, 10, 4, 33023);
                              de.c(var4 - -145, 5 + var3, 10, 10, 4, 33023, 64);
                              de.b(-170 + var4, 122 + var3, -10 + var4, 122 + var3, 16711935);
                              de.b(var4 + 5, 7 + (var3 + 105), -10 + var4, var3 - -122, 16711935);
                              mi.field_B.a(hc.field_a, var4 - 180, var3 - -120, 0, 16711935);
                              de.a(var4 + 5, var3 + 105, 110, 15, 6, 16711935);
                              de.c(var4 + 5, 105 + var3, 110, 15, 6, 16711935, 64);
                              de.b(180 + var4 - -160, var3 - -102, var4 - -170, 102 + var3, 16776960);
                              de.b(40 + var4 - -125, 7 + (105 + var3), 170 + var4, 102 + var3, 16776960);
                              mi.field_B.c(oa.field_b, 180 + (var4 - -160), 100 + var3, 0, 16776960);
                              de.a(125 + var4, var3 + 105, 40, 15, 6, 16776960);
                              de.c(125 + var4, var3 - -105, 40, 15, 6, 16776960, 64);
                              var3 += 140;
                              var2 = tk.field_m;
                              var4 = bi.field_I + 64;
                              var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var4, var3, 512, 128, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                              var2 = tn.field_Kb;
                              var3 += 16;
                              var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var4, var3, 192, 128, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                              var12_int = 0;
                              var13_int = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 16;
                              var17 = 0;
                              var18 = -16;
                              var3 = 32;
                              var19 = 0;
                              var4 = 32;
                              var20 = new qb(128, 128);
                              var20.a();
                              de.i(64, 64, 32, 7829367);
                              gn.a(32, (byte) 62, 128, 64, 64);
                              pc.a(kg.field_d[2], var17 + var3, kg.field_d[3], kg.field_d[0], (byte) 118, kg.field_d[1], qe.field_i[so.field_c[3]], var4 + var16);
                              if (so.field_c[0] != 46) {
                                pc.a(kg.field_d[2], var3 - -var13_int, kg.field_d[3], kg.field_d[0], (byte) -123, kg.field_d[1], fn.field_b[0], var4 - -var12_int);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 109, kg.field_d[1], jd.field_j[so.field_c[0]], var4);
                              var3 -= 8;
                              var3 -= 16;
                              pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 47, kg.field_d[1], kc.field_kb[so.field_c[1]], var4);
                              var3 += 16;
                              pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -99, kg.field_d[1], hn.field_d[so.field_c[5]], var4);
                              if (so.field_c[5] == 53) {
                                break L20;
                              } else {
                                if (so.field_c[5] == 55) {
                                  break L20;
                                } else {
                                  pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -90, kg.field_d[1], bo.field_a[0], var4);
                                  break L20;
                                }
                              }
                            }
                            L21: {
                              var3 -= 16;
                              pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -80, kg.field_d[1], tj.field_A[so.field_c[4]], var4);
                              var3 += 8;
                              var3 += 16;
                              if (46 == so.field_c[0]) {
                                break L21;
                              } else {
                                pc.a(kg.field_d[2], var3 + var15, kg.field_d[3], kg.field_d[0], (byte) -117, kg.field_d[1], h.field_I[0], var14 + var4);
                                break L21;
                              }
                            }
                            pc.a(kg.field_d[2], var3 - -var19, kg.field_d[3], kg.field_d[0], (byte) 20, kg.field_d[1], ea.field_u[so.field_c[2]], var4 + var18);
                            ce.field_m.a(true);
                            var21 = 320 + bi.field_I;
                            var22 = 350 + uc.field_a;
                            var20.b(var21, var22);
                            de.h(var21, 46 + var22, 64 + var21, an.field_j);
                            kh.field_d.a(var21 + -32, -92 + (10 + var22));
                            de.a();
                            mi.field_B.b("250", var21 + 32, var22 + 8, 16777215, -1);
                            if (var23 == 0) {
                              break L1;
                            } else {
                              break L9;
                            }
                          }
                          L22: {
                            var2 = i.field_h;
                            if (ArcanistsMulti.i((byte) -92)) {
                              var12_int = bi.field_I + (74 + tj.field_t.b(var2));
                              ii.field_d.c(var12_int, -2 + var3, 32, 32);
                              mi.field_B.a(tk.field_o, 40 + var12_int, var3 + (tj.field_t.field_C - -mi.field_B.field_C) / 2, 16711680, -1);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                          var2 = km.field_b;
                          var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 8);
                          var2 = hh.field_a;
                          var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, 32 + var5, var3, 448, 480, 16777215, 0, 1, 0, mi.field_B.field_C - -mi.field_B.field_m) + 16);
                          var3 += 24;
                          var4 += 320;
                          var3 += 16;
                          de.h(0, var3, an.field_f, an.field_j);
                          fe.field_g.c(bi.field_I + 43, var3 - 32);
                          fe.field_g.c(106 + bi.field_I, -32 + var3);
                          de.a();
                          tg.field_b[7].a(var4, -2 + var3);
                          mi.field_B.a("= 1" + wn.field_x, 20 + var4, 20 + var3, 16776960, 0);
                          tg.field_b[8].a(var4 + 100, -2 + var3);
                          mi.field_B.a("= 5" + dk.field_g, 20 + var4 - -100, var3 - -20, 16776960, 0);
                          var2 = an.field_n;
                          var4 -= 320;
                          var2 = tj.a(127, new String[1], var2);
                          var3 -= 48;
                          var3 = var3 + (16 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 312, 480, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                          var3 += 48;
                          var3 += 24;
                          var2 = fo.field_j;
                          var3 -= 32;
                          rm.field_o[9].b(64 + bi.field_I, var3);
                          rm.field_o[2].b(bi.field_I + 64, var3);
                          tk.field_x[4].b(56 + bi.field_I, var3);
                          var3 += 16;
                          var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, 136 + bi.field_I, var3, 440, an.field_j, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 16);
                          if (var23 == 0) {
                            break L1;
                          } else {
                            break L8;
                          }
                        }
                        var2 = gl.field_a;
                        var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                        var2 = hl.field_i;
                        var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 8);
                        var2 = jl.field_f;
                        var3 = var3 + (8 - -((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m)));
                        var2 = nm.field_d;
                        var3 = var3 + (16 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5 + 32, var3, var6 + -64, 480, 16777215, 0, 1, 0, mi.field_B.field_m + mi.field_B.field_C)));
                        var2 = va.field_a;
                        var3 = var3 + (8 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m)));
                        if (var23 == 0) {
                          break L1;
                        } else {
                          break L7;
                        }
                      }
                      L23: {
                        var2 = db.field_d;
                        if (ArcanistsMulti.i((byte) -99)) {
                          var12_int = 74 + bi.field_I + tj.field_t.b(var2);
                          ii.field_d.c(var12_int, -2 + var3, 32, 32);
                          mi.field_B.a(kc.field_M, var12_int + 40, (mi.field_B.field_C + tj.field_t.field_C) / 2 + var3, 16711680, -1);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                      var2 = nb.field_c;
                      var3 = var3 + (8 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m));
                      var2 = kl.field_F;
                      var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 6);
                      var11 = new int[]{16711935, 16711680, 16746632, 16776960, 65535, 34816, 16777215, 4521762, 1364125, 16755302};
                      var2 = uh.field_q;
                      int discarded$36 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                      var2 = tj.a(-115, new String[1], ve.field_s);
                      var3 = var3 + (2 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C)));
                      var2 = ik.field_a;
                      int discarded$37 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                      var2 = tj.a(-51, new String[1], ra.field_b);
                      var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                      var2 = field_p;
                      int discarded$38 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                      var2 = tj.a(-116, new String[1], hm.field_a);
                      var3 = var3 + (2 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                      var2 = pk.field_b;
                      int discarded$39 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                      var2 = tj.a(-47, new String[1], pc.field_a);
                      var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m) + 2);
                      var2 = sl.field_M;
                      int discarded$40 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                      var2 = tj.a(-120, new String[1], di.field_b);
                      var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                      var2 = pb.field_l;
                      int discarded$41 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                      var2 = tj.a(122, new String[1], go.field_f);
                      var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                      var2 = dk.field_f;
                      int discarded$42 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                      var2 = tj.a(-71, new String[1], ra.field_e);
                      var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m) + 2);
                      var2 = fg.field_i;
                      int discarded$43 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                      var2 = tj.a(113, new String[1], fo.field_i);
                      var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                      var2 = mf.field_e;
                      int discarded$44 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                      var2 = tj.a(-33, new String[1], ie.field_Rb);
                      var3 = var3 + (6 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                      var2 = vn.field_a;
                      var3 = var3 + (8 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                      if (var23 == 0) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                    var2 = an.field_m;
                    var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                    this.a(var3, var4, (byte) -102, 3);
                    var2 = ne.field_j;
                    int discarded$45 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                    var2 = na.field_Tb;
                    var3 += 128;
                    var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                    this.a(var3, var4, (byte) -77, 0);
                    var2 = kn.field_pb;
                    int discarded$46 = mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                    bb.field_g[5].c(var4, var3 + 80);
                    if (var23 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                  var2 = rk.field_J;
                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                  this.a(var3, var4, (byte) -49, 1);
                  var2 = ah.field_e;
                  int discarded$47 = mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                  bb.field_g[17].c(var4, var3 + 80);
                  var2 = hn.field_o;
                  var3 += 128;
                  var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                  this.a(var3, var4, (byte) -71, 2);
                  var2 = dn.field_Bb;
                  int discarded$48 = mi.field_B.a(var2, bi.field_I - -320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                  bb.field_g[42].c(var4, 80 + var3);
                  if (var23 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
                var2 = oo.field_q;
                var3 = var3 + (8 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
                this.a(var3, var4, (byte) -47, 4);
                var2 = sc.field_S;
                int discarded$49 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                bb.field_g[29].c(var4, 120 + (-40 + var3));
                var2 = wn.field_A;
                var3 += 128;
                var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                this.a(var3, var4, (byte) -86, 5);
                var2 = lm.field_d;
                int discarded$50 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                bb.field_g[55].c(var4, 80 + var3);
                if (var23 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
              var2 = ck.field_c;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
              this.a(var3, var4, (byte) -36, 6);
              var2 = qj.field_f;
              int discarded$51 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
              bb.field_g[67].c(var4, var3 + 80);
              var3 += 128;
              var2 = b.field_c;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
              this.a(var3, var4, (byte) -42, 7);
              var2 = uh.field_l;
              int discarded$52 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
              bb.field_g[85].c(var4, 120 + (-40 + var3));
              if (var23 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
            var2 = lo.field_t;
            var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
            var2 = ao.field_b;
            var12 = new String[50];
            var13 = new int[]{480};
            var14 = mi.field_B.a(var2, var13, var12);
            var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m);
            var15 = 0;
            L24: while (true) {
              if (var14 <= var15) {
                break L1;
              } else {
                mi.field_B.a(var12[var15], var4, var3, 0, -1);
                stackOut_66_0 = var12[var15].length();
                stackOut_66_1 = 2;
                stackIn_75_0 = stackOut_66_0;
                stackIn_75_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (var23 != 0) {
                  break L0;
                } else {
                  L25: {
                    if (stackIn_67_0 <= stackIn_67_1) {
                      break L25;
                    } else {
                      if (45 == var12[var15].charAt(1)) {
                        gj.field_f[0].a(-2 + var4, -12 + var3);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m);
                  var15++;
                  if (var23 == 0) {
                    continue L24;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_74_0 = param0;
          stackOut_74_1 = 71;
          stackIn_75_0 = stackOut_74_0;
          stackIn_75_1 = stackOut_74_1;
          break L0;
        }
        L26: {
          if (stackIn_75_0 >= stackIn_75_1) {
            break L26;
          } else {
            boolean discarded$53 = this.g(-45, -88);
            break L26;
          }
        }
        tj.field_t.c(ul.a(fh.field_e, (byte) 69), 590 + bi.field_I, uc.field_a - -112, 0, -1);
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                lc.c(true);
                break L1;
              }
            }
            L2: {
              gi.field_c = param1;
              mf.field_c = param0;
              if (null == pm.field_e) {
                break L2;
              } else {
                pm.field_e.a(-120, param1, param0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((lc) this).field_g.field_h != -1) {
                param1 = ((lc) this).field_g.field_h;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((lc) this).field_l == 10) {
                param1 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((lc) this).field_g.a(param0, param1, false, this.a((byte) 88, an.field_g, me.field_I));
              ke.field_K = -1;
              if (param2 < -113) {
                break L3;
              } else {
                field_r = null;
                break L3;
              }
            }
            dd.field_g = -1;
            oj.field_e = jb.field_v;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "lc.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
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
        Object var16_ref = null;
        int var16 = 0;
        int[] var17 = null;
        int var17_int = 0;
        int var18_int = 0;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        int stackIn_231_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_234_1 = 0;
        int stackIn_677_0 = 0;
        int stackIn_737_0 = 0;
        int stackIn_793_0 = 0;
        int stackIn_793_1 = 0;
        int stackIn_795_0 = 0;
        int stackIn_798_0 = 0;
        int stackIn_798_1 = 0;
        int stackIn_849_0 = 0;
        int stackIn_851_0 = 0;
        int stackIn_851_1 = 0;
        int stackIn_853_0 = 0;
        int stackIn_856_0 = 0;
        int stackIn_856_1 = 0;
        int stackIn_909_0 = 0;
        int stackIn_915_0 = 0;
        int stackIn_915_1 = 0;
        int stackIn_917_0 = 0;
        int stackIn_920_0 = 0;
        int stackIn_920_1 = 0;
        int stackIn_938_0 = 0;
        int stackIn_940_0 = 0;
        int stackIn_940_1 = 0;
        int stackIn_945_0 = 0;
        int stackIn_945_1 = 0;
        Throwable caughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_228_0 = 0;
        int stackOut_228_1 = 0;
        int stackOut_230_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_233_1 = 0;
        int stackOut_674_0 = 0;
        int stackOut_676_0 = 0;
        int stackOut_736_0 = 0;
        int stackOut_792_0 = 0;
        int stackOut_792_1 = 0;
        int stackOut_794_0 = 0;
        int stackOut_797_0 = 0;
        int stackOut_797_1 = 0;
        int stackOut_848_0 = 0;
        int stackOut_850_0 = 0;
        int stackOut_850_1 = 0;
        int stackOut_852_0 = 0;
        int stackOut_855_0 = 0;
        int stackOut_855_1 = 0;
        int stackOut_908_0 = 0;
        int stackOut_914_0 = 0;
        int stackOut_914_1 = 0;
        int stackOut_916_0 = 0;
        int stackOut_919_0 = 0;
        int stackOut_919_1 = 0;
        int stackOut_937_0 = 0;
        int stackOut_939_0 = 0;
        int stackOut_939_1 = 0;
        int stackOut_944_0 = 0;
        int stackOut_944_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var32 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.c(-26733);
                    ((lc) this).field_m = -1;
                    var3 = 142;
                    var4_int = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4_int >= 7) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = this;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (((lc) this).field_h != var4_int) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = this.a(stackIn_7_1 != 0, 65, (byte) -127, true, 32 + (bi.field_I + 86 * var4_int), 65, uc.field_a + 104) ? 1 : 0;
                    mc.field_a[var4_int].c(86 * var4_int + (32 + bi.field_I), 104 + uc.field_a);
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var4_int == 6) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((lc) this).field_i = var4_int;
                    ((lc) this).field_m = 1;
                    if (var32 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((lc) this).field_m = 7;
                    var6 = -128 + (var4_int * 86 + 32 + bi.field_I);
                    var7 = 103 + (uc.field_a + -16);
                    int discarded$33 = mi.field_B.a(nj.field_l, var6, var7 - 1, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                    int discarded$34 = mi.field_B.a(nj.field_l, var6 + -1, var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                    int discarded$35 = mi.field_B.a(nj.field_l, 1 + var6, var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                    int discarded$36 = mi.field_B.a(nj.field_l, var6, 1 + var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                    int discarded$37 = mi.field_B.a(nj.field_l, var6, var7, 192, 192, 16777215, 0, 1, 0, mi.field_B.field_C);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var4_int++;
                    if (var32 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var4 = null;
                    if (0 != ((lc) this).field_h) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var4 = (Object) (Object) jd.field_j;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (((lc) this).field_h != 1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var4 = (Object) (Object) kc.field_kb;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (2 == ((lc) this).field_h) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var4 = (Object) (Object) ea.field_u;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (((lc) this).field_h == 3) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var4 = (Object) (Object) qe.field_i;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (((lc) this).field_h != 4) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 = (Object) (Object) tj.field_A;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (((lc) this).field_h == 5) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var4 = (Object) (Object) hn.field_d;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    boolean discarded$38 = this.a(true, 180, (byte) -106, false, bi.field_I + 32, 114, 182 + uc.field_a);
                    var3 = 210 + uc.field_a;
                    var2_int = bi.field_I + 90;
                    var13 = -1;
                    var14 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (4 < var14) {
                        statePc = 48;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackOut_36_0 = 12;
                    stackOut_36_1 = b.field_f[var14];
                    stackIn_49_0 = stackOut_36_0;
                    stackIn_49_1 = stackOut_36_1;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    if (var32 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (stackIn_37_0 > stackIn_37_1) {
                        statePc = 47;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (0 != b.field_f[var14] % 12) {
                        statePc = 47;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (b.field_f[11 + var14] != 11 + b.field_f[var14]) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var13 = b.field_f[var14] / 12 - 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var14++;
                    if (var32 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackOut_48_0 = var13;
                    stackOut_48_1 = -1;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if ((stackIn_49_0 ^ stackIn_49_1) == 0) {
                        statePc = 122;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var2_int -= 40;
                    var14 = 0;
                    var15 = 0;
                    var16_ref = null;
                    if (0 == var13) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var15 = 1;
                    var16_ref = (Object) (Object) lf.field_c;
                    var14 = 1;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var13 == 1) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var16_ref = (Object) (Object) tf.field_j;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (var13 != 2) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var16_ref = (Object) (Object) ij.field_Pb;
                    var15 = 1;
                    var14 = 1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var13 != 3) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var16_ref = (Object) (Object) fo.field_g;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var13 == 4) {
                        statePc = 65;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var16_ref = (Object) (Object) fc.field_e;
                    var14 = 1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (5 != var13) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var14 = 1;
                    var15 = 1;
                    var16_ref = (Object) (Object) ji.field_h;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var13 == 6) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var16_ref = (Object) (Object) rc.field_k;
                    var14 = 1;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (7 == var13) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var16_ref = (Object) (Object) eo.field_a;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (var13 != 8) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var15 = 1;
                    var14 = 1;
                    var16_ref = (Object) (Object) ae.field_a;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var14 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var17_int = var2_int;
                    var18_int = var3;
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                    var22 = 0;
                    var23 = 0;
                    var24 = 0;
                    var25 = 0;
                    var26 = 0;
                    var27 = (int)(8.0 * Math.cos(((lc) this).field_f * 2.0));
                    var28 = (int)(Math.sin(2.0 * ((lc) this).field_f) * 8.0);
                    if (var27 <= 0) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var22 = -var27;
                    if (var32 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var22 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var21 = var28;
                    if (var27 < 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var26 = 0;
                    if (var32 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var26 = var27;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var25 = -var28;
                    var24 = -(var28 >> -882302462);
                    var26 += 2;
                    var23 = -6 + -(var27 >> 692979265);
                    var20 = var28 >> 613862466;
                    var19 = 6 + (var27 >> 1114345761);
                    var22 -= 2;
                    var29 = 0;
                    if (var15 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var30 = -5;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (5 < var30) {
                        statePc = 92;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var31 = (int)(2.0 * Math.sqrt((double)(-(var30 * var30) + 25)));
                    de.e(-var31 + (var2_int + 32), var30 + (var3 - -64), var31 * 2, 0, 128);
                    var30++;
                    if (var32 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (var32 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var29 = var29 + ((int)(4.0 * Math.sin(((lc) this).field_f)) + 32);
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (var32 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var30 = -8;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (var30 > 8) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var31 = (int)(Math.sqrt((double)(-(var30 * var30) + 64)) * 2.0);
                    de.e(32 + (var2_int + -var31), 64 + var3 - -var30, var31 * 2, 0, 128);
                    var30++;
                    if (var32 != 0) {
                        statePc = 101;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var32 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var2_int += 20;
                    var3 += 40;
                    var3 = var3 - var29;
                    pc.a(kg.field_d[2], var20 + var3, kg.field_d[3], kg.field_d[0], (byte) -82, kg.field_d[1], (qb) ((Object[]) var16_ref)[5], var19 + var2_int);
                    pc.a(kg.field_d[2], var3 + var22, kg.field_d[3], kg.field_d[0], (byte) -105, kg.field_d[1], (qb) ((Object[]) var16_ref)[4], var21 + var2_int);
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 75, kg.field_d[1], (qb) ((Object[]) var16_ref)[3], var2_int);
                    var3 -= 3;
                    var3 -= 6;
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -77, kg.field_d[1], (qb) ((Object[]) var16_ref)[2], var2_int);
                    var3 += 6;
                    var3 -= 6;
                    var3 += 3;
                    var3 += 6;
                    pc.a(kg.field_d[2], var26 + var3, kg.field_d[3], kg.field_d[0], (byte) 51, kg.field_d[1], (qb) ((Object[]) var16_ref)[1], var2_int - -var25);
                    pc.a(kg.field_d[2], var24 + var3, kg.field_d[3], kg.field_d[0], (byte) 37, kg.field_d[1], (qb) ((Object[]) var16_ref)[0], var23 + var2_int);
                    var2_int = var17_int;
                    var3 = var18_int;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (var32 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var15 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var17_int = -8;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (var17_int > 8) {
                        statePc = 111;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var18_int = (int)(2.0 * Math.sqrt((double)(64 - var17_int * var17_int)));
                    de.e(32 + (var2_int + -var18_int), 64 + (var17_int + var3), var18_int * 2, 0, 128);
                    var17_int++;
                    if (var32 != 0) {
                        statePc = 112;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var32 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var17_int = fo.field_k / 10 % ((Object[]) var16_ref).length;
                    pc.a(kg.field_d[2], var3 + -((qb) ((Object[]) var16_ref)[var17_int]).field_w - (-32 - -(int)(Math.sin(((lc) this).field_f) * 4.0)), kg.field_d[3], kg.field_d[0], (byte) 100, kg.field_d[1], (qb) ((Object[]) var16_ref)[var17_int], 32 + (-(((qb) ((Object[]) var16_ref)[var17_int]).field_n / 2) + var2_int));
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (var32 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var17_int = -12;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (var17_int > 12) {
                        statePc = 119;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var18_int = (int)(Math.sqrt((double)(144 + -(var17_int * var17_int))) * 2.0);
                    de.e(-var18_int + (var2_int + 32), var3 + var17_int + 64, 2 * var18_int, 0, 128);
                    var17_int++;
                    if (var32 != 0) {
                        statePc = 120;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var32 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var17_int = fo.field_k / 10 % ((Object[]) var16_ref).length;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    pc.a(kg.field_d[2], 64 + -((qb) ((Object[]) var16_ref)[var17_int]).field_w + var3, kg.field_d[3], kg.field_d[0], (byte) 117, kg.field_d[1], (qb) ((Object[]) var16_ref)[var17_int], 32 + (-(((qb) ((Object[]) var16_ref)[var17_int]).field_n / 2) + var2_int));
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var2_int += 64;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    var14 = -16;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (var14 > 16) {
                        statePc = 128;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var15 = (int)(Math.sqrt((double)(256 - var14 * var14)) * 2.0);
                    de.e(-var15 + (var2_int - -32), 64 + (var14 + var3), var15 * 2, 0, 128);
                    var14++;
                    if (var32 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var32 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (6.28 >= ((lc) this).field_f) {
                        statePc = 131;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    ((lc) this).field_f = ((lc) this).field_f - 6.28;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (0.0 <= ((lc) this).field_f) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    ((lc) this).field_f = ((lc) this).field_f + 6.28;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    var14 = (int)(Math.cos(((lc) this).field_f) * 16.0);
                    var15 = (int)(16.0 * Math.sin(((lc) this).field_f));
                    var5 = -var15;
                    var6 = var15;
                    if (var14 <= 0) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var8 = -var14;
                    if (var32 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var8 = 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (var14 < 0) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var7 = 0;
                    if (var32 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var7 = var14;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    var10 = 16 + (var14 >> 960548385);
                    var11 = -(var15 >> -581740510);
                    var12 = var15 >> -304914974;
                    var9 = -(var14 >> -1972095295) + -16;
                    var8 -= 2;
                    var7 += 2;
                    var16 = -ea.field_u[so.field_c[2]].field_o + (-ea.field_u[so.field_c[2]].field_y + ea.field_u[so.field_c[2]].field_w);
                    if (var11 > var16) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var11 = var16;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var16 = -qe.field_i[so.field_c[3]].field_o - qe.field_i[so.field_c[3]].field_y + qe.field_i[so.field_c[3]].field_w;
                    if (var16 < var12) {
                        statePc = 147;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var12 = var16;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    var17 = new int[6];
                    var18_int = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (var18_int >= 6) {
                        statePc = 154;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var17[var18_int] = so.field_c[var18_int];
                    var18_int++;
                    if (var32 != 0) {
                        statePc = 155;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var32 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    pc.a(kg.field_d[2], var12 + var3, kg.field_d[3], kg.field_d[0], (byte) -121, kg.field_d[1], qe.field_i[so.field_c[3]], var2_int + var10);
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (46 != so.field_c[0]) {
                        statePc = 158;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 158: {
                    pc.a(kg.field_d[2], var8 + var3, kg.field_d[3], kg.field_d[0], (byte) 105, kg.field_d[1], fn.field_b[0], var6 + var2_int);
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -92, kg.field_d[1], jd.field_j[so.field_c[0]], var2_int);
                    var3 -= 8;
                    var3 -= 16;
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 75, kg.field_d[1], kc.field_kb[so.field_c[1]], var2_int);
                    var3 += 16;
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -80, kg.field_d[1], hn.field_d[so.field_c[5]], var2_int);
                    if (so.field_c[5] == 53) {
                        statePc = 166;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (so.field_c[5] != 55) {
                        statePc = 165;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 165: {
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -99, kg.field_d[1], bo.field_a[0], var2_int);
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    var3 -= 16;
                    pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -109, kg.field_d[1], tj.field_A[so.field_c[4]], var2_int);
                    var3 += 8;
                    var3 += 16;
                    if (46 == so.field_c[0]) {
                        statePc = 169;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    pc.a(kg.field_d[2], var3 + var7, kg.field_d[3], kg.field_d[0], (byte) -127, kg.field_d[1], h.field_I[0], var2_int + var5);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    pc.a(kg.field_d[2], var11 + var3, kg.field_d[3], kg.field_d[0], (byte) -95, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var2_int);
                    var18_int = 0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (var18_int >= 6) {
                        statePc = 175;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    so.field_c[var18_int] = var17[var18_int];
                    var18_int++;
                    if (var32 != 0) {
                        statePc = 196;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (var32 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (((lc) this).field_n <= 0) {
                        statePc = 194;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (~(bi.field_I - -225) < ~an.field_g) {
                        statePc = 191;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (~an.field_g <= ~(to.field_q.field_n + bi.field_I - -225)) {
                        statePc = 191;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (~me.field_I > ~(uc.field_a - -182)) {
                        statePc = 191;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (~me.field_I <= ~(to.field_q.field_w + (uc.field_a - -182))) {
                        statePc = 191;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    to.field_q.a(225 + bi.field_I, 182 + uc.field_a, 16777215);
                    to.field_q.c(bi.field_I + 225, 182 + uc.field_a, 128);
                    ((lc) this).field_i = -3;
                    ((lc) this).field_m = 6;
                    if (var32 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    to.field_q.c(225 + bi.field_I, uc.field_a + 182);
                    if (var32 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    to.field_q.a(225 + bi.field_I, 182 + uc.field_a, 0);
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    to.field_q.c(225 + bi.field_I, uc.field_a - -182, 128);
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (((lc) this).field_n >= -27 + mb.a(((lc) this).field_h, 813231272)) {
                        statePc = 211;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (mi.a(to.field_q.field_w, uc.field_a - -182, to.field_q.field_n, param0 ^ -12, 590 + bi.field_I)) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    to.field_q.e(bi.field_I - -590, uc.field_a - -182);
                    if (var32 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (((lc) this).field_b == null) {
                        statePc = 209;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 209: {
                    ((lc) this).field_b = to.field_q.b();
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    ((lc) this).field_b.a(bi.field_I - -590, 182 + uc.field_a, 16777215);
                    ((lc) this).field_b.c(bi.field_I - -590, uc.field_a - -182, 128);
                    ((lc) this).field_i = 3;
                    ((lc) this).field_m = 6;
                    if (var32 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    ((lc) this).field_b.a(590 + bi.field_I, uc.field_a + 182, 0);
                    ((lc) this).field_b.c(590 + bi.field_I, 182 + uc.field_a, 128);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    boolean discarded$39 = this.a(false, 330, (byte) -24, false, bi.field_I + 254, 114, 182 + uc.field_a);
                    if (null != var4) {
                        statePc = 216;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var18_int = mb.a(((lc) this).field_h, 813231272);
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (0 <= ((lc) this).field_n) {
                        statePc = 222;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    ((lc) this).field_n = ((lc) this).field_n + var18_int;
                    if (var32 != 0) {
                        statePc = 224;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (var32 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (~var18_int < ~((lc) this).field_n) {
                        statePc = 224;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    ((lc) this).field_n = ((lc) this).field_n - var18_int;
                    if (var32 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var18 = null;
                    var19 = 0;
                    var20 = 0;
                    var3 = uc.field_a + 188;
                    var2_int = 264 + bi.field_I;
                    if (param0 == 12) {
                        statePc = 227;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    boolean discarded$40 = this.a((byte) 5, -89);
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    var21 = ((lc) this).field_n;
                    var22 = 35;
                    var23 = 0;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    stackOut_228_0 = var23;
                    stackOut_228_1 = 9;
                    stackIn_229_0 = stackOut_228_0;
                    stackIn_229_1 = stackOut_228_1;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (stackIn_229_0 >= stackIn_229_1) {
                        statePc = 733;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    stackOut_230_0 = 0;
                    stackIn_737_0 = stackOut_230_0;
                    stackIn_231_0 = stackOut_230_0;
                    if (var32 != 0) {
                        statePc = 738;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var24 = stackIn_231_0;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (var24 >= 3) {
                        statePc = 732;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    stackOut_233_0 = mb.a(((lc) this).field_h, 813231272);
                    stackOut_233_1 = var21;
                    stackIn_229_0 = stackOut_233_0;
                    stackIn_229_1 = stackOut_233_1;
                    stackIn_234_0 = stackOut_233_0;
                    stackIn_234_1 = stackOut_233_1;
                    if (var32 != 0) {
                        statePc = 229;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (stackIn_234_0 <= stackIn_234_1) {
                        statePc = 731;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    de.a(-1 + (var22 * var23 + var2_int), var24 * var22 + var3 - 1, 34, 34, 8745077);
                    de.a(var2_int - -(var22 * var23), var3 + var24 * var22, 32, 32, 5720140);
                    var25 = 14207693;
                    var26 = 0;
                    var27 = -1;
                    var28 = 64;
                    var29 = -1;
                    if (((lc) this).field_h != 0) {
                        statePc = 358;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var28 = 48;
                    if (12 > var21) {
                        statePc = 243;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (var21 < 15) {
                        statePc = 242;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var27 = 0;
                    var25 = var25 + 2105376;
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    if (var21 < 15) {
                        statePc = 248;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (var21 >= 18) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var27 = 1;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var21 < 18) {
                        statePc = 255;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (var21 < 21) {
                        statePc = 254;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var27 = 2;
                    var25 = var25 + 2105376;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if (var21 < 21) {
                        statePc = 262;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (var21 < 24) {
                        statePc = 261;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var27 = 3;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (var21 < 24) {
                        statePc = 269;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (var21 < 27) {
                        statePc = 268;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var25 = var25 + 2105376;
                    var27 = 4;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (var21 < 27) {
                        statePc = 276;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (30 > var21) {
                        statePc = 275;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var27 = 5;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (var21 == 30) {
                        statePc = 282;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (33 == var21) {
                        statePc = 282;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 282: {
                    var25 = var25 + 2105376;
                    var27 = 6;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    if (31 == var21) {
                        statePc = 289;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (var21 == 34) {
                        statePc = 289;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var27 = 7;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    if (var21 == 32) {
                        statePc = 294;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (var21 != 35) {
                        statePc = 295;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var25 = var25 + 2105376;
                    var27 = 8;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (var21 == 36) {
                        statePc = 301;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (var21 == 39) {
                        statePc = 301;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var27 = 9;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (var21 == 37) {
                        statePc = 308;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (var21 == 40) {
                        statePc = 308;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 308: {
                    var27 = 10;
                    var25 = var25 + 2105376;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    if (38 == var21) {
                        statePc = 315;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (var21 == 41) {
                        statePc = 315;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var27 = 11;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (var21 == 42) {
                        statePc = 320;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (var21 != 45) {
                        statePc = 321;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var27 = 16;
                    var25 = var25 + 2105376;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if (var21 == 43) {
                        statePc = 327;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (var21 == 46) {
                        statePc = 327;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 327: {
                    var27 = 17;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (44 != var21) {
                        statePc = 330;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var25 = var25 + 2105376;
                    var27 = 26;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if (var21 != 47) {
                        statePc = 332;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var27 = 28;
                    var25 = var25 + 2105376;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if (var21 != 48) {
                        statePc = 334;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    if (var21 == 49) {
                        statePc = 337;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 337: {
                    var25 = var25 + 2105376;
                    var29 = 0;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (50 == var21) {
                        statePc = 341;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 341: {
                    var25 = var25 + 2105376;
                    var29 = 1;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (var21 != 51) {
                        statePc = 344;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var29 = 2;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (var21 != 52) {
                        statePc = 346;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    var29 = 2;
                    statePc = 346;
                    continue stateLoop;
                }
                case 346: {
                    if (var21 == 53) {
                        statePc = 349;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 349: {
                    var29 = 2;
                    statePc = 350;
                    continue stateLoop;
                }
                case 350: {
                    if (54 != var21) {
                        statePc = 352;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    var27 = 55;
                    var25 = var25 + 2105376;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    if (var21 != 55) {
                        statePc = 354;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    var25 = var25 + 2105376;
                    var27 = 55;
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    if (var21 == 56) {
                        statePc = 357;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 357: {
                    var27 = 55;
                    var25 = var25 + 2105376;
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    if (((lc) this).field_h != 2) {
                        statePc = 444;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    var28 = 48;
                    if (var21 < 12) {
                        statePc = 364;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (var21 >= 15) {
                        statePc = 364;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var25 = var25 + 2105376;
                    var27 = 0;
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    if (var21 < 15) {
                        statePc = 369;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if (18 <= var21) {
                        statePc = 369;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    var27 = 1;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    if (var21 < 18) {
                        statePc = 376;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if (21 > var21) {
                        statePc = 375;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 375: {
                    var27 = 2;
                    var25 = var25 + 2105376;
                    statePc = 376;
                    continue stateLoop;
                }
                case 376: {
                    if (var21 < 21) {
                        statePc = 381;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    if (var21 >= 24) {
                        statePc = 381;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    var27 = 3;
                    statePc = 381;
                    continue stateLoop;
                }
                case 381: {
                    if (var21 < 24) {
                        statePc = 388;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (27 > var21) {
                        statePc = 387;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 387: {
                    var27 = 4;
                    var25 = var25 + 2105376;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    if (var21 < 27) {
                        statePc = 395;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    if (var21 < 30) {
                        statePc = 394;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 394: {
                    var27 = 5;
                    statePc = 395;
                    continue stateLoop;
                }
                case 395: {
                    if (var21 == 30) {
                        statePc = 399;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if (var21 != 33) {
                        statePc = 400;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var27 = 6;
                    var25 = var25 + 2105376;
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    if (var21 == 31) {
                        statePc = 404;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    if (var21 != 34) {
                        statePc = 405;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 404: {
                    var27 = 7;
                    statePc = 405;
                    continue stateLoop;
                }
                case 405: {
                    if (var21 == 32) {
                        statePc = 411;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if (var21 == 35) {
                        statePc = 411;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 411: {
                    var27 = 8;
                    var25 = var25 + 2105376;
                    statePc = 412;
                    continue stateLoop;
                }
                case 412: {
                    if (var21 == 36) {
                        statePc = 418;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    if (var21 == 39) {
                        statePc = 418;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 418: {
                    var27 = 9;
                    statePc = 419;
                    continue stateLoop;
                }
                case 419: {
                    switch (var21) {
                        case 37: statePc = -1; break;
                        case 40: statePc = -1; break;
                        case 38: statePc = -1; break;
                        case 41: statePc = -1; break;
                        case 42: statePc = -1; break;
                        case 45: statePc = -1; break;
                        case 43: statePc = 423; break;
                        case 46: statePc = 423; break;
                        default: statePc = 424; break;
                    }
                    continue stateLoop;
                }
                case 423: {
                    var27 = 17;
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    if (var21 == 44) {
                        statePc = 427;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 427: {
                    var27 = 26;
                    var25 = var25 + 2105376;
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    if (var21 != 47) {
                        statePc = 430;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    var25 = var25 + 2105376;
                    var27 = 28;
                    statePc = 430;
                    continue stateLoop;
                }
                case 430: {
                    if (48 != var21) {
                        statePc = 432;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 431: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 432;
                    continue stateLoop;
                }
                case 432: {
                    if (49 != var21) {
                        statePc = 434;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 433: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    if (50 != var21) {
                        statePc = 436;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    var29 = 1;
                    var25 = var25 + 2105376;
                    statePc = 436;
                    continue stateLoop;
                }
                case 436: {
                    if (var21 != 51) {
                        statePc = 438;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 437: {
                    var29 = 2;
                    statePc = 438;
                    continue stateLoop;
                }
                case 438: {
                    if (var21 == 52) {
                        statePc = 441;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 441: {
                    var29 = 2;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    if (var21 != 53) {
                        statePc = 444;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    var29 = 2;
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    if (((lc) this).field_h == 3) {
                        statePc = 447;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 447: {
                    if (var21 < 12) {
                        statePc = 454;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (var21 < 15) {
                        statePc = 453;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 453: {
                    var27 = 0;
                    var25 = var25 + 2105376;
                    statePc = 454;
                    continue stateLoop;
                }
                case 454: {
                    var28 = 48;
                    if (var21 < 15) {
                        statePc = 459;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 455: {
                    if (var21 >= 18) {
                        statePc = 459;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    var27 = 1;
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    if (var21 < 18) {
                        statePc = 466;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 460: {
                    if (var21 < 21) {
                        statePc = 465;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 465: {
                    var25 = var25 + 2105376;
                    var27 = 2;
                    statePc = 466;
                    continue stateLoop;
                }
                case 466: {
                    if (var21 < 21) {
                        statePc = 473;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    if (24 > var21) {
                        statePc = 472;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 472: {
                    var27 = 3;
                    statePc = 473;
                    continue stateLoop;
                }
                case 473: {
                    if (var21 < 24) {
                        statePc = 480;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if (var21 < 27) {
                        statePc = 479;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 479: {
                    var27 = 4;
                    var25 = var25 + 2105376;
                    statePc = 480;
                    continue stateLoop;
                }
                case 480: {
                    if (var21 < 27) {
                        statePc = 485;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    if (var21 >= 30) {
                        statePc = 485;
                    } else {
                        statePc = 484;
                    }
                    continue stateLoop;
                }
                case 484: {
                    var27 = 5;
                    statePc = 485;
                    continue stateLoop;
                }
                case 485: {
                    if (var21 == 30) {
                        statePc = 491;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    if (var21 == 33) {
                        statePc = 491;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 491: {
                    var27 = 6;
                    var25 = var25 + 2105376;
                    statePc = 492;
                    continue stateLoop;
                }
                case 492: {
                    if (var21 == 31) {
                        statePc = 498;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    if (34 == var21) {
                        statePc = 498;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 498: {
                    var27 = 7;
                    statePc = 499;
                    continue stateLoop;
                }
                case 499: {
                    if (var21 == 32) {
                        statePc = 505;
                    } else {
                        statePc = 500;
                    }
                    continue stateLoop;
                }
                case 500: {
                    if (var21 == 35) {
                        statePc = 505;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 505: {
                    var27 = 8;
                    var25 = var25 + 2105376;
                    statePc = 506;
                    continue stateLoop;
                }
                case 506: {
                    switch (var21) {
                        case 36: statePc = -1; break;
                        case 39: statePc = -1; break;
                        case 37: statePc = -1; break;
                        case 40: statePc = -1; break;
                        case 38: statePc = -1; break;
                        case 41: statePc = -1; break;
                        case 42: statePc = 510; break;
                        case 45: statePc = 510; break;
                        default: statePc = 511; break;
                    }
                    continue stateLoop;
                }
                case 510: {
                    var25 = var25 + 2105376;
                    var27 = 16;
                    statePc = 511;
                    continue stateLoop;
                }
                case 511: {
                    if (var21 == 43) {
                        statePc = 517;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 512: {
                    if (var21 == 46) {
                        statePc = 517;
                    } else {
                        statePc = 518;
                    }
                    continue stateLoop;
                }
                case 517: {
                    var27 = 17;
                    statePc = 518;
                    continue stateLoop;
                }
                case 518: {
                    if (var21 == 44) {
                        statePc = 521;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 521: {
                    var27 = 26;
                    var25 = var25 + 2105376;
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    if (var21 == 47) {
                        statePc = 525;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 525: {
                    var25 = var25 + 2105376;
                    var27 = 28;
                    statePc = 526;
                    continue stateLoop;
                }
                case 526: {
                    if (var21 == 48) {
                        statePc = 529;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 529: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 530;
                    continue stateLoop;
                }
                case 530: {
                    if (var21 != 49) {
                        statePc = 532;
                    } else {
                        statePc = 531;
                    }
                    continue stateLoop;
                }
                case 531: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 532;
                    continue stateLoop;
                }
                case 532: {
                    if (50 != var21) {
                        statePc = 534;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    var29 = 1;
                    var25 = var25 + 2105376;
                    statePc = 534;
                    continue stateLoop;
                }
                case 534: {
                    if (var21 != 51) {
                        statePc = 536;
                    } else {
                        statePc = 535;
                    }
                    continue stateLoop;
                }
                case 535: {
                    var29 = 2;
                    statePc = 536;
                    continue stateLoop;
                }
                case 536: {
                    if (var21 != 52) {
                        statePc = 538;
                    } else {
                        statePc = 537;
                    }
                    continue stateLoop;
                }
                case 537: {
                    var29 = 2;
                    statePc = 538;
                    continue stateLoop;
                }
                case 538: {
                    if (var21 != 53) {
                        statePc = 540;
                    } else {
                        statePc = 539;
                    }
                    continue stateLoop;
                }
                case 539: {
                    var29 = 2;
                    statePc = 540;
                    continue stateLoop;
                }
                case 540: {
                    if (1 == ((lc) this).field_h) {
                        statePc = 543;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 543: {
                    var28 = 54;
                    statePc = 544;
                    continue stateLoop;
                }
                case 544: {
                    if (4 == ((lc) this).field_h) {
                        statePc = 547;
                    } else {
                        statePc = 639;
                    }
                    continue stateLoop;
                }
                case 547: {
                    if (42 == var21) {
                        statePc = 550;
                    } else {
                        statePc = 551;
                    }
                    continue stateLoop;
                }
                case 550: {
                    var27 = 0;
                    var25 = var25 + 2105376;
                    statePc = 551;
                    continue stateLoop;
                }
                case 551: {
                    var28 = 66;
                    if (var21 == 43) {
                        statePc = 554;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 554: {
                    var27 = 1;
                    statePc = 555;
                    continue stateLoop;
                }
                case 555: {
                    if (var21 != 44) {
                        statePc = 557;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    var25 = var25 + 2105376;
                    var27 = 2;
                    statePc = 557;
                    continue stateLoop;
                }
                case 557: {
                    if (var21 != 45) {
                        statePc = 559;
                    } else {
                        statePc = 558;
                    }
                    continue stateLoop;
                }
                case 558: {
                    var27 = 3;
                    statePc = 559;
                    continue stateLoop;
                }
                case 559: {
                    if (46 == var21) {
                        statePc = 562;
                    } else {
                        statePc = 563;
                    }
                    continue stateLoop;
                }
                case 562: {
                    var25 = var25 + 2105376;
                    var27 = 4;
                    statePc = 563;
                    continue stateLoop;
                }
                case 563: {
                    if (47 == var21) {
                        statePc = 566;
                    } else {
                        statePc = 567;
                    }
                    continue stateLoop;
                }
                case 566: {
                    var27 = 5;
                    statePc = 567;
                    continue stateLoop;
                }
                case 567: {
                    if (var21 == 48) {
                        statePc = 573;
                    } else {
                        statePc = 568;
                    }
                    continue stateLoop;
                }
                case 568: {
                    if (var21 == 51) {
                        statePc = 573;
                    } else {
                        statePc = 574;
                    }
                    continue stateLoop;
                }
                case 573: {
                    var27 = 6;
                    var25 = var25 + 2105376;
                    statePc = 574;
                    continue stateLoop;
                }
                case 574: {
                    if (var21 == 49) {
                        statePc = 580;
                    } else {
                        statePc = 575;
                    }
                    continue stateLoop;
                }
                case 575: {
                    if (var21 == 52) {
                        statePc = 580;
                    } else {
                        statePc = 581;
                    }
                    continue stateLoop;
                }
                case 580: {
                    var27 = 7;
                    statePc = 581;
                    continue stateLoop;
                }
                case 581: {
                    if (var21 == 50) {
                        statePc = 585;
                    } else {
                        statePc = 582;
                    }
                    continue stateLoop;
                }
                case 582: {
                    if (53 != var21) {
                        statePc = 586;
                    } else {
                        statePc = 585;
                    }
                    continue stateLoop;
                }
                case 585: {
                    var25 = var25 + 2105376;
                    var27 = 8;
                    statePc = 586;
                    continue stateLoop;
                }
                case 586: {
                    if (var21 == 54) {
                        statePc = 592;
                    } else {
                        statePc = 587;
                    }
                    continue stateLoop;
                }
                case 587: {
                    if (var21 == 57) {
                        statePc = 592;
                    } else {
                        statePc = 593;
                    }
                    continue stateLoop;
                }
                case 592: {
                    var27 = 9;
                    statePc = 593;
                    continue stateLoop;
                }
                case 593: {
                    if (var21 == 55) {
                        statePc = 597;
                    } else {
                        statePc = 594;
                    }
                    continue stateLoop;
                }
                case 594: {
                    if (var21 != 58) {
                        statePc = 598;
                    } else {
                        statePc = 597;
                    }
                    continue stateLoop;
                }
                case 597: {
                    var25 = var25 + 2105376;
                    var27 = 10;
                    statePc = 598;
                    continue stateLoop;
                }
                case 598: {
                    if (56 == var21) {
                        statePc = 602;
                    } else {
                        statePc = 599;
                    }
                    continue stateLoop;
                }
                case 599: {
                    if (var21 != 59) {
                        statePc = 603;
                    } else {
                        statePc = 602;
                    }
                    continue stateLoop;
                }
                case 602: {
                    var27 = 11;
                    statePc = 603;
                    continue stateLoop;
                }
                case 603: {
                    if (var21 == 60) {
                        statePc = 609;
                    } else {
                        statePc = 604;
                    }
                    continue stateLoop;
                }
                case 604: {
                    if (var21 == 63) {
                        statePc = 609;
                    } else {
                        statePc = 610;
                    }
                    continue stateLoop;
                }
                case 609: {
                    var27 = 16;
                    var25 = var25 + 2105376;
                    statePc = 610;
                    continue stateLoop;
                }
                case 610: {
                    if (var21 == 61) {
                        statePc = 616;
                    } else {
                        statePc = 611;
                    }
                    continue stateLoop;
                }
                case 611: {
                    if (var21 == 64) {
                        statePc = 616;
                    } else {
                        statePc = 617;
                    }
                    continue stateLoop;
                }
                case 616: {
                    var27 = 17;
                    statePc = 617;
                    continue stateLoop;
                }
                case 617: {
                    if (var21 != 62) {
                        statePc = 619;
                    } else {
                        statePc = 618;
                    }
                    continue stateLoop;
                }
                case 618: {
                    var27 = 27;
                    var25 = var25 + 2105376;
                    statePc = 619;
                    continue stateLoop;
                }
                case 619: {
                    if (65 != var21) {
                        statePc = 621;
                    } else {
                        statePc = 620;
                    }
                    continue stateLoop;
                }
                case 620: {
                    var27 = 29;
                    var25 = var25 + 2105376;
                    statePc = 621;
                    continue stateLoop;
                }
                case 621: {
                    if (var21 != 66) {
                        statePc = 623;
                    } else {
                        statePc = 622;
                    }
                    continue stateLoop;
                }
                case 622: {
                    var25 = var25 + 2105376;
                    var29 = 0;
                    statePc = 623;
                    continue stateLoop;
                }
                case 623: {
                    if (var21 != 67) {
                        statePc = 625;
                    } else {
                        statePc = 624;
                    }
                    continue stateLoop;
                }
                case 624: {
                    var25 = var25 + 2105376;
                    var29 = 0;
                    statePc = 625;
                    continue stateLoop;
                }
                case 625: {
                    if (var21 != 68) {
                        statePc = 627;
                    } else {
                        statePc = 626;
                    }
                    continue stateLoop;
                }
                case 626: {
                    var29 = 1;
                    var25 = var25 + 2105376;
                    statePc = 627;
                    continue stateLoop;
                }
                case 627: {
                    if (69 == var21) {
                        statePc = 630;
                    } else {
                        statePc = 631;
                    }
                    continue stateLoop;
                }
                case 630: {
                    var29 = 2;
                    statePc = 631;
                    continue stateLoop;
                }
                case 631: {
                    if (var21 == 70) {
                        statePc = 634;
                    } else {
                        statePc = 635;
                    }
                    continue stateLoop;
                }
                case 634: {
                    var29 = 2;
                    statePc = 635;
                    continue stateLoop;
                }
                case 635: {
                    if (71 == var21) {
                        statePc = 638;
                    } else {
                        statePc = 639;
                    }
                    continue stateLoop;
                }
                case 638: {
                    var29 = 2;
                    statePc = 639;
                    continue stateLoop;
                }
                case 639: {
                    if (((lc) this).field_h == 5) {
                        statePc = 642;
                    } else {
                        statePc = 670;
                    }
                    continue stateLoop;
                }
                case 642: {
                    var28 = 51;
                    if (var21 != 48) {
                        statePc = 644;
                    } else {
                        statePc = 643;
                    }
                    continue stateLoop;
                }
                case 643: {
                    var25 = var25 + 2105376;
                    var27 = 27;
                    statePc = 644;
                    continue stateLoop;
                }
                case 644: {
                    if (49 != var21) {
                        statePc = 646;
                    } else {
                        statePc = 645;
                    }
                    continue stateLoop;
                }
                case 645: {
                    var27 = 29;
                    var25 = var25 + 2105376;
                    statePc = 646;
                    continue stateLoop;
                }
                case 646: {
                    if (var21 != 50) {
                        statePc = 648;
                    } else {
                        statePc = 647;
                    }
                    continue stateLoop;
                }
                case 647: {
                    var27 = 30;
                    var25 = var25 + 2105376;
                    statePc = 648;
                    continue stateLoop;
                }
                case 648: {
                    if (var21 == 51) {
                        statePc = 651;
                    } else {
                        statePc = 652;
                    }
                    continue stateLoop;
                }
                case 651: {
                    var29 = 0;
                    var25 = var25 + 2105376;
                    statePc = 652;
                    continue stateLoop;
                }
                case 652: {
                    if (52 == var21) {
                        statePc = 655;
                    } else {
                        statePc = 656;
                    }
                    continue stateLoop;
                }
                case 655: {
                    var25 = var25 + 2105376;
                    var29 = 0;
                    statePc = 656;
                    continue stateLoop;
                }
                case 656: {
                    if (53 != var21) {
                        statePc = 658;
                    } else {
                        statePc = 657;
                    }
                    continue stateLoop;
                }
                case 657: {
                    var29 = 1;
                    var25 = var25 + 2105376;
                    statePc = 658;
                    continue stateLoop;
                }
                case 658: {
                    if (var21 == 54) {
                        statePc = 661;
                    } else {
                        statePc = 662;
                    }
                    continue stateLoop;
                }
                case 661: {
                    var29 = 2;
                    statePc = 662;
                    continue stateLoop;
                }
                case 662: {
                    if (var21 == 55) {
                        statePc = 665;
                    } else {
                        statePc = 666;
                    }
                    continue stateLoop;
                }
                case 665: {
                    var29 = 2;
                    statePc = 666;
                    continue stateLoop;
                }
                case 666: {
                    if (56 == var21) {
                        statePc = 669;
                    } else {
                        statePc = 670;
                    }
                    continue stateLoop;
                }
                case 669: {
                    var29 = 2;
                    statePc = 670;
                    continue stateLoop;
                }
                case 670: {
                    if (var27 != -1) {
                        statePc = 673;
                    } else {
                        statePc = 678;
                    }
                    continue stateLoop;
                }
                case 673: {
                    var30 = var27 >> -418342139;
                    var31 = -(var30 << -821304027) + var27;
                    if ((ad.field_f[var30] & 1 << var31) != 0) {
                        statePc = 676;
                    } else {
                        statePc = 674;
                    }
                    continue stateLoop;
                }
                case 674: {
                    stackOut_674_0 = 1;
                    stackIn_677_0 = stackOut_674_0;
                    statePc = 677;
                    continue stateLoop;
                }
                case 676: {
                    stackOut_676_0 = 0;
                    stackIn_677_0 = stackOut_676_0;
                    statePc = 677;
                    continue stateLoop;
                }
                case 677: {
                    var26 = stackIn_677_0;
                    statePc = 678;
                    continue stateLoop;
                }
                case 678: {
                    if (var29 == -1) {
                        statePc = 685;
                    } else {
                        statePc = 679;
                    }
                    continue stateLoop;
                }
                case 679: {
                    if (!this.g(var29, 0)) {
                        statePc = 684;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 684: {
                    var26 = 1;
                    statePc = 685;
                    continue stateLoop;
                }
                case 685: {
                    de.d(var2_int - -(var22 * var23) + 1, var22 * var24 + var3 - -1, 30, 30, var25);
                    if (var21 == so.field_c[((lc) this).field_h]) {
                        statePc = 688;
                    } else {
                        statePc = 689;
                    }
                    continue stateLoop;
                }
                case 688: {
                    de.d(1 + var2_int + var23 * var22, var3 + var22 * var24 + 1, 30, 30, 16711935 | var25);
                    statePc = 689;
                    continue stateLoop;
                }
                case 689: {
                    if (~var28 < ~var21) {
                        statePc = 696;
                    } else {
                        statePc = 690;
                    }
                    continue stateLoop;
                }
                case 690: {
                    if (var26 == 0) {
                        statePc = 696;
                    } else {
                        statePc = 693;
                    }
                    continue stateLoop;
                }
                case 693: {
                    if (-1 == var27) {
                        statePc = 705;
                    } else {
                        statePc = 696;
                    }
                    continue stateLoop;
                }
                case 696: {
                    if (var26 != 0) {
                        statePc = 702;
                    } else {
                        statePc = 699;
                    }
                    continue stateLoop;
                }
                case 699: {
                    ((qb) ((Object[]) var4)[var21]).b(-(((qb) ((Object[]) var4)[var21]).field_x / 2) + (var23 * var22 + var2_int) - (-16 + ((qb) ((Object[]) var4)[var21]).field_q / 4), -(((qb) ((Object[]) var4)[var21]).field_y / 4) + (16 + var3) + var22 * var24 + -(((qb) ((Object[]) var4)[var21]).field_o / 2), 32, 32);
                    if (var32 == 0) {
                        statePc = 707;
                    } else {
                        statePc = 702;
                    }
                    continue stateLoop;
                }
                case 702: {
                    de.d(1 + (var22 * var23 + var2_int), 1 + var22 * var24 + var3, 30, 30, 9996941);
                    ((qb) ((Object[]) var4)[var21]).b(-(((qb) ((Object[]) var4)[var21]).field_q / 4) + 16 + var2_int + var23 * var22 + -(((qb) ((Object[]) var4)[var21]).field_x / 2), -(((qb) ((Object[]) var4)[var21]).field_y / 4) + (-(((qb) ((Object[]) var4)[var21]).field_o / 2) + var3) - (-(var24 * var22) - 16), 32, 32);
                    de.e(var2_int + var22 * var23 + 1, var3 + (var22 * var24 - -1), 30, 30, 0, 192);
                    vd.field_b.b(var2_int + var22 * var23 + 20, var24 * var22 + var3 - -20, 12, 12);
                    if (var32 == 0) {
                        statePc = 707;
                    } else {
                        statePc = 705;
                    }
                    continue stateLoop;
                }
                case 705: {
                    de.d(1 + var23 * var22 + var2_int, var3 - -(var22 * var24) + 1, 30, 30, 9996941);
                    ((qb) ((Object[]) var4)[var21]).b(-(((qb) ((Object[]) var4)[var21]).field_q / 4) + (16 + var22 * var23) + var2_int - ((qb) ((Object[]) var4)[var21]).field_x / 2, -(((qb) ((Object[]) var4)[var21]).field_y / 4) + var3 + (var24 * var22 + (16 - ((qb) ((Object[]) var4)[var21]).field_o / 2)), 32, 32);
                    de.e(var2_int - -(var22 * var23) - -1, 1 + (var3 + var24 * var22), 30, 30, 0, 192);
                    di.field_d.b(20 + (var2_int - -(var22 * var23)), 20 + (var3 + var22 * var24), 12, 12);
                    statePc = 707;
                    continue stateLoop;
                }
                case 707: {
                    if (qf.field_d < 2) {
                        statePc = 709;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 708: {
                    var26 = 0;
                    statePc = 709;
                    continue stateLoop;
                }
                case 709: {
                    if (~(var2_int + var23 * var22) < ~an.field_g) {
                        statePc = 731;
                    } else {
                        statePc = 710;
                    }
                    continue stateLoop;
                }
                case 710: {
                    if (~an.field_g <= ~(32 + var2_int + var22 * var23)) {
                        statePc = 731;
                    } else {
                        statePc = 713;
                    }
                    continue stateLoop;
                }
                case 713: {
                    if (~me.field_I > ~(var22 * var24 + var3)) {
                        statePc = 731;
                    } else {
                        statePc = 716;
                    }
                    continue stateLoop;
                }
                case 716: {
                    if (me.field_I >= var3 + var24 * var22 + 32) {
                        statePc = 731;
                    } else {
                        statePc = 719;
                    }
                    continue stateLoop;
                }
                case 719: {
                    gn.a(15, (byte) 101, 128, var2_int - (1 + (-(var23 * var22) - 17)), var24 * var22 + (var3 - -16));
                    ((lc) this).field_i = var21;
                    ((lc) this).field_m = 0;
                    if (var26 == 0) {
                        statePc = 724;
                    } else {
                        statePc = 722;
                    }
                    continue stateLoop;
                }
                case 722: {
                    ((lc) this).field_m = 8;
                    statePc = 724;
                    continue stateLoop;
                }
                case 724: {
                    if (var26 != 0) {
                        statePc = 727;
                    } else {
                        statePc = 731;
                    }
                    continue stateLoop;
                }
                case 727: {
                    var19 = var23;
                    if (var29 == -1) {
                        statePc = 729;
                    } else {
                        statePc = 728;
                    }
                    continue stateLoop;
                }
                case 728: {
                    var18 = (Object) (Object) vg.field_n;
                    if (var32 == 0) {
                        statePc = 730;
                    } else {
                        statePc = 729;
                    }
                    continue stateLoop;
                }
                case 729: {
                    var18 = (Object) (Object) tj.a(123, new String[1], kl.field_y);
                    statePc = 730;
                    continue stateLoop;
                }
                case 730: {
                    var20 = var24;
                    statePc = 731;
                    continue stateLoop;
                }
                case 731: {
                    var21++;
                    var24++;
                    if (var32 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 732;
                    }
                    continue stateLoop;
                }
                case 732: {
                    var23++;
                    if (var32 == 0) {
                        statePc = 228;
                    } else {
                        statePc = 733;
                    }
                    continue stateLoop;
                }
                case 733: {
                    if (var18 != null) {
                        statePc = 736;
                    } else {
                        statePc = 738;
                    }
                    continue stateLoop;
                }
                case 736: {
                    int discarded$41 = mi.field_B.a((String) var18, 96 + var19 * var22 + (var2_int + -256), var22 * var20 + (var3 + -1) - 16, 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                    int discarded$42 = mi.field_B.a((String) var18, 96 + (-1 + (var19 * var22 + (var2_int + -256))), -16 + (var3 + var22 * var20), 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                    int discarded$43 = mi.field_B.a((String) var18, 97 + (var2_int + var22 * var19) + -256, -16 + var22 * var20 + var3, 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                    int discarded$44 = mi.field_B.a((String) var18, -256 + (var2_int - -(var19 * var22)) - -96, var22 * var20 + (var3 + -15), 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                    stackOut_736_0 = mi.field_B.a((String) var18, -160 + var2_int - -(var22 * var19), -16 + (var3 - -(var22 * var20)), 256, 64, 16777215, 0, 1, 0, mi.field_B.field_C);
                    stackIn_737_0 = stackOut_736_0;
                    statePc = 738;
                    continue stateLoop;
                }
                case 738: {
                    boolean discarded$45 = this.a(false, 180, (byte) 111, false, bi.field_I + 32, 98, 309 + uc.field_a);
                    boolean discarded$46 = this.a(false, 166, (byte) 79, false, 39 + bi.field_I, 29, 390 + uc.field_a);
                    int discarded$47 = tj.field_t.a(gg.field_f, -1 + (32 + bi.field_I + 7), 389 + uc.field_a, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    int discarded$48 = tj.field_t.a(gg.field_f, bi.field_I + 39, uc.field_a - -390 - 2, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    int discarded$49 = tj.field_t.a(gg.field_f, bi.field_I - -39, uc.field_a - -390 + -1, 166, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    if (kg.field_d[3] != hi.field_b[0]) {
                        statePc = 744;
                    } else {
                        statePc = 739;
                    }
                    continue stateLoop;
                }
                case 739: {
                    if (kg.field_d[0] != ld.field_n[2]) {
                        statePc = 744;
                    } else {
                        statePc = 742;
                    }
                    continue stateLoop;
                }
                case 742: {
                    kg.field_d[0] = ld.field_n[3];
                    statePc = 744;
                    continue stateLoop;
                }
                case 744: {
                    if (kg.field_d[3] != hi.field_b[0]) {
                        statePc = 751;
                    } else {
                        statePc = 745;
                    }
                    continue stateLoop;
                }
                case 745: {
                    if (kg.field_d[1] == ud.field_z[2]) {
                        statePc = 750;
                    } else {
                        statePc = 751;
                    }
                    continue stateLoop;
                }
                case 750: {
                    kg.field_d[1] = ud.field_z[3];
                    statePc = 751;
                    continue stateLoop;
                }
                case 751: {
                    if (kg.field_d[3] != hi.field_b[2]) {
                        statePc = 758;
                    } else {
                        statePc = 752;
                    }
                    continue stateLoop;
                }
                case 752: {
                    if (kg.field_d[0] == ld.field_n[12]) {
                        statePc = 757;
                    } else {
                        statePc = 758;
                    }
                    continue stateLoop;
                }
                case 757: {
                    kg.field_d[0] = ld.field_n[13];
                    statePc = 758;
                    continue stateLoop;
                }
                case 758: {
                    if (kg.field_d[3] != hi.field_b[2]) {
                        statePc = 765;
                    } else {
                        statePc = 759;
                    }
                    continue stateLoop;
                }
                case 759: {
                    if (ud.field_z[12] == kg.field_d[1]) {
                        statePc = 764;
                    } else {
                        statePc = 765;
                    }
                    continue stateLoop;
                }
                case 764: {
                    kg.field_d[1] = ud.field_z[13];
                    statePc = 765;
                    continue stateLoop;
                }
                case 765: {
                    if (hi.field_b[3] != kg.field_d[3]) {
                        statePc = 771;
                    } else {
                        statePc = 766;
                    }
                    continue stateLoop;
                }
                case 766: {
                    if (ud.field_z[12] != kg.field_d[1]) {
                        statePc = 771;
                    } else {
                        statePc = 769;
                    }
                    continue stateLoop;
                }
                case 769: {
                    kg.field_d[1] = ud.field_z[14];
                    statePc = 771;
                    continue stateLoop;
                }
                case 771: {
                    if (hi.field_b[3] != kg.field_d[3]) {
                        statePc = 777;
                    } else {
                        statePc = 772;
                    }
                    continue stateLoop;
                }
                case 772: {
                    if (ld.field_n[12] != kg.field_d[0]) {
                        statePc = 777;
                    } else {
                        statePc = 775;
                    }
                    continue stateLoop;
                }
                case 775: {
                    kg.field_d[0] = ld.field_n[14];
                    statePc = 777;
                    continue stateLoop;
                }
                case 777: {
                    if (kg.field_d[3] != hi.field_b[3]) {
                        statePc = 784;
                    } else {
                        statePc = 778;
                    }
                    continue stateLoop;
                }
                case 778: {
                    if (ud.field_z[13] == kg.field_d[1]) {
                        statePc = 783;
                    } else {
                        statePc = 784;
                    }
                    continue stateLoop;
                }
                case 783: {
                    kg.field_d[1] = ud.field_z[14];
                    statePc = 784;
                    continue stateLoop;
                }
                case 784: {
                    if (hi.field_b[3] != kg.field_d[3]) {
                        statePc = 791;
                    } else {
                        statePc = 785;
                    }
                    continue stateLoop;
                }
                case 785: {
                    if (ld.field_n[13] == kg.field_d[0]) {
                        statePc = 790;
                    } else {
                        statePc = 791;
                    }
                    continue stateLoop;
                }
                case 790: {
                    kg.field_d[0] = ld.field_n[14];
                    statePc = 791;
                    continue stateLoop;
                }
                case 791: {
                    de.a(bi.field_I - -58, uc.field_a + 317, 131, 67, 16777215);
                    de.d(59 + bi.field_I, uc.field_a + 318, 129, 65, 0);
                    var23 = 0;
                    statePc = 792;
                    continue stateLoop;
                }
                case 792: {
                    stackOut_792_0 = ~var23;
                    stackOut_792_1 = -9;
                    stackIn_793_0 = stackOut_792_0;
                    stackIn_793_1 = stackOut_792_1;
                    statePc = 793;
                    continue stateLoop;
                }
                case 793: {
                    if (stackIn_793_0 <= stackIn_793_1) {
                        statePc = 848;
                    } else {
                        statePc = 794;
                    }
                    continue stateLoop;
                }
                case 794: {
                    stackOut_794_0 = 0;
                    stackIn_849_0 = stackOut_794_0;
                    stackIn_795_0 = stackOut_794_0;
                    if (var32 != 0) {
                        statePc = 849;
                    } else {
                        statePc = 795;
                    }
                    continue stateLoop;
                }
                case 795: {
                    var24 = stackIn_795_0;
                    statePc = 796;
                    continue stateLoop;
                }
                case 796: {
                    if (4 <= var24) {
                        statePc = 847;
                    } else {
                        statePc = 797;
                    }
                    continue stateLoop;
                }
                case 797: {
                    var25 = var24 * 8 + var23;
                    var3 = uc.field_a - -319 + var24 * 16;
                    var2_int = var23 * 16 + bi.field_I + 60;
                    var26 = (ld.field_n[var25][0] << -651613456) + (ld.field_n[var25][2] - -(ld.field_n[var25][1] << 519488136));
                    de.d(var2_int, var3, 15, 15, var26);
                    stackOut_797_0 = -3;
                    stackOut_797_1 = ~var25;
                    stackIn_793_0 = stackOut_797_0;
                    stackIn_793_1 = stackOut_797_1;
                    stackIn_798_0 = stackOut_797_0;
                    stackIn_798_1 = stackOut_797_1;
                    if (var32 != 0) {
                        statePc = 793;
                    } else {
                        statePc = 798;
                    }
                    continue stateLoop;
                }
                case 798: {
                    if (stackIn_798_0 != stackIn_798_1) {
                        statePc = 805;
                    } else {
                        statePc = 799;
                    }
                    continue stateLoop;
                }
                case 799: {
                    if (kg.field_d[3] == hi.field_b[0]) {
                        statePc = 804;
                    } else {
                        statePc = 805;
                    }
                    continue stateLoop;
                }
                case 804: {
                    var26 = 0;
                    statePc = 805;
                    continue stateLoop;
                }
                case 805: {
                    if (12 != var25) {
                        statePc = 810;
                    } else {
                        statePc = 806;
                    }
                    continue stateLoop;
                }
                case 806: {
                    if (kg.field_d[3] != hi.field_b[2]) {
                        statePc = 810;
                    } else {
                        statePc = 809;
                    }
                    continue stateLoop;
                }
                case 809: {
                    var26 = 0;
                    statePc = 810;
                    continue stateLoop;
                }
                case 810: {
                    if (var25 != 12) {
                        statePc = 815;
                    } else {
                        statePc = 811;
                    }
                    continue stateLoop;
                }
                case 811: {
                    if (kg.field_d[3] != hi.field_b[3]) {
                        statePc = 815;
                    } else {
                        statePc = 814;
                    }
                    continue stateLoop;
                }
                case 814: {
                    var26 = 0;
                    statePc = 815;
                    continue stateLoop;
                }
                case 815: {
                    if (var25 != 13) {
                        statePc = 822;
                    } else {
                        statePc = 816;
                    }
                    continue stateLoop;
                }
                case 816: {
                    if (kg.field_d[3] == hi.field_b[3]) {
                        statePc = 821;
                    } else {
                        statePc = 822;
                    }
                    continue stateLoop;
                }
                case 821: {
                    var26 = 0;
                    statePc = 822;
                    continue stateLoop;
                }
                case 822: {
                    if (var26 == 0) {
                        statePc = 825;
                    } else {
                        statePc = 826;
                    }
                    continue stateLoop;
                }
                case 825: {
                    de.b(var2_int, var3, var2_int - -14, var3 + 14, 16711680);
                    de.b(var2_int + 1, var3, var2_int - -14, var3 + 13, 0);
                    de.b(var2_int, 1 + var3, var2_int + 13, var3 + 14, 0);
                    de.b(var2_int, var3 + 14, var2_int - -14, var3, 16711680);
                    de.b(var2_int + 1, var3 - -14, 14 + var2_int, 1 + var3, 0);
                    de.b(var2_int, 13 + var3, 13 + var2_int, var3, 0);
                    statePc = 826;
                    continue stateLoop;
                }
                case 826: {
                    if (an.field_g < var2_int) {
                        statePc = 842;
                    } else {
                        statePc = 827;
                    }
                    continue stateLoop;
                }
                case 827: {
                    if (me.field_I < var3) {
                        statePc = 842;
                    } else {
                        statePc = 830;
                    }
                    continue stateLoop;
                }
                case 830: {
                    if (~an.field_g <= ~(var2_int + 15)) {
                        statePc = 842;
                    } else {
                        statePc = 833;
                    }
                    continue stateLoop;
                }
                case 833: {
                    if (me.field_I >= var3 - -15) {
                        statePc = 842;
                    } else {
                        statePc = 836;
                    }
                    continue stateLoop;
                }
                case 836: {
                    if (var26 != 0) {
                        statePc = 841;
                    } else {
                        statePc = 842;
                    }
                    continue stateLoop;
                }
                case 841: {
                    de.a(var2_int + -1, var3 - 1, 17, 17, 16777215);
                    ((lc) this).field_m = 2;
                    ((lc) this).field_i = var25;
                    statePc = 842;
                    continue stateLoop;
                }
                case 842: {
                    if (ld.field_n[var25] == kg.field_d[0]) {
                        statePc = 845;
                    } else {
                        statePc = 846;
                    }
                    continue stateLoop;
                }
                case 845: {
                    de.a(var2_int - 1, var3 + -1, 17, 17, 2, 16777215, 128);
                    statePc = 846;
                    continue stateLoop;
                }
                case 846: {
                    var24++;
                    if (var32 == 0) {
                        statePc = 796;
                    } else {
                        statePc = 847;
                    }
                    continue stateLoop;
                }
                case 847: {
                    var23++;
                    if (var32 == 0) {
                        statePc = 792;
                    } else {
                        statePc = 848;
                    }
                    continue stateLoop;
                }
                case 848: {
                    boolean discarded$50 = this.a(false, 180, (byte) 106, false, bi.field_I - -225, 98, 309 + uc.field_a);
                    boolean discarded$51 = this.a(false, 166, (byte) -98, false, 232 + bi.field_I, 29, uc.field_a + 390);
                    int discarded$52 = tj.field_t.a(ce.field_j, 6 + (bi.field_I + 225), -1 + (uc.field_a - -390), 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    int discarded$53 = tj.field_t.a(ce.field_j, 7 + (225 + bi.field_I), -2 + uc.field_a - -390, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    int discarded$54 = tj.field_t.a(ce.field_j, bi.field_I - -225 - -7, -1 + (uc.field_a - -390), 166, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    de.a(248 + bi.field_I, 317 + uc.field_a, 131, 67, 16777215);
                    de.d(249 + bi.field_I, 318 + uc.field_a, 129, 65, 0);
                    stackOut_848_0 = 0;
                    stackIn_849_0 = stackOut_848_0;
                    statePc = 849;
                    continue stateLoop;
                }
                case 849: {
                    var23 = stackIn_849_0;
                    statePc = 850;
                    continue stateLoop;
                }
                case 850: {
                    stackOut_850_0 = var23;
                    stackOut_850_1 = 8;
                    stackIn_851_0 = stackOut_850_0;
                    stackIn_851_1 = stackOut_850_1;
                    statePc = 851;
                    continue stateLoop;
                }
                case 851: {
                    if (stackIn_851_0 >= stackIn_851_1) {
                        statePc = 908;
                    } else {
                        statePc = 852;
                    }
                    continue stateLoop;
                }
                case 852: {
                    stackOut_852_0 = 0;
                    stackIn_909_0 = stackOut_852_0;
                    stackIn_853_0 = stackOut_852_0;
                    if (var32 != 0) {
                        statePc = 909;
                    } else {
                        statePc = 853;
                    }
                    continue stateLoop;
                }
                case 853: {
                    var24 = stackIn_853_0;
                    statePc = 854;
                    continue stateLoop;
                }
                case 854: {
                    if (var24 >= 4) {
                        statePc = 907;
                    } else {
                        statePc = 855;
                    }
                    continue stateLoop;
                }
                case 855: {
                    var25 = 8 * var24 + var23;
                    var26 = (ud.field_z[var25][0] << -1104353136) + (ud.field_z[var25][2] - -(ud.field_z[var25][1] << 1324992264));
                    var3 = var24 * 16 + 319 + uc.field_a;
                    var2_int = 250 + bi.field_I + 16 * var23;
                    de.d(var2_int, var3, 15, 15, var26);
                    stackOut_855_0 = 2;
                    stackOut_855_1 = var25;
                    stackIn_851_0 = stackOut_855_0;
                    stackIn_851_1 = stackOut_855_1;
                    stackIn_856_0 = stackOut_855_0;
                    stackIn_856_1 = stackOut_855_1;
                    if (var32 != 0) {
                        statePc = 851;
                    } else {
                        statePc = 856;
                    }
                    continue stateLoop;
                }
                case 856: {
                    if (stackIn_856_0 != stackIn_856_1) {
                        statePc = 863;
                    } else {
                        statePc = 857;
                    }
                    continue stateLoop;
                }
                case 857: {
                    if (kg.field_d[3] == hi.field_b[0]) {
                        statePc = 862;
                    } else {
                        statePc = 863;
                    }
                    continue stateLoop;
                }
                case 862: {
                    var26 = 0;
                    statePc = 863;
                    continue stateLoop;
                }
                case 863: {
                    if (var25 != 12) {
                        statePc = 870;
                    } else {
                        statePc = 864;
                    }
                    continue stateLoop;
                }
                case 864: {
                    if (kg.field_d[3] == hi.field_b[2]) {
                        statePc = 869;
                    } else {
                        statePc = 870;
                    }
                    continue stateLoop;
                }
                case 869: {
                    var26 = 0;
                    statePc = 870;
                    continue stateLoop;
                }
                case 870: {
                    if (var25 != 12) {
                        statePc = 877;
                    } else {
                        statePc = 871;
                    }
                    continue stateLoop;
                }
                case 871: {
                    if (kg.field_d[3] == hi.field_b[3]) {
                        statePc = 876;
                    } else {
                        statePc = 877;
                    }
                    continue stateLoop;
                }
                case 876: {
                    var26 = 0;
                    statePc = 877;
                    continue stateLoop;
                }
                case 877: {
                    if (var25 != 13) {
                        statePc = 884;
                    } else {
                        statePc = 878;
                    }
                    continue stateLoop;
                }
                case 878: {
                    if (hi.field_b[3] == kg.field_d[3]) {
                        statePc = 883;
                    } else {
                        statePc = 884;
                    }
                    continue stateLoop;
                }
                case 883: {
                    var26 = 0;
                    statePc = 884;
                    continue stateLoop;
                }
                case 884: {
                    if (var26 != 0) {
                        statePc = 887;
                    } else {
                        statePc = 885;
                    }
                    continue stateLoop;
                }
                case 885: {
                    de.b(var2_int, var3, 14 + var2_int, var3 - -14, 16711680);
                    de.b(1 + var2_int, var3, 14 + var2_int, var3 - -13, 0);
                    de.b(var2_int, var3 + 1, var2_int - -13, var3 + 14, 0);
                    de.b(var2_int, var3 + 14, var2_int + 14, var3, 16711680);
                    de.b(var2_int + 1, var3 - -14, 14 + var2_int, var3 - -1, 0);
                    de.b(var2_int, var3 - -13, 13 + var2_int, var3, 0);
                    statePc = 887;
                    continue stateLoop;
                }
                case 887: {
                    if (~an.field_g > ~var2_int) {
                        statePc = 902;
                    } else {
                        statePc = 888;
                    }
                    continue stateLoop;
                }
                case 888: {
                    if (~me.field_I > ~var3) {
                        statePc = 902;
                    } else {
                        statePc = 891;
                    }
                    continue stateLoop;
                }
                case 891: {
                    if (~(15 + var2_int) >= ~an.field_g) {
                        statePc = 902;
                    } else {
                        statePc = 894;
                    }
                    continue stateLoop;
                }
                case 894: {
                    if (~(var3 - -15) >= ~me.field_I) {
                        statePc = 902;
                    } else {
                        statePc = 897;
                    }
                    continue stateLoop;
                }
                case 897: {
                    if (var26 == 0) {
                        statePc = 902;
                    } else {
                        statePc = 900;
                    }
                    continue stateLoop;
                }
                case 900: {
                    de.a(-1 + var2_int, -1 + var3, 17, 17, 16777215);
                    ((lc) this).field_i = var25;
                    ((lc) this).field_m = 3;
                    statePc = 902;
                    continue stateLoop;
                }
                case 902: {
                    if (kg.field_d[1] == ud.field_z[var25]) {
                        statePc = 905;
                    } else {
                        statePc = 906;
                    }
                    continue stateLoop;
                }
                case 905: {
                    de.a(var2_int - 1, var3 - 1, 17, 17, 2, 16777215, 128);
                    statePc = 906;
                    continue stateLoop;
                }
                case 906: {
                    var24++;
                    if (var32 == 0) {
                        statePc = 854;
                    } else {
                        statePc = 907;
                    }
                    continue stateLoop;
                }
                case 907: {
                    var23++;
                    if (var32 == 0) {
                        statePc = 850;
                    } else {
                        statePc = 908;
                    }
                    continue stateLoop;
                }
                case 908: {
                    var23 = 79;
                    stackOut_908_0 = 424;
                    stackIn_909_0 = stackOut_908_0;
                    statePc = 909;
                    continue stateLoop;
                }
                case 909: {
                    var24 = stackIn_909_0;
                    if (gm.field_f == 3) {
                        statePc = 912;
                    } else {
                        statePc = 913;
                    }
                    continue stateLoop;
                }
                case 912: {
                    var23 += 14;
                    var24 -= 7;
                    statePc = 913;
                    continue stateLoop;
                }
                case 913: {
                    boolean discarded$55 = this.a(false, 93, (byte) -106, false, bi.field_I - -417, 98, uc.field_a - -309);
                    boolean discarded$56 = this.a(false, var23, (byte) -96, false, var24 + bi.field_I, 29, uc.field_a + 390);
                    int discarded$57 = tj.field_t.a(th.field_j, -1 + bi.field_I - -var24, uc.field_a - -390 - 1, var23, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    int discarded$58 = tj.field_t.a(th.field_j, var24 + bi.field_I, 390 + (uc.field_a + -2), var23, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    int discarded$59 = tj.field_t.a(th.field_j, var24 + bi.field_I, -1 + (uc.field_a - -390), var23, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    de.a(431 + bi.field_I, uc.field_a - -317, 67, 67, 16777215);
                    de.d(bi.field_I - -432, uc.field_a - -318, 65, 65, 0);
                    var25 = 0;
                    statePc = 914;
                    continue stateLoop;
                }
                case 914: {
                    stackOut_914_0 = -5;
                    stackOut_914_1 = ~var25;
                    stackIn_915_0 = stackOut_914_0;
                    stackIn_915_1 = stackOut_914_1;
                    statePc = 915;
                    continue stateLoop;
                }
                case 915: {
                    if (stackIn_915_0 >= stackIn_915_1) {
                        statePc = 937;
                    } else {
                        statePc = 916;
                    }
                    continue stateLoop;
                }
                case 916: {
                    stackOut_916_0 = 0;
                    stackIn_938_0 = stackOut_916_0;
                    stackIn_917_0 = stackOut_916_0;
                    if (var32 != 0) {
                        statePc = 938;
                    } else {
                        statePc = 917;
                    }
                    continue stateLoop;
                }
                case 917: {
                    var26 = stackIn_917_0;
                    statePc = 918;
                    continue stateLoop;
                }
                case 918: {
                    if (var26 >= 4) {
                        statePc = 936;
                    } else {
                        statePc = 919;
                    }
                    continue stateLoop;
                }
                case 919: {
                    var27 = var25 + var26 * 4;
                    var2_int = var25 * 16 + (bi.field_I - -433);
                    var28 = (ug.field_d[var27][0] << -1028253840) + (ug.field_d[var27][2] + (ug.field_d[var27][1] << -1153120760));
                    var3 = 16 * var26 + 319 + uc.field_a;
                    de.d(var2_int, var3, 15, 15, var28);
                    stackOut_919_0 = ~an.field_g;
                    stackOut_919_1 = ~var2_int;
                    stackIn_915_0 = stackOut_919_0;
                    stackIn_915_1 = stackOut_919_1;
                    stackIn_920_0 = stackOut_919_0;
                    stackIn_920_1 = stackOut_919_1;
                    if (var32 != 0) {
                        statePc = 915;
                    } else {
                        statePc = 920;
                    }
                    continue stateLoop;
                }
                case 920: {
                    if (stackIn_920_0 > stackIn_920_1) {
                        statePc = 932;
                    } else {
                        statePc = 921;
                    }
                    continue stateLoop;
                }
                case 921: {
                    if (var3 > me.field_I) {
                        statePc = 932;
                    } else {
                        statePc = 924;
                    }
                    continue stateLoop;
                }
                case 924: {
                    if (15 + var2_int <= an.field_g) {
                        statePc = 932;
                    } else {
                        statePc = 927;
                    }
                    continue stateLoop;
                }
                case 927: {
                    if (me.field_I >= var3 - -15) {
                        statePc = 932;
                    } else {
                        statePc = 930;
                    }
                    continue stateLoop;
                }
                case 930: {
                    de.a(var2_int + -1, var3 - 1, 17, 17, 16777215);
                    ((lc) this).field_i = var27;
                    ((lc) this).field_m = 4;
                    statePc = 932;
                    continue stateLoop;
                }
                case 932: {
                    if (kg.field_d[2] != ug.field_d[var27]) {
                        statePc = 935;
                    } else {
                        statePc = 933;
                    }
                    continue stateLoop;
                }
                case 933: {
                    de.a(var2_int - 1, -1 + var3, 17, 17, 2, 16777215, 128);
                    statePc = 935;
                    continue stateLoop;
                }
                case 935: {
                    var26++;
                    if (var32 == 0) {
                        statePc = 918;
                    } else {
                        statePc = 936;
                    }
                    continue stateLoop;
                }
                case 936: {
                    var25++;
                    if (var32 == 0) {
                        statePc = 914;
                    } else {
                        statePc = 937;
                    }
                    continue stateLoop;
                }
                case 937: {
                    boolean discarded$60 = this.a(false, 93, (byte) 93, false, 520 + bi.field_I, 98, 309 + uc.field_a);
                    boolean discarded$61 = this.a(false, 79, (byte) 121, false, 7 + bi.field_I + 520, 29, 390 + uc.field_a);
                    int discarded$62 = tj.field_t.a(ka.field_l, 7 + bi.field_I + 520 + -1, 389 + uc.field_a, 79, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    int discarded$63 = tj.field_t.a(ka.field_l, bi.field_I + 527, 390 + uc.field_a + -2, 79, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    int discarded$64 = tj.field_t.a(ka.field_l, bi.field_I + 520 + 7, -1 + uc.field_a + 390, 79, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    de.a(535 + bi.field_I, uc.field_a + 333, 67, 35, 16777215);
                    de.d(bi.field_I + 536, uc.field_a - -318 - -16, 65, 33, 0);
                    stackOut_937_0 = 0;
                    stackIn_938_0 = stackOut_937_0;
                    statePc = 938;
                    continue stateLoop;
                }
                case 938: {
                    var25 = stackIn_938_0;
                    statePc = 939;
                    continue stateLoop;
                }
                case 939: {
                    stackOut_939_0 = 4;
                    stackOut_939_1 = var25;
                    stackIn_940_0 = stackOut_939_0;
                    stackIn_940_1 = stackOut_939_1;
                    statePc = 940;
                    continue stateLoop;
                }
                case 940: {
                    if (stackIn_940_0 <= stackIn_940_1) {
                        statePc = 965;
                    } else {
                        statePc = 941;
                    }
                    continue stateLoop;
                }
                case 941: {
                    if (var32 != 0) {
                        statePc = 965;
                    } else {
                        statePc = 942;
                    }
                    continue stateLoop;
                }
                case 942: {
                    var26 = 0;
                    statePc = 943;
                    continue stateLoop;
                }
                case 943: {
                    if (var26 >= 2) {
                        statePc = 962;
                    } else {
                        statePc = 944;
                    }
                    continue stateLoop;
                }
                case 944: {
                    var27 = 4 * var26 + var25;
                    var3 = var26 * 16 + uc.field_a - -335;
                    var2_int = var25 * 16 + bi.field_I + 537;
                    var28 = (hi.field_b[var27][0] << 862087536) + (hi.field_b[var27][1] << 901584712) + hi.field_b[var27][2];
                    de.d(var2_int, var3, 15, 15, var28);
                    stackOut_944_0 = ~an.field_g;
                    stackOut_944_1 = ~var2_int;
                    stackIn_940_0 = stackOut_944_0;
                    stackIn_940_1 = stackOut_944_1;
                    stackIn_945_0 = stackOut_944_0;
                    stackIn_945_1 = stackOut_944_1;
                    if (var32 != 0) {
                        statePc = 940;
                    } else {
                        statePc = 945;
                    }
                    continue stateLoop;
                }
                case 945: {
                    if (stackIn_945_0 > stackIn_945_1) {
                        statePc = 958;
                    } else {
                        statePc = 946;
                    }
                    continue stateLoop;
                }
                case 946: {
                    if (var3 > me.field_I) {
                        statePc = 958;
                    } else {
                        statePc = 949;
                    }
                    continue stateLoop;
                }
                case 949: {
                    if (~an.field_g <= ~(15 + var2_int)) {
                        statePc = 958;
                    } else {
                        statePc = 952;
                    }
                    continue stateLoop;
                }
                case 952: {
                    if (~(var3 + 15) < ~me.field_I) {
                        statePc = 957;
                    } else {
                        statePc = 958;
                    }
                    continue stateLoop;
                }
                case 957: {
                    de.a(var2_int + -1, -1 + var3, 17, 17, 16777215);
                    ((lc) this).field_i = var27;
                    ((lc) this).field_m = 5;
                    statePc = 958;
                    continue stateLoop;
                }
                case 958: {
                    if (hi.field_b[var27] != kg.field_d[3]) {
                        statePc = 961;
                    } else {
                        statePc = 959;
                    }
                    continue stateLoop;
                }
                case 959: {
                    de.a(-1 + var2_int, -1 + var3, 17, 17, 2, 16777215, 128);
                    statePc = 961;
                    continue stateLoop;
                }
                case 961: {
                    var26++;
                    if (var32 == 0) {
                        statePc = 943;
                    } else {
                        statePc = 962;
                    }
                    continue stateLoop;
                }
                case 962: {
                    var25++;
                    if (var32 == 0) {
                        statePc = 939;
                    } else {
                        statePc = 965;
                    }
                    continue stateLoop;
                }
                case 965: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        so stackIn_152_0 = null;
        so stackIn_153_0 = null;
        so stackIn_154_0 = null;
        so stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_225_0 = 0;
        so stackIn_238_0 = null;
        so stackIn_239_0 = null;
        so stackIn_240_0 = null;
        so stackIn_241_0 = null;
        int stackIn_241_1 = 0;
        so stackIn_245_0 = null;
        so stackIn_246_0 = null;
        so stackIn_247_0 = null;
        so stackIn_248_0 = null;
        int stackIn_248_1 = 0;
        so stackIn_260_0 = null;
        so stackIn_261_0 = null;
        so stackIn_262_0 = null;
        so stackIn_263_0 = null;
        int stackIn_263_1 = 0;
        so stackIn_279_0 = null;
        so stackIn_280_0 = null;
        so stackIn_281_0 = null;
        so stackIn_282_0 = null;
        int stackIn_282_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        so stackOut_151_0 = null;
        so stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        so stackOut_152_0 = null;
        so stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_224_0 = 0;
        int stackOut_223_0 = 0;
        so stackOut_237_0 = null;
        so stackOut_240_0 = null;
        int stackOut_240_1 = 0;
        so stackOut_238_0 = null;
        so stackOut_239_0 = null;
        int stackOut_239_1 = 0;
        so stackOut_244_0 = null;
        so stackOut_247_0 = null;
        int stackOut_247_1 = 0;
        so stackOut_245_0 = null;
        so stackOut_246_0 = null;
        int stackOut_246_1 = 0;
        so stackOut_259_0 = null;
        so stackOut_262_0 = null;
        int stackOut_262_1 = 0;
        so stackOut_260_0 = null;
        so stackOut_261_0 = null;
        int stackOut_261_1 = 0;
        so stackOut_278_0 = null;
        so stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        so stackOut_279_0 = null;
        so stackOut_280_0 = null;
        int stackOut_280_1 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          if (!param2) {
            break L0;
          } else {
            ((lc) this).a(false, 127, (byte) 126);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            L11: {
                              L12: {
                                L13: {
                                  L14: {
                                    L15: {
                                      L16: {
                                        L17: {
                                          L18: {
                                            L19: {
                                              L20: {
                                                L21: {
                                                  L22: {
                                                    L23: {
                                                      L24: {
                                                        L25: {
                                                          L26: {
                                                            L27: {
                                                              L28: {
                                                                L29: {
                                                                  L30: {
                                                                    var4_int = wl.field_L[((lc) this).field_l][param1];
                                                                    var6 = var4_int;
                                                                    if (var6 != 0) {
                                                                      break L30;
                                                                    } else {
                                                                      if (var9 == 0) {
                                                                        if (((lc) this).field_g.b(true)) {
                                                                          var6 = param0 ? 1 : 0;
                                                                          gj.a(var6 != 0, true, -3, mn.field_r);
                                                                          if (var9 == 0) {
                                                                            break L1;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        } else {
                                                                          break L1;
                                                                        }
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  L31: {
                                                                    if (1 != var6) {
                                                                      break L31;
                                                                    } else {
                                                                      if (var9 == 0) {
                                                                        break L29;
                                                                      } else {
                                                                        break L31;
                                                                      }
                                                                    }
                                                                  }
                                                                  L32: {
                                                                    if (var6 != 2) {
                                                                      break L32;
                                                                    } else {
                                                                      if (var9 == 0) {
                                                                        break L28;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var6 == 7) {
                                                                    break L27;
                                                                  } else {
                                                                    if (var6 == 24) {
                                                                      break L26;
                                                                    } else {
                                                                      L33: {
                                                                        if (var6 != 22) {
                                                                          break L33;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L25;
                                                                          } else {
                                                                            break L33;
                                                                          }
                                                                        }
                                                                      }
                                                                      L34: {
                                                                        if (var6 != 14) {
                                                                          break L34;
                                                                        } else {
                                                                          if (var9 == 0) {
                                                                            break L24;
                                                                          } else {
                                                                            break L34;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (15 == var6) {
                                                                        break L23;
                                                                      } else {
                                                                        L35: {
                                                                          if (var6 != 5) {
                                                                            break L35;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L22;
                                                                            } else {
                                                                              break L35;
                                                                            }
                                                                          }
                                                                        }
                                                                        L36: {
                                                                          if (8 != var6) {
                                                                            break L36;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L21;
                                                                            } else {
                                                                              break L36;
                                                                            }
                                                                          }
                                                                        }
                                                                        L37: {
                                                                          if (var6 != 4) {
                                                                            break L37;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L20;
                                                                            } else {
                                                                              break L37;
                                                                            }
                                                                          }
                                                                        }
                                                                        L38: {
                                                                          if (var6 != 27) {
                                                                            break L38;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L19;
                                                                            } else {
                                                                              break L38;
                                                                            }
                                                                          }
                                                                        }
                                                                        L39: {
                                                                          if (var6 != 28) {
                                                                            break L39;
                                                                          } else {
                                                                            if (var9 == 0) {
                                                                              break L18;
                                                                            } else {
                                                                              break L39;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (20 == var6) {
                                                                          break L17;
                                                                        } else {
                                                                          L40: {
                                                                            if (var6 != 21) {
                                                                              break L40;
                                                                            } else {
                                                                              if (var9 == 0) {
                                                                                break L16;
                                                                              } else {
                                                                                break L40;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (var6 == 6) {
                                                                            break L15;
                                                                          } else {
                                                                            L41: {
                                                                              if (var6 != 9) {
                                                                                break L41;
                                                                              } else {
                                                                                if (var9 == 0) {
                                                                                  break L14;
                                                                                } else {
                                                                                  break L41;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var6 == 10) {
                                                                              break L13;
                                                                            } else {
                                                                              L42: {
                                                                                if (var6 != 11) {
                                                                                  break L42;
                                                                                } else {
                                                                                  if (var9 == 0) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    break L42;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (var6 == 12) {
                                                                                break L11;
                                                                              } else {
                                                                                L43: {
                                                                                  if (var6 != 13) {
                                                                                    break L43;
                                                                                  } else {
                                                                                    if (var9 == 0) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L43;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var6 == 17) {
                                                                                  break L9;
                                                                                } else {
                                                                                  L44: {
                                                                                    if (var6 != 18) {
                                                                                      break L44;
                                                                                    } else {
                                                                                      if (var9 == 0) {
                                                                                        break L8;
                                                                                      } else {
                                                                                        break L44;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L45: {
                                                                                    if (var6 != 23) {
                                                                                      break L45;
                                                                                    } else {
                                                                                      if (var9 == 0) {
                                                                                        break L7;
                                                                                      } else {
                                                                                        break L45;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (var6 == 25) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    if (26 == var6) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var6 == 19) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        if (30 == var6) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          if (var6 == 29) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            break L1;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                if (((lc) this).field_g.b(true)) {
                                                                  L46: {
                                                                    if (lc.a((byte) 112)) {
                                                                      break L46;
                                                                    } else {
                                                                      var6 = param0 ? 1 : 0;
                                                                      gj.a(var6 != 0, true, -4, mn.field_r);
                                                                      if (var9 == 0) {
                                                                        break L1;
                                                                      } else {
                                                                        break L46;
                                                                      }
                                                                    }
                                                                  }
                                                                  ke.a(wd.field_h, param0, (dj) (Object) mi.field_B, 1, ve.field_t, 0, an.field_j / 2, 16, mi.field_B.field_o, 10, an.field_f / 2, ud.field_o, true, mi.field_B.field_o - -mi.field_B.field_m, -21071);
                                                                  if (var9 == 0) {
                                                                    break L1;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                              if (!((lc) this).field_g.b(true)) {
                                                                break L1;
                                                              } else {
                                                                L47: {
                                                                  var6 = param0 ? 1 : 0;
                                                                  stackOut_104_0 = var6;
                                                                  stackIn_106_0 = stackOut_104_0;
                                                                  stackIn_105_0 = stackOut_104_0;
                                                                  if (param2) {
                                                                    stackOut_106_0 = stackIn_106_0;
                                                                    stackOut_106_1 = 0;
                                                                    stackIn_107_0 = stackOut_106_0;
                                                                    stackIn_107_1 = stackOut_106_1;
                                                                    break L47;
                                                                  } else {
                                                                    stackOut_105_0 = stackIn_105_0;
                                                                    stackOut_105_1 = 1;
                                                                    stackIn_107_0 = stackOut_105_0;
                                                                    stackIn_107_1 = stackOut_105_1;
                                                                    break L47;
                                                                  }
                                                                }
                                                                gj.a(stackIn_107_0 != 0, stackIn_107_1 != 0, -1, mn.field_r);
                                                                if (var9 == 0) {
                                                                  break L1;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                            if (((lc) this).field_g.b(true)) {
                                                              L48: {
                                                                var6 = param0 ? 1 : 0;
                                                                stackOut_111_0 = var6;
                                                                stackIn_113_0 = stackOut_111_0;
                                                                stackIn_112_0 = stackOut_111_0;
                                                                if (param2) {
                                                                  stackOut_113_0 = stackIn_113_0;
                                                                  stackOut_113_1 = 0;
                                                                  stackIn_114_0 = stackOut_113_0;
                                                                  stackIn_114_1 = stackOut_113_1;
                                                                  break L48;
                                                                } else {
                                                                  stackOut_112_0 = stackIn_112_0;
                                                                  stackOut_112_1 = 1;
                                                                  stackIn_114_0 = stackOut_112_0;
                                                                  stackIn_114_1 = stackOut_112_1;
                                                                  break L48;
                                                                }
                                                              }
                                                              gj.a(stackIn_114_0 != 0, stackIn_114_1 != 0, 0, mn.field_r);
                                                              io.field_A = false;
                                                              fi.field_h = true;
                                                              if (var9 == 0) {
                                                                break L1;
                                                              } else {
                                                                break L26;
                                                              }
                                                            } else {
                                                              break L1;
                                                            }
                                                          }
                                                          if (((lc) this).field_g.b(true)) {
                                                            var6 = param0 ? 1 : 0;
                                                            gj.a(var6 != 0, true, 10, mn.field_r);
                                                            tn.field_Cb = true;
                                                            if (var9 == 0) {
                                                              break L1;
                                                            } else {
                                                              break L25;
                                                            }
                                                          } else {
                                                            break L1;
                                                          }
                                                        }
                                                        if (((lc) this).field_g.b(true)) {
                                                          var6 = param0 ? 1 : 0;
                                                          gj.a(var6 != 0, true, 8, mn.field_r);
                                                          if (param0) {
                                                            break L1;
                                                          } else {
                                                            ((lc) this).field_g.field_h = 1;
                                                            if (var9 == 0) {
                                                              break L1;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                      if (((lc) this).field_g.b(true)) {
                                                        L49: {
                                                          var6 = param0 ? 1 : 0;
                                                          stackOut_128_0 = var6;
                                                          stackIn_130_0 = stackOut_128_0;
                                                          stackIn_129_0 = stackOut_128_0;
                                                          if (param2) {
                                                            stackOut_130_0 = stackIn_130_0;
                                                            stackOut_130_1 = 0;
                                                            stackIn_131_0 = stackOut_130_0;
                                                            stackIn_131_1 = stackOut_130_1;
                                                            break L49;
                                                          } else {
                                                            stackOut_129_0 = stackIn_129_0;
                                                            stackOut_129_1 = 1;
                                                            stackIn_131_0 = stackOut_129_0;
                                                            stackIn_131_1 = stackOut_129_1;
                                                            break L49;
                                                          }
                                                        }
                                                        gj.a(stackIn_131_0 != 0, stackIn_131_1 != 0, 15, mn.field_r);
                                                        if (var9 == 0) {
                                                          break L1;
                                                        } else {
                                                          break L23;
                                                        }
                                                      } else {
                                                        break L1;
                                                      }
                                                    }
                                                    if (!((lc) this).field_g.b(true)) {
                                                      break L1;
                                                    } else {
                                                      L50: {
                                                        if (lc.a((byte) 112)) {
                                                          break L50;
                                                        } else {
                                                          if (ah.field_c <= 0) {
                                                            break L50;
                                                          } else {
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                      var6 = param0 ? 1 : 0;
                                                      gj.a(var6 != 0, true, 16, mn.field_r);
                                                      if (var9 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  if (((lc) this).field_g.b(true)) {
                                                    fh.field_e = 0;
                                                    var6 = param0 ? 1 : 0;
                                                    gj.a(var6 != 0, true, 7, mn.field_r);
                                                    if (var9 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L21;
                                                    }
                                                  } else {
                                                    break L1;
                                                  }
                                                }
                                                if (((lc) this).field_g.b(true)) {
                                                  var6 = th.field_f;
                                                  var7 = param0 ? 1 : 0;
                                                  gj.a(var7 != 0, true, var6, mn.field_r);
                                                  if (var9 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L20;
                                                  }
                                                } else {
                                                  break L1;
                                                }
                                              }
                                              if (!((lc) this).field_g.b(true)) {
                                                break L1;
                                              } else {
                                                var6 = param0 ? 1 : 0;
                                                gj.a(var6 != 0, true, 6, mn.field_r);
                                                if (var9 == 0) {
                                                  break L1;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L51: {
                                              stackOut_151_0 = ((lc) this).field_g;
                                              stackIn_154_0 = stackOut_151_0;
                                              stackIn_152_0 = stackOut_151_0;
                                              if (param2) {
                                                stackOut_154_0 = (so) (Object) stackIn_154_0;
                                                stackOut_154_1 = 0;
                                                stackIn_155_0 = stackOut_154_0;
                                                stackIn_155_1 = stackOut_154_1;
                                                break L51;
                                              } else {
                                                stackOut_152_0 = (so) (Object) stackIn_152_0;
                                                stackIn_153_0 = stackOut_152_0;
                                                stackOut_153_0 = (so) (Object) stackIn_153_0;
                                                stackOut_153_1 = 1;
                                                stackIn_155_0 = stackOut_153_0;
                                                stackIn_155_1 = stackOut_153_1;
                                                break L51;
                                              }
                                            }
                                            if (((so) (Object) stackIn_155_0).b(stackIn_155_1 == 0)) {
                                              break L1;
                                            } else {
                                              var6 = param0 ? 1 : 0;
                                              gj.a(var6 != 0, true, 11, mn.field_r);
                                              if (var9 == 0) {
                                                break L1;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          if (((lc) this).field_g.b(true)) {
                                            var6 = param0 ? 1 : 0;
                                            gj.a(var6 != 0, true, 12, mn.field_r);
                                            if (var9 == 0) {
                                              break L1;
                                            } else {
                                              break L17;
                                            }
                                          } else {
                                            break L1;
                                          }
                                        }
                                        L52: {
                                          var5 = 0;
                                          if (!((lc) this).field_g.a(-13722)) {
                                            break L52;
                                          } else {
                                            if (si.field_l <= 0) {
                                              break L52;
                                            } else {
                                              mf.a(0, 21298);
                                              var5 = 1;
                                              break L52;
                                            }
                                          }
                                        }
                                        L53: {
                                          if (!((lc) this).field_g.d((byte) 112)) {
                                            break L53;
                                          } else {
                                            if (si.field_l >= 256) {
                                              break L53;
                                            } else {
                                              var5 = 1;
                                              mf.a(256, 21298);
                                              break L53;
                                            }
                                          }
                                        }
                                        L54: {
                                          if (((lc) this).field_g.c((byte) -26)) {
                                            L55: {
                                              var6 = this.d(41, param1) + (this.a(param1, (byte) 103) + (ff.field_c - 120)) >> -2113586175;
                                              var7 = -var6 + an.field_g;
                                              var8 = var7 * 256 / 120;
                                              var5 = 1;
                                              if (0 >= var8) {
                                                break L55;
                                              } else {
                                                L56: {
                                                  if (256 > var8) {
                                                    break L56;
                                                  } else {
                                                    mf.a(256, 21298);
                                                    if (var9 == 0) {
                                                      break L54;
                                                    } else {
                                                      break L56;
                                                    }
                                                  }
                                                }
                                                mf.a(var8, 21298);
                                                if (var9 == 0) {
                                                  break L54;
                                                } else {
                                                  break L55;
                                                }
                                              }
                                            }
                                            mf.a(0, 21298);
                                            break L54;
                                          } else {
                                            break L54;
                                          }
                                        }
                                        L57: {
                                          if (!((lc) this).field_g.b((byte) -40)) {
                                            break L57;
                                          } else {
                                            if (si.field_l > 0) {
                                              var5 = 1;
                                              ob.j((byte) -109);
                                              break L57;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        L58: {
                                          if (!((lc) this).field_g.b(-65)) {
                                            break L58;
                                          } else {
                                            if (si.field_l < 256) {
                                              var5 = 1;
                                              s.a(false);
                                              break L58;
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                        if (var5 != 0) {
                                          L59: {
                                            if (!((lc) this).field_g.c((byte) -102)) {
                                              break L59;
                                            } else {
                                              if (oj.field_e >= jb.field_v) {
                                                break L1;
                                              } else {
                                                break L59;
                                              }
                                            }
                                          }
                                          L60: {
                                            if (null != cf.field_h[nn.field_n[0][2]]) {
                                              fk discarded$1 = ti.a((byte) -30, to.field_r[nn.field_n[0][2]], cf.field_h[nn.field_n[0][2]]);
                                              break L60;
                                            } else {
                                              break L60;
                                            }
                                          }
                                          oj.field_e = 20 + jb.field_v;
                                          if (var9 == 0) {
                                            break L1;
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          break L1;
                                        }
                                      }
                                      L61: {
                                        if (!((lc) this).field_g.a(-13722)) {
                                          break L61;
                                        } else {
                                          eb.a(0, false);
                                          break L61;
                                        }
                                      }
                                      L62: {
                                        if (!((lc) this).field_g.d((byte) 125)) {
                                          break L62;
                                        } else {
                                          eb.a(256, false);
                                          break L62;
                                        }
                                      }
                                      L63: {
                                        if (!((lc) this).field_g.c((byte) 85)) {
                                          break L63;
                                        } else {
                                          L64: {
                                            var6 = -120 + this.d(41, param1) - (-this.a(param1, (byte) 103) - ff.field_c) >> -741220799;
                                            var7 = -var6 + an.field_g;
                                            var8 = 256 * var7 / 120;
                                            if (var8 > 0) {
                                              break L64;
                                            } else {
                                              eb.a(0, param2);
                                              if (var9 == 0) {
                                                break L63;
                                              } else {
                                                break L64;
                                              }
                                            }
                                          }
                                          L65: {
                                            if (var8 >= 256) {
                                              break L65;
                                            } else {
                                              eb.a(var8, false);
                                              if (var9 == 0) {
                                                break L63;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                          eb.a(256, false);
                                          break L63;
                                        }
                                      }
                                      L66: {
                                        if (((lc) this).field_g.b((byte) -40)) {
                                          jm.b(60);
                                          break L66;
                                        } else {
                                          break L66;
                                        }
                                      }
                                      if (((lc) this).field_g.b(-74)) {
                                        ck.a((byte) 115);
                                        if (var9 == 0) {
                                          break L1;
                                        } else {
                                          break L15;
                                        }
                                      } else {
                                        break L1;
                                      }
                                    }
                                    if (!((lc) this).field_g.b(true)) {
                                      break L1;
                                    } else {
                                      L67: {
                                        if (param2) {
                                          stackOut_224_0 = 0;
                                          stackIn_225_0 = stackOut_224_0;
                                          break L67;
                                        } else {
                                          stackOut_223_0 = 1;
                                          stackIn_225_0 = stackOut_223_0;
                                          break L67;
                                        }
                                      }
                                      wl.f(stackIn_225_0 != 0);
                                      if (var9 == 0) {
                                        break L1;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if (!((lc) this).field_g.b(true)) {
                                    break L1;
                                  } else {
                                    jb.field_z.a(-111, param0);
                                    fi.field_h = true;
                                    io.field_A = false;
                                    if (var9 == 0) {
                                      break L1;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                if (((lc) this).field_g.b(true)) {
                                  jb.field_z.a(true);
                                  var6 = param0 ? 1 : 0;
                                  gj.a(var6 != 0, true, -1, mn.field_r);
                                  if (var9 == 0) {
                                    break L1;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L1;
                                }
                              }
                              if (!((lc) this).field_g.b(true)) {
                                break L1;
                              } else {
                                jb.field_z.p(26873);
                                var6 = param0 ? 1 : 0;
                                gj.a(var6 != 0, true, -1, mn.field_r);
                                if (var9 == 0) {
                                  break L1;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L68: {
                              stackOut_237_0 = ((lc) this).field_g;
                              stackIn_240_0 = stackOut_237_0;
                              stackIn_238_0 = stackOut_237_0;
                              if (param2) {
                                stackOut_240_0 = (so) (Object) stackIn_240_0;
                                stackOut_240_1 = 0;
                                stackIn_241_0 = stackOut_240_0;
                                stackIn_241_1 = stackOut_240_1;
                                break L68;
                              } else {
                                stackOut_238_0 = (so) (Object) stackIn_238_0;
                                stackIn_239_0 = stackOut_238_0;
                                stackOut_239_0 = (so) (Object) stackIn_239_0;
                                stackOut_239_1 = 1;
                                stackIn_241_0 = stackOut_239_0;
                                stackIn_241_1 = stackOut_239_1;
                                break L68;
                              }
                            }
                            if (((so) (Object) stackIn_241_0).b(stackIn_241_1 != 0)) {
                              jb.field_z.g((byte) -61);
                              var6 = param0 ? 1 : 0;
                              gj.a(var6 != 0, true, -1, mn.field_r);
                              if (var9 == 0) {
                                break L1;
                              } else {
                                break L10;
                              }
                            } else {
                              break L1;
                            }
                          }
                          L69: {
                            stackOut_244_0 = ((lc) this).field_g;
                            stackIn_247_0 = stackOut_244_0;
                            stackIn_245_0 = stackOut_244_0;
                            if (param2) {
                              stackOut_247_0 = (so) (Object) stackIn_247_0;
                              stackOut_247_1 = 0;
                              stackIn_248_0 = stackOut_247_0;
                              stackIn_248_1 = stackOut_247_1;
                              break L69;
                            } else {
                              stackOut_245_0 = (so) (Object) stackIn_245_0;
                              stackIn_246_0 = stackOut_245_0;
                              stackOut_246_0 = (so) (Object) stackIn_246_0;
                              stackOut_246_1 = 1;
                              stackIn_248_0 = stackOut_246_0;
                              stackIn_248_1 = stackOut_246_1;
                              break L69;
                            }
                          }
                          if (((so) (Object) stackIn_248_0).b(stackIn_248_1 == 0)) {
                            break L1;
                          } else {
                            L70: {
                              if (!hi.field_a) {
                                break L70;
                              } else {
                                var6 = param0 ? 1 : 0;
                                gj.a(var6 != 0, true, -5, mn.field_r);
                                break L70;
                              }
                            }
                            L71: {
                              if (!mj.field_w) {
                                break L71;
                              } else {
                                qe.a(0, (byte) -35, 11);
                                break L71;
                              }
                            }
                            fi.field_h = true;
                            if (var9 == 0) {
                              break L1;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (!((lc) this).field_g.b(true)) {
                          break L1;
                        } else {
                          ie.field_Sb = 0;
                          if (var9 == 0) {
                            break L1;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L72: {
                        stackOut_259_0 = ((lc) this).field_g;
                        stackIn_262_0 = stackOut_259_0;
                        stackIn_260_0 = stackOut_259_0;
                        if (param2) {
                          stackOut_262_0 = (so) (Object) stackIn_262_0;
                          stackOut_262_1 = 0;
                          stackIn_263_0 = stackOut_262_0;
                          stackIn_263_1 = stackOut_262_1;
                          break L72;
                        } else {
                          stackOut_260_0 = (so) (Object) stackIn_260_0;
                          stackIn_261_0 = stackOut_260_0;
                          stackOut_261_0 = (so) (Object) stackIn_261_0;
                          stackOut_261_1 = 1;
                          stackIn_263_0 = stackOut_261_0;
                          stackIn_263_1 = stackOut_261_1;
                          break L72;
                        }
                      }
                      if (((so) (Object) stackIn_263_0).b(stackIn_263_1 != 0)) {
                        ie.field_Sb = 1;
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L7;
                        }
                      } else {
                        break L1;
                      }
                    }
                    if (!((lc) this).field_g.b(true)) {
                      break L1;
                    } else {
                      L73: {
                        L74: {
                          if (((lc) this).field_l == 8) {
                            break L74;
                          } else {
                            if (si.field_g != 6) {
                              break L73;
                            } else {
                              break L74;
                            }
                          }
                        }
                        ul.a(ud.field_o, (byte) 45, ((lc) this).field_l);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L73;
                        }
                      }
                      if (10 != ((lc) this).field_l) {
                        break L1;
                      } else {
                        ko.a(cd.e(103), (byte) -60);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L75: {
                    stackOut_278_0 = ((lc) this).field_g;
                    stackIn_281_0 = stackOut_278_0;
                    stackIn_279_0 = stackOut_278_0;
                    if (param2) {
                      stackOut_281_0 = (so) (Object) stackIn_281_0;
                      stackOut_281_1 = 0;
                      stackIn_282_0 = stackOut_281_0;
                      stackIn_282_1 = stackOut_281_1;
                      break L75;
                    } else {
                      stackOut_279_0 = (so) (Object) stackIn_279_0;
                      stackIn_280_0 = stackOut_279_0;
                      stackOut_280_0 = (so) (Object) stackIn_280_0;
                      stackOut_280_1 = 1;
                      stackIn_282_0 = stackOut_280_0;
                      stackIn_282_1 = stackOut_280_1;
                      break L75;
                    }
                  }
                  if (((so) (Object) stackIn_282_0).b(stackIn_282_1 == 0)) {
                    break L1;
                  } else {
                    if (this.a((byte) -46, param1)) {
                      L76: {
                        if (si.field_g == 8) {
                          vn.field_g = vn.field_g - 1;
                          if (0 <= vn.field_g) {
                            break L76;
                          } else {
                            vn.field_g = 3;
                            break L76;
                          }
                        } else {
                          break L76;
                        }
                      }
                      L77: {
                        if (si.field_g != 7) {
                          break L77;
                        } else {
                          fh.field_e = fh.field_e - 1;
                          break L77;
                        }
                      }
                      if (14 != si.field_g) {
                        break L1;
                      } else {
                        L78: {
                          var6 = -1 + mj.field_p;
                          if (var6 <= 0) {
                            var6 = 0;
                            if (!param0) {
                              ((lc) this).field_g.field_h = 1;
                              break L78;
                            } else {
                              break L78;
                            }
                          } else {
                            break L78;
                          }
                        }
                        df.a((byte) 120, var6);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (!((lc) this).field_g.b(true)) {
                  break L1;
                } else {
                  if (!this.a((byte) -46, param1)) {
                    break L1;
                  } else {
                    L79: {
                      if (si.field_g == 8) {
                        vn.field_g = vn.field_g + 1;
                        if (vn.field_g > 3) {
                          vn.field_g = 0;
                          break L79;
                        } else {
                          break L79;
                        }
                      } else {
                        break L79;
                      }
                    }
                    L80: {
                      if (si.field_g == 7) {
                        fh.field_e = fh.field_e + 1;
                        break L80;
                      } else {
                        break L80;
                      }
                    }
                    if (14 != si.field_g) {
                      break L1;
                    } else {
                      L81: {
                        var6 = 1 + mj.field_p;
                        if (var6 < 7) {
                          break L81;
                        } else {
                          var6 = 7;
                          if (param0) {
                            break L81;
                          } else {
                            ((lc) this).field_g.field_h = 0;
                            break L81;
                          }
                        }
                      }
                      df.a((byte) -127, var6);
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              if (!((lc) this).field_g.b(true)) {
                break L1;
              } else {
                im.a((byte) 79, cd.e(120));
                if (var9 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            if (((lc) this).field_g.b(true)) {
              df.a((byte) 89, 7);
              if (var9 == 0) {
                break L1;
              } else {
                break L2;
              }
            } else {
              break L1;
            }
          }
          if (((lc) this).field_g.b(true)) {
            var6 = param0 ? 1 : 0;
            gj.a(var6 != 0, true, -1, mn.field_r);
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void a(int param0) {
        Object var2 = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_34_0 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              var3 = null;
              var4 = -32 + 3 * uc.field_a / 4 - -240;
              fe.field_o.c(-(fe.field_o.field_n / 2) + (an.field_f >> -270906271), -(fe.field_o.field_w / 2) + -20 + var4);
              var5 = (an.field_f >> 204869921) + -120;
              if (mj.field_p != 0) {
                break L1;
              } else {
                var2 = (Object) (Object) aj.field_f;
                var3 = (Object) (Object) jo.field_d;
                bb.field_g[0].c(var5 + -28, -48 + var4);
                break L1;
              }
            }
            L2: {
              if (param0 != mj.field_p) {
                break L2;
              } else {
                var2 = (Object) (Object) rj.field_d;
                var3 = (Object) (Object) gm.field_b;
                bb.field_g[1].c(var5 + -28, -32 + var4);
                break L2;
              }
            }
            L3: {
              if (mj.field_p != 2) {
                break L3;
              } else {
                var3 = (Object) (Object) pc.field_f;
                var2 = (Object) (Object) mg.field_F;
                bb.field_g[72].c(-28 + var5, -48 + var4);
                break L3;
              }
            }
            L4: {
              if (3 == mj.field_p) {
                var3 = (Object) (Object) gi.field_h;
                var2 = (Object) (Object) hn.field_c;
                bb.field_g[4].c(var5 + -28, var4);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (mj.field_p == 4) {
                var2 = (Object) (Object) gj.field_b;
                var3 = (Object) (Object) lm.field_h;
                bb.field_g[76].c(-28 + var5, -32 + var4);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (mj.field_p != 5) {
                break L6;
              } else {
                var3 = (Object) (Object) bj.field_pb;
                var2 = (Object) (Object) ih.field_a;
                bb.field_g[75].c(-28 + var5, var4 + -48);
                break L6;
              }
            }
            L7: {
              if (mj.field_p == 6) {
                var2 = (Object) (Object) gn.field_j;
                jb.field_z.field_z = 6050;
                var3 = (Object) (Object) na.field_lc;
                bb.field_g[0].c(var5 - 48, var4);
                bb.field_g[1].c(-8 + var5, var4);
                gb.field_c[5].a(var5 + -(gb.field_c[0].field_g / 2) - 4, -80 + var4);
                gb.field_c[4].a(-4 + (var5 + -(gb.field_c[0].field_g / 2)), -80 + var4);
                gb.field_c[3].a(-(gb.field_c[0].field_g / 2) + (var5 + -4), var4 - 80);
                gb.field_c[2].a(-4 + (var5 - gb.field_c[0].field_g / 2), -80 + var4);
                gb.field_c[1].a(var5 - gb.field_c[0].field_g / 2 + -4, var4 - 80);
                gb.field_c[0].a(-(gb.field_c[0].field_g / 2) + var5 - 16, var4 + -80);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              L9: {
                if (7 != mj.field_p) {
                  break L9;
                } else {
                  var3 = (Object) (Object) kj.field_d;
                  var2 = (Object) (Object) bm.field_c;
                  var6 = 0;
                  var7 = 0;
                  L10: while (true) {
                    stackOut_23_0 = -5;
                    stackOut_23_1 = ~var7;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    L11: while (true) {
                      if (stackIn_24_0 >= stackIn_24_1) {
                        break L9;
                      } else {
                        stackOut_25_0 = 0;
                        stackIn_35_0 = stackOut_25_0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var9 != 0) {
                          break L8;
                        } else {
                          var8 = stackIn_26_0;
                          L12: while (true) {
                            L13: {
                              if (4 <= var8) {
                                break L13;
                              } else {
                                stackOut_28_0 = 0;
                                stackOut_28_1 = ~b.field_f[var6];
                                stackIn_24_0 = stackOut_28_0;
                                stackIn_24_1 = stackOut_28_1;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                if (var9 != 0) {
                                  continue L11;
                                } else {
                                  L14: {
                                    if (stackIn_29_0 != stackIn_29_1) {
                                      bb.field_g[dd.field_f[b.field_f[var6]]].c((-2 + var7) * 40 + var5 - 8, -30 + (var4 + (var8 + -2) * 40));
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var6++;
                                  var8++;
                                  if (var9 == 0) {
                                    continue L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var7++;
                            if (var9 == 0) {
                              continue L10;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_34_0 = var4 + -144;
              stackIn_35_0 = stackOut_34_0;
              break L8;
            }
            L15: {
              var6 = stackIn_35_0;
              if (null == var2) {
                break L15;
              } else {
                int discarded$4 = tj.field_t.a((String) var2, (an.field_f >> -804725599) + -233, var6, 208, 288, 13158, 13158, 1, 0, tj.field_t.field_C - -tj.field_t.field_m);
                int discarded$5 = tj.field_t.a((String) var2, -232 - -(an.field_f >> 1506256577), var6 + -1, 208, 288, 13158, 13158, 1, 0, tj.field_t.field_m + tj.field_t.field_C);
                int discarded$6 = tj.field_t.a((String) var2, (an.field_f >> -985018495) + -232, var6, 208, 288, 12569299, -1, 1, 0, tj.field_t.field_m + tj.field_t.field_C);
                break L15;
              }
            }
            L16: {
              if (var3 != null) {
                int discarded$7 = mi.field_B.a((String) var3, 16 + (an.field_f >> -781556319) + 8, var6, 224, 288, 0, -1, 1, 0, mi.field_B.field_m + mi.field_B.field_C);
                break L16;
              } else {
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw aa.a((Throwable) var2, "lc.E(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        boolean[] var2 = null;
        int[][][] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
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
        String[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        qb stackIn_26_0 = null;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        qb stackOut_25_0 = null;
        qb stackOut_24_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        boolean stackOut_32_0 = false;
        int stackOut_58_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        L0: {
          var24 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, false, true, false, true, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, true, true, true, true, false, true, false, true, false, false, false, true, true, true, param0, true, true, true, false, false, false};
          if (lk.a(0, (byte) -116)) {
            var2[55] = false;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = new int[][][]{new int[6][], new int[6][], new int[6][], new int[6][]};
          var4 = ad.field_f;
          if (2 <= var4.length) {
            break L1;
          } else {
            var4 = new int[2];
            var4[0] = ad.field_f[0];
            var4[1] = 0;
            break L1;
          }
        }
        L2: {
          L3: {
            var5 = lk.a(0, (byte) -33) ? 1 : 0;
            if ((65536 & var4[1]) != 0) {
              break L3;
            } else {
              var3[1][5] = new int[1];
              if (var5 != 0) {
                break L2;
              } else {
                if ((8388608 & var4[1]) != 0) {
                  break L2;
                } else {
                  var3[1][5] = new int[0];
                  if (var24 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
          }
          if (var5 != 0) {
            break L2;
          } else {
            if ((8388608 & var4[1]) == 0) {
              var3[1][5] = new int[1];
              break L2;
            } else {
              break L2;
            }
          }
        }
        L4: {
          if ((134217728 & var4[2]) != 0) {
            break L4;
          } else {
            var3[3] = new int[5][];
            break L4;
          }
        }
        L5: {
          if ((8388608 & var4[2]) == 0) {
            var3[1][0] = new int[2];
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var6 = 80;
          var7 = 100;
          if (ArcanistsMulti.i((byte) -127)) {
            stackOut_25_0 = ii.field_d;
            stackIn_26_0 = stackOut_25_0;
            break L6;
          } else {
            stackOut_24_0 = vd.field_b;
            stackIn_26_0 = stackOut_24_0;
            break L6;
          }
        }
        var8 = stackIn_26_0;
        var9 = 60;
        var10 = 280;
        var11 = 60;
        var12 = 220;
        var13 = dd.field_g;
        dd.field_g = -1;
        var14 = vn.field_g;
        var15 = 0;
        L7: while (true) {
          stackOut_27_0 = var3[var14].length;
          stackIn_28_0 = stackOut_27_0;
          L8: while (true) {
            L9: {
              L10: {
                if (stackIn_28_0 <= var15) {
                  break L10;
                } else {
                  var7 = var9 - (-(var10 * (1 + var15) / (var3[var14].length - -1)) - uc.field_a);
                  stackOut_29_0 = 0;
                  stackIn_59_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (var24 != 0) {
                    break L9;
                  } else {
                    var16 = stackIn_30_0;
                    L11: while (true) {
                      L12: {
                        if (var3[var14][var15].length <= var16) {
                          break L12;
                        } else {
                          var17 = var3[var14][var15][var16];
                          var6 = bi.field_I + var11 + var12 * (1 + var16) / (1 + var3[var14][var15].length);
                          stackOut_32_0 = mi.a(32, var7, 32, -8, var6);
                          stackIn_28_0 = stackOut_32_0 ? 1 : 0;
                          stackIn_33_0 = stackOut_32_0;
                          if (var24 != 0) {
                            continue L8;
                          } else {
                            L13: {
                              if (stackIn_33_0) {
                                dd.field_g = var17;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              L15: {
                                if (0 != (var4[var17 >> -1553004731] & 1 << (var17 & 31))) {
                                  break L15;
                                } else {
                                  L16: {
                                    if (~var17 == ~ke.field_K) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (var17 != var13) {
                                          break L17;
                                        } else {
                                          var8.f(var6 + 1, var7 - 1);
                                          if (var24 == 0) {
                                            break L14;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      var8.f(var6, var7);
                                      if (var24 == 0) {
                                        break L14;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  var8.f(var6 - -2, var7 - 2);
                                  if (var24 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L18: {
                                if (~var17 == ~ke.field_K) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (var17 != var13) {
                                      break L19;
                                    } else {
                                      mo.field_a[var17].f(1 + var6, var7 + -1);
                                      if (var24 == 0) {
                                        break L14;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  mo.field_a[var17].f(var6, var7);
                                  if (var24 == 0) {
                                    break L14;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              mo.field_a[var17].f(2 + var6, -2 + var7);
                              break L14;
                            }
                            var16++;
                            if (var24 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var15++;
                      if (var24 == 0) {
                        continue L7;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              }
              stackOut_58_0 = -1;
              stackIn_59_0 = stackOut_58_0;
              break L9;
            }
            L20: {
              if (stackIn_59_0 != ke.field_K) {
                stackOut_61_0 = ke.field_K;
                stackIn_62_0 = stackOut_61_0;
                break L20;
              } else {
                stackOut_60_0 = dd.field_g;
                stackIn_62_0 = stackOut_60_0;
                break L20;
              }
            }
            L21: {
              L22: {
                L23: {
                  var15 = stackIn_62_0;
                  if (-1 != var15) {
                    break L23;
                  } else {
                    int discarded$2 = mi.field_B.a(qo.field_c, -16 + (bi.field_I - -320) - -50, 134 + uc.field_a, 200, 64, 0, -1, 1, 1, mi.field_B.field_C);
                    if (lc.a((byte) 112)) {
                      int discarded$3 = mi.field_B.a(hg.field_c, -16 + (50 + bi.field_I) + 320, -16 + (250 + uc.field_a), 200, 64, 0, -1, 1, 1, mi.field_B.field_C);
                      if (var24 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    } else {
                      break L22;
                    }
                  }
                }
                L24: {
                  var16 = tj.field_t.field_o + tj.field_t.field_m;
                  mi.field_B.b(rb.field_n[var15], 447 + bi.field_I, uc.field_a + 126, 0, -1);
                  if ((var4[var15 >> -1047223579] & 1 << (31 & var15)) == 0) {
                    stackOut_69_0 = 0;
                    stackIn_70_0 = stackOut_69_0;
                    break L24;
                  } else {
                    stackOut_68_0 = 1;
                    stackIn_70_0 = stackOut_68_0;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    var17 = stackIn_70_0;
                    if (var17 != 0) {
                      break L26;
                    } else {
                      mi.field_B.b(ld.field_l, bi.field_I + 447, var16 + uc.field_a - -118, 16711680, -1);
                      if (var24 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  mi.field_B.b(rk.field_H, bi.field_I - -447, -8 + uc.field_a + (126 + var16), 0, -1);
                  break L25;
                }
                L27: {
                  L28: {
                    var18 = 126 - -var16;
                    if (var17 != 0) {
                      break L28;
                    } else {
                      vd.field_b.c(340 + bi.field_I, var18 + uc.field_a);
                      if (var24 == 0) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  mo.field_a[var15].c(340 + bi.field_I, var18 + uc.field_a);
                  break L27;
                }
                L29: {
                  L30: {
                    var18 = var18 + tj.field_t.field_C;
                    var18 = var18 + tj.field_t.field_C;
                    if (var17 != 0) {
                      break L30;
                    } else {
                      if (var2[var15]) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  var19 = new String[16];
                  var20 = mi.field_B.a(af.field_Bb[var15], new int[1], var19);
                  var21 = 0;
                  L31: while (true) {
                    L32: {
                      L33: {
                        if (var20 <= var21) {
                          break L33;
                        } else {
                          mi.field_B.a(var19[var21], 340 + (bi.field_I - -12), -8 + (uc.field_a + var18) - -120, 0, -1);
                          var18 = var18 + mi.field_B.field_C;
                          var21++;
                          if (var24 != 0) {
                            break L32;
                          } else {
                            if (var24 == 0) {
                              continue L31;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      mi.field_B.b(lo.field_x, bi.field_I - -530, uc.field_a + 170, 0, -1);
                      mi.field_B.b("" + 100 * eh.field_g[var15], bi.field_I + 530, 185 + uc.field_a, 0, -1);
                      mi.field_B.b(uk.field_c, 530 + bi.field_I, uc.field_a + 220, 0, -1);
                      var21 = 514;
                      break L32;
                    }
                    L34: {
                      var22 = 224;
                      if (10 == eh.field_g[var15]) {
                        var21 -= 24;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    var23 = 0;
                    L35: while (true) {
                      L36: {
                        if (var23 >= eh.field_g[var15]) {
                          break L36;
                        } else {
                          ih.field_e.c(var21 + bi.field_I, var22 + uc.field_a);
                          if (var24 != 0) {
                            break L21;
                          } else {
                            L37: {
                              if (eh.field_g[var15] != 10) {
                                break L37;
                              } else {
                                ih.field_e.c(var21 + bi.field_I - -32, uc.field_a + var22);
                                break L37;
                              }
                            }
                            L38: {
                              var21 -= 8;
                              if (0 != var23 % 3) {
                                break L38;
                              } else {
                                var21 += 16;
                                break L38;
                              }
                            }
                            var22 += 8;
                            if (var23 == 4) {
                              break L36;
                            } else {
                              var23++;
                              if (var24 == 0) {
                                continue L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                      }
                      if (var24 == 0) {
                        break L22;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                var19 = new String[16];
                var20 = mi.field_B.a(wk.field_k, new int[1], var19);
                var21 = 0;
                L39: while (true) {
                  if (var20 <= var21) {
                    break L22;
                  } else {
                    mi.field_B.a(var19[var21], 12 + (340 + bi.field_I), 95 + uc.field_a - -var18, 0, -1);
                    var18 = var18 + mi.field_B.field_C;
                    var21++;
                    if (var24 != 0) {
                      break L21;
                    } else {
                      if (var24 == 0) {
                        continue L39;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
              }
              mi.field_B.a(var14 + 1 + "/" + 4, bi.field_I + 285, uc.field_a - -325, 0, -1);
              break L21;
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              de.a(param1 + -4, param0 + -4, 248, 127, 0);
              de.a(param1 - 3, -3 + param0, 246, 125, 8547138);
              if (param2 <= -27) {
                break L1;
              } else {
                ((lc) this).field_f = 0.4045710406434804;
                break L1;
              }
            }
            L2: {
              L3: {
                de.a(-2 + param1, param0 - 2, 244, 123, 11833896);
                de.a(param1 + -1, param0 + -1, 242, 121, 0);
                de.c(param1, param0, 240, 119, wm.a(param3, (byte) -122), ng.b((byte) -37, param3));
                if (e.field_M[param3] == null) {
                  break L3;
                } else {
                  e.field_M[param3].c(param1, param0);
                  if (!ArcanistsMulti.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ue.field_d.field_f = 0;
              e.field_M[param3] = af.a(tj.a(-46, new String[1], "background<%0>"), "", 19412, ue.field_d);
              e.field_M[param3].c(param1, param0);
              e.field_M[param3] = null;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "lc.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!ArcanistsMulti.i((byte) -73)) {
              L1: {
                var2_int = 80;
                if (gm.field_f == 3) {
                  var2_int += 20;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = an.field_f - var2_int;
              de.a(-3 + var3, 3, var2_int, 48, 0);
              de.a(var3 - 2, 2, var2_int, 48, 6837813);
              de.a(-1 + var3, 1, var2_int, 48, 8547138);
              de.a(var3, 0, var2_int, 48, 11768360);
              de.d(1 + var3, -1, var2_int, 48, 0);
              var4 = jf.field_j + -ua.field_P;
              if (param0 == -26733) {
                L2: {
                  L3: {
                    if (var4 < 5) {
                      break L3;
                    } else {
                      L4: {
                        tg.field_b[8].a(10 + (var3 + -4), 8);
                        if (var4 <= 5) {
                          break L4;
                        } else {
                          mi.field_B.a('+', 17 + var3, 30, 16711935);
                          break L4;
                        }
                      }
                      L5: {
                        if (ad.field_d <= 0) {
                          break L5;
                        } else {
                          rb.field_o[-1 + ad.field_d].d(23 + var3, -(rb.field_o[ad.field_d + -1].field_y / 2) + (33 - rb.field_o[-1 + ad.field_d].field_o), 16711680);
                          int discarded$7 = mi.field_B.a(mh.field_I + var4, var3 + 23, 4, -30 + var2_int, 44, 16777215, -1, 2, 1, 14);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      int discarded$8 = mi.field_B.a(mh.field_I + var4, 23 + var3, 4, var2_int + -30, 44, 16777215, -1, 1, 1, 14);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L6: {
                    if (0 < var4) {
                      break L6;
                    } else {
                      L7: {
                        if (ad.field_d > 0) {
                          break L7;
                        } else {
                          int discarded$9 = mi.field_B.a(jl.field_l, 5 + var3, 4, -10 + var2_int, 44, 16777215, -1, 1, 1, 14);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        var5 = 19;
                        if (gm.field_f == 3) {
                          var5 -= 7;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      rb.field_o[-1 + ad.field_d].d(var3 - -23, -(rb.field_o[ad.field_d - 1].field_y / 2) + -rb.field_o[-1 + ad.field_d].field_o + var5, 16711680);
                      int discarded$10 = mi.field_B.a(jl.field_l, var3 - -5, 4, -10 + var2_int, 38, 16777215, -1, 1, 2, 14);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L9: {
                    if (4 != (4 & var4)) {
                      break L9;
                    } else {
                      tg.field_b[7].a(10 + (var3 - 5), 6);
                      tg.field_b[7].a(15 + var3, 6);
                      tg.field_b[7].a(-3 + (10 + var3), 10);
                      tg.field_b[7].a(3 + (var3 + 10), 10);
                      break L9;
                    }
                  }
                  L10: {
                    if ((var4 & 2) == 2) {
                      tg.field_b[7].a(10 + (var3 + -5), 8);
                      tg.field_b[7].a(var3 + 15, 8);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if ((var4 & 1) == 1) {
                      tg.field_b[7].a(var3 - -10, 8);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (ad.field_d <= 0) {
                      break L12;
                    } else {
                      rb.field_o[-1 + ad.field_d].d(var3 + 23, -(rb.field_o[-1 + ad.field_d].field_y / 2) + (-rb.field_o[-1 + ad.field_d].field_o + 33), 16711680);
                      int discarded$11 = mi.field_B.a(mh.field_I + var4, var3 + 23, 4, 50, 44, 16777215, -1, 2, 1, 14);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (ad.field_d <= 0) {
                      break L13;
                    } else {
                      rb.field_o[-1 + ad.field_d].d(var3 - -23, -(rb.field_o[ad.field_d - 1].field_y / 2) + -rb.field_o[ad.field_d - 1].field_o + 33, 16711680);
                      int discarded$12 = mi.field_B.a(mh.field_I + var4, var3 - -23, 4, -30 + var2_int, 44, 16777215, -1, 2, 1, 14);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L13;
                      }
                    }
                  }
                  int discarded$13 = mi.field_B.a(mh.field_I + var4, var3 + 25, 4, var2_int - 30, 44, 16777215, -1, 1, 1, 14);
                  break L2;
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "lc.T(" + param0 + ')');
        }
    }

    private final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 41) {
                break L1;
              } else {
                this.g(-83);
                break L1;
              }
            }
            stackOut_3_0 = this.b(param1, param0 + 159) + bi.field_I;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.KA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 >= 75) {
              stackOut_3_0 = 30;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -10;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.NA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void h(int param0) {
        le var2 = null;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int var10_int = 0;
        int[] var10 = null;
        int[] var11 = null;
        qb[][] var12 = null;
        double[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        String var20_ref_String = null;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_80_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        L0: {
          var27 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = jb.field_z;
          if (var2 != null) {
            break L0;
          } else {
            var2 = r.field_b;
            break L0;
          }
        }
        var3 = var2.field_V.s(0);
        var6 = an.field_f / 2;
        var7 = an.field_j / 2;
        var8_int = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var8_int >= 300) {
                break L3;
              } else {
                var4 = 3.141592653589793 * (double)var8_int * 2.0 / 300.0;
                var9_int = var6 - -(int)(Math.sin(var4) * 240.0);
                var10_int = var7 + (int)(Math.cos(var4) * 160.0);
                de.c(var9_int, var10_int, 8, 0);
                var8_int++;
                if (var27 != 0) {
                  break L2;
                } else {
                  if (var27 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var8_int = 0;
            break L2;
          }
          L4: while (true) {
            L5: {
              L6: {
                if (var8_int >= 300) {
                  break L6;
                } else {
                  var4 = 2.0 * ((double)var8_int * 3.141592653589793) / 300.0;
                  var9_int = var6 - -(int)(240.0 * Math.sin(var4));
                  var10_int = (int)(Math.cos(var4) * 160.0) + var7;
                  de.i(var9_int, var10_int, 7, 7891535);
                  var8_int++;
                  if (var27 != 0) {
                    break L5;
                  } else {
                    if (var27 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var8_int = 0;
              break L5;
            }
            L7: while (true) {
              L8: {
                L9: {
                  if (var8_int >= 300) {
                    break L9;
                  } else {
                    var4 = 2.0 * (3.141592653589793 * (double)var8_int) / 300.0;
                    var9_int = (int)(Math.sin(var4) * 239.0) + var6;
                    var10_int = (int)(160.0 * Math.cos(var4)) + var7;
                    de.i(var9_int, -1 + var10_int, 4, 11510925);
                    var8_int++;
                    if (var27 != 0) {
                      break L8;
                    } else {
                      if (var27 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                de.a();
                break L8;
              }
              L10: {
                var8 = new int[]{255, 0, 0};
                if (param0 == 32) {
                  break L10;
                } else {
                  ((lc) this).field_n = -74;
                  break L10;
                }
              }
              var9 = new int[]{0, 255, 0};
              var10 = new int[]{0, 0, 255};
              var11 = new int[]{255, 255, 255};
              var12 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
              var13 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
              var14 = 0;
              L11: while (true) {
                stackOut_21_0 = var3;
                stackOut_21_1 = var14;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                L12: while (true) {
                  L13: {
                    L14: {
                      if (stackIn_22_0 <= stackIn_22_1) {
                        break L14;
                      } else {
                        var4 = 3.141592653589793 * var13[var14];
                        var15 = var6 - -(int)(240.0 * Math.sin(var4));
                        var16 = uc.field_a * 3 / 4 - (-240 - (int)(140.0 * Math.cos(var4)));
                        var17 = nj.field_n[var14];
                        if (var27 != 0) {
                          break L13;
                        } else {
                          var18 = -32;
                          L15: while (true) {
                            L16: {
                              L17: {
                                if (var18 >= 32) {
                                  break L17;
                                } else {
                                  de.h(0, var16 + var18, an.field_f, var18 + var16 - -8);
                                  de.i(var15, -(var18 / 2) + var16, 32, 7891535);
                                  de.c(var15, -(var18 / 2) + var16, 32, 0);
                                  var18++;
                                  if (var27 != 0) {
                                    break L16;
                                  } else {
                                    if (var27 == 0) {
                                      continue L15;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                              var18 = -32;
                              break L16;
                            }
                            L18: while (true) {
                              L19: {
                                L20: {
                                  if (32 <= var18) {
                                    break L20;
                                  } else {
                                    de.h(0, var18 + var16, an.field_f, 8 + (var18 + var16));
                                    de.i(var15, -4 + -(var18 / 2) + var16, 28, 13484723);
                                    de.c(var15, -4 + -(var18 / 2) + var16, 28, 0);
                                    var18++;
                                    if (var27 != 0) {
                                      break L19;
                                    } else {
                                      if (var27 == 0) {
                                        continue L18;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                de.a();
                                var18 = -5 + var7;
                                break L19;
                              }
                              L21: {
                                L22: {
                                  var19 = ae.field_d;
                                  if (var2.field_I == var2.field_V.d(false)) {
                                    break L22;
                                  } else {
                                    var19 = qe.field_s;
                                    if (var27 == 0) {
                                      break L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                if (250 <= o.field_s) {
                                  break L21;
                                } else {
                                  var20_ref_String = Integer.toString(5 + -((o.field_s - 1) / 50));
                                  tj.field_t.b(var20_ref_String, var6 + -1, var18 + 64, 0, 0);
                                  tj.field_t.b(var20_ref_String, var6, var18 + 64 - 1, 0, 0);
                                  tj.field_t.b(var20_ref_String, var6, var18 - -64, 16777215, -1);
                                  break L21;
                                }
                              }
                              L23: {
                                int discarded$7 = mi.field_B.a(var19, var6 - 128 - 1, -1 + var18, 256, 64, 0, -1, 1, 0, 14);
                                int discarded$8 = mi.field_B.a(var19, -129 + var6, var18 + 1, 256, 64, 0, -1, 1, 0, 14);
                                int discarded$9 = mi.field_B.a(var19, var6 - 128 + 1, 1 + var18, 256, 64, 0, -1, 1, 0, 14);
                                int discarded$10 = mi.field_B.a(var19, 1 + (var6 - 128), -1 + var18, 256, 64, 0, -1, 1, 0, 14);
                                int discarded$11 = mi.field_B.a(var19, -1 + (var6 - 128), var18, 256, 64, 0, 0, 1, 0, 14);
                                int discarded$12 = mi.field_B.a(var19, var6 + -128, var18 + -1, 256, 64, 0, 0, 1, 0, 14);
                                var16 -= 64;
                                var15 -= 32;
                                int discarded$13 = mi.field_B.a(var19, -128 + var6, var18, 256, 64, 16777215, -1, 1, 0, 14);
                                var20 = 0;
                                if (~var14 == ~(jb.field_v / 50 % var3)) {
                                  var20 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(jb.field_v % 50) / 50.0));
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                var8[0] = var2.field_V.field_N[var14][0];
                                var8[1] = var2.field_V.field_N[var14][1];
                                var8[2] = var2.field_V.field_N[var14][2];
                                var9[0] = var2.field_V.field_N[var14][3];
                                var9[1] = var2.field_V.field_N[var14][4];
                                var9[2] = var2.field_V.field_N[var14][5];
                                var10[0] = var2.field_V.field_N[var14][6];
                                var10[1] = var2.field_V.field_N[var14][7];
                                var10[2] = var2.field_V.field_N[var14][8];
                                var11[0] = var2.field_V.field_N[var14][9];
                                var11[1] = var2.field_V.field_N[var14][10];
                                var11[2] = var2.field_V.field_N[var14][11];
                                pc.a(var10, var16 - 2, var11, var8, (byte) -101, var9, var12[8][0], var15);
                                pc.a(var10, var16 + var20, var11, var8, (byte) 34, var9, var12[3][var2.field_V.field_N[var14][15]], var15 + 12);
                                pc.a(var10, var16, var11, var8, (byte) 56, var9, var12[1][var2.field_V.field_N[var14][12]], var15);
                                pc.a(var10, var16 + 2, var11, var8, (byte) 39, var9, var12[7][0], var15);
                                pc.a(var10, -40 + var16 - -16, var11, var8, (byte) -121, var9, var12[0][var2.field_V.field_N[var14][13]], var15);
                                pc.a(var10, -8 + var16, var11, var8, (byte) 37, var9, var12[4][var2.field_V.field_N[var14][17]], var15);
                                if (53 == var2.field_V.field_N[var14][17]) {
                                  break L24;
                                } else {
                                  if (55 == var2.field_V.field_N[var14][17]) {
                                    break L24;
                                  } else {
                                    pc.a(var10, -40 + var16 - -32, var11, var8, (byte) -118, var9, var12[6][var14], var15);
                                    break L24;
                                  }
                                }
                              }
                              pc.a(var10, 16 + var16 + -40, var11, var8, (byte) -105, var9, var12[5][var2.field_V.field_N[var14][16]], var15);
                              pc.a(var10, var20 - -var16, var11, var8, (byte) 118, var9, var12[2][var2.field_V.field_N[var14][14]], -12 + var15);
                              var15 += 32;
                              var16 += 64;
                              var21 = var2.field_V.field_k[var14];
                              var16 += 16;
                              var22 = mi.field_B.b("Wmmmmmmmmmmm");
                              var15 = var15 - (var22 / 2 + 7);
                              var23 = 15 + var22;
                              de.c(var15 + 3, -8 + (var16 - -3), -6 + var23, 15, var17, (8421504 | var17) ^ 8421504);
                              de.h(var15 - -3, -8 + var16 + 3, 3 + var15 + (var23 + -6), -10 + var16 - -20);
                              L25: while (true) {
                                L26: {
                                  L27: {
                                    if (0 >= var23) {
                                      break L27;
                                    } else {
                                      var23 = var23 - g.field_a.field_n;
                                      g.field_a.b(3 + var15 + var23, -10 + (3 + (-8 + var16)), 64);
                                      if (var27 != 0) {
                                        break L26;
                                      } else {
                                        if (var27 == 0) {
                                          continue L25;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                  de.a();
                                  var23 = var22 + 15;
                                  de.a(var15, -8 + var16, var23, 21, 6, 0);
                                  de.a(var15 + 2, -8 + (var16 - -2), -4 + var23, 17, 4, 0);
                                  de.a(var15 + 1, -8 + (var16 + 1), -2 + var23, 19, 6, 16777215);
                                  de.a(2 + var15, var16 - -2 - 8, -4 + var23, 17, 6, 0);
                                  var15 = var15 + (7 + var22 / 2);
                                  mi.field_B.b(var21, -1 + var15, 1 + var16 + mi.field_B.field_C / 2, 0, 0);
                                  mi.field_B.b(var21, var15, -1 + (var16 - (-1 + -(mi.field_B.field_C / 2))), 0, 0);
                                  mi.field_B.b(var21, var15, mi.field_B.field_C / 2 + (1 + var16), 16777215, -1);
                                  var16 -= 20;
                                  var15 -= 40;
                                  var16 -= 10;
                                  var23 = 1;
                                  break L26;
                                }
                                var24 = var2.field_V.e(3, var14);
                                var25 = 0;
                                L28: while (true) {
                                  L29: {
                                    if (var25 >= 16) {
                                      break L29;
                                    } else {
                                      var26 = var24[var25];
                                      stackOut_56_0 = ~var26;
                                      stackOut_56_1 = -13;
                                      stackIn_22_0 = stackOut_56_0;
                                      stackIn_22_1 = stackOut_56_1;
                                      stackIn_57_0 = stackOut_56_0;
                                      stackIn_57_1 = stackOut_56_1;
                                      if (var27 != 0) {
                                        continue L12;
                                      } else {
                                        L30: {
                                          if (stackIn_57_0 > stackIn_57_1) {
                                            break L30;
                                          } else {
                                            if ((-12 + var26) % 12 >= 10) {
                                              if (var26 < 0) {
                                                break L30;
                                              } else {
                                                L31: {
                                                  if ((-6 + var26) / 12 != 0) {
                                                    break L31;
                                                  } else {
                                                    de.c(var15 - -10, 10 + var16, 10, 8912896, 256);
                                                    break L31;
                                                  }
                                                }
                                                L32: {
                                                  if ((var26 - 6) / 12 != 1) {
                                                    break L32;
                                                  } else {
                                                    de.c(10 + var15, 10 + var16, 10, 8404992, 256);
                                                    break L32;
                                                  }
                                                }
                                                L33: {
                                                  if ((var26 - 6) / 12 == 2) {
                                                    de.c(10 + var15, 10 + var16, 10, 8947712, 256);
                                                    break L33;
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                                L34: {
                                                  if ((-6 + var26) / 12 != 3) {
                                                    break L34;
                                                  } else {
                                                    de.c(10 + var15, 10 + var16, 10, 34952, 256);
                                                    break L34;
                                                  }
                                                }
                                                L35: {
                                                  if (4 == (-6 + var26) / 12) {
                                                    de.c(var15 - -10, 10 + var16, 10, 8947848, 256);
                                                    break L35;
                                                  } else {
                                                    break L35;
                                                  }
                                                }
                                                L36: {
                                                  if (5 != (-6 + var26) / 12) {
                                                    break L36;
                                                  } else {
                                                    de.c(10 + var15, var16 - -10, 10, 65280, 256);
                                                    break L36;
                                                  }
                                                }
                                                L37: {
                                                  gn.a(10, (byte) 99, 256, var15 + 10, var16 + 10);
                                                  if (var23 != 0) {
                                                    stackOut_79_0 = 0;
                                                    stackIn_80_0 = stackOut_79_0;
                                                    break L37;
                                                  } else {
                                                    stackOut_78_0 = 1;
                                                    stackIn_80_0 = stackOut_78_0;
                                                    break L37;
                                                  }
                                                }
                                                L38: {
                                                  var23 = stackIn_80_0;
                                                  bb.field_g[dd.field_f[var26]].b(var15, var16);
                                                  if (var23 != 0) {
                                                    break L38;
                                                  } else {
                                                    var15 += 20;
                                                    if (var27 == 0) {
                                                      break L30;
                                                    } else {
                                                      break L38;
                                                    }
                                                  }
                                                }
                                                var15 -= 20;
                                                var16 -= 20;
                                                break L30;
                                              }
                                            } else {
                                              break L30;
                                            }
                                          }
                                        }
                                        var25++;
                                        if (var27 == 0) {
                                          continue L28;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                  }
                                  var14++;
                                  if (var27 == 0) {
                                    continue L11;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L13;
                  }
                  return;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0) {
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int[] var9 = null;
        int var10_int = 0;
        int[] var10 = null;
        int var11_int = 0;
        int[] var11 = null;
        int[] var12 = null;
        qb[][] var13 = null;
        StringBuilder var14 = null;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        Object var29 = null;
        int var30 = 0;
        qb var31 = null;
        int var32 = 0;
        int var33 = 0;
        int stackIn_62_0 = 0;
        int[] stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int[] stackIn_98_2 = null;
        int[] stackIn_98_3 = null;
        int stackIn_98_4 = 0;
        int[] stackIn_98_5 = null;
        qb[] stackIn_98_6 = null;
        int[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int[] stackIn_99_2 = null;
        int[] stackIn_99_3 = null;
        int stackIn_99_4 = 0;
        int[] stackIn_99_5 = null;
        qb[] stackIn_99_6 = null;
        int[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int[] stackIn_100_2 = null;
        int[] stackIn_100_3 = null;
        int stackIn_100_4 = 0;
        int[] stackIn_100_5 = null;
        qb[] stackIn_100_6 = null;
        int[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int[] stackIn_101_2 = null;
        int[] stackIn_101_3 = null;
        int stackIn_101_4 = 0;
        int[] stackIn_101_5 = null;
        qb[] stackIn_101_6 = null;
        int stackIn_101_7 = 0;
        StringBuilder stackIn_118_0 = null;
        StringBuilder stackIn_119_0 = null;
        StringBuilder stackIn_120_0 = null;
        StringBuilder stackIn_121_0 = null;
        String stackIn_121_1 = null;
        StringBuilder stackIn_122_0 = null;
        StringBuilder stackIn_123_0 = null;
        StringBuilder stackIn_124_0 = null;
        String stackIn_124_1 = null;
        int stackIn_136_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int[] stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int[] stackOut_97_2 = null;
        int[] stackOut_97_3 = null;
        int stackOut_97_4 = 0;
        int[] stackOut_97_5 = null;
        qb[] stackOut_97_6 = null;
        int[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int[] stackOut_100_2 = null;
        int[] stackOut_100_3 = null;
        int stackOut_100_4 = 0;
        int[] stackOut_100_5 = null;
        qb[] stackOut_100_6 = null;
        int stackOut_100_7 = 0;
        int[] stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int[] stackOut_98_2 = null;
        int[] stackOut_98_3 = null;
        int stackOut_98_4 = 0;
        int[] stackOut_98_5 = null;
        qb[] stackOut_98_6 = null;
        int[] stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int[] stackOut_99_2 = null;
        int[] stackOut_99_3 = null;
        int stackOut_99_4 = 0;
        int[] stackOut_99_5 = null;
        qb[] stackOut_99_6 = null;
        int stackOut_99_7 = 0;
        StringBuilder stackOut_117_0 = null;
        StringBuilder stackOut_120_0 = null;
        String stackOut_120_1 = null;
        StringBuilder stackOut_118_0 = null;
        StringBuilder stackOut_119_0 = null;
        String stackOut_119_1 = null;
        StringBuilder stackOut_121_0 = null;
        StringBuilder stackOut_123_0 = null;
        String stackOut_123_1 = null;
        StringBuilder stackOut_122_0 = null;
        String stackOut_122_1 = null;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        L0: {
          var33 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = jb.field_z;
          if (var2 == null) {
            var2 = r.field_b;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = var2.field_V.s(0);
          var4 = var2.field_V.d(false);
          if (0 <= var4) {
            if (!var2.field_V.field_d) {
              break L1;
            } else {
              var4 = var4 & 1;
              break L1;
            }
          } else {
            break L1;
          }
        }
        var7 = an.field_f / 2;
        var8 = an.field_j / 2;
        var9_int = 0;
        L2: while (true) {
          L3: {
            L4: {
              if (var9_int >= 300) {
                break L4;
              } else {
                var5 = (double)var9_int * 3.141592653589793 * 2.0 / 300.0;
                var10_int = var7 - -(int)(Math.sin(var5) * 240.0);
                var11_int = var8 + (int)(160.0 * Math.cos(var5));
                de.c(var10_int, var11_int, 8, 0);
                var9_int++;
                if (var33 != 0) {
                  break L3;
                } else {
                  if (var33 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            var9_int = 0;
            break L3;
          }
          L5: while (true) {
            L6: {
              L7: {
                if (300 <= var9_int) {
                  break L7;
                } else {
                  var5 = 3.141592653589793 * (double)var9_int * 2.0 / 300.0;
                  var10_int = (int)(240.0 * Math.sin(var5)) + var7;
                  var11_int = var8 - -(int)(Math.cos(var5) * 160.0);
                  de.i(var10_int, var11_int, 7, 7891535);
                  var9_int++;
                  if (var33 != 0) {
                    break L6;
                  } else {
                    if (var33 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              var9_int = 0;
              break L6;
            }
            L8: while (true) {
              L9: {
                L10: {
                  if (300 <= var9_int) {
                    break L10;
                  } else {
                    var5 = (double)var9_int * 3.141592653589793 * 2.0 / 300.0;
                    var10_int = (int)(239.0 * Math.sin(var5)) + var7;
                    var11_int = var8 - -(int)(Math.cos(var5) * 160.0);
                    de.i(var10_int, -1 + var11_int, 4, 11510925);
                    var9_int++;
                    if (var33 != 0) {
                      break L9;
                    } else {
                      if (var33 == 0) {
                        continue L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                de.a();
                break L9;
              }
              L11: {
                var9 = new int[]{255, 0, 0};
                var10 = new int[]{0, 255, 0};
                var11 = new int[]{0, 0, 255};
                var12 = new int[]{255, 255, 255};
                var13 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                var14 = new StringBuilder(20);
                if (null == var2.field_w) {
                  break L11;
                } else {
                  var2.field_V = var2.field_w;
                  break L11;
                }
              }
              L12: {
                L13: {
                  if (var4 >= 0) {
                    break L13;
                  } else {
                    L14: {
                      if (-2 == var4) {
                        break L14;
                      } else {
                        StringBuilder discarded$29 = var14.append(th.field_a);
                        if (var33 == 0) {
                          break L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                    StringBuilder discarded$30 = var14.append(ff.field_d);
                    if (var33 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                L15: {
                  if (var2.field_V.field_d) {
                    break L15;
                  } else {
                    StringBuilder discarded$31 = var14.append(rn.field_K + var2.field_V.field_k[var4] + "<br><br>");
                    if (var33 == 0) {
                      break L12;
                    } else {
                      break L15;
                    }
                  }
                }
                L16: {
                  if (0 != var4) {
                    break L16;
                  } else {
                    StringBuilder discarded$32 = var14.append(rn.field_K + b.field_d + "<br><br>");
                    break L16;
                  }
                }
                if (1 != var4) {
                  break L12;
                } else {
                  StringBuilder discarded$33 = var14.append(rn.field_K + cn.field_I + "<br><br>");
                  break L12;
                }
              }
              L17: {
                L18: {
                  var15 = var14.toString();
                  if (var2.field_V.d(1)) {
                    break L18;
                  } else {
                    var15 = nj.field_b;
                    if (var33 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                var16 = 0;
                int incrementValue$34 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$34, lo.field_v);
                int incrementValue$35 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$35, tm.field_e);
                int incrementValue$36 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$36, qa.field_p);
                int incrementValue$37 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$37, ej.field_N);
                int incrementValue$38 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$38, tl.field_e);
                int incrementValue$39 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$39, be.field_a);
                int incrementValue$40 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$40, q.field_J);
                int incrementValue$41 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$41, wk.field_h);
                int incrementValue$42 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$42, ed.field_Eb);
                int incrementValue$43 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$43, ob.field_X);
                int incrementValue$44 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$44, ao.field_a);
                int incrementValue$45 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$45, co.field_b);
                int incrementValue$46 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$46, gi.field_i);
                int incrementValue$47 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$47, nj.field_i);
                int incrementValue$48 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$48, rk.field_S);
                int incrementValue$49 = var16;
                var16++;
                var15 = lk.a(var15, 10, incrementValue$49, gk.field_a);
                if (lk.a(0, (byte) -36)) {
                  int incrementValue$50 = var16;
                  var16++;
                  var15 = lk.a(var15, 10, incrementValue$50, lj.field_q);
                  break L17;
                } else {
                  break L17;
                }
              }
              var16 = 128 + 14 * mi.field_B.a(var15, 256);
              var17 = jb.field_v / 3 % var16 - 128;
              var18 = uc.field_a + 180;
              de.h(0, var18, an.field_f, 128 + var18);
              int discarded$51 = mi.field_B.a(var15, -128 + var7 - 1, -var17 + -1 + var18, 256, 256, 0, -1, 1, 0, 14);
              int discarded$52 = mi.field_B.a(var15, var7 + -129, -var17 + var18 + 1, 256, 256, 0, -1, 1, 0, 14);
              int discarded$53 = mi.field_B.a(var15, -128 + var7 - -1, -var17 + (var18 - -1), 256, 256, 0, -1, 1, 0, 14);
              int discarded$54 = mi.field_B.a(var15, -128 + var7 - -1, -var17 + var18 + -1, 256, 256, 0, -1, 1, 0, 14);
              int discarded$55 = mi.field_B.a(var15, var7 - 129, -var17 + var18, 256, 256, 0, 0, 1, 0, 14);
              int discarded$56 = mi.field_B.a(var15, var7 + -128, -1 + (var18 + -var17), 256, 256, 0, 0, 1, 0, 14);
              int discarded$57 = mi.field_B.a(var15, -128 + var7, -var17 + var18, 256, 256, 16777215, -1, 1, 0, 14);
              de.a();
              de.d(3, 2, -128 + var7, -1 + var18, 256, 2);
              de.d(2, 1, -128 + var7, var18 - -1, 256, 1);
              de.d(1, 1, -128 + var7, 2 + var18, 256, 1);
              de.d(1, 1, -128 + var7, -3 + (128 + var18), 256, 1);
              de.d(2, 1, -128 + var7, -2 + (128 + var18), 256, 1);
              de.d(3, 2, var7 - 128, var18 + 127, 256, 2);
              var19 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
              var20 = 0;
              if (param0) {
                L19: while (true) {
                  L20: {
                    L21: {
                      if (~var20 <= ~var3) {
                        break L21;
                      } else {
                        var5 = var19[var20] * 3.141592653589793;
                        if (var33 != 0) {
                          break L20;
                        } else {
                          L22: {
                            L23: {
                              L24: {
                                if (var2.field_V.field_d) {
                                  break L24;
                                } else {
                                  if (var4 == var20) {
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              L25: {
                                if (!var2.field_V.field_d) {
                                  break L25;
                                } else {
                                  if (~var4 != ~(var20 & 1)) {
                                    break L25;
                                  } else {
                                    if ((1 << var20 & var2.field_J) != 0) {
                                      break L25;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              stackOut_61_0 = 0;
                              stackIn_62_0 = stackOut_61_0;
                              break L22;
                            }
                            stackOut_60_0 = 1;
                            stackIn_62_0 = stackOut_60_0;
                            break L22;
                          }
                          L26: {
                            L27: {
                              L28: {
                                var21 = stackIn_62_0;
                                var22 = (int)(240.0 * Math.sin(var5)) + var7;
                                var23 = uc.field_a / 2 + (240 - -(int)(140.0 * Math.cos(var5)));
                                var24 = nj.field_n[var20];
                                if (var21 == 0) {
                                  break L28;
                                } else {
                                  var25 = -48;
                                  L29: while (true) {
                                    L30: {
                                      L31: {
                                        if (var25 >= 48) {
                                          break L31;
                                        } else {
                                          de.h(0, var25 + (var23 - 16), an.field_f, 24 + var23 - -var25);
                                          de.i(var22, -4 + (-(var25 / 2) + var23 + -16), 28, 13484723);
                                          gn.a(48, (byte) 90, 32, var22, -16 + (-(var25 / 2) + var23 + -4));
                                          de.c(var22, -16 + -(var25 / 2) + var23 + -4, 28, 0);
                                          var25++;
                                          if (var33 != 0) {
                                            break L30;
                                          } else {
                                            if (var33 == 0) {
                                              continue L29;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                      }
                                      var23 -= 16;
                                      break L30;
                                    }
                                    if (var33 == 0) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                              }
                              var25 = -32;
                              L32: while (true) {
                                L33: {
                                  L34: {
                                    if (var25 >= 32) {
                                      break L34;
                                    } else {
                                      de.h(0, var23 + var25, an.field_f, 8 + var25 + var23);
                                      de.i(var22, var23 - var25 / 2, 32, 7891535);
                                      de.c(var22, -(var25 / 2) + var23, 32, 0);
                                      var25++;
                                      if (var33 != 0) {
                                        break L33;
                                      } else {
                                        if (var33 == 0) {
                                          continue L32;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                  }
                                  var25 = -32;
                                  break L33;
                                }
                                L35: while (true) {
                                  if (var25 >= 32) {
                                    break L27;
                                  } else {
                                    de.h(0, var23 - -var25, an.field_f, var25 + var23 - -8);
                                    de.i(var22, -4 + var23 - var25 / 2, 28, 13484723);
                                    de.c(var22, -4 + -(var25 / 2) + var23, 28, 0);
                                    var25++;
                                    if (var33 != 0) {
                                      break L26;
                                    } else {
                                      if (var33 == 0) {
                                        continue L35;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var23 -= 64;
                            var22 -= 32;
                            de.a();
                            var25 = 0;
                            break L26;
                          }
                          L36: {
                            var26 = 0;
                            if (var21 != 0) {
                              var25 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(jb.field_v % 50) / 50.0));
                              if (jb.field_v / 50 % 5 == 0) {
                                var26 = var25;
                                break L36;
                              } else {
                                break L36;
                              }
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            var9[0] = var2.field_V.field_N[var20][0];
                            var9[1] = var2.field_V.field_N[var20][1];
                            var9[2] = var2.field_V.field_N[var20][2];
                            var10[0] = var2.field_V.field_N[var20][3];
                            var10[1] = var2.field_V.field_N[var20][4];
                            var10[2] = var2.field_V.field_N[var20][5];
                            var11[0] = var2.field_V.field_N[var20][6];
                            var11[1] = var2.field_V.field_N[var20][7];
                            var11[2] = var2.field_V.field_N[var20][8];
                            var12[0] = var2.field_V.field_N[var20][9];
                            var12[1] = var2.field_V.field_N[var20][10];
                            var12[2] = var2.field_V.field_N[var20][11];
                            if (46 != var2.field_V.field_N[var20][12]) {
                              pc.a(var11, -2 + (var23 - -var26), var12, var9, (byte) 29, var10, var13[8][0], var22);
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            pc.a(var11, var23 + var25 - (0 - var26 / 2), var12, var9, (byte) -82, var10, var13[3][var2.field_V.field_N[var20][15]], 12 + var22);
                            pc.a(var11, var23 + var26 * 3 / 2, var12, var9, (byte) -81, var10, var13[1][var2.field_V.field_N[var20][12]], var22);
                            if (var2.field_V.field_N[var20][12] == 46) {
                              break L38;
                            } else {
                              pc.a(var11, 2 + var23, var12, var9, (byte) -93, var10, var13[7][0], var22);
                              break L38;
                            }
                          }
                          L39: {
                            if (var21 != 0) {
                              break L39;
                            } else {
                              var23 += 16;
                              var22 += 8;
                              break L39;
                            }
                          }
                          L40: {
                            pc.a(var11, -40 + (var23 + (16 - -(var26 * 3 / 2))), var12, var9, (byte) 92, var10, var13[0][var2.field_V.field_N[var20][13]], var22);
                            pc.a(var11, var23 - (-32 + (40 + -(var26 * 3 / 2))), var12, var9, (byte) -125, var10, var13[4][var2.field_V.field_N[var20][17]], var22);
                            if (var2.field_V.field_N[var20][17] == 53) {
                              break L40;
                            } else {
                              if (var2.field_V.field_N[var20][17] == 55) {
                                break L40;
                              } else {
                                L41: {
                                  stackOut_97_0 = (int[]) var11;
                                  stackOut_97_1 = var23 - -32 + (-40 - -(var26 * 3 / 2));
                                  stackOut_97_2 = (int[]) var12;
                                  stackOut_97_3 = (int[]) var9;
                                  stackOut_97_4 = 20;
                                  stackOut_97_5 = (int[]) var10;
                                  stackOut_97_6 = var13[6];
                                  stackIn_100_0 = stackOut_97_0;
                                  stackIn_100_1 = stackOut_97_1;
                                  stackIn_100_2 = stackOut_97_2;
                                  stackIn_100_3 = stackOut_97_3;
                                  stackIn_100_4 = stackOut_97_4;
                                  stackIn_100_5 = stackOut_97_5;
                                  stackIn_100_6 = stackOut_97_6;
                                  stackIn_98_0 = stackOut_97_0;
                                  stackIn_98_1 = stackOut_97_1;
                                  stackIn_98_2 = stackOut_97_2;
                                  stackIn_98_3 = stackOut_97_3;
                                  stackIn_98_4 = stackOut_97_4;
                                  stackIn_98_5 = stackOut_97_5;
                                  stackIn_98_6 = stackOut_97_6;
                                  if (var21 != 0) {
                                    stackOut_100_0 = (int[]) (Object) stackIn_100_0;
                                    stackOut_100_1 = stackIn_100_1;
                                    stackOut_100_2 = (int[]) (Object) stackIn_100_2;
                                    stackOut_100_3 = (int[]) (Object) stackIn_100_3;
                                    stackOut_100_4 = stackIn_100_4;
                                    stackOut_100_5 = (int[]) (Object) stackIn_100_5;
                                    stackOut_100_6 = (qb[]) (Object) stackIn_100_6;
                                    stackOut_100_7 = 8;
                                    stackIn_101_0 = stackOut_100_0;
                                    stackIn_101_1 = stackOut_100_1;
                                    stackIn_101_2 = stackOut_100_2;
                                    stackIn_101_3 = stackOut_100_3;
                                    stackIn_101_4 = stackOut_100_4;
                                    stackIn_101_5 = stackOut_100_5;
                                    stackIn_101_6 = stackOut_100_6;
                                    stackIn_101_7 = stackOut_100_7;
                                    break L41;
                                  } else {
                                    stackOut_98_0 = (int[]) (Object) stackIn_98_0;
                                    stackOut_98_1 = stackIn_98_1;
                                    stackOut_98_2 = (int[]) (Object) stackIn_98_2;
                                    stackOut_98_3 = (int[]) (Object) stackIn_98_3;
                                    stackOut_98_4 = stackIn_98_4;
                                    stackOut_98_5 = (int[]) (Object) stackIn_98_5;
                                    stackOut_98_6 = (qb[]) (Object) stackIn_98_6;
                                    stackIn_99_0 = stackOut_98_0;
                                    stackIn_99_1 = stackOut_98_1;
                                    stackIn_99_2 = stackOut_98_2;
                                    stackIn_99_3 = stackOut_98_3;
                                    stackIn_99_4 = stackOut_98_4;
                                    stackIn_99_5 = stackOut_98_5;
                                    stackIn_99_6 = stackOut_98_6;
                                    stackOut_99_0 = (int[]) (Object) stackIn_99_0;
                                    stackOut_99_1 = stackIn_99_1;
                                    stackOut_99_2 = (int[]) (Object) stackIn_99_2;
                                    stackOut_99_3 = (int[]) (Object) stackIn_99_3;
                                    stackOut_99_4 = stackIn_99_4;
                                    stackOut_99_5 = (int[]) (Object) stackIn_99_5;
                                    stackOut_99_6 = (qb[]) (Object) stackIn_99_6;
                                    stackOut_99_7 = 16;
                                    stackIn_101_0 = stackOut_99_0;
                                    stackIn_101_1 = stackOut_99_1;
                                    stackIn_101_2 = stackOut_99_2;
                                    stackIn_101_3 = stackOut_99_3;
                                    stackIn_101_4 = stackOut_99_4;
                                    stackIn_101_5 = stackOut_99_5;
                                    stackIn_101_6 = stackOut_99_6;
                                    stackIn_101_7 = stackOut_99_7;
                                    break L41;
                                  }
                                }
                                pc.a(stackIn_101_0, stackIn_101_1, stackIn_101_2, stackIn_101_3, (byte) stackIn_101_4, stackIn_101_5, stackIn_101_6[stackIn_101_7 + (var20 + jb.field_v / 200) % 8], var22);
                                break L40;
                              }
                            }
                          }
                          L42: {
                            pc.a(var11, 3 * var26 / 2 + var23 + 16 - 40, var12, var9, (byte) -102, var10, var13[5][var2.field_V.field_N[var20][16]], var22);
                            if (var21 != 0) {
                              break L42;
                            } else {
                              var23 -= 16;
                              var22 -= 8;
                              break L42;
                            }
                          }
                          L43: {
                            pc.a(var11, var26 * 2 + (var25 - -var23), var12, var9, (byte) -88, var10, var13[2][var2.field_V.field_N[var20][14]], var22 + -12);
                            var22 += 32;
                            var23 += 64;
                            var27 = var2.field_V.field_k[var20];
                            var28 = mi.field_B.b("Wmmmmmmmmmmm");
                            if (var4 != var20) {
                              break L43;
                            } else {
                              var23 += 16;
                              break L43;
                            }
                          }
                          var22 = var22 - (var28 / 2 + 7);
                          var23 += 16;
                          var16 = 15 + var28;
                          de.c(var22 + 3, -8 + (var23 - -3), var16 + -6, 15, var24, 8421504 ^ (8421504 | var24));
                          de.h(var22 - -3, -5 + var23, var16 + 3 + var22 + -6, -2 + (17 + (var23 + -8)) - -3);
                          L44: while (true) {
                            L45: {
                              L46: {
                                if (var16 <= 0) {
                                  break L46;
                                } else {
                                  var16 = var16 - g.field_a.field_n;
                                  g.field_a.b(var22 + (3 - -var16), 3 + (var23 + -18), 64);
                                  if (var33 != 0) {
                                    break L45;
                                  } else {
                                    if (var33 == 0) {
                                      continue L44;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              de.a();
                              var16 = 15 + var28;
                              de.a(var22, var23 - 8, var16, 21, 6, 0);
                              de.a(2 + var22, -6 + var23, -4 + var16, 17, 4, 0);
                              de.a(1 + var22, 1 + var23 - 8, var16 + -2, 19, 6, 16777215);
                              de.a(var22 + 2, -8 + (2 + var23), -4 + var16, 17, 6, 0);
                              var22 = var22 + (7 + var28 / 2);
                              break L45;
                            }
                            L47: {
                              var29 = null;
                              if ((1 << var20 & var2.field_b) != 0) {
                                var29 = (Object) (Object) hf.field_b;
                                break L47;
                              } else {
                                if ((~var2.field_a & var2.field_b) > 0) {
                                  if ((1 << var20 & var2.field_a) != 0) {
                                    var29 = (Object) (Object) ea.field_I;
                                    break L47;
                                  } else {
                                    L48: {
                                      stackOut_117_0 = new StringBuilder().append(field_r);
                                      stackIn_120_0 = stackOut_117_0;
                                      stackIn_118_0 = stackOut_117_0;
                                      if ((jb.field_v & 11) >> 364106947 != 0) {
                                        stackOut_120_0 = (StringBuilder) (Object) stackIn_120_0;
                                        stackOut_120_1 = ".";
                                        stackIn_121_0 = stackOut_120_0;
                                        stackIn_121_1 = stackOut_120_1;
                                        break L48;
                                      } else {
                                        stackOut_118_0 = (StringBuilder) (Object) stackIn_118_0;
                                        stackIn_119_0 = stackOut_118_0;
                                        stackOut_119_0 = (StringBuilder) (Object) stackIn_119_0;
                                        stackOut_119_1 = "";
                                        stackIn_121_0 = stackOut_119_0;
                                        stackIn_121_1 = stackOut_119_1;
                                        break L48;
                                      }
                                    }
                                    L49: {
                                      stackOut_121_0 = ((StringBuilder) (Object) stackIn_121_0).append(stackIn_121_1);
                                      stackIn_123_0 = stackOut_121_0;
                                      stackIn_122_0 = stackOut_121_0;
                                      if ((2 & jb.field_v >> -1490343933) == 0) {
                                        stackOut_123_0 = (StringBuilder) (Object) stackIn_123_0;
                                        stackOut_123_1 = "";
                                        stackIn_124_0 = stackOut_123_0;
                                        stackIn_124_1 = stackOut_123_1;
                                        break L49;
                                      } else {
                                        stackOut_122_0 = (StringBuilder) (Object) stackIn_122_0;
                                        stackOut_122_1 = "..";
                                        stackIn_124_0 = stackOut_122_0;
                                        stackIn_124_1 = stackOut_122_1;
                                        break L49;
                                      }
                                    }
                                    var29 = (Object) (Object) (stackIn_124_1);
                                    break L47;
                                  }
                                } else {
                                  break L47;
                                }
                              }
                            }
                            L50: {
                              if (var29 == null) {
                                break L50;
                              } else {
                                if (0 != (128 & jb.field_v)) {
                                  break L50;
                                } else {
                                  var27 = (String) var29;
                                  break L50;
                                }
                              }
                            }
                            L51: {
                              L52: {
                                mi.field_B.b(var27, var22 + -1, var23 + 1 + mi.field_B.field_C / 2, 0, 0);
                                mi.field_B.b(var27, var22, -1 + (mi.field_B.field_C / 2 + 1) + var23, 0, 0);
                                mi.field_B.b(var27, var22, mi.field_B.field_C / 2 + var23 + 1, 16777215, -1);
                                var22 -= 16;
                                var23 -= 32;
                                if (var2.field_V.d(1)) {
                                  L53: {
                                    if (!var2.field_i) {
                                      stackOut_135_0 = 0;
                                      stackIn_136_0 = stackOut_135_0;
                                      break L53;
                                    } else {
                                      stackOut_134_0 = var2.field_V.d(-108, var20);
                                      stackIn_136_0 = stackOut_134_0;
                                      break L53;
                                    }
                                  }
                                  var30 = stackIn_136_0;
                                  var31 = new qb(32 + (24 + var30 * 8), 80);
                                  var31.a();
                                  var32 = 0;
                                  L54: while (true) {
                                    L55: {
                                      L56: {
                                        if (~var32 <= ~var30) {
                                          break L56;
                                        } else {
                                          tg.field_b[7].a(16 + 8 * var32 - -8, 24, 0, 16744703);
                                          var32++;
                                          if (var33 != 0) {
                                            break L55;
                                          } else {
                                            if (var33 == 0) {
                                              continue L54;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                      }
                                      de.d(4, 4, 0, 0, 8 * var30 + 24 - -32, 80);
                                      ce.field_m.a(true);
                                      var31.b(-(var30 * 8) + (var22 + -36), -24 + var23 - 16, 256);
                                      var31.b(-14 + (var22 + (-(8 * var30) - 16)) + 6, -16 + (-24 + var23), 256);
                                      var31.b(var22 - (8 * var30 + 30), -24 + var23 + -22, 256);
                                      var31.b(-16 + -(var30 * 8) + var22 + -14, -34 + var23, 256);
                                      break L55;
                                    }
                                    var32 = 0;
                                    L57: while (true) {
                                      if (var32 >= var30) {
                                        break L52;
                                      } else {
                                        tg.field_b[7].a(-14 + -(var32 * 8) + var22, var23 + -16);
                                        var32++;
                                        if (var33 != 0) {
                                          break L51;
                                        } else {
                                          if (var33 == 0) {
                                            continue L57;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L52;
                                }
                              }
                              var20++;
                              break L51;
                            }
                            if (var33 == 0) {
                              continue L19;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                    }
                    break L20;
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final boolean a(boolean param0, int param1, byte param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_31_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!param3) {
                  break L2;
                } else {
                  if (an.field_g < param4) {
                    break L2;
                  } else {
                    if (~(param1 + param4) >= ~an.field_g) {
                      break L2;
                    } else {
                      if (~param6 < ~me.field_I) {
                        break L2;
                      } else {
                        if (me.field_I >= param5 + param6) {
                          break L2;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_16_0 = stackOut_13_0;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L1;
            }
            L3: {
              L4: {
                var8_int = stackIn_16_0;
                de.a(param4, param6, param1, param5, 14802120);
                param6++;
                param5 -= 2;
                param4++;
                param1 -= 2;
                de.a(param4, param6, param1, param5, 1572892);
                param1 -= 2;
                param5 -= 2;
                param4++;
                param6++;
                de.a(param4, param6, param1, param5, 7887708);
                param4++;
                param1 -= 2;
                var9 = -96 % ((32 - param2) / 42);
                param6++;
                param5 -= 2;
                if (param0) {
                  break L4;
                } else {
                  L5: {
                    stackOut_17_0 = param4;
                    stackOut_17_1 = param6;
                    stackOut_17_2 = param1;
                    stackOut_17_3 = param5;
                    stackIn_22_0 = stackOut_17_0;
                    stackIn_22_1 = stackOut_17_1;
                    stackIn_22_2 = stackOut_17_2;
                    stackIn_22_3 = stackOut_17_3;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    if (var8_int != 0) {
                      stackOut_22_0 = stackIn_22_0;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = stackIn_22_2;
                      stackOut_22_3 = stackIn_22_3;
                      stackOut_22_4 = 14075852;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      stackIn_23_4 = stackOut_22_4;
                      break L5;
                    } else {
                      stackOut_18_0 = stackIn_18_0;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = stackIn_18_2;
                      stackOut_18_3 = stackIn_18_3;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      stackOut_20_0 = stackIn_20_0;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = stackIn_20_2;
                      stackOut_20_3 = stackIn_20_3;
                      stackOut_20_4 = 11374744;
                      stackIn_23_0 = stackOut_20_0;
                      stackIn_23_1 = stackOut_20_1;
                      stackIn_23_2 = stackOut_20_2;
                      stackIn_23_3 = stackOut_20_3;
                      stackIn_23_4 = stackOut_20_4;
                      break L5;
                    }
                  }
                  de.e(stackIn_23_0, stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, 230);
                  if (!ArcanistsMulti.field_G) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                stackOut_24_0 = param4;
                stackOut_24_1 = param6;
                stackOut_24_2 = param1;
                stackOut_24_3 = param5;
                stackIn_29_0 = stackOut_24_0;
                stackIn_29_1 = stackOut_24_1;
                stackIn_29_2 = stackOut_24_2;
                stackIn_29_3 = stackOut_24_3;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                if (var8_int == 0) {
                  stackOut_29_0 = stackIn_29_0;
                  stackOut_29_1 = stackIn_29_1;
                  stackOut_29_2 = stackIn_29_2;
                  stackOut_29_3 = stackIn_29_3;
                  stackOut_29_4 = 13220778;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  stackIn_30_3 = stackOut_29_3;
                  stackIn_30_4 = stackOut_29_4;
                  break L6;
                } else {
                  stackOut_25_0 = stackIn_25_0;
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = stackIn_25_2;
                  stackOut_25_3 = stackIn_25_3;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  stackIn_27_3 = stackOut_25_3;
                  stackOut_27_0 = stackIn_27_0;
                  stackOut_27_1 = stackIn_27_1;
                  stackOut_27_2 = stackIn_27_2;
                  stackOut_27_3 = stackIn_27_3;
                  stackOut_27_4 = 16181230;
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_30_1 = stackOut_27_1;
                  stackIn_30_2 = stackOut_27_2;
                  stackIn_30_3 = stackOut_27_3;
                  stackIn_30_4 = stackOut_27_4;
                  break L6;
                }
              }
              de.e(stackIn_30_0, stackIn_30_1, stackIn_30_2, stackIn_30_3, stackIn_30_4, 230);
              break L3;
            }
            de.b(param4 - 1, param6 - -3, param4 - -4, param6 + -2, 1572892);
            de.b(param4 - 2, 5 + param6, 5 + param4, param6 - 2, 14802120);
            de.b(-1 + param4, 5 + param6, 5 + param4, -1 + param6, 1572892);
            de.b(param4, 5 + param6, 5 + param4, param6, 7887708);
            de.b(param1 + param4, param6 - -3, param1 + (-5 + param4), -2 + param6, 1572892);
            de.b(param1 + (1 + param4), param6 + 5, param1 + (param4 + -6), -2 + param6, 14802120);
            de.b(param4 - -param1, param6 + 5, -6 + (param4 + param1), param6 + -1, 1572892);
            de.b(-1 + param4 + param1, 5 + param6, param1 + (-6 + param4), param6, 7887708);
            de.b(param4 - 1, param6 - (4 + -param5), 4 + param4, 1 + param6 - -param5, 1572892);
            de.b(param4 - 2, param6 + -6 + param5, 5 + param4, param5 + 1 + param6, 14802120);
            de.b(-1 + param4, param5 + (-6 + param6), 5 + param4, param5 + param6, 1572892);
            de.b(param4, param5 + -6 + param6, 5 + param4, param5 + param6 - 1, 7887708);
            de.b(param4 - -param1, param5 + (-4 + param6), param1 + (-5 + param4), param6 - -1 + param5, 1572892);
            de.b(param1 + 1 + param4, param5 + param6 + -6, param4 + (-6 + param1), param5 + 1 + param6, 14802120);
            de.b(param1 + param4, param6 - 6 - -param5, param4 + -6 + param1, param5 + param6, 1572892);
            de.b(param4 - (1 + -param1), param5 + (param6 - 6), -6 + (param4 - -param1), -1 + (param5 + param6), 7887708);
            stackOut_31_0 = var8_int;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var8, "lc.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_32_0 != 0;
    }

    private final void d(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        String[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!lc.a((byte) 112)) {
              L1: {
                if (null == nj.field_e) {
                  nj.field_e = eb.a(true, 10, 0, 7);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var2_int = 125 + uc.field_a + -16;
                var2_int += 16;
                var3 = 0;
                mi.field_B.b(rd.field_d, no.field_tb[0] + bi.field_I, var2_int, var3, -1);
                mi.field_B.b(ej.field_H, no.field_tb[1] + bi.field_I, var2_int, var3, -1);
                mi.field_B.b(oo.field_o, no.field_tb[2] + bi.field_I, var2_int, var3, -1);
                mi.field_B.b(fc.field_d, no.field_tb[3] + bi.field_I, var2_int, var3, -1);
                mi.field_B.b(sl.field_N, no.field_tb[4] + bi.field_I, var2_int, var3, -1);
                if (param0) {
                  break L2;
                } else {
                  this.f(-123);
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2_int = var2_int + (8 + tj.field_t.field_C);
                  if (!nj.field_e.field_g) {
                    break L4;
                  } else {
                    L5: {
                      if (null != nj.field_e.field_r) {
                        break L5;
                      } else {
                        var4 = rk.field_R;
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var4 = rm.field_d;
                    var5 = nj.field_e.field_r[ie.field_Sb];
                    var6 = nj.field_e.field_l[ie.field_Sb];
                    var7 = 0;
                    var8 = 0;
                    L6: while (true) {
                      L7: {
                        L8: {
                          L9: {
                            if (var8 >= 10) {
                              break L9;
                            } else {
                              if (var10 != 0) {
                                break L8;
                              } else {
                                L10: {
                                  if (null != var5[var8]) {
                                    L11: {
                                      var3 = 0;
                                      if ((var8 & 1) == 1) {
                                        var3 = 16777215;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var9 = var5[var8];
                                      if (var9.equals((Object) (Object) ah.field_b)) {
                                        var3 = 16776960;
                                        var7 = 1;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    this.a(var3, var6[4 * var8 - -1], var9, var6[3 + var8 * 4], var6[4 * var8], var8, (byte) -114, var6[2 + var8 * 4], var2_int);
                                    var4 = "";
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var2_int += 25;
                                var8++;
                                if (var10 == 0) {
                                  continue L6;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          if (var7 == 0) {
                            var3 = 16776960;
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                        this.a(var3, nj.field_e.field_k, ah.field_b, nj.field_e.field_s, nj.field_e.field_i, -1, (byte) -126, nj.field_e.field_h, var2_int);
                        break L7;
                      }
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var4 = ba.field_f;
                break L3;
              }
              L13: {
                var3 = 0;
                var2_int = -16 + uc.field_a - -125;
                de.d(-((-no.field_tb[0] + no.field_tb[1]) / 2) + no.field_tb[0] + bi.field_I, 16 + (var2_int - -9), 276, var3);
                de.d(bi.field_I + (no.field_tb[0] - -no.field_tb[1]) / 2, 16 + (9 + var2_int), 276, var3);
                de.d(bi.field_I + (no.field_tb[2] + no.field_tb[1]) / 2, 16 + (9 + var2_int), 276, var3);
                de.d(bi.field_I + (no.field_tb[2] - -no.field_tb[3]) / 2, 16 + var2_int - -9, 276, var3);
                de.d(bi.field_I + (no.field_tb[3] + no.field_tb[4]) / 2, 9 + var2_int + 16, 276, var3);
                if ("" != var4) {
                  var2_int = 16 + uc.field_a - -125;
                  mi.field_B.a(var4, bi.field_I + 64, -16 + var2_int, 0, -1);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                L15: {
                  if (ie.field_Sb != 0) {
                    break L15;
                  } else {
                    var2_int = uc.field_a - -125;
                    mi.field_B.b(me.field_N, bi.field_I + 320, var2_int - 16, 0, -1);
                    if (var10 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                var2_int = uc.field_a - -125;
                mi.field_B.b(ij.field_Cb, 320 + bi.field_I, var2_int - 16, 0, -1);
                break L14;
              }
              break L0;
            } else {
              this.g(12);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "lc.U(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (param0 != 103) {
            return;
        }
        try {
            if (6 == ((lc) this).field_l) {
                nj.field_e = null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "lc.D(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        String var5 = null;
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
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int stackIn_68_4 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        int stackIn_69_4 = 0;
        int stackIn_69_5 = 0;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_128_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        int stackOut_68_4 = 0;
        int stackOut_68_5 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_66_5 = 0;
        int stackOut_80_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_125_0 = 0;
        var20 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = wl.field_L[((lc) this).field_l][param2];
              var5 = ce.field_g[var4_int];
              if (var4_int != 8) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (th.field_f == 0) {
                      break L3;
                    } else {
                      if (mn.field_r == 0) {
                        break L3;
                      } else {
                        if (10 == th.field_f) {
                          break L3;
                        } else {
                          if (10 != mn.field_r) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var5 = ce.field_g[7];
                  if (var20 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  L5: {
                    if (th.field_f == 1) {
                      break L5;
                    } else {
                      if (mn.field_r != 1) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var5 = ja.field_r;
                  if (var20 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  L7: {
                    if (th.field_f == 2) {
                      break L7;
                    } else {
                      if (2 == mn.field_r) {
                        break L7;
                      } else {
                        if (3 == th.field_f) {
                          break L7;
                        } else {
                          if (3 == mn.field_r) {
                            break L7;
                          } else {
                            if (th.field_f == 4) {
                              break L7;
                            } else {
                              if (mn.field_r != 4) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var5 = q.field_I;
                  if (var20 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
                L8: {
                  if (th.field_f == 15) {
                    break L8;
                  } else {
                    if (mn.field_r != 15) {
                      break L1;
                    } else {
                      break L8;
                    }
                  }
                }
                var5 = ce.field_g[14];
                break L1;
              }
            }
            L9: {
              L10: {
                var6 = tj.field_t.b(var5);
                var7 = this.d(41, param2);
                var8 = this.a(param2, (byte) 103);
                var9 = this.f(param2, -7661);
                if (var4_int == 20) {
                  break L10;
                } else {
                  if (var4_int == 21) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              var6 = ff.field_c - -120;
              break L9;
            }
            L11: {
              var10 = -var6 + (var7 + var8) >> 574804385;
              var11 = this.c(param2, 110);
              var12 = -var7 + var8;
              var13 = this.c(param2, 100);
              var14 = 0;
              if (((lc) this).field_l == 0) {
                break L11;
              } else {
                if (15 == ((lc) this).field_l) {
                  break L11;
                } else {
                  L12: {
                    stackOut_59_0 = var7 + 2;
                    stackOut_59_1 = 1 + var9;
                    stackOut_59_2 = var12 - 4;
                    stackOut_59_3 = -2 + var13;
                    stackIn_64_0 = stackOut_59_0;
                    stackIn_64_1 = stackOut_59_1;
                    stackIn_64_2 = stackOut_59_2;
                    stackIn_64_3 = stackOut_59_3;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    stackIn_60_3 = stackOut_59_3;
                    if (!param1) {
                      stackOut_64_0 = stackIn_64_0;
                      stackOut_64_1 = stackIn_64_1;
                      stackOut_64_2 = stackIn_64_2;
                      stackOut_64_3 = stackIn_64_3;
                      stackOut_64_4 = 0;
                      stackIn_65_0 = stackOut_64_0;
                      stackIn_65_1 = stackOut_64_1;
                      stackIn_65_2 = stackOut_64_2;
                      stackIn_65_3 = stackOut_64_3;
                      stackIn_65_4 = stackOut_64_4;
                      break L12;
                    } else {
                      stackOut_60_0 = stackIn_60_0;
                      stackOut_60_1 = stackIn_60_1;
                      stackOut_60_2 = stackIn_60_2;
                      stackOut_60_3 = stackIn_60_3;
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_62_1 = stackOut_60_1;
                      stackIn_62_2 = stackOut_60_2;
                      stackIn_62_3 = stackOut_60_3;
                      stackOut_62_0 = stackIn_62_0;
                      stackOut_62_1 = stackIn_62_1;
                      stackOut_62_2 = stackIn_62_2;
                      stackOut_62_3 = stackIn_62_3;
                      stackOut_62_4 = 2964062;
                      stackIn_65_0 = stackOut_62_0;
                      stackIn_65_1 = stackOut_62_1;
                      stackIn_65_2 = stackOut_62_2;
                      stackIn_65_3 = stackOut_62_3;
                      stackIn_65_4 = stackOut_62_4;
                      break L12;
                    }
                  }
                  L13: {
                    stackOut_65_0 = stackIn_65_0;
                    stackOut_65_1 = stackIn_65_1;
                    stackOut_65_2 = stackIn_65_2;
                    stackOut_65_3 = stackIn_65_3;
                    stackOut_65_4 = stackIn_65_4;
                    stackIn_68_0 = stackOut_65_0;
                    stackIn_68_1 = stackOut_65_1;
                    stackIn_68_2 = stackOut_65_2;
                    stackIn_68_3 = stackOut_65_3;
                    stackIn_68_4 = stackOut_65_4;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    stackIn_66_2 = stackOut_65_2;
                    stackIn_66_3 = stackOut_65_3;
                    stackIn_66_4 = stackOut_65_4;
                    if (param1) {
                      stackOut_68_0 = stackIn_68_0;
                      stackOut_68_1 = stackIn_68_1;
                      stackOut_68_2 = stackIn_68_2;
                      stackOut_68_3 = stackIn_68_3;
                      stackOut_68_4 = stackIn_68_4;
                      stackOut_68_5 = 16711164;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      stackIn_69_2 = stackOut_68_2;
                      stackIn_69_3 = stackOut_68_3;
                      stackIn_69_4 = stackOut_68_4;
                      stackIn_69_5 = stackOut_68_5;
                      break L13;
                    } else {
                      stackOut_66_0 = stackIn_66_0;
                      stackOut_66_1 = stackIn_66_1;
                      stackOut_66_2 = stackIn_66_2;
                      stackOut_66_3 = stackIn_66_3;
                      stackOut_66_4 = stackIn_66_4;
                      stackOut_66_5 = 5928124;
                      stackIn_69_0 = stackOut_66_0;
                      stackIn_69_1 = stackOut_66_1;
                      stackIn_69_2 = stackOut_66_2;
                      stackIn_69_3 = stackOut_66_3;
                      stackIn_69_4 = stackOut_66_4;
                      stackIn_69_5 = stackOut_66_5;
                      break L13;
                    }
                  }
                  de.c(stackIn_69_0, stackIn_69_1, stackIn_69_2, stackIn_69_3, stackIn_69_4, stackIn_69_5);
                  var14 = 1;
                  de.a(1 + var7, var9, var12 - 2, var13, 5, 0);
                  de.a(var7, var9 + -1, var12, var13 + 2, 6, 16777215);
                  de.h(var7 + 2, 1 + var9, var12 + (2 + var7 + -4), -2 + (1 + var9 + var13));
                  var15 = 2 + var7;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (~(var12 + (2 + var7 - 4)) >= ~var15) {
                          break L16;
                        } else {
                          sm.field_d.b(var15, -16 + var9, 32);
                          var15 = var15 + sm.field_d.field_n;
                          if (var20 != 0) {
                            break L15;
                          } else {
                            if (var20 == 0) {
                              continue L14;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      de.a();
                      de.c(var7 + 4, var9 - -2, var12 + -8, 9, 4, 16777215, 64);
                      break L15;
                    }
                    de.c(5 + var7, var9 + 3, var12 - 10, 7, 3, 16777215, 64);
                    break L11;
                  }
                }
              }
            }
            L17: {
              if (!param1) {
                stackOut_80_0 = 16173159;
                stackIn_81_0 = stackOut_80_0;
                break L17;
              } else {
                stackOut_78_0 = 7097239;
                stackIn_81_0 = stackOut_78_0;
                break L17;
              }
            }
            L18: {
              var15 = stackIn_81_0;
              if (param1) {
                stackOut_84_0 = 16598235;
                stackIn_85_0 = stackOut_84_0;
                break L18;
              } else {
                stackOut_82_0 = 16738820;
                stackIn_85_0 = stackOut_82_0;
                break L18;
              }
            }
            L19: {
              var16 = stackIn_85_0;
              if (lc.a((byte) 112)) {
                break L19;
              } else {
                if (0 >= ah.field_c) {
                  break L19;
                } else {
                  if (var4_int == 15) {
                    L20: {
                      if (!param1) {
                        stackOut_97_0 = 0;
                        stackIn_98_0 = stackOut_97_0;
                        break L20;
                      } else {
                        stackOut_95_0 = 7097239;
                        stackIn_98_0 = stackOut_95_0;
                        break L20;
                      }
                    }
                    L21: {
                      var15 = stackIn_98_0;
                      if (!param1) {
                        stackOut_101_0 = 16738820;
                        stackIn_102_0 = stackOut_101_0;
                        break L21;
                      } else {
                        stackOut_99_0 = 16777215;
                        stackIn_102_0 = stackOut_99_0;
                        break L21;
                      }
                    }
                    var16 = stackIn_102_0;
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
            }
            L22: {
              var17 = var15;
              if (param1) {
                stackOut_106_0 = 7536857;
                stackIn_107_0 = stackOut_106_0;
                break L22;
              } else {
                stackOut_104_0 = 10027008;
                stackIn_107_0 = stackOut_104_0;
                break L22;
              }
            }
            L23: {
              var18 = stackIn_107_0;
              if (param0 == 98) {
                break L23;
              } else {
                this.d(false);
                break L23;
              }
            }
            L24: {
              L25: {
                if (var14 != 0) {
                  break L25;
                } else {
                  if (wl.field_L[((lc) this).field_l].length > 1) {
                    var17 = km.a(param2, wl.field_L[((lc) this).field_l].length, -1422079448, var16, var15);
                    if (var20 == 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  } else {
                    break L24;
                  }
                }
              }
              var17 = var16;
              var18 = 0;
              break L24;
            }
            L26: {
              L27: {
                lk.a(var9, var10, var5, var18, var17, param0 ^ -15);
                if (var4_int == 20) {
                  break L27;
                } else {
                  if (var4_int == 21) {
                    break L27;
                  } else {
                    break L26;
                  }
                }
              }
              L28: {
                var10 = var10 + ff.field_c;
                de.g(var10, -4 + (var9 - -(var11 / 2)), 121, 8, 3, var17);
                de.a(var10, -4 + (var11 / 2 + var9), 121, 8, 3, var18);
                if (20 == var4_int) {
                  stackOut_127_0 = 120 * si.field_l / 256;
                  stackIn_128_0 = stackOut_127_0;
                  break L28;
                } else {
                  stackOut_125_0 = 120 * ul.field_A / 256;
                  stackIn_128_0 = stackOut_125_0;
                  break L28;
                }
              }
              var19 = stackIn_128_0;
              de.g(-4 + var10 + var19, var9 - -3, 8, var11 + -6, 3, var17);
              de.a(-4 + var19 + var10, 3 + var9, 8, -6 + var11, 3, var18);
              break L26;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "lc.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (((lc) this).field_l == 14) {
                break L1;
              } else {
                if (((lc) this).field_l == 8) {
                  break L1;
                } else {
                  if (((lc) this).field_l == 7) {
                    break L1;
                  } else {
                    if (param1 == -7661) {
                      stackOut_14_0 = this.e(param0, param1 + 7736) + uc.field_a;
                      stackIn_15_0 = stackOut_14_0;
                      break L0;
                    } else {
                      stackOut_12_0 = 94;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  }
                }
              }
            }
            stackOut_9_0 = this.e(param0, 75) + uc.field_a - -(uc.field_a / 8);
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    private final void e(int param0) {
        qb var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        double var14_double = 0.0;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        String var15_ref_String = null;
        int var16 = 0;
        double var16_double = 0.0;
        int var17_int = 0;
        Object var17 = null;
        double var17_double = 0.0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        double var20_double = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        double var25 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int stackIn_42_0 = 0;
        int stackIn_69_0 = 0;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_230_1 = 0;
        int stackIn_267_0 = 0;
        int stackIn_267_1 = 0;
        int stackIn_280_0 = 0;
        int stackIn_280_1 = 0;
        int stackIn_295_0 = 0;
        int stackIn_295_1 = 0;
        int stackIn_301_0 = 0;
        int stackIn_301_1 = 0;
        int stackIn_360_0 = 0;
        int stackIn_360_1 = 0;
        int stackIn_386_0 = 0;
        int stackIn_386_1 = 0;
        int stackIn_438_0 = 0;
        int stackIn_438_1 = 0;
        int stackIn_445_0 = 0;
        int stackIn_445_1 = 0;
        int stackIn_455_0 = 0;
        int stackIn_491_0 = 0;
        int stackIn_491_1 = 0;
        int stackIn_554_0 = 0;
        int stackIn_554_1 = 0;
        int stackIn_563_0 = 0;
        int stackIn_563_1 = 0;
        int stackIn_589_0 = 0;
        int stackIn_589_1 = 0;
        int stackIn_596_0 = 0;
        int stackIn_596_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        Object stackOut_69_0 = null;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_229_1 = 0;
        int stackOut_266_0 = 0;
        int stackOut_266_1 = 0;
        int stackOut_279_0 = 0;
        int stackOut_279_1 = 0;
        int stackOut_294_0 = 0;
        int stackOut_294_1 = 0;
        int stackOut_300_0 = 0;
        int stackOut_300_1 = 0;
        int stackOut_359_0 = 0;
        int stackOut_359_1 = 0;
        int stackOut_385_0 = 0;
        int stackOut_385_1 = 0;
        int stackOut_437_0 = 0;
        int stackOut_437_1 = 0;
        int stackOut_444_0 = 0;
        int stackOut_444_1 = 0;
        int stackOut_454_0 = 0;
        int stackOut_453_0 = 0;
        int stackOut_490_0 = 0;
        int stackOut_490_1 = 0;
        int stackOut_553_0 = 0;
        int stackOut_553_1 = 0;
        int stackOut_562_0 = 0;
        int stackOut_562_1 = 0;
        int stackOut_588_0 = 0;
        int stackOut_588_1 = 0;
        int stackOut_595_0 = 0;
        int stackOut_595_1 = 0;
        L0: {
          var29 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = tg.field_b[7].b();
          var3 = -ua.field_P + jf.field_j;
          this.c(-26733);
          ((lc) this).field_m = -1;
          boolean discarded$40 = this.a(false, 245, (byte) -43, false, bi.field_I - -26, 245, uc.field_a + 178);
          if (((lc) this).field_d >= 0) {
            break L0;
          } else {
            ((lc) this).field_d = 0;
            break L0;
          }
        }
        L1: {
          var4 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
          if (~(-6 + var4.length) > ~((lc) this).field_d) {
            ((lc) this).field_d = -6 + var4.length;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((lc) this).field_d > ((lc) this).field_h) {
            ((lc) this).field_h = ((lc) this).field_d;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (6 - -((lc) this).field_d <= ((lc) this).field_h) {
            ((lc) this).field_h = 5 + ((lc) this).field_d;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          L5: {
            var5 = uc.field_a - -102;
            var6 = 41 + bi.field_I;
            de.h(var6, var5 + 4, 558, 16777215, 128);
            de.e(var6, 5 + var5, 558, 55, 16777215, 64);
            de.h(var6, var5 - -65 - 5, 558, 16777215, 128);
            var7 = var6 - vi.field_I.field_n;
            if (((lc) this).field_d > 0) {
              break L5;
            } else {
              vi.field_I.b(var7, var5, vi.field_I.field_n, 65, 0);
              vi.field_I.c(var7, var5, vi.field_I.field_n, 65, 128);
              if (var29 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (var7 > an.field_g) {
              break L6;
            } else {
              if (~var6 >= ~an.field_g) {
                break L6;
              } else {
                if (~var5 < ~me.field_I) {
                  break L6;
                } else {
                  if (var5 - -65 <= me.field_I) {
                    break L6;
                  } else {
                    vi.field_I.b(var7, var5, vi.field_I.field_n, 65, 16777215);
                    vi.field_I.c(var7, var5, vi.field_I.field_n, 65, 128);
                    ((lc) this).field_m = 10;
                    ((lc) this).field_i = -1;
                    if (var29 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
          }
          vi.field_I.c(var7, var5, vi.field_I.field_n, 65);
          break L4;
        }
        L7: {
          L8: {
            var7 = var6 + 558;
            var8 = vi.field_I.b();
            if (((lc) this).field_d < -6 + var4.length) {
              break L8;
            } else {
              var8.b(var7, var5, vi.field_I.field_n, 65, 0);
              var8.c(var7, var5, vi.field_I.field_n, 65, 128);
              if (var29 == 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            L10: {
              if (var7 > an.field_g) {
                break L10;
              } else {
                if (~an.field_g <= ~(var7 - -vi.field_I.field_n)) {
                  break L10;
                } else {
                  if (var5 > me.field_I) {
                    break L10;
                  } else {
                    if (~(65 + var5) < ~me.field_I) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
            }
            var8.c(var7, var5, vi.field_I.field_n, 65);
            if (var29 == 0) {
              break L7;
            } else {
              break L9;
            }
          }
          var8.b(var7, var5, vi.field_I.field_n, 65, 16777215);
          var8.c(var7, var5, vi.field_I.field_n, 65, 128);
          ((lc) this).field_m = 10;
          ((lc) this).field_i = 1;
          break L7;
        }
        var9 = ((lc) this).field_d;
        L11: while (true) {
          L12: {
            L13: {
              if (var9 >= ((lc) this).field_d + 6) {
                break L13;
              } else {
                var10 = (var9 - ((lc) this).field_d) * 89 + var6 - -24;
                var11 = var5;
                var12 = 0;
                stackOut_41_0 = var9;
                stackIn_119_0 = stackOut_41_0;
                stackIn_42_0 = stackOut_41_0;
                if (var29 != 0) {
                  break L12;
                } else {
                  L14: {
                    if (stackIn_42_0 == 0) {
                      var12 = 16711935;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var9 == 1) {
                      var12 = 16711680;
                      var11 += 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var9 != 2) {
                      break L16;
                    } else {
                      var11 += 0;
                      var12 = 16746632;
                      break L16;
                    }
                  }
                  L17: {
                    if (var9 != 3) {
                      break L17;
                    } else {
                      var11 += 0;
                      var12 = 16776960;
                      break L17;
                    }
                  }
                  L18: {
                    if (4 == var9) {
                      var11 += 0;
                      var12 = 65535;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var9 != 5) {
                      break L19;
                    } else {
                      var11 += 0;
                      var12 = 34816;
                      break L19;
                    }
                  }
                  L20: {
                    if (var9 != 6) {
                      break L20;
                    } else {
                      var11 += 0;
                      var12 = 16777215;
                      break L20;
                    }
                  }
                  L21: {
                    if (var9 != 7) {
                      break L21;
                    } else {
                      var11 += 0;
                      var12 = 4521762;
                      break L21;
                    }
                  }
                  L22: {
                    if (var9 != 8) {
                      break L22;
                    } else {
                      var11 += 0;
                      var12 = 1364125;
                      break L22;
                    }
                  }
                  L23: {
                    if (var9 != 9) {
                      break L23;
                    } else {
                      var11 += 0;
                      var12 = 8947848;
                      break L23;
                    }
                  }
                  L24: {
                    if (~bc.field_b != ~var9) {
                      stackOut_68_0 = 0;
                      stackIn_69_0 = stackOut_68_0;
                      break L24;
                    } else {
                      stackOut_67_0 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      break L24;
                    }
                  }
                  L25: {
                    var13_int = stackIn_69_0;
                    de.d(var10, var11, 65, 65, var12);
                    stackOut_69_0 = this;
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_70_0 = stackOut_69_0;
                    if (var9 != ((lc) this).field_h) {
                      stackOut_71_0 = this;
                      stackOut_71_1 = 0;
                      stackIn_72_0 = stackOut_71_0;
                      stackIn_72_1 = stackOut_71_1;
                      break L25;
                    } else {
                      stackOut_70_0 = this;
                      stackOut_70_1 = 1;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      break L25;
                    }
                  }
                  L26: {
                    boolean discarded$41 = this.a(stackIn_72_1 != 0, 65, (byte) 74, true, var10, 65, var11);
                    if (var13_int == 0) {
                      break L26;
                    } else {
                      L27: {
                        if (var9 != 9) {
                          break L27;
                        } else {
                          if (ArcanistsMulti.i((byte) -77)) {
                            break L27;
                          } else {
                            if (0 >= ad.field_d) {
                              break L27;
                            } else {
                              var13_int = 0;
                              break L27;
                            }
                          }
                        }
                      }
                      L28: {
                        if (0L == (1L << -14 + var9 * 8 & cb.field_e)) {
                          break L28;
                        } else {
                          if (var9 <= 1) {
                            break L28;
                          } else {
                            if (var9 < 9) {
                              if ((cb.field_e & 1L << -13 + 8 * var9 + mf.field_a / 2) != 0L) {
                                var13_int = 0;
                                break L28;
                              } else {
                                break L28;
                              }
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                      if (var13_int == 0) {
                        break L26;
                      } else {
                        var14_double = 0.5 * (3.14 * Math.sin((double)jb.field_v * 0.1)) + 3.14;
                        tk.field_x[10].a(2048, (int)(16.0 * Math.cos(var14_double)) + var11 + 16, 125, var10 + ((int)(Math.sin(var14_double) * 32.0) - -32), 0);
                        break L26;
                      }
                    }
                  }
                  L29: {
                    if (((lc) this).field_h == var9) {
                      L30: {
                        if (((lc) this).field_h != 9) {
                          break L30;
                        } else {
                          L31: {
                            L32: {
                              if (!ArcanistsMulti.i((byte) -72)) {
                                break L32;
                              } else {
                                if (0 >= ad.field_d) {
                                  break L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            rm.field_o[10].a((-rm.field_o[9].field_n + 245) / 2 + -6 + (bi.field_I - -32), 178 + (uc.field_a - -((-rm.field_o[9].field_w + 245) / 2)), (16843008 | var12 & 16711422) >> 1299689985);
                            rm.field_o[var9].a(32 + (bi.field_I + (-6 - -((245 + -rm.field_o[var9].field_n) / 2))), (245 - rm.field_o[9].field_w) / 2 + uc.field_a - -178, var12 >> -616152095 & 8355711 | 8421504);
                            de.d(6, 6, 32 + bi.field_I + 8, 8 + (uc.field_a - -178), 229, 229);
                            rm.field_o[10].c((245 - rm.field_o[9].field_n) / 2 + 32 + (bi.field_I - 6), (245 + -rm.field_o[9].field_w) / 2 + uc.field_a + 178);
                            rm.field_o[var9].c(-6 + bi.field_I + (32 - -((245 - rm.field_o[var9].field_n) / 2)), 178 + (uc.field_a + (-rm.field_o[9].field_w + 245) / 2));
                            ce.field_m.a(true);
                            if (var29 == 0) {
                              break L29;
                            } else {
                              break L31;
                            }
                          }
                          rm.field_o[10].a(32 + (bi.field_I + -6 - -((245 + -rm.field_o[9].field_n) / 2)), 178 + uc.field_a + (245 + -rm.field_o[9].field_w) / 2, (16711422 & var12 | 16843009) >> -545025343);
                          rm.field_o[var9].a((245 - rm.field_o[var9].field_n) / 2 + (bi.field_I + 32 - 6), 178 + (uc.field_a - -((245 - rm.field_o[9].field_w) / 2)), (var12 & 16711422 | 16843009) >> 705385793);
                          de.d(6, 6, bi.field_I - -32 - -8, 8 + (uc.field_a + 178), 229, 229);
                          rm.field_o[10].f(-6 + (bi.field_I - -32 + (-rm.field_o[9].field_n + 245) / 2), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, 64);
                          rm.field_o[var9].f((245 + -rm.field_o[var9].field_n) / 2 + (bi.field_I - -26), uc.field_a - (-178 + -((-rm.field_o[9].field_w + 245) / 2)), 64);
                          ce.field_m.a(true);
                          if (var29 == 0) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L33: {
                        L34: {
                          if (0L != (1L << -14 + 8 * ((lc) this).field_h & cb.field_e)) {
                            break L34;
                          } else {
                            if (1 < ((lc) this).field_h) {
                              break L33;
                            } else {
                              break L34;
                            }
                          }
                        }
                        rm.field_o[10].a(32 + (bi.field_I + -6) - -((-rm.field_o[9].field_n + 245) / 2), 178 + uc.field_a + (245 + -rm.field_o[9].field_w) / 2, (16711422 & var12) >> -1809086495 | 8421504);
                        rm.field_o[var9].a(-6 + bi.field_I - (-32 - (-rm.field_o[var9].field_n + 245) / 2), (245 + -rm.field_o[9].field_w) / 2 + uc.field_a + 178, 8421504 | (var12 & 16711422) >> 949379969);
                        de.d(6, 6, 8 + bi.field_I + 32, 8 + uc.field_a + 178, 229, 229);
                        rm.field_o[10].c((245 - rm.field_o[9].field_n) / 2 + bi.field_I + 26, uc.field_a + 178 - -((245 - rm.field_o[9].field_w) / 2));
                        rm.field_o[var9].c(-6 + bi.field_I + (32 + (245 - rm.field_o[var9].field_n) / 2), (245 + -rm.field_o[9].field_w) / 2 + (uc.field_a - -178));
                        if (var29 == 0) {
                          break L29;
                        } else {
                          break L33;
                        }
                      }
                      L35: {
                        rm.field_o[10].a(26 + (bi.field_I + (245 + -rm.field_o[9].field_n) / 2), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, var12 >> 772288865 & 8355711 | 8421504);
                        rm.field_o[var9].a(bi.field_I + (32 - (6 + -((-rm.field_o[var9].field_n + 245) / 2))), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, 8355711 & var12 >> 2115331649 | 8421504);
                        de.d(6, 6, 8 + (32 + bi.field_I), 186 + uc.field_a, 229, 229);
                        rm.field_o[10].f((-rm.field_o[9].field_n + 245) / 2 + bi.field_I - -26, (245 + -rm.field_o[9].field_w) / 2 + uc.field_a - -178, 64);
                        rm.field_o[var9].f((245 + -rm.field_o[var9].field_n) / 2 + (-6 + bi.field_I + 32), (245 - rm.field_o[9].field_w) / 2 + uc.field_a + 178, 64);
                        ce.field_m.a(true);
                        var14_int = 416 + (bi.field_I << 2005454852) + 1960;
                        var15 = 2848 + ((uc.field_a << -184663324) - -1960);
                        if (!ArcanistsMulti.i((byte) -102)) {
                          var2.b(80, 1088, var14_int, var15, jb.field_v * 30 + -26214, 4096);
                          var2.b(80, 1088, var14_int, var15, -13107 + jb.field_v * 30, 4096);
                          var2.b(80, 1088, var14_int, var15, jb.field_v * 30, 4096);
                          var2.b(80, 1088, var14_int, var15, 13107 + jb.field_v * 30, 4096);
                          var2.b(80, 1088, var14_int, var15, 26214 - -(jb.field_v * 30), 4096);
                          if (5 > var3) {
                            break L35;
                          } else {
                            var16_double = (double)(jb.field_v & 255) * 3.141592653589793 / 128.0;
                            var18 = (int)(4096.0 + 256.0 * Math.cos(4.0 * var16_double) - 256.0);
                            var19 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var16_double));
                            tk.field_x[4].a(var18, uc.field_a - -300, param0, 148 + bi.field_I, var19);
                            gn.a(16, (byte) 111, 128, -(8 * var18 / 4096) + (148 + bi.field_I), -(var18 * 8 / 4096) + 300 + uc.field_a);
                            break L35;
                          }
                        } else {
                          break L35;
                        }
                      }
                      if (!mi.a(256, 178 + uc.field_a, 256, -8, bi.field_I - -26)) {
                        break L29;
                      } else {
                        ((lc) this).field_i = var9;
                        ((lc) this).field_m = 5;
                        break L29;
                      }
                    } else {
                      break L29;
                    }
                  }
                  L36: {
                    rm.field_o[10].b(2 + var10, var11);
                    rm.field_o[var9].b(var10 - -2, var11);
                    if (mi.a(65, var11, 65, -8, var10)) {
                      ((lc) this).field_m = 0;
                      ((lc) this).field_i = var9;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  var9++;
                  if (var29 == 0) {
                    continue L11;
                  } else {
                    break L13;
                  }
                }
              }
            }
            boolean discarded$42 = this.a(false, 332, (byte) -71, false, 287 + bi.field_I, 245, 178 + uc.field_a);
            boolean discarded$43 = this.a(true, 284, (byte) 108, false, 21 + bi.field_I + 287, 29, -4 + (178 + uc.field_a));
            int discarded$44 = tj.field_t.a(tc.field_F, 21 + (290 + bi.field_I) + -1, -4 + (uc.field_a - -178 - 1), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
            int discarded$45 = tj.field_t.a(tc.field_F, 311 + bi.field_I, -2 + (178 + uc.field_a) - 4, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
            int discarded$46 = tj.field_t.a(tc.field_F, 290 + (bi.field_I - -21), -5 + uc.field_a + 178, 281, 29, 12569299, -1, param0, 1, tj.field_t.field_C);
            var9 = -1;
            var10 = -1;
            var11 = 0;
            stackOut_118_0 = 0;
            stackIn_119_0 = stackOut_118_0;
            break L12;
          }
          var12 = stackIn_119_0;
          L37: while (true) {
            stackOut_120_0 = ~var12;
            stackIn_121_0 = stackOut_120_0;
            L38: while (true) {
              L39: {
                L40: {
                  if (stackIn_121_0 <= -9) {
                    break L40;
                  } else {
                    stackOut_122_0 = 0;
                    stackIn_213_0 = stackOut_122_0;
                    stackIn_123_0 = stackOut_122_0;
                    if (var29 != 0) {
                      break L39;
                    } else {
                      var13_int = stackIn_123_0;
                      L41: while (true) {
                        L42: {
                          if (var13_int >= 2) {
                            break L42;
                          } else {
                            var14_int = 290 + bi.field_I + 41 * var12;
                            var15 = 209 + (uc.field_a - -(var13_int * 41));
                            boolean discarded$47 = this.a(true, 39, (byte) -104, true, var14_int, 39, var15);
                            var16 = b.field_f[var13_int + 2 * var12];
                            stackOut_125_0 = ~var16;
                            stackIn_121_0 = stackOut_125_0;
                            stackIn_126_0 = stackOut_125_0;
                            if (var29 != 0) {
                              continue L38;
                            } else {
                              L43: {
                                if (stackIn_126_0 == 0) {
                                  break L43;
                                } else {
                                  L44: {
                                    var17_int = 1;
                                    var18 = var16;
                                    var19 = var18 / 12;
                                    de.h(1 + var14_int, var15 + 1, 37 + var14_int, 37 + var15);
                                    if (var18 >= 0) {
                                      L45: {
                                        L46: {
                                          if (var19 != var9) {
                                            break L46;
                                          } else {
                                            if (var9 != -1) {
                                              break L45;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                        var9 = var19;
                                        var11 = 0;
                                        break L45;
                                      }
                                      L47: {
                                        L48: {
                                          if (var18 % 12 >= 10) {
                                            break L48;
                                          } else {
                                            if ((1 & var18) != 1) {
                                              break L47;
                                            } else {
                                              if (var10 != -1 + var18) {
                                                var17_int = 0;
                                                if (var29 == 0) {
                                                  break L47;
                                                } else {
                                                  break L48;
                                                }
                                              } else {
                                                break L47;
                                              }
                                            }
                                          }
                                        }
                                        if (var19 <= 0) {
                                          break L47;
                                        } else {
                                          if (5 > var11) {
                                            var17_int = 0;
                                            break L47;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                      if (var17_int != 0) {
                                        var11++;
                                        var10 = var18;
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    } else {
                                      break L44;
                                    }
                                  }
                                  L49: {
                                    L50: {
                                      if (var17_int != 0) {
                                        break L50;
                                      } else {
                                        bb.field_g[dd.field_f[var16]].f(var14_int + -1, -1 + var15, 64);
                                        de.b(var14_int, var15, var14_int + 32, 32 + var15, 16711680);
                                        de.b(32 + var14_int, var15, var14_int, 32 + var15, 16711680);
                                        b.field_f[var13_int + 2 * var12] = -1;
                                        if (var29 == 0) {
                                          break L49;
                                        } else {
                                          break L50;
                                        }
                                      }
                                    }
                                    bb.field_g[dd.field_f[var16]].c(var14_int + -1, var15 - 1);
                                    break L49;
                                  }
                                  L51: {
                                    L52: {
                                      if (!ArcanistsMulti.i((byte) -62)) {
                                        break L52;
                                      } else {
                                        if (var16 < 22) {
                                          break L51;
                                        } else {
                                          L53: {
                                            if (~bc.field_b != ~var19) {
                                              break L53;
                                            } else {
                                              if (~mf.field_a == ~(-(var19 * 12) + var16)) {
                                                break L51;
                                              } else {
                                                if (-(var19 * 12) + var16 == 1 + mf.field_a) {
                                                  break L51;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                          }
                                          ii.field_d.c(var14_int - 1, -1 + var15, 40, 40, 128);
                                          if (var29 == 0) {
                                            break L51;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                    }
                                    L54: {
                                      if (var16 < 108) {
                                        break L54;
                                      } else {
                                        L55: {
                                          if (ArcanistsMulti.i((byte) -119)) {
                                            break L55;
                                          } else {
                                            if (ad.field_d != 0) {
                                              break L51;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        ii.field_d.c(-1 + var14_int, var15 + -1, 40, 40, 128);
                                        if (var29 == 0) {
                                          break L51;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                    if (var16 >= 22) {
                                      L56: {
                                        if (var19 <= 1) {
                                          break L56;
                                        } else {
                                          if (0L != (cb.field_e & 1L << var19 * 8 + -14)) {
                                            break L56;
                                          } else {
                                            L57: {
                                              if (bc.field_b != var19) {
                                                break L57;
                                              } else {
                                                if (~mf.field_a == ~(-(var19 * 12) + var16)) {
                                                  break L56;
                                                } else {
                                                  if (~(mf.field_a - -1) == ~(var16 + -(var19 * 12))) {
                                                    break L56;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                              }
                                            }
                                            ii.field_d.c(var14_int + -1, -1 + var15, 40, 40, 128);
                                            if (var29 == 0) {
                                              break L51;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                      }
                                      L58: {
                                        if (var18 % 12 >= 10) {
                                          break L58;
                                        } else {
                                          if ((1 & var18) != 1) {
                                            break L51;
                                          } else {
                                            if ((1L << -13 + 8 * var19 + (var18 % 12 - 1) / 2 & cb.field_e) != 0L) {
                                              break L51;
                                            } else {
                                              L59: {
                                                if (~bc.field_b != ~var19) {
                                                  break L59;
                                                } else {
                                                  if (-(var19 * 12) + var16 == 1 + mf.field_a) {
                                                    break L51;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                              }
                                              ii.field_d.c(var14_int - 1, -1 + var15, 40, 40, 128);
                                              if (var29 == 0) {
                                                break L51;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if ((1L << -18 + (var18 % 12 + 8 * var19) & cb.field_e) != 0L) {
                                        break L51;
                                      } else {
                                        ii.field_d.c(-1 + var14_int, -1 + var15, 40, 40, 128);
                                        break L51;
                                      }
                                    } else {
                                      break L51;
                                    }
                                  }
                                  de.a();
                                  if (~an.field_g > ~var14_int) {
                                    break L43;
                                  } else {
                                    if (var15 > me.field_I) {
                                      break L43;
                                    } else {
                                      if (~an.field_g <= ~(var14_int - -39)) {
                                        break L43;
                                      } else {
                                        if (var15 + 39 > me.field_I) {
                                          ((lc) this).field_m = 2;
                                          ((lc) this).field_i = var13_int + 2 * var12;
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var13_int++;
                              if (var29 == 0) {
                                continue L41;
                              } else {
                                break L42;
                              }
                            }
                          }
                        }
                        var12++;
                        if (var29 == 0) {
                          continue L37;
                        } else {
                          break L40;
                        }
                      }
                    }
                  }
                }
                stackOut_212_0 = 0;
                stackIn_213_0 = stackOut_212_0;
                break L39;
              }
              var12 = stackIn_213_0;
              L60: while (true) {
                L61: {
                  L62: {
                    if (var12 >= 128) {
                      break L62;
                    } else {
                      var13_int = 96;
                      var14_double = (double)var12 * 3.141592653589793 * 2.0 / 128.0;
                      var16 = 132 + (bi.field_I + -(int)(Math.cos(var14_double) * (double)var13_int));
                      var17_int = -16 + (122 + (uc.field_a + 178 - (int)((double)var13_int * Math.sin(var14_double))));
                      de.i(var16 - -16, 16 + var17_int, 5, 0);
                      var12++;
                      if (var29 != 0) {
                        break L61;
                      } else {
                        if (var29 == 0) {
                          continue L60;
                        } else {
                          break L62;
                        }
                      }
                    }
                  }
                  var12 = 0;
                  break L61;
                }
                L63: while (true) {
                  L64: {
                    L65: {
                      if (var12 >= 128) {
                        break L65;
                      } else {
                        var13_int = 96;
                        var14_double = 3.141592653589793 * (double)var12 * 2.0 / 128.0;
                        var16 = 122 + (bi.field_I - -32) + (-6 + -(int)(Math.cos(var14_double) * (double)var13_int) + -16);
                        var17_int = 178 + (uc.field_a + 122) - ((int)(Math.sin(var14_double) * (double)var13_int) + 16);
                        de.i(var16 + 16, 16 + var17_int, 4, 10326659);
                        var12++;
                        if (var29 != 0) {
                          break L64;
                        } else {
                          if (var29 == 0) {
                            continue L63;
                          } else {
                            break L65;
                          }
                        }
                      }
                    }
                    var12 = ((lc) this).field_h * 12;
                    var11 = 12;
                    break L64;
                  }
                  L66: {
                    if (var12 < 0) {
                      var11 = var11 + var12;
                      var12 = 0;
                      break L66;
                    } else {
                      break L66;
                    }
                  }
                  var13_int = 0;
                  L67: while (true) {
                    L68: {
                      L69: {
                        if (var13_int >= var11) {
                          break L69;
                        } else {
                          var14_int = 96;
                          var15 = var13_int;
                          var16 = 1;
                          var17_int = 0;
                          var18 = 16;
                          var18--;
                          var19 = 10326659;
                          var15 = var13_int;
                          stackOut_229_0 = -1;
                          stackOut_229_1 = ~var13_int;
                          stackIn_491_0 = stackOut_229_0;
                          stackIn_491_1 = stackOut_229_1;
                          stackIn_230_0 = stackOut_229_0;
                          stackIn_230_1 = stackOut_229_1;
                          if (var29 != 0) {
                            break L68;
                          } else {
                            L70: {
                              if (stackIn_230_0 != stackIn_230_1) {
                                break L70;
                              } else {
                                var15 = 2;
                                break L70;
                              }
                            }
                            L71: {
                              if (var13_int != 1) {
                                break L71;
                              } else {
                                var15 = 4;
                                break L71;
                              }
                            }
                            L72: {
                              if (2 == var13_int) {
                                var15 = 1;
                                break L72;
                              } else {
                                break L72;
                              }
                            }
                            L73: {
                              if (var13_int == 3) {
                                var15 = 5;
                                break L73;
                              } else {
                                break L73;
                              }
                            }
                            L74: {
                              if (4 != var13_int) {
                                break L74;
                              } else {
                                var15 = 0;
                                break L74;
                              }
                            }
                            L75: {
                              if (5 != var13_int) {
                                break L75;
                              } else {
                                var15 = 6;
                                break L75;
                              }
                            }
                            L76: {
                              if (var13_int == 6) {
                                var15 = 11;
                                break L76;
                              } else {
                                break L76;
                              }
                            }
                            L77: {
                              if (var13_int == 7) {
                                var15 = 7;
                                break L77;
                              } else {
                                break L77;
                              }
                            }
                            L78: {
                              if (var13_int != 8) {
                                break L78;
                              } else {
                                var15 = 10;
                                break L78;
                              }
                            }
                            L79: {
                              if (var13_int != 9) {
                                break L79;
                              } else {
                                var15 = 8;
                                break L79;
                              }
                            }
                            L80: {
                              if (var13_int == 10) {
                                var15 = 3;
                                break L80;
                              } else {
                                break L80;
                              }
                            }
                            L81: {
                              if (11 == var13_int) {
                                var15 = 9;
                                break L81;
                              } else {
                                break L81;
                              }
                            }
                            L82: {
                              L83: {
                                if (var13_int < 10) {
                                  break L83;
                                } else {
                                  if (0 >= ((lc) this).field_h) {
                                    break L82;
                                  } else {
                                    var20 = 0;
                                    var21 = 0;
                                    L84: while (true) {
                                      L85: {
                                        L86: {
                                          if (var21 >= 16) {
                                            break L86;
                                          } else {
                                            stackOut_266_0 = var12;
                                            stackOut_266_1 = b.field_f[var21];
                                            stackIn_280_0 = stackOut_266_0;
                                            stackIn_280_1 = stackOut_266_1;
                                            stackIn_267_0 = stackOut_266_0;
                                            stackIn_267_1 = stackOut_266_1;
                                            if (var29 != 0) {
                                              break L85;
                                            } else {
                                              L87: {
                                                if (stackIn_267_0 > stackIn_267_1) {
                                                  break L87;
                                                } else {
                                                  if (~b.field_f[var21] <= ~(10 + var12)) {
                                                    break L87;
                                                  } else {
                                                    L88: {
                                                      if (0 == (1 & b.field_f[var21])) {
                                                        break L88;
                                                      } else {
                                                        if (var21 <= 0) {
                                                          break L87;
                                                        } else {
                                                          if (~(-1 + b.field_f[var21]) != ~b.field_f[-1 + var21]) {
                                                            break L87;
                                                          } else {
                                                            break L88;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var20++;
                                                    break L87;
                                                  }
                                                }
                                              }
                                              var21++;
                                              if (var29 == 0) {
                                                continue L84;
                                              } else {
                                                break L86;
                                              }
                                            }
                                          }
                                        }
                                        var19 = 16744703;
                                        stackOut_279_0 = ~var20;
                                        stackOut_279_1 = -6;
                                        stackIn_280_0 = stackOut_279_0;
                                        stackIn_280_1 = stackOut_279_1;
                                        break L85;
                                      }
                                      L89: {
                                        if (stackIn_280_0 > stackIn_280_1) {
                                          var16 = 0;
                                          break L89;
                                        } else {
                                          break L89;
                                        }
                                      }
                                      L90: {
                                        var18 += 2;
                                        if (0L != (1L << 8 * ((lc) this).field_h - (-(var13_int % 12) - -18) & cb.field_e)) {
                                          break L90;
                                        } else {
                                          if (((lc) this).field_h < 9) {
                                            var17_int = 3;
                                            var16 = 0;
                                            break L90;
                                          } else {
                                            break L90;
                                          }
                                        }
                                      }
                                      if (var29 == 0) {
                                        break L82;
                                      } else {
                                        break L83;
                                      }
                                    }
                                  }
                                }
                              }
                              L91: {
                                if ((var13_int & 1) == 1) {
                                  var20 = 0;
                                  var21 = 0;
                                  L92: while (true) {
                                    L93: {
                                      L94: {
                                        if (var21 >= 16) {
                                          break L94;
                                        } else {
                                          stackOut_294_0 = b.field_f[var21];
                                          stackOut_294_1 = -1 + (var12 + var13_int);
                                          stackIn_301_0 = stackOut_294_0;
                                          stackIn_301_1 = stackOut_294_1;
                                          stackIn_295_0 = stackOut_294_0;
                                          stackIn_295_1 = stackOut_294_1;
                                          if (var29 != 0) {
                                            break L93;
                                          } else {
                                            L95: {
                                              if (stackIn_295_0 == stackIn_295_1) {
                                                var20++;
                                                break L95;
                                              } else {
                                                break L95;
                                              }
                                            }
                                            var21++;
                                            if (var29 == 0) {
                                              continue L92;
                                            } else {
                                              break L94;
                                            }
                                          }
                                        }
                                      }
                                      var18++;
                                      stackOut_300_0 = -1;
                                      stackOut_300_1 = ~var20;
                                      stackIn_301_0 = stackOut_300_0;
                                      stackIn_301_1 = stackOut_300_1;
                                      break L93;
                                    }
                                    L96: {
                                      if (stackIn_301_0 == stackIn_301_1) {
                                        var16 = 0;
                                        break L96;
                                      } else {
                                        break L96;
                                      }
                                    }
                                    var19 = 16711935;
                                    break L91;
                                  }
                                } else {
                                  break L91;
                                }
                              }
                              if (0 >= ((lc) this).field_h) {
                                break L82;
                              } else {
                                if (((lc) this).field_h != 9) {
                                  L97: {
                                    if ((1 & var13_int) != 0) {
                                      break L97;
                                    } else {
                                      if (0L != (1L << -14 + 8 * ((lc) this).field_h & cb.field_e)) {
                                        break L82;
                                      } else {
                                        L98: {
                                          if (~((lc) this).field_h != ~bc.field_b) {
                                            break L98;
                                          } else {
                                            if (mf.field_a == var13_int) {
                                              break L82;
                                            } else {
                                              break L98;
                                            }
                                          }
                                        }
                                        if (1 >= ((lc) this).field_h) {
                                          break L82;
                                        } else {
                                          var16 = 0;
                                          var17_int = 0;
                                          if (var29 == 0) {
                                            break L82;
                                          } else {
                                            break L97;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if ((cb.field_e & 1L << -13 + 8 * ((lc) this).field_h - -((-1 + var13_int) / 2)) != 0L) {
                                    break L82;
                                  } else {
                                    L99: {
                                      if (((lc) this).field_h != bc.field_b) {
                                        break L99;
                                      } else {
                                        if (mf.field_a != -1 + var13_int) {
                                          break L99;
                                        } else {
                                          break L82;
                                        }
                                      }
                                    }
                                    if (((lc) this).field_h > 1) {
                                      var16 = 0;
                                      var17_int = 2;
                                      break L82;
                                    } else {
                                      break L82;
                                    }
                                  }
                                } else {
                                  break L82;
                                }
                              }
                            }
                            L100: {
                              L101: {
                                var20_double = 2.0 * ((double)var15 * 3.141592653589793) / (double)var11;
                                var22 = 122 + (-6 + bi.field_I) + 32 - (int)((double)var14_int * Math.cos(var20_double)) - 16;
                                var23 = 178 + uc.field_a - (-122 - -(int)((double)var14_int * Math.sin(var20_double)) + 16);
                                if (((lc) this).field_h != 9) {
                                  break L101;
                                } else {
                                  L102: {
                                    if (ArcanistsMulti.i((byte) -87)) {
                                      break L102;
                                    } else {
                                      if (ad.field_d > 0) {
                                        break L101;
                                      } else {
                                        break L102;
                                      }
                                    }
                                  }
                                  if (an.field_g < var22) {
                                    break L100;
                                  } else {
                                    if (var23 > me.field_I) {
                                      break L100;
                                    } else {
                                      if (~(var22 - -32) >= ~an.field_g) {
                                        break L100;
                                      } else {
                                        if (~me.field_I <= ~(var23 - -32)) {
                                          break L100;
                                        } else {
                                          ((lc) this).field_i = var13_int + var12;
                                          ((lc) this).field_m = 6;
                                          if (var29 == 0) {
                                            break L100;
                                          } else {
                                            break L101;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L103: {
                                if (var16 != 0) {
                                  break L103;
                                } else {
                                  if (an.field_g < var22) {
                                    break L100;
                                  } else {
                                    if (me.field_I < var23) {
                                      break L100;
                                    } else {
                                      if (~an.field_g <= ~(var22 - -32)) {
                                        break L100;
                                      } else {
                                        if (~me.field_I <= ~(var23 - -32)) {
                                          break L100;
                                        } else {
                                          L104: {
                                            L105: {
                                              L106: {
                                                ((lc) this).field_i = var13_int + var12;
                                                ((lc) this).field_m = 3;
                                                if (10 <= var13_int) {
                                                  ((lc) this).field_m = 4;
                                                  var24 = 0;
                                                  L107: while (true) {
                                                    L108: {
                                                      if (var24 >= 16) {
                                                        break L108;
                                                      } else {
                                                        stackOut_359_0 = var12;
                                                        stackOut_359_1 = b.field_f[var24];
                                                        stackIn_386_0 = stackOut_359_0;
                                                        stackIn_386_1 = stackOut_359_1;
                                                        stackIn_360_0 = stackOut_359_0;
                                                        stackIn_360_1 = stackOut_359_1;
                                                        if (var29 != 0) {
                                                          break L105;
                                                        } else {
                                                          L109: {
                                                            if (stackIn_360_0 > stackIn_360_1) {
                                                              break L109;
                                                            } else {
                                                              if (10 + var12 <= b.field_f[var24]) {
                                                                break L109;
                                                              } else {
                                                                if ((1 & b.field_f[var24]) == 0) {
                                                                  break L109;
                                                                } else {
                                                                  if (var24 <= 0) {
                                                                    break L109;
                                                                  } else {
                                                                    if (~b.field_f[var24 + -1] == ~(b.field_f[var24] - 1)) {
                                                                      break L109;
                                                                    } else {
                                                                      break L109;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var24++;
                                                          if (var29 == 0) {
                                                            continue L107;
                                                          } else {
                                                            break L108;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    ((lc) this).field_i = var12 + var13_int;
                                                    break L106;
                                                  }
                                                } else {
                                                  break L106;
                                                }
                                              }
                                              L110: {
                                                var18 += 2;
                                                if ((cb.field_e & 1L << -14 + ((lc) this).field_h * 8) != 0L) {
                                                  break L110;
                                                } else {
                                                  L111: {
                                                    if (((lc) this).field_h != bc.field_b) {
                                                      break L111;
                                                    } else {
                                                      if (var13_int == mf.field_a) {
                                                        break L110;
                                                      } else {
                                                        if (~var13_int == ~(mf.field_a + 1)) {
                                                          break L110;
                                                        } else {
                                                          break L111;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (((lc) this).field_h <= 1) {
                                                    break L110;
                                                  } else {
                                                    if (((lc) this).field_h >= 9) {
                                                      break L110;
                                                    } else {
                                                      ((lc) this).field_i = var13_int + var12;
                                                      ((lc) this).field_m = 6;
                                                      if (var29 == 0) {
                                                        break L104;
                                                      } else {
                                                        break L110;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_385_0 = ~var17_int;
                                              stackOut_385_1 = -1;
                                              stackIn_386_0 = stackOut_385_0;
                                              stackIn_386_1 = stackOut_385_1;
                                              break L105;
                                            }
                                            if (stackIn_386_0 >= stackIn_386_1) {
                                              break L104;
                                            } else {
                                              if (9 > ((lc) this).field_h) {
                                                ((lc) this).field_m = 7;
                                                ((lc) this).field_i = var12 + var13_int;
                                                if (2 < var17_int) {
                                                  ((lc) this).field_m = 8;
                                                  break L104;
                                                } else {
                                                  break L104;
                                                }
                                              } else {
                                                break L104;
                                              }
                                            }
                                          }
                                          if (((lc) this).field_m == 3) {
                                            var24 = -16 + (32 + (bi.field_I + -6) + 122 + (int)(Math.cos(var20_double) * (double)var14_int));
                                            gn.a((int)(Math.cos((double)jb.field_v * 0.1) * 4.0) + 20, (byte) 105, 128 - -(int)(Math.sin((double)jb.field_v * 0.1) * 64.0), var24 - -16, 16 + var23);
                                            if (var29 == 0) {
                                              break L100;
                                            } else {
                                              break L103;
                                            }
                                          } else {
                                            break L100;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (~an.field_g > ~var22) {
                                break L100;
                              } else {
                                if (me.field_I < var23) {
                                  break L100;
                                } else {
                                  if (var22 + 32 <= an.field_g) {
                                    break L100;
                                  } else {
                                    if (~(var23 - -32) >= ~me.field_I) {
                                      break L100;
                                    } else {
                                      ((lc) this).field_m = 1;
                                      ((lc) this).field_i = var12 + var13_int;
                                      var18 += 4;
                                      break L100;
                                    }
                                  }
                                }
                              }
                            }
                            L112: {
                              L113: {
                                L114: {
                                  de.c(16 + var22, var23 + 16, 8 + var18, 0, 64);
                                  de.i(16 + var22, var23 + 16, 4 + var18, var19);
                                  de.c(16 + var22, 16 + var23, var18 - -4, 0);
                                  de.i(16 + var22, 16 + var23, var18, 13947080);
                                  de.c(var22 + 16, 16 + var23, var18, 0);
                                  if (9 != ((lc) this).field_h) {
                                    break L114;
                                  } else {
                                    L115: {
                                      if (ad.field_d == 0) {
                                        break L115;
                                      } else {
                                        if (!ArcanistsMulti.i((byte) -74)) {
                                          break L114;
                                        } else {
                                          break L115;
                                        }
                                      }
                                    }
                                    bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, -4 + var23, 32);
                                    if (var29 == 0) {
                                      break L113;
                                    } else {
                                      break L114;
                                    }
                                  }
                                }
                                L116: {
                                  if ((cb.field_e & 1L << ((lc) this).field_h * 8 - 14) != 0L) {
                                    break L116;
                                  } else {
                                    if (((lc) this).field_h <= 1) {
                                      break L116;
                                    } else {
                                      if (((lc) this).field_h >= 9) {
                                        break L116;
                                      } else {
                                        if (var16 != 0) {
                                          break L116;
                                        } else {
                                          bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, var23 - 4, 32);
                                          if (var29 == 0) {
                                            break L113;
                                          } else {
                                            break L116;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L117: {
                                  if (var16 != 0) {
                                    break L117;
                                  } else {
                                    L118: {
                                      if (var17_int == 0) {
                                        break L118;
                                      } else {
                                        L119: {
                                          bb.field_g[dd.field_f[var12 + var13_int]].f(-4 + var22, -4 + var23, 32);
                                          var24 = var22 - -16 << -1582940220;
                                          var25_int = 16 + var23 << -1100081116;
                                          if (ArcanistsMulti.i((byte) -102)) {
                                            break L119;
                                          } else {
                                            L120: {
                                              if (var17_int != 3) {
                                                break L120;
                                              } else {
                                                var2.b(80, 320, var24, var25_int, jb.field_v * 30 + -21845, 4096);
                                                var2.b(80, 320, var24, var25_int, jb.field_v * 30, 4096);
                                                var2.b(80, 320, var24, var25_int, 30 * jb.field_v + 21845, 4096);
                                                break L120;
                                              }
                                            }
                                            if (var17_int != 2) {
                                              break L119;
                                            } else {
                                              var2.b(160, 320, var24, var25_int, -16384 + jb.field_v * 30, 4096);
                                              var2.b(160, 320, var24, var25_int, 16384 + 30 * jb.field_v, 4096);
                                              break L119;
                                            }
                                          }
                                        }
                                        if (var29 == 0) {
                                          break L113;
                                        } else {
                                          break L118;
                                        }
                                      }
                                    }
                                    bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, -4 + var23, 32);
                                    if (var29 == 0) {
                                      break L113;
                                    } else {
                                      break L117;
                                    }
                                  }
                                }
                                bb.field_g[dd.field_f[var13_int + var12]].c(-4 + var22, var23 - 4);
                                var24 = 0;
                                var25_int = 0;
                                L121: while (true) {
                                  L122: {
                                    if (var25_int >= 16) {
                                      break L122;
                                    } else {
                                      stackOut_437_0 = b.field_f[var25_int];
                                      stackOut_437_1 = var13_int + var12;
                                      stackIn_445_0 = stackOut_437_0;
                                      stackIn_445_1 = stackOut_437_1;
                                      stackIn_438_0 = stackOut_437_0;
                                      stackIn_438_1 = stackOut_437_1;
                                      if (var29 != 0) {
                                        break L112;
                                      } else {
                                        L123: {
                                          if (stackIn_438_0 != stackIn_438_1) {
                                            break L123;
                                          } else {
                                            var24 = 1;
                                            break L123;
                                          }
                                        }
                                        var25_int++;
                                        if (var29 == 0) {
                                          continue L121;
                                        } else {
                                          break L122;
                                        }
                                      }
                                    }
                                  }
                                  if (var24 == 0) {
                                    break L113;
                                  } else {
                                    gn.a(24, (byte) 63, -128, var22 - -16, var23 - -16);
                                    de.c(var22 - -16, var23 + 16, 24, 0);
                                    break L113;
                                  }
                                }
                              }
                              stackOut_444_0 = 1;
                              stackOut_444_1 = ((lc) this).field_h;
                              stackIn_445_0 = stackOut_444_0;
                              stackIn_445_1 = stackOut_444_1;
                              break L112;
                            }
                            L124: {
                              if (stackIn_445_0 != stackIn_445_1) {
                                break L124;
                              } else {
                                if (10 > var13_int) {
                                  break L124;
                                } else {
                                  if (ArcanistsMulti.i((byte) -84)) {
                                    ii.field_d.c(-4 + var22, var23 - 4, 40, 40, 128);
                                    break L124;
                                  } else {
                                    break L124;
                                  }
                                }
                              }
                            }
                            L125: {
                              if ((cb.field_e & 1L << ((lc) this).field_h * 8 + -14) == 0L) {
                                stackOut_454_0 = 0;
                                stackIn_455_0 = stackOut_454_0;
                                break L125;
                              } else {
                                stackOut_453_0 = 1;
                                stackIn_455_0 = stackOut_453_0;
                                break L125;
                              }
                            }
                            L126: {
                              var24 = stackIn_455_0;
                              if (var16 != 0) {
                                break L126;
                              } else {
                                if (0 >= var17_int) {
                                  break L126;
                                } else {
                                  if (var3 < var17_int) {
                                    break L126;
                                  } else {
                                    L127: {
                                      if (var24 != 0) {
                                        break L127;
                                      } else {
                                        if (((lc) this).field_h != 1) {
                                          break L126;
                                        } else {
                                          break L127;
                                        }
                                      }
                                    }
                                    if (var22 > an.field_g) {
                                      break L126;
                                    } else {
                                      if (var23 > me.field_I) {
                                        break L126;
                                      } else {
                                        if (32 + var22 <= an.field_g) {
                                          break L126;
                                        } else {
                                          if (me.field_I >= 32 + var23) {
                                            break L126;
                                          } else {
                                            if (ArcanistsMulti.i((byte) -125)) {
                                              break L126;
                                            } else {
                                              L128: {
                                                var25 = 3.141592653589793 * (double)(255 & jb.field_v) / 128.0;
                                                var27 = (int)(2048.0 + Math.cos(var25 * 4.0) * 256.0 - 256.0);
                                                var28 = (int)(5000.0 * Math.sin(var25 * 2.0) + 0.0);
                                                if (16 + var22 < 148) {
                                                  break L128;
                                                } else {
                                                  tk.field_x[4].a(var27, var23, -41, 32 + var22, var28);
                                                  gn.a(8, (byte) 126, 128, -(var27 * 8 / 4096) + var22 - -32, var23 + -(8 * var27 / 4096));
                                                  if (var29 == 0) {
                                                    break L126;
                                                  } else {
                                                    break L128;
                                                  }
                                                }
                                              }
                                              tk.field_x[4].a(var27, var23, -4, var22, var28);
                                              gn.a(8, (byte) 118, 128, var22 + -(var27 * 8 / 4096), var23 - 8 * var27 / 4096);
                                              break L126;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L129: {
                              if (~bc.field_b != ~((lc) this).field_h) {
                                break L129;
                              } else {
                                L130: {
                                  L131: {
                                    if (~var13_int != ~mf.field_a) {
                                      break L131;
                                    } else {
                                      if (var24 == 0) {
                                        break L130;
                                      } else {
                                        break L131;
                                      }
                                    }
                                  }
                                  if (mf.field_a - -1 != var13_int) {
                                    break L129;
                                  } else {
                                    if ((1L << (-1 + var13_int) / 2 + -13 + 8 * ((lc) this).field_h & cb.field_e) == 0L) {
                                      break L130;
                                    } else {
                                      break L129;
                                    }
                                  }
                                }
                                var25 = Math.cos(3.141592653589793 * (double)(jb.field_v & 255) / 64.0) * 5.0 + 32.0;
                                var27 = (int)(Math.cos(var20_double) * var25) + (16 + var22);
                                var28 = (int)(var25 * Math.sin(var20_double)) + 16 + var23;
                                tk.field_x[10].a(2048, var28, 120, var27, 0);
                                break L129;
                              }
                            }
                            var13_int++;
                            if (var29 == 0) {
                              continue L67;
                            } else {
                              break L69;
                            }
                          }
                        }
                      }
                      stackOut_490_0 = -2;
                      stackOut_490_1 = ~((lc) this).field_h;
                      stackIn_491_0 = stackOut_490_0;
                      stackIn_491_1 = stackOut_490_1;
                      break L68;
                    }
                    L132: {
                      if (stackIn_491_0 <= stackIn_491_1) {
                        break L132;
                      } else {
                        if (!ArcanistsMulti.i((byte) -127)) {
                          break L132;
                        } else {
                          if (((lc) this).field_h >= 9) {
                            break L132;
                          } else {
                            var13_int = 122 + (bi.field_I + 26);
                            var14_int = 178 + (uc.field_a + 122);
                            ii.field_d.c(-64 + var13_int, -64 + var14_int, 128);
                            break L132;
                          }
                        }
                      }
                    }
                    L133: {
                      if (9 != ((lc) this).field_h) {
                        break L133;
                      } else {
                        L134: {
                          if (ad.field_d <= 0) {
                            break L134;
                          } else {
                            if (!ArcanistsMulti.i((byte) -60)) {
                              break L133;
                            } else {
                              break L134;
                            }
                          }
                        }
                        var13_int = 148 + bi.field_I;
                        var14_int = uc.field_a + 178 + 122;
                        ii.field_d.c(var13_int + -64, -64 + var14_int, 128);
                        break L133;
                      }
                    }
                    L135: {
                      L136: {
                        if (((lc) this).field_m == 1) {
                          break L136;
                        } else {
                          if (6 == ((lc) this).field_m) {
                            break L136;
                          } else {
                            if (7 == ((lc) this).field_m) {
                              break L136;
                            } else {
                              if (((lc) this).field_m == 8) {
                                break L136;
                              } else {
                                if (((lc) this).field_m == 2) {
                                  if (((lc) this).field_i < 0) {
                                    break L135;
                                  } else {
                                    if (((lc) this).field_i >= 16) {
                                      break L135;
                                    } else {
                                      if (b.field_f[((lc) this).field_i] != -1) {
                                        L137: {
                                          L138: {
                                            L139: {
                                              var13_int = b.field_f[((lc) this).field_i];
                                              var14 = tc.field_w[var13_int];
                                              var15_ref_String = vm.field_d[var13_int];
                                              var16 = bi.field_I + 301;
                                              var17_int = -1 + (uc.field_a + 303);
                                              if (!ArcanistsMulti.i((byte) -91)) {
                                                break L139;
                                              } else {
                                                if (var13_int < 22) {
                                                  break L139;
                                                } else {
                                                  if (~(var13_int / 12) != ~bc.field_b) {
                                                    break L138;
                                                  } else {
                                                    if (~(-(var13_int / 12 * 12) + var13_int) == ~mf.field_a) {
                                                      break L139;
                                                    } else {
                                                      if (var13_int - 12 * (var13_int / 12) != 1 + mf.field_a) {
                                                        break L138;
                                                      } else {
                                                        break L139;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            int discarded$48 = tj.field_t.a(var14, 10 + (var16 + -1), var17_int, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                            int discarded$49 = tj.field_t.a(var14, 10 + var16, var17_int + -1, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                            int discarded$50 = tj.field_t.a(var14, var16 - -10, var17_int, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                            if (var29 == 0) {
                                              break L137;
                                            } else {
                                              break L138;
                                            }
                                          }
                                          int discarded$51 = mi.field_B.a(var14, var16 - 1, var17_int, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                          int discarded$52 = mi.field_B.a(var14, var16, -1 + var17_int, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                          int discarded$53 = mi.field_B.a(var14, var16, var17_int, 141, 29, 12569299, -1, 1, 1, mi.field_B.field_C);
                                          int discarded$54 = mi.field_B.a(qe.field_r, 447, 294, 171, 29, 16711680, 0, 1, 1, mi.field_B.field_C);
                                          break L137;
                                        }
                                        int discarded$55 = mi.field_B.a(var15_ref_String, 8 + (290 + bi.field_I), uc.field_a - -340 - 8, 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                                        if (var29 == 0) {
                                          break L135;
                                        } else {
                                          break L136;
                                        }
                                      } else {
                                        break L135;
                                      }
                                    }
                                  }
                                } else {
                                  L140: {
                                    var13 = vl.field_l;
                                    if (0 < ((lc) this).field_h) {
                                      var13 = tn.field_Ib;
                                      if (((lc) this).field_h != 9) {
                                        break L140;
                                      } else {
                                        L141: {
                                          if (ad.field_d == 0) {
                                            break L141;
                                          } else {
                                            if (ArcanistsMulti.i((byte) -77)) {
                                              break L141;
                                            } else {
                                              break L140;
                                            }
                                          }
                                        }
                                        var13 = vn.field_j;
                                        break L140;
                                      }
                                    } else {
                                      break L140;
                                    }
                                  }
                                  L142: {
                                    L143: {
                                      L144: {
                                        if (~an.field_g > ~(bi.field_I + 557)) {
                                          break L144;
                                        } else {
                                          if (~(uc.field_a + 51) > ~me.field_I) {
                                            break L144;
                                          } else {
                                            if (!ArcanistsMulti.i((byte) -50)) {
                                              break L143;
                                            } else {
                                              break L144;
                                            }
                                          }
                                        }
                                      }
                                      L145: {
                                        if (((lc) this).field_m == 0) {
                                          break L145;
                                        } else {
                                          L146: {
                                            if (3 == ((lc) this).field_m) {
                                              break L146;
                                            } else {
                                              L147: {
                                                if (((lc) this).field_m == 4) {
                                                  break L147;
                                                } else {
                                                  if (((lc) this).field_m != 5) {
                                                    break L142;
                                                  } else {
                                                    L148: {
                                                      var13 = "You Should NEVER EVER EVER SEE THIS!!!";
                                                      var14 = gd.field_qb;
                                                      if (Math.abs(((lc) this).field_h) != 2) {
                                                        break L148;
                                                      } else {
                                                        var13 = sb.field_d + var3;
                                                        var14 = io.field_z;
                                                        break L148;
                                                      }
                                                    }
                                                    L149: {
                                                      if (3 == Math.abs(((lc) this).field_h)) {
                                                        var13 = ec.field_h + var3;
                                                        var14 = df.field_x;
                                                        break L149;
                                                      } else {
                                                        break L149;
                                                      }
                                                    }
                                                    L150: {
                                                      if (Math.abs(((lc) this).field_h) == 4) {
                                                        var14 = fh.field_d;
                                                        var13 = ie.field_Jb + var3;
                                                        break L150;
                                                      } else {
                                                        break L150;
                                                      }
                                                    }
                                                    L151: {
                                                      if (Math.abs(((lc) this).field_h) == 5) {
                                                        var14 = ad.field_g;
                                                        var13 = jk.field_v + var3;
                                                        break L151;
                                                      } else {
                                                        break L151;
                                                      }
                                                    }
                                                    L152: {
                                                      if (6 != Math.abs(((lc) this).field_h)) {
                                                        break L152;
                                                      } else {
                                                        var14 = ej.field_M;
                                                        var13 = wd.field_k + var3;
                                                        break L152;
                                                      }
                                                    }
                                                    L153: {
                                                      if (7 != Math.abs(((lc) this).field_h)) {
                                                        break L153;
                                                      } else {
                                                        var13 = dg.field_q + var3;
                                                        var14 = nf.field_e;
                                                        break L153;
                                                      }
                                                    }
                                                    L154: {
                                                      if (Math.abs(((lc) this).field_h) != 8) {
                                                        break L154;
                                                      } else {
                                                        var14 = oo.field_r;
                                                        var13 = q.field_H + var3;
                                                        break L154;
                                                      }
                                                    }
                                                    int discarded$56 = tj.field_t.a(var14, 290 + (bi.field_I + 21 - 1), 302 + uc.field_a, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                    int discarded$57 = tj.field_t.a(var14, 290 + bi.field_I + 21, -2 + (303 + uc.field_a), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                    int discarded$58 = tj.field_t.a(var14, bi.field_I + 311, uc.field_a - -302, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                    var13 = "";
                                                    var15 = 300 + bi.field_I;
                                                    var16 = uc.field_a - -336;
                                                    int discarded$59 = mi.field_B.a(aj.field_b, var15, var16, 70, 32, 0, -1, 1, 1, mi.field_B.field_C);
                                                    var15 += 74;
                                                    var17_int = 0;
                                                    L155: while (true) {
                                                      L156: {
                                                        L157: {
                                                          L158: {
                                                            if (5 <= var17_int) {
                                                              break L158;
                                                            } else {
                                                              stackOut_553_0 = ~var17_int;
                                                              stackOut_553_1 = ~var3;
                                                              stackIn_563_0 = stackOut_553_0;
                                                              stackIn_563_1 = stackOut_553_1;
                                                              stackIn_554_0 = stackOut_553_0;
                                                              stackIn_554_1 = stackOut_553_1;
                                                              if (var29 != 0) {
                                                                break L157;
                                                              } else {
                                                                L159: {
                                                                  L160: {
                                                                    if (stackIn_554_0 > stackIn_554_1) {
                                                                      break L160;
                                                                    } else {
                                                                      tg.field_b[7].a(var15, var16, 64, 0);
                                                                      if (var29 == 0) {
                                                                        break L159;
                                                                      } else {
                                                                        break L160;
                                                                      }
                                                                    }
                                                                  }
                                                                  tg.field_b[7].a(var15, var16);
                                                                  break L159;
                                                                }
                                                                var15 += 9;
                                                                var17_int++;
                                                                if (var29 == 0) {
                                                                  continue L155;
                                                                } else {
                                                                  break L158;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L161: {
                                                            if (!ArcanistsMulti.i((byte) -90)) {
                                                              break L161;
                                                            } else {
                                                              var13 = nf.field_yb;
                                                              if (var29 == 0) {
                                                                break L156;
                                                              } else {
                                                                break L161;
                                                              }
                                                            }
                                                          }
                                                          stackOut_562_0 = var3;
                                                          stackOut_562_1 = 5;
                                                          stackIn_563_0 = stackOut_562_0;
                                                          stackIn_563_1 = stackOut_562_1;
                                                          break L157;
                                                        }
                                                        L162: {
                                                          if (stackIn_563_0 < stackIn_563_1) {
                                                            break L162;
                                                          } else {
                                                            var13 = ij.field_Ob;
                                                            if (var29 == 0) {
                                                              break L156;
                                                            } else {
                                                              break L162;
                                                            }
                                                          }
                                                        }
                                                        var13 = mb.field_R;
                                                        break L156;
                                                      }
                                                      int discarded$60 = mi.field_B.a(var13, 440 + bi.field_I, var16, 170, 32, 0, -1, 1, 1, mi.field_B.field_C);
                                                      var13 = "";
                                                      if (var29 == 0) {
                                                        break L142;
                                                      } else {
                                                        break L147;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L163: {
                                                var14 = tc.field_w[((lc) this).field_i];
                                                int discarded$61 = tj.field_t.a(var14, 290 + bi.field_I - -21 - 1, -1 + uc.field_a - -303, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                int discarded$62 = tj.field_t.a(var14, 21 + (bi.field_I + 290), 303 + (uc.field_a + -2), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                int discarded$63 = tj.field_t.a(var14, 290 + (bi.field_I + 21), 303 + uc.field_a - 1, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                var15_ref_String = gd.field_qb;
                                                if (((lc) this).field_h != 2) {
                                                  break L163;
                                                } else {
                                                  var15_ref_String = io.field_z;
                                                  break L163;
                                                }
                                              }
                                              L164: {
                                                if (3 != ((lc) this).field_h) {
                                                  break L164;
                                                } else {
                                                  var15_ref_String = df.field_x;
                                                  break L164;
                                                }
                                              }
                                              L165: {
                                                if (((lc) this).field_h == 4) {
                                                  var15_ref_String = fh.field_d;
                                                  break L165;
                                                } else {
                                                  break L165;
                                                }
                                              }
                                              L166: {
                                                if (5 != ((lc) this).field_h) {
                                                  break L166;
                                                } else {
                                                  var15_ref_String = ad.field_g;
                                                  break L166;
                                                }
                                              }
                                              L167: {
                                                if (((lc) this).field_h != 6) {
                                                  break L167;
                                                } else {
                                                  var15_ref_String = ej.field_M;
                                                  break L167;
                                                }
                                              }
                                              L168: {
                                                if (((lc) this).field_h == 7) {
                                                  var15_ref_String = nf.field_e;
                                                  break L168;
                                                } else {
                                                  break L168;
                                                }
                                              }
                                              L169: {
                                                if (((lc) this).field_h == 8) {
                                                  var15_ref_String = oo.field_r;
                                                  break L169;
                                                } else {
                                                  break L169;
                                                }
                                              }
                                              L170: {
                                                if (((lc) this).field_h != 9) {
                                                  break L170;
                                                } else {
                                                  var15_ref_String = j.field_c;
                                                  break L170;
                                                }
                                              }
                                              var16 = 0;
                                              var17_int = 0;
                                              L171: while (true) {
                                                L172: {
                                                  L173: {
                                                    if (16 <= var17_int) {
                                                      break L173;
                                                    } else {
                                                      stackOut_588_0 = b.field_f[var17_int];
                                                      stackOut_588_1 = ((lc) this).field_h * 12;
                                                      stackIn_596_0 = stackOut_588_0;
                                                      stackIn_596_1 = stackOut_588_1;
                                                      stackIn_589_0 = stackOut_588_0;
                                                      stackIn_589_1 = stackOut_588_1;
                                                      if (var29 != 0) {
                                                        break L172;
                                                      } else {
                                                        L174: {
                                                          if (stackIn_589_0 < stackIn_589_1) {
                                                            break L174;
                                                          } else {
                                                            if (10 + 12 * ((lc) this).field_h < b.field_f[var17_int]) {
                                                              break L174;
                                                            } else {
                                                              var16++;
                                                              break L174;
                                                            }
                                                          }
                                                        }
                                                        var17_int++;
                                                        if (var29 == 0) {
                                                          continue L171;
                                                        } else {
                                                          break L173;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_595_0 = 116;
                                                  stackOut_595_1 = 2;
                                                  stackIn_596_0 = stackOut_595_0;
                                                  stackIn_596_1 = stackOut_595_1;
                                                  break L172;
                                                }
                                                String[] array$64 = new String[stackIn_596_1];
                                                array$64[0] = var15_ref_String;
                                                array$64[1] = Integer.toString(var16);
                                                var13 = tj.a(stackIn_596_0, array$64, vl.field_k);
                                                if (var29 == 0) {
                                                  break L142;
                                                } else {
                                                  break L146;
                                                }
                                              }
                                            }
                                          }
                                          var14 = tc.field_w[((lc) this).field_i];
                                          int discarded$65 = tj.field_t.a(var14, bi.field_I - -310, -1 + (uc.field_a + 303), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                          int discarded$66 = tj.field_t.a(var14, 21 + bi.field_I + 290, 303 + (uc.field_a - 2), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                          int discarded$67 = tj.field_t.a(var14, 21 + bi.field_I - -290, -1 + (303 + uc.field_a), 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                          var13 = tj.a(param0 + 126, new String[1], jf.field_f);
                                          if (var29 == 0) {
                                            break L142;
                                          } else {
                                            break L145;
                                          }
                                        }
                                      }
                                      L175: {
                                        var14 = ee.field_c;
                                        var13 = ld.field_k;
                                        if (Math.abs(((lc) this).field_i) == 1) {
                                          var13 = j.field_b;
                                          var14 = gd.field_qb;
                                          break L175;
                                        } else {
                                          break L175;
                                        }
                                      }
                                      L176: {
                                        if (2 != Math.abs(((lc) this).field_i)) {
                                          break L176;
                                        } else {
                                          var14 = io.field_z;
                                          var13 = ri.field_d;
                                          break L176;
                                        }
                                      }
                                      L177: {
                                        if (Math.abs(((lc) this).field_i) != 3) {
                                          break L177;
                                        } else {
                                          var13 = hm.field_d;
                                          var14 = df.field_x;
                                          break L177;
                                        }
                                      }
                                      L178: {
                                        if (Math.abs(((lc) this).field_i) != 4) {
                                          break L178;
                                        } else {
                                          var13 = tk.field_r;
                                          var14 = fh.field_d;
                                          break L178;
                                        }
                                      }
                                      L179: {
                                        if (Math.abs(((lc) this).field_i) == 5) {
                                          var13 = pk.field_g;
                                          var14 = ad.field_g;
                                          break L179;
                                        } else {
                                          break L179;
                                        }
                                      }
                                      L180: {
                                        if (6 == Math.abs(((lc) this).field_i)) {
                                          var13 = gi.field_f;
                                          var14 = ej.field_M;
                                          break L180;
                                        } else {
                                          break L180;
                                        }
                                      }
                                      L181: {
                                        if (Math.abs(((lc) this).field_i) != 7) {
                                          break L181;
                                        } else {
                                          var14 = nf.field_e;
                                          var13 = tk.field_w;
                                          break L181;
                                        }
                                      }
                                      L182: {
                                        if (Math.abs(((lc) this).field_i) == 8) {
                                          var13 = mi.field_s;
                                          var14 = oo.field_r;
                                          break L182;
                                        } else {
                                          break L182;
                                        }
                                      }
                                      L183: {
                                        if (Math.abs(((lc) this).field_i) != 9) {
                                          break L183;
                                        } else {
                                          var13 = uk.field_f;
                                          var14 = j.field_c;
                                          break L183;
                                        }
                                      }
                                      int discarded$68 = tj.field_t.a(var14, -1 + (311 + bi.field_I), -1 + (303 + uc.field_a), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                      int discarded$69 = tj.field_t.a(var14, 290 + (bi.field_I + 21), 303 + uc.field_a + -2, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                      int discarded$70 = tj.field_t.a(var14, 21 + (bi.field_I - -290), 303 + (uc.field_a + -1), 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                      if (var29 == 0) {
                                        break L142;
                                      } else {
                                        break L143;
                                      }
                                    }
                                    var13 = "";
                                    var14_int = bi.field_I - -300;
                                    var15 = 340 + uc.field_a;
                                    this.a(var15, var3, var14_int, 113);
                                    break L142;
                                  }
                                  L184: {
                                    if (153 > jf.field_j) {
                                      break L184;
                                    } else {
                                      if (ad.field_d >= 10) {
                                        break L184;
                                      } else {
                                        var14_int = 308 + (bi.field_I + ad.field_d * 32);
                                        var15 = 400 + uc.field_a;
                                        if (~an.field_g > ~(-16 + var14_int)) {
                                          break L184;
                                        } else {
                                          if (~an.field_g < ~(16 + var14_int)) {
                                            break L184;
                                          } else {
                                            if (me.field_I < -16 + var15) {
                                              break L184;
                                            } else {
                                              if (me.field_I > var15 - -16) {
                                                break L184;
                                              } else {
                                                ((lc) this).field_m = 9;
                                                break L184;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L185: {
                                    L186: {
                                      L187: {
                                        if (tn.field_Ib == var13) {
                                          break L187;
                                        } else {
                                          if (var13 != vl.field_l) {
                                            break L186;
                                          } else {
                                            break L187;
                                          }
                                        }
                                      }
                                      if (153 > jf.field_j) {
                                        break L186;
                                      } else {
                                        if (10 <= ad.field_d) {
                                          break L186;
                                        } else {
                                          L188: {
                                            var13 = ti.field_F;
                                            if (((lc) this).field_m != 9) {
                                              break L188;
                                            } else {
                                              var13 = vh.field_h;
                                              var14_int = 250 + ad.field_d * 250;
                                              var13 = var13 + tj.a(param0 ^ -50, new String[1], ck.field_e);
                                              break L188;
                                            }
                                          }
                                          int discarded$71 = mi.field_B.a(var13, bi.field_I + 302, 116 + (178 + uc.field_a), 299, 129, 0, -1, 1, 0, mi.field_B.field_C);
                                          var14_int = 0;
                                          L189: while (true) {
                                            L190: {
                                              if (var14_int >= 10) {
                                                break L190;
                                              } else {
                                                var15 = 308 + bi.field_I - -(var14_int * 32);
                                                var16 = uc.field_a - -400;
                                                if (var29 != 0) {
                                                  break L185;
                                                } else {
                                                  L191: {
                                                    L192: {
                                                      if (~ad.field_d <= ~var14_int) {
                                                        break L192;
                                                      } else {
                                                        vd.field_b.f(var15 + -15, -16 + var16);
                                                        if (var29 == 0) {
                                                          break L191;
                                                        } else {
                                                          break L192;
                                                        }
                                                      }
                                                    }
                                                    L193: {
                                                      de.c(var15, -1 + var16, 14, 16711680);
                                                      de.c(var15 + -1, var16, 14, 16711680);
                                                      de.c(var15, var16 - -1, 14, 8912896);
                                                      de.c(1 + var15, var16, 14, 8912896);
                                                      de.c(var15, var16, 14, 0, 128);
                                                      de.c(var15, var16, 14, 16744576);
                                                      if (ad.field_d != var14_int) {
                                                        break L193;
                                                      } else {
                                                        L194: {
                                                          rb.field_o[var14_int].a(var15 + -15, -(rb.field_o[var14_int].field_y / 2) + (var16 - rb.field_o[var14_int].field_o), 0);
                                                          if (~(var15 - 16) < ~an.field_g) {
                                                            break L194;
                                                          } else {
                                                            if (an.field_g > 16 + var15) {
                                                              break L194;
                                                            } else {
                                                              if (~(-16 + var16) < ~me.field_I) {
                                                                break L194;
                                                              } else {
                                                                if (var16 + 16 < me.field_I) {
                                                                  break L194;
                                                                } else {
                                                                  var17_double = (double)(jb.field_v & 255) * 3.141592653589793 / 128.0;
                                                                  var19 = (int)(-256.0 + (Math.cos(4.0 * var17_double) * 256.0 + 4096.0)) / 2;
                                                                  var20 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var17_double));
                                                                  tk.field_x[4].a(var15, var16, var20, var19);
                                                                  gn.a(8, (byte) 71, 128, var15 - var19 * 8 / 4096, var16 + -(8 * var19 / 4096));
                                                                  if (var29 == 0) {
                                                                    break L191;
                                                                  } else {
                                                                    break L194;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var17_double = 3.141592653589793 * (double)(255 & jb.field_v) / 128.0;
                                                        var19 = (int)(-256.0 + (256.0 * Math.cos(var17_double * 4.0) + 4096.0)) / 2;
                                                        var20 = (int)(5000.0 * Math.sin(2.0 * var17_double) + 0.0);
                                                        tk.field_x[4].a(var15, var16, var20, var19);
                                                        de.c(var15, var16, 33 * var19 / 4096, 0, 128);
                                                        gn.a(8, (byte) 99, 128, -(var19 * 8 / 4096) + var15, var16 - var19 * 8 / 4096);
                                                        de.c(var15, var16, var19 * 32 / 4096, 0, 128);
                                                        if (var29 == 0) {
                                                          break L191;
                                                        } else {
                                                          break L193;
                                                        }
                                                      }
                                                    }
                                                    rb.field_o[var14_int].d(var15 + -15, -rb.field_o[var14_int].field_o + (var16 - rb.field_o[var14_int].field_y / 2), 16711680);
                                                    break L191;
                                                  }
                                                  var14_int++;
                                                  if (var29 == 0) {
                                                    continue L189;
                                                  } else {
                                                    break L190;
                                                  }
                                                }
                                              }
                                            }
                                            if (var29 == 0) {
                                              break L185;
                                            } else {
                                              break L186;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    int discarded$72 = mi.field_B.a(var13, 12 + (290 + bi.field_I), 294 + uc.field_a, 299, 129, 0, -1, 1, 1, mi.field_B.field_C);
                                    break L185;
                                  }
                                  break L135;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (~((lc) this).field_i > ~var12) {
                        break L135;
                      } else {
                        L195: {
                          L196: {
                            var13 = tc.field_w[((lc) this).field_i];
                            var14 = vm.field_d[((lc) this).field_i];
                            var15 = 11 + bi.field_I - -290;
                            var16 = 302 + uc.field_a;
                            if (1 != ((lc) this).field_m) {
                              break L196;
                            } else {
                              int discarded$73 = tj.field_t.a(var13, var15 + -1, var16, 301, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                              int discarded$74 = tj.field_t.a(var13, var15, -1 + var16, 301, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                              int discarded$75 = tj.field_t.a(var13, var15, var16, 301, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                              if (var29 == 0) {
                                break L195;
                              } else {
                                break L196;
                              }
                            }
                          }
                          L197: {
                            int discarded$76 = mi.field_B.a(var13, -1 + var15, var16, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                            int discarded$77 = mi.field_B.a(var13, var15, -1 + var16, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                            int discarded$78 = mi.field_B.a(var13, var15, var16, 141, 29, 12569299, -1, 1, 1, mi.field_B.field_C);
                            var17 = null;
                            var18 = 16711680;
                            if (!ArcanistsMulti.i((byte) -101)) {
                              if (((lc) this).field_m != 6) {
                                if (((lc) this).field_m == 7) {
                                  if (var3 >= 2) {
                                    var18 = 65280;
                                    var17 = (Object) (Object) gi.field_l;
                                    break L197;
                                  } else {
                                    var17 = (Object) (Object) (jk.field_d + var3 + "/2)");
                                    break L197;
                                  }
                                } else {
                                  if (((lc) this).field_m != 8) {
                                    break L197;
                                  } else {
                                    if (3 > var3) {
                                      var17 = (Object) (Object) (jk.field_d + var3 + "/3)");
                                      break L197;
                                    } else {
                                      var18 = 65280;
                                      var17 = (Object) (Object) ej.field_P;
                                      break L197;
                                    }
                                  }
                                }
                              } else {
                                var17 = (Object) (Object) ra.field_i;
                                if (9 == ((lc) this).field_h) {
                                  var17 = (Object) (Object) vf.field_h;
                                  break L197;
                                } else {
                                  break L197;
                                }
                              }
                            } else {
                              var17 = (Object) (Object) gg.field_g;
                              break L197;
                            }
                          }
                          int discarded$79 = mi.field_B.a((String) var17, 163 + var15 - 22, var16, 141, 29, var18, 0, 1, 1, mi.field_B.field_C);
                          break L195;
                        }
                        int discarded$80 = mi.field_B.a(var14, -3 + var15, 340 + (uc.field_a - 8), 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                        break L135;
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        try {
          L0: {
            L1: {
              if (7 == ((lc) this).field_l) {
                L2: {
                  if (param1 != 0) {
                    break L2;
                  } else {
                    if (fh.field_e != 0) {
                      break L2;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
                if (param1 != 2) {
                  break L1;
                } else {
                  if (~fh.field_e == ~(gd.field_kb.length - 1)) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (14 != ((lc) this).field_l) {
                break L3;
              } else {
                L4: {
                  if (param1 != 0) {
                    break L4;
                  } else {
                    if (mj.field_p != 0) {
                      break L4;
                    } else {
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0 != 0;
                    }
                  }
                }
                if (param1 != 1) {
                  break L3;
                } else {
                  if (7 == mj.field_p) {
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0 != 0;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if (((lc) this).field_l != 3) {
              L5: {
                if (param0 == -46) {
                  break L5;
                } else {
                  field_c = null;
                  break L5;
                }
              }
              stackOut_48_0 = 1;
              stackIn_49_0 = stackOut_48_0;
              break L0;
            } else {
              L6: {
                L7: {
                  if (1 == param1) {
                    break L7;
                  } else {
                    if (jb.field_z == null) {
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                stackOut_41_0 = 1;
                stackIn_44_0 = stackOut_41_0;
                break L6;
              }
              return stackIn_44_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_49_0 != 0;
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (td.e(true)) {
                L2: {
                  if (!ri.field_b[82]) {
                    break L2;
                  } else {
                    if (ri.field_b[28]) {
                      gj.a(false, true, 10, mn.field_r);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!ri.field_b[82]) {
                    break L3;
                  } else {
                    if (!ri.field_b[70]) {
                      break L3;
                    } else {
                      ah.field_c = 1;
                      break L3;
                    }
                  }
                }
                if (si.field_g != 12) {
                  break L1;
                } else {
                  L4: {
                    if (vn.field_d != 26) {
                      break L4;
                    } else {
                      if (ua.field_P >= jf.field_j) {
                        break L4;
                      } else {
                        jf.field_j = jf.field_j - 1;
                        break L4;
                      }
                    }
                  }
                  if (vn.field_d != 27) {
                    break L1;
                  } else {
                    if (jf.field_j >= 153) {
                      break L1;
                    } else {
                      jf.field_j = jf.field_j + 1;
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L5: {
              if (param0 > 42) {
                break L5;
              } else {
                ((lc) this).field_g = null;
                break L5;
              }
            }
            L6: {
              if (si.field_g != 12) {
                break L6;
              } else {
                L7: {
                  if (vn.field_d != 96) {
                    break L7;
                  } else {
                    ((lc) this).field_d = ((lc) this).field_d - 1;
                    break L7;
                  }
                }
                if (vn.field_d == 97) {
                  ((lc) this).field_d = ((lc) this).field_d + 1;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              L9: {
                if (si.field_g == 8) {
                  break L9;
                } else {
                  L10: {
                    if (si.field_g != 7) {
                      break L10;
                    } else {
                      this.b(false);
                      if (var3 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (si.field_g != 6) {
                        break L12;
                      } else {
                        if (!lc.a((byte) 112)) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (si.field_g != 14) {
                      L13: {
                        if (si.field_g == 10) {
                          break L13;
                        } else {
                          ((lc) this).field_g.a((byte) -76);
                          if (var3 == 0) {
                            break L8;
                          } else {
                            break L13;
                          }
                        }
                      }
                      ((lc) this).field_g.a(-100, 0);
                      if (var3 == 0) {
                        break L8;
                      } else {
                        break L11;
                      }
                    } else {
                      if (vn.field_d == 96) {
                        L14: {
                          if (!this.a((byte) -46, 0)) {
                            break L14;
                          } else {
                            ((lc) this).field_g.a(0, false);
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          if (vn.field_d == 97) {
                            break L15;
                          } else {
                            L16: {
                              if (vn.field_d != 98) {
                                break L16;
                              } else {
                                L17: {
                                  var2_int = -1 + ((lc) this).field_g.field_h;
                                  if (var2_int != 1) {
                                    break L17;
                                  } else {
                                    if (this.a((byte) -46, 1)) {
                                      break L17;
                                    } else {
                                      var2_int--;
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (var2_int != 0) {
                                    break L18;
                                  } else {
                                    if (!this.a((byte) -46, 0)) {
                                      var2_int--;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  if (var2_int < 0) {
                                    var2_int = ((lc) this).field_g.field_f + -1;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                ((lc) this).field_g.a(var2_int, false);
                                if (var3 == 0) {
                                  break L8;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            L20: {
                              if (vn.field_d == 99) {
                                break L20;
                              } else {
                                ((lc) this).field_g.a((byte) -76);
                                if (var3 == 0) {
                                  break L8;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            L21: {
                              var2_int = ((lc) this).field_g.field_h - -1;
                              if (~var2_int <= ~((lc) this).field_g.field_f) {
                                var2_int = 0;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            L22: {
                              if (var2_int != 0) {
                                break L22;
                              } else {
                                if (!this.a((byte) -46, 0)) {
                                  var2_int++;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              if (var2_int != 1) {
                                break L23;
                              } else {
                                if (!this.a((byte) -46, 1)) {
                                  var2_int++;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            ((lc) this).field_g.a(var2_int, false);
                            if (var3 == 0) {
                              break L8;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L24: {
                          if (!this.a((byte) -46, 1)) {
                            break L24;
                          } else {
                            ((lc) this).field_g.a(1, false);
                            break L24;
                          }
                        }
                        return;
                      }
                    }
                  }
                  this.c((byte) -92);
                  if (var3 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L25: {
                if (vn.field_d != 96) {
                  break L25;
                } else {
                  if (((lc) this).field_g.field_h < 3) {
                    ((lc) this).field_g.field_h = ((lc) this).field_g.field_h - 1;
                    if (0 > ((lc) this).field_g.field_h) {
                      ((lc) this).field_g.field_h = 2;
                      break L25;
                    } else {
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
              }
              L26: {
                if (97 == vn.field_d) {
                  if (((lc) this).field_g.field_h < 3) {
                    ((lc) this).field_g.field_h = ((lc) this).field_g.field_h + 1;
                    if (((lc) this).field_g.field_h <= 2) {
                      break L26;
                    } else {
                      ((lc) this).field_g.field_h = 0;
                      break L26;
                    }
                  } else {
                    break L26;
                  }
                } else {
                  break L26;
                }
              }
              L27: {
                L28: {
                  if (vn.field_d == 98) {
                    break L28;
                  } else {
                    if (vn.field_d == 99) {
                      break L28;
                    } else {
                      break L27;
                    }
                  }
                }
                L29: {
                  if (((lc) this).field_g.field_h != 3) {
                    break L29;
                  } else {
                    ((lc) this).field_g.field_h = 1;
                    if (var3 == 0) {
                      break L27;
                    } else {
                      break L29;
                    }
                  }
                }
                if (((lc) this).field_g.field_f != 4) {
                  break L27;
                } else {
                  ((lc) this).field_g.field_h = 3;
                  break L27;
                }
              }
              ((lc) this).field_g.d(-101);
              break L8;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "lc.EA(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            if (((lc) this).field_l != 6) {
              if (((lc) this).field_l == 7) {
                stackOut_14_0 = param0 * 200 + 20;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                L1: {
                  if (((lc) this).field_l == 11) {
                    if (param0 != 0) {
                      if (param0 != 1) {
                        break L1;
                      } else {
                        stackOut_23_0 = 304;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      }
                    } else {
                      stackOut_20_0 = 33;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  } else {
                    break L1;
                  }
                }
                if (((lc) this).field_l == 12) {
                  if (param0 == 0) {
                    stackOut_31_0 = 26;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0;
                  } else {
                    if (param0 != 1) {
                      stackOut_36_0 = param0 * 220 + lm.field_e[((lc) this).field_l];
                      stackIn_37_0 = stackOut_36_0;
                      return stackIn_37_0;
                    } else {
                      stackOut_34_0 = 287;
                      stackIn_35_0 = stackOut_34_0;
                      return stackIn_35_0;
                    }
                  }
                } else {
                  L2: {
                    if (((lc) this).field_l == 14) {
                      if (wl.field_L[((lc) this).field_l][param0] != 25) {
                        if (wl.field_L[((lc) this).field_l][param0] != 26) {
                          if (29 != wl.field_L[((lc) this).field_l][param0]) {
                            if (7 == wl.field_L[((lc) this).field_l][param0]) {
                              stackOut_63_0 = 220;
                              stackIn_64_0 = stackOut_63_0;
                              return stackIn_64_0;
                            } else {
                              break L2;
                            }
                          } else {
                            stackOut_58_0 = 220;
                            stackIn_59_0 = stackOut_58_0;
                            return stackIn_59_0;
                          }
                        } else {
                          L3: {
                            if (this.a((byte) -46, 0)) {
                              stackOut_55_0 = 320;
                              stackIn_56_0 = stackOut_55_0;
                              break L3;
                            } else {
                              stackOut_53_0 = 220;
                              stackIn_56_0 = stackOut_53_0;
                              break L3;
                            }
                          }
                          return stackIn_56_0;
                        }
                      } else {
                        L4: {
                          if (!this.a((byte) -46, 1)) {
                            stackOut_47_0 = 220;
                            stackIn_48_0 = stackOut_47_0;
                            break L4;
                          } else {
                            stackOut_45_0 = 120;
                            stackIn_48_0 = stackOut_45_0;
                            break L4;
                          }
                        }
                        return stackIn_48_0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (((lc) this).field_l == 3) {
                    stackOut_68_0 = 80;
                    stackIn_69_0 = stackOut_68_0;
                    return stackIn_69_0;
                  } else {
                    if (((lc) this).field_l != 9) {
                      L5: {
                        if (((lc) this).field_l != 8) {
                          break L5;
                        } else {
                          if (param0 != 0) {
                            if (1 == param0) {
                              stackOut_82_0 = 220;
                              stackIn_83_0 = stackOut_82_0;
                              return stackIn_83_0;
                            } else {
                              if (param0 == 2) {
                                stackOut_87_0 = 420;
                                stackIn_88_0 = stackOut_87_0;
                                return stackIn_88_0;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            stackOut_77_0 = 20;
                            stackIn_78_0 = stackOut_77_0;
                            return stackIn_78_0;
                          }
                        }
                      }
                      L6: {
                        if (param1 == 200) {
                          break L6;
                        } else {
                          field_q = null;
                          break L6;
                        }
                      }
                      stackOut_92_0 = lm.field_e[((lc) this).field_l];
                      stackIn_93_0 = stackOut_92_0;
                      break L0;
                    } else {
                      stackOut_71_0 = 200;
                      stackIn_72_0 = stackOut_71_0;
                      return stackIn_72_0;
                    }
                  }
                }
              }
            } else {
              if (!lc.a((byte) 112)) {
                L7: {
                  if (param0 < 2) {
                    stackOut_9_0 = param0 * 150 + 20;
                    stackIn_10_0 = stackOut_9_0;
                    break L7;
                  } else {
                    stackOut_7_0 = 320;
                    stackIn_10_0 = stackOut_7_0;
                    break L7;
                  }
                }
                return stackIn_10_0;
              } else {
                stackOut_4_0 = 160;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.IA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_93_0;
    }

    private final void a(int param0, int param1, String param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        String stackOut_27_0 = null;
        String stackOut_25_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10_int = param1 - (-param3 - param7);
              if (var10_int == 0) {
                break L1;
              } else {
                param3 = (200 * param3 - -var10_int) / (var10_int * 2);
                param7 = (200 * param7 - -var10_int) / (2 * var10_int);
                param1 = (param1 * 200 + var10_int) / (var10_int * 2);
                break L1;
              }
            }
            L2: {
              if (param0 != 0) {
                L3: {
                  stackOut_6_0 = 45 + bi.field_I;
                  stackOut_6_1 = param8 + -22;
                  stackOut_6_2 = 550;
                  stackOut_6_3 = 26;
                  stackOut_6_4 = param0;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  stackIn_9_2 = stackOut_6_2;
                  stackIn_9_3 = stackOut_6_3;
                  stackIn_9_4 = stackOut_6_4;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  stackIn_7_4 = stackOut_6_4;
                  if (param0 == 16777215) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = stackIn_9_2;
                    stackOut_9_3 = stackIn_9_3;
                    stackOut_9_4 = stackIn_9_4;
                    stackOut_9_5 = 32;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    stackIn_10_5 = stackOut_9_5;
                    break L3;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = stackIn_7_2;
                    stackOut_7_3 = stackIn_7_3;
                    stackOut_7_4 = stackIn_7_4;
                    stackOut_7_5 = 128;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_10_2 = stackOut_7_2;
                    stackIn_10_3 = stackOut_7_3;
                    stackIn_10_4 = stackOut_7_4;
                    stackIn_10_5 = stackOut_7_5;
                    break L3;
                  }
                }
                de.e(stackIn_10_0, stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5);
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              param8 -= 4;
              param0 = 0;
              if (-1 == param5) {
                break L4;
              } else {
                mi.field_B.c(param5 - -1 + ". ", 60 + (bi.field_I + 30), param8, param0, -1);
                break L4;
              }
            }
            L5: {
              var11 = param2;
              if (param6 < -92) {
                break L5;
              } else {
                ((lc) this).field_h = -20;
                break L5;
              }
            }
            var12 = var11.length();
            L6: while (true) {
              L7: {
                L8: {
                  if (175 >= mi.field_B.b(var11)) {
                    break L8;
                  } else {
                    var11 = param2.substring(0, var12) + "...";
                    var12--;
                    if (var13 != 0) {
                      break L7;
                    } else {
                      if (var13 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                mi.field_B.a(var11, 90 + bi.field_I, param8, param0, -1);
                var11 = Integer.toString(param4);
                mi.field_B.b(var11, no.field_tb[0] + bi.field_I, param8, param0, -1);
                break L7;
              }
              L9: {
                if (500 <= var10_int) {
                  stackOut_27_0 = "500+";
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                } else {
                  stackOut_25_0 = Integer.toString(var10_int);
                  stackIn_28_0 = stackOut_25_0;
                  break L9;
                }
              }
              var11 = stackIn_28_0;
              mi.field_B.b(var11, bi.field_I - -no.field_tb[1], param8, param0, -1);
              var11 = param1 + "%";
              mi.field_B.b(var11, bi.field_I + no.field_tb[2], param8, param0, -1);
              var11 = param3 + "%";
              mi.field_B.b(var11, bi.field_I + no.field_tb[3], param8, param0, -1);
              var11 = param7 + "%";
              mi.field_B.b(var11, bi.field_I + no.field_tb[4], param8, param0, -1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var10 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var10;
            stackOut_30_1 = new StringBuilder().append("lc.B(").append(param0).append(',').append(param1).append(',');
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
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((lc) this).field_g = null;
                break L1;
              }
            }
            L2: {
              if (!this.a((byte) -46, 0)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_8_0;
              if (this.a((byte) -46, 2)) {
                stackOut_11_0 = 2;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_12_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var3 = stackIn_12_0;
              if (!((lc) this).field_g.c((byte) 84)) {
                L5: {
                  if (96 == vn.field_d) {
                    L6: {
                      if (~((lc) this).field_g.field_h < ~var2_int) {
                        break L6;
                      } else {
                        ((lc) this).field_g.a(var3, false);
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ((lc) this).field_g.a(((lc) this).field_g.field_h + -1, param0);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (vn.field_d == 97) {
                  L7: {
                    L8: {
                      if (0 > ((lc) this).field_g.field_h) {
                        break L8;
                      } else {
                        if (~((lc) this).field_g.field_h > ~var3) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((lc) this).field_g.a(var2_int, false);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L7;
                    }
                  }
                  ((lc) this).field_g.a(1 + ((lc) this).field_g.field_h, false);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L9: {
              ((lc) this).field_g.d(51);
              if (this.a((byte) -46, 0)) {
                stackOut_39_0 = 0;
                stackIn_40_0 = stackOut_39_0;
                break L9;
              } else {
                stackOut_37_0 = 1;
                stackIn_40_0 = stackOut_37_0;
                break L9;
              }
            }
            L10: {
              var2_int = stackIn_40_0;
              if (!this.a((byte) -46, 2)) {
                stackOut_43_0 = 1;
                stackIn_44_0 = stackOut_43_0;
                break L10;
              } else {
                stackOut_41_0 = 2;
                stackIn_44_0 = stackOut_41_0;
                break L10;
              }
            }
            L11: {
              var3 = stackIn_44_0;
              if (var2_int <= ((lc) this).field_g.field_h) {
                break L11;
              } else {
                ((lc) this).field_g.field_h = var2_int;
                break L11;
              }
            }
            L12: {
              if (var3 < ((lc) this).field_g.field_h) {
                ((lc) this).field_g.field_h = var3;
                break L12;
              } else {
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "lc.LA(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        le var2 = null;
        int var2_int = 0;
        int var3 = 0;
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
        qb var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        int[] stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int[] stackIn_24_0 = null;
        int[] stackIn_25_0 = null;
        int[] stackIn_26_0 = null;
        int[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int[] stackIn_30_0 = null;
        int[] stackIn_31_0 = null;
        int[] stackIn_32_0 = null;
        int[] stackIn_33_0 = null;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        boolean stackIn_126_0 = false;
        Object stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        Object stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        Object stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        Object stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        int stackIn_135_0 = 0;
        int[] stackOut_21_0 = null;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int[] stackOut_22_0 = null;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int[] stackOut_23_0 = null;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int[] stackOut_29_0 = null;
        int[] stackOut_31_0 = null;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        boolean stackOut_125_0 = false;
        Object stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        Object stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        Object stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        int stackOut_130_2 = 0;
        int stackOut_134_0 = 0;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        if (cc.c((byte) 118)) {
          pb.a(2341);
          return;
        } else {
          if (param0 == -45) {
            L0: {
              if (lc.a((byte) 112)) {
                break L0;
              } else {
                if (0 < ah.field_c) {
                  ce.field_g[15] = wj.field_e;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (((lc) this).field_l == 16) {
              de.b();
              to.field_s.b((byte) -102);
              return;
            } else {
              L1: {
                L2: {
                  if (((lc) this).field_l == 5) {
                    break L2;
                  } else {
                    if (((lc) this).field_l == 3) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var2 = jb.field_z;
                  if (var2 != null) {
                    break L3;
                  } else {
                    var2 = r.field_b;
                    break L3;
                  }
                }
                L4: {
                  var3 = var2.field_V.d(false);
                  if (var3 >= 0) {
                    break L4;
                  } else {
                    var3 = 6;
                    break L4;
                  }
                }
                L5: {
                  stackOut_21_0 = nj.field_n;
                  stackIn_26_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (((lc) this).field_l == 3) {
                    stackOut_26_0 = (int[]) (Object) stackIn_26_0;
                    stackOut_26_1 = var3;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L5;
                  } else {
                    stackOut_22_0 = (int[]) (Object) stackIn_22_0;
                    stackIn_25_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var2.field_I >= 0) {
                      stackOut_25_0 = (int[]) (Object) stackIn_25_0;
                      stackOut_25_1 = var2.field_I;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      break L5;
                    } else {
                      stackOut_23_0 = (int[]) (Object) stackIn_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      stackOut_24_0 = (int[]) (Object) stackIn_24_0;
                      stackOut_24_1 = 6;
                      stackIn_27_0 = stackOut_24_0;
                      stackIn_27_1 = stackOut_24_1;
                      break L5;
                    }
                  }
                }
                L6: {
                  var4 = stackIn_27_0[stackIn_27_1];
                  if (var2.field_V.field_d) {
                    L7: {
                      stackOut_29_0 = nj.field_n;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_30_0 = stackOut_29_0;
                      if (((lc) this).field_l != 3) {
                        stackOut_31_0 = (int[]) (Object) stackIn_31_0;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_32_0 = stackOut_31_0;
                        if (var2.field_I >= 0) {
                          stackOut_33_0 = (int[]) (Object) stackIn_33_0;
                          stackOut_33_1 = 1 & var3;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          break L7;
                        } else {
                          stackOut_32_0 = (int[]) (Object) stackIn_32_0;
                          stackOut_32_1 = 6;
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_34_1 = stackOut_32_1;
                          break L7;
                        }
                      } else {
                        stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                        stackOut_30_1 = 1 & var3;
                        stackIn_34_0 = stackOut_30_0;
                        stackIn_34_1 = stackOut_30_1;
                        break L7;
                      }
                    }
                    var4 = stackIn_34_0[stackIn_34_1];
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var5 = 240;
                var6 = an.field_f / 2;
                var7 = an.field_j / 2;
                var8 = -var5;
                L8: while (true) {
                  L9: {
                    if (var8 >= var5) {
                      break L9;
                    } else {
                      de.h(0, var8 + var7, an.field_f, var8 + var7 + 1);
                      de.c(var6, -4 + -(var8 / 2) + var7, var5, var4, 192);
                      gn.a(var5, (byte) 126, 100, var6, -(var8 / 2) + (var7 - 4));
                      var8++;
                      if (var21 != 0) {
                        break L1;
                      } else {
                        if (var21 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  de.a();
                  break L1;
                }
              }
              L10: {
                L11: {
                  L12: {
                    if (((lc) this).field_l == 1) {
                      break L12;
                    } else {
                      if (((lc) this).field_l == 2) {
                        break L12;
                      } else {
                        if (((lc) this).field_l != 4) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  ti.field_N = -1;
                  var2_int = 0;
                  L13: while (true) {
                    if (var2_int >= 256) {
                      break L11;
                    } else {
                      de.e(0, var2_int, an.field_f, 0, -var2_int + 256);
                      var2_int++;
                      if (var21 != 0) {
                        break L10;
                      } else {
                        if (var21 == 0) {
                          continue L13;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
                if (14 == ((lc) this).field_l) {
                  break L10;
                } else {
                  L14: {
                    L15: {
                      ce.field_m.a(true);
                      if (qn.a(((lc) this).field_l, (byte) -32)) {
                        break L15;
                      } else {
                        L16: {
                          if (640 < an.field_f) {
                            break L16;
                          } else {
                            if (480 >= an.field_j) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        sc.a(param0 ^ -47, an.field_j, an.field_f);
                        if (var21 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (0 != (jb.field_v & 63)) {
                      break L14;
                    } else {
                      pn.field_c = null;
                      break L14;
                    }
                  }
                  L17: {
                    if (15 == ((lc) this).field_l) {
                      break L17;
                    } else {
                      L18: {
                        if (null != wm.field_H[((lc) this).field_l]) {
                          break L18;
                        } else {
                          lj.a(true, ((lc) this).field_l);
                          ce.field_m.a(true);
                          if (var21 == 0) {
                            break L10;
                          } else {
                            break L18;
                          }
                        }
                      }
                      wm.field_H[((lc) this).field_l].c(bi.field_I, uc.field_a);
                      if (var21 == 0) {
                        break L10;
                      } else {
                        break L17;
                      }
                    }
                  }
                  wm.field_H[0].c(bi.field_I, uc.field_a);
                  break L10;
                }
              }
              L19: {
                if (((lc) this).field_l == 9) {
                  L20: {
                    var2_int = (jb.field_v >> 1237709284) % 4;
                    var3 = jb.field_v / 2 % 2400;
                    if (var3 >= 1200) {
                      break L20;
                    } else {
                      var4 = var3 - 200;
                      var4 = an.field_f * var4 / 640;
                      var5 = 0;
                      L21: while (true) {
                        L22: {
                          if (var5 >= 3) {
                            break L22;
                          } else {
                            rc.field_d[var2_int].a(-(120 * var5) + var4, var5 * 30 + 240, 32);
                            var5++;
                            if (var21 != 0) {
                              break L19;
                            } else {
                              if (var21 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                        if (var21 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                  }
                  rc.field_d[var2_int].c();
                  var4 = -var3 + 2200;
                  var4 = an.field_f * var4 / 640;
                  var5 = 0;
                  L23: while (true) {
                    L24: {
                      if (3 <= var5) {
                        break L24;
                      } else {
                        rc.field_d[var2_int].a(-(var5 * 120) + var4, -(30 * var5) + 200, 32);
                        var5++;
                        if (var21 != 0) {
                          break L19;
                        } else {
                          if (var21 == 0) {
                            continue L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    rc.field_d[var2_int].c();
                    break L19;
                  }
                } else {
                  break L19;
                }
              }
              L25: {
                L26: {
                  if (((lc) this).field_l == 1) {
                    break L26;
                  } else {
                    if (2 == ((lc) this).field_l) {
                      break L26;
                    } else {
                      if (4 == ((lc) this).field_l) {
                        break L26;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
                gl.a(sc.field_U[((lc) this).field_l] * wl.field_L[((lc) this).field_l].length + 48, -24 + this.d(41, 0), -27327, 48 - (-this.a(0, (byte) 103) + this.d(41, 0)), kf.field_b, this.f(0, -7661) + -24);
                break L25;
              }
              L27: {
                var2 = jb.field_z;
                if (var2 != null) {
                  break L27;
                } else {
                  var2 = r.field_b;
                  break L27;
                }
              }
              L28: {
                if (((lc) this).field_l != 2) {
                  break L28;
                } else {
                  if (var2.field_V.d(false) == var2.field_I) {
                    L29: {
                      var3 = 0;
                      var4 = 0;
                      var5 = 0;
                      var6 = 0;
                      var7 = 16;
                      var8 = 0;
                      var9 = -16;
                      var10 = 0;
                      var11 = 0;
                      var12 = var2.field_z / 50;
                      var13 = (-var12 + 160) / 10;
                      if (var13 < 0) {
                        var13 = 0;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      var10 = (int)(Math.cos(0.3 * (double)jb.field_v) * (double)var13 - (double)var13);
                      var8 = (int)(Math.cos(5.0 + 0.3 * (double)jb.field_v) * (double)var13 - (double)var13);
                      var14 = 16;
                      if (var12 < 60) {
                        var14 = 17;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (30 <= var12) {
                        break L31;
                      } else {
                        var11 = var11 - (int)((double)var13 * Math.cos((double)jb.field_v * 0.4) - (double)var13);
                        var14 = 18;
                        break L31;
                      }
                    }
                    L32: {
                      var15 = 32;
                      var16 = 160;
                      var17 = new qb(128, 256);
                      var17.a();
                      pc.a(kg.field_d[2], -var11 + var16 + var8, kg.field_d[3], kg.field_d[0], (byte) -116, kg.field_d[1], qe.field_i[so.field_c[3]], var7 + var15);
                      if (46 == so.field_c[0]) {
                        break L32;
                      } else {
                        pc.a(kg.field_d[2], -(var11 / 2) + var4 + var16, kg.field_d[3], kg.field_d[0], (byte) -81, kg.field_d[1], fn.field_b[0], var3 + var15);
                        break L32;
                      }
                    }
                    L33: {
                      pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 68, kg.field_d[1], jd.field_j[so.field_c[0]], var15);
                      var16 -= 8;
                      var16 -= 16;
                      pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 43, kg.field_d[1], kc.field_kb[so.field_c[1]], var15);
                      var16 += 16;
                      pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 45, kg.field_d[1], hn.field_d[so.field_c[5]], var15);
                      if (53 == so.field_c[5]) {
                        break L33;
                      } else {
                        if (so.field_c[5] == 55) {
                          break L33;
                        } else {
                          pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) -125, kg.field_d[1], bo.field_a[var14], var15);
                          break L33;
                        }
                      }
                    }
                    L34: {
                      var16 -= 16;
                      pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 2, kg.field_d[1], tj.field_A[so.field_c[4]], var15);
                      var16 += 8;
                      var16 += 16;
                      if (so.field_c[0] == 46) {
                        break L34;
                      } else {
                        pc.a(kg.field_d[2], var16 + (var6 + -(var11 / 2)), kg.field_d[3], kg.field_d[0], (byte) -92, kg.field_d[1], h.field_I[0], var15 + var5);
                        break L34;
                      }
                    }
                    L35: {
                      pc.a(kg.field_d[2], var10 + (var16 - var11), kg.field_d[3], kg.field_d[0], (byte) -111, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var15);
                      ce.field_m.a(true);
                      var18 = an.field_f - 256;
                      var19 = an.field_j + -128;
                      de.e(var18, var19, 256, 128, 0, 192);
                      de.a(-2 + var18, -2 + var19, 256, 128, 0);
                      de.a(-1 + var18, var19 - 1, 256, 128, 4799269);
                      de.a(var18, var19, 256, 128, 8547138);
                      de.a(var18 - -1, var19 - -1, 256, 128, 11768360);
                      de.a(2 + var18, 2 + var19, 256, 128, 0);
                      var20 = null;
                      if (var12 >= 60) {
                        if (var12 % 60 >= 10) {
                          var20_ref = var12 / 60 + ":" + var12 % 60;
                          break L35;
                        } else {
                          var20_ref = var12 / 60 + ":0" + var12 % 60;
                          break L35;
                        }
                      } else {
                        var20_ref = Integer.toString(var12);
                        break L35;
                      }
                    }
                    var20_ref = tj.a(param0 + 1, new String[1], im.field_i);
                    var17.e(152 + var18, var19 + -104);
                    int discarded$2 = mi.field_B.a(var20_ref, 8 + var18, 8 + var19, 176, 112, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L36: {
                L37: {
                  if (13 != ((lc) this).field_l) {
                    var3 = 0;
                    L38: while (true) {
                      if (var3 >= ((lc) this).field_g.field_f) {
                        break L37;
                      } else {
                        stackOut_125_0 = this.a((byte) -46, var3);
                        stackIn_135_0 = stackOut_125_0 ? 1 : 0;
                        stackIn_126_0 = stackOut_125_0;
                        if (var21 != 0) {
                          break L36;
                        } else {
                          L39: {
                            if (!stackIn_126_0) {
                              break L39;
                            } else {
                              L40: {
                                stackOut_128_0 = this;
                                stackOut_128_1 = 98;
                                stackIn_131_0 = stackOut_128_0;
                                stackIn_131_1 = stackOut_128_1;
                                stackIn_129_0 = stackOut_128_0;
                                stackIn_129_1 = stackOut_128_1;
                                if (((lc) this).field_g.field_h != var3) {
                                  stackOut_131_0 = this;
                                  stackOut_131_1 = stackIn_131_1;
                                  stackOut_131_2 = 0;
                                  stackIn_132_0 = stackOut_131_0;
                                  stackIn_132_1 = stackOut_131_1;
                                  stackIn_132_2 = stackOut_131_2;
                                  break L40;
                                } else {
                                  stackOut_129_0 = this;
                                  stackOut_129_1 = stackIn_129_1;
                                  stackIn_130_0 = stackOut_129_0;
                                  stackIn_130_1 = stackOut_129_1;
                                  stackOut_130_0 = this;
                                  stackOut_130_1 = stackIn_130_1;
                                  stackOut_130_2 = 1;
                                  stackIn_132_0 = stackOut_130_0;
                                  stackIn_132_1 = stackOut_130_1;
                                  stackIn_132_2 = stackOut_130_2;
                                  break L40;
                                }
                              }
                              this.a((byte) stackIn_132_1, stackIn_132_2 != 0, var3);
                              break L39;
                            }
                          }
                          var3++;
                          if (var21 == 0) {
                            continue L38;
                          } else {
                            break L37;
                          }
                        }
                      }
                    }
                  } else {
                    break L37;
                  }
                }
                stackOut_134_0 = ~((lc) this).field_l;
                stackIn_135_0 = stackOut_134_0;
                break L36;
              }
              L41: {
                if (stackIn_135_0 != -1) {
                  break L41;
                } else {
                  this.c(-26733);
                  break L41;
                }
              }
              L42: {
                L43: {
                  if (((lc) this).field_l != 6) {
                    break L43;
                  } else {
                    this.d(true);
                    if (var21 == 0) {
                      break L42;
                    } else {
                      break L43;
                    }
                  }
                }
                L44: {
                  if (((lc) this).field_l == 7) {
                    break L44;
                  } else {
                    L45: {
                      if (((lc) this).field_l != 8) {
                        break L45;
                      } else {
                        this.e(true);
                        if (var21 == 0) {
                          break L42;
                        } else {
                          break L45;
                        }
                      }
                    }
                    L46: {
                      if (((lc) this).field_l != 9) {
                        break L46;
                      } else {
                        int discarded$3 = mi.field_B.a(jm.field_b, bi.field_I + 80, uc.field_a + 140, 480, 180, 0, -1, 0, 1, 30);
                        if (var21 == 0) {
                          break L42;
                        } else {
                          break L46;
                        }
                      }
                    }
                    L47: {
                      if (11 == ((lc) this).field_l) {
                        break L47;
                      } else {
                        L48: {
                          if (12 == ((lc) this).field_l) {
                            break L48;
                          } else {
                            L49: {
                              if (((lc) this).field_l != 14) {
                                break L49;
                              } else {
                                this.a(1);
                                if (var21 == 0) {
                                  break L42;
                                } else {
                                  break L49;
                                }
                              }
                            }
                            L50: {
                              if (((lc) this).field_l == 5) {
                                break L50;
                              } else {
                                if (3 != ((lc) this).field_l) {
                                  break L42;
                                } else {
                                  this.a(true);
                                  if (var21 == 0) {
                                    break L42;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                            }
                            this.h(32);
                            if (var21 == 0) {
                              break L42;
                            } else {
                              break L48;
                            }
                          }
                        }
                        this.e(1);
                        if (var21 == 0) {
                          break L42;
                        } else {
                          break L47;
                        }
                      }
                    }
                    this.i(12);
                    if (var21 == 0) {
                      break L42;
                    } else {
                      break L44;
                    }
                  }
                }
                this.b((byte) 89);
                break L42;
              }
              L51: {
                L52: {
                  if (((lc) this).field_l == 0) {
                    break L52;
                  } else {
                    if (((lc) this).field_l == 15) {
                      break L52;
                    } else {
                      if (((lc) this).field_l == 13) {
                        break L52;
                      } else {
                        break L51;
                      }
                    }
                  }
                }
                var3 = -208 + an.field_f;
                var4 = an.field_j + -40;
                var5 = 200 * (wn.field_C + jo.field_c + be.field_f) / 127;
                var6 = 11176106;
                var7 = 34;
                if (200 > var5) {
                  de.h(var3, var4, var3 + var5, var4 - -32);
                  de.b(var3, var4, 200, 32, 15, var6, var7);
                  mi.field_B.b(pi.field_e, var3 - -100, var4 + 19, 16777215, 0);
                  de.h(var5 + var3, var4, 200 + var3, var4 + 32);
                  de.b(var3, var4, 200, 32, 15, var6 >> 593151617 & 8355711, var7);
                  mi.field_B.b(pi.field_e, var3 - -100, var4 - -19, 0, 16777215);
                  de.a();
                  de.a(var3, var4, 200, 32, 15, 0);
                  break L51;
                } else {
                  break L51;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void c(boolean param0) {
        try {
            field_q = null;
            field_a = null;
            field_o = null;
            field_r = null;
            field_c = null;
            field_e = null;
            field_k = null;
            field_j = null;
            field_p = null;
            if (!param0) {
                boolean discarded$0 = lc.a((byte) -10);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "lc.BA(" + param0 + ')');
        }
    }

    private final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 103) {
              stackOut_3_0 = this.a(-9, param0) + bi.field_I;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void g(int param0) {
        try {
            int discarded$22 = mi.field_B.a(hg.field_c, 64 + bi.field_I, 128 + uc.field_a, 512, 224, 0, -1, 1, 1, mi.field_B.field_m + mi.field_B.field_C);
            if (param0 != 12) {
                boolean discarded$23 = lc.a((byte) -6);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "lc.W(" + param0 + ')');
        }
    }

    private final boolean g(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3_int = param0 / 8;
            if (~wd.field_d < ~var3_int) {
              var4 = 7 - (7 & param0);
              if (param1 != (1 << var4 & ra.field_f[var3_int])) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (2 > qf.field_d) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    private final void c(byte param0) {
        try {
            int var2_int = -61 % ((-38 - param0) / 46);
            ((lc) this).field_g.a(82, 2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "lc.H(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_7_0 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (((lc) this).field_l == 10) {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param0 == 88) {
                var4_int = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~wl.field_L[((lc) this).field_l].length >= ~var4_int) {
                        break L3;
                      } else {
                        var5 = this.f(var4_int, param0 ^ -7605);
                        stackOut_11_0 = this.a((byte) -46, var4_int);
                        stackIn_33_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (!stackIn_12_0) {
                              break L4;
                            } else {
                              if (param1 < this.d(41, var4_int)) {
                                break L4;
                              } else {
                                if (this.a(var4_int, (byte) 103) <= param1) {
                                  break L4;
                                } else {
                                  if (~var5 < ~param2) {
                                    break L4;
                                  } else {
                                    if (param2 < var5 - -this.c(var4_int, 113)) {
                                      stackOut_29_0 = var4_int;
                                      stackIn_30_0 = stackOut_29_0;
                                      return stackIn_30_0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var4_int++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_32_0 = -1;
                    stackIn_33_0 = stackOut_32_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = 124;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "lc.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_33_0;
    }

    private final int e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            if (((lc) this).field_l == 15) {
              stackOut_3_0 = 75 + (param0 * sc.field_U[((lc) this).field_l] + tg.field_f[((lc) this).field_l]);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (2 == ((lc) this).field_l) {
                  break L1;
                } else {
                  if (((lc) this).field_l == 4) {
                    break L1;
                  } else {
                    if (((lc) this).field_l != 1) {
                      if (((lc) this).field_l != 6) {
                        if (((lc) this).field_l != 7) {
                          if (((lc) this).field_l != 11) {
                            if (12 != ((lc) this).field_l) {
                              L2: {
                                if (param1 == 75) {
                                  break L2;
                                } else {
                                  this.g(-100);
                                  break L2;
                                }
                              }
                              L3: {
                                if (((lc) this).field_l != 14) {
                                  break L3;
                                } else {
                                  if (wl.field_L[((lc) this).field_l][param0] == 25) {
                                    stackOut_40_0 = 348;
                                    stackIn_41_0 = stackOut_40_0;
                                    return stackIn_41_0;
                                  } else {
                                    if (wl.field_L[((lc) this).field_l][param0] != 26) {
                                      if (wl.field_L[((lc) this).field_l][param0] == 30) {
                                        stackOut_48_0 = 412;
                                        stackIn_49_0 = stackOut_48_0;
                                        return stackIn_49_0;
                                      } else {
                                        if (29 == wl.field_L[((lc) this).field_l][param0]) {
                                          stackOut_53_0 = 380;
                                          stackIn_54_0 = stackOut_53_0;
                                          return stackIn_54_0;
                                        } else {
                                          if (wl.field_L[((lc) this).field_l][param0] != 7) {
                                            break L3;
                                          } else {
                                            stackOut_56_0 = 444;
                                            stackIn_57_0 = stackOut_56_0;
                                            return stackIn_57_0;
                                          }
                                        }
                                      }
                                    } else {
                                      stackOut_43_0 = 348;
                                      stackIn_44_0 = stackOut_43_0;
                                      return stackIn_44_0;
                                    }
                                  }
                                }
                              }
                              if (((lc) this).field_l != 3) {
                                if (((lc) this).field_l != 8) {
                                  stackOut_79_0 = tg.field_f[((lc) this).field_l] + param0 * sc.field_U[((lc) this).field_l];
                                  stackIn_80_0 = stackOut_79_0;
                                  break L0;
                                } else {
                                  if (param0 == 3) {
                                    stackOut_75_0 = tg.field_f[((lc) this).field_l];
                                    stackIn_76_0 = stackOut_75_0;
                                    return stackIn_76_0;
                                  } else {
                                    stackOut_77_0 = tg.field_f[((lc) this).field_l] + sc.field_U[((lc) this).field_l];
                                    stackIn_78_0 = stackOut_77_0;
                                    return stackIn_78_0;
                                  }
                                }
                              } else {
                                L4: {
                                  if (param0 != 1) {
                                    break L4;
                                  } else {
                                    if (jb.field_z != null) {
                                      break L4;
                                    } else {
                                      stackOut_65_0 = 410 + sc.field_U[((lc) this).field_l] / 2;
                                      stackIn_66_0 = stackOut_65_0;
                                      return stackIn_66_0;
                                    }
                                  }
                                }
                                stackOut_67_0 = 410 - -(param0 * sc.field_U[((lc) this).field_l]);
                                stackIn_68_0 = stackOut_67_0;
                                return stackIn_68_0;
                              }
                            } else {
                              stackOut_29_0 = tg.field_f[((lc) this).field_l];
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          } else {
                            stackOut_26_0 = tg.field_f[((lc) this).field_l];
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          }
                        } else {
                          stackOut_23_0 = tg.field_f[((lc) this).field_l];
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      } else {
                        if (lc.a((byte) 112)) {
                          stackOut_20_0 = sc.field_U[((lc) this).field_l] * param0 + tg.field_f[((lc) this).field_l];
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          stackOut_18_0 = sc.field_U[((lc) this).field_l] + tg.field_f[((lc) this).field_l];
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackOut_12_0 = -32 + (param0 + -wl.field_L[((lc) this).field_l].length) * sc.field_U[((lc) this).field_l] - -480;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "lc.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_80_0;
    }

    lc(int param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        ((lc) this).field_d = 0;
        try {
          L0: {
            L1: {
              L2: {
                ((lc) this).field_l = param0;
                if (null == wl.field_L[((lc) this).field_l]) {
                  break L2;
                } else {
                  ((lc) this).field_g = new so(wl.field_L[((lc) this).field_l].length);
                  if (!ArcanistsMulti.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((lc) this).field_g = null;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "lc.<init>(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        hf var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        hf stackIn_69_0 = null;
        hf stackIn_70_0 = null;
        hf stackIn_72_0 = null;
        hf stackIn_74_0 = null;
        hf stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        int stackIn_172_0 = 0;
        int stackIn_172_1 = 0;
        int[][] stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        int[][] stackIn_223_2 = null;
        int stackIn_223_3 = 0;
        int[][] stackIn_225_0 = null;
        int stackIn_225_1 = 0;
        int[][] stackIn_225_2 = null;
        int stackIn_225_3 = 0;
        int[][] stackIn_226_0 = null;
        int stackIn_226_1 = 0;
        int[][] stackIn_226_2 = null;
        int stackIn_226_3 = 0;
        int stackIn_226_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        hf stackOut_68_0 = null;
        hf stackOut_69_0 = null;
        hf stackOut_70_0 = null;
        hf stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        hf stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_169_0 = 0;
        int stackOut_169_1 = 0;
        int stackOut_171_0 = 0;
        int stackOut_171_1 = 0;
        int[][] stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        int[][] stackOut_222_2 = null;
        int stackOut_222_3 = 0;
        int[][] stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        int[][] stackOut_225_2 = null;
        int stackOut_225_3 = 0;
        int stackOut_225_4 = 0;
        int[][] stackOut_223_0 = null;
        int stackOut_223_1 = 0;
        int[][] stackOut_223_2 = null;
        int stackOut_223_3 = 0;
        int stackOut_223_4 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 76) {
                break L1;
              } else {
                ((lc) this).field_h = -27;
                break L1;
              }
            }
            L2: {
              fo.field_k = fo.field_k + 1;
              if (cc.c((byte) 118)) {
                var2_int = ii.a(89);
                if (var2_int == 2) {
                  dm.g((byte) -96);
                  break L2;
                } else {
                  return;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (kh.field_b) {
                break L3;
              } else {
                if (!oc.field_g) {
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (!ib.b(false)) {
                          break L6;
                        } else {
                          stackOut_17_0 = vn.field_d;
                          stackOut_17_1 = 13;
                          stackIn_48_0 = stackOut_17_0;
                          stackIn_48_1 = stackOut_17_1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (var5 != 0) {
                            break L5;
                          } else {
                            L7: {
                              if (stackIn_18_0 != stackIn_18_1) {
                                break L7;
                              } else {
                                if (((lc) this).field_l == 0) {
                                  break L7;
                                } else {
                                  L8: {
                                    L9: {
                                      if (5 == ((lc) this).field_l) {
                                        break L9;
                                      } else {
                                        if (((lc) this).field_l == 1) {
                                          break L9;
                                        } else {
                                          if (2 == ((lc) this).field_l) {
                                            break L9;
                                          } else {
                                            if (3 == ((lc) this).field_l) {
                                              break L9;
                                            } else {
                                              if (((lc) this).field_l != 4) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    gj.a(false, true, -1, mn.field_r);
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  gj.a(false, true, th.field_f, th.field_f);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            this.d(111);
                            if (((lc) this).field_g.field_h != -1) {
                              this.a(false, ((lc) this).field_g.field_h, false);
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            } else {
                              continue L4;
                            }
                          }
                        }
                      }
                      ((lc) this).field_g.a(this.a((byte) 88, an.field_g, me.field_I), this.a((byte) 88, pb.field_h, ja.field_s), -97);
                      stackOut_47_0 = ((lc) this).field_g.field_h;
                      stackOut_47_1 = -1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      break L5;
                    }
                    if (stackIn_48_0 == stackIn_48_1) {
                      break L3;
                    } else {
                      this.a(true, ((lc) this).field_g.field_h, false);
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            L10: {
              if (((lc) this).field_l != 13) {
                break L10;
              } else {
                L11: {
                  o.field_s = o.field_s + 1;
                  if (o.field_s > 100) {
                    break L11;
                  } else {
                    if (wk.field_m != 0) {
                      break L11;
                    } else {
                      if (ri.field_b[84]) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                gj.a(false, true, 0, mn.field_r);
                break L10;
              }
            }
            L12: {
              if (((lc) this).field_l != 8) {
                break L12;
              } else {
                this.f(-1);
                break L12;
              }
            }
            L13: {
              if (16 != ((lc) this).field_l) {
                break L13;
              } else {
                L14: {
                  L15: {
                    var2_ref = to.field_s;
                    stackOut_68_0 = (hf) var2_ref;
                    stackIn_74_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (rc.b(-1)) {
                      break L15;
                    } else {
                      stackOut_69_0 = (hf) (Object) stackIn_69_0;
                      stackIn_74_0 = stackOut_69_0;
                      stackIn_70_0 = stackOut_69_0;
                      if (~mn.field_r != ~((lc) this).field_l) {
                        break L15;
                      } else {
                        stackOut_70_0 = (hf) (Object) stackIn_70_0;
                        stackIn_72_0 = stackOut_70_0;
                        stackOut_72_0 = (hf) (Object) stackIn_72_0;
                        stackOut_72_1 = 1;
                        stackIn_75_0 = stackOut_72_0;
                        stackIn_75_1 = stackOut_72_1;
                        break L14;
                      }
                    }
                  }
                  stackOut_74_0 = (hf) (Object) stackIn_74_0;
                  stackOut_74_1 = 0;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  break L14;
                }
                var3 = ((hf) (Object) stackIn_75_0).a(stackIn_75_1 != 0, true);
                if (var3 != 3) {
                  L16: {
                    if (var3 == 1) {
                      break L16;
                    } else {
                      if (var3 != 2) {
                        break L13;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (var3 != 2) {
                      stackOut_87_0 = 0;
                      stackIn_88_0 = stackOut_87_0;
                      break L17;
                    } else {
                      stackOut_85_0 = 1;
                      stackIn_88_0 = stackOut_85_0;
                      break L17;
                    }
                  }
                  var4 = stackIn_88_0;
                  gj.a(var4 != 0, true, 0, mn.field_r);
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            L18: {
              if (((lc) this).field_l != 5) {
                break L18;
              } else {
                o.field_s = o.field_s + 1;
                if (o.field_s <= 250) {
                  break L18;
                } else {
                  gj.a(true, true, -1, mn.field_r);
                  break L18;
                }
              }
            }
            L19: {
              if (3 == ((lc) this).field_l) {
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (((lc) this).field_l == 12) {
                L21: {
                  if (re.field_r == 1) {
                    L22: {
                      if (((lc) this).field_m != 10) {
                        break L22;
                      } else {
                        ((lc) this).field_d = ((lc) this).field_d + ((lc) this).field_i;
                        break L22;
                      }
                    }
                    L23: {
                      L24: {
                        if (1 == ((lc) this).field_m) {
                          var2_int = 0;
                          var3 = 0;
                          L25: while (true) {
                            L26: {
                              if (var3 >= 16) {
                                break L26;
                              } else {
                                stackOut_110_0 = ((lc) this).field_i;
                                stackOut_110_1 = b.field_f[var3];
                                stackIn_121_0 = stackOut_110_0;
                                stackIn_121_1 = stackOut_110_1;
                                stackIn_111_0 = stackOut_110_0;
                                stackIn_111_1 = stackOut_110_1;
                                if (var5 != 0) {
                                  L27: while (true) {
                                    if (stackIn_121_0 >= stackIn_121_1) {
                                      break L24;
                                    } else {
                                      stackOut_122_0 = -1;
                                      stackOut_122_1 = b.field_f[var3];
                                      stackIn_132_0 = stackOut_122_0;
                                      stackIn_132_1 = stackOut_122_1;
                                      stackIn_123_0 = stackOut_122_0;
                                      stackIn_123_1 = stackOut_122_1;
                                      if (var5 != 0) {
                                        break L23;
                                      } else {
                                        stackOut_123_0 = stackIn_123_0;
                                        stackOut_123_1 = stackIn_123_1;
                                        stackIn_125_0 = stackOut_123_0;
                                        stackIn_125_1 = stackOut_123_1;
                                        L28: {
                                          if (stackIn_125_0 == stackIn_125_1) {
                                            b.field_f[var3] = ((lc) this).field_i;
                                            ((lc) this).field_i = -1;
                                            break L28;
                                          } else {
                                            break L28;
                                          }
                                        }
                                        var3++;
                                        if (var5 == 0) {
                                          stackOut_120_0 = var3;
                                          stackOut_120_1 = 16;
                                          stackIn_121_0 = stackOut_120_0;
                                          stackIn_121_1 = stackOut_120_1;
                                          continue L27;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L29: {
                                    if (stackIn_111_0 != stackIn_111_1) {
                                      break L29;
                                    } else {
                                      var2_int = 1;
                                      ((lc) this).field_i = var3;
                                      ((lc) this).field_m = 2;
                                      break L29;
                                    }
                                  }
                                  var3++;
                                  if (var5 == 0) {
                                    continue L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            if (var2_int == 0) {
                              var3 = 0;
                              L30: while (true) {
                                stackOut_120_0 = var3;
                                stackOut_120_1 = 16;
                                stackIn_121_0 = stackOut_120_0;
                                stackIn_121_1 = stackOut_120_1;
                                if (stackIn_121_0 >= stackIn_121_1) {
                                  break L24;
                                } else {
                                  stackOut_122_0 = -1;
                                  stackOut_122_1 = b.field_f[var3];
                                  stackIn_132_0 = stackOut_122_0;
                                  stackIn_132_1 = stackOut_122_1;
                                  stackIn_123_0 = stackOut_122_0;
                                  stackIn_123_1 = stackOut_122_1;
                                  if (var5 != 0) {
                                    break L23;
                                  } else {
                                    stackOut_123_0 = stackIn_123_0;
                                    stackOut_123_1 = stackIn_123_1;
                                    stackIn_125_0 = stackOut_123_0;
                                    stackIn_125_1 = stackOut_123_1;
                                    L31: {
                                      if (stackIn_125_0 == stackIn_125_1) {
                                        b.field_f[var3] = ((lc) this).field_i;
                                        ((lc) this).field_i = -1;
                                        break L31;
                                      } else {
                                        break L31;
                                      }
                                    }
                                    var3++;
                                    if (var5 == 0) {
                                      continue L30;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L24;
                            }
                          }
                        } else {
                          break L24;
                        }
                      }
                      stackOut_131_0 = ~((lc) this).field_m;
                      stackOut_131_1 = -3;
                      stackIn_132_0 = stackOut_131_0;
                      stackIn_132_1 = stackOut_131_1;
                      break L23;
                    }
                    L32: {
                      if (stackIn_132_0 != stackIn_132_1) {
                        break L32;
                      } else {
                        var2_int = ((lc) this).field_i;
                        L33: while (true) {
                          L34: {
                            if (var2_int >= 15) {
                              break L34;
                            } else {
                              b.field_f[var2_int] = b.field_f[1 + var2_int];
                              var2_int++;
                              if (var5 != 0) {
                                break L32;
                              } else {
                                if (var5 == 0) {
                                  continue L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                          b.field_f[15] = -1;
                          break L32;
                        }
                      }
                    }
                    L35: {
                      if (((lc) this).field_m != 0) {
                        break L35;
                      } else {
                        ((lc) this).field_h = ((lc) this).field_i;
                        break L35;
                      }
                    }
                    L36: {
                      if (((lc) this).field_m == 5) {
                        if (~jf.field_j > ~(5 + ua.field_P)) {
                          break L36;
                        } else {
                          bg.a(2, ((lc) this).field_h * 8 + -14);
                          break L36;
                        }
                      } else {
                        break L36;
                      }
                    }
                    L37: {
                      if (((lc) this).field_m != 7) {
                        break L37;
                      } else {
                        if (2 + ua.field_P > jf.field_j) {
                          break L37;
                        } else {
                          bg.a(2, -13 + ((lc) this).field_h * 8 + (-1 + ((lc) this).field_i % 12) / 2);
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (((lc) this).field_m == 8) {
                        if (~(3 + ua.field_P) < ~jf.field_j) {
                          break L38;
                        } else {
                          bg.a(2, ((lc) this).field_i % 12 + ((lc) this).field_h * 8 + -18);
                          break L38;
                        }
                      } else {
                        break L38;
                      }
                    }
                    if (((lc) this).field_m != 9) {
                      break L21;
                    } else {
                      if (!ri.field_b[82]) {
                        break L21;
                      } else {
                        bb.c((byte) -120);
                        break L21;
                      }
                    }
                  } else {
                    break L21;
                  }
                }
                var2_int = 0;
                L39: while (true) {
                  var2_int = 0;
                  var3 = 0;
                  L40: while (true) {
                    stackOut_169_0 = var3;
                    stackOut_169_1 = 15;
                    stackIn_170_0 = stackOut_169_0;
                    stackIn_170_1 = stackOut_169_1;
                    L41: while (true) {
                      L42: {
                        if (stackIn_170_0 >= stackIn_170_1) {
                          break L42;
                        } else {
                          stackOut_171_0 = 0;
                          stackOut_171_1 = ~b.field_f[var3];
                          stackIn_170_0 = stackOut_171_0;
                          stackIn_170_1 = stackOut_171_1;
                          stackIn_172_0 = stackOut_171_0;
                          stackIn_172_1 = stackOut_171_1;
                          if (var5 != 0) {
                            continue L41;
                          } else {
                            L43: {
                              L44: {
                                if (stackIn_172_0 == stackIn_172_1) {
                                  break L44;
                                } else {
                                  if (b.field_f[1 + var3] >= b.field_f[var3]) {
                                    break L43;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              if (b.field_f[var3 + 1] != -1) {
                                var4 = b.field_f[var3];
                                b.field_f[var3] = b.field_f[var3 - -1];
                                b.field_f[1 + var3] = var4;
                                var2_int = 1;
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                            var3++;
                            if (var5 == 0) {
                              continue L40;
                            } else {
                              break L42;
                            }
                          }
                        }
                      }
                      if (var2_int != 0) {
                        continue L39;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
              } else {
                break L20;
              }
            }
            L45: {
              L46: {
                if (((lc) this).field_l == 11) {
                  break L46;
                } else {
                  ((lc) this).field_f = 0.0;
                  if (var5 == 0) {
                    break L45;
                  } else {
                    break L46;
                  }
                }
              }
              L47: {
                if (1 == re.field_r) {
                  L48: {
                    if (((lc) this).field_m == 0) {
                      so.field_c[((lc) this).field_h] = ((lc) this).field_i;
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L49: {
                    if (((lc) this).field_m != 6) {
                      break L49;
                    } else {
                      ((lc) this).field_n = ((lc) this).field_n + ((lc) this).field_i;
                      break L49;
                    }
                  }
                  L50: {
                    if (((lc) this).field_m != 8) {
                      break L50;
                    } else {
                      break L50;
                    }
                  }
                  L51: {
                    if (1 != ((lc) this).field_m) {
                      break L51;
                    } else {
                      ((lc) this).field_h = ((lc) this).field_i;
                      ((lc) this).field_n = 0;
                      break L51;
                    }
                  }
                  L52: {
                    if (((lc) this).field_m == 2) {
                      kg.field_d[0] = ld.field_n[((lc) this).field_i];
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  L53: {
                    if (3 == ((lc) this).field_m) {
                      kg.field_d[1] = ud.field_z[((lc) this).field_i];
                      break L53;
                    } else {
                      break L53;
                    }
                  }
                  L54: {
                    if (4 != ((lc) this).field_m) {
                      break L54;
                    } else {
                      kg.field_d[2] = ug.field_d[((lc) this).field_i];
                      break L54;
                    }
                  }
                  L55: {
                    if (((lc) this).field_m == 5) {
                      kg.field_d[3] = hi.field_b[((lc) this).field_i];
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                  if (((lc) this).field_m == 7) {
                    L56: {
                      so.field_c[0] = (int)(12.0 * Math.random());
                      so.field_c[1] = (int)(18.0 * Math.random() * 3.0);
                      so.field_c[2] = (int)(Math.random() * 12.0);
                      so.field_c[3] = (int)(12.0 * Math.random());
                      so.field_c[4] = (int)(3.0 * (14.0 * Math.random()));
                      so.field_c[5] = (int)(3.0 * (14.0 * Math.random()));
                      kg.field_d[0] = ld.field_n[(int)(Math.random() * (double)ld.field_n.length)];
                      kg.field_d[1] = ud.field_z[(int)(Math.random() * (double)ud.field_z.length)];
                      kg.field_d[2] = ug.field_d[(int)(Math.random() * (double)ug.field_d.length)];
                      stackOut_222_0 = kg.field_d;
                      stackOut_222_1 = 3;
                      stackOut_222_2 = hi.field_b;
                      stackOut_222_3 = (int)(Math.random() * (double)hi.field_b.length);
                      stackIn_225_0 = stackOut_222_0;
                      stackIn_225_1 = stackOut_222_1;
                      stackIn_225_2 = stackOut_222_2;
                      stackIn_225_3 = stackOut_222_3;
                      stackIn_223_0 = stackOut_222_0;
                      stackIn_223_1 = stackOut_222_1;
                      stackIn_223_2 = stackOut_222_2;
                      stackIn_223_3 = stackOut_222_3;
                      if (Math.random() >= 1.1) {
                        stackOut_225_0 = (int[][]) (Object) stackIn_225_0;
                        stackOut_225_1 = stackIn_225_1;
                        stackOut_225_2 = (int[][]) (Object) stackIn_225_2;
                        stackOut_225_3 = stackIn_225_3;
                        stackOut_225_4 = 8;
                        stackIn_226_0 = stackOut_225_0;
                        stackIn_226_1 = stackOut_225_1;
                        stackIn_226_2 = stackOut_225_2;
                        stackIn_226_3 = stackOut_225_3;
                        stackIn_226_4 = stackOut_225_4;
                        break L56;
                      } else {
                        stackOut_223_0 = (int[][]) (Object) stackIn_223_0;
                        stackOut_223_1 = stackIn_223_1;
                        stackOut_223_2 = (int[][]) (Object) stackIn_223_2;
                        stackOut_223_3 = stackIn_223_3;
                        stackOut_223_4 = 5;
                        stackIn_226_0 = stackOut_223_0;
                        stackIn_226_1 = stackOut_223_1;
                        stackIn_226_2 = stackOut_223_2;
                        stackIn_226_3 = stackOut_223_3;
                        stackIn_226_4 = stackOut_223_4;
                        break L56;
                      }
                    }
                    stackIn_226_0[stackIn_226_1] = stackIn_226_2[stackIn_226_3 % stackIn_226_4];
                    break L47;
                  } else {
                    break L47;
                  }
                } else {
                  break L47;
                }
              }
              ((lc) this).field_f = ((lc) this).field_f + 0.4;
              break L45;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "lc.R(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_r = "Waiting";
        field_j = new vn();
        field_q = new on[255];
        field_a = "<%0> has resigned.";
        field_c = "Owner";
        var0 = 0;
        L0: while (true) {
          if (field_q.length <= var0) {
            field_k = "Type your age in years";
            field_e = "Solicitation";
            field_o = "Bounce off the landscape and either explode after 5 seconds or on each bounce. Hold the mouse to increase the velocity of the attack.";
            field_p = "Improves the abilities of Storm, Thunder Shock and Conductor Rod";
            return;
          } else {
            field_q[var0] = new on();
            var0++;
            continue L0;
          }
        }
    }
}
