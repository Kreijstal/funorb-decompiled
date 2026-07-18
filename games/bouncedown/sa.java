/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa extends ai {
    int field_g;
    int field_m;
    static int field_k;
    static char[] field_j;
    int[][] field_o;
    long[][] field_l;
    int field_n;
    boolean field_i;
    String[][] field_h;

    final static void a(byte param0, ii param1) {
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
            hh var13 = null;
            java.lang.reflect.Field var15 = null;
            hh var16 = null;
            java.lang.reflect.Field var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            RuntimeException stackIn_59_0 = null;
            StringBuilder stackIn_59_1 = null;
            RuntimeException stackIn_60_0 = null;
            StringBuilder stackIn_60_1 = null;
            String stackIn_60_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_57_0 = null;
            StringBuilder stackOut_57_1 = null;
            RuntimeException stackOut_59_0 = null;
            StringBuilder stackOut_59_1 = null;
            String stackOut_59_2 = null;
            RuntimeException stackOut_58_0 = null;
            StringBuilder stackOut_58_1 = null;
            String stackOut_58_2 = null;
            var18 = null;
            var19 = null;
            var21 = null;
            var22 = null;
            var12 = Bounce.field_N;
            try {
              L0: {
                var13 = (hh) (Object) ob.field_c.a((byte) -83);
                var16 = var13;
                if (var16 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var16.field_j <= var4) {
                      if (var3 == 0) {
                        var4 = param1.field_h;
                        param1.b(var16.field_g, (byte) 51);
                        var5 = 0;
                        L2: while (true) {
                          if (var16.field_j <= var5) {
                            int discarded$1 = param1.b(var4, -1);
                            var16.c(2);
                            break L0;
                          } else {
                            L3: {
                              if (var16.field_i[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var16.field_o[var5];
                                      if (var6_int == 0) {
                                        var27 = (java.lang.reflect.Field) var16.field_n[var5].field_e;
                                        var8 = var27.getInt((Object) null);
                                        param1.a(0, (byte) 77);
                                        param1.b(var8, (byte) 50);
                                        break L5;
                                      } else {
                                        if (var6_int != 1) {
                                          if (2 != var6_int) {
                                            break L5;
                                          } else {
                                            var26 = (java.lang.reflect.Field) var16.field_n[var5].field_e;
                                            var8 = var26.getModifiers();
                                            param1.a(0, (byte) 82);
                                            param1.b(var8, (byte) 62);
                                            break L5;
                                          }
                                        } else {
                                          var15 = (java.lang.reflect.Field) var16.field_n[var5].field_e;
                                          var17 = var15;
                                          var17.setInt((Object) null, var16.field_l[var5]);
                                          param1.a(0, (byte) 85);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        if (var6_int == 4) {
                                          var29 = (java.lang.reflect.Method) var16.field_s[var5].field_e;
                                          var8 = var29.getModifiers();
                                          param1.a(0, (byte) 80);
                                          param1.b(var8, (byte) 111);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        var28 = (java.lang.reflect.Method) var16.field_s[var5].field_e;
                                        var25 = var16.field_m[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param1.a(0, (byte) 52);
                                              break L6;
                                            } else {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param1.a(2, (byte) 125);
                                                  param1.a(-256, (String) var10);
                                                  break L6;
                                                } else {
                                                  param1.a(4, (byte) 100);
                                                  break L6;
                                                }
                                              } else {
                                                param1.a(1, (byte) 61);
                                                param1.a(252186072, ((Number) var10).longValue());
                                                break L6;
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
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
                                    param1.a(-14, (byte) 111);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.a(-15, (byte) 63);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.a(-16, (byte) 124);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.a(-18, (byte) 96);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.a(-19, (byte) 68);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.a(-20, (byte) 48);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.a(-21, (byte) 79);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param1.a(var16.field_i[var5], (byte) 75);
                                break L3;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      L20: {
                        if (null != var13.field_n[var4]) {
                          L21: {
                            if (var13.field_n[var4].field_f != 2) {
                              break L21;
                            } else {
                              var13.field_i[var4] = -5;
                              break L21;
                            }
                          }
                          if (var13.field_n[var4].field_f == 0) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (null == var13.field_s[var4]) {
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L23: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_57_0 = (RuntimeException) var2;
                stackOut_57_1 = new StringBuilder().append("sa.B(").append(-97).append(',');
                stackIn_59_0 = stackOut_57_0;
                stackIn_59_1 = stackOut_57_1;
                stackIn_58_0 = stackOut_57_0;
                stackIn_58_1 = stackOut_57_1;
                if (param1 == null) {
                  stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
                  stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
                  stackOut_59_2 = "null";
                  stackIn_60_0 = stackOut_59_0;
                  stackIn_60_1 = stackOut_59_1;
                  stackIn_60_2 = stackOut_59_2;
                  break L23;
                } else {
                  stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
                  stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
                  stackOut_58_2 = "{...}";
                  stackIn_60_0 = stackOut_58_0;
                  stackIn_60_1 = stackOut_58_1;
                  stackIn_60_2 = stackOut_58_2;
                  break L23;
                }
              }
              throw ii.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, int param2, String param3, int param4, int param5, String param6) {
        ve var7 = null;
        RuntimeException var7_ref = null;
        ve var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            var7 = new ve(param3);
            var8 = new ve(param0);
            stackOut_2_0 = vb.a(param1, param6, 49, param5, var7, param2, var8);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("sa.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(85).append(',').append(param5).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_j = null;
    }

    sa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}
