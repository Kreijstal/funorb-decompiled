/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd {
    static int field_d;
    static String field_c;
    static v field_b;
    static r field_g;
    static String field_a;
    static int field_e;
    static long field_f;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3881) {
            hd.a(-33);
        }
        field_b = null;
        field_g = null;
        field_c = null;
    }

    final static void a(boolean param0, hg param1) {
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
            bf var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            bf var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            String stackIn_64_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            String stackOut_63_2 = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            String stackOut_62_2 = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                var13 = (bf) (Object) l.field_c.a((byte) -104);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (~var4 <= ~var17.field_n) {
                      if (var3 == 0) {
                        var4 = param1.field_l;
                        param1.a(var17.field_h, (byte) -42);
                        var5 = 0;
                        L2: while (true) {
                          if (~var5 <= ~var17.field_n) {
                            int discarded$1 = param1.b((byte) -111, var4);
                            var17.a(false);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_l[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_g[var5];
                                      if (0 == var6_int) {
                                        var15 = (java.lang.reflect.Field) var17.field_q[var5].field_f;
                                        var8 = var15.getInt((Object) null);
                                        param1.a(0, -104);
                                        param1.a(var8, (byte) -42);
                                        break L5;
                                      } else {
                                        if (1 == var6_int) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_q[var5].field_f;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_u[var5]);
                                          param1.a(0, -104);
                                          break L5;
                                        } else {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var26 = (java.lang.reflect.Field) var17.field_q[var5].field_f;
                                            var8 = var26.getModifiers();
                                            param1.a(0, 124);
                                            param1.a(var8, (byte) -42);
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        if (4 == var6_int) {
                                          var28 = (java.lang.reflect.Method) var17.field_r[var5].field_f;
                                          var8 = var28.getModifiers();
                                          param1.a(0, 54);
                                          param1.a(var8, (byte) -42);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Method) var17.field_r[var5].field_f;
                                        var25 = var17.field_j[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var27.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param1.a(0, 112);
                                              break L6;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param1.a(1, -88);
                                                param1.a((byte) 88, ((Number) var10).longValue());
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param1.a(4, 88);
                                                  break L6;
                                                } else {
                                                  param1.a(2, 125);
                                                  param1.a((String) var10, (byte) -102);
                                                  break L6;
                                                }
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
                                    param1.a(-14, 78);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.a(-15, 54);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.a(-16, -97);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.a(-18, 84);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.a(-19, -97);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.a(-20, -96);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.a(-21, 80);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param1.a(var17.field_l[var5], 61);
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
                        if (var13.field_q[var4] == null) {
                          break L20;
                        } else {
                          L21: {
                            if (var13.field_q[var4].field_a != 2) {
                              break L21;
                            } else {
                              var13.field_l[var4] = -5;
                              break L21;
                            }
                          }
                          if (var13.field_q[var4].field_a == 0) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                      L22: {
                        if (var13.field_r[var4] != null) {
                          L23: {
                            if (var13.field_r[var4].field_a == 2) {
                              var13.field_l[var4] = -6;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          if (var13.field_r[var4].field_a != 0) {
                            break L22;
                          } else {
                            var3 = 1;
                            break L22;
                          }
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
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_61_0 = (RuntimeException) var2;
                stackOut_61_1 = new StringBuilder().append("hd.C(").append(0).append(44);
                stackIn_63_0 = stackOut_61_0;
                stackIn_63_1 = stackOut_61_1;
                stackIn_62_0 = stackOut_61_0;
                stackIn_62_1 = stackOut_61_1;
                if (param1 == null) {
                  stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                  stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                  stackOut_63_2 = "null";
                  stackIn_64_0 = stackOut_63_0;
                  stackIn_64_1 = stackOut_63_1;
                  stackIn_64_2 = stackOut_63_2;
                  break L24;
                } else {
                  stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
                  stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
                  stackOut_62_2 = "{...}";
                  stackIn_64_0 = stackOut_62_0;
                  stackIn_64_1 = stackOut_62_1;
                  stackIn_64_2 = stackOut_62_2;
                  break L24;
                }
              }
              throw kg.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3) {
        nn.a(89, param3);
        nb.a(param3, 13, 15, 5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Remove <%0> from ignore list";
        field_c = "Please select options in the following rows:  ";
        field_f = 20000000L;
    }
}
