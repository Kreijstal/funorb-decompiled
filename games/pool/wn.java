/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wn {
    static volatile int field_k;
    static vh field_g;
    static fo field_a;
    static int field_h;
    static int field_j;
    static String field_c;
    static int field_l;
    static jg field_b;
    static dd field_e;
    static int[] field_f;
    static int field_i;
    static int[] field_d;

    final static void a(oq param0, int param1) {
        try {
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6_int = 0;
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
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            ho var16_ref = null;
            Object var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            var16 = null;
            var17 = null;
            var18 = null;
            var21 = null;
            var22 = null;
            var12 = Pool.field_O;
            try {
              L0: {
                var16_ref = (ho) ((Object) pj.field_H.c((byte) -89));
                if (var16_ref == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L1: {
                    var3 = 0;
                    var4 = 0;
                    if (param1 == 1) {
                      break L1;
                    } else {
                      field_i = 19;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var16_ref.field_t <= var4) {
                      if (var3 == 0) {
                        var4 = param0.field_v;
                        param0.a(true, var16_ref.field_o);
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var16_ref.field_t) {
                            param0.d(-1, var4);
                            var16_ref.a((byte) -117);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (0 == var16_ref.field_q[var5]) {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var16_ref.field_m[var5];
                                      if (0 != var6_int) {
                                        if (1 == var6_int) {
                                          var15 = (java.lang.reflect.Field) (var16_ref.field_n[var5].field_e);
                                          var19 = var15;
                                          var19.setInt((Object) null, var16_ref.field_r[var5]);
                                          param0.a(0, false);
                                          break L6;
                                        } else {
                                          if ((var6_int ^ -1) != -3) {
                                            break L6;
                                          } else {
                                            var27 = (java.lang.reflect.Field) (var16_ref.field_n[var5].field_e);
                                            var8 = var27.getModifiers();
                                            param0.a(0, false);
                                            param0.a(true, var8);
                                            break L6;
                                          }
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Field) (var16_ref.field_n[var5].field_e);
                                        var8 = var26.getInt((Object) null);
                                        param0.a(0, false);
                                        param0.a(true, var8);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-4 != (var6_int ^ -1)) {
                                        if (var6_int == 4) {
                                          var29 = (java.lang.reflect.Method) (var16_ref.field_p[var5].field_e);
                                          var8 = var29.getModifiers();
                                          param0.a(0, false);
                                          param0.a(true, var8);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        var28 = (java.lang.reflect.Method) (var16_ref.field_p[var5].field_e);
                                        var25 = var16_ref.field_w[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param0.a(1, false);
                                                param0.a(((Number) (var10)).longValue(), (byte) -116);
                                                break L7;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.a(4, false);
                                                  break L7;
                                                } else {
                                                  param0.a(2, false);
                                                  param0.a(-9946, (String) (var10));
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              param0.a(0, false);
                                              break L7;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L9: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param0.a(-10, false);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.a(-11, false);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.a(-12, false);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.a(-13, false);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.a(-14, false);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.a(-15, false);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.a(-16, false);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.a(-17, false);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.a(-18, false);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.a(-19, false);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.a(-20, false);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.a(-21, false);
                                    break L20;
                                  }
                                }
                                break L4;
                              } else {
                                param0.a(var16_ref.field_q[var5], false);
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      L21: {
                        if (null != var16_ref.field_n[var4]) {
                          L22: {
                            if (2 != var16_ref.field_n[var4].field_f) {
                              break L22;
                            } else {
                              var16_ref.field_q[var4] = -5;
                              break L22;
                            }
                          }
                          if (-1 == (var16_ref.field_n[var4].field_f ^ -1)) {
                            var3 = 1;
                            break L21;
                          } else {
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                      if (var16_ref.field_p[var4] != null) {
                        L23: {
                          if (var16_ref.field_p[var4].field_f == 2) {
                            var16_ref.field_q[var4] = -6;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        if (var16_ref.field_p[var4].field_f == 0) {
                          var3 = 1;
                          var4++;
                          continue L2;
                        } else {
                          var4++;
                          continue L2;
                        }
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_66_0 = (RuntimeException) (var2);

                stackIn_66_1 = new StringBuilder().append("wn.C(");

                if (param0 == null) {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                  stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                  stackIn_67_2 = "null";
                  break L24;
                } else {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                  stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                  stackIn_67_2 = "{...}";
                  break L24;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param1 + ')');
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

    public static void a(boolean param0) {
        if (!param0) {
            int[] var2 = (int[]) null;
            wn.a((byte) 51, (byte) -10, (int[]) null, (int[]) null, 92, 127, (int[]) null, (int[]) null);
        }
        field_g = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static void a(byte param0, byte param1, int[] param2, int[] param3, int param4, int param5, int[] param6, int[] param7) {
        int stackIn_18_0;
        int stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        int stackIn_18_4;
        int stackIn_18_5;
        int stackIn_18_6;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        int stackIn_19_6 = 0;
        int stackIn_19_7 = 0;
        int stackIn_21_8;
        int[] stackIn_21_9;
        int stackIn_22_8;
        int[] stackIn_22_9;
        int stackIn_22_10;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var14 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                var8_int = -param6[param5] + param6[1];
                var9 = param3[1] - param3[0];
                if (-1 != (var8_int ^ -1)) {
                  break L2;
                } else {
                  if (var9 != 0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var12 = ke.a(false, var9 * var9 + var8_int * var8_int);
              if (0 != var12) {
                var8_int = (var8_int << 580715152) / var12;
                var9 = (var9 << -614584816) / var12;
                break L1;
              } else {
                break L1;
              }
            }
            var10 = var8_int;
            ng.field_w = var8_int;
            var11 = var9;
            fr.field_u = var9;
            var15 = 1;
            var12 = var15;
            L3: while (true) {
              if (var15 >= param6.length) {
                break L0;
              } else {
                L4: {
                  if (-1 + param6.length > var15) {
                    L5: {
                      var11 = -param3[var15] + param3[1 + var15];
                      var10 = -param6[var15] + param6[var15 + 1];
                      if (0 != var10) {
                        break L5;
                      } else {
                        if (0 == var11) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = ke.a(false, var11 * var11 + var10 * var10);
                    if (-1 == (var13 ^ -1)) {
                      break L4;
                    } else {
                      var11 = (var11 << 1906573840) / var13;
                      var10 = (var10 << -538743056) / var13;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  ne.field_q = var8_int - -var10 >> 1070864961;
                  di.field_h = var11 + var9 >> 1888397953;
                  stackIn_18_0 = param3[var15 - 1];

                  stackIn_18_1 = param4;

                  stackIn_18_2 = -23;

                  stackIn_18_3 = param7[var15];

                  stackIn_18_4 = param6[var15];

                  stackIn_18_5 = param6[-1 + var15];

                  stackIn_18_6 = param7[-1 + var15];

                  if (var15 == var15) {
                    stackIn_19_0 = stackIn_18_0;
                    stackIn_19_1 = stackIn_18_1;
                    stackIn_19_2 = stackIn_18_2;
                    stackIn_19_3 = stackIn_18_3;
                    stackIn_19_4 = stackIn_18_4;
                    stackIn_19_5 = stackIn_18_5;
                    stackIn_19_6 = stackIn_18_6;
                    stackIn_19_7 = param0;
                    break L6;
                  } else {
                    stackIn_19_0 = stackIn_18_0;
                    stackIn_19_1 = stackIn_18_1;
                    stackIn_19_2 = stackIn_18_2;
                    stackIn_19_3 = stackIn_18_3;
                    stackIn_19_4 = stackIn_18_4;
                    stackIn_19_5 = stackIn_18_5;
                    stackIn_19_6 = stackIn_18_6;
                    stackIn_19_7 = 0;
                    break L6;
                  }
                }
                L7: {
















                  stackIn_21_8 = param3[var15];

                  stackIn_21_9 = (int[]) (param2);

                  if (var15 != param6.length + -1) {








                    stackIn_22_8 = stackIn_21_8;
                    stackIn_22_9 = (int[]) ((Object) stackIn_21_9);
                    stackIn_22_10 = 0;
                    break L7;
                  } else {








                    stackIn_22_8 = stackIn_21_8;
                    stackIn_22_9 = (int[]) ((Object) stackIn_21_9);
                    stackIn_22_10 = param1;
                    break L7;
                  }
                }
                bo.a(stackIn_19_0, stackIn_19_1, (byte) stackIn_19_2, stackIn_19_3, stackIn_19_4, stackIn_19_5, stackIn_19_6, (byte) stackIn_19_7, stackIn_22_8, stackIn_22_9, (byte) stackIn_22_10);
                ng.field_w = ne.field_q;
                var9 = var11;
                fr.field_u = di.field_h;
                var8_int = var10;
                var15++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var8);

            stackIn_26_1 = new StringBuilder().append("wn.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param7 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), stackIn_36_2 + ')');
        }
    }

    static {
        field_k = -1;
        field_c = "OK";
        field_l = 62259;
        field_a = new fo();
        field_i = 0;
        field_f = new int[]{3000, 2250, 1500, 1000, 750, 500};
    }
}
