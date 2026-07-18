/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ho {
    static long field_c;
    String[] field_b;
    String field_e;
    boolean field_h;
    int field_a;
    static eg field_g;
    static int[] field_i;
    boolean field_f;
    static String field_d;

    final static void a(int param0, ab param1) {
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
            oh var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            oh var17 = null;
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
            RuntimeException stackIn_61_0 = null;
            StringBuilder stackIn_61_1 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            String stackIn_63_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_60_0 = null;
            StringBuilder stackOut_60_1 = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            String stackOut_62_2 = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            String stackOut_61_2 = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var12 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                var13 = (oh) (Object) la.field_b.b(12623);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var17.field_s) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param1.field_g;
                        param1.a(var17.field_m, (byte) -101);
                        var5 = 0;
                        L2: while (true) {
                          if (var17.field_s <= var5) {
                            int discarded$1 = param1.a(true, var4);
                            var17.a(true);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_j[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_o[var5];
                                      if (var6_int != 0) {
                                        if (var6_int == 1) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_n[var5].field_g;
                                          var20 = var16_ref;
                                          var20.setInt((Object) null, var17.field_p[var5]);
                                          param1.f(0, (byte) -10);
                                          break L5;
                                        } else {
                                          if (var6_int == 2) {
                                            var28 = (java.lang.reflect.Field) var17.field_n[var5].field_g;
                                            var8 = var28.getModifiers();
                                            param1.f(0, (byte) -10);
                                            param1.a(var8, (byte) -101);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) var17.field_n[var5].field_g;
                                        var8 = var27.getInt((Object) null);
                                        param1.f(0, (byte) -37);
                                        param1.a(var8, (byte) -101);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        L7: {
                                          if (var6_int != 4) {
                                            break L7;
                                          } else {
                                            var30 = (java.lang.reflect.Method) var17.field_g[var5].field_g;
                                            var8 = var30.getModifiers();
                                            param1.f(0, (byte) -102);
                                            param1.a(var8, (byte) -101);
                                            break L7;
                                          }
                                        }
                                        break L6;
                                      } else {
                                        var29 = (java.lang.reflect.Method) var17.field_g[var5].field_g;
                                        var26 = var17.field_l[var5];
                                        var9 = new Object[var26.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (~var26.length >= ~var10_int) {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (!(var10 instanceof Number)) {
                                                if (!(var10 instanceof String)) {
                                                  param1.f(4, (byte) -115);
                                                  break L6;
                                                } else {
                                                  param1.f(2, (byte) -118);
                                                  param1.a((String) var10, 23333);
                                                  break L6;
                                                }
                                              } else {
                                                param1.f(1, (byte) -64);
                                                param1.a(((Number) var10).longValue(), (byte) 78);
                                                break L6;
                                              }
                                            } else {
                                              param1.f(0, (byte) -66);
                                              break L6;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.f(-14, (byte) -25);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.f(-15, (byte) -70);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.f(-16, (byte) -69);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.f(-18, (byte) -82);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.f(-19, (byte) -65);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.f(-20, (byte) -118);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.f(-21, (byte) -27);
                                    break L20;
                                  }
                                }
                                break L3;
                              } else {
                                param1.f(var17.field_j[var5], (byte) -67);
                                break L3;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (var13.field_n[var4] == null) {
                          break L21;
                        } else {
                          L22: {
                            if (2 == var13.field_n[var4].field_e) {
                              var13.field_j[var4] = -5;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (0 != var13.field_n[var4].field_e) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        }
                      }
                      L23: {
                        if (var13.field_g[var4] == null) {
                          break L23;
                        } else {
                          L24: {
                            if (var13.field_g[var4].field_e != 2) {
                              break L24;
                            } else {
                              var13.field_j[var4] = -6;
                              break L24;
                            }
                          }
                          if (var13.field_g[var4].field_e != 0) {
                            break L23;
                          } else {
                            var3 = 1;
                            break L23;
                          }
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
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_60_0 = (RuntimeException) var2;
                stackOut_60_1 = new StringBuilder().append("ho.B(").append(-5534).append(',');
                stackIn_62_0 = stackOut_60_0;
                stackIn_62_1 = stackOut_60_1;
                stackIn_61_0 = stackOut_60_0;
                stackIn_61_1 = stackOut_60_1;
                if (param1 == null) {
                  stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
                  stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
                  stackOut_62_2 = "null";
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  stackIn_63_2 = stackOut_62_2;
                  break L25;
                } else {
                  stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
                  stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
                  stackOut_61_2 = "{...}";
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_63_1 = stackOut_61_1;
                  stackIn_63_2 = stackOut_61_2;
                  break L25;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, int param2) {
        if (param0 <= 36) {
            return;
        }
        ub.field_g = param1;
        af.field_Eb = param2;
    }

    final static void a(int param0) {
        oc.a(false);
        ld.c((byte) 13);
        db.field_a = null;
        gb.a(14);
    }

    final static ho a(byte param0, String[] param1) {
        ho var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ho stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ho stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2 = new ho(false);
            var2.field_b = param1;
            if (param0 >= 82) {
              stackOut_3_0 = (ho) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ho) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("ho.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static String b(byte param0) {
        String var1 = "";
        if (null != wh.field_f) {
            var1 = wh.field_f.e(true);
        }
        if (0 == var1.length()) {
            var1 = gi.a(0);
        }
        int var2 = -101;
        if (var1.length() == 0) {
            var1 = ob.field_ib;
        }
        return var1;
    }

    final static boolean a(byte param0) {
        int var1 = 61;
        return bj.field_mb;
    }

    ho(boolean param0) {
        ((ho) this).field_f = param0 ? true : false;
    }

    public static void b(int param0) {
        field_d = null;
        field_i = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> cannot join; the game has started.";
    }
}
