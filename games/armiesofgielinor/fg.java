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
            field_m = null;
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
          if (param1 < 0) {
            break L0;
          } else {
            if (param0 < 0) {
              break L0;
            } else {
              if (~param1 <= ~ks.field_y) {
                break L0;
              } else {
                if (ef.field_c <= param0) {
                  break L0;
                } else {
                  L1: {
                    var8 = a.a(16711680, param0, var7, param1);
                    var9 = -((var8 & -14033988) >>> 24) + 255;
                    var8 = var8 & 16777215;
                    if (!param6) {
                      if (param2 != 0) {
                        if (param2 != 1) {
                          if (param2 != 2) {
                            rv.a(false, param3, param5, var7);
                            break L1;
                          } else {
                            L2: {
                              po.a((byte) -7, param0, param3, param5, var9, var8, var7, param1);
                              sf.b(param0, param1, 0, param5, var7, param3);
                              tc.a(62, param1, param0, 19 + param3, var7, 39 + param5);
                              cw.a(var7, 19 + param3, param5 + 39, -118, param1, param0);
                              em.a(var9, false, param0, param3, var7, 0, param1, param5, var8);
                              var10 = vs.field_e[var7].field_n;
                              if (var10 == null) {
                                break L2;
                              } else {
                                if ((var10.field_c & 1) != 0) {
                                  if (-1 >= vs.field_e[var7].field_a) {
                                    break L2;
                                  } else {
                                    L3: {
                                      var11 = vs.field_e[var7].field_a;
                                      if (null == bv.field_w) {
                                        break L3;
                                      } else {
                                        var11 = bv.field_w.o(var11, -1);
                                        break L3;
                                      }
                                    }
                                    eu.a(22 + param5, var11, var7 - -ug.field_b, 119, param3 + 20);
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                            }
                            fs.a(param3, false, false, var9, param5, var7, param1, var8, param0);
                            if (vs.field_e[var7].e((byte) -115)) {
                              oj.a(param3 + 20, true, ug.field_b + var7, vs.field_e[var7].field_a, 22 + param5);
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          L4: {
                            if (cu.field_a) {
                              break L4;
                            } else {
                              mq.a(param5, var8, var7, param1, param3, var9, 54, param0);
                              break L4;
                            }
                          }
                          pk.a(param3, param0, param1, var7, var8, -29403, var9, param5);
                          if (jd.field_L) {
                            oh.field_I.g(param5, param3);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        mq.a(param5, var8, var7, param1, param3, var9, 101, param0);
                        break L1;
                      }
                    } else {
                      if (param2 == 2) {
                        em.a(var9, true, param0, param3, var7, 0, param1, param5, var8);
                        fs.a(param3, false, true, var9, param5, var7, param1, var8, param0);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        L5: {
          if (param2 != 2) {
            break L5;
          } else {
            gb.a(param0, param1, param5, param3, (byte) 49);
            break L5;
          }
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            if (ck.field_c != null) {
                for (var1_int = 0; var1_int < 16; var1_int++) {
                    ck.field_c[var1_int] = null;
                }
            }
            var1_int = 93;
            ql.field_j = null;
            System.gc();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fg.C(" + 111 + ')');
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
        char[] var15 = null;
        char[] var16 = null;
        Object stackIn_9_0 = null;
        mq stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        mq stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = param2.length;
            var6 = new String[var5_int];
            var16 = new char[var5_int];
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var7 = var13;
            var8 = new mq[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var5_int <= var10_int) {
                    L3: {
                      if (param0 < -7) {
                        break L3;
                      } else {
                        fg.a(-20);
                        break L3;
                      }
                    }
                    break L1;
                  } else {
                    var11 = ce.field_K.a(param2[var10_int], 81);
                    var6[var10_int] = var11.d((byte) 97);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (mq) (Object) stackIn_9_0;
            }
            stackOut_10_0 = new mq(0L, param1, param4, param3, var8, param2, var6, var16);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("fg.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_11_0;
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        try {
            ((fg) this).field_o = param0;
            ((fg) this).field_u = param6;
            ((fg) this).field_p = param1;
            ((fg) this).field_t = param3;
            if (param7 > -55) {
                Object var10 = null;
                mq discarded$0 = fg.a(-76, (je) null, (int[]) null, (je) null, (je) null);
            }
            ((fg) this).field_r = param4;
            ((fg) this).field_s = param2;
            ((fg) this).field_q = param5;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fg.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            dc var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            dc var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var12 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                var13 = (dc) (Object) tp.field_e.e((byte) 125);
                var17 = var13;
                if (var17 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var17.field_p) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param1.field_q;
                        param1.a((byte) -66, var17.field_q);
                        var5 = 0;
                        L2: while (true) {
                          if (var17.field_p <= var5) {
                            int discarded$1 = param1.b((byte) -39, var4);
                            var17.d(-115);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_m[var5] != 0) {
                                param1.b(1, var17.field_m[var5]);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_t[var5];
                                      if (var6_int != 0) {
                                        if (var6_int == 1) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_k[var5].field_f;
                                          var20 = var16_ref;
                                          var20.setInt((Object) null, var17.field_v[var5]);
                                          param1.b(1, 0);
                                          break L5;
                                        } else {
                                          if (var6_int == 2) {
                                            var28 = (java.lang.reflect.Field) var17.field_k[var5].field_f;
                                            var8 = var28.getModifiers();
                                            param1.b(1, 0);
                                            param1.a((byte) -79, var8);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) var17.field_k[var5].field_f;
                                        var8 = var27.getInt((Object) null);
                                        param1.b(1, 0);
                                        param1.a((byte) -75, var8);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        if (4 != var6_int) {
                                          break L6;
                                        } else {
                                          var30 = (java.lang.reflect.Method) var17.field_r[var5].field_f;
                                          var8 = var30.getModifiers();
                                          param1.b(1, 0);
                                          param1.a((byte) -115, var8);
                                          break L6;
                                        }
                                      } else {
                                        var29 = (java.lang.reflect.Method) var17.field_r[var5].field_f;
                                        var26 = var17.field_u[var5];
                                        var9 = new Object[var26.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var26.length <= var10_int) {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param1.b(1, 1);
                                                param1.a(((Number) var10).longValue(), 38359632);
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param1.b(1, 4);
                                                  break L6;
                                                } else {
                                                  param1.b(1, 2);
                                                  param1.b((String) var10, 13851);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param1.b(1, 0);
                                              break L6;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L7;
                                          }
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.b(1, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.b(1, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.b(1, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.b(1, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.b(1, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.b(1, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.b(1, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L20: {
                        if (null == var13.field_k[var4]) {
                          break L20;
                        } else {
                          L21: {
                            if (-3 == var13.field_k[var4].field_g) {
                              var13.field_m[var4] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (-1 == var13.field_k[var4].field_g) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                      if (null != var13.field_r[var4]) {
                        L22: {
                          if (var13.field_r[var4].field_g == 2) {
                            var13.field_m[var4] = -6;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (0 != var13.field_r[var4].field_g) {
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        var4++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_66_0 = (RuntimeException) var2;
                stackOut_66_1 = new StringBuilder().append("fg.D(").append(0).append(',');
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (param1 == null) {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "null";
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  break L24;
                } else {
                  stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                  stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                  stackOut_67_2 = "{...}";
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  break L24;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ')');
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Most health recovered";
        field_m = "Turns used";
        field_k = "End turn";
        field_n = "This item can only be used on an elf songstress.";
    }
}
