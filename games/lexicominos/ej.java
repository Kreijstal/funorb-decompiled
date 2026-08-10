/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej {
    static bj field_a;
    static db[] field_b;
    static sh field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -4) {
            field_a = (bj) null;
        }
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, th param1) {
        try {
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            String stackIn_71_2 = null;
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
            pd var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            pd var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param0 == -17) {
                    break L1;
                  } else {
                    field_b = (db[]) null;
                    break L1;
                  }
                }
                var13 = (pd) ((Object) al.field_C.a(true));
                var17 = var13;
                if (var17 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= var17.field_p) {
                      if (var3 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = param1.field_h;
                        param1.f(var17.field_j, -32287);
                        var5 = 0;
                        L3: while (true) {
                          if (var17.field_p <= var5) {
                            param1.a(var4, (byte) 82);
                            var17.b((byte) -116);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (0 != var17.field_n[var5]) {
                                param1.c(var17.field_n[var5], -1);
                                break L4;
                              } else {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var17.field_m[var5];
                                      if (-1 == (var6_int ^ -1)) {
                                        var15 = (java.lang.reflect.Field) (var17.field_k[var5].field_g);
                                        var8 = var15.getInt((Object) null);
                                        param1.c(0, -1);
                                        param1.f(var8, param0 ^ 32270);
                                        break L6;
                                      } else {
                                        if ((var6_int ^ -1) == -2) {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_k[var5].field_g);
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_h[var5]);
                                          param1.c(0, -1);
                                          break L6;
                                        } else {
                                          if (-3 == (var6_int ^ -1)) {
                                            var26 = (java.lang.reflect.Field) (var17.field_k[var5].field_g);
                                            var8 = var26.getModifiers();
                                            param1.c(0, -1);
                                            param1.f(var8, -32287);
                                            break L6;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    L7: {
                                      if ((var6_int ^ -1) == -4) {
                                        var28 = (java.lang.reflect.Method) (var17.field_i[var5].field_g);
                                        var25 = var17.field_o[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param1.c(1, -1);
                                                param1.a(((Number) (var10)).longValue(), (byte) 37);
                                                break L7;
                                              } else {
                                                if (var10 instanceof String) {
                                                  param1.c(2, -1);
                                                  param1.a((String) (var10), (byte) 0);
                                                  break L7;
                                                } else {
                                                  param1.c(4, -1);
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              param1.c(0, -1);
                                              break L7;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        if (4 == var6_int) {
                                          var27 = (java.lang.reflect.Method) (var17.field_i[var5].field_g);
                                          var8 = var27.getModifiers();
                                          param1.c(0, -1);
                                          param1.f(var8, -32287);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L9: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param1.c(-10, -1);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.c(-11, -1);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.c(-12, -1);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.c(-13, param0 + 16);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.c(-14, -1);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.c(-15, -1);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.c(-16, -1);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.c(-17, -1);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.c(-18, -1);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.c(-19, param0 ^ 16);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.c(-20, -1);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.c(-21, -1);
                                    break L20;
                                  }
                                }
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (null != var13.field_k[var4]) {
                          L22: {
                            if (2 != var13.field_k[var4].field_b) {
                              break L22;
                            } else {
                              var13.field_n[var4] = -5;
                              break L22;
                            }
                          }
                          if (-1 != (var13.field_k[var4].field_b ^ -1)) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                      L23: {
                        if (var13.field_i[var4] != null) {
                          L24: {
                            if ((var13.field_i[var4].field_b ^ -1) == -3) {
                              var13.field_n[var4] = -6;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          if (-1 == (var13.field_i[var4].field_b ^ -1)) {
                            var3 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_70_0 = (RuntimeException) (var2);

                stackIn_70_1 = new StringBuilder().append("ej.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackIn_71_2 = "null";
                  break L25;
                } else {
                  stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                  stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackIn_71_2 = "{...}";
                  break L25;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ')');
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

    static {
        field_a = new bj(2);
        field_c = new int[8192];
    }
}
