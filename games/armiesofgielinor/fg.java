/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fg extends tc {
    static String field_l;
    int field_q;
    static String field_k;
    int[] field_t;
    static String field_m;
    int field_o;
    int field_r;
    int field_p;
    int field_s;
    int field_u;
    static String field_n;

    public static void a(int param0) {
        field_l = null;
        field_k = null;
        field_n = null;
        field_m = null;
        if (param0 != -22856) {
            field_m = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ca var10 = null;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          var7 = param1 + ks.field_y * param0;
          if ((param1 ^ -1) > -1) {
            break L0;
          } else {
            if (param0 < 0) {
              break L0;
            } else {
              if (param1 >= ks.field_y) {
                break L0;
              } else {
                if (ef.field_c <= param0) {
                  break L0;
                } else {
                  L1: {
                    if (param4 > 64) {
                      break L1;
                    } else {
                      field_l = (String) null;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var8 = a.a(16711680, param0, var7, param1);
                      var9 = -((var8 & -14033988) >>> 1780867096) + 255;
                      var8 = var8 & 16777215;
                      if (!param6) {
                        break L3;
                      } else {
                        if (-3 == (param2 ^ -1)) {
                          em.a(var9, true, param0, param3, var7, 0, param1, param5, var8);
                          fs.a(param3, false, true, var9, param5, var7, param1, var8, param0);
                          if (var12 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (param2 != 0) {
                        break L4;
                      } else {
                        mq.a(param5, var8, var7, param1, param3, var9, 101, param0);
                        if (var12 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if ((param2 ^ -1) != -2) {
                        break L5;
                      } else {
                        L6: {
                          if (cu.field_a) {
                            break L6;
                          } else {
                            mq.a(param5, var8, var7, param1, param3, var9, 54, param0);
                            break L6;
                          }
                        }
                        pk.a(param3, param0, param1, var7, var8, -29403, var9, param5);
                        if (jd.field_L) {
                          oh.field_I.g(param5, param3);
                          if (var12 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L7: {
                      if ((param2 ^ -1) != -3) {
                        break L7;
                      } else {
                        L8: {
                          po.a((byte) -7, param0, param3, param5, var9, var8, var7, param1);
                          sf.b(param0, param1, 0, param5, var7, param3);
                          tc.a(62, param1, param0, 19 + param3, var7, 39 + param5);
                          cw.a(var7, 19 + param3, param5 + 39, -118, param1, param0);
                          em.a(var9, false, param0, param3, var7, 0, param1, param5, var8);
                          var10 = vs.field_e[var7].field_n;
                          if (var10 == null) {
                            break L8;
                          } else {
                            if (-1 != (var10.field_c & 1 ^ -1)) {
                              if (-1 >= vs.field_e[var7].field_a) {
                                break L8;
                              } else {
                                L9: {
                                  var11 = vs.field_e[var7].field_a;
                                  if (null == bv.field_w) {
                                    break L9;
                                  } else {
                                    var11 = bv.field_w.o(var11, -1);
                                    break L9;
                                  }
                                }
                                eu.a(22 + param5, var11, var7 - -ug.field_b, 119, param3 + 20);
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        L10: {
                          fs.a(param3, false, false, var9, param5, var7, param1, var8, param0);
                          if (vs.field_e[var7].e((byte) -115)) {
                            oj.a(param3 + 20, true, ug.field_b + var7, vs.field_e[var7].field_a, 22 + param5);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        if (var12 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    rv.a(false, param3, param5, var7);
                    break L2;
                  }
                  return;
                }
              }
            }
          }
        }
        L11: {
          if (-3 != (param2 ^ -1)) {
            break L11;
          } else {
            gb.a(param0, param1, param5, param3, (byte) 49);
            break L11;
          }
        }
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (ck.field_c == null) {
                  break L2;
                } else {
                  var1_int = 0;
                  L3: while (true) {
                    if (-17 >= (var1_int ^ -1)) {
                      break L2;
                    } else {
                      ck.field_c[var1_int] = null;
                      var1_int++;
                      if (var2 != 0) {
                        break L1;
                      } else {
                        if (var2 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var1_int = -93 / ((28 - param0) / 54);
              ql.field_j = null;
              System.gc();
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "fg.C(" + param0 + ')');
        }
    }

    final static mq a(int param0, je param1, int[] param2, je param3, je param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        mq[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        ar var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_11_0 = null;
        mq stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        mq stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = param2.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            var8 = new mq[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var10_int) {
                      if (param0 < -7) {
                        break L3;
                      } else {
                        fg.a(-20);
                        break L3;
                      }
                    } else {
                      var11 = ce.field_K.a(param2[var10_int], 81);
                      var6[var10_int] = var11.d((byte) 97);
                      var9 = (char)(var9 + 1);
                      var7[var10_int] = (char)var9;
                      var8[var10_int] = null;
                      var10_int++;
                      if (var12 != 0) {
                        break L3;
                      } else {
                        continue L2;
                      }
                    }
                  }
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              return (mq) ((Object) stackIn_11_0);
            }
            stackOut_12_0 = new mq(0L, param1, param4, param3, var8, param2, var6, var14);
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("fg.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        return stackIn_13_0;
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        mq discarded$0 = null;
        try {
            this.field_o = param0;
            this.field_u = param6;
            this.field_p = param1;
            this.field_t = param3;
            if (param7 > -55) {
                je var10 = (je) null;
                discarded$0 = fg.a(-76, (je) null, (int[]) null, (je) null, (je) null);
            }
            this.field_r = param4;
            this.field_s = param2;
            this.field_q = param5;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fg.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, bv param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            java.lang.reflect.Field var7 = null;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            dc var13 = null;
            java.lang.reflect.Field var14 = null;
            dc var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            int stackIn_28_0 = 0;
            int stackIn_72_0 = 0;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            String stackIn_77_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_27_0 = 0;
            int stackOut_71_0 = 0;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            String stackOut_76_2 = null;
            RuntimeException stackOut_75_0 = null;
            StringBuilder stackOut_75_1 = null;
            String stackOut_75_2 = null;
            var18 = null;
            var19 = null;
            var21 = null;
            var22 = null;
            var12 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                var13 = (dc) ((Object) tp.field_e.e((byte) 125));
                var17 = var13;
                if (var17 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var4 >= var17.field_p) {
                          break L3;
                        } else {
                          if (var12 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (null == var13.field_k[var4]) {
                                break L4;
                              } else {
                                L5: {
                                  if (-3 == (var13.field_k[var4].field_g ^ -1)) {
                                    var13.field_m[var4] = -5;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                if (-1 == (var13.field_k[var4].field_g ^ -1)) {
                                  var3 = 1;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L6: {
                              if (null != var13.field_r[var4]) {
                                L7: {
                                  if ((var13.field_r[var4].field_g ^ -1) == -3) {
                                    var13.field_m[var4] = -6;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                if (0 != var13.field_r[var4].field_g) {
                                  break L6;
                                } else {
                                  var3 = 1;
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                            var4++;
                            if (var12 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      if (var3 != 0) {
                        break L2;
                      } else {
                        var4 = param1.field_q;
                        param1.a((byte) -66, var17.field_q);
                        var5 = param0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (var17.field_p <= var5) {
                                break L10;
                              } else {
                                stackOut_27_0 = var13.field_m[var5] ^ -1;
                                stackIn_72_0 = stackOut_27_0;
                                stackIn_28_0 = stackOut_27_0;
                                if (var12 != 0) {
                                  break L9;
                                } else {
                                  L11: {
                                    L12: {
                                      if (stackIn_28_0 != -1) {
                                        param1.b(1, var13.field_m[var5]);
                                        if (var12 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                    try {
                                      L13: {
                                        L14: {
                                          L15: {
                                            var6_int = var13.field_t[var5];
                                            if (var6_int != 0) {
                                              break L15;
                                            } else {
                                              var26 = (java.lang.reflect.Field) (var13.field_k[var5].field_f);
                                              var8 = var26.getInt((Object) null);
                                              param1.b(param0 ^ 1, 0);
                                              param1.a((byte) -75, var8);
                                              if (var12 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var6_int == 1) {
                                              break L16;
                                            } else {
                                              if ((var6_int ^ -1) == -3) {
                                                var27 = (java.lang.reflect.Field) (var13.field_k[var5].field_f);
                                                var8 = var27.getModifiers();
                                                param1.b(param0 + 1, 0);
                                                param1.a((byte) -79, var8);
                                                if (var12 == 0) {
                                                  break L14;
                                                } else {
                                                  break L16;
                                                }
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          var14 = (java.lang.reflect.Field) (var13.field_k[var5].field_f);
                                          var7 = var14;
                                          var14.setInt((Object) null, var13.field_v[var5]);
                                          param1.b(1, 0);
                                          break L14;
                                        }
                                        L17: {
                                          L18: {
                                            if (var6_int != 3) {
                                              break L18;
                                            } else {
                                              var28 = (java.lang.reflect.Method) (var13.field_r[var5].field_f);
                                              var25 = var13.field_u[var5];
                                              var9 = new Object[var25.length];
                                              var10_int = 0;
                                              L19: while (true) {
                                                L20: {
                                                  if (var25.length <= var10_int) {
                                                    break L20;
                                                  } else {
                                                    var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                                    var9[var10_int] = var11.readObject();
                                                    var10_int++;
                                                    if (var12 != 0) {
                                                      break L17;
                                                    } else {
                                                      if (var12 == 0) {
                                                        continue L19;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                }
                                                L21: {
                                                  L22: {
                                                    var10 = var28.invoke((Object) null, var9);
                                                    if (var10 != null) {
                                                      break L22;
                                                    } else {
                                                      param1.b(param0 ^ 1, 0);
                                                      if (var12 == 0) {
                                                        break L21;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  L23: {
                                                    if (var10 instanceof Number) {
                                                      break L23;
                                                    } else {
                                                      L24: {
                                                        if (!(var10 instanceof String)) {
                                                          break L24;
                                                        } else {
                                                          param1.b(1, 2);
                                                          param1.b((String) (var10), param0 + 13851);
                                                          if (var12 == 0) {
                                                            break L21;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      param1.b(1, 4);
                                                      if (var12 == 0) {
                                                        break L21;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  param1.b(1, 1);
                                                  param1.a(((Number) (var10)).longValue(), param0 + 38359632);
                                                  break L21;
                                                }
                                                if (var12 == 0) {
                                                  break L17;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                          }
                                          if (4 != var6_int) {
                                            break L17;
                                          } else {
                                            var29 = (java.lang.reflect.Method) (var13.field_r[var5].field_f);
                                            var8 = var29.getModifiers();
                                            param1.b(param0 ^ 1, 0);
                                            param1.a((byte) -115, var8);
                                            break L17;
                                          }
                                        }
                                        break L13;
                                      }
                                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L25: {
                                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                        param1.b(1, -10);
                                        break L25;
                                      }
                                    } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L26: {
                                        var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                        param1.b(1, -11);
                                        break L26;
                                      }
                                    } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                      decompiledCaughtException = decompiledCaughtParameter2;
                                      L27: {
                                        var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                        param1.b(1, -12);
                                        break L27;
                                      }
                                    } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                      decompiledCaughtException = decompiledCaughtParameter3;
                                      L28: {
                                        var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                        param1.b(1, -13);
                                        break L28;
                                      }
                                    } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                      decompiledCaughtException = decompiledCaughtParameter4;
                                      L29: {
                                        var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                        param1.b(1, -14);
                                        break L29;
                                      }
                                    } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                      decompiledCaughtException = decompiledCaughtParameter5;
                                      L30: {
                                        var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                        param1.b(1, -15);
                                        break L30;
                                      }
                                    } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                      decompiledCaughtException = decompiledCaughtParameter6;
                                      L31: {
                                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                        param1.b(1, -16);
                                        break L31;
                                      }
                                    } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                      decompiledCaughtException = decompiledCaughtParameter7;
                                      L32: {
                                        var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                        param1.b(1, -17);
                                        break L32;
                                      }
                                    } catch (java.io.IOException decompiledCaughtParameter8) {
                                      decompiledCaughtException = decompiledCaughtParameter8;
                                      L33: {
                                        var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                        param1.b(1, -18);
                                        break L33;
                                      }
                                    } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                      decompiledCaughtException = decompiledCaughtParameter9;
                                      L34: {
                                        var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                        param1.b(1, -19);
                                        break L34;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter10) {
                                      decompiledCaughtException = decompiledCaughtParameter10;
                                      L35: {
                                        var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                        param1.b(1, -20);
                                        break L35;
                                      }
                                    } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                      decompiledCaughtException = decompiledCaughtParameter11;
                                      L36: {
                                        var6_ref11 = decompiledCaughtException;
                                        param1.b(1, -21);
                                        break L36;
                                      }
                                    }
                                    break L11;
                                  }
                                  var5++;
                                  if (var12 == 0) {
                                    continue L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            stackOut_71_0 = param1.b((byte) -39, var4);
                            stackIn_72_0 = stackOut_71_0;
                            break L9;
                          }
                          var17.d(-115);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L37: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_74_0 = (RuntimeException) (var2);
                stackOut_74_1 = new StringBuilder().append("fg.D(").append(param0).append(',');
                stackIn_76_0 = stackOut_74_0;
                stackIn_76_1 = stackOut_74_1;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                if (param1 == null) {
                  stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
                  stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
                  stackOut_76_2 = "null";
                  stackIn_77_0 = stackOut_76_0;
                  stackIn_77_1 = stackOut_76_1;
                  stackIn_77_2 = stackOut_76_2;
                  break L37;
                } else {
                  stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
                  stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
                  stackOut_75_2 = "{...}";
                  stackIn_77_0 = stackOut_75_0;
                  stackIn_77_1 = stackOut_75_1;
                  stackIn_77_2 = stackOut_75_2;
                  break L37;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fg() {
    }

    static {
        field_l = "Most health recovered";
        field_m = "Turns used";
        field_k = "End turn";
        field_n = "This item can only be used on an elf songstress.";
    }
}
