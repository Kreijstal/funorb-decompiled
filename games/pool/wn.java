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
            Throwable decompiledCaughtException = null;
            var16 = null;
            var17 = null;
            var18 = null;
            var21 = null;
            var22 = null;
            var12 = Pool.field_O;
            var16_ref = (ho) (Object) pj.field_H.c((byte) -89);
            if (var16_ref == null) {
              return;
            } else {
              L0: {
                var3 = 0;
                var4 = 0;
                if (param1 == 1) {
                  break L0;
                } else {
                  field_i = 19;
                  break L0;
                }
              }
              L1: while (true) {
                if (var16_ref.field_t <= var4) {
                  if (var3 == 0) {
                    var4 = param0.field_v;
                    param0.a(true, var16_ref.field_o);
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var16_ref.field_t) {
                        var5++;
                      } else {
                        L3: {
                          if (0 == var16_ref.field_q[var5]) {
                            try {
                              L4: {
                                var6_int = var16_ref.field_m[var5];
                                if (0 != var6_int) {
                                  if (1 == var6_int) {
                                    var15 = (java.lang.reflect.Field) var16_ref.field_n[var5].field_e;
                                    var19 = var15;
                                    var19.setInt((Object) null, var16_ref.field_r[var5]);
                                    param0.a(0, false);
                                    break L4;
                                  } else {
                                    if ((var6_int ^ -1) != -3) {
                                      break L4;
                                    } else {
                                      var27 = (java.lang.reflect.Field) var16_ref.field_n[var5].field_e;
                                      var8 = var27.getModifiers();
                                      param0.a(0, false);
                                      param0.a(true, var8);
                                      break L4;
                                    }
                                  }
                                } else {
                                  var26 = (java.lang.reflect.Field) var16_ref.field_n[var5].field_e;
                                  var8 = var26.getInt((Object) null);
                                  param0.a(0, false);
                                  param0.a(true, var8);
                                  break L4;
                                }
                              }
                              L5: {
                                if (-4 != (var6_int ^ -1)) {
                                  if (var6_int == 4) {
                                    var29 = (java.lang.reflect.Method) var16_ref.field_p[var5].field_e;
                                    var8 = var29.getModifiers();
                                    param0.a(0, false);
                                    param0.a(true, var8);
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  var28 = (java.lang.reflect.Method) var16_ref.field_p[var5].field_e;
                                  var25 = var16_ref.field_w[var5];
                                  var9 = new Object[var25.length];
                                  var10_int = 0;
                                  L6: while (true) {
                                    if (var10_int >= var25.length) {
                                      var10 = var28.invoke((Object) null, var9);
                                      if (var10 != null) {
                                        if (var10 instanceof Number) {
                                          param0.a(1, false);
                                          param0.a(((Number) var10).longValue(), (byte) -116);
                                          break L5;
                                        } else {
                                          if (!(var10 instanceof String)) {
                                            param0.a(4, false);
                                            break L5;
                                          } else {
                                            param0.a(2, false);
                                            param0.a(-9946, (String) var10);
                                            break L5;
                                          }
                                        }
                                      } else {
                                        param0.a(0, false);
                                        break L5;
                                      }
                                    } else {
                                      var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                      var9[var10_int] = var11.readObject();
                                      var10_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param0.a(-14, false);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param0.a(-17, false);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref8 = (IOException) (Object) decompiledCaughtException;
                              param0.a(-18, false);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param0.a(-19, false);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref10 = (Exception) (Object) decompiledCaughtException;
                              param0.a(-20, false);
                            }
                            break L3;
                          } else {
                            param0.a(var16_ref.field_q[var5], false);
                            break L3;
                          }
                        }
                        var6_ref11 = decompiledCaughtException;
                        param0.a(-21, false);
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L7: {
                    if (null != var16_ref.field_n[var4]) {
                      L8: {
                        if (2 != var16_ref.field_n[var4].field_f) {
                          break L8;
                        } else {
                          var16_ref.field_q[var4] = -5;
                          break L8;
                        }
                      }
                      if (-1 == (var16_ref.field_n[var4].field_f ^ -1)) {
                        var3 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  if (var16_ref.field_p[var4] != null) {
                    L9: {
                      if (var16_ref.field_p[var4].field_f == 2) {
                        var16_ref.field_q[var4] = -6;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (var16_ref.field_p[var4].field_f == 0) {
                      var3 = 1;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
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
            Object var2 = null;
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
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_19_5 = 0;
        int stackIn_19_6 = 0;
        int stackIn_19_7 = 0;
        int stackIn_19_8 = 0;
        int[] stackIn_19_9 = null;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        int stackIn_20_6 = 0;
        int stackIn_20_7 = 0;
        int stackIn_20_8 = 0;
        int[] stackIn_20_9 = null;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackIn_21_6 = 0;
        int stackIn_21_7 = 0;
        int stackIn_21_8 = 0;
        int[] stackIn_21_9 = null;
        int stackIn_21_10 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        byte stackOut_17_7 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int stackOut_18_5 = 0;
        int stackOut_18_6 = 0;
        int stackOut_18_7 = 0;
        int stackOut_18_8 = 0;
        int[] stackOut_18_9 = null;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        int stackOut_20_7 = 0;
        int stackOut_20_8 = 0;
        int[] stackOut_20_9 = null;
        int stackOut_20_10 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        int stackOut_19_6 = 0;
        int stackOut_19_7 = 0;
        int stackOut_19_8 = 0;
        int[] stackOut_19_9 = null;
        byte stackOut_19_10 = 0;
        L0: {
          L1: {
            var14 = Pool.field_O;
            var8 = -param6[param5] + param6[1];
            var9 = param3[1] - param3[0];
            if (-1 != (var8 ^ -1)) {
              break L1;
            } else {
              if (var9 != 0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var12 = ke.a(false, var9 * var9 + var8 * var8);
          if (0 != var12) {
            var8 = (var8 << 580715152) / var12;
            var9 = (var9 << -614584816) / var12;
            break L0;
          } else {
            break L0;
          }
        }
        var10 = var8;
        ng.field_w = var8;
        var11 = var9;
        fr.field_u = var9;
        var15 = 1;
        var12 = var15;
        L2: while (true) {
          if (var15 >= param6.length) {
            return;
          } else {
            L3: {
              if (-1 + param6.length > var15) {
                L4: {
                  var11 = -param3[var15] + param3[1 + var15];
                  var10 = -param6[var15] + param6[var15 + 1];
                  if (0 != var10) {
                    break L4;
                  } else {
                    if (0 == var11) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var13 = ke.a(false, var11 * var11 + var10 * var10);
                if (-1 == (var13 ^ -1)) {
                  break L3;
                } else {
                  var11 = (var11 << 1906573840) / var13;
                  var10 = (var10 << -538743056) / var13;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              ne.field_q = var8 - -var10 >> 1070864961;
              di.field_h = var11 + var9 >> 1888397953;
              stackOut_15_0 = param3[var15 - 1];
              stackOut_15_1 = param4;
              stackOut_15_2 = -23;
              stackOut_15_3 = param7[var15];
              stackOut_15_4 = param6[var15];
              stackOut_15_5 = param6[-1 + var15];
              stackOut_15_6 = param7[-1 + var15];
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_17_3 = stackOut_15_3;
              stackIn_17_4 = stackOut_15_4;
              stackIn_17_5 = stackOut_15_5;
              stackIn_17_6 = stackOut_15_6;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              stackIn_16_3 = stackOut_15_3;
              stackIn_16_4 = stackOut_15_4;
              stackIn_16_5 = stackOut_15_5;
              stackIn_16_6 = stackOut_15_6;
              if (var15 == var15) {
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = stackIn_17_2;
                stackOut_17_3 = stackIn_17_3;
                stackOut_17_4 = stackIn_17_4;
                stackOut_17_5 = stackIn_17_5;
                stackOut_17_6 = stackIn_17_6;
                stackOut_17_7 = param0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                stackIn_18_4 = stackOut_17_4;
                stackIn_18_5 = stackOut_17_5;
                stackIn_18_6 = stackOut_17_6;
                stackIn_18_7 = stackOut_17_7;
                break L5;
              } else {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = stackIn_16_2;
                stackOut_16_3 = stackIn_16_3;
                stackOut_16_4 = stackIn_16_4;
                stackOut_16_5 = stackIn_16_5;
                stackOut_16_6 = stackIn_16_6;
                stackOut_16_7 = 0;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                stackIn_18_4 = stackOut_16_4;
                stackIn_18_5 = stackOut_16_5;
                stackIn_18_6 = stackOut_16_6;
                stackIn_18_7 = stackOut_16_7;
                break L5;
              }
            }
            L6: {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = stackIn_18_2;
              stackOut_18_3 = stackIn_18_3;
              stackOut_18_4 = stackIn_18_4;
              stackOut_18_5 = stackIn_18_5;
              stackOut_18_6 = stackIn_18_6;
              stackOut_18_7 = stackIn_18_7;
              stackOut_18_8 = param3[var15];
              stackOut_18_9 = (int[]) param2;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_20_3 = stackOut_18_3;
              stackIn_20_4 = stackOut_18_4;
              stackIn_20_5 = stackOut_18_5;
              stackIn_20_6 = stackOut_18_6;
              stackIn_20_7 = stackOut_18_7;
              stackIn_20_8 = stackOut_18_8;
              stackIn_20_9 = stackOut_18_9;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              stackIn_19_3 = stackOut_18_3;
              stackIn_19_4 = stackOut_18_4;
              stackIn_19_5 = stackOut_18_5;
              stackIn_19_6 = stackOut_18_6;
              stackIn_19_7 = stackOut_18_7;
              stackIn_19_8 = stackOut_18_8;
              stackIn_19_9 = stackOut_18_9;
              if (var15 != param6.length + -1) {
                stackOut_20_0 = stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = stackIn_20_2;
                stackOut_20_3 = stackIn_20_3;
                stackOut_20_4 = stackIn_20_4;
                stackOut_20_5 = stackIn_20_5;
                stackOut_20_6 = stackIn_20_6;
                stackOut_20_7 = stackIn_20_7;
                stackOut_20_8 = stackIn_20_8;
                stackOut_20_9 = (int[]) (Object) stackIn_20_9;
                stackOut_20_10 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                stackIn_21_3 = stackOut_20_3;
                stackIn_21_4 = stackOut_20_4;
                stackIn_21_5 = stackOut_20_5;
                stackIn_21_6 = stackOut_20_6;
                stackIn_21_7 = stackOut_20_7;
                stackIn_21_8 = stackOut_20_8;
                stackIn_21_9 = stackOut_20_9;
                stackIn_21_10 = stackOut_20_10;
                break L6;
              } else {
                stackOut_19_0 = stackIn_19_0;
                stackOut_19_1 = stackIn_19_1;
                stackOut_19_2 = stackIn_19_2;
                stackOut_19_3 = stackIn_19_3;
                stackOut_19_4 = stackIn_19_4;
                stackOut_19_5 = stackIn_19_5;
                stackOut_19_6 = stackIn_19_6;
                stackOut_19_7 = stackIn_19_7;
                stackOut_19_8 = stackIn_19_8;
                stackOut_19_9 = (int[]) (Object) stackIn_19_9;
                stackOut_19_10 = param1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_21_2 = stackOut_19_2;
                stackIn_21_3 = stackOut_19_3;
                stackIn_21_4 = stackOut_19_4;
                stackIn_21_5 = stackOut_19_5;
                stackIn_21_6 = stackOut_19_6;
                stackIn_21_7 = stackOut_19_7;
                stackIn_21_8 = stackOut_19_8;
                stackIn_21_9 = stackOut_19_9;
                stackIn_21_10 = stackOut_19_10;
                break L6;
              }
            }
            bo.a(stackIn_21_0, stackIn_21_1, (byte) stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_21_6, (byte) stackIn_21_7, stackIn_21_8, stackIn_21_9, (byte) stackIn_21_10);
            ng.field_w = ne.field_q;
            var9 = var11;
            fr.field_u = di.field_h;
            var8 = var10;
            var15++;
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
        field_c = "OK";
        field_l = 62259;
        field_a = new fo();
        field_i = 0;
        field_f = new int[]{3000, 2250, 1500, 1000, 750, 500};
    }
}
