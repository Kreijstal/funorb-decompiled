/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    private byte[] field_a;
    static boolean field_k;
    static int[] field_h;
    static oc field_f;
    private int[] field_c;
    static int field_b;
    private int[] field_e;
    static String field_m;
    static int field_i;
    static ll[] field_j;
    static int field_g;
    static String field_d;
    static int field_l;

    final int a(int param0, byte param1, byte[] param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_64_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              L1: {
                param3 = param3 + param0;
                var7_int = 0;
                var8 = param5;
                if (param1 <= -113) {
                  break L1;
                } else {
                  u.a(-33);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  var9 = param4[var8];
                  if (var9 < 0) {
                    var7_int = ((u) this).field_c[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] < 0) {
                      int incrementValue$7 = param0;
                      param0++;
                      param2[incrementValue$7] = (byte)var10;
                      if (param0 < param3) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-1 == (64 & var9)) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = ((u) this).field_c[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$8 = param0;
                      param0++;
                      param2[incrementValue$8] = (byte)(~var10);
                      if (param0 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if ((var9 & 32) != 0) {
                      var7_int = ((u) this).field_c[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((u) this).field_c[var7_int];
                    if (0 <= ((u) this).field_c[var7_int]) {
                      break L9;
                    } else {
                      int incrementValue$9 = param0;
                      param0++;
                      param2[incrementValue$9] = (byte)var10;
                      if (param0 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-1 != (16 & var9)) {
                      var7_int = ((u) this).field_c[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] < 0) {
                      int incrementValue$10 = param0;
                      param0++;
                      param2[incrementValue$10] = (byte)(~var10);
                      if (param3 > param0) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((var9 & 8) == 0) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = ((u) this).field_c[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] >= 0) {
                      break L13;
                    } else {
                      int incrementValue$11 = param0;
                      param0++;
                      param2[incrementValue$11] = (byte)var10;
                      if (param0 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (-1 != (4 & var9)) {
                      var7_int = ((u) this).field_c[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] < 0) {
                      int incrementValue$12 = param0;
                      param0++;
                      param2[incrementValue$12] = (byte)var10;
                      if (param0 < param3) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-1 != (2 & var9)) {
                      var7_int = ((u) this).field_c[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((u) this).field_c[var7_int];
                    if (0 <= ((u) this).field_c[var7_int]) {
                      break L17;
                    } else {
                      int incrementValue$13 = param0;
                      param0++;
                      param2[incrementValue$13] = (byte)(~var10);
                      if (param0 < param3) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return -param5 + (1 + var8);
                      }
                    }
                  }
                  L18: {
                    if ((var9 & 1) != 0) {
                      var7_int = ((u) this).field_c[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((u) this).field_c[var7_int];
                    if (((u) this).field_c[var7_int] >= 0) {
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_64_0 = -param5 + (1 + var8);
                stackIn_65_0 = stackOut_64_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("u.A(").append(param0).append(44).append(param1).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param2 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L20;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L20;
            }
          }
          L21: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44).append(param3).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param4 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + param5 + 41);
        }
        return stackIn_65_0;
    }

    final int a(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
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
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param3 << 3;
            param1 = param1 + param5;
            L1: while (true) {
              if (param5 >= param1) {
                L2: {
                  if (param4 == 1) {
                    break L2;
                  } else {
                    field_b = 117;
                    break L2;
                  }
                }
                stackOut_22_0 = -param3 + (var8 + 7 >> 3);
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                var9 = 255 & param2[param5];
                var10 = ((u) this).field_e[var9];
                var11 = ((u) this).field_a[var9];
                if (var11 == 0) {
                  throw new RuntimeException("" + var9);
                } else {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = var8 & 7;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = var12 - -(-1 + (var11 + var13) >> 3);
                    var8 = var8 + var11;
                    var13 += 24;
                    int dupTemp$1 = fj.b(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param0[var12] = (byte)dupTemp$1;
                    if (var12 >= var14) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param5++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("u.E(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L4;
            }
          }
          L5: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param1).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_23_0;
    }

    final static int a(jd param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (0 < param2) {
              if (uj.a(-2147483648, param2)) {
                stackOut_4_0 = (int)(((long)param0.c((byte) -46) & 4294967295L) * (long)param2 >> 32);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              } else {
                var3_int = -(int)(4294967296L % (long)param2) + param1;
                L1: while (true) {
                  var4 = param0.c((byte) -46);
                  if (var3_int > var4) {
                    stackOut_9_0 = dh.a(var4, true, param2);
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("u.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final static void a() {
        RuntimeException var1 = null;
        ab var1_ref = null;
        int var2 = 0;
        cg var3_ref_cg = null;
        long var3_long = 0L;
        int var3 = 0;
        na var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        na var5_ref = null;
        cg var5_ref2 = null;
        String var6 = null;
        cg var6_ref = null;
        na var6_ref2 = null;
        String var7 = null;
        cg var7_ref = null;
        cg var8_ref_cg = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        na var13 = null;
        cg var14 = null;
        na var15 = null;
        Object var16 = null;
        Object var17 = null;
        na var17_ref = null;
        Object var18 = null;
        Object var19 = null;
        na var19_ref = null;
        na var20 = null;
        cg var21 = null;
        int stackIn_45_0 = 0;
        cg stackIn_50_0 = null;
        cg stackIn_51_0 = null;
        cg stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        cg stackIn_92_0 = null;
        cg stackIn_93_0 = null;
        cg stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        RuntimeException decompiledCaughtException = null;
        cg stackOut_91_0 = null;
        cg stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        cg stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        cg stackOut_49_0 = null;
        cg stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        cg stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        var16 = null;
        var19 = null;
        var17 = null;
        var18 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var1_ref = df.field_z;
                  var2 = ((wk) (Object) var1_ref).e((byte) -110);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (var2 == 2) {
                        break L3;
                      } else {
                        if (var2 == 3) {
                          break L3;
                        } else {
                          if (var2 != 4) {
                            if (var2 != 5) {
                              if (6 != var2) {
                                if (var2 == 7) {
                                  var21 = (cg) (Object) gm.field_j.b(12623);
                                  L4: while (true) {
                                    if (var21 == null) {
                                      oe.field_b = 0;
                                      break L2;
                                    } else {
                                      var21.a(true);
                                      var21.a((byte) 88);
                                      var21 = (cg) (Object) gm.field_j.a(0);
                                      continue L4;
                                    }
                                  }
                                } else {
                                  if (var2 == 8) {
                                    L5: {
                                      var3 = ((wk) (Object) var1_ref).n(-98);
                                      var4 = (na) (Object) nk.field_q.a((long)var3, (byte) -93);
                                      if (var4 != null) {
                                        break L5;
                                      } else {
                                        var4 = new na(vf.field_l);
                                        nk.field_q.a((tf) (Object) var4, (long)var3, (byte) 116);
                                        break L5;
                                      }
                                    }
                                    int discarded$8 = 2;
                                    dn.a((wk) (Object) var1_ref, var4, true);
                                    cb.a(var4, 67);
                                    break L1;
                                  } else {
                                    if (var2 == 9) {
                                      var3 = ((wk) (Object) var1_ref).n(-98);
                                      var4_int = ((wk) (Object) var1_ref).e((byte) 105);
                                      var15 = (na) (Object) nk.field_q.a((long)var3, (byte) -70);
                                      var5_ref = var15;
                                      if (var15 != null) {
                                        L6: {
                                          if (var4_int == 0) {
                                            var5_ref.a(true);
                                            break L6;
                                          } else {
                                            var15.field_bc = vd.field_i;
                                            var15.field_ac = var4_int;
                                            break L6;
                                          }
                                        }
                                        var5_ref.a((byte) 88);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      if (var2 != 10) {
                                        L7: {
                                          if (var2 == 11) {
                                            break L7;
                                          } else {
                                            if (12 != var2) {
                                              if (var2 != 13) {
                                                L8: {
                                                  if (var2 == 14) {
                                                    break L8;
                                                  } else {
                                                    if (var2 == 16) {
                                                      break L8;
                                                    } else {
                                                      L9: {
                                                        if (var2 == 15) {
                                                          break L9;
                                                        } else {
                                                          if (var2 == 17) {
                                                            break L9;
                                                          } else {
                                                            if (var2 != 18) {
                                                              if (19 != var2) {
                                                                if (var2 == 20) {
                                                                  int discarded$9 = 2;
                                                                  dn.a((wk) (Object) var1_ref, wi.field_f, false);
                                                                  break L1;
                                                                } else {
                                                                  if (var2 == 21) {
                                                                    var3 = ((wk) (Object) var1_ref).n(-98);
                                                                    if (var3 == 0) {
                                                                      ba.field_a = 0L;
                                                                      break L1;
                                                                    } else {
                                                                      ba.field_a = qj.b(-26572) + (long)var3;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    if (var2 != 22) {
                                                                      if (var2 == 23) {
                                                                        qf.field_a = ((wk) (Object) var1_ref).c(-943038560);
                                                                        break L1;
                                                                      } else {
                                                                        int discarded$10 = -25;
                                                                        int discarded$11 = 20;
                                                                        jh.a((Throwable) null, "L1: " + nn.g());
                                                                        int discarded$12 = 0;
                                                                        ka.b();
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      sk.field_e = ((wk) (Object) var1_ref).n(-98);
                                                                      jh.field_e = ((wk) (Object) var1_ref).a(121);
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                                                var5_int = ((wk) (Object) var1_ref).e((byte) -111);
                                                                int discarded$13 = 8192;
                                                                var14 = vf.a(var3_long);
                                                                var6_ref = var14;
                                                                if (var14 != null) {
                                                                  L10: {
                                                                    if (var5_int == 0) {
                                                                      var6_ref.a(true);
                                                                      break L10;
                                                                    } else {
                                                                      var14.field_Sb = var5_int;
                                                                      var14.field_Eb = vd.field_i;
                                                                      break L10;
                                                                    }
                                                                  }
                                                                  var6_ref.a((byte) 88);
                                                                  wi.field_f.field_Rb = wi.field_f.field_Rb - 1;
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              L11: {
                                                                var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                                                var5 = ((wk) (Object) var1_ref).l(-1);
                                                                var6 = ((wk) (Object) var1_ref).l(-1);
                                                                int discarded$14 = 8192;
                                                                var7_ref = vf.a(var3_long);
                                                                if (var7_ref != null) {
                                                                  break L11;
                                                                } else {
                                                                  var7_ref = new cg(var5, var6, var3_long);
                                                                  kn.field_qb.a((tf) (Object) var7_ref, var3_long, (byte) 121);
                                                                  wi.field_f.field_Rb = wi.field_f.field_Rb + 1;
                                                                  break L11;
                                                                }
                                                              }
                                                              L12: {
                                                                var7_ref.field_Pb = ((wk) (Object) var1_ref).n(-98);
                                                                var8 = ((wk) (Object) var1_ref).a(16);
                                                                var7_ref.field_Vb = var8 >> 1;
                                                                stackOut_91_0 = (cg) var7_ref;
                                                                stackIn_93_0 = stackOut_91_0;
                                                                stackIn_92_0 = stackOut_91_0;
                                                                if ((var8 & 1) == 0) {
                                                                  stackOut_93_0 = (cg) (Object) stackIn_93_0;
                                                                  stackOut_93_1 = 0;
                                                                  stackIn_94_0 = stackOut_93_0;
                                                                  stackIn_94_1 = stackOut_93_1;
                                                                  break L12;
                                                                } else {
                                                                  stackOut_92_0 = (cg) (Object) stackIn_92_0;
                                                                  stackOut_92_1 = 1;
                                                                  stackIn_94_0 = stackOut_92_0;
                                                                  stackIn_94_1 = stackOut_92_1;
                                                                  break L12;
                                                                }
                                                              }
                                                              stackIn_94_0.field_Jb = stackIn_94_1 != 0;
                                                              var7_ref.field_Mb = ((wk) (Object) var1_ref).e((byte) -109);
                                                              var7_ref.field_Bb = ((wk) (Object) var1_ref).e((byte) -120);
                                                              ph.field_a.b((pg) (Object) var7_ref, -1);
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L13: {
                                                        var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                                        var5_int = ((wk) (Object) var1_ref).e((byte) 107);
                                                        var6_ref = fn.a(var3_long, 123);
                                                        if (var6_ref == null) {
                                                          break L13;
                                                        } else {
                                                          L14: {
                                                            if (var5_int != 0) {
                                                              var6_ref.field_Eb = vd.field_i;
                                                              var6_ref.field_Sb = var5_int;
                                                              break L14;
                                                            } else {
                                                              break L14;
                                                            }
                                                          }
                                                          L15: {
                                                            if (var2 == 15) {
                                                              var6_ref.field_Db = false;
                                                              break L15;
                                                            } else {
                                                              if (!var6_ref.field_Kb) {
                                                                break L15;
                                                              } else {
                                                                var6_ref.field_Kb = false;
                                                                oe.field_b = oe.field_b - 1;
                                                                break L15;
                                                              }
                                                            }
                                                          }
                                                          jf.a(var6_ref, (byte) 15);
                                                          break L13;
                                                        }
                                                      }
                                                      break L1;
                                                    }
                                                  }
                                                }
                                                L16: {
                                                  var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                                  var5_ref2 = fn.a(var3_long, 121);
                                                  if (var5_ref2 == null) {
                                                    break L16;
                                                  } else {
                                                    L17: {
                                                      if (var2 != 14) {
                                                        if (!var5_ref2.field_Kb) {
                                                          oe.field_b = oe.field_b + 1;
                                                          var5_ref2.field_Kb = true;
                                                          break L17;
                                                        } else {
                                                          break L17;
                                                        }
                                                      } else {
                                                        var5_ref2.field_Db = true;
                                                        break L17;
                                                      }
                                                    }
                                                    jf.a(var5_ref2, (byte) 127);
                                                    break L16;
                                                  }
                                                }
                                                break L1;
                                              } else {
                                                L18: {
                                                  var3 = ((wk) (Object) var1_ref).n(-98);
                                                  var4_int = ((wk) (Object) var1_ref).e((byte) -107);
                                                  var17_ref = (na) (Object) nk.field_q.a((long)var3, (byte) -105);
                                                  if (var17_ref == null) {
                                                    break L18;
                                                  } else {
                                                    L19: {
                                                      var17_ref.field_Nb = false;
                                                      var13 = var17_ref;
                                                      var6_ref2 = var13;
                                                      if (0 == var4_int) {
                                                        break L19;
                                                      } else {
                                                        var17_ref.field_ac = var4_int;
                                                        var17_ref.field_bc = vd.field_i;
                                                        break L19;
                                                      }
                                                    }
                                                    var13.field_Hb = false;
                                                    cb.a(var17_ref, 25);
                                                    break L18;
                                                  }
                                                }
                                                break L1;
                                              }
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        L20: {
                                          var3 = ((wk) (Object) var1_ref).n(-98);
                                          var19_ref = (na) (Object) nk.field_q.a((long)var3, (byte) -98);
                                          var19_ref = var19_ref;
                                          if (var19_ref == null) {
                                            break L20;
                                          } else {
                                            L21: {
                                              if (var2 != 11) {
                                                var19_ref.field_Nb = true;
                                                break L21;
                                              } else {
                                                var19_ref.field_Hb = true;
                                                break L21;
                                              }
                                            }
                                            cb.a(var19_ref, -26);
                                            break L20;
                                          }
                                        }
                                        break L1;
                                      } else {
                                        var20 = (na) (Object) vh.field_a.b(12623);
                                        L22: while (true) {
                                          if (var20 == null) {
                                            break L2;
                                          } else {
                                            var20.a(true);
                                            var20.a((byte) 88);
                                            var20 = (na) (Object) vh.field_a.a(0);
                                            continue L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L23: {
                                  var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                  var5_int = ((wk) (Object) var1_ref).e((byte) -96);
                                  var6_ref = fn.a(var3_long, 111);
                                  if (var6_ref == null) {
                                    break L23;
                                  } else {
                                    L24: {
                                      if (!var6_ref.field_Kb) {
                                        break L24;
                                      } else {
                                        oe.field_b = oe.field_b - 1;
                                        var6_ref.field_Kb = false;
                                        break L24;
                                      }
                                    }
                                    L25: {
                                      if (var5_int != 0) {
                                        var6_ref.field_Eb = vd.field_i;
                                        var6_ref.field_Sb = var5_int;
                                        break L25;
                                      } else {
                                        var6_ref.a(true);
                                        break L25;
                                      }
                                    }
                                    var6_ref.a((byte) 88);
                                    break L23;
                                  }
                                }
                                break L1;
                              }
                            } else {
                              L26: {
                                var3_long = ((wk) (Object) var1_ref).c(-943038560);
                                var5 = ((wk) (Object) var1_ref).l(-1);
                                var6 = ((wk) (Object) var1_ref).l(-1);
                                var7 = ((wk) (Object) var1_ref).l(-1);
                                var8_ref_cg = fn.a(var3_long, 119);
                                if (var6.equals((Object) (Object) "")) {
                                  stackOut_44_0 = 0;
                                  stackIn_45_0 = stackOut_44_0;
                                  break L26;
                                } else {
                                  stackOut_43_0 = 1;
                                  stackIn_45_0 = stackOut_43_0;
                                  break L26;
                                }
                              }
                              L27: {
                                var9 = stackIn_45_0;
                                if (var8_ref_cg != null) {
                                  if (var9 == 0) {
                                    break L27;
                                  } else {
                                    var8_ref_cg.a(var5, var7, 93);
                                    break L27;
                                  }
                                } else {
                                  var8_ref_cg = new cg(var5, var7, var3_long);
                                  bc.field_c.a((tf) (Object) var8_ref_cg, var3_long, (byte) 126);
                                  break L27;
                                }
                              }
                              L28: {
                                var8_ref_cg.field_Ob = qj.b(-26572) + -(long)((wk) (Object) var1_ref).d(-10674);
                                var8_ref_cg.field_Pb = ((wk) (Object) var1_ref).n(-98);
                                var10 = ((wk) (Object) var1_ref).a(31);
                                stackOut_49_0 = (cg) var8_ref_cg;
                                stackIn_51_0 = stackOut_49_0;
                                stackIn_50_0 = stackOut_49_0;
                                if (0 == (1 & var10)) {
                                  stackOut_51_0 = (cg) (Object) stackIn_51_0;
                                  stackOut_51_1 = 0;
                                  stackIn_52_0 = stackOut_51_0;
                                  stackIn_52_1 = stackOut_51_1;
                                  break L28;
                                } else {
                                  stackOut_50_0 = (cg) (Object) stackIn_50_0;
                                  stackOut_50_1 = 1;
                                  stackIn_52_0 = stackOut_50_0;
                                  stackIn_52_1 = stackOut_50_1;
                                  break L28;
                                }
                              }
                              stackIn_52_0.field_Jb = stackIn_52_1 != 0;
                              var8_ref_cg.field_Vb = var10 >> 1;
                              var8_ref_cg.field_Mb = ((wk) (Object) var1_ref).e((byte) -123);
                              var8_ref_cg.field_Bb = ((wk) (Object) var1_ref).e((byte) 100);
                              jf.a(var8_ref_cg, (byte) 1);
                              break L1;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_cg = (cg) (Object) ph.field_a.b(12623);
                L29: while (true) {
                  if (var3_ref_cg == null) {
                    var3_ref_cg = (cg) (Object) bc.field_c.f(-79);
                    L30: while (true) {
                      if (var3_ref_cg == null) {
                        L31: {
                          if (var2 != 1) {
                            break L31;
                          } else {
                            if (wi.field_f != null) {
                              va.field_e = wi.field_f.field_ic;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          if (var2 == 4) {
                            var3 = ((wk) (Object) var1_ref).n(-98);
                            wi.field_f = new na(vf.field_l);
                            wi.field_f.a(46, (long)var3);
                            int discarded$15 = 2;
                            dn.a((wk) (Object) var1_ref, wi.field_f, false);
                            ba.field_a = 0L;
                            break L32;
                          } else {
                            wi.field_f = null;
                            break L32;
                          }
                        }
                        L33: {
                          L34: {
                            if (var2 == 2) {
                              break L34;
                            } else {
                              if (var2 == 3) {
                                break L34;
                              } else {
                                om.field_x = null;
                                break L33;
                              }
                            }
                          }
                          if (null != om.field_x) {
                            break L33;
                          } else {
                            om.field_x = new na(vf.field_l);
                            break L33;
                          }
                        }
                        if (var2 == 3) {
                          dn.field_Db = true;
                          var3 = 0;
                          L35: while (true) {
                            if (gh.field_E.length <= var3) {
                              q.field_L = ((wk) (Object) var1_ref).e((byte) 32);
                              q.field_N = ((wk) (Object) var1_ref).e((byte) 72);
                              var3 = 0;
                              L36: while (true) {
                                if (var3 >= ng.field_D.length) {
                                  break L2;
                                } else {
                                  ng.field_D[var3] = ((wk) (Object) var1_ref).o(6);
                                  var3++;
                                  continue L36;
                                }
                              }
                            } else {
                              gh.field_E[var3] = ((wk) (Object) var1_ref).o(6);
                              var3++;
                              continue L35;
                            }
                          }
                        } else {
                          dn.field_Db = false;
                          break L1;
                        }
                      } else {
                        L37: {
                          L38: {
                            if (var3_ref_cg.field_Db) {
                              break L38;
                            } else {
                              if (var3_ref_cg.field_Kb) {
                                break L38;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L39: {
                            if (!var3_ref_cg.field_Kb) {
                              break L39;
                            } else {
                              oe.field_b = oe.field_b - 1;
                              var3_ref_cg.field_Kb = false;
                              break L39;
                            }
                          }
                          var3_ref_cg.field_Db = false;
                          jf.a(var3_ref_cg, (byte) -109);
                          break L37;
                        }
                        var3_ref_cg = (cg) (Object) bc.field_c.a(-1);
                        continue L30;
                      }
                    }
                  } else {
                    var3_ref_cg.a(true);
                    var3_ref_cg.a((byte) 88);
                    var3_ref_cg = (cg) (Object) ph.field_a.a(0);
                    continue L29;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "u.D(" + -108 + 41);
        }
    }

    final static void b() {
        if (ka.field_m == null) {
            return;
        }
        qm.a((java.awt.Canvas) (Object) ka.field_m, (byte) 122);
        ka.field_m.a(fi.field_d, (byte) 67);
        ka.field_m = null;
        if (ob.field_Y != null) {
            ob.field_Y.a(true);
        }
        on.field_c.requestFocus();
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_k = true;
        }
        field_f = null;
        field_m = null;
        field_h = null;
        field_d = null;
        field_j = null;
    }

    u(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        int[] var13 = null;
        int var14 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            ((u) this).field_a = param0;
            ((u) this).field_e = new int[var2_int];
            var3 = new int[33];
            ((u) this).field_c = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (var6 == 0) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var3[var6];
                      ((u) this).field_e[var5] = var8;
                      if ((var8 & var7) != 0) {
                        var9 = var3[-1 + var6];
                        break L3;
                      } else {
                        var10 = var6 - 1;
                        L4: while (true) {
                          L5: {
                            if (var10 < 1) {
                              break L5;
                            } else {
                              var11 = var3[var10];
                              if (var11 != var8) {
                                break L5;
                              } else {
                                var12 = 1 << -var10 + 32;
                                if ((var12 & var11) != 0) {
                                  var3[var10] = var3[-1 + var10];
                                  break L5;
                                } else {
                                  var3[var10] = fj.b(var12, var11);
                                  var10--;
                                  continue L4;
                                }
                              }
                            }
                          }
                          var9 = var7 | var8;
                          break L3;
                        }
                      }
                    }
                    var3[var6] = var9;
                    var10 = 1 + var6;
                    L6: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L7: while (true) {
                          if (var11 >= var6) {
                            ((u) this).field_c[var10] = ~var5;
                            if (var10 < var4) {
                              break L2;
                            } else {
                              var4 = 1 + var10;
                              break L2;
                            }
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if (0 == (var12 & var8)) {
                                var10++;
                                break L8;
                              } else {
                                L9: {
                                  if (((u) this).field_c[var10] != 0) {
                                    break L9;
                                  } else {
                                    ((u) this).field_c[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = ((u) this).field_c[var10];
                                break L8;
                              }
                            }
                            L10: {
                              var12 = var12 >>> 1;
                              if (((u) this).field_c.length > var10) {
                                break L10;
                              } else {
                                var13 = new int[2 * ((u) this).field_c.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (((u) this).field_c.length <= var14) {
                                    ((u) this).field_c = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = ((u) this).field_c[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L7;
                          }
                        }
                      } else {
                        L12: {
                          if (var3[var10] != var8) {
                            break L12;
                          } else {
                            var3[var10] = var9;
                            break L12;
                          }
                        }
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("u.<init>(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
    }

    final static String a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_12_0 = null;
        String stackOut_19_0 = null;
        String stackOut_29_0 = null;
        String stackOut_33_0 = null;
        String stackOut_37_0 = null;
        String stackOut_25_0 = null;
        String stackOut_22_0 = null;
        String stackOut_15_0 = null;
        String stackOut_8_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            if (1 != param1) {
              if (param1 == 2) {
                stackOut_5_0 = tj.a(-73, new String[1], rj.field_h);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param1 != 3) {
                  if (param1 == 4) {
                    stackOut_12_0 = tj.a(125, new String[1], q.field_M);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (5 != param1) {
                      if (param1 == 6) {
                        stackOut_19_0 = tj.a(120, new String[1], b.field_b);
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param1 != 7) {
                          if (param1 != 8) {
                            if (param1 == 11) {
                              stackOut_29_0 = tj.a(-92, new String[1], ui.field_w);
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            } else {
                              if (param1 == 12) {
                                stackOut_33_0 = tj.a(-85, new String[1], so.field_n);
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0;
                              } else {
                                if (param1 == 13) {
                                  stackOut_37_0 = tj.a(-123, new String[1], qo.field_d);
                                  stackIn_38_0 = stackOut_37_0;
                                  break L0;
                                } else {
                                  return null;
                                }
                              }
                            }
                          } else {
                            stackOut_25_0 = tj.a(122, new String[1], c.field_c);
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          }
                        } else {
                          stackOut_22_0 = tj.a(122, new String[1], ho.field_d);
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    } else {
                      stackOut_15_0 = tj.a(-95, new String[1], gm.field_n);
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                } else {
                  stackOut_8_0 = tj.a(-54, new String[1], ij.field_Gb);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = tj.a(126, new String[1], kb.field_e);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("u.B(").append(-128).append(44).append(param1).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L1;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return stackIn_38_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_h = new int[]{76, 77, 78};
        field_m = "Armageddon counter";
        field_f = new oc();
        field_i = 0;
        field_d = "Friends";
    }
}
